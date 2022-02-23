package kodlamaio.hrms.core.utilities.results;

public class Result {
	
	private boolean succes;
	private String message;
	
	public Result(boolean success) {
		this.succes = success;
	}
	
	public Result(boolean success, String message) {
		this(success);
		this.message = message;
	}
	
	public boolean isSuccess() {
		return this.succes;
	}
	
	public String getMessage() {
		return this.message;
	}
	
	
}
