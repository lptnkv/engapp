package com.lptnkv.engapp.repository;

import com.lptnkv.engapp.entity.Card;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CardRepository extends JpaRepository<Card, Integer> {
}
