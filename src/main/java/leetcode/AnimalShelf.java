package leetcode;

import java.util.*;

public class AnimalShelf {
    Queue<int[]> queue1; // cat
    Queue<int[]> queue2; // dog

    public AnimalShelf() {
        queue1 = new LinkedList<>();
        queue2 = new LinkedList<>();
    }

    public void enqueue(int[] animal) {
        if (animal[1] == 0) {
            queue1.offer(animal);
        }
        if(animal[1] == 1) {
            queue2.offer(animal);
        }
    }

    public int[] dequeueAny() {
        if(queue1.isEmpty() && queue2.isEmpty()) {
            return new int[]{-1, -1};
        }
        if(queue1.isEmpty() || queue2.isEmpty()) {
            return queue1 == null ? queue2.poll() : queue1.poll();
        }
        int[] q1 = queue1.peek();
        int[] q2 = queue2.peek();
        return q1[1] > q2[1] ? queue1.poll(): queue2.poll();

    }

    public int[] dequeueDog() {
        if(queue2.isEmpty()) {
            return new int[]{-1, -1};
        }
        return queue2.poll();
    }

    public int[] dequeueCat() {
        if(queue1.isEmpty()) {
            return new int[]{-1, -1};
        }
        return queue1.poll();
    }

}
