package Comment;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Data
public class Comment {
    private int postId;
    private int id;
    private String email;
    private String body;
}

