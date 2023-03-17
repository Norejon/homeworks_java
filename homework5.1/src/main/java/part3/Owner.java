package part3;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Owner {
    private String name;
    private int years;
    private int stage;

    public void plusCvalification() {
        this.stage = stage+1;
    }
}
