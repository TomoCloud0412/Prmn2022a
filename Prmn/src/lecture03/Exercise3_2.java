package lecture03;
import java.util.Scanner;
import java.util.ArrayList;

public class Exercise3_2 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        ArrayList<String> list = new ArrayList<>();

        System.out.println("何行分入力しますか？");
        System.out.print(">");
        int n = scanner.nextInt();
        scanner.nextLine();

        for(int i = 0 ; i < n ;i++){

            System.out.println((1+i)+"行目");
            String line = scanner.nextLine();
            list.add(line);


        }

        for(String string : list){
            System.out.println("["+list.indexOf(string)+"]"+string);

        }

    }
}
