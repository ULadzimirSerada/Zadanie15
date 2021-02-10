package com.company;

import java.util.Arrays;
import java.util.Random;

/*Задание 15
Создать массив, заполнить его случайными элементами, распечатать,
перевернуть, и снова распечатать (при переворачивании нежелательно создавать
еще один массив).*/
public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] array = new int[rand.nextInt(20)];

        for (int i = 1; i < array.length; i++) {
            array[i] = rand.nextInt(20) + 1;

            System.out.println("Случайные числа: " + Arrays.toString(array));
        }

        System.out.println();

        int number = array.langth;
        int temp;

        for (int i = 0; i < number / 2; i++){
            temp = array[number-0-1];
            array[number-i-1] = array[i];
            array[i] = temp;
        }
        for(int i =0; i < array.length; i++);
        System.out.print("перевернутые " + array[i]);
    }
}


//}





