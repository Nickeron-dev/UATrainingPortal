package classes;

/**
 * this is extra class with overridden equals() and hashCode()
 * @author Illia Koshkin
*/
public class CarEqualsHashCode {

        private int id;
        private String owner;
        private String model;

        public CarEqualsHashCode(int id, String owner, String model) {
                this.id = id;
                this.owner = owner;
                this.model = model;
        }

        public int getId() {
                return id;
        }

        public String getOwner() {
                return owner;
        }

        public String getModel() {
                return model;
        }

        @Override
        public boolean equals(Object object) {
                if (this == object) {
                        return true;
                }

                if (object == null) {
                        return false;
                }

                if (object instanceof CarEqualsHashCode) {
                        CarEqualsHashCode temp = (CarEqualsHashCode) object;
                        return id == temp.getId() && owner.equals(temp.getOwner())
                                && model.equals(temp.getModel());
                } else {
                        return false;
                }
        }

        @Override
        public int hashCode() {
                int prime = 31;
                return (int) (id * prime + ((owner == null) ? 0 : owner.hashCode()))
                        * prime + ((model == null) ? 0 : model.hashCode());
        }

}
