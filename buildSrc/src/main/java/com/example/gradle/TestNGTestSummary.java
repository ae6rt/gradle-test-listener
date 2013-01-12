package com.example.gradle;

import org.gradle.api.tasks.testing.TestDescriptor;
import org.gradle.api.tasks.testing.TestListener;
import org.gradle.api.tasks.testing.TestResult;

public class TestNGTestSummary implements TestListener {
    boolean printHeader = true;

    long numberOfTestsPassed;
    long numberOfTestsFailed;
    long numberOfTestsSkipped;

    public void beforeSuite(TestDescriptor suite) {
        numberOfTestsPassed = 0;
        numberOfTestsFailed = 0;
        numberOfTestsSkipped = 0;
    }

    public void afterSuite(TestDescriptor suite, TestResult result) {
        if (printHeader) {
            System.out.println("\nTest Summary:");
            printHeader = false;
        }
        String className = suite.getClassName();
        String suiteName = suite.getName();
        System.out.println(" testng suitename=" + suiteName);
//        if (className != null) {
//        System.out.printf(" Test=%s, tests passed=%d, tests failed=%d, test skipped=%d\n",
//                className, numberOfTestsPassed, numberOfTestsFailed, numberOfTestsSkipped);
//        }
    }

    public void beforeTest(TestDescriptor test) {
    }

    public void afterTest(TestDescriptor test, TestResult result) {
        numberOfTestsFailed += result.getFailedTestCount();
        numberOfTestsPassed += result.getSuccessfulTestCount();
        numberOfTestsSkipped += result.getSkippedTestCount();
    }
}

