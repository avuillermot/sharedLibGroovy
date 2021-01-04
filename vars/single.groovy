def callAvu(String name = 'human') {
    echo "Hello, ${name}."
}

public class Envs {
  static def envs = [:];
  static void Init() {
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


def getHttpPort2(String env) {
	return Envs.envs[env]["HTTP_PORT"];
}

println getHttpPort2('INTC')