package com.lptnkv.engapp.controller;

import com.lptnkv.engapp.entity.Folder;
import com.lptnkv.engapp.repository.CardRepository;
import com.lptnkv.engapp.repository.FolderRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("folders")
public class MainController {
    @Autowired
    private final CardRepository cardRepository;

    @Autowired
    private final FolderRepository folderRepository;

    public MainController(CardRepository cardRepository, FolderRepository folderRepository) {
        this.cardRepository = cardRepository;
        this.folderRepository = folderRepository;
    }

    @GetMapping
    public List<Folder> getAll(){
        return folderRepository.findAll();
    }

    @GetMapping("{theme}")
    public List<Folder> getByTheme(String theme){
        return folderRepository.findAllByTheme(theme);
    }

    @GetMapping("{id}")
    public Folder getTheme(int id){
        return folderRepository.findById(id);
    }

    @PostMapping
    public Folder addFolder(@RequestBody Folder folder){
        return folderRepository.save(folder);
    }

    @PutMapping("{id}")
    public Folder update(
            @PathVariable("id") Folder folderFromDb,
            @RequestBody Folder folder
    ){
        BeanUtils.copyProperties(folder, folderFromDb, "id");
        return folderRepository.save(folderFromDb);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable("id") Folder folder){
        folderRepository.delete(folder);
    }
}
