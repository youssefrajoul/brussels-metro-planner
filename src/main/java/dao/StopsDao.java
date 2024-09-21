package dao;

import dto.StopsDto;
import dto.StopsKey;

import java.util.List;

public class StopsDao implements Dao<StopsKey, StopsDto> {

    @Override
    public StopsKey create(StopsDto item) {
        return null;
    }

    @Override
    public void read(StopsKey key) {

    }

    @Override
    public void update(StopsDto item) {

    }

    @Override
    public void delete(StopsKey key) {

    }

    @Override
    public List<StopsDto> selectAll() {
        return null;
    }
}
