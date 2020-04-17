package org.tsp.projects.ledar.landedproperties.resource;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.tsp.projects.ledar.landedproperties.model.LandProperty;
import org.tsp.projects.ledar.landedproperties.service.LandPropertyService;

import java.util.List;

@RestController
@RequestMapping("/api/landProperty")
public class LandPropertyResource {

    private final LandPropertyService service;

    @Autowired
    public LandPropertyResource(LandPropertyService landPropertyService) {
        this.service = landPropertyService;
    }

    @RequestMapping(value = "/fetchAllOccupations/{pageNo}/{pageSize}/{sortBy}", method = RequestMethod.GET)
    public ResponseEntity<List<LandProperty>> getAllEmployees(
            @PathVariable("pageNo") Integer pageNo,
            @PathVariable("pageSize") Integer pageSize,
            @PathVariable("sortBy") String sortBy) {
        List<LandProperty> list = service.getAllEmployees(pageNo, pageSize, sortBy);

        return new ResponseEntity<List<LandProperty>>(list, new HttpHeaders(), HttpStatus.OK);
    }

    @RequestMapping(value = "/fetchHello", method = RequestMethod.GET)
    public String fetchHelloWorld() {

        return "Hello People";
    }
}
