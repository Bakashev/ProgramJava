package com.home.My;
class Help
{
    public void showmenu()
    {
        System.out.println("Выберите номер инструкции:");
        System.out.println("1. Описание инструкции if");
        System.out.println("2. Описание инструкции case");
        System.out.println("3. Описание инструкции for");
        System.out.println("4. Описание инструкции while");
        System.out.println("5. Описание инструкции do-while");
        System.out.println("6. Описание инструкции break");
        System.out.println("7. Описание инструкции continue");
        System.out.println();
        System.out.println("для выхода нажмите q");
    }

    boolean isvalid (int ch)
    {
        if (ch < '1' | ch > '7' &  ch !='q') return false;
        else return true;
    }
void helpon (int what)
{
    switch (what) {
        case '1':
            System.out.println("if:");
            System.out.println("if ( условие ) \n { \n\t последовательность инструкций \n " +
                    "else\n { \n\t последова тельность инструкций \n} ");
            break;
        case '2':
            System.out.println("switch:");
            System.out.println("switсh ( выражение )\n {\n" +
                    "case константа 1:\n" +
                    "\tпоследова тельность инструкций\n" +
                    "\tbreak;\n" +
                    "case константа 2:\n" +
                    "\tпо следова тельность инструкций\n" +
                    "\tbreak;\n" +
                    "case константа n:\n" +
                    "\tпоследова тельность инструкций\n" +
                    "\tbreak;\n" +
                    ".\n" +
                    ".\n" +
                    "default :\n" +
                    "последова тельность инструкций\n" +
                    "}");
            break;
        case '3':
            System.out.println("for:");
            System.out.println("fоr ( инициализация; условие ; итерация)\n" +
                    "{\n" +
                    "последовательность инструкций; " +
                    "}");
            break;
        case '4':
            System.out.println("while\n");
            System.out.println("while ( условие )\n" +
                    "{\n" +
                    "инструкции;" +
                    "\n" +
                    "}\n");
            break;
        case '5':
            System.out.println("do-while");
            System.out.println("do \n" +
                    "{\n" +
                    "инструкции;\n" +
                    "}\n" +
                    "while (условие);"
            );
            break;
        case '6':
            System.out.println("break:");
            System.out.println("break; или break метка;");
            break;

        case '7':
            System.out.println("continue:");
            System.out.println("continue; или continue метка;");
            break;
    }
}
}

public class HelpNewMethod

{
 public static void main (String args[])
     throws java.io.IOException
 {
     Help help = new Help();
     char ch,ignore;
     for (;;)
     {
         do
         {
             help.showmenu();
             ch = (char)System.in.read();
             do
             {
                 ignore= (char)System.in.read();
             } while (ignore!='\n');
         } while (!help.isvalid(ch));
         if (ch=='q') break;
         help.helpon(ch);
     }

 }


}
