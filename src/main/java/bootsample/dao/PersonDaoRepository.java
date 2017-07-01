package bootsample.dao;

import org.springframework.data.repository.CrudRepository;

import bootsample.model.PersonModel;

public interface PersonDaoRepository extends CrudRepository<PersonModel, Integer> {

}
