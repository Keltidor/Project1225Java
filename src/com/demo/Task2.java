/*
 * 1. Создайте массив Integer. Проинициализируйте его своей любимой последовательностью.
 * Создайте квадратную матрицу (двумерный массив) int и поместите туда исходный. Оставшееся место заполнить нулями
 * 2. Напишите метод, который на вход принимает массив из трех строк, а на выход выдает форматированную строку вида:
 *  Фамилия Имя Отчество String[] names = new String[]{"Коростелев", "Вячеслав", "Валерьевич"};
 * String[] names = new String[]{"трАмпОв", "БАРАК", "БушовИЧ"};
 */
package com.demo;

public class Task2 {
    public static void main(String[] args) {
        Integer[] perfectSequence = {4, 8, 15, 16, 23, 42};
        String[] names = new String[]{"трАмпОв", "БАРАК", "БушовИЧ"};
        String result = formatFullName(names);
        System.out.println(result);

        int[][] array = {
                {4, 8, 15},
                {16, 23, 42},
                {0, 0, 0}
        };

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }

    }

    public static String formatFullName(String[] names) {

        // Character.toUpperCase(str1.charAt(0));


        // System.out.println(Character.toUpperCase(str1.charAt(0)) + str1.substring(1).toLowerCase());

        String result = "";


        for (int i = 0; i < names.length; i++) {


            result = result + Character.toUpperCase(names[i].charAt(0)) + names[i].substring(1).toLowerCase()+" ";

        }
        return result;
    }
}



/*
String str1 = "КороСтелев";
        String str2 = "ВЯЧЕСЛАВ";
        String str3 = "ВАЛЕрьевич";

        String replStr1 = str1.replace("С", "с");
        String replStr3 = str2.replace("ЯЧЕСЛАВ", "ячеслав");
        String replStr4 = str3.replace("АЛЕ", "але");


        System.out.print(replStr1);
        System.out.print(" ");
        System.out.print(replStr3);
        System.out.print(" ");
        System.out.println(replStr4);






 String str1 = "КороСтелев";
        String str2 = "ВЯЧЕСЛАВ";
        String str3 = "ВАЛЕрьевич";


        Character.toUpperCase(str1.charAt(0));
        Character.toUpperCase(str2.charAt(0));
        Character.toUpperCase(str3.charAt(0));

        Character.toLowerCase(str1.charAt(1-9));
        Character.toLowerCase(str2.charAt(1-9));
        Character.toLowerCase(str3.charAt(1-9));

        System.out.print(str1);
        System.out.print(" ");
        System.out.print(str2);
        System.out.print(" ");
        System.out.println(str3);
 */