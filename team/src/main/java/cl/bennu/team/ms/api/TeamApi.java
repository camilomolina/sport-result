package cl.bennu.team.ms.api;

import cl.bennu.common.ms.domain.Team;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

public interface TeamApi {

    String BASE_URI = "/teams";

    @RequestMapping(value = BASE_URI, produces = MediaType.APPLICATION_JSON_VALUE, method = RequestMethod.GET)
    ResponseEntity<List<Team>> getAll();

    @RequestMapping(value = BASE_URI + "/{id}", produces = MediaType.APPLICATION_JSON_VALUE, method = RequestMethod.DELETE)
    void delete(@PathVariable("id") String id);

    @RequestMapping(value = BASE_URI + "/{id}", produces = MediaType.APPLICATION_JSON_VALUE, method = RequestMethod.GET)
    ResponseEntity<Team> getById(@PathVariable("id") String id);

    @RequestMapping(value = BASE_URI, produces = MediaType.APPLICATION_JSON_VALUE, method = RequestMethod.PUT)
    ResponseEntity<Team> update(@RequestBody Team team);

    @RequestMapping(value = BASE_URI, produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE, method = RequestMethod.POST)
    ResponseEntity<Team> save(@RequestBody Team team, HttpServletRequest request);

}