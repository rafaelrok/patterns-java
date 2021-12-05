package br.com.rafaelvieira.labpatternjavaspring.repositories;

import br.com.rafaelvieira.labpatternjavaspring.model.Address;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRespository extends CrudRepository<Address, String>{
}
