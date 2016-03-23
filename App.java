package org.apache.maven;
import com.google.common.hash.*;
import java.nio.charset.*;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) {
        System.out.println( "Hello World!" );
        // staci "Hello world", neni treba ten StringBuffer 
        // +1 za StandardCharsets
	HashCode hashCode = Hashing.sha1().hashString("Hello World", StandardCharsets.UTF_8);
	System.out.println(hashCode.toString());
    }
}


