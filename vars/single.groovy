def callAvu(String name = 'human') {
    echo "Hello, ${name}."
}

def envs = [:];
envs.put("INTC",[:]);
		envs.put("TEST",[:])
		envs.put("PROD",[:])
		envs["INTC"].put("HTTP_PORT",8081);
		envs["TEST"].put("HTTP_PORT",8082);
		envs["PROD"].put("HTTP_PORT",8083);

def getHttpPort(envs, String env) {
	return envs[env]["HTTP_PORT"];
}
