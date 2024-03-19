package ru.job4j.queue;


import java.util.Deque;

public class ReconstructPhrase {

    private final Deque<Character> descendingElements;

    private final Deque<Character> evenElements;

    public ReconstructPhrase(Deque<Character> descendingElements, Deque<Character> evenElements) {
        this.descendingElements = descendingElements;
        this.evenElements = evenElements;
    }

    private String getEvenElements() {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0;!evenElements.isEmpty(); i++) {
            if (i % 2 == 0) {
                stringBuilder.append(evenElements.getFirst());
            }
            evenElements.poll();
        }
        return stringBuilder.toString();
    }

    private String getDescendingElements() {
        StringBuilder stringBuilder = new StringBuilder();
        while (!descendingElements.isEmpty()) {
            stringBuilder.append(descendingElements.getLast());
            descendingElements.pollLast();
        }
        return stringBuilder.toString();
    }

    public String getReconstructPhrase() {
        return getEvenElements() + getDescendingElements();
    }
}