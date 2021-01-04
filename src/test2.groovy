class Example {
	String getHttpPort(String env) {
		if (env == 'INTC') return "8081";
		else return "8082";
	}
}