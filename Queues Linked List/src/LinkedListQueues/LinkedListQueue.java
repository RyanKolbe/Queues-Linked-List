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
public class LinkedListQueue {

    LinkedQueueNodes node = new LinkedQueueNodes();

    private int front;
    private int rear;
    private int count;
    private final Customer[] data;

    public LinkedListQueue() {
        data = new Customer[20];
        front = 0;
        rear = 0;
        count = 0;
    }

    public boolean isEmpty() {
        return count == 0;
    }

    public boolean isFull() {

        return front == rear & count > 0;
    }

    public void enqueue(Customer value) {
        data[rear] = value;
        rear = (rear + 1) % 20;
        count = count + 1;
    }

    public Customer dequeue() {
        Customer value = data[front];
        front = (front + 1) % 6;
        count = count - 1;
        return value;
    }
}