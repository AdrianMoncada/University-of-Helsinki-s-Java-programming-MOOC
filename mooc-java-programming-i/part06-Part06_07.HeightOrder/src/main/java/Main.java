
public class Main {

    public static void main(String[] args) {
Room r = new Room();
Person first = new Person("first", 1);

r.add(first);
System.out.println(r.isEmpty());

Person shortestPerson = r.take();
System.out.println(shortestPerson);
System.out.println(r.isEmpty());
        System.out.println(r.getPersons());
    }
}
