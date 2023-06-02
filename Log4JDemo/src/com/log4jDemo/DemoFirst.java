package com.log4jDemo;

import org.apache.logging.log4j.*;

public class DemoFirst {

	static Logger logger = LogManager.getLogger(DemoFirst.class);
	public static void main(String[] args) {
		System.out.println("Sysout statement");
		logger.info("info");
		logger.error("errors");
		logger.debug("debug");
		logger.fatal("Fatal");
	}

}
