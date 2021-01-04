package avu

public class Environment {
  public static final Data = [
    "INTC":["HTTP_PORT":"8081"],
    "TEST":["HTTP_PORT":"8082"],
    "PROD":["HTTP_PORT":"8083"]
  ]
  public static final String Version = "1.0"
  
  public static final getBranches() {
	def proc = "git ls-remote https://github.com/avuillermot/Tweed  |  awk '{print \$2}'".execute();
	def outputStream = new StringBuffer();
	proc.waitForProcessOutput(outputStream, System.err);
	println(outputStream.toString());
  }
}