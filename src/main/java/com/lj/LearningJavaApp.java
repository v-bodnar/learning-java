package main.java.com.lj;

import java.util.ArrayList;

public class LearningJavaApp {
    public static void main(String[] args){
        System.out.println("Hello World");
//        asdfasfasf
        String[] intArray = new String[5];
        intArray[0] = "hgjhgf";
        intArray[1] = "12";
        intArray[2] = "3";
        intArray[4] = "6";

        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }

        int[] primes={2,3,4,5,6,7};
        //primes2 = new int[]{8,9,10,11,12,13};
        for (int i = 0; i < primes.length; i++) {
            System.out.println("i:"+ primes[i]);
        }
        ArrayList<String> friends = new ArrayList<>();
        friends.add("Vova");
        friends.add("Liza");
        friends.add(1, "Julia");
        friends.set(0, "Lena");

        for(String name : friends){
            System.out.println(name);
        }

        for(int i = 0; i<friends.size();i++){
            String name = friends.get(i);
            System.out.println(name);
        }
    }
}
