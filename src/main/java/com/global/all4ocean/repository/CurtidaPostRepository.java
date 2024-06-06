package com.global.all4ocean.repository;

import com.global.all4ocean.entity.CurtidaPostEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CurtidaPostRepository extends JpaRepository<CurtidaPostEntity, Long> {
}
