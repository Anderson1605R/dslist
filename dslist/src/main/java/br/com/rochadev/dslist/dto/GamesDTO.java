package br.com.rochadev.dslist.dto;

import br.com.rochadev.dslist.entites.Games;
import jakarta.persistence.Column;

public class GamesDTO {
    private long id;
    private String title;
    private int year;
    private String imgUrl;
    private String shortDescription;

    public GamesDTO(Games entity) {
        this.id = entity.getId();
        this.title = entity.getTitle();
        this.year = entity.getYear();
        this.imgUrl = entity.getImgUrl();
        this.shortDescription = entity.getShortDescription();
    }

    public long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public int getYear() {
        return year;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public String getShortDescription() {
        return shortDescription;
    }
}
