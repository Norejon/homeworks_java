package part2;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Baraban implements Instrument{
    private int size;
    @Override
    public void play() {
        System.out.println("Грає Барабан розміром з "+size+" літрову бочку ");
    }
}
