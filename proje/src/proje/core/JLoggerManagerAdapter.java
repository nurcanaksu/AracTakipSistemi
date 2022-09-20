package proje.core;

import proje.jLogger.jLoggerManager;

public class JLoggerManagerAdapter implements LoggerService{

	
	@Override
	public void logToSystem(String message) {
		jLoggerManager manager = new jLoggerManager();
	    manager.Log(message);
	}
}
