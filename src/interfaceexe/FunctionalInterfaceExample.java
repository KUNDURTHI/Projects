package interfaceexe;
@FunctionalInterface
public interface FunctionalInterfaceExample {
	
abstract void show(String s);

default void exit(String s) {
	
	System.out.println(s);
}

}
