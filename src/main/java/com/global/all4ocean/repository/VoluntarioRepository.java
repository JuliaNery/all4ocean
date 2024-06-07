package com.global.all4ocean.repository;

import com.global.all4ocean.entity.OngEntity;
import com.global.all4ocean.entity.VoluntarioEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface VoluntarioRepository extends JpaRepository<VoluntarioEntity, Long> {
    Page<VoluntarioEntity> findAll(Pageable pageable);

}
