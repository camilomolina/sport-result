package cl.bennu.common.ms.domain;

import cl.bennu.common.ms.domain.base.BaseDomain;

public class Team extends BaseDomain {

    private String name;
    private byte[] image;
    private String userId;

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
