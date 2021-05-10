/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LinkedListQueues;

/**
 *
 * @author Ryan Kolbe
 */
public class LinkedQueueNodes {

    private int value;
    private LinkedQueueNodes next;

    public LinkedQueueNodes() {
        value = -999;
        next = null;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public LinkedQueueNodes getNext() {
        return next;
    }

    public void setNext(LinkedQueueNodes next) {
        this.next = next;
    }
}
