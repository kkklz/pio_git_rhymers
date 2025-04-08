package edu.kis.vh.nursery.list;

/**
 * Klasa reprezentuje pojedynczy węzeł
 */
public class Node {

    /**
     * value - wartość którą przechowuje węzeł
     * prev - referencja do poprzedniego węzła
     * next - referencja do następnego węzła
     */
    private final int value;
    private Node prev;
    private Node next;

    /**
     * @param i wartość przechowywana w węźle
     */
    public Node(int i) {
        value = i;
    }

    /**
     * @return wartość przechowywana w węźle
     */
    public int getValue() {
        return value;
    }

    /**
     * @return referencja do poprzedniego węzła
     */
    public Node getPrev() {
        return prev;
    }

    /**
     * @param prev ustawia referencję do poprzedniego węzła
     */
    public void setPrev(Node prev) {
        this.prev = prev;
    }

    /**
     * @return zwraca referencję do następnego węzła
     */
    public Node getNext() {
        return next;
    }

    /**
     * @param next ustawia referencję do następnego węzła
     */
    public void setNext(Node next) {
        this.next = next;
    }
}
