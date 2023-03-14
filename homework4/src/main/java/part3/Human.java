package part3;

import lombok.*;

import java.util.LinkedList;

@NoArgsConstructor
@Getter
@Setter
@ToString
public class Human implements Comparable<Human> {
    private int id;
    private String name;
    private String surname;
    private String email;
    private int age;
    private Gender gender;
    private LinkedList<Skills> skills;
    private Car car;

    public Human(int id, String name, String surname, String email, int age, Gender gender, LinkedList<Skills> skills,String model, int year,int power) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.age = age;
        this.gender = gender;
        this.skills = skills;
        this.car = new Car(model,year,power);
    }

    @Override
    public int compareTo(Human o) {
        return this.skills.size() - o.getSkills().size();
    }
}
