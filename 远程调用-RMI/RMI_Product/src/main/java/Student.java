import java.io.Serializable;

/**
 * @author likai
 * @date 2019/1/31 17:12
 * 对象
 */
public class Student implements Serializable {
    private static final long serialVersionUID = 1L;
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
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

    public void setAge(int age) {
        this.age = age;
    }
}