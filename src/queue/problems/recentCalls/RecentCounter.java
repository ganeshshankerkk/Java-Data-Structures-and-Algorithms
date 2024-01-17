package src.queue.problems.recentCalls;

import java.util.LinkedList;
import java.util.Queue;

public class RecentCounter {
    Queue<Integer> requests;

    public RecentCounter() {
        requests = new LinkedList<>();
    }

    public int ping(int t) {
        requests.add(t);
        while (!requests.isEmpty() && requests.peek() < t - 3000) {
            requests.poll();
        }
        return requests.size();
    }
}
