package com.lptnkv.engapp.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class Folder {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String theme;
    private String creator;

    @OneToMany(targetEntity = Card.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "folder_id")
    private List<Card> cards;
}
