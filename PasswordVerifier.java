package seminars_exception.sem_3;
//Задача 1: Проверка пароля (Основы языка Java, операторы, ветвления)
//
//        Создайте класс PasswordVerifier. Этот класс должен содержать метод, который принимает строку
//        пароля и проверяет его на соответствие следующим правилам:
//        Пароль должен быть не менее 8 символов.
//        Пароль должен содержать хотя бы одну цифру.
//        Пароль должен содержать хотя бы одну заглавную букву.
//        Метод должен выбрасывать исключение, если пароль не соответствует какому-либо из этих правил.

import seminars_exception.sem_2.Except1;

public class PasswordVerifier {
    public static class PasswordVerifierException extends Exception {
        public PasswordVerifierException(String error) {
            super(error);
        }

        public static void check1(String row1) throws PasswordVerifierException {
            for (char c : row1.toCharArray()) {
                if ( !Character.isDigit(c) && !Character.isUpperCase(c)) {
                    throw new PasswordVerifierException(" An inappropriate password!");
                }
                }
            if(row1.length() <= 8) {
                throw new PasswordVerifierException(" An inappropriate password!");
            }
        }

        public static void main(String[] args) {
            String a = "1234AA";
            try {
                check1(a);
            } catch (PasswordVerifierException e) {
                System.out.println("ERROR" + " " + e);
            }
        }
    }
}
