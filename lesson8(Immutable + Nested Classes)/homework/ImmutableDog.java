package classes;

public final class ImmutableDog {

        private final String name;
        private final int age;
        private final StringBuffer owner;
        private final Id id;

        public ImmutableDog(String name, int age, StringBuffer owner, Id id) {
                this.name = name;
                this.age = age;
                StringBuffer cloneBuffer = new StringBuffer(owner);
                this.owner = cloneBuffer;
                Id cloneId = new Id();
                cloneId.setId(id.getId());
                this.id = cloneId;
        }

        public String getName() {
                return name;
        }

        public int getAge() {
                return age;
        }

        public StringBuffer getOwner() {
                StringBuffer buffer = new StringBuffer(owner);

                return owner;
        }

        public Id getId() {
                Id cloneId = new Id();
                cloneId.setId(id.getId());
                return cloneId;
        }

}
