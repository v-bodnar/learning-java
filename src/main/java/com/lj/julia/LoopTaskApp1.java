package main.java.com.lj.julia;

public class LoopTaskApp1 {
    public static void main(String[] args) {
        int counter1 = 100;
        while (counter1 > 0) {
            System.out.println(counter1);
            counter1 = counter1 - 1;
        }

        for (int i = 100; i > 0; i=i-1){
            System.out.println("i:"+ i);
        }
    }
}
