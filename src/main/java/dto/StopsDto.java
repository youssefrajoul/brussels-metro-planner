package dto;

public class StopsDto extends Dto<StopsKey> {

    int id_order;

    protected StopsDto(StopsKey key) {
        super(key);
    }

    public int getId_order() {
        return id_order;
    }

    public void setId_order(int id_order) {
        this.id_order = id_order;
    }
}
