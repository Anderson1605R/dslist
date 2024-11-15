package br.com.rochadev.dslist.controllers;

import br.com.rochadev.dslist.dto.GameAllDTO;
import br.com.rochadev.dslist.dto.GamesDTO;
import br.com.rochadev.dslist.entites.Games;
import br.com.rochadev.dslist.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/games")
public class GameController {
    @Autowired
    private GameService gameService;

    @GetMapping
    public  List<GamesDTO>findAll(){
        List<GamesDTO> result = gameService.findAll();
        return result;
    }
    @GetMapping(value = "/{id}")
    public GameAllDTO findById(@PathVariable Long id){
        GameAllDTO result = gameService.findById(id);
        return result;
    }


}
