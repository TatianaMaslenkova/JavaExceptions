public class PhoneException extends Exception {
    String data;

    public PhoneException(String inputData) {
        this.data = inputData;
    }

    public String getMessage() {
        return "Неправильно указан номер телефона: '" + data + "'\n" +
                "Формат ввода номера телефона: 10 цифр без префикса, например: 9115550011\n";
    }
}