class Solution {
    public int totalFruit(int[] fruits) {

        int last = -1;
        int secondLast = -1;

        int lastCount = 0;
        int start = 0;
        int max = 0;

        for (int i = 0; i < fruits.length; i++) {

            if (fruits[i] != last && fruits[i] != secondLast) {
                start = i - lastCount;
            }

            if (fruits[i] == last) {
                lastCount++;
            } 
            else {
                lastCount = 1;
                secondLast = last;
                last = fruits[i];
            }

            max = Math.max(max, i - start + 1);
        }

        return max;
    }
}