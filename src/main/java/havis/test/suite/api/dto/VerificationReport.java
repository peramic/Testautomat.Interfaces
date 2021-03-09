package havis.test.suite.api.dto;

public class VerificationReport {
	private String verificationComment;
	private String verificationName;
	private String actualValue;
	private String expectedValue;
	private String valueDifference;
	
	public String getVerificationComment() {
		return verificationComment;
	}
	public void setVerificationComment(String verificationComment) {
		this.verificationComment = verificationComment;
	}
	public String getVerificationName() {
		return verificationName;
	}
	public void setVerificationName(String verificationName) {
		this.verificationName = verificationName;
	}
	public String getActualValue() {
		return actualValue;
	}
	public void setActualValue(String actualValue) {
		this.actualValue = actualValue;
	}
	public String getExpectedValue() {
		return expectedValue;
	}
	public void setExpectedValue(String expectedValue) {
		this.expectedValue = expectedValue;
	}
	public String getValueDifference() {
		return valueDifference;
	}
	public void setValueDifference(String valueDifference) {
		this.valueDifference = valueDifference;
	}
	
	
	
}
