package ie.atu.oop;

import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {


    public static void main(String[] args) {

        List<String> members = new ArrayList<>();
        members.add("dude");
        members.add("2");
        members.add("3");

        Member member = new Member("122 ", "122 ", 20);
        System.out.println(member.getMemberId());
        System.out.println(member.getName());
        System.out.println(member.getAge());
        System.out.println(members.get(0));


    }
}



