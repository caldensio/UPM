
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
// File generated at: 2019/11/4 -- 16:19:12
// Seed: {1572,880751,106793}
//
//////////////////////////////////////////////////////////////////////



package aed.individual5;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import java.util.concurrent.CountDownLatch;
import java.lang.reflect.*;
import es.upm.aedlib.Entry;
import es.upm.aedlib.Pair;
import es.upm.aedlib.Position;
import es.upm.aedlib.indexedlist.*;
import es.upm.aedlib.map.*;
import es.upm.aedlib.positionlist.*;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.*;
import java.lang.management.ManagementFactory;
import java.lang.reflect.*;
import java.time.Duration;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.function.Function;



/**
 * The main tester class which contains JUnit5 tests.
 */
@SuppressWarnings({"unused","deprecation"})
public class TesterInd5 {

  
    

  @BeforeAll
  public static void init () 
  {
    TestUtils.reportPid() ;
    ResultsHandler.init() ;
    ResultsHandler.setNumTestsRemaining(61,60) ;
    TestData.setTesterType(true) ;
    TestUtils.ensureAedlibVersion(2,5,1) ;
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
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_01") ;
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
    ResultsHandler.add_result(new String("maxTemperatures"),resultIs) ;
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
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_02") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_02")) ;
if (ok_sofar)
  ok_sofar = new MaxTemperatures(107L,111L,new TempData[] {  }).doCall().checkResult(new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray())) ;
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
    ResultsHandler.add_result(new String("maxTemperatures"),resultIs) ;
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
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_03") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_03")) ;
if (ok_sofar)
  ok_sofar = new MaxTemperatures(107L,109L,new TempData[] { new TempData(new String("Mulhacen"),112L,17),new TempData(new String("La Linea"),112L,10),new TempData(new String("Madrid"),112L,14),new TempData(new String("Soria"),112L,10) }).doCall().checkResult(new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray())) ;
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
    ResultsHandler.add_result(new String("maxTemperatures"),resultIs) ;
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
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_04") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_04")) ;
if (ok_sofar)
  ok_sofar = new MaxTemperatures(109L,112L,new TempData[] { new TempData(new String("Sevilla"),113L,26),new TempData(new String("Madrid"),113L,17),new TempData(new String("Mostoles"),113L,10),new TempData(new String("Salamanca"),113L,23) }).doCall().checkResult(new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray())) ;
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
    ResultsHandler.add_result(new String("maxTemperatures"),resultIs) ;
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
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_05") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_05")) ;
if (ok_sofar)
  ok_sofar = new MaxTemperatures(109L,116L,new TempData[] { new TempData(new String("Madrid"),111L,13),new TempData(new String("Mostoles"),111L,13),new TempData(new String("Salamanca"),111L,15),new TempData(new String("Ponferrada"),111L,28) }).doCall().checkResult(new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("Ponferrada"),new Integer(28)),new es.upm.aedlib.Pair<String,Integer>(new String("Salamanca"),new Integer(15)),new es.upm.aedlib.Pair<String,Integer>(new String("Mostoles"),new Integer(13)),new es.upm.aedlib.Pair<String,Integer>(new String("Madrid"),new Integer(13))))) ;
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
    ResultsHandler.add_result(new String("maxTemperatures"),resultIs) ;
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
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_06") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_06")) ;
if (ok_sofar)
  ok_sofar = new MaxTemperatures(110L,116L,new TempData[] { new TempData(new String("Madrid"),110L,23),new TempData(new String("Mulhacen"),111L,22),new TempData(new String("Madrid"),111L,19),new TempData(new String("Mostoles"),111L,14),new TempData(new String("Salamanca"),111L,26),new TempData(new String("Ponferrada"),111L,30) }).doCall().checkResult(new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("Ponferrada"),new Integer(30)),new es.upm.aedlib.Pair<String,Integer>(new String("Salamanca"),new Integer(26)),new es.upm.aedlib.Pair<String,Integer>(new String("Mostoles"),new Integer(14)),new es.upm.aedlib.Pair<String,Integer>(new String("Mulhacen"),new Integer(22)),new es.upm.aedlib.Pair<String,Integer>(new String("Madrid"),new Integer(23))))) ;
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
    ResultsHandler.add_result(new String("maxTemperatures"),resultIs) ;
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
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_07") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_07")) ;
if (ok_sofar)
  ok_sofar = new MaxTemperatures(112L,120L,new TempData[] { new TempData(new String("Mulhacen"),116L,25),new TempData(new String("La Linea"),116L,28),new TempData(new String("Madrid"),116L,24),new TempData(new String("Mostoles"),116L,25),new TempData(new String("Soria"),116L,22),new TempData(new String("Ponferrada"),116L,30) }).doCall().checkResult(new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("Ponferrada"),new Integer(30)),new es.upm.aedlib.Pair<String,Integer>(new String("Soria"),new Integer(22)),new es.upm.aedlib.Pair<String,Integer>(new String("Mostoles"),new Integer(25)),new es.upm.aedlib.Pair<String,Integer>(new String("Madrid"),new Integer(24)),new es.upm.aedlib.Pair<String,Integer>(new String("La Linea"),new Integer(28)),new es.upm.aedlib.Pair<String,Integer>(new String("Mulhacen"),new Integer(25))))) ;
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
    ResultsHandler.add_result(new String("maxTemperatures"),resultIs) ;
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
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_08") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_08")) ;
if (ok_sofar)
  ok_sofar = new MaxTemperatures(107L,111L,new TempData[] { new TempData(new String("Mulhacen"),110L,10),new TempData(new String("Madrid"),110L,11),new TempData(new String("Salamanca"),110L,18),new TempData(new String("Soria"),110L,22),new TempData(new String("Ponferrada"),110L,20),new TempData(new String("Mulhacen"),111L,15),new TempData(new String("Sevilla"),111L,19),new TempData(new String("La Linea"),111L,28),new TempData(new String("Puerto de Navacerrada"),111L,29),new TempData(new String("Salamanca"),111L,14),new TempData(new String("Soria"),111L,12),new TempData(new String("Ponferrada"),111L,25) }).doCall().checkResult(new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("Puerto de Navacerrada"),new Integer(29)),new es.upm.aedlib.Pair<String,Integer>(new String("La Linea"),new Integer(28)),new es.upm.aedlib.Pair<String,Integer>(new String("Sevilla"),new Integer(19)),new es.upm.aedlib.Pair<String,Integer>(new String("Ponferrada"),new Integer(25)),new es.upm.aedlib.Pair<String,Integer>(new String("Soria"),new Integer(22)),new es.upm.aedlib.Pair<String,Integer>(new String("Salamanca"),new Integer(18)),new es.upm.aedlib.Pair<String,Integer>(new String("Madrid"),new Integer(11)),new es.upm.aedlib.Pair<String,Integer>(new String("Mulhacen"),new Integer(15))))) ;
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
    ResultsHandler.add_result(new String("maxTemperatures"),resultIs) ;
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
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_09") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_09")) ;
if (ok_sofar)
  ok_sofar = new MaxTemperatures(111L,119L,new TempData[] { new TempData(new String("Madrid"),116L,27),new TempData(new String("Puerto de Navacerrada"),116L,11),new TempData(new String("Soria"),116L,14),new TempData(new String("La Linea"),117L,27),new TempData(new String("Madrid"),117L,26),new TempData(new String("Mostoles"),117L,15),new TempData(new String("Puerto de Navacerrada"),117L,22),new TempData(new String("Ponferrada"),117L,19),new TempData(new String("Mulhacen"),118L,30),new TempData(new String("La Linea"),118L,14),new TempData(new String("Madrid"),118L,27),new TempData(new String("Salamanca"),118L,26) }).doCall().checkResult(new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("Salamanca"),new Integer(26)),new es.upm.aedlib.Pair<String,Integer>(new String("Mulhacen"),new Integer(30)),new es.upm.aedlib.Pair<String,Integer>(new String("Ponferrada"),new Integer(19)),new es.upm.aedlib.Pair<String,Integer>(new String("Mostoles"),new Integer(15)),new es.upm.aedlib.Pair<String,Integer>(new String("La Linea"),new Integer(27)),new es.upm.aedlib.Pair<String,Integer>(new String("Soria"),new Integer(14)),new es.upm.aedlib.Pair<String,Integer>(new String("Puerto de Navacerrada"),new Integer(22)),new es.upm.aedlib.Pair<String,Integer>(new String("Madrid"),new Integer(27))))) ;
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
    ResultsHandler.add_result(new String("maxTemperatures"),resultIs) ;
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
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_10") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_10")) ;
if (ok_sofar)
  ok_sofar = new MaxTemperatures(110L,112L,new TempData[] { new TempData(new String("Sevilla"),107L,27),new TempData(new String("Mostoles"),107L,20),new TempData(new String("Ponferrada"),107L,25),new TempData(new String("Mulhacen"),108L,14),new TempData(new String("Sevilla"),108L,30),new TempData(new String("La Linea"),108L,12),new TempData(new String("Sevilla"),109L,13),new TempData(new String("La Linea"),109L,11),new TempData(new String("Puerto de Navacerrada"),109L,10),new TempData(new String("Salamanca"),109L,28),new TempData(new String("La Linea"),110L,19),new TempData(new String("Ponferrada"),110L,18),new TempData(new String("Sevilla"),111L,19),new TempData(new String("Puerto de Navacerrada"),111L,30),new TempData(new String("Salamanca"),111L,28) }).doCall().checkResult(new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("Salamanca"),new Integer(28)),new es.upm.aedlib.Pair<String,Integer>(new String("Puerto de Navacerrada"),new Integer(30)),new es.upm.aedlib.Pair<String,Integer>(new String("Sevilla"),new Integer(19)),new es.upm.aedlib.Pair<String,Integer>(new String("Ponferrada"),new Integer(18)),new es.upm.aedlib.Pair<String,Integer>(new String("La Linea"),new Integer(19))))) ;
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
    ResultsHandler.add_result(new String("maxTemperatures"),resultIs) ;
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
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_11") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_11")) ;
if (ok_sofar)
  ok_sofar = new MaxTemperatures(111L,113L,new TempData[] { new TempData(new String("La Linea"),115L,20),new TempData(new String("Sevilla"),116L,30),new TempData(new String("La Linea"),116L,19),new TempData(new String("Madrid"),116L,17),new TempData(new String("Mostoles"),116L,25),new TempData(new String("Puerto de Navacerrada"),116L,30),new TempData(new String("Salamanca"),116L,23),new TempData(new String("Mulhacen"),117L,26),new TempData(new String("Sevilla"),117L,26),new TempData(new String("Mostoles"),117L,28),new TempData(new String("Soria"),117L,20),new TempData(new String("Ponferrada"),117L,10),new TempData(new String("Sevilla"),118L,13),new TempData(new String("Salamanca"),118L,20),new TempData(new String("Soria"),118L,16) }).doCall().checkResult(new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray())) ;
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
    ResultsHandler.add_result(new String("maxTemperatures"),resultIs) ;
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
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_12") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_12")) ;
if (ok_sofar)
  ok_sofar = new MaxTemperatures(110L,112L,new TempData[] { new TempData(new String("La Linea"),108L,24),new TempData(new String("Mostoles"),108L,24),new TempData(new String("Salamanca"),108L,18),new TempData(new String("Soria"),108L,13),new TempData(new String("Mulhacen"),109L,19),new TempData(new String("Sevilla"),109L,29),new TempData(new String("La Linea"),109L,10),new TempData(new String("Madrid"),109L,29),new TempData(new String("Puerto de Navacerrada"),109L,15),new TempData(new String("Mulhacen"),110L,16),new TempData(new String("Puerto de Navacerrada"),110L,15),new TempData(new String("Salamanca"),110L,30),new TempData(new String("Sevilla"),111L,10),new TempData(new String("Madrid"),111L,19),new TempData(new String("Puerto de Navacerrada"),111L,30),new TempData(new String("Soria"),111L,27),new TempData(new String("Ponferrada"),111L,21) }).doCall().checkResult(new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("Ponferrada"),new Integer(21)),new es.upm.aedlib.Pair<String,Integer>(new String("Soria"),new Integer(27)),new es.upm.aedlib.Pair<String,Integer>(new String("Madrid"),new Integer(19)),new es.upm.aedlib.Pair<String,Integer>(new String("Sevilla"),new Integer(10)),new es.upm.aedlib.Pair<String,Integer>(new String("Salamanca"),new Integer(30)),new es.upm.aedlib.Pair<String,Integer>(new String("Puerto de Navacerrada"),new Integer(30)),new es.upm.aedlib.Pair<String,Integer>(new String("Mulhacen"),new Integer(16))))) ;
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
    ResultsHandler.add_result(new String("maxTemperatures"),resultIs) ;
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
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_13") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_13")) ;
if (ok_sofar)
  ok_sofar = new MaxTemperatures(109L,115L,new TempData[] { new TempData(new String("Mulhacen"),112L,15),new TempData(new String("Sevilla"),112L,21),new TempData(new String("Puerto de Navacerrada"),112L,26),new TempData(new String("Ponferrada"),112L,24),new TempData(new String("Sevilla"),113L,22),new TempData(new String("Mostoles"),113L,22),new TempData(new String("Puerto de Navacerrada"),113L,21),new TempData(new String("Mulhacen"),114L,25),new TempData(new String("Sevilla"),114L,30),new TempData(new String("Madrid"),114L,14),new TempData(new String("Mostoles"),114L,10),new TempData(new String("Salamanca"),114L,10),new TempData(new String("Sevilla"),115L,11),new TempData(new String("Madrid"),115L,15),new TempData(new String("Mostoles"),115L,28),new TempData(new String("Salamanca"),115L,11),new TempData(new String("Soria"),115L,17),new TempData(new String("Ponferrada"),115L,26) }).doCall().checkResult(new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("Soria"),new Integer(17)),new es.upm.aedlib.Pair<String,Integer>(new String("Salamanca"),new Integer(11)),new es.upm.aedlib.Pair<String,Integer>(new String("Madrid"),new Integer(15)),new es.upm.aedlib.Pair<String,Integer>(new String("Mostoles"),new Integer(28)),new es.upm.aedlib.Pair<String,Integer>(new String("Ponferrada"),new Integer(26)),new es.upm.aedlib.Pair<String,Integer>(new String("Puerto de Navacerrada"),new Integer(26)),new es.upm.aedlib.Pair<String,Integer>(new String("Sevilla"),new Integer(30)),new es.upm.aedlib.Pair<String,Integer>(new String("Mulhacen"),new Integer(25))))) ;
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
    ResultsHandler.add_result(new String("maxTemperatures"),resultIs) ;
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
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_14") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_14")) ;
if (ok_sofar)
  ok_sofar = new MaxTemperatures(108L,117L,new TempData[] { new TempData(new String("Mulhacen"),109L,29),new TempData(new String("Sevilla"),109L,29),new TempData(new String("La Linea"),109L,25),new TempData(new String("Puerto de Navacerrada"),109L,23),new TempData(new String("Salamanca"),109L,30),new TempData(new String("Soria"),109L,20),new TempData(new String("Sevilla"),110L,19),new TempData(new String("Madrid"),110L,16),new TempData(new String("Salamanca"),110L,26),new TempData(new String("Soria"),110L,10),new TempData(new String("Ponferrada"),110L,18),new TempData(new String("La Linea"),111L,19),new TempData(new String("Madrid"),111L,13),new TempData(new String("Soria"),111L,14),new TempData(new String("Ponferrada"),111L,24),new TempData(new String("Sevilla"),112L,23),new TempData(new String("Madrid"),112L,19),new TempData(new String("Mostoles"),112L,29),new TempData(new String("Soria"),112L,26),new TempData(new String("Ponferrada"),112L,27) }).doCall().checkResult(new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("Mostoles"),new Integer(29)),new es.upm.aedlib.Pair<String,Integer>(new String("Ponferrada"),new Integer(27)),new es.upm.aedlib.Pair<String,Integer>(new String("Madrid"),new Integer(19)),new es.upm.aedlib.Pair<String,Integer>(new String("Soria"),new Integer(26)),new es.upm.aedlib.Pair<String,Integer>(new String("Salamanca"),new Integer(30)),new es.upm.aedlib.Pair<String,Integer>(new String("Puerto de Navacerrada"),new Integer(23)),new es.upm.aedlib.Pair<String,Integer>(new String("La Linea"),new Integer(25)),new es.upm.aedlib.Pair<String,Integer>(new String("Sevilla"),new Integer(29)),new es.upm.aedlib.Pair<String,Integer>(new String("Mulhacen"),new Integer(29))))) ;
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
    ResultsHandler.add_result(new String("maxTemperatures"),resultIs) ;
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
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_15") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_15")) ;
if (ok_sofar)
  ok_sofar = new MaxTemperatures(112L,114L,new TempData[] { new TempData(new String("Sevilla"),113L,17),new TempData(new String("La Linea"),113L,25),new TempData(new String("Madrid"),113L,28),new TempData(new String("Mostoles"),113L,13),new TempData(new String("Puerto de Navacerrada"),113L,23),new TempData(new String("Soria"),113L,10),new TempData(new String("Ponferrada"),113L,14),new TempData(new String("Mulhacen"),114L,22),new TempData(new String("Sevilla"),114L,16),new TempData(new String("Madrid"),114L,18),new TempData(new String("Soria"),114L,12),new TempData(new String("Mulhacen"),115L,30),new TempData(new String("Sevilla"),115L,23),new TempData(new String("La Linea"),115L,10),new TempData(new String("Madrid"),115L,14),new TempData(new String("Salamanca"),115L,12),new TempData(new String("Soria"),115L,25),new TempData(new String("Ponferrada"),115L,18),new TempData(new String("Mulhacen"),116L,28),new TempData(new String("Madrid"),116L,30),new TempData(new String("Puerto de Navacerrada"),116L,10) }).doCall().checkResult(new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("Mulhacen"),new Integer(22)),new es.upm.aedlib.Pair<String,Integer>(new String("Ponferrada"),new Integer(14)),new es.upm.aedlib.Pair<String,Integer>(new String("Soria"),new Integer(12)),new es.upm.aedlib.Pair<String,Integer>(new String("Puerto de Navacerrada"),new Integer(23)),new es.upm.aedlib.Pair<String,Integer>(new String("Mostoles"),new Integer(13)),new es.upm.aedlib.Pair<String,Integer>(new String("Madrid"),new Integer(28)),new es.upm.aedlib.Pair<String,Integer>(new String("La Linea"),new Integer(25)),new es.upm.aedlib.Pair<String,Integer>(new String("Sevilla"),new Integer(17))))) ;
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
    ResultsHandler.add_result(new String("maxTemperatures"),resultIs) ;
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
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_16") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_16")) ;
if (ok_sofar)
  ok_sofar = new MaxTemperatures(107L,110L,new TempData[] { new TempData(new String("Sevilla"),112L,15),new TempData(new String("La Linea"),112L,30),new TempData(new String("Madrid"),112L,26),new TempData(new String("Puerto de Navacerrada"),112L,22),new TempData(new String("Salamanca"),112L,18),new TempData(new String("Soria"),112L,12),new TempData(new String("Ponferrada"),112L,30),new TempData(new String("Sevilla"),113L,11),new TempData(new String("La Linea"),113L,28),new TempData(new String("Puerto de Navacerrada"),113L,10),new TempData(new String("Soria"),113L,15),new TempData(new String("Mulhacen"),114L,23),new TempData(new String("La Linea"),114L,25),new TempData(new String("Puerto de Navacerrada"),114L,21),new TempData(new String("Salamanca"),114L,11),new TempData(new String("Soria"),114L,12),new TempData(new String("Mulhacen"),115L,29),new TempData(new String("Sevilla"),115L,23),new TempData(new String("Madrid"),115L,26),new TempData(new String("Mostoles"),115L,28),new TempData(new String("Puerto de Navacerrada"),115L,28),new TempData(new String("Salamanca"),115L,17) }).doCall().checkResult(new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray())) ;
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
    ResultsHandler.add_result(new String("maxTemperatures"),resultIs) ;
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
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_17") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_17")) ;
if (ok_sofar)
  ok_sofar = new MaxTemperatures(112L,116L,new TempData[] { new TempData(new String("Sevilla"),109L,27),new TempData(new String("Salamanca"),109L,29),new TempData(new String("Puerto de Navacerrada"),110L,18),new TempData(new String("Salamanca"),110L,30),new TempData(new String("Ponferrada"),110L,30),new TempData(new String("Mulhacen"),111L,21),new TempData(new String("Sevilla"),111L,17),new TempData(new String("Madrid"),111L,17),new TempData(new String("Puerto de Navacerrada"),111L,13),new TempData(new String("Soria"),111L,20),new TempData(new String("Ponferrada"),111L,11),new TempData(new String("Madrid"),112L,10),new TempData(new String("Mostoles"),112L,14),new TempData(new String("Salamanca"),112L,24),new TempData(new String("Sevilla"),113L,30),new TempData(new String("La Linea"),113L,17),new TempData(new String("Madrid"),113L,20),new TempData(new String("Salamanca"),113L,21),new TempData(new String("La Linea"),114L,28),new TempData(new String("Madrid"),114L,19),new TempData(new String("Mostoles"),114L,26),new TempData(new String("Puerto de Navacerrada"),114L,25) }).doCall().checkResult(new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("Puerto de Navacerrada"),new Integer(25)),new es.upm.aedlib.Pair<String,Integer>(new String("La Linea"),new Integer(28)),new es.upm.aedlib.Pair<String,Integer>(new String("Sevilla"),new Integer(30)),new es.upm.aedlib.Pair<String,Integer>(new String("Salamanca"),new Integer(24)),new es.upm.aedlib.Pair<String,Integer>(new String("Mostoles"),new Integer(26)),new es.upm.aedlib.Pair<String,Integer>(new String("Madrid"),new Integer(20))))) ;
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
    ResultsHandler.add_result(new String("maxTemperatures"),resultIs) ;
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
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_18") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_18")) ;
if (ok_sofar)
  ok_sofar = new MaxTemperatures(110L,111L,new TempData[] { new TempData(new String("Mulhacen"),107L,10),new TempData(new String("Sevilla"),107L,28),new TempData(new String("La Linea"),107L,25),new TempData(new String("Madrid"),107L,28),new TempData(new String("Mostoles"),107L,18),new TempData(new String("La Linea"),108L,22),new TempData(new String("Mostoles"),108L,15),new TempData(new String("Puerto de Navacerrada"),108L,20),new TempData(new String("Soria"),108L,19),new TempData(new String("Ponferrada"),108L,23),new TempData(new String("Mulhacen"),109L,22),new TempData(new String("Mostoles"),109L,29),new TempData(new String("Puerto de Navacerrada"),109L,17),new TempData(new String("Salamanca"),109L,15),new TempData(new String("Ponferrada"),109L,29),new TempData(new String("Mulhacen"),110L,12),new TempData(new String("La Linea"),110L,12),new TempData(new String("Madrid"),110L,10),new TempData(new String("Mostoles"),110L,21),new TempData(new String("Salamanca"),110L,16),new TempData(new String("Soria"),110L,16),new TempData(new String("Sevilla"),111L,15),new TempData(new String("Puerto de Navacerrada"),111L,13),new TempData(new String("Salamanca"),111L,22) }).doCall().checkResult(new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("Puerto de Navacerrada"),new Integer(13)),new es.upm.aedlib.Pair<String,Integer>(new String("Sevilla"),new Integer(15)),new es.upm.aedlib.Pair<String,Integer>(new String("Soria"),new Integer(16)),new es.upm.aedlib.Pair<String,Integer>(new String("Salamanca"),new Integer(22)),new es.upm.aedlib.Pair<String,Integer>(new String("Mostoles"),new Integer(21)),new es.upm.aedlib.Pair<String,Integer>(new String("Madrid"),new Integer(10)),new es.upm.aedlib.Pair<String,Integer>(new String("La Linea"),new Integer(12)),new es.upm.aedlib.Pair<String,Integer>(new String("Mulhacen"),new Integer(12))))) ;
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
    ResultsHandler.add_result(new String("maxTemperatures"),resultIs) ;
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
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_19") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_19")) ;
if (ok_sofar)
  ok_sofar = new MaxTemperatures(111L,115L,new TempData[] { new TempData(new String("Sevilla"),107L,10),new TempData(new String("La Linea"),107L,20),new TempData(new String("Madrid"),107L,12),new TempData(new String("Salamanca"),107L,14),new TempData(new String("Ponferrada"),107L,22),new TempData(new String("Sevilla"),108L,30),new TempData(new String("Madrid"),108L,18),new TempData(new String("Salamanca"),108L,25),new TempData(new String("Soria"),108L,24),new TempData(new String("Mulhacen"),109L,20),new TempData(new String("Sevilla"),109L,25),new TempData(new String("Madrid"),109L,16),new TempData(new String("Puerto de Navacerrada"),109L,23),new TempData(new String("Salamanca"),109L,15),new TempData(new String("Soria"),109L,14),new TempData(new String("Sevilla"),110L,24),new TempData(new String("Mostoles"),110L,30),new TempData(new String("Puerto de Navacerrada"),110L,16),new TempData(new String("Soria"),110L,30),new TempData(new String("Ponferrada"),110L,25),new TempData(new String("Mulhacen"),111L,17),new TempData(new String("La Linea"),111L,21),new TempData(new String("Madrid"),111L,21),new TempData(new String("Puerto de Navacerrada"),111L,21),new TempData(new String("Salamanca"),111L,14),new TempData(new String("Soria"),111L,12),new TempData(new String("La Linea"),112L,18),new TempData(new String("Madrid"),112L,23),new TempData(new String("Mostoles"),112L,27),new TempData(new String("Puerto de Navacerrada"),112L,10),new TempData(new String("Ponferrada"),112L,15) }).doCall().checkResult(new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("Ponferrada"),new Integer(15)),new es.upm.aedlib.Pair<String,Integer>(new String("Mostoles"),new Integer(27)),new es.upm.aedlib.Pair<String,Integer>(new String("Soria"),new Integer(12)),new es.upm.aedlib.Pair<String,Integer>(new String("Salamanca"),new Integer(14)),new es.upm.aedlib.Pair<String,Integer>(new String("Puerto de Navacerrada"),new Integer(21)),new es.upm.aedlib.Pair<String,Integer>(new String("Madrid"),new Integer(23)),new es.upm.aedlib.Pair<String,Integer>(new String("La Linea"),new Integer(21)),new es.upm.aedlib.Pair<String,Integer>(new String("Mulhacen"),new Integer(17))))) ;
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
    ResultsHandler.add_result(new String("maxTemperatures"),resultIs) ;
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
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_20") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_20")) ;
if (ok_sofar)
  ok_sofar = new MaxTemperatures(112L,120L,new TempData[] { new TempData(new String("Mulhacen"),117L,10),new TempData(new String("Sevilla"),117L,23),new TempData(new String("Mostoles"),117L,10),new TempData(new String("Puerto de Navacerrada"),117L,26),new TempData(new String("Ponferrada"),117L,30),new TempData(new String("Sevilla"),118L,26),new TempData(new String("La Linea"),118L,28),new TempData(new String("Madrid"),118L,10),new TempData(new String("Puerto de Navacerrada"),118L,19),new TempData(new String("Soria"),118L,26),new TempData(new String("Ponferrada"),118L,12),new TempData(new String("Sevilla"),119L,30),new TempData(new String("La Linea"),119L,24),new TempData(new String("Salamanca"),119L,21),new TempData(new String("Ponferrada"),119L,12),new TempData(new String("Mulhacen"),120L,17),new TempData(new String("La Linea"),120L,16),new TempData(new String("Madrid"),120L,29),new TempData(new String("Puerto de Navacerrada"),120L,23),new TempData(new String("Soria"),120L,17),new TempData(new String("Mulhacen"),121L,15),new TempData(new String("La Linea"),121L,26),new TempData(new String("Madrid"),121L,28),new TempData(new String("Mostoles"),121L,10),new TempData(new String("Puerto de Navacerrada"),121L,16),new TempData(new String("Ponferrada"),121L,29),new TempData(new String("Mulhacen"),122L,13),new TempData(new String("La Linea"),122L,16),new TempData(new String("Madrid"),122L,17),new TempData(new String("Mostoles"),122L,10),new TempData(new String("Puerto de Navacerrada"),122L,25),new TempData(new String("Salamanca"),122L,20) }).doCall().checkResult(new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("Salamanca"),new Integer(21)),new es.upm.aedlib.Pair<String,Integer>(new String("Soria"),new Integer(26)),new es.upm.aedlib.Pair<String,Integer>(new String("Madrid"),new Integer(29)),new es.upm.aedlib.Pair<String,Integer>(new String("La Linea"),new Integer(28)),new es.upm.aedlib.Pair<String,Integer>(new String("Ponferrada"),new Integer(30)),new es.upm.aedlib.Pair<String,Integer>(new String("Puerto de Navacerrada"),new Integer(26)),new es.upm.aedlib.Pair<String,Integer>(new String("Mostoles"),new Integer(10)),new es.upm.aedlib.Pair<String,Integer>(new String("Sevilla"),new Integer(30)),new es.upm.aedlib.Pair<String,Integer>(new String("Mulhacen"),new Integer(17))))) ;
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
    ResultsHandler.add_result(new String("maxTemperatures"),resultIs) ;
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
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_21") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_21")) ;
if (ok_sofar)
  ok_sofar = new MaxTemperatures(112L,113L,new TempData[] { new TempData(new String("Sevilla"),107L,10),new TempData(new String("La Linea"),107L,22),new TempData(new String("Madrid"),107L,11),new TempData(new String("Mostoles"),107L,30),new TempData(new String("Puerto de Navacerrada"),107L,16),new TempData(new String("Salamanca"),107L,23),new TempData(new String("Ponferrada"),107L,13),new TempData(new String("Mulhacen"),108L,16),new TempData(new String("La Linea"),108L,10),new TempData(new String("Puerto de Navacerrada"),108L,11),new TempData(new String("Soria"),108L,17),new TempData(new String("Sevilla"),109L,14),new TempData(new String("La Linea"),109L,22),new TempData(new String("Madrid"),109L,29),new TempData(new String("Mostoles"),109L,17),new TempData(new String("Puerto de Navacerrada"),109L,30),new TempData(new String("Salamanca"),109L,13),new TempData(new String("Mulhacen"),110L,21),new TempData(new String("La Linea"),110L,17),new TempData(new String("Puerto de Navacerrada"),110L,13),new TempData(new String("Soria"),110L,24),new TempData(new String("Ponferrada"),110L,19),new TempData(new String("Madrid"),111L,11),new TempData(new String("Salamanca"),111L,15),new TempData(new String("Sevilla"),112L,21),new TempData(new String("Madrid"),112L,23),new TempData(new String("Puerto de Navacerrada"),112L,21),new TempData(new String("Salamanca"),112L,13),new TempData(new String("Soria"),112L,10),new TempData(new String("Ponferrada"),112L,11),new TempData(new String("Sevilla"),113L,28),new TempData(new String("Mostoles"),113L,16),new TempData(new String("Puerto de Navacerrada"),113L,19),new TempData(new String("Salamanca"),113L,10),new TempData(new String("Soria"),113L,20),new TempData(new String("Ponferrada"),113L,16) }).doCall().checkResult(new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("Mostoles"),new Integer(16)),new es.upm.aedlib.Pair<String,Integer>(new String("Ponferrada"),new Integer(16)),new es.upm.aedlib.Pair<String,Integer>(new String("Soria"),new Integer(20)),new es.upm.aedlib.Pair<String,Integer>(new String("Salamanca"),new Integer(13)),new es.upm.aedlib.Pair<String,Integer>(new String("Puerto de Navacerrada"),new Integer(21)),new es.upm.aedlib.Pair<String,Integer>(new String("Madrid"),new Integer(23)),new es.upm.aedlib.Pair<String,Integer>(new String("Sevilla"),new Integer(28))))) ;
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
    ResultsHandler.add_result(new String("maxTemperatures"),resultIs) ;
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
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_22") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_22")) ;
if (ok_sofar)
  ok_sofar = new MaxTemperatures(107L,114L,new TempData[] { new TempData(new String("Mulhacen"),106L,10),new TempData(new String("La Linea"),106L,29),new TempData(new String("Madrid"),106L,13),new TempData(new String("Puerto de Navacerrada"),106L,11),new TempData(new String("Salamanca"),106L,28),new TempData(new String("Sevilla"),107L,18),new TempData(new String("La Linea"),107L,16),new TempData(new String("Soria"),107L,22),new TempData(new String("Ponferrada"),107L,15),new TempData(new String("Mulhacen"),108L,18),new TempData(new String("Sevilla"),108L,15),new TempData(new String("Madrid"),108L,29),new TempData(new String("Mostoles"),108L,19),new TempData(new String("Ponferrada"),108L,30),new TempData(new String("Sevilla"),109L,14),new TempData(new String("Mostoles"),109L,21),new TempData(new String("Puerto de Navacerrada"),109L,17),new TempData(new String("Madrid"),110L,11),new TempData(new String("Mostoles"),110L,28),new TempData(new String("Puerto de Navacerrada"),110L,13),new TempData(new String("Ponferrada"),110L,12),new TempData(new String("Madrid"),111L,10),new TempData(new String("Mostoles"),111L,14),new TempData(new String("Salamanca"),111L,26),new TempData(new String("Ponferrada"),111L,14),new TempData(new String("Mulhacen"),112L,29),new TempData(new String("Madrid"),112L,22),new TempData(new String("Mostoles"),112L,18),new TempData(new String("Salamanca"),112L,23),new TempData(new String("Ponferrada"),112L,27),new TempData(new String("La Linea"),113L,21),new TempData(new String("Madrid"),113L,25),new TempData(new String("Puerto de Navacerrada"),113L,15),new TempData(new String("Soria"),113L,15),new TempData(new String("Ponferrada"),113L,19),new TempData(new String("Mulhacen"),114L,22),new TempData(new String("Sevilla"),114L,15),new TempData(new String("Mostoles"),114L,16),new TempData(new String("Puerto de Navacerrada"),114L,22),new TempData(new String("Sevilla"),115L,12),new TempData(new String("La Linea"),115L,20),new TempData(new String("Mostoles"),115L,28),new TempData(new String("Ponferrada"),115L,30),new TempData(new String("Mulhacen"),116L,16),new TempData(new String("Soria"),116L,12),new TempData(new String("Ponferrada"),116L,11) }).doCall().checkResult(new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("Salamanca"),new Integer(26)),new es.upm.aedlib.Pair<String,Integer>(new String("Puerto de Navacerrada"),new Integer(22)),new es.upm.aedlib.Pair<String,Integer>(new String("Mostoles"),new Integer(28)),new es.upm.aedlib.Pair<String,Integer>(new String("Madrid"),new Integer(29)),new es.upm.aedlib.Pair<String,Integer>(new String("Mulhacen"),new Integer(29)),new es.upm.aedlib.Pair<String,Integer>(new String("Ponferrada"),new Integer(30)),new es.upm.aedlib.Pair<String,Integer>(new String("Soria"),new Integer(22)),new es.upm.aedlib.Pair<String,Integer>(new String("La Linea"),new Integer(21)),new es.upm.aedlib.Pair<String,Integer>(new String("Sevilla"),new Integer(18))))) ;
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
    ResultsHandler.add_result(new String("maxTemperatures"),resultIs) ;
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
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_23") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_23")) ;
if (ok_sofar)
  ok_sofar = new MaxTemperatures(110L,119L,new TempData[] { new TempData(new String("Mulhacen"),114L,23),new TempData(new String("Sevilla"),114L,16),new TempData(new String("Puerto de Navacerrada"),114L,14),new TempData(new String("Salamanca"),114L,29),new TempData(new String("La Linea"),115L,21),new TempData(new String("Madrid"),115L,25),new TempData(new String("Mostoles"),115L,17),new TempData(new String("Puerto de Navacerrada"),115L,13),new TempData(new String("Ponferrada"),115L,10),new TempData(new String("Madrid"),116L,30),new TempData(new String("Puerto de Navacerrada"),116L,19),new TempData(new String("Salamanca"),116L,14),new TempData(new String("Sevilla"),117L,18),new TempData(new String("La Linea"),117L,29),new TempData(new String("Puerto de Navacerrada"),117L,25),new TempData(new String("Salamanca"),117L,22),new TempData(new String("Ponferrada"),117L,27),new TempData(new String("Mulhacen"),118L,27),new TempData(new String("Madrid"),118L,27),new TempData(new String("Mostoles"),118L,14),new TempData(new String("Salamanca"),118L,20),new TempData(new String("Soria"),118L,20),new TempData(new String("Mulhacen"),119L,10),new TempData(new String("Sevilla"),119L,16),new TempData(new String("La Linea"),119L,11),new TempData(new String("Puerto de Navacerrada"),119L,17),new TempData(new String("Salamanca"),119L,21),new TempData(new String("Ponferrada"),119L,23),new TempData(new String("Sevilla"),120L,29),new TempData(new String("Madrid"),120L,24),new TempData(new String("Salamanca"),120L,26),new TempData(new String("Ponferrada"),120L,20),new TempData(new String("Mulhacen"),121L,11),new TempData(new String("Sevilla"),121L,25),new TempData(new String("Mostoles"),121L,20),new TempData(new String("Puerto de Navacerrada"),121L,26),new TempData(new String("Mulhacen"),122L,30),new TempData(new String("Madrid"),122L,28),new TempData(new String("Mostoles"),122L,25),new TempData(new String("Puerto de Navacerrada"),122L,10),new TempData(new String("Salamanca"),122L,15),new TempData(new String("La Linea"),123L,23),new TempData(new String("Madrid"),123L,27),new TempData(new String("Mostoles"),123L,13),new TempData(new String("Puerto de Navacerrada"),123L,10),new TempData(new String("Salamanca"),123L,16) }).doCall().checkResult(new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("Soria"),new Integer(20)),new es.upm.aedlib.Pair<String,Integer>(new String("Ponferrada"),new Integer(27)),new es.upm.aedlib.Pair<String,Integer>(new String("Mostoles"),new Integer(17)),new es.upm.aedlib.Pair<String,Integer>(new String("Madrid"),new Integer(30)),new es.upm.aedlib.Pair<String,Integer>(new String("La Linea"),new Integer(29)),new es.upm.aedlib.Pair<String,Integer>(new String("Salamanca"),new Integer(29)),new es.upm.aedlib.Pair<String,Integer>(new String("Puerto de Navacerrada"),new Integer(25)),new es.upm.aedlib.Pair<String,Integer>(new String("Sevilla"),new Integer(18)),new es.upm.aedlib.Pair<String,Integer>(new String("Mulhacen"),new Integer(27))))) ;
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
    ResultsHandler.add_result(new String("maxTemperatures"),resultIs) ;
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
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_24") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_24")) ;
if (ok_sofar)
  ok_sofar = new MaxTemperatures(111L,117L,new TempData[] { new TempData(new String("Sevilla"),111L,15),new TempData(new String("La Linea"),111L,24),new TempData(new String("Puerto de Navacerrada"),111L,14),new TempData(new String("Ponferrada"),111L,18),new TempData(new String("Mulhacen"),112L,20),new TempData(new String("La Linea"),112L,27),new TempData(new String("Madrid"),112L,19),new TempData(new String("Mostoles"),112L,29),new TempData(new String("Puerto de Navacerrada"),112L,24),new TempData(new String("Soria"),112L,16),new TempData(new String("Ponferrada"),112L,26),new TempData(new String("Mulhacen"),114L,15),new TempData(new String("La Linea"),114L,21),new TempData(new String("Madrid"),114L,15),new TempData(new String("Mostoles"),114L,21),new TempData(new String("Salamanca"),114L,13),new TempData(new String("Soria"),114L,10),new TempData(new String("Madrid"),115L,21),new TempData(new String("Mostoles"),115L,11),new TempData(new String("Soria"),115L,27),new TempData(new String("Ponferrada"),115L,28),new TempData(new String("Mulhacen"),116L,19),new TempData(new String("Sevilla"),116L,26),new TempData(new String("La Linea"),116L,27),new TempData(new String("Mostoles"),116L,17),new TempData(new String("Puerto de Navacerrada"),116L,16),new TempData(new String("Ponferrada"),116L,29),new TempData(new String("Mulhacen"),117L,28),new TempData(new String("Sevilla"),117L,19),new TempData(new String("Puerto de Navacerrada"),117L,14),new TempData(new String("Mulhacen"),118L,11),new TempData(new String("La Linea"),118L,15),new TempData(new String("Soria"),118L,19),new TempData(new String("Mulhacen"),119L,17),new TempData(new String("La Linea"),119L,19),new TempData(new String("Madrid"),119L,22),new TempData(new String("Puerto de Navacerrada"),119L,24),new TempData(new String("Salamanca"),119L,27),new TempData(new String("Ponferrada"),119L,10),new TempData(new String("Mulhacen"),120L,23),new TempData(new String("La Linea"),120L,17),new TempData(new String("Puerto de Navacerrada"),120L,19),new TempData(new String("Salamanca"),120L,26),new TempData(new String("Soria"),120L,27),new TempData(new String("Puerto de Navacerrada"),121L,16),new TempData(new String("Ponferrada"),121L,18),new TempData(new String("Mulhacen"),122L,13),new TempData(new String("Madrid"),122L,29),new TempData(new String("Mostoles"),122L,17),new TempData(new String("Soria"),122L,22),new TempData(new String("Ponferrada"),122L,22) }).doCall().checkResult(new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("Salamanca"),new Integer(13)),new es.upm.aedlib.Pair<String,Integer>(new String("Soria"),new Integer(27)),new es.upm.aedlib.Pair<String,Integer>(new String("Mostoles"),new Integer(29)),new es.upm.aedlib.Pair<String,Integer>(new String("Madrid"),new Integer(21)),new es.upm.aedlib.Pair<String,Integer>(new String("Mulhacen"),new Integer(28)),new es.upm.aedlib.Pair<String,Integer>(new String("Ponferrada"),new Integer(29)),new es.upm.aedlib.Pair<String,Integer>(new String("Puerto de Navacerrada"),new Integer(24)),new es.upm.aedlib.Pair<String,Integer>(new String("La Linea"),new Integer(27)),new es.upm.aedlib.Pair<String,Integer>(new String("Sevilla"),new Integer(26))))) ;
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
    ResultsHandler.add_result(new String("maxTemperatures"),resultIs) ;
    System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_25 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_25") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_25")) ;
if (ok_sofar)
  ok_sofar = new MaxTemperatures(108L,116L,new TempData[] { new TempData(new String("Mulhacen"),104L,17),new TempData(new String("Sevilla"),104L,20),new TempData(new String("Madrid"),104L,23),new TempData(new String("Mostoles"),104L,22),new TempData(new String("Puerto de Navacerrada"),104L,15),new TempData(new String("Mulhacen"),105L,10),new TempData(new String("Madrid"),105L,19),new TempData(new String("Salamanca"),105L,17),new TempData(new String("Mulhacen"),106L,10),new TempData(new String("Madrid"),106L,25),new TempData(new String("Mostoles"),106L,22),new TempData(new String("Soria"),106L,14),new TempData(new String("Ponferrada"),106L,19),new TempData(new String("Mulhacen"),107L,21),new TempData(new String("Sevilla"),107L,20),new TempData(new String("La Linea"),107L,21),new TempData(new String("Madrid"),107L,24),new TempData(new String("Mostoles"),107L,26),new TempData(new String("Puerto de Navacerrada"),107L,29),new TempData(new String("Soria"),107L,16),new TempData(new String("Ponferrada"),107L,20),new TempData(new String("Mulhacen"),108L,23),new TempData(new String("Madrid"),108L,15),new TempData(new String("Puerto de Navacerrada"),108L,23),new TempData(new String("Salamanca"),108L,15),new TempData(new String("La Linea"),109L,12),new TempData(new String("Madrid"),109L,14),new TempData(new String("Mostoles"),109L,24),new TempData(new String("Puerto de Navacerrada"),109L,25),new TempData(new String("Salamanca"),109L,13),new TempData(new String("Soria"),109L,30),new TempData(new String("Ponferrada"),109L,20),new TempData(new String("Mulhacen"),110L,25),new TempData(new String("La Linea"),110L,25),new TempData(new String("Salamanca"),110L,14),new TempData(new String("Ponferrada"),110L,21),new TempData(new String("Sevilla"),111L,13),new TempData(new String("Madrid"),111L,24),new TempData(new String("Mostoles"),111L,26),new TempData(new String("Puerto de Navacerrada"),111L,22),new TempData(new String("Madrid"),112L,13),new TempData(new String("Mostoles"),112L,27),new TempData(new String("Puerto de Navacerrada"),112L,28),new TempData(new String("Salamanca"),112L,22),new TempData(new String("Soria"),112L,10),new TempData(new String("Mostoles"),113L,13),new TempData(new String("Soria"),113L,11),new TempData(new String("Ponferrada"),113L,13),new TempData(new String("Mulhacen"),114L,27),new TempData(new String("Soria"),114L,16),new TempData(new String("Mulhacen"),115L,14),new TempData(new String("Sevilla"),115L,24),new TempData(new String("La Linea"),115L,13),new TempData(new String("Soria"),115L,19) }).doCall().checkResult(new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("Sevilla"),new Integer(24)),new es.upm.aedlib.Pair<String,Integer>(new String("Ponferrada"),new Integer(21)),new es.upm.aedlib.Pair<String,Integer>(new String("Soria"),new Integer(30)),new es.upm.aedlib.Pair<String,Integer>(new String("Mostoles"),new Integer(27)),new es.upm.aedlib.Pair<String,Integer>(new String("La Linea"),new Integer(25)),new es.upm.aedlib.Pair<String,Integer>(new String("Salamanca"),new Integer(22)),new es.upm.aedlib.Pair<String,Integer>(new String("Puerto de Navacerrada"),new Integer(28)),new es.upm.aedlib.Pair<String,Integer>(new String("Madrid"),new Integer(24)),new es.upm.aedlib.Pair<String,Integer>(new String("Mulhacen"),new Integer(27))))) ;
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
    ResultsHandler.stopTest(new String("test_25")) ;
    ResultsHandler.add_result(new String("maxTemperatures"),resultIs) ;
    System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_26 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_26") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_26")) ;
if (ok_sofar)
  ok_sofar = new MaxTemperatures(108L,117L,new TempData[] { new TempData(new String("Madrid"),106L,27),new TempData(new String("Mulhacen"),107L,15),new TempData(new String("Sevilla"),107L,21),new TempData(new String("Mostoles"),107L,14),new TempData(new String("Salamanca"),107L,16),new TempData(new String("Sevilla"),108L,28),new TempData(new String("La Linea"),108L,23),new TempData(new String("Madrid"),108L,30),new TempData(new String("Puerto de Navacerrada"),108L,14),new TempData(new String("Soria"),108L,30),new TempData(new String("Ponferrada"),108L,12),new TempData(new String("Mulhacen"),109L,27),new TempData(new String("La Linea"),109L,23),new TempData(new String("Madrid"),109L,25),new TempData(new String("Mostoles"),109L,20),new TempData(new String("Salamanca"),109L,17),new TempData(new String("Soria"),109L,21),new TempData(new String("Ponferrada"),109L,13),new TempData(new String("Mulhacen"),110L,15),new TempData(new String("La Linea"),110L,20),new TempData(new String("Mostoles"),110L,13),new TempData(new String("Soria"),110L,22),new TempData(new String("Madrid"),111L,29),new TempData(new String("Mostoles"),111L,30),new TempData(new String("Puerto de Navacerrada"),111L,15),new TempData(new String("Soria"),111L,15),new TempData(new String("Sevilla"),112L,24),new TempData(new String("Madrid"),112L,25),new TempData(new String("Mostoles"),112L,15),new TempData(new String("Puerto de Navacerrada"),112L,10),new TempData(new String("Salamanca"),112L,18),new TempData(new String("Mulhacen"),113L,28),new TempData(new String("La Linea"),113L,18),new TempData(new String("Puerto de Navacerrada"),113L,10),new TempData(new String("La Linea"),114L,23),new TempData(new String("Puerto de Navacerrada"),114L,18),new TempData(new String("Salamanca"),114L,13),new TempData(new String("Soria"),114L,25),new TempData(new String("Ponferrada"),114L,27),new TempData(new String("Mulhacen"),115L,14),new TempData(new String("Madrid"),115L,24),new TempData(new String("Ponferrada"),115L,28),new TempData(new String("Sevilla"),116L,20),new TempData(new String("Puerto de Navacerrada"),116L,27),new TempData(new String("Ponferrada"),116L,25),new TempData(new String("La Linea"),117L,17),new TempData(new String("Mostoles"),117L,26),new TempData(new String("Salamanca"),117L,14),new TempData(new String("Soria"),117L,29),new TempData(new String("Sevilla"),118L,20),new TempData(new String("Salamanca"),118L,21),new TempData(new String("Sevilla"),119L,16),new TempData(new String("La Linea"),119L,18),new TempData(new String("Mostoles"),119L,20),new TempData(new String("Soria"),119L,11) }).doCall().checkResult(new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("Salamanca"),new Integer(18)),new es.upm.aedlib.Pair<String,Integer>(new String("Mostoles"),new Integer(30)),new es.upm.aedlib.Pair<String,Integer>(new String("Mulhacen"),new Integer(28)),new es.upm.aedlib.Pair<String,Integer>(new String("Ponferrada"),new Integer(28)),new es.upm.aedlib.Pair<String,Integer>(new String("Soria"),new Integer(30)),new es.upm.aedlib.Pair<String,Integer>(new String("Puerto de Navacerrada"),new Integer(27)),new es.upm.aedlib.Pair<String,Integer>(new String("Madrid"),new Integer(30)),new es.upm.aedlib.Pair<String,Integer>(new String("La Linea"),new Integer(23)),new es.upm.aedlib.Pair<String,Integer>(new String("Sevilla"),new Integer(28))))) ;
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
    ResultsHandler.stopTest(new String("test_26")) ;
    ResultsHandler.add_result(new String("maxTemperatures"),resultIs) ;
    System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_27 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_27") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_27")) ;
if (ok_sofar)
  ok_sofar = new MaxTemperatures(109L,112L,new TempData[] { new TempData(new String("La Linea"),105L,19),new TempData(new String("Madrid"),105L,11),new TempData(new String("Mostoles"),105L,27),new TempData(new String("Puerto de Navacerrada"),105L,13),new TempData(new String("Ponferrada"),105L,30),new TempData(new String("Mulhacen"),106L,19),new TempData(new String("Madrid"),106L,20),new TempData(new String("Puerto de Navacerrada"),106L,14),new TempData(new String("La Linea"),107L,19),new TempData(new String("Madrid"),107L,22),new TempData(new String("Puerto de Navacerrada"),107L,28),new TempData(new String("Soria"),107L,17),new TempData(new String("Mulhacen"),108L,22),new TempData(new String("La Linea"),108L,29),new TempData(new String("Mostoles"),108L,12),new TempData(new String("Puerto de Navacerrada"),108L,17),new TempData(new String("Mulhacen"),109L,20),new TempData(new String("Sevilla"),109L,12),new TempData(new String("Madrid"),109L,28),new TempData(new String("Mostoles"),109L,27),new TempData(new String("Puerto de Navacerrada"),109L,26),new TempData(new String("Salamanca"),109L,16),new TempData(new String("Soria"),109L,25),new TempData(new String("La Linea"),110L,26),new TempData(new String("Madrid"),110L,16),new TempData(new String("Soria"),110L,26),new TempData(new String("Mulhacen"),111L,12),new TempData(new String("Sevilla"),111L,18),new TempData(new String("La Linea"),111L,22),new TempData(new String("Salamanca"),111L,27),new TempData(new String("Ponferrada"),111L,30),new TempData(new String("La Linea"),112L,10),new TempData(new String("Mostoles"),112L,23),new TempData(new String("Salamanca"),112L,24),new TempData(new String("Ponferrada"),112L,22),new TempData(new String("La Linea"),113L,28),new TempData(new String("Madrid"),113L,18),new TempData(new String("Ponferrada"),113L,13),new TempData(new String("Sevilla"),114L,28),new TempData(new String("La Linea"),114L,26),new TempData(new String("Mostoles"),114L,23),new TempData(new String("Puerto de Navacerrada"),114L,19),new TempData(new String("Salamanca"),114L,11),new TempData(new String("Soria"),114L,23),new TempData(new String("Ponferrada"),114L,29),new TempData(new String("Mulhacen"),115L,19),new TempData(new String("Sevilla"),115L,27),new TempData(new String("Madrid"),115L,24),new TempData(new String("Salamanca"),115L,10),new TempData(new String("Ponferrada"),115L,23),new TempData(new String("Mulhacen"),116L,23),new TempData(new String("Sevilla"),116L,23),new TempData(new String("Madrid"),116L,27),new TempData(new String("Mostoles"),116L,20),new TempData(new String("Puerto de Navacerrada"),116L,29) }).doCall().checkResult(new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("Ponferrada"),new Integer(30)),new es.upm.aedlib.Pair<String,Integer>(new String("La Linea"),new Integer(26)),new es.upm.aedlib.Pair<String,Integer>(new String("Soria"),new Integer(26)),new es.upm.aedlib.Pair<String,Integer>(new String("Salamanca"),new Integer(27)),new es.upm.aedlib.Pair<String,Integer>(new String("Puerto de Navacerrada"),new Integer(26)),new es.upm.aedlib.Pair<String,Integer>(new String("Mostoles"),new Integer(27)),new es.upm.aedlib.Pair<String,Integer>(new String("Madrid"),new Integer(28)),new es.upm.aedlib.Pair<String,Integer>(new String("Sevilla"),new Integer(18)),new es.upm.aedlib.Pair<String,Integer>(new String("Mulhacen"),new Integer(20))))) ;
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
    ResultsHandler.stopTest(new String("test_27")) ;
    ResultsHandler.add_result(new String("maxTemperatures"),resultIs) ;
    System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_28 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_28") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_28")) ;
if (ok_sofar)
  ok_sofar = new MaxTemperatures(111L,119L,new TempData[] { new TempData(new String("Sevilla"),108L,13),new TempData(new String("La Linea"),108L,13),new TempData(new String("Soria"),108L,17),new TempData(new String("Madrid"),109L,30),new TempData(new String("Salamanca"),109L,13),new TempData(new String("Ponferrada"),109L,12),new TempData(new String("La Linea"),110L,28),new TempData(new String("Mostoles"),110L,29),new TempData(new String("Ponferrada"),110L,25),new TempData(new String("Mostoles"),111L,26),new TempData(new String("Puerto de Navacerrada"),111L,25),new TempData(new String("Ponferrada"),111L,27),new TempData(new String("Mulhacen"),112L,17),new TempData(new String("Sevilla"),112L,27),new TempData(new String("La Linea"),112L,20),new TempData(new String("Madrid"),112L,16),new TempData(new String("Puerto de Navacerrada"),112L,12),new TempData(new String("Salamanca"),112L,28),new TempData(new String("Soria"),112L,30),new TempData(new String("Mulhacen"),113L,14),new TempData(new String("Sevilla"),113L,21),new TempData(new String("La Linea"),113L,10),new TempData(new String("Madrid"),113L,27),new TempData(new String("Mostoles"),113L,29),new TempData(new String("Soria"),113L,25),new TempData(new String("Ponferrada"),113L,25),new TempData(new String("La Linea"),114L,14),new TempData(new String("Mostoles"),114L,28),new TempData(new String("Salamanca"),114L,27),new TempData(new String("Soria"),114L,26),new TempData(new String("Ponferrada"),114L,23),new TempData(new String("Mulhacen"),115L,28),new TempData(new String("La Linea"),115L,12),new TempData(new String("Mostoles"),115L,21),new TempData(new String("Ponferrada"),115L,21),new TempData(new String("Mulhacen"),116L,26),new TempData(new String("Sevilla"),116L,24),new TempData(new String("Madrid"),116L,16),new TempData(new String("Mostoles"),116L,18),new TempData(new String("Puerto de Navacerrada"),116L,12),new TempData(new String("Mulhacen"),117L,15),new TempData(new String("Sevilla"),117L,13),new TempData(new String("Mostoles"),117L,13),new TempData(new String("Mulhacen"),118L,17),new TempData(new String("La Linea"),118L,17),new TempData(new String("Salamanca"),118L,15),new TempData(new String("Ponferrada"),118L,25),new TempData(new String("Mulhacen"),119L,17),new TempData(new String("La Linea"),119L,19),new TempData(new String("Madrid"),119L,21),new TempData(new String("Puerto de Navacerrada"),119L,23),new TempData(new String("Salamanca"),119L,26),new TempData(new String("Soria"),119L,14),new TempData(new String("Sevilla"),120L,20),new TempData(new String("Mostoles"),120L,12),new TempData(new String("Puerto de Navacerrada"),120L,30),new TempData(new String("Soria"),120L,28) }).doCall().checkResult(new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("Soria"),new Integer(30)),new es.upm.aedlib.Pair<String,Integer>(new String("Salamanca"),new Integer(28)),new es.upm.aedlib.Pair<String,Integer>(new String("Madrid"),new Integer(27)),new es.upm.aedlib.Pair<String,Integer>(new String("La Linea"),new Integer(20)),new es.upm.aedlib.Pair<String,Integer>(new String("Sevilla"),new Integer(27)),new es.upm.aedlib.Pair<String,Integer>(new String("Mulhacen"),new Integer(28)),new es.upm.aedlib.Pair<String,Integer>(new String("Ponferrada"),new Integer(27)),new es.upm.aedlib.Pair<String,Integer>(new String("Puerto de Navacerrada"),new Integer(25)),new es.upm.aedlib.Pair<String,Integer>(new String("Mostoles"),new Integer(29))))) ;
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
    ResultsHandler.stopTest(new String("test_28")) ;
    ResultsHandler.add_result(new String("maxTemperatures"),resultIs) ;
    System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_29 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_29") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_29")) ;
if (ok_sofar)
  ok_sofar = new MaxTemperatures(108L,117L,new TempData[] { new TempData(new String("Mostoles"),108L,14),new TempData(new String("Soria"),108L,20),new TempData(new String("Ponferrada"),108L,26),new TempData(new String("Mulhacen"),109L,22),new TempData(new String("La Linea"),109L,17),new TempData(new String("Mostoles"),109L,20),new TempData(new String("Puerto de Navacerrada"),109L,24),new TempData(new String("Salamanca"),109L,15),new TempData(new String("Ponferrada"),109L,12),new TempData(new String("La Linea"),110L,27),new TempData(new String("Mostoles"),110L,17),new TempData(new String("Puerto de Navacerrada"),110L,17),new TempData(new String("Soria"),110L,11),new TempData(new String("Ponferrada"),110L,16),new TempData(new String("Madrid"),111L,22),new TempData(new String("Mostoles"),111L,18),new TempData(new String("Puerto de Navacerrada"),111L,30),new TempData(new String("Ponferrada"),111L,29),new TempData(new String("Sevilla"),112L,26),new TempData(new String("Madrid"),112L,17),new TempData(new String("Mostoles"),112L,18),new TempData(new String("Soria"),112L,21),new TempData(new String("Ponferrada"),112L,20),new TempData(new String("Mostoles"),113L,16),new TempData(new String("Salamanca"),113L,23),new TempData(new String("Mulhacen"),114L,18),new TempData(new String("La Linea"),114L,10),new TempData(new String("Mostoles"),114L,11),new TempData(new String("Ponferrada"),114L,20),new TempData(new String("Mulhacen"),115L,12),new TempData(new String("Sevilla"),115L,19),new TempData(new String("La Linea"),115L,23),new TempData(new String("Madrid"),115L,11),new TempData(new String("Puerto de Navacerrada"),115L,15),new TempData(new String("Soria"),115L,21),new TempData(new String("Mulhacen"),116L,12),new TempData(new String("Sevilla"),116L,16),new TempData(new String("La Linea"),116L,18),new TempData(new String("Madrid"),116L,23),new TempData(new String("Puerto de Navacerrada"),116L,14),new TempData(new String("Salamanca"),116L,19),new TempData(new String("Mulhacen"),117L,28),new TempData(new String("Sevilla"),117L,25),new TempData(new String("La Linea"),117L,30),new TempData(new String("Salamanca"),117L,19),new TempData(new String("Mulhacen"),118L,19),new TempData(new String("Sevilla"),118L,18),new TempData(new String("Mostoles"),118L,14),new TempData(new String("Soria"),118L,10),new TempData(new String("Sevilla"),119L,11),new TempData(new String("Puerto de Navacerrada"),119L,25),new TempData(new String("Salamanca"),119L,22),new TempData(new String("Madrid"),120L,18),new TempData(new String("Mostoles"),120L,20),new TempData(new String("Puerto de Navacerrada"),120L,18),new TempData(new String("Salamanca"),120L,12),new TempData(new String("Ponferrada"),120L,28),new TempData(new String("Sevilla"),121L,18),new TempData(new String("Madrid"),121L,21),new TempData(new String("Mostoles"),121L,21),new TempData(new String("Salamanca"),121L,25),new TempData(new String("La Linea"),122L,15),new TempData(new String("Puerto de Navacerrada"),122L,10),new TempData(new String("Salamanca"),122L,23) }).doCall().checkResult(new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("Sevilla"),new Integer(26)),new es.upm.aedlib.Pair<String,Integer>(new String("Madrid"),new Integer(23)),new es.upm.aedlib.Pair<String,Integer>(new String("Salamanca"),new Integer(23)),new es.upm.aedlib.Pair<String,Integer>(new String("Puerto de Navacerrada"),new Integer(30)),new es.upm.aedlib.Pair<String,Integer>(new String("La Linea"),new Integer(30)),new es.upm.aedlib.Pair<String,Integer>(new String("Mulhacen"),new Integer(28)),new es.upm.aedlib.Pair<String,Integer>(new String("Ponferrada"),new Integer(29)),new es.upm.aedlib.Pair<String,Integer>(new String("Soria"),new Integer(21)),new es.upm.aedlib.Pair<String,Integer>(new String("Mostoles"),new Integer(20))))) ;
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
    ResultsHandler.stopTest(new String("test_29")) ;
    ResultsHandler.add_result(new String("maxTemperatures"),resultIs) ;
    System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_30 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_30") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_30")) ;
if (ok_sofar)
  ok_sofar = new MaxTemperatures(111L,119L,new TempData[] { new TempData(new String("La Linea"),106L,30),new TempData(new String("Madrid"),106L,20),new TempData(new String("Mostoles"),106L,14),new TempData(new String("Sevilla"),107L,14),new TempData(new String("La Linea"),107L,19),new TempData(new String("Mostoles"),107L,10),new TempData(new String("Puerto de Navacerrada"),107L,11),new TempData(new String("La Linea"),108L,25),new TempData(new String("Mostoles"),108L,12),new TempData(new String("Sevilla"),109L,23),new TempData(new String("Madrid"),109L,12),new TempData(new String("Mostoles"),109L,11),new TempData(new String("Salamanca"),109L,14),new TempData(new String("Soria"),109L,20),new TempData(new String("Ponferrada"),109L,13),new TempData(new String("Madrid"),110L,29),new TempData(new String("Puerto de Navacerrada"),110L,22),new TempData(new String("Salamanca"),110L,24),new TempData(new String("Soria"),110L,11),new TempData(new String("Ponferrada"),110L,14),new TempData(new String("La Linea"),111L,27),new TempData(new String("Puerto de Navacerrada"),111L,15),new TempData(new String("Mulhacen"),112L,27),new TempData(new String("Sevilla"),112L,23),new TempData(new String("La Linea"),112L,13),new TempData(new String("Madrid"),112L,30),new TempData(new String("Puerto de Navacerrada"),112L,28),new TempData(new String("Soria"),112L,29),new TempData(new String("Mostoles"),113L,18),new TempData(new String("Puerto de Navacerrada"),113L,25),new TempData(new String("Soria"),113L,17),new TempData(new String("Mulhacen"),114L,10),new TempData(new String("La Linea"),114L,14),new TempData(new String("Mostoles"),114L,21),new TempData(new String("Soria"),114L,27),new TempData(new String("Mulhacen"),115L,16),new TempData(new String("Madrid"),115L,12),new TempData(new String("Mostoles"),115L,17),new TempData(new String("Puerto de Navacerrada"),115L,17),new TempData(new String("Ponferrada"),115L,19),new TempData(new String("Mulhacen"),116L,24),new TempData(new String("La Linea"),116L,23),new TempData(new String("Madrid"),116L,26),new TempData(new String("Salamanca"),116L,26),new TempData(new String("Soria"),116L,25),new TempData(new String("Ponferrada"),116L,28),new TempData(new String("Sevilla"),117L,24),new TempData(new String("La Linea"),117L,18),new TempData(new String("Madrid"),117L,16),new TempData(new String("Salamanca"),117L,27),new TempData(new String("Soria"),117L,19),new TempData(new String("Ponferrada"),117L,28),new TempData(new String("Madrid"),118L,14),new TempData(new String("Puerto de Navacerrada"),118L,18),new TempData(new String("Salamanca"),118L,13),new TempData(new String("Soria"),118L,28),new TempData(new String("Ponferrada"),118L,16),new TempData(new String("Sevilla"),119L,10),new TempData(new String("Madrid"),119L,15),new TempData(new String("Mostoles"),119L,17),new TempData(new String("Puerto de Navacerrada"),119L,30),new TempData(new String("Salamanca"),119L,29),new TempData(new String("Soria"),119L,29),new TempData(new String("Sevilla"),120L,24),new TempData(new String("La Linea"),120L,23),new TempData(new String("Madrid"),120L,17),new TempData(new String("Mostoles"),120L,11),new TempData(new String("Salamanca"),120L,27),new TempData(new String("Ponferrada"),120L,19),new TempData(new String("La Linea"),121L,10),new TempData(new String("Madrid"),121L,26),new TempData(new String("Mostoles"),121L,30),new TempData(new String("Salamanca"),121L,19),new TempData(new String("Soria"),121L,26),new TempData(new String("Sevilla"),122L,23),new TempData(new String("La Linea"),122L,14),new TempData(new String("Mostoles"),122L,15),new TempData(new String("Salamanca"),122L,14),new TempData(new String("Soria"),122L,16),new TempData(new String("Sevilla"),123L,28),new TempData(new String("La Linea"),123L,13),new TempData(new String("Salamanca"),123L,13),new TempData(new String("Madrid"),124L,23),new TempData(new String("Puerto de Navacerrada"),124L,18),new TempData(new String("Salamanca"),124L,18),new TempData(new String("Soria"),124L,28),new TempData(new String("Ponferrada"),124L,29) }).doCall().checkResult(new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("Salamanca"),new Integer(29)),new es.upm.aedlib.Pair<String,Integer>(new String("Ponferrada"),new Integer(28)),new es.upm.aedlib.Pair<String,Integer>(new String("Mostoles"),new Integer(21)),new es.upm.aedlib.Pair<String,Integer>(new String("Soria"),new Integer(29)),new es.upm.aedlib.Pair<String,Integer>(new String("Madrid"),new Integer(30)),new es.upm.aedlib.Pair<String,Integer>(new String("Sevilla"),new Integer(24)),new es.upm.aedlib.Pair<String,Integer>(new String("Mulhacen"),new Integer(27)),new es.upm.aedlib.Pair<String,Integer>(new String("Puerto de Navacerrada"),new Integer(30)),new es.upm.aedlib.Pair<String,Integer>(new String("La Linea"),new Integer(27))))) ;
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
    ResultsHandler.stopTest(new String("test_30")) ;
    ResultsHandler.add_result(new String("maxTemperatures"),resultIs) ;
    System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_31 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_31") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_31")) ;
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
    ResultsHandler.stopTest(new String("test_31")) ;
    ResultsHandler.add_result(new String("maxTemperatureInRegion"),resultIs) ;
    System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_32 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_32") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_32")) ;
if (ok_sofar)
{
  es.upm.aedlib.map.HashTableMap<String,String> m = new es.upm.aedlib.map.HashTableMap<String,String>() ;
  m.put(new String("Mulhacen"),new String("Andalucia")) ;
  m.put(new String("Sevilla"),new String("Andalucia")) ;
  m.put(new String("La Linea"),new String("Andalucia")) ;
  m.put(new String("Madrid"),new String("Madrid")) ;
  m.put(new String("Mostoles"),new String("Madrid")) ;
  m.put(new String("Puerto de Navacerrada"),new String("Madrid")) ;
  m.put(new String("Salamanca"),new String("Castilla y Leon")) ;
  m.put(new String("Soria"),new String("Castilla y Leon")) ;
  m.put(new String("Ponferrada"),new String("Castilla y Leon")) ;
  ok_sofar = new MaxTemperatureInRegion(108L,110L,new String("Madrid"),new TempData[] {  },m).doCall().checkResult(null) ;
}
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
    ResultsHandler.stopTest(new String("test_32")) ;
    ResultsHandler.add_result(new String("maxTemperatureInRegion"),resultIs) ;
    System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_33 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_33") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_33")) ;
if (ok_sofar)
{
  es.upm.aedlib.map.HashTableMap<String,String> m = new es.upm.aedlib.map.HashTableMap<String,String>() ;
  m.put(new String("Mulhacen"),new String("Andalucia")) ;
  m.put(new String("Sevilla"),new String("Andalucia")) ;
  m.put(new String("La Linea"),new String("Andalucia")) ;
  m.put(new String("Madrid"),new String("Madrid")) ;
  m.put(new String("Mostoles"),new String("Madrid")) ;
  m.put(new String("Puerto de Navacerrada"),new String("Madrid")) ;
  m.put(new String("Salamanca"),new String("Castilla y Leon")) ;
  m.put(new String("Soria"),new String("Castilla y Leon")) ;
  m.put(new String("Ponferrada"),new String("Castilla y Leon")) ;
  ok_sofar = new MaxTemperatureInRegion(109L,111L,new String("Castilla y Leon"),new TempData[] {  },m).doCall().checkResult(null) ;
}
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
    ResultsHandler.stopTest(new String("test_33")) ;
    ResultsHandler.add_result(new String("maxTemperatureInRegion"),resultIs) ;
    System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_34 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_34") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_34")) ;
if (ok_sofar)
{
  es.upm.aedlib.map.HashTableMap<String,String> m = new es.upm.aedlib.map.HashTableMap<String,String>() ;
  m.put(new String("Mulhacen"),new String("Andalucia")) ;
  m.put(new String("Sevilla"),new String("Andalucia")) ;
  m.put(new String("La Linea"),new String("Andalucia")) ;
  m.put(new String("Madrid"),new String("Madrid")) ;
  m.put(new String("Mostoles"),new String("Madrid")) ;
  m.put(new String("Puerto de Navacerrada"),new String("Madrid")) ;
  m.put(new String("Salamanca"),new String("Castilla y Leon")) ;
  m.put(new String("Soria"),new String("Castilla y Leon")) ;
  m.put(new String("Ponferrada"),new String("Castilla y Leon")) ;
  ok_sofar = new MaxTemperatureInRegion(109L,113L,new String("Castilla y Leon"),new TempData[] {  },m).doCall().checkResult(null) ;
}
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
    ResultsHandler.stopTest(new String("test_34")) ;
    ResultsHandler.add_result(new String("maxTemperatureInRegion"),resultIs) ;
    System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_35 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_35") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_35")) ;
if (ok_sofar)
{
  es.upm.aedlib.map.HashTableMap<String,String> m = new es.upm.aedlib.map.HashTableMap<String,String>() ;
  m.put(new String("Mulhacen"),new String("Andalucia")) ;
  m.put(new String("Sevilla"),new String("Andalucia")) ;
  m.put(new String("La Linea"),new String("Andalucia")) ;
  m.put(new String("Madrid"),new String("Madrid")) ;
  m.put(new String("Mostoles"),new String("Madrid")) ;
  m.put(new String("Puerto de Navacerrada"),new String("Madrid")) ;
  m.put(new String("Salamanca"),new String("Castilla y Leon")) ;
  m.put(new String("Soria"),new String("Castilla y Leon")) ;
  m.put(new String("Ponferrada"),new String("Castilla y Leon")) ;
  ok_sofar = new MaxTemperatureInRegion(109L,115L,new String("Andalucia"),new TempData[] {  },m).doCall().checkResult(null) ;
}
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
    ResultsHandler.stopTest(new String("test_35")) ;
    ResultsHandler.add_result(new String("maxTemperatureInRegion"),resultIs) ;
    System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_36 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_36") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_36")) ;
if (ok_sofar)
{
  es.upm.aedlib.map.HashTableMap<String,String> m = new es.upm.aedlib.map.HashTableMap<String,String>() ;
  m.put(new String("Mulhacen"),new String("Andalucia")) ;
  m.put(new String("Sevilla"),new String("Andalucia")) ;
  m.put(new String("La Linea"),new String("Andalucia")) ;
  m.put(new String("Madrid"),new String("Madrid")) ;
  m.put(new String("Mostoles"),new String("Madrid")) ;
  m.put(new String("Puerto de Navacerrada"),new String("Madrid")) ;
  m.put(new String("Salamanca"),new String("Castilla y Leon")) ;
  m.put(new String("Soria"),new String("Castilla y Leon")) ;
  m.put(new String("Ponferrada"),new String("Castilla y Leon")) ;
  ok_sofar = new MaxTemperatureInRegion(110L,116L,new String("Madrid"),new TempData[] {  },m).doCall().checkResult(null) ;
}
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
    ResultsHandler.stopTest(new String("test_36")) ;
    ResultsHandler.add_result(new String("maxTemperatureInRegion"),resultIs) ;
    System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_37 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_37") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_37")) ;
if (ok_sofar)
{
  es.upm.aedlib.map.HashTableMap<String,String> m = new es.upm.aedlib.map.HashTableMap<String,String>() ;
  m.put(new String("Mulhacen"),new String("Andalucia")) ;
  m.put(new String("Sevilla"),new String("Andalucia")) ;
  m.put(new String("La Linea"),new String("Andalucia")) ;
  m.put(new String("Madrid"),new String("Madrid")) ;
  m.put(new String("Mostoles"),new String("Madrid")) ;
  m.put(new String("Puerto de Navacerrada"),new String("Madrid")) ;
  m.put(new String("Salamanca"),new String("Castilla y Leon")) ;
  m.put(new String("Soria"),new String("Castilla y Leon")) ;
  m.put(new String("Ponferrada"),new String("Castilla y Leon")) ;
  ok_sofar = new MaxTemperatureInRegion(112L,113L,new String("Castilla y Leon"),new TempData[] {  },m).doCall().checkResult(null) ;
}
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
    ResultsHandler.stopTest(new String("test_37")) ;
    ResultsHandler.add_result(new String("maxTemperatureInRegion"),resultIs) ;
    System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_38 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_38") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_38")) ;
if (ok_sofar)
{
  es.upm.aedlib.map.HashTableMap<String,String> m = new es.upm.aedlib.map.HashTableMap<String,String>() ;
  m.put(new String("Mulhacen"),new String("Andalucia")) ;
  m.put(new String("Sevilla"),new String("Andalucia")) ;
  m.put(new String("La Linea"),new String("Andalucia")) ;
  m.put(new String("Madrid"),new String("Madrid")) ;
  m.put(new String("Mostoles"),new String("Madrid")) ;
  m.put(new String("Puerto de Navacerrada"),new String("Madrid")) ;
  m.put(new String("Salamanca"),new String("Castilla y Leon")) ;
  m.put(new String("Soria"),new String("Castilla y Leon")) ;
  m.put(new String("Ponferrada"),new String("Castilla y Leon")) ;
  ok_sofar = new MaxTemperatureInRegion(109L,110L,new String("Andalucia"),new TempData[] { new TempData(new String("Mulhacen"),110L,19),new TempData(new String("Mostoles"),110L,23),new TempData(new String("Salamanca"),110L,29),new TempData(new String("Soria"),110L,15),new TempData(new String("Ponferrada"),110L,17) },m).doCall().checkResult(new es.upm.aedlib.Pair<String,Integer>(new String("Mulhacen"),new Integer(19))) ;
}
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
    ResultsHandler.stopTest(new String("test_38")) ;
    ResultsHandler.add_result(new String("maxTemperatureInRegion"),resultIs) ;
    System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_39 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_39") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_39")) ;
if (ok_sofar)
{
  es.upm.aedlib.map.HashTableMap<String,String> m = new es.upm.aedlib.map.HashTableMap<String,String>() ;
  m.put(new String("Mulhacen"),new String("Andalucia")) ;
  m.put(new String("Sevilla"),new String("Andalucia")) ;
  m.put(new String("La Linea"),new String("Andalucia")) ;
  m.put(new String("Madrid"),new String("Madrid")) ;
  m.put(new String("Mostoles"),new String("Madrid")) ;
  m.put(new String("Puerto de Navacerrada"),new String("Madrid")) ;
  m.put(new String("Salamanca"),new String("Castilla y Leon")) ;
  m.put(new String("Soria"),new String("Castilla y Leon")) ;
  m.put(new String("Ponferrada"),new String("Castilla y Leon")) ;
  ok_sofar = new MaxTemperatureInRegion(108L,112L,new String("Andalucia"),new TempData[] { new TempData(new String("Mulhacen"),111L,17),new TempData(new String("Sevilla"),111L,21),new TempData(new String("Madrid"),111L,14),new TempData(new String("Puerto de Navacerrada"),111L,13),new TempData(new String("Salamanca"),111L,30),new TempData(new String("Ponferrada"),111L,10) },m).doCall().checkResult(new es.upm.aedlib.Pair<String,Integer>(new String("Sevilla"),new Integer(21))) ;
}
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
    ResultsHandler.stopTest(new String("test_39")) ;
    ResultsHandler.add_result(new String("maxTemperatureInRegion"),resultIs) ;
    System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_40 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_40") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_40")) ;
if (ok_sofar)
{
  es.upm.aedlib.map.HashTableMap<String,String> m = new es.upm.aedlib.map.HashTableMap<String,String>() ;
  m.put(new String("Mulhacen"),new String("Andalucia")) ;
  m.put(new String("Sevilla"),new String("Andalucia")) ;
  m.put(new String("La Linea"),new String("Andalucia")) ;
  m.put(new String("Madrid"),new String("Madrid")) ;
  m.put(new String("Mostoles"),new String("Madrid")) ;
  m.put(new String("Puerto de Navacerrada"),new String("Madrid")) ;
  m.put(new String("Salamanca"),new String("Castilla y Leon")) ;
  m.put(new String("Soria"),new String("Castilla y Leon")) ;
  m.put(new String("Ponferrada"),new String("Castilla y Leon")) ;
  ok_sofar = new MaxTemperatureInRegion(109L,111L,new String("Madrid"),new TempData[] { new TempData(new String("Madrid"),109L,18),new TempData(new String("Puerto de Navacerrada"),109L,19),new TempData(new String("Soria"),109L,26),new TempData(new String("Sevilla"),110L,20),new TempData(new String("Puerto de Navacerrada"),110L,17),new TempData(new String("Ponferrada"),110L,27) },m).doCall().checkResult(new es.upm.aedlib.Pair<String,Integer>(new String("Puerto de Navacerrada"),new Integer(19))) ;
}
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
    ResultsHandler.stopTest(new String("test_40")) ;
    ResultsHandler.add_result(new String("maxTemperatureInRegion"),resultIs) ;
    System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_41 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_41") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_41")) ;
if (ok_sofar)
{
  es.upm.aedlib.map.HashTableMap<String,String> m = new es.upm.aedlib.map.HashTableMap<String,String>() ;
  m.put(new String("Mulhacen"),new String("Andalucia")) ;
  m.put(new String("Sevilla"),new String("Andalucia")) ;
  m.put(new String("La Linea"),new String("Andalucia")) ;
  m.put(new String("Madrid"),new String("Madrid")) ;
  m.put(new String("Mostoles"),new String("Madrid")) ;
  m.put(new String("Puerto de Navacerrada"),new String("Madrid")) ;
  m.put(new String("Salamanca"),new String("Castilla y Leon")) ;
  m.put(new String("Soria"),new String("Castilla y Leon")) ;
  m.put(new String("Ponferrada"),new String("Castilla y Leon")) ;
  ok_sofar = new MaxTemperatureInRegion(111L,112L,new String("Madrid"),new TempData[] { new TempData(new String("Mulhacen"),112L,25),new TempData(new String("Sevilla"),112L,18),new TempData(new String("La Linea"),112L,24),new TempData(new String("Mostoles"),112L,21),new TempData(new String("Soria"),112L,21),new TempData(new String("Ponferrada"),112L,29),new TempData(new String("Soria"),113L,16),new TempData(new String("Ponferrada"),113L,27) },m).doCall().checkResult(new es.upm.aedlib.Pair<String,Integer>(new String("Mostoles"),new Integer(21))) ;
}
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
    ResultsHandler.stopTest(new String("test_41")) ;
    ResultsHandler.add_result(new String("maxTemperatureInRegion"),resultIs) ;
    System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_42 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_42") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_42")) ;
if (ok_sofar)
{
  es.upm.aedlib.map.HashTableMap<String,String> m = new es.upm.aedlib.map.HashTableMap<String,String>() ;
  m.put(new String("Mulhacen"),new String("Andalucia")) ;
  m.put(new String("Sevilla"),new String("Andalucia")) ;
  m.put(new String("La Linea"),new String("Andalucia")) ;
  m.put(new String("Madrid"),new String("Madrid")) ;
  m.put(new String("Mostoles"),new String("Madrid")) ;
  m.put(new String("Puerto de Navacerrada"),new String("Madrid")) ;
  m.put(new String("Salamanca"),new String("Castilla y Leon")) ;
  m.put(new String("Soria"),new String("Castilla y Leon")) ;
  m.put(new String("Ponferrada"),new String("Castilla y Leon")) ;
  ok_sofar = new MaxTemperatureInRegion(107L,108L,new String("Madrid"),new TempData[] { new TempData(new String("Mulhacen"),106L,23),new TempData(new String("Sevilla"),106L,16),new TempData(new String("La Linea"),106L,27),new TempData(new String("Madrid"),106L,22),new TempData(new String("Mostoles"),106L,10),new TempData(new String("Puerto de Navacerrada"),106L,19),new TempData(new String("Soria"),106L,29),new TempData(new String("Ponferrada"),106L,13),new TempData(new String("La Linea"),107L,26),new TempData(new String("Salamanca"),107L,30),new TempData(new String("Soria"),107L,26),new TempData(new String("Ponferrada"),107L,23),new TempData(new String("La Linea"),108L,30),new TempData(new String("Puerto de Navacerrada"),108L,27),new TempData(new String("Salamanca"),108L,17),new TempData(new String("Soria"),108L,29) },m).doCall().checkResult(new es.upm.aedlib.Pair<String,Integer>(new String("Puerto de Navacerrada"),new Integer(27))) ;
}
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
    ResultsHandler.stopTest(new String("test_42")) ;
    ResultsHandler.add_result(new String("maxTemperatureInRegion"),resultIs) ;
    System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_43 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_43") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_43")) ;
if (ok_sofar)
{
  es.upm.aedlib.map.HashTableMap<String,String> m = new es.upm.aedlib.map.HashTableMap<String,String>() ;
  m.put(new String("Mulhacen"),new String("Andalucia")) ;
  m.put(new String("Sevilla"),new String("Andalucia")) ;
  m.put(new String("La Linea"),new String("Andalucia")) ;
  m.put(new String("Madrid"),new String("Madrid")) ;
  m.put(new String("Mostoles"),new String("Madrid")) ;
  m.put(new String("Puerto de Navacerrada"),new String("Madrid")) ;
  m.put(new String("Salamanca"),new String("Castilla y Leon")) ;
  m.put(new String("Soria"),new String("Castilla y Leon")) ;
  m.put(new String("Ponferrada"),new String("Castilla y Leon")) ;
  ok_sofar = new MaxTemperatureInRegion(109L,118L,new String("Castilla y Leon"),new TempData[] { new TempData(new String("Mulhacen"),114L,18),new TempData(new String("Sevilla"),114L,14),new TempData(new String("Madrid"),114L,30),new TempData(new String("Mostoles"),114L,26),new TempData(new String("Puerto de Navacerrada"),114L,10),new TempData(new String("Salamanca"),114L,15),new TempData(new String("Ponferrada"),114L,28),new TempData(new String("Mulhacen"),115L,10),new TempData(new String("Sevilla"),115L,18),new TempData(new String("Mostoles"),115L,13),new TempData(new String("Puerto de Navacerrada"),115L,13),new TempData(new String("Ponferrada"),115L,14),new TempData(new String("Mulhacen"),116L,24),new TempData(new String("Sevilla"),116L,11),new TempData(new String("Puerto de Navacerrada"),116L,16),new TempData(new String("Salamanca"),116L,30),new TempData(new String("Soria"),116L,20) },m).doCall().checkResult(new es.upm.aedlib.Pair<String,Integer>(new String("Salamanca"),new Integer(30))) ;
}
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
    ResultsHandler.stopTest(new String("test_43")) ;
    ResultsHandler.add_result(new String("maxTemperatureInRegion"),resultIs) ;
    System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_44 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_44") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_44")) ;
if (ok_sofar)
{
  es.upm.aedlib.map.HashTableMap<String,String> m = new es.upm.aedlib.map.HashTableMap<String,String>() ;
  m.put(new String("Mulhacen"),new String("Andalucia")) ;
  m.put(new String("Sevilla"),new String("Andalucia")) ;
  m.put(new String("La Linea"),new String("Andalucia")) ;
  m.put(new String("Madrid"),new String("Madrid")) ;
  m.put(new String("Mostoles"),new String("Madrid")) ;
  m.put(new String("Puerto de Navacerrada"),new String("Madrid")) ;
  m.put(new String("Salamanca"),new String("Castilla y Leon")) ;
  m.put(new String("Soria"),new String("Castilla y Leon")) ;
  m.put(new String("Ponferrada"),new String("Castilla y Leon")) ;
  ok_sofar = new MaxTemperatureInRegion(109L,111L,new String("Madrid"),new TempData[] { new TempData(new String("Mulhacen"),113L,10),new TempData(new String("La Linea"),113L,26),new TempData(new String("Madrid"),113L,25),new TempData(new String("Mostoles"),113L,12),new TempData(new String("Puerto de Navacerrada"),113L,24),new TempData(new String("Mulhacen"),114L,13),new TempData(new String("La Linea"),114L,30),new TempData(new String("Madrid"),114L,15),new TempData(new String("Mostoles"),114L,26),new TempData(new String("Puerto de Navacerrada"),114L,25),new TempData(new String("Ponferrada"),114L,21),new TempData(new String("Mulhacen"),115L,21),new TempData(new String("Puerto de Navacerrada"),115L,29),new TempData(new String("Salamanca"),115L,18),new TempData(new String("Mulhacen"),116L,25),new TempData(new String("Sevilla"),116L,17),new TempData(new String("Mostoles"),116L,21),new TempData(new String("Soria"),116L,18) },m).doCall().checkResult(null) ;
}
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
    ResultsHandler.stopTest(new String("test_44")) ;
    ResultsHandler.add_result(new String("maxTemperatureInRegion"),resultIs) ;
    System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_45 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_45") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_45")) ;
if (ok_sofar)
{
  es.upm.aedlib.map.HashTableMap<String,String> m = new es.upm.aedlib.map.HashTableMap<String,String>() ;
  m.put(new String("Mulhacen"),new String("Andalucia")) ;
  m.put(new String("Sevilla"),new String("Andalucia")) ;
  m.put(new String("La Linea"),new String("Andalucia")) ;
  m.put(new String("Madrid"),new String("Madrid")) ;
  m.put(new String("Mostoles"),new String("Madrid")) ;
  m.put(new String("Puerto de Navacerrada"),new String("Madrid")) ;
  m.put(new String("Salamanca"),new String("Castilla y Leon")) ;
  m.put(new String("Soria"),new String("Castilla y Leon")) ;
  m.put(new String("Ponferrada"),new String("Castilla y Leon")) ;
  ok_sofar = new MaxTemperatureInRegion(112L,118L,new String("Madrid"),new TempData[] { new TempData(new String("Mulhacen"),116L,29),new TempData(new String("Sevilla"),116L,16),new TempData(new String("Ponferrada"),116L,26),new TempData(new String("Mulhacen"),117L,18),new TempData(new String("Sevilla"),117L,22),new TempData(new String("Madrid"),117L,11),new TempData(new String("Mostoles"),117L,21),new TempData(new String("Mulhacen"),118L,24),new TempData(new String("Sevilla"),118L,24),new TempData(new String("La Linea"),118L,21),new TempData(new String("Madrid"),118L,29),new TempData(new String("Soria"),118L,16),new TempData(new String("Ponferrada"),118L,21),new TempData(new String("Mulhacen"),119L,19),new TempData(new String("Madrid"),119L,25),new TempData(new String("Puerto de Navacerrada"),119L,29),new TempData(new String("Salamanca"),119L,27),new TempData(new String("Ponferrada"),119L,13) },m).doCall().checkResult(new es.upm.aedlib.Pair<String,Integer>(new String("Madrid"),new Integer(29))) ;
}
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
    ResultsHandler.stopTest(new String("test_45")) ;
    ResultsHandler.add_result(new String("maxTemperatureInRegion"),resultIs) ;
    System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_46 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_46") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_46")) ;
if (ok_sofar)
{
  es.upm.aedlib.map.HashTableMap<String,String> m = new es.upm.aedlib.map.HashTableMap<String,String>() ;
  m.put(new String("Mulhacen"),new String("Andalucia")) ;
  m.put(new String("Sevilla"),new String("Andalucia")) ;
  m.put(new String("La Linea"),new String("Andalucia")) ;
  m.put(new String("Madrid"),new String("Madrid")) ;
  m.put(new String("Mostoles"),new String("Madrid")) ;
  m.put(new String("Puerto de Navacerrada"),new String("Madrid")) ;
  m.put(new String("Salamanca"),new String("Castilla y Leon")) ;
  m.put(new String("Soria"),new String("Castilla y Leon")) ;
  m.put(new String("Ponferrada"),new String("Castilla y Leon")) ;
  ok_sofar = new MaxTemperatureInRegion(112L,120L,new String("Castilla y Leon"),new TempData[] { new TempData(new String("Mulhacen"),114L,24),new TempData(new String("Sevilla"),114L,22),new TempData(new String("La Linea"),114L,19),new TempData(new String("Madrid"),114L,28),new TempData(new String("Mostoles"),114L,18),new TempData(new String("Salamanca"),114L,28),new TempData(new String("Soria"),114L,27),new TempData(new String("La Linea"),115L,12),new TempData(new String("Madrid"),115L,16),new TempData(new String("Puerto de Navacerrada"),115L,22),new TempData(new String("Soria"),115L,21),new TempData(new String("Ponferrada"),115L,21),new TempData(new String("Sevilla"),116L,16),new TempData(new String("Madrid"),116L,23),new TempData(new String("Mostoles"),116L,29),new TempData(new String("Puerto de Navacerrada"),116L,16),new TempData(new String("Soria"),116L,13),new TempData(new String("Ponferrada"),116L,12) },m).doCall().checkResult(new es.upm.aedlib.Pair<String,Integer>(new String("Salamanca"),new Integer(28))) ;
}
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
    ResultsHandler.stopTest(new String("test_46")) ;
    ResultsHandler.add_result(new String("maxTemperatureInRegion"),resultIs) ;
    System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_47 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_47") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_47")) ;
if (ok_sofar)
{
  es.upm.aedlib.map.HashTableMap<String,String> m = new es.upm.aedlib.map.HashTableMap<String,String>() ;
  m.put(new String("Mulhacen"),new String("Andalucia")) ;
  m.put(new String("Sevilla"),new String("Andalucia")) ;
  m.put(new String("La Linea"),new String("Andalucia")) ;
  m.put(new String("Madrid"),new String("Madrid")) ;
  m.put(new String("Mostoles"),new String("Madrid")) ;
  m.put(new String("Puerto de Navacerrada"),new String("Madrid")) ;
  m.put(new String("Salamanca"),new String("Castilla y Leon")) ;
  m.put(new String("Soria"),new String("Castilla y Leon")) ;
  m.put(new String("Ponferrada"),new String("Castilla y Leon")) ;
  ok_sofar = new MaxTemperatureInRegion(107L,110L,new String("Andalucia"),new TempData[] { new TempData(new String("Sevilla"),111L,21),new TempData(new String("Puerto de Navacerrada"),111L,16),new TempData(new String("Soria"),111L,12),new TempData(new String("Ponferrada"),111L,13),new TempData(new String("La Linea"),112L,15),new TempData(new String("Mostoles"),112L,10),new TempData(new String("Puerto de Navacerrada"),112L,24),new TempData(new String("Sevilla"),114L,13),new TempData(new String("Madrid"),114L,24),new TempData(new String("Mostoles"),114L,20),new TempData(new String("Puerto de Navacerrada"),114L,25),new TempData(new String("Salamanca"),114L,23),new TempData(new String("Ponferrada"),114L,19),new TempData(new String("Mulhacen"),115L,13),new TempData(new String("Sevilla"),115L,11),new TempData(new String("La Linea"),115L,14),new TempData(new String("Madrid"),115L,18),new TempData(new String("Salamanca"),115L,11),new TempData(new String("Ponferrada"),115L,23) },m).doCall().checkResult(null) ;
}
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
    ResultsHandler.stopTest(new String("test_47")) ;
    ResultsHandler.add_result(new String("maxTemperatureInRegion"),resultIs) ;
    System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_48 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_48") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_48")) ;
if (ok_sofar)
{
  es.upm.aedlib.map.HashTableMap<String,String> m = new es.upm.aedlib.map.HashTableMap<String,String>() ;
  m.put(new String("Mulhacen"),new String("Andalucia")) ;
  m.put(new String("Sevilla"),new String("Andalucia")) ;
  m.put(new String("La Linea"),new String("Andalucia")) ;
  m.put(new String("Madrid"),new String("Madrid")) ;
  m.put(new String("Mostoles"),new String("Madrid")) ;
  m.put(new String("Puerto de Navacerrada"),new String("Madrid")) ;
  m.put(new String("Salamanca"),new String("Castilla y Leon")) ;
  m.put(new String("Soria"),new String("Castilla y Leon")) ;
  m.put(new String("Ponferrada"),new String("Castilla y Leon")) ;
  ok_sofar = new MaxTemperatureInRegion(110L,116L,new String("Madrid"),new TempData[] { new TempData(new String("Mulhacen"),109L,20),new TempData(new String("Sevilla"),109L,30),new TempData(new String("La Linea"),109L,17),new TempData(new String("Madrid"),109L,11),new TempData(new String("Mostoles"),109L,20),new TempData(new String("Puerto de Navacerrada"),109L,22),new TempData(new String("Salamanca"),109L,12),new TempData(new String("Soria"),109L,14),new TempData(new String("Ponferrada"),109L,22),new TempData(new String("Mulhacen"),110L,19),new TempData(new String("La Linea"),110L,19),new TempData(new String("Madrid"),110L,15),new TempData(new String("Mostoles"),110L,23),new TempData(new String("Salamanca"),110L,15),new TempData(new String("Ponferrada"),110L,29),new TempData(new String("Mulhacen"),111L,19),new TempData(new String("La Linea"),111L,24),new TempData(new String("Mostoles"),111L,25),new TempData(new String("Puerto de Navacerrada"),111L,26),new TempData(new String("Salamanca"),111L,20) },m).doCall().checkResult(new es.upm.aedlib.Pair<String,Integer>(new String("Puerto de Navacerrada"),new Integer(26))) ;
}
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
    ResultsHandler.stopTest(new String("test_48")) ;
    ResultsHandler.add_result(new String("maxTemperatureInRegion"),resultIs) ;
    System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_49 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_49") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_49")) ;
if (ok_sofar)
{
  es.upm.aedlib.map.HashTableMap<String,String> m = new es.upm.aedlib.map.HashTableMap<String,String>() ;
  m.put(new String("Mulhacen"),new String("Andalucia")) ;
  m.put(new String("Sevilla"),new String("Andalucia")) ;
  m.put(new String("La Linea"),new String("Andalucia")) ;
  m.put(new String("Madrid"),new String("Madrid")) ;
  m.put(new String("Mostoles"),new String("Madrid")) ;
  m.put(new String("Puerto de Navacerrada"),new String("Madrid")) ;
  m.put(new String("Salamanca"),new String("Castilla y Leon")) ;
  m.put(new String("Soria"),new String("Castilla y Leon")) ;
  m.put(new String("Ponferrada"),new String("Castilla y Leon")) ;
  ok_sofar = new MaxTemperatureInRegion(107L,112L,new String("Madrid"),new TempData[] { new TempData(new String("La Linea"),111L,21),new TempData(new String("Madrid"),111L,26),new TempData(new String("Mostoles"),111L,29),new TempData(new String("Salamanca"),111L,21),new TempData(new String("Salamanca"),112L,17),new TempData(new String("Soria"),112L,25),new TempData(new String("Ponferrada"),112L,16),new TempData(new String("Madrid"),113L,18),new TempData(new String("Mostoles"),113L,27),new TempData(new String("Puerto de Navacerrada"),113L,23),new TempData(new String("Mulhacen"),114L,24),new TempData(new String("Mostoles"),114L,30),new TempData(new String("Puerto de Navacerrada"),114L,28),new TempData(new String("Soria"),114L,15),new TempData(new String("Mulhacen"),115L,21),new TempData(new String("Sevilla"),115L,24),new TempData(new String("La Linea"),115L,19),new TempData(new String("Madrid"),115L,13),new TempData(new String("Mulhacen"),116L,11),new TempData(new String("Madrid"),116L,25),new TempData(new String("Mostoles"),116L,20),new TempData(new String("Salamanca"),116L,27),new TempData(new String("Ponferrada"),116L,14),new TempData(new String("Mulhacen"),117L,10),new TempData(new String("La Linea"),117L,21),new TempData(new String("Madrid"),117L,23),new TempData(new String("Ponferrada"),117L,25) },m).doCall().checkResult(new es.upm.aedlib.Pair<String,Integer>(new String("Mostoles"),new Integer(29))) ;
}
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
    ResultsHandler.stopTest(new String("test_49")) ;
    ResultsHandler.add_result(new String("maxTemperatureInRegion"),resultIs) ;
    System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_50 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_50") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_50")) ;
if (ok_sofar)
{
  es.upm.aedlib.map.HashTableMap<String,String> m = new es.upm.aedlib.map.HashTableMap<String,String>() ;
  m.put(new String("Mulhacen"),new String("Andalucia")) ;
  m.put(new String("Sevilla"),new String("Andalucia")) ;
  m.put(new String("La Linea"),new String("Andalucia")) ;
  m.put(new String("Madrid"),new String("Madrid")) ;
  m.put(new String("Mostoles"),new String("Madrid")) ;
  m.put(new String("Puerto de Navacerrada"),new String("Madrid")) ;
  m.put(new String("Salamanca"),new String("Castilla y Leon")) ;
  m.put(new String("Soria"),new String("Castilla y Leon")) ;
  m.put(new String("Ponferrada"),new String("Castilla y Leon")) ;
  ok_sofar = new MaxTemperatureInRegion(111L,116L,new String("Castilla y Leon"),new TempData[] { new TempData(new String("Mulhacen"),116L,13),new TempData(new String("Madrid"),116L,12),new TempData(new String("Puerto de Navacerrada"),116L,27),new TempData(new String("Salamanca"),116L,20),new TempData(new String("Ponferrada"),116L,17),new TempData(new String("Mulhacen"),117L,12),new TempData(new String("La Linea"),117L,23),new TempData(new String("Madrid"),117L,27),new TempData(new String("Soria"),117L,13),new TempData(new String("Ponferrada"),117L,14),new TempData(new String("Mulhacen"),118L,27),new TempData(new String("La Linea"),118L,12),new TempData(new String("Mostoles"),118L,17),new TempData(new String("Mulhacen"),119L,19),new TempData(new String("Sevilla"),119L,10),new TempData(new String("La Linea"),119L,19),new TempData(new String("Madrid"),119L,10),new TempData(new String("Mostoles"),119L,15),new TempData(new String("Puerto de Navacerrada"),119L,13),new TempData(new String("Salamanca"),119L,27),new TempData(new String("Sevilla"),120L,21),new TempData(new String("La Linea"),120L,16),new TempData(new String("Mostoles"),120L,14),new TempData(new String("Puerto de Navacerrada"),120L,25),new TempData(new String("Salamanca"),120L,11),new TempData(new String("Ponferrada"),120L,16),new TempData(new String("Madrid"),121L,11),new TempData(new String("Puerto de Navacerrada"),121L,14),new TempData(new String("Salamanca"),121L,27),new TempData(new String("Soria"),121L,10) },m).doCall().checkResult(new es.upm.aedlib.Pair<String,Integer>(new String("Salamanca"),new Integer(20))) ;
}
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
    ResultsHandler.stopTest(new String("test_50")) ;
    ResultsHandler.add_result(new String("maxTemperatureInRegion"),resultIs) ;
    System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_51 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_51") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_51")) ;
if (ok_sofar)
{
  es.upm.aedlib.map.HashTableMap<String,String> m = new es.upm.aedlib.map.HashTableMap<String,String>() ;
  m.put(new String("Mulhacen"),new String("Andalucia")) ;
  m.put(new String("Sevilla"),new String("Andalucia")) ;
  m.put(new String("La Linea"),new String("Andalucia")) ;
  m.put(new String("Madrid"),new String("Madrid")) ;
  m.put(new String("Mostoles"),new String("Madrid")) ;
  m.put(new String("Puerto de Navacerrada"),new String("Madrid")) ;
  m.put(new String("Salamanca"),new String("Castilla y Leon")) ;
  m.put(new String("Soria"),new String("Castilla y Leon")) ;
  m.put(new String("Ponferrada"),new String("Castilla y Leon")) ;
  ok_sofar = new MaxTemperatureInRegion(110L,113L,new String("Madrid"),new TempData[] { new TempData(new String("Sevilla"),105L,20),new TempData(new String("La Linea"),105L,12),new TempData(new String("Madrid"),105L,20),new TempData(new String("Mostoles"),105L,24),new TempData(new String("Puerto de Navacerrada"),105L,22),new TempData(new String("Salamanca"),105L,17),new TempData(new String("Soria"),105L,15),new TempData(new String("Ponferrada"),105L,29),new TempData(new String("Mulhacen"),106L,18),new TempData(new String("Sevilla"),106L,14),new TempData(new String("La Linea"),106L,20),new TempData(new String("Mostoles"),106L,29),new TempData(new String("Puerto de Navacerrada"),106L,19),new TempData(new String("Sevilla"),107L,15),new TempData(new String("La Linea"),107L,23),new TempData(new String("Madrid"),107L,13),new TempData(new String("Mostoles"),107L,21),new TempData(new String("Puerto de Navacerrada"),107L,21),new TempData(new String("Salamanca"),107L,26),new TempData(new String("Mulhacen"),108L,16),new TempData(new String("La Linea"),108L,16),new TempData(new String("Madrid"),108L,11),new TempData(new String("Puerto de Navacerrada"),108L,24),new TempData(new String("Soria"),108L,14),new TempData(new String("Sevilla"),109L,24),new TempData(new String("La Linea"),109L,20),new TempData(new String("Mostoles"),109L,27),new TempData(new String("Puerto de Navacerrada"),109L,20),new TempData(new String("Madrid"),110L,19),new TempData(new String("Mulhacen"),111L,19),new TempData(new String("Sevilla"),111L,29),new TempData(new String("Madrid"),111L,27),new TempData(new String("Salamanca"),111L,13) },m).doCall().checkResult(new es.upm.aedlib.Pair<String,Integer>(new String("Madrid"),new Integer(27))) ;
}
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
    ResultsHandler.stopTest(new String("test_51")) ;
    ResultsHandler.add_result(new String("maxTemperatureInRegion"),resultIs) ;
    System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_52 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_52") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_52")) ;
if (ok_sofar)
{
  es.upm.aedlib.map.HashTableMap<String,String> m = new es.upm.aedlib.map.HashTableMap<String,String>() ;
  m.put(new String("Mulhacen"),new String("Andalucia")) ;
  m.put(new String("Sevilla"),new String("Andalucia")) ;
  m.put(new String("La Linea"),new String("Andalucia")) ;
  m.put(new String("Madrid"),new String("Madrid")) ;
  m.put(new String("Mostoles"),new String("Madrid")) ;
  m.put(new String("Puerto de Navacerrada"),new String("Madrid")) ;
  m.put(new String("Salamanca"),new String("Castilla y Leon")) ;
  m.put(new String("Soria"),new String("Castilla y Leon")) ;
  m.put(new String("Ponferrada"),new String("Castilla y Leon")) ;
  ok_sofar = new MaxTemperatureInRegion(110L,111L,new String("Madrid"),new TempData[] { new TempData(new String("Mulhacen"),110L,24),new TempData(new String("Sevilla"),110L,22),new TempData(new String("Puerto de Navacerrada"),110L,21),new TempData(new String("Salamanca"),110L,30),new TempData(new String("Soria"),110L,26),new TempData(new String("La Linea"),111L,11),new TempData(new String("Madrid"),111L,21),new TempData(new String("Mostoles"),111L,23),new TempData(new String("Salamanca"),111L,16),new TempData(new String("Mulhacen"),112L,18),new TempData(new String("Sevilla"),112L,23),new TempData(new String("Madrid"),112L,27),new TempData(new String("Mostoles"),112L,16),new TempData(new String("Soria"),112L,19),new TempData(new String("Ponferrada"),112L,16),new TempData(new String("Mulhacen"),113L,19),new TempData(new String("Madrid"),113L,21),new TempData(new String("Mostoles"),113L,13),new TempData(new String("Salamanca"),113L,30),new TempData(new String("Ponferrada"),113L,19),new TempData(new String("Mulhacen"),114L,16),new TempData(new String("La Linea"),114L,29),new TempData(new String("Madrid"),114L,26),new TempData(new String("Puerto de Navacerrada"),114L,17),new TempData(new String("Ponferrada"),114L,17),new TempData(new String("Mulhacen"),115L,21),new TempData(new String("Sevilla"),115L,15),new TempData(new String("Mostoles"),115L,12),new TempData(new String("Salamanca"),115L,29),new TempData(new String("Ponferrada"),115L,21),new TempData(new String("Mulhacen"),116L,27),new TempData(new String("Madrid"),116L,27),new TempData(new String("Puerto de Navacerrada"),116L,14),new TempData(new String("Ponferrada"),116L,10) },m).doCall().checkResult(new es.upm.aedlib.Pair<String,Integer>(new String("Mostoles"),new Integer(23))) ;
}
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
    ResultsHandler.stopTest(new String("test_52")) ;
    ResultsHandler.add_result(new String("maxTemperatureInRegion"),resultIs) ;
    System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_53 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_53") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_53")) ;
if (ok_sofar)
{
  es.upm.aedlib.map.HashTableMap<String,String> m = new es.upm.aedlib.map.HashTableMap<String,String>() ;
  m.put(new String("Mulhacen"),new String("Andalucia")) ;
  m.put(new String("Sevilla"),new String("Andalucia")) ;
  m.put(new String("La Linea"),new String("Andalucia")) ;
  m.put(new String("Madrid"),new String("Madrid")) ;
  m.put(new String("Mostoles"),new String("Madrid")) ;
  m.put(new String("Puerto de Navacerrada"),new String("Madrid")) ;
  m.put(new String("Salamanca"),new String("Castilla y Leon")) ;
  m.put(new String("Soria"),new String("Castilla y Leon")) ;
  m.put(new String("Ponferrada"),new String("Castilla y Leon")) ;
  ok_sofar = new MaxTemperatureInRegion(107L,111L,new String("Andalucia"),new TempData[] { new TempData(new String("La Linea"),103L,21),new TempData(new String("Madrid"),103L,14),new TempData(new String("Puerto de Navacerrada"),103L,15),new TempData(new String("Soria"),103L,30),new TempData(new String("Ponferrada"),103L,28),new TempData(new String("Mulhacen"),104L,17),new TempData(new String("La Linea"),104L,28),new TempData(new String("Madrid"),104L,11),new TempData(new String("Ponferrada"),104L,13),new TempData(new String("Sevilla"),105L,18),new TempData(new String("Puerto de Navacerrada"),105L,23),new TempData(new String("Ponferrada"),105L,23),new TempData(new String("Mulhacen"),106L,22),new TempData(new String("Sevilla"),106L,21),new TempData(new String("La Linea"),106L,30),new TempData(new String("Madrid"),106L,28),new TempData(new String("Mostoles"),106L,21),new TempData(new String("Salamanca"),106L,27),new TempData(new String("Ponferrada"),106L,27),new TempData(new String("Mulhacen"),107L,23),new TempData(new String("Sevilla"),107L,17),new TempData(new String("La Linea"),107L,22),new TempData(new String("Mostoles"),107L,26),new TempData(new String("Salamanca"),107L,18),new TempData(new String("Sevilla"),108L,29),new TempData(new String("La Linea"),108L,25),new TempData(new String("Madrid"),108L,12),new TempData(new String("Ponferrada"),108L,20),new TempData(new String("La Linea"),109L,30),new TempData(new String("Mostoles"),109L,12),new TempData(new String("Puerto de Navacerrada"),109L,14),new TempData(new String("Mulhacen"),110L,26),new TempData(new String("Mostoles"),110L,28),new TempData(new String("Puerto de Navacerrada"),110L,17),new TempData(new String("Ponferrada"),110L,11),new TempData(new String("Mulhacen"),111L,19),new TempData(new String("Sevilla"),111L,13),new TempData(new String("La Linea"),111L,15),new TempData(new String("Madrid"),111L,18),new TempData(new String("Soria"),111L,13) },m).doCall().checkResult(new es.upm.aedlib.Pair<String,Integer>(new String("La Linea"),new Integer(30))) ;
}
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
    ResultsHandler.stopTest(new String("test_53")) ;
    ResultsHandler.add_result(new String("maxTemperatureInRegion"),resultIs) ;
    System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_54 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_54") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_54")) ;
if (ok_sofar)
{
  es.upm.aedlib.map.HashTableMap<String,String> m = new es.upm.aedlib.map.HashTableMap<String,String>() ;
  m.put(new String("Mulhacen"),new String("Andalucia")) ;
  m.put(new String("Sevilla"),new String("Andalucia")) ;
  m.put(new String("La Linea"),new String("Andalucia")) ;
  m.put(new String("Madrid"),new String("Madrid")) ;
  m.put(new String("Mostoles"),new String("Madrid")) ;
  m.put(new String("Puerto de Navacerrada"),new String("Madrid")) ;
  m.put(new String("Salamanca"),new String("Castilla y Leon")) ;
  m.put(new String("Soria"),new String("Castilla y Leon")) ;
  m.put(new String("Ponferrada"),new String("Castilla y Leon")) ;
  ok_sofar = new MaxTemperatureInRegion(111L,119L,new String("Madrid"),new TempData[] { new TempData(new String("La Linea"),108L,17),new TempData(new String("Madrid"),108L,30),new TempData(new String("Mostoles"),108L,18),new TempData(new String("Madrid"),109L,26),new TempData(new String("Mulhacen"),110L,28),new TempData(new String("Sevilla"),110L,19),new TempData(new String("Madrid"),110L,14),new TempData(new String("Salamanca"),110L,28),new TempData(new String("Soria"),110L,21),new TempData(new String("Sevilla"),111L,19),new TempData(new String("Puerto de Navacerrada"),111L,21),new TempData(new String("Ponferrada"),111L,19),new TempData(new String("Mulhacen"),112L,17),new TempData(new String("Sevilla"),112L,23),new TempData(new String("La Linea"),112L,15),new TempData(new String("Madrid"),112L,22),new TempData(new String("Soria"),112L,25),new TempData(new String("Sevilla"),113L,14),new TempData(new String("Mostoles"),113L,22),new TempData(new String("Mulhacen"),114L,24),new TempData(new String("La Linea"),114L,27),new TempData(new String("Mostoles"),114L,17),new TempData(new String("Puerto de Navacerrada"),114L,21),new TempData(new String("Salamanca"),114L,11),new TempData(new String("Soria"),114L,24),new TempData(new String("Ponferrada"),114L,25),new TempData(new String("La Linea"),115L,12),new TempData(new String("Mostoles"),115L,17),new TempData(new String("Soria"),115L,17),new TempData(new String("Sevilla"),116L,13),new TempData(new String("Puerto de Navacerrada"),116L,17),new TempData(new String("Mulhacen"),117L,25),new TempData(new String("Sevilla"),117L,18),new TempData(new String("La Linea"),117L,16),new TempData(new String("Salamanca"),117L,13),new TempData(new String("Soria"),117L,12),new TempData(new String("Ponferrada"),117L,19),new TempData(new String("La Linea"),118L,13),new TempData(new String("Madrid"),118L,21),new TempData(new String("Mostoles"),118L,23),new TempData(new String("Soria"),118L,23) },m).doCall().checkResult(new es.upm.aedlib.Pair<String,Integer>(new String("Mostoles"),new Integer(23))) ;
}
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
    ResultsHandler.stopTest(new String("test_54")) ;
    ResultsHandler.add_result(new String("maxTemperatureInRegion"),resultIs) ;
    System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_55 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_55") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_55")) ;
if (ok_sofar)
{
  es.upm.aedlib.map.HashTableMap<String,String> m = new es.upm.aedlib.map.HashTableMap<String,String>() ;
  m.put(new String("Mulhacen"),new String("Andalucia")) ;
  m.put(new String("Sevilla"),new String("Andalucia")) ;
  m.put(new String("La Linea"),new String("Andalucia")) ;
  m.put(new String("Madrid"),new String("Madrid")) ;
  m.put(new String("Mostoles"),new String("Madrid")) ;
  m.put(new String("Puerto de Navacerrada"),new String("Madrid")) ;
  m.put(new String("Salamanca"),new String("Castilla y Leon")) ;
  m.put(new String("Soria"),new String("Castilla y Leon")) ;
  m.put(new String("Ponferrada"),new String("Castilla y Leon")) ;
  ok_sofar = new MaxTemperatureInRegion(107L,111L,new String("Madrid"),new TempData[] { new TempData(new String("Madrid"),105L,30),new TempData(new String("Puerto de Navacerrada"),105L,27),new TempData(new String("Soria"),105L,18),new TempData(new String("Sevilla"),106L,15),new TempData(new String("La Linea"),106L,21),new TempData(new String("Mostoles"),106L,15),new TempData(new String("Soria"),106L,10),new TempData(new String("Ponferrada"),106L,15),new TempData(new String("Sevilla"),107L,25),new TempData(new String("La Linea"),107L,27),new TempData(new String("Madrid"),107L,27),new TempData(new String("Salamanca"),107L,17),new TempData(new String("Ponferrada"),107L,22),new TempData(new String("Mulhacen"),108L,29),new TempData(new String("Sevilla"),108L,26),new TempData(new String("La Linea"),108L,30),new TempData(new String("Madrid"),108L,20),new TempData(new String("Puerto de Navacerrada"),108L,11),new TempData(new String("Salamanca"),108L,27),new TempData(new String("Soria"),108L,23),new TempData(new String("Mulhacen"),109L,27),new TempData(new String("Mulhacen"),110L,19),new TempData(new String("Sevilla"),110L,13),new TempData(new String("La Linea"),110L,17),new TempData(new String("Madrid"),110L,25),new TempData(new String("Puerto de Navacerrada"),110L,28),new TempData(new String("Soria"),110L,27),new TempData(new String("Ponferrada"),110L,19),new TempData(new String("Sevilla"),111L,18),new TempData(new String("La Linea"),111L,13),new TempData(new String("Mostoles"),111L,27),new TempData(new String("Salamanca"),111L,10),new TempData(new String("Soria"),111L,26),new TempData(new String("Mulhacen"),112L,29),new TempData(new String("La Linea"),112L,28),new TempData(new String("Madrid"),112L,15),new TempData(new String("Mostoles"),112L,28),new TempData(new String("La Linea"),113L,20),new TempData(new String("Mostoles"),113L,29),new TempData(new String("Puerto de Navacerrada"),113L,19),new TempData(new String("Soria"),113L,26),new TempData(new String("Mostoles"),114L,23),new TempData(new String("Puerto de Navacerrada"),114L,23),new TempData(new String("Salamanca"),114L,23),new TempData(new String("Ponferrada"),114L,24),new TempData(new String("Mulhacen"),115L,22),new TempData(new String("Sevilla"),115L,23),new TempData(new String("La Linea"),115L,14),new TempData(new String("Madrid"),115L,17),new TempData(new String("Puerto de Navacerrada"),115L,22),new TempData(new String("Salamanca"),115L,12),new TempData(new String("Ponferrada"),115L,15) },m).doCall().checkResult(new es.upm.aedlib.Pair<String,Integer>(new String("Puerto de Navacerrada"),new Integer(28))) ;
}
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
    ResultsHandler.stopTest(new String("test_55")) ;
    ResultsHandler.add_result(new String("maxTemperatureInRegion"),resultIs) ;
    System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_56 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_56") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_56")) ;
if (ok_sofar)
{
  es.upm.aedlib.map.HashTableMap<String,String> m = new es.upm.aedlib.map.HashTableMap<String,String>() ;
  m.put(new String("Mulhacen"),new String("Andalucia")) ;
  m.put(new String("Sevilla"),new String("Andalucia")) ;
  m.put(new String("La Linea"),new String("Andalucia")) ;
  m.put(new String("Madrid"),new String("Madrid")) ;
  m.put(new String("Mostoles"),new String("Madrid")) ;
  m.put(new String("Puerto de Navacerrada"),new String("Madrid")) ;
  m.put(new String("Salamanca"),new String("Castilla y Leon")) ;
  m.put(new String("Soria"),new String("Castilla y Leon")) ;
  m.put(new String("Ponferrada"),new String("Castilla y Leon")) ;
  ok_sofar = new MaxTemperatureInRegion(109L,117L,new String("Andalucia"),new TempData[] { new TempData(new String("Mulhacen"),112L,13),new TempData(new String("Sevilla"),112L,27),new TempData(new String("Madrid"),112L,30),new TempData(new String("Puerto de Navacerrada"),112L,22),new TempData(new String("Soria"),112L,30),new TempData(new String("Ponferrada"),113L,10),new TempData(new String("Mulhacen"),114L,10),new TempData(new String("La Linea"),114L,18),new TempData(new String("Mostoles"),114L,23),new TempData(new String("Puerto de Navacerrada"),114L,18),new TempData(new String("Soria"),114L,20),new TempData(new String("Ponferrada"),114L,17),new TempData(new String("Mulhacen"),115L,29),new TempData(new String("Mostoles"),115L,29),new TempData(new String("Puerto de Navacerrada"),115L,11),new TempData(new String("Soria"),115L,10),new TempData(new String("Ponferrada"),115L,10),new TempData(new String("Sevilla"),116L,23),new TempData(new String("La Linea"),116L,28),new TempData(new String("Mostoles"),116L,26),new TempData(new String("Salamanca"),116L,21),new TempData(new String("Soria"),116L,20),new TempData(new String("Mulhacen"),117L,12),new TempData(new String("Madrid"),117L,16),new TempData(new String("Salamanca"),117L,16),new TempData(new String("Ponferrada"),117L,22),new TempData(new String("Mulhacen"),118L,23),new TempData(new String("La Linea"),118L,17),new TempData(new String("Puerto de Navacerrada"),118L,17),new TempData(new String("Salamanca"),118L,22),new TempData(new String("Ponferrada"),118L,13),new TempData(new String("Mulhacen"),119L,23),new TempData(new String("La Linea"),119L,17),new TempData(new String("Madrid"),119L,29),new TempData(new String("Puerto de Navacerrada"),119L,28),new TempData(new String("Salamanca"),119L,30),new TempData(new String("Soria"),119L,18),new TempData(new String("Ponferrada"),119L,16),new TempData(new String("Mulhacen"),120L,22),new TempData(new String("La Linea"),120L,23),new TempData(new String("Madrid"),120L,17),new TempData(new String("Mostoles"),120L,13),new TempData(new String("Puerto de Navacerrada"),120L,21),new TempData(new String("Salamanca"),120L,22),new TempData(new String("Soria"),120L,27),new TempData(new String("Ponferrada"),120L,16),new TempData(new String("Madrid"),121L,23),new TempData(new String("Puerto de Navacerrada"),121L,25),new TempData(new String("Soria"),121L,21),new TempData(new String("Ponferrada"),121L,17),new TempData(new String("Madrid"),122L,15),new TempData(new String("Mostoles"),122L,12),new TempData(new String("Puerto de Navacerrada"),122L,27),new TempData(new String("Salamanca"),122L,26),new TempData(new String("Soria"),122L,25) },m).doCall().checkResult(new es.upm.aedlib.Pair<String,Integer>(new String("Mulhacen"),new Integer(29))) ;
}
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
    ResultsHandler.stopTest(new String("test_56")) ;
    ResultsHandler.add_result(new String("maxTemperatureInRegion"),resultIs) ;
    System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_57 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_57") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_57")) ;
if (ok_sofar)
{
  es.upm.aedlib.map.HashTableMap<String,String> m = new es.upm.aedlib.map.HashTableMap<String,String>() ;
  m.put(new String("Mulhacen"),new String("Andalucia")) ;
  m.put(new String("Sevilla"),new String("Andalucia")) ;
  m.put(new String("La Linea"),new String("Andalucia")) ;
  m.put(new String("Madrid"),new String("Madrid")) ;
  m.put(new String("Mostoles"),new String("Madrid")) ;
  m.put(new String("Puerto de Navacerrada"),new String("Madrid")) ;
  m.put(new String("Salamanca"),new String("Castilla y Leon")) ;
  m.put(new String("Soria"),new String("Castilla y Leon")) ;
  m.put(new String("Ponferrada"),new String("Castilla y Leon")) ;
  ok_sofar = new MaxTemperatureInRegion(108L,117L,new String("Madrid"),new TempData[] { new TempData(new String("Mulhacen"),106L,18),new TempData(new String("Sevilla"),106L,21),new TempData(new String("La Linea"),106L,23),new TempData(new String("Madrid"),106L,24),new TempData(new String("Puerto de Navacerrada"),106L,15),new TempData(new String("Ponferrada"),106L,16),new TempData(new String("Sevilla"),107L,19),new TempData(new String("Salamanca"),107L,27),new TempData(new String("Soria"),107L,19),new TempData(new String("Ponferrada"),107L,16),new TempData(new String("Sevilla"),108L,27),new TempData(new String("Madrid"),108L,11),new TempData(new String("Mostoles"),108L,21),new TempData(new String("Salamanca"),108L,19),new TempData(new String("Soria"),108L,12),new TempData(new String("Madrid"),109L,24),new TempData(new String("Mostoles"),109L,17),new TempData(new String("Puerto de Navacerrada"),109L,17),new TempData(new String("Salamanca"),109L,13),new TempData(new String("Ponferrada"),109L,30),new TempData(new String("Sevilla"),110L,19),new TempData(new String("La Linea"),110L,30),new TempData(new String("Madrid"),110L,17),new TempData(new String("Mostoles"),110L,26),new TempData(new String("Puerto de Navacerrada"),110L,20),new TempData(new String("Salamanca"),110L,17),new TempData(new String("Soria"),110L,27),new TempData(new String("Sevilla"),111L,25),new TempData(new String("La Linea"),111L,14),new TempData(new String("Salamanca"),111L,11),new TempData(new String("Soria"),111L,15),new TempData(new String("Ponferrada"),111L,12),new TempData(new String("Mulhacen"),112L,17),new TempData(new String("Sevilla"),112L,28),new TempData(new String("La Linea"),112L,12),new TempData(new String("Madrid"),112L,26),new TempData(new String("Soria"),112L,13),new TempData(new String("Mulhacen"),113L,28),new TempData(new String("Sevilla"),113L,25),new TempData(new String("La Linea"),113L,30),new TempData(new String("Madrid"),113L,16),new TempData(new String("Mostoles"),113L,19),new TempData(new String("La Linea"),114L,12),new TempData(new String("Madrid"),114L,23),new TempData(new String("Mostoles"),114L,10),new TempData(new String("Puerto de Navacerrada"),114L,25),new TempData(new String("Salamanca"),114L,21),new TempData(new String("Mulhacen"),115L,26),new TempData(new String("Sevilla"),115L,27),new TempData(new String("Puerto de Navacerrada"),115L,19),new TempData(new String("Salamanca"),115L,29),new TempData(new String("Ponferrada"),115L,29),new TempData(new String("Mulhacen"),116L,24),new TempData(new String("Salamanca"),116L,30),new TempData(new String("Soria"),116L,16),new TempData(new String("La Linea"),117L,10),new TempData(new String("Madrid"),117L,28),new TempData(new String("Puerto de Navacerrada"),117L,23),new TempData(new String("Soria"),117L,30) },m).doCall().checkResult(new es.upm.aedlib.Pair<String,Integer>(new String("Madrid"),new Integer(28))) ;
}
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
    ResultsHandler.stopTest(new String("test_57")) ;
    ResultsHandler.add_result(new String("maxTemperatureInRegion"),resultIs) ;
    System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_58 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_58") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_58")) ;
if (ok_sofar)
{
  es.upm.aedlib.map.HashTableMap<String,String> m = new es.upm.aedlib.map.HashTableMap<String,String>() ;
  m.put(new String("Mulhacen"),new String("Andalucia")) ;
  m.put(new String("Sevilla"),new String("Andalucia")) ;
  m.put(new String("La Linea"),new String("Andalucia")) ;
  m.put(new String("Madrid"),new String("Madrid")) ;
  m.put(new String("Mostoles"),new String("Madrid")) ;
  m.put(new String("Puerto de Navacerrada"),new String("Madrid")) ;
  m.put(new String("Salamanca"),new String("Castilla y Leon")) ;
  m.put(new String("Soria"),new String("Castilla y Leon")) ;
  m.put(new String("Ponferrada"),new String("Castilla y Leon")) ;
  ok_sofar = new MaxTemperatureInRegion(111L,119L,new String("Andalucia"),new TempData[] { new TempData(new String("Sevilla"),108L,14),new TempData(new String("La Linea"),108L,17),new TempData(new String("Madrid"),108L,30),new TempData(new String("Mostoles"),108L,17),new TempData(new String("Ponferrada"),108L,28),new TempData(new String("Sevilla"),109L,21),new TempData(new String("Mostoles"),109L,20),new TempData(new String("Salamanca"),109L,16),new TempData(new String("Mulhacen"),110L,14),new TempData(new String("Sevilla"),110L,14),new TempData(new String("La Linea"),110L,22),new TempData(new String("Madrid"),110L,10),new TempData(new String("Mulhacen"),111L,22),new TempData(new String("Puerto de Navacerrada"),111L,28),new TempData(new String("Salamanca"),111L,23),new TempData(new String("Soria"),111L,13),new TempData(new String("Ponferrada"),111L,16),new TempData(new String("Mulhacen"),112L,12),new TempData(new String("Sevilla"),112L,24),new TempData(new String("La Linea"),112L,10),new TempData(new String("Puerto de Navacerrada"),112L,27),new TempData(new String("Soria"),112L,24),new TempData(new String("Mulhacen"),113L,16),new TempData(new String("Sevilla"),113L,13),new TempData(new String("Madrid"),113L,18),new TempData(new String("Puerto de Navacerrada"),113L,18),new TempData(new String("Salamanca"),113L,10),new TempData(new String("Mulhacen"),114L,20),new TempData(new String("Sevilla"),114L,26),new TempData(new String("Mostoles"),114L,23),new TempData(new String("Puerto de Navacerrada"),114L,15),new TempData(new String("Salamanca"),114L,26),new TempData(new String("Ponferrada"),114L,12),new TempData(new String("Mulhacen"),115L,12),new TempData(new String("Sevilla"),115L,27),new TempData(new String("Madrid"),115L,19),new TempData(new String("Mostoles"),115L,10),new TempData(new String("Soria"),115L,11),new TempData(new String("Ponferrada"),115L,10),new TempData(new String("Madrid"),116L,23),new TempData(new String("Salamanca"),116L,18),new TempData(new String("La Linea"),117L,13),new TempData(new String("Puerto de Navacerrada"),117L,22),new TempData(new String("Salamanca"),117L,16),new TempData(new String("Soria"),117L,26),new TempData(new String("Ponferrada"),117L,24),new TempData(new String("Mulhacen"),118L,20),new TempData(new String("La Linea"),118L,24),new TempData(new String("Mulhacen"),119L,15),new TempData(new String("Sevilla"),119L,12),new TempData(new String("La Linea"),119L,19),new TempData(new String("Madrid"),119L,14),new TempData(new String("Salamanca"),119L,20),new TempData(new String("Ponferrada"),119L,11),new TempData(new String("Mulhacen"),120L,29),new TempData(new String("La Linea"),120L,27),new TempData(new String("Madrid"),120L,27),new TempData(new String("Mostoles"),120L,24),new TempData(new String("Salamanca"),120L,22),new TempData(new String("Soria"),120L,21) },m).doCall().checkResult(new es.upm.aedlib.Pair<String,Integer>(new String("Sevilla"),new Integer(27))) ;
}
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
    ResultsHandler.stopTest(new String("test_58")) ;
    ResultsHandler.add_result(new String("maxTemperatureInRegion"),resultIs) ;
    System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_59 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_59") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_59")) ;
if (ok_sofar)
{
  es.upm.aedlib.map.HashTableMap<String,String> m = new es.upm.aedlib.map.HashTableMap<String,String>() ;
  m.put(new String("Mulhacen"),new String("Andalucia")) ;
  m.put(new String("Sevilla"),new String("Andalucia")) ;
  m.put(new String("La Linea"),new String("Andalucia")) ;
  m.put(new String("Madrid"),new String("Madrid")) ;
  m.put(new String("Mostoles"),new String("Madrid")) ;
  m.put(new String("Puerto de Navacerrada"),new String("Madrid")) ;
  m.put(new String("Salamanca"),new String("Castilla y Leon")) ;
  m.put(new String("Soria"),new String("Castilla y Leon")) ;
  m.put(new String("Ponferrada"),new String("Castilla y Leon")) ;
  ok_sofar = new MaxTemperatureInRegion(107L,111L,new String("Madrid"),new TempData[] { new TempData(new String("Mulhacen"),104L,26),new TempData(new String("La Linea"),104L,25),new TempData(new String("Madrid"),104L,30),new TempData(new String("Mostoles"),104L,18),new TempData(new String("Ponferrada"),104L,14),new TempData(new String("La Linea"),105L,17),new TempData(new String("Mostoles"),105L,27),new TempData(new String("Puerto de Navacerrada"),105L,19),new TempData(new String("Salamanca"),105L,12),new TempData(new String("Sevilla"),106L,18),new TempData(new String("La Linea"),106L,30),new TempData(new String("Mostoles"),106L,24),new TempData(new String("Salamanca"),106L,15),new TempData(new String("Soria"),106L,11),new TempData(new String("Ponferrada"),106L,24),new TempData(new String("Mulhacen"),107L,30),new TempData(new String("Madrid"),107L,16),new TempData(new String("Salamanca"),107L,17),new TempData(new String("Soria"),107L,13),new TempData(new String("Sevilla"),108L,21),new TempData(new String("La Linea"),108L,24),new TempData(new String("Salamanca"),108L,22),new TempData(new String("Soria"),108L,18),new TempData(new String("Mulhacen"),109L,27),new TempData(new String("La Linea"),109L,10),new TempData(new String("Mostoles"),109L,25),new TempData(new String("Salamanca"),109L,14),new TempData(new String("Mostoles"),110L,11),new TempData(new String("Salamanca"),110L,19),new TempData(new String("Ponferrada"),110L,10),new TempData(new String("Sevilla"),111L,15),new TempData(new String("Madrid"),111L,21),new TempData(new String("Puerto de Navacerrada"),111L,10),new TempData(new String("Mulhacen"),112L,30),new TempData(new String("Sevilla"),112L,11),new TempData(new String("La Linea"),112L,12),new TempData(new String("Madrid"),112L,12),new TempData(new String("Salamanca"),112L,28),new TempData(new String("Ponferrada"),112L,14),new TempData(new String("Mulhacen"),113L,18),new TempData(new String("Mostoles"),113L,10),new TempData(new String("Puerto de Navacerrada"),113L,12),new TempData(new String("Salamanca"),113L,21),new TempData(new String("Ponferrada"),113L,27),new TempData(new String("Mulhacen"),114L,21),new TempData(new String("Madrid"),114L,19),new TempData(new String("Mostoles"),114L,27),new TempData(new String("Puerto de Navacerrada"),114L,22),new TempData(new String("Salamanca"),114L,22),new TempData(new String("Mulhacen"),115L,17),new TempData(new String("Sevilla"),115L,13),new TempData(new String("La Linea"),115L,24),new TempData(new String("Madrid"),115L,20),new TempData(new String("Mostoles"),115L,27),new TempData(new String("Salamanca"),115L,28),new TempData(new String("Mulhacen"),116L,18),new TempData(new String("Sevilla"),116L,20),new TempData(new String("La Linea"),116L,14),new TempData(new String("Puerto de Navacerrada"),116L,21),new TempData(new String("Salamanca"),116L,24),new TempData(new String("Ponferrada"),116L,15) },m).doCall().checkResult(new es.upm.aedlib.Pair<String,Integer>(new String("Mostoles"),new Integer(25))) ;
}
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
    ResultsHandler.stopTest(new String("test_59")) ;
    ResultsHandler.add_result(new String("maxTemperatureInRegion"),resultIs) ;
    System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_60 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_60") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_60")) ;
if (ok_sofar)
{
  es.upm.aedlib.map.HashTableMap<String,String> m = new es.upm.aedlib.map.HashTableMap<String,String>() ;
  m.put(new String("Mulhacen"),new String("Andalucia")) ;
  m.put(new String("Sevilla"),new String("Andalucia")) ;
  m.put(new String("La Linea"),new String("Andalucia")) ;
  m.put(new String("Madrid"),new String("Madrid")) ;
  m.put(new String("Mostoles"),new String("Madrid")) ;
  m.put(new String("Puerto de Navacerrada"),new String("Madrid")) ;
  m.put(new String("Salamanca"),new String("Castilla y Leon")) ;
  m.put(new String("Soria"),new String("Castilla y Leon")) ;
  m.put(new String("Ponferrada"),new String("Castilla y Leon")) ;
  ok_sofar = new MaxTemperatureInRegion(110L,117L,new String("Andalucia"),new TempData[] { new TempData(new String("Salamanca"),107L,17),new TempData(new String("Ponferrada"),107L,25),new TempData(new String("Soria"),108L,13),new TempData(new String("Ponferrada"),108L,14),new TempData(new String("Sevilla"),109L,17),new TempData(new String("Ponferrada"),109L,29),new TempData(new String("Mulhacen"),110L,11),new TempData(new String("Madrid"),110L,21),new TempData(new String("Puerto de Navacerrada"),110L,19),new TempData(new String("Salamanca"),110L,28),new TempData(new String("Mulhacen"),111L,29),new TempData(new String("Sevilla"),111L,27),new TempData(new String("La Linea"),111L,11),new TempData(new String("Madrid"),111L,16),new TempData(new String("Puerto de Navacerrada"),111L,22),new TempData(new String("Salamanca"),111L,29),new TempData(new String("Soria"),111L,29),new TempData(new String("Sevilla"),112L,22),new TempData(new String("La Linea"),112L,17),new TempData(new String("Madrid"),112L,17),new TempData(new String("Mostoles"),112L,10),new TempData(new String("Puerto de Navacerrada"),112L,24),new TempData(new String("Ponferrada"),112L,19),new TempData(new String("Mulhacen"),113L,19),new TempData(new String("Madrid"),113L,28),new TempData(new String("Puerto de Navacerrada"),113L,20),new TempData(new String("Salamanca"),113L,25),new TempData(new String("Soria"),113L,10),new TempData(new String("Mulhacen"),114L,16),new TempData(new String("Sevilla"),114L,12),new TempData(new String("Puerto de Navacerrada"),114L,14),new TempData(new String("Salamanca"),114L,30),new TempData(new String("Soria"),114L,23),new TempData(new String("Puerto de Navacerrada"),115L,19),new TempData(new String("Soria"),115L,13),new TempData(new String("Ponferrada"),115L,11),new TempData(new String("Mulhacen"),116L,10),new TempData(new String("Sevilla"),116L,15),new TempData(new String("La Linea"),116L,25),new TempData(new String("Madrid"),116L,18),new TempData(new String("Soria"),116L,22),new TempData(new String("Mulhacen"),117L,27),new TempData(new String("Sevilla"),117L,25),new TempData(new String("La Linea"),117L,21),new TempData(new String("Mostoles"),117L,28),new TempData(new String("Puerto de Navacerrada"),117L,25),new TempData(new String("Ponferrada"),117L,13),new TempData(new String("Mulhacen"),118L,16),new TempData(new String("Puerto de Navacerrada"),118L,17),new TempData(new String("Soria"),118L,15),new TempData(new String("Mulhacen"),119L,25),new TempData(new String("Madrid"),119L,17),new TempData(new String("Mostoles"),119L,15),new TempData(new String("Salamanca"),119L,29),new TempData(new String("Soria"),119L,11),new TempData(new String("Mulhacen"),120L,16),new TempData(new String("Sevilla"),120L,30),new TempData(new String("La Linea"),120L,23),new TempData(new String("Salamanca"),120L,22),new TempData(new String("Mulhacen"),121L,26),new TempData(new String("Sevilla"),121L,15),new TempData(new String("La Linea"),121L,11),new TempData(new String("Salamanca"),121L,15),new TempData(new String("Ponferrada"),121L,15),new TempData(new String("Mulhacen"),122L,24),new TempData(new String("La Linea"),122L,21),new TempData(new String("Ponferrada"),122L,24) },m).doCall().checkResult(new es.upm.aedlib.Pair<String,Integer>(new String("Mulhacen"),new Integer(29))) ;
}
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
    ResultsHandler.stopTest(new String("test_60")) ;
    ResultsHandler.add_result(new String("maxTemperatureInRegion"),resultIs) ;
    System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_61 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_61") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_61")) ;
if (ok_sofar)
{
  es.upm.aedlib.map.HashTableMap<String,String> m = new es.upm.aedlib.map.HashTableMap<String,String>() ;
  m.put(new String("Mulhacen"),new String("Andalucia")) ;
  m.put(new String("Sevilla"),new String("Andalucia")) ;
  m.put(new String("La Linea"),new String("Andalucia")) ;
  m.put(new String("Madrid"),new String("Madrid")) ;
  m.put(new String("Mostoles"),new String("Madrid")) ;
  m.put(new String("Puerto de Navacerrada"),new String("Madrid")) ;
  m.put(new String("Salamanca"),new String("Castilla y Leon")) ;
  m.put(new String("Soria"),new String("Castilla y Leon")) ;
  m.put(new String("Ponferrada"),new String("Castilla y Leon")) ;
  ok_sofar = new MaxTemperatureInRegion(111L,116L,new String("Andalucia"),new TempData[] { new TempData(new String("La Linea"),106L,10),new TempData(new String("Puerto de Navacerrada"),106L,11),new TempData(new String("Soria"),106L,25),new TempData(new String("Mulhacen"),107L,24),new TempData(new String("La Linea"),107L,18),new TempData(new String("Madrid"),107L,21),new TempData(new String("Mostoles"),107L,13),new TempData(new String("Puerto de Navacerrada"),107L,23),new TempData(new String("Soria"),107L,23),new TempData(new String("Sevilla"),108L,24),new TempData(new String("La Linea"),108L,27),new TempData(new String("Salamanca"),108L,18),new TempData(new String("Sevilla"),109L,23),new TempData(new String("Puerto de Navacerrada"),109L,25),new TempData(new String("Ponferrada"),109L,25),new TempData(new String("Ponferrada"),110L,23),new TempData(new String("Mulhacen"),111L,15),new TempData(new String("La Linea"),111L,26),new TempData(new String("Madrid"),111L,11),new TempData(new String("Mostoles"),111L,18),new TempData(new String("Puerto de Navacerrada"),111L,19),new TempData(new String("Ponferrada"),111L,18),new TempData(new String("Mulhacen"),112L,22),new TempData(new String("Sevilla"),112L,23),new TempData(new String("La Linea"),112L,17),new TempData(new String("Madrid"),112L,10),new TempData(new String("Puerto de Navacerrada"),112L,20),new TempData(new String("Soria"),112L,10),new TempData(new String("Ponferrada"),112L,24),new TempData(new String("Sevilla"),113L,27),new TempData(new String("Madrid"),113L,23),new TempData(new String("Mostoles"),113L,20),new TempData(new String("Puerto de Navacerrada"),113L,26),new TempData(new String("Ponferrada"),113L,27),new TempData(new String("Mulhacen"),114L,30),new TempData(new String("La Linea"),114L,26),new TempData(new String("Mostoles"),114L,28),new TempData(new String("Soria"),114L,10),new TempData(new String("Ponferrada"),114L,17),new TempData(new String("La Linea"),115L,26),new TempData(new String("Madrid"),115L,13),new TempData(new String("Puerto de Navacerrada"),115L,29),new TempData(new String("Salamanca"),115L,13),new TempData(new String("Puerto de Navacerrada"),116L,27),new TempData(new String("Ponferrada"),116L,23),new TempData(new String("Sevilla"),117L,17),new TempData(new String("Mostoles"),117L,11),new TempData(new String("Puerto de Navacerrada"),117L,16),new TempData(new String("Soria"),117L,26),new TempData(new String("Madrid"),118L,17),new TempData(new String("Puerto de Navacerrada"),118L,22),new TempData(new String("Soria"),118L,25),new TempData(new String("Mulhacen"),119L,18),new TempData(new String("Madrid"),119L,11),new TempData(new String("Puerto de Navacerrada"),119L,13),new TempData(new String("Salamanca"),119L,15),new TempData(new String("Mulhacen"),120L,12),new TempData(new String("Sevilla"),120L,21),new TempData(new String("La Linea"),120L,11),new TempData(new String("Mostoles"),120L,16),new TempData(new String("Puerto de Navacerrada"),120L,23),new TempData(new String("Salamanca"),120L,20),new TempData(new String("Soria"),120L,14),new TempData(new String("Mulhacen"),121L,28),new TempData(new String("Sevilla"),121L,27),new TempData(new String("La Linea"),121L,10),new TempData(new String("Madrid"),121L,14),new TempData(new String("Mostoles"),121L,22),new TempData(new String("Salamanca"),121L,12),new TempData(new String("Soria"),121L,20),new TempData(new String("Ponferrada"),121L,12) },m).doCall().checkResult(new es.upm.aedlib.Pair<String,Integer>(new String("Mulhacen"),new Integer(30))) ;
}
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
    ResultsHandler.stopTest(new String("test_61")) ;
    ResultsHandler.add_result(new String("maxTemperatureInRegion"),resultIs) ;
    System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  


static class Tests {
  static String tester = "TesterInd5";
}





static class TempMapsUtils {
  public static void resetPrinter() {
  }

  public static String printer(Object obj) {
    if (obj instanceof Pair<?,?>) {
      Pair<?,?> p = (Pair<?,?>) obj;
      return "("+printer(p.getLeft())+","+printer(p.getRight())+")";
    } else return TestUtils.printer(obj, x -> printer(x));
  }


  static boolean correctMap
    (TestCall<Map<String,Integer>,NodePositionList<Pair<String,Integer>>> call,
     TestResult<Map<String,Integer>,NodePositionList<Pair<String,Integer>>> result,
     NodePositionList<Pair<String,Integer>> expected) {
    
    if (expected == null) {
      if (result.getValue() != null) {
          TestUtils.printError
            (TestUtils.ExecutionTime.UNRELATED,
             "\nthe call\n  "+call.toString()+
             "\n\nreturned a map\n  "+printer(result.getValue())+
             "\n\nbut should have returned null");
          return false;
      } else return true;
    }

      PositionList<Pair<String,Integer>> entries =
        new NodePositionList<Pair<String,Integer>>();
      for (Entry<String,Integer> entry : result.getValue().entries()) {
        entries.addLast
          (new Pair<String,Integer>(entry.getKey(),entry.getValue()));
      }

      if (!TestUtils.sameElements(entries,expected)) {
          TestUtils.printError
            (TestUtils.ExecutionTime.UNRELATED,
             "\nthe call\n  "+call.toString()+
             "\n\nreturned a map\n  "+printer(result.getValue())+
             "\n\nwith elements that do not match the expected elements\n  "+printer(expected));
          return false;
      }
      
      return true;
    }
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
	  TestData.message(msg+" -- the exception "+exc+" was raised although it "+
			     "should not have been\n");
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
         " returned a value which which contained the elements "+TestUtils.print(s1)+
         " which differs from the expected elements "+TestUtils.print(s2));
      return false;
    }
    return true;
  }

  // Checks that results, which are iterables, return the same
  // elements, regardless of the order.
  static <E extends Iterable<?>,F extends Iterable<?>>
    boolean sameElements(TestCall<E,F> call,
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
  static <E extends Iterable<?>,F extends Iterable<?>>
    boolean sameElements(TestCall<E,F> call,
                         E value,
                         F expected) {
    
    if (!sameElements(value,expected)) {
      printError
        (ExecutionTime.DURING,
         "the call "+call.toString()+
         " returned a value which which contained the elements "+TestUtils.print(value)+
         " which differs from the expected elements "+TestUtils.print(expected));
      return false;
    }
    return true;
  }

  // *********************************************
  // WARNING: this relies on a sane definition of
  // hashCode and equals which does not fail upon finding
  // null values...
  static <E extends Iterable<?>, F extends Iterable<?>>
    boolean sameElements(E value, F expected) {
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

  static <E,F> boolean unorderedIteratorCorrect
    (TestCall<java.util.Iterator<E>,F[]> call,
     TestResult<java.util.Iterator<E>,F[]> result,
     F[] expected) {
    java.util.Iterator<E> it = result.getValue();
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
           "the call "+call.toString()+
           " returned an iterator which returned the elements "+TestUtils.print(s1)+
           " which differs from the expected elements "+TestUtils.print(s2));
        return false;
      }
    }
   
    if (!correct) {
      printError
        (ExecutionTime.DURING,
         "the call "+call.toString()+
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
    if (isException())
      return getCall() + "  =>  " + getException();
    else
      return getCall() + "  =>  " + TesterCode.printer(getValue());      
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
    if (!(obj1.equals(obj2))) {
      TestUtils.printError
        (TestUtils.ExecutionTime.LAST,
         "\nthe call to "+this+
         "\nchanged an object parameter into\n  "+TestUtils.print(obj1)+
         "\nwhich used to be\n  "+TestUtils.print(obj2)+".\nIt should not have been changed.\n");
      return false;
    } else return true;
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


static class MaxTemperatures extends TestCall<es.upm.aedlib.map.Map<String,Integer>,es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>>
{
  long t1;
  long t2;
  TempData[] exp;
  TempData[] exp_orig;
  
  public MaxTemperatures (long t1,long t2,TempData[] exp)
  {
    this.t1 = t1 ;
    this.t2 = t2 ;
    this.exp = exp ;
    if (exp == null)
      exp_orig = null ;
    else
      exp_orig = exp.clone() ;
  }
  
  public String toString () 
  {
    StringBuilder output = new StringBuilder() ;
    output.append(new String("TempUtils.maxTemperatures")) ;
    output.append(new String("(")) ;
    output.append(TesterCode.printer(t1)) ;
    output.append(new String(", ")) ;
    output.append(TesterCode.printer(t2)) ;
    output.append(new String(", ")) ;
    output.append(TesterCode.printer(exp_orig)) ;
    output.append(new String(")")) ;
    return output.toString() ;
  }
  
  public es.upm.aedlib.map.Map<String,Integer> call () 
  {
    return TempUtils.maxTemperatures(t1,t2,exp) ;
  }
  
  public boolean checkResult (es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>> expected) 
  {
    if (!noException())
      return false ;
    if (!nonNull())
      return false ;
    if (!fresh(result.getValue(),exp))
      return false ;
    if (!unchanged_array(exp,exp_orig))
      return false ;
    if (!TempMapsUtils.correctMap(this,result,expected))
      return false ;
    return true ;
  }
  
}


static class MaxTemperatureInRegion extends TestCall<es.upm.aedlib.Pair<String,Integer>,es.upm.aedlib.Pair<String,Integer>>
{
  long arg1;
  long arg2;
  String arg3;
  TempData[] arg4;
  TempData[] arg4_orig;
  es.upm.aedlib.map.HashTableMap<String,String> arg5;
  
  public MaxTemperatureInRegion (long arg1,long arg2,String arg3,TempData[] arg4,es.upm.aedlib.map.HashTableMap<String,String> arg5)
  {
    this.arg1 = arg1 ;
    this.arg2 = arg2 ;
    this.arg3 = arg3 ;
    this.arg4 = arg4 ;
    if (arg4 == null)
      arg4_orig = null ;
    else
      arg4_orig = arg4.clone() ;
    this.arg5 = arg5 ;
  }
  
  public String toString () 
  {
    StringBuilder output = new StringBuilder() ;
    output.append(new String("TempUtils.maxTemperatureInRegion")) ;
    output.append(new String("(")) ;
    output.append(TesterCode.printer(arg1)) ;
    output.append(new String(", ")) ;
    output.append(TesterCode.printer(arg2)) ;
    output.append(new String(", ")) ;
    output.append(TesterCode.printer(arg3)) ;
    output.append(new String(", ")) ;
    output.append(TesterCode.printer(arg4_orig)) ;
    output.append(new String(", ")) ;
    output.append(TesterCode.printer(arg5)) ;
    output.append(new String(")")) ;
    return output.toString() ;
  }
  
  public es.upm.aedlib.Pair<String,Integer> call () 
  {
    return TempUtils.maxTemperatureInRegion(arg1,arg2,arg3,arg4,arg5) ;
  }
  
  public boolean checkResult (es.upm.aedlib.Pair<String,Integer> expected) 
  {
    if (!noException())
      return false ;
    if (!fresh(result.getValue(),arg4))
      return false ;
    if (!unchanged_array(arg4,arg4_orig))
      return false ;
    if (!valuesMatch(expected))
      return false ;
    return true ;
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
    trace.add("  "+callString);
  }

  public static void modifyLastCallInTrace(String callString) {
    if (trace.size() > 0) {
      trace.remove(trace.size()-1);
      trace.add("  "+callString);
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
      sb.append(arr.get(i)+"\n");
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
  static boolean results_ok() {
    if (results_sofar.size() == 0) {
      System.out.println("\n*** Error: no tests were run");
      return false;
    }

    if (runningTests.size() > 0) {
      System.out.println("\n*** Error: some tests ("+runningTests.size()+") are still running\n");
      return false;
    }

    int goodOnes = 0;
    for (String key : results_sofar.keySet()) {
      if (results_sofar.get(key)) {
	++goodOnes;
      } else if (key.equals("getPosition")) {
	return false;
      }
    }

    if (numTestsRemaining > 0) {
      System.out.println("\n*** Error: some tests ("+numTestsRemaining+") did not run\n");
      return false;
    }

    return goodOnes >= 1;
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

static class TesterCode
{
  
  public static void resetPrinter () 
  {
    TempMapsUtils.resetPrinter() ;
  }
  
  public static String printer (Object obj) 
  {
    return TempMapsUtils.printer(obj) ;
  }
  
}


}
