package common;

import java.io.IOException;

public class DriverFactory {
	static Process process;

	/**
	 * This method Is responsible for starting appium server on windows.
	 */
	public static void appiumStartWindows() {
		String[] command = { "cmd.exe", "/C", "Start", "appium" };

		ProcessBuilder pb;
		if (process == null) {
			pb = new ProcessBuilder(command);
			try {
				process = pb.start();
			} catch (IOException e) {
				e.printStackTrace();
			}

		}
		if (process != null) {
			System.out.println("SERVER STARTED");
		}
	}

	/**
	 * This method Is responsible for starting appium server on mac.
	 */
	public static void appiumStartMac() {
		String[] command = { "/usr/bin/osascript", "-e", "tell app \"Terminal\"", "-e",
				"set currentTab to do script " + "(\"appium\")", "-e", "end tell" };
		final ProcessBuilder processBuilder;
		if (process == null) {
			try {
				processBuilder = new ProcessBuilder(command);
				process = processBuilder.start();
				process.waitFor();

			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		if (process != null) {
			System.out.println("SERVER STARTED");
		}
	}

}
