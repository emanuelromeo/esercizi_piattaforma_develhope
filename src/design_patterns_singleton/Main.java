package design_patterns_singleton;

public class Main {
    public static void main(String[] args) {
        User user = User.getInstance();
        System.out.println(user);

        user.setNome("Mario");
        user.setEta(23);

        User newUser = User.getInstance();
        System.out.println(newUser);
    }
}
