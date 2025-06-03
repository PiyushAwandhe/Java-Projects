package in.piyush.equals;

public class person {
    private String name;
    private int age;
    private String id;


    //Constructor

    public person(String name, int age, String id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }

    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof person)){
            return false;

        }else {
            person person = (person) obj;
            return person.name.equals(name) &&
                    person.age == age &&
                    person.id.equals(id);
        }
    }

    //Getter and Setter
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

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }


    //toString
    @Override
    public String toString() {
        return "person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", id='" + id + '\'' +
                '}';
    }
}
