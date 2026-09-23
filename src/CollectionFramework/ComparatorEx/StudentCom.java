package CollectionFramework.ComparatorEx;

import CollectionFramework.ComparableEx.Students;

public class StudentCom {

        public int age;
        public String name;
        public int weight;

        public StudentCom(int age, String name, int weight) {
            this.age = age;
            this.name = name;
            this.weight = weight;
        }

        public int getAge() {
            return age;
        }

        public String getName() {
            return name;
        }

        public int getWeight() {
            return weight;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setWeight(int weight) {
            this.weight = weight;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "age: " + age +
                    ", name: '" + name + '\'' +
                    ", weight: " + weight +
                    '}';
        }

}
