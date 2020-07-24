package org.sid.avito.dao;


import org.sid.avito.entities.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@RepositoryRestResource
@CrossOrigin("http:localhost:4200")
public interface UtilisateurRepository extends JpaRepository<Utilisateur, Long>{

}
