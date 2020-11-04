package fortuneminds;

public class ErrorCode {

	private static int code;
	
	private static String discrption;

	/**
	 * @return the code
	 */
	public static int getCode() {
		return code;
	}

	/**
	 * @param code the code to set
	 */
	public static void setCode(int code) {
		ErrorCode.code = code;
	}

	/**
	 * @return the discrption
	 */
	public static String getDiscrption() {
		return discrption;
	}

	/**
	 * @param discrption the discrption to set
	 */
	public static void setDiscrption(String discrption) {
		ErrorCode.discrption = discrption;
	}
	
	
	
}
