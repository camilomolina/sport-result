package cl.bennu.persistence.dao;

import cl.bennu.common.ms.domain.Team;
import cl.bennu.persistence.dao.base.BaseDao;
import cl.bennu.persistence.iface.ITeamDao;

import java.util.List;

public class TeamDao extends BaseDao<Team> implements ITeamDao {

    @Override
    public List<Team> findByUser(String userId) {

        return null;
    }

}
