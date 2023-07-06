package Practice;
class A {

    private int id;
    private String name;
    private int age;

 

    void setId(int id) {
        this.id = id;
    }

 

    int getId() {
        return id;
    }

 

    void setName(String name) {
        this.name = name;
    }

 

    String getName() {
        return name;
    }

 

    void setAge(int age) {
        this.age = age;
    }

 

    int getAge() {
        return age;
    }
}

 

class Demo28 {

    public static void main(String[] args) {

        A a = new A();

 

        a.setId(10);
        System.out.println(a.getId());

 

        a.setName("Mohan");
        System.out.println(a.getName());

 

        a.setAge(23);
        System.out.println(a.getAge());
    }
}