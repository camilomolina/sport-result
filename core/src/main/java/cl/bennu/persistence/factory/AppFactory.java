package cl.bennu.persistence.factory;

import cl.bennu.persistence.dao.CompetitiveDao;
import cl.bennu.persistence.dao.TeamDao;
import cl.bennu.persistence.dao.UserDao;
import cl.bennu.persistence.iface.ICompetitiveDao;
import cl.bennu.persistence.iface.ITeamDao;
import cl.bennu.persistence.iface.IUserDao;

public class AppFactory {

    public static IUserDao getUserDao() {
        return new UserDao();
    }

    public static ITeamDao getTeamDao() {
        return new TeamDao();
    }

    public static ICompetitiveDao getCompetitiveDao() {
        return new CompetitiveDao();
    }

}
