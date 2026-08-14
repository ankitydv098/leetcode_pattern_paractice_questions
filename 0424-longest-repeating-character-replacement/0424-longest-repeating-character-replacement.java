class Solution {
    public int characterReplacement(String s, int k) {
        int[] count = new int[26];

        int left = 0;
        int maxFreq = 0;
        int maxLen = 0;

        for (int right = 0; right < s.length(); right++) {

            // Add current character
            count[s.charAt(right) - 'A']++;

            // Most frequent character in current window
            maxFreq = Math.max(maxFreq, count[s.charAt(right) - 'A']);

            // Characters that need to be replaced
            int replacements = (right - left + 1) - maxFreq;

            // Window is invalid
            if (replacements > k) {
                count[s.charAt(left) - 'A']--;
                left++;
            }

            // Update answer
            maxLen = Math.max(maxLen, right - left + 1);
        }

        return maxLen;
    }
}