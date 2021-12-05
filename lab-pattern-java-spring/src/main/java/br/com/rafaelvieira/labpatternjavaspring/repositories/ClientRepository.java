package br.com.rafaelvieira.labpatternjavaspring.repositories;

import br.com.rafaelvieira.labpatternjavaspring.model.Client;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRespository extends CrudRepository<Client, Long>{
}
