package Exercicio07;



import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> input1 = new ArrayList<>();
//        int[] input2 = new int[]{ 2, 1, 2, 0};
//        int[] input3 = new int[]{0};
//        int[] input4 = new int[]{ 10, 2, 6, 17, 0, 1, 13};
//        int[] input5 = new int[]{ -10, 2, 6, 15, -30};
        input1.add(-1);
        input1.add(3);
        input1.add(2);
        input1.add(-5);
        input1.add(4);

        Filtro filtro = new Filtro();
        System.out.println(Arrays.toString(filtro.removerNegativos(input1).toArray()));
    }
}
