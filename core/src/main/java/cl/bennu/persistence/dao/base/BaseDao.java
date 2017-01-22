package cl.bennu.persistence.dao.base;

import cl.bennu.common.ms.domain.base.BaseDomain;
import cl.bennu.persistence.iface.base.IBaseDao;

import java.lang.reflect.ParameterizedType;
import java.util.ArrayList;
import java.util.List;

public abstract class BaseDao<T extends BaseDomain> implements IBaseDao<T> {


    private Class<T> domainClazz;
    private Class<?> daoClazz;

    public BaseDao() {
        this.domainClazz = (Class<T>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
        daoClazz = this.getClass();

    }


    @Override
    public List<T> getAll() {
        List<T> result = new ArrayList<>();

        return result;
    }

    @Override
    public T getById(String id) {

        return null;
    }

    @Override
    public T getByName(String name) {

        return null;
    }

    @Override
    public void save(T type) {
        if (type.getId() == null) {

        } else {

        }
    }

    @Override
    public void delete(String id) {

    }

    @Override
    public List<T> find(T type) {
        List<T> result = new ArrayList<>();


        return result;
    }
}
