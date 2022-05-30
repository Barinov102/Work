package Lesson3;

    public class Main {

    public static void main(String args[]) {
        Part1();
        Part2();
        Part3();
        Part4();
        retLenArr();
    }

    private static void retLenArr() {
    }

    public static void Part1() {
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 1};
        int arrta = arr.length;

        for (int i = 0; i < arrta; i++) {
            System.out.print(i + "-" + arr[i] + " ");
        }
        System.out.println("");
        for (int i = 0; i < arrta; i++)
            if (arr[i] == 1) {
                arr[i] = 0;
            } else arr[i] = 1;
        for (int i = 0; i < arrta; i++) {
            System.out.print(i + "-" + arr[i] + " ");
        }
    }

    public static void Part2() {
        int[] att = new int[100];
        int j = 0;
        int fill = att.length;
        for (int i = 0; i < fill; ++i, j = j + 1) {
            att[i] = j;
            System.out.print(+att[i] + " ");
            System.out.println(" ");
        }
    }

    public static void Part3() {
        int[] aff = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        int affa = aff.length;
        for (int i = 0; i < affa; i++) {
            if (aff[i] < 6)
                aff[i] = aff[i] * 2;
        }
        System.out.println(" ");

        for (int i = 0; i < affa; i++) {

            System.out.print(+aff[i] + ", ");

        }
    }

    public static void Part4() {
        int a = 6;
        int app[][] = new int[a][a];


        for (int i = 0; i < a; i++) {
            app[i][i] = 1;
        }
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++)
                System.out.print(app[i][j] + " ");
            System.out.println();
        }
    }

    public static int[] retLenArr (int len, int initialValue){
        int arr[] = new int[len];
        for (int i = 0; i < arr.length; i++){
            arr[i] = initialValue;
        }
        return arr;
    }

}