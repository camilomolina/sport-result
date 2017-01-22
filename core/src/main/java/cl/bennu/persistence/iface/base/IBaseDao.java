package cl.bennu.persistence.iface.base;


import cl.bennu.common.ms.domain.base.BaseDomain;

import java.util.List;

public interface IBaseDao<T extends BaseDomain> {

    List<T> getAll();

    T getById(String id);

    T getByName(String name);

    void save(T user);

    void delete(String id);

    List<T> find(T type);
}
