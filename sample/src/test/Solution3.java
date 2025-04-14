package test;

class Main {

    static int[] add_three(int[] input) {
        int[] result = input;
        result[3] += 3;
        return result;
    }

    public static void main(String[] args) {
        int[] b = {1, 2, 3, 4};
        for (int i = 0; i < 4; i++) System.out.print(b[i] + " ");
        System.out.println();

        int[] c = new int[4];
        for (int i = 0; i < 4; i++) {
            c[i] = b[i];
        }
        c = add_three(c);
        for (int i = 0; i < 4; i++) System.out.print(b[i] + " ");
        System.out.println();
        for (int i = 0; i < 4; i++) System.out.print(c[i] + " ");
        System.out.println();
    }

}