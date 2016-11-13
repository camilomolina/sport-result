package cl.bennu.core.business;

import cl.bennu.common.ms.domain.Competitive;
import cl.bennu.common.ms.domain.Team;
import cl.bennu.common.ms.domain.User;
import cl.bennu.persistence.factory.AppFactory;
import cl.bennu.persistence.iface.ICompetitiveDao;
import cl.bennu.persistence.iface.ITeamDao;
import cl.bennu.persistence.iface.IUserDao;

import java.util.List;

public class SportResultBusiness {

    private static SportResultBusiness ourInstance = new SportResultBusiness();

    public static SportResultBusiness getInstance() {
        return ourInstance;
    }

    private SportResultBusiness() {
    }


    // metodos de usuario
    public List<User> getUserAll() {
        IUserDao userDao = AppFactory.getUserDao();
        return userDao.getAll();
    }

    public void saveUser(User user) {
        IUserDao userDao = AppFactory.getUserDao();
        userDao.save(user);
    }

    public void deleteUser(String id) {
        IUserDao userDao = AppFactory.getUserDao();
        userDao.delete(id);
    }

    public User getUserById(String id) {
        IUserDao userDao = AppFactory.getUserDao();
        return userDao.getById(id);
    }

    public User getUserByName(String name) {
        IUserDao userDao = AppFactory.getUserDao();
        return userDao.getByName(name);
    }

    public List<User> findUser(User user) {
        IUserDao userDao = AppFactory.getUserDao();
        return userDao.find(user);
    }


    // metodos del team
    public List<Team> getTeamAll() {
        ITeamDao teamDao = AppFactory.getTeamDao();
        return teamDao.getAll();
    }

    public void saveTeam(Team user) {
        ITeamDao teamDao = AppFactory.getTeamDao();
        teamDao.save(user);
    }

    public void deleteTeam(String id) {
        ITeamDao teamDao = AppFactory.getTeamDao();
        teamDao.delete(id);
    }

    public Team getTeamById(String id) {
        ITeamDao teamDao = AppFactory.getTeamDao();
        return teamDao.getById(id);
    }

    public Team getTeamByName(String name) {
        ITeamDao teamDao = AppFactory.getTeamDao();
        return teamDao.getByName(name);
    }

    public List<Team> findTeam(Team team) {
        ITeamDao teamDao = AppFactory.getTeamDao();
        return teamDao.find(team);
    }



    // metodos de la competicion
    public List<Competitive> getCompetitiveAll() {
        ICompetitiveDao competitiveDao = AppFactory.getCompetitiveDao();
        return competitiveDao.getAll();
    }

    public void saveCompetitive(Competitive user) {
        ICompetitiveDao competitiveDao = AppFactory.getCompetitiveDao();
        competitiveDao.save(user);
    }

    public void deleteCompetitive(String id) {
        ICompetitiveDao competitiveDao = AppFactory.getCompetitiveDao();
        competitiveDao.delete(id);
    }

    public Competitive getCompetitiveById(String id) {
        ICompetitiveDao competitiveDao = AppFactory.getCompetitiveDao();
        return competitiveDao.getById(id);
    }

    public Competitive getCompetitiveByName(String name) {
        ICompetitiveDao competitiveDao = AppFactory.getCompetitiveDao();
        return competitiveDao.getByName(name);
    }

    public List<Competitive> findCompetitive(Competitive competitive) {
        ICompetitiveDao competitiveDao = AppFactory.getCompetitiveDao();
        return competitiveDao.find(competitive);
    }
}

