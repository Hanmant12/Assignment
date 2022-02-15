package mocking;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import junit.framework.Assert;

public class tstcase {
	@Test
    public void testPersonMock(){
        PersonService personService=mock(PersonService.class);
        List<person> personList=new ArrayList<>();
        personList.add(new person(1l, "Tarkeshwar", "Delhi", "34343"));
        personList.add(new person(2l, "Tarkeshwar1", "Mumbai", "343455553"));
        personList.add(new person(3l, "Tarkeshwar2", "Kolkata", "34344343"));
        personList.add(new person(4l, "Tarkeshwar3", "Chennai", "34342223"));
        when(personService.getAllPerson()).thenReturn(personList);
        Assert.assertEquals(1l , personList.get(1).getPid());
    }
}
