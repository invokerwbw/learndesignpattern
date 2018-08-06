package org.star.structural.filter;

import java.util.ArrayList;
import java.util.List;

public class CriteriaMale implements Criteria {
    @Override
    public List<Person> meetCriteria(List<Person> persons) {

        List<Person> malePersons = new ArrayList<Person>();

        for (Person person : persons) {
            if (Gender.Male.equals(person.getGender())) {
                malePersons.add(person);
            }
        }

        return malePersons;
    }
}
