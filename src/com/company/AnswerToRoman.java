package com.company;public class AnswerToRoman {


    public static void integerToRoman(int num) {


        int[] values = {100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] romanLiterals = {"C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
// массивы чисел, попарно соответствуют друг другу

        StringBuilder roman = new StringBuilder();
//обьявляем строку в которую будут записываться цифры
        for (int i = 0; i < values.length; i++) {
            while (num >= values[i]) {
                num -= values[i];
                roman.append(romanLiterals[i]); //добавляем символ по циклу в конец строки
            }
        }
        System.out.println(roman.toString()); //получаем целую строку

    }
}

