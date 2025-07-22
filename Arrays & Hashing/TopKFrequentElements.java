import java.util.*;

// Leetcode Problem: Top K Frequent Elements
// Approach: HashMap to count frequency + Max-Heap (PriorityQueue) to extract top K frequent

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        // Step 1: Count the frequency of each element using HashMap
        Map<Integer, Integer> mp = new HashMap<>();
        for (int num : nums) {
            mp.put(num, mp.getOrDefault(num, 0) + 1);
        }

        // Step 2: Create a Max-Heap (PriorityQueue) to store pairs of (element, frequency)
        // Higher frequency elements will have higher priority
        PriorityQueue<Pair> pq = new PriorityQueue<>((a, b) -> b.val - a.val);
        for (int key : mp.keySet()) {
            pq.offer(new Pair(key, mp.get(key)));
        }

        // Step 3: Extract the top K elements with the highest frequency from the heap
        int[] res = new int[k];
        for (int i = 0; i < k; i++) {
            res[i] = pq.poll().key; // Poll the most frequent element
        }

        // Step 4: Return the result array
        return res;
    }
}

// Custom Pair class to store (element, frequency) pairs for the PriorityQueue
class Pair {
    int key; // The element (number)
    int val; // The frequency of the element

    Pair(int key, int val) {
        this.key = key;
        this.val = val;
    }
}
