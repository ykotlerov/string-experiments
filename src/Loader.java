import java.util.Scanner;

public class Loader
{
    public static void main(String[] args)
    {
        // Задача 1
        /*for (int i = 65;i < 91 ; i++)
            System.out.println(i + " - "+ (char) i);
        System.out.println("-------------------------");
        for (int i = 1040;i < 1072 ; i++)
            System.out.println(i + " - "+ (char) i);  */

        //Задача 2
        /*String text = "Вася заработал 5000 рублей, Петя - 7563 рубля, а Маша - 30000 рублей";
        text.trim();
        String s = "";
        int summa = 0;
        for (int i = 0; i < text.length(); i++)
        {
            while (((int) text.charAt(i) >= (int) '0') & ((int) text.charAt(i) <= (int)'9'))
            {
                s = s + text.charAt(i);
                i++;
            }

            if (s.length() > 0 ) summa = summa + Integer.parseInt(s);
            s = "";
        }

        System.out.println("Сумма заработанных денег: " + summa + " руб."); */

        // Задача 3
        // Фёдоров Дмитрий Петрович
        Scanner in = new Scanner(System.in);
        System.out.print("Укажите Фамилию Имя и Отчество : ");
        String fio = in.nextLine();
        fio.trim();
        int start = 0, counter = 0;
        if (fio.length() > 0)
        {
          for (int i = 0; i <= fio.length()-1; i++)
          {
            if (fio.charAt(i) == ' ' || i == fio.length()-1)
            {
                String s = "";
                counter++;
                switch(counter)
                {
                    case 1: s += "Фамилия: "; break;
                    case 2: s += "Имя: "; break;
                    case 3: s += "Отчество: "; break;
                    default: s += "Ещё какой-то текст: "; break;
                }
               System.out.println(s + fio.substring(start,i+1).trim());
               start = ++i;
            }
          }
        } else System.out.println("Ф.И.О на задано!");

    }
}