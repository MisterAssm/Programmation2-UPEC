package fr.zemouchi.tm2;

import java.util.Arrays;

public class MyTableau {

    int[] elements;
    int numberOfElements;

    public MyTableau(int size) {
        this.elements = new int[size];
        this.numberOfElements = 0;
    }

    public void add(int val) {
        if (elements.length == numberOfElements) {
            int[] newElements = new int[elements.length * 2];

            for (int i = 0; i < elements.length; i++) {
                newElements[i] = elements[i];
            }

            elements = newElements;
        }

        elements[numberOfElements++] = val;
    }

    public void delete(int pos) {
        if (pos >= numberOfElements) {
            return; // l'élement pos est null
        }

        int[] newElements = new int[elements.length - 1];

        for (int i = 0; i < numberOfElements - 1; i++) {
            int j = i >= pos ? i + 1 : i;

            newElements[i] = elements[j];
        }

        elements = newElements;
        numberOfElements--;
    }

    public int get(int pos) {
        return elements[pos];
    }

    public boolean estTrie() {
        if (numberOfElements == 0) {
            return true;
        }

        int last = elements[0];

        for (int i = 1; i < numberOfElements; i++) {
            if (last > elements[i]) {
                return false;
            }

            last = elements[i];
        }

        return true;
    }

    @Override
    public String toString() {
        return Arrays.toString(elements);
    }
}
