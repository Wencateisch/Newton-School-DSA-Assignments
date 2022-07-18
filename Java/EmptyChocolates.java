class EmptyChocolates {
    static int solve(int n) {
        int sol[] = new int[n + 1];
        sol[0] = 0;
        sol[1] = 1;
        sol[2] = 2;
        for (int i = 0; i <= n; i++) {
            sol[i] = sol[i - 1] + sol[i - 3];
        }
        return sol[n];
    }

    public static void main(String[] args) {
        System.out.println(solve(7));
    }
}