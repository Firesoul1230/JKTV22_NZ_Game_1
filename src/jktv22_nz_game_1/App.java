/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jktv22_nz_game_1;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author pupil
 */
public class App {
    

    public void run() {
            System.out.println("---- Начало игры ----");
        Random random = new Random();
        boolean repeat = true;
        do {
            int myNumber = random.nextInt(9-0+1)-0;
            System.out.print("Задумано число в диапазоне от 0 до 9, угадайте какое это число (у вас есть три попытки): ");
            Scanner scanner = new Scanner(System.in);
            int atempt = 1;
            do {
                System.out.println("Попытка номер " + atempt + ": ");
                int userNumber = scanner.nextInt();scanner.nextLine();
                if (myNumber == userNumber) {
                    System.out.println("Ты выйграл!");
                    break;
                }else{
                    if (atempt > 2) {
                        System.out.println("Ты проиграл!");
                        System.out.println("Было загадано число " + myNumber);
                    break;
                    }else{
                        if (myNumber > userNumber) {
                            System.out.println("Неправильно попробуй еще раз.(загаданное число больше)");
                        }else{
                            System.out.println("Неправильно попробуй еще раз.(загаданное число меньше)");
                        }
                        }
                }
                atempt++;
            } while (true);
            System.out.println("Нажмите \"w\" для выхода или любую кнопку для продолжения");
            String w = scanner.nextLine();
            if (w.equals("w")) {
                repeat = false;
            }
        }while (repeat);
        System.out.println("---- Конец инры ----");
    }
   
}
