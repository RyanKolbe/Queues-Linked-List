/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LinkedListQueues;

import java.time.LocalTime;

/**
 *
 * @author Ryan Kolbe
 */
public class LinkedQueueMain {

    public static void main(String[] args) {

        LinkedListQueue queue = new LinkedListQueue();

        queue.enqueue(new Customer("Jonathan", LocalTime.parse("12:00")));
        queue.enqueue(new Customer("Gareth", LocalTime.parse("13:00")));
        queue.enqueue(new Customer("Linton", LocalTime.parse("14:00")));

        while (!queue.isEmpty()) {
            Customer value = queue.dequeue();
            System.out.println(value);
        }
    }
}
