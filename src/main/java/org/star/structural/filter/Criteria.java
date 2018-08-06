package org.star.structural.filter;

import java.util.List;

public interface Criteria {

    List<Person> meetCriteria(List<Person> persons);
}
