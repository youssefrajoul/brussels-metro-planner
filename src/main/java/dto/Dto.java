package dto;

import java.util.Objects;

public class Dto<K> {

    protected K id;

    protected Dto(K id) {
        if (id == null) {
            throw new IllegalArgumentException("Clé absente " + id);
        }
        this.id = id;
    }

    public K getKey() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dto<?> dto = (Dto<?>) o;
        return Objects.equals(id, dto.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
