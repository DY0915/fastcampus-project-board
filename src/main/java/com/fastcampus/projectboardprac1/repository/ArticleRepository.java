package com.fastcampus.projectboardprac1.repository;

import com.fastcampus.projectboardprac1.domain.Article;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface ArticleRepository extends JpaRepository<Article, Long> {
}