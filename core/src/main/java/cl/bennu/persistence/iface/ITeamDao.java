package cl.bennu.persistence.iface;

import cl.bennu.common.ms.domain.Team;
import cl.bennu.persistence.iface.base.IBaseDao;

import java.util.List;

public interface ITeamDao extends IBaseDao<Team> {

    List<Team> findByUser(String userId);

}
