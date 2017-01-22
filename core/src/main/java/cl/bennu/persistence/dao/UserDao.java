package cl.bennu.persistence.dao;

import cl.bennu.common.ms.domain.User;
import cl.bennu.persistence.dao.base.BaseDao;
import cl.bennu.persistence.iface.IUserDao;

public class UserDao extends BaseDao<User> implements IUserDao {

    @Override
    public User getByEMail(String email) {

        return null;
    }


}
