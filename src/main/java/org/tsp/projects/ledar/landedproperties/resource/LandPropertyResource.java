package org.tsp.projects.ledar.landedproperties.resource;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.tsp.projects.ledar.landedproperties.builders.LandedPropertyBuilder;
import org.tsp.projects.ledar.landedproperties.model.LandProperty;
import org.tsp.projects.ledar.landedproperties.payload.response.LandedPropertyResponse;
import org.tsp.projects.ledar.landedproperties.service.LandPropertyService;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/landProperty")
public class LandPropertyResource {

    private final LandPropertyService landPropertyService;

    @Autowired
    public LandPropertyResource(LandPropertyService landPropertyService) {
        this.landPropertyService = landPropertyService;
    }

    @RequestMapping(value = "/fetchPagedProperties/{pageNo}/{pageSize}/{sortBy}", method = RequestMethod.GET)
    public ResponseEntity<List<LandedPropertyResponse>> fetchPagedProperties(
            @PathVariable("pageNo") Integer pageNo,
            @PathVariable("pageSize") Integer pageSize,
            @PathVariable("sortBy") String sortBy) {
        List<LandProperty> list = landPropertyService.fetchPageSortProperties(pageNo, pageSize, sortBy);
        List<LandedPropertyResponse> landedPropertyResponseList = new ArrayList<>();

        if (list != null && list.size() > 0) {
            landedPropertyResponseList = list.stream().map(landProperty -> LandedPropertyBuilder.buildLandPropertyData(landProperty, false)).collect(Collectors.toList());
        }

        return new ResponseEntity<>(landedPropertyResponseList, new HttpHeaders(), HttpStatus.OK);
    }

}
