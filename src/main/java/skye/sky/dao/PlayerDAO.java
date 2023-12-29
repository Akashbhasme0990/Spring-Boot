package skye.sky.dao;

import org.springframework.stereotype.Repository;
import org.w3c.dom.stylesheets.LinkStyle;
import skye.sky.Entity.Player;
import java.util.List;
@Repository
public interface PlayerDAO {
    List<Player> getAll();
}
