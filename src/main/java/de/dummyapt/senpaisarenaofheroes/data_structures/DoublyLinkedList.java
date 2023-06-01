package de.dummyapt.senpaisarenaofheroes.data_structures;

import java.io.*;

public class DoublyLinkedList {
    private DoublyLinkedListElement first;
    private DoublyLinkedListElement last;

    public void addElementAtEnd(Serializable o) {
        if (first == null) {
            first = new DoublyLinkedListElement(o, null, null);
            last = first;
        } else {
            var oldLast = last;
            last = new DoublyLinkedListElement(o, oldLast, null);
            oldLast.setSuccessor(last);
        }
    }

    public void addElementAtBeginning(Serializable o) {
        if (first == null) {
            first = new DoublyLinkedListElement(o, null, null);
            last = first;
        } else {
            var oldFirst = first;
            first = new DoublyLinkedListElement(o, null, oldFirst);
            oldFirst.setPredecessor(first);
        }
    }

    public void clear() {
        first = null;
        last = null;
    }

    public void saveList(String file) {
        try (var objectOutputStream = new ObjectOutputStream(new FileOutputStream(file))) {
            var current = first;
            while (current != null) {
                objectOutputStream.writeObject(current.getData());
                current = current.getSuccessor();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void loadList(String file) {
        this.clear();
        try (var objectInputStream = new ObjectInputStream(new FileInputStream(file))) {
            var current = (Serializable) objectInputStream.readObject();
            while (current != null) {
                addElementAtBeginning(current);
                current = (Serializable) objectInputStream.readObject();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public DoublyLinkedListElement getFirst() {
        return first;
    }

    public DoublyLinkedListElement getLast() {
        return last;
    }
}
