package avu

public class Environment {
  public static final Data = [
    "INTC":["HTTP_PORT":"8081"],
    "TEST":["HTTP_PORT":"8082"],
    "PROD":["HTTP_PORT":"8083"]
  ]
  public static final String Version = "1.0"
  
  public static final getBranches() {
	def proc = "git ls-remote https://github.com/avuillermot/Tweed.git".execute();
	def outputStream = new StringBuffer();
	proc.waitForProcessOutput(outputStream, System.err);

	def results = outputStream.toString().split('\n');
	def back = new String[results.size() - 1];
	def index = 0;
	results.each{
	  if (it.split('/heads/').length > 1) {
		back.putAt(index,it.split('/heads/')[1]);
		index++;
	  }
	}

	return back;
  }
}