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
        users.put(user, new ArrayList<>());
    }

    public void deleteUser(String passport) {
        users.remove(new User(passport, ""));
    }

    public void addAccount(String passport, Account account) {
        User user = findByPassport(passport);
        if (user != null) {
            List<Account> bankAccounts = users.get(user);
            if (!bankAccounts.contains(account)) {
                bankAccounts.add(account);
            }
        }
    }

    public User findByPassport(String passport) {
        for (User user : users.keySet()) {
           if (user.getPassport().equals(passport)) {
               return user;
           }
        }
        return null;
    }

    public Account findByRequisite(String passport, String requisite) {
        User user = findByPassport(passport);
        if (user != null) {
            List<Account> bankAccounts = users.get(user);
            for (Account account : bankAccounts) {
                if (account.getRequisite().equals(requisite)) {
                    return account;
                }
            }
        }
        return null;
    }

    public boolean transferMoney(String sourcePassport, String sourceRequisite,
                                 String destinationPassport, String destinationRequisite,
                                 double amount) {
        Account account = findByRequisite(sourcePassport, sourceRequisite);
        Account account1 = findByRequisite(destinationPassport, destinationRequisite);
        if (account == null || account1 == null
                || account1.getBalance() < amount) {
            return false;
        }
        account.setBalance(account.getBalance() + amount);
        account1.setBalance(account1.getBalance() - amount);
        return true;
    }

        public List<Account> getAccounts(User user) {
            return users.get(user);
        }
    }

