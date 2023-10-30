public class Main {
    public static void main(String[] args) {
        UserInterface<View> myapp = new UserInterface<>(new DataView());
        myapp.start();
    }
}