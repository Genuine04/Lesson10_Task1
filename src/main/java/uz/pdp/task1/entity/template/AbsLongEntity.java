package uz.pdp.task1.entity.template;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.hibernate.Hibernate;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.util.Objects;

@Data
@RequiredArgsConstructor
@MappedSuperclass
public abstract class AbsLongEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        AbsLongEntity absEntity = (AbsLongEntity) o;

        return Objects.equals(id, absEntity.id);
    }

    @Override
    public int hashCode() {
        return 11151818;
    }
}
