package mocking;

import java.util.ArrayList;
import java.util.List;

public class GenerateFacePersons implements PersonService{
	@Override
    public List<person> getAllPerson() {
        List<person> personList=new ArrayList<>();
        personList.add(new person(1l, "Tarkeshwar", "Delhi", "34343"));
        personList.add(new person(2l, "Tarkeshwar1", "Mumbai", "343455553"));
        personList.add(new person(3l, "Tarkeshwar2", "Kolkata", "34344343"));
        personList.add(new person(4l, "Tarkeshwar3", "Chennai", "34342223"));
        return personList;
    }
}
