package br.com.rochadev.dslist.services;

import br.com.rochadev.dslist.dto.GameListDTO;
import br.com.rochadev.dslist.dto.GamesDTO;
import br.com.rochadev.dslist.entites.GameList;
import br.com.rochadev.dslist.entites.Games;
import br.com.rochadev.dslist.repositories.GameListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameListService {
    @Autowired
    private GameListRepository gameListRepository;

    @Transactional(readOnly = true)
    public List<GameListDTO> findAll() {
        List<GameList> result = gameListRepository.findAll();
        List<GameListDTO> dto = result.stream().map(GameListDTO::new).toList();
        return dto;
    }


}
