package _01_double._2_test_scores;

import javax.swing.JOptionPane;

public class testscores {
public static void main(String[] args) {
	String score = JOptionPane.showInputDialog("what score did you get on your test?");
	double scorenum = Double.parseDouble(score);
	if (scorenum>90) {
		JOptionPane.showMessageDialog(null, "good job!");
	}
	else if (scorenum<90 && scorenum>80) {
		JOptionPane.showMessageDialog(null, "you did allright.");;
	}
	else if (scorenum<80) {
		JOptionPane.showMessageDialog(null, "you had a bit of trouble. better luck next time.");
	}


}
}
