package seminars_exception;

//Задача 1:
//        Напишите программу, которая запрашивает у пользователя число и проверяет, является ли оно положительным.
//        Если число отрицательное или равно нулю, программа должна выбрасывать исключение InvalidNumberException
//        с сообщением "Некорректное число". В противном случае, программа должна выводить сообщение "Число корректно".

//Задача 2:
//        Напишите программу, которая запрашивает у пользователя два числа и выполняет их деление.
//        Если второе число равно нулю, программа должна выбрасывать исключение DivisionByZeroException с
//        сообщением "Деление на ноль недопустимо". В противном случае, программа должна выводить результат деления.
//        Обратите внимание, что в обоих задачах используются собственные исключения, которые наследуются от
//        класса Exception. Это позволяет нам определить специфическую причину ошибки и передать информацию
//        об ошибке для последующей обработки.

import com.sun.jdi.InvalidLineNumberException;
import com.sun.jdi.InvalidTypeException;

import java.util.InputMismatchException;
import java.util.InvalidPropertiesFormatException;
import java.util.Scanner;

public class Except1 {

    static class InvalidNumberException extends Exception{
        public InvalidNumberException(String errorMessage){
            super(errorMessage);
        }
    }

    static class DevisionByZeroException extends Exception{
        public DevisionByZeroException(String errorMessage1){
            super(errorMessage1);
        }
    }
// checking a number value which has to be positive or equal to zero
    public  static int checkNumber(int number) throws InvalidNumberException{
        if(number <= 0) {
            throw new InvalidNumberException("Некорректное число");
        }
        return number;
    }
    // checking a division operation  where second number is not equal zero
    public static int checkNumber1(int number1 , int number2) throws DevisionByZeroException{
        if(number2 ==0){
            throw new DevisionByZeroException("Деление на ноль недопустимо");
        }
        return number1/number2;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter your number1: ");
        int num1 = scanner.nextInt();
        System.out.println("enter your number2: ");
        int num2 = scanner.nextInt();
//        try {
//            int result = checkNumber(num1);
//        } catch (InvalidNumberException e) {
//            System.out.println("ERROR" + " " + e);
//        }
        try {
            int result1 = checkNumber1(num1,num2);
        } catch (DevisionByZeroException e) {
            System.out.println("ERROR" + " "+ e);
        }
    }
}

