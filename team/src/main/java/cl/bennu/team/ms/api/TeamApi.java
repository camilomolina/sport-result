package cl.bennu.team.ms.api;

import cl.bennu.common.ms.domain.Team;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RequestMapping("/api/sport-result/teams")
public interface TeamApi {

    @ResponseBody
    @RequestMapping(produces = MediaType.APPLICATION_JSON_VALUE, method = RequestMethod.GET)
    List<Team> getAll();

    @RequestMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE, method = RequestMethod.DELETE)
    void delete(@PathVariable("id") String id);

    @ResponseBody
    @RequestMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE, method = RequestMethod.GET)
    Team getById(@PathVariable("id") String id);

    @ResponseBody
    @RequestMapping(produces = MediaType.APPLICATION_JSON_VALUE, method = RequestMethod.PUT)
    Team update(@RequestBody Team team);

    @ResponseBody
    @RequestMapping(produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE, method = RequestMethod.POST)
    Team save(@RequestBody Team team, HttpServletRequest request);

    @ResponseBody
    @RequestMapping(value = "/find/{id}", produces = MediaType.APPLICATION_JSON_VALUE, method = RequestMethod.GET)
    List<Team> findTeamByUser(@PathVariable("id") String userId);

}