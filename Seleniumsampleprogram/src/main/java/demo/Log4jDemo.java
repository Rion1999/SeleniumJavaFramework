package demo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log4jDemo {
	static Logger logger=LogManager.getLogger("Log4jDemo ");

	public static void main(String[] args) {
		System.out.println("\n     Hello World      \n");
		logger.trace("trace");
		logger.info("info");
		logger.error("error");
		logger.warn("warn");
		logger.fatal("fatal");
		System.out.println("Completed");

	}

}
