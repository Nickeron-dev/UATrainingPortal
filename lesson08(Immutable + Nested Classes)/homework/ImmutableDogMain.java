package classes;

/**
 * Immutable dog object
 * @author Illia Koshkin
*/
public class ImmutableDogMain {

        /**
         * This method is for testing my ImmutableDog class
         * @param args is for possible input
        */
        public static void main(String... args) {
                String name = "Sharik";
                int age = 5;
                Id id = new Id();
                id.setId(1342);
                StringBuffer owner = new StringBuffer("Michael");
                ImmutableDog dog = new ImmutableDog(name, age, owner, id);

                // tring to change all fields
                System.out.println("Was name: " + dog.getName());
                name += "ChangedName";
                System.out.println("Name after: " + dog.getName());

                System.out.println("Was age: " + dog.getAge());
                age += 2;
                System.out.println("Age after: " + dog.getAge());

                System.out.println("Was owner: " + dog.getOwner());
                owner.append("Hello");
                System.out.println("Owner after: " + dog.getOwner());

                System.out.println("Was id: " + dog.getId().getId());
                id.setId(1);
                System.out.println("id after: " + dog.getId().getId());


        }

}
