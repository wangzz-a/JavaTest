package log4j2;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Thread2 extends Thread {
	
	private static final Logger log = LogManager.getLogger();
	
    public void run() {
		int i = 1;
		while(i>10000){
			log.error("OOOOO------error"+i);
			i++;
		}
    }
}
