package com.example.firstproject.dto;

import com.example.firstproject.entity.Article;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ArticleForm {
    private Long id;
    private String title;
    private String content;


    public Article toEntity() {
        return new Article(id,title,content);
    }
}
