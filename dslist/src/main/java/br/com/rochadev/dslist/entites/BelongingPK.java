package br.com.rochadev.dslist.entites;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import java.util.Objects;
@Embeddable
public class BelongingPK {
    @ManyToOne
    @JoinColumn(name = "game_id")
    private Games game_id;
    @ManyToOne
    @JoinColumn(name = "list_id")
    private GameList list_id;

    public BelongingPK() {
    }

    public BelongingPK(Games games, GameList list) {
        this.game_id = games;
        this.list_id = list;
    }

    public Games getGame_id() {
        return game_id;
    }

    public void setGame_id(Games game_id) {
        this.game_id = game_id;
    }

    public GameList getList_id() {
        return list_id;
    }

    public void setList_id(GameList list_id) {
        this.list_id = list_id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BelongingPK that)) return false;
        return Objects.equals(getGame_id(), that.getGame_id()) && Objects.equals(getList_id(), that.getList_id());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getGame_id(), getList_id());
    }
}
