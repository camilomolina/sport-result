package cl.bennu.common.ms.domain;

import cl.bennu.common.ms.domain.base.BaseDomain;

public class User extends BaseDomain {

    private String name;
    private String position;
    private String alias;
    private Long nummer;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public Long getNummer() {
        return nummer;
    }

    public void setNummer(Long nummer) {
        this.nummer = nummer;
    }
}
