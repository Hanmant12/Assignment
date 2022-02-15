package mocking;

import java.util.ArrayList;
import java.util.List;

public class BusinessMan {
	private PersonService personService;

    public BusinessMan(PersonService personService) {
        this.personService = personService;
    }
    public List<person> findAllPerson(person person){
        List<person> people=new ArrayList<>();
        people.add(person);
        return people;

    }
}
