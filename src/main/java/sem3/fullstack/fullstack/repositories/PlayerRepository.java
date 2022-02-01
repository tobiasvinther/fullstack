package sem3.fullstack.fullstack.repositories;

import org.springframework.data.repository.CrudRepository;
import sem3.fullstack.fullstack.entity.Player;

public interface PlayerRepository extends CrudRepository<Player,Integer> {

}
