package cl.bennu.team.ms.controller;

import cl.bennu.common.ms.domain.Team;
import cl.bennu.core.business.SportResultBusiness;
import cl.bennu.team.ms.api.TeamApi;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@CrossOrigin
@RestController
public class TeamApiController implements TeamApi {

    @Override
    public List<Team> getAll() {
        return SportResultBusiness.getInstance().getTeamAll();
    }

    @Override
    public void delete(@PathVariable("id") String id) {
        SportResultBusiness.getInstance().deleteTeam(id);
    }

    @Override
    public Team getById(@PathVariable("id") String id) {
        return SportResultBusiness.getInstance().getTeamById(id);
    }

    @Override
    public Team update(@RequestBody Team team) {
        SportResultBusiness.getInstance().saveTeam(team);
        return team;
    }

    @Override
    public Team save(@RequestBody Team team, HttpServletRequest request) {
        SportResultBusiness.getInstance().saveTeam(team);
        return team;
    }

    @Override
    public List<Team> findTeamByUser(@PathVariable("id") String userId) {
        return SportResultBusiness.getInstance().findTeamByUser(userId);
    }


}
