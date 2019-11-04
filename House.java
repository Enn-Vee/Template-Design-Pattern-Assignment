/**
 * Abstract class House which contains all the methods for making a house. Class is abstract so createFrame() can be completed by its children.
 * @author Nick Bautista
 *
 */
public abstract class House {
	/**
	 * Calls all the methods needed to build a house at once when called.
	 */
	public void buildHouse() {
		this.prepFoundation();
		this.createFrame();
		this.installDrywall();
		this.addWindows();
		this.addElectrical();
		this.addPlumbing();
	}
	
	/**
	 * Prints foundation preparation message.
	 */
	public void prepFoundation() {
		System.out.println("Foundation: Adding a crawlspace, and a strong backbone.");
	}
	
	/**
	 * Prints frame creation message.
	 */
	public void createFrame() {
		System.out.print("Framing: Adding the ");
	}
	
	/**
	 * Prints drywall installation message.
	 */
	public void installDrywall() {
		System.out.println("Drywall: Creating the interior walls.");
	}
	
	
	/**
	 * Prints window installation message.
	 */
	public void addWindows() {
		System.out.println("Windows: Putting in the glass for the windows.");
	}
	
	/**
	 * Prints electrical installation message.
	 */
	
	public void addElectrical() {
		System.out.println("Electrical: Running all the wires and hooking up the power.");
	}
	
	/**
	 * Prints plumbing message.
	 */
	
	public void addPlumbing() {
		System.out.println("Plumbing: Letting water run throug the house.");
	}
}
