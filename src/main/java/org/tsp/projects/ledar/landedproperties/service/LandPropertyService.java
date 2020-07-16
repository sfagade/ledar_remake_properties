package org.tsp.projects.ledar.landedproperties.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.tsp.projects.ledar.landedproperties.model.LandProperty;
import org.tsp.projects.ledar.landedproperties.repository.LandPropertyRepository;

import java.util.ArrayList;
import java.util.List;

@Service
public class LandPropertyService {

    private final LandPropertyRepository repository;

    @Autowired
    public LandPropertyService(LandPropertyRepository landPropertyRepository) {
        repository = landPropertyRepository;
    }

    public List<LandProperty> fetchPageSortProperties(Integer pageNo, Integer pageSize, String sortBy) {
        Pageable paging = PageRequest.of(pageNo, pageSize, Sort.by(sortBy));

        Page<LandProperty> pagedResult = repository.findAll(paging);

        if (pagedResult.hasContent()) {
            return pagedResult.getContent();
        } else {
            return new ArrayList<LandProperty>();
        }
    }

}
