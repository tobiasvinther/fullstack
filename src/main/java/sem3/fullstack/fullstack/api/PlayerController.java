package sem3.fullstack.fullstack.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sem3.fullstack.fullstack.entity.Player;
import sem3.fullstack.fullstack.repositories.PlayerRepository;

@RestController
@RequestMapping("/api/players")
public class PlayerController {

    PlayerRepository playerRepository;

    public PlayerController(PlayerRepository playerRepository) {
        this.playerRepository = playerRepository;
    }

    @GetMapping
    Iterable<Player> getPlayers() {
        return playerRepository.findAll();
    }
}
