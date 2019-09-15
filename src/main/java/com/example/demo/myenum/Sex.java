package com.example.demo.myenum;

public enum Sex {
    Male(1,"男"),FeMale(2,"女");

    private Integer id;
    private String name;

    Sex(Integer id,String name){
        this.id=id;
        this.name=name;
    }

    public static Sex getSexById(Integer id){
        for(Sex sex:Sex.values()){
            if(sex.getId().equals(id)){
                return sex;
            }
        }

        return null;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return this.getName();
    }
}
