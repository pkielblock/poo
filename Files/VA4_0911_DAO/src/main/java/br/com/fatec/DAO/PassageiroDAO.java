package br.com.fatec.DAO;

import br.com.fatec.model.Passageiro;

import java.sql.SQLException;
import java.util.Collection;

public class PassageiroDAO implements DAO <Passageiro> {

    @Override
    public boolean insere(Passageiro obj) throws SQLException {
        return false;
    }

    @Override
    public boolean remove(Passageiro obj) throws SQLException {
        return false;
    }

    @Override
    public boolean altera(Passageiro obj) throws SQLException {
        return false;
    }

    @Override
    public Passageiro buscaID(Passageiro obj) throws SQLException {
        return null;
    }

    @Override
    public Collection<Passageiro> lista(String criterio) throws SQLException {
        return null;
    }
}
