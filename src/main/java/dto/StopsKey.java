package dto;

public class StopsKey {

    int id_line;
    int id_station;

    public StopsKey(int id_line, int id_station) {
        this.id_line = id_line;
        this.id_station = id_station;
    }

    public int getId_line() {
        return id_line;
    }

    public void setId_line(int id_line) {
        this.id_line = id_line;
    }

    public int getId_station() {
        return id_station;
    }

    public void setId_station(int id_station) {
        this.id_station = id_station;
    }
}
