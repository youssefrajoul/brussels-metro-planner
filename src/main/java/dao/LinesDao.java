package dao;

import dto.LinesDto;
import exception.RepositoryException;
import manager.DBManager;

import java.sql.*;
import java.util.List;

public class LinesDao implements Dao<Integer, LinesDto> {

    private Connection connexion;


    public LinesDao() throws RepositoryException {
        connexion = DBManager.getInstance().getConnection();
    }

    @Override
    public Integer create(LinesDto item) {
        return null;
    }

    @Override
    public void read(Integer key) throws RepositoryException {
        try {
            Statement stmt = connexion.createStatement();

            String query = "SELECT * from LINES";
            ResultSet result = stmt.executeQuery(query);
            System.out.println("test test");

            while (result.next()) {
                int id = result.getInt(1);
                System.out.println("\t record : " + id);
            }
        } catch (SQLException ex) {
            System.out.println("DEMO_SELECT | Erreur " + ex.getMessage() + " SQLState " + ex.getSQLState());
        }
    }

    @Override
    public void update(LinesDto item) {

    }

    @Override
    public void delete(Integer key) {

    }

    @Override
    public List<LinesDto> selectAll() {
        return null;
    }
}
