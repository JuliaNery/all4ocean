package com.global.all4ocean.repository;

import com.global.all4ocean.entity.ComentarioPostEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ComentarioPostRepository extends JpaRepository<ComentarioPostEntity, Long> {
    Page<ComentarioPostEntity> findByIdPost(Long id, Pageable pageable);
}
