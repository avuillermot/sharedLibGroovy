package avu

public class Environment {
  public static final Data = [:]
  public static final String Version = "1.0"
}

Environment.Data.push("INTC");
Environment.Data["INTC"].push("HTTP_PORT",8081);
