package by.lucas.agenda.contatos.modelo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "contatos", path = "contatos")
public interface RepositorioContato extends JpaRepository<contato, Long> {

}
