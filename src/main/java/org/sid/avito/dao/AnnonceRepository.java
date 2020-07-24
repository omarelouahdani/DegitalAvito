package org.sid.avito.dao;

import org.sid.avito.entities.Annonce;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;
@RepositoryRestResource
@CrossOrigin("http:localhost:4200")
public interface AnnonceRepository extends JpaRepository<Annonce, Long>{

}
