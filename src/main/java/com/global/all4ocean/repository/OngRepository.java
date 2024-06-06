package com.global.all4ocean.repository;

import com.global.all4ocean.entity.OngEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OngRepository extends JpaRepository<OngEntity, Long> {
}
