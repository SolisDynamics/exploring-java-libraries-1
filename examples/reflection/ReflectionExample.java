public class ReflectionExample {
    public static void main(String[] args) {
        Class<?> clazz = String.class;
        System.out.println("Class name: " + clazz.getName());
        System.out.println("Methods count: " + clazz.getMethods().length);
    }
}
