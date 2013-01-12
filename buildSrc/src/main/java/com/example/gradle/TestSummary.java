package com.example.gradle;

import org.gradle.api.tasks.testing.TestDescriptor;
import org.gradle.api.tasks.testing.TestListener;
import org.gradle.api.tasks.testing.TestResult;

public class TestSummary implements TestListener {
    long numberOfTestsPassed;
    long numberOfTestsFailed;
    long numberOfTestsSkipped;

    public void beforeSuite(TestDescriptor suite) {
        numberOfTestsPassed = 0;
        numberOfTestsFailed = 0;
        numberOfTestsSkipped = 0;
    }

    public void afterSuite(TestDescriptor suite, TestResult result) {
        String suiteName = suite.getName();
        String className = suite.getClassName();
        System.out.printf("Test=%s/%s, tests passed=%d, tests failed=%d, test skipped=%d\n",
                suiteName, className, numberOfTestsPassed, numberOfTestsFailed, numberOfTestsSkipped);
    }

    public void beforeTest(TestDescriptor test) {
    }

    public void afterTest(TestDescriptor test, TestResult result) {
        numberOfTestsFailed += result.getFailedTestCount();
        numberOfTestsPassed += result.getSuccessfulTestCount();
        numberOfTestsSkipped += result.getSkippedTestCount();
    }
}

