package ArrayArray;

public class ExamArrayArray01 {
    public static void main(String[] args) {
        int[][] arrayArrays = new int[3][2];
        int[][] arrayArrays2={
                                {1,2},{3,4},{5,6}     };
        for (int i = 0; i <3 ; i++) {
            for (int j = 0; j <2 ; j++) {
                System.out.println(arrayArrays2[i][j]);
            }
        }
    }
}
