package skye.sky.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@ToString
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "user_id", nullable = false)
    private Integer userId;

    @Column(unique = true)
    private String email;

    @Column(unique = true)
    private String username;

    private String password;
    private String image;
    private String bio;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public User(Integer userId, String email, String username, String password, String image, String bio) {
        this.userId = userId;
        this.email = email;
        this.username = username;
        this.password = password;
        this.image = image;
        this.bio = bio;
    }

    public User(){
    }
}
