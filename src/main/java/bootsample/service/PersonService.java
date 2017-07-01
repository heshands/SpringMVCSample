package bootsample.service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import bootsample.dao.PersonDaoRepository;
import bootsample.model.PersonModel;

@Service
@Transactional
public class PersonService {

	private final PersonDaoRepository personDaoRepository;

	public PersonService(PersonDaoRepository personDaoRepository) {
		this.personDaoRepository = personDaoRepository;
	}
	
	public List<PersonModel> findAll(){
		List<PersonModel> person = new ArrayList<>();
		for(PersonModel personlist : personDaoRepository.findAll()){
			person.add(personlist);
		}
		System.out.println(person);
		return person;
	}
	
}
