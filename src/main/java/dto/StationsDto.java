package dto;

public class StationsDto extends Dto<Integer> {

    String name;

    protected StationsDto(Integer key) {
        super(key);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
