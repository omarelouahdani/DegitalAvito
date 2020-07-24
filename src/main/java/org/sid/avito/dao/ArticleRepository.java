package org.sid.avito.dao;


import org.sid.avito.entities.Article;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@RepositoryRestResource
@CrossOrigin("http:localhost:4200")
public interface ArticleRepository extends JpaRepository<Article, Long>{

}
