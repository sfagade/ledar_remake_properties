package org.tsp.projects.ledar.landedproperties.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import org.tsp.projects.ledar.landedproperties.model.LandProperty;

@Repository
public interface LandPropertyRepository extends PagingAndSortingRepository<LandProperty, Long> {
}
