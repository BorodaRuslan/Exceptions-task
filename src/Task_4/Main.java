package Task_4;

public class Main {

    /*
      Завдання 4
       ------------
      1) Пристрій працює за температури від -10 включно до +35 включно.
      2) За допомогою кастомного виключення реалізуйте попередження про неможливість роботи пристрою
      за межами температурного спектра.
      3) Отримання значення фактичної температури,на момент роботи пристрою, реалізуйте через Scanner.
     */

    public static void main(String[] args) {
        Device device = new Device();
        try {
            device.startDevice();
        } catch (TemperatureRangeException e) {
            System.err.println(e.getMessage());
        }
    }
}
