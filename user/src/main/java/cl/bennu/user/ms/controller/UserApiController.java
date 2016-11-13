package cl.bennu.user.ms.controller;

import cl.bennu.common.ms.domain.User;
import cl.bennu.core.business.SportResultBusiness;
import cl.bennu.user.ms.api.UserApi;
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
public class UserApiController implements UserApi {

    @Override
    public ResponseEntity<List<User>> getAll() {
        List<User> userList = SportResultBusiness.getInstance().getUserAll();
        return new ResponseEntity<>(userList, HttpStatus.OK);
    }

    @Override
    public void delete(@PathVariable("id") String id) {
        SportResultBusiness.getInstance().deleteUser(id);
    }

    @Override
    public ResponseEntity<User> getById(@PathVariable("id") String id) {
        User user = SportResultBusiness.getInstance().getUserById(id);
        return new ResponseEntity<>(user, HttpStatus.OK);
    }

    @Override
    public ResponseEntity<User> update(@RequestBody User user) {
        SportResultBusiness.getInstance().saveUser(user);
        return new ResponseEntity<>(user, HttpStatus.OK);
    }

    @Override
    public ResponseEntity<User> save(@RequestBody User user, HttpServletRequest request) {
        SportResultBusiness.getInstance().saveUser(user);
        return new ResponseEntity<>(user, HttpStatus.OK);
    }

}
