package classes;

public class Student {

        private String name;
        private int age;
        private String group;

        public String getName() {
                return name;
        }

        public int getAge() {
                return age;
        }

        public String getGroup() {
                return group;
        }

        @Override
        public boolean equals(Object object) {
                if (this == object) {
                        return true;
                }

                if (object == null) {
                        return false;
                }

                if (object instanceof Student) {
                        Student temp = (Student) object;
                        return this.name.equals(temp.getName()) && this.age == temp.getAge()
                                && this.group.equals(temp.getGroup());
                } else {
                        return false;
                }
        }

        @Override
        public int hashCode() {
                int prime = 31;
                return (int) (age * prime + ((name == null) ? 0 : name.hashCode()))
                        * prime + ((group == null) ? 0 : group.hashCode());
        }

}
