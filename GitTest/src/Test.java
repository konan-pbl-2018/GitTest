import javax.swing.JFrame;

public class Test {

	public static void main(String[] args) {
		int x = 0, y = 0;
		for (int i = 0; i < 100; i++) {
			JFrame f = new JFrame();
			f.setSize(300, 300);
			f.setVisible(true);
			f.setLocation(x, y);
			x += 2;
			y += 2;
		}
	}

}
