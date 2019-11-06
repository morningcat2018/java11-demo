package morning.module_a.entity;

import java.io.Serializable;

/**
 * @describe: 类描述信息
 * @author: morningcat.zhang
 * @date: 2019/11/6 5:54 PM
 */
public class User implements Serializable {

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
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
