package skye.sky.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Setter
@Getter
@NoArgsConstructor
@Table(name = "player")
public class Player {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "Name")
    private String name;
    @Column(name = "Team")
    private String team;
    @Column(name = "Country")
    private String country;
    @Column(name = "Position")
    private String position;

    public Player(String name,String team, String country, String position) {
        this.team = team;
        this.country = country;
        this.position = position;
        this.name= name;
    }
}
