package pl.waw.sgh;

public class Arrays2D {
    public static void main(String[] args) {
        int sumC = 0;
        int sumR = 0;
        int[][] arr2D = new int[3][4];
        int[] arr1D = new int[4];
        arr2D[0][3] = 56;
        arr2D[0][0] = 676;
        arr2D[1][1] = 559;
        arr2D[2][3] = 245;
        arr2D[2][3] = 867;
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < arr2D.length; i++) {

            for (int j = 0; j < arr2D[i].length; j++) {
                System.out.print(arr2D[i][j] + "\t");

                sumR = sumR + arr2D[i][j];

            }
            sum1=sumR + sum1;
            System.out.print("|");
            System.out.println(sumR);
            sumR = 0;

        }
        System.out.println("--------------");
        for (int j = 0; j < arr2D[0].length; j++) {

            for (int i = 0; i < arr2D.length; i++) {

                sumC = sumC + arr2D[i][j];
                sum2 = sum2 + sumC;
            }

            System.out.print(sumC + "\t");
            sumC = 0;

        }
        System.out.print(sum1);  }
}



