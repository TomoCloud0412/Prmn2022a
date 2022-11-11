package lecture02;

import java.util.Scanner;

public class Exercise2_1 {
    public static void main(String[]args){
        System.out.println("名前と年齢を入力してください");
        Scanner input = new Scanner(System.in);
        System.out.print("name=");
        String name = input.next();
        System.out.print("age=");
        int age = input.nextInt();

        Human human = new Human(name, age);


        human.print();

    }


}
