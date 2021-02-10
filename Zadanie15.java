package com.company;

import java.util.Arrays;
import java.util.Random;

/*Задание 15
Создать массив, заполнить его случайными элементами, распечатать,
перевернуть, и снова распечатать (при переворачивании нежелательно создавать
еще один массив).*/
public class Zadanie15 {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] array = new int[rand.nextInt(20)];
       // int index = 0;
       // int number = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(20) + 1;
        // number = array[i];
        //index = i;

        }
        System.out.println("Случайные числа: " + Arrays.toString(array));

                  

            


        }
    }


 





