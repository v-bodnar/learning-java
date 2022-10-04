package main.java.com.lj.julia;

public class LoopTaskApp3 {
    public static void main(String[] args) {
        int counter4 = 1;
        while (counter4 < 10) {
            counter4 = counter4 + 1;
            if (counter4 != 3 && counter4 != 5) {
                System.out.println(counter4);
            }
        }

        for (int i = 1; i < 10; i=i+1) {
            if (i != 3 && i != 5) {
                System.out.println("i:" + i);
            }
        }
    }
}
