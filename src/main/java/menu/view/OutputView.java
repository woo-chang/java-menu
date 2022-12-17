package menu.view;

public class OutputView {

    public void printServiceStart() {
        System.out.println(Message.SERVICE_START.getMessage());
    }

    public static void printErrorMessage(String message) {
        System.out.println(String.format(Message.ERROR.getMessage(), message));
    }
}
