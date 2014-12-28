package com.io7m.examples.m2e_example.tests;

import junit.framework.Test;
import junit.framework.TestSuite;
import android.test.suitebuilder.TestSuiteBuilder;

public final class AllTests extends TestSuite
{
  public static Test suite()
  {
    return new TestSuiteBuilder(AllTests.class)
      .includeAllPackagesUnderHere()
      .build();
  }
}
