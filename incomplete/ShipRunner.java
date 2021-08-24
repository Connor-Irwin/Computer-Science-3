package incomplete;//interface example for Ship

import static java.lang.System.*;

public class ShipRunner {
	public static void main(String[] args) {
        Ship it = new Ship();
		out.println(it);

		it = new Ship(5, 8);
		out.println(it);
  }
}