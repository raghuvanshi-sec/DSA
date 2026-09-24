class Solution {
    public int maxNumberOfBalloons(String text) {
        // Frequency array for all lowercase English letters
        int[] count = new int[26];

        // Step 1: Count frequency of each character in text
        for (char c : text.toCharArray()) {
            count[c - 'a']++;
        }

        // Step 2: Extract required characters: b, a, l, o, n
        int b = count['b' - 'a'];
        int a = count['a' - 'a'];
        int l = count['l' - 'a'] / 2; // 'l' appears twice in "balloon"
        int o = count['o' - 'a'] / 2; // 'o' appears twice in "balloon"
        int n = count['n' - 'a'];

        // Step 3: Return the minimum capacity among requirements
        return Math.min(Math.min(Math.min(b, a), Math.min(l, o)), n);
    }
}