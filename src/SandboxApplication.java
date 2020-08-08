/**
 * SandboxApplication Java Sample Program
 * 
 * Voraussetzung: ein Java Developer Kit ist installiert
 * 
 * Linux (Debian/Ubuntu): sudo apt-get install openjdk-8-jdk  
 *
 * VS Code: Java Extension Pack (Microsoft)
 *   Strg + ',' ==> "java.home"
 */

import java.util.*;

public class SandboxApplication {

  public static void main(final String args[]) {
    System.out.println("\nApplication Class: " + SandboxApplication.class.getName());
    
    final SandboxApplication app = new SandboxApplication();
    app.run(args);
  }

  public void run(final String args[]) {
    System.out.println("Enter method run()");

    Hashtable<String, String> ht = new Hashtable<String, String>();
    ht.put("TOR1", "Manuel Neuer");
    ht.put("TOR2", "Sven Ulreich");
    ht.put("STURM1", "Thomas Müller");
    ht.put("STURM2", "Robert Lewandowski");
    
    Enumeration<String> names = ht.keys();
    while (names.hasMoreElements()) {
      String key = (String) names.nextElement();
      System.out.println(key + ": " + ht.get(key));
    }
  }

}