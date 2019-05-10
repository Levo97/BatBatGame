package al.artofsoul.batbatgame.handlers;

import java.awt.event.KeyEvent;

/**
 * @author ArtOfSoul
 */

// this class contains a boolean array of current and previous key states
// for the 10 keys that are used for this game.
// a key k is down when keyState[k] is true.

public class Keys {

	public static final int NUM_KEYS = 50;// 16;
	public static final int UP = 0;
	public static final int LEFT = 1;
	public static final int DOWN = 2;
	public static final int RIGHT = 3;
	public static final int BUTTON1 = 4;
	public static final int BUTTON2 = 5;
	public static final int BUTTON3 = 6;
	public static final int BUTTON4 = 7;
	public static final int ENTER = 8;
	public static final int ESCAPE = 9;
	public static final int A = 10;
	public static final int B = 11;
	public static final int C = 12;
	public static final int D = 13;
	public static final int E = 14;
	public static final int F = 15;
	public static final int G = 16;
	public static final int H = 17;
	public static final int J = 18;
	public static final int K = 19;
	public static final int L = 20;
	public static final int M = 21;
	public static final int N = 22;
	public static final int P = 23;
	public static final int Q = 24;
	public static final int R = 25;
	public static final int T = 26;
	public static final int Z = 27;
	public static final int W = 28;
	public static final int Y = 29;
	public static final int X = 30;
	public static final int I = 31;
	public static final int U = 32;
	public static final int O = 33;
	public static final int S = 34;
	public static final int V = 47;
	public static final int BACK = 35;
	public static final int NULL = 36;
	public static final int ONE = 37;
	public static final int TWO = 38;
	public static final int THREE = 39;
	public static final int FOUR = 40;
	public static final int FIVE = 41;
	public static final int SIX = 42;
	public static final int SEVEN = 43;
	public static final int EIGHT = 44;
	public static final int NINE = 45;
	public static final int SHIFT = 46;
	private static final boolean[] KEY_STATE = new boolean[NUM_KEYS];
	private static boolean[] prevKeyState = new boolean[NUM_KEYS];

	private Keys() {
		throw new IllegalStateException("Utility Class");
	}

	public static void keySet1(int i, boolean b) {
		if (i == KeyEvent.VK_UP)
			getKeyState()[UP] = b;
		else if (i == KeyEvent.VK_LEFT)
			getKeyState()[LEFT] = b;
		else if (i == KeyEvent.VK_DOWN)
			getKeyState()[DOWN] = b;
		else if (i == KeyEvent.VK_RIGHT)
			getKeyState()[RIGHT] = b;
		else if (i == KeyEvent.VK_SPACE)
			getKeyState()[BUTTON1] = b;
		else if (i == KeyEvent.VK_E)
			getKeyState()[BUTTON2] = b;
		else if (i == KeyEvent.VK_X)
			getKeyState()[BUTTON3] = b;
		else if (i == KeyEvent.VK_Y)
			getKeyState()[BUTTON4] = b;
		else if (i == KeyEvent.VK_ENTER)
			getKeyState()[ENTER] = b;
		else if (i == KeyEvent.VK_ESCAPE)
			getKeyState()[ESCAPE] = b;
		else if (i == KeyEvent.VK_SHIFT)
			getKeyState()[SHIFT] = b;
		// TODO
		else if (i == KeyEvent.VK_A)
			getKeyState()[A] = b;
		else if (i == KeyEvent.VK_B)
			getKeyState()[B] = b;
		else if (i == KeyEvent.VK_C)
			getKeyState()[C] = b;
		else if (i == KeyEvent.VK_D)
			getKeyState()[D] = b;
		else if (i == KeyEvent.VK_E)
			getKeyState()[E] = b;
		else if (i == KeyEvent.VK_F)
			getKeyState()[F] = b;
		else if (i == KeyEvent.VK_G)
			getKeyState()[G] = b;
		else if (i == KeyEvent.VK_H)
			getKeyState()[H] = b;
		else if (i == KeyEvent.VK_J)
			getKeyState()[J] = b;
		else if (i == KeyEvent.VK_K)
			getKeyState()[K] = b;
		else if (i == KeyEvent.VK_L)
			getKeyState()[L] = b;
		else if (i == KeyEvent.VK_M)
			getKeyState()[M] = b;
		else if (i == KeyEvent.VK_N)
			getKeyState()[N] = b;
		else if (i == KeyEvent.VK_P)
			getKeyState()[P] = b;
		else if (i == KeyEvent.VK_Q)
			getKeyState()[Q] = b;
		else if (i == KeyEvent.VK_R)
			getKeyState()[R] = b;
		else if (i == KeyEvent.VK_T)
			getKeyState()[T] = b;
		else if (i == KeyEvent.VK_Z)
			getKeyState()[Z] = b;
		else if (i == KeyEvent.VK_W)
			getKeyState()[W] = b;
		else if (i == KeyEvent.VK_I)
			getKeyState()[I] = b;
		else if (i == KeyEvent.VK_U)
			getKeyState()[U] = b;
		else if (i == KeyEvent.VK_O)
			getKeyState()[O] = b;
		else if (i == KeyEvent.VK_S)
			getKeyState()[S] = b;
		else if (i == KeyEvent.VK_V)
			getKeyState()[V] = b;
		else if (i == KeyEvent.VK_BACK_SPACE)
			getKeyState()[BACK] = b;
		else if (i == KeyEvent.VK_0)
			getKeyState()[NULL] = b;
		else if (i == KeyEvent.VK_1)
			getKeyState()[ONE] = b;
		else if (i == KeyEvent.VK_2)
			getKeyState()[TWO] = b;
		else if (i == KeyEvent.VK_3)
			getKeyState()[THREE] = b;
		else if (i == KeyEvent.VK_4)
			getKeyState()[FOUR] = b;
		else if (i == KeyEvent.VK_5)
			getKeyState()[FIVE] = b;
		else if (i == KeyEvent.VK_6)
			getKeyState()[SIX] = b;
		else if (i == KeyEvent.VK_7)
			getKeyState()[SEVEN] = b;
		else if (i == KeyEvent.VK_8)
			getKeyState()[EIGHT] = b;
		else if (i == KeyEvent.VK_9)
			getKeyState()[NINE] = b;
	}

	public static void keySet2(int i, boolean b) {
		if (i == KeyEvent.VK_UP)
			getKeyState()[UP] = b;
		else if (i == KeyEvent.VK_A)
			getKeyState()[LEFT] = b;
		else if (i == KeyEvent.VK_DOWN)
			getKeyState()[DOWN] = b;
		else if (i == KeyEvent.VK_D)
			getKeyState()[RIGHT] = b;
		else if (i == KeyEvent.VK_W)
			getKeyState()[BUTTON1] = b;
		else if (i == KeyEvent.VK_R)
			getKeyState()[BUTTON2] = b;
		else if (i == KeyEvent.VK_E)
			getKeyState()[BUTTON3] = b;
		else if (i == KeyEvent.VK_Q)
			getKeyState()[BUTTON4] = b;
		else if (i == KeyEvent.VK_ENTER)
			getKeyState()[ENTER] = b;
		else if (i == KeyEvent.VK_ESCAPE)
			getKeyState()[ESCAPE] = b;
		else if (i == KeyEvent.VK_SHIFT)
			getKeyState()[SHIFT] = b;
		// TODO
		else if (i == KeyEvent.VK_A)
			getKeyState()[A] = b;
		else if (i == KeyEvent.VK_B)
			getKeyState()[B] = b;
		else if (i == KeyEvent.VK_C)
			getKeyState()[C] = b;
		else if (i == KeyEvent.VK_D)
			getKeyState()[D] = b;
		else if (i == KeyEvent.VK_E)
			getKeyState()[E] = b;
		else if (i == KeyEvent.VK_F)
			getKeyState()[F] = b;
		else if (i == KeyEvent.VK_G)
			getKeyState()[G] = b;
		else if (i == KeyEvent.VK_H)
			getKeyState()[H] = b;
		else if (i == KeyEvent.VK_J)
			getKeyState()[J] = b;
		else if (i == KeyEvent.VK_K)
			getKeyState()[K] = b;
		else if (i == KeyEvent.VK_L)
			getKeyState()[L] = b;
		else if (i == KeyEvent.VK_M)
			getKeyState()[M] = b;
		else if (i == KeyEvent.VK_N)
			getKeyState()[N] = b;
		else if (i == KeyEvent.VK_P)
			getKeyState()[P] = b;
		else if (i == KeyEvent.VK_Q)
			getKeyState()[Q] = b;
		else if (i == KeyEvent.VK_R)
			getKeyState()[R] = b;
		else if (i == KeyEvent.VK_T)
			getKeyState()[T] = b;
		else if (i == KeyEvent.VK_Z)
			getKeyState()[Z] = b;
		else if (i == KeyEvent.VK_W)
			getKeyState()[W] = b;
		else if (i == KeyEvent.VK_Y)
			getKeyState()[Y] = b;
		else if (i == KeyEvent.VK_X)
			getKeyState()[X] = b;
		else if (i == KeyEvent.VK_I)
			getKeyState()[I] = b;
		else if (i == KeyEvent.VK_U)
			getKeyState()[U] = b;
		else if (i == KeyEvent.VK_O)
			getKeyState()[O] = b;
		else if (i == KeyEvent.VK_S)
			getKeyState()[S] = b;
		else if (i == KeyEvent.VK_V)
			getKeyState()[V] = b;
		else if (i == KeyEvent.VK_BACK_SPACE)
			getKeyState()[BACK] = b;
		else if (i == KeyEvent.VK_0)
			getKeyState()[NULL] = b;
		else if (i == KeyEvent.VK_1)
			getKeyState()[ONE] = b;
		else if (i == KeyEvent.VK_2)
			getKeyState()[TWO] = b;
		else if (i == KeyEvent.VK_3)
			getKeyState()[THREE] = b;
		else if (i == KeyEvent.VK_4)
			getKeyState()[FOUR] = b;
		else if (i == KeyEvent.VK_5)
			getKeyState()[FIVE] = b;
		else if (i == KeyEvent.VK_6)
			getKeyState()[SIX] = b;
		else if (i == KeyEvent.VK_7)
			getKeyState()[SEVEN] = b;
		else if (i == KeyEvent.VK_8)
			getKeyState()[EIGHT] = b;
		else if (i == KeyEvent.VK_9)
			getKeyState()[NINE] = b;
	}

	public static void update() {
		for (int i = 0; i < NUM_KEYS; i++) {
			prevKeyState[i] = getKeyState()[i];
		}
	}

	public static boolean isPressed(int i) {
		return getKeyState()[i] && !prevKeyState[i];
	}

	public static boolean anyKeyPress() {
		for (int i = 0; i < NUM_KEYS; i++) {
			if (getKeyState()[i])
				return true;
		}
		return false;
	}

	public static boolean[] getKeyState() {
		return KEY_STATE;
	}

}
