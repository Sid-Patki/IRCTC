package com.demo.utilties;

import java.io.File;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ReporterGenerator {
	public ExtentSparkReporter esr; //aventstack dep
	public ExtentReports extent;
	public void extentreport() {
		ExtentSparkReporter esr = new ExtentSparkReporter(new File(System.getProperty("User.dir")+"./Report/report_.html"));
	    extent = new ExtentReports();
	    extent.attachReporter(esr);
	}
}

