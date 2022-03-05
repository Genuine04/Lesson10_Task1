package uz.pdp.task1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uz.pdp.task1.entity.Hotel;

@Repository
public interface HotelRepository extends JpaRepository<Hotel,Long> {
}
