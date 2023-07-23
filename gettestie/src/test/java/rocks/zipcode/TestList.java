package rocks.zipcode;

import static org.junit.Assert.*;
import java.util.ArrayList;


public class TestList {

 @org.junit.Test
    public void testGet(){
     ArrayList<Person> list = new ArrayList<>();
     Person expected = new Person("Jack", 2015);
     list.add(expected);

     Person actual = list.get(0);

     assertEquals(expected, actual);
 }

 @org.junit.Test
    public void testIndexOf(){
     ArrayList<Person> list = new ArrayList<>();
     Person person = new Person("Roland", 1955);
     list.add(new Person("Jack", 2005));
     list.add(person);
     list.add(new Person("Eddie Dean", 1985));
     int expected = 1;
     int actual = list.indexOf(person);

     assertEquals(expected, actual);
 }
}
