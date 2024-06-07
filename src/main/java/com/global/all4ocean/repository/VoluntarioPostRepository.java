package com.global.all4ocean.repository;

import com.global.all4ocean.entity.VoluntarioPostEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VoluntarioPostRepository extends JpaRepository<VoluntarioPostEntity, Long> {
    Page<VoluntarioPostEntity> findByIdVoluntario(Long id, Pageable pageable);

    Page<VoluntarioPostEntity> findByIdPost(Long id, Pageable pageable);
}
