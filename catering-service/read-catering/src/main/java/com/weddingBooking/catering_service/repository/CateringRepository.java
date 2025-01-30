package com.weddingBooking.catering_service.repository;

import com.weddingBooking.catering_service.model.Catering;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CateringRepository extends JpaRepository<Catering, Long> {
    List<Catering> findByNameContaining(String name);
}
