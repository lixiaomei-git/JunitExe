package simple;

public class ErrorResponse implements Response {
	private Request originalRequest;
	private Exception originalException;
	public ErrorResponse(Request request, Exception ex)
	{
		this.originalRequest = request;
		this.originalException = ex;
	}
	public Request getOriginalRequest() {
		return this.originalRequest;
	}
	public Exception getOriginalException() {
		return this.originalException;
	}

}
