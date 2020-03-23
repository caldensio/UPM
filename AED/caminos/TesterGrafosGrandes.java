
/*
 * Teachers: WARNING - this file is generated automatically, please do not
 * make changes directly in this file, instead communicate needed changes
 * to the person responsable for the Tester.
 *
 * Students: you are welcome to make changes to this file if it helps
 * you to better debug your programs. Just REMEMBER that any changes made
 * by you will not change the Tester program used for the 'entrega system'.
 *
 */

//////////////////////////////////////////////////////////////////////
//
// File generated at: 2019/12/11 -- 12:44:11
// Seed: {1576,64630,579680}
//
//////////////////////////////////////////////////////////////////////



package aed.caminos;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import java.util.concurrent.CountDownLatch;
import java.lang.reflect.*;
import aed.caminos.Point;
import aed.caminos.Transportistas;
import es.upm.aedlib.Entry;
import es.upm.aedlib.Pair;
import es.upm.aedlib.Position;
import es.upm.aedlib.graph.*;
import es.upm.aedlib.indexedlist.*;
import es.upm.aedlib.map.*;
import es.upm.aedlib.positionlist.*;
import es.upm.aedlib.priorityqueue.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;
import java.io.*;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.*;
import java.lang.management.ManagementFactory;
import java.lang.reflect.*;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.function.*;
import java.util.function.Function;
import javax.imageio.*;
import javax.swing.*;



/**
 * The main tester class which contains JUnit5 tests.
 */
@SuppressWarnings({"unused","deprecation"})
public class TesterGrafosGrandes {

  
    

  @BeforeAll
  public static void init () 
  {
    TestUtils.reportPid() ;
    ResultsHandler.init() ;
    ResultsHandler.setNumTestsRemaining(24,120) ;
    TestData.setTesterType(true) ;
    TesterLab7.TestData.setTesterType(true) ;
    TestUtils.ensureAedlibVersion(2,8,0) ;
  }
  
  @AfterAll
  public static void reportResults () 
  {
    ResultsHandler.report_results() ;
  }
  
  @Test
  public void test_01 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(30), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TesterLab7.TestData.initTrace() ;
TestData.testName = new String("test_01") ;
TesterLab7.TestData.testName = new String("test_01") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_01")) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_01")) ;
    ResultsHandler.add_result(new String("bestPath"),resultIs) ;
    System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_02 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(30), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_02") ;
TesterLab7.TestData.initTrace() ;
TesterLab7.TestData.testName = new String("test_02") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_02")) ;
if (ok_sofar)
  ok_sofar = new BestPath(new Integer[][] { { 0,0 }, { 3,2 } },new Point(1,0),new Point(1,1)).doCall().checkResult(new es.upm.aedlib.Pair<Point[],Integer>(new Point[] { new Point(1,0),new Point(1,1) },new Integer(1))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_02")) ;
    ResultsHandler.add_result(new String("bestPath"),resultIs) ;
    System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_03 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(30), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_03") ;
TesterLab7.TestData.initTrace() ;
TesterLab7.TestData.testName = new String("test_03") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_03")) ;
if (ok_sofar)
  ok_sofar = new BestPath(new Integer[][] { { 1,null }, { 2,2 }, { null,3 } },new Point(1,1),new Point(1,0)).doCall().checkResult(new es.upm.aedlib.Pair<Point[],Integer>(new Point[] { new Point(1,1),new Point(1,0) },new Integer(1))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_03")) ;
    ResultsHandler.add_result(new String("bestPath"),resultIs) ;
    System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_04 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(30), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_04") ;
TesterLab7.TestData.initTrace() ;
TesterLab7.TestData.testName = new String("test_04") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_04")) ;
if (ok_sofar)
  ok_sofar = new BestPath(new Integer[][] { { 3,3 }, { 2,1 } },new Point(1,0),new Point(1,0)).doCall().checkResult(new es.upm.aedlib.Pair<Point[],Integer>(new Point[] { new Point(1,0) },new Integer(0))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_04")) ;
    ResultsHandler.add_result(new String("bestPath"),resultIs) ;
    System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_05 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(30), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_05") ;
TesterLab7.TestData.initTrace() ;
TesterLab7.TestData.testName = new String("test_05") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_05")) ;
if (ok_sofar)
  ok_sofar = new BestPath(new Integer[][] { { 2,3,null,1 }, { 1,null,3,3 } },new Point(0,1),new Point(0,0)).doCall().checkResult(new es.upm.aedlib.Pair<Point[],Integer>(new Point[] { new Point(0,1),new Point(0,0) },new Integer(1))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_05")) ;
    ResultsHandler.add_result(new String("bestPath"),resultIs) ;
    System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_06 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(30), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_06") ;
TesterLab7.TestData.initTrace() ;
TesterLab7.TestData.testName = new String("test_06") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_06")) ;
if (ok_sofar)
  ok_sofar = new BestPath(new Integer[][] { { 1,0,3 }, { 0,0,null }, { 2,null,0 } },new Point(2,0),new Point(0,2)).doCall().checkResult(new es.upm.aedlib.Pair<Point[],Integer>(new Point[] { new Point(2,0),new Point(1,0),new Point(1,1),new Point(0,1),new Point(0,2) },new Integer(7))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_06")) ;
    ResultsHandler.add_result(new String("bestPath"),resultIs) ;
    System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_07 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(30), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_07") ;
TesterLab7.TestData.initTrace() ;
TesterLab7.TestData.testName = new String("test_07") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_07")) ;
if (ok_sofar)
  ok_sofar = new BestPath(new Integer[][] { { 2,3 }, { 0,3 }, { 3,null }, { 0,3 } },new Point(0,1),new Point(3,0)).doCall().checkResult(new es.upm.aedlib.Pair<Point[],Integer>(new Point[] { new Point(0,1),new Point(0,0),new Point(1,0),new Point(2,0),new Point(3,0) },new Integer(7))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_07")) ;
    ResultsHandler.add_result(new String("bestPath"),resultIs) ;
    System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_08 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(30), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_08") ;
TesterLab7.TestData.initTrace() ;
TesterLab7.TestData.testName = new String("test_08") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_08")) ;
if (ok_sofar)
  ok_sofar = new BestPath(new Integer[][] { { null,2,null,3,0 }, { 3,null,1,1,3 } },new Point(0,1),new Point(0,1)).doCall().checkResult(new es.upm.aedlib.Pair<Point[],Integer>(new Point[] { new Point(0,1) },new Integer(0))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_08")) ;
    ResultsHandler.add_result(new String("bestPath"),resultIs) ;
    System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_09 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(30), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_09") ;
TesterLab7.TestData.initTrace() ;
TesterLab7.TestData.testName = new String("test_09") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_09")) ;
if (ok_sofar)
  ok_sofar = new BestPath(new Integer[][] { { null,2,3,1,0 }, { 2,null,1,2,1 } },new Point(1,2),new Point(1,3)).doCall().checkResult(new es.upm.aedlib.Pair<Point[],Integer>(new Point[] { new Point(1,2),new Point(1,3) },new Integer(2))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_09")) ;
    ResultsHandler.add_result(new String("bestPath"),resultIs) ;
    System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_10 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(30), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_10") ;
TesterLab7.TestData.initTrace() ;
TesterLab7.TestData.testName = new String("test_10") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_10")) ;
if (ok_sofar)
  ok_sofar = new BestPath(new Integer[][] { { 0,3,0,1,2 }, { 0,null,1,3,1 } },new Point(1,2),new Point(1,2)).doCall().checkResult(new es.upm.aedlib.Pair<Point[],Integer>(new Point[] { new Point(1,2) },new Integer(0))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_10")) ;
    ResultsHandler.add_result(new String("bestPath"),resultIs) ;
    System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_11 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(30), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_11") ;
TesterLab7.TestData.initTrace() ;
TesterLab7.TestData.testName = new String("test_11") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_11")) ;
if (ok_sofar)
  ok_sofar = new BestPath(new Integer[][] { { 1,2 }, { 3,null }, { 1,2 }, { 2,3 }, { 0,1 } },new Point(3,1),new Point(3,1)).doCall().checkResult(new es.upm.aedlib.Pair<Point[],Integer>(new Point[] { new Point(3,1) },new Integer(0))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_11")) ;
    ResultsHandler.add_result(new String("bestPath"),resultIs) ;
    System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_12 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(30), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_12") ;
TesterLab7.TestData.initTrace() ;
TesterLab7.TestData.testName = new String("test_12") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_12")) ;
if (ok_sofar)
  ok_sofar = new BestPath(new Integer[][] { { 2,2 }, { 0,0 }, { null,3 }, { 2,1 }, { 3,1 } },new Point(4,1),new Point(0,0)).doCall().checkResult(new es.upm.aedlib.Pair<Point[],Integer>(new Point[] { new Point(4,1),new Point(3,1),new Point(2,1),new Point(1,1),new Point(1,0),new Point(0,0) },new Integer(9))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_12")) ;
    ResultsHandler.add_result(new String("bestPath"),resultIs) ;
    System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_13 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(30), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_13") ;
TesterLab7.TestData.initTrace() ;
TesterLab7.TestData.testName = new String("test_13") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_13")) ;
if (ok_sofar)
  ok_sofar = new BestPath(new Integer[][] { { 2,null,0,1 }, { 2,null,1,null }, { 3,0,2,2 } },new Point(1,2),new Point(0,3)).doCall().checkResult(new es.upm.aedlib.Pair<Point[],Integer>(new Point[] { new Point(1,2),new Point(0,2),new Point(0,3) },new Integer(3))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_13")) ;
    ResultsHandler.add_result(new String("bestPath"),resultIs) ;
    System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_14 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(30), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_14") ;
TesterLab7.TestData.initTrace() ;
TesterLab7.TestData.testName = new String("test_14") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_14")) ;
if (ok_sofar)
  ok_sofar = new BestPath(new Integer[][] { { null,1,1,2,0 }, { 1,2,0,0,0 } },new Point(0,2),new Point(0,3)).doCall().checkResult(new es.upm.aedlib.Pair<Point[],Integer>(new Point[] { new Point(0,2),new Point(0,3) },new Integer(2))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_14")) ;
    ResultsHandler.add_result(new String("bestPath"),resultIs) ;
    System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_15 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(30), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_15") ;
TesterLab7.TestData.initTrace() ;
TesterLab7.TestData.testName = new String("test_15") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_15")) ;
if (ok_sofar)
  ok_sofar = new BestPath(new Integer[][] { { 1,3,1,0 }, { 1,0,2,null }, { 1,null,0,1 } },new Point(2,2),new Point(2,0)).doCall().checkResult(new es.upm.aedlib.Pair<Point[],Integer>(new Point[] { new Point(2,2),new Point(1,2),new Point(1,1),new Point(1,0),new Point(2,0) },new Integer(7))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_15")) ;
    ResultsHandler.add_result(new String("bestPath"),resultIs) ;
    System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_16 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(30), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_16") ;
TesterLab7.TestData.initTrace() ;
TesterLab7.TestData.testName = new String("test_16") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_16")) ;
if (ok_sofar)
  ok_sofar = new BestPath(new Integer[][] { { 2,1,null }, { 0,1,null }, { null,3,null }, { null,2,2 }, { 0,2,3 } },new Point(4,2),new Point(4,0)).doCall().checkResult(new es.upm.aedlib.Pair<Point[],Integer>(new Point[] { new Point(4,2),new Point(4,1),new Point(4,0) },new Integer(2))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_16")) ;
    ResultsHandler.add_result(new String("bestPath"),resultIs) ;
    System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_17 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(30), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_17") ;
TesterLab7.TestData.initTrace() ;
TesterLab7.TestData.testName = new String("test_17") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_17")) ;
if (ok_sofar)
  ok_sofar = new BestPath(new Integer[][] { { null,3,0,2 }, { 2,2,3,3 }, { 0,3,null,0 } },new Point(2,0),new Point(1,1)).doCall().checkResult(new es.upm.aedlib.Pair<Point[],Integer>(new Point[] { new Point(2,0),new Point(1,0),new Point(1,1) },new Integer(4))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_17")) ;
    ResultsHandler.add_result(new String("bestPath"),resultIs) ;
    System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_18 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(30), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_18") ;
TesterLab7.TestData.initTrace() ;
TesterLab7.TestData.testName = new String("test_18") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_18")) ;
if (ok_sofar)
  ok_sofar = new BestPath(new Integer[][] { { 1,2,2 }, { 1,0,3 }, { null,2,2 }, { 1,0,2 } },new Point(3,1),new Point(0,2)).doCall().checkResult(new es.upm.aedlib.Pair<Point[],Integer>(new Point[] { new Point(3,1),new Point(3,2),new Point(2,2),new Point(1,2),new Point(0,2) },new Integer(7))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_18")) ;
    ResultsHandler.add_result(new String("bestPath"),resultIs) ;
    System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_19 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(30), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_19") ;
TesterLab7.TestData.initTrace() ;
TesterLab7.TestData.testName = new String("test_19") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_19")) ;
if (ok_sofar)
  ok_sofar = new BestPath(new Integer[][] { { 1,3,2 }, { 2,1,3 }, { 3,1,2 }, { null,null,null }, { 0,1,2 } },new Point(0,0),new Point(1,2)).doCall().checkResult(new es.upm.aedlib.Pair<Point[],Integer>(new Point[] { new Point(0,0),new Point(0,1),new Point(0,2),new Point(1,2) },new Integer(6))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_19")) ;
    ResultsHandler.add_result(new String("bestPath"),resultIs) ;
    System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_20 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(30), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_20") ;
TesterLab7.TestData.initTrace() ;
TesterLab7.TestData.testName = new String("test_20") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_20")) ;
if (ok_sofar)
  ok_sofar = new BestPath(new Integer[][] { { 0,1,1,1,1 }, { 2,0,1,null,1 }, { 0,0,3,null,2 } },new Point(2,0),new Point(0,2)).doCall().checkResult(new es.upm.aedlib.Pair<Point[],Integer>(new Point[] { new Point(2,0),new Point(2,1),new Point(1,1),new Point(1,2),new Point(0,2) },new Integer(5))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_20")) ;
    ResultsHandler.add_result(new String("bestPath"),resultIs) ;
    System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_21 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(30), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_21") ;
TesterLab7.TestData.initTrace() ;
TesterLab7.TestData.testName = new String("test_21") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_21")) ;
if (ok_sofar)
  ok_sofar = new BestPathQuick(new Point(157,231),new Point(301,64)).doCall().checkResult(new Point[] { new Point(157,231),new Point(158,231),new Point(159,231),new Point(160,231),new Point(161,231),new Point(161,230),new Point(162,230),new Point(162,229),new Point(162,228),new Point(162,227),new Point(162,226),new Point(162,225),new Point(162,224),new Point(162,223),new Point(162,222),new Point(162,221),new Point(163,221),new Point(164,221),new Point(164,220),new Point(164,219),new Point(164,218),new Point(165,218),new Point(166,218),new Point(167,218),new Point(168,218),new Point(169,218),new Point(169,217),new Point(170,217),new Point(170,216),new Point(171,216),new Point(172,216),new Point(173,216),new Point(174,216),new Point(175,216),new Point(176,216),new Point(177,216),new Point(177,215),new Point(178,215),new Point(179,215),new Point(179,214),new Point(180,214),new Point(180,213),new Point(181,213),new Point(181,212),new Point(181,211),new Point(182,211),new Point(183,211),new Point(184,211),new Point(185,211),new Point(186,211),new Point(187,211),new Point(188,211),new Point(189,211),new Point(190,211),new Point(191,211),new Point(192,211),new Point(193,211),new Point(194,211),new Point(195,211),new Point(196,211),new Point(197,211),new Point(197,210),new Point(197,209),new Point(197,208),new Point(198,208),new Point(198,207),new Point(198,206),new Point(198,205),new Point(198,204),new Point(199,204),new Point(199,203),new Point(199,202),new Point(199,201),new Point(199,200),new Point(199,199),new Point(200,199),new Point(200,198),new Point(200,197),new Point(200,196),new Point(200,195),new Point(200,194),new Point(201,194),new Point(202,194),new Point(203,194),new Point(203,193),new Point(204,193),new Point(204,192),new Point(205,192),new Point(205,191),new Point(205,190),new Point(205,189),new Point(205,188),new Point(205,187),new Point(205,186),new Point(205,185),new Point(205,184),new Point(205,183),new Point(205,182),new Point(205,181),new Point(205,180),new Point(205,179),new Point(205,178),new Point(205,177),new Point(205,176),new Point(206,176),new Point(206,175),new Point(207,175),new Point(208,175),new Point(208,174),new Point(209,174),new Point(210,174),new Point(210,173),new Point(211,173),new Point(212,173),new Point(213,173),new Point(214,173),new Point(214,172),new Point(215,172),new Point(215,171),new Point(216,171),new Point(217,171),new Point(218,171),new Point(219,171),new Point(220,171),new Point(221,171),new Point(222,171),new Point(223,171),new Point(224,171),new Point(225,171),new Point(226,171),new Point(227,171),new Point(228,171),new Point(228,170),new Point(229,170),new Point(230,170),new Point(231,170),new Point(232,170),new Point(233,170),new Point(234,170),new Point(235,170),new Point(236,170),new Point(237,170),new Point(238,170),new Point(239,170),new Point(240,170),new Point(241,170),new Point(242,170),new Point(243,170),new Point(244,170),new Point(245,170),new Point(246,170),new Point(247,170),new Point(248,170),new Point(249,170),new Point(250,170),new Point(251,170),new Point(252,170),new Point(253,170),new Point(254,170),new Point(255,170),new Point(256,170),new Point(257,170),new Point(258,170),new Point(259,170),new Point(260,170),new Point(261,170),new Point(262,170),new Point(263,170),new Point(264,170),new Point(265,170),new Point(265,169),new Point(266,169),new Point(267,169),new Point(268,169),new Point(269,169),new Point(270,169),new Point(271,169),new Point(272,169),new Point(273,169),new Point(274,169),new Point(275,169),new Point(276,169),new Point(277,169),new Point(278,169),new Point(278,168),new Point(279,168),new Point(280,168),new Point(280,167),new Point(281,167),new Point(281,166),new Point(282,166),new Point(283,166),new Point(284,166),new Point(285,166),new Point(286,166),new Point(287,166),new Point(288,166),new Point(289,166),new Point(289,165),new Point(290,165),new Point(291,165),new Point(291,164),new Point(292,164),new Point(293,164),new Point(294,164),new Point(294,163),new Point(295,163),new Point(296,163),new Point(297,163),new Point(297,162),new Point(298,162),new Point(298,161),new Point(298,160),new Point(299,160),new Point(299,159),new Point(299,158),new Point(299,157),new Point(299,156),new Point(299,155),new Point(299,154),new Point(299,153),new Point(299,152),new Point(299,151),new Point(299,150),new Point(299,149),new Point(299,148),new Point(299,147),new Point(299,146),new Point(299,145),new Point(299,144),new Point(299,143),new Point(299,142),new Point(298,142),new Point(297,142),new Point(297,141),new Point(296,141),new Point(295,141),new Point(295,140),new Point(295,139),new Point(295,138),new Point(295,137),new Point(294,137),new Point(294,136),new Point(294,135),new Point(294,134),new Point(294,133),new Point(294,132),new Point(293,132),new Point(293,131),new Point(292,131),new Point(292,130),new Point(292,129),new Point(292,128),new Point(292,127),new Point(291,127),new Point(291,126),new Point(291,125),new Point(291,124),new Point(291,123),new Point(291,122),new Point(290,122),new Point(290,121),new Point(290,120),new Point(290,119),new Point(289,119),new Point(288,119),new Point(288,118),new Point(288,117),new Point(287,117),new Point(287,116),new Point(287,115),new Point(287,114),new Point(287,113),new Point(287,112),new Point(287,111),new Point(286,111),new Point(285,111),new Point(285,110),new Point(284,110),new Point(283,110),new Point(283,109),new Point(282,109),new Point(282,108),new Point(281,108),new Point(281,107),new Point(280,107),new Point(279,107),new Point(279,106),new Point(279,105),new Point(279,104),new Point(278,104),new Point(278,103),new Point(277,103),new Point(276,103),new Point(276,102),new Point(276,101),new Point(276,100),new Point(275,100),new Point(274,100),new Point(274,99),new Point(274,98),new Point(274,97),new Point(274,96),new Point(274,95),new Point(274,94),new Point(274,93),new Point(274,92),new Point(274,91),new Point(274,90),new Point(274,89),new Point(274,88),new Point(275,88),new Point(276,88),new Point(276,87),new Point(277,87),new Point(278,87),new Point(278,86),new Point(279,86),new Point(279,85),new Point(279,84),new Point(280,84),new Point(281,84),new Point(281,83),new Point(281,82),new Point(281,81),new Point(282,81),new Point(282,80),new Point(283,80),new Point(284,80),new Point(284,79),new Point(285,79),new Point(286,79),new Point(287,79),new Point(287,78),new Point(288,78),new Point(288,77),new Point(289,77),new Point(290,77),new Point(290,76),new Point(291,76),new Point(292,76),new Point(292,75),new Point(293,75),new Point(294,75),new Point(295,75),new Point(296,75),new Point(297,75),new Point(297,74),new Point(298,74),new Point(299,74),new Point(300,74),new Point(300,73),new Point(300,72),new Point(300,71),new Point(300,70),new Point(300,69),new Point(300,68),new Point(300,67),new Point(300,66),new Point(300,65),new Point(300,64),new Point(301,64) }) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_21")) ;
    ResultsHandler.add_result(new String("bestPathQuick"),resultIs) ;
    System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_22 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(30), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_22") ;
TesterLab7.TestData.initTrace() ;
TesterLab7.TestData.testName = new String("test_22") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_22")) ;
if (ok_sofar)
  ok_sofar = new BestPathQuick(new Point(224,134),new Point(421,63)).doCall().checkResult(new Point[] { new Point(224,134),new Point(224,135),new Point(225,135),new Point(226,135),new Point(227,135),new Point(227,136),new Point(228,136),new Point(229,136),new Point(230,136),new Point(231,136),new Point(232,136),new Point(233,136),new Point(234,136),new Point(235,136),new Point(236,136),new Point(237,136),new Point(238,136),new Point(239,136),new Point(240,136),new Point(241,136),new Point(242,136),new Point(243,136),new Point(244,136),new Point(245,136),new Point(246,136),new Point(246,135),new Point(246,134),new Point(246,133),new Point(247,133),new Point(248,133),new Point(249,133),new Point(250,133),new Point(251,133),new Point(252,133),new Point(253,133),new Point(254,133),new Point(255,133),new Point(256,133),new Point(257,133),new Point(258,133),new Point(259,133),new Point(260,133),new Point(261,133),new Point(262,133),new Point(262,132),new Point(263,132),new Point(264,132),new Point(265,132),new Point(266,132),new Point(267,132),new Point(268,132),new Point(269,132),new Point(270,132),new Point(271,132),new Point(272,132),new Point(273,132),new Point(273,133),new Point(274,133),new Point(275,133),new Point(276,133),new Point(277,133),new Point(277,132),new Point(278,132),new Point(279,132),new Point(280,132),new Point(280,131),new Point(281,131),new Point(281,130),new Point(282,130),new Point(283,130),new Point(284,130),new Point(285,130),new Point(286,130),new Point(287,130),new Point(287,131),new Point(288,131),new Point(289,131),new Point(290,131),new Point(291,131),new Point(292,131),new Point(293,131),new Point(294,131),new Point(295,131),new Point(295,130),new Point(296,130),new Point(296,129),new Point(296,128),new Point(297,128),new Point(298,128),new Point(299,128),new Point(300,128),new Point(301,128),new Point(302,128),new Point(303,128),new Point(304,128),new Point(305,128),new Point(306,128),new Point(307,128),new Point(308,128),new Point(309,128),new Point(309,129),new Point(310,129),new Point(310,130),new Point(311,130),new Point(312,130),new Point(313,130),new Point(314,130),new Point(315,130),new Point(316,130),new Point(317,130),new Point(318,130),new Point(319,130),new Point(320,130),new Point(321,130),new Point(322,130),new Point(323,130),new Point(324,130),new Point(325,130),new Point(326,130),new Point(326,131),new Point(326,132),new Point(327,132),new Point(328,132),new Point(329,132),new Point(330,132),new Point(331,132),new Point(332,132),new Point(333,132),new Point(334,132),new Point(335,132),new Point(336,132),new Point(337,132),new Point(338,132),new Point(339,132),new Point(340,132),new Point(341,132),new Point(342,132),new Point(343,132),new Point(343,131),new Point(344,131),new Point(344,130),new Point(344,129),new Point(344,128),new Point(345,128),new Point(345,127),new Point(345,126),new Point(346,126),new Point(347,126),new Point(348,126),new Point(349,126),new Point(350,126),new Point(351,126),new Point(352,126),new Point(352,125),new Point(352,124),new Point(353,124),new Point(354,124),new Point(355,124),new Point(356,124),new Point(357,124),new Point(358,124),new Point(359,124),new Point(360,124),new Point(361,124),new Point(362,124),new Point(363,124),new Point(364,124),new Point(364,123),new Point(365,123),new Point(366,123),new Point(366,122),new Point(367,122),new Point(367,121),new Point(368,121),new Point(369,121),new Point(370,121),new Point(371,121),new Point(371,120),new Point(372,120),new Point(373,120),new Point(374,120),new Point(374,119),new Point(375,119),new Point(375,118),new Point(376,118),new Point(377,118),new Point(378,118),new Point(379,118),new Point(379,117),new Point(379,116),new Point(379,115),new Point(380,115),new Point(381,115),new Point(382,115),new Point(383,115),new Point(384,115),new Point(384,114),new Point(385,114),new Point(385,113),new Point(385,112),new Point(386,112),new Point(387,112),new Point(388,112),new Point(389,112),new Point(390,112),new Point(391,112),new Point(391,111),new Point(392,111),new Point(392,110),new Point(393,110),new Point(393,109),new Point(393,108),new Point(394,108),new Point(394,107),new Point(394,106),new Point(394,105),new Point(394,104),new Point(395,104),new Point(395,103),new Point(396,103),new Point(397,103),new Point(398,103),new Point(399,103),new Point(399,102),new Point(399,101),new Point(400,101),new Point(401,101),new Point(402,101),new Point(402,100),new Point(402,99),new Point(402,98),new Point(402,97),new Point(401,97),new Point(401,96),new Point(401,95),new Point(401,94),new Point(401,93),new Point(401,92),new Point(401,91),new Point(401,90),new Point(401,89),new Point(401,88),new Point(402,88),new Point(403,88),new Point(404,88),new Point(404,87),new Point(404,86),new Point(405,86),new Point(406,86),new Point(407,86),new Point(408,86),new Point(408,85),new Point(408,84),new Point(408,83),new Point(408,82),new Point(408,81),new Point(409,81),new Point(410,81),new Point(410,80),new Point(411,80),new Point(412,80),new Point(412,79),new Point(412,78),new Point(412,77),new Point(412,76),new Point(413,76),new Point(413,75),new Point(414,75),new Point(414,74),new Point(415,74),new Point(416,74),new Point(417,74),new Point(418,74),new Point(418,73),new Point(418,72),new Point(419,72),new Point(420,72),new Point(420,71),new Point(420,70),new Point(420,69),new Point(420,68),new Point(421,68),new Point(421,67),new Point(421,66),new Point(422,66),new Point(422,65),new Point(422,64),new Point(421,64),new Point(421,63) }) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_22")) ;
    ResultsHandler.add_result(new String("bestPathQuick"),resultIs) ;
    System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_23 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(30), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_23") ;
TesterLab7.TestData.initTrace() ;
TesterLab7.TestData.testName = new String("test_23") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_23")) ;
if (ok_sofar)
  ok_sofar = new BestPathQuick(new Point(309,180),new Point(61,84)).doCall().checkResult(new Point[] { new Point(309,180),new Point(309,179),new Point(309,178),new Point(309,177),new Point(309,176),new Point(309,175),new Point(308,175),new Point(307,175),new Point(306,175),new Point(306,174),new Point(305,174),new Point(305,173),new Point(305,172),new Point(304,172),new Point(303,172),new Point(302,172),new Point(301,172),new Point(300,172),new Point(299,172),new Point(299,171),new Point(299,170),new Point(299,169),new Point(299,168),new Point(299,167),new Point(299,166),new Point(299,165),new Point(299,164),new Point(299,163),new Point(299,162),new Point(299,161),new Point(299,160),new Point(299,159),new Point(299,158),new Point(299,157),new Point(299,156),new Point(299,155),new Point(299,154),new Point(299,153),new Point(299,152),new Point(299,151),new Point(299,150),new Point(299,149),new Point(299,148),new Point(299,147),new Point(299,146),new Point(299,145),new Point(299,144),new Point(299,143),new Point(299,142),new Point(298,142),new Point(297,142),new Point(297,141),new Point(296,141),new Point(295,141),new Point(295,140),new Point(295,139),new Point(295,138),new Point(295,137),new Point(294,137),new Point(294,136),new Point(294,135),new Point(294,134),new Point(294,133),new Point(294,132),new Point(293,132),new Point(293,131),new Point(292,131),new Point(292,130),new Point(292,129),new Point(291,129),new Point(291,128),new Point(290,128),new Point(289,128),new Point(288,128),new Point(288,127),new Point(287,127),new Point(286,127),new Point(285,127),new Point(285,126),new Point(285,125),new Point(284,125),new Point(284,124),new Point(283,124),new Point(282,124),new Point(282,123),new Point(282,122),new Point(282,121),new Point(282,120),new Point(282,119),new Point(282,118),new Point(282,117),new Point(282,116),new Point(281,116),new Point(280,116),new Point(279,116),new Point(279,115),new Point(278,115),new Point(278,114),new Point(277,114),new Point(276,114),new Point(275,114),new Point(275,113),new Point(275,112),new Point(274,112),new Point(273,112),new Point(273,111),new Point(273,110),new Point(273,109),new Point(273,108),new Point(272,108),new Point(271,108),new Point(270,108),new Point(269,108),new Point(269,107),new Point(268,107),new Point(268,106),new Point(268,105),new Point(267,105),new Point(266,105),new Point(266,104),new Point(266,103),new Point(266,102),new Point(266,101),new Point(266,100),new Point(265,100),new Point(265,99),new Point(264,99),new Point(263,99),new Point(262,99),new Point(261,99),new Point(260,99),new Point(259,99),new Point(258,99),new Point(257,99),new Point(256,99),new Point(255,99),new Point(254,99),new Point(253,99),new Point(252,99),new Point(251,99),new Point(250,99),new Point(249,99),new Point(249,100),new Point(248,100),new Point(248,101),new Point(247,101),new Point(247,102),new Point(246,102),new Point(245,102),new Point(244,102),new Point(244,103),new Point(243,103),new Point(243,104),new Point(243,105),new Point(243,106),new Point(242,106),new Point(241,106),new Point(240,106),new Point(239,106),new Point(238,106),new Point(238,107),new Point(237,107),new Point(236,107),new Point(235,107),new Point(234,107),new Point(234,106),new Point(233,106),new Point(232,106),new Point(231,106),new Point(230,106),new Point(229,106),new Point(228,106),new Point(227,106),new Point(226,106),new Point(225,106),new Point(224,106),new Point(223,106),new Point(222,106),new Point(221,106),new Point(221,105),new Point(220,105),new Point(219,105),new Point(219,104),new Point(218,104),new Point(218,103),new Point(217,103),new Point(217,102),new Point(216,102),new Point(215,102),new Point(214,102),new Point(213,102),new Point(212,102),new Point(212,103),new Point(211,103),new Point(211,104),new Point(211,105),new Point(210,105),new Point(210,106),new Point(209,106),new Point(208,106),new Point(207,106),new Point(207,107),new Point(206,107),new Point(206,108),new Point(205,108),new Point(204,108),new Point(203,108),new Point(202,108),new Point(202,109),new Point(202,110),new Point(202,111),new Point(201,111),new Point(200,111),new Point(200,110),new Point(199,110),new Point(198,110),new Point(197,110),new Point(196,110),new Point(196,111),new Point(195,111),new Point(195,112),new Point(194,112),new Point(194,113),new Point(193,113),new Point(192,113),new Point(192,112),new Point(191,112),new Point(190,112),new Point(189,112),new Point(188,112),new Point(187,112),new Point(186,112),new Point(185,112),new Point(184,112),new Point(183,112),new Point(182,112),new Point(182,111),new Point(181,111),new Point(180,111),new Point(179,111),new Point(178,111),new Point(177,111),new Point(176,111),new Point(175,111),new Point(174,111),new Point(174,110),new Point(173,110),new Point(172,110),new Point(171,110),new Point(170,110),new Point(170,109),new Point(170,108),new Point(170,107),new Point(169,107),new Point(169,106),new Point(169,105),new Point(169,104),new Point(168,104),new Point(167,104),new Point(166,104),new Point(166,103),new Point(165,103),new Point(165,102),new Point(164,102),new Point(164,101),new Point(163,101),new Point(162,101),new Point(161,101),new Point(160,101),new Point(160,100),new Point(159,100),new Point(158,100),new Point(157,100),new Point(157,99),new Point(157,98),new Point(157,97),new Point(157,96),new Point(157,95),new Point(157,94),new Point(156,94),new Point(156,93),new Point(155,93),new Point(154,93),new Point(153,93),new Point(153,92),new Point(152,92),new Point(151,92),new Point(151,91),new Point(150,91),new Point(149,91),new Point(148,91),new Point(147,91),new Point(146,91),new Point(145,91),new Point(145,90),new Point(145,89),new Point(144,89),new Point(143,89),new Point(142,89),new Point(141,89),new Point(141,88),new Point(140,88),new Point(139,88),new Point(139,87),new Point(138,87),new Point(137,87),new Point(136,87),new Point(135,87),new Point(134,87),new Point(133,87),new Point(132,87),new Point(131,87),new Point(130,87),new Point(129,87),new Point(128,87),new Point(127,87),new Point(126,87),new Point(125,87),new Point(124,87),new Point(123,87),new Point(122,87),new Point(121,87),new Point(120,87),new Point(119,87),new Point(118,87),new Point(118,88),new Point(117,88),new Point(117,89),new Point(116,89),new Point(115,89),new Point(114,89),new Point(113,89),new Point(112,89),new Point(111,89),new Point(110,89),new Point(109,89),new Point(108,89),new Point(107,89),new Point(106,89),new Point(105,89),new Point(104,89),new Point(103,89),new Point(103,90),new Point(102,90),new Point(101,90),new Point(100,90),new Point(99,90),new Point(98,90),new Point(97,90),new Point(97,91),new Point(96,91),new Point(95,91),new Point(94,91),new Point(93,91),new Point(92,91),new Point(91,91),new Point(90,91),new Point(89,91),new Point(88,91),new Point(88,90),new Point(87,90),new Point(87,89),new Point(86,89),new Point(85,89),new Point(84,89),new Point(83,89),new Point(82,89),new Point(81,89),new Point(80,89),new Point(79,89),new Point(79,88),new Point(79,87),new Point(79,86),new Point(78,86),new Point(77,86),new Point(76,86),new Point(75,86),new Point(74,86),new Point(73,86),new Point(72,86),new Point(71,86),new Point(70,86),new Point(69,86),new Point(68,86),new Point(67,86),new Point(66,86),new Point(65,86),new Point(64,86),new Point(64,85),new Point(63,85),new Point(62,85),new Point(61,85),new Point(61,84) }) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_23")) ;
    ResultsHandler.add_result(new String("bestPathQuick"),resultIs) ;
    System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_24 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(30), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_24") ;
TesterLab7.TestData.initTrace() ;
TesterLab7.TestData.testName = new String("test_24") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_24")) ;
if (ok_sofar)
  ok_sofar = new BestPathQuick(new Point(378,25),new Point(49,217)).doCall().checkResult(new Point[] { new Point(378,25),new Point(377,25),new Point(377,26),new Point(377,27),new Point(377,28),new Point(377,29),new Point(377,30),new Point(378,30),new Point(378,31),new Point(378,32),new Point(377,32),new Point(377,33),new Point(376,33),new Point(375,33),new Point(375,34),new Point(375,35),new Point(375,36),new Point(374,36),new Point(374,37),new Point(373,37),new Point(373,38),new Point(373,39),new Point(373,40),new Point(373,41),new Point(372,41),new Point(371,41),new Point(371,42),new Point(371,43),new Point(371,44),new Point(371,45),new Point(371,46),new Point(371,47),new Point(371,48),new Point(371,49),new Point(371,50),new Point(371,51),new Point(371,52),new Point(371,53),new Point(370,53),new Point(370,54),new Point(369,54),new Point(369,55),new Point(369,56),new Point(369,57),new Point(369,58),new Point(369,59),new Point(369,60),new Point(369,61),new Point(369,62),new Point(369,63),new Point(369,64),new Point(369,65),new Point(369,66),new Point(369,67),new Point(369,68),new Point(369,69),new Point(370,69),new Point(370,70),new Point(370,71),new Point(370,72),new Point(370,73),new Point(370,74),new Point(370,75),new Point(370,76),new Point(370,77),new Point(370,78),new Point(370,79),new Point(369,79),new Point(369,80),new Point(369,81),new Point(369,82),new Point(368,82),new Point(368,83),new Point(368,84),new Point(368,85),new Point(368,86),new Point(368,87),new Point(368,88),new Point(368,89),new Point(368,90),new Point(368,91),new Point(368,92),new Point(368,93),new Point(368,94),new Point(368,95),new Point(368,96),new Point(368,97),new Point(367,97),new Point(367,98),new Point(367,99),new Point(367,100),new Point(367,101),new Point(366,101),new Point(366,102),new Point(366,103),new Point(365,103),new Point(365,104),new Point(365,105),new Point(365,106),new Point(364,106),new Point(364,107),new Point(364,108),new Point(363,108),new Point(363,109),new Point(363,110),new Point(363,111),new Point(363,112),new Point(362,112),new Point(362,113),new Point(362,114),new Point(361,114),new Point(361,115),new Point(361,116),new Point(361,117),new Point(360,117),new Point(359,117),new Point(359,118),new Point(359,119),new Point(359,120),new Point(359,121),new Point(359,122),new Point(359,123),new Point(359,124),new Point(359,125),new Point(359,126),new Point(359,127),new Point(359,128),new Point(359,129),new Point(359,130),new Point(359,131),new Point(359,132),new Point(359,133),new Point(358,133),new Point(358,134),new Point(358,135),new Point(357,135),new Point(357,136),new Point(357,137),new Point(357,138),new Point(357,139),new Point(357,140),new Point(357,141),new Point(357,142),new Point(357,143),new Point(357,144),new Point(356,144),new Point(356,145),new Point(356,146),new Point(356,147),new Point(356,148),new Point(356,149),new Point(356,150),new Point(356,151),new Point(356,152),new Point(355,152),new Point(354,152),new Point(353,152),new Point(352,152),new Point(351,152),new Point(350,152),new Point(349,152),new Point(348,152),new Point(347,152),new Point(346,152),new Point(345,152),new Point(345,153),new Point(344,153),new Point(344,154),new Point(343,154),new Point(342,154),new Point(341,154),new Point(341,155),new Point(341,156),new Point(341,157),new Point(341,158),new Point(341,159),new Point(341,160),new Point(341,161),new Point(341,162),new Point(341,163),new Point(341,164),new Point(341,165),new Point(341,166),new Point(341,167),new Point(340,167),new Point(340,168),new Point(340,169),new Point(340,170),new Point(340,171),new Point(340,172),new Point(340,173),new Point(340,174),new Point(339,174),new Point(338,174),new Point(337,174),new Point(336,174),new Point(335,174),new Point(335,175),new Point(335,176),new Point(335,177),new Point(336,177),new Point(337,177),new Point(337,178),new Point(337,179),new Point(337,180),new Point(337,181),new Point(337,182),new Point(337,183),new Point(337,184),new Point(336,184),new Point(336,185),new Point(336,186),new Point(335,186),new Point(335,187),new Point(335,188),new Point(335,189),new Point(335,190),new Point(335,191),new Point(335,192),new Point(335,193),new Point(335,194),new Point(335,195),new Point(335,196),new Point(335,197),new Point(335,198),new Point(335,199),new Point(335,200),new Point(335,201),new Point(335,202),new Point(335,203),new Point(335,204),new Point(335,205),new Point(335,206),new Point(335,207),new Point(335,208),new Point(335,209),new Point(334,209),new Point(333,209),new Point(332,209),new Point(332,210),new Point(331,210),new Point(330,210),new Point(329,210),new Point(329,211),new Point(328,211),new Point(327,211),new Point(327,212),new Point(326,212),new Point(325,212),new Point(325,213),new Point(325,214),new Point(324,214),new Point(324,215),new Point(323,215),new Point(323,216),new Point(323,217),new Point(322,217),new Point(321,217),new Point(321,218),new Point(321,219),new Point(321,220),new Point(320,220),new Point(319,220),new Point(319,221),new Point(319,222),new Point(318,222),new Point(317,222),new Point(317,223),new Point(317,224),new Point(316,224),new Point(315,224),new Point(314,224),new Point(313,224),new Point(312,224),new Point(312,225),new Point(311,225),new Point(310,225),new Point(309,225),new Point(308,225),new Point(308,226),new Point(307,226),new Point(307,227),new Point(306,227),new Point(305,227),new Point(304,227),new Point(303,227),new Point(303,228),new Point(302,228),new Point(302,229),new Point(301,229),new Point(300,229),new Point(299,229),new Point(299,230),new Point(298,230),new Point(297,230),new Point(297,231),new Point(296,231),new Point(295,231),new Point(294,231),new Point(294,232),new Point(294,233),new Point(293,233),new Point(292,233),new Point(291,233),new Point(290,233),new Point(289,233),new Point(288,233),new Point(287,233),new Point(286,233),new Point(285,233),new Point(284,233),new Point(283,233),new Point(282,233),new Point(281,233),new Point(280,233),new Point(279,233),new Point(278,233),new Point(277,233),new Point(276,233),new Point(275,233),new Point(274,233),new Point(273,233),new Point(272,233),new Point(271,233),new Point(270,233),new Point(269,233),new Point(268,233),new Point(267,233),new Point(266,233),new Point(265,233),new Point(265,234),new Point(264,234),new Point(263,234),new Point(262,234),new Point(261,234),new Point(260,234),new Point(259,234),new Point(258,234),new Point(257,234),new Point(256,234),new Point(255,234),new Point(255,235),new Point(254,235),new Point(253,235),new Point(252,235),new Point(252,236),new Point(251,236),new Point(250,236),new Point(249,236),new Point(248,236),new Point(247,236),new Point(246,236),new Point(245,236),new Point(244,236),new Point(243,236),new Point(242,236),new Point(242,235),new Point(241,235),new Point(240,235),new Point(240,234),new Point(239,234),new Point(238,234),new Point(237,234),new Point(236,234),new Point(235,234),new Point(234,234),new Point(233,234),new Point(232,234),new Point(232,235),new Point(231,235),new Point(231,236),new Point(230,236),new Point(229,236),new Point(228,236),new Point(227,236),new Point(226,236),new Point(226,235),new Point(225,235),new Point(224,235),new Point(223,235),new Point(222,235),new Point(221,235),new Point(220,235),new Point(219,235),new Point(218,235),new Point(217,235),new Point(216,235),new Point(215,235),new Point(214,235),new Point(213,235),new Point(212,235),new Point(211,235),new Point(211,234),new Point(210,234),new Point(210,233),new Point(210,232),new Point(210,231),new Point(210,230),new Point(209,230),new Point(208,230),new Point(207,230),new Point(206,230),new Point(205,230),new Point(204,230),new Point(203,230),new Point(202,230),new Point(201,230),new Point(201,229),new Point(201,228),new Point(200,228),new Point(199,228),new Point(199,227),new Point(199,226),new Point(199,225),new Point(199,224),new Point(198,224),new Point(197,224),new Point(196,224),new Point(195,224),new Point(195,223),new Point(195,222),new Point(195,221),new Point(195,220),new Point(194,220),new Point(193,220),new Point(192,220),new Point(191,220),new Point(190,220),new Point(189,220),new Point(188,220),new Point(188,219),new Point(187,219),new Point(186,219),new Point(185,219),new Point(184,219),new Point(184,218),new Point(183,218),new Point(183,217),new Point(182,217),new Point(181,217),new Point(180,217),new Point(180,216),new Point(179,216),new Point(178,216),new Point(177,216),new Point(176,216),new Point(175,216),new Point(174,216),new Point(173,216),new Point(172,216),new Point(171,216),new Point(170,216),new Point(169,216),new Point(168,216),new Point(167,216),new Point(166,216),new Point(166,215),new Point(166,214),new Point(165,214),new Point(164,214),new Point(163,214),new Point(163,213),new Point(162,213),new Point(161,213),new Point(160,213),new Point(159,213),new Point(158,213),new Point(158,212),new Point(157,212),new Point(156,212),new Point(156,211),new Point(156,210),new Point(155,210),new Point(154,210),new Point(153,210),new Point(152,210),new Point(151,210),new Point(150,210),new Point(149,210),new Point(148,210),new Point(147,210),new Point(146,210),new Point(145,210),new Point(144,210),new Point(143,210),new Point(143,209),new Point(142,209),new Point(141,209),new Point(140,209),new Point(140,208),new Point(140,207),new Point(139,207),new Point(138,207),new Point(137,207),new Point(136,207),new Point(135,207),new Point(134,207),new Point(133,207),new Point(132,207),new Point(131,207),new Point(130,207),new Point(130,206),new Point(129,206),new Point(128,206),new Point(127,206),new Point(126,206),new Point(126,205),new Point(125,205),new Point(124,205),new Point(124,204),new Point(123,204),new Point(122,204),new Point(121,204),new Point(120,204),new Point(119,204),new Point(119,205),new Point(119,206),new Point(118,206),new Point(117,206),new Point(116,206),new Point(115,206),new Point(114,206),new Point(113,206),new Point(112,206),new Point(111,206),new Point(110,206),new Point(109,206),new Point(109,205),new Point(108,205),new Point(108,204),new Point(107,204),new Point(107,203),new Point(106,203),new Point(106,202),new Point(106,201),new Point(106,200),new Point(105,200),new Point(104,200),new Point(103,200),new Point(103,199),new Point(102,199),new Point(102,198),new Point(101,198),new Point(101,197),new Point(100,197),new Point(99,197),new Point(99,196),new Point(98,196),new Point(97,196),new Point(96,196),new Point(95,196),new Point(94,196),new Point(93,196),new Point(93,195),new Point(92,195),new Point(91,195),new Point(91,196),new Point(91,197),new Point(91,198),new Point(91,199),new Point(91,200),new Point(90,200),new Point(90,201),new Point(90,202),new Point(90,203),new Point(90,204),new Point(90,205),new Point(90,206),new Point(90,207),new Point(89,207),new Point(88,207),new Point(88,208),new Point(88,209),new Point(88,210),new Point(88,211),new Point(87,211),new Point(87,212),new Point(86,212),new Point(86,213),new Point(85,213),new Point(85,214),new Point(84,214),new Point(84,215),new Point(84,216),new Point(84,217),new Point(84,218),new Point(83,218),new Point(82,218),new Point(81,218),new Point(81,219),new Point(80,219),new Point(79,219),new Point(78,219),new Point(77,219),new Point(77,220),new Point(76,220),new Point(76,221),new Point(75,221),new Point(75,222),new Point(74,222),new Point(74,223),new Point(73,223),new Point(72,223),new Point(72,224),new Point(71,224),new Point(71,225),new Point(71,226),new Point(70,226),new Point(69,226),new Point(68,226),new Point(67,226),new Point(66,226),new Point(65,226),new Point(65,225),new Point(64,225),new Point(63,225),new Point(63,224),new Point(62,224),new Point(62,223),new Point(61,223),new Point(61,222),new Point(60,222),new Point(60,221),new Point(59,221),new Point(58,221),new Point(58,220),new Point(57,220),new Point(56,220),new Point(56,219),new Point(55,219),new Point(54,219),new Point(54,218),new Point(53,218),new Point(52,218),new Point(51,218),new Point(50,218),new Point(49,218),new Point(49,217) }) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_24")) ;
    ResultsHandler.add_result(new String("bestPathQuick"),resultIs) ;
    System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  


static class Tests {
  static String tester = "TesterGrafosGrandes";
}
























static class TestUtils {
  enum ExecutionTime { AFTER, LAST, DURING, UNRELATED }

  static String print(Object obj) {
    return TesterCode.printer(obj);
  }

  static String standardPrinter(Object obj) {
    return printer(obj, x -> standardPrinter(x));
  }

  static String printer(Object obj, Function<Object,String> print) {
    if (obj == null)
      return "null";
    else if (obj instanceof String) {
      return("\""+obj.toString()+"\"");
    } else if (obj instanceof Pair<?,?>) {
      Pair<?,?> p = (Pair<?,?>) obj;
      return "Pair("+print.apply(p.getLeft())+","+print.apply(p.getRight())+")";
    } else if (obj instanceof Set<?>) {
      Iterable<?> l = (Iterable<?>) obj;
      StringBuffer buf = new StringBuffer();
      buf.append("{");
      boolean first = true;
      for (Object lobj : l) {
        if (first) first=false;
        else buf.append(",");
        buf.append(print.apply(lobj));
      }
      buf.append("}");
      return buf.toString();
    } else if (obj instanceof Iterable<?>) {
      Iterable<?> l = (Iterable<?>) obj;
      StringBuffer buf = new StringBuffer();
      buf.append("[");
      boolean first = true;
      for (Object lobj : l) {
        if (first) first=false;
        else buf.append(",");
        buf.append(print.apply(lobj));
      }
      buf.append("]");
      return buf.toString();
    } else if (obj instanceof Map<?,?>) {
      Map<?,?> m = (Map<?,?>) obj;
      StringBuffer buf = new StringBuffer();
      buf.append("[");
      boolean first = true;
      for (Entry<?,?> lobj : m.entries()) {
        if (first) first=false;
        else buf.append(",");
        buf.append("("+print.apply(lobj.getKey())+","+print.apply(lobj.getValue())+")");
      }
      buf.append("]");
      return buf.toString();
    } else if (obj instanceof Object[]) {
      Object[] arr = (Object[]) obj;
      StringBuffer buf = new StringBuffer();
      buf.append("[");
      boolean first = true;
      for (int i=0; i<arr.length; i++) {
        Object aobj = arr[i];
        if (first) first=false;
        else buf.append(",");
        buf.append(print.apply(aobj));
      }
      buf.append("]");
      return buf.toString();
    }
    else
      return obj.toString();
  }

  static void printWarning(String TestName) {
      TestData.message("\n*** Warning in "+TestName+":");
  }

  static void printError(String TestName) {
      TestData.message("\n\n***********************************************");
      TestData.message("*** Error in "+TestName+":");
  }

  static void terminateErrorPrint() {
      TestData.message("\n***********************************************\n\n");
  }

  static boolean compare(Object o1, Object o2) {
      if (o1==null) return o2==null;
      else return o1.equals(o2);
  }

  static void printCallException(ExecutionTime time, String msg, Throwable exc) {
    printError(TestData.testName);

      int traceLength = TestData.numCommands();

      if (traceLength > 0) {
        TestData.message("\n"+callSeqString(traceLength,time)+"\n");
        TestData.message(TestData.getTrace());
      }

      switch (time) {
      case AFTER:
	  TestData.message("the call to "+msg+" raised the exception "+exc+
			     " although it should not have");
	  break;
      default:
	  TestData.message(" -- the exception "+exc+" was raised although it "+
			     "should not have been\n"+msg);
	  break;
      }
      TestData.message(getStackTrace(exc));
      terminateErrorPrint();
    }

  static String getStackTrace(Throwable throwable) {
    filterStackTrace(throwable);
    StringWriter errors = new StringWriter();
    throwable.printStackTrace(new PrintWriter(errors));
    return errors.toString();
  }

  static void filterStackTrace(Throwable throwable) {
    StackTraceElement[] stackTrace = throwable.getStackTrace();
    ArrayList<StackTraceElement> l = new ArrayList<StackTraceElement>();
    for (int i=0; i<stackTrace.length; i++) {
      String className = stackTrace[i].getClassName();
      if (className.startsWith("jdk.internal")
          || className.startsWith("org.junit")) break;
      l.add(stackTrace[i]);
    }
    StackTraceElement[] cutStackTrace = new StackTraceElement[l.size()];
    throwable.setStackTrace(l.toArray(cutStackTrace));
  }

  static void printCallException(String msg, Throwable exc) {
    printCallException(ExecutionTime.AFTER,msg,exc);
  }

  static void printCallException(Throwable exc) {
    printCallException(ExecutionTime.LAST,"",exc);
  }

  static void printCallException(Throwable exc, Supplier<String> msg) {
    printCallException(ExecutionTime.LAST,msg.get(),exc);
  }

  static void printWarning(ExecutionTime time, String msg) {
    TestData.message("\n\n***********************************************");
    if (TestData.testName != "") {
      TestData.message("\n*** Warning for "+TestData.testName+": ");
    } else
      TestData.message("\n*** Warning:");

    if (time != TestUtils.ExecutionTime.UNRELATED) {
      int traceLength = TestData.numCommands();
    
      if (traceLength > 0) {
        TestData.message(callSeqString(traceLength,time));
        TestData.message(TestData.getTrace());
      }
    }
    TestData.message(msg);
    terminateErrorPrint();
  }

  static void printError(ExecutionTime time, String msg) {
    printError(TestData.testName);

    if (time != TestUtils.ExecutionTime.UNRELATED) {
      int traceLength = TestData.numCommands();
      
      if (traceLength > 0) {
        TestData.message("\n"+callSeqString(traceLength,time));
        TestData.message(TestData.getTrace());
      }
    }
      
    TestData.message(msg);
    terminateErrorPrint();
  }

  static String callSeqString(int traceLength, ExecutionTime time) {
    if (traceLength < 2)
      return "while executing the call ";
    else {
      switch(time) {
      case AFTER:
	  return "after executing the call sequence ";
      case LAST:
	  return "while executing the last statement of call sequence ";
      case DURING:
	  return "while executing the call sequence ";
      case UNRELATED:
	  return "";
      }
      return "";
    }
  }

  // Checks that results, which may not be an exception nor null
  // (needs prior checks), which are iterables, return the same
  // set of elements.
  // *********************************************
  // WARNING: this relies on a sane definition of
  // hashCode and equals which does not fail upon finding
  // null values...
  static <E extends Iterable<?>,F extends Iterable<?>>
    boolean sameSet(TestCall<E,F> call,
                    TestResult<E,F> result,
                    F expected) {
    return sameSet(call,result.getValue(),expected);
  }

  // *********************************************
  // WARNING: this relies on a sane definition of
  // hashCode and equals which does not fail upon finding
  // null values...
  static <E extends Iterable<?>,F extends Iterable<?>>
    boolean sameSet(TestCall<?,?> call, E value, F expected) {

    HashSet<Object> s1 = new HashSet<Object>();
    HashSet<Object> s2 = new HashSet<Object>();
    for (Object e : value)
      s1.add(e);
    for (Object f : expected)
      s2.add(f);
    if (!s1.equals(s2)) {
      printError
        (ExecutionTime.DURING,
         "the call "+call.toString()+
         " returned a value which contained the elements\n  "+TestUtils.print(s1)+
         "\nwhich differs from the expected elements\n  "+TestUtils.print(s2));
      return false;
    }
    return true;
  }

  // Checks that results, which are iterables, return the same
  // elements, regardless of the order.
  static <E,F> boolean sameElements(TestCall<E,F> call,
                                    TestResult<E,F> result,
                                    F expected) {
    if (!call.noException())
      return false;
    if (!call.nonNull())
      return false;

    return sameElements(call,result.getValue(),expected);
  }

  // *********************************************
  // WARNING: this relies on a sane definition of
  // hashCode and equals which does not fail upon finding
  // null values...

  static <E,F> boolean sameElements(TestCall<E,F> call,
                                    E value,
                                    F expected) {
    
    if (!sameElements(value,expected)) {
      printError
        (ExecutionTime.DURING,
         "the call "+call.toString()+
         " returned a value which contained the elements\n  "+TestUtils.print(value)+
         "\nwhich differs from the expected elements\n  "+TestUtils.print(expected));
      return false;
    }
    return true;
  }

  // *********************************************
  // WARNING: this relies on a sane definition of
  // hashCode and equals which does not fail upon finding
  // null values...
  static <E,F>
    boolean sameElements(E valueP, F expectedP) {
    if ((valueP instanceof Iterable<?>) &&
        (expectedP instanceof Iterable<?>)) {
      Iterable<?> value = (Iterable<?>) valueP;
      Iterable<?> expected = (Iterable<?>) expectedP;
    
      HashMap<Object,Integer> s1 = new HashMap<Object,Integer>();
      HashMap<Object,Integer> s2 = new HashMap<Object,Integer>();
      for (Object e : value) {
        Integer si = s1.get(e);
        if (si == null) si = 0;
        s1.put(e,si+1);
      }
      for (Object f : expected) {
        Integer si = s2.get(f);
        if (si == null) si = 0;
        s2.put(f,si+1);
      }
      if (!s1.equals(s2)) 
        return false;
      else
        return true;
    } else {
      if (!(valueP instanceof Iterable<?>))
        System.out.println
          ("*** Error: result of type "+valueP.getClass()+" does not implement Iterable");
      if (!(expectedP instanceof Iterable<?>))
        System.out.println
          ("*** Error: expected of type "+expectedP.getClass()+" does not implement Iterable");
      throw new RuntimeException();
    }
  }

  // *********************************************
  // WARNING: this relies on a sane definition of
  // equals which does not fail upon finding
  // null values...
  static <E> boolean wellSorted(TestCall<?,?> call,
                                IndexedList<E> value,
                                ArrayIndexedList<ArrayIndexedList<E>> expected) {
    
    int i = 0;
    IndexedList<E> eqClass = null;
    for (E e : value) {
      if (eqClass == null) {
        if (i < expected.size())
          eqClass = new ArrayIndexedList<E>(expected.get(i));
        else {
          printError
            (ExecutionTime.DURING,
             "the call "+call.toString()+
             " returned a list: "+value+
             " which isn't sorted correctly. The correct sort order is "+expected);
          return false;
        }
      }
      if (!eqClass.remove(e)) {
          printError
            (ExecutionTime.DURING,
             "the call "+call.toString()+
             " returned a list: "+value+
             " which isn't sorted correctly. The correct sort order is "+expected);
          return false;
      }
      if (eqClass.size() == 0) {
        eqClass = null;
        i++;
      }
    }
    if (eqClass != null || i < expected.size()) {
          printError
            (ExecutionTime.DURING,
             "the call "+call.toString()+
             " returned a list: "+value+
             " which isn't sorted correctly. The correct sort order is "+expected);
          return false;
    }
    return true;
  }

  static <E> PositionList<E> extractElementsFromIterable(String callString, Iterable<E> i) {
    if (i == null) {
      printError
        (ExecutionTime.DURING,
         "the call "+callString+
         " returned an null iterable");
      return null;
    }

    PositionList<E> l = null;

    try {
      java.util.Iterator<E> it = i.iterator();
      l = extractElementsFromIterator(it);
    } catch (Throwable exc) {
      printError
        (ExecutionTime.DURING,
         "the call "+callString+
         " returned an iterable which when used raised the exception "+
         exc+"\n"+getStackTrace(exc));
      return null;
    }
    return l;
  }

  static <E> PositionList<E> extractElementsFromIterator(java.util.Iterator<E> it) {
    PositionList<E> l = new NodePositionList<E>();
    while (it.hasNext()) {
      l.addLast(it.next());
    }
    return l;
  }

  static <E,F> boolean unorderedIterableCorrect
    (TestCall<Iterable<E>,F[]> call,
     TestResult<Iterable<E>,F[]> result,
     F[] expected) {
    java.util.Iterator<E> it = null;

    try {
      it = result.getValue().iterator();
      if (it == null) {
        printError
          (ExecutionTime.DURING,
           "the call "+call.toString()+
           " returned an iterable which returned a null iterator");
	return false;
      }
      else return unorderedIteratorCorrect(() -> call.toString(), it, expected);
    } catch (Throwable exc) {
      printError
        (ExecutionTime.DURING,
         "the call "+call.toString()+
         " returned an iterable which when used raised the exception "+
         exc+"\n"+getStackTrace(exc));
      return false;
    }
  }

  static <E,F> boolean unorderedIteratorCorrect
    (TestCall<java.util.Iterator<E>,F[]> call,
     TestResult<java.util.Iterator<E>,F[]> result,
     F[] expected) {
    java.util.Iterator<E> it = result.getValue();
    return unorderedIteratorCorrect(() -> call.toString(), it, expected);
  }

  static <E,F> boolean unorderedIteratorCorrect
    (Supplier<String> callString,
     Iterator<E> it,
     F[] expected) {

    PositionList<E> l = null;

    try { l = extractElementsFromIterator(it); }
    catch ( Throwable exc ) {
      TestUtils.printCallException(exc);
      return false;
    }

    if (l == null) return false;

    boolean correct = (expected.length == l.size());

    if (correct) {
      PositionList<F> expectedList = new NodePositionList<F>();
      for (int j=0; j<expected.length; j++) {
        expectedList.addLast(expected[j]);
      }
      HashSet<Object> s1 = new HashSet<Object>();
      HashSet<Object> s2 = new HashSet<Object>();
      for (Object e : l)
        s1.add(e);
      for (Object f : expectedList)
        s2.add(f);
      if (!s1.equals(s2)) {
        printError
          (ExecutionTime.DURING,
           "the call "+callString.get()+
           " returned an iterator which returned the elements "+TestUtils.print(s1)+
           " which differs from the expected elements "+TestUtils.print(s2));
        return false;
      }
    }
   
    if (!correct) {
      printError
        (ExecutionTime.DURING,
         "the call "+callString.get()+
         " returned an iterable with the elements "+TestUtils.print(l)+
         " but should have returned the elements "+TestUtils.print(expected));
      return false;
    } else return true;
  }

  static <E,F> boolean iterableCorrect(String callString, E[] original, Iterable<E> i) {
    PositionList<E> l = extractElementsFromIterable(callString, i);
    if (l == null) return false;

    boolean correct = (original.length == l.size());

    if (correct) {
      Position<E> cursor = l.first();
      for (int j=0; j<original.length; j++) {
        if (original[j] == null) {
          correct = correct && (cursor.element() == null);
        }
        correct = correct && original[j].equals(cursor.element());
        if (!correct) break;
        cursor = l.next(cursor);
      }
    }
   
    if (!correct) {
      printError
        (ExecutionTime.DURING,
         "the call "+callString+
         " returned an iterable with the elements "+TestUtils.print(l)+
         " but should have returned the elements "+TestUtils.print(original));
      return false;
    } else return true;
  }

  static <E> boolean unchanged(String callString, E[] original, PositionList<E> l) {
      boolean ok_sofar = true;
      
      if (l.size() != original.length) {
	  ok_sofar = false;
      }

      Position<E> lPos = l.first();
      int i=0;
      while (ok_sofar && lPos != null) {
	  E elem = lPos.element();

	  if (elem == null) ok_sofar = (original[i] == null);
	  else ok_sofar = elem.equals(original[i]);

	  lPos = l.next(lPos);
	  ++i;
      }

      if (!ok_sofar) {
	  printError
            (ExecutionTime.DURING,
	       "the call "+callString+
	       " has modified the input list "+TestUtils.print(original)+
	     "; it has now the elements "+TestUtils.print(l));
	  return ok_sofar;
      }
      return ok_sofar;
  }

  static <E> boolean unchanged(String callString, E[] original, E[] newer) {
      boolean ok_sofar = true;
      
      if (newer.length != original.length) {
	  ok_sofar = false;
      }

      for (int i=0; i<newer.length; i++) {
	  if (newer[i] == null) ok_sofar = (original[i] == null);
	  else ok_sofar = newer[i].equals(original[i]);
      }

      if (!ok_sofar) {
	  printError
	      (ExecutionTime.DURING,
	       "the call "+callString+
	       " has modified the input array "+TestUtils.print(original)+
	       "; it has now the elements "+TestUtils.print(newer));
	  return ok_sofar;
      }
      return ok_sofar;
  }

  static String printArray(Object[] arr) {
      if (arr == null) return "null";
      else {
	  StringBuilder arrString = new StringBuilder("[");
      
	  for (int i = 0; i < arr.length; i++) {
	      arrString.append(arr[i]);
	      if (i < arr.length-1)
		  arrString.append(", ");
	  }
	  arrString.append("]");
	  return arrString.toString();
      }
  }

  static String printArray(int[] arr) {
      if (arr == null) return "null";
      else {
	  StringBuilder arrString = new StringBuilder("[");
      
	  for (int i = 0; i < arr.length; i++) {
	      arrString.append(arr[i]);
	      if (i < arr.length-1)
		  arrString.append(", ");
	  }
	  arrString.append("]");
	  return arrString.toString();
      }
  }

  public static <T> PositionList<T> toPositionList(T[] arr) {
    NodePositionList<T> l = new NodePositionList<T>();
    for (int i=0; i<arr.length; i++)
      l.addLast(arr[i]);
    return l;
  }

  public static <T> IndexedList<T> toIndexedList(T[] arr) {
    ArrayIndexedList<T> l = new ArrayIndexedList<T>();
    for (int i=0; i<arr.length; i++)
      l.add(0,arr[i]);
    return l;
  }

  public static void reportPid() {
    try {
      String[] ids = ManagementFactory.getRuntimeMXBean().getName().split("@");
      BufferedWriter bw = new BufferedWriter(new FileWriter("pid"));
      bw.write(ids[0]);
      bw.close();
    } catch (Exception e) {
      System.out.println("Avisa al profesor de fallo sacando el PID");
    }
  }

  @SafeVarargs
  @SuppressWarnings("varargs")
  public static <T> T[] toGenericArray(T ... elems) {
    return elems;
  }

  public static boolean ensureAedlibVersion(int major, int minor, int patchlevel) {
    boolean isOk = true;
    int aedlibMajor = 0, aedlibMinor = 0, aedlibPatchlevel = 0;
    
    try {
      Class<?> aedlibVersion = Class.forName("es.upm.aedlib.Version");
      Method majorMethod = aedlibVersion.getDeclaredMethod("major");
      Method minorMethod = aedlibVersion.getDeclaredMethod("minor");
      Method patchlevelMethod = aedlibVersion.getDeclaredMethod("patchlevel");

      aedlibMajor =
	(Integer) majorMethod.invoke(null);
      aedlibMinor = 
	(Integer) minorMethod.invoke(null);
      aedlibPatchlevel = 
	(Integer) patchlevelMethod.invoke(null);

      isOk =
	((aedlibMajor > major)
	 || ((aedlibMajor == major) &&
	     ((aedlibMinor > minor)
	      || ((aedlibMinor == minor) &&
		  (aedlibPatchlevel >= patchlevel)))));
    } catch (Throwable exc) {
      System.out.println
	("*** WARNING: cannot check aedlib version number due to "+exc);
      exc.printStackTrace();
    }

    if (!isOk) {
      String errorMessage =
	"*** ERROR: aedlib is too old. Minimum version needed is "+
	major+"."+minor+"."+patchlevel+"; your version is "+
	aedlibMajor+"."+aedlibMinor+"."+aedlibPatchlevel+
	". Please download a new version of aedlib from moodle\n";
      System.out.println(errorMessage);
      throw new RuntimeException(errorMessage);
    } else return true; 	      
  }

  public static es.upm.aedlib.Entry<es.upm.aedlib.graph.Vertex<Integer>,Integer> es_upm_aedlib_map_Entry_refl_cnstr(Object... params) {
    return (es.upm.aedlib.Entry<es.upm.aedlib.graph.Vertex<Integer>,Integer>) reflectionNew("es.upm.aedlib.map.HashEntry",params);
  }

  public static Object reflectionNew(String className, Object... params) {
    try {
      Class<?> cl = Class.forName(className);
      for (java.lang.reflect.Constructor<?> cnstr : cl.getConstructors()) {
        Class<?>[] parameterTypes = cnstr.getParameterTypes();
        if (parameterTypes.length == params.length) {
          boolean equals = true;
          for (int i=0; i<parameterTypes.length && equals; i++) {
            if (!parameterTypes[i].isInstance(params[i]))
              equals = false;
          }
          if (equals) {
            cnstr.setAccessible(true);
            return cnstr.newInstance(params);
          }
        }
      }
    } catch (ClassNotFoundException exc) {
      System.out.println
        ("*** Warning: could not access class "+className);
      throw new RuntimeException();
    } catch (InstantiationException exc) {
      System.out.println
        ("*** Warning: could not instantiate "+className);
      throw new RuntimeException();
    } catch (IllegalAccessException exc) {
      System.out.println
        ("*** Warning: could not access "+className);
      throw new RuntimeException();
    } catch (InvocationTargetException exc) {
      System.out.println
        ("*** Warning: constructor "+className+" raised an exception");
      throw new RuntimeException();
    }
    throw new RuntimeException();
  }
}

interface TestResult<E,F> {
  boolean isException();
  Throwable getException();
  E getValue();
  boolean checkResult(F expected);
}

static class Result<E,F> implements TestResult<E,F> {
  private boolean isException;
  private Throwable exception;
  private E value;
  Call<E,F> call;

  public static <E,F> Result<E,F> result(E e, Call<E,F> call) {
    Result<E,F> result = new Result<E,F>();
    result.isException = false;
    result.value = e;
    result.call = call;
    return result;
  }
  
  public static <E,F> Result<E,F> exception(Throwable exception, Call<E,F> call) {
    Result<E,F> result = new Result<E,F>();
    result.isException = true;
    result.exception = exception;
    result.call = call;
    return result;
  }
  
  public boolean isException() {
    return isException;
  }

  public Throwable getException() {
    if (!isException()) {
      TestData.message("*** Internal model error: calling getException() without exception");
      throw new RuntimeException();
    }
    return exception;
  }

  public E getValue() {
    if (isException())
      throw new RuntimeException();
    return value;
  }
  
  Call<E,F> getCall() {
    return call;
  }

  public boolean checkResult(F expected) {
    try {
      return getCall().checkResult(expected);
    } catch (Throwable exc) {
      System.out.println("\n\n\n*** Internal testing error: checkResult("+expected+") raised exception "+exc);
      exc.printStackTrace();
      TestData.message("\n\n\n*** Internal testing error: checkResult("+expected+") raised exception "+exc);
      TestUtils.printCallException(exc);
      TestData.message("\n");
      throw new RuntimeException();
    }
  }

  public String toString() {
    String callString = getCall().toString();
    if (!callString.equals("")) {
      if (isException())
	return callString + "  =>  " + getException();
      else
	return callString + "  =>  " + TesterCode.printer(getValue());      
    } else return callString;
  }
}

interface Call<E,F> {
  TestResult<E,F> doCall();
  String toString();
  boolean checkResult(F expected);
}

static abstract class TestCall<E,F> implements Call<E,F> {
  TestResult<E,F> result;
  boolean hasCalled;
  boolean voidReturn = false;

  public TestResult<E,F> doCall() {
    if (hasCalled())
      throw new RuntimeException();

    hasCalled = true;
    TestData.addCallToTrace(this.toString());
    
    try {
      E e = call();
      result = Result.result(e,this);
    } catch (Throwable exception) {
      result = Result.exception(exception,this);
    }

    if (result.isException() || !voidReturn)
      TestData.modifyLastCallInTrace(TesterCode.printer(result));
    return result;
  }

  abstract E call() throws Exception;

  boolean hasCalled() {
    return hasCalled;
  }

  boolean noException() {
    if (result.isException()) {
      Throwable throwable = result.getException();
      TestUtils.printCallException(throwable);
      return false;
    }
    return true;
  }

  boolean noException(Supplier<String> msg) {
    if (result.isException()) {
      Throwable throwable = result.getException();
      TestUtils.printCallException(throwable,msg);
      return false;
    }
    return true;
  }

  boolean throwsException(String expectedName) {
    if (!result.isException()) {
      TestUtils.printError
        (TestUtils.ExecutionTime.LAST,
         "\nthe call to "+this+" should have thrown an exception "+expectedName+
         " but did not.");
      return false;
    }

    Throwable exception = result.getException();
    if (!expectedName.equals(exception.getClass().getCanonicalName())) {
      TestUtils.printError
        (TestUtils.ExecutionTime.LAST,
         "\nthe call to "+this+" should have thrown the exception "+
         expectedName+
         ", but throwed the exception "+exception+"\n"+
         TestUtils.getStackTrace(exception));
      return false;
    }

    return true;
  }

  boolean nonNull() {
    if (!noException())
      return false;
    if (result.getValue() == null) {
      TestUtils.printError
        (TestUtils.ExecutionTime.LAST,
         "\nthe call to "+this+
         " returned null but it should not have\n");
      return false;
    } else return true;
  }

  boolean nonNull(Supplier<String> msg) {
    if (!noException())
      return false;
    if (result.getValue() == null) {
      TestUtils.printError
        (TestUtils.ExecutionTime.LAST,
         "\nthe call to "+this+
         " returned null but it should not have\n"+
         msg.get());
      return false;
    } else return true;
  }

  boolean fresh(Object obj) {
    return fresh(result.getValue(),obj);
  }

  boolean fresh(Object obj1, Object obj2) {
    if (obj1 != null && obj1 == obj2) {
      TestUtils.printError
        (TestUtils.ExecutionTime.LAST,
         "\nthe call to "+this+
         " returned an object\n  "+TestUtils.print(obj1)+
         "\nwhich is the same REFERENCE as an argument object; "+
         "a NEW object should have been returned\n");
      return false;
    } else return true;
  }

  boolean unchanged(Object obj1, Object obj2) {
    return report_unchanged(obj1.equals(obj2),obj1,obj2);
  }

  boolean report_unchanged(boolean result, Object obj1, Object obj2) {
    if (!result) {
      TestUtils.printError
        (TestUtils.ExecutionTime.LAST,
         "\nthe call to "+this+
         "\nchanged a method parameter into\n  "+TestUtils.print(obj1)+
         "\nwhich used to be\n  "+TestUtils.print(obj2)+".\nIt should not have been changed.\n");
    }
    return result;
  }

  boolean unchanged_array(Object[] original, Object[] newer) {
      boolean ok_sofar = true;
      
      if (newer.length != original.length) {
	  ok_sofar = false;
      }

      for (int i=0; i<newer.length; i++) {
	  if (newer[i] == null) ok_sofar = (original[i] == null);
	  else ok_sofar = newer[i].equals(original[i]);
      }

      if (!ok_sofar) {
	  TestUtils.printError
	      (TestUtils.ExecutionTime.LAST,
	       "the call to "+this+
	       " has modified the input array "+TestUtils.printArray(original)+
	       "; it has now the elements "+TestUtils.printArray(newer));
	  return ok_sofar;
      }
      return ok_sofar;
  }

  boolean setsMatch(Object expected) {
    if (!noException())
      return false;

    if (!(expected instanceof Iterable<?>)) {
      TestData.message("Cannot iterate over expected value "+TestUtils.print(expected));
      throw new RuntimeException();
    }
    Iterable<?> ev = (Iterable<?>) expected;

    E value = result.getValue();
    if (!(value instanceof Iterable<?>)) {
      TestData.message("Cannot iterate over result value "+TestUtils.print(value));
      throw new RuntimeException();
    }
    Iterable<?> iv = (Iterable<?>) value;

    HashSet<Object> ts1 = new HashSet<Object>();
    HashSet<Object> ts2 = new HashSet<Object>();


    for (Object s1 : iv)
      ts1.add(s1);
    for (Object s2 : ev)
      ts2.add(s2);
    
    if (!ts1.equals(ts2)) {
      TestUtils.printError
        (TestUtils.ExecutionTime.LAST,
         "\nthe call to "+this+
         " returned a value\n"+TestUtils.print(value)+
         "\nwhich does not contain the same elements as the expected answer"+
         "\n"+expected);
      return false;
    }

    return true;
  }

  // For use in invariant checking code only -- does not report failure
  boolean silentCheckTrueResult() {
    if (result.isException()) {
      TestUtils.printError
	(TestUtils.ExecutionTime.LAST,
	 "\n*** INTERNAL ERROR in tester: an invariant raised an exception\n");
      Throwable throwable = result.getException();
      TestUtils.printCallException(throwable);
      return false;
    }

    E value = result.getValue();

    if (value == null) {
      TestUtils.printError
	(TestUtils.ExecutionTime.LAST,
	 "\n*** INTERNAL ERROR in tester: an invariant returned a null object\n");
      return false;
    }
    
    return value.equals(true);
  }

  boolean valuesMatch(Object expected) {
    if (result.isException()) {
      noException();
      return false;
    } else {
      E value = result.getValue();
      
      if (value == null) {
        if (expected != null) {
          TestUtils.printError
            (TestUtils.ExecutionTime.LAST,
             "\nthe call to "+this+" returned null, "+
             "but should have returned "+TestUtils.print(expected));
          return false;
        }
        else return true;
      }
      
      if (!value.equals(expected)) {
        TestUtils.printError
          (TestUtils.ExecutionTime.LAST,
           "\nthe call to "+this+" returned\n  "+TestUtils.print(value)+
           "\n\nbut should have returned\n  "+TestUtils.print(expected));
        return false;
      }
      return true;
    }
  }

  public boolean checkResult(F expected) {
    if (!hasCalled())
      throw new RuntimeException();

    return valuesMatch(expected);
  }
}












public static class GraphAnalysis {
  public Transportistas t;
  public DirectedGraph<Point,Integer> g;
  public Integer[][] map;
  public int rows;
  public int cols;
  public Map<Point,Vertex<Point>> points2vertices;
  public Map<Vertex<Point>,Point> vertices2points;

  public GraphAnalysis(Transportistas t,
                       DirectedGraph<Point,Integer> g,
                       Integer[][] map,
                       int rows,
                       int cols,
                       Map<Point,Vertex<Point>> points2vertices,
                       Map<Vertex<Point>,Point> vertices2points) {
    this.t = t;
    this.g = g;
    this.map = map;
    this.rows = rows;
    this.cols = cols;
    this.points2vertices = points2vertices;
    this.vertices2points = vertices2points;
  }

  public static GraphAnalysis checkGraph(Transportistas t,
                                         Integer[][] map,
                                         DirectedGraph<Point,Integer> g,
                                         int rows, int cols) {

    Map<Vertex<Point>,Point> vertices2points =
      new HashTableMap<Vertex<Point>,Point>();
    Map<Point,Vertex<Point>> points2vertices =
      new HashTableMap<Point,Vertex<Point>>();

    boolean allVertices[][] =
      new boolean[cols][rows];

    int numVertices = 0;
    

    for (int col=0; col<cols; col++) {
      for (int row=0; row<rows; row++) {
        if (map[col][row] != null)
          ++numVertices;
      }
    }

    if (numVertices != g.size()) {
      TestUtils.printError
        (TestUtils.ExecutionTime.LAST,
         "\n The map has "+numVertices+" vertices, but the graph has "+
         g.size()+" vertices.\n"+
         "The graph is\n"+TransportistasChecker.printGraph(t,g,cols,rows,points2vertices,vertices2points));
      return null;
    }

    for (Vertex<Point> v : g.vertices()) {

      Point point = v.element();

      if (point == null) {
          TestUtils.printError
            (TestUtils.ExecutionTime.LAST,
             "a vertex contains a null point in the graph.\n"+
             "The graph is\n"+TransportistasChecker.printGraph(t,g,cols,rows,points2vertices,vertices2points));
          return null;
      } else allVertices[point.getX()][point.getY()] = true;


      for (Edge<Integer> e : g.outgoingEdges(v)) {
        Integer altitude = e.element();
        if (altitude == null) {
          TestUtils.printError
            (TestUtils.ExecutionTime.LAST,
             "\n the vertex at "+point+" has an outgoing edge labelled by null??.\n"+
             "The graph is\n"+TransportistasChecker.printGraph(t,g,cols,rows,points2vertices,vertices2points));
          return null;
        }
      }

      vertices2points.put(v,point);
      points2vertices.put(point,v);
    }

    
    for (int col=0; col<cols; col++) {
      for (int row=0; row<rows; row++) {
        Point point = new Point(col,row);
        if (allVertices[col][row] == false && map[col][row] != null) {
          TestUtils.printError
            (TestUtils.ExecutionTime.LAST,
             "the point "+point+" is not null in the map "+
             "but there is no vertex in the graph labelled by the point.\n"+
             "The graph is\n"+TransportistasChecker.printGraph(t,g,cols,rows,points2vertices,vertices2points));
          return null;
        } else if (allVertices[col][row] == true  && map[col][row] == null) {
          TestUtils.printError
            (TestUtils.ExecutionTime.LAST,
             "There is a vertex in the graph labelled by the point "+point+
             " but the point is null in the map.\n"+
             "The graph is\n"+TransportistasChecker.printGraph(t,g,cols,rows,points2vertices,vertices2points));
          return null;
        }
      }
    }

    GraphAnalysis ga =
      new GraphAnalysis(t,g,map,rows,cols,points2vertices,vertices2points);
      
    boolean edgeResult = ga.addEdges();
    if (!edgeResult) return null;
    else return ga;
  }

  boolean addEdges() {
    for (Vertex<Point> v : g.vertices()) {
      Point point = v.element();
      int col = point.getX();
      int row = point.getY();

      if (map[col][row] != null) {
        Map<Vertex<Point>,Pair<Point,Integer>> edges =
          new HashTableMap<Vertex<Point>,Pair<Point,Integer>>();
        addEdge(edges,v,point,new Point(col,row-1));
        addEdge(edges,v,point,new Point(col,row+1));
        addEdge(edges,v,point,new Point(col-1,row));
        addEdge(edges,v,point,new Point(col+1,row));
        /*
          addEdge(edges,v,point,new Point(col+1,row-1));
          addEdge(edges,v,point,new Point(col+1,row+1));
          addEdge(edges,v,point,new Point(col-1,row-1));
          addEdge(edges,v,point,new Point(col-1,row+1));
        */
        if (!checkEdges(edges,v,point))
          return false;
      }
    }
    return true;
  }

  void addEdge(Map<Vertex<Point>,Pair<Point,Integer>> edges,
               Vertex<Point> fromVertex,
               Point fromPoint,
               Point toPoint) {
    int fromX = fromPoint.getX();
    int fromY = fromPoint.getY();
    int toX = toPoint.getX();
    int toY = toPoint.getY(); 
    if (toX >= 0 && toX < cols && toY >= 0 && toY < rows &&
        map[toX][toY] != null) {
      Vertex<Point> toVertex = points2vertices.get(toPoint);
      int cost = Math.max(0,map[toX][toY]-map[fromX][fromY])+1;
      edges.put(toVertex,new Pair<Point,Integer>(toPoint,cost));
    }
  }

  boolean checkEdges(Map<Vertex<Point>,Pair<Point,Integer>> edges,
                     Vertex<Point> fromVertex,
                     Point fromPoint) {
    if (g.outDegree(fromVertex) != edges.size()) {
      TestUtils.printError
        (TestUtils.ExecutionTime.LAST,
         "\n There should be "+edges.size()+" edges in the graph "+
         "from vertex "+fromPoint+
         " but there are "+g.outDegree(fromVertex)+" ones;\nEdges: "+
         printEdges(g.outgoingEdges(fromVertex))+
         "\ngraph:\n"+TransportistasChecker.printGraph(t,g,cols,rows,points2vertices,vertices2points)+"\n");
      return false;
    }

    for (Edge<Integer> e : g.outgoingEdges(fromVertex)) {
      Vertex<Point> toVertex = g.endVertex(e);
      Pair<Point,Integer> pairCost = edges.remove(toVertex);
      if (pairCost != null) {
        int pCost = pairCost.getRight();
        int edgeCost = e.element();
        if (pCost != edgeCost) {
          Point point = pairCost.getLeft();
          TestUtils.printError
            (TestUtils.ExecutionTime.LAST,
             "\n The edge from vertex "+fromPoint+
             " to vertex "+point+
             " should have cost "+pCost+
             " but has cost "+edgeCost+
             " in the graph\n"+TransportistasChecker.printGraph(t,g,cols,rows,points2vertices,vertices2points)); 
          return false;
        }
      }
    }

    if (!edges.isEmpty()) {
      Iterator<Entry<Vertex<Point>,Pair<Point,Integer>>> entries =
        edges.entries().iterator();
      Entry<Vertex<Point>,Pair<Point,Integer>> pairCost =
        entries.next();
      Pair<Point,Integer> pair = pairCost.getValue();
      Point point = pair.getLeft();
      TestUtils.printError
        (TestUtils.ExecutionTime.LAST,
         "\n There is no edge from vertex "+fromPoint+
         " to vertex "+point+
         " in the graph\n"+TransportistasChecker.printGraph(t,g,cols,rows,points2vertices,vertices2points)); 
        return false;
    } else return true;
  }

  String printEdge(Edge<Integer> edge) {
    StringBuffer sb = new StringBuffer();
    Vertex<Point> from = g.startVertex(edge);
    Vertex<Point> to = g.endVertex(edge);
    sb.append(vertices2points.get(from)+" -"+edge.element()+"-> "+vertices2points.get(to));
    return sb.toString();
  }

  String printEdges(Iterable<Edge<Integer>> edges) {
    StringBuffer sb = new StringBuffer();
    for (Edge<Integer> e : edges) {
      sb.append(printEdge(e)+",");
    }
    return sb.toString();
  }

  public boolean checkPath(Point startPoint,
                           Point endPoint,
                           PositionList<Point> path,
                           Integer bestCost,
                           Point[] bestPath) {
    boolean pathCorrect = true;

    if (path == null) {
      TestUtils.printError
        (TestUtils.ExecutionTime.LAST,
         "the returned path is null");
      return false;
    }
    
    // We permit either an empty path if from==to,
    // or a singleton path
    if (path.isEmpty()) {
      if (startPoint.equals(endPoint))
        return true;
      else
        pathCorrect = false;
    } else {
      Position<Point> cursor = path.first();
      Point cursorPoint = cursor.element();
      if (cursorPoint == null || !cursorPoint.equals(startPoint))
        pathCorrect = false;

      if (pathCorrect && path.size()==1) {
        if (startPoint.equals(endPoint))
          return true;
        else
          pathCorrect = false;
      }

      if (pathCorrect) {
        Vertex<Point> fromV = points2vertices.get(cursorPoint);
        int calculatedCost = 0;
        cursor = path.next(cursor);

        while (cursor != null && pathCorrect) {
          Point nextPoint = cursor.element();
          if (nextPoint == null)
            pathCorrect = false;
          else {
            Vertex<Point> nextV = points2vertices.get(nextPoint);
            if (nextV == null) pathCorrect = false;
            else {
              Integer cost = findTransition(g,fromV,nextV);
              if (cost != null) {
                cursor = path.next(cursor);
                fromV = nextV;
                calculatedCost += cost;
                //System.out.println("calculatedCost = "+calculatedCost);
              } else pathCorrect = false;
            }
          }
        }
        pathCorrect =
          pathCorrect && (fromV==points2vertices.get(endPoint));

        if (pathCorrect && bestCost != null) {
          int bCost = bestCost;
          if (calculatedCost-bCost == 0)
            return true;
          else {
            TestUtils.printError
              (TestUtils.ExecutionTime.LAST,
               "the returned path "+printPath(path)+
               " has a cost of "+calculatedCost+
               " but there exists a better path with cost "+bestCost+": "+Arrays.toString(bestPath));
            return false;
          }
        }
      }
    }

    if (pathCorrect) return true;
    else {
      TestUtils.printError
        (TestUtils.ExecutionTime.LAST,
         "the returned path "+printPath(path)+
         " does not lead from "+startPoint+" to "+endPoint+
         " or contains pairs of vertices that are not connected"+
         ".\n");
      return false;
    }
  }

  static Integer findTransition(DirectedGraph<Point,Integer> g, Vertex<Point> from, Vertex<Point> to) {
    for (Edge<Integer> e : g.outgoingEdges(from)) {
      if (g.endVertex(e) == to)
        return e.element();
    }
    return null;
  }

  static String printPath(PositionList<Point> l) {
    StringBuffer sb = new StringBuffer();
    for (Point p : l) {
      sb.append(p+",");
    }
    return sb.toString();
  }
}


static class TransportistasChecker {

  public static String printMap(Integer[][] map, int cols, int rows) {
    StringBuffer sb = new StringBuffer();
    sb.append("\n");
    sb.append("(y) ");
    for (int i=0; i<cols; i++) {
        sb.append("---");
    }
    sb.append("--\n");
    for (int i=rows-1; i>=0; i--) {
      sb.append("  "+i+" ");
      printMapRow(sb,map,i,cols);
      sb.append("\n");
    }
    sb.append("    ");
    for (int i=0; i<cols; i++) {
      sb.append("---");
    }
    sb.append("--\n");
    sb.append("    ");
    for (int i=0; i<cols; i++) {
      sb.append("  "+i);
    }
    sb.append(" (x)\n");
    return sb.toString();
  }

  public static String printMapRaw(Integer[][] map, int cols, int rows) {
    StringBuffer sb = new StringBuffer();
    for (int row=rows-1; row>=0; row--) {
      sb.append(row+": ");
      for (int col=0; col<cols; col++) {
        if (map[col][row]==null)
          sb.append(null+" ");
        else
          sb.append(map[col][row]+"    ");
      }
      sb.append("\n");
    }
    return sb.toString();
  }
  
  static void printMapRow(StringBuffer sb, Integer[][]map, int row, int cols) {
    for (int i=0; i<cols; i++) {
      Integer altitude = map[i][row];
      if (i==0) sb.append("| ");
      else sb.append("  ");
      if (altitude == null) sb.append("-");
      else {
        sb.append(altitude);
      }
      if (i==cols-1) sb.append(" |");
    }
  }

  public static String printGraph(Transportistas t,
                                  DirectedGraph<Point,Integer> g,
                                  int cols,
                                  int rows,
                                  Map<Point,Vertex<Point>> points2vertices,
                                  Map<Vertex<Point>,Point> vertices2points) {
    StringBuffer sb = new StringBuffer();

    for (Vertex<Point> v : g.vertices()) {
      String vName = "";
      Point point = v.element();
      if (point != null) vName = point.toString();
      sb.append(vName+": ");
      boolean added = false;
      for (Edge<Integer> e : g.outgoingEdges(v)) {
	Vertex<Point> otherVertice = g.endVertex(e);
        String otherName = otherVertice.toString();
        Point otherPoint = vertices2points.get(otherVertice);
        if (otherPoint != null) otherName = otherPoint.toString();
	String edgeSymbol="->";
        String edgeLabel = "";
        if (e.element() != null)
          edgeLabel = Long.valueOf(Math.round(e.element())).toString();
	if (added) sb.append(", ");
	sb.append("-" + edgeLabel + edgeSymbol + otherName);
	added = true;
      }
      sb.append("\n");
    }
    return sb.toString();
  }
  
}


static class Constructor extends TestCall<Transportistas,Void> {
  Integer[][] map;
  int rows;
  int cols;
  
  public Constructor(Integer[][] map) {
    this.map = map;
    this.rows = map[0].length;
    this.cols = map.length;
  }
  
  @Override
  public String toString() {
    return
      "new Transportistas(map) where map is\n"
      +TransportistasChecker.printMap(map,cols,rows);      
  }
  
  @Override
  public Transportistas call() {
    return new Transportistas(map);
  }
  
  @Override
  @SuppressWarnings({"unchecked","rawtypes"})
  public boolean checkResult(Void arg) {
    if (!noException() || !nonNull())
      return false;

    DirectedGraph<Point,Integer> graph = null;
    Transportistas t = result.getValue();

    try {
      Field graphField;
      graphField = t.getClass().getDeclaredField("graph");
      graphField.setAccessible(true);
      graph = (DirectedGraph<Point,Integer>) graphField.get(t);
    } catch ( Throwable exc ) {
      TestUtils.printCallException
	(TestUtils.ExecutionTime.LAST,
	 "cannot access the field graph: ",
	 exc);
      return false;
    }
    
    if (graph == null) {
      TestUtils.printError
        (TestUtils.ExecutionTime.LAST,
         "the resulting graph is null\n");
      return false;
    }

    return GraphAnalysis.checkGraph(t,map,graph,rows,cols) != null;
  }
}


static class PathFromTo extends TestCall<PositionList<Point>,Void> {
  Integer[][] map;
  int rows;
  int cols;
  Point fromPoint;
  Point toPoint;
  Transportistas t;
  
  public PathFromTo(Integer[][] map, Point fromPoint, Point toPoint) {
    this.map = map;
    this.rows = map[0].length;
    this.cols = map.length;
    this.fromPoint = fromPoint;
    this.toPoint = toPoint;
  }
  
  @Override
  public String toString() {
    return
      "g.pathFromTo(new Point"+fromPoint+",new Point"+toPoint+") with the graph g constructed from the map\n"
      +TransportistasChecker.printMap(map,cols,rows);      
  }
  
  @Override
  public PositionList<Point> call() {
    t = new Transportistas(map);
    return t.pathFromTo(fromPoint,toPoint);
  }
  
  @Override
  @SuppressWarnings({"unchecked","rawtypes"})
  public boolean checkResult(Void arg) {
    if (!noException())
      return false;

    DirectedGraph<Point,Integer> graph = null;

    try {
      Field graphField;
      graphField = t.getClass().getDeclaredField("graph");
      graphField.setAccessible(true);
      graph = (DirectedGraph<Point,Integer>) graphField.get(t);
    } catch ( Throwable exc ) {
      TestUtils.printCallException
	(TestUtils.ExecutionTime.LAST,
	 "cannot access the field graph: ",
	 exc);
      return false;
    }

    if (graph == null) {
      TestUtils.printError
        (TestUtils.ExecutionTime.LAST,
         "the graph g is null\n");
      return false;
    }

    GraphAnalysis ga = GraphAnalysis.checkGraph(t,map,graph,rows,cols);
    PositionList<Point> path = result.getValue();

    if (ga == null) return false;
    else return ga.checkPath(fromPoint,toPoint,path,null,null);
  }
}


























static class BestPath extends TestCall<PositionList<Point>,Pair<Point[],Integer>> {
  Integer[][] map;
  int rows;
  int cols;
  Point fromPoint;
  Point toPoint;
  Transportistas t;
  
  public BestPath(Integer[][] map, Point fromPoint, Point toPoint) {
    this.map = map;
    this.rows = map[0].length;
    this.cols = map.length;
    this.fromPoint = fromPoint;
    this.toPoint = toPoint;
  }
  
  @Override
  public String toString() {
    return
      "g.bestPathFromTo(new Point"+fromPoint+",new Point"+toPoint+") with the graph g constructed from the map\n"
      +aed.caminos.TesterLab7.TransportistasChecker.printMap(map,cols,rows);
  }
  
  @Override
  public PositionList<Point> call() {
    t = new Transportistas(map);
    return t.bestPathFromTo(fromPoint,toPoint);
  }
  
  @Override
  @SuppressWarnings({"unchecked","rawtypes"})
  public boolean checkResult(Pair<Point[],Integer> pair) {
    Point[] bestPath = pair.getLeft();
    Integer bestCost = pair.getRight();
    
    if (!noException())
      return false;

    if (result.getValue() == null) {
      TestUtils.printError
        (TestUtils.ExecutionTime.LAST,
         "the returned path is null\n");
      return false;
    }

    DirectedGraph<Point,Integer> graph = null;

    try {
      Field graphField;
      graphField = t.getClass().getDeclaredField("graph");
      graphField.setAccessible(true);
      graph = (DirectedGraph<Point,Integer>) graphField.get(t);
    } catch ( Throwable exc ) {
      TestUtils.printCallException
	(TestUtils.ExecutionTime.LAST,
	 "cannot access the field graph: ",
	 exc);
      return false;
    }

    if (graph == null) {
      TestUtils.printError
        (TestUtils.ExecutionTime.LAST,
         "the graph g is null\n");
      return false;
    }

    // Before calling out to TesterLab7 we have to set its context
    aed.caminos.TesterLab7.TestData.setContext
      (TestData.getTestName(),
       TestData.getRawTrace());

    aed.caminos.TesterLab7.GraphAnalysis ga =
      aed.caminos.TesterLab7.GraphAnalysis.checkGraph(t,map,graph,rows,cols);
    PositionList<Point> path = result.getValue();

    if (ga == null) return false;
    else return ga.checkPath(fromPoint,toPoint,path,bestCost,bestPath);
  }
}

static class BestPathQuick extends TestCall<PositionList<Point>,Point[]> {
  int cols;
  int rows;
  Point p0;
  Point p1;
  static AltitudeMap map = null;
  Transportistas t = null;
  
  public BestPathQuick(Point p0, Point p1) {
    this.p0 = p0;
    this.p1 = p1;
    if (map == null) {
      // String currentDir = System.getProperty("user.dir");
      // System.out.println("Current dir using System:" +currentDir);
      map =
        AltitudeMap.readFromDisk
        ("toledo.map","src/toledo.map","src/aed/caminos/toledo.map","../../toledo.map","../toledo.map");
    } else {
      System.out.println("map is "+map);    
    }
    this.cols = map.getCols();
    this.rows = map.getRows();
    System.out.println("Using a map of dimensions "+cols+"x"+rows);
  }

  @Override
  public String toString() {
    return "bestPathFromTo(new Point("+p0+"),new Point("+p1+"))";
  }
  
  @Override
  public PositionList<Point> call() {
    t = new Transportistas(map.getAltitude2DData());
    return t.bestPathFromTo(p0,p1);
  }

  @Override
  public boolean checkResult(Point[] bestPath) {
    if (!noException() || !nonNull())
      return false;

    DirectedGraph<Point,Integer> graph = null;
    try {
      Field graphField;
      graphField = t.getClass().getDeclaredField("graph");
      graphField.setAccessible(true);
      graph = (DirectedGraph<Point,Integer>) graphField.get(t);
    } catch ( Throwable exc ) {
      TestUtils.printCallException
	(TestUtils.ExecutionTime.LAST,
	 "cannot access the field graph: ",
	 exc);
      return false;
    }
    
    if (graph == null) {
      TestUtils.printError
        (TestUtils.ExecutionTime.LAST,
         "the resulting graph is null\n");
      return false;
    }

    // Before calling out to TesterLab7 we have to set its context
    aed.caminos.TesterLab7.TestData.setContext
      (TestData.getTestName(),
       TestData.getRawTrace());

    aed.caminos.TesterLab7.GraphAnalysis ga =
      aed.caminos.TesterLab7.GraphAnalysis.checkGraph(t,map.getAltitude2DData(),graph,rows,cols);
    PositionList<Point> path = result.getValue();

    if (ga == null) return false;

    int bestCost = 0;
    
    int i = 0;
    if (bestPath.length > 1) {
      Point pFrom = bestPath[i++];
      while (i < bestPath.length) {
        Point pTo = bestPath[i++];
        Vertex<Point> vFrom = ga.points2vertices.get(pFrom);
        Vertex<Point> vTo = ga.points2vertices.get(pTo);
        Integer cost = findTransitionCost(graph,vFrom,vTo);
        bestCost += cost;
        pFrom = pTo;
      }
    }

    boolean pathCheck = ga.checkPath(p0,p1,path,bestCost,bestPath);
    if (!pathCheck) {
      System.out.println("\nShowing the correct and incorrect (the lighter one) paths");
      displayPathsAndMap(bestPath,path,map);
    }
    return pathCheck;
  }

  static void displayPathsAndMap(Point[] bestPath,
                                 PositionList<Point> path,
                                 AltitudeMap map) {
    JFrame fr = new JFrame("Counterexample map");
    fr.addWindowListener
      (new WindowAdapter() {
          @Override
          public void windowClosing(WindowEvent windowEvent) {
            ResultsHandler.waitForThreads.countDown();
          }
        });
    fr.add(new PaintAltitudeMap(map,bestPath,path,3,3));
    fr.setSize(map.getCols()*3,
               map.getRows()*3);
    ResultsHandler.waitForThreads =
      new CountDownLatch(1);
    fr.setVisible(true);
  }

  static Integer findTransitionCost(DirectedGraph<Point,Integer> g, Vertex<Point> from, Vertex<Point> to) {
    for (Edge<Integer> e : g.outgoingEdges(from)) {
      if (g.endVertex(e) == to)
        return e.element();
    }
    return null;
  }
}


static class AltitudeMap {
  private int rows;
  private int cols;
  private int minAltitude;
  private int maxAltitude;
  private Integer[] altitudeData;
  
  public AltitudeMap(Integer[] altitudeData, int rows, int cols) {
    this.rows = rows;
    this.cols = cols;
    minAltitude = 10000000;
    maxAltitude = -1000000;
    this.altitudeData = altitudeData;

    for (int altitude : altitudeData) {
      if (altitude < minAltitude) {
        minAltitude = altitude;
      }
      if (altitude > maxAltitude) {
        maxAltitude = altitude;
      }
    }
  }

  Integer[] getAltitudeData() {
    return altitudeData;
  }

  Integer[][] getAltitude2DData() {
    Integer[][] altitudeData = new Integer[cols][rows];
    int counter=0;
    for (int i=0; i<rows; i++)
      for (int j=0; j<cols; j++)
        altitudeData[j][i] = this.altitudeData[counter++];
    return altitudeData;
  }

  int getMinAltitude() {
    return minAltitude;
  }

  int getMaxAltitude() {
    return maxAltitude;
  }

  Integer getAltitude(Point point) {
    return altitudeData[point.getY()*cols+point.getX()];
  }

  public int getRows() {
    return rows;
  }

  public int getCols() {
    return cols;
  }

  public AltitudeMap reduceAltitudeMap(int yDivisor, int xDivisor) {
    int newNRows = rows / yDivisor;
    int newNCols = cols / xDivisor;
    System.out.println
      ("reducing map: dimensions was "+rows+" rows and "+cols+" columns; "+
       "now is "+newNRows+" rows and "+newNCols+" columns");
    Integer[] newAltitudeMap = new Integer[newNRows*newNCols];
    int counter = 0;
    for (int row=0; row<yDivisor*newNRows; row++) {
      for (int col=0; col<xDivisor*newNCols; col++) {
        if (((row % yDivisor) == 0) && ((col % xDivisor) == 0)) {
          try {
            newAltitudeMap[counter++] = altitudeData[row*cols+col];
          } catch (ArrayIndexOutOfBoundsException exc) {
            System.out.println("exception at row="+row+" col="+col+
                               " array size="+altitudeData.length+
                               " counter="+counter+
                               " (max size="+newAltitudeMap.length+")");
            throw new RuntimeException();
          }
        }
      }
    }
    return new AltitudeMap(newAltitudeMap, newNRows, newNCols);
  }

  public static AltitudeMap readAltitudeMap(String fileName) {
    Scanner sc = null;
    try {
      sc = new Scanner(new File(fileName));
    } catch (FileNotFoundException exc) {
      System.out.println("*** Error: file "+fileName+" not found");
      System.exit(-1);
    }
    
    sc.next("NCOLS");
    int nCols = sc.nextInt();
    sc.next("NROWS");
    int nRows = sc.nextInt();
    sc.next("XLLCENTER");
    int xCenter = sc.nextInt();
    sc.next("YLLCENTER");
    int yCenter = sc.nextInt();
    sc.next("CELLSIZE");
    int cellSize = sc.nextInt();
    sc.next("NODATA_VALUE");
    int noDataMarker = sc.nextInt();

    Integer[] altitudeData = new Integer[nCols*nRows];
    int counter = 0;
    
    while (sc.hasNext() && counter < nCols*nRows) {
      altitudeData[counter++] = sc.nextInt();
    }
    
    if (counter < nCols*nRows) {
      System.out.println("*** Error: short read: only "+counter+
                         " items read; expected to read "+nCols*nRows);
      System.exit(1);
    }
    
    sc.close();
    AltitudeMap altitudeMap = new AltitudeMap(altitudeData, nRows, nCols);
    System.out.println("y center="+yCenter+" x center="+xCenter+" cellsize="+cellSize);
    System.out.println(altitudeMap);
    return altitudeMap;
  }  

  public void writeToDisk(String fileName) {
    DataOutputStream out = null;
    try {
      out =
        new DataOutputStream
        (new BufferedOutputStream
         (new FileOutputStream(fileName)));
      try {
        out.writeInt(2323231);
        out.writeInt(cols);
        out.writeInt(rows);
        for (int i=0; i<altitudeData.length; i++)
          out.writeInt(altitudeData[i].intValue());
        out.close();
      } catch (IOException exc) {
        System.out.println("\n*** Error: file exception "+exc+" writing to "+fileName);
        throw new RuntimeException();
      }
    } catch (FileNotFoundException exc) {
      System.out.println("file "+fileName+" not found");
    }
  }

  public static AltitudeMap readFromDisk(String... fileNames) {
    DataInputStream in = null;
    Integer dataBuffer[];
    int rows;
    int cols;
    int fileNameCounter = 0;
    String fileName = null;

    for (int i=0; i<fileNames.length; i++) {
      try {
        in =
          new DataInputStream
          (new BufferedInputStream
           (new FileInputStream(fileNames[i])));
        fileName = fileNames[i];
      } catch (FileNotFoundException exc) { }
      if (in != null) break;
    }

    if (in == null) {
      System.out.println
        ("\n *** Error: cannot find file toledo.map; has it been added to the eclipse project?");
      throw new RuntimeException();
    }

    try {
      int magic = in.readInt();
      if (magic != 2323231) {
        System.out.println("\n*** Error: "+fileName+" does not appear to be a map file");
        in.close();
        throw new RuntimeException();
      }
      cols = in.readInt();
      rows = in.readInt();
      dataBuffer = new Integer[rows*cols];
      int counter = 0;
      for (int i=0; i<dataBuffer.length; i++)
        dataBuffer[counter++] = in.readInt();
      in.close();
    } catch (IOException exc) {
      System.out.println("\n*** Error: file exception "+exc+" writing to "+fileName);
      throw new RuntimeException();
    }
    return new AltitudeMap(dataBuffer,rows,cols);
  }

  public String toString() {
    return
      "rows="+rows+
      ",cols="+cols+
      ",number of points="+(rows*cols)+
      ",min altitude="+minAltitude+
      ",max altitude="+maxAltitude;
  }
}

static class PaintAltitudeMap extends JPanel {
  private AltitudeMap altitudeMap;
  BufferedImage image;
  private int nRows;
  private int nCols;
  private int xDivisor;
  private int yDivisor;

  public PaintAltitudeMap(AltitudeMap altitudeMap, Point[] bestPath, PositionList<Point> path, int xDivisor, int yDivisor)
  {
    super();
    byte[] pixels = altitudeDataToPixels(altitudeMap);
    this.nRows = altitudeMap.getRows();
    this.nCols = altitudeMap.getCols();
    this.xDivisor = xDivisor;
    this.yDivisor = yDivisor;
    this.altitudeMap = altitudeMap;
    
    image = new BufferedImage(nCols, nRows, BufferedImage.TYPE_BYTE_GRAY);
    WritableRaster raster = image.getRaster();
    raster.setDataElements(0, 0, image.getWidth(), image.getHeight(), pixels);
    image.setData(raster);
    Graphics2D g = image.createGraphics();
    g.setColor(Color.RED);
    if (path != null) {
      BasicStroke stroke=new BasicStroke(2);
      g.setStroke(stroke);
      for (Point point : path) {
        g.fillRect(point.getX(),point.getY(),1,1);
      }
    }
    // Lighter path is the best one, the darker is the incorrect path
    g.setColor(Color.GREEN);
    if (path != null) {
      BasicStroke stroke=new BasicStroke(2);
      g.setStroke(stroke);
      for (Point point : bestPath) {
        g.fillRect(point.getX(),point.getY(),1,1);
      }
    }
  }
  
  public void paintComponent(Graphics g)
  {
    int nRows = altitudeMap.getRows();
    int nCols = altitudeMap.getCols();
    
    g.drawImage(image, 0, 0, nCols*xDivisor, nRows*xDivisor, null);
    //repaint();
  }
  
  public byte[] altitudeDataToPixels(AltitudeMap altitudeMap) {
    Integer[] altitudeData = altitudeMap.getAltitudeData();
    int minAltitude = altitudeMap.getMinAltitude();
    int maxAltitude = altitudeMap.getMaxAltitude();
    
    byte pixels[] = new byte[altitudeData.length];
    for (int i=0; i<altitudeData.length; i++) {
      int altitude = altitudeData[i];
      int normalizedAltitude =
        (255*(altitude - minAltitude)) / (maxAltitude-minAltitude);
      int displayAltitude =
        255 - normalizedAltitude;
      pixels[i] = (byte) displayAltitude;
    }
    System.out.println();
    return pixels;
  }
}




static class BaseResultsHandler {
  public static volatile CountDownLatch waitForThreads = null;
  static LinkedHashMap<String,Boolean> results_sofar;
  static HashSet<String> runningTests;
  static int numTestsRemaining = 1000;
  static long endTime = 0;

  static void init() {
    results_sofar = new LinkedHashMap<String,Boolean>();
    runningTests = new HashSet<String>();
  }

  static void setNumTestsRemaining(int numTestsToRun, int GlobalTimeoutInSeconds) {
    numTestsRemaining = numTestsToRun;
    endTime = System.currentTimeMillis() + GlobalTimeoutInSeconds*1000;
  }

  static boolean isTimedout() {
    return System.currentTimeMillis() > endTime;
  }

  static void startTest(String testName) {
    runningTests.add(testName);
  }

  static void stopTest(String testName) {
    runningTests.remove(testName);
    --numTestsRemaining;
  }

  static boolean results_ok_sofar() {
    for (String key : results_sofar.keySet())
      if (!results_sofar.get(key))
        return false;
    return true;
  }

  static boolean local_results_ok_sofar(String test_type) {
    Boolean result = results_sofar.get(test_type);
    return (result==null) || result;
  }

  static void add_result(String test_type, boolean result) {
    Boolean old_result = results_sofar.get(test_type);
    if ((old_result == null) || old_result)
      results_sofar.put(test_type,result);
  }

  static boolean results_ok() {
    if (results_sofar.size() == 0) {
      System.out.println("\n*** Error: no tests were run");
      return false;
    }

    if (runningTests.size() > 0) {
      System.out.println("\n*** Error: some tests ("+runningTests.size()+") are still running\n");
      return false;
    }

    for (String key : results_sofar.keySet())
      if (!results_sofar.get(key))
        return false;

    if (numTestsRemaining > 0) {
      System.out.println("\n*** Error: some tests ("+numTestsRemaining+") did not run\n");
      return false;
    }

    return true;
  }

  static int get_nota() {
    if (results_ok()) return 10;
    else return 0;
  }

  static void report_results() {
    System.out.println("\n\n++++++++++++++++++++++++++++++++++++++++++\n");

    for (String testName : results_sofar.keySet()) {
      System.out.print("Testing results for "+testName+": ");
      if (results_sofar.get(testName))
        System.out.println("succeeded");
      else
        System.out.println("failed");
    }

    System.out.println("\n------------------------------------------");
    if (results_ok())
      System.out.println("\n"+Tests.tester+": Test finalizado correctamente.\n");
    else
      System.out.println("\n"+Tests.tester+": errores detectados.\n\n");
  }
}





public static class TestData {
  static String testName = "";
  static ArrayList<String> trace;
  static ArrayList<String> messages;
  static boolean isJunitTester;

  public static void initTrace() {
    trace = new ArrayList<String>();
    messages = new ArrayList<String>();
  }

  public static void setTesterType(boolean junitTesting) {
    isJunitTester = junitTesting;
  }

  public static boolean isJunitTester() {
    return isJunitTester;
  }

  public static void addCallToTrace(String callString) {
    if (!callString.equals(""))
      trace.add("  "+callString);
    else
      trace.add(callString);
  }

  public static void modifyLastCallInTrace(String callString) {
    if (trace.size() > 0) {
      trace.remove(trace.size()-1);
    if (!callString.equals(""))
      trace.add("  "+callString);
    else
      trace.add(callString);
    }
  }

  public static void message(String message) {
    messages.add(message);
  }

  public static int numCommands() {
    return trace.size();
  }

  private static String arrayToString(ArrayList<String> arr) {
    StringBuffer sb = new StringBuffer();

    for (int i=0; i<arr.size(); i++) {
      String item = arr.get(i);
      if (!item.equals("")) {
	sb.append(item+"\n");
      }
    }
    return sb.toString();
  }

  public static String getTrace() {
    return arrayToString(trace);
  }

  public static String getMessages() {
    return arrayToString(messages);
  }

  public static String getTestName() {
    return testName;
  }

  public static ArrayList<String> getRawTrace() {
    return trace;
  }

  public static void setTrace(ArrayList<String> setTrace) {
    trace = setTrace;
  }

  public static void setTestName(String setTestName) {
    testName = setTestName;
  }

  public static void setContext(String setTestName, ArrayList<String> setTrace) {
    setTestName(setTestName);
    setTrace(setTrace);
  }
}

static class ResultsHandler extends BaseResultsHandler {
  static void report_results() {
    BaseResultsHandler.report_results();
    if (results_ok()) {
      System.out.println("\n\n");
          System.out.println();
          System.out.println("     .      .     II |  \\)  .      .         .              .     /\\     .");
          System.out.println("  .      .      .II  |    merry          .          .    .        \\ \\.");
          System.out.println("    .       .     II |   ,christmas  .        __       .      /\\_,'  /~|  .");
          System.out.println("  .      .     .   ~~~--'                    {::;,~;  __  ,-. \\  /~._)::");
          System.out.println("     .      .     .       .      .      . (\\_/`:_';;._;:: ::|  ; `;;;;; .");
          System.out.println("  .     .     ___..----._      .     .    `-.__  `-._;;;;-'::_.' ,;;;,'   .");
          System.out.println("      .    ,-'           `-._     .      .     `-.__ `:_::::`.__,;:::;-, .");
          System.out.println("    .    ,'           _______`; .     .       .     `--.`._::::::::_:-' . .");
          System.out.println("  .    ,'  ____--#############|   .       .        .    `-.`::::::'  .   .");
          System.out.println("      | ./|###################|      .         .          | ::::::     .");
          System.out.println("  ,###\\/  |######-----~~~~~~~~:   .      .         .    _.--'    :_.--.___");
          System.out.println("  |####|   |   .....     .... :||.    .        .      .'  \\\\\\     _      _>");
          System.out.println("  `####'  |:: ;;;;;;;   ;;;;;;:::|.      .   .        ; 0   \\\\\\_--;`~~--~");
          System.out.println("         ||:;    __       __   :|||.  .    .        _,'  _-~_ \\\\ ~;       .");
          System.out.println(" .  .   ||:;    '  `   _ '  `  ::|||     .      _.-'\\\\\\-~_-~   \\\\.'  .  .");
          System.out.println("  .    ||:;        _,,(_),,_    :||'  .      . (_)   \\\\\\~  __.--';     .");
          System.out.println("      ||::::     ,|||||||||||.   ::||   .  .     `--','\\\\'~     .'  .      .");
          System.out.println(" .   |:::::::_  ,|||||   |||||,   :|'    .      .   `--' `.     ;       .");
          System.out.println("    ||;;;:::::::;|||||___|||||':::::||      .             :     :    .     .");
          System.out.println("    `|;;::::::::::::::::::::::::::::::|  .       .    .   ;     :      .");
          System.out.println("  .    ,|;;|::::::|||||||||::::::||||||       .    .     ,'      :  .      .");
          System.out.println("      |;;;||||::::::|||||::::::::::|||'---.___          ,'       :       .");
          System.out.println("      |;;;;||||||::::::|||::::::::::||__ :::::`---.____,'         :  .     .");
          System.out.println(" .    `|;;;;||||||::::::|||:::::::|||'  `-._\":::::::: ,'           :--._");
System.out.println("   .    _,|;;;|||||||||:::|::::::||''       `.\":::::,'           _::::::`.");
System.out.println(" .    ,' |;;;;;;;;|||||::::::::||;;           `-.::;            |#########|");
System.out.println("   .  |      `|;;;;|||||;;;;:;;;'                ,'            |##########|");
System.out.println(" .   |         `||;;;;||;;;;|||'                _;-'\\          /          |");
System.out.println("     |         ||  `;;;;;;;;;;' ________    _.-'      \\      /'            |");
System.out.println("  . |          |      ````''_,-|::::::::`,-'   ___      \\   (    ,'|       |");
System.out.println("    |          |           /___/' _`---;'  _.-'   \\       \\  `--' ,'       |");
System.out.println("   |          |       ___#####,--'   ,'  ,\\;;;\\   |`\\|:    |     :'       ,'");
System.out.println("   |          :__.---'   |####      ,'  :` `\\::`\\_| ;    _;      `.____.-'");
System.out.println("  :                      |####      ;___:  / `.::;: `.__,'     ____--'  |");
System.out.println("  ;                      |####     /____|  \\. `.;;;|                     \\");
          System.out.println("  `,                _____|####__             ; `~~~~|                     |");
          System.out.println("   `._____,--------'     ~~~~~  `-._________,'       |_____________________\\          ");
          System.out.println();
    }
  }
}

static class TesterCode
{
  
  public static void resetPrinter () 
  {
  }
  
  public static String printer (Object obj) 
  {
    return TestUtils.standardPrinter(obj) ;
  }
  
}


}
