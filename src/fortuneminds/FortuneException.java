package fortuneminds;

public class FortuneException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 8987854523212521L;
	
	private final ErrorCode code;
	
	private static String discrpt;
	
	public FortuneException(ErrorCode code) {
		super();
		this.code = code;
	
	}
	
	public FortuneException(String str, Throwable thorw, ErrorCode code){
		
		super(discrpt, thorw);
		this.code = code;
	}

	/**
	 * @return the code
	 */
	public ErrorCode getCode() {
		return code;
	}

	/**
	 * @return the discrpt
	 */
	public String getDiscrpt() {
		return discrpt;
	}

}
