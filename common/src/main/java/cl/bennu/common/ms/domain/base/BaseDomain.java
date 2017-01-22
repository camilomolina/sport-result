package cl.bennu.common.ms.domain.base;

import javax.persistence.Id;

public class BaseDomain {

    @Id
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
