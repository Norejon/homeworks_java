package part4;

import lombok.*;

import java.util.List;
import java.util.Map;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Zooclub {
    private Map<Person,List<Pet>> club;
}
