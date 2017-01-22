package cl.bennu.user.ms.controller;

import cl.bennu.common.ms.domain.User;
import cl.bennu.core.business.SportResultBusiness;
import cl.bennu.user.ms.api.UserApi;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin
@RestController
public class UserApiController implements UserApi {

    @Override
    public List<User> getAll() {
        return SportResultBusiness.getInstance().getUserAll();
    }

    @Override
    public void delete(@PathVariable("id") String id) {
        SportResultBusiness.getInstance().deleteUser(id);
    }

    @Override
    public User getById(@PathVariable("id") String id) {
        return SportResultBusiness.getInstance().getUserById(id);
    }

    @Override
    public User update(@RequestBody User user) {
        SportResultBusiness.getInstance().saveUser(user);
        return user;
    }

    @Override
    public User save(@RequestBody User user) {
        SportResultBusiness.getInstance().saveUser(user);
        return user;
    }


}
