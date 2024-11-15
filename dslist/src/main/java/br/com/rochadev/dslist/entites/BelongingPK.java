package br.com.rochadev.dslist.entites;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import java.util.Objects;
@Embeddable
public class BelongingPK {
    @ManyToOne
    @JoinColumn(name = "game_id")
    private Games games;
    @ManyToOne
    @JoinColumn(name = "gameList_id")
    private GameList list;

    public BelongingPK() {
    }

    public BelongingPK(Games games, GameList list) {
        this.games = games;
        this.list = list;
    }

    public Games getGames() {
        return games;
    }

    public void setGames(Games games) {
        this.games = games;
    }

    public void setList(GameList list) {
        this.list = list;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BelongingPK that)) return false;
        return Objects.equals(getGames(), that.getGames()) && Objects.equals(list, that.list);
    }

    @Override
    public int hashCode() {
        return Objects.hash(getGames(), list);
    }
}
