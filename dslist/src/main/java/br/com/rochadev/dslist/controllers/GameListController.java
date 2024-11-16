package br.com.rochadev.dslist.controllers;

import br.com.rochadev.dslist.dto.GameListDTO;

import br.com.rochadev.dslist.dto.GamesDTO;
import br.com.rochadev.dslist.services.GameListService;

import br.com.rochadev.dslist.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/lists")
public class GameListController {
    @Autowired
    private GameListService gameListService;
    @Autowired
    private GameService gameService;

    @GetMapping
    public  List<GameListDTO>findAll(){
        List<GameListDTO> result = gameListService.findAll();
        return result;
    }
    @GetMapping(value = "/{listId}/games")
    public  List<GamesDTO>findByList(@PathVariable Long listId){
        List<GamesDTO> result = gameService.findByList(listId);
        return result;
    }


}
