package br.com.rochadev.dslist.services;

import br.com.rochadev.dslist.dto.GameAllDTO;
import br.com.rochadev.dslist.dto.GamesDTO;
import br.com.rochadev.dslist.entites.Games;
import br.com.rochadev.dslist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameService {
    @Autowired
    private GameRepository gameRepository;

    @Transactional(readOnly = true)
    public List<GamesDTO> findAll() {
        List<Games> result = gameRepository.findAll();
        List<GamesDTO> dto = result.stream().map(GamesDTO::new).toList();
        return dto;
    }

    @Transactional(readOnly = true)
    public GameAllDTO findById(Long id) {
        Games result = gameRepository.findById(id).get();
        GameAllDTO dto = new GameAllDTO(result);
        return dto;

    }
}
