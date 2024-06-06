package com.global.all4ocean.repository;

import com.global.all4ocean.entity.PostOngEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostOngRepository extends JpaRepository<PostOngEntity, Long> {
}
