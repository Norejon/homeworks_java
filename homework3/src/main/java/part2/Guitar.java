package part2;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Guitar implements Instrument{
    private int countStruns;
    @Override
    public void play() {
        System.out.println("Грає Гітара з "+countStruns+" струнами ");
    }
}
