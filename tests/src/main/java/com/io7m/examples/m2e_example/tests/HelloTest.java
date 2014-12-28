package com.io7m.examples.m2e_example.tests;

import android.test.InstrumentationTestCase;

import com.io7m.examples.m2e_example.SayHello;

@SuppressWarnings("static-method") public final class HelloTest extends
  InstrumentationTestCase
{
  public void testHello()
  {
    SayHello.speak();
  }
}
