package some.pack.name;

import org.slf4j.*;
import some.pack.name;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
		Logger logger = LoggerFactory.getLogger(App.class);
		logger.info("Hello World!");
    }
}
