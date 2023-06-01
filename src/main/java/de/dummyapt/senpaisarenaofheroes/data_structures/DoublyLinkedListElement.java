package de.dummyapt.senpaisarenaofheroes.data_structures;

import java.io.Serializable;

public class DoublyLinkedListElement {
    private final Serializable data;
    private DoublyLinkedListElement predecessor;
    private DoublyLinkedListElement successor;

    public DoublyLinkedListElement(Serializable data, DoublyLinkedListElement predecessor, DoublyLinkedListElement successor) {
        this.data = data;
        this.predecessor = predecessor;
        this.successor = successor;
    }

    public Object getData() {
        return data;
    }

    public DoublyLinkedListElement getPredecessor() {
        return predecessor;
    }

    public void setPredecessor(DoublyLinkedListElement predecessor) {
        this.predecessor = predecessor;
    }

    public DoublyLinkedListElement getSuccessor() {
        return successor;
    }

    public void setSuccessor(DoublyLinkedListElement successor) {
        this.successor = successor;
    }
}
