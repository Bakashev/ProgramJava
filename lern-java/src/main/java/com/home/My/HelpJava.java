package com.home.My;

public class HelpJava {
    public static void main(String args[])
            throws java.io.IOException {
        char choise;
       // start:
        System.out.println("1. if");
        System.out.println("2. Switch");
        System.out.print("Выберите:");
        choise=(char)System.in.read();
        switch (choise)
                {
                    case '1':
                        System.out.println("Инструкция if:\n");
                        System.out.println("if (условие) инструкция;");
                        System.out.println("else инструкция;");
                        break;
                    case '2':
                        System.out.println("Инструкция swith:");
                        System.out.println("switch (вырожение){");
                        System.out.println("case константа:");
                        System.out.println("последовательность инструкций");
                        System.out.println("break");
                        System.out.println("//...");
                        System.out.println("}");
                        break;
                    default:
                        System.out.println("Запрос не найден");
                        break;
                    }

    }
}