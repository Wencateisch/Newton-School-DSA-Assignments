public class New {
    static int solve(double n) {
        double mod = 1e9 + 7;
        double sol[] = new double[n + 1];
        sol[0] = 0;
        sol[1] = 1;
        sol[2] = 2;
        for (int i = 0; i <= n; i++) {
            sol[i] = (sol[i - 1] % mod + sol[i - 3] % mod) % mod;
        }

        return sol[n];
    }

    public static void main(String[] args) {
        int x = solve(7);
        System.out.println(x);
    }

}
