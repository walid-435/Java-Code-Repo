import java.util.*;
public class Person {
    String name;
    int age;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Person p1=new Person();
        p1.name="Walid";
        p1.age=21;
        Person p2=new Person();
        p2.name="Diddy";
        p2.age=30;
        String a=sc.next();
        if(a.equals(p1.name)){
            System.out.println(p1.name);
            System.out.println(p1.age);
        }
        else if(a.equals(p2.name)){
            System.out.println(p2.name);
            System.out.println(p2.age);
        }
        else{
            System.out.println("Invalid");
        }
    }
}
