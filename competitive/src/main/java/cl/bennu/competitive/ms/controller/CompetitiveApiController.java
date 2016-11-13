package cl.bennu.competitive.ms.controller;

import cl.bennu.common.ms.domain.Competitive;
import cl.bennu.competitive.ms.api.CompetitiveApi;
import cl.bennu.core.business.SportResultBusiness;
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
public class CompetitiveApiController implements CompetitiveApi {

    @Override
    public ResponseEntity<List<Competitive>> getAll() {
        List<Competitive> competitiveList = SportResultBusiness.getInstance().getCompetitiveAll();
        return new ResponseEntity<>(competitiveList, HttpStatus.OK);
    }

    @Override
    public void delete(@PathVariable("id") String id) {
        SportResultBusiness.getInstance().deleteCompetitive(id);
    }

    @Override
    public ResponseEntity<Competitive> getById(@PathVariable("id") String id) {
        Competitive competitive = SportResultBusiness.getInstance().getCompetitiveById(id);
        return new ResponseEntity<>(competitive, HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Competitive> update(@RequestBody Competitive competitive) {
        SportResultBusiness.getInstance().saveCompetitive(competitive);
        return new ResponseEntity<>(competitive, HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Competitive> save(@RequestBody Competitive competitive, HttpServletRequest request) {
        SportResultBusiness.getInstance().saveCompetitive(competitive);
        return new ResponseEntity<>(competitive, HttpStatus.OK);
    }

}
