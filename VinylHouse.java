/**
 * Completes createFrame() message.
 * @author Nick Bautista
 *
 */
public class VinylHouse extends House {
	/**
	 * Calls createFrame() from House then adds to it.
	 */
	public void createFrame() {
		super.createFrame();
		System.out.println("vinyl walls.");
	}
}
