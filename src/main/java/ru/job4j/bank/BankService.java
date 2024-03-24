package ru.job4j.bank;
import ru.job4j.bank.Account;
import ru.job4j.bank.User;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BankService {
    private final Map<User, List<Account>> users = new HashMap<>();

    public void addUser(User user) {
        if(!users.containsKey(user)) {
            users.put(user, new ArrayList<>());
        }

    }

    public void deleteUser(String passport) {
        for (User user : users.keySet()) {
            if (user.getPassport().equals(passport)) {
                users.remove(user);
            }
        }
    }

    public void addAccount(String passport, Account account) {
        User user = findByPassport(passport);
        if (user == null || !getAccounts(user).contains(account)) {
            List<Account> bankАccounts = users.get(user);
            if ( bankАccounts != null) {
                bankАccounts.add(account);
                users.replace(user, bankАccounts);
            }

        }
    }

    public User findByPassport(String passport) {
        for( User user : users.keySet()) {
           if (user.getPassport().equals(passport)) {
               return user;
           }
        }
        return null;
    }

    public Account findByRequisite(String passport, String requisite) {
        User user = findByPassport(passport);
        List<Account> bankАccounts = users.get(user);
        if (bankАccounts == null) {
            return null;
        }
        for (Account account : bankАccounts) {
            if (account.getRequisite().equals(requisite) && users.containsKey(passport)) {
                return account;
            }
        }
        return null;
    }



    public boolean transferMoney(String sourcePassport, String sourceRequisite,
                                 String destinationPassport, String destinationRequisite,
                                 double amount) {
        List<Account> accounts = new ArrayList<>();
        User user = new User(destinationPassport, destinationRequisite);
        double balance = 0;
        boolean result = true;
        if (users.containsKey(sourcePassport)) {
        } else {
            accounts = users.get(user);
        }

        List<Account> a = new ArrayList<>();
        for(Account account: accounts) {
            balance += account.getBalance();
        }
        a.add(new Account(destinationRequisite, balance));
        users.replace(user, a);

        return result;
    }

        public List<Account> getAccounts (User user) {
            return users.get(user);
        }
    }
