def callAvu(String name = 'human') {
    echo "Hello, ${name}."
}

public class Envs {
  public static def envs = [:];
  public static void Init() {
		println "Environment value initialization"
		envs.put("INTC",[:]);
		envs.put("TEST",[:])
		envs.put("PROD",[:])
		envs["INTC"].put("HTTP_PORT",8081);
		envs["TEST"].put("HTTP_PORT",8082);
		envs["PROD"].put("HTTP_PORT",8083);
	}
  
	static String getHttpPort(String env) {
		return envs[env]["HTTP_PORT"];
	}
}

Envs.Init();


