package Presentation;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import Domain.Manager;
import Domain.Vehicle;

import java.awt.GridBagLayout;
import javax.swing.JButton;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.util.Random;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;
import javax.swing.JLabel;

public class IU_Radar {

	private JFrame frame;
	private JButton btnEncenderRadar;
	
	private static Domain.Radar r;
	private JButton btnApagarRadar;
	private JButton btnSancionar;
	private JPanel panel;
	private JLabel lblEstado;

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
		frame.setBounds(100, 100, 400, 499);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{387, 0};
		gridBagLayout.rowHeights = new int[]{78, 80, 80, 80, 80, 43, 0};
		gridBagLayout.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		frame.getContentPane().setLayout(gridBagLayout);
		{
			btnEncenderRadar = new JButton("Encender Radar");
			btnEncenderRadar.addActionListener(new BtnEncenderRadarActionListener());
			btnEncenderRadar.setFont(new Font("Tahoma", Font.PLAIN, 40));
			GridBagConstraints gbc_btnEncenderRadar = new GridBagConstraints();
			gbc_btnEncenderRadar.fill = GridBagConstraints.BOTH;
			gbc_btnEncenderRadar.insets = new Insets(0, 0, 5, 0);
			gbc_btnEncenderRadar.gridx = 0;
			gbc_btnEncenderRadar.gridy = 0;
			frame.getContentPane().add(btnEncenderRadar, gbc_btnEncenderRadar);
		}
		{
			btnApagarRadar = new JButton("Apagar Radar");
			btnApagarRadar.addActionListener(new BtnApagarRadarActionListener());
			btnApagarRadar.setEnabled(false);
			btnApagarRadar.setFont(new Font("Tahoma", Font.PLAIN, 40));
			GridBagConstraints gbc_btnApagarRadar = new GridBagConstraints();
			gbc_btnApagarRadar.fill = GridBagConstraints.BOTH;
			gbc_btnApagarRadar.insets = new Insets(0, 0, 5, 0);
			gbc_btnApagarRadar.gridx = 0;
			gbc_btnApagarRadar.gridy = 1;
			frame.getContentPane().add(btnApagarRadar, gbc_btnApagarRadar);
		}
		{
			btnSancionar = new JButton("Sancionar");
			btnSancionar.addActionListener(new BtnSancionarActionListener());
			btnSancionar.setFont(new Font("Tahoma", Font.PLAIN, 40));
			GridBagConstraints gbc_btnSancionar = new GridBagConstraints();
			gbc_btnSancionar.fill = GridBagConstraints.BOTH;
			gbc_btnSancionar.insets = new Insets(0, 0, 5, 0);
			gbc_btnSancionar.gridx = 0;
			gbc_btnSancionar.gridy = 2;
			frame.getContentPane().add(btnSancionar, gbc_btnSancionar);
		}
		{
			panel = new JPanel();
			GridBagConstraints gbc_panel = new GridBagConstraints();
			gbc_panel.anchor = GridBagConstraints.WEST;
			gbc_panel.fill = GridBagConstraints.VERTICAL;
			gbc_panel.gridx = 0;
			gbc_panel.gridy = 5;
			frame.getContentPane().add(panel, gbc_panel);
			{
				lblEstado = new JLabel("Estado:");
				panel.add(lblEstado);
			}
		}
	}

	private class BtnEncenderRadarActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			btnEncenderRadar.setEnabled(false);
			btnApagarRadar.setEnabled(true);
			lblEstado.setText("Radar activo");
			try {
				encenderRadar();
			} catch (InterruptedException e1) {
				e1.printStackTrace();
			}
		}
	}
	private class BtnApagarRadarActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			btnApagarRadar.setEnabled(false);
			btnEncenderRadar.setEnabled(true);
			lblEstado.setText("Radar inactivo");
			apagarRadar();
			
		}
	}
	private class BtnSancionarActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			String idExp = JOptionPane.showInputDialog(frame, "Indica el número del expediente");
			try{
				int idInquiry = Integer.parseInt(idExp);
				String dni = JOptionPane.showInputDialog(frame, "Indica el dni del conductor");
				Manager.get().identifyDriver(idInquiry, dni);
				lblEstado.setText("Conductor con dni: "+dni+" sancionado por el expediente "+idInquiry);
			}
			catch(NumberFormatException e1){
				lblEstado.setText("Estado: Identificador no válido");
			}
			catch(javax.persistence.NoResultException e2){
				lblEstado.setText("Estado: No se ha podido sancionar");
			}
		}
	}
	
	public void encenderRadar() throws InterruptedException{
		Random rnd = new Random();
		int n = (int)(rnd.nextDouble() * 10 + 0);
		r = new Domain.Radar("Tramo"+n,(30+n*10));
		lblEstado.setText(lblEstado.getText()+". Localización: Tramo "+n+", vel. máxima: "+(30+n*10)+" km/h" );
		r.start();
	}
	
	public void apagarRadar(){
		r.setEstado(false);
	}
}
