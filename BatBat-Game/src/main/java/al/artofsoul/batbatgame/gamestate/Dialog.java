package al.artofsoul.batbatgame.gamestate;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

import al.artofsoul.batbatgame.main.GamePanel;

public class Dialog extends JDialog implements ActionListener {

	private static final long serialVersionUID = 2072911996817368496L;

	private JButton okButton = new JButton("ok");
	private JButton cancelButton = new JButton("cancel");

	private JRadioButton standard;
	private JRadioButton modified;
	private JRadioButton english;
	private JRadioButton hungarian;

	private ButtonGroup language_group;
	private ButtonGroup group;

	public Dialog() {
		super();
		JPanel inputpanel = new JPanel();
		inputpanel.setLayout(new FlowLayout(FlowLayout.CENTER));

		JPanel inputLanguagePanel = new JPanel();
		inputLanguagePanel.setLayout(new FlowLayout(FlowLayout.CENTER));

		standard = new JRadioButton("Standard", true);
		modified = new JRadioButton("Modified", false);

		english = new JRadioButton("English", true);
		hungarian = new JRadioButton("Hungarian", false);

		group = new ButtonGroup();
		group.add(standard);
		group.add(modified);

		language_group = new ButtonGroup();
		language_group.add(english);
		language_group.add(hungarian);

		inputpanel.add(new JLabel("Please choose keyboard layout"));
		inputpanel.add(standard);
		inputpanel.add(modified);

		inputLanguagePanel.add(new JLabel("Please choose a language"));
		inputLanguagePanel.add(english);
		inputLanguagePanel.add(hungarian);

		JPanel controll = new JPanel();
		controll.setLayout(new FlowLayout(FlowLayout.CENTER));

		controll.add(okButton);
		okButton.addActionListener(this);

		controll.add(cancelButton);
		cancelButton.addActionListener(this);

		JPanel dialogPanel = new JPanel();

		dialogPanel.setLayout(new BorderLayout());
		dialogPanel.add(inputpanel, BorderLayout.CENTER);
		dialogPanel.add(inputLanguagePanel, BorderLayout.NORTH);
		dialogPanel.add(controll, BorderLayout.SOUTH);

		getContentPane().add(dialogPanel);

		pack();
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (okButton == e.getSource()) {

			GamePanel.setStandardcontroll(!(modified.isSelected()));

			if (hungarian.isSelected()) {
				GameStateManager.languageState(false);
				setVisible(false);
			} else {
				GameStateManager.languageState(true);
				setVisible(false);
			}
		} else if (cancelButton == e.getSource()) {
			setVisible(false);
		}
	}

	public JButton getOkButton() {
		return okButton;
	}

	public void setOkButton(JButton okButton) {
		this.okButton = okButton;
	}

	public JButton getCancelButton() {
		return cancelButton;
	}

	public void setCancelButton(JButton cancelButton) {
		this.cancelButton = cancelButton;
	}

	public JRadioButton getStandard() {
		return standard;
	}

	public void setStandard(JRadioButton standard) {
		this.standard = standard;
	}

	public JRadioButton getModified() {
		return modified;
	}

	public void setModified(JRadioButton modified) {
		this.modified = modified;
	}

	public JRadioButton getEnglish() {
		return english;
	}

	public void setEnglish(JRadioButton english) {
		this.english = english;
	}

	public JRadioButton getHungarian() {
		return hungarian;
	}

	public void setHungarian(JRadioButton hungarian) {
		this.hungarian = hungarian;
	}

	public ButtonGroup getLanguage_group() {
		return language_group;
	}

	public void setLanguage_group(ButtonGroup language_group) {
		this.language_group = language_group;
	}

	public ButtonGroup getGroup() {
		return group;
	}

	public void setGroup(ButtonGroup group) {
		this.group = group;
	}

}
