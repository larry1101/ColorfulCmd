package dou.colorfulcmd;

/**
 * ccmd≤‚ ‘¿‡
 * @author ladoudou
 *
 */
public class MainTest {

	public static void main(String[] args) {
		
		System.out.println("java.library.path:");
		System.out.println(System.getProperty("java.library.path"));
		
		System.out.println("default");
		Colorful.setFGColor(FGColor.WHITE);
		System.out.println("WHITE");
		Colorful.setFGColor(FGColor.RED);
		System.out.println("RED");
		Colorful.setFGColor(FGColor.YELLOW);
		System.out.println("YELLOW");
		Colorful.setFGColor(FGColor.GREEN);
		System.out.println("GREEN");
		Colorful.setFGColor(FGColor.CYAN);
		System.out.println("CYAN");
		Colorful.setFGColor(FGColor.BLUE);
		System.out.println("BLUE");
		Colorful.setFGColor(FGColor.PURPLE);
		System.out.println("PURPLE");
		Colorful.defaultColor();
		System.out.println("DEFAULT");
		Colorful.setBGColor(BGColor.GREEN);
		System.out.println("Background GREEN");
		Colorful.setFGColor(FGColor.BLUE);
		System.out.println("BLUE");
		Colorful.setFGColor(FGColor.PURPLE);
		System.out.println("PURPLE");
		Colorful.defaultColor();
		System.out.println("default");
		Colorful.setFGColor(FGColor.GRAY);
		System.out.println("GRAY");
		Colorful.defaultColor();
		System.out.println("default");
		Colorful.setBGColor(BGColor.GREEN);
		System.out.println("Background GREEN");
		Colorful.setBGColor(BGColor.RED);
		System.out.println("Background RED");
		Colorful.setColor(FGColor.YELLOW, BGColor.RED);
		System.out.println("FGColor.YELLOW, Background RED");
		Colorful.setBGColor(BGColor.BLACK);
		System.out.println("Background BLACK");
		Colorful.setBGColor(BGColor.WHITE);
		System.out.println("Background WHITE");
		Colorful.setBGColor(BGColor.GRAY);
		System.out.println("Background GRAY");
		Colorful.setBGColor(BGColor.HIGH_WHITE);
		System.out.println("Background HIGH_WHITE");
		Colorful.defaultColor();
		
		
	}

}
