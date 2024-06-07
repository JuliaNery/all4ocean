package com.global.all4ocean.repository;

import com.global.all4ocean.entity.CurtidaPostEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CurtidaPostRepository extends JpaRepository<CurtidaPostEntity, Long> {

    Page<CurtidaPostEntity> findByIdPost(Long id, Pageable pageable);

    Page<CurtidaPostEntity> findByIdVoluntario(Long id, Pageable pageable);
}
