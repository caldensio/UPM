
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
// File generated at: 2019/10/24 -- 12:58:38
// Seed: {1571,914717,244373}
//
//////////////////////////////////////////////////////////////////////



package aed.recursiveUtils;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import java.util.concurrent.CountDownLatch;
import java.lang.reflect.*;
import es.upm.aedlib.Pair;
import es.upm.aedlib.Position;
import es.upm.aedlib.indexedlist.*;
import es.upm.aedlib.positionlist.*;
import es.upm.aedlib.positionlist.NodePositionList;
import es.upm.aedlib.positionlist.PositionList;
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
public class TesterLab3 {

  
    

  @BeforeAll
  public static void init () 
  {
    TestUtils.reportPid() ;
    ResultsHandler.init() ;
    ResultsHandler.setNumTestsRemaining(102,60) ;
    TestData.setTesterType(true) ;
  }
  
  @AfterAll
  public static void reportResults () 
  {
    ResultsHandler.report_results() ;
  }
  
  @Test
  public void test_001 () 
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
TestData.testName = new String("test_001") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_001")) ;
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
    ResultsHandler.stopTest(new String("test_001")) ;
    ResultsHandler.add_result(new String("getPosition"),resultIs) ;
    System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_002 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TestResult<es.upm.aedlib.positionlist.NodePositionList<Integer>,Void> v_0 = null ;
es.upm.aedlib.positionlist.NodePositionList<Integer> v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_002") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_002")) ;
if (ok_sofar)
{
  v_0 = new CreateList(new Integer[] { new Integer(224),new Integer(456),new Integer(944),new Integer(805),new Integer(148),new Integer(781),new Integer(798) }).doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
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
    ResultsHandler.stopTest(new String("test_002")) ;
    ResultsHandler.add_result(new String("getPosition"),resultIs) ;
    System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_003 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TestResult<es.upm.aedlib.positionlist.NodePositionList<Integer>,Void> v_0 = null ;
es.upm.aedlib.positionlist.NodePositionList<Integer> v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_003") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_003")) ;
if (ok_sofar)
{
  v_0 = new CreateList(new Integer[] { new Integer(424),new Integer(357),new Integer(104),new Integer(92),new Integer(545),new Integer(810),new Integer(49) }).doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
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
    ResultsHandler.stopTest(new String("test_003")) ;
    ResultsHandler.add_result(new String("getPosition"),resultIs) ;
    System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_004 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TestResult<es.upm.aedlib.positionlist.NodePositionList<Integer>,Void> v_0 = null ;
es.upm.aedlib.positionlist.NodePositionList<Integer> v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_004") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_004")) ;
if (ok_sofar)
{
  v_0 = new CreateList(new Integer[] { new Integer(737),new Integer(887),new Integer(95),new Integer(905),new Integer(185),new Integer(23) }).doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
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
    ResultsHandler.stopTest(new String("test_004")) ;
    ResultsHandler.add_result(new String("getPosition"),resultIs) ;
    System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_005 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TestResult<es.upm.aedlib.positionlist.NodePositionList<Integer>,Void> v_0 = null ;
es.upm.aedlib.positionlist.NodePositionList<Integer> v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_005") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_005")) ;
if (ok_sofar)
{
  v_0 = new CreateList(new Integer[] { new Integer(748),new Integer(138),new Integer(395),new Integer(210) }).doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
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
    ResultsHandler.stopTest(new String("test_005")) ;
    ResultsHandler.add_result(new String("getPosition"),resultIs) ;
    System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_006 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TestResult<es.upm.aedlib.positionlist.NodePositionList<Integer>,Void> v_0 = null ;
es.upm.aedlib.positionlist.NodePositionList<Integer> v_1 = null ;
TestResult<es.upm.aedlib.Position<Integer>,Void> v_2 = null ;
es.upm.aedlib.Position<Integer> v_3 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_006") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_006")) ;
if (ok_sofar)
{
  v_0 = new CreateList(new Integer[] { new Integer(18),new Integer(801),new Integer(543) }).doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  v_2 = new FindPos(v_1,1).doCall() ;
if (ok_sofar)
  v_3 = v_2.getValue() ;
if (ok_sofar)
  ok_sofar = new GetPosition(v_1,v_3,-1).doCall().checkResult(new es.upm.aedlib.Pair<es.upm.aedlib.positionlist.NodePositionList<Integer>,Integer>(v_1,new Integer(0))) ;
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
    ResultsHandler.stopTest(new String("test_006")) ;
    ResultsHandler.add_result(new String("getPosition"),resultIs) ;
    System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_007 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TestResult<es.upm.aedlib.positionlist.NodePositionList<Integer>,Void> v_0 = null ;
es.upm.aedlib.positionlist.NodePositionList<Integer> v_1 = null ;
TestResult<es.upm.aedlib.Position<Integer>,Void> v_2 = null ;
es.upm.aedlib.Position<Integer> v_3 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_007") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_007")) ;
if (ok_sofar)
{
  v_0 = new CreateList(new Integer[] { new Integer(24),new Integer(247),new Integer(92),new Integer(796),new Integer(266),new Integer(876) }).doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  v_2 = new FindPos(v_1,3).doCall() ;
if (ok_sofar)
  v_3 = v_2.getValue() ;
if (ok_sofar)
  ok_sofar = new GetPosition(v_1,v_3,0).doCall().checkResult(new es.upm.aedlib.Pair<es.upm.aedlib.positionlist.NodePositionList<Integer>,Integer>(v_1,new Integer(3))) ;
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
    ResultsHandler.stopTest(new String("test_007")) ;
    ResultsHandler.add_result(new String("getPosition"),resultIs) ;
    System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_008 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TestResult<es.upm.aedlib.positionlist.NodePositionList<Integer>,Void> v_0 = null ;
es.upm.aedlib.positionlist.NodePositionList<Integer> v_1 = null ;
TestResult<es.upm.aedlib.Position<Integer>,Void> v_2 = null ;
es.upm.aedlib.Position<Integer> v_3 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_008") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_008")) ;
if (ok_sofar)
{
  v_0 = new CreateList(new Integer[] { new Integer(32),new Integer(375),new Integer(855) }).doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  v_2 = new FindPos(v_1,1).doCall() ;
if (ok_sofar)
  v_3 = v_2.getValue() ;
if (ok_sofar)
  ok_sofar = new GetPosition(v_1,v_3,0).doCall().checkResult(new es.upm.aedlib.Pair<es.upm.aedlib.positionlist.NodePositionList<Integer>,Integer>(v_1,new Integer(1))) ;
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
    ResultsHandler.stopTest(new String("test_008")) ;
    ResultsHandler.add_result(new String("getPosition"),resultIs) ;
    System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_009 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TestResult<es.upm.aedlib.positionlist.NodePositionList<Integer>,Void> v_0 = null ;
es.upm.aedlib.positionlist.NodePositionList<Integer> v_1 = null ;
TestResult<es.upm.aedlib.Position<Integer>,Void> v_2 = null ;
es.upm.aedlib.Position<Integer> v_3 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_009") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_009")) ;
if (ok_sofar)
{
  v_0 = new CreateList(new Integer[] { new Integer(66),new Integer(89),new Integer(179),new Integer(306),new Integer(806),new Integer(807),new Integer(5),new Integer(863) }).doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  v_2 = new FindPos(v_1,4).doCall() ;
if (ok_sofar)
  v_3 = v_2.getValue() ;
if (ok_sofar)
  ok_sofar = new GetPosition(v_1,v_3,-3).doCall().checkResult(new es.upm.aedlib.Pair<es.upm.aedlib.positionlist.NodePositionList<Integer>,Integer>(v_1,new Integer(1))) ;
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
    ResultsHandler.stopTest(new String("test_009")) ;
    ResultsHandler.add_result(new String("getPosition"),resultIs) ;
    System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_010 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TestResult<es.upm.aedlib.positionlist.NodePositionList<Integer>,Void> v_0 = null ;
es.upm.aedlib.positionlist.NodePositionList<Integer> v_1 = null ;
TestResult<es.upm.aedlib.Position<Integer>,Void> v_2 = null ;
es.upm.aedlib.Position<Integer> v_3 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_010") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_010")) ;
if (ok_sofar)
{
  v_0 = new CreateList(new Integer[] { new Integer(100),new Integer(973),new Integer(177),new Integer(719),new Integer(416),new Integer(991),new Integer(465),new Integer(0),new Integer(602) }).doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  v_2 = new FindPos(v_1,4).doCall() ;
if (ok_sofar)
  v_3 = v_2.getValue() ;
if (ok_sofar)
  ok_sofar = new GetPosition(v_1,v_3,3).doCall().checkResult(new es.upm.aedlib.Pair<es.upm.aedlib.positionlist.NodePositionList<Integer>,Integer>(v_1,new Integer(7))) ;
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
    ResultsHandler.stopTest(new String("test_010")) ;
    ResultsHandler.add_result(new String("getPosition"),resultIs) ;
    System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_011 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TestResult<es.upm.aedlib.positionlist.NodePositionList<Integer>,Void> v_0 = null ;
es.upm.aedlib.positionlist.NodePositionList<Integer> v_1 = null ;
TestResult<es.upm.aedlib.Position<Integer>,Void> v_2 = null ;
es.upm.aedlib.Position<Integer> v_3 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_011") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_011")) ;
if (ok_sofar)
{
  v_0 = new CreateList(new Integer[] { new Integer(133),new Integer(542),new Integer(379),new Integer(681),new Integer(926),new Integer(169),new Integer(978),new Integer(513),new Integer(222),new Integer(558) }).doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  v_2 = new FindPos(v_1,5).doCall() ;
if (ok_sofar)
  v_3 = v_2.getValue() ;
if (ok_sofar)
  ok_sofar = new GetPosition(v_1,v_3,1).doCall().checkResult(new es.upm.aedlib.Pair<es.upm.aedlib.positionlist.NodePositionList<Integer>,Integer>(v_1,new Integer(6))) ;
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
    ResultsHandler.stopTest(new String("test_011")) ;
    ResultsHandler.add_result(new String("getPosition"),resultIs) ;
    System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_012 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TestResult<es.upm.aedlib.positionlist.NodePositionList<Integer>,Void> v_0 = null ;
es.upm.aedlib.positionlist.NodePositionList<Integer> v_1 = null ;
TestResult<es.upm.aedlib.Position<Integer>,Void> v_2 = null ;
es.upm.aedlib.Position<Integer> v_3 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_012") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_012")) ;
if (ok_sofar)
{
  v_0 = new CreateList(new Integer[] { new Integer(161),new Integer(174),new Integer(153),new Integer(98),new Integer(603),new Integer(585) }).doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  v_2 = new FindPos(v_1,3).doCall() ;
if (ok_sofar)
  v_3 = v_2.getValue() ;
if (ok_sofar)
  ok_sofar = new GetPosition(v_1,v_3,1).doCall().checkResult(new es.upm.aedlib.Pair<es.upm.aedlib.positionlist.NodePositionList<Integer>,Integer>(v_1,new Integer(4))) ;
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
    ResultsHandler.stopTest(new String("test_012")) ;
    ResultsHandler.add_result(new String("getPosition"),resultIs) ;
    System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_013 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TestResult<es.upm.aedlib.positionlist.NodePositionList<Integer>,Void> v_0 = null ;
es.upm.aedlib.positionlist.NodePositionList<Integer> v_1 = null ;
TestResult<es.upm.aedlib.Position<Integer>,Void> v_2 = null ;
es.upm.aedlib.Position<Integer> v_3 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_013") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_013")) ;
if (ok_sofar)
{
  v_0 = new CreateList(new Integer[] { new Integer(163),new Integer(928),new Integer(969),new Integer(460),new Integer(643) }).doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  v_2 = new FindPos(v_1,2).doCall() ;
if (ok_sofar)
  v_3 = v_2.getValue() ;
if (ok_sofar)
  ok_sofar = new GetPosition(v_1,v_3,0).doCall().checkResult(new es.upm.aedlib.Pair<es.upm.aedlib.positionlist.NodePositionList<Integer>,Integer>(v_1,new Integer(2))) ;
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
    ResultsHandler.stopTest(new String("test_013")) ;
    ResultsHandler.add_result(new String("getPosition"),resultIs) ;
    System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_014 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TestResult<es.upm.aedlib.positionlist.NodePositionList<Integer>,Void> v_0 = null ;
es.upm.aedlib.positionlist.NodePositionList<Integer> v_1 = null ;
TestResult<es.upm.aedlib.Position<Integer>,Void> v_2 = null ;
es.upm.aedlib.Position<Integer> v_3 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_014") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_014")) ;
if (ok_sofar)
{
  v_0 = new CreateList(new Integer[] { new Integer(216),new Integer(291),new Integer(363),new Integer(734),new Integer(617) }).doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  v_2 = new FindPos(v_1,2).doCall() ;
if (ok_sofar)
  v_3 = v_2.getValue() ;
if (ok_sofar)
  ok_sofar = new GetPosition(v_1,v_3,-1).doCall().checkResult(new es.upm.aedlib.Pair<es.upm.aedlib.positionlist.NodePositionList<Integer>,Integer>(v_1,new Integer(1))) ;
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
    ResultsHandler.stopTest(new String("test_014")) ;
    ResultsHandler.add_result(new String("getPosition"),resultIs) ;
    System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_015 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TestResult<es.upm.aedlib.positionlist.NodePositionList<Integer>,Void> v_0 = null ;
es.upm.aedlib.positionlist.NodePositionList<Integer> v_1 = null ;
TestResult<es.upm.aedlib.Position<Integer>,Void> v_2 = null ;
es.upm.aedlib.Position<Integer> v_3 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_015") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_015")) ;
if (ok_sofar)
{
  v_0 = new CreateList(new Integer[] { new Integer(275),new Integer(879),new Integer(348),new Integer(702),new Integer(394) }).doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  v_2 = new FindPos(v_1,2).doCall() ;
if (ok_sofar)
  v_3 = v_2.getValue() ;
if (ok_sofar)
  ok_sofar = new GetPosition(v_1,v_3,-1).doCall().checkResult(new es.upm.aedlib.Pair<es.upm.aedlib.positionlist.NodePositionList<Integer>,Integer>(v_1,new Integer(1))) ;
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
    ResultsHandler.stopTest(new String("test_015")) ;
    ResultsHandler.add_result(new String("getPosition"),resultIs) ;
    System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_016 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TestResult<es.upm.aedlib.positionlist.NodePositionList<Integer>,Void> v_0 = null ;
es.upm.aedlib.positionlist.NodePositionList<Integer> v_1 = null ;
TestResult<es.upm.aedlib.Position<Integer>,Void> v_2 = null ;
es.upm.aedlib.Position<Integer> v_3 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_016") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_016")) ;
if (ok_sofar)
{
  v_0 = new CreateList(new Integer[] { new Integer(411),new Integer(848),new Integer(514) }).doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  v_2 = new FindPos(v_1,1).doCall() ;
if (ok_sofar)
  v_3 = v_2.getValue() ;
if (ok_sofar)
  ok_sofar = new GetPosition(v_1,v_3,0).doCall().checkResult(new es.upm.aedlib.Pair<es.upm.aedlib.positionlist.NodePositionList<Integer>,Integer>(v_1,new Integer(1))) ;
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
    ResultsHandler.stopTest(new String("test_016")) ;
    ResultsHandler.add_result(new String("getPosition"),resultIs) ;
    System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_017 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TestResult<es.upm.aedlib.positionlist.NodePositionList<Integer>,Void> v_0 = null ;
es.upm.aedlib.positionlist.NodePositionList<Integer> v_1 = null ;
TestResult<es.upm.aedlib.Position<Integer>,Void> v_2 = null ;
es.upm.aedlib.Position<Integer> v_3 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_017") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_017")) ;
if (ok_sofar)
{
  v_0 = new CreateList(new Integer[] { new Integer(452),new Integer(301),new Integer(782),new Integer(800),new Integer(586),new Integer(783) }).doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  v_2 = new FindPos(v_1,3).doCall() ;
if (ok_sofar)
  v_3 = v_2.getValue() ;
if (ok_sofar)
  ok_sofar = new GetPosition(v_1,v_3,1).doCall().checkResult(new es.upm.aedlib.Pair<es.upm.aedlib.positionlist.NodePositionList<Integer>,Integer>(v_1,new Integer(4))) ;
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
    ResultsHandler.stopTest(new String("test_017")) ;
    ResultsHandler.add_result(new String("getPosition"),resultIs) ;
    System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_018 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TestResult<es.upm.aedlib.positionlist.NodePositionList<Integer>,Void> v_0 = null ;
es.upm.aedlib.positionlist.NodePositionList<Integer> v_1 = null ;
TestResult<es.upm.aedlib.Position<Integer>,Void> v_2 = null ;
es.upm.aedlib.Position<Integer> v_3 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_018") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_018")) ;
if (ok_sofar)
{
  v_0 = new CreateList(new Integer[] { new Integer(453),new Integer(572),new Integer(749),new Integer(446) }).doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  v_2 = new FindPos(v_1,2).doCall() ;
if (ok_sofar)
  v_3 = v_2.getValue() ;
if (ok_sofar)
  ok_sofar = new GetPosition(v_1,v_3,0).doCall().checkResult(new es.upm.aedlib.Pair<es.upm.aedlib.positionlist.NodePositionList<Integer>,Integer>(v_1,new Integer(2))) ;
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
    ResultsHandler.stopTest(new String("test_018")) ;
    ResultsHandler.add_result(new String("getPosition"),resultIs) ;
    System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_019 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TestResult<es.upm.aedlib.positionlist.NodePositionList<Integer>,Void> v_0 = null ;
es.upm.aedlib.positionlist.NodePositionList<Integer> v_1 = null ;
TestResult<es.upm.aedlib.Position<Integer>,Void> v_2 = null ;
es.upm.aedlib.Position<Integer> v_3 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_019") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_019")) ;
if (ok_sofar)
{
  v_0 = new CreateList(new Integer[] { new Integer(512),new Integer(966),new Integer(251),new Integer(39),new Integer(755),new Integer(636) }).doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  v_2 = new FindPos(v_1,3).doCall() ;
if (ok_sofar)
  v_3 = v_2.getValue() ;
if (ok_sofar)
  ok_sofar = new GetPosition(v_1,v_3,0).doCall().checkResult(new es.upm.aedlib.Pair<es.upm.aedlib.positionlist.NodePositionList<Integer>,Integer>(v_1,new Integer(3))) ;
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
    ResultsHandler.stopTest(new String("test_019")) ;
    ResultsHandler.add_result(new String("getPosition"),resultIs) ;
    System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_020 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TestResult<es.upm.aedlib.positionlist.NodePositionList<Integer>,Void> v_0 = null ;
es.upm.aedlib.positionlist.NodePositionList<Integer> v_1 = null ;
TestResult<es.upm.aedlib.Position<Integer>,Void> v_2 = null ;
es.upm.aedlib.Position<Integer> v_3 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_020") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_020")) ;
if (ok_sofar)
{
  v_0 = new CreateList(new Integer[] { new Integer(559),new Integer(813),new Integer(554),new Integer(812),new Integer(514),new Integer(378),new Integer(769) }).doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  v_2 = new FindPos(v_1,3).doCall() ;
if (ok_sofar)
  v_3 = v_2.getValue() ;
if (ok_sofar)
  ok_sofar = new GetPosition(v_1,v_3,0).doCall().checkResult(new es.upm.aedlib.Pair<es.upm.aedlib.positionlist.NodePositionList<Integer>,Integer>(v_1,new Integer(3))) ;
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
    ResultsHandler.stopTest(new String("test_020")) ;
    ResultsHandler.add_result(new String("getPosition"),resultIs) ;
    System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_021 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TestResult<es.upm.aedlib.positionlist.NodePositionList<Integer>,Void> v_0 = null ;
es.upm.aedlib.positionlist.NodePositionList<Integer> v_1 = null ;
TestResult<es.upm.aedlib.Position<Integer>,Void> v_2 = null ;
es.upm.aedlib.Position<Integer> v_3 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_021") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_021")) ;
if (ok_sofar)
{
  v_0 = new CreateList(new Integer[] { new Integer(578),new Integer(929),new Integer(701),new Integer(337),new Integer(881) }).doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  v_2 = new FindPos(v_1,2).doCall() ;
if (ok_sofar)
  v_3 = v_2.getValue() ;
if (ok_sofar)
  ok_sofar = new GetPosition(v_1,v_3,0).doCall().checkResult(new es.upm.aedlib.Pair<es.upm.aedlib.positionlist.NodePositionList<Integer>,Integer>(v_1,new Integer(2))) ;
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
    ResultsHandler.stopTest(new String("test_021")) ;
    ResultsHandler.add_result(new String("getPosition"),resultIs) ;
    System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_022 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TestResult<es.upm.aedlib.positionlist.NodePositionList<Integer>,Void> v_0 = null ;
es.upm.aedlib.positionlist.NodePositionList<Integer> v_1 = null ;
TestResult<es.upm.aedlib.Position<Integer>,Void> v_2 = null ;
es.upm.aedlib.Position<Integer> v_3 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_022") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_022")) ;
if (ok_sofar)
{
  v_0 = new CreateList(new Integer[] { new Integer(588),new Integer(634),new Integer(219),new Integer(338),new Integer(40),new Integer(246),new Integer(203) }).doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  v_2 = new FindPos(v_1,3).doCall() ;
if (ok_sofar)
  v_3 = v_2.getValue() ;
if (ok_sofar)
  ok_sofar = new GetPosition(v_1,v_3,1).doCall().checkResult(new es.upm.aedlib.Pair<es.upm.aedlib.positionlist.NodePositionList<Integer>,Integer>(v_1,new Integer(4))) ;
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
    ResultsHandler.stopTest(new String("test_022")) ;
    ResultsHandler.add_result(new String("getPosition"),resultIs) ;
    System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_023 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TestResult<es.upm.aedlib.positionlist.NodePositionList<Integer>,Void> v_0 = null ;
es.upm.aedlib.positionlist.NodePositionList<Integer> v_1 = null ;
TestResult<es.upm.aedlib.Position<Integer>,Void> v_2 = null ;
es.upm.aedlib.Position<Integer> v_3 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_023") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_023")) ;
if (ok_sofar)
{
  v_0 = new CreateList(new Integer[] { new Integer(616),new Integer(131),new Integer(458),new Integer(367),new Integer(598),new Integer(569),new Integer(471),new Integer(393),new Integer(17) }).doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  v_2 = new FindPos(v_1,4).doCall() ;
if (ok_sofar)
  v_3 = v_2.getValue() ;
if (ok_sofar)
  ok_sofar = new GetPosition(v_1,v_3,0).doCall().checkResult(new es.upm.aedlib.Pair<es.upm.aedlib.positionlist.NodePositionList<Integer>,Integer>(v_1,new Integer(4))) ;
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
    ResultsHandler.stopTest(new String("test_023")) ;
    ResultsHandler.add_result(new String("getPosition"),resultIs) ;
    System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_024 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TestResult<es.upm.aedlib.positionlist.NodePositionList<Integer>,Void> v_0 = null ;
es.upm.aedlib.positionlist.NodePositionList<Integer> v_1 = null ;
TestResult<es.upm.aedlib.Position<Integer>,Void> v_2 = null ;
es.upm.aedlib.Position<Integer> v_3 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_024") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_024")) ;
if (ok_sofar)
{
  v_0 = new CreateList(new Integer[] { new Integer(647),new Integer(923),new Integer(383),new Integer(278),new Integer(371),new Integer(777),new Integer(881),new Integer(28),new Integer(147),new Integer(855) }).doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  v_2 = new FindPos(v_1,5).doCall() ;
if (ok_sofar)
  v_3 = v_2.getValue() ;
if (ok_sofar)
  ok_sofar = new GetPosition(v_1,v_3,3).doCall().checkResult(new es.upm.aedlib.Pair<es.upm.aedlib.positionlist.NodePositionList<Integer>,Integer>(v_1,new Integer(8))) ;
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
    ResultsHandler.stopTest(new String("test_024")) ;
    ResultsHandler.add_result(new String("getPosition"),resultIs) ;
    System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_025 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TestResult<es.upm.aedlib.positionlist.NodePositionList<Integer>,Void> v_0 = null ;
es.upm.aedlib.positionlist.NodePositionList<Integer> v_1 = null ;
TestResult<es.upm.aedlib.Position<Integer>,Void> v_2 = null ;
es.upm.aedlib.Position<Integer> v_3 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_025") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_025")) ;
if (ok_sofar)
{
  v_0 = new CreateList(new Integer[] { new Integer(655),new Integer(250),new Integer(955),new Integer(220),new Integer(757),new Integer(412),new Integer(205) }).doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  v_2 = new FindPos(v_1,3).doCall() ;
if (ok_sofar)
  v_3 = v_2.getValue() ;
if (ok_sofar)
  ok_sofar = new GetPosition(v_1,v_3,0).doCall().checkResult(new es.upm.aedlib.Pair<es.upm.aedlib.positionlist.NodePositionList<Integer>,Integer>(v_1,new Integer(3))) ;
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
    ResultsHandler.stopTest(new String("test_025")) ;
    ResultsHandler.add_result(new String("getPosition"),resultIs) ;
    System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_026 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TestResult<es.upm.aedlib.positionlist.NodePositionList<Integer>,Void> v_0 = null ;
es.upm.aedlib.positionlist.NodePositionList<Integer> v_1 = null ;
TestResult<es.upm.aedlib.Position<Integer>,Void> v_2 = null ;
es.upm.aedlib.Position<Integer> v_3 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_026") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_026")) ;
if (ok_sofar)
{
  v_0 = new CreateList(new Integer[] { new Integer(662),new Integer(708),new Integer(936),new Integer(953),new Integer(249),new Integer(440),new Integer(715),new Integer(764),new Integer(132),new Integer(229) }).doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  v_2 = new FindPos(v_1,5).doCall() ;
if (ok_sofar)
  v_3 = v_2.getValue() ;
if (ok_sofar)
  ok_sofar = new GetPosition(v_1,v_3,-5).doCall().checkResult(new es.upm.aedlib.Pair<es.upm.aedlib.positionlist.NodePositionList<Integer>,Integer>(v_1,new Integer(0))) ;
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
    ResultsHandler.stopTest(new String("test_026")) ;
    ResultsHandler.add_result(new String("getPosition"),resultIs) ;
    System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_027 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TestResult<es.upm.aedlib.positionlist.NodePositionList<Integer>,Void> v_0 = null ;
es.upm.aedlib.positionlist.NodePositionList<Integer> v_1 = null ;
TestResult<es.upm.aedlib.Position<Integer>,Void> v_2 = null ;
es.upm.aedlib.Position<Integer> v_3 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_027") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_027")) ;
if (ok_sofar)
{
  v_0 = new CreateList(new Integer[] { new Integer(719),new Integer(234),new Integer(393),new Integer(828),new Integer(984) }).doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  v_2 = new FindPos(v_1,2).doCall() ;
if (ok_sofar)
  v_3 = v_2.getValue() ;
if (ok_sofar)
  ok_sofar = new GetPosition(v_1,v_3,0).doCall().checkResult(new es.upm.aedlib.Pair<es.upm.aedlib.positionlist.NodePositionList<Integer>,Integer>(v_1,new Integer(2))) ;
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
    ResultsHandler.stopTest(new String("test_027")) ;
    ResultsHandler.add_result(new String("getPosition"),resultIs) ;
    System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_028 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TestResult<es.upm.aedlib.positionlist.NodePositionList<Integer>,Void> v_0 = null ;
es.upm.aedlib.positionlist.NodePositionList<Integer> v_1 = null ;
TestResult<es.upm.aedlib.Position<Integer>,Void> v_2 = null ;
es.upm.aedlib.Position<Integer> v_3 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_028") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_028")) ;
if (ok_sofar)
{
  v_0 = new CreateList(new Integer[] { new Integer(780),new Integer(599),new Integer(337),new Integer(541),new Integer(810),new Integer(615),new Integer(455),new Integer(934),new Integer(875) }).doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  v_2 = new FindPos(v_1,4).doCall() ;
if (ok_sofar)
  v_3 = v_2.getValue() ;
if (ok_sofar)
  ok_sofar = new GetPosition(v_1,v_3,3).doCall().checkResult(new es.upm.aedlib.Pair<es.upm.aedlib.positionlist.NodePositionList<Integer>,Integer>(v_1,new Integer(7))) ;
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
    ResultsHandler.stopTest(new String("test_028")) ;
    ResultsHandler.add_result(new String("getPosition"),resultIs) ;
    System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_029 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TestResult<es.upm.aedlib.positionlist.NodePositionList<Integer>,Void> v_0 = null ;
es.upm.aedlib.positionlist.NodePositionList<Integer> v_1 = null ;
TestResult<es.upm.aedlib.Position<Integer>,Void> v_2 = null ;
es.upm.aedlib.Position<Integer> v_3 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_029") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_029")) ;
if (ok_sofar)
{
  v_0 = new CreateList(new Integer[] { new Integer(822),new Integer(197),new Integer(28),new Integer(736),new Integer(661),new Integer(517),new Integer(491) }).doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  v_2 = new FindPos(v_1,3).doCall() ;
if (ok_sofar)
  v_3 = v_2.getValue() ;
if (ok_sofar)
  ok_sofar = new GetPosition(v_1,v_3,1).doCall().checkResult(new es.upm.aedlib.Pair<es.upm.aedlib.positionlist.NodePositionList<Integer>,Integer>(v_1,new Integer(4))) ;
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
    ResultsHandler.stopTest(new String("test_029")) ;
    ResultsHandler.add_result(new String("getPosition"),resultIs) ;
    System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_030 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TestResult<es.upm.aedlib.positionlist.NodePositionList<Integer>,Void> v_0 = null ;
es.upm.aedlib.positionlist.NodePositionList<Integer> v_1 = null ;
TestResult<es.upm.aedlib.Position<Integer>,Void> v_2 = null ;
es.upm.aedlib.Position<Integer> v_3 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_030") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_030")) ;
if (ok_sofar)
{
  v_0 = new CreateList(new Integer[] { new Integer(847),new Integer(56),new Integer(569),new Integer(736),new Integer(105),new Integer(568),new Integer(919),new Integer(956),new Integer(836) }).doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  v_2 = new FindPos(v_1,4).doCall() ;
if (ok_sofar)
  v_3 = v_2.getValue() ;
if (ok_sofar)
  ok_sofar = new GetPosition(v_1,v_3,0).doCall().checkResult(new es.upm.aedlib.Pair<es.upm.aedlib.positionlist.NodePositionList<Integer>,Integer>(v_1,new Integer(4))) ;
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
    ResultsHandler.stopTest(new String("test_030")) ;
    ResultsHandler.add_result(new String("getPosition"),resultIs) ;
    System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_031 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TestResult<es.upm.aedlib.positionlist.NodePositionList<Integer>,Void> v_0 = null ;
es.upm.aedlib.positionlist.NodePositionList<Integer> v_1 = null ;
TestResult<es.upm.aedlib.Position<Integer>,Void> v_2 = null ;
es.upm.aedlib.Position<Integer> v_3 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_031") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_031")) ;
if (ok_sofar)
{
  v_0 = new CreateList(new Integer[] { new Integer(975),new Integer(547),new Integer(21),new Integer(482),new Integer(32),new Integer(486),new Integer(249),new Integer(62),new Integer(519),new Integer(174) }).doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  v_2 = new FindPos(v_1,5).doCall() ;
if (ok_sofar)
  v_3 = v_2.getValue() ;
if (ok_sofar)
  ok_sofar = new GetPosition(v_1,v_3,-1).doCall().checkResult(new es.upm.aedlib.Pair<es.upm.aedlib.positionlist.NodePositionList<Integer>,Integer>(v_1,new Integer(4))) ;
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
    ResultsHandler.stopTest(new String("test_031")) ;
    ResultsHandler.add_result(new String("getPosition"),resultIs) ;
    System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_032 () 
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
TestData.testName = new String("test_032") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_032")) ;
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
    ResultsHandler.stopTest(new String("test_032")) ;
    ResultsHandler.add_result(new String("decrypt"),resultIs) ;
    System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_033 () 
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
TestData.testName = new String("test_033") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_033")) ;
if (ok_sofar)
  ok_sofar = new Decrypt(new es.upm.aedlib.positionlist.NodePositionList<Character>(new Character[] { 32,111,114,97,99,119,101,120,113,122,118,100,104,102,109,107,117,116,110,121,112,105,98,106,115,103,108 }),new es.upm.aedlib.positionlist.NodePositionList<Integer>(new Integer[] { new Integer(3),new Integer(18),new Integer(-10),new Integer(-8) })).doCall().checkResult(new es.upm.aedlib.positionlist.NodePositionList<Character>(new Character[] { 97,105,100,97 })) ;
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
    ResultsHandler.stopTest(new String("test_033")) ;
    ResultsHandler.add_result(new String("decrypt"),resultIs) ;
    System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_034 () 
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
TestData.testName = new String("test_034") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_034")) ;
if (ok_sofar)
  ok_sofar = new Decrypt(new es.upm.aedlib.positionlist.NodePositionList<Character>(new Character[] { 101,97,108,111,110,114,115,118,121,105,98,104,99,112,116,122,113,120,100,107,117,103,102,109,106,32,119 }),new es.upm.aedlib.positionlist.NodePositionList<Integer>(new Integer[] { new Integer(1),new Integer(8),new Integer(9),new Integer(-17) })).doCall().checkResult(new es.upm.aedlib.positionlist.NodePositionList<Character>(new Character[] { 97,105,100,97 })) ;
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
    ResultsHandler.stopTest(new String("test_034")) ;
    ResultsHandler.add_result(new String("decrypt"),resultIs) ;
    System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_035 () 
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
TestData.testName = new String("test_035") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_035")) ;
if (ok_sofar)
  ok_sofar = new Decrypt(new es.upm.aedlib.positionlist.NodePositionList<Character>(new Character[] { 114,103,108,105,120,32,116,97,107,119,112,110,121,99,122,117,115,102,111,113,104,98,118,109,106,101,100 }),new es.upm.aedlib.positionlist.NodePositionList<Integer>(new Integer[] { new Integer(7),new Integer(-4),new Integer(23),new Integer(-19) })).doCall().checkResult(new es.upm.aedlib.positionlist.NodePositionList<Character>(new Character[] { 97,105,100,97 })) ;
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
    ResultsHandler.stopTest(new String("test_035")) ;
    ResultsHandler.add_result(new String("decrypt"),resultIs) ;
    System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_036 () 
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
TestData.testName = new String("test_036") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_036")) ;
if (ok_sofar)
  ok_sofar = new Decrypt(new es.upm.aedlib.positionlist.NodePositionList<Character>(new Character[] { 104,99,115,105,103,121,118,116,120,111,112,114,113,97,110,108,117,32,106,122,107,109,100,119,98,101,102 }),new es.upm.aedlib.positionlist.NodePositionList<Integer>(new Integer[] { new Integer(13),new Integer(-1),new Integer(4),new Integer(-13),new Integer(14),new Integer(-17),new Integer(13),new Integer(-8),new Integer(12),new Integer(-1),new Integer(-2),new Integer(3),new Integer(-15),new Integer(23),new Integer(-24),new Integer(10),new Integer(14),new Integer(-18),new Integer(2) })).doCall().checkResult(new es.upm.aedlib.positionlist.NodePositionList<Character>(new Character[] { 97,113,117,105,32,104,97,121,32,117,110,32,115,101,99,114,101,116,111 })) ;
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
    ResultsHandler.stopTest(new String("test_036")) ;
    ResultsHandler.add_result(new String("decrypt"),resultIs) ;
    System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_037 () 
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
TestData.testName = new String("test_037") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_037")) ;
if (ok_sofar)
  ok_sofar = new Decrypt(new es.upm.aedlib.positionlist.NodePositionList<Character>(new Character[] { 115,107,109,101,113,121,97,103,111,100,117,118,119,110,112,122,105,102,108,114,104,120,106,32,99,116,98 }),new es.upm.aedlib.positionlist.NodePositionList<Integer>(new Integer[] { new Integer(6),new Integer(-2),new Integer(6),new Integer(6),new Integer(7),new Integer(-3),new Integer(-14),new Integer(-1),new Integer(18),new Integer(-13),new Integer(3),new Integer(10),new Integer(-23),new Integer(3),new Integer(21),new Integer(-5),new Integer(-16),new Integer(22),new Integer(-17) })).doCall().checkResult(new es.upm.aedlib.positionlist.NodePositionList<Character>(new Character[] { 97,113,117,105,32,104,97,121,32,117,110,32,115,101,99,114,101,116,111 })) ;
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
    ResultsHandler.stopTest(new String("test_037")) ;
    ResultsHandler.add_result(new String("decrypt"),resultIs) ;
    System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_038 () 
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
TestData.testName = new String("test_038") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_038")) ;
if (ok_sofar)
  ok_sofar = new Decrypt(new es.upm.aedlib.positionlist.NodePositionList<Character>(new Character[] { 116,101,115,97,105,98,100,104,121,118,107,110,102,119,117,111,113,108,122,112,103,99,114,32,120,106,109 }),new es.upm.aedlib.positionlist.NodePositionList<Integer>(new Integer[] { new Integer(3),new Integer(13),new Integer(-2),new Integer(-10),new Integer(19),new Integer(-16),new Integer(-4),new Integer(5),new Integer(15),new Integer(-9),new Integer(-3),new Integer(12),new Integer(-21),new Integer(-1),new Integer(20),new Integer(1),new Integer(-21),new Integer(-1),new Integer(15) })).doCall().checkResult(new es.upm.aedlib.positionlist.NodePositionList<Character>(new Character[] { 97,113,117,105,32,104,97,121,32,117,110,32,115,101,99,114,101,116,111 })) ;
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
    ResultsHandler.stopTest(new String("test_038")) ;
    ResultsHandler.add_result(new String("decrypt"),resultIs) ;
    System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_039 () 
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
TestData.testName = new String("test_039") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_039")) ;
if (ok_sofar)
  ok_sofar = new Decrypt(new es.upm.aedlib.positionlist.NodePositionList<Character>(new Character[] { 111,106,121,120,104,102,118,108,115,100,32,97,98,112,99,101,114,117,107,119,105,110,113,109,116,103,122 }),new es.upm.aedlib.positionlist.NodePositionList<Integer>(new Integer[] { new Integer(12),new Integer(5),new Integer(-2),new Integer(6),new Integer(-10),new Integer(-1),new Integer(-2),new Integer(9),new Integer(-2),new Integer(1),new Integer(8),new Integer(-9) })).doCall().checkResult(new es.upm.aedlib.positionlist.NodePositionList<Character>(new Character[] { 98,117,101,110,97,32,115,117,101,114,116,101 })) ;
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
    ResultsHandler.stopTest(new String("test_039")) ;
    ResultsHandler.add_result(new String("decrypt"),resultIs) ;
    System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_040 () 
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
TestData.testName = new String("test_040") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_040")) ;
if (ok_sofar)
  ok_sofar = new Decrypt(new es.upm.aedlib.positionlist.NodePositionList<Character>(new Character[] { 121,109,101,112,119,98,117,122,103,113,114,102,120,99,107,111,97,110,108,116,100,104,118,32,105,106,115 }),new es.upm.aedlib.positionlist.NodePositionList<Integer>(new Integer[] { new Integer(5),new Integer(1),new Integer(-4),new Integer(15),new Integer(-1),new Integer(7),new Integer(3),new Integer(-20),new Integer(-4),new Integer(8),new Integer(9),new Integer(-17) })).doCall().checkResult(new es.upm.aedlib.positionlist.NodePositionList<Character>(new Character[] { 98,117,101,110,97,32,115,117,101,114,116,101 })) ;
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
    ResultsHandler.stopTest(new String("test_040")) ;
    ResultsHandler.add_result(new String("decrypt"),resultIs) ;
    System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_041 () 
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
TestData.testName = new String("test_041") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_041")) ;
if (ok_sofar)
  ok_sofar = new Decrypt(new es.upm.aedlib.positionlist.NodePositionList<Character>(new Character[] { 100,106,99,97,118,107,105,119,110,104,115,102,116,112,98,114,117,103,122,108,109,101,32,111,120,121,113 }),new es.upm.aedlib.positionlist.NodePositionList<Integer>(new Integer[] { new Integer(9),new Integer(-6),new Integer(7),new Integer(12),new Integer(-19),new Integer(10),new Integer(2),new Integer(8),new Integer(-9),new Integer(-11),new Integer(-3),new Integer(23),new Integer(-1),new Integer(-3),new Integer(-16),new Integer(19),new Integer(-19),new Integer(7),new Integer(-4),new Integer(11),new Integer(-9),new Integer(-5),new Integer(9),new Integer(4),new Integer(-1),new Integer(-12) })).doCall().checkResult(new es.upm.aedlib.positionlist.NodePositionList<Character>(new Character[] { 104,97,115,32,97,112,114,111,98,97,100,111,32,108,97,32,97,115,105,103,110,97,116,117,114,97 })) ;
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
    ResultsHandler.stopTest(new String("test_041")) ;
    ResultsHandler.add_result(new String("decrypt"),resultIs) ;
    System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_042 () 
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
TestData.testName = new String("test_042") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_042")) ;
if (ok_sofar)
  ok_sofar = new Decrypt(new es.upm.aedlib.positionlist.NodePositionList<Character>(new Character[] { 104,111,100,120,106,116,101,122,103,105,114,121,112,108,98,118,117,119,113,107,97,109,102,32,115,110,99 }),new es.upm.aedlib.positionlist.NodePositionList<Integer>(new Integer[] { new Integer(0),new Integer(20),new Integer(4),new Integer(-1),new Integer(-3),new Integer(-8),new Integer(-2),new Integer(-9),new Integer(13),new Integer(6),new Integer(-18),new Integer(-1),new Integer(22),new Integer(-10),new Integer(7),new Integer(3),new Integer(-3),new Integer(4),new Integer(-15),new Integer(-1),new Integer(17),new Integer(-5),new Integer(-15),new Integer(11),new Integer(-6),new Integer(10) })).doCall().checkResult(new es.upm.aedlib.positionlist.NodePositionList<Character>(new Character[] { 104,97,115,32,97,112,114,111,98,97,100,111,32,108,97,32,97,115,105,103,110,97,116,117,114,97 })) ;
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
    ResultsHandler.stopTest(new String("test_042")) ;
    ResultsHandler.add_result(new String("decrypt"),resultIs) ;
    System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_043 () 
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
TestData.testName = new String("test_043") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_043")) ;
if (ok_sofar)
  ok_sofar = new Decrypt(new es.upm.aedlib.positionlist.NodePositionList<Character>(new Character[] { 106,103,113,114,98,117,102,101,32,120,111,121,122,110,99,100,112,109,119,97,108,115,107,104,105,116,118 }),new es.upm.aedlib.positionlist.NodePositionList<Integer>(new Integer[] { new Integer(23),new Integer(-4),new Integer(2),new Integer(-13),new Integer(11),new Integer(-3),new Integer(-13),new Integer(7),new Integer(-6),new Integer(15),new Integer(-4),new Integer(-5),new Integer(-2),new Integer(12),new Integer(-1),new Integer(-11),new Integer(11),new Integer(2),new Integer(3),new Integer(-23),new Integer(12),new Integer(6),new Integer(6),new Integer(-20),new Integer(-2),new Integer(16) })).doCall().checkResult(new es.upm.aedlib.positionlist.NodePositionList<Character>(new Character[] { 104,97,115,32,97,112,114,111,98,97,100,111,32,108,97,32,97,115,105,103,110,97,116,117,114,97 })) ;
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
    ResultsHandler.stopTest(new String("test_043")) ;
    ResultsHandler.add_result(new String("decrypt"),resultIs) ;
    System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_044 () 
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
TestData.testName = new String("test_044") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_044")) ;
if (ok_sofar)
  ok_sofar = new Decrypt(new es.upm.aedlib.positionlist.NodePositionList<Character>(new Character[] { 108,113,109,105,107,104,102,119,111,98,120,110,112,115,114,106,117,103,32,118,122,116,100,121,99,97,101 }),new es.upm.aedlib.positionlist.NodePositionList<Integer>(new Integer[] { new Integer(5),new Integer(20),new Integer(-12),new Integer(5),new Integer(7),new Integer(-13),new Integer(2),new Integer(-6),new Integer(1),new Integer(16),new Integer(-3),new Integer(-14),new Integer(10),new Integer(-18),new Integer(25),new Integer(-7),new Integer(7),new Integer(-12),new Integer(-10),new Integer(14),new Integer(-6),new Integer(14),new Integer(-4),new Integer(-5),new Integer(-2),new Integer(11) })).doCall().checkResult(new es.upm.aedlib.positionlist.NodePositionList<Character>(new Character[] { 104,97,115,32,97,112,114,111,98,97,100,111,32,108,97,32,97,115,105,103,110,97,116,117,114,97 })) ;
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
    ResultsHandler.stopTest(new String("test_044")) ;
    ResultsHandler.add_result(new String("decrypt"),resultIs) ;
    System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_045 () 
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
TestData.testName = new String("test_045") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_045")) ;
if (ok_sofar)
  ok_sofar = new Decrypt(new es.upm.aedlib.positionlist.NodePositionList<Character>(new Character[] { 106,98,32,108,117,120,110,111,109,118,104,99,101,113,121,103,114,107,119,112,116,100,97,102,105,115,122 }),new es.upm.aedlib.positionlist.NodePositionList<Integer>(new Integer[] { new Integer(8),new Integer(-4),new Integer(7),new Integer(-1),new Integer(12),new Integer(-20),new Integer(21),new Integer(-11),new Integer(-9),new Integer(21),new Integer(-13),new Integer(13),new Integer(-3),new Integer(1),new Integer(-1) })).doCall().checkResult(new es.upm.aedlib.positionlist.NodePositionList<Character>(new Character[] { 109,117,99,104,97,32,102,101,108,105,99,105,100,97,100 })) ;
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
    ResultsHandler.stopTest(new String("test_045")) ;
    ResultsHandler.add_result(new String("decrypt"),resultIs) ;
    System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_046 () 
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
TestData.testName = new String("test_046") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_046")) ;
if (ok_sofar)
  ok_sofar = new Decrypt(new es.upm.aedlib.positionlist.NodePositionList<Character>(new Character[] { 118,99,119,105,113,32,120,116,110,101,103,97,121,115,106,100,98,114,109,107,122,102,112,117,104,108,111 }),new es.upm.aedlib.positionlist.NodePositionList<Integer>(new Integer[] { new Integer(18),new Integer(5),new Integer(-22),new Integer(23),new Integer(-13),new Integer(-6),new Integer(16),new Integer(-12),new Integer(16),new Integer(-22),new Integer(-2),new Integer(2),new Integer(12),new Integer(-4),new Integer(4) })).doCall().checkResult(new es.upm.aedlib.positionlist.NodePositionList<Character>(new Character[] { 109,117,99,104,97,32,102,101,108,105,99,105,100,97,100 })) ;
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
    ResultsHandler.stopTest(new String("test_046")) ;
    ResultsHandler.add_result(new String("decrypt"),resultIs) ;
    System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_047 () 
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
TestData.testName = new String("test_047") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_047")) ;
if (ok_sofar)
  ok_sofar = new Decrypt(new es.upm.aedlib.positionlist.NodePositionList<Character>(new Character[] { 122,102,97,112,99,118,113,103,108,117,116,104,119,105,98,100,121,106,107,109,120,32,114,110,115,101,111 }),new es.upm.aedlib.positionlist.NodePositionList<Integer>(new Integer[] { new Integer(19),new Integer(-10),new Integer(-5),new Integer(7),new Integer(-9),new Integer(19),new Integer(-20),new Integer(24),new Integer(-17),new Integer(5),new Integer(-9),new Integer(9),new Integer(2),new Integer(-13),new Integer(13) })).doCall().checkResult(new es.upm.aedlib.positionlist.NodePositionList<Character>(new Character[] { 109,117,99,104,97,32,102,101,108,105,99,105,100,97,100 })) ;
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
    ResultsHandler.stopTest(new String("test_047")) ;
    ResultsHandler.add_result(new String("decrypt"),resultIs) ;
    System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_048 () 
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
TestData.testName = new String("test_048") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_048")) ;
if (ok_sofar)
  ok_sofar = new Decrypt(new es.upm.aedlib.positionlist.NodePositionList<Character>(new Character[] { 99,108,101,119,111,112,106,120,107,109,97,103,100,117,32,113,105,98,114,116,110,121,122,115,118,104,102 }),new es.upm.aedlib.positionlist.NodePositionList<Integer>(new Integer[] { new Integer(9),new Integer(4),new Integer(-13),new Integer(25),new Integer(-21),new Integer(10),new Integer(-2),new Integer(4),new Integer(4),new Integer(-18),new Integer(16),new Integer(-14) })).doCall().checkResult(new es.upm.aedlib.positionlist.NodePositionList<Character>(new Character[] { 109,117,99,104,111,32,100,105,110,101,114,111 })) ;
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
    ResultsHandler.stopTest(new String("test_048")) ;
    ResultsHandler.add_result(new String("decrypt"),resultIs) ;
    System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_049 () 
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
TestData.testName = new String("test_049") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_049")) ;
if (ok_sofar)
  ok_sofar = new Decrypt(new es.upm.aedlib.positionlist.NodePositionList<Character>(new Character[] { 116,113,107,98,121,104,32,119,117,102,101,114,115,103,106,105,111,97,122,100,109,99,120,118,110,108,112 }),new es.upm.aedlib.positionlist.NodePositionList<Integer>(new Integer[] { new Integer(20),new Integer(-12),new Integer(13),new Integer(-16),new Integer(11),new Integer(-10),new Integer(13),new Integer(-4),new Integer(9),new Integer(-14),new Integer(1),new Integer(5) })).doCall().checkResult(new es.upm.aedlib.positionlist.NodePositionList<Character>(new Character[] { 109,117,99,104,111,32,100,105,110,101,114,111 })) ;
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
    ResultsHandler.stopTest(new String("test_049")) ;
    ResultsHandler.add_result(new String("decrypt"),resultIs) ;
    System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_050 () 
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
TestData.testName = new String("test_050") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_050")) ;
if (ok_sofar)
  ok_sofar = new Decrypt(new es.upm.aedlib.positionlist.NodePositionList<Character>(new Character[] { 97,120,121,100,105,107,110,102,32,113,106,98,108,117,116,122,119,118,104,111,109,101,99,114,115,112,103 }),new es.upm.aedlib.positionlist.NodePositionList<Integer>(new Integer[] { new Integer(23),new Integer(-23),new Integer(2),new Integer(17),new Integer(-11),new Integer(9),new Integer(-17),new Integer(12),new Integer(0),new Integer(9),new Integer(1),new Integer(-22),new Integer(6),new Integer(13),new Integer(-11),new Integer(18),new Integer(-26),new Integer(6),new Integer(-6),new Integer(8),new Integer(4),new Integer(-12),new Integer(8),new Integer(4),new Integer(-8),new Integer(22),new Integer(-26) })).doCall().checkResult(new es.upm.aedlib.positionlist.NodePositionList<Character>(new Character[] { 114,97,121,111,32,118,97,108,108,101,99,97,110,111,32,103,97,110,97,32,108,97,32,108,105,103,97 })) ;
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
    ResultsHandler.stopTest(new String("test_050")) ;
    ResultsHandler.add_result(new String("decrypt"),resultIs) ;
    System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_051 () 
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
TestData.testName = new String("test_051") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_051")) ;
if (ok_sofar)
  ok_sofar = new Decrypt(new es.upm.aedlib.positionlist.NodePositionList<Character>(new Character[] { 100,122,101,107,103,105,108,112,109,97,32,116,102,110,115,118,121,106,98,117,120,113,104,114,119,99,111 }),new es.upm.aedlib.positionlist.NodePositionList<Integer>(new Integer[] { new Integer(23),new Integer(-14),new Integer(7),new Integer(10),new Integer(-16),new Integer(5),new Integer(-6),new Integer(-3),new Integer(0),new Integer(-4),new Integer(23),new Integer(-16),new Integer(4),new Integer(13),new Integer(-16),new Integer(-6),new Integer(5),new Integer(4),new Integer(-4),new Integer(1),new Integer(-4),new Integer(3),new Integer(1),new Integer(-4),new Integer(-1),new Integer(-1),new Integer(5) })).doCall().checkResult(new es.upm.aedlib.positionlist.NodePositionList<Character>(new Character[] { 114,97,121,111,32,118,97,108,108,101,99,97,110,111,32,103,97,110,97,32,108,97,32,108,105,103,97 })) ;
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
    ResultsHandler.stopTest(new String("test_051")) ;
    ResultsHandler.add_result(new String("decrypt"),resultIs) ;
    System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_052 () 
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
TestData.testName = new String("test_052") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_052")) ;
if (ok_sofar)
  ok_sofar = new Decrypt(new es.upm.aedlib.positionlist.NodePositionList<Character>(new Character[] { 102,98,110,118,97,119,116,105,103,121,114,108,106,107,109,115,122,32,99,111,104,113,101,100,120,112,117 }),new es.upm.aedlib.positionlist.NodePositionList<Integer>(new Integer[] { new Integer(10),new Integer(-6),new Integer(5),new Integer(10),new Integer(-2),new Integer(-14),new Integer(1),new Integer(7),new Integer(0),new Integer(11),new Integer(-4),new Integer(-14),new Integer(-2),new Integer(17),new Integer(-2),new Integer(-9),new Integer(-4),new Integer(-2),new Integer(2),new Integer(13),new Integer(-6),new Integer(-7),new Integer(13),new Integer(-6),new Integer(-4),new Integer(1),new Integer(-4) })).doCall().checkResult(new es.upm.aedlib.positionlist.NodePositionList<Character>(new Character[] { 114,97,121,111,32,118,97,108,108,101,99,97,110,111,32,103,97,110,97,32,108,97,32,108,105,103,97 })) ;
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
    ResultsHandler.stopTest(new String("test_052")) ;
    ResultsHandler.add_result(new String("decrypt"),resultIs) ;
    System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_053 () 
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
TestData.testName = new String("test_053") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_053")) ;
if (ok_sofar)
  ok_sofar = new Decrypt(new es.upm.aedlib.positionlist.NodePositionList<Character>(new Character[] { 112,122,107,108,101,99,111,119,109,118,32,115,102,114,120,103,117,113,105,116,98,110,121,97,100,104,106 }),new es.upm.aedlib.positionlist.NodePositionList<Integer>(new Integer[] { new Integer(13),new Integer(10),new Integer(-1),new Integer(-16),new Integer(4),new Integer(-1),new Integer(14),new Integer(-20),new Integer(0),new Integer(1),new Integer(1),new Integer(18),new Integer(-2),new Integer(-15),new Integer(4),new Integer(5),new Integer(8),new Integer(-2),new Integer(2),new Integer(-13),new Integer(-7),new Integer(20),new Integer(-13),new Integer(-7),new Integer(15),new Integer(-3),new Integer(8) })).doCall().checkResult(new es.upm.aedlib.positionlist.NodePositionList<Character>(new Character[] { 114,97,121,111,32,118,97,108,108,101,99,97,110,111,32,103,97,110,97,32,108,97,32,108,105,103,97 })) ;
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
    ResultsHandler.stopTest(new String("test_053")) ;
    ResultsHandler.add_result(new String("decrypt"),resultIs) ;
    System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_054 () 
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
TestData.testName = new String("test_054") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_054")) ;
if (ok_sofar)
  ok_sofar = new Decrypt(new es.upm.aedlib.positionlist.NodePositionList<Character>(new Character[] { 116,97,115,106,110,109,102,114,108,104,113,100,122,99,105,111,98,112,121,101,107,117,118,103,119,32,120 }),new es.upm.aedlib.positionlist.NodePositionList<Integer>(new Integer[] { new Integer(7),new Integer(-6),new Integer(17),new Integer(-3),new Integer(10),new Integer(-3),new Integer(-21),new Integer(7),new Integer(0),new Integer(11),new Integer(-6),new Integer(-12),new Integer(3),new Integer(11),new Integer(10),new Integer(-2),new Integer(-22),new Integer(3),new Integer(-3),new Integer(24),new Integer(-17),new Integer(-7),new Integer(24),new Integer(-17),new Integer(6),new Integer(9),new Integer(-22) })).doCall().checkResult(new es.upm.aedlib.positionlist.NodePositionList<Character>(new Character[] { 114,97,121,111,32,118,97,108,108,101,99,97,110,111,32,103,97,110,97,32,108,97,32,108,105,103,97 })) ;
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
    ResultsHandler.stopTest(new String("test_054")) ;
    ResultsHandler.add_result(new String("decrypt"),resultIs) ;
    System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_055 () 
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
TestData.testName = new String("test_055") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_055")) ;
if (ok_sofar)
  ok_sofar = new Decrypt(new es.upm.aedlib.positionlist.NodePositionList<Character>(new Character[] { 122,107,120,115,110,97,119,104,100,102,106,101,114,32,103,109,99,121,98,118,111,108,105,116,112,117,113 }),new es.upm.aedlib.positionlist.NodePositionList<Integer>(new Integer[] { new Integer(12),new Integer(-7),new Integer(12),new Integer(3),new Integer(-7),new Integer(6),new Integer(-14),new Integer(16),new Integer(0),new Integer(-10),new Integer(5),new Integer(-11),new Integer(-1),new Integer(16),new Integer(-7),new Integer(1),new Integer(-9),new Integer(-1),new Integer(1),new Integer(8),new Integer(8),new Integer(-16),new Integer(8),new Integer(8),new Integer(1),new Integer(-8),new Integer(-9) })).doCall().checkResult(new es.upm.aedlib.positionlist.NodePositionList<Character>(new Character[] { 114,97,121,111,32,118,97,108,108,101,99,97,110,111,32,103,97,110,97,32,108,97,32,108,105,103,97 })) ;
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
    ResultsHandler.stopTest(new String("test_055")) ;
    ResultsHandler.add_result(new String("decrypt"),resultIs) ;
    System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_056 () 
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
TestData.testName = new String("test_056") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_056")) ;
if (ok_sofar)
  ok_sofar = new Decrypt(new es.upm.aedlib.positionlist.NodePositionList<Character>(new Character[] { 97,117,122,103,106,108,99,119,32,102,107,105,104,114,116,115,112,111,113,121,98,101,110,100,118,109,120 }),new es.upm.aedlib.positionlist.NodePositionList<Integer>(new Integer[] { new Integer(15),new Integer(-1),new Integer(-14),new Integer(13),new Integer(-5),new Integer(-1),new Integer(-7),new Integer(13),new Integer(2) })).doCall().checkResult(new es.upm.aedlib.positionlist.NodePositionList<Character>(new Character[] { 115,116,97,114,32,119,97,114,115 })) ;
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
    ResultsHandler.stopTest(new String("test_056")) ;
    ResultsHandler.add_result(new String("decrypt"),resultIs) ;
    System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_057 () 
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
TestData.testName = new String("test_057") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_057")) ;
if (ok_sofar)
  ok_sofar = new Decrypt(new es.upm.aedlib.positionlist.NodePositionList<Character>(new Character[] { 99,120,118,112,106,97,114,107,115,103,116,32,105,101,109,108,104,100,111,117,122,121,113,98,119,110,102 }),new es.upm.aedlib.positionlist.NodePositionList<Integer>(new Integer[] { new Integer(8),new Integer(2),new Integer(-5),new Integer(1),new Integer(5),new Integer(13),new Integer(-19),new Integer(1),new Integer(2) })).doCall().checkResult(new es.upm.aedlib.positionlist.NodePositionList<Character>(new Character[] { 115,116,97,114,32,119,97,114,115 })) ;
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
    ResultsHandler.stopTest(new String("test_057")) ;
    ResultsHandler.add_result(new String("decrypt"),resultIs) ;
    System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_058 () 
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
TestData.testName = new String("test_058") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_058")) ;
if (ok_sofar)
  ok_sofar = new Decrypt(new es.upm.aedlib.positionlist.NodePositionList<Character>(new Character[] { 116,122,115,120,103,32,98,121,119,109,101,102,110,114,107,100,112,97,118,113,104,105,117,108,111,106,99 }),new es.upm.aedlib.positionlist.NodePositionList<Integer>(new Integer[] { new Integer(2),new Integer(-2),new Integer(17),new Integer(-4),new Integer(-8),new Integer(3),new Integer(9),new Integer(-4),new Integer(-11) })).doCall().checkResult(new es.upm.aedlib.positionlist.NodePositionList<Character>(new Character[] { 115,116,97,114,32,119,97,114,115 })) ;
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
    ResultsHandler.stopTest(new String("test_058")) ;
    ResultsHandler.add_result(new String("decrypt"),resultIs) ;
    System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_059 () 
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
TestData.testName = new String("test_059") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_059")) ;
if (ok_sofar)
  ok_sofar = new Decrypt(new es.upm.aedlib.positionlist.NodePositionList<Character>(new Character[] { 99,113,121,107,109,105,119,116,112,103,104,110,117,101,106,115,108,100,102,111,118,97,114,98,120,32,122 }),new es.upm.aedlib.positionlist.NodePositionList<Integer>(new Integer[] { new Integer(7),new Integer(12),new Integer(3),new Integer(0),new Integer(-9),new Integer(-2),new Integer(-4),new Integer(6) })).doCall().checkResult(new es.upm.aedlib.positionlist.NodePositionList<Character>(new Character[] { 116,111,114,114,101,110,116,101 })) ;
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
    ResultsHandler.stopTest(new String("test_059")) ;
    ResultsHandler.add_result(new String("decrypt"),resultIs) ;
    System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_060 () 
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
TestData.testName = new String("test_060") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_060")) ;
if (ok_sofar)
  ok_sofar = new Decrypt(new es.upm.aedlib.positionlist.NodePositionList<Character>(new Character[] { 111,117,109,108,104,113,114,121,115,112,105,99,97,32,106,102,118,122,100,107,103,120,101,98,110,119,116 }),new es.upm.aedlib.positionlist.NodePositionList<Integer>(new Integer[] { new Integer(26),new Integer(-26),new Integer(6),new Integer(0),new Integer(16),new Integer(2),new Integer(2),new Integer(-4) })).doCall().checkResult(new es.upm.aedlib.positionlist.NodePositionList<Character>(new Character[] { 116,111,114,114,101,110,116,101 })) ;
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
    ResultsHandler.stopTest(new String("test_060")) ;
    ResultsHandler.add_result(new String("decrypt"),resultIs) ;
    System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_061 () 
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
TestData.testName = new String("test_061") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_061")) ;
if (ok_sofar)
  ok_sofar = new Decrypt(new es.upm.aedlib.positionlist.NodePositionList<Character>(new Character[] { 116,99,119,103,117,105,109,100,114,32,118,121,108,98,104,112,111,102,113,106,120,110,107,101,97,122,115 }),new es.upm.aedlib.positionlist.NodePositionList<Integer>(new Integer[] { new Integer(0),new Integer(16),new Integer(-8),new Integer(0),new Integer(15),new Integer(-2),new Integer(-21),new Integer(23) })).doCall().checkResult(new es.upm.aedlib.positionlist.NodePositionList<Character>(new Character[] { 116,111,114,114,101,110,116,101 })) ;
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
    ResultsHandler.stopTest(new String("test_061")) ;
    ResultsHandler.add_result(new String("decrypt"),resultIs) ;
    System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_062 () 
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
TestData.testName = new String("test_062") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_062")) ;
if (ok_sofar)
  ok_sofar = new IsBalanced(new String("")).doCall().checkResult(new Boolean(true)) ;
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
    ResultsHandler.stopTest(new String("test_062")) ;
    ResultsHandler.add_result(new String("isBalanced"),resultIs) ;
    System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_063 () 
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
TestData.testName = new String("test_063") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_063")) ;
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
    ResultsHandler.stopTest(new String("test_063")) ;
    ResultsHandler.add_result(new String("isBalanced"),resultIs) ;
    System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_064 () 
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
TestData.testName = new String("test_064") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_064")) ;
if (ok_sofar)
  ok_sofar = new IsBalanced(new String("ab")).doCall().checkResult(new Boolean(true)) ;
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
    ResultsHandler.stopTest(new String("test_064")) ;
    ResultsHandler.add_result(new String("isBalanced"),resultIs) ;
    System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_065 () 
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
TestData.testName = new String("test_065") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_065")) ;
if (ok_sofar)
  ok_sofar = new IsBalanced(new String("()")).doCall().checkResult(new Boolean(true)) ;
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
    ResultsHandler.stopTest(new String("test_065")) ;
    ResultsHandler.add_result(new String("isBalanced"),resultIs) ;
    System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_066 () 
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
TestData.testName = new String("test_066") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_066")) ;
if (ok_sofar)
  ok_sofar = new IsBalanced(new String("(ab")).doCall().checkResult(new Boolean(false)) ;
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
    ResultsHandler.stopTest(new String("test_066")) ;
    ResultsHandler.add_result(new String("isBalanced"),resultIs) ;
    System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_067 () 
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
TestData.testName = new String("test_067") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_067")) ;
if (ok_sofar)
  ok_sofar = new IsBalanced(new String("ab]")).doCall().checkResult(new Boolean(false)) ;
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
    ResultsHandler.stopTest(new String("test_067")) ;
    ResultsHandler.add_result(new String("isBalanced"),resultIs) ;
    System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_068 () 
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
TestData.testName = new String("test_068") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_068")) ;
if (ok_sofar)
  ok_sofar = new IsBalanced(new String(")W{")).doCall().checkResult(new Boolean(false)) ;
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
    ResultsHandler.stopTest(new String("test_068")) ;
    ResultsHandler.add_result(new String("isBalanced"),resultIs) ;
    System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_069 () 
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
TestData.testName = new String("test_069") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_069")) ;
if (ok_sofar)
  ok_sofar = new IsBalanced(new String("){}")).doCall().checkResult(new Boolean(false)) ;
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
    ResultsHandler.stopTest(new String("test_069")) ;
    ResultsHandler.add_result(new String("isBalanced"),resultIs) ;
    System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_070 () 
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
TestData.testName = new String("test_070") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_070")) ;
if (ok_sofar)
  ok_sofar = new IsBalanced(new String("K]{")).doCall().checkResult(new Boolean(false)) ;
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
    ResultsHandler.stopTest(new String("test_070")) ;
    ResultsHandler.add_result(new String("isBalanced"),resultIs) ;
    System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_071 () 
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
TestData.testName = new String("test_071") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_071")) ;
if (ok_sofar)
  ok_sofar = new IsBalanced(new String("{}K")).doCall().checkResult(new Boolean(true)) ;
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
    ResultsHandler.stopTest(new String("test_071")) ;
    ResultsHandler.add_result(new String("isBalanced"),resultIs) ;
    System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_072 () 
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
TestData.testName = new String("test_072") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_072")) ;
if (ok_sofar)
  ok_sofar = new IsBalanced(new String("(ab)")).doCall().checkResult(new Boolean(true)) ;
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
    ResultsHandler.stopTest(new String("test_072")) ;
    ResultsHandler.add_result(new String("isBalanced"),resultIs) ;
    System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_073 () 
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
TestData.testName = new String("test_073") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_073")) ;
if (ok_sofar)
  ok_sofar = new IsBalanced(new String("(ab}")).doCall().checkResult(new Boolean(false)) ;
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
    ResultsHandler.stopTest(new String("test_073")) ;
    ResultsHandler.add_result(new String("isBalanced"),resultIs) ;
    System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_074 () 
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
TestData.testName = new String("test_074") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_074")) ;
if (ok_sofar)
  ok_sofar = new IsBalanced(new String("[[]]")).doCall().checkResult(new Boolean(true)) ;
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
    ResultsHandler.stopTest(new String("test_074")) ;
    ResultsHandler.add_result(new String("isBalanced"),resultIs) ;
    System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_075 () 
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
TestData.testName = new String("test_075") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_075")) ;
if (ok_sofar)
  ok_sofar = new IsBalanced(new String("t(J)")).doCall().checkResult(new Boolean(true)) ;
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
    ResultsHandler.stopTest(new String("test_075")) ;
    ResultsHandler.add_result(new String("isBalanced"),resultIs) ;
    System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_076 () 
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
TestData.testName = new String("test_076") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_076")) ;
if (ok_sofar)
  ok_sofar = new IsBalanced(new String("{}](")).doCall().checkResult(new Boolean(false)) ;
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
    ResultsHandler.stopTest(new String("test_076")) ;
    ResultsHandler.add_result(new String("isBalanced"),resultIs) ;
    System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_077 () 
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
TestData.testName = new String("test_077") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_077")) ;
if (ok_sofar)
  ok_sofar = new IsBalanced(new String("}({)")).doCall().checkResult(new Boolean(false)) ;
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
    ResultsHandler.stopTest(new String("test_077")) ;
    ResultsHandler.add_result(new String("isBalanced"),resultIs) ;
    System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_078 () 
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
TestData.testName = new String("test_078") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_078")) ;
if (ok_sofar)
  ok_sofar = new IsBalanced(new String("(()()")).doCall().checkResult(new Boolean(false)) ;
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
    ResultsHandler.stopTest(new String("test_078")) ;
    ResultsHandler.add_result(new String("isBalanced"),resultIs) ;
    System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_079 () 
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
TestData.testName = new String("test_079") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_079")) ;
if (ok_sofar)
  ok_sofar = new IsBalanced(new String("[)()T")).doCall().checkResult(new Boolean(false)) ;
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
    ResultsHandler.stopTest(new String("test_079")) ;
    ResultsHandler.add_result(new String("isBalanced"),resultIs) ;
    System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_080 () 
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
TestData.testName = new String("test_080") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_080")) ;
if (ok_sofar)
  ok_sofar = new IsBalanced(new String("}[{r]")).doCall().checkResult(new Boolean(false)) ;
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
    ResultsHandler.stopTest(new String("test_080")) ;
    ResultsHandler.add_result(new String("isBalanced"),resultIs) ;
    System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_081 () 
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
TestData.testName = new String("test_081") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_081")) ;
if (ok_sofar)
  ok_sofar = new IsBalanced(new String("[(][)]")).doCall().checkResult(new Boolean(false)) ;
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
    ResultsHandler.stopTest(new String("test_081")) ;
    ResultsHandler.add_result(new String("isBalanced"),resultIs) ;
    System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_082 () 
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
TestData.testName = new String("test_082") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_082")) ;
if (ok_sofar)
  ok_sofar = new IsBalanced(new String("{(a)b}")).doCall().checkResult(new Boolean(true)) ;
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
    ResultsHandler.stopTest(new String("test_082")) ;
    ResultsHandler.add_result(new String("isBalanced"),resultIs) ;
    System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_083 () 
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
TestData.testName = new String("test_083") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_083")) ;
if (ok_sofar)
  ok_sofar = new IsBalanced(new String("()[[]]")).doCall().checkResult(new Boolean(true)) ;
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
    ResultsHandler.stopTest(new String("test_083")) ;
    ResultsHandler.add_result(new String("isBalanced"),resultIs) ;
    System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_084 () 
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
TestData.testName = new String("test_084") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_084")) ;
if (ok_sofar)
  ok_sofar = new IsBalanced(new String("(sf[]]")).doCall().checkResult(new Boolean(false)) ;
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
    ResultsHandler.stopTest(new String("test_084")) ;
    ResultsHandler.add_result(new String("isBalanced"),resultIs) ;
    System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_085 () 
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
TestData.testName = new String("test_085") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_085")) ;
if (ok_sofar)
  ok_sofar = new IsBalanced(new String("[][][]")).doCall().checkResult(new Boolean(true)) ;
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
    ResultsHandler.stopTest(new String("test_085")) ;
    ResultsHandler.add_result(new String("isBalanced"),resultIs) ;
    System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_086 () 
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
TestData.testName = new String("test_086") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_086")) ;
if (ok_sofar)
  ok_sofar = new IsBalanced(new String("{}{}()}")).doCall().checkResult(new Boolean(false)) ;
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
    ResultsHandler.stopTest(new String("test_086")) ;
    ResultsHandler.add_result(new String("isBalanced"),resultIs) ;
    System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_087 () 
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
TestData.testName = new String("test_087") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_087")) ;
if (ok_sofar)
  ok_sofar = new IsBalanced(new String("(ab)[cd}")).doCall().checkResult(new Boolean(false)) ;
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
    ResultsHandler.stopTest(new String("test_087")) ;
    ResultsHandler.add_result(new String("isBalanced"),resultIs) ;
    System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_088 () 
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
TestData.testName = new String("test_088") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_088")) ;
if (ok_sofar)
  ok_sofar = new IsBalanced(new String("a[b](c)d")).doCall().checkResult(new Boolean(true)) ;
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
    ResultsHandler.stopTest(new String("test_088")) ;
    ResultsHandler.add_result(new String("isBalanced"),resultIs) ;
    System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_089 () 
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
TestData.testName = new String("test_089") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_089")) ;
if (ok_sofar)
  ok_sofar = new IsBalanced(new String("[[][Vk]]")).doCall().checkResult(new Boolean(true)) ;
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
    ResultsHandler.stopTest(new String("test_089")) ;
    ResultsHandler.add_result(new String("isBalanced"),resultIs) ;
    System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_090 () 
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
TestData.testName = new String("test_090") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_090")) ;
if (ok_sofar)
  ok_sofar = new IsBalanced(new String("{}k[{[}]]")).doCall().checkResult(new Boolean(false)) ;
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
    ResultsHandler.stopTest(new String("test_090")) ;
    ResultsHandler.add_result(new String("isBalanced"),resultIs) ;
    System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_091 () 
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
TestData.testName = new String("test_091") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_091")) ;
if (ok_sofar)
  ok_sofar = new IsBalanced(new String("[{(a)b}cd]")).doCall().checkResult(new Boolean(true)) ;
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
    ResultsHandler.stopTest(new String("test_091")) ;
    ResultsHandler.add_result(new String("isBalanced"),resultIs) ;
    System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_092 () 
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
TestData.testName = new String("test_092") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_092")) ;
if (ok_sofar)
  ok_sofar = new IsBalanced(new String("VCjsJ[]uy]")).doCall().checkResult(new Boolean(false)) ;
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
    ResultsHandler.stopTest(new String("test_092")) ;
    ResultsHandler.add_result(new String("isBalanced"),resultIs) ;
    System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_093 () 
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
TestData.testName = new String("test_093") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_093")) ;
if (ok_sofar)
  ok_sofar = new IsBalanced(new String("[]()C[]c[)b]")).doCall().checkResult(new Boolean(false)) ;
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
    ResultsHandler.stopTest(new String("test_093")) ;
    ResultsHandler.add_result(new String("isBalanced"),resultIs) ;
    System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_094 () 
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
TestData.testName = new String("test_094") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_094")) ;
if (ok_sofar)
  ok_sofar = new IsBalanced(new String("h](){O}(()[])")).doCall().checkResult(new Boolean(false)) ;
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
    ResultsHandler.stopTest(new String("test_094")) ;
    ResultsHandler.add_result(new String("isBalanced"),resultIs) ;
    System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_095 () 
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
TestData.testName = new String("test_095") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_095")) ;
if (ok_sofar)
  ok_sofar = new IsBalanced(new String("Q((){}{})k{[]}")).doCall().checkResult(new Boolean(true)) ;
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
    ResultsHandler.stopTest(new String("test_095")) ;
    ResultsHandler.add_result(new String("isBalanced"),resultIs) ;
    System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_096 () 
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
TestData.testName = new String("test_096") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_096")) ;
if (ok_sofar)
  ok_sofar = new IsBalanced(new String("Bg{({}){[]}{w()}")).doCall().checkResult(new Boolean(false)) ;
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
    ResultsHandler.stopTest(new String("test_096")) ;
    ResultsHandler.add_result(new String("isBalanced"),resultIs) ;
    System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_097 () 
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
TestData.testName = new String("test_097") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_097")) ;
if (ok_sofar)
  ok_sofar = new IsBalanced(new String("[]()gS[{}]N{Ch())")).doCall().checkResult(new Boolean(false)) ;
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
    ResultsHandler.stopTest(new String("test_097")) ;
    ResultsHandler.add_result(new String("isBalanced"),resultIs) ;
    System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_098 () 
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
TestData.testName = new String("test_098") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_098")) ;
if (ok_sofar)
  ok_sofar = new IsBalanced(new String("r]()[[][]]([]MM[)()")).doCall().checkResult(new Boolean(false)) ;
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
    ResultsHandler.stopTest(new String("test_098")) ;
    ResultsHandler.add_result(new String("isBalanced"),resultIs) ;
    System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_099 () 
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
TestData.testName = new String("test_099") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_099")) ;
if (ok_sofar)
  ok_sofar = new IsBalanced(new String("vXS{}[]jT{}){{x()}}W[")).doCall().checkResult(new Boolean(false)) ;
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
    ResultsHandler.stopTest(new String("test_099")) ;
    ResultsHandler.add_result(new String("isBalanced"),resultIs) ;
    System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_100 () 
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
TestData.testName = new String("test_100") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_100")) ;
if (ok_sofar)
  ok_sofar = new IsBalanced(new String("{{}{}{[}{[]QS}(b)}{)}()")).doCall().checkResult(new Boolean(false)) ;
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
    ResultsHandler.stopTest(new String("test_100")) ;
    ResultsHandler.add_result(new String("isBalanced"),resultIs) ;
    System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_101 () 
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
TestData.testName = new String("test_101") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_101")) ;
if (ok_sofar)
  ok_sofar = new IsBalanced(new String("TzB()[{}[[Ba]][]]]{}j[A]")).doCall().checkResult(new Boolean(false)) ;
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
    ResultsHandler.stopTest(new String("test_101")) ;
    ResultsHandler.add_result(new String("isBalanced"),resultIs) ;
    System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_102 () 
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
TestData.testName = new String("test_102") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_102")) ;
if (ok_sofar)
  ok_sofar = new IsBalanced(new String("{[]}(()F{})I[]()Eb[W]{{}{(w)}}{}")).doCall().checkResult(new Boolean(true)) ;
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
    ResultsHandler.stopTest(new String("test_102")) ;
    ResultsHandler.add_result(new String("isBalanced"),resultIs) ;
    System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  


static class Tests {
  static String tester = "TesterLab3";
}





static class RecursionLabUtils {

  public static void resetPrinter() { }

  public static String printer(Object obj) {
    if (obj instanceof Position<?>) {
      Object e = ((Position<?>) obj).element();
      return "Position("+printer(e)+")";
    } else return TestUtils.printer(obj, x -> printer(x));
  }

  static <E> Position<E> findPos(PositionList<E> l, int p) {
    Position<E> pos = l.first();
    while (p > 0) {
      pos = l.next(pos);
      --p;
    }
    return pos;
  }

  static <E,F> boolean checkGetPosition(GetPosition call,
                                        TestResult<Position<Integer>,F> result,
                                        Pair<NodePositionList<Integer>,Integer> pair) {
    Position<Integer> p = result.getValue();
    Position<Integer> expected = findPos(call.list,pair.getRight());
    if (!expected.equals(p)) {
        TestUtils.printError
          (TestUtils.ExecutionTime.DURING,
           "the call "+call.toString()+
           " returned a result "+TestUtils.print(p)+
           " which differs from the expected result "+TestUtils.print(expected));
        Position<Integer> cursor = call.list.first();
        while (cursor != null) {
          cursor = call.list.next(cursor);
        }
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


static class FindPos extends TestCall<es.upm.aedlib.Position<Integer>,Void>
{
  es.upm.aedlib.positionlist.NodePositionList<Integer> l;
  es.upm.aedlib.positionlist.NodePositionList<Integer> l_orig;
  int p;
  
  public FindPos (es.upm.aedlib.positionlist.NodePositionList<Integer> l,int p)
  {
    this.l = l ;
    if (l == null)
      l_orig = null ;
    else
      l_orig = new es.upm.aedlib.positionlist.NodePositionList<Integer>(l) ;
    this.p = p ;
  }
  
  public String toString () 
  {
    StringBuilder output = new StringBuilder() ;
    output.append(new String("RecursionLab.findPos")) ;
    output.append(new String("(")) ;
    output.append(TesterCode.printer(l_orig)) ;
    output.append(new String(", ")) ;
    output.append(TesterCode.printer(p)) ;
    output.append(new String(")")) ;
    return output.toString() ;
  }
  
  public es.upm.aedlib.Position<Integer> call () 
  {
    return RecursionLabUtils.findPos(l,p) ;
  }
  
  public boolean checkResult (Void expected) 
  {
    return true ;
  }
  
}


static class Decrypt extends TestCall<es.upm.aedlib.positionlist.PositionList<Character>,es.upm.aedlib.positionlist.NodePositionList<Character>>
{
  es.upm.aedlib.positionlist.NodePositionList<Character> key;
  es.upm.aedlib.positionlist.NodePositionList<Character> key_orig;
  es.upm.aedlib.positionlist.NodePositionList<Integer> tabla;
  es.upm.aedlib.positionlist.NodePositionList<Integer> tabla_orig;
  
  public Decrypt (es.upm.aedlib.positionlist.NodePositionList<Character> key,es.upm.aedlib.positionlist.NodePositionList<Integer> tabla)
  {
    this.key = key ;
    if (key == null)
      key_orig = null ;
    else
      key_orig = new es.upm.aedlib.positionlist.NodePositionList<Character>(key) ;
    this.tabla = tabla ;
    if (tabla == null)
      tabla_orig = null ;
    else
      tabla_orig = new es.upm.aedlib.positionlist.NodePositionList<Integer>(tabla) ;
  }
  
  public String toString () 
  {
    StringBuilder output = new StringBuilder() ;
    output.append(new String("Recursion.decrypt")) ;
    output.append(new String("(")) ;
    output.append(TesterCode.printer(key_orig)) ;
    output.append(new String(", ")) ;
    output.append(TesterCode.printer(tabla_orig)) ;
    output.append(new String(")")) ;
    return output.toString() ;
  }
  
  public es.upm.aedlib.positionlist.PositionList<Character> call () 
  {
    return Recursion.decrypt(key,tabla) ;
  }
  
  public boolean checkResult (es.upm.aedlib.positionlist.NodePositionList<Character> expected) 
  {
    if (!noException())
      return false ;
    if (!nonNull())
      return false ;
    if (!fresh(result.getValue(),key))
      return false ;
    if (!fresh(result.getValue(),tabla))
      return false ;
    if (!unchanged(key,key_orig))
      return false ;
    if (!unchanged(tabla,tabla_orig))
      return false ;
    if (!valuesMatch(expected))
      return false ;
    return true ;
  }
  
}


static class CreateList extends TestCall<es.upm.aedlib.positionlist.NodePositionList<Integer>,Void>
{
  Integer[] list;
  Integer[] list_orig;
  
  public CreateList (Integer[] list)
  {
    this.list = list ;
    if (list == null)
      list_orig = null ;
    else
      list_orig = list.clone() ;
  }
  
  public String toString () 
  {
    StringBuilder output = new StringBuilder() ;
    output.append(new String("new es.upm.aedlib.positionlist.NodePositionList<Integer>")) ;
    output.append(new String("(")) ;
    output.append(TesterCode.printer(list_orig)) ;
    output.append(new String(")")) ;
    return output.toString() ;
  }
  
  public es.upm.aedlib.positionlist.NodePositionList<Integer> call () 
  {
    return new es.upm.aedlib.positionlist.NodePositionList<Integer>(list) ;
  }
  
  public boolean checkResult (Void expected) 
  {
    if (!noException())
      return false ;
    if (!unchanged_array(list,list_orig))
      return false ;
    return true ;
  }
  
}


static class IsBalanced extends TestCall<Boolean,Boolean>
{
  String n;
  
  public IsBalanced (String n)
  {
    this.n = n ;
  }
  
  public String toString () 
  {
    StringBuilder output = new StringBuilder() ;
    output.append(new String("Recursion.isBalanced")) ;
    output.append(new String("(")) ;
    output.append(TesterCode.printer(n)) ;
    output.append(new String(")")) ;
    return output.toString() ;
  }
  
  public Boolean call () 
  {
    return Recursion.isBalanced(n) ;
  }
  
  public boolean checkResult (Boolean expected) 
  {
    if (!noException())
      return false ;
    if (!nonNull())
      return false ;
    if (!valuesMatch(expected))
      return false ;
    return true ;
  }
  
}


static class GetPosition extends TestCall<es.upm.aedlib.Position<Integer>,es.upm.aedlib.Pair<es.upm.aedlib.positionlist.NodePositionList<Integer>,Integer>>
{
  es.upm.aedlib.positionlist.NodePositionList<Integer> list;
  es.upm.aedlib.positionlist.NodePositionList<Integer> list_orig;
  es.upm.aedlib.Position<Integer> pos;
  int traversal;
  
  public GetPosition (es.upm.aedlib.positionlist.NodePositionList<Integer> list,es.upm.aedlib.Position<Integer> pos,int traversal)
  {
    this.list = list ;
    if (list == null)
      list_orig = null ;
    else
      list_orig = new es.upm.aedlib.positionlist.NodePositionList<Integer>(list) ;
    this.pos = pos ;
    this.traversal = traversal ;
  }
  
  public String toString () 
  {
    StringBuilder output = new StringBuilder() ;
    output.append(new String("Recursion.getPosition")) ;
    output.append(new String("(")) ;
    output.append(TesterCode.printer(list_orig)) ;
    output.append(new String(", ")) ;
    output.append(TesterCode.printer(pos)) ;
    output.append(new String(", ")) ;
    output.append(TesterCode.printer(traversal)) ;
    output.append(new String(")")) ;
    return output.toString() ;
  }
  
  public es.upm.aedlib.Position<Integer> call () 
  {
    return Recursion.getPosition(list,pos,traversal) ;
  }
  
  public boolean checkResult (es.upm.aedlib.Pair<es.upm.aedlib.positionlist.NodePositionList<Integer>,Integer> expected) 
  {
    if (!noException())
      return false ;
    if (!nonNull())
      return false ;
    if (!fresh(result.getValue(),list))
      return false ;
    if (!unchanged(list,list_orig))
      return false ;
    if (!RecursionLabUtils.checkGetPosition(this,result,expected))
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

    return goodOnes >= 2;
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
    RecursionLabUtils.resetPrinter() ;
  }
  
  public static String printer (Object obj) 
  {
    return RecursionLabUtils.printer(obj) ;
  }
  
}


}
