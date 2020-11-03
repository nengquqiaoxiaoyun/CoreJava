package core.java.chapter9.priorityQueue;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.PriorityQueue;

/**
 * @author: huakaimay
 * @since: 2020-11-03
 */
public class PriorityQueueTest {
    public static void main(String[] args) {
        PriorityQueue<LocalDate> pq = new PriorityQueue();
        pq.add(LocalDate.of(1905, 12, 9));
        pq.add(LocalDate.of(1815, 12, 10));
        pq.add(LocalDate.of(1903, 12, 3));
        pq.add(LocalDate.of(1910, 6, 22));


        System.out.println(pq);
        System.out.println("Iterating over elements...");
        for (LocalDate localDate : pq) {
            System.out.println(localDate);
        }
        System.out.println("removing elements..");
        while (!pq.isEmpty()) {
            System.out.println(pq.remove());
        }

        System.out.println(pq);

        new HashMap<>().forEach((k, v) -> {
            System.out.println(k);
            System.out.println(v);
        });
    }
}
