package fortuneminds;

public class LargetUsingTernary {

public int getLargest(int a, int b, int c) {
	int d = c > (a > b ? a : b) ? c: ((a > b) ? a : b);
	System.out.println(" Largest Number" + d);
	return d;
}
}
