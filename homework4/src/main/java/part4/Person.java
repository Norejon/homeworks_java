package part4;

import lombok.*;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Person {
    private String name;
    private List<Pet> pets;

    public Person(String name) {
        this.name = name;
    }
}
