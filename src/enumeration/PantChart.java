package enumeration;

public class PantChart {
	Size chart;
	

	PantChart() {

	}

	public PantChart(Size chart) {
		super();
		this.chart = chart;
	}

	void findMyPant() {
		switch (chart) {
		case small:
			System.out.println("Small pant is selected");
			break;

		case medium:
			System.out.println("Medium pant is selected");
			break;

		case large:
			System.out.println("Large pant is selected");
			break;

		default:
			System.out.println("Sorry. we are out of stocks");
			break;

		}
	}

}
