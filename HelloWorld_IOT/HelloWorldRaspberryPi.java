import com.pi4j.io.gpio.GpioController;
import com.pi4j.io.gpio.GpioFactory;
import com.pi4j.io.gpio.GpioPinDigitalOutput;
import com.pi4j.io.gpio.PinState;
import com.pi4j.io.gpio.RaspiPin;

public class HelloWorldRaspberryPi {

	public static void main(String[] args) throws InterruptedException {

		final GpioController gpio = GpioFactory.getInstance();
		final GpioPinDigitalOutput pin = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_01, "PinLED", PinState.LOW);
		final int SHORT_INTERVAL = 200;
		final int LONG_INTERVAL = SHORT_INTERVAL * 3;
		final int LETTER_INTERVAL = SHORT_INTERVAL * 7;

		while (true) {
			// H
			pin.high();
			Thread.sleep(SHORT_INTERVAL);
			pin.low();
			Thread.sleep(SHORT_INTERVAL);
			pin.high();
			Thread.sleep(SHORT_INTERVAL);
			pin.low();
			Thread.sleep(SHORT_INTERVAL);
			pin.high();
			Thread.sleep(SHORT_INTERVAL);
			pin.low();
			Thread.sleep(SHORT_INTERVAL);
			pin.high();
			Thread.sleep(SHORT_INTERVAL);
			pin.low();
			Thread.sleep(LETTER_INTERVAL);

			// e
			pin.high();
			Thread.sleep(SHORT_INTERVAL);
			pin.low();
			Thread.sleep(LETTER_INTERVAL);

			// l
			pin.high();
			Thread.sleep(SHORT_INTERVAL);
			pin.low();
			Thread.sleep(SHORT_INTERVAL);

			pin.high();
			Thread.sleep(LONG_INTERVAL);
			pin.low();
			Thread.sleep(SHORT_INTERVAL);

			pin.high();
			Thread.sleep(SHORT_INTERVAL);
			pin.low();
			Thread.sleep(SHORT_INTERVAL);
			pin.high();
			Thread.sleep(SHORT_INTERVAL);
			pin.low();
			Thread.sleep(LONG_INTERVAL);

			// l
			pin.high();
			Thread.sleep(SHORT_INTERVAL);
			pin.low();
			Thread.sleep(SHORT_INTERVAL);

			pin.high();
			Thread.sleep(LONG_INTERVAL);
			pin.low();
			Thread.sleep(SHORT_INTERVAL);

			pin.high();
			Thread.sleep(SHORT_INTERVAL);
			pin.low();
			Thread.sleep(SHORT_INTERVAL);
			pin.high();
			Thread.sleep(SHORT_INTERVAL);
			pin.low();
			Thread.sleep(LONG_INTERVAL);
		}
	}
}
