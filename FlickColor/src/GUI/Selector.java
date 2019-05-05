package GUI;

import java.awt.EventQueue;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

import java.awt.Color;

import javax.swing.JLabel;

import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Cursor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Selector extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		Selector frame = new Selector();
		frame.setVisible(true);
	}

	/**
	 * Create the frame.
	 */
	public Selector() {
		super("FlickColor");
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(420, 160, 660, 470);
		setResizable(false);
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel elegir = new JLabel("Elija una grilla");
		elegir.setBounds(192, 42, 300, 69);
		elegir.setForeground(Color.WHITE);
		elegir.setFont(new Font("Comic Sans MS", Font.BOLD, 40));
		contentPane.add(elegir);

		JLabel grilla1 = new JLabel("");
		grilla1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		grilla1.setBounds(10, 233, 160, 161);
		contentPane.add(grilla1);
		grilla1.setIcon(new ImageIcon(getClass().getResource(
				"/Imagenes/grilla1.gif")));

		JLabel grilla2 = new JLabel("");
		grilla2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		grilla2.setBounds(168, 233, 160, 161);
		contentPane.add(grilla2);
		grilla2.setIcon(new ImageIcon(getClass().getResource(
				"/Imagenes/grilla2.gif")));

		JLabel grilla3 = new JLabel("");
		grilla3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		grilla3.setBounds(327, 233, 160, 161);
		contentPane.add(grilla3);
		grilla3.setIcon(new ImageIcon(getClass().getResource(
				"/Imagenes/grilla3.gif")));

		JLabel grilla4 = new JLabel("");
		grilla4.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		grilla4.setBounds(485, 233, 159, 161);
		contentPane.add(grilla4);
		grilla4.setIcon(new ImageIcon(getClass().getResource(
				"/Imagenes/grilla4.gif")));

		JLabel nivel1 = new JLabel("NIVEL 1");
		nivel1.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
		nivel1.setForeground(Color.WHITE);
		nivel1.setBounds(59, 392, 67, 23);
		contentPane.add(nivel1);

		JLabel nivel2 = new JLabel("NIVEL 2");
		nivel2.setForeground(Color.WHITE);
		nivel2.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
		nivel2.setBounds(215, 392, 67, 23);
		contentPane.add(nivel2);

		JLabel nivel3 = new JLabel("NIVEL 3");
		nivel3.setForeground(Color.WHITE);
		nivel3.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
		nivel3.setBounds(377, 392, 67, 23);
		contentPane.add(nivel3);

		JLabel nivel4 = new JLabel("NIVEL 4");
		nivel4.setForeground(Color.WHITE);
		nivel4.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
		nivel4.setBounds(539, 392, 67, 23);
		contentPane.add(nivel4);

		JButton RandomButt = new JButton("Grilla Aleatoria");
		RandomButt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				setEnabled(false);
				setVisible(false);
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							Game frame = new Game(0);
							frame.setVisible(true);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
			}
		});
		RandomButt.setFont(new Font("Comic Sans MS", Font.BOLD, 16));
		RandomButt.setBounds(246, 158, 160, 34);
		contentPane.add(RandomButt);

		grilla1.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent arg0) {
				setEnabled(false);
				setVisible(false);
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							Game frame = new Game(1);
							frame.setVisible(true);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
			}

			public void mouseEntered(MouseEvent arg0) {
				nivel1.setBorder(BorderFactory
						.createLineBorder(Color.YELLOW, 2));
			}

			public void mouseExited(MouseEvent arg0) {
				nivel1.setBorder(null);
			}
		});

		grilla2.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent arg0) {
				setEnabled(false);
				setVisible(false);
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							Game frame = new Game(2);
							frame.setVisible(true);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});

			}

			public void mouseEntered(MouseEvent arg0) {
				nivel2.setBorder(BorderFactory
						.createLineBorder(Color.YELLOW, 2));
			}

			public void mouseExited(MouseEvent arg0) {
				nivel2.setBorder(null);
			}
		});
		grilla3.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent arg0) {
				setEnabled(false);
				setVisible(false);
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							Game frame = new Game(3);
							frame.setVisible(true);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});

			}

			public void mouseEntered(MouseEvent arg0) {
				nivel3.setBorder(BorderFactory
						.createLineBorder(Color.YELLOW, 2));
			}

			public void mouseExited(MouseEvent arg0) {
				nivel3.setBorder(null);
			}
		});
		grilla4.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent arg0) {
				setEnabled(false);
				setVisible(false);
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							Game frame = new Game(4);
							frame.setVisible(true);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
			}

			public void mouseEntered(MouseEvent arg0) {
				nivel4.setBorder(BorderFactory
						.createLineBorder(Color.YELLOW, 2));
			}

			public void mouseExited(MouseEvent arg0) {
				nivel4.setBorder(null);
			}
		});
		repaint();
	}
}
