public class NameException extends Exception {
    
    String data;

    public NameException(String inputData) {
        this.data = inputData;
    }

    public String getMessage() {
        return "Неправильный формат ФИО '" + data + "'.\n" +
                "Допустимые символы: буквы и дефис (для двойных фамилий)!";
    }
}