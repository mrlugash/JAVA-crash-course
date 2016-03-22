package org.apache.maven;
import com.google.common.hash.*;
import java.nio.charset.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

HashFunction hf = Hashing.sha1();
HashCode hashCode = hf.hashString(new StringBuffer("Hello World"), StandardCharsets.UTF_8);
System.out.println(hashCode.toString());

	
    }

}


