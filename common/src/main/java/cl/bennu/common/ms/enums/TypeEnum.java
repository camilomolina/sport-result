package cl.bennu.common.ms.enums;

public enum TypeEnum {

    _1(1L, "1")
    , _2(2L, "2");

    private Long id;
    private String name;


    TypeEnum(Long id, String name) {
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
