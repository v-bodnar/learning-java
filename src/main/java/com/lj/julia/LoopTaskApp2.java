package main.java.com.lj.julia;

public class LoopTaskApp2 {
    public static void main(String[] args) {
        int counter2 = 1;
        while (counter2 < 100) {
            counter2 = counter2 + 1;
            if (counter2 % 3 == 0) {
                System.out.println(counter2);
            }
        }
        int counter3 = 3;
        while (counter3 < 100) {
            System.out.println(counter3);
            counter3 = counter3 + 3;
        }

        for (int i = 3; i < 100; i=i+3){
            System.out.println("i:"+ i);
        }
    }
}
