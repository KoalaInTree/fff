package Default;

import java.util.Date;

public class Person {
    private String name;
    private int age;
    private Date birthday;

    public static class Builder{
        private String name;
        private int age;
        private Date birthday;
        public  Builder name(String name){
            this.name = name;
            return this;
        }

        public Builder age(int age){
            this.age = age;
            return this;
        }

        public Builder birthday(Date birthday){
            this.birthday = birthday;
            return this;
        }

        public Person build(){
            return new Person(this);
        }
    }

    private Person(Builder builder){
        this.name = builder.name;
        this.age = builder.age;
        this.birthday = builder.birthday;
    }



    public static void main(String[] args) {
        Person person = new Person.Builder().name("aa").age(1).birthday(new Date()).build();
    }
}
