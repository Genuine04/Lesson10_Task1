package uz.pdp.task1.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import uz.pdp.task1.entity.template.AbsLongEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "task10_2_room")
public class Room extends AbsLongEntity {

    @Column(unique = true)
    private Integer number;

    private String floor;

    private String size;

    @ManyToOne
    private Hotel hotel;
}
