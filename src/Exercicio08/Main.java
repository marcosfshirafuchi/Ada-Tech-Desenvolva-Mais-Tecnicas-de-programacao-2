package Exercicio08;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] input1 = new int[]{ 1, 3, 2, 5, 4};
        int[] input2 = new int[]{ 2, 1, 2, 0};
        int[] input3 = new int[]{0};
        int[] input4 = new int[]{ 10, 2, 6, 17, 0, 1, 13};
        int[] input5 = new int[]{ -10, 2, 6, 15, -30};
        System.out.println(Arrays.toString(Solution.ordenarListaComLambda(input1)));
        System.out.println(Arrays.toString(Solution.ordenarListaComLambda(input2)));
        System.out.println(Arrays.toString(Solution.ordenarListaComLambda(input3)));
        System.out.println(Arrays.toString(Solution.ordenarListaComLambda(input4)));
        System.out.println(Arrays.toString(Solution.ordenarListaComLambda(input5)));
    }
}
