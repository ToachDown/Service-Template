package com.example.servicetemplate.repository;

import com.example.servicetemplate.model.BaseModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface BaseRepository extends JpaRepository<BaseModel, UUID> {
}
