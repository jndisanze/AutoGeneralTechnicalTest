package au.autogeneral.api.exception;

public class ErrorDetails {
	 private String location;
	 private String param;
	 private String msg;
	 private String value;

	 public String getLocation() {
	  return location;
	 }

	 public String getParam() {
	  return param;
	 }

	 public String getMsg() {
	  return msg;
	 }

	 public String getValue() {
	  return value;
	 }
	 public void setLocation(String location) {
	  this.location = location;
	 }
	 public void setParam(String param) {
	  this.param = param;
	 }
	 public void setMsg(String msg) {
	  this.msg = msg;
	 }
	 public void setValue(String value) {
	  this.value = value;
	 }
}