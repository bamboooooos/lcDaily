package ojtest;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args){
        printArray(new Solution().gridIllumination2(10000,
                Solution.inputDataDouble1, Solution.inputDataDouble2));
    }

    public static void printArray(int[] in){
        for(int i=0;i<in.length;i++){
            System.out.print(in[i]);
        }
    }

}
