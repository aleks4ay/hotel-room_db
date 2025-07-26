package com.aleks4ay.room.db.repocitory;

import com.aleks4ay.room.db.model.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HotelRepo extends JpaRepository<Hotel, Long> {
}
