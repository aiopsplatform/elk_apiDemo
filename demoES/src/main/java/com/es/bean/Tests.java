package com.es.bean;

/**
 * @Title:
 * @Description:
 * @Author: 凌晨
 * @Date: 2019/3/22 15:06
 */
public class Tests {
    private Long id;

    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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
        return "Tests [id=" + id + ", name=" + name + "]";
    }

}
