package ie.atu.oop;

import java.util.ArrayList;
import java.util.List;

public class Member {
    private String memberId;
    private String name;
    private int age;




    public Member(String memberId, String name, int age) {
        this.memberId = memberId;
        this.name = name;
        this.age = age;


        if(memberId == null || memberId.isBlank()){
            throw new IllegalArgumentException(
                    "Member ID cannot be empty");

        }
        if(name == null || name.isBlank()){
            throw new IllegalArgumentException(
                    "Name cannot be empty"

            );}

            if(age <= 0){
                throw new IllegalArgumentException(
                        "Age cannot be less than 0"
                );



        }

    }

    public String getMemberId(){ return memberId;}
    public String getName(){ return name;}
    public int getAge(){ return age;}



}

