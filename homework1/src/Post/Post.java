package Post;


import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Data
public class Post {
    private int userId;
    private int id;
    private String title;
    private String body;
}
