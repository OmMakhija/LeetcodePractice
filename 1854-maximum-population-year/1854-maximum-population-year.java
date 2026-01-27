class Solution {
    public int maximumPopulation(int[][] logs) {
        int[] count = new int[101];

        for (int[] arr : logs) {
            count[arr[0] - 1950]++;
            count[arr[1] - 1950]--;
        }

        int population = 0;
        int year = 0;
        int max = 0;

        for (int i = 0; i < 100; i++) {

            population += count[i];

            if (population > max) {
                max = population;
                year = i + 1950;
            }
        }

        return year;
    }
}