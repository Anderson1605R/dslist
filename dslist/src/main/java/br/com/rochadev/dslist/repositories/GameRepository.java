package br.com.rochadev.dslist.repositories;

import br.com.rochadev.dslist.entites.Games;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Games, Long> {
}
