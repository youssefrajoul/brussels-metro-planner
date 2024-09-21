import dao.LinesDao;
import exception.RepositoryException;
import manager.ConfigManager;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            ConfigManager.getInstance().load();
            LinesDao linesDao = new LinesDao();
            linesDao.read(1);
        } catch (IOException ex) {
            System.out.println("Erreur IO " + ex.getMessage());
        } catch (RepositoryException ex) {
            System.out.println("Erreur Repository " + ex.getMessage());
        }

    }
}
