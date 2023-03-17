package part3;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Automobil {
    private String marka;
    private double powerEngine;
    private Owner owner;
    private int cost;
    private int year;

    public void setMorePowerEngine(int upgrade) {
        this.powerEngine = this.powerEngine*(upgrade+100)/100;
    }

}
