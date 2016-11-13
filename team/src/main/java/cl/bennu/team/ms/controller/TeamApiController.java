package cl.bennu.team.ms.controller;

import cl.bennu.common.ms.domain.Team;
import cl.bennu.core.business.SportResultBusiness;
import cl.bennu.team.ms.api.TeamApi;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@CrossOrigin
@Controller
public class TeamApiController implements TeamApi {

    @Override
    public ResponseEntity<List<Team>> getAll() {
        List<Team> teamList = SportResultBusiness.getInstance().getTeamAll();
        return new ResponseEntity<>(teamList, HttpStatus.OK);
    }

    @Override
    public void delete(@PathVariable("id") String id) {
        SportResultBusiness.getInstance().deleteTeam(id);
    }

    @Override
    public ResponseEntity<Team> getById(@PathVariable("id") String id) {
        Team team = SportResultBusiness.getInstance().getTeamById(id);
        return new ResponseEntity<>(team, HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Team> update(@RequestBody Team team) {
        SportResultBusiness.getInstance().saveTeam(team);
        return new ResponseEntity<>(team, HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Team> save(@RequestBody Team team, HttpServletRequest request) {
        SportResultBusiness.getInstance().saveTeam(team);
        return new ResponseEntity<>(team, HttpStatus.OK);
    }

}
