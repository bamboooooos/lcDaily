package ojtest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ThreadTest {
    public static void main(String[] args){
        ArrayList<Integer> in= (ArrayList<Integer>) Stream.of(12300,20000,31233).collect(Collectors.toList());
        ArrayList<Integer> res=new ThreadTest().sleepSort(in);
    }

    public ArrayList<Integer> sleepSort(ArrayList<Integer> ori){
        ArrayList<Integer> res=new ArrayList<>();
        for(int i:ori){
            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        Thread.sleep(i);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(i);
                    res.add(i);
                }
            }).start();
        }
        System.out.println("end");
        return res;
    }

}
