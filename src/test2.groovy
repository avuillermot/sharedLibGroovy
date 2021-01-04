package org.foo

class Example {
	string getHttpPort(String env) {
		if (env == 'INTC') return "8081";
		else return "8082";
	}
}