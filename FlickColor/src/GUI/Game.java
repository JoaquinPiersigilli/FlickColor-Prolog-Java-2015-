package GUI;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.border.TitledBorder;

import java.awt.Cursor;

import javax.swing.JLabel;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.util.Hashtable;

import jpl.Query;

import javax.swing.JCheckBox;

public class Game extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JButton[] arr = new JButton[196];
	private JLabel label;
	private JButton btnNewButton;
	private JButton button_196;
	private JButton button_197;
	private JButton button_198;
	private JButton button_199;
	private JButton button_200;
	private JButton btnJugarDeNuevo;
	private JCheckBox ayuda1;
	private JCheckBox ayuda2;

	/**
	 * Create the frame.
	 */
	public Game(int grilla) {
		super("Flick Color");

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(420, 160, 660, 470);
		setResizable(false);
		contentPane = new JPanel();
		contentPane.setBackground(UIManager.getColor("ToolBar.foreground"));
		contentPane.setBorder(new TitledBorder(null, "", TitledBorder.LEADING,
				TitledBorder.TOP, null, null));
		getContentPane().add(contentPane);
		contentPane.setLayout(null);
		contentPane.setVisible(true);

		JButton button_0 = new JButton("");
		button_0.setEnabled(false);
		button_0.setFocusCycleRoot(true);
		button_0.setBounds(221, 11, 27, 25);
		contentPane.add(button_0);

		JButton button_1 = new JButton("");
		button_1.setEnabled(false);
		button_1.setFocusCycleRoot(true);
		button_1.setBounds(251, 11, 27, 25);
		contentPane.add(button_1);

		JButton button_2 = new JButton("");
		button_2.setEnabled(false);
		button_2.setFocusCycleRoot(true);
		button_2.setBounds(281, 11, 27, 25);
		contentPane.add(button_2);

		JButton button_3 = new JButton("");
		button_3.setEnabled(false);
		button_3.setFocusCycleRoot(true);
		button_3.setBounds(311, 11, 27, 25);
		contentPane.add(button_3);

		JButton button_4 = new JButton("");
		button_4.setEnabled(false);
		button_4.setFocusCycleRoot(true);
		button_4.setBounds(341, 11, 27, 25);
		contentPane.add(button_4);

		JButton button_5 = new JButton("");
		button_5.setEnabled(false);
		button_5.setFocusCycleRoot(true);
		button_5.setBounds(371, 11, 27, 25);
		contentPane.add(button_5);

		JButton button_6 = new JButton("");
		button_6.setEnabled(false);
		button_6.setFocusCycleRoot(true);
		button_6.setBounds(401, 11, 27, 25);
		contentPane.add(button_6);

		JButton button_7 = new JButton("");
		button_7.setEnabled(false);
		button_7.setFocusCycleRoot(true);
		button_7.setBounds(431, 11, 27, 25);
		contentPane.add(button_7);

		JButton button_8 = new JButton("");
		button_8.setEnabled(false);
		button_8.setFocusCycleRoot(true);
		button_8.setBounds(461, 11, 27, 25);
		contentPane.add(button_8);

		JButton button_9 = new JButton("");
		button_9.setEnabled(false);
		button_9.setFocusCycleRoot(true);
		button_9.setBounds(491, 11, 27, 25);
		contentPane.add(button_9);

		JButton button_10 = new JButton("");
		button_10.setEnabled(false);
		button_10.setFocusCycleRoot(true);
		button_10.setBounds(521, 11, 27, 25);
		contentPane.add(button_10);

		JButton button_11 = new JButton("");
		button_11.setEnabled(false);
		button_11.setFocusCycleRoot(true);
		button_11.setBounds(551, 11, 27, 25);
		contentPane.add(button_11);

		JButton button_12 = new JButton("");
		button_12.setEnabled(false);
		button_12.setFocusCycleRoot(true);
		button_12.setBounds(581, 11, 27, 25);
		contentPane.add(button_12);

		JButton button_13 = new JButton("");
		button_13.setEnabled(false);
		button_13.setFocusCycleRoot(true);
		button_13.setBounds(611, 11, 27, 25);
		contentPane.add(button_13);

		JButton button_14 = new JButton("");
		button_14.setEnabled(false);
		button_14.setFocusCycleRoot(true);
		button_14.setBounds(221, 41, 27, 25);
		contentPane.add(button_14);

		JButton button_15 = new JButton("");
		button_15.setEnabled(false);
		button_15.setFocusCycleRoot(true);
		button_15.setBounds(251, 41, 27, 25);
		contentPane.add(button_15);

		JButton button_16 = new JButton("");
		button_16.setEnabled(false);
		button_16.setFocusCycleRoot(true);
		button_16.setBounds(281, 41, 27, 25);
		contentPane.add(button_16);

		JButton button_17 = new JButton("");
		button_17.setEnabled(false);
		button_17.setFocusCycleRoot(true);
		button_17.setBounds(311, 41, 27, 25);
		contentPane.add(button_17);

		JButton button_18 = new JButton("");
		button_18.setEnabled(false);
		button_18.setFocusCycleRoot(true);
		button_18.setBounds(341, 41, 27, 25);
		contentPane.add(button_18);

		JButton button_19 = new JButton("");
		button_19.setEnabled(false);
		button_19.setFocusCycleRoot(true);
		button_19.setBounds(371, 41, 27, 25);
		contentPane.add(button_19);

		JButton button_20 = new JButton("");
		button_20.setEnabled(false);
		button_20.setFocusCycleRoot(true);
		button_20.setBounds(401, 41, 27, 25);
		contentPane.add(button_20);

		JButton button_21 = new JButton("");
		button_21.setEnabled(false);
		button_21.setFocusCycleRoot(true);
		button_21.setBounds(431, 41, 27, 25);
		contentPane.add(button_21);

		JButton button_22 = new JButton("");
		button_22.setEnabled(false);
		button_22.setFocusCycleRoot(true);
		button_22.setBounds(461, 41, 27, 25);
		contentPane.add(button_22);

		JButton button_23 = new JButton("");
		button_23.setEnabled(false);
		button_23.setFocusCycleRoot(true);
		button_23.setBounds(491, 41, 27, 25);
		contentPane.add(button_23);

		JButton button_24 = new JButton("");
		button_24.setEnabled(false);
		button_24.setFocusCycleRoot(true);
		button_24.setBounds(521, 41, 27, 25);
		contentPane.add(button_24);

		JButton button_25 = new JButton("");
		button_25.setEnabled(false);
		button_25.setFocusCycleRoot(true);
		button_25.setBounds(551, 41, 27, 25);
		contentPane.add(button_25);

		JButton button_26 = new JButton("");
		button_26.setEnabled(false);
		button_26.setFocusCycleRoot(true);
		button_26.setBounds(581, 41, 27, 25);
		contentPane.add(button_26);

		JButton button_27 = new JButton("");
		button_27.setEnabled(false);
		button_27.setFocusCycleRoot(true);
		button_27.setBounds(611, 41, 27, 25);
		contentPane.add(button_27);

		JButton button_28 = new JButton("");
		button_28.setEnabled(false);
		button_28.setFocusCycleRoot(true);
		button_28.setBounds(221, 71, 27, 25);
		contentPane.add(button_28);

		JButton button_29 = new JButton("");
		button_29.setEnabled(false);
		button_29.setFocusCycleRoot(true);
		button_29.setBounds(251, 71, 27, 25);
		contentPane.add(button_29);

		JButton button_30 = new JButton("");
		button_30.setEnabled(false);
		button_30.setFocusCycleRoot(true);
		button_30.setBounds(281, 71, 27, 25);
		contentPane.add(button_30);

		JButton button_31 = new JButton("");
		button_31.setEnabled(false);
		button_31.setFocusCycleRoot(true);
		button_31.setBounds(311, 71, 27, 25);
		contentPane.add(button_31);

		JButton button_32 = new JButton("");
		button_32.setEnabled(false);
		button_32.setFocusCycleRoot(true);
		button_32.setBounds(341, 71, 27, 25);
		contentPane.add(button_32);

		JButton button_33 = new JButton("");
		button_33.setEnabled(false);
		button_33.setFocusCycleRoot(true);
		button_33.setBounds(371, 71, 27, 25);
		contentPane.add(button_33);

		JButton button_34 = new JButton("");
		button_34.setEnabled(false);
		button_34.setFocusCycleRoot(true);
		button_34.setBounds(401, 71, 27, 25);
		contentPane.add(button_34);

		JButton button_35 = new JButton("");
		button_35.setEnabled(false);
		button_35.setFocusCycleRoot(true);
		button_35.setBounds(431, 71, 27, 25);
		contentPane.add(button_35);

		JButton button_36 = new JButton("");
		button_36.setEnabled(false);
		button_36.setFocusCycleRoot(true);
		button_36.setBounds(461, 71, 27, 25);
		contentPane.add(button_36);

		JButton button_37 = new JButton("");
		button_37.setEnabled(false);
		button_37.setFocusCycleRoot(true);
		button_37.setBounds(491, 71, 27, 25);
		contentPane.add(button_37);

		JButton button_38 = new JButton("");
		button_38.setEnabled(false);
		button_38.setFocusCycleRoot(true);
		button_38.setBounds(521, 71, 27, 25);
		contentPane.add(button_38);

		JButton button_39 = new JButton("");
		button_39.setEnabled(false);
		button_39.setFocusCycleRoot(true);
		button_39.setBounds(551, 71, 27, 25);
		contentPane.add(button_39);

		JButton button_40 = new JButton("");
		button_40.setEnabled(false);
		button_40.setFocusCycleRoot(true);
		button_40.setBounds(581, 71, 27, 25);
		contentPane.add(button_40);

		JButton button_41 = new JButton("");
		button_41.setEnabled(false);
		button_41.setFocusCycleRoot(true);
		button_41.setBounds(611, 71, 27, 25);
		contentPane.add(button_41);

		JButton button_42 = new JButton("");
		button_42.setEnabled(false);
		button_42.setFocusCycleRoot(true);
		button_42.setBounds(221, 101, 27, 25);
		contentPane.add(button_42);

		JButton button_43 = new JButton("");
		button_43.setEnabled(false);
		button_43.setFocusCycleRoot(true);
		button_43.setBounds(251, 101, 27, 25);
		contentPane.add(button_43);

		JButton button_44 = new JButton("");
		button_44.setEnabled(false);
		button_44.setFocusCycleRoot(true);
		button_44.setBounds(281, 101, 27, 25);
		contentPane.add(button_44);

		JButton button_45 = new JButton("");
		button_45.setEnabled(false);
		button_45.setFocusCycleRoot(true);
		button_45.setBounds(311, 101, 27, 25);
		contentPane.add(button_45);

		JButton button_46 = new JButton("");
		button_46.setEnabled(false);
		button_46.setFocusCycleRoot(true);
		button_46.setBounds(341, 101, 27, 25);
		contentPane.add(button_46);

		JButton button_47 = new JButton("");
		button_47.setEnabled(false);
		button_47.setFocusCycleRoot(true);
		button_47.setBounds(371, 101, 27, 25);
		contentPane.add(button_47);

		JButton button_48 = new JButton("");
		button_48.setEnabled(false);
		button_48.setFocusCycleRoot(true);
		button_48.setBounds(401, 101, 27, 25);
		contentPane.add(button_48);

		JButton button_49 = new JButton("");
		button_49.setEnabled(false);
		button_49.setFocusCycleRoot(true);
		button_49.setBounds(431, 101, 27, 25);
		contentPane.add(button_49);

		JButton button_50 = new JButton("");
		button_50.setEnabled(false);
		button_50.setFocusCycleRoot(true);
		button_50.setBounds(461, 101, 27, 25);
		contentPane.add(button_50);

		JButton button_51 = new JButton("");
		button_51.setEnabled(false);
		button_51.setFocusCycleRoot(true);
		button_51.setBounds(491, 101, 27, 25);
		contentPane.add(button_51);

		JButton button_52 = new JButton("");
		button_52.setEnabled(false);
		button_52.setFocusCycleRoot(true);
		button_52.setBounds(521, 101, 27, 25);
		contentPane.add(button_52);

		JButton button_53 = new JButton("");
		button_53.setEnabled(false);
		button_53.setFocusCycleRoot(true);
		button_53.setBounds(551, 101, 27, 25);
		contentPane.add(button_53);

		JButton button_54 = new JButton("");
		button_54.setEnabled(false);
		button_54.setFocusCycleRoot(true);
		button_54.setBounds(581, 101, 27, 25);
		contentPane.add(button_54);

		JButton button_55 = new JButton("");
		button_55.setEnabled(false);
		button_55.setFocusCycleRoot(true);
		button_55.setBounds(611, 101, 27, 25);
		contentPane.add(button_55);

		JButton button_56 = new JButton("");
		button_56.setEnabled(false);
		button_56.setFocusCycleRoot(true);
		button_56.setBounds(221, 131, 27, 25);
		contentPane.add(button_56);

		JButton button_57 = new JButton("");
		button_57.setEnabled(false);
		button_57.setFocusCycleRoot(true);
		button_57.setBounds(251, 131, 27, 25);
		contentPane.add(button_57);

		JButton button_58 = new JButton("");
		button_58.setEnabled(false);
		button_58.setFocusCycleRoot(true);
		button_58.setBounds(281, 131, 27, 25);
		contentPane.add(button_58);

		JButton button_59 = new JButton("");
		button_59.setEnabled(false);
		button_59.setFocusCycleRoot(true);
		button_59.setBounds(311, 131, 27, 25);
		contentPane.add(button_59);

		JButton button_60 = new JButton("");
		button_60.setEnabled(false);
		button_60.setFocusCycleRoot(true);
		button_60.setBounds(341, 131, 27, 25);
		contentPane.add(button_60);

		JButton button_61 = new JButton("");
		button_61.setEnabled(false);
		button_61.setFocusCycleRoot(true);
		button_61.setBounds(371, 131, 27, 25);
		contentPane.add(button_61);

		JButton button_62 = new JButton("");
		button_62.setEnabled(false);
		button_62.setFocusCycleRoot(true);
		button_62.setBounds(401, 131, 27, 25);
		contentPane.add(button_62);

		JButton button_63 = new JButton("");
		button_63.setEnabled(false);
		button_63.setFocusCycleRoot(true);
		button_63.setBounds(431, 131, 27, 25);
		contentPane.add(button_63);

		JButton button_64 = new JButton("");
		button_64.setEnabled(false);
		button_64.setFocusCycleRoot(true);
		button_64.setBounds(461, 131, 27, 25);
		contentPane.add(button_64);

		JButton button_65 = new JButton("");
		button_65.setEnabled(false);
		button_65.setFocusCycleRoot(true);
		button_65.setBounds(491, 131, 27, 25);
		contentPane.add(button_65);

		JButton button_66 = new JButton("");
		button_66.setEnabled(false);
		button_66.setFocusCycleRoot(true);
		button_66.setBounds(521, 131, 27, 25);
		contentPane.add(button_66);

		JButton button_67 = new JButton("");
		button_67.setEnabled(false);
		button_67.setFocusCycleRoot(true);
		button_67.setBounds(551, 131, 27, 25);
		contentPane.add(button_67);

		JButton button_68 = new JButton("");
		button_68.setEnabled(false);
		button_68.setFocusCycleRoot(true);
		button_68.setBounds(581, 131, 27, 25);
		contentPane.add(button_68);

		JButton button_69 = new JButton("");
		button_69.setEnabled(false);
		button_69.setFocusCycleRoot(true);
		button_69.setBounds(611, 131, 27, 25);
		contentPane.add(button_69);

		JButton button_70 = new JButton("");
		button_70.setEnabled(false);
		button_70.setFocusCycleRoot(true);
		button_70.setBounds(221, 161, 27, 25);
		contentPane.add(button_70);

		JButton button_71 = new JButton("");
		button_71.setEnabled(false);
		button_71.setFocusCycleRoot(true);
		button_71.setBounds(251, 161, 27, 25);
		contentPane.add(button_71);

		JButton button_72 = new JButton("");
		button_72.setEnabled(false);
		button_72.setFocusCycleRoot(true);
		button_72.setBounds(281, 161, 27, 25);
		contentPane.add(button_72);

		JButton button_73 = new JButton("");
		button_73.setEnabled(false);
		button_73.setFocusCycleRoot(true);
		button_73.setBounds(311, 161, 27, 25);
		contentPane.add(button_73);

		JButton button_74 = new JButton("");
		button_74.setEnabled(false);
		button_74.setFocusCycleRoot(true);
		button_74.setBounds(341, 161, 27, 25);
		contentPane.add(button_74);

		JButton button_75 = new JButton("");
		button_75.setEnabled(false);
		button_75.setFocusCycleRoot(true);
		button_75.setBounds(371, 161, 27, 25);
		contentPane.add(button_75);

		JButton button_76 = new JButton("");
		button_76.setEnabled(false);
		button_76.setFocusCycleRoot(true);
		button_76.setBounds(401, 161, 27, 25);
		contentPane.add(button_76);

		JButton button_77 = new JButton("");
		button_77.setEnabled(false);
		button_77.setFocusCycleRoot(true);
		button_77.setBounds(431, 161, 27, 25);
		contentPane.add(button_77);

		JButton button_78 = new JButton("");
		button_78.setEnabled(false);
		button_78.setFocusCycleRoot(true);
		button_78.setBounds(461, 161, 27, 25);
		contentPane.add(button_78);

		JButton button_79 = new JButton("");
		button_79.setEnabled(false);
		button_79.setFocusCycleRoot(true);
		button_79.setBounds(491, 161, 27, 25);
		contentPane.add(button_79);

		JButton button_80 = new JButton("");
		button_80.setEnabled(false);
		button_80.setFocusCycleRoot(true);
		button_80.setBounds(521, 161, 27, 25);
		contentPane.add(button_80);

		JButton button_81 = new JButton("");
		button_81.setEnabled(false);
		button_81.setFocusCycleRoot(true);
		button_81.setBounds(551, 161, 27, 25);
		contentPane.add(button_81);

		JButton button_82 = new JButton("");
		button_82.setEnabled(false);
		button_82.setFocusCycleRoot(true);
		button_82.setBounds(581, 161, 27, 25);
		contentPane.add(button_82);

		JButton button_83 = new JButton("");
		button_83.setEnabled(false);
		button_83.setFocusCycleRoot(true);
		button_83.setBounds(611, 161, 27, 25);
		contentPane.add(button_83);

		JButton button_84 = new JButton("");
		button_84.setEnabled(false);
		button_84.setFocusCycleRoot(true);
		button_84.setBounds(221, 191, 27, 25);
		contentPane.add(button_84);

		JButton button_85 = new JButton("");
		button_85.setEnabled(false);
		button_85.setFocusCycleRoot(true);
		button_85.setBounds(251, 191, 27, 25);
		contentPane.add(button_85);

		JButton button_86 = new JButton("");
		button_86.setEnabled(false);
		button_86.setFocusCycleRoot(true);
		button_86.setBounds(281, 191, 27, 25);
		contentPane.add(button_86);

		JButton button_87 = new JButton("");
		button_87.setEnabled(false);
		button_87.setFocusCycleRoot(true);
		button_87.setBounds(311, 191, 27, 25);
		contentPane.add(button_87);

		JButton button_88 = new JButton("");
		button_88.setEnabled(false);
		button_88.setFocusCycleRoot(true);
		button_88.setBounds(341, 191, 27, 25);
		contentPane.add(button_88);

		JButton button_89 = new JButton("");
		button_89.setEnabled(false);
		button_89.setFocusCycleRoot(true);
		button_89.setBounds(371, 191, 27, 25);
		contentPane.add(button_89);

		JButton button_90 = new JButton("");
		button_90.setEnabled(false);
		button_90.setFocusCycleRoot(true);
		button_90.setBounds(401, 191, 27, 25);
		contentPane.add(button_90);

		JButton button_91 = new JButton("");
		button_91.setEnabled(false);
		button_91.setFocusCycleRoot(true);
		button_91.setBounds(431, 191, 27, 25);
		contentPane.add(button_91);

		JButton button_92 = new JButton("");
		button_92.setEnabled(false);
		button_92.setFocusCycleRoot(true);
		button_92.setBounds(461, 191, 27, 25);
		contentPane.add(button_92);

		JButton button_93 = new JButton("");
		button_93.setEnabled(false);
		button_93.setFocusCycleRoot(true);
		button_93.setBounds(491, 191, 27, 25);
		contentPane.add(button_93);

		JButton button_94 = new JButton("");
		button_94.setEnabled(false);
		button_94.setFocusCycleRoot(true);
		button_94.setBounds(521, 191, 27, 25);
		contentPane.add(button_94);

		JButton button_95 = new JButton("");
		button_95.setEnabled(false);
		button_95.setFocusCycleRoot(true);
		button_95.setBounds(551, 191, 27, 25);
		contentPane.add(button_95);

		JButton button_96 = new JButton("");
		button_96.setEnabled(false);
		button_96.setFocusCycleRoot(true);
		button_96.setBounds(581, 191, 27, 25);
		contentPane.add(button_96);

		JButton button_97 = new JButton("");
		button_97.setEnabled(false);
		button_97.setFocusCycleRoot(true);
		button_97.setBounds(611, 191, 27, 25);
		contentPane.add(button_97);

		JButton button_98 = new JButton("");
		button_98.setEnabled(false);
		button_98.setFocusCycleRoot(true);
		button_98.setBounds(221, 221, 27, 25);
		contentPane.add(button_98);

		JButton button_99 = new JButton("");
		button_99.setEnabled(false);
		button_99.setFocusCycleRoot(true);
		button_99.setBounds(251, 221, 27, 25);
		contentPane.add(button_99);

		JButton button_100 = new JButton("");
		button_100.setEnabled(false);
		button_100.setFocusCycleRoot(true);
		button_100.setBounds(281, 221, 27, 25);
		contentPane.add(button_100);

		JButton button_101 = new JButton("");
		button_101.setEnabled(false);
		button_101.setFocusCycleRoot(true);
		button_101.setBounds(311, 221, 27, 25);
		contentPane.add(button_101);

		JButton button_102 = new JButton("");
		button_102.setEnabled(false);
		button_102.setFocusCycleRoot(true);
		button_102.setBounds(341, 221, 27, 25);
		contentPane.add(button_102);

		JButton button_103 = new JButton("");
		button_103.setEnabled(false);
		button_103.setFocusCycleRoot(true);
		button_103.setBounds(371, 221, 27, 25);
		contentPane.add(button_103);

		JButton button_104 = new JButton("");
		button_104.setEnabled(false);
		button_104.setFocusCycleRoot(true);
		button_104.setBounds(401, 221, 27, 25);
		contentPane.add(button_104);

		JButton button_105 = new JButton("");
		button_105.setEnabled(false);
		button_105.setFocusCycleRoot(true);
		button_105.setBounds(431, 221, 27, 25);
		contentPane.add(button_105);

		JButton button_106 = new JButton("");
		button_106.setEnabled(false);
		button_106.setFocusCycleRoot(true);
		button_106.setBounds(461, 221, 27, 25);
		contentPane.add(button_106);

		JButton button_107 = new JButton("");
		button_107.setEnabled(false);
		button_107.setFocusCycleRoot(true);
		button_107.setBounds(491, 221, 27, 25);
		contentPane.add(button_107);

		JButton button_108 = new JButton("");
		button_108.setEnabled(false);
		button_108.setFocusCycleRoot(true);
		button_108.setBounds(521, 221, 27, 25);
		contentPane.add(button_108);

		JButton button_109 = new JButton("");
		button_109.setEnabled(false);
		button_109.setFocusCycleRoot(true);
		button_109.setBounds(551, 221, 27, 25);
		contentPane.add(button_109);

		JButton button_110 = new JButton("");
		button_110.setEnabled(false);
		button_110.setFocusCycleRoot(true);
		button_110.setBounds(581, 221, 27, 25);
		contentPane.add(button_110);

		JButton button_111 = new JButton("");
		button_111.setEnabled(false);
		button_111.setFocusCycleRoot(true);
		button_111.setBounds(611, 221, 27, 25);
		contentPane.add(button_111);

		JButton button_112 = new JButton("");
		button_112.setEnabled(false);
		button_112.setFocusCycleRoot(true);
		button_112.setBounds(221, 251, 27, 25);
		contentPane.add(button_112);

		JButton button_113 = new JButton("");
		button_113.setEnabled(false);
		button_113.setFocusCycleRoot(true);
		button_113.setBounds(251, 251, 27, 25);
		contentPane.add(button_113);

		JButton button_114 = new JButton("");
		button_114.setEnabled(false);
		button_114.setFocusCycleRoot(true);
		button_114.setBounds(281, 251, 27, 25);
		contentPane.add(button_114);

		JButton button_115 = new JButton("");
		button_115.setEnabled(false);
		button_115.setFocusCycleRoot(true);
		button_115.setBounds(311, 251, 27, 25);
		contentPane.add(button_115);

		JButton button_116 = new JButton("");
		button_116.setEnabled(false);
		button_116.setFocusCycleRoot(true);
		button_116.setBounds(341, 251, 27, 25);
		contentPane.add(button_116);

		JButton button_117 = new JButton("");
		button_117.setEnabled(false);
		button_117.setFocusCycleRoot(true);
		button_117.setBounds(371, 251, 27, 25);
		contentPane.add(button_117);

		JButton button_118 = new JButton("");
		button_118.setEnabled(false);
		button_118.setFocusCycleRoot(true);
		button_118.setBounds(401, 251, 27, 25);
		contentPane.add(button_118);

		JButton button_119 = new JButton("");
		button_119.setEnabled(false);
		button_119.setFocusCycleRoot(true);
		button_119.setBounds(431, 251, 27, 25);
		contentPane.add(button_119);

		JButton button_120 = new JButton("");
		button_120.setEnabled(false);
		button_120.setFocusCycleRoot(true);
		button_120.setBounds(461, 251, 27, 25);
		contentPane.add(button_120);

		JButton button_121 = new JButton("");
		button_121.setEnabled(false);
		button_121.setFocusCycleRoot(true);
		button_121.setBounds(491, 251, 27, 25);
		contentPane.add(button_121);

		JButton button_122 = new JButton("");
		button_122.setEnabled(false);
		button_122.setFocusCycleRoot(true);
		button_122.setBounds(521, 251, 27, 25);
		contentPane.add(button_122);

		JButton button_123 = new JButton("");
		button_123.setEnabled(false);
		button_123.setFocusCycleRoot(true);
		button_123.setBounds(551, 251, 27, 25);
		contentPane.add(button_123);

		JButton button_124 = new JButton("");
		button_124.setEnabled(false);
		button_124.setFocusCycleRoot(true);
		button_124.setBounds(581, 251, 27, 25);
		contentPane.add(button_124);

		JButton button_125 = new JButton("");
		button_125.setEnabled(false);
		button_125.setFocusCycleRoot(true);
		button_125.setBounds(611, 251, 27, 25);
		contentPane.add(button_125);

		JButton button_126 = new JButton("");
		button_126.setEnabled(false);
		button_126.setFocusCycleRoot(true);
		button_126.setBounds(221, 281, 27, 25);
		contentPane.add(button_126);

		JButton button_127 = new JButton("");
		button_127.setEnabled(false);
		button_127.setFocusCycleRoot(true);
		button_127.setBounds(251, 281, 27, 25);
		contentPane.add(button_127);

		JButton button_128 = new JButton("");
		button_128.setEnabled(false);
		button_128.setFocusCycleRoot(true);
		button_128.setBounds(281, 281, 27, 25);
		contentPane.add(button_128);

		JButton button_129 = new JButton("");
		button_129.setEnabled(false);
		button_129.setFocusCycleRoot(true);
		button_129.setBounds(311, 281, 27, 25);
		contentPane.add(button_129);

		JButton button_130 = new JButton("");
		button_130.setEnabled(false);
		button_130.setFocusCycleRoot(true);
		button_130.setBounds(341, 281, 27, 25);
		contentPane.add(button_130);

		JButton button_131 = new JButton("");
		button_131.setEnabled(false);
		button_131.setFocusCycleRoot(true);
		button_131.setBounds(371, 281, 27, 25);
		contentPane.add(button_131);

		JButton button_132 = new JButton("");
		button_132.setEnabled(false);
		button_132.setFocusCycleRoot(true);
		button_132.setBounds(401, 281, 27, 25);
		contentPane.add(button_132);

		JButton button_133 = new JButton("");
		button_133.setEnabled(false);
		button_133.setFocusCycleRoot(true);
		button_133.setBounds(431, 281, 27, 25);
		contentPane.add(button_133);

		JButton button_134 = new JButton("");
		button_134.setEnabled(false);
		button_134.setFocusCycleRoot(true);
		button_134.setBounds(461, 281, 27, 25);
		contentPane.add(button_134);

		JButton button_135 = new JButton("");
		button_135.setEnabled(false);
		button_135.setFocusCycleRoot(true);
		button_135.setBounds(491, 281, 27, 25);
		contentPane.add(button_135);

		JButton button_136 = new JButton("");
		button_136.setEnabled(false);
		button_136.setFocusCycleRoot(true);
		button_136.setBounds(521, 281, 27, 25);
		contentPane.add(button_136);

		JButton button_137 = new JButton("");
		button_137.setEnabled(false);
		button_137.setFocusCycleRoot(true);
		button_137.setBounds(551, 281, 27, 25);
		contentPane.add(button_137);

		JButton button_138 = new JButton("");
		button_138.setEnabled(false);
		button_138.setFocusCycleRoot(true);
		button_138.setBounds(581, 281, 27, 25);
		contentPane.add(button_138);

		JButton button_139 = new JButton("");
		button_139.setEnabled(false);
		button_139.setFocusCycleRoot(true);
		button_139.setBounds(611, 281, 27, 25);
		contentPane.add(button_139);

		JButton button_140 = new JButton("");
		button_140.setEnabled(false);
		button_140.setFocusCycleRoot(true);
		button_140.setBounds(221, 311, 27, 25);
		contentPane.add(button_140);

		JButton button_141 = new JButton("");
		button_141.setEnabled(false);
		button_141.setFocusCycleRoot(true);
		button_141.setBounds(251, 311, 27, 25);
		contentPane.add(button_141);

		JButton button_142 = new JButton("");
		button_142.setEnabled(false);
		button_142.setFocusCycleRoot(true);
		button_142.setBounds(281, 311, 27, 25);
		contentPane.add(button_142);

		JButton button_143 = new JButton("");
		button_143.setEnabled(false);
		button_143.setFocusCycleRoot(true);
		button_143.setBounds(311, 311, 27, 25);
		contentPane.add(button_143);

		JButton button_144 = new JButton("");
		button_144.setEnabled(false);
		button_144.setFocusCycleRoot(true);
		button_144.setBounds(341, 311, 27, 25);
		contentPane.add(button_144);

		JButton button_145 = new JButton("");
		button_145.setEnabled(false);
		button_145.setFocusCycleRoot(true);
		button_145.setBounds(371, 311, 27, 25);
		contentPane.add(button_145);

		JButton button_146 = new JButton("");
		button_146.setEnabled(false);
		button_146.setFocusCycleRoot(true);
		button_146.setBounds(401, 311, 27, 25);
		contentPane.add(button_146);

		JButton button_147 = new JButton("");
		button_147.setEnabled(false);
		button_147.setFocusCycleRoot(true);
		button_147.setBounds(431, 311, 27, 25);
		contentPane.add(button_147);

		JButton button_148 = new JButton("");
		button_148.setEnabled(false);
		button_148.setFocusCycleRoot(true);
		button_148.setBounds(461, 311, 27, 25);
		contentPane.add(button_148);

		JButton button_149 = new JButton("");
		button_149.setEnabled(false);
		button_149.setFocusCycleRoot(true);
		button_149.setBounds(491, 311, 27, 25);
		contentPane.add(button_149);

		JButton button_150 = new JButton("");
		button_150.setEnabled(false);
		button_150.setFocusCycleRoot(true);
		button_150.setBounds(521, 311, 27, 25);
		contentPane.add(button_150);

		JButton button_151 = new JButton("");
		button_151.setEnabled(false);
		button_151.setFocusCycleRoot(true);
		button_151.setBounds(551, 311, 27, 25);
		contentPane.add(button_151);

		JButton button_152 = new JButton("");
		button_152.setEnabled(false);
		button_152.setFocusCycleRoot(true);
		button_152.setBounds(581, 311, 27, 25);
		contentPane.add(button_152);

		JButton button_153 = new JButton("");
		button_153.setEnabled(false);
		button_153.setFocusCycleRoot(true);
		button_153.setBounds(611, 311, 27, 25);
		contentPane.add(button_153);

		JButton button_154 = new JButton("");
		button_154.setEnabled(false);
		button_154.setFocusCycleRoot(true);
		button_154.setBounds(221, 341, 27, 25);
		contentPane.add(button_154);

		JButton button_155 = new JButton("");
		button_155.setEnabled(false);
		button_155.setFocusCycleRoot(true);
		button_155.setBounds(251, 341, 27, 25);
		contentPane.add(button_155);

		JButton button_156 = new JButton("");
		button_156.setEnabled(false);
		button_156.setFocusCycleRoot(true);
		button_156.setBounds(281, 341, 27, 25);
		contentPane.add(button_156);

		JButton button_157 = new JButton("");
		button_157.setEnabled(false);
		button_157.setFocusCycleRoot(true);
		button_157.setBounds(311, 341, 27, 25);
		contentPane.add(button_157);

		JButton button_158 = new JButton("");
		button_158.setEnabled(false);
		button_158.setFocusCycleRoot(true);
		button_158.setBounds(341, 341, 27, 25);
		contentPane.add(button_158);

		JButton button_159 = new JButton("");
		button_159.setEnabled(false);
		button_159.setFocusCycleRoot(true);
		button_159.setBounds(371, 341, 27, 25);
		contentPane.add(button_159);

		JButton button_160 = new JButton("");
		button_160.setEnabled(false);
		button_160.setFocusCycleRoot(true);
		button_160.setBounds(401, 341, 27, 25);
		contentPane.add(button_160);

		JButton button_161 = new JButton("");
		button_161.setEnabled(false);
		button_161.setFocusCycleRoot(true);
		button_161.setBounds(431, 341, 27, 25);
		contentPane.add(button_161);

		JButton button_162 = new JButton("");
		button_162.setEnabled(false);
		button_162.setFocusCycleRoot(true);
		button_162.setBounds(461, 341, 27, 25);
		contentPane.add(button_162);

		JButton button_163 = new JButton("");
		button_163.setEnabled(false);
		button_163.setFocusCycleRoot(true);
		button_163.setBounds(491, 341, 27, 25);
		contentPane.add(button_163);

		JButton button_164 = new JButton("");
		button_164.setEnabled(false);
		button_164.setFocusCycleRoot(true);
		button_164.setBounds(521, 341, 27, 25);
		contentPane.add(button_164);

		JButton button_165 = new JButton("");
		button_165.setEnabled(false);
		button_165.setFocusCycleRoot(true);
		button_165.setBounds(551, 341, 27, 25);
		contentPane.add(button_165);

		JButton button_166 = new JButton("");
		button_166.setEnabled(false);
		button_166.setFocusCycleRoot(true);
		button_166.setBounds(581, 341, 27, 25);
		contentPane.add(button_166);

		JButton button_167 = new JButton("");
		button_167.setEnabled(false);
		button_167.setFocusCycleRoot(true);
		button_167.setBounds(611, 341, 27, 25);
		contentPane.add(button_167);

		JButton button_168 = new JButton("");
		button_168.setEnabled(false);
		button_168.setFocusCycleRoot(true);
		button_168.setBounds(221, 371, 27, 25);
		contentPane.add(button_168);

		JButton button_169 = new JButton("");
		button_169.setEnabled(false);
		button_169.setFocusCycleRoot(true);
		button_169.setBounds(251, 371, 27, 25);
		contentPane.add(button_169);

		JButton button_170 = new JButton("");
		button_170.setEnabled(false);
		button_170.setFocusCycleRoot(true);
		button_170.setBounds(281, 371, 27, 25);
		contentPane.add(button_170);

		JButton button_171 = new JButton("");
		button_171.setEnabled(false);
		button_171.setFocusCycleRoot(true);
		button_171.setBounds(311, 371, 27, 25);
		contentPane.add(button_171);

		JButton button_172 = new JButton("");
		button_172.setEnabled(false);
		button_172.setFocusCycleRoot(true);
		button_172.setBounds(341, 371, 27, 25);
		contentPane.add(button_172);

		JButton button_173 = new JButton("");
		button_173.setEnabled(false);
		button_173.setFocusCycleRoot(true);
		button_173.setBounds(371, 371, 27, 25);
		contentPane.add(button_173);

		JButton button_174 = new JButton("");
		button_174.setEnabled(false);
		button_174.setFocusCycleRoot(true);
		button_174.setBounds(401, 371, 27, 25);
		contentPane.add(button_174);

		JButton button_175 = new JButton("");
		button_175.setEnabled(false);
		button_175.setFocusCycleRoot(true);
		button_175.setBounds(431, 371, 27, 25);
		contentPane.add(button_175);

		JButton button_176 = new JButton("");
		button_176.setEnabled(false);
		button_176.setFocusCycleRoot(true);
		button_176.setBounds(461, 371, 27, 25);
		contentPane.add(button_176);

		JButton button_177 = new JButton("");
		button_177.setEnabled(false);
		button_177.setFocusCycleRoot(true);
		button_177.setBounds(491, 371, 27, 25);
		contentPane.add(button_177);

		JButton button_178 = new JButton("");
		button_178.setEnabled(false);
		button_178.setFocusCycleRoot(true);
		button_178.setBounds(521, 371, 27, 25);
		contentPane.add(button_178);

		JButton button_179 = new JButton("");
		button_179.setEnabled(false);
		button_179.setFocusCycleRoot(true);
		button_179.setBounds(551, 371, 27, 25);
		contentPane.add(button_179);

		JButton button_180 = new JButton("");
		button_180.setEnabled(false);
		button_180.setFocusCycleRoot(true);
		button_180.setBounds(581, 371, 27, 25);
		contentPane.add(button_180);

		JButton button_181 = new JButton("");
		button_181.setEnabled(false);
		button_181.setFocusCycleRoot(true);
		button_181.setBounds(611, 371, 27, 25);
		contentPane.add(button_181);

		JButton button_182 = new JButton("");
		button_182.setEnabled(false);
		button_182.setFocusCycleRoot(true);
		button_182.setBounds(221, 401, 27, 25);
		contentPane.add(button_182);

		JButton button_183 = new JButton("");
		button_183.setEnabled(false);
		button_183.setFocusCycleRoot(true);
		button_183.setBounds(251, 401, 27, 25);
		contentPane.add(button_183);

		JButton button_184 = new JButton("");
		button_184.setEnabled(false);
		button_184.setFocusCycleRoot(true);
		button_184.setBounds(281, 401, 27, 25);
		contentPane.add(button_184);

		JButton button_185 = new JButton("");
		button_185.setEnabled(false);
		button_185.setFocusCycleRoot(true);
		button_185.setBounds(311, 401, 27, 25);
		contentPane.add(button_185);

		JButton button_186 = new JButton("");
		button_186.setEnabled(false);
		button_186.setFocusCycleRoot(true);
		button_186.setBounds(341, 401, 27, 25);
		contentPane.add(button_186);

		JButton button_187 = new JButton("");
		button_187.setEnabled(false);
		button_187.setFocusCycleRoot(true);
		button_187.setBounds(371, 401, 27, 25);
		contentPane.add(button_187);

		JButton button_188 = new JButton("");
		button_188.setEnabled(false);
		button_188.setFocusCycleRoot(true);
		button_188.setBounds(401, 401, 27, 25);
		contentPane.add(button_188);

		JButton button_189 = new JButton("");
		button_189.setEnabled(false);
		button_189.setFocusCycleRoot(true);
		button_189.setBounds(431, 401, 27, 25);
		contentPane.add(button_189);

		JButton button_190 = new JButton("");
		button_190.setEnabled(false);
		button_190.setFocusCycleRoot(true);
		button_190.setBounds(461, 401, 27, 25);
		contentPane.add(button_190);

		JButton button_191 = new JButton("");
		button_191.setEnabled(false);
		button_191.setFocusCycleRoot(true);
		button_191.setBounds(491, 401, 27, 25);
		contentPane.add(button_191);

		JButton button_192 = new JButton("");
		button_192.setEnabled(false);
		button_192.setFocusCycleRoot(true);
		button_192.setBounds(521, 401, 27, 25);
		contentPane.add(button_192);

		JButton button_193 = new JButton("");
		button_193.setEnabled(false);
		button_193.setFocusCycleRoot(true);
		button_193.setBounds(551, 401, 27, 25);
		contentPane.add(button_193);

		JButton button_194 = new JButton("");
		button_194.setEnabled(false);
		button_194.setFocusCycleRoot(true);
		button_194.setBounds(581, 401, 27, 25);
		contentPane.add(button_194);

		JButton button_195 = new JButton("");
		button_195.setEnabled(false);
		button_195.setFocusCycleRoot(true);
		button_195.setBounds(611, 401, 27, 25);
		contentPane.add(button_195);

		arr[0] = button_0;
		arr[1] = button_1;
		arr[2] = button_2;
		arr[3] = button_3;
		arr[4] = button_4;
		arr[5] = button_5;
		arr[6] = button_6;
		arr[7] = button_7;
		arr[8] = button_8;
		arr[9] = button_9;
		arr[10] = button_10;
		arr[11] = button_11;
		arr[12] = button_12;
		arr[13] = button_13;
		arr[14] = button_14;
		arr[15] = button_15;
		arr[16] = button_16;
		arr[17] = button_17;
		arr[18] = button_18;
		arr[19] = button_19;
		arr[20] = button_20;
		arr[21] = button_21;
		arr[22] = button_22;
		arr[23] = button_23;
		arr[24] = button_24;
		arr[25] = button_25;
		arr[26] = button_26;
		arr[27] = button_27;
		arr[28] = button_28;
		arr[29] = button_29;
		arr[30] = button_30;
		arr[31] = button_31;
		arr[32] = button_32;
		arr[33] = button_33;
		arr[34] = button_34;
		arr[35] = button_35;
		arr[36] = button_36;
		arr[37] = button_37;
		arr[38] = button_38;
		arr[39] = button_39;
		arr[40] = button_40;
		arr[41] = button_41;
		arr[42] = button_42;
		arr[43] = button_43;
		arr[44] = button_44;
		arr[45] = button_45;
		arr[46] = button_46;
		arr[47] = button_47;
		arr[48] = button_48;
		arr[49] = button_49;
		arr[50] = button_50;
		arr[51] = button_51;
		arr[52] = button_52;
		arr[53] = button_53;
		arr[54] = button_54;
		arr[55] = button_55;
		arr[56] = button_56;
		arr[57] = button_57;
		arr[58] = button_58;
		arr[59] = button_59;
		arr[60] = button_60;
		arr[61] = button_61;
		arr[62] = button_62;
		arr[63] = button_63;
		arr[64] = button_64;
		arr[65] = button_65;
		arr[66] = button_66;
		arr[67] = button_67;
		arr[68] = button_68;
		arr[69] = button_69;
		arr[70] = button_70;
		arr[71] = button_71;
		arr[72] = button_72;
		arr[73] = button_73;
		arr[74] = button_74;
		arr[75] = button_75;
		arr[76] = button_76;
		arr[77] = button_77;
		arr[78] = button_78;
		arr[79] = button_79;
		arr[80] = button_80;
		arr[81] = button_81;
		arr[82] = button_82;
		arr[83] = button_83;
		arr[84] = button_84;
		arr[85] = button_85;
		arr[86] = button_86;
		arr[87] = button_87;
		arr[88] = button_88;
		arr[89] = button_89;
		arr[90] = button_90;
		arr[91] = button_91;
		arr[92] = button_92;
		arr[93] = button_93;
		arr[94] = button_94;
		arr[95] = button_95;
		arr[96] = button_96;
		arr[97] = button_97;
		arr[98] = button_98;
		arr[99] = button_99;
		arr[100] = button_100;
		arr[101] = button_101;
		arr[102] = button_102;
		arr[103] = button_103;
		arr[104] = button_104;
		arr[105] = button_105;
		arr[106] = button_106;
		arr[107] = button_107;
		arr[108] = button_108;
		arr[109] = button_109;
		arr[110] = button_110;
		arr[111] = button_111;
		arr[112] = button_112;
		arr[113] = button_113;
		arr[114] = button_114;
		arr[115] = button_115;
		arr[116] = button_116;
		arr[117] = button_117;
		arr[118] = button_118;
		arr[119] = button_119;
		arr[120] = button_120;
		arr[121] = button_121;
		arr[122] = button_122;
		arr[123] = button_123;
		arr[124] = button_124;
		arr[125] = button_125;
		arr[126] = button_126;
		arr[127] = button_127;
		arr[128] = button_128;
		arr[129] = button_129;
		arr[130] = button_130;
		arr[131] = button_131;
		arr[132] = button_132;
		arr[133] = button_133;
		arr[134] = button_134;
		arr[135] = button_135;
		arr[136] = button_136;
		arr[137] = button_137;
		arr[138] = button_138;
		arr[139] = button_139;
		arr[140] = button_140;
		arr[141] = button_141;
		arr[142] = button_142;
		arr[143] = button_143;
		arr[144] = button_144;
		arr[145] = button_145;
		arr[146] = button_146;
		arr[147] = button_147;
		arr[148] = button_148;
		arr[149] = button_149;
		arr[150] = button_150;
		arr[151] = button_151;
		arr[152] = button_152;
		arr[153] = button_153;
		arr[154] = button_154;
		arr[155] = button_155;
		arr[156] = button_156;
		arr[157] = button_157;
		arr[158] = button_158;
		arr[159] = button_159;
		arr[160] = button_160;
		arr[161] = button_161;
		arr[162] = button_162;
		arr[163] = button_163;
		arr[164] = button_164;
		arr[165] = button_165;
		arr[166] = button_166;
		arr[167] = button_167;
		arr[168] = button_168;
		arr[169] = button_169;
		arr[170] = button_170;
		arr[171] = button_171;
		arr[172] = button_172;
		arr[173] = button_173;
		arr[174] = button_174;
		arr[175] = button_175;
		arr[176] = button_176;
		arr[177] = button_177;
		arr[178] = button_178;
		arr[179] = button_179;
		arr[180] = button_180;
		arr[181] = button_181;
		arr[182] = button_182;
		arr[183] = button_183;
		arr[184] = button_184;
		arr[185] = button_185;
		arr[186] = button_186;
		arr[187] = button_187;
		arr[188] = button_188;
		arr[189] = button_189;
		arr[190] = button_190;
		arr[191] = button_191;
		arr[192] = button_192;
		arr[193] = button_193;
		arr[194] = button_194;
		arr[195] = button_195;

		btnNewButton = new JButton();
		btnNewButton.setFont(new Font("Comic Sans MS", Font.BOLD, 12));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnNewButton.setText("");
				button_196.setText("");
				button_197.setText("");
				button_198.setText("");
				button_199.setText("");
				button_200.setText("");
				ayuda2.setSelected(false);
				ayuda1.setSelected(false);
				// Comenzar jugada con color Rojo.
				Query q4 = new Query("comenzar(0)");
				q4.hasSolution();
				// Obtengo todas las celdas desde la base de datos.
				Query q3 = new Query("celda(X,Y)");
				while (q3.hasMoreSolutions()) {
					java.util.Hashtable s = q3.nextSolution();
					int x = Integer.parseInt(s.get("X").toString());
					int y = Integer.parseInt(s.get("Y").toString());
					arr[x - 1].setContentAreaFilled(false);
					arr[x - 1].setOpaque(true);
					pintar(x, y);
				}
				actualizarTurno();
				// Verifico si gane el juego.
				Query q = new Query("chequearVictoria(0)");
				if (q.hasSolution())
					ganar();
			}
		});
		btnNewButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton.setBorder(UIManager.getBorder("Button.border"));
		btnNewButton.setBounds(10, 45, 48, 44);
		contentPane.add(btnNewButton);
		btnNewButton.setBackground(Color.RED);
		btnNewButton.setContentAreaFilled(false);
		btnNewButton.setOpaque(true);

		button_196 = new JButton("");
		button_196.setFont(new Font("Comic Sans MS", Font.BOLD, 12));
		button_196.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnNewButton.setText("");
				button_196.setText("");
				button_197.setText("");
				button_198.setText("");
				button_199.setText("");
				button_200.setText("");
				ayuda2.setSelected(false);
				ayuda1.setSelected(false);
				// Comienzo jugada con el boton Violeta.
				Query q4 = new Query("comenzar(1)");
				q4.hasSolution();
				// Obtengo todas las celdas desde la base de datos.
				Query q3 = new Query("celda(X,Y)");
				while (q3.hasMoreSolutions()) {
					java.util.Hashtable s = q3.nextSolution();
					int x = Integer.parseInt(s.get("X").toString());
					int y = Integer.parseInt(s.get("Y").toString());
					arr[x - 1].setContentAreaFilled(false);
					arr[x - 1].setOpaque(true);
					pintar(x, y);
				}
				actualizarTurno();
				// Verifico si gane el juego.
				Query q = new Query("chequearVictoria(1)");
				if (q.hasSolution())
					ganar();
			}
		});
		button_196.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		button_196.setBorder(UIManager.getBorder("Button.border"));
		button_196.setBounds(68, 45, 48, 44);
		contentPane.add(button_196);
		button_196.setBackground(Color.MAGENTA);
		button_196.setContentAreaFilled(false);
		button_196.setOpaque(true);

		button_197 = new JButton("");
		button_197.setFont(new Font("Comic Sans MS", Font.BOLD, 12));
		button_197.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnNewButton.setText("");
				button_196.setText("");
				button_197.setText("");
				button_198.setText("");
				button_199.setText("");
				button_200.setText("");
				ayuda2.setSelected(false);
				ayuda1.setSelected(false);
				// Inicio la jugada con el color Rosa.
				Query q4 = new Query("comenzar(2)");
				q4.hasSolution();
				// Obtengo las celdas desde la base de datos.
				Query q3 = new Query("celda(X,Y)");
				while (q3.hasMoreSolutions()) {
					java.util.Hashtable s = q3.nextSolution();
					int x = Integer.parseInt(s.get("X").toString());
					int y = Integer.parseInt(s.get("Y").toString());
					arr[x - 1].setContentAreaFilled(false);
					arr[x - 1].setOpaque(true);
					pintar(x, y);
				}
				actualizarTurno();
				// Verifico si gane el juego.
				Query q = new Query("chequearVictoria(2)");
				if (q.hasSolution())
					ganar();
			}
		});
		button_197.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		button_197.setBorder(UIManager.getBorder("Button.border"));
		button_197.setBounds(126, 45, 48, 44);
		contentPane.add(button_197);
		button_197.setBackground(Color.PINK);
		button_197.setContentAreaFilled(false);
		button_197.setOpaque(true);

		button_198 = new JButton("");
		button_198.setFont(new Font("Comic Sans MS", Font.BOLD, 12));
		button_198.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnNewButton.setText("");
				button_196.setText("");
				button_197.setText("");
				button_198.setText("");
				button_199.setText("");
				button_200.setText("");
				ayuda2.setSelected(false);
				ayuda1.setSelected(false);
				// Comienzo la jugada con el color Verde.
				Query q4 = new Query("comenzar(3)");
				q4.hasSolution();
				// Obtengo las celdas desde la base de datos.
				Query q3 = new Query("celda(X,Y)");
				while (q3.hasMoreSolutions()) {
					java.util.Hashtable s = q3.nextSolution();
					int x = Integer.parseInt(s.get("X").toString());
					int y = Integer.parseInt(s.get("Y").toString());
					arr[x - 1].setContentAreaFilled(false);
					arr[x - 1].setOpaque(true);
					pintar(x, y);
				}
				actualizarTurno();
				// Verifico si gane el juego.
				Query q = new Query("chequearVictoria(3)");
				if (q.hasSolution())
					ganar();
			}
		});
		button_198.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		button_198.setBorder(UIManager.getBorder("Button.border"));
		button_198.setBackground(Color.GREEN);
		button_198.setContentAreaFilled(false);
		button_198.setOpaque(true);
		button_198.setBounds(10, 100, 48, 44);
		contentPane.add(button_198);

		button_199 = new JButton("");
		button_199.setFont(new Font("Comic Sans MS", Font.BOLD, 12));
		button_199.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnNewButton.setText("");
				button_196.setText("");
				button_197.setText("");
				button_198.setText("");
				button_199.setText("");
				button_200.setText("");
				ayuda2.setSelected(false);
				ayuda1.setSelected(false);
				// Cominezo la jugada con el color Celeste.
				Query q4 = new Query("comenzar(4)");
				q4.hasSolution();
				// Obtengo las celdas desde la base de datos.
				Query q3 = new Query("celda(X,Y)");
				while (q3.hasMoreSolutions()) {
					java.util.Hashtable s = q3.nextSolution();
					int x = Integer.parseInt(s.get("X").toString());
					int y = Integer.parseInt(s.get("Y").toString());
					arr[x - 1].setContentAreaFilled(false);
					arr[x - 1].setOpaque(true);
					pintar(x, y);
				}
				actualizarTurno();
				// Verifico si gane el juego.
				Query q = new Query("chequearVictoria(4)");
				if (q.hasSolution())
					ganar();
			}
		});
		button_199.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		button_199.setBorder(UIManager.getBorder("Button.border"));
		button_199.setBackground(Color.CYAN);
		button_199.setContentAreaFilled(false);
		button_199.setOpaque(true);
		button_199.setBounds(68, 100, 48, 44);
		contentPane.add(button_199);

		button_200 = new JButton("");
		button_200.setFont(new Font("Comic Sans MS", Font.BOLD, 12));
		button_200.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnNewButton.setText("");
				button_196.setText("");
				button_197.setText("");
				button_198.setText("");
				button_199.setText("");
				button_200.setText("");
				ayuda2.setSelected(false);
				ayuda1.setSelected(false);
				// Comienzo la jugada con el color amarillo.
				Query q4 = new Query("comenzar(5)");
				q4.hasSolution();
				// Obtengo las celdas desde la base de datos.
				Query q3 = new Query("celda(X,Y)");
				while (q3.hasMoreSolutions()) {
					java.util.Hashtable s = q3.nextSolution();
					int x = Integer.parseInt(s.get("X").toString());
					int y = Integer.parseInt(s.get("Y").toString());
					arr[x - 1].setContentAreaFilled(false);
					arr[x - 1].setOpaque(true);
					pintar(x, y);
				}
				actualizarTurno();
				// Verifico si gane el juego.
				Query q = new Query("chequearVictoria(5)");
				if (q.hasSolution())
					ganar();
			}
		});
		button_200.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		button_200.setBorder(UIManager.getBorder("Button.border"));
		button_200.setBackground(Color.YELLOW);
		button_200.setContentAreaFilled(false);
		button_200.setOpaque(true);
		button_200.setBounds(126, 100, 48, 44);
		contentPane.add(button_200);

		JLabel lblTurnos = new JLabel("TURNOS");
		lblTurnos.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblTurnos.setForeground(UIManager.getColor("ToggleButton.highlight"));
		lblTurnos.setBackground(UIManager
				.getColor("ToolBar.floatingBackground"));
		lblTurnos.setBounds(20, 164, 87, 35);
		contentPane.add(lblTurnos);

		label = new JLabel("0");
		label.setForeground(Color.WHITE);
		label.setFont(new Font("Tahoma", Font.PLAIN, 20));
		label.setBackground(SystemColor.menu);
		label.setBounds(124, 164, 87, 35);
		contentPane.add(label);

		btnJugarDeNuevo = new JButton("Jugar de nuevo");
		btnJugarDeNuevo.setForeground(Color.BLACK);
		btnJugarDeNuevo.setEnabled(false);
		btnJugarDeNuevo.setVisible(false);
		btnJugarDeNuevo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnNewButton.setEnabled(false);
				button_196.setEnabled(true);
				button_197.setEnabled(true);
				button_198.setEnabled(true);
				button_199.setEnabled(true);
				button_200.setEnabled(true);
				btnNewButton.setText("");
				button_196.setText("");
				button_197.setText("");
				button_198.setText("");
				button_199.setText("");
				button_200.setText("");

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
		btnJugarDeNuevo.setFont(new Font("Comic Sans MS", Font.BOLD, 16));
		btnJugarDeNuevo.setBounds(20, 365, 154, 43);
		contentPane.add(btnJugarDeNuevo);

		ayuda1 = new JCheckBox("Ayuda1");
		ayuda1.setFont(new Font("Comic Sans MS", Font.BOLD, 12));
		ayuda1.setBounds(10, 206, 78, 35);
		contentPane.add(ayuda1);
		ayuda1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ayuda2.setSelected(false);
				// Lamo a ayuda con el color Rojo.
				Query q0 = new Query("ayuda(0,Cant)");
				// Lamo a ayuda con el color Violeta.
				Query q1 = new Query("ayuda(1,Cant)");
				// Lamo a ayuda con el color Rosa.
				Query q2 = new Query("ayuda(2,Cant)");
				// Lamo a ayuda con el color Verde.
				Query q3 = new Query("ayuda(3,Cant)");
				// Lamo a ayuda con el color Celeste.
				Query q4 = new Query("ayuda(4,Cant)");
				// Lamo a ayuda con el color Amarillo.
				Query q5 = new Query("ayuda(5,Cant)");
				while (q0.hasMoreSolutions()) {
					java.util.Hashtable s = q0.nextSolution();
					int cant = Integer.parseInt(s.get("Cant").toString());
					btnNewButton.setText("" + cant);
				}
				while (q1.hasMoreSolutions()) {
					java.util.Hashtable s = q1.nextSolution();
					int cant = Integer.parseInt(s.get("Cant").toString());
					button_196.setText("" + cant);
				}
				while (q2.hasMoreSolutions()) {
					java.util.Hashtable s = q2.nextSolution();
					int cant = Integer.parseInt(s.get("Cant").toString());
					button_197.setText("" + cant);
				}
				while (q3.hasMoreSolutions()) {
					java.util.Hashtable s = q3.nextSolution();
					int cant = Integer.parseInt(s.get("Cant").toString());
					button_198.setText("" + cant);
				}
				while (q4.hasMoreSolutions()) {
					java.util.Hashtable s = q4.nextSolution();
					int cant = Integer.parseInt(s.get("Cant").toString());
					button_199.setText("" + cant);
				}
				while (q5.hasMoreSolutions()) {
					java.util.Hashtable s = q5.nextSolution();
					int cant = Integer.parseInt(s.get("Cant").toString());
					button_200.setText("" + cant);
				}
			}
		});
		ayuda2 = new JCheckBox("Ayuda2");
		ayuda2.setFont(new Font("Comic Sans MS", Font.BOLD, 12));
		ayuda2.setBounds(10, 251, 78, 35);
		contentPane.add(ayuda2);
		ayuda2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ayuda1.setSelected(false);
				// Lamo a ayuda con el color Rojo.
				Query q0 = new Query("ayuda2(0,Cant)");
				// Lamo a ayuda con el color Violeta.
				Query q1 = new Query("ayuda2(1,Cant)");
				// Lamo a ayuda con el color Rosa.
				Query q2 = new Query("ayuda2(2,Cant)");
				// Lamo a ayuda con el color Verde.
				Query q3 = new Query("ayuda2(3,Cant)");
				// Lamo a ayuda con el color Celeste.
				Query q4 = new Query("ayuda2(4,Cant)");
				// Lamo a ayuda con el color Amarillo.
				Query q5 = new Query("ayuda2(5,Cant)");

				Hashtable[] s0 = q0.allSolutions();
				int cant0 = Integer.parseInt(s0[0].get("Cant").toString());
				btnNewButton.setText("" + cant0);

				Hashtable[] s1 = q1.allSolutions();
				int cant1 = Integer.parseInt(s1[0].get("Cant").toString());
				button_196.setText("" + cant1);

				Hashtable[] s2 = q2.allSolutions();
				int cant2 = Integer.parseInt(s2[0].get("Cant").toString());
				button_197.setText("" + cant2);

				Hashtable[] s3 = q3.allSolutions();
				int cant3 = Integer.parseInt(s3[0].get("Cant").toString());
				button_198.setText("" + cant3);

				Hashtable[] s4 = q4.allSolutions();
				int cant4 = Integer.parseInt(s4[0].get("Cant").toString());
				button_199.setText("" + cant4);

				Hashtable[] s5 = q5.allSolutions();
				int cant5 = Integer.parseInt(s5[0].get("Cant").toString());
				button_200.setText("" + cant5);
			}
		});

		// Consult Prolog.
		Query q1 = new Query("consult('Proyecto.pl')");
		q1.hasSolution();

		Query q;
		switch (grilla) {
		case 0:
			// Creo una grilla aleatoria.
			Query q7 = new Query("cambiarGrilla");
			q7.hasSolution();
			// Obtengo las celdas desde la base de datos.
			Query q2 = new Query("celda(X,Y)");
			while (q2.hasMoreSolutions()) {
				java.util.Hashtable s = q2.nextSolution();
				int x = Integer.parseInt(s.get("X").toString());
				int y = Integer.parseInt(s.get("Y").toString());
				arr[x - 1].setContentAreaFilled(false);
				arr[x - 1].setOpaque(true);
				pintar(x, y);
			}
			break;
		case 1:
			// Seleccion la grilla precargada numero 1.
			q = new Query("elegirGrilla(1)");
			q.hasSolution();
			break;
		case 2:
			// Seleccion la grilla precargada numero 2.
			q = new Query("elegirGrilla(2)");
			q.hasSolution();
			break;
		case 3:
			// Seleccion la grilla precargada numero 3.
			q = new Query("elegirGrilla(3)");
			q.hasSolution();
			break;
		case 4:
			// Seleccion la grilla precargada numero 4.
			q = new Query("elegirGrilla(4)");
			q.hasSolution();
			break;
		}

		// Pintar grilla inicial.
		Query q2 = new Query("celda(X,Y)");
		while (q2.hasMoreSolutions()) {
			java.util.Hashtable s = q2.nextSolution();
			int x = Integer.parseInt(s.get("X").toString());
			int y = Integer.parseInt(s.get("Y").toString());
			arr[x - 1].setContentAreaFilled(false);
			arr[x - 1].setOpaque(true);
			pintar(x, y);
		}
	}

	private void pintar(int x, int y) {
		switch (y) {
		case 0:
			arr[x - 1].setBackground(Color.RED);
			break;
		case 1:
			arr[x - 1].setBackground(Color.MAGENTA);
			break;
		case 2:
			arr[x - 1].setBackground(Color.PINK);
			break;
		case 3:
			arr[x - 1].setBackground(Color.GREEN);
			break;
		case 4:
			arr[x - 1].setBackground(Color.CYAN);
			break;
		case 5:
			arr[x - 1].setBackground(Color.YELLOW);
			break;
		}
	}

	private void actualizarTurno() {
		// Actualizo el contador de turno.
		Query turno = new Query("turno(X)");
		while (turno.hasMoreSolutions()) {
			java.util.Hashtable s = turno.nextSolution();
			String str = s.get("X").toString();
			label.setText(str);
		}
	}

	private void ganar() {
		JOptionPane.showMessageDialog(null, "Felicitaciones Ganaste!");
		btnNewButton.setEnabled(false);
		button_196.setEnabled(false);
		button_197.setEnabled(false);
		button_198.setEnabled(false);
		button_199.setEnabled(false);
		button_200.setEnabled(false);
		btnJugarDeNuevo.setVisible(true);
		btnJugarDeNuevo.setEnabled(true);
	}
}