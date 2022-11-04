package lecture01;

import java.util.Scanner;

public class Main {
    public static void  main (String[]args){

        /*System.out.println("B2211740 Tomonari Nakanishi");*/

       /* int studentNumber = 2211740;

        System.out.println("B"+studentNumber+" Tomonari Nakanishi");*/

        /*int age;

        Scanner input = new Scanner(System.in);

        age = input.nextInt();

        if(age <= 20){
            System.out.println("I am "+age+" old so i can drink");
        }else{
            System.out.println("I am "+age+" old so i cannot drink");
        }*/

        /*int[] array = new int[100];
        int sum =0;

        for(int i = 0;i < 100; i++){
            array[i] = i + 1;
            int a = array[i];

            if (a % 2 == 0){
                sum = sum + a;
            }

        }

        System.out.println("sum = "+sum);*/

        int[] score = new int[5];

        int min,max;
        double average;

        Scanner input2 = new  Scanner(System.in);

        System.out.println("点数を入力してください");

        for(int j = 0 ; j < score.length ; j++){
            System.out.println(j+ "番目の生徒");
            int in = input2.nextInt();
            score[j] = in;
        }

        for(int k = 0 ; k < score.length ; k++) {
            int sc = score[k];
            if (sc >= 90) {

                System.out.println(k + "番" + sc + "点 秀");

            } else if (80 <= sc && sc < 90) {

                System.out.println(k + "番" + sc + "点 優");

            } else if (70 <= sc && 80 > sc) {

                System.out.println(k + "番" + sc + "点 良");

            } else if (60 <= sc && 70 > sc) {

                System.out.println(k + "番" + sc + "点 可");

            } else {
                System.out.println(k + "番" + sc + "点 不可");
            }
        }


        min = Min(score);
        max = Max(score);
        average = Average(score);

            System.out.println("最低点:"+min);
            System.out.println("最高点:"+max);
            System.out.println("平均点:"+average);
        }
    private static int Min(int ss[]){
        int min = ss[0];
        for (int i = 1 ; i <ss.length ; i++){
            if( min > ss[i]){
                min = ss[i];
            }
        }
        return min;
    }

    private static int Max(int nx[]){
        int max = nx[0];
        for( int i = 1 ; i < nx.length; i++){
            if( max < nx[i]){
                max = nx[i];
            }
        }
        return max;
    }

    private static double Average(int ny[]){
        double average;
        int sum = 0;
        for( int i = 1 ; i < ny.length; i++){
            sum = sum + ny[i];

        }
        average = (double)sum/ny.length;
        return average;
    }

}
