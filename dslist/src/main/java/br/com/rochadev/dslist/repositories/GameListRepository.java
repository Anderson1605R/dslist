package br.com.rochadev.dslist.repositories;

import br.com.rochadev.dslist.entites.GameList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameListRepository extends JpaRepository<GameList, Long> {
}
