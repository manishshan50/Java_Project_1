class Alicea_BOB {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        int number = 3;
        int a[] = new int[number];
        int b[] = new int[number];
        for (int i = 0; i < number; i++) {
            a[i] = S.nextInt();
        }
        for (int i = 0; i < number; i++) {
            b[i] = S.nextInt();
        }
        int A = 0, B = 0;
        for (int i = 0; i < 3; i++) {
            if (a[i] > b[i]) {
                A++;
            } else if (a[i] < b[i]) {
                B++;
            }
        }
        System.out.println(A + " " + B);
    }
}