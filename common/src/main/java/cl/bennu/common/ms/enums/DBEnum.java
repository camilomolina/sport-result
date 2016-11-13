package cl.bennu.common.ms.enums;

public enum DBEnum {

    MONGO_LABS(1L, "mondodb-labs")
    , SPORT_RESULT(2L, "sport-result");

    private Long id;
    private String name;


    DBEnum(Long id, String name) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public Long getId() {
        return id;
    }

}
