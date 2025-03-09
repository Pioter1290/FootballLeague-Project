package com.footballleague.league_organizer.repositories;

import com.footballleague.league_organizer.entities.Player;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PlayerRepository extends JpaRepository<Player, Long> {
    List<Player> findByName(String name);
    List<Player> findByTeamId(long teamId);
}
