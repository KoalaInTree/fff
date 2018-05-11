package Default;

public class User {
    private String name;
    private Integer age;
    private Long birthday;
    public Integer id;

    public User() {
    }

    public int getId() {
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

    public int getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Long getBirthday() {
        return birthday;
    }

    public void setBirthday(Long birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "Default.User{" +
            "name='" + name + '\'' +
            ", age=" + age +
            ", birthday=" + birthday +
            ", id=" + id +
            '}';
    }
}
