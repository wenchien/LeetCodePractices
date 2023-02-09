package interview;

public class AlternatingString {
    public String solution(int N) {
        StringBuilder sb = new StringBuilder("+");

        if (N == 1) {
            return sb.toString();
        }

        for (int i = 2; i <= N; ++i) {
            if (i % 2 == 0) {
                sb.append("-");
            }
            if (i % 2 != 0) {
                sb.append("+");
            }
        }

        return sb.toString();
    }

}
