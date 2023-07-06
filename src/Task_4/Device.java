package Task_4;

import java.util.Scanner;

public class Device {

    private static final int MIN_TEMPERATURE = -10;
    private static final int MAX_TEMPERATURE = 35;
    static Scanner scanner = new Scanner(System.in);

    public void startDevice() throws TemperatureRangeException {
        System.out.println("Enter the actual temperature of the device");
        int temperature = scanner.nextInt();
        checkTemperature(temperature);
    }

    public void checkTemperature(int temperature) throws TemperatureRangeException {
        if (temperature < MIN_TEMPERATURE || temperature > MAX_TEMPERATURE){
            throw new TemperatureRangeException("The temperature is out of the operating range of the device"
                    + "Operating range of the device :" + MIN_TEMPERATURE + " to " + MAX_TEMPERATURE);
        } else {
            System.out.println("Device started working!");
        }
    }


}
