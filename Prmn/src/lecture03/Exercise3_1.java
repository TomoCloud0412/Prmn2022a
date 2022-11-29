package lecture03;

import java.util.Scanner;

public class Exercise3_1 {
    void main (){

        Scanner scanner = new Scanner(System.in);

        System.out.println("任意の文字列を入力してください");
        System.out.print(">");
        String name = scanner.nextLine();

        System.out.println("”"+name+"”"+"と入力されました");

    }
}
