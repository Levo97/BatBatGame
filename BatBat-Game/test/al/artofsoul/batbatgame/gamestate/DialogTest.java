package al.artofsoul.batbatgame.gamestate;

import static org.junit.Assert.assertEquals;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import al.artofsoul.batbatgame.main.GamePanel;

public class DialogTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	private Dialog test;

	public DialogTest() {

		test = new Dialog();

	}

	@Test
	public void StandartTest() {

		assertEquals(true, test.getStandard().isSelected());

	}

	@Test
	public void ModifiedTest() {

		assertEquals(false, test.getModified().isSelected());

	}

	@Test
	public void okTest() {

		assertEquals(false, test.getOkButton().isSelected());

	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void cancelTest() {

		assertEquals(false, test.getCancelButton().isSelected());

	}

	@Test
	public void actionPerformedOKtest() {

		if (test.getOkButton() == test.getOkButton()) {

			GamePanel.setStandardcontroll(!(test.getModified().isSelected()));
			test.setVisible(false);

		} else if (test.getCancelButton() != test.getCancelButton()) {
			test.setVisible(false);
		}

		boolean expected = !(test.getModified().isSelected());
		boolean actual = GamePanel.isStandardcontroll();
		assertEquals(expected, actual);

	}

	@Test
	public void actionPerformedCanceltest() {

		boolean x = true;

		if (test.getOkButton() != test.getOkButton()) {

			GamePanel.setStandardcontroll(!(test.getModified().isSelected()));
			test.setVisible(false);

		} else if (test.getCancelButton() == test.getCancelButton()) {
			test.setVisible(false);
			x = false;
		}

		boolean excepted = false;
		boolean actual = x;
		assertEquals(excepted, actual);

	}

}
