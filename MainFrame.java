import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class MainFrame extends JFrame {
	
	private static final String FRAME_TITLE = "Environmental Friendliness Helper";
	private static final String TITLE_TEXT = "Whats your Environmental Friendliness Score?";
	private static final String PRIMARY_FONT = Font.SANS_SERIF;
	private static final int FRAME_X = 1800;
	private static final int FRAME_Y = 800;
	
	private JLabel titleLabel;
	
	public MainFrame() {
		//initializing the instantiated MainFrame and other components
		initFrame();
		initTitleLabel();
		//adding necessary components
		add(titleLabel, BorderLayout.NORTH);
	}
	
	private void initTitleLabel() {
		titleLabel = new JLabel();
		titleLabel.setText(TITLE_TEXT);
		titleLabel.setFont(new Font(PRIMARY_FONT, Font.PLAIN, 20));
		titleLabel.setHorizontalTextPosition(JLabel.CENTER);
		titleLabel.setPreferredSize(new Dimension(200, 50));
		titleLabel.setHorizontalAlignment(SwingConstants.CENTER);
	}
	private void initFrame() {
		setSize(FRAME_X, FRAME_Y);
		setTitle(FRAME_TITLE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setLocationRelativeTo(null);
		getContentPane().setBackground(new Color(185, 242, 0));
		setVisible(true);
	}
}
