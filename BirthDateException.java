public class BirthDateException extends Exception {

    String data;

    public BirthDateException(String inputData) {
        this.data = inputData;
    }
    
    public String getMessage() {
        return "Неверный формат даты рождения: '" + data + "'.\n" +
            "Формат ввода даты рождения: 'ДД.ММ.ГГГГ'.";
    }
}