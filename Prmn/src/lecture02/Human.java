package lecture02;

public class Human {
    String name;

    int age;

    Human(String name, int age){
        this.name = name;
        this.age = age;
        return;
    }

    void print(){
        System.out.println("”"+name+"は"+age+"歳です。”");
        return;

    }

}
