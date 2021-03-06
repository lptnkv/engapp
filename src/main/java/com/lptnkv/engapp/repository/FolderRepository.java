package com.lptnkv.engapp.repository;

import com.lptnkv.engapp.entity.Folder;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FolderRepository extends JpaRepository<Folder, Integer> {
    List<Folder> findAllByTheme(String theme);
    Folder findById(int id);
}
