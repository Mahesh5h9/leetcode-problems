class Solution {
    public int findLeastNumOfUniqueInts(int[] arr, int k) {
        Map<Integer, Integer> freqMap = new HashMap<>();
        for (int num : arr) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }
        
        List<Integer> frequencies = new ArrayList<>(freqMap.values());
        Collections.sort(frequencies);
        
        int uniqueCount = freqMap.size();
        int removed = 0;
        int index = 0;
        
        while (removed < k && index < frequencies.size()) {
            int frequency = frequencies.get(index);
            int minToRemove = Math.min(frequency, k - removed);
            removed += minToRemove;
            frequency -= minToRemove;
            if (frequency == 0) {
                uniqueCount--;
            }
            frequencies.set(index, frequency);
            index++;
        }
        return uniqueCount;
    }
}