package dou.colorfulcmd;

/**
 * colorfulcmd jarÖ÷Àà
 * @author ladoudou
 *
 */
public class Colorful {
	private static int DEFAULT_COLOR;
	private static boolean OK = false;
	static {
		try {
			System.loadLibrary("ColorfulCmd");
			OK = true;
			DEFAULT_COLOR = getDefaultColor();
		} catch (UnsatisfiedLinkError e) {
			System.err.println("Error: no ColorfulCmd.dll in java.library.path, nothing will change.");
			OK = false;
		}
	}

	private native static int _getDefaultColor();

	private native static void _setFGColor(int fGColor);

	private native static void _setBGColor(int bGColor);

	private native static void _setColor(int fGColor, int bGColor);

	private native static void _setColor(int color);

	public static void defaultColor() {
		if (OK) {
			setColor(DEFAULT_COLOR);
		}
	}

	public static int getDefaultColor() {
		if (OK) {
			return _getDefaultColor();
		}else {
			return FGColor.WHITE|BGColor.BLACK;
		}
	}

	public static void setFGColor(int fGColor) {
		if (OK) {
			_setFGColor(fGColor);
		}
	}

	public static void setBGColor(int bGColor) {
		if (OK) {
			_setBGColor(bGColor);
		}
	}

	public static void setColor(int fGColor, int bGColor) {
		if (OK) {
			_setColor(fGColor, bGColor);
		}
	}

	public static void setColor(int color) {
		if (OK) {
			_setColor(color);
		}
	}


}

