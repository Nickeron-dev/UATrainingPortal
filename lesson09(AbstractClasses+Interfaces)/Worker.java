package classes;

public class Worker {

        private String name;
        private int age;
        private String level;

        public Worker() {
                super();
        }

        public Worker(String name, int age, String level) {
                this.name = name;
                this.age = age;
                this.level = level;
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

        public String getLevel() {
                return level;
        }

        public void setLevel(String level) {
                this.level = level;
        }

        @Override
        public String toString() {
                return "Name: " + name + " age: " + age + " level:" + level;
        }

        @Override
        public boolean equals(Object obj) {
                if (this == obj) {
                        return true;
                }

                if (obj == null) {
                        return false;
                }

                if (obj instanceof Worker) {
                        Worker temp = (Worker) obj;
                        return this.name.equals(temp.getName()) && this.age == temp.getAge()
                                && this.level.equals(temp.getLevel());
                } else {
                        return false;
                }
        }

        @Override
        public int hashCode() {
                int prime = 31;
                return (((name == null) ? 0 : name.hashCode()) * prime + age)
                        * prime + ((level == null) ? 0 : level.hashCode());
        }

}
