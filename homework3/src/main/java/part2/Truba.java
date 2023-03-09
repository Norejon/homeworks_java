package part2;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Truba implements Instrument{
    private int diametr;

    @Override
    public void play() {
        System.out.println("Грає Труба з діаметром "+diametr+" см ");
    }
}
