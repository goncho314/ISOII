package Presentation;

import java.awt.EventQueue;

import javax.swing.JFrame;

import java.awt.GridBagLayout;
import javax.swing.JButton;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class IU_Radar {

	private JFrame frame;
	private JButton btnEncenderRadar;
	
	private static Domain.Radar r;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					IU_Radar window = new IU_Radar();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public IU_Radar() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 400, 465);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{387, 0};
		gridBagLayout.rowHeights = new int[]{78, 80, 80, 80, 80, 0};
		gridBagLayout.columnWeights = new double[]{0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		frame.getContentPane().setLayout(gridBagLayout);
		{
			btnEncenderRadar = new JButton("Encender Radar");
			btnEncenderRadar.addActionListener(new BtnEncenderRadarActionListener());
			btnEncenderRadar.setFont(new Font("Tahoma", Font.PLAIN, 32));
			GridBagConstraints gbc_btnEncenderRadar = new GridBagConstraints();
			gbc_btnEncenderRadar.fill = GridBagConstraints.BOTH;
			gbc_btnEncenderRadar.insets = new Insets(0, 0, 5, 0);
			gbc_btnEncenderRadar.gridx = 0;
			gbc_btnEncenderRadar.gridy = 0;
			frame.getContentPane().add(btnEncenderRadar, gbc_btnEncenderRadar);
		}
	}

	private class BtnEncenderRadarActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			encenderRadar();
			btnEncenderRadar.setEnabled(false);
		}
	}
	
	public void encenderRadar(){
		r = new Domain.Radar("CM-42_km25",120);
	}
}
