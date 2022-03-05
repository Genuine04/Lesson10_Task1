package uz.pdp.task1.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import uz.pdp.task1.entity.template.AbsLongEntity;

import javax.persistence.Column;
import javax.persistence.Entity;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "task10_2_hotel")
public class Hotel extends AbsLongEntity {

    @Column(unique = true)
    private String name;
}
