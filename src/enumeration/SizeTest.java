package enumeration;

public class SizeTest {

	public static void main(String[] args) {
		PantChart pantChart = new PantChart(Size.small);
		pantChart.findMyPant();
		PantChart pantChart1 = new PantChart(Size.medium);
		pantChart1.findMyPant();
		PantChart pantChart2 = new PantChart(Size.large);
		pantChart2.findMyPant();
		PantChart pantChart3 = new PantChart(Size.large);
		pantChart3.findMyPant();
		

	}

}
