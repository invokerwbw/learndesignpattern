package org.star.structural.filter;

import java.util.ArrayList;
import java.util.List;

public class CriteriaSingle implements Criteria {
    @Override
    public List<Person> meetCriteria(List<Person> persons) {

        List<Person> malePersons = new ArrayList<Person>();

        for (Person person : persons) {
            if (MaritalStatus.Single.equals(person.getMaritalStatus())) {
                malePersons.add(person);
            }
        }

        return malePersons;
    }
}
