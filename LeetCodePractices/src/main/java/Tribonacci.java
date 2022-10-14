public class Tribonacci {
    public int tribonacci(int n) {
        int answer = 0;
        int[] table = new int[38];
        table[0] = 0;
        table[1] = 1;
        table[2] = 1;

        for (int i = 3; i <= n; ++i) {

            table[i] = table[i-1] + table[i-2] + table[i-3];
        }

        return table[n];
    }
}
