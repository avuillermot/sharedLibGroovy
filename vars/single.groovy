def callAvu(String name = 'human') {
    echo "Hello, ${name}."
}

def myEnv() {
	return ["intc","recette"];
}

def getHttpPort(String env) {
	if (env == 'INTC') return "8081";
	else return "8082";
}