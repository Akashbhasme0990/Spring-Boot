package skye.sky.Rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import skye.sky.Entity.Player;
import skye.sky.dao.PlayerDAO;

import java.util.List;

@RestController
@RequestMapping("/play")
public class PlayerRestController {
    private PlayerDAO playerDAO;
    public PlayerRestController(PlayerDAO thePlayerDAO){
        playerDAO=thePlayerDAO;
    }
    @GetMapping("/players")
    public List<Player> findAll(){
        return  playerDAO.getAll();
    }

}
