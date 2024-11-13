package br.com.rochadev.dslist.services;

import br.com.rochadev.dslist.dto.GamesDTO;
import br.com.rochadev.dslist.entites.Games;
import br.com.rochadev.dslist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {
    @Autowired
    private GameRepository gameRepository;
    public List<GamesDTO> findAll() {
        List<Games> result = gameRepository.findAll();
        List<GamesDTO> dto = result.stream().map(GamesDTO::new).toList();
        return dto;
    }
}
