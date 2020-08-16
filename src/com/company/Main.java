package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String xaa = "I II III IV V VI VII VIII IX X";
        String[] tokens = str.split(" ");
        boolean flag = false;

// 2 эксепшна на проверку являются ли данные числа одного типа
        try {
                   if ((xaa.contains(tokens[0]) == false)&&(xaa.contains(tokens[2]) == true)){
                       throw new Exception("Оба числа должны быть одного типа и быть в интервале от 1 до 10. Программа завершена");
                   }
               }
        catch(Exception ex){

                   System.out.println(ex.getMessage());
               }

        try {
            if ((xaa.contains(tokens[0]) == true)&&(xaa.contains(tokens[2]) == false)){
                throw new Exception("Оба числа должны быть одного типа и быть в интервале от 1 до 10. Программа завершена");
            }
        }
        catch(Exception ex){

            System.out.println(ex.getMessage());
        }
//конвертация строки с римскими числами в строку с арабскими, установка флага что нужно считать в римской системе
        if ((xaa.contains(tokens[0]) == true)&&(xaa.contains(tokens[2]) == true)){
            switch (tokens[0]) {
                case "I":
                    tokens[0] = "1";
                    break;
                case "II":
                    tokens[0] = "2";
                    break;
                case "III":
                    tokens[0] = "3";
                    break;
                case "IV":
                    tokens[0] = "4";
                    break;
                case "V":
                    tokens[0] = "5";
                    break;
                case "VI":
                    tokens[0] = "6";
                    break;
                case "VII":
                    tokens[0] = "7";
                    break;
                case "VIII":
                    tokens[0] = "8";
                    break;
                case "IX":
                    tokens[0] = "9";
                    break;
                case "X":
                    tokens[0] = "10";
                    break;
            }
            switch (tokens[2]) {
                case "I":
                    tokens[2] = "1";
                    break;
                case "II":
                    tokens[2] = "2";
                    break;
                case "III":
                    tokens[2] = "3";
                    break;
                case "IV":
                    tokens[2] = "4";
                    break;
                case "V":
                    tokens[2] = "5";
                    break;
                case "VI":
                    tokens[2] = "6";
                    break;
                case "VII":
                    tokens[2] = "7";
                    break;
                case "VIII":
                    tokens[2] = "8";
                    break;
                case "IX":
                    tokens[2] = "9";
                    break;
                case "X":
                    tokens[2] = "10";
                    break;
            }
            flag = true;
        }


        int a  = Integer.parseInt(tokens[0]);
        int b = Integer.parseInt(tokens[2]);
        int ans = 0;
//эксепшн на проверку введеных арабских чисел
        try {
            if (((a<1) || (a>10)) || ((b<1) || (b>10))){
                throw new Exception("Ваши числа не попадают в интервал от 1 до 10");
            }
        }
        catch(Exception ex){ System.out.println(ex.getMessage());
        }
// выявление операции
        switch (tokens[1]) {
            case "+":
                ans=a+b;
                break;
            case "-":
                ans=a-b;
                break;
            case "/":
                ans=a/b;
                break;
            case "*":
                ans=a*b;
                break;
            default:
                System.out.println("Введите корректеную операцию: сложение, вычитание, деление или умножение");

        }
//вывод в соответствии с флагом
        if (flag == true){
            AnswerToRoman.integerToRoman(ans);
        }
        else { System.out.println(ans); }




    }
}
