
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
// File generated at: 2019/11/14 -- 22:49:27
// Seed: {1573,768165,454805}
//
//////////////////////////////////////////////////////////////////////



package aed.hashtables;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import java.util.concurrent.CountDownLatch;
import java.lang.reflect.*;
import es.upm.aedlib.Entry;
import es.upm.aedlib.Pair;
import es.upm.aedlib.Position;
import es.upm.aedlib.indexedlist.*;
import es.upm.aedlib.map.*;
import es.upm.aedlib.map.Map;
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
import java.util.function.*;
import java.util.function.Function;



/**
 * The main tester class which contains JUnit5 tests.
 */
@SuppressWarnings({"unused","deprecation"})
public class TesterLab4 {

  
    

  @BeforeAll
  public static void init () 
  {
    TestUtils.reportPid() ;
    ResultsHandler.init() ;
    ResultsHandler.setNumTestsRemaining(78,60) ;
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
    ResultsHandler.add_result(new String("hashtable"),resultIs) ;
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
TestResult<HashTable<Integer,String>,Void> v_0 = null ;
HashTable<Integer,String> v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_02") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_02")) ;
if (ok_sofar)
{
  v_0 = new Constructor(2).doCall() ;
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
    ResultsHandler.stopTest(new String("test_02")) ;
    ResultsHandler.add_result(new String("hashtable"),resultIs) ;
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
TestResult<HashTable<Integer,String>,Void> v_0 = null ;
HashTable<Integer,String> v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_03") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_03")) ;
if (ok_sofar)
{
  v_0 = new Constructor(3).doCall() ;
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
    ResultsHandler.stopTest(new String("test_03")) ;
    ResultsHandler.add_result(new String("hashtable"),resultIs) ;
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
TestResult<HashTable<Integer,String>,Void> v_0 = null ;
HashTable<Integer,String> v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_04") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_04")) ;
if (ok_sofar)
{
  v_0 = new Constructor(4).doCall() ;
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
    ResultsHandler.stopTest(new String("test_04")) ;
    ResultsHandler.add_result(new String("hashtable"),resultIs) ;
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
TestResult<HashTable<Integer,String>,Void> v_0 = null ;
HashTable<Integer,String> v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_05") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_05")) ;
if (ok_sofar)
{
  v_0 = new Constructor(1).doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new Put(v_1,new Integer(6),new String("Ferrer")).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(6,new String("Ferrer"))))))).doCall().checkResult(true) ;
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
    ResultsHandler.add_result(new String("hashtable"),resultIs) ;
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
TestResult<HashTable<Integer,String>,Void> v_0 = null ;
HashTable<Integer,String> v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_06") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_06")) ;
if (ok_sofar)
{
  v_0 = new Constructor(2).doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new Get(v_1,new Integer(0)).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray()),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray())))).doCall().checkResult(true) ;
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
    ResultsHandler.add_result(new String("hashtable"),resultIs) ;
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
TestResult<HashTable<Integer,String>,Void> v_0 = null ;
HashTable<Integer,String> v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_07") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_07")) ;
if (ok_sofar)
{
  v_0 = new Constructor(2).doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new Get(v_1,new Integer(2)).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray()),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray())))).doCall().checkResult(true) ;
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
    ResultsHandler.add_result(new String("hashtable"),resultIs) ;
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
TestResult<HashTable<Integer,String>,Void> v_0 = null ;
HashTable<Integer,String> v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_08") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_08")) ;
if (ok_sofar)
{
  v_0 = new Constructor(3).doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new Size(v_1).doCall().checkResult(new Integer(0)) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray()),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray()),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray())))).doCall().checkResult(true) ;
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
    ResultsHandler.add_result(new String("hashtable"),resultIs) ;
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
TestResult<HashTable<Integer,String>,Void> v_0 = null ;
HashTable<Integer,String> v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_09") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_09")) ;
if (ok_sofar)
{
  v_0 = new Constructor(6).doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new Get(v_1,new Integer(8)).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray()),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray()),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray()),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray()),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray()),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray())))).doCall().checkResult(true) ;
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
    ResultsHandler.add_result(new String("hashtable"),resultIs) ;
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
TestResult<HashTable<Integer,String>,Void> v_0 = null ;
HashTable<Integer,String> v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_10") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_10")) ;
if (ok_sofar)
{
  v_0 = new Constructor(2).doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new Put(v_1,new Integer(3),new String("Navarro")).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray()),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(3,new String("Navarro"))))))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Size(v_1).doCall().checkResult(new Integer(1)) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray()),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(3,new String("Navarro"))))))).doCall().checkResult(true) ;
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
    ResultsHandler.add_result(new String("hashtable"),resultIs) ;
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
TestResult<HashTable<Integer,String>,Void> v_0 = null ;
HashTable<Integer,String> v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_11") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_11")) ;
if (ok_sofar)
{
  v_0 = new Constructor(3).doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new Get(v_1,new Integer(2)).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray()),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray()),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray())))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Entries(v_1).doCall().checkResult(TestUtils.toGenericArray()) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray()),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray()),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray())))).doCall().checkResult(true) ;
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
    ResultsHandler.add_result(new String("hashtable"),resultIs) ;
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
TestResult<HashTable<Integer,String>,Void> v_0 = null ;
HashTable<Integer,String> v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_12") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_12")) ;
if (ok_sofar)
{
  v_0 = new Constructor(1).doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new Get(v_1,new Integer(1)).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray())))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,new Integer(6),new String("Rossello")).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(6,new String("Rossello"))))))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,new Integer(6),new String("Lopez")).doCall().checkResult(new String("Rossello")) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(6,new String("Lopez"))))))).doCall().checkResult(true) ;
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
    ResultsHandler.add_result(new String("hashtable"),resultIs) ;
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
TestResult<HashTable<Integer,String>,Void> v_0 = null ;
HashTable<Integer,String> v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_13") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_13")) ;
if (ok_sofar)
{
  v_0 = new Constructor(2).doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new Put(v_1,new Integer(0),new String("Echeberria")).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(0,new String("Echeberria")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray())))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,new Integer(0)).doCall().checkResult(new String("Echeberria")) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(0,new String("Echeberria")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray())))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Remove(v_1,new Integer(0)).doCall().checkResult(new String("Echeberria")) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray()),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray())))).doCall().checkResult(true) ;
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
    ResultsHandler.add_result(new String("hashtable"),resultIs) ;
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
TestResult<HashTable<Integer,String>,Void> v_0 = null ;
HashTable<Integer,String> v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_14") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_14")) ;
if (ok_sofar)
{
  v_0 = new Constructor(2).doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new Put(v_1,new Integer(3),new String("Alzaga")).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray()),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(3,new String("Alzaga"))))))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Remove(v_1,new Integer(3)).doCall().checkResult(new String("Alzaga")) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray()),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray())))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Size(v_1).doCall().checkResult(new Integer(0)) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray()),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray())))).doCall().checkResult(true) ;
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
    ResultsHandler.add_result(new String("hashtable"),resultIs) ;
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
TestResult<HashTable<Integer,String>,Void> v_0 = null ;
HashTable<Integer,String> v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_15") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_15")) ;
if (ok_sofar)
{
  v_0 = new Constructor(2).doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new Put(v_1,new Integer(0),new String("hola")).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(0,new String("hola")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray())))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,new Integer(0),new String("si")).doCall().checkResult(new String("hola")) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(0,new String("si")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray())))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,new Integer(0),new String("no")).doCall().checkResult(new String("si")) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(0,new String("no")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray())))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Size(v_1).doCall().checkResult(new Integer(1)) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(0,new String("no")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray())))).doCall().checkResult(true) ;
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
    ResultsHandler.add_result(new String("hashtable"),resultIs) ;
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
TestResult<HashTable<Integer,String>,Void> v_0 = null ;
HashTable<Integer,String> v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_16") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_16")) ;
if (ok_sofar)
{
  v_0 = new Constructor(5).doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new IsEmpty(v_1).doCall().checkResult(new Boolean(true)) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray()),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray()),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray()),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray()),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray())))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,new Integer(0),new String("hola")).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(0,new String("hola")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray()),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray()),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray()),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray())))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Size(v_1).doCall().checkResult(new Integer(1)) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(0,new String("hola")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray()),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray()),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray()),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray())))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new IsEmpty(v_1).doCall().checkResult(new Boolean(false)) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(0,new String("hola")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray()),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray()),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray()),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray())))).doCall().checkResult(true) ;
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
    ResultsHandler.add_result(new String("hashtable"),resultIs) ;
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
TestResult<HashTable<Integer,String>,Void> v_0 = null ;
HashTable<Integer,String> v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_17") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_17")) ;
if (ok_sofar)
{
  v_0 = new Constructor(5).doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new Put(v_1,new Integer(0),new String("hola")).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(0,new String("hola")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray()),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray()),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray()),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray())))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new ContainsKey(v_1,new Integer(0)).doCall().checkResult(new Boolean(true)) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(0,new String("hola")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray()),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray()),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray()),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray())))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,new Integer(0)).doCall().checkResult(new String("hola")) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(0,new String("hola")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray()),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray()),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray()),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray())))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,new Integer(1)).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(0,new String("hola")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray()),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray()),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray()),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray())))).doCall().checkResult(true) ;
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
    ResultsHandler.add_result(new String("hashtable"),resultIs) ;
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
TestResult<HashTable<Integer,String>,Void> v_0 = null ;
HashTable<Integer,String> v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_18") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_18")) ;
if (ok_sofar)
{
  v_0 = new Constructor(1).doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new Remove(v_1,new Integer(0)).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray())))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new IsEmpty(v_1).doCall().checkResult(new Boolean(true)) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray())))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Remove(v_1,new Integer(5)).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray())))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,new Integer(2)).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray())))).doCall().checkResult(true) ;
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
    ResultsHandler.add_result(new String("hashtable"),resultIs) ;
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
TestResult<HashTable<Integer,String>,Void> v_0 = null ;
HashTable<Integer,String> v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_19") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_19")) ;
if (ok_sofar)
{
  v_0 = new Constructor(1).doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new Get(v_1,new Integer(7)).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray())))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,new Integer(2),new String("Bonet")).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(2,new String("Bonet"))))))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,new Integer(6),new String("Boix")).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(2,new String("Bonet")),new HashEntry<Integer,String>(6,new String("Boix"))))))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new IsEmpty(v_1).doCall().checkResult(new Boolean(false)) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(2,new String("Bonet")),new HashEntry<Integer,String>(6,new String("Boix"))))))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,new Integer(7),new String("Echeberria")).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(2,new String("Bonet")),new HashEntry<Integer,String>(6,new String("Boix")),new HashEntry<Integer,String>(7,new String("Echeberria"))))))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Size(v_1).doCall().checkResult(new Integer(3)) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(2,new String("Bonet")),new HashEntry<Integer,String>(6,new String("Boix")),new HashEntry<Integer,String>(7,new String("Echeberria"))))))).doCall().checkResult(true) ;
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
    ResultsHandler.add_result(new String("hashtable"),resultIs) ;
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
TestResult<HashTable<Integer,String>,Void> v_0 = null ;
HashTable<Integer,String> v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_20") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_20")) ;
if (ok_sofar)
{
  v_0 = new Constructor(1).doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new Put(v_1,new Integer(6),new String("Rodriguez")).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(6,new String("Rodriguez"))))))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Keys(v_1).doCall().checkResult(new Integer[] { new Integer(6) }) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(6,new String("Rodriguez"))))))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,new Integer(3),new String("Albuixech")).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(6,new String("Rodriguez")),new HashEntry<Integer,String>(3,new String("Albuixech"))))))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Remove(v_1,new Integer(6)).doCall().checkResult(new String("Rodriguez")) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(3,new String("Albuixech"))))))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,new Integer(8),new String("Albuixech")).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(3,new String("Albuixech")),new HashEntry<Integer,String>(8,new String("Albuixech"))))))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,new Integer(10),new String("Boix")).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(3,new String("Albuixech")),new HashEntry<Integer,String>(8,new String("Albuixech")),new HashEntry<Integer,String>(10,new String("Boix"))))))).doCall().checkResult(true) ;
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
    ResultsHandler.add_result(new String("hashtable"),resultIs) ;
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
TestResult<HashTable<Integer,String>,Void> v_0 = null ;
HashTable<Integer,String> v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_21") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_21")) ;
if (ok_sofar)
{
  v_0 = new Constructor(2).doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new IsEmpty(v_1).doCall().checkResult(new Boolean(true)) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray()),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray())))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Keys(v_1).doCall().checkResult(new Integer[] {  }) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray()),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray())))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,new Integer(4),new String("Perez")).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(4,new String("Perez")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray())))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,new Integer(2),new String("Prats")).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(4,new String("Perez")),new HashEntry<Integer,String>(2,new String("Prats")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray())))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,new Integer(2)).doCall().checkResult(new String("Prats")) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(4,new String("Perez")),new HashEntry<Integer,String>(2,new String("Prats")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray())))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,new Integer(2),new String("Goicoechea")).doCall().checkResult(new String("Prats")) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(4,new String("Perez")),new HashEntry<Integer,String>(2,new String("Goicoechea")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray())))).doCall().checkResult(true) ;
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
    ResultsHandler.add_result(new String("hashtable"),resultIs) ;
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
TestResult<HashTable<Integer,String>,Void> v_0 = null ;
HashTable<Integer,String> v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_22") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_22")) ;
if (ok_sofar)
{
  v_0 = new Constructor(4).doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new Put(v_1,new Integer(2),new String("Llorente")).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray()),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray()),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(2,new String("Llorente")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray())))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,new Integer(6),new String("Goicoechea")).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray()),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray()),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(2,new String("Llorente")),new HashEntry<Integer,String>(6,new String("Goicoechea")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray())))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,new Integer(2),new String("Llorente")).doCall().checkResult(new String("Llorente")) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray()),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray()),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(2,new String("Llorente")),new HashEntry<Integer,String>(6,new String("Goicoechea")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray())))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,new Integer(2)).doCall().checkResult(new String("Llorente")) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray()),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray()),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(2,new String("Llorente")),new HashEntry<Integer,String>(6,new String("Goicoechea")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray())))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,new Integer(1),new String("Goicoechea")).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray()),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(1,new String("Goicoechea")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(2,new String("Llorente")),new HashEntry<Integer,String>(6,new String("Goicoechea")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray())))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,new Integer(10),new String("Benach")).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray()),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(1,new String("Goicoechea")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(2,new String("Llorente")),new HashEntry<Integer,String>(6,new String("Goicoechea")),new HashEntry<Integer,String>(10,new String("Benach")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray())))).doCall().checkResult(true) ;
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
    ResultsHandler.add_result(new String("hashtable"),resultIs) ;
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
TestResult<HashTable<Integer,String>,Void> v_0 = null ;
HashTable<Integer,String> v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_23") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_23")) ;
if (ok_sofar)
{
  v_0 = new Constructor(4).doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new IsEmpty(v_1).doCall().checkResult(new Boolean(true)) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray()),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray()),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray()),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray())))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,new Integer(0),new String("hola")).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(0,new String("hola")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray()),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray()),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray())))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Size(v_1).doCall().checkResult(new Integer(1)) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(0,new String("hola")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray()),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray()),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray())))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new IsEmpty(v_1).doCall().checkResult(new Boolean(false)) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(0,new String("hola")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray()),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray()),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray())))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Remove(v_1,new Integer(0)).doCall().checkResult(new String("hola")) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray()),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray()),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray()),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray())))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Size(v_1).doCall().checkResult(new Integer(0)) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray()),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray()),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray()),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray())))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new IsEmpty(v_1).doCall().checkResult(new Boolean(true)) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray()),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray()),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray()),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray())))).doCall().checkResult(true) ;
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
    ResultsHandler.add_result(new String("hashtable"),resultIs) ;
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
TestResult<HashTable<Integer,String>,Void> v_0 = null ;
HashTable<Integer,String> v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_24") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_24")) ;
if (ok_sofar)
{
  v_0 = new Constructor(4).doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new Size(v_1).doCall().checkResult(new Integer(0)) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray()),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray()),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray()),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray())))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,new Integer(5),new String("Martinez")).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray()),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(5,new String("Martinez")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray()),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray())))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Entries(v_1).doCall().checkResult(TestUtils.toGenericArray(new HashEntry<Integer,String>(5,new String("Martinez")))) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray()),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(5,new String("Martinez")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray()),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray())))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,new Integer(8),new String("Marin")).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(8,new String("Marin")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(5,new String("Martinez")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray()),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray())))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,new Integer(5)).doCall().checkResult(new String("Martinez")) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(8,new String("Marin")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(5,new String("Martinez")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray()),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray())))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,new Integer(8)).doCall().checkResult(new String("Marin")) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(8,new String("Marin")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(5,new String("Martinez")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray()),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray())))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,new Integer(6),new String("Goicoechea")).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(8,new String("Marin")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(5,new String("Martinez")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(6,new String("Goicoechea")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray())))).doCall().checkResult(true) ;
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
    ResultsHandler.add_result(new String("hashtable"),resultIs) ;
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
TestResult<HashTable<Integer,String>,Void> v_0 = null ;
HashTable<Integer,String> v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_25") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_25")) ;
if (ok_sofar)
{
  v_0 = new Constructor(1).doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new Get(v_1,new Integer(6)).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray())))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,new Integer(4),new String("Marti")).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(4,new String("Marti"))))))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new ContainsKey(v_1,new Integer(4)).doCall().checkResult(new Boolean(true)) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(4,new String("Marti"))))))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Entries(v_1).doCall().checkResult(TestUtils.toGenericArray(new HashEntry<Integer,String>(4,new String("Marti")))) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(4,new String("Marti"))))))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Entries(v_1).doCall().checkResult(TestUtils.toGenericArray(new HashEntry<Integer,String>(4,new String("Marti")))) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(4,new String("Marti"))))))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,new Integer(1),new String("Marin")).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(4,new String("Marti")),new HashEntry<Integer,String>(1,new String("Marin"))))))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,new Integer(1)).doCall().checkResult(new String("Marin")) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(4,new String("Marti")),new HashEntry<Integer,String>(1,new String("Marin"))))))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,new Integer(1)).doCall().checkResult(new String("Marin")) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(4,new String("Marti")),new HashEntry<Integer,String>(1,new String("Marin"))))))).doCall().checkResult(true) ;
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
    ResultsHandler.add_result(new String("hashtable"),resultIs) ;
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
TestResult<HashTable<Integer,String>,Void> v_0 = null ;
HashTable<Integer,String> v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_26") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_26")) ;
if (ok_sofar)
{
  v_0 = new Constructor(3).doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new Remove(v_1,new Integer(1)).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray()),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray()),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray())))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,new Integer(10),new String("Herrera")).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray()),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(10,new String("Herrera")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray())))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,new Integer(1),new String("Ferrer")).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray()),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(10,new String("Herrera")),new HashEntry<Integer,String>(1,new String("Ferrer")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray())))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Remove(v_1,new Integer(9)).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray()),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(10,new String("Herrera")),new HashEntry<Integer,String>(1,new String("Ferrer")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray())))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,new Integer(10),new String("Llorente")).doCall().checkResult(new String("Herrera")) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray()),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(10,new String("Llorente")),new HashEntry<Integer,String>(1,new String("Ferrer")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray())))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,new Integer(0),new String("Herrera")).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(0,new String("Herrera")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(10,new String("Llorente")),new HashEntry<Integer,String>(1,new String("Ferrer")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray())))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new ContainsKey(v_1,new Integer(0)).doCall().checkResult(new Boolean(true)) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(0,new String("Herrera")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(10,new String("Llorente")),new HashEntry<Integer,String>(1,new String("Ferrer")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray())))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Entries(v_1).doCall().checkResult(TestUtils.toGenericArray(new HashEntry<Integer,String>(0,new String("Herrera")),new HashEntry<Integer,String>(10,new String("Llorente")),new HashEntry<Integer,String>(1,new String("Ferrer")))) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(0,new String("Herrera")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(10,new String("Llorente")),new HashEntry<Integer,String>(1,new String("Ferrer")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray())))).doCall().checkResult(true) ;
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
    ResultsHandler.add_result(new String("hashtable"),resultIs) ;
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
TestResult<HashTable<Integer,String>,Void> v_0 = null ;
HashTable<Integer,String> v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_27") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_27")) ;
if (ok_sofar)
{
  v_0 = new Constructor(1).doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new Put(v_1,new Integer(10),new String("Echeberria")).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(10,new String("Echeberria"))))))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,new Integer(4),new String("Rodriguez")).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(10,new String("Echeberria")),new HashEntry<Integer,String>(4,new String("Rodriguez"))))))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,new Integer(8),new String("Bonet")).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(10,new String("Echeberria")),new HashEntry<Integer,String>(4,new String("Rodriguez")),new HashEntry<Integer,String>(8,new String("Bonet"))))))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,new Integer(1),new String("Herrera")).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(10,new String("Echeberria")),new HashEntry<Integer,String>(4,new String("Rodriguez")),new HashEntry<Integer,String>(8,new String("Bonet")),new HashEntry<Integer,String>(1,new String("Herrera"))))))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,new Integer(3),new String("Fernandez")).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(10,new String("Echeberria")),new HashEntry<Integer,String>(4,new String("Rodriguez")),new HashEntry<Integer,String>(8,new String("Bonet")),new HashEntry<Integer,String>(1,new String("Herrera")),new HashEntry<Integer,String>(3,new String("Fernandez"))))))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Remove(v_1,new Integer(8)).doCall().checkResult(new String("Bonet")) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(10,new String("Echeberria")),new HashEntry<Integer,String>(4,new String("Rodriguez")),new HashEntry<Integer,String>(1,new String("Herrera")),new HashEntry<Integer,String>(3,new String("Fernandez"))))))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Entries(v_1).doCall().checkResult(TestUtils.toGenericArray(new HashEntry<Integer,String>(10,new String("Echeberria")),new HashEntry<Integer,String>(4,new String("Rodriguez")),new HashEntry<Integer,String>(1,new String("Herrera")),new HashEntry<Integer,String>(3,new String("Fernandez")))) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(10,new String("Echeberria")),new HashEntry<Integer,String>(4,new String("Rodriguez")),new HashEntry<Integer,String>(1,new String("Herrera")),new HashEntry<Integer,String>(3,new String("Fernandez"))))))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,new Integer(3)).doCall().checkResult(new String("Fernandez")) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(10,new String("Echeberria")),new HashEntry<Integer,String>(4,new String("Rodriguez")),new HashEntry<Integer,String>(1,new String("Herrera")),new HashEntry<Integer,String>(3,new String("Fernandez"))))))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,new Integer(8),new String("Garcia")).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(10,new String("Echeberria")),new HashEntry<Integer,String>(4,new String("Rodriguez")),new HashEntry<Integer,String>(1,new String("Herrera")),new HashEntry<Integer,String>(3,new String("Fernandez")),new HashEntry<Integer,String>(8,new String("Garcia"))))))).doCall().checkResult(true) ;
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
    ResultsHandler.add_result(new String("hashtable"),resultIs) ;
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
TestResult<HashTable<Integer,String>,Void> v_0 = null ;
HashTable<Integer,String> v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_28") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_28")) ;
if (ok_sofar)
{
  v_0 = new Constructor(2).doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new Put(v_1,new Integer(7),new String("Albuixech")).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray()),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(7,new String("Albuixech"))))))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,new Integer(0),new String("Lopez")).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(0,new String("Lopez")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(7,new String("Albuixech"))))))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Keys(v_1).doCall().checkResult(new Integer[] { new Integer(0),new Integer(7) }) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(0,new String("Lopez")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(7,new String("Albuixech"))))))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Entries(v_1).doCall().checkResult(TestUtils.toGenericArray(new HashEntry<Integer,String>(0,new String("Lopez")),new HashEntry<Integer,String>(7,new String("Albuixech")))) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(0,new String("Lopez")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(7,new String("Albuixech"))))))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new IsEmpty(v_1).doCall().checkResult(new Boolean(false)) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(0,new String("Lopez")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(7,new String("Albuixech"))))))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new IsEmpty(v_1).doCall().checkResult(new Boolean(false)) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(0,new String("Lopez")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(7,new String("Albuixech"))))))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,new Integer(7),new String("Perez")).doCall().checkResult(new String("Albuixech")) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(0,new String("Lopez")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(7,new String("Perez"))))))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Remove(v_1,new Integer(0)).doCall().checkResult(new String("Lopez")) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray()),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(7,new String("Perez"))))))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new ContainsKey(v_1,new Integer(7)).doCall().checkResult(new Boolean(true)) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray()),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(7,new String("Perez"))))))).doCall().checkResult(true) ;
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
    ResultsHandler.add_result(new String("hashtable"),resultIs) ;
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
TestResult<HashTable<Integer,String>,Void> v_0 = null ;
HashTable<Integer,String> v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_29") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_29")) ;
if (ok_sofar)
{
  v_0 = new Constructor(2).doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new Put(v_1,new Integer(10),new String("Rossello")).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(10,new String("Rossello")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray())))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Remove(v_1,new Integer(10)).doCall().checkResult(new String("Rossello")) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray()),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray())))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Remove(v_1,new Integer(9)).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray()),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray())))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Keys(v_1).doCall().checkResult(new Integer[] {  }) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray()),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray())))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,new Integer(3),new String("Ferrer")).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray()),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(3,new String("Ferrer"))))))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Remove(v_1,new Integer(0)).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray()),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(3,new String("Ferrer"))))))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,new Integer(2),new String("Echeberria")).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(2,new String("Echeberria")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(3,new String("Ferrer"))))))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,new Integer(2)).doCall().checkResult(new String("Echeberria")) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(2,new String("Echeberria")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(3,new String("Ferrer"))))))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Remove(v_1,new Integer(7)).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(2,new String("Echeberria")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(3,new String("Ferrer"))))))).doCall().checkResult(true) ;
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
    ResultsHandler.add_result(new String("hashtable"),resultIs) ;
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
TestResult<HashTable<Integer,String>,Void> v_0 = null ;
HashTable<Integer,String> v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_30") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_30")) ;
if (ok_sofar)
{
  v_0 = new Constructor(4).doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new Put(v_1,new Integer(10),new String("Albuixech")).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray()),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray()),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(10,new String("Albuixech")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray())))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new ContainsKey(v_1,new Integer(4)).doCall().checkResult(new Boolean(false)) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray()),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray()),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(10,new String("Albuixech")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray())))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new IsEmpty(v_1).doCall().checkResult(new Boolean(false)) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray()),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray()),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(10,new String("Albuixech")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray())))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,new Integer(6),new String("Rossello")).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray()),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray()),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(10,new String("Albuixech")),new HashEntry<Integer,String>(6,new String("Rossello")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray())))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,new Integer(6),new String("Fernandez")).doCall().checkResult(new String("Rossello")) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray()),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray()),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(10,new String("Albuixech")),new HashEntry<Integer,String>(6,new String("Fernandez")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray())))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,new Integer(6)).doCall().checkResult(new String("Fernandez")) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray()),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray()),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(10,new String("Albuixech")),new HashEntry<Integer,String>(6,new String("Fernandez")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray())))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,new Integer(9),new String("Rossello")).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray()),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(9,new String("Rossello")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(10,new String("Albuixech")),new HashEntry<Integer,String>(6,new String("Fernandez")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray())))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Keys(v_1).doCall().checkResult(new Integer[] { new Integer(9),new Integer(10),new Integer(6) }) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray()),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(9,new String("Rossello")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(10,new String("Albuixech")),new HashEntry<Integer,String>(6,new String("Fernandez")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray())))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,new Integer(1),new String("Llorente")).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray()),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(9,new String("Rossello")),new HashEntry<Integer,String>(1,new String("Llorente")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(10,new String("Albuixech")),new HashEntry<Integer,String>(6,new String("Fernandez")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray())))).doCall().checkResult(true) ;
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
    ResultsHandler.add_result(new String("hashtable"),resultIs) ;
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
TestResult<HashTable<Integer,String>,Void> v_0 = null ;
HashTable<Integer,String> v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_31") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_31")) ;
if (ok_sofar)
{
  v_0 = new Constructor(1).doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new Put(v_1,new Integer(0),new String("hola")).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(0,new String("hola"))))))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,new Integer(1),new String("si")).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(0,new String("hola")),new HashEntry<Integer,String>(1,new String("si"))))))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,new Integer(2),new String("no")).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(0,new String("hola")),new HashEntry<Integer,String>(1,new String("si")),new HashEntry<Integer,String>(2,new String("no"))))))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Size(v_1).doCall().checkResult(new Integer(3)) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(0,new String("hola")),new HashEntry<Integer,String>(1,new String("si")),new HashEntry<Integer,String>(2,new String("no"))))))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Keys(v_1).doCall().checkResult(new Integer[] { new Integer(0),new Integer(1),new Integer(2) }) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(0,new String("hola")),new HashEntry<Integer,String>(1,new String("si")),new HashEntry<Integer,String>(2,new String("no"))))))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Remove(v_1,new Integer(0)).doCall().checkResult(new String("hola")) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(1,new String("si")),new HashEntry<Integer,String>(2,new String("no"))))))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Remove(v_1,new Integer(2)).doCall().checkResult(new String("no")) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(1,new String("si"))))))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Remove(v_1,new Integer(1)).doCall().checkResult(new String("si")) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray())))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Remove(v_1,new Integer(1)).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray())))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Keys(v_1).doCall().checkResult(new Integer[] {  }) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray())))).doCall().checkResult(true) ;
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
    ResultsHandler.add_result(new String("hashtable"),resultIs) ;
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
TestResult<HashTable<Integer,String>,Void> v_0 = null ;
HashTable<Integer,String> v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_32") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_32")) ;
if (ok_sofar)
{
  v_0 = new Constructor(3).doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new IsEmpty(v_1).doCall().checkResult(new Boolean(true)) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray()),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray()),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray())))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,new Integer(0),new String("hola")).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(0,new String("hola")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray()),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray())))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Size(v_1).doCall().checkResult(new Integer(1)) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(0,new String("hola")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray()),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray())))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new IsEmpty(v_1).doCall().checkResult(new Boolean(false)) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(0,new String("hola")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray()),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray())))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Remove(v_1,new Integer(0)).doCall().checkResult(new String("hola")) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray()),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray()),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray())))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Size(v_1).doCall().checkResult(new Integer(0)) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray()),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray()),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray())))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new IsEmpty(v_1).doCall().checkResult(new Boolean(true)) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray()),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray()),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray())))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,new Integer(0),new String("hola")).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(0,new String("hola")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray()),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray())))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Size(v_1).doCall().checkResult(new Integer(1)) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(0,new String("hola")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray()),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray())))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new IsEmpty(v_1).doCall().checkResult(new Boolean(false)) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(0,new String("hola")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray()),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray())))).doCall().checkResult(true) ;
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
    ResultsHandler.add_result(new String("hashtable"),resultIs) ;
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
TestResult<HashTable<Integer,String>,Void> v_0 = null ;
HashTable<Integer,String> v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_33") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_33")) ;
if (ok_sofar)
{
  v_0 = new Constructor(5).doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new Remove(v_1,new Integer(9)).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray()),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray()),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray()),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray()),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray())))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Entries(v_1).doCall().checkResult(TestUtils.toGenericArray()) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray()),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray()),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray()),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray()),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray())))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,new Integer(8),new String("Rodriguez")).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray()),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray()),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray()),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(8,new String("Rodriguez")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray())))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,new Integer(7),new String("Goicoechea")).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray()),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray()),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(7,new String("Goicoechea")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(8,new String("Rodriguez")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray())))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Keys(v_1).doCall().checkResult(new Integer[] { new Integer(7),new Integer(8) }) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray()),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray()),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(7,new String("Goicoechea")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(8,new String("Rodriguez")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray())))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Remove(v_1,new Integer(8)).doCall().checkResult(new String("Rodriguez")) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray()),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray()),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(7,new String("Goicoechea")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray()),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray())))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,new Integer(7),new String("Ferrer")).doCall().checkResult(new String("Goicoechea")) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray()),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray()),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(7,new String("Ferrer")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray()),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray())))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,new Integer(10),new String("Marti")).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(10,new String("Marti")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray()),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(7,new String("Ferrer")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray()),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray())))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,new Integer(2),new String("Gonzalez")).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(10,new String("Marti")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray()),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(7,new String("Ferrer")),new HashEntry<Integer,String>(2,new String("Gonzalez")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray()),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray())))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,new Integer(7)).doCall().checkResult(new String("Ferrer")) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(10,new String("Marti")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray()),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(7,new String("Ferrer")),new HashEntry<Integer,String>(2,new String("Gonzalez")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray()),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray())))).doCall().checkResult(true) ;
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
    ResultsHandler.add_result(new String("hashtable"),resultIs) ;
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
TestResult<HashTable<Integer,String>,Void> v_0 = null ;
HashTable<Integer,String> v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_34") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_34")) ;
if (ok_sofar)
{
  v_0 = new Constructor(1).doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new Put(v_1,new Integer(2),new String("Rodriguez")).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(2,new String("Rodriguez"))))))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Remove(v_1,new Integer(10)).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(2,new String("Rodriguez"))))))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Entries(v_1).doCall().checkResult(TestUtils.toGenericArray(new HashEntry<Integer,String>(2,new String("Rodriguez")))) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(2,new String("Rodriguez"))))))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,new Integer(2)).doCall().checkResult(new String("Rodriguez")) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(2,new String("Rodriguez"))))))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,new Integer(0),new String("Llorente")).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(2,new String("Rodriguez")),new HashEntry<Integer,String>(0,new String("Llorente"))))))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new ContainsKey(v_1,new Integer(0)).doCall().checkResult(new Boolean(true)) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(2,new String("Rodriguez")),new HashEntry<Integer,String>(0,new String("Llorente"))))))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,new Integer(2),new String("Navarro")).doCall().checkResult(new String("Rodriguez")) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(2,new String("Navarro")),new HashEntry<Integer,String>(0,new String("Llorente"))))))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Remove(v_1,new Integer(2)).doCall().checkResult(new String("Navarro")) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(0,new String("Llorente"))))))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Remove(v_1,new Integer(0)).doCall().checkResult(new String("Llorente")) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray())))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,new Integer(10),new String("Martinez")).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(10,new String("Martinez"))))))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new ContainsKey(v_1,new Integer(10)).doCall().checkResult(new Boolean(true)) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(10,new String("Martinez"))))))).doCall().checkResult(true) ;
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
    ResultsHandler.add_result(new String("hashtable"),resultIs) ;
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
TestResult<HashTable<Integer,String>,Void> v_0 = null ;
HashTable<Integer,String> v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_35") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_35")) ;
if (ok_sofar)
{
  v_0 = new Constructor(2).doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new Get(v_1,new Integer(9)).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray()),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray())))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new IsEmpty(v_1).doCall().checkResult(new Boolean(true)) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray()),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray())))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new IsEmpty(v_1).doCall().checkResult(new Boolean(true)) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray()),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray())))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,new Integer(10)).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray()),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray())))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,new Integer(6),new String("Goicoechea")).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(6,new String("Goicoechea")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray())))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new IsEmpty(v_1).doCall().checkResult(new Boolean(false)) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(6,new String("Goicoechea")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray())))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new IsEmpty(v_1).doCall().checkResult(new Boolean(false)) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(6,new String("Goicoechea")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray())))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new ContainsKey(v_1,new Integer(6)).doCall().checkResult(new Boolean(true)) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(6,new String("Goicoechea")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray())))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new ContainsKey(v_1,new Integer(6)).doCall().checkResult(new Boolean(true)) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(6,new String("Goicoechea")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray())))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Keys(v_1).doCall().checkResult(new Integer[] { new Integer(6) }) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(6,new String("Goicoechea")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray())))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,new Integer(2),new String("Bonet")).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(6,new String("Goicoechea")),new HashEntry<Integer,String>(2,new String("Bonet")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray())))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Entries(v_1).doCall().checkResult(TestUtils.toGenericArray(new HashEntry<Integer,String>(6,new String("Goicoechea")),new HashEntry<Integer,String>(2,new String("Bonet")))) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(6,new String("Goicoechea")),new HashEntry<Integer,String>(2,new String("Bonet")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray())))).doCall().checkResult(true) ;
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
    ResultsHandler.add_result(new String("hashtable"),resultIs) ;
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
TestResult<HashTable<Integer,String>,Void> v_0 = null ;
HashTable<Integer,String> v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_36") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_36")) ;
if (ok_sofar)
{
  v_0 = new Constructor(1).doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new Put(v_1,new Integer(0),new String("hola")).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(0,new String("hola"))))))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,new Integer(1),new String("si")).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(0,new String("hola")),new HashEntry<Integer,String>(1,new String("si"))))))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,new Integer(2),new String("no")).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(0,new String("hola")),new HashEntry<Integer,String>(1,new String("si")),new HashEntry<Integer,String>(2,new String("no"))))))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,new Integer(0),new String("abc")).doCall().checkResult(new String("hola")) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(0,new String("abc")),new HashEntry<Integer,String>(1,new String("si")),new HashEntry<Integer,String>(2,new String("no"))))))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,new Integer(1),new String("def")).doCall().checkResult(new String("si")) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(0,new String("abc")),new HashEntry<Integer,String>(1,new String("def")),new HashEntry<Integer,String>(2,new String("no"))))))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,new Integer(2),new String("ghi")).doCall().checkResult(new String("no")) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(0,new String("abc")),new HashEntry<Integer,String>(1,new String("def")),new HashEntry<Integer,String>(2,new String("ghi"))))))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,new Integer(0)).doCall().checkResult(new String("abc")) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(0,new String("abc")),new HashEntry<Integer,String>(1,new String("def")),new HashEntry<Integer,String>(2,new String("ghi"))))))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,new Integer(1)).doCall().checkResult(new String("def")) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(0,new String("abc")),new HashEntry<Integer,String>(1,new String("def")),new HashEntry<Integer,String>(2,new String("ghi"))))))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,new Integer(2)).doCall().checkResult(new String("ghi")) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(0,new String("abc")),new HashEntry<Integer,String>(1,new String("def")),new HashEntry<Integer,String>(2,new String("ghi"))))))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new ContainsKey(v_1,new Integer(0)).doCall().checkResult(new Boolean(true)) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(0,new String("abc")),new HashEntry<Integer,String>(1,new String("def")),new HashEntry<Integer,String>(2,new String("ghi"))))))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new ContainsKey(v_1,new Integer(1)).doCall().checkResult(new Boolean(true)) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(0,new String("abc")),new HashEntry<Integer,String>(1,new String("def")),new HashEntry<Integer,String>(2,new String("ghi"))))))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new ContainsKey(v_1,new Integer(2)).doCall().checkResult(new Boolean(true)) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(0,new String("abc")),new HashEntry<Integer,String>(1,new String("def")),new HashEntry<Integer,String>(2,new String("ghi"))))))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Size(v_1).doCall().checkResult(new Integer(3)) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(0,new String("abc")),new HashEntry<Integer,String>(1,new String("def")),new HashEntry<Integer,String>(2,new String("ghi"))))))).doCall().checkResult(true) ;
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
    ResultsHandler.add_result(new String("hashtable"),resultIs) ;
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
TestResult<HashTable<Integer,String>,Void> v_0 = null ;
HashTable<Integer,String> v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_37") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_37")) ;
if (ok_sofar)
{
  v_0 = new Constructor(2).doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new Remove(v_1,new Integer(2)).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray()),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray())))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new IsEmpty(v_1).doCall().checkResult(new Boolean(true)) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray()),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray())))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Keys(v_1).doCall().checkResult(new Integer[] {  }) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray()),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray())))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Remove(v_1,new Integer(9)).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray()),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray())))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,new Integer(1),new String("Echeberria")).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray()),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(1,new String("Echeberria"))))))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Size(v_1).doCall().checkResult(new Integer(1)) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray()),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(1,new String("Echeberria"))))))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,new Integer(6),new String("Navarro")).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(6,new String("Navarro")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(1,new String("Echeberria"))))))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Entries(v_1).doCall().checkResult(TestUtils.toGenericArray(new HashEntry<Integer,String>(6,new String("Navarro")),new HashEntry<Integer,String>(1,new String("Echeberria")))) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(6,new String("Navarro")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(1,new String("Echeberria"))))))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,new Integer(6),new String("Rossello")).doCall().checkResult(new String("Navarro")) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(6,new String("Rossello")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(1,new String("Echeberria"))))))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Remove(v_1,new Integer(1)).doCall().checkResult(new String("Echeberria")) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(6,new String("Rossello")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray())))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,new Integer(9),new String("Castro")).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(6,new String("Rossello")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(9,new String("Castro"))))))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,new Integer(8),new String("Martinez")).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(6,new String("Rossello")),new HashEntry<Integer,String>(8,new String("Martinez")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(9,new String("Castro"))))))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,new Integer(9),new String("Albuixech")).doCall().checkResult(new String("Castro")) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(6,new String("Rossello")),new HashEntry<Integer,String>(8,new String("Martinez")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(9,new String("Albuixech"))))))).doCall().checkResult(true) ;
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
    ResultsHandler.add_result(new String("hashtable"),resultIs) ;
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
TestResult<HashTable<Integer,String>,Void> v_0 = null ;
HashTable<Integer,String> v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_38") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_38")) ;
if (ok_sofar)
{
  v_0 = new Constructor(2).doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new Remove(v_1,new Integer(3)).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray()),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray())))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,new Integer(5)).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray()),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray())))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Remove(v_1,new Integer(4)).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray()),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray())))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new IsEmpty(v_1).doCall().checkResult(new Boolean(true)) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray()),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray())))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,new Integer(5),new String("Garcia")).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray()),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(5,new String("Garcia"))))))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,new Integer(8),new String("Marin")).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(8,new String("Marin")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(5,new String("Garcia"))))))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,new Integer(8)).doCall().checkResult(new String("Marin")) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(8,new String("Marin")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(5,new String("Garcia"))))))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,new Integer(5)).doCall().checkResult(new String("Garcia")) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(8,new String("Marin")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(5,new String("Garcia"))))))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,new Integer(8)).doCall().checkResult(new String("Marin")) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(8,new String("Marin")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(5,new String("Garcia"))))))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Remove(v_1,new Integer(8)).doCall().checkResult(new String("Marin")) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray()),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(5,new String("Garcia"))))))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,new Integer(5),new String("Rodriguez")).doCall().checkResult(new String("Garcia")) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray()),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(5,new String("Rodriguez"))))))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,new Integer(6),new String("Prats")).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(6,new String("Prats")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(5,new String("Rodriguez"))))))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Keys(v_1).doCall().checkResult(new Integer[] { new Integer(6),new Integer(5) }) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(6,new String("Prats")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(5,new String("Rodriguez"))))))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Size(v_1).doCall().checkResult(new Integer(2)) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(6,new String("Prats")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(5,new String("Rodriguez"))))))).doCall().checkResult(true) ;
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
    ResultsHandler.add_result(new String("hashtable"),resultIs) ;
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
TestResult<HashTable<Integer,String>,Void> v_0 = null ;
HashTable<Integer,String> v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_39") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_39")) ;
if (ok_sofar)
{
  v_0 = new Constructor(4).doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new IsEmpty(v_1).doCall().checkResult(new Boolean(true)) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray()),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray()),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray()),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray())))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,new Integer(8),new String("Albuixech")).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(8,new String("Albuixech")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray()),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray()),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray())))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Remove(v_1,new Integer(8)).doCall().checkResult(new String("Albuixech")) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray()),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray()),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray()),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray())))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new IsEmpty(v_1).doCall().checkResult(new Boolean(true)) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray()),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray()),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray()),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray())))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,new Integer(4),new String("Alzaga")).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(4,new String("Alzaga")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray()),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray()),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray())))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new IsEmpty(v_1).doCall().checkResult(new Boolean(false)) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(4,new String("Alzaga")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray()),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray()),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray())))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new IsEmpty(v_1).doCall().checkResult(new Boolean(false)) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(4,new String("Alzaga")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray()),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray()),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray())))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,new Integer(3),new String("Sanchez")).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(4,new String("Alzaga")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray()),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray()),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(3,new String("Sanchez"))))))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,new Integer(6),new String("Sanchez")).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(4,new String("Alzaga")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray()),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(6,new String("Sanchez")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(3,new String("Sanchez"))))))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,new Integer(1),new String("Navarro")).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(4,new String("Alzaga")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(1,new String("Navarro")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(6,new String("Sanchez")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(3,new String("Sanchez"))))))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,new Integer(0),new String("Gonzalez")).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(4,new String("Alzaga")),new HashEntry<Integer,String>(0,new String("Gonzalez")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(1,new String("Navarro")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(6,new String("Sanchez")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(3,new String("Sanchez"))))))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Remove(v_1,new Integer(4)).doCall().checkResult(new String("Alzaga")) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(0,new String("Gonzalez")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(1,new String("Navarro")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(6,new String("Sanchez")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(3,new String("Sanchez"))))))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Remove(v_1,new Integer(9)).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(0,new String("Gonzalez")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(1,new String("Navarro")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(6,new String("Sanchez")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(3,new String("Sanchez"))))))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,new Integer(0)).doCall().checkResult(new String("Gonzalez")) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(0,new String("Gonzalez")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(1,new String("Navarro")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(6,new String("Sanchez")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(3,new String("Sanchez"))))))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new ContainsKey(v_1,new Integer(1)).doCall().checkResult(new Boolean(true)) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(0,new String("Gonzalez")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(1,new String("Navarro")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(6,new String("Sanchez")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(3,new String("Sanchez"))))))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,new Integer(4),new String("Navarro")).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(0,new String("Gonzalez")),new HashEntry<Integer,String>(4,new String("Navarro")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(1,new String("Navarro")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(6,new String("Sanchez")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(3,new String("Sanchez"))))))).doCall().checkResult(true) ;
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
    ResultsHandler.add_result(new String("hashtable"),resultIs) ;
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
TestResult<HashTable<Integer,String>,Void> v_0 = null ;
HashTable<Integer,String> v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_40") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_40")) ;
if (ok_sofar)
{
  v_0 = new Constructor(3).doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new ContainsKey(v_1,new Integer(7)).doCall().checkResult(new Boolean(false)) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray()),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray()),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray())))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,new Integer(9)).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray()),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray()),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray())))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Remove(v_1,new Integer(2)).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray()),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray()),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray())))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Remove(v_1,new Integer(1)).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray()),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray()),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray())))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,new Integer(0),new String("Prats")).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(0,new String("Prats")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray()),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray())))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,new Integer(3),new String("Sanchez")).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(0,new String("Prats")),new HashEntry<Integer,String>(3,new String("Sanchez")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray()),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray())))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new ContainsKey(v_1,new Integer(0)).doCall().checkResult(new Boolean(true)) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(0,new String("Prats")),new HashEntry<Integer,String>(3,new String("Sanchez")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray()),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray())))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,new Integer(6),new String("Gonzalez")).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(0,new String("Prats")),new HashEntry<Integer,String>(3,new String("Sanchez")),new HashEntry<Integer,String>(6,new String("Gonzalez")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray()),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray())))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Size(v_1).doCall().checkResult(new Integer(3)) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(0,new String("Prats")),new HashEntry<Integer,String>(3,new String("Sanchez")),new HashEntry<Integer,String>(6,new String("Gonzalez")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray()),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray())))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,new Integer(6),new String("Llorente")).doCall().checkResult(new String("Gonzalez")) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(0,new String("Prats")),new HashEntry<Integer,String>(3,new String("Sanchez")),new HashEntry<Integer,String>(6,new String("Llorente")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray()),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray())))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,new Integer(7),new String("Ferrer")).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(0,new String("Prats")),new HashEntry<Integer,String>(3,new String("Sanchez")),new HashEntry<Integer,String>(6,new String("Llorente")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(7,new String("Ferrer")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray())))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,new Integer(9)).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(0,new String("Prats")),new HashEntry<Integer,String>(3,new String("Sanchez")),new HashEntry<Integer,String>(6,new String("Llorente")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(7,new String("Ferrer")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray())))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new IsEmpty(v_1).doCall().checkResult(new Boolean(false)) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(0,new String("Prats")),new HashEntry<Integer,String>(3,new String("Sanchez")),new HashEntry<Integer,String>(6,new String("Llorente")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(7,new String("Ferrer")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray())))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,new Integer(6),new String("Herrera")).doCall().checkResult(new String("Llorente")) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(0,new String("Prats")),new HashEntry<Integer,String>(3,new String("Sanchez")),new HashEntry<Integer,String>(6,new String("Herrera")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(7,new String("Ferrer")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray())))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,new Integer(4),new String("Ferrer")).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(0,new String("Prats")),new HashEntry<Integer,String>(3,new String("Sanchez")),new HashEntry<Integer,String>(6,new String("Herrera")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(7,new String("Ferrer")),new HashEntry<Integer,String>(4,new String("Ferrer")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray())))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,new Integer(6),new String("Rodriguez")).doCall().checkResult(new String("Herrera")) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(0,new String("Prats")),new HashEntry<Integer,String>(3,new String("Sanchez")),new HashEntry<Integer,String>(6,new String("Rodriguez")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(7,new String("Ferrer")),new HashEntry<Integer,String>(4,new String("Ferrer")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray())))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,new Integer(10),new String("Sanchez")).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(0,new String("Prats")),new HashEntry<Integer,String>(3,new String("Sanchez")),new HashEntry<Integer,String>(6,new String("Rodriguez")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(7,new String("Ferrer")),new HashEntry<Integer,String>(4,new String("Ferrer")),new HashEntry<Integer,String>(10,new String("Sanchez")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray())))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new ContainsKey(v_1,new Integer(3)).doCall().checkResult(new Boolean(true)) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(0,new String("Prats")),new HashEntry<Integer,String>(3,new String("Sanchez")),new HashEntry<Integer,String>(6,new String("Rodriguez")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(7,new String("Ferrer")),new HashEntry<Integer,String>(4,new String("Ferrer")),new HashEntry<Integer,String>(10,new String("Sanchez")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray())))).doCall().checkResult(true) ;
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
    ResultsHandler.add_result(new String("hashtable"),resultIs) ;
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
TestResult<HashTable<Integer,String>,Void> v_0 = null ;
HashTable<Integer,String> v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_41") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_41")) ;
if (ok_sofar)
{
  v_0 = new Constructor(4).doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new Size(v_1).doCall().checkResult(new Integer(0)) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray()),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray()),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray()),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray())))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,new Integer(3),new String("Prats")).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray()),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray()),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray()),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(3,new String("Prats"))))))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Entries(v_1).doCall().checkResult(TestUtils.toGenericArray(new HashEntry<Integer,String>(3,new String("Prats")))) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray()),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray()),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray()),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(3,new String("Prats"))))))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new IsEmpty(v_1).doCall().checkResult(new Boolean(false)) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray()),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray()),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray()),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(3,new String("Prats"))))))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Size(v_1).doCall().checkResult(new Integer(1)) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray()),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray()),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray()),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(3,new String("Prats"))))))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Entries(v_1).doCall().checkResult(TestUtils.toGenericArray(new HashEntry<Integer,String>(3,new String("Prats")))) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray()),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray()),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray()),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(3,new String("Prats"))))))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,new Integer(2)).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray()),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray()),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray()),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(3,new String("Prats"))))))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,new Integer(3)).doCall().checkResult(new String("Prats")) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray()),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray()),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray()),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(3,new String("Prats"))))))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new IsEmpty(v_1).doCall().checkResult(new Boolean(false)) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray()),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray()),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray()),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(3,new String("Prats"))))))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,new Integer(7)).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray()),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray()),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray()),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(3,new String("Prats"))))))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,new Integer(3),new String("Ferrer")).doCall().checkResult(new String("Prats")) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray()),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray()),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray()),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(3,new String("Ferrer"))))))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,new Integer(3),new String("Perez")).doCall().checkResult(new String("Ferrer")) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray()),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray()),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray()),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(3,new String("Perez"))))))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,new Integer(9),new String("Sanchez")).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray()),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(9,new String("Sanchez")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray()),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(3,new String("Perez"))))))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Size(v_1).doCall().checkResult(new Integer(2)) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray()),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(9,new String("Sanchez")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray()),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(3,new String("Perez"))))))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,new Integer(10),new String("Llorente")).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray()),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(9,new String("Sanchez")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(10,new String("Llorente")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(3,new String("Perez"))))))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,new Integer(9)).doCall().checkResult(new String("Sanchez")) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray()),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(9,new String("Sanchez")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(10,new String("Llorente")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(3,new String("Perez"))))))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,new Integer(9)).doCall().checkResult(new String("Sanchez")) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray()),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(9,new String("Sanchez")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(10,new String("Llorente")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(3,new String("Perez"))))))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Size(v_1).doCall().checkResult(new Integer(3)) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray()),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(9,new String("Sanchez")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(10,new String("Llorente")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(3,new String("Perez"))))))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new IsEmpty(v_1).doCall().checkResult(new Boolean(false)) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray()),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(9,new String("Sanchez")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(10,new String("Llorente")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(3,new String("Perez"))))))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,new Integer(9),new String("Echeberria")).doCall().checkResult(new String("Sanchez")) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray()),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(9,new String("Echeberria")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(10,new String("Llorente")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(3,new String("Perez"))))))).doCall().checkResult(true) ;
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
    ResultsHandler.add_result(new String("hashtable"),resultIs) ;
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
TestResult<HashTable<Integer,String>,Void> v_0 = null ;
HashTable<Integer,String> v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_42") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_42")) ;
if (ok_sofar)
{
  v_0 = new Constructor(1).doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new IsEmpty(v_1).doCall().checkResult(new Boolean(true)) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray())))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new ContainsKey(v_1,new Integer(8)).doCall().checkResult(new Boolean(false)) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray())))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,new Integer(10)).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray())))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new IsEmpty(v_1).doCall().checkResult(new Boolean(true)) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray())))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,new Integer(2),new String("Rodriguez")).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(2,new String("Rodriguez"))))))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Remove(v_1,new Integer(10)).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(2,new String("Rodriguez"))))))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new IsEmpty(v_1).doCall().checkResult(new Boolean(false)) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(2,new String("Rodriguez"))))))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,new Integer(10),new String("Rodriguez")).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(2,new String("Rodriguez")),new HashEntry<Integer,String>(10,new String("Rodriguez"))))))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,new Integer(3),new String("Gonzalez")).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(2,new String("Rodriguez")),new HashEntry<Integer,String>(10,new String("Rodriguez")),new HashEntry<Integer,String>(3,new String("Gonzalez"))))))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,new Integer(4),new String("Boix")).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(2,new String("Rodriguez")),new HashEntry<Integer,String>(10,new String("Rodriguez")),new HashEntry<Integer,String>(3,new String("Gonzalez")),new HashEntry<Integer,String>(4,new String("Boix"))))))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,new Integer(10),new String("Gonzalez")).doCall().checkResult(new String("Rodriguez")) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(2,new String("Rodriguez")),new HashEntry<Integer,String>(10,new String("Gonzalez")),new HashEntry<Integer,String>(3,new String("Gonzalez")),new HashEntry<Integer,String>(4,new String("Boix"))))))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,new Integer(7),new String("Albuixech")).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(2,new String("Rodriguez")),new HashEntry<Integer,String>(10,new String("Gonzalez")),new HashEntry<Integer,String>(3,new String("Gonzalez")),new HashEntry<Integer,String>(4,new String("Boix")),new HashEntry<Integer,String>(7,new String("Albuixech"))))))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Keys(v_1).doCall().checkResult(new Integer[] { new Integer(2),new Integer(10),new Integer(3),new Integer(4),new Integer(7) }) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(2,new String("Rodriguez")),new HashEntry<Integer,String>(10,new String("Gonzalez")),new HashEntry<Integer,String>(3,new String("Gonzalez")),new HashEntry<Integer,String>(4,new String("Boix")),new HashEntry<Integer,String>(7,new String("Albuixech"))))))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,new Integer(5),new String("Benach")).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(2,new String("Rodriguez")),new HashEntry<Integer,String>(10,new String("Gonzalez")),new HashEntry<Integer,String>(3,new String("Gonzalez")),new HashEntry<Integer,String>(4,new String("Boix")),new HashEntry<Integer,String>(7,new String("Albuixech")),new HashEntry<Integer,String>(5,new String("Benach"))))))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,new Integer(8),new String("Echeberria")).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(2,new String("Rodriguez")),new HashEntry<Integer,String>(10,new String("Gonzalez")),new HashEntry<Integer,String>(3,new String("Gonzalez")),new HashEntry<Integer,String>(4,new String("Boix")),new HashEntry<Integer,String>(7,new String("Albuixech")),new HashEntry<Integer,String>(5,new String("Benach")),new HashEntry<Integer,String>(8,new String("Echeberria"))))))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,new Integer(8),new String("Lopez")).doCall().checkResult(new String("Echeberria")) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(2,new String("Rodriguez")),new HashEntry<Integer,String>(10,new String("Gonzalez")),new HashEntry<Integer,String>(3,new String("Gonzalez")),new HashEntry<Integer,String>(4,new String("Boix")),new HashEntry<Integer,String>(7,new String("Albuixech")),new HashEntry<Integer,String>(5,new String("Benach")),new HashEntry<Integer,String>(8,new String("Lopez"))))))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new IsEmpty(v_1).doCall().checkResult(new Boolean(false)) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(2,new String("Rodriguez")),new HashEntry<Integer,String>(10,new String("Gonzalez")),new HashEntry<Integer,String>(3,new String("Gonzalez")),new HashEntry<Integer,String>(4,new String("Boix")),new HashEntry<Integer,String>(7,new String("Albuixech")),new HashEntry<Integer,String>(5,new String("Benach")),new HashEntry<Integer,String>(8,new String("Lopez"))))))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Size(v_1).doCall().checkResult(new Integer(7)) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(2,new String("Rodriguez")),new HashEntry<Integer,String>(10,new String("Gonzalez")),new HashEntry<Integer,String>(3,new String("Gonzalez")),new HashEntry<Integer,String>(4,new String("Boix")),new HashEntry<Integer,String>(7,new String("Albuixech")),new HashEntry<Integer,String>(5,new String("Benach")),new HashEntry<Integer,String>(8,new String("Lopez"))))))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,new Integer(9),new String("Navarro")).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(2,new String("Rodriguez")),new HashEntry<Integer,String>(10,new String("Gonzalez")),new HashEntry<Integer,String>(3,new String("Gonzalez")),new HashEntry<Integer,String>(4,new String("Boix")),new HashEntry<Integer,String>(7,new String("Albuixech")),new HashEntry<Integer,String>(5,new String("Benach")),new HashEntry<Integer,String>(8,new String("Lopez")),new HashEntry<Integer,String>(9,new String("Navarro"))))))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,new Integer(7),new String("Prats")).doCall().checkResult(new String("Albuixech")) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(2,new String("Rodriguez")),new HashEntry<Integer,String>(10,new String("Gonzalez")),new HashEntry<Integer,String>(3,new String("Gonzalez")),new HashEntry<Integer,String>(4,new String("Boix")),new HashEntry<Integer,String>(7,new String("Prats")),new HashEntry<Integer,String>(5,new String("Benach")),new HashEntry<Integer,String>(8,new String("Lopez")),new HashEntry<Integer,String>(9,new String("Navarro"))))))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Keys(v_1).doCall().checkResult(new Integer[] { new Integer(2),new Integer(10),new Integer(3),new Integer(4),new Integer(7),new Integer(5),new Integer(8),new Integer(9) }) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(2,new String("Rodriguez")),new HashEntry<Integer,String>(10,new String("Gonzalez")),new HashEntry<Integer,String>(3,new String("Gonzalez")),new HashEntry<Integer,String>(4,new String("Boix")),new HashEntry<Integer,String>(7,new String("Prats")),new HashEntry<Integer,String>(5,new String("Benach")),new HashEntry<Integer,String>(8,new String("Lopez")),new HashEntry<Integer,String>(9,new String("Navarro"))))))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,new Integer(3),new String("Lopez")).doCall().checkResult(new String("Gonzalez")) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(2,new String("Rodriguez")),new HashEntry<Integer,String>(10,new String("Gonzalez")),new HashEntry<Integer,String>(3,new String("Lopez")),new HashEntry<Integer,String>(4,new String("Boix")),new HashEntry<Integer,String>(7,new String("Prats")),new HashEntry<Integer,String>(5,new String("Benach")),new HashEntry<Integer,String>(8,new String("Lopez")),new HashEntry<Integer,String>(9,new String("Navarro"))))))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,new Integer(5)).doCall().checkResult(new String("Benach")) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(2,new String("Rodriguez")),new HashEntry<Integer,String>(10,new String("Gonzalez")),new HashEntry<Integer,String>(3,new String("Lopez")),new HashEntry<Integer,String>(4,new String("Boix")),new HashEntry<Integer,String>(7,new String("Prats")),new HashEntry<Integer,String>(5,new String("Benach")),new HashEntry<Integer,String>(8,new String("Lopez")),new HashEntry<Integer,String>(9,new String("Navarro"))))))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,new Integer(7),new String("Martinez")).doCall().checkResult(new String("Prats")) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(2,new String("Rodriguez")),new HashEntry<Integer,String>(10,new String("Gonzalez")),new HashEntry<Integer,String>(3,new String("Lopez")),new HashEntry<Integer,String>(4,new String("Boix")),new HashEntry<Integer,String>(7,new String("Martinez")),new HashEntry<Integer,String>(5,new String("Benach")),new HashEntry<Integer,String>(8,new String("Lopez")),new HashEntry<Integer,String>(9,new String("Navarro"))))))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,new Integer(0),new String("Bonet")).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(2,new String("Rodriguez")),new HashEntry<Integer,String>(10,new String("Gonzalez")),new HashEntry<Integer,String>(3,new String("Lopez")),new HashEntry<Integer,String>(4,new String("Boix")),new HashEntry<Integer,String>(7,new String("Martinez")),new HashEntry<Integer,String>(5,new String("Benach")),new HashEntry<Integer,String>(8,new String("Lopez")),new HashEntry<Integer,String>(9,new String("Navarro")),new HashEntry<Integer,String>(0,new String("Bonet"))))))).doCall().checkResult(true) ;
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
    ResultsHandler.add_result(new String("hashtable"),resultIs) ;
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
TestResult<HashTable<Integer,String>,Void> v_0 = null ;
HashTable<Integer,String> v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_43") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_43")) ;
if (ok_sofar)
{
  v_0 = new Constructor(4).doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new Remove(v_1,new Integer(6)).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray()),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray()),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray()),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray())))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Entries(v_1).doCall().checkResult(TestUtils.toGenericArray()) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray()),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray()),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray()),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray())))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new ContainsKey(v_1,new Integer(10)).doCall().checkResult(new Boolean(false)) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray()),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray()),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray()),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray())))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,new Integer(9)).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray()),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray()),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray()),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray())))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,new Integer(8)).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray()),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray()),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray()),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray())))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,new Integer(9),new String("Gonzalez")).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray()),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(9,new String("Gonzalez")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray()),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray())))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,new Integer(8),new String("Fernandez")).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(8,new String("Fernandez")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(9,new String("Gonzalez")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray()),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray())))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,new Integer(0),new String("Herrera")).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(8,new String("Fernandez")),new HashEntry<Integer,String>(0,new String("Herrera")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(9,new String("Gonzalez")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray()),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray())))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,new Integer(10),new String("Bonet")).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(8,new String("Fernandez")),new HashEntry<Integer,String>(0,new String("Herrera")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(9,new String("Gonzalez")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(10,new String("Bonet")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray())))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Entries(v_1).doCall().checkResult(TestUtils.toGenericArray(new HashEntry<Integer,String>(8,new String("Fernandez")),new HashEntry<Integer,String>(0,new String("Herrera")),new HashEntry<Integer,String>(9,new String("Gonzalez")),new HashEntry<Integer,String>(10,new String("Bonet")))) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(8,new String("Fernandez")),new HashEntry<Integer,String>(0,new String("Herrera")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(9,new String("Gonzalez")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(10,new String("Bonet")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray())))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,new Integer(9),new String("Gonzalez")).doCall().checkResult(new String("Gonzalez")) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(8,new String("Fernandez")),new HashEntry<Integer,String>(0,new String("Herrera")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(9,new String("Gonzalez")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(10,new String("Bonet")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray())))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,new Integer(3),new String("Sanchez")).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(8,new String("Fernandez")),new HashEntry<Integer,String>(0,new String("Herrera")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(9,new String("Gonzalez")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(10,new String("Bonet")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(3,new String("Sanchez"))))))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,new Integer(3),new String("Goicoechea")).doCall().checkResult(new String("Sanchez")) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(8,new String("Fernandez")),new HashEntry<Integer,String>(0,new String("Herrera")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(9,new String("Gonzalez")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(10,new String("Bonet")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(3,new String("Goicoechea"))))))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Remove(v_1,new Integer(9)).doCall().checkResult(new String("Gonzalez")) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(8,new String("Fernandez")),new HashEntry<Integer,String>(0,new String("Herrera")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray()),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(10,new String("Bonet")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(3,new String("Goicoechea"))))))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,new Integer(7),new String("Rossello")).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(8,new String("Fernandez")),new HashEntry<Integer,String>(0,new String("Herrera")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray()),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(10,new String("Bonet")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(3,new String("Goicoechea")),new HashEntry<Integer,String>(7,new String("Rossello"))))))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Remove(v_1,new Integer(7)).doCall().checkResult(new String("Rossello")) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(8,new String("Fernandez")),new HashEntry<Integer,String>(0,new String("Herrera")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray()),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(10,new String("Bonet")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(3,new String("Goicoechea"))))))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,new Integer(8),new String("Goicoechea")).doCall().checkResult(new String("Fernandez")) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(8,new String("Goicoechea")),new HashEntry<Integer,String>(0,new String("Herrera")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray()),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(10,new String("Bonet")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(3,new String("Goicoechea"))))))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Keys(v_1).doCall().checkResult(new Integer[] { new Integer(8),new Integer(0),new Integer(10),new Integer(3) }) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(8,new String("Goicoechea")),new HashEntry<Integer,String>(0,new String("Herrera")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray()),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(10,new String("Bonet")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(3,new String("Goicoechea"))))))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Size(v_1).doCall().checkResult(new Integer(4)) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(8,new String("Goicoechea")),new HashEntry<Integer,String>(0,new String("Herrera")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray()),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(10,new String("Bonet")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(3,new String("Goicoechea"))))))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Remove(v_1,new Integer(4)).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(8,new String("Goicoechea")),new HashEntry<Integer,String>(0,new String("Herrera")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray()),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(10,new String("Bonet")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(3,new String("Goicoechea"))))))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Remove(v_1,new Integer(3)).doCall().checkResult(new String("Goicoechea")) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(8,new String("Goicoechea")),new HashEntry<Integer,String>(0,new String("Herrera")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray()),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(10,new String("Bonet")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray())))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new ContainsKey(v_1,new Integer(10)).doCall().checkResult(new Boolean(true)) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(8,new String("Goicoechea")),new HashEntry<Integer,String>(0,new String("Herrera")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray()),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(10,new String("Bonet")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray())))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,new Integer(4),new String("Navarro")).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(8,new String("Goicoechea")),new HashEntry<Integer,String>(0,new String("Herrera")),new HashEntry<Integer,String>(4,new String("Navarro")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray()),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(10,new String("Bonet")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray())))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Entries(v_1).doCall().checkResult(TestUtils.toGenericArray(new HashEntry<Integer,String>(8,new String("Goicoechea")),new HashEntry<Integer,String>(0,new String("Herrera")),new HashEntry<Integer,String>(4,new String("Navarro")),new HashEntry<Integer,String>(10,new String("Bonet")))) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(8,new String("Goicoechea")),new HashEntry<Integer,String>(0,new String("Herrera")),new HashEntry<Integer,String>(4,new String("Navarro")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray()),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(10,new String("Bonet")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray())))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,new Integer(0)).doCall().checkResult(new String("Herrera")) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(8,new String("Goicoechea")),new HashEntry<Integer,String>(0,new String("Herrera")),new HashEntry<Integer,String>(4,new String("Navarro")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray()),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(10,new String("Bonet")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray())))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,new Integer(8),new String("Lopez")).doCall().checkResult(new String("Goicoechea")) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(8,new String("Lopez")),new HashEntry<Integer,String>(0,new String("Herrera")),new HashEntry<Integer,String>(4,new String("Navarro")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray()),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(10,new String("Bonet")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray())))).doCall().checkResult(true) ;
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
    ResultsHandler.add_result(new String("hashtable"),resultIs) ;
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
TestResult<HashTable<Integer,String>,Void> v_0 = null ;
HashTable<Integer,String> v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_44") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_44")) ;
if (ok_sofar)
{
  v_0 = new Constructor(2).doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new IsEmpty(v_1).doCall().checkResult(new Boolean(true)) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray()),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray())))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new IsEmpty(v_1).doCall().checkResult(new Boolean(true)) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray()),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray())))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,new Integer(6),new String("Gonzalez")).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(6,new String("Gonzalez")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray())))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Size(v_1).doCall().checkResult(new Integer(1)) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(6,new String("Gonzalez")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray())))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,new Integer(7),new String("Lopez")).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(6,new String("Gonzalez")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(7,new String("Lopez"))))))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Remove(v_1,new Integer(7)).doCall().checkResult(new String("Lopez")) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(6,new String("Gonzalez")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray())))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,new Integer(8),new String("Navarro")).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(6,new String("Gonzalez")),new HashEntry<Integer,String>(8,new String("Navarro")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray())))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,new Integer(4),new String("Alzaga")).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(6,new String("Gonzalez")),new HashEntry<Integer,String>(8,new String("Navarro")),new HashEntry<Integer,String>(4,new String("Alzaga")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray())))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new IsEmpty(v_1).doCall().checkResult(new Boolean(false)) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(6,new String("Gonzalez")),new HashEntry<Integer,String>(8,new String("Navarro")),new HashEntry<Integer,String>(4,new String("Alzaga")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray())))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,new Integer(3),new String("Bonet")).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(6,new String("Gonzalez")),new HashEntry<Integer,String>(8,new String("Navarro")),new HashEntry<Integer,String>(4,new String("Alzaga")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(3,new String("Bonet"))))))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,new Integer(6),new String("Boix")).doCall().checkResult(new String("Gonzalez")) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(6,new String("Boix")),new HashEntry<Integer,String>(8,new String("Navarro")),new HashEntry<Integer,String>(4,new String("Alzaga")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(3,new String("Bonet"))))))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,new Integer(3)).doCall().checkResult(new String("Bonet")) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(6,new String("Boix")),new HashEntry<Integer,String>(8,new String("Navarro")),new HashEntry<Integer,String>(4,new String("Alzaga")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(3,new String("Bonet"))))))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new IsEmpty(v_1).doCall().checkResult(new Boolean(false)) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(6,new String("Boix")),new HashEntry<Integer,String>(8,new String("Navarro")),new HashEntry<Integer,String>(4,new String("Alzaga")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(3,new String("Bonet"))))))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,new Integer(4)).doCall().checkResult(new String("Alzaga")) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(6,new String("Boix")),new HashEntry<Integer,String>(8,new String("Navarro")),new HashEntry<Integer,String>(4,new String("Alzaga")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(3,new String("Bonet"))))))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,new Integer(10),new String("Bonet")).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(6,new String("Boix")),new HashEntry<Integer,String>(8,new String("Navarro")),new HashEntry<Integer,String>(4,new String("Alzaga")),new HashEntry<Integer,String>(10,new String("Bonet")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(3,new String("Bonet"))))))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Size(v_1).doCall().checkResult(new Integer(5)) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(6,new String("Boix")),new HashEntry<Integer,String>(8,new String("Navarro")),new HashEntry<Integer,String>(4,new String("Alzaga")),new HashEntry<Integer,String>(10,new String("Bonet")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(3,new String("Bonet"))))))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Remove(v_1,new Integer(3)).doCall().checkResult(new String("Bonet")) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(6,new String("Boix")),new HashEntry<Integer,String>(8,new String("Navarro")),new HashEntry<Integer,String>(4,new String("Alzaga")),new HashEntry<Integer,String>(10,new String("Bonet")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray())))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,new Integer(4),new String("Navarro")).doCall().checkResult(new String("Alzaga")) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(6,new String("Boix")),new HashEntry<Integer,String>(8,new String("Navarro")),new HashEntry<Integer,String>(4,new String("Navarro")),new HashEntry<Integer,String>(10,new String("Bonet")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray())))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,new Integer(10),new String("Marti")).doCall().checkResult(new String("Bonet")) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(6,new String("Boix")),new HashEntry<Integer,String>(8,new String("Navarro")),new HashEntry<Integer,String>(4,new String("Navarro")),new HashEntry<Integer,String>(10,new String("Marti")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray())))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,new Integer(8)).doCall().checkResult(new String("Navarro")) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(6,new String("Boix")),new HashEntry<Integer,String>(8,new String("Navarro")),new HashEntry<Integer,String>(4,new String("Navarro")),new HashEntry<Integer,String>(10,new String("Marti")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray())))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Keys(v_1).doCall().checkResult(new Integer[] { new Integer(6),new Integer(8),new Integer(4),new Integer(10) }) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(6,new String("Boix")),new HashEntry<Integer,String>(8,new String("Navarro")),new HashEntry<Integer,String>(4,new String("Navarro")),new HashEntry<Integer,String>(10,new String("Marti")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray())))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,new Integer(9),new String("Rodriguez")).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(6,new String("Boix")),new HashEntry<Integer,String>(8,new String("Navarro")),new HashEntry<Integer,String>(4,new String("Navarro")),new HashEntry<Integer,String>(10,new String("Marti")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(9,new String("Rodriguez"))))))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,new Integer(8),new String("Garcia")).doCall().checkResult(new String("Navarro")) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(6,new String("Boix")),new HashEntry<Integer,String>(8,new String("Garcia")),new HashEntry<Integer,String>(4,new String("Navarro")),new HashEntry<Integer,String>(10,new String("Marti")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(9,new String("Rodriguez"))))))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,new Integer(2),new String("Sanchez")).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(6,new String("Boix")),new HashEntry<Integer,String>(8,new String("Garcia")),new HashEntry<Integer,String>(4,new String("Navarro")),new HashEntry<Integer,String>(10,new String("Marti")),new HashEntry<Integer,String>(2,new String("Sanchez")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(9,new String("Rodriguez"))))))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Size(v_1).doCall().checkResult(new Integer(6)) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(6,new String("Boix")),new HashEntry<Integer,String>(8,new String("Garcia")),new HashEntry<Integer,String>(4,new String("Navarro")),new HashEntry<Integer,String>(10,new String("Marti")),new HashEntry<Integer,String>(2,new String("Sanchez")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(9,new String("Rodriguez"))))))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,new Integer(2),new String("Albuixech")).doCall().checkResult(new String("Sanchez")) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(6,new String("Boix")),new HashEntry<Integer,String>(8,new String("Garcia")),new HashEntry<Integer,String>(4,new String("Navarro")),new HashEntry<Integer,String>(10,new String("Marti")),new HashEntry<Integer,String>(2,new String("Albuixech")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(9,new String("Rodriguez"))))))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,new Integer(3),new String("Benach")).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(6,new String("Boix")),new HashEntry<Integer,String>(8,new String("Garcia")),new HashEntry<Integer,String>(4,new String("Navarro")),new HashEntry<Integer,String>(10,new String("Marti")),new HashEntry<Integer,String>(2,new String("Albuixech")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(9,new String("Rodriguez")),new HashEntry<Integer,String>(3,new String("Benach"))))))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,new Integer(2)).doCall().checkResult(new String("Albuixech")) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(6,new String("Boix")),new HashEntry<Integer,String>(8,new String("Garcia")),new HashEntry<Integer,String>(4,new String("Navarro")),new HashEntry<Integer,String>(10,new String("Marti")),new HashEntry<Integer,String>(2,new String("Albuixech")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(9,new String("Rodriguez")),new HashEntry<Integer,String>(3,new String("Benach"))))))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Remove(v_1,new Integer(10)).doCall().checkResult(new String("Marti")) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(6,new String("Boix")),new HashEntry<Integer,String>(8,new String("Garcia")),new HashEntry<Integer,String>(4,new String("Navarro")),new HashEntry<Integer,String>(2,new String("Albuixech")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(9,new String("Rodriguez")),new HashEntry<Integer,String>(3,new String("Benach"))))))).doCall().checkResult(true) ;
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
    ResultsHandler.add_result(new String("hashtable"),resultIs) ;
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
TestResult<HashTable<Integer,String>,Void> v_0 = null ;
HashTable<Integer,String> v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_45") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_45")) ;
if (ok_sofar)
{
  v_0 = new Constructor(4).doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new Put(v_1,new Integer(3),new String("Lopez")).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray()),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray()),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray()),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(3,new String("Lopez"))))))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,new Integer(6),new String("Lopez")).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray()),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray()),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(6,new String("Lopez")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(3,new String("Lopez"))))))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,new Integer(3),new String("Rossello")).doCall().checkResult(new String("Lopez")) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray()),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray()),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(6,new String("Lopez")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(3,new String("Rossello"))))))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Entries(v_1).doCall().checkResult(TestUtils.toGenericArray(new HashEntry<Integer,String>(6,new String("Lopez")),new HashEntry<Integer,String>(3,new String("Rossello")))) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray()),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray()),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(6,new String("Lopez")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(3,new String("Rossello"))))))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,new Integer(6),new String("Marin")).doCall().checkResult(new String("Lopez")) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray()),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray()),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(6,new String("Marin")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(3,new String("Rossello"))))))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new ContainsKey(v_1,new Integer(4)).doCall().checkResult(new Boolean(false)) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray()),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray()),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(6,new String("Marin")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(3,new String("Rossello"))))))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Size(v_1).doCall().checkResult(new Integer(2)) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray()),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray()),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(6,new String("Marin")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(3,new String("Rossello"))))))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,new Integer(7),new String("Herrera")).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray()),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray()),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(6,new String("Marin")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(3,new String("Rossello")),new HashEntry<Integer,String>(7,new String("Herrera"))))))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,new Integer(2),new String("Marti")).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray()),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray()),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(6,new String("Marin")),new HashEntry<Integer,String>(2,new String("Marti")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(3,new String("Rossello")),new HashEntry<Integer,String>(7,new String("Herrera"))))))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Remove(v_1,new Integer(2)).doCall().checkResult(new String("Marti")) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray()),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray()),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(6,new String("Marin")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(3,new String("Rossello")),new HashEntry<Integer,String>(7,new String("Herrera"))))))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,new Integer(10),new String("Alzaga")).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray()),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray()),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(6,new String("Marin")),new HashEntry<Integer,String>(10,new String("Alzaga")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(3,new String("Rossello")),new HashEntry<Integer,String>(7,new String("Herrera"))))))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,new Integer(7)).doCall().checkResult(new String("Herrera")) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray()),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray()),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(6,new String("Marin")),new HashEntry<Integer,String>(10,new String("Alzaga")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(3,new String("Rossello")),new HashEntry<Integer,String>(7,new String("Herrera"))))))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,new Integer(0),new String("Marti")).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(0,new String("Marti")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray()),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(6,new String("Marin")),new HashEntry<Integer,String>(10,new String("Alzaga")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(3,new String("Rossello")),new HashEntry<Integer,String>(7,new String("Herrera"))))))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new IsEmpty(v_1).doCall().checkResult(new Boolean(false)) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(0,new String("Marti")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray()),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(6,new String("Marin")),new HashEntry<Integer,String>(10,new String("Alzaga")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(3,new String("Rossello")),new HashEntry<Integer,String>(7,new String("Herrera"))))))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,new Integer(0),new String("Llorente")).doCall().checkResult(new String("Marti")) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(0,new String("Llorente")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray()),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(6,new String("Marin")),new HashEntry<Integer,String>(10,new String("Alzaga")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(3,new String("Rossello")),new HashEntry<Integer,String>(7,new String("Herrera"))))))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Entries(v_1).doCall().checkResult(TestUtils.toGenericArray(new HashEntry<Integer,String>(0,new String("Llorente")),new HashEntry<Integer,String>(6,new String("Marin")),new HashEntry<Integer,String>(10,new String("Alzaga")),new HashEntry<Integer,String>(3,new String("Rossello")),new HashEntry<Integer,String>(7,new String("Herrera")))) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(0,new String("Llorente")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray()),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(6,new String("Marin")),new HashEntry<Integer,String>(10,new String("Alzaga")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(3,new String("Rossello")),new HashEntry<Integer,String>(7,new String("Herrera"))))))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,new Integer(3)).doCall().checkResult(new String("Rossello")) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(0,new String("Llorente")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray()),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(6,new String("Marin")),new HashEntry<Integer,String>(10,new String("Alzaga")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(3,new String("Rossello")),new HashEntry<Integer,String>(7,new String("Herrera"))))))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Keys(v_1).doCall().checkResult(new Integer[] { new Integer(0),new Integer(6),new Integer(10),new Integer(3),new Integer(7) }) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(0,new String("Llorente")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray()),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(6,new String("Marin")),new HashEntry<Integer,String>(10,new String("Alzaga")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(3,new String("Rossello")),new HashEntry<Integer,String>(7,new String("Herrera"))))))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,new Integer(9),new String("Alzaga")).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(0,new String("Llorente")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(9,new String("Alzaga")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(6,new String("Marin")),new HashEntry<Integer,String>(10,new String("Alzaga")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(3,new String("Rossello")),new HashEntry<Integer,String>(7,new String("Herrera"))))))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,new Integer(5),new String("Herrera")).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(0,new String("Llorente")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(9,new String("Alzaga")),new HashEntry<Integer,String>(5,new String("Herrera")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(6,new String("Marin")),new HashEntry<Integer,String>(10,new String("Alzaga")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(3,new String("Rossello")),new HashEntry<Integer,String>(7,new String("Herrera"))))))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,new Integer(7)).doCall().checkResult(new String("Herrera")) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(0,new String("Llorente")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(9,new String("Alzaga")),new HashEntry<Integer,String>(5,new String("Herrera")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(6,new String("Marin")),new HashEntry<Integer,String>(10,new String("Alzaga")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(3,new String("Rossello")),new HashEntry<Integer,String>(7,new String("Herrera"))))))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Size(v_1).doCall().checkResult(new Integer(7)) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(0,new String("Llorente")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(9,new String("Alzaga")),new HashEntry<Integer,String>(5,new String("Herrera")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(6,new String("Marin")),new HashEntry<Integer,String>(10,new String("Alzaga")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(3,new String("Rossello")),new HashEntry<Integer,String>(7,new String("Herrera"))))))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,new Integer(1),new String("Llorente")).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(0,new String("Llorente")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(9,new String("Alzaga")),new HashEntry<Integer,String>(5,new String("Herrera")),new HashEntry<Integer,String>(1,new String("Llorente")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(6,new String("Marin")),new HashEntry<Integer,String>(10,new String("Alzaga")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(3,new String("Rossello")),new HashEntry<Integer,String>(7,new String("Herrera"))))))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,new Integer(9),new String("Gonzalez")).doCall().checkResult(new String("Alzaga")) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(0,new String("Llorente")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(9,new String("Gonzalez")),new HashEntry<Integer,String>(5,new String("Herrera")),new HashEntry<Integer,String>(1,new String("Llorente")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(6,new String("Marin")),new HashEntry<Integer,String>(10,new String("Alzaga")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(3,new String("Rossello")),new HashEntry<Integer,String>(7,new String("Herrera"))))))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,new Integer(5),new String("Marin")).doCall().checkResult(new String("Herrera")) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(0,new String("Llorente")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(9,new String("Gonzalez")),new HashEntry<Integer,String>(5,new String("Marin")),new HashEntry<Integer,String>(1,new String("Llorente")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(6,new String("Marin")),new HashEntry<Integer,String>(10,new String("Alzaga")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(3,new String("Rossello")),new HashEntry<Integer,String>(7,new String("Herrera"))))))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,new Integer(0)).doCall().checkResult(new String("Llorente")) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(0,new String("Llorente")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(9,new String("Gonzalez")),new HashEntry<Integer,String>(5,new String("Marin")),new HashEntry<Integer,String>(1,new String("Llorente")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(6,new String("Marin")),new HashEntry<Integer,String>(10,new String("Alzaga")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(3,new String("Rossello")),new HashEntry<Integer,String>(7,new String("Herrera"))))))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,new Integer(2),new String("Castro")).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(0,new String("Llorente")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(9,new String("Gonzalez")),new HashEntry<Integer,String>(5,new String("Marin")),new HashEntry<Integer,String>(1,new String("Llorente")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(6,new String("Marin")),new HashEntry<Integer,String>(10,new String("Alzaga")),new HashEntry<Integer,String>(2,new String("Castro")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(3,new String("Rossello")),new HashEntry<Integer,String>(7,new String("Herrera"))))))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Keys(v_1).doCall().checkResult(new Integer[] { new Integer(0),new Integer(9),new Integer(5),new Integer(1),new Integer(6),new Integer(10),new Integer(2),new Integer(3),new Integer(7) }) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(0,new String("Llorente")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(9,new String("Gonzalez")),new HashEntry<Integer,String>(5,new String("Marin")),new HashEntry<Integer,String>(1,new String("Llorente")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(6,new String("Marin")),new HashEntry<Integer,String>(10,new String("Alzaga")),new HashEntry<Integer,String>(2,new String("Castro")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(3,new String("Rossello")),new HashEntry<Integer,String>(7,new String("Herrera"))))))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new ContainsKey(v_1,new Integer(3)).doCall().checkResult(new Boolean(true)) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(0,new String("Llorente")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(9,new String("Gonzalez")),new HashEntry<Integer,String>(5,new String("Marin")),new HashEntry<Integer,String>(1,new String("Llorente")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(6,new String("Marin")),new HashEntry<Integer,String>(10,new String("Alzaga")),new HashEntry<Integer,String>(2,new String("Castro")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(3,new String("Rossello")),new HashEntry<Integer,String>(7,new String("Herrera"))))))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,new Integer(0),new String("Marin")).doCall().checkResult(new String("Llorente")) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(0,new String("Marin")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(9,new String("Gonzalez")),new HashEntry<Integer,String>(5,new String("Marin")),new HashEntry<Integer,String>(1,new String("Llorente")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(6,new String("Marin")),new HashEntry<Integer,String>(10,new String("Alzaga")),new HashEntry<Integer,String>(2,new String("Castro")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(3,new String("Rossello")),new HashEntry<Integer,String>(7,new String("Herrera"))))))).doCall().checkResult(true) ;
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
    ResultsHandler.add_result(new String("hashtable"),resultIs) ;
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
TestResult<HashTable<Integer,String>,Void> v_0 = null ;
HashTable<Integer,String> v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_46") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_46")) ;
if (ok_sofar)
{
  v_0 = new Constructor(2).doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new Put(v_1,new Integer(7),new String("Lopez")).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray()),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(7,new String("Lopez"))))))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,new Integer(7)).doCall().checkResult(new String("Lopez")) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray()),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(7,new String("Lopez"))))))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Remove(v_1,new Integer(7)).doCall().checkResult(new String("Lopez")) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray()),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray())))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Remove(v_1,new Integer(10)).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray()),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray())))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Remove(v_1,new Integer(2)).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray()),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray())))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,new Integer(1),new String("Benach")).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray()),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(1,new String("Benach"))))))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new IsEmpty(v_1).doCall().checkResult(new Boolean(false)) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray()),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(1,new String("Benach"))))))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,new Integer(1),new String("Martinez")).doCall().checkResult(new String("Benach")) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray()),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(1,new String("Martinez"))))))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,new Integer(9),new String("Marin")).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray()),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(1,new String("Martinez")),new HashEntry<Integer,String>(9,new String("Marin"))))))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,new Integer(10),new String("Benach")).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(10,new String("Benach")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(1,new String("Martinez")),new HashEntry<Integer,String>(9,new String("Marin"))))))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Entries(v_1).doCall().checkResult(TestUtils.toGenericArray(new HashEntry<Integer,String>(10,new String("Benach")),new HashEntry<Integer,String>(1,new String("Martinez")),new HashEntry<Integer,String>(9,new String("Marin")))) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(10,new String("Benach")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(1,new String("Martinez")),new HashEntry<Integer,String>(9,new String("Marin"))))))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Size(v_1).doCall().checkResult(new Integer(3)) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(10,new String("Benach")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(1,new String("Martinez")),new HashEntry<Integer,String>(9,new String("Marin"))))))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,new Integer(10),new String("Herrera")).doCall().checkResult(new String("Benach")) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(10,new String("Herrera")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(1,new String("Martinez")),new HashEntry<Integer,String>(9,new String("Marin"))))))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,new Integer(1),new String("Goicoechea")).doCall().checkResult(new String("Martinez")) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(10,new String("Herrera")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(1,new String("Goicoechea")),new HashEntry<Integer,String>(9,new String("Marin"))))))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Remove(v_1,new Integer(9)).doCall().checkResult(new String("Marin")) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(10,new String("Herrera")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(1,new String("Goicoechea"))))))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,new Integer(7),new String("Gonzalez")).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(10,new String("Herrera")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(1,new String("Goicoechea")),new HashEntry<Integer,String>(7,new String("Gonzalez"))))))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Entries(v_1).doCall().checkResult(TestUtils.toGenericArray(new HashEntry<Integer,String>(10,new String("Herrera")),new HashEntry<Integer,String>(1,new String("Goicoechea")),new HashEntry<Integer,String>(7,new String("Gonzalez")))) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(10,new String("Herrera")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(1,new String("Goicoechea")),new HashEntry<Integer,String>(7,new String("Gonzalez"))))))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,new Integer(5),new String("Albuixech")).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(10,new String("Herrera")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(1,new String("Goicoechea")),new HashEntry<Integer,String>(7,new String("Gonzalez")),new HashEntry<Integer,String>(5,new String("Albuixech"))))))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,new Integer(8),new String("Goicoechea")).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(10,new String("Herrera")),new HashEntry<Integer,String>(8,new String("Goicoechea")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(1,new String("Goicoechea")),new HashEntry<Integer,String>(7,new String("Gonzalez")),new HashEntry<Integer,String>(5,new String("Albuixech"))))))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,new Integer(6),new String("Goicoechea")).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(10,new String("Herrera")),new HashEntry<Integer,String>(8,new String("Goicoechea")),new HashEntry<Integer,String>(6,new String("Goicoechea")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(1,new String("Goicoechea")),new HashEntry<Integer,String>(7,new String("Gonzalez")),new HashEntry<Integer,String>(5,new String("Albuixech"))))))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Keys(v_1).doCall().checkResult(new Integer[] { new Integer(10),new Integer(8),new Integer(6),new Integer(1),new Integer(7),new Integer(5) }) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(10,new String("Herrera")),new HashEntry<Integer,String>(8,new String("Goicoechea")),new HashEntry<Integer,String>(6,new String("Goicoechea")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(1,new String("Goicoechea")),new HashEntry<Integer,String>(7,new String("Gonzalez")),new HashEntry<Integer,String>(5,new String("Albuixech"))))))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,new Integer(2),new String("Bonet")).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(10,new String("Herrera")),new HashEntry<Integer,String>(8,new String("Goicoechea")),new HashEntry<Integer,String>(6,new String("Goicoechea")),new HashEntry<Integer,String>(2,new String("Bonet")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(1,new String("Goicoechea")),new HashEntry<Integer,String>(7,new String("Gonzalez")),new HashEntry<Integer,String>(5,new String("Albuixech"))))))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,new Integer(7),new String("Llorente")).doCall().checkResult(new String("Gonzalez")) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(10,new String("Herrera")),new HashEntry<Integer,String>(8,new String("Goicoechea")),new HashEntry<Integer,String>(6,new String("Goicoechea")),new HashEntry<Integer,String>(2,new String("Bonet")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(1,new String("Goicoechea")),new HashEntry<Integer,String>(7,new String("Llorente")),new HashEntry<Integer,String>(5,new String("Albuixech"))))))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Size(v_1).doCall().checkResult(new Integer(7)) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(10,new String("Herrera")),new HashEntry<Integer,String>(8,new String("Goicoechea")),new HashEntry<Integer,String>(6,new String("Goicoechea")),new HashEntry<Integer,String>(2,new String("Bonet")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(1,new String("Goicoechea")),new HashEntry<Integer,String>(7,new String("Llorente")),new HashEntry<Integer,String>(5,new String("Albuixech"))))))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,new Integer(8),new String("Echeberria")).doCall().checkResult(new String("Goicoechea")) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(10,new String("Herrera")),new HashEntry<Integer,String>(8,new String("Echeberria")),new HashEntry<Integer,String>(6,new String("Goicoechea")),new HashEntry<Integer,String>(2,new String("Bonet")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(1,new String("Goicoechea")),new HashEntry<Integer,String>(7,new String("Llorente")),new HashEntry<Integer,String>(5,new String("Albuixech"))))))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,new Integer(6),new String("Navarro")).doCall().checkResult(new String("Goicoechea")) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(10,new String("Herrera")),new HashEntry<Integer,String>(8,new String("Echeberria")),new HashEntry<Integer,String>(6,new String("Navarro")),new HashEntry<Integer,String>(2,new String("Bonet")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(1,new String("Goicoechea")),new HashEntry<Integer,String>(7,new String("Llorente")),new HashEntry<Integer,String>(5,new String("Albuixech"))))))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new IsEmpty(v_1).doCall().checkResult(new Boolean(false)) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(10,new String("Herrera")),new HashEntry<Integer,String>(8,new String("Echeberria")),new HashEntry<Integer,String>(6,new String("Navarro")),new HashEntry<Integer,String>(2,new String("Bonet")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(1,new String("Goicoechea")),new HashEntry<Integer,String>(7,new String("Llorente")),new HashEntry<Integer,String>(5,new String("Albuixech"))))))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Size(v_1).doCall().checkResult(new Integer(7)) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(10,new String("Herrera")),new HashEntry<Integer,String>(8,new String("Echeberria")),new HashEntry<Integer,String>(6,new String("Navarro")),new HashEntry<Integer,String>(2,new String("Bonet")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(1,new String("Goicoechea")),new HashEntry<Integer,String>(7,new String("Llorente")),new HashEntry<Integer,String>(5,new String("Albuixech"))))))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,new Integer(6),new String("Fernandez")).doCall().checkResult(new String("Navarro")) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(10,new String("Herrera")),new HashEntry<Integer,String>(8,new String("Echeberria")),new HashEntry<Integer,String>(6,new String("Fernandez")),new HashEntry<Integer,String>(2,new String("Bonet")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(1,new String("Goicoechea")),new HashEntry<Integer,String>(7,new String("Llorente")),new HashEntry<Integer,String>(5,new String("Albuixech"))))))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Entries(v_1).doCall().checkResult(TestUtils.toGenericArray(new HashEntry<Integer,String>(10,new String("Herrera")),new HashEntry<Integer,String>(8,new String("Echeberria")),new HashEntry<Integer,String>(6,new String("Fernandez")),new HashEntry<Integer,String>(2,new String("Bonet")),new HashEntry<Integer,String>(1,new String("Goicoechea")),new HashEntry<Integer,String>(7,new String("Llorente")),new HashEntry<Integer,String>(5,new String("Albuixech")))) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(10,new String("Herrera")),new HashEntry<Integer,String>(8,new String("Echeberria")),new HashEntry<Integer,String>(6,new String("Fernandez")),new HashEntry<Integer,String>(2,new String("Bonet")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(1,new String("Goicoechea")),new HashEntry<Integer,String>(7,new String("Llorente")),new HashEntry<Integer,String>(5,new String("Albuixech"))))))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,new Integer(10),new String("Sanchez")).doCall().checkResult(new String("Herrera")) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(10,new String("Sanchez")),new HashEntry<Integer,String>(8,new String("Echeberria")),new HashEntry<Integer,String>(6,new String("Fernandez")),new HashEntry<Integer,String>(2,new String("Bonet")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(1,new String("Goicoechea")),new HashEntry<Integer,String>(7,new String("Llorente")),new HashEntry<Integer,String>(5,new String("Albuixech"))))))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,new Integer(7)).doCall().checkResult(new String("Llorente")) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(10,new String("Sanchez")),new HashEntry<Integer,String>(8,new String("Echeberria")),new HashEntry<Integer,String>(6,new String("Fernandez")),new HashEntry<Integer,String>(2,new String("Bonet")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(1,new String("Goicoechea")),new HashEntry<Integer,String>(7,new String("Llorente")),new HashEntry<Integer,String>(5,new String("Albuixech"))))))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Keys(v_1).doCall().checkResult(new Integer[] { new Integer(10),new Integer(8),new Integer(6),new Integer(2),new Integer(1),new Integer(7),new Integer(5) }) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(10,new String("Sanchez")),new HashEntry<Integer,String>(8,new String("Echeberria")),new HashEntry<Integer,String>(6,new String("Fernandez")),new HashEntry<Integer,String>(2,new String("Bonet")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(1,new String("Goicoechea")),new HashEntry<Integer,String>(7,new String("Llorente")),new HashEntry<Integer,String>(5,new String("Albuixech"))))))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Remove(v_1,new Integer(5)).doCall().checkResult(new String("Albuixech")) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(10,new String("Sanchez")),new HashEntry<Integer,String>(8,new String("Echeberria")),new HashEntry<Integer,String>(6,new String("Fernandez")),new HashEntry<Integer,String>(2,new String("Bonet")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(1,new String("Goicoechea")),new HashEntry<Integer,String>(7,new String("Llorente"))))))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,new Integer(1)).doCall().checkResult(new String("Goicoechea")) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(10,new String("Sanchez")),new HashEntry<Integer,String>(8,new String("Echeberria")),new HashEntry<Integer,String>(6,new String("Fernandez")),new HashEntry<Integer,String>(2,new String("Bonet")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(1,new String("Goicoechea")),new HashEntry<Integer,String>(7,new String("Llorente"))))))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Remove(v_1,new Integer(2)).doCall().checkResult(new String("Bonet")) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(10,new String("Sanchez")),new HashEntry<Integer,String>(8,new String("Echeberria")),new HashEntry<Integer,String>(6,new String("Fernandez")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(1,new String("Goicoechea")),new HashEntry<Integer,String>(7,new String("Llorente"))))))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new ContainsKey(v_1,new Integer(8)).doCall().checkResult(new Boolean(true)) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(10,new String("Sanchez")),new HashEntry<Integer,String>(8,new String("Echeberria")),new HashEntry<Integer,String>(6,new String("Fernandez")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(1,new String("Goicoechea")),new HashEntry<Integer,String>(7,new String("Llorente"))))))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,new Integer(10),new String("Perez")).doCall().checkResult(new String("Sanchez")) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(10,new String("Perez")),new HashEntry<Integer,String>(8,new String("Echeberria")),new HashEntry<Integer,String>(6,new String("Fernandez")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(1,new String("Goicoechea")),new HashEntry<Integer,String>(7,new String("Llorente"))))))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Entries(v_1).doCall().checkResult(TestUtils.toGenericArray(new HashEntry<Integer,String>(10,new String("Perez")),new HashEntry<Integer,String>(8,new String("Echeberria")),new HashEntry<Integer,String>(6,new String("Fernandez")),new HashEntry<Integer,String>(1,new String("Goicoechea")),new HashEntry<Integer,String>(7,new String("Llorente")))) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(10,new String("Perez")),new HashEntry<Integer,String>(8,new String("Echeberria")),new HashEntry<Integer,String>(6,new String("Fernandez")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(1,new String("Goicoechea")),new HashEntry<Integer,String>(7,new String("Llorente"))))))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,new Integer(4),new String("Rossello")).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(10,new String("Perez")),new HashEntry<Integer,String>(8,new String("Echeberria")),new HashEntry<Integer,String>(6,new String("Fernandez")),new HashEntry<Integer,String>(4,new String("Rossello")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(1,new String("Goicoechea")),new HashEntry<Integer,String>(7,new String("Llorente"))))))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,new Integer(10)).doCall().checkResult(new String("Perez")) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(10,new String("Perez")),new HashEntry<Integer,String>(8,new String("Echeberria")),new HashEntry<Integer,String>(6,new String("Fernandez")),new HashEntry<Integer,String>(4,new String("Rossello")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(1,new String("Goicoechea")),new HashEntry<Integer,String>(7,new String("Llorente"))))))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,new Integer(10),new String("Goicoechea")).doCall().checkResult(new String("Perez")) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(10,new String("Goicoechea")),new HashEntry<Integer,String>(8,new String("Echeberria")),new HashEntry<Integer,String>(6,new String("Fernandez")),new HashEntry<Integer,String>(4,new String("Rossello")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(1,new String("Goicoechea")),new HashEntry<Integer,String>(7,new String("Llorente"))))))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,new Integer(5),new String("Fernandez")).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(10,new String("Goicoechea")),new HashEntry<Integer,String>(8,new String("Echeberria")),new HashEntry<Integer,String>(6,new String("Fernandez")),new HashEntry<Integer,String>(4,new String("Rossello")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(1,new String("Goicoechea")),new HashEntry<Integer,String>(7,new String("Llorente")),new HashEntry<Integer,String>(5,new String("Fernandez"))))))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,new Integer(10),new String("Sanchez")).doCall().checkResult(new String("Goicoechea")) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(10,new String("Sanchez")),new HashEntry<Integer,String>(8,new String("Echeberria")),new HashEntry<Integer,String>(6,new String("Fernandez")),new HashEntry<Integer,String>(4,new String("Rossello")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(1,new String("Goicoechea")),new HashEntry<Integer,String>(7,new String("Llorente")),new HashEntry<Integer,String>(5,new String("Fernandez"))))))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,new Integer(10),new String("Rodriguez")).doCall().checkResult(new String("Sanchez")) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(10,new String("Rodriguez")),new HashEntry<Integer,String>(8,new String("Echeberria")),new HashEntry<Integer,String>(6,new String("Fernandez")),new HashEntry<Integer,String>(4,new String("Rossello")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(1,new String("Goicoechea")),new HashEntry<Integer,String>(7,new String("Llorente")),new HashEntry<Integer,String>(5,new String("Fernandez"))))))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Remove(v_1,new Integer(8)).doCall().checkResult(new String("Echeberria")) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(10,new String("Rodriguez")),new HashEntry<Integer,String>(6,new String("Fernandez")),new HashEntry<Integer,String>(4,new String("Rossello")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(1,new String("Goicoechea")),new HashEntry<Integer,String>(7,new String("Llorente")),new HashEntry<Integer,String>(5,new String("Fernandez"))))))).doCall().checkResult(true) ;
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
    ResultsHandler.add_result(new String("hashtable"),resultIs) ;
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
TestResult<HashTable<Integer,String>,Void> v_0 = null ;
HashTable<Integer,String> v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_47") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_47")) ;
if (ok_sofar)
{
  v_0 = new Constructor(2).doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new Put(v_1,new Integer(0),new String("Marti")).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(0,new String("Marti")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray())))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,new Integer(5),new String("Bonet")).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(0,new String("Marti")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(5,new String("Bonet"))))))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,new Integer(9),new String("Alzaga")).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(0,new String("Marti")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(5,new String("Bonet")),new HashEntry<Integer,String>(9,new String("Alzaga"))))))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Entries(v_1).doCall().checkResult(TestUtils.toGenericArray(new HashEntry<Integer,String>(0,new String("Marti")),new HashEntry<Integer,String>(5,new String("Bonet")),new HashEntry<Integer,String>(9,new String("Alzaga")))) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(0,new String("Marti")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(5,new String("Bonet")),new HashEntry<Integer,String>(9,new String("Alzaga"))))))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,new Integer(2),new String("Boix")).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(0,new String("Marti")),new HashEntry<Integer,String>(2,new String("Boix")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(5,new String("Bonet")),new HashEntry<Integer,String>(9,new String("Alzaga"))))))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Entries(v_1).doCall().checkResult(TestUtils.toGenericArray(new HashEntry<Integer,String>(0,new String("Marti")),new HashEntry<Integer,String>(2,new String("Boix")),new HashEntry<Integer,String>(5,new String("Bonet")),new HashEntry<Integer,String>(9,new String("Alzaga")))) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(0,new String("Marti")),new HashEntry<Integer,String>(2,new String("Boix")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(5,new String("Bonet")),new HashEntry<Integer,String>(9,new String("Alzaga"))))))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Entries(v_1).doCall().checkResult(TestUtils.toGenericArray(new HashEntry<Integer,String>(0,new String("Marti")),new HashEntry<Integer,String>(2,new String("Boix")),new HashEntry<Integer,String>(5,new String("Bonet")),new HashEntry<Integer,String>(9,new String("Alzaga")))) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(0,new String("Marti")),new HashEntry<Integer,String>(2,new String("Boix")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(5,new String("Bonet")),new HashEntry<Integer,String>(9,new String("Alzaga"))))))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Keys(v_1).doCall().checkResult(new Integer[] { new Integer(0),new Integer(2),new Integer(5),new Integer(9) }) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(0,new String("Marti")),new HashEntry<Integer,String>(2,new String("Boix")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(5,new String("Bonet")),new HashEntry<Integer,String>(9,new String("Alzaga"))))))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new ContainsKey(v_1,new Integer(5)).doCall().checkResult(new Boolean(true)) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(0,new String("Marti")),new HashEntry<Integer,String>(2,new String("Boix")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(5,new String("Bonet")),new HashEntry<Integer,String>(9,new String("Alzaga"))))))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,new Integer(9),new String("Marti")).doCall().checkResult(new String("Alzaga")) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(0,new String("Marti")),new HashEntry<Integer,String>(2,new String("Boix")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(5,new String("Bonet")),new HashEntry<Integer,String>(9,new String("Marti"))))))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new ContainsKey(v_1,new Integer(5)).doCall().checkResult(new Boolean(true)) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(0,new String("Marti")),new HashEntry<Integer,String>(2,new String("Boix")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(5,new String("Bonet")),new HashEntry<Integer,String>(9,new String("Marti"))))))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,new Integer(7),new String("Lopez")).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(0,new String("Marti")),new HashEntry<Integer,String>(2,new String("Boix")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(5,new String("Bonet")),new HashEntry<Integer,String>(9,new String("Marti")),new HashEntry<Integer,String>(7,new String("Lopez"))))))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new ContainsKey(v_1,new Integer(5)).doCall().checkResult(new Boolean(true)) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(0,new String("Marti")),new HashEntry<Integer,String>(2,new String("Boix")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(5,new String("Bonet")),new HashEntry<Integer,String>(9,new String("Marti")),new HashEntry<Integer,String>(7,new String("Lopez"))))))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Remove(v_1,new Integer(2)).doCall().checkResult(new String("Boix")) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(0,new String("Marti")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(5,new String("Bonet")),new HashEntry<Integer,String>(9,new String("Marti")),new HashEntry<Integer,String>(7,new String("Lopez"))))))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,new Integer(5),new String("Llorente")).doCall().checkResult(new String("Bonet")) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(0,new String("Marti")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(5,new String("Llorente")),new HashEntry<Integer,String>(9,new String("Marti")),new HashEntry<Integer,String>(7,new String("Lopez"))))))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,new Integer(4),new String("Fernandez")).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(0,new String("Marti")),new HashEntry<Integer,String>(4,new String("Fernandez")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(5,new String("Llorente")),new HashEntry<Integer,String>(9,new String("Marti")),new HashEntry<Integer,String>(7,new String("Lopez"))))))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Size(v_1).doCall().checkResult(new Integer(5)) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(0,new String("Marti")),new HashEntry<Integer,String>(4,new String("Fernandez")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(5,new String("Llorente")),new HashEntry<Integer,String>(9,new String("Marti")),new HashEntry<Integer,String>(7,new String("Lopez"))))))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,new Integer(8),new String("Martinez")).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(0,new String("Marti")),new HashEntry<Integer,String>(4,new String("Fernandez")),new HashEntry<Integer,String>(8,new String("Martinez")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(5,new String("Llorente")),new HashEntry<Integer,String>(9,new String("Marti")),new HashEntry<Integer,String>(7,new String("Lopez"))))))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Keys(v_1).doCall().checkResult(new Integer[] { new Integer(0),new Integer(4),new Integer(8),new Integer(5),new Integer(9),new Integer(7) }) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(0,new String("Marti")),new HashEntry<Integer,String>(4,new String("Fernandez")),new HashEntry<Integer,String>(8,new String("Martinez")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(5,new String("Llorente")),new HashEntry<Integer,String>(9,new String("Marti")),new HashEntry<Integer,String>(7,new String("Lopez"))))))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,new Integer(6),new String("Lopez")).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(0,new String("Marti")),new HashEntry<Integer,String>(4,new String("Fernandez")),new HashEntry<Integer,String>(8,new String("Martinez")),new HashEntry<Integer,String>(6,new String("Lopez")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(5,new String("Llorente")),new HashEntry<Integer,String>(9,new String("Marti")),new HashEntry<Integer,String>(7,new String("Lopez"))))))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,new Integer(8),new String("Navarro")).doCall().checkResult(new String("Martinez")) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(0,new String("Marti")),new HashEntry<Integer,String>(4,new String("Fernandez")),new HashEntry<Integer,String>(8,new String("Navarro")),new HashEntry<Integer,String>(6,new String("Lopez")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(5,new String("Llorente")),new HashEntry<Integer,String>(9,new String("Marti")),new HashEntry<Integer,String>(7,new String("Lopez"))))))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,new Integer(9)).doCall().checkResult(new String("Marti")) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(0,new String("Marti")),new HashEntry<Integer,String>(4,new String("Fernandez")),new HashEntry<Integer,String>(8,new String("Navarro")),new HashEntry<Integer,String>(6,new String("Lopez")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(5,new String("Llorente")),new HashEntry<Integer,String>(9,new String("Marti")),new HashEntry<Integer,String>(7,new String("Lopez"))))))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new ContainsKey(v_1,new Integer(9)).doCall().checkResult(new Boolean(true)) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(0,new String("Marti")),new HashEntry<Integer,String>(4,new String("Fernandez")),new HashEntry<Integer,String>(8,new String("Navarro")),new HashEntry<Integer,String>(6,new String("Lopez")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(5,new String("Llorente")),new HashEntry<Integer,String>(9,new String("Marti")),new HashEntry<Integer,String>(7,new String("Lopez"))))))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,new Integer(3),new String("Alzaga")).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(0,new String("Marti")),new HashEntry<Integer,String>(4,new String("Fernandez")),new HashEntry<Integer,String>(8,new String("Navarro")),new HashEntry<Integer,String>(6,new String("Lopez")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(5,new String("Llorente")),new HashEntry<Integer,String>(9,new String("Marti")),new HashEntry<Integer,String>(7,new String("Lopez")),new HashEntry<Integer,String>(3,new String("Alzaga"))))))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,new Integer(8)).doCall().checkResult(new String("Navarro")) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(0,new String("Marti")),new HashEntry<Integer,String>(4,new String("Fernandez")),new HashEntry<Integer,String>(8,new String("Navarro")),new HashEntry<Integer,String>(6,new String("Lopez")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(5,new String("Llorente")),new HashEntry<Integer,String>(9,new String("Marti")),new HashEntry<Integer,String>(7,new String("Lopez")),new HashEntry<Integer,String>(3,new String("Alzaga"))))))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,new Integer(0),new String("Garcia")).doCall().checkResult(new String("Marti")) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(0,new String("Garcia")),new HashEntry<Integer,String>(4,new String("Fernandez")),new HashEntry<Integer,String>(8,new String("Navarro")),new HashEntry<Integer,String>(6,new String("Lopez")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(5,new String("Llorente")),new HashEntry<Integer,String>(9,new String("Marti")),new HashEntry<Integer,String>(7,new String("Lopez")),new HashEntry<Integer,String>(3,new String("Alzaga"))))))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,new Integer(3),new String("Albuixech")).doCall().checkResult(new String("Alzaga")) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(0,new String("Garcia")),new HashEntry<Integer,String>(4,new String("Fernandez")),new HashEntry<Integer,String>(8,new String("Navarro")),new HashEntry<Integer,String>(6,new String("Lopez")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(5,new String("Llorente")),new HashEntry<Integer,String>(9,new String("Marti")),new HashEntry<Integer,String>(7,new String("Lopez")),new HashEntry<Integer,String>(3,new String("Albuixech"))))))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new IsEmpty(v_1).doCall().checkResult(new Boolean(false)) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(0,new String("Garcia")),new HashEntry<Integer,String>(4,new String("Fernandez")),new HashEntry<Integer,String>(8,new String("Navarro")),new HashEntry<Integer,String>(6,new String("Lopez")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(5,new String("Llorente")),new HashEntry<Integer,String>(9,new String("Marti")),new HashEntry<Integer,String>(7,new String("Lopez")),new HashEntry<Integer,String>(3,new String("Albuixech"))))))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,new Integer(3),new String("Ferrer")).doCall().checkResult(new String("Albuixech")) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(0,new String("Garcia")),new HashEntry<Integer,String>(4,new String("Fernandez")),new HashEntry<Integer,String>(8,new String("Navarro")),new HashEntry<Integer,String>(6,new String("Lopez")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(5,new String("Llorente")),new HashEntry<Integer,String>(9,new String("Marti")),new HashEntry<Integer,String>(7,new String("Lopez")),new HashEntry<Integer,String>(3,new String("Ferrer"))))))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,new Integer(3),new String("Fernandez")).doCall().checkResult(new String("Ferrer")) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(0,new String("Garcia")),new HashEntry<Integer,String>(4,new String("Fernandez")),new HashEntry<Integer,String>(8,new String("Navarro")),new HashEntry<Integer,String>(6,new String("Lopez")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(5,new String("Llorente")),new HashEntry<Integer,String>(9,new String("Marti")),new HashEntry<Integer,String>(7,new String("Lopez")),new HashEntry<Integer,String>(3,new String("Fernandez"))))))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,new Integer(3),new String("Ferrer")).doCall().checkResult(new String("Fernandez")) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(0,new String("Garcia")),new HashEntry<Integer,String>(4,new String("Fernandez")),new HashEntry<Integer,String>(8,new String("Navarro")),new HashEntry<Integer,String>(6,new String("Lopez")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(5,new String("Llorente")),new HashEntry<Integer,String>(9,new String("Marti")),new HashEntry<Integer,String>(7,new String("Lopez")),new HashEntry<Integer,String>(3,new String("Ferrer"))))))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,new Integer(8),new String("Lopez")).doCall().checkResult(new String("Navarro")) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(0,new String("Garcia")),new HashEntry<Integer,String>(4,new String("Fernandez")),new HashEntry<Integer,String>(8,new String("Lopez")),new HashEntry<Integer,String>(6,new String("Lopez")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(5,new String("Llorente")),new HashEntry<Integer,String>(9,new String("Marti")),new HashEntry<Integer,String>(7,new String("Lopez")),new HashEntry<Integer,String>(3,new String("Ferrer"))))))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,new Integer(7),new String("Benach")).doCall().checkResult(new String("Lopez")) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(0,new String("Garcia")),new HashEntry<Integer,String>(4,new String("Fernandez")),new HashEntry<Integer,String>(8,new String("Lopez")),new HashEntry<Integer,String>(6,new String("Lopez")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(5,new String("Llorente")),new HashEntry<Integer,String>(9,new String("Marti")),new HashEntry<Integer,String>(7,new String("Benach")),new HashEntry<Integer,String>(3,new String("Ferrer"))))))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,new Integer(1),new String("Boix")).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(0,new String("Garcia")),new HashEntry<Integer,String>(4,new String("Fernandez")),new HashEntry<Integer,String>(8,new String("Lopez")),new HashEntry<Integer,String>(6,new String("Lopez")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(5,new String("Llorente")),new HashEntry<Integer,String>(9,new String("Marti")),new HashEntry<Integer,String>(7,new String("Benach")),new HashEntry<Integer,String>(3,new String("Ferrer")),new HashEntry<Integer,String>(1,new String("Boix"))))))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Keys(v_1).doCall().checkResult(new Integer[] { new Integer(0),new Integer(4),new Integer(8),new Integer(6),new Integer(5),new Integer(9),new Integer(7),new Integer(3),new Integer(1) }) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(0,new String("Garcia")),new HashEntry<Integer,String>(4,new String("Fernandez")),new HashEntry<Integer,String>(8,new String("Lopez")),new HashEntry<Integer,String>(6,new String("Lopez")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(5,new String("Llorente")),new HashEntry<Integer,String>(9,new String("Marti")),new HashEntry<Integer,String>(7,new String("Benach")),new HashEntry<Integer,String>(3,new String("Ferrer")),new HashEntry<Integer,String>(1,new String("Boix"))))))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,new Integer(0)).doCall().checkResult(new String("Garcia")) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(0,new String("Garcia")),new HashEntry<Integer,String>(4,new String("Fernandez")),new HashEntry<Integer,String>(8,new String("Lopez")),new HashEntry<Integer,String>(6,new String("Lopez")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(5,new String("Llorente")),new HashEntry<Integer,String>(9,new String("Marti")),new HashEntry<Integer,String>(7,new String("Benach")),new HashEntry<Integer,String>(3,new String("Ferrer")),new HashEntry<Integer,String>(1,new String("Boix"))))))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new IsEmpty(v_1).doCall().checkResult(new Boolean(false)) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(0,new String("Garcia")),new HashEntry<Integer,String>(4,new String("Fernandez")),new HashEntry<Integer,String>(8,new String("Lopez")),new HashEntry<Integer,String>(6,new String("Lopez")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(5,new String("Llorente")),new HashEntry<Integer,String>(9,new String("Marti")),new HashEntry<Integer,String>(7,new String("Benach")),new HashEntry<Integer,String>(3,new String("Ferrer")),new HashEntry<Integer,String>(1,new String("Boix"))))))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,new Integer(9),new String("Bonet")).doCall().checkResult(new String("Marti")) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(0,new String("Garcia")),new HashEntry<Integer,String>(4,new String("Fernandez")),new HashEntry<Integer,String>(8,new String("Lopez")),new HashEntry<Integer,String>(6,new String("Lopez")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(5,new String("Llorente")),new HashEntry<Integer,String>(9,new String("Bonet")),new HashEntry<Integer,String>(7,new String("Benach")),new HashEntry<Integer,String>(3,new String("Ferrer")),new HashEntry<Integer,String>(1,new String("Boix"))))))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,new Integer(6)).doCall().checkResult(new String("Lopez")) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(0,new String("Garcia")),new HashEntry<Integer,String>(4,new String("Fernandez")),new HashEntry<Integer,String>(8,new String("Lopez")),new HashEntry<Integer,String>(6,new String("Lopez")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(5,new String("Llorente")),new HashEntry<Integer,String>(9,new String("Bonet")),new HashEntry<Integer,String>(7,new String("Benach")),new HashEntry<Integer,String>(3,new String("Ferrer")),new HashEntry<Integer,String>(1,new String("Boix"))))))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,new Integer(6)).doCall().checkResult(new String("Lopez")) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(0,new String("Garcia")),new HashEntry<Integer,String>(4,new String("Fernandez")),new HashEntry<Integer,String>(8,new String("Lopez")),new HashEntry<Integer,String>(6,new String("Lopez")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(5,new String("Llorente")),new HashEntry<Integer,String>(9,new String("Bonet")),new HashEntry<Integer,String>(7,new String("Benach")),new HashEntry<Integer,String>(3,new String("Ferrer")),new HashEntry<Integer,String>(1,new String("Boix"))))))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,new Integer(1),new String("Prats")).doCall().checkResult(new String("Boix")) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(0,new String("Garcia")),new HashEntry<Integer,String>(4,new String("Fernandez")),new HashEntry<Integer,String>(8,new String("Lopez")),new HashEntry<Integer,String>(6,new String("Lopez")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(5,new String("Llorente")),new HashEntry<Integer,String>(9,new String("Bonet")),new HashEntry<Integer,String>(7,new String("Benach")),new HashEntry<Integer,String>(3,new String("Ferrer")),new HashEntry<Integer,String>(1,new String("Prats"))))))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Entries(v_1).doCall().checkResult(TestUtils.toGenericArray(new HashEntry<Integer,String>(0,new String("Garcia")),new HashEntry<Integer,String>(4,new String("Fernandez")),new HashEntry<Integer,String>(8,new String("Lopez")),new HashEntry<Integer,String>(6,new String("Lopez")),new HashEntry<Integer,String>(5,new String("Llorente")),new HashEntry<Integer,String>(9,new String("Bonet")),new HashEntry<Integer,String>(7,new String("Benach")),new HashEntry<Integer,String>(3,new String("Ferrer")),new HashEntry<Integer,String>(1,new String("Prats")))) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(0,new String("Garcia")),new HashEntry<Integer,String>(4,new String("Fernandez")),new HashEntry<Integer,String>(8,new String("Lopez")),new HashEntry<Integer,String>(6,new String("Lopez")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(5,new String("Llorente")),new HashEntry<Integer,String>(9,new String("Bonet")),new HashEntry<Integer,String>(7,new String("Benach")),new HashEntry<Integer,String>(3,new String("Ferrer")),new HashEntry<Integer,String>(1,new String("Prats"))))))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Size(v_1).doCall().checkResult(new Integer(9)) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(0,new String("Garcia")),new HashEntry<Integer,String>(4,new String("Fernandez")),new HashEntry<Integer,String>(8,new String("Lopez")),new HashEntry<Integer,String>(6,new String("Lopez")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(5,new String("Llorente")),new HashEntry<Integer,String>(9,new String("Bonet")),new HashEntry<Integer,String>(7,new String("Benach")),new HashEntry<Integer,String>(3,new String("Ferrer")),new HashEntry<Integer,String>(1,new String("Prats"))))))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new IsEmpty(v_1).doCall().checkResult(new Boolean(false)) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(0,new String("Garcia")),new HashEntry<Integer,String>(4,new String("Fernandez")),new HashEntry<Integer,String>(8,new String("Lopez")),new HashEntry<Integer,String>(6,new String("Lopez")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(5,new String("Llorente")),new HashEntry<Integer,String>(9,new String("Bonet")),new HashEntry<Integer,String>(7,new String("Benach")),new HashEntry<Integer,String>(3,new String("Ferrer")),new HashEntry<Integer,String>(1,new String("Prats"))))))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,new Integer(3),new String("Lopez")).doCall().checkResult(new String("Ferrer")) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(0,new String("Garcia")),new HashEntry<Integer,String>(4,new String("Fernandez")),new HashEntry<Integer,String>(8,new String("Lopez")),new HashEntry<Integer,String>(6,new String("Lopez")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(5,new String("Llorente")),new HashEntry<Integer,String>(9,new String("Bonet")),new HashEntry<Integer,String>(7,new String("Benach")),new HashEntry<Integer,String>(3,new String("Lopez")),new HashEntry<Integer,String>(1,new String("Prats"))))))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new ContainsKey(v_1,new Integer(6)).doCall().checkResult(new Boolean(true)) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(0,new String("Garcia")),new HashEntry<Integer,String>(4,new String("Fernandez")),new HashEntry<Integer,String>(8,new String("Lopez")),new HashEntry<Integer,String>(6,new String("Lopez")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(5,new String("Llorente")),new HashEntry<Integer,String>(9,new String("Bonet")),new HashEntry<Integer,String>(7,new String("Benach")),new HashEntry<Integer,String>(3,new String("Lopez")),new HashEntry<Integer,String>(1,new String("Prats"))))))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,new Integer(3),new String("Albuixech")).doCall().checkResult(new String("Lopez")) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(0,new String("Garcia")),new HashEntry<Integer,String>(4,new String("Fernandez")),new HashEntry<Integer,String>(8,new String("Lopez")),new HashEntry<Integer,String>(6,new String("Lopez")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(5,new String("Llorente")),new HashEntry<Integer,String>(9,new String("Bonet")),new HashEntry<Integer,String>(7,new String("Benach")),new HashEntry<Integer,String>(3,new String("Albuixech")),new HashEntry<Integer,String>(1,new String("Prats"))))))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,new Integer(1),new String("Echeberria")).doCall().checkResult(new String("Prats")) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(0,new String("Garcia")),new HashEntry<Integer,String>(4,new String("Fernandez")),new HashEntry<Integer,String>(8,new String("Lopez")),new HashEntry<Integer,String>(6,new String("Lopez")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(5,new String("Llorente")),new HashEntry<Integer,String>(9,new String("Bonet")),new HashEntry<Integer,String>(7,new String("Benach")),new HashEntry<Integer,String>(3,new String("Albuixech")),new HashEntry<Integer,String>(1,new String("Echeberria"))))))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,new Integer(0),new String("Rodriguez")).doCall().checkResult(new String("Garcia")) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(0,new String("Rodriguez")),new HashEntry<Integer,String>(4,new String("Fernandez")),new HashEntry<Integer,String>(8,new String("Lopez")),new HashEntry<Integer,String>(6,new String("Lopez")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(5,new String("Llorente")),new HashEntry<Integer,String>(9,new String("Bonet")),new HashEntry<Integer,String>(7,new String("Benach")),new HashEntry<Integer,String>(3,new String("Albuixech")),new HashEntry<Integer,String>(1,new String("Echeberria"))))))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Remove(v_1,new Integer(7)).doCall().checkResult(new String("Benach")) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(0,new String("Rodriguez")),new HashEntry<Integer,String>(4,new String("Fernandez")),new HashEntry<Integer,String>(8,new String("Lopez")),new HashEntry<Integer,String>(6,new String("Lopez")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(5,new String("Llorente")),new HashEntry<Integer,String>(9,new String("Bonet")),new HashEntry<Integer,String>(3,new String("Albuixech")),new HashEntry<Integer,String>(1,new String("Echeberria"))))))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,new Integer(6),new String("Lopez")).doCall().checkResult(new String("Lopez")) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(0,new String("Rodriguez")),new HashEntry<Integer,String>(4,new String("Fernandez")),new HashEntry<Integer,String>(8,new String("Lopez")),new HashEntry<Integer,String>(6,new String("Lopez")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(5,new String("Llorente")),new HashEntry<Integer,String>(9,new String("Bonet")),new HashEntry<Integer,String>(3,new String("Albuixech")),new HashEntry<Integer,String>(1,new String("Echeberria"))))))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Remove(v_1,new Integer(4)).doCall().checkResult(new String("Fernandez")) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(0,new String("Rodriguez")),new HashEntry<Integer,String>(8,new String("Lopez")),new HashEntry<Integer,String>(6,new String("Lopez")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(5,new String("Llorente")),new HashEntry<Integer,String>(9,new String("Bonet")),new HashEntry<Integer,String>(3,new String("Albuixech")),new HashEntry<Integer,String>(1,new String("Echeberria"))))))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new IsEmpty(v_1).doCall().checkResult(new Boolean(false)) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(0,new String("Rodriguez")),new HashEntry<Integer,String>(8,new String("Lopez")),new HashEntry<Integer,String>(6,new String("Lopez")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(5,new String("Llorente")),new HashEntry<Integer,String>(9,new String("Bonet")),new HashEntry<Integer,String>(3,new String("Albuixech")),new HashEntry<Integer,String>(1,new String("Echeberria"))))))).doCall().checkResult(true) ;
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
    ResultsHandler.add_result(new String("hashtable"),resultIs) ;
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
TestResult<HashTable<Integer,String>,Void> v_0 = null ;
HashTable<Integer,String> v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_48") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_48")) ;
if (ok_sofar)
{
  v_0 = new Constructor(2).doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new Size(v_1).doCall().checkResult(new Integer(0)) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray()),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray())))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Size(v_1).doCall().checkResult(new Integer(0)) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray()),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray())))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,new Integer(9),new String("Alzaga")).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray()),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(9,new String("Alzaga"))))))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Remove(v_1,new Integer(9)).doCall().checkResult(new String("Alzaga")) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray()),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray())))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,new Integer(1),new String("Ferrer")).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray()),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(1,new String("Ferrer"))))))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,new Integer(1)).doCall().checkResult(new String("Ferrer")) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray()),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(1,new String("Ferrer"))))))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new IsEmpty(v_1).doCall().checkResult(new Boolean(false)) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray()),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(1,new String("Ferrer"))))))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,new Integer(0),new String("Prats")).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(0,new String("Prats")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(1,new String("Ferrer"))))))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,new Integer(0),new String("Llorente")).doCall().checkResult(new String("Prats")) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(0,new String("Llorente")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(1,new String("Ferrer"))))))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Entries(v_1).doCall().checkResult(TestUtils.toGenericArray(new HashEntry<Integer,String>(0,new String("Llorente")),new HashEntry<Integer,String>(1,new String("Ferrer")))) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(0,new String("Llorente")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(1,new String("Ferrer"))))))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new IsEmpty(v_1).doCall().checkResult(new Boolean(false)) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(0,new String("Llorente")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(1,new String("Ferrer"))))))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new IsEmpty(v_1).doCall().checkResult(new Boolean(false)) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(0,new String("Llorente")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(1,new String("Ferrer"))))))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,new Integer(1),new String("Bonet")).doCall().checkResult(new String("Ferrer")) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(0,new String("Llorente")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(1,new String("Bonet"))))))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,new Integer(4),new String("Navarro")).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(0,new String("Llorente")),new HashEntry<Integer,String>(4,new String("Navarro")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(1,new String("Bonet"))))))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,new Integer(1)).doCall().checkResult(new String("Bonet")) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(0,new String("Llorente")),new HashEntry<Integer,String>(4,new String("Navarro")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(1,new String("Bonet"))))))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Size(v_1).doCall().checkResult(new Integer(3)) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(0,new String("Llorente")),new HashEntry<Integer,String>(4,new String("Navarro")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(1,new String("Bonet"))))))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Size(v_1).doCall().checkResult(new Integer(3)) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(0,new String("Llorente")),new HashEntry<Integer,String>(4,new String("Navarro")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(1,new String("Bonet"))))))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,new Integer(9)).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(0,new String("Llorente")),new HashEntry<Integer,String>(4,new String("Navarro")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(1,new String("Bonet"))))))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new ContainsKey(v_1,new Integer(1)).doCall().checkResult(new Boolean(true)) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(0,new String("Llorente")),new HashEntry<Integer,String>(4,new String("Navarro")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(1,new String("Bonet"))))))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,new Integer(4)).doCall().checkResult(new String("Navarro")) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(0,new String("Llorente")),new HashEntry<Integer,String>(4,new String("Navarro")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(1,new String("Bonet"))))))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,new Integer(4)).doCall().checkResult(new String("Navarro")) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(0,new String("Llorente")),new HashEntry<Integer,String>(4,new String("Navarro")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(1,new String("Bonet"))))))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new IsEmpty(v_1).doCall().checkResult(new Boolean(false)) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(0,new String("Llorente")),new HashEntry<Integer,String>(4,new String("Navarro")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(1,new String("Bonet"))))))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,new Integer(1)).doCall().checkResult(new String("Bonet")) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(0,new String("Llorente")),new HashEntry<Integer,String>(4,new String("Navarro")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(1,new String("Bonet"))))))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,new Integer(5),new String("Castro")).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(0,new String("Llorente")),new HashEntry<Integer,String>(4,new String("Navarro")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(1,new String("Bonet")),new HashEntry<Integer,String>(5,new String("Castro"))))))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Entries(v_1).doCall().checkResult(TestUtils.toGenericArray(new HashEntry<Integer,String>(0,new String("Llorente")),new HashEntry<Integer,String>(4,new String("Navarro")),new HashEntry<Integer,String>(1,new String("Bonet")),new HashEntry<Integer,String>(5,new String("Castro")))) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(0,new String("Llorente")),new HashEntry<Integer,String>(4,new String("Navarro")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(1,new String("Bonet")),new HashEntry<Integer,String>(5,new String("Castro"))))))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,new Integer(10),new String("Bonet")).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(0,new String("Llorente")),new HashEntry<Integer,String>(4,new String("Navarro")),new HashEntry<Integer,String>(10,new String("Bonet")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(1,new String("Bonet")),new HashEntry<Integer,String>(5,new String("Castro"))))))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,new Integer(4),new String("Prats")).doCall().checkResult(new String("Navarro")) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(0,new String("Llorente")),new HashEntry<Integer,String>(4,new String("Prats")),new HashEntry<Integer,String>(10,new String("Bonet")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(1,new String("Bonet")),new HashEntry<Integer,String>(5,new String("Castro"))))))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Remove(v_1,new Integer(1)).doCall().checkResult(new String("Bonet")) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(0,new String("Llorente")),new HashEntry<Integer,String>(4,new String("Prats")),new HashEntry<Integer,String>(10,new String("Bonet")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(5,new String("Castro"))))))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,new Integer(6),new String("Fernandez")).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(0,new String("Llorente")),new HashEntry<Integer,String>(4,new String("Prats")),new HashEntry<Integer,String>(10,new String("Bonet")),new HashEntry<Integer,String>(6,new String("Fernandez")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(5,new String("Castro"))))))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Remove(v_1,new Integer(10)).doCall().checkResult(new String("Bonet")) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(0,new String("Llorente")),new HashEntry<Integer,String>(4,new String("Prats")),new HashEntry<Integer,String>(6,new String("Fernandez")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(5,new String("Castro"))))))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,new Integer(4),new String("Boix")).doCall().checkResult(new String("Prats")) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(0,new String("Llorente")),new HashEntry<Integer,String>(4,new String("Boix")),new HashEntry<Integer,String>(6,new String("Fernandez")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(5,new String("Castro"))))))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,new Integer(7),new String("Sanchez")).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(0,new String("Llorente")),new HashEntry<Integer,String>(4,new String("Boix")),new HashEntry<Integer,String>(6,new String("Fernandez")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(5,new String("Castro")),new HashEntry<Integer,String>(7,new String("Sanchez"))))))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Entries(v_1).doCall().checkResult(TestUtils.toGenericArray(new HashEntry<Integer,String>(0,new String("Llorente")),new HashEntry<Integer,String>(4,new String("Boix")),new HashEntry<Integer,String>(6,new String("Fernandez")),new HashEntry<Integer,String>(5,new String("Castro")),new HashEntry<Integer,String>(7,new String("Sanchez")))) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(0,new String("Llorente")),new HashEntry<Integer,String>(4,new String("Boix")),new HashEntry<Integer,String>(6,new String("Fernandez")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(5,new String("Castro")),new HashEntry<Integer,String>(7,new String("Sanchez"))))))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Entries(v_1).doCall().checkResult(TestUtils.toGenericArray(new HashEntry<Integer,String>(0,new String("Llorente")),new HashEntry<Integer,String>(4,new String("Boix")),new HashEntry<Integer,String>(6,new String("Fernandez")),new HashEntry<Integer,String>(5,new String("Castro")),new HashEntry<Integer,String>(7,new String("Sanchez")))) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(0,new String("Llorente")),new HashEntry<Integer,String>(4,new String("Boix")),new HashEntry<Integer,String>(6,new String("Fernandez")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(5,new String("Castro")),new HashEntry<Integer,String>(7,new String("Sanchez"))))))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,new Integer(3),new String("Fernandez")).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(0,new String("Llorente")),new HashEntry<Integer,String>(4,new String("Boix")),new HashEntry<Integer,String>(6,new String("Fernandez")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(5,new String("Castro")),new HashEntry<Integer,String>(7,new String("Sanchez")),new HashEntry<Integer,String>(3,new String("Fernandez"))))))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Size(v_1).doCall().checkResult(new Integer(6)) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(0,new String("Llorente")),new HashEntry<Integer,String>(4,new String("Boix")),new HashEntry<Integer,String>(6,new String("Fernandez")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(5,new String("Castro")),new HashEntry<Integer,String>(7,new String("Sanchez")),new HashEntry<Integer,String>(3,new String("Fernandez"))))))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,new Integer(1),new String("Castro")).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(0,new String("Llorente")),new HashEntry<Integer,String>(4,new String("Boix")),new HashEntry<Integer,String>(6,new String("Fernandez")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(5,new String("Castro")),new HashEntry<Integer,String>(7,new String("Sanchez")),new HashEntry<Integer,String>(3,new String("Fernandez")),new HashEntry<Integer,String>(1,new String("Castro"))))))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,new Integer(0)).doCall().checkResult(new String("Llorente")) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(0,new String("Llorente")),new HashEntry<Integer,String>(4,new String("Boix")),new HashEntry<Integer,String>(6,new String("Fernandez")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(5,new String("Castro")),new HashEntry<Integer,String>(7,new String("Sanchez")),new HashEntry<Integer,String>(3,new String("Fernandez")),new HashEntry<Integer,String>(1,new String("Castro"))))))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new IsEmpty(v_1).doCall().checkResult(new Boolean(false)) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(0,new String("Llorente")),new HashEntry<Integer,String>(4,new String("Boix")),new HashEntry<Integer,String>(6,new String("Fernandez")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(5,new String("Castro")),new HashEntry<Integer,String>(7,new String("Sanchez")),new HashEntry<Integer,String>(3,new String("Fernandez")),new HashEntry<Integer,String>(1,new String("Castro"))))))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Remove(v_1,new Integer(3)).doCall().checkResult(new String("Fernandez")) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(0,new String("Llorente")),new HashEntry<Integer,String>(4,new String("Boix")),new HashEntry<Integer,String>(6,new String("Fernandez")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(5,new String("Castro")),new HashEntry<Integer,String>(7,new String("Sanchez")),new HashEntry<Integer,String>(1,new String("Castro"))))))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,new Integer(6),new String("Llorente")).doCall().checkResult(new String("Fernandez")) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(0,new String("Llorente")),new HashEntry<Integer,String>(4,new String("Boix")),new HashEntry<Integer,String>(6,new String("Llorente")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(5,new String("Castro")),new HashEntry<Integer,String>(7,new String("Sanchez")),new HashEntry<Integer,String>(1,new String("Castro"))))))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,new Integer(8),new String("Garcia")).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(0,new String("Llorente")),new HashEntry<Integer,String>(4,new String("Boix")),new HashEntry<Integer,String>(6,new String("Llorente")),new HashEntry<Integer,String>(8,new String("Garcia")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(5,new String("Castro")),new HashEntry<Integer,String>(7,new String("Sanchez")),new HashEntry<Integer,String>(1,new String("Castro"))))))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,new Integer(1),new String("Echeberria")).doCall().checkResult(new String("Castro")) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(0,new String("Llorente")),new HashEntry<Integer,String>(4,new String("Boix")),new HashEntry<Integer,String>(6,new String("Llorente")),new HashEntry<Integer,String>(8,new String("Garcia")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(5,new String("Castro")),new HashEntry<Integer,String>(7,new String("Sanchez")),new HashEntry<Integer,String>(1,new String("Echeberria"))))))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,new Integer(10),new String("Lopez")).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(0,new String("Llorente")),new HashEntry<Integer,String>(4,new String("Boix")),new HashEntry<Integer,String>(6,new String("Llorente")),new HashEntry<Integer,String>(8,new String("Garcia")),new HashEntry<Integer,String>(10,new String("Lopez")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(5,new String("Castro")),new HashEntry<Integer,String>(7,new String("Sanchez")),new HashEntry<Integer,String>(1,new String("Echeberria"))))))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,new Integer(10)).doCall().checkResult(new String("Lopez")) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(0,new String("Llorente")),new HashEntry<Integer,String>(4,new String("Boix")),new HashEntry<Integer,String>(6,new String("Llorente")),new HashEntry<Integer,String>(8,new String("Garcia")),new HashEntry<Integer,String>(10,new String("Lopez")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(5,new String("Castro")),new HashEntry<Integer,String>(7,new String("Sanchez")),new HashEntry<Integer,String>(1,new String("Echeberria"))))))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,new Integer(5),new String("Prats")).doCall().checkResult(new String("Castro")) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(0,new String("Llorente")),new HashEntry<Integer,String>(4,new String("Boix")),new HashEntry<Integer,String>(6,new String("Llorente")),new HashEntry<Integer,String>(8,new String("Garcia")),new HashEntry<Integer,String>(10,new String("Lopez")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(5,new String("Prats")),new HashEntry<Integer,String>(7,new String("Sanchez")),new HashEntry<Integer,String>(1,new String("Echeberria"))))))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,new Integer(0),new String("Rossello")).doCall().checkResult(new String("Llorente")) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(0,new String("Rossello")),new HashEntry<Integer,String>(4,new String("Boix")),new HashEntry<Integer,String>(6,new String("Llorente")),new HashEntry<Integer,String>(8,new String("Garcia")),new HashEntry<Integer,String>(10,new String("Lopez")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(5,new String("Prats")),new HashEntry<Integer,String>(7,new String("Sanchez")),new HashEntry<Integer,String>(1,new String("Echeberria"))))))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Entries(v_1).doCall().checkResult(TestUtils.toGenericArray(new HashEntry<Integer,String>(0,new String("Rossello")),new HashEntry<Integer,String>(4,new String("Boix")),new HashEntry<Integer,String>(6,new String("Llorente")),new HashEntry<Integer,String>(8,new String("Garcia")),new HashEntry<Integer,String>(10,new String("Lopez")),new HashEntry<Integer,String>(5,new String("Prats")),new HashEntry<Integer,String>(7,new String("Sanchez")),new HashEntry<Integer,String>(1,new String("Echeberria")))) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(0,new String("Rossello")),new HashEntry<Integer,String>(4,new String("Boix")),new HashEntry<Integer,String>(6,new String("Llorente")),new HashEntry<Integer,String>(8,new String("Garcia")),new HashEntry<Integer,String>(10,new String("Lopez")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(5,new String("Prats")),new HashEntry<Integer,String>(7,new String("Sanchez")),new HashEntry<Integer,String>(1,new String("Echeberria"))))))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new ContainsKey(v_1,new Integer(8)).doCall().checkResult(new Boolean(true)) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(0,new String("Rossello")),new HashEntry<Integer,String>(4,new String("Boix")),new HashEntry<Integer,String>(6,new String("Llorente")),new HashEntry<Integer,String>(8,new String("Garcia")),new HashEntry<Integer,String>(10,new String("Lopez")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(5,new String("Prats")),new HashEntry<Integer,String>(7,new String("Sanchez")),new HashEntry<Integer,String>(1,new String("Echeberria"))))))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Size(v_1).doCall().checkResult(new Integer(8)) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(0,new String("Rossello")),new HashEntry<Integer,String>(4,new String("Boix")),new HashEntry<Integer,String>(6,new String("Llorente")),new HashEntry<Integer,String>(8,new String("Garcia")),new HashEntry<Integer,String>(10,new String("Lopez")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(5,new String("Prats")),new HashEntry<Integer,String>(7,new String("Sanchez")),new HashEntry<Integer,String>(1,new String("Echeberria"))))))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Get(v_1,new Integer(6)).doCall().checkResult(new String("Llorente")) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(0,new String("Rossello")),new HashEntry<Integer,String>(4,new String("Boix")),new HashEntry<Integer,String>(6,new String("Llorente")),new HashEntry<Integer,String>(8,new String("Garcia")),new HashEntry<Integer,String>(10,new String("Lopez")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(5,new String("Prats")),new HashEntry<Integer,String>(7,new String("Sanchez")),new HashEntry<Integer,String>(1,new String("Echeberria"))))))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Remove(v_1,new Integer(1)).doCall().checkResult(new String("Echeberria")) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(0,new String("Rossello")),new HashEntry<Integer,String>(4,new String("Boix")),new HashEntry<Integer,String>(6,new String("Llorente")),new HashEntry<Integer,String>(8,new String("Garcia")),new HashEntry<Integer,String>(10,new String("Lopez")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(5,new String("Prats")),new HashEntry<Integer,String>(7,new String("Sanchez"))))))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,new Integer(9),new String("Alzaga")).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(0,new String("Rossello")),new HashEntry<Integer,String>(4,new String("Boix")),new HashEntry<Integer,String>(6,new String("Llorente")),new HashEntry<Integer,String>(8,new String("Garcia")),new HashEntry<Integer,String>(10,new String("Lopez")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(5,new String("Prats")),new HashEntry<Integer,String>(7,new String("Sanchez")),new HashEntry<Integer,String>(9,new String("Alzaga"))))))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,new Integer(9),new String("Benach")).doCall().checkResult(new String("Alzaga")) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(0,new String("Rossello")),new HashEntry<Integer,String>(4,new String("Boix")),new HashEntry<Integer,String>(6,new String("Llorente")),new HashEntry<Integer,String>(8,new String("Garcia")),new HashEntry<Integer,String>(10,new String("Lopez")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(5,new String("Prats")),new HashEntry<Integer,String>(7,new String("Sanchez")),new HashEntry<Integer,String>(9,new String("Benach"))))))).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new Put(v_1,new Integer(2),new String("Sanchez")).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new Buckets(v_1,new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>>(TestUtils.toGenericArray(new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(0,new String("Rossello")),new HashEntry<Integer,String>(4,new String("Boix")),new HashEntry<Integer,String>(6,new String("Llorente")),new HashEntry<Integer,String>(8,new String("Garcia")),new HashEntry<Integer,String>(10,new String("Lopez")),new HashEntry<Integer,String>(2,new String("Sanchez")))),new es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>(TestUtils.toGenericArray(new HashEntry<Integer,String>(5,new String("Prats")),new HashEntry<Integer,String>(7,new String("Sanchez")),new HashEntry<Integer,String>(9,new String("Benach"))))))).doCall().checkResult(true) ;
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
    ResultsHandler.add_result(new String("hashtable"),resultIs) ;
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
    ResultsHandler.add_result(new String("person"),resultIs) ;
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
  ok_sofar = new Equals(new Person(new String("99999"),new String("Ander"),new String("Alzaga"),new String("Echeberria")),new Person(new String("66666"),new String("Mireia"),new String("Alzaga"),new String("Prats"))).doCall().checkResult(new Boolean(false)) ;
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
    ResultsHandler.add_result(new String("person"),resultIs) ;
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
  ok_sofar = new Equals(new Person(new String("X7777"),new String("Alicia"),new String("Rossello"),new String("Ferrer")),new Person(new String("3333"),new String("Alejandro"),new String("Martinez"),new String("Bonet"))).doCall().checkResult(new Boolean(false)) ;
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
    ResultsHandler.add_result(new String("person"),resultIs) ;
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
  ok_sofar = new HashCode(new Person(new String("99999"),new String("Jordi"),new String("Alzaga"),new String("Sanchez"))).doCall().checkResult(new Integer(54395385)) ;
if (ok_sofar)
  ok_sofar = new HashCode(new Person(new String("99999"),new String("Pedro"),new String("Ferrer"),new String("Goicoechea"))).doCall().checkResult(new Integer(54395385)) ;
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
    ResultsHandler.add_result(new String("person"),resultIs) ;
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
  ok_sofar = new HashCode(new Person(new String("X7777"),new String("Marc"),new String("Perez"),new String("Rossello"))).doCall().checkResult(new Integer(82962968)) ;
if (ok_sofar)
  ok_sofar = new HashCode(new Person(new String("99999"),new String("Jordi"),new String("Lopez"),new String("Gonzalez"))).doCall().checkResult(new Integer(54395385)) ;
if (ok_sofar)
  ok_sofar = new Equals(new Person(new String("99999"),new String("Alejandro"),new String("Albuixech"),new String("Gonzalez")),new Person(new String("88888"),new String("Marc"),new String("Fernandez"),new String("Benach"))).doCall().checkResult(new Boolean(false)) ;
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
    ResultsHandler.add_result(new String("person"),resultIs) ;
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
  ok_sofar = new HashCode(new Person(new String("2222"),new String("Susana"),new String("Gonzalez"),new String("Sanchez"))).doCall().checkResult(new Integer(1539200)) ;
if (ok_sofar)
  ok_sofar = new HashCode(new Person(new String("4444Z"),new String("Isabel"),new String("Albuixech"),new String("Perez"))).doCall().checkResult(new Integer(49623898)) ;
if (ok_sofar)
  ok_sofar = new Equals(new Person(new String("X7777"),new String("Noa"),new String("Alzaga"),new String("Bonet")),new Person(new String("99999"),new String("Alejandro"),new String("Benach"),new String("Castro"))).doCall().checkResult(new Boolean(false)) ;
if (ok_sofar)
  ok_sofar = new HashCode(new Person(new String("55555"),new String("Isabel"),new String("Prats"),new String("Prats"))).doCall().checkResult(new Integer(50578165)) ;
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
    ResultsHandler.add_result(new String("person"),resultIs) ;
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
  ok_sofar = new HashCode(new Person(new String("99999"),new String("Pedro"),new String("Gonzalez"),new String("Rodriguez"))).doCall().checkResult(new Integer(54395385)) ;
if (ok_sofar)
  ok_sofar = new HashCode(new Person(new String("2222"),new String("Jose"),new String("Rodriguez"),new String("Marin"))).doCall().checkResult(new Integer(1539200)) ;
if (ok_sofar)
  ok_sofar = new Equals(new Person(new String("4444Z"),new String("Juan"),new String("Gonzalez"),new String("Castro")),new Person(new String("4444Z"),new String("Juan"),new String("Gonzalez"),new String("Castro"))).doCall().checkResult(new Boolean(true)) ;
if (ok_sofar)
  ok_sofar = new Equals(new Person(new String("4444Z"),new String("Jose"),new String("Marin"),new String("Fernandez")),new Person(new String("66666"),new String("Susana"),new String("Sanchez"),new String("Sanchez"))).doCall().checkResult(new Boolean(false)) ;
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
    ResultsHandler.add_result(new String("person"),resultIs) ;
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
  ok_sofar = new Equals(new Person(new String("3333"),new String("Paloma"),new String("Fernandez"),new String("Bonet")),new Person(new String("88888"),new String("Oier"),new String("Rossello"),new String("Sanchez"))).doCall().checkResult(new Boolean(false)) ;
if (ok_sofar)
  ok_sofar = new HashCode(new Person(new String("3333"),new String("Juan"),new String("Gonzalez"),new String("Garcia"))).doCall().checkResult(new Integer(1569984)) ;
if (ok_sofar)
  ok_sofar = new HashCode(new Person(new String("99999"),new String("Leire"),new String("Marin"),new String("Lopez"))).doCall().checkResult(new Integer(54395385)) ;
if (ok_sofar)
  ok_sofar = new Equals(new Person(new String("88888"),new String("Ane"),new String("Alzaga"),new String("Benach")),new Person(new String("99999"),new String("Guillem"),new String("Garcia"),new String("Goicoechea"))).doCall().checkResult(new Boolean(false)) ;
if (ok_sofar)
  ok_sofar = new Equals(new Person(new String("4444Z"),new String("Andreu"),new String("Navarro"),new String("Boix")),new Person(new String("99999"),new String("Marc"),new String("Gonzalez"),new String("Ferrer"))).doCall().checkResult(new Boolean(false)) ;
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
    ResultsHandler.add_result(new String("person"),resultIs) ;
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
  ok_sofar = new HashCode(new Person(new String("88888"),new String("Maria"),new String("Benach"),new String("Herrera"))).doCall().checkResult(new Integer(53441080)) ;
if (ok_sofar)
  ok_sofar = new HashCode(new Person(new String("3333"),new String("Susana"),new String("Goicoechea"),new String("Marti"))).doCall().checkResult(new Integer(1569984)) ;
if (ok_sofar)
  ok_sofar = new HashCode(new Person(new String("3333"),new String("Laura"),new String("Lopez"),new String("Fernandez"))).doCall().checkResult(new Integer(1569984)) ;
if (ok_sofar)
  ok_sofar = new HashCode(new Person(new String("88888"),new String("Iker"),new String("Bonet"),new String("Garcia"))).doCall().checkResult(new Integer(53441080)) ;
if (ok_sofar)
  ok_sofar = new HashCode(new Person(new String("88888"),new String("Susana"),new String("Boix"),new String("Rossello"))).doCall().checkResult(new Integer(53441080)) ;
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
    ResultsHandler.add_result(new String("person"),resultIs) ;
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
  ok_sofar = new HashCode(new Person(new String("X7777"),new String("Alejandro"),new String("Alzaga"),new String("Lopez"))).doCall().checkResult(new Integer(82962968)) ;
if (ok_sofar)
  ok_sofar = new Equals(new Person(new String("1111"),new String("Laura"),new String("Garcia"),new String("Ferrer")),new Person(new String("3333"),new String("Leire"),new String("Garcia"),new String("Marti"))).doCall().checkResult(new Boolean(false)) ;
if (ok_sofar)
  ok_sofar = new HashCode(new Person(new String("99999"),new String("Lucia"),new String("Llorente"),new String("Marin"))).doCall().checkResult(new Integer(54395385)) ;
if (ok_sofar)
  ok_sofar = new Equals(new Person(new String("1111"),new String("Jose"),new String("Perez"),new String("Lopez")),new Person(new String("4444Z"),new String("Alicia"),new String("Marin"),new String("Benach"))).doCall().checkResult(new Boolean(false)) ;
if (ok_sofar)
  ok_sofar = new HashCode(new Person(new String("3333"),new String("Susana"),new String("Marti"),new String("Marin"))).doCall().checkResult(new Integer(1569984)) ;
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
    ResultsHandler.add_result(new String("person"),resultIs) ;
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
  ok_sofar = new Equals(new Person(new String("4444Z"),new String("Andreu"),new String("Castro"),new String("Rodriguez")),new Person(new String("88888"),new String("Leire"),new String("Lopez"),new String("Albuixech"))).doCall().checkResult(new Boolean(false)) ;
if (ok_sofar)
  ok_sofar = new Equals(new Person(new String("4444Z"),new String("Andreu"),new String("Bonet"),new String("Albuixech")),new Person(new String("4444Z"),new String("Andreu"),new String("Bonet"),new String("Albuixech"))).doCall().checkResult(new Boolean(true)) ;
if (ok_sofar)
  ok_sofar = new HashCode(new Person(new String("1111"),new String("Leire"),new String("Rossello"),new String("Herrera"))).doCall().checkResult(new Integer(1508416)) ;
if (ok_sofar)
  ok_sofar = new HashCode(new Person(new String("X7777"),new String("Susana"),new String("Bonet"),new String("Echeberria"))).doCall().checkResult(new Integer(82962968)) ;
if (ok_sofar)
  ok_sofar = new HashCode(new Person(new String("66666"),new String("Ane"),new String("Garcia"),new String("Ferrer"))).doCall().checkResult(new Integer(51532470)) ;
if (ok_sofar)
  ok_sofar = new HashCode(new Person(new String("1111"),new String("Isabel"),new String("Sanchez"),new String("Marin"))).doCall().checkResult(new Integer(1508416)) ;
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
    ResultsHandler.add_result(new String("person"),resultIs) ;
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
  ok_sofar = new HashCode(new Person(new String("1111"),new String("Mikel"),new String("Bonet"),new String("Rodriguez"))).doCall().checkResult(new Integer(1508416)) ;
if (ok_sofar)
  ok_sofar = new HashCode(new Person(new String("2222"),new String("Paula"),new String("Echeberria"),new String("Albuixech"))).doCall().checkResult(new Integer(1539200)) ;
if (ok_sofar)
  ok_sofar = new HashCode(new Person(new String("99999"),new String("Maria"),new String("Alzaga"),new String("Fernandez"))).doCall().checkResult(new Integer(54395385)) ;
if (ok_sofar)
  ok_sofar = new Equals(new Person(new String("3333"),new String("Joana"),new String("Rossello"),new String("Boix")),null).doCall().checkResult(new Boolean(false)) ;
if (ok_sofar)
  ok_sofar = new HashCode(new Person(new String("99999"),new String("Lucia"),new String("Alzaga"),new String("Navarro"))).doCall().checkResult(new Integer(54395385)) ;
if (ok_sofar)
  ok_sofar = new Equals(new Person(new String("66666"),new String("Noa"),new String("Navarro"),new String("Castro")),new Person(new String("4444Z"),new String("Alicia"),new String("Navarro"),new String("Goicoechea"))).doCall().checkResult(new Boolean(false)) ;
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
    ResultsHandler.add_result(new String("person"),resultIs) ;
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
  ok_sofar = new HashCode(new Person(new String("1111"),new String("Mikel"),new String("Rodriguez"),new String("Lopez"))).doCall().checkResult(new Integer(1508416)) ;
if (ok_sofar)
  ok_sofar = new Equals(new Person(new String("3333"),new String("Juan"),new String("Martinez"),new String("Rodriguez")),null).doCall().checkResult(new Boolean(false)) ;
if (ok_sofar)
  ok_sofar = new Equals(new Person(new String("4444Z"),new String("Laia"),new String("Benach"),new String("Bonet")),new Person(new String("4444Z"),new String("Laia"),new String("Benach"),new String("Bonet"))).doCall().checkResult(new Boolean(true)) ;
if (ok_sofar)
  ok_sofar = new Equals(new Person(new String("4444Z"),new String("Maria"),new String("Herrera"),new String("Rodriguez")),new Person(new String("2222"),new String("Ander"),new String("Castro"),new String("Goicoechea"))).doCall().checkResult(new Boolean(false)) ;
if (ok_sofar)
  ok_sofar = new HashCode(new Person(new String("X7777"),new String("Paula"),new String("Garcia"),new String("Marin"))).doCall().checkResult(new Integer(82962968)) ;
if (ok_sofar)
  ok_sofar = new HashCode(new Person(new String("3333"),new String("Alicia"),new String("Perez"),new String("Prats"))).doCall().checkResult(new Integer(1569984)) ;
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
    ResultsHandler.add_result(new String("person"),resultIs) ;
    System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_62 () 
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
TestData.testName = new String("test_62") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_62")) ;
if (ok_sofar)
  ok_sofar = new HashCode(new Person(new String("1111"),new String("Julia"),new String("Alzaga"),new String("Alzaga"))).doCall().checkResult(new Integer(1508416)) ;
if (ok_sofar)
  ok_sofar = new HashCode(new Person(new String("2222"),new String("Joana"),new String("Martinez"),new String("Alzaga"))).doCall().checkResult(new Integer(1539200)) ;
if (ok_sofar)
  ok_sofar = new HashCode(new Person(new String("66666"),new String("Ibai"),new String("Rossello"),new String("Fernandez"))).doCall().checkResult(new Integer(51532470)) ;
if (ok_sofar)
  ok_sofar = new HashCode(new Person(new String("88888"),new String("Laia"),new String("Castro"),new String("Albuixech"))).doCall().checkResult(new Integer(53441080)) ;
if (ok_sofar)
  ok_sofar = new Equals(new Person(new String("99999"),new String("Guillem"),new String("Navarro"),new String("Perez")),new Person(new String("3333"),new String("Pedro"),new String("Gonzalez"),new String("Rossello"))).doCall().checkResult(new Boolean(false)) ;
if (ok_sofar)
  ok_sofar = new HashCode(new Person(new String("4444Z"),new String("Pedro"),new String("Echeberria"),new String("Garcia"))).doCall().checkResult(new Integer(49623898)) ;
if (ok_sofar)
  ok_sofar = new Equals(new Person(new String("3333"),new String("Antonio"),new String("Echeberria"),new String("Perez")),new Person(new String("88888"),new String("Noa"),new String("Goicoechea"),new String("Boix"))).doCall().checkResult(new Boolean(false)) ;
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
    ResultsHandler.stopTest(new String("test_62")) ;
    ResultsHandler.add_result(new String("person"),resultIs) ;
    System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_63 () 
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
TestData.testName = new String("test_63") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_63")) ;
if (ok_sofar)
  ok_sofar = new HashCode(new Person(new String("3333"),new String("Lucia"),new String("Bonet"),new String("Marin"))).doCall().checkResult(new Integer(1569984)) ;
if (ok_sofar)
  ok_sofar = new Equals(new Person(new String("4444Z"),new String("Jordi"),new String("Lopez"),new String("Llorente")),new Person(new String("66666"),new String("Irati"),new String("Alzaga"),new String("Navarro"))).doCall().checkResult(new Boolean(false)) ;
if (ok_sofar)
  ok_sofar = new Equals(new Person(new String("99999"),new String("Mireia"),new String("Fernandez"),new String("Sanchez")),new Person(new String("X7777"),new String("Manuel"),new String("Ferrer"),new String("Marin"))).doCall().checkResult(new Boolean(false)) ;
if (ok_sofar)
  ok_sofar = new Equals(new Person(new String("55555"),new String("Mireia"),new String("Ferrer"),new String("Martinez")),new Person(new String("88888"),new String("Leire"),new String("Fernandez"),new String("Castro"))).doCall().checkResult(new Boolean(false)) ;
if (ok_sofar)
  ok_sofar = new HashCode(new Person(new String("1111"),new String("Marc"),new String("Sanchez"),new String("Rodriguez"))).doCall().checkResult(new Integer(1508416)) ;
if (ok_sofar)
  ok_sofar = new HashCode(new Person(new String("1111"),new String("Iker"),new String("Rodriguez"),new String("Sanchez"))).doCall().checkResult(new Integer(1508416)) ;
if (ok_sofar)
  ok_sofar = new Equals(new Person(new String("55555"),new String("Oier"),new String("Rodriguez"),new String("Martinez")),new Person(new String("2222"),new String("Francesca"),new String("Alzaga"),new String("Gonzalez"))).doCall().checkResult(new Boolean(false)) ;
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
    ResultsHandler.stopTest(new String("test_63")) ;
    ResultsHandler.add_result(new String("person"),resultIs) ;
    System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_64 () 
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
TestData.testName = new String("test_64") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_64")) ;
if (ok_sofar)
  ok_sofar = new Equals(new Person(new String("1111"),new String("Mikel"),new String("Sanchez"),new String("Martinez")),new Person(new String("4444Z"),new String("Sara"),new String("Sanchez"),new String("Rossello"))).doCall().checkResult(new Boolean(false)) ;
if (ok_sofar)
  ok_sofar = new Equals(new Person(new String("4444Z"),new String("Ane"),new String("Fernandez"),new String("Boix")),new Person(new String("X7777"),new String("Joana"),new String("Fernandez"),new String("Echeberria"))).doCall().checkResult(new Boolean(false)) ;
if (ok_sofar)
  ok_sofar = new HashCode(new Person(new String("55555"),new String("Jordi"),new String("Herrera"),new String("Castro"))).doCall().checkResult(new Integer(50578165)) ;
if (ok_sofar)
  ok_sofar = new HashCode(new Person(new String("88888"),new String("Carmen"),new String("Sanchez"),new String("Bonet"))).doCall().checkResult(new Integer(53441080)) ;
if (ok_sofar)
  ok_sofar = new Equals(new Person(new String("55555"),new String("Jordi"),new String("Alzaga"),new String("Echeberria")),new Person(new String("88888"),new String("Miguel"),new String("Marin"),new String("Perez"))).doCall().checkResult(new Boolean(false)) ;
if (ok_sofar)
  ok_sofar = new Equals(new Person(new String("88888"),new String("Julia"),new String("Benach"),new String("Garcia")),null).doCall().checkResult(new Boolean(false)) ;
if (ok_sofar)
  ok_sofar = new HashCode(new Person(new String("4444Z"),new String("Antonio"),new String("Boix"),new String("Prats"))).doCall().checkResult(new Integer(49623898)) ;
if (ok_sofar)
  ok_sofar = new HashCode(new Person(new String("4444Z"),new String("Teresa"),new String("Lopez"),new String("Ferrer"))).doCall().checkResult(new Integer(49623898)) ;
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
    ResultsHandler.stopTest(new String("test_64")) ;
    ResultsHandler.add_result(new String("person"),resultIs) ;
    System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_65 () 
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
TestData.testName = new String("test_65") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_65")) ;
if (ok_sofar)
  ok_sofar = new HashCode(new Person(new String("3333"),new String("Irati"),new String("Martinez"),new String("Alzaga"))).doCall().checkResult(new Integer(1569984)) ;
if (ok_sofar)
  ok_sofar = new Equals(new Person(new String("X7777"),new String("Leire"),new String("Prats"),new String("Boix")),new Person(new String("55555"),new String("Noa"),new String("Alzaga"),new String("Echeberria"))).doCall().checkResult(new Boolean(false)) ;
if (ok_sofar)
  ok_sofar = new HashCode(new Person(new String("55555"),new String("Laura"),new String("Echeberria"),new String("Boix"))).doCall().checkResult(new Integer(50578165)) ;
if (ok_sofar)
  ok_sofar = new Equals(new Person(new String("3333"),new String("Jose"),new String("Perez"),new String("Perez")),new Person(new String("4444Z"),new String("Julia"),new String("Benach"),new String("Llorente"))).doCall().checkResult(new Boolean(false)) ;
if (ok_sofar)
  ok_sofar = new Equals(new Person(new String("2222"),new String("Pedro"),new String("Echeberria"),new String("Lopez")),new Person(new String("3333"),new String("Susana"),new String("Fernandez"),new String("Alzaga"))).doCall().checkResult(new Boolean(false)) ;
if (ok_sofar)
  ok_sofar = new Equals(new Person(new String("88888"),new String("Julia"),new String("Alzaga"),new String("Martinez")),new Person(new String("1111"),new String("Mireia"),new String("Sanchez"),new String("Lopez"))).doCall().checkResult(new Boolean(false)) ;
if (ok_sofar)
  ok_sofar = new HashCode(new Person(new String("55555"),new String("Julia"),new String("Bonet"),new String("Goicoechea"))).doCall().checkResult(new Integer(50578165)) ;
if (ok_sofar)
  ok_sofar = new Equals(new Person(new String("2222"),new String("Isabel"),new String("Sanchez"),new String("Perez")),new Person(new String("55555"),new String("Pablo"),new String("Gonzalez"),new String("Castro"))).doCall().checkResult(new Boolean(false)) ;
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
    ResultsHandler.stopTest(new String("test_65")) ;
    ResultsHandler.add_result(new String("person"),resultIs) ;
    System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_66 () 
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
TestData.testName = new String("test_66") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_66")) ;
if (ok_sofar)
  ok_sofar = new HashCode(new Person(new String("2222"),new String("Mireia"),new String("Sanchez"),new String("Ferrer"))).doCall().checkResult(new Integer(1539200)) ;
if (ok_sofar)
  ok_sofar = new Equals(new Person(new String("55555"),new String("Ander"),new String("Lopez"),new String("Navarro")),new Person(new String("X7777"),new String("Pedro"),new String("Herrera"),new String("Echeberria"))).doCall().checkResult(new Boolean(false)) ;
if (ok_sofar)
  ok_sofar = new Equals(new Person(new String("1111"),new String("Antonio"),new String("Echeberria"),new String("Lopez")),new Person(new String("55555"),new String("Alejandro"),new String("Martinez"),new String("Fernandez"))).doCall().checkResult(new Boolean(false)) ;
if (ok_sofar)
  ok_sofar = new Equals(new Person(new String("X7777"),new String("Maria"),new String("Fernandez"),new String("Alzaga")),new Person(new String("99999"),new String("Noa"),new String("Prats"),new String("Castro"))).doCall().checkResult(new Boolean(false)) ;
if (ok_sofar)
  ok_sofar = new HashCode(new Person(new String("4444Z"),new String("Ander"),new String("Herrera"),new String("Bonet"))).doCall().checkResult(new Integer(49623898)) ;
if (ok_sofar)
  ok_sofar = new Equals(new Person(new String("99999"),new String("Alicia"),new String("Goicoechea"),new String("Navarro")),new Person(new String("66666"),new String("Juan"),new String("Garcia"),new String("Echeberria"))).doCall().checkResult(new Boolean(false)) ;
if (ok_sofar)
  ok_sofar = new HashCode(new Person(new String("3333"),new String("Ander"),new String("Marin"),new String("Navarro"))).doCall().checkResult(new Integer(1569984)) ;
if (ok_sofar)
  ok_sofar = new Equals(new Person(new String("1111"),new String("Mireia"),new String("Herrera"),new String("Ferrer")),new Person(new String("4444Z"),new String("Julia"),new String("Rossello"),new String("Echeberria"))).doCall().checkResult(new Boolean(false)) ;
if (ok_sofar)
  ok_sofar = new Equals(new Person(new String("1111"),new String("Laia"),new String("Echeberria"),new String("Martinez")),new Person(new String("66666"),new String("Manuel"),new String("Navarro"),new String("Herrera"))).doCall().checkResult(new Boolean(false)) ;
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
    ResultsHandler.stopTest(new String("test_66")) ;
    ResultsHandler.add_result(new String("person"),resultIs) ;
    System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_67 () 
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
TestData.testName = new String("test_67") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_67")) ;
if (ok_sofar)
  ok_sofar = new Equals(new Person(new String("66666"),new String("Mikel"),new String("Garcia"),new String("Albuixech")),new Person(new String("X7777"),new String("Francesca"),new String("Gonzalez"),new String("Ferrer"))).doCall().checkResult(new Boolean(false)) ;
if (ok_sofar)
  ok_sofar = new Equals(new Person(new String("1111"),new String("Julia"),new String("Ferrer"),new String("Gonzalez")),new Person(new String("4444Z"),new String("Alejandro"),new String("Rodriguez"),new String("Lopez"))).doCall().checkResult(new Boolean(false)) ;
if (ok_sofar)
  ok_sofar = new HashCode(new Person(new String("99999"),new String("Susana"),new String("Alzaga"),new String("Fernandez"))).doCall().checkResult(new Integer(54395385)) ;
if (ok_sofar)
  ok_sofar = new HashCode(new Person(new String("66666"),new String("Paloma"),new String("Martinez"),new String("Bonet"))).doCall().checkResult(new Integer(51532470)) ;
if (ok_sofar)
  ok_sofar = new HashCode(new Person(new String("66666"),new String("Juan"),new String("Castro"),new String("Castro"))).doCall().checkResult(new Integer(51532470)) ;
if (ok_sofar)
  ok_sofar = new HashCode(new Person(new String("3333"),new String("Oier"),new String("Ferrer"),new String("Rossello"))).doCall().checkResult(new Integer(1569984)) ;
if (ok_sofar)
  ok_sofar = new HashCode(new Person(new String("55555"),new String("Joana"),new String("Prats"),new String("Boix"))).doCall().checkResult(new Integer(50578165)) ;
if (ok_sofar)
  ok_sofar = new Equals(new Person(new String("X7777"),new String("Laia"),new String("Perez"),new String("Boix")),new Person(new String("66666"),new String("Iker"),new String("Prats"),new String("Herrera"))).doCall().checkResult(new Boolean(false)) ;
if (ok_sofar)
  ok_sofar = new HashCode(new Person(new String("4444Z"),new String("Susana"),new String("Garcia"),new String("Boix"))).doCall().checkResult(new Integer(49623898)) ;
if (ok_sofar)
  ok_sofar = new HashCode(new Person(new String("99999"),new String("Joana"),new String("Benach"),new String("Boix"))).doCall().checkResult(new Integer(54395385)) ;
if (ok_sofar)
  ok_sofar = new HashCode(new Person(new String("66666"),new String("Francesca"),new String("Sanchez"),new String("Fernandez"))).doCall().checkResult(new Integer(51532470)) ;
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
    ResultsHandler.stopTest(new String("test_67")) ;
    ResultsHandler.add_result(new String("person"),resultIs) ;
    System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_68 () 
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
TestData.testName = new String("test_68") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_68")) ;
if (ok_sofar)
  ok_sofar = new Equals(new Person(new String("X7777"),new String("Manuel"),new String("Ferrer"),new String("Goicoechea")),new Person(new String("88888"),new String("Oier"),new String("Herrera"),new String("Garcia"))).doCall().checkResult(new Boolean(false)) ;
if (ok_sofar)
  ok_sofar = new HashCode(new Person(new String("X7777"),new String("Laura"),new String("Benach"),new String("Martinez"))).doCall().checkResult(new Integer(82962968)) ;
if (ok_sofar)
  ok_sofar = new HashCode(new Person(new String("66666"),new String("Miguel"),new String("Alzaga"),new String("Albuixech"))).doCall().checkResult(new Integer(51532470)) ;
if (ok_sofar)
  ok_sofar = new Equals(new Person(new String("3333"),new String("Joana"),new String("Sanchez"),new String("Boix")),new Person(new String("1111"),new String("Isabel"),new String("Prats"),new String("Goicoechea"))).doCall().checkResult(new Boolean(false)) ;
if (ok_sofar)
  ok_sofar = new Equals(new Person(new String("66666"),new String("Ibai"),new String("Albuixech"),new String("Alzaga")),null).doCall().checkResult(new Boolean(false)) ;
if (ok_sofar)
  ok_sofar = new Equals(new Person(new String("55555"),new String("Alejandro"),new String("Martinez"),new String("Ferrer")),new Person(new String("4444Z"),new String("Irati"),new String("Marti"),new String("Ferrer"))).doCall().checkResult(new Boolean(false)) ;
if (ok_sofar)
  ok_sofar = new Equals(new Person(new String("1111"),new String("Alejandro"),new String("Albuixech"),new String("Navarro")),new Person(new String("55555"),new String("Joana"),new String("Sanchez"),new String("Marin"))).doCall().checkResult(new Boolean(false)) ;
if (ok_sofar)
  ok_sofar = new Equals(new Person(new String("88888"),new String("Julia"),new String("Prats"),new String("Marti")),new Person(new String("3333"),new String("Leire"),new String("Ferrer"),new String("Echeberria"))).doCall().checkResult(new Boolean(false)) ;
if (ok_sofar)
  ok_sofar = new HashCode(new Person(new String("1111"),new String("Susana"),new String("Fernandez"),new String("Echeberria"))).doCall().checkResult(new Integer(1508416)) ;
if (ok_sofar)
  ok_sofar = new HashCode(new Person(new String("99999"),new String("Francesca"),new String("Fernandez"),new String("Goicoechea"))).doCall().checkResult(new Integer(54395385)) ;
if (ok_sofar)
  ok_sofar = new HashCode(new Person(new String("3333"),new String("Marc"),new String("Rodriguez"),new String("Albuixech"))).doCall().checkResult(new Integer(1569984)) ;
if (ok_sofar)
  ok_sofar = new HashCode(new Person(new String("99999"),new String("Unai"),new String("Rodriguez"),new String("Alzaga"))).doCall().checkResult(new Integer(54395385)) ;
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
    ResultsHandler.stopTest(new String("test_68")) ;
    ResultsHandler.add_result(new String("person"),resultIs) ;
    System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_69 () 
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
TestData.testName = new String("test_69") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_69")) ;
if (ok_sofar)
  ok_sofar = new HashCode(new Person(new String("66666"),new String("Mikel"),new String("Perez"),new String("Llorente"))).doCall().checkResult(new Integer(51532470)) ;
if (ok_sofar)
  ok_sofar = new Equals(new Person(new String("66666"),new String("Laia"),new String("Gonzalez"),new String("Sanchez")),new Person(new String("1111"),new String("Mireia"),new String("Alzaga"),new String("Alzaga"))).doCall().checkResult(new Boolean(false)) ;
if (ok_sofar)
  ok_sofar = new HashCode(new Person(new String("2222"),new String("Francisco"),new String("Herrera"),new String("Garcia"))).doCall().checkResult(new Integer(1539200)) ;
if (ok_sofar)
  ok_sofar = new HashCode(new Person(new String("3333"),new String("Oier"),new String("Herrera"),new String("Benach"))).doCall().checkResult(new Integer(1569984)) ;
if (ok_sofar)
  ok_sofar = new Equals(new Person(new String("66666"),new String("Pedro"),new String("Fernandez"),new String("Benach")),new Person(new String("88888"),new String("Francisco"),new String("Rossello"),new String("Gonzalez"))).doCall().checkResult(new Boolean(false)) ;
if (ok_sofar)
  ok_sofar = new HashCode(new Person(new String("55555"),new String("Iker"),new String("Gonzalez"),new String("Marti"))).doCall().checkResult(new Integer(50578165)) ;
if (ok_sofar)
  ok_sofar = new HashCode(new Person(new String("66666"),new String("Francesca"),new String("Benach"),new String("Ferrer"))).doCall().checkResult(new Integer(51532470)) ;
if (ok_sofar)
  ok_sofar = new Equals(new Person(new String("1111"),new String("Ane"),new String("Benach"),new String("Marin")),new Person(new String("88888"),new String("Pablo"),new String("Perez"),new String("Boix"))).doCall().checkResult(new Boolean(false)) ;
if (ok_sofar)
  ok_sofar = new HashCode(new Person(new String("4444Z"),new String("Antonio"),new String("Sanchez"),new String("Lopez"))).doCall().checkResult(new Integer(49623898)) ;
if (ok_sofar)
  ok_sofar = new Equals(new Person(new String("3333"),new String("Guillem"),new String("Lopez"),new String("Navarro")),new Person(new String("88888"),new String("Isabel"),new String("Ferrer"),new String("Goicoechea"))).doCall().checkResult(new Boolean(false)) ;
if (ok_sofar)
  ok_sofar = new HashCode(new Person(new String("X7777"),new String("Isabel"),new String("Navarro"),new String("Marin"))).doCall().checkResult(new Integer(82962968)) ;
if (ok_sofar)
  ok_sofar = new Equals(new Person(new String("55555"),new String("Lucia"),new String("Rodriguez"),new String("Echeberria")),new Person(new String("X7777"),new String("Joana"),new String("Rossello"),new String("Rodriguez"))).doCall().checkResult(new Boolean(false)) ;
if (ok_sofar)
  ok_sofar = new HashCode(new Person(new String("2222"),new String("Marc"),new String("Martinez"),new String("Echeberria"))).doCall().checkResult(new Integer(1539200)) ;
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
    ResultsHandler.stopTest(new String("test_69")) ;
    ResultsHandler.add_result(new String("person"),resultIs) ;
    System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_70 () 
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
TestData.testName = new String("test_70") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_70")) ;
if (ok_sofar)
  ok_sofar = new HashCode(new Person(new String("99999"),new String("Julia"),new String("Ferrer"),new String("Herrera"))).doCall().checkResult(new Integer(54395385)) ;
if (ok_sofar)
  ok_sofar = new HashCode(new Person(new String("2222"),new String("Manuel"),new String("Goicoechea"),new String("Navarro"))).doCall().checkResult(new Integer(1539200)) ;
if (ok_sofar)
  ok_sofar = new Equals(new Person(new String("2222"),new String("Unai"),new String("Herrera"),new String("Boix")),new Person(new String("99999"),new String("Mikel"),new String("Echeberria"),new String("Garcia"))).doCall().checkResult(new Boolean(false)) ;
if (ok_sofar)
  ok_sofar = new HashCode(new Person(new String("3333"),new String("Alejandro"),new String("Fernandez"),new String("Bonet"))).doCall().checkResult(new Integer(1569984)) ;
if (ok_sofar)
  ok_sofar = new HashCode(new Person(new String("X7777"),new String("Isabel"),new String("Marin"),new String("Herrera"))).doCall().checkResult(new Integer(82962968)) ;
if (ok_sofar)
  ok_sofar = new HashCode(new Person(new String("1111"),new String("Ibai"),new String("Herrera"),new String("Bonet"))).doCall().checkResult(new Integer(1508416)) ;
if (ok_sofar)
  ok_sofar = new HashCode(new Person(new String("X7777"),new String("Paula"),new String("Fernandez"),new String("Albuixech"))).doCall().checkResult(new Integer(82962968)) ;
if (ok_sofar)
  ok_sofar = new Equals(new Person(new String("X7777"),new String("Marc"),new String("Albuixech"),new String("Marti")),new Person(new String("X7777"),new String("Marc"),new String("Albuixech"),new String("Marti"))).doCall().checkResult(new Boolean(true)) ;
if (ok_sofar)
  ok_sofar = new HashCode(new Person(new String("55555"),new String("Irati"),new String("Martinez"),new String("Marti"))).doCall().checkResult(new Integer(50578165)) ;
if (ok_sofar)
  ok_sofar = new Equals(new Person(new String("55555"),new String("Pablo"),new String("Albuixech"),new String("Marin")),new Person(new String("1111"),new String("Julia"),new String("Gonzalez"),new String("Rossello"))).doCall().checkResult(new Boolean(false)) ;
if (ok_sofar)
  ok_sofar = new Equals(new Person(new String("1111"),new String("Pablo"),new String("Rodriguez"),new String("Garcia")),new Person(new String("55555"),new String("Ane"),new String("Rossello"),new String("Alzaga"))).doCall().checkResult(new Boolean(false)) ;
if (ok_sofar)
  ok_sofar = new Equals(new Person(new String("4444Z"),new String("Lucia"),new String("Ferrer"),new String("Rossello")),new Person(new String("2222"),new String("Laura"),new String("Rossello"),new String("Llorente"))).doCall().checkResult(new Boolean(false)) ;
if (ok_sofar)
  ok_sofar = new HashCode(new Person(new String("1111"),new String("Alicia"),new String("Prats"),new String("Garcia"))).doCall().checkResult(new Integer(1508416)) ;
if (ok_sofar)
  ok_sofar = new Equals(new Person(new String("99999"),new String("Unai"),new String("Albuixech"),new String("Gonzalez")),new Person(new String("2222"),new String("Mireia"),new String("Ferrer"),new String("Castro"))).doCall().checkResult(new Boolean(false)) ;
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
    ResultsHandler.stopTest(new String("test_70")) ;
    ResultsHandler.add_result(new String("person"),resultIs) ;
    System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_71 () 
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
TestData.testName = new String("test_71") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_71")) ;
if (ok_sofar)
  ok_sofar = new HashCode(new Person(new String("99999"),new String("Lucia"),new String("Marti"),new String("Gonzalez"))).doCall().checkResult(new Integer(54395385)) ;
if (ok_sofar)
  ok_sofar = new HashCode(new Person(new String("55555"),new String("Pablo"),new String("Martinez"),new String("Rossello"))).doCall().checkResult(new Integer(50578165)) ;
if (ok_sofar)
  ok_sofar = new Equals(new Person(new String("66666"),new String("Manuel"),new String("Bonet"),new String("Bonet")),new Person(new String("2222"),new String("Miguel"),new String("Perez"),new String("Boix"))).doCall().checkResult(new Boolean(false)) ;
if (ok_sofar)
  ok_sofar = new Equals(new Person(new String("2222"),new String("Pablo"),new String("Navarro"),new String("Perez")),new Person(new String("88888"),new String("Paloma"),new String("Rossello"),new String("Boix"))).doCall().checkResult(new Boolean(false)) ;
if (ok_sofar)
  ok_sofar = new HashCode(new Person(new String("88888"),new String("Ane"),new String("Navarro"),new String("Castro"))).doCall().checkResult(new Integer(53441080)) ;
if (ok_sofar)
  ok_sofar = new Equals(new Person(new String("2222"),new String("Oier"),new String("Rodriguez"),new String("Echeberria")),new Person(new String("88888"),new String("Paula"),new String("Albuixech"),new String("Ferrer"))).doCall().checkResult(new Boolean(false)) ;
if (ok_sofar)
  ok_sofar = new Equals(new Person(new String("4444Z"),new String("Lucia"),new String("Herrera"),new String("Navarro")),new Person(new String("66666"),new String("Jose"),new String("Goicoechea"),new String("Garcia"))).doCall().checkResult(new Boolean(false)) ;
if (ok_sofar)
  ok_sofar = new Equals(new Person(new String("4444Z"),new String("Teresa"),new String("Garcia"),new String("Lopez")),new Person(new String("2222"),new String("Antonio"),new String("Marti"),new String("Marin"))).doCall().checkResult(new Boolean(false)) ;
if (ok_sofar)
  ok_sofar = new HashCode(new Person(new String("88888"),new String("Francisco"),new String("Rossello"),new String("Fernandez"))).doCall().checkResult(new Integer(53441080)) ;
if (ok_sofar)
  ok_sofar = new Equals(new Person(new String("1111"),new String("Joana"),new String("Echeberria"),new String("Rodriguez")),new Person(new String("2222"),new String("Andreu"),new String("Prats"),new String("Bonet"))).doCall().checkResult(new Boolean(false)) ;
if (ok_sofar)
  ok_sofar = new HashCode(new Person(new String("55555"),new String("Julia"),new String("Goicoechea"),new String("Echeberria"))).doCall().checkResult(new Integer(50578165)) ;
if (ok_sofar)
  ok_sofar = new HashCode(new Person(new String("2222"),new String("Mikel"),new String("Navarro"),new String("Lopez"))).doCall().checkResult(new Integer(1539200)) ;
if (ok_sofar)
  ok_sofar = new HashCode(new Person(new String("4444Z"),new String("Marc"),new String("Llorente"),new String("Prats"))).doCall().checkResult(new Integer(49623898)) ;
if (ok_sofar)
  ok_sofar = new Equals(new Person(new String("2222"),new String("Laia"),new String("Rossello"),new String("Rossello")),new Person(new String("66666"),new String("Unai"),new String("Prats"),new String("Boix"))).doCall().checkResult(new Boolean(false)) ;
if (ok_sofar)
  ok_sofar = new Equals(new Person(new String("3333"),new String("Juan"),new String("Fernandez"),new String("Sanchez")),new Person(new String("88888"),new String("Iker"),new String("Rodriguez"),new String("Gonzalez"))).doCall().checkResult(new Boolean(false)) ;
if (ok_sofar)
  ok_sofar = new HashCode(new Person(new String("55555"),new String("Joana"),new String("Bonet"),new String("Goicoechea"))).doCall().checkResult(new Integer(50578165)) ;
if (ok_sofar)
  ok_sofar = new Equals(new Person(new String("55555"),new String("Teresa"),new String("Goicoechea"),new String("Bonet")),new Person(new String("88888"),new String("Unai"),new String("Llorente"),new String("Echeberria"))).doCall().checkResult(new Boolean(false)) ;
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
    ResultsHandler.stopTest(new String("test_71")) ;
    ResultsHandler.add_result(new String("person"),resultIs) ;
    System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_72 () 
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
TestData.testName = new String("test_72") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_72")) ;
if (ok_sofar)
  ok_sofar = new HashCode(new Person(new String("2222"),new String("Ibai"),new String("Echeberria"),new String("Goicoechea"))).doCall().checkResult(new Integer(1539200)) ;
if (ok_sofar)
  ok_sofar = new Equals(new Person(new String("99999"),new String("Miguel"),new String("Albuixech"),new String("Goicoechea")),new Person(new String("55555"),new String("Irati"),new String("Herrera"),new String("Benach"))).doCall().checkResult(new Boolean(false)) ;
if (ok_sofar)
  ok_sofar = new HashCode(new Person(new String("88888"),new String("Alicia"),new String("Navarro"),new String("Llorente"))).doCall().checkResult(new Integer(53441080)) ;
if (ok_sofar)
  ok_sofar = new Equals(new Person(new String("2222"),new String("Antonio"),new String("Benach"),new String("Benach")),new Person(new String("4444Z"),new String("Unai"),new String("Lopez"),new String("Llorente"))).doCall().checkResult(new Boolean(false)) ;
if (ok_sofar)
  ok_sofar = new Equals(new Person(new String("X7777"),new String("Francisco"),new String("Rodriguez"),new String("Goicoechea")),null).doCall().checkResult(new Boolean(false)) ;
if (ok_sofar)
  ok_sofar = new HashCode(new Person(new String("4444Z"),new String("Andreu"),new String("Llorente"),new String("Navarro"))).doCall().checkResult(new Integer(49623898)) ;
if (ok_sofar)
  ok_sofar = new Equals(new Person(new String("1111"),new String("Mikel"),new String("Castro"),new String("Boix")),new Person(new String("55555"),new String("Lucia"),new String("Rossello"),new String("Martinez"))).doCall().checkResult(new Boolean(false)) ;
if (ok_sofar)
  ok_sofar = new HashCode(new Person(new String("1111"),new String("Leire"),new String("Alzaga"),new String("Garcia"))).doCall().checkResult(new Integer(1508416)) ;
if (ok_sofar)
  ok_sofar = new HashCode(new Person(new String("2222"),new String("Jose"),new String("Prats"),new String("Castro"))).doCall().checkResult(new Integer(1539200)) ;
if (ok_sofar)
  ok_sofar = new HashCode(new Person(new String("66666"),new String("Ane"),new String("Herrera"),new String("Goicoechea"))).doCall().checkResult(new Integer(51532470)) ;
if (ok_sofar)
  ok_sofar = new Equals(new Person(new String("55555"),new String("Mireia"),new String("Garcia"),new String("Garcia")),new Person(new String("3333"),new String("Andreu"),new String("Navarro"),new String("Goicoechea"))).doCall().checkResult(new Boolean(false)) ;
if (ok_sofar)
  ok_sofar = new Equals(new Person(new String("1111"),new String("Pablo"),new String("Marin"),new String("Prats")),new Person(new String("99999"),new String("Joana"),new String("Echeberria"),new String("Martinez"))).doCall().checkResult(new Boolean(false)) ;
if (ok_sofar)
  ok_sofar = new HashCode(new Person(new String("1111"),new String("Leire"),new String("Marti"),new String("Rodriguez"))).doCall().checkResult(new Integer(1508416)) ;
if (ok_sofar)
  ok_sofar = new HashCode(new Person(new String("3333"),new String("Paloma"),new String("Rossello"),new String("Marin"))).doCall().checkResult(new Integer(1569984)) ;
if (ok_sofar)
  ok_sofar = new Equals(new Person(new String("X7777"),new String("Oier"),new String("Albuixech"),new String("Ferrer")),new Person(new String("4444Z"),new String("Iker"),new String("Gonzalez"),new String("Rossello"))).doCall().checkResult(new Boolean(false)) ;
if (ok_sofar)
  ok_sofar = new Equals(new Person(new String("1111"),new String("Irati"),new String("Martinez"),new String("Ferrer")),new Person(new String("88888"),new String("Carmen"),new String("Sanchez"),new String("Perez"))).doCall().checkResult(new Boolean(false)) ;
if (ok_sofar)
  ok_sofar = new Equals(new Person(new String("3333"),new String("Isabel"),new String("Sanchez"),new String("Llorente")),new Person(new String("66666"),new String("Irati"),new String("Perez"),new String("Goicoechea"))).doCall().checkResult(new Boolean(false)) ;
if (ok_sofar)
  ok_sofar = new HashCode(new Person(new String("88888"),new String("Noa"),new String("Goicoechea"),new String("Bonet"))).doCall().checkResult(new Integer(53441080)) ;
if (ok_sofar)
  ok_sofar = new Equals(new Person(new String("55555"),new String("Guillem"),new String("Castro"),new String("Sanchez")),new Person(new String("X7777"),new String("Julia"),new String("Herrera"),new String("Fernandez"))).doCall().checkResult(new Boolean(false)) ;
if (ok_sofar)
  ok_sofar = new HashCode(new Person(new String("4444Z"),new String("Alejandro"),new String("Prats"),new String("Lopez"))).doCall().checkResult(new Integer(49623898)) ;
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
    ResultsHandler.stopTest(new String("test_72")) ;
    ResultsHandler.add_result(new String("person"),resultIs) ;
    System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_73 () 
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
TestData.testName = new String("test_73") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_73")) ;
if (ok_sofar)
  ok_sofar = new Equals(new Person(new String("4444Z"),new String("Mireia"),new String("Navarro"),new String("Martinez")),new Person(new String("3333"),new String("Francesca"),new String("Alzaga"),new String("Navarro"))).doCall().checkResult(new Boolean(false)) ;
if (ok_sofar)
  ok_sofar = new Equals(new Person(new String("1111"),new String("Andreu"),new String("Rodriguez"),new String("Sanchez")),new Person(new String("2222"),new String("Jose"),new String("Boix"),new String("Bonet"))).doCall().checkResult(new Boolean(false)) ;
if (ok_sofar)
  ok_sofar = new Equals(new Person(new String("1111"),new String("Sara"),new String("Lopez"),new String("Gonzalez")),new Person(new String("4444Z"),new String("Alejandro"),new String("Martinez"),new String("Prats"))).doCall().checkResult(new Boolean(false)) ;
if (ok_sofar)
  ok_sofar = new HashCode(new Person(new String("3333"),new String("Francisco"),new String("Benach"),new String("Martinez"))).doCall().checkResult(new Integer(1569984)) ;
if (ok_sofar)
  ok_sofar = new Equals(new Person(new String("88888"),new String("Miguel"),new String("Alzaga"),new String("Echeberria")),new Person(new String("4444Z"),new String("Ibai"),new String("Bonet"),new String("Sanchez"))).doCall().checkResult(new Boolean(false)) ;
if (ok_sofar)
  ok_sofar = new Equals(new Person(new String("66666"),new String("Ane"),new String("Ferrer"),new String("Martinez")),new Person(new String("3333"),new String("Laura"),new String("Ferrer"),new String("Perez"))).doCall().checkResult(new Boolean(false)) ;
if (ok_sofar)
  ok_sofar = new Equals(new Person(new String("88888"),new String("Alejandro"),new String("Castro"),new String("Bonet")),new Person(new String("X7777"),new String("Mireia"),new String("Perez"),new String("Alzaga"))).doCall().checkResult(new Boolean(false)) ;
if (ok_sofar)
  ok_sofar = new HashCode(new Person(new String("88888"),new String("Antonio"),new String("Navarro"),new String("Ferrer"))).doCall().checkResult(new Integer(53441080)) ;
if (ok_sofar)
  ok_sofar = new HashCode(new Person(new String("3333"),new String("Mikel"),new String("Prats"),new String("Martinez"))).doCall().checkResult(new Integer(1569984)) ;
if (ok_sofar)
  ok_sofar = new HashCode(new Person(new String("88888"),new String("Teresa"),new String("Navarro"),new String("Benach"))).doCall().checkResult(new Integer(53441080)) ;
if (ok_sofar)
  ok_sofar = new Equals(new Person(new String("3333"),new String("Paloma"),new String("Boix"),new String("Benach")),new Person(new String("88888"),new String("Francesca"),new String("Lopez"),new String("Martinez"))).doCall().checkResult(new Boolean(false)) ;
if (ok_sofar)
  ok_sofar = new HashCode(new Person(new String("88888"),new String("Iker"),new String("Marin"),new String("Bonet"))).doCall().checkResult(new Integer(53441080)) ;
if (ok_sofar)
  ok_sofar = new HashCode(new Person(new String("99999"),new String("Mikel"),new String("Marin"),new String("Goicoechea"))).doCall().checkResult(new Integer(54395385)) ;
if (ok_sofar)
  ok_sofar = new Equals(new Person(new String("1111"),new String("Paloma"),new String("Marin"),new String("Garcia")),new Person(new String("X7777"),new String("Juan"),new String("Navarro"),new String("Navarro"))).doCall().checkResult(new Boolean(false)) ;
if (ok_sofar)
  ok_sofar = new Equals(new Person(new String("X7777"),new String("Pedro"),new String("Rossello"),new String("Boix")),new Person(new String("3333"),new String("Jose"),new String("Prats"),new String("Navarro"))).doCall().checkResult(new Boolean(false)) ;
if (ok_sofar)
  ok_sofar = new HashCode(new Person(new String("4444Z"),new String("Guillem"),new String("Goicoechea"),new String("Boix"))).doCall().checkResult(new Integer(49623898)) ;
if (ok_sofar)
  ok_sofar = new HashCode(new Person(new String("99999"),new String("Juan"),new String("Llorente"),new String("Alzaga"))).doCall().checkResult(new Integer(54395385)) ;
if (ok_sofar)
  ok_sofar = new HashCode(new Person(new String("55555"),new String("Sara"),new String("Rossello"),new String("Martinez"))).doCall().checkResult(new Integer(50578165)) ;
if (ok_sofar)
  ok_sofar = new Equals(new Person(new String("66666"),new String("Iker"),new String("Fernandez"),new String("Ferrer")),new Person(new String("3333"),new String("Noa"),new String("Rossello"),new String("Marti"))).doCall().checkResult(new Boolean(false)) ;
if (ok_sofar)
  ok_sofar = new HashCode(new Person(new String("99999"),new String("Paula"),new String("Prats"),new String("Goicoechea"))).doCall().checkResult(new Integer(54395385)) ;
if (ok_sofar)
  ok_sofar = new Equals(new Person(new String("99999"),new String("Laura"),new String("Benach"),new String("Herrera")),new Person(new String("1111"),new String("Jordi"),new String("Bonet"),new String("Rodriguez"))).doCall().checkResult(new Boolean(false)) ;
if (ok_sofar)
  ok_sofar = new Equals(new Person(new String("66666"),new String("Jose"),new String("Prats"),new String("Alzaga")),new Person(new String("X7777"),new String("Susana"),new String("Ferrer"),new String("Goicoechea"))).doCall().checkResult(new Boolean(false)) ;
if (ok_sofar)
  ok_sofar = new Equals(new Person(new String("4444Z"),new String("Juan"),new String("Marin"),new String("Lopez")),new Person(new String("2222"),new String("Joana"),new String("Fernandez"),new String("Navarro"))).doCall().checkResult(new Boolean(false)) ;
if (ok_sofar)
  ok_sofar = new HashCode(new Person(new String("4444Z"),new String("Juan"),new String("Albuixech"),new String("Perez"))).doCall().checkResult(new Integer(49623898)) ;
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
    ResultsHandler.stopTest(new String("test_73")) ;
    ResultsHandler.add_result(new String("person"),resultIs) ;
    System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_74 () 
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
TestData.testName = new String("test_74") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_74")) ;
if (ok_sofar)
  ok_sofar = new Equals(new Person(new String("66666"),new String("Alejandro"),new String("Boix"),new String("Martinez")),new Person(new String("2222"),new String("Ane"),new String("Llorente"),new String("Garcia"))).doCall().checkResult(new Boolean(false)) ;
if (ok_sofar)
  ok_sofar = new HashCode(new Person(new String("4444Z"),new String("Jordi"),new String("Boix"),new String("Prats"))).doCall().checkResult(new Integer(49623898)) ;
if (ok_sofar)
  ok_sofar = new Equals(new Person(new String("99999"),new String("Manuel"),new String("Lopez"),new String("Ferrer")),null).doCall().checkResult(new Boolean(false)) ;
if (ok_sofar)
  ok_sofar = new HashCode(new Person(new String("66666"),new String("Ane"),new String("Martinez"),new String("Perez"))).doCall().checkResult(new Integer(51532470)) ;
if (ok_sofar)
  ok_sofar = new Equals(new Person(new String("88888"),new String("Mireia"),new String("Lopez"),new String("Fernandez")),new Person(new String("2222"),new String("Oier"),new String("Fernandez"),new String("Marti"))).doCall().checkResult(new Boolean(false)) ;
if (ok_sofar)
  ok_sofar = new HashCode(new Person(new String("66666"),new String("Andreu"),new String("Echeberria"),new String("Bonet"))).doCall().checkResult(new Integer(51532470)) ;
if (ok_sofar)
  ok_sofar = new Equals(new Person(new String("99999"),new String("Julia"),new String("Castro"),new String("Lopez")),new Person(new String("66666"),new String("Pablo"),new String("Lopez"),new String("Marti"))).doCall().checkResult(new Boolean(false)) ;
if (ok_sofar)
  ok_sofar = new Equals(new Person(new String("2222"),new String("Mireia"),new String("Herrera"),new String("Martinez")),new Person(new String("2222"),new String("Mireia"),new String("Herrera"),new String("Martinez"))).doCall().checkResult(new Boolean(true)) ;
if (ok_sofar)
  ok_sofar = new Equals(new Person(new String("99999"),new String("Leire"),new String("Boix"),new String("Echeberria")),new Person(new String("X7777"),new String("Oier"),new String("Prats"),new String("Boix"))).doCall().checkResult(new Boolean(false)) ;
if (ok_sofar)
  ok_sofar = new HashCode(new Person(new String("88888"),new String("Mireia"),new String("Albuixech"),new String("Martinez"))).doCall().checkResult(new Integer(53441080)) ;
if (ok_sofar)
  ok_sofar = new HashCode(new Person(new String("3333"),new String("Ane"),new String("Rossello"),new String("Garcia"))).doCall().checkResult(new Integer(1569984)) ;
if (ok_sofar)
  ok_sofar = new HashCode(new Person(new String("55555"),new String("Juan"),new String("Perez"),new String("Martinez"))).doCall().checkResult(new Integer(50578165)) ;
if (ok_sofar)
  ok_sofar = new Equals(new Person(new String("66666"),new String("Miguel"),new String("Benach"),new String("Benach")),new Person(new String("55555"),new String("Carmen"),new String("Herrera"),new String("Rossello"))).doCall().checkResult(new Boolean(false)) ;
if (ok_sofar)
  ok_sofar = new Equals(new Person(new String("66666"),new String("Joana"),new String("Martinez"),new String("Marti")),new Person(new String("3333"),new String("Carmen"),new String("Fernandez"),new String("Benach"))).doCall().checkResult(new Boolean(false)) ;
if (ok_sofar)
  ok_sofar = new Equals(new Person(new String("88888"),new String("Unai"),new String("Ferrer"),new String("Ferrer")),null).doCall().checkResult(new Boolean(false)) ;
if (ok_sofar)
  ok_sofar = new Equals(new Person(new String("88888"),new String("Isabel"),new String("Ferrer"),new String("Benach")),new Person(new String("66666"),new String("Jose"),new String("Lopez"),new String("Marti"))).doCall().checkResult(new Boolean(false)) ;
if (ok_sofar)
  ok_sofar = new HashCode(new Person(new String("88888"),new String("Isabel"),new String("Rossello"),new String("Albuixech"))).doCall().checkResult(new Integer(53441080)) ;
if (ok_sofar)
  ok_sofar = new HashCode(new Person(new String("99999"),new String("Juan"),new String("Albuixech"),new String("Benach"))).doCall().checkResult(new Integer(54395385)) ;
if (ok_sofar)
  ok_sofar = new Equals(new Person(new String("66666"),new String("Miguel"),new String("Castro"),new String("Sanchez")),new Person(new String("4444Z"),new String("Jordi"),new String("Benach"),new String("Alzaga"))).doCall().checkResult(new Boolean(false)) ;
if (ok_sofar)
  ok_sofar = new HashCode(new Person(new String("99999"),new String("Maria"),new String("Benach"),new String("Rodriguez"))).doCall().checkResult(new Integer(54395385)) ;
if (ok_sofar)
  ok_sofar = new Equals(new Person(new String("3333"),new String("Maria"),new String("Fernandez"),new String("Fernandez")),new Person(new String("4444Z"),new String("Ane"),new String("Echeberria"),new String("Albuixech"))).doCall().checkResult(new Boolean(false)) ;
if (ok_sofar)
  ok_sofar = new Equals(new Person(new String("4444Z"),new String("Mikel"),new String("Rodriguez"),new String("Lopez")),null).doCall().checkResult(new Boolean(false)) ;
if (ok_sofar)
  ok_sofar = new Equals(new Person(new String("2222"),new String("Laura"),new String("Goicoechea"),new String("Gonzalez")),new Person(new String("99999"),new String("Oier"),new String("Llorente"),new String("Fernandez"))).doCall().checkResult(new Boolean(false)) ;
if (ok_sofar)
  ok_sofar = new Equals(new Person(new String("55555"),new String("Alicia"),new String("Ferrer"),new String("Marin")),new Person(new String("99999"),new String("Paloma"),new String("Fernandez"),new String("Alzaga"))).doCall().checkResult(new Boolean(false)) ;
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
    ResultsHandler.stopTest(new String("test_74")) ;
    ResultsHandler.add_result(new String("person"),resultIs) ;
    System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_75 () 
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
TestData.testName = new String("test_75") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_75")) ;
if (ok_sofar)
  ok_sofar = new HashCode(new Person(new String("3333"),new String("Unai"),new String("Alzaga"),new String("Boix"))).doCall().checkResult(new Integer(1569984)) ;
if (ok_sofar)
  ok_sofar = new Equals(new Person(new String("55555"),new String("Maria"),new String("Castro"),new String("Garcia")),new Person(new String("2222"),new String("Jordi"),new String("Martinez"),new String("Alzaga"))).doCall().checkResult(new Boolean(false)) ;
if (ok_sofar)
  ok_sofar = new HashCode(new Person(new String("88888"),new String("Mireia"),new String("Llorente"),new String("Martinez"))).doCall().checkResult(new Integer(53441080)) ;
if (ok_sofar)
  ok_sofar = new HashCode(new Person(new String("99999"),new String("Ibai"),new String("Sanchez"),new String("Albuixech"))).doCall().checkResult(new Integer(54395385)) ;
if (ok_sofar)
  ok_sofar = new HashCode(new Person(new String("2222"),new String("Noa"),new String("Garcia"),new String("Navarro"))).doCall().checkResult(new Integer(1539200)) ;
if (ok_sofar)
  ok_sofar = new HashCode(new Person(new String("X7777"),new String("Pedro"),new String("Navarro"),new String("Bonet"))).doCall().checkResult(new Integer(82962968)) ;
if (ok_sofar)
  ok_sofar = new HashCode(new Person(new String("2222"),new String("Leire"),new String("Navarro"),new String("Boix"))).doCall().checkResult(new Integer(1539200)) ;
if (ok_sofar)
  ok_sofar = new HashCode(new Person(new String("88888"),new String("Carmen"),new String("Sanchez"),new String("Perez"))).doCall().checkResult(new Integer(53441080)) ;
if (ok_sofar)
  ok_sofar = new Equals(new Person(new String("2222"),new String("Francisco"),new String("Alzaga"),new String("Alzaga")),new Person(new String("66666"),new String("Julia"),new String("Alzaga"),new String("Sanchez"))).doCall().checkResult(new Boolean(false)) ;
if (ok_sofar)
  ok_sofar = new Equals(new Person(new String("88888"),new String("Ander"),new String("Perez"),new String("Albuixech")),new Person(new String("99999"),new String("Alejandro"),new String("Boix"),new String("Prats"))).doCall().checkResult(new Boolean(false)) ;
if (ok_sofar)
  ok_sofar = new Equals(new Person(new String("88888"),new String("Isabel"),new String("Rodriguez"),new String("Sanchez")),new Person(new String("99999"),new String("Pedro"),new String("Benach"),new String("Llorente"))).doCall().checkResult(new Boolean(false)) ;
if (ok_sofar)
  ok_sofar = new Equals(new Person(new String("4444Z"),new String("Joana"),new String("Garcia"),new String("Echeberria")),new Person(new String("99999"),new String("Pedro"),new String("Marin"),new String("Boix"))).doCall().checkResult(new Boolean(false)) ;
if (ok_sofar)
  ok_sofar = new Equals(new Person(new String("55555"),new String("Alejandro"),new String("Martinez"),new String("Ferrer")),new Person(new String("1111"),new String("Laura"),new String("Albuixech"),new String("Perez"))).doCall().checkResult(new Boolean(false)) ;
if (ok_sofar)
  ok_sofar = new HashCode(new Person(new String("55555"),new String("Paloma"),new String("Herrera"),new String("Bonet"))).doCall().checkResult(new Integer(50578165)) ;
if (ok_sofar)
  ok_sofar = new HashCode(new Person(new String("4444Z"),new String("Sara"),new String("Benach"),new String("Perez"))).doCall().checkResult(new Integer(49623898)) ;
if (ok_sofar)
  ok_sofar = new HashCode(new Person(new String("88888"),new String("Isabel"),new String("Navarro"),new String("Bonet"))).doCall().checkResult(new Integer(53441080)) ;
if (ok_sofar)
  ok_sofar = new HashCode(new Person(new String("66666"),new String("Antonio"),new String("Marin"),new String("Alzaga"))).doCall().checkResult(new Integer(51532470)) ;
if (ok_sofar)
  ok_sofar = new Equals(new Person(new String("55555"),new String("Maria"),new String("Herrera"),new String("Lopez")),null).doCall().checkResult(new Boolean(false)) ;
if (ok_sofar)
  ok_sofar = new Equals(new Person(new String("4444Z"),new String("Isabel"),new String("Martinez"),new String("Prats")),new Person(new String("1111"),new String("Oier"),new String("Ferrer"),new String("Gonzalez"))).doCall().checkResult(new Boolean(false)) ;
if (ok_sofar)
  ok_sofar = new Equals(new Person(new String("4444Z"),new String("Sara"),new String("Garcia"),new String("Goicoechea")),new Person(new String("1111"),new String("Teresa"),new String("Navarro"),new String("Herrera"))).doCall().checkResult(new Boolean(false)) ;
if (ok_sofar)
  ok_sofar = new HashCode(new Person(new String("1111"),new String("Isabel"),new String("Herrera"),new String("Navarro"))).doCall().checkResult(new Integer(1508416)) ;
if (ok_sofar)
  ok_sofar = new Equals(new Person(new String("88888"),new String("Paloma"),new String("Martinez"),new String("Rodriguez")),new Person(new String("X7777"),new String("Ander"),new String("Perez"),new String("Perez"))).doCall().checkResult(new Boolean(false)) ;
if (ok_sofar)
  ok_sofar = new Equals(new Person(new String("2222"),new String("Lucia"),new String("Alzaga"),new String("Bonet")),new Person(new String("1111"),new String("Jordi"),new String("Echeberria"),new String("Prats"))).doCall().checkResult(new Boolean(false)) ;
if (ok_sofar)
  ok_sofar = new Equals(new Person(new String("88888"),new String("Guillem"),new String("Rossello"),new String("Benach")),new Person(new String("4444Z"),new String("Sara"),new String("Albuixech"),new String("Navarro"))).doCall().checkResult(new Boolean(false)) ;
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
    ResultsHandler.stopTest(new String("test_75")) ;
    ResultsHandler.add_result(new String("person"),resultIs) ;
    System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_76 () 
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
TestData.testName = new String("test_76") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_76")) ;
if (ok_sofar)
  ok_sofar = new Equals(new Person(new String("X7777"),new String("Noa"),new String("Castro"),new String("Castro")),new Person(new String("99999"),new String("Pedro"),new String("Navarro"),new String("Alzaga"))).doCall().checkResult(new Boolean(false)) ;
if (ok_sofar)
  ok_sofar = new Equals(new Person(new String("3333"),new String("Joana"),new String("Lopez"),new String("Goicoechea")),new Person(new String("55555"),new String("Guillem"),new String("Navarro"),new String("Castro"))).doCall().checkResult(new Boolean(false)) ;
if (ok_sofar)
  ok_sofar = new Equals(new Person(new String("4444Z"),new String("Pedro"),new String("Herrera"),new String("Martinez")),new Person(new String("3333"),new String("Alicia"),new String("Sanchez"),new String("Sanchez"))).doCall().checkResult(new Boolean(false)) ;
if (ok_sofar)
  ok_sofar = new HashCode(new Person(new String("X7777"),new String("Jose"),new String("Rodriguez"),new String("Fernandez"))).doCall().checkResult(new Integer(82962968)) ;
if (ok_sofar)
  ok_sofar = new Equals(new Person(new String("55555"),new String("Carmen"),new String("Gonzalez"),new String("Bonet")),new Person(new String("99999"),new String("Francesca"),new String("Alzaga"),new String("Albuixech"))).doCall().checkResult(new Boolean(false)) ;
if (ok_sofar)
  ok_sofar = new HashCode(new Person(new String("66666"),new String("Francisco"),new String("Prats"),new String("Rodriguez"))).doCall().checkResult(new Integer(51532470)) ;
if (ok_sofar)
  ok_sofar = new Equals(new Person(new String("66666"),new String("Miguel"),new String("Albuixech"),new String("Goicoechea")),null).doCall().checkResult(new Boolean(false)) ;
if (ok_sofar)
  ok_sofar = new HashCode(new Person(new String("88888"),new String("Joana"),new String("Echeberria"),new String("Lopez"))).doCall().checkResult(new Integer(53441080)) ;
if (ok_sofar)
  ok_sofar = new HashCode(new Person(new String("2222"),new String("Irati"),new String("Boix"),new String("Albuixech"))).doCall().checkResult(new Integer(1539200)) ;
if (ok_sofar)
  ok_sofar = new Equals(new Person(new String("3333"),new String("Jose"),new String("Marin"),new String("Fernandez")),new Person(new String("55555"),new String("Paula"),new String("Marti"),new String("Herrera"))).doCall().checkResult(new Boolean(false)) ;
if (ok_sofar)
  ok_sofar = new HashCode(new Person(new String("3333"),new String("Julia"),new String("Garcia"),new String("Navarro"))).doCall().checkResult(new Integer(1569984)) ;
if (ok_sofar)
  ok_sofar = new Equals(new Person(new String("X7777"),new String("Ane"),new String("Marin"),new String("Gonzalez")),null).doCall().checkResult(new Boolean(false)) ;
if (ok_sofar)
  ok_sofar = new HashCode(new Person(new String("99999"),new String("Laia"),new String("Albuixech"),new String("Rossello"))).doCall().checkResult(new Integer(54395385)) ;
if (ok_sofar)
  ok_sofar = new HashCode(new Person(new String("1111"),new String("Maria"),new String("Perez"),new String("Perez"))).doCall().checkResult(new Integer(1508416)) ;
if (ok_sofar)
  ok_sofar = new HashCode(new Person(new String("2222"),new String("Juan"),new String("Marin"),new String("Rodriguez"))).doCall().checkResult(new Integer(1539200)) ;
if (ok_sofar)
  ok_sofar = new HashCode(new Person(new String("X7777"),new String("Ibai"),new String("Boix"),new String("Boix"))).doCall().checkResult(new Integer(82962968)) ;
if (ok_sofar)
  ok_sofar = new Equals(new Person(new String("4444Z"),new String("Mireia"),new String("Herrera"),new String("Albuixech")),new Person(new String("2222"),new String("Jose"),new String("Rodriguez"),new String("Castro"))).doCall().checkResult(new Boolean(false)) ;
if (ok_sofar)
  ok_sofar = new HashCode(new Person(new String("X7777"),new String("Miguel"),new String("Marti"),new String("Martinez"))).doCall().checkResult(new Integer(82962968)) ;
if (ok_sofar)
  ok_sofar = new HashCode(new Person(new String("55555"),new String("Irati"),new String("Albuixech"),new String("Benach"))).doCall().checkResult(new Integer(50578165)) ;
if (ok_sofar)
  ok_sofar = new HashCode(new Person(new String("66666"),new String("Ander"),new String("Ferrer"),new String("Perez"))).doCall().checkResult(new Integer(51532470)) ;
if (ok_sofar)
  ok_sofar = new Equals(new Person(new String("88888"),new String("Maria"),new String("Benach"),new String("Lopez")),new Person(new String("55555"),new String("Juan"),new String("Echeberria"),new String("Albuixech"))).doCall().checkResult(new Boolean(false)) ;
if (ok_sofar)
  ok_sofar = new HashCode(new Person(new String("3333"),new String("Marc"),new String("Goicoechea"),new String("Marin"))).doCall().checkResult(new Integer(1569984)) ;
if (ok_sofar)
  ok_sofar = new HashCode(new Person(new String("4444Z"),new String("Jose"),new String("Gonzalez"),new String("Llorente"))).doCall().checkResult(new Integer(49623898)) ;
if (ok_sofar)
  ok_sofar = new Equals(new Person(new String("88888"),new String("Francisco"),new String("Martinez"),new String("Ferrer")),new Person(new String("99999"),new String("Jose"),new String("Rossello"),new String("Alzaga"))).doCall().checkResult(new Boolean(false)) ;
if (ok_sofar)
  ok_sofar = new HashCode(new Person(new String("88888"),new String("Noa"),new String("Rossello"),new String("Boix"))).doCall().checkResult(new Integer(53441080)) ;
if (ok_sofar)
  ok_sofar = new Equals(new Person(new String("99999"),new String("Noa"),new String("Gonzalez"),new String("Martinez")),new Person(new String("4444Z"),new String("Ander"),new String("Fernandez"),new String("Fernandez"))).doCall().checkResult(new Boolean(false)) ;
if (ok_sofar)
  ok_sofar = new HashCode(new Person(new String("55555"),new String("Julia"),new String("Sanchez"),new String("Goicoechea"))).doCall().checkResult(new Integer(50578165)) ;
if (ok_sofar)
  ok_sofar = new HashCode(new Person(new String("2222"),new String("Julia"),new String("Fernandez"),new String("Navarro"))).doCall().checkResult(new Integer(1539200)) ;
if (ok_sofar)
  ok_sofar = new HashCode(new Person(new String("99999"),new String("Antonio"),new String("Ferrer"),new String("Martinez"))).doCall().checkResult(new Integer(54395385)) ;
if (ok_sofar)
  ok_sofar = new HashCode(new Person(new String("66666"),new String("Alejandro"),new String("Ferrer"),new String("Llorente"))).doCall().checkResult(new Integer(51532470)) ;
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
    ResultsHandler.stopTest(new String("test_76")) ;
    ResultsHandler.add_result(new String("person"),resultIs) ;
    System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_77 () 
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
TestData.testName = new String("test_77") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_77")) ;
if (ok_sofar)
  ok_sofar = new HashCode(new Person(new String("X7777"),new String("Leire"),new String("Marti"),new String("Rodriguez"))).doCall().checkResult(new Integer(82962968)) ;
if (ok_sofar)
  ok_sofar = new HashCode(new Person(new String("2222"),new String("Juan"),new String("Navarro"),new String("Fernandez"))).doCall().checkResult(new Integer(1539200)) ;
if (ok_sofar)
  ok_sofar = new HashCode(new Person(new String("2222"),new String("Andreu"),new String("Rodriguez"),new String("Ferrer"))).doCall().checkResult(new Integer(1539200)) ;
if (ok_sofar)
  ok_sofar = new Equals(new Person(new String("3333"),new String("Joana"),new String("Fernandez"),new String("Benach")),new Person(new String("66666"),new String("Marc"),new String("Sanchez"),new String("Boix"))).doCall().checkResult(new Boolean(false)) ;
if (ok_sofar)
  ok_sofar = new Equals(new Person(new String("3333"),new String("Ane"),new String("Goicoechea"),new String("Martinez")),new Person(new String("66666"),new String("Ander"),new String("Benach"),new String("Marti"))).doCall().checkResult(new Boolean(false)) ;
if (ok_sofar)
  ok_sofar = new Equals(new Person(new String("66666"),new String("Teresa"),new String("Marti"),new String("Llorente")),new Person(new String("1111"),new String("Carmen"),new String("Martinez"),new String("Goicoechea"))).doCall().checkResult(new Boolean(false)) ;
if (ok_sofar)
  ok_sofar = new Equals(new Person(new String("2222"),new String("Paula"),new String("Perez"),new String("Prats")),new Person(new String("4444Z"),new String("Francesca"),new String("Prats"),new String("Boix"))).doCall().checkResult(new Boolean(false)) ;
if (ok_sofar)
  ok_sofar = new HashCode(new Person(new String("66666"),new String("Susana"),new String("Ferrer"),new String("Lopez"))).doCall().checkResult(new Integer(51532470)) ;
if (ok_sofar)
  ok_sofar = new HashCode(new Person(new String("X7777"),new String("Lucia"),new String("Ferrer"),new String("Prats"))).doCall().checkResult(new Integer(82962968)) ;
if (ok_sofar)
  ok_sofar = new Equals(new Person(new String("88888"),new String("Francesca"),new String("Navarro"),new String("Albuixech")),new Person(new String("66666"),new String("Iker"),new String("Bonet"),new String("Prats"))).doCall().checkResult(new Boolean(false)) ;
if (ok_sofar)
  ok_sofar = new HashCode(new Person(new String("99999"),new String("Carmen"),new String("Lopez"),new String("Herrera"))).doCall().checkResult(new Integer(54395385)) ;
if (ok_sofar)
  ok_sofar = new Equals(new Person(new String("4444Z"),new String("Paloma"),new String("Fernandez"),new String("Bonet")),new Person(new String("88888"),new String("Laia"),new String("Navarro"),new String("Rodriguez"))).doCall().checkResult(new Boolean(false)) ;
if (ok_sofar)
  ok_sofar = new HashCode(new Person(new String("X7777"),new String("Pedro"),new String("Llorente"),new String("Boix"))).doCall().checkResult(new Integer(82962968)) ;
if (ok_sofar)
  ok_sofar = new Equals(new Person(new String("66666"),new String("Guillem"),new String("Castro"),new String("Albuixech")),new Person(new String("1111"),new String("Antonio"),new String("Rossello"),new String("Llorente"))).doCall().checkResult(new Boolean(false)) ;
if (ok_sofar)
  ok_sofar = new Equals(new Person(new String("88888"),new String("Noa"),new String("Herrera"),new String("Prats")),new Person(new String("99999"),new String("Leire"),new String("Llorente"),new String("Alzaga"))).doCall().checkResult(new Boolean(false)) ;
if (ok_sofar)
  ok_sofar = new Equals(new Person(new String("88888"),new String("Sara"),new String("Perez"),new String("Rodriguez")),new Person(new String("66666"),new String("Unai"),new String("Marin"),new String("Rodriguez"))).doCall().checkResult(new Boolean(false)) ;
if (ok_sofar)
  ok_sofar = new HashCode(new Person(new String("1111"),new String("Paula"),new String("Goicoechea"),new String("Rossello"))).doCall().checkResult(new Integer(1508416)) ;
if (ok_sofar)
  ok_sofar = new Equals(new Person(new String("2222"),new String("Isabel"),new String("Marin"),new String("Goicoechea")),new Person(new String("3333"),new String("Irati"),new String("Fernandez"),new String("Marti"))).doCall().checkResult(new Boolean(false)) ;
if (ok_sofar)
  ok_sofar = new HashCode(new Person(new String("2222"),new String("Jordi"),new String("Prats"),new String("Perez"))).doCall().checkResult(new Integer(1539200)) ;
if (ok_sofar)
  ok_sofar = new HashCode(new Person(new String("3333"),new String("Jose"),new String("Martinez"),new String("Marin"))).doCall().checkResult(new Integer(1569984)) ;
if (ok_sofar)
  ok_sofar = new Equals(new Person(new String("4444Z"),new String("Alejandro"),new String("Marin"),new String("Marin")),new Person(new String("55555"),new String("Paula"),new String("Benach"),new String("Castro"))).doCall().checkResult(new Boolean(false)) ;
if (ok_sofar)
  ok_sofar = new Equals(new Person(new String("2222"),new String("Juan"),new String("Boix"),new String("Goicoechea")),null).doCall().checkResult(new Boolean(false)) ;
if (ok_sofar)
  ok_sofar = new Equals(new Person(new String("1111"),new String("Jose"),new String("Navarro"),new String("Martinez")),new Person(new String("3333"),new String("Alejandro"),new String("Echeberria"),new String("Benach"))).doCall().checkResult(new Boolean(false)) ;
if (ok_sofar)
  ok_sofar = new Equals(new Person(new String("3333"),new String("Teresa"),new String("Bonet"),new String("Lopez")),new Person(new String("99999"),new String("Francesca"),new String("Castro"),new String("Perez"))).doCall().checkResult(new Boolean(false)) ;
if (ok_sofar)
  ok_sofar = new Equals(new Person(new String("X7777"),new String("Susana"),new String("Alzaga"),new String("Herrera")),new Person(new String("99999"),new String("Ane"),new String("Martinez"),new String("Sanchez"))).doCall().checkResult(new Boolean(false)) ;
if (ok_sofar)
  ok_sofar = new HashCode(new Person(new String("1111"),new String("Isabel"),new String("Castro"),new String("Rossello"))).doCall().checkResult(new Integer(1508416)) ;
if (ok_sofar)
  ok_sofar = new Equals(new Person(new String("2222"),new String("Isabel"),new String("Sanchez"),new String("Marin")),new Person(new String("3333"),new String("Marc"),new String("Albuixech"),new String("Benach"))).doCall().checkResult(new Boolean(false)) ;
if (ok_sofar)
  ok_sofar = new Equals(new Person(new String("88888"),new String("Laia"),new String("Castro"),new String("Benach")),new Person(new String("2222"),new String("Maria"),new String("Goicoechea"),new String("Herrera"))).doCall().checkResult(new Boolean(false)) ;
if (ok_sofar)
  ok_sofar = new HashCode(new Person(new String("3333"),new String("Julia"),new String("Llorente"),new String("Castro"))).doCall().checkResult(new Integer(1569984)) ;
if (ok_sofar)
  ok_sofar = new HashCode(new Person(new String("2222"),new String("Laia"),new String("Benach"),new String("Benach"))).doCall().checkResult(new Integer(1539200)) ;
if (ok_sofar)
  ok_sofar = new HashCode(new Person(new String("X7777"),new String("Unai"),new String("Alzaga"),new String("Gonzalez"))).doCall().checkResult(new Integer(82962968)) ;
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
    ResultsHandler.stopTest(new String("test_77")) ;
    ResultsHandler.add_result(new String("person"),resultIs) ;
    System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_78 () 
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
TestData.testName = new String("test_78") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_78")) ;
if (ok_sofar)
  ok_sofar = new HashCode(new Person(new String("X7777"),new String("Ibai"),new String("Garcia"),new String("Martinez"))).doCall().checkResult(new Integer(82962968)) ;
if (ok_sofar)
  ok_sofar = new HashCode(new Person(new String("2222"),new String("Alejandro"),new String("Rossello"),new String("Llorente"))).doCall().checkResult(new Integer(1539200)) ;
if (ok_sofar)
  ok_sofar = new Equals(new Person(new String("4444Z"),new String("Sara"),new String("Boix"),new String("Fernandez")),new Person(new String("99999"),new String("Pedro"),new String("Rodriguez"),new String("Perez"))).doCall().checkResult(new Boolean(false)) ;
if (ok_sofar)
  ok_sofar = new Equals(new Person(new String("66666"),new String("Antonio"),new String("Prats"),new String("Boix")),new Person(new String("55555"),new String("Paloma"),new String("Marin"),new String("Gonzalez"))).doCall().checkResult(new Boolean(false)) ;
if (ok_sofar)
  ok_sofar = new Equals(new Person(new String("55555"),new String("Sara"),new String("Echeberria"),new String("Perez")),new Person(new String("99999"),new String("Antonio"),new String("Prats"),new String("Bonet"))).doCall().checkResult(new Boolean(false)) ;
if (ok_sofar)
  ok_sofar = new HashCode(new Person(new String("2222"),new String("Maria"),new String("Bonet"),new String("Rodriguez"))).doCall().checkResult(new Integer(1539200)) ;
if (ok_sofar)
  ok_sofar = new HashCode(new Person(new String("55555"),new String("Pedro"),new String("Herrera"),new String("Albuixech"))).doCall().checkResult(new Integer(50578165)) ;
if (ok_sofar)
  ok_sofar = new HashCode(new Person(new String("2222"),new String("Maria"),new String("Rossello"),new String("Herrera"))).doCall().checkResult(new Integer(1539200)) ;
if (ok_sofar)
  ok_sofar = new HashCode(new Person(new String("4444Z"),new String("Iker"),new String("Garcia"),new String("Benach"))).doCall().checkResult(new Integer(49623898)) ;
if (ok_sofar)
  ok_sofar = new Equals(new Person(new String("2222"),new String("Miguel"),new String("Llorente"),new String("Bonet")),new Person(new String("99999"),new String("Laura"),new String("Benach"),new String("Gonzalez"))).doCall().checkResult(new Boolean(false)) ;
if (ok_sofar)
  ok_sofar = new HashCode(new Person(new String("2222"),new String("Oier"),new String("Alzaga"),new String("Bonet"))).doCall().checkResult(new Integer(1539200)) ;
if (ok_sofar)
  ok_sofar = new HashCode(new Person(new String("3333"),new String("Ander"),new String("Rossello"),new String("Benach"))).doCall().checkResult(new Integer(1569984)) ;
if (ok_sofar)
  ok_sofar = new HashCode(new Person(new String("X7777"),new String("Lucia"),new String("Marti"),new String("Perez"))).doCall().checkResult(new Integer(82962968)) ;
if (ok_sofar)
  ok_sofar = new Equals(new Person(new String("2222"),new String("Juan"),new String("Bonet"),new String("Herrera")),new Person(new String("3333"),new String("Paula"),new String("Bonet"),new String("Lopez"))).doCall().checkResult(new Boolean(false)) ;
if (ok_sofar)
  ok_sofar = new HashCode(new Person(new String("1111"),new String("Laia"),new String("Echeberria"),new String("Castro"))).doCall().checkResult(new Integer(1508416)) ;
if (ok_sofar)
  ok_sofar = new Equals(new Person(new String("1111"),new String("Mireia"),new String("Marin"),new String("Echeberria")),new Person(new String("4444Z"),new String("Oier"),new String("Echeberria"),new String("Garcia"))).doCall().checkResult(new Boolean(false)) ;
if (ok_sofar)
  ok_sofar = new Equals(new Person(new String("99999"),new String("Lucia"),new String("Goicoechea"),new String("Goicoechea")),new Person(new String("66666"),new String("Susana"),new String("Benach"),new String("Llorente"))).doCall().checkResult(new Boolean(false)) ;
if (ok_sofar)
  ok_sofar = new HashCode(new Person(new String("66666"),new String("Jordi"),new String("Navarro"),new String("Ferrer"))).doCall().checkResult(new Integer(51532470)) ;
if (ok_sofar)
  ok_sofar = new Equals(new Person(new String("88888"),new String("Antonio"),new String("Fernandez"),new String("Goicoechea")),new Person(new String("66666"),new String("Susana"),new String("Alzaga"),new String("Navarro"))).doCall().checkResult(new Boolean(false)) ;
if (ok_sofar)
  ok_sofar = new Equals(new Person(new String("99999"),new String("Laia"),new String("Sanchez"),new String("Sanchez")),null).doCall().checkResult(new Boolean(false)) ;
if (ok_sofar)
  ok_sofar = new Equals(new Person(new String("99999"),new String("Lucia"),new String("Lopez"),new String("Alzaga")),new Person(new String("99999"),new String("Lucia"),new String("Lopez"),new String("Alzaga"))).doCall().checkResult(new Boolean(true)) ;
if (ok_sofar)
  ok_sofar = new HashCode(new Person(new String("3333"),new String("Noa"),new String("Herrera"),new String("Ferrer"))).doCall().checkResult(new Integer(1569984)) ;
if (ok_sofar)
  ok_sofar = new HashCode(new Person(new String("66666"),new String("Laura"),new String("Echeberria"),new String("Garcia"))).doCall().checkResult(new Integer(51532470)) ;
if (ok_sofar)
  ok_sofar = new Equals(new Person(new String("1111"),new String("Ibai"),new String("Marin"),new String("Rossello")),new Person(new String("4444Z"),new String("Sara"),new String("Boix"),new String("Ferrer"))).doCall().checkResult(new Boolean(false)) ;
if (ok_sofar)
  ok_sofar = new HashCode(new Person(new String("2222"),new String("Marc"),new String("Alzaga"),new String("Boix"))).doCall().checkResult(new Integer(1539200)) ;
if (ok_sofar)
  ok_sofar = new Equals(new Person(new String("1111"),new String("Julia"),new String("Marti"),new String("Ferrer")),new Person(new String("X7777"),new String("Pablo"),new String("Lopez"),new String("Benach"))).doCall().checkResult(new Boolean(false)) ;
if (ok_sofar)
  ok_sofar = new Equals(new Person(new String("88888"),new String("Sara"),new String("Lopez"),new String("Castro")),new Person(new String("88888"),new String("Sara"),new String("Lopez"),new String("Castro"))).doCall().checkResult(new Boolean(true)) ;
if (ok_sofar)
  ok_sofar = new HashCode(new Person(new String("66666"),new String("Paula"),new String("Perez"),new String("Castro"))).doCall().checkResult(new Integer(51532470)) ;
if (ok_sofar)
  ok_sofar = new Equals(new Person(new String("55555"),new String("Maria"),new String("Lopez"),new String("Herrera")),new Person(new String("88888"),new String("Iker"),new String("Navarro"),new String("Benach"))).doCall().checkResult(new Boolean(false)) ;
if (ok_sofar)
  ok_sofar = new HashCode(new Person(new String("3333"),new String("Iker"),new String("Martinez"),new String("Herrera"))).doCall().checkResult(new Integer(1569984)) ;
if (ok_sofar)
  ok_sofar = new Equals(new Person(new String("66666"),new String("Isabel"),new String("Lopez"),new String("Navarro")),new Person(new String("2222"),new String("Andreu"),new String("Benach"),new String("Albuixech"))).doCall().checkResult(new Boolean(false)) ;
if (ok_sofar)
  ok_sofar = new HashCode(new Person(new String("3333"),new String("Alejandro"),new String("Marin"),new String("Boix"))).doCall().checkResult(new Integer(1569984)) ;
if (ok_sofar)
  ok_sofar = new HashCode(new Person(new String("3333"),new String("Mikel"),new String("Bonet"),new String("Albuixech"))).doCall().checkResult(new Integer(1569984)) ;
if (ok_sofar)
  ok_sofar = new Equals(new Person(new String("3333"),new String("Joana"),new String("Fernandez"),new String("Goicoechea")),new Person(new String("55555"),new String("Juan"),new String("Lopez"),new String("Martinez"))).doCall().checkResult(new Boolean(false)) ;
if (ok_sofar)
  ok_sofar = new Equals(new Person(new String("1111"),new String("Lucia"),new String("Navarro"),new String("Garcia")),new Person(new String("4444Z"),new String("Laura"),new String("Benach"),new String("Prats"))).doCall().checkResult(new Boolean(false)) ;
if (ok_sofar)
  ok_sofar = new Equals(new Person(new String("1111"),new String("Ibai"),new String("Goicoechea"),new String("Lopez")),null).doCall().checkResult(new Boolean(false)) ;
if (ok_sofar)
  ok_sofar = new HashCode(new Person(new String("55555"),new String("Paula"),new String("Martinez"),new String("Garcia"))).doCall().checkResult(new Integer(50578165)) ;
if (ok_sofar)
  ok_sofar = new HashCode(new Person(new String("66666"),new String("Laura"),new String("Echeberria"),new String("Rossello"))).doCall().checkResult(new Integer(51532470)) ;
if (ok_sofar)
  ok_sofar = new Equals(new Person(new String("88888"),new String("Guillem"),new String("Prats"),new String("Perez")),new Person(new String("99999"),new String("Laura"),new String("Llorente"),new String("Sanchez"))).doCall().checkResult(new Boolean(false)) ;
if (ok_sofar)
  ok_sofar = new HashCode(new Person(new String("1111"),new String("Leire"),new String("Marin"),new String("Echeberria"))).doCall().checkResult(new Integer(1508416)) ;
if (ok_sofar)
  ok_sofar = new HashCode(new Person(new String("55555"),new String("Manuel"),new String("Rodriguez"),new String("Marin"))).doCall().checkResult(new Integer(50578165)) ;
if (ok_sofar)
  ok_sofar = new HashCode(new Person(new String("X7777"),new String("Paloma"),new String("Sanchez"),new String("Marti"))).doCall().checkResult(new Integer(82962968)) ;
if (ok_sofar)
  ok_sofar = new Equals(new Person(new String("X7777"),new String("Manuel"),new String("Llorente"),new String("Lopez")),new Person(new String("99999"),new String("Laura"),new String("Albuixech"),new String("Goicoechea"))).doCall().checkResult(new Boolean(false)) ;
if (ok_sofar)
  ok_sofar = new HashCode(new Person(new String("55555"),new String("Francisco"),new String("Rossello"),new String("Albuixech"))).doCall().checkResult(new Integer(50578165)) ;
if (ok_sofar)
  ok_sofar = new HashCode(new Person(new String("99999"),new String("Irati"),new String("Marin"),new String("Rodriguez"))).doCall().checkResult(new Integer(54395385)) ;
if (ok_sofar)
  ok_sofar = new HashCode(new Person(new String("3333"),new String("Pedro"),new String("Bonet"),new String("Marin"))).doCall().checkResult(new Integer(1569984)) ;
if (ok_sofar)
  ok_sofar = new HashCode(new Person(new String("99999"),new String("Carmen"),new String("Ferrer"),new String("Castro"))).doCall().checkResult(new Integer(54395385)) ;
if (ok_sofar)
  ok_sofar = new HashCode(new Person(new String("2222"),new String("Maria"),new String("Rossello"),new String("Bonet"))).doCall().checkResult(new Integer(1539200)) ;
if (ok_sofar)
  ok_sofar = new Equals(new Person(new String("3333"),new String("Miguel"),new String("Llorente"),new String("Rossello")),new Person(new String("55555"),new String("Mikel"),new String("Bonet"),new String("Benach"))).doCall().checkResult(new Boolean(false)) ;
if (ok_sofar)
  ok_sofar = new HashCode(new Person(new String("X7777"),new String("Jordi"),new String("Alzaga"),new String("Marti"))).doCall().checkResult(new Integer(82962968)) ;
if (ok_sofar)
  ok_sofar = new HashCode(new Person(new String("55555"),new String("Ane"),new String("Marin"),new String("Perez"))).doCall().checkResult(new Integer(50578165)) ;
if (ok_sofar)
  ok_sofar = new Equals(new Person(new String("55555"),new String("Isabel"),new String("Boix"),new String("Alzaga")),new Person(new String("1111"),new String("Joana"),new String("Perez"),new String("Marin"))).doCall().checkResult(new Boolean(false)) ;
if (ok_sofar)
  ok_sofar = new Equals(new Person(new String("3333"),new String("Irati"),new String("Fernandez"),new String("Marin")),new Person(new String("66666"),new String("Unai"),new String("Echeberria"),new String("Fernandez"))).doCall().checkResult(new Boolean(false)) ;
if (ok_sofar)
  ok_sofar = new Equals(new Person(new String("3333"),new String("Alicia"),new String("Alzaga"),new String("Navarro")),new Person(new String("66666"),new String("Marc"),new String("Navarro"),new String("Ferrer"))).doCall().checkResult(new Boolean(false)) ;
if (ok_sofar)
  ok_sofar = new HashCode(new Person(new String("55555"),new String("Ibai"),new String("Llorente"),new String("Garcia"))).doCall().checkResult(new Integer(50578165)) ;
if (ok_sofar)
  ok_sofar = new Equals(new Person(new String("99999"),new String("Manuel"),new String("Echeberria"),new String("Bonet")),new Person(new String("4444Z"),new String("Lucia"),new String("Garcia"),new String("Albuixech"))).doCall().checkResult(new Boolean(false)) ;
if (ok_sofar)
  ok_sofar = new Equals(new Person(new String("88888"),new String("Julia"),new String("Fernandez"),new String("Boix")),new Person(new String("66666"),new String("Laia"),new String("Bonet"),new String("Sanchez"))).doCall().checkResult(new Boolean(false)) ;
if (ok_sofar)
  ok_sofar = new HashCode(new Person(new String("X7777"),new String("Ander"),new String("Goicoechea"),new String("Llorente"))).doCall().checkResult(new Integer(82962968)) ;
if (ok_sofar)
  ok_sofar = new Equals(new Person(new String("3333"),new String("Irati"),new String("Bonet"),new String("Ferrer")),new Person(new String("4444Z"),new String("Alejandro"),new String("Boix"),new String("Bonet"))).doCall().checkResult(new Boolean(false)) ;
if (ok_sofar)
  ok_sofar = new Equals(new Person(new String("1111"),new String("Alejandro"),new String("Prats"),new String("Navarro")),new Person(new String("88888"),new String("Manuel"),new String("Lopez"),new String("Bonet"))).doCall().checkResult(new Boolean(false)) ;
if (ok_sofar)
  ok_sofar = new HashCode(new Person(new String("3333"),new String("Antonio"),new String("Boix"),new String("Martinez"))).doCall().checkResult(new Integer(1569984)) ;
if (ok_sofar)
  ok_sofar = new Equals(new Person(new String("4444Z"),new String("Teresa"),new String("Ferrer"),new String("Marti")),new Person(new String("1111"),new String("Miguel"),new String("Martinez"),new String("Garcia"))).doCall().checkResult(new Boolean(false)) ;
if (ok_sofar)
  ok_sofar = new Equals(new Person(new String("88888"),new String("Lucia"),new String("Boix"),new String("Rodriguez")),new Person(new String("88888"),new String("Lucia"),new String("Boix"),new String("Rodriguez"))).doCall().checkResult(new Boolean(true)) ;
if (ok_sofar)
  ok_sofar = new HashCode(new Person(new String("3333"),new String("Teresa"),new String("Fernandez"),new String("Martinez"))).doCall().checkResult(new Integer(1569984)) ;
if (ok_sofar)
  ok_sofar = new HashCode(new Person(new String("3333"),new String("Joana"),new String("Lopez"),new String("Rossello"))).doCall().checkResult(new Integer(1569984)) ;
if (ok_sofar)
  ok_sofar = new Equals(new Person(new String("55555"),new String("Ane"),new String("Llorente"),new String("Prats")),new Person(new String("66666"),new String("Oier"),new String("Marin"),new String("Sanchez"))).doCall().checkResult(new Boolean(false)) ;
if (ok_sofar)
  ok_sofar = new Equals(new Person(new String("X7777"),new String("Lucia"),new String("Castro"),new String("Navarro")),new Person(new String("1111"),new String("Manuel"),new String("Echeberria"),new String("Ferrer"))).doCall().checkResult(new Boolean(false)) ;
if (ok_sofar)
  ok_sofar = new Equals(new Person(new String("X7777"),new String("Isabel"),new String("Echeberria"),new String("Castro")),new Person(new String("4444Z"),new String("Francisco"),new String("Gonzalez"),new String("Benach"))).doCall().checkResult(new Boolean(false)) ;
if (ok_sofar)
  ok_sofar = new HashCode(new Person(new String("4444Z"),new String("Laura"),new String("Llorente"),new String("Rodriguez"))).doCall().checkResult(new Integer(49623898)) ;
if (ok_sofar)
  ok_sofar = new HashCode(new Person(new String("3333"),new String("Jose"),new String("Echeberria"),new String("Llorente"))).doCall().checkResult(new Integer(1569984)) ;
if (ok_sofar)
  ok_sofar = new Equals(new Person(new String("66666"),new String("Carmen"),new String("Gonzalez"),new String("Prats")),new Person(new String("99999"),new String("Pablo"),new String("Garcia"),new String("Navarro"))).doCall().checkResult(new Boolean(false)) ;
if (ok_sofar)
  ok_sofar = new Equals(new Person(new String("55555"),new String("Irati"),new String("Marti"),new String("Marti")),new Person(new String("99999"),new String("Unai"),new String("Marin"),new String("Marti"))).doCall().checkResult(new Boolean(false)) ;
if (ok_sofar)
  ok_sofar = new Equals(new Person(new String("X7777"),new String("Francesca"),new String("Herrera"),new String("Marin")),new Person(new String("66666"),new String("Andreu"),new String("Boix"),new String("Goicoechea"))).doCall().checkResult(new Boolean(false)) ;
if (ok_sofar)
  ok_sofar = new HashCode(new Person(new String("99999"),new String("Alejandro"),new String("Alzaga"),new String("Gonzalez"))).doCall().checkResult(new Integer(54395385)) ;
if (ok_sofar)
  ok_sofar = new HashCode(new Person(new String("2222"),new String("Laia"),new String("Lopez"),new String("Llorente"))).doCall().checkResult(new Integer(1539200)) ;
if (ok_sofar)
  ok_sofar = new Equals(new Person(new String("4444Z"),new String("Paula"),new String("Marin"),new String("Llorente")),new Person(new String("4444Z"),new String("Paula"),new String("Marin"),new String("Llorente"))).doCall().checkResult(new Boolean(true)) ;
if (ok_sofar)
  ok_sofar = new HashCode(new Person(new String("2222"),new String("Irati"),new String("Fernandez"),new String("Boix"))).doCall().checkResult(new Integer(1539200)) ;
if (ok_sofar)
  ok_sofar = new HashCode(new Person(new String("2222"),new String("Joana"),new String("Llorente"),new String("Llorente"))).doCall().checkResult(new Integer(1539200)) ;
if (ok_sofar)
  ok_sofar = new Equals(new Person(new String("66666"),new String("Carmen"),new String("Rossello"),new String("Garcia")),null).doCall().checkResult(new Boolean(false)) ;
if (ok_sofar)
  ok_sofar = new HashCode(new Person(new String("4444Z"),new String("Teresa"),new String("Rossello"),new String("Prats"))).doCall().checkResult(new Integer(49623898)) ;
if (ok_sofar)
  ok_sofar = new HashCode(new Person(new String("88888"),new String("Teresa"),new String("Martinez"),new String("Gonzalez"))).doCall().checkResult(new Integer(53441080)) ;
if (ok_sofar)
  ok_sofar = new HashCode(new Person(new String("4444Z"),new String("Julia"),new String("Marti"),new String("Echeberria"))).doCall().checkResult(new Integer(49623898)) ;
if (ok_sofar)
  ok_sofar = new Equals(new Person(new String("1111"),new String("Jose"),new String("Gonzalez"),new String("Navarro")),new Person(new String("X7777"),new String("Mireia"),new String("Prats"),new String("Fernandez"))).doCall().checkResult(new Boolean(false)) ;
if (ok_sofar)
  ok_sofar = new HashCode(new Person(new String("55555"),new String("Laia"),new String("Marin"),new String("Albuixech"))).doCall().checkResult(new Integer(50578165)) ;
if (ok_sofar)
  ok_sofar = new Equals(new Person(new String("88888"),new String("Alicia"),new String("Lopez"),new String("Ferrer")),new Person(new String("3333"),new String("Guillem"),new String("Herrera"),new String("Gonzalez"))).doCall().checkResult(new Boolean(false)) ;
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
    ResultsHandler.stopTest(new String("test_78")) ;
    ResultsHandler.add_result(new String("person"),resultIs) ;
    System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  


static class Tests {
  static String tester = "TesterLab4";
}


static class HashTableUtils {
  static HashMap<Object,String> mapNames = null;
  static Integer nameCounter = 0;

  public static void resetPrinter() {
    mapNames = null;
    nameCounter = 0;
  }

  public static String printer(Object obj) {
    if (obj instanceof Map<?,?>) {
      if (mapNames == null)
        mapNames = new HashMap<Object,String>();
      String name = mapNames.get(obj);
      if (name == null) {
        name = "map_"+nameCounter.toString();
        mapNames.put(obj,name);
        nameCounter++;
      }
      return name;
    } else return TestUtils.printer(obj, x -> printer(x));
  }

  public static boolean buckets(HashTable<Integer,String> hashTable, NodePositionList<NodePositionList<HashEntry<Integer,String>>> buckets) {
    NodePositionList<Entry<Integer,String>>[] implBuckets = null;
    
    try {
      Field tableField;
      tableField = hashTable.getClass().getDeclaredField("table");
      tableField.setAccessible(true);
      implBuckets =
        (NodePositionList<Entry<Integer,String>>[]) tableField.get(hashTable);
    } catch ( Throwable exc ) {
      TestUtils.printCallException
        (TestUtils.ExecutionTime.LAST,
         "cannot access the field table: ",
         exc);
      return true;
    }

    if (implBuckets == null) {
      TestUtils.printError
        (TestUtils.ExecutionTime.AFTER,
         "the attribute table has the value null!");
      return false;
    }

    if (implBuckets.length != buckets.size()) {
      TestUtils.printError
        (TestUtils.ExecutionTime.AFTER,
         "the hashtable array has size "+implBuckets.length+
         " but should have size "+buckets.size());
      return false;
    }

    int i=0;
    Position<NodePositionList<HashEntry<Integer,String>>> cursor =
      buckets.first();

    while (i < implBuckets.length) {
      if (!TestUtils.sameElements(implBuckets[i],cursor.element())) {
        TestUtils.printError
          (TestUtils.ExecutionTime.AFTER,
           "position "+i+" in the hashtable array has the entries "+
           TesterCode.printer(implBuckets[i])+
           " but should have the elements "+
           cursor.element());
        return false;
      }
      cursor = buckets.next(cursor);
      ++i;
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


static class Constructor extends TestCall<HashTable<Integer,String>,Void>
{
  int size;
  
  public Constructor (int size)
  {
    this.size = size ;
  }
  
  public String toString () 
  {
    StringBuilder output = new StringBuilder() ;
    output.append(new String("new HashTable<Integer,String>")) ;
    output.append(new String("(")) ;
    output.append(TesterCode.printer(size)) ;
    output.append(new String(")")) ;
    return output.toString() ;
  }
  
  public HashTable<Integer,String> call () 
  {
    return new HashTable<Integer,String>(size) ;
  }
  
  public boolean checkResult (Void expected) 
  {
    if (!noException())
      return false ;
    return true ;
  }
  
}


static class Keys extends TestCall<Iterable<Integer>,Integer[]>
{
  HashTable<Integer,String> table;
  
  public Keys (HashTable<Integer,String> table)
  {
    this.table = table ;
  }
  
  public String toString () 
  {
    StringBuilder output = new StringBuilder() ;
    output.append(TesterCode.printer(table)) ;
    output.append(new String(".keys")) ;
    output.append(new String("(")) ;
    output.append(new String(")")) ;
    return output.toString() ;
  }
  
  public Iterable<Integer> call () 
  {
    return table.keys() ;
  }
  
  public boolean checkResult (Integer[] expected) 
  {
    if (!noException())
      return false ;
    if (!nonNull())
      return false ;
    if (!TestUtils.unorderedIterableCorrect(this,result,expected))
      return false ;
    return true ;
  }
  
}


static class Entries extends TestCall<Iterable<Entry<Integer,String>>,HashEntry<Integer,String>[]>
{
  HashTable<Integer,String> table;
  
  public Entries (HashTable<Integer,String> table)
  {
    this.table = table ;
  }
  
  public String toString () 
  {
    StringBuilder output = new StringBuilder() ;
    output.append(TesterCode.printer(table)) ;
    output.append(new String(".entries")) ;
    output.append(new String("(")) ;
    output.append(new String(")")) ;
    return output.toString() ;
  }
  
  public Iterable<Entry<Integer,String>> call () 
  {
    return table.entries() ;
  }
  
  public boolean checkResult (HashEntry<Integer,String>[] expected) 
  {
    if (!noException())
      return false ;
    if (!nonNull())
      return false ;
    if (!TestUtils.unorderedIterableCorrect(this,result,expected))
      return false ;
    return true ;
  }
  
}


static class Equals extends TestCall<Boolean,Boolean>
{
  Person person1;
  Person person2;
  
  public Equals (Person person1,Person person2)
  {
    this.person1 = person1 ;
    this.person2 = person2 ;
  }
  
  public String toString () 
  {
    StringBuilder output = new StringBuilder() ;
    output.append(TesterCode.printer(person1)) ;
    output.append(new String(".equals")) ;
    output.append(new String("(")) ;
    output.append(TesterCode.printer(person2)) ;
    output.append(new String(")")) ;
    return output.toString() ;
  }
  
  public Boolean call () 
  {
    return person1.equals(person2) ;
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


static class Buckets extends TestCall<Boolean,Boolean>
{
  HashTable<Integer,String> arg1;
  es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>> arg2;
  
  public Buckets (HashTable<Integer,String> arg1,es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.positionlist.NodePositionList<HashEntry<Integer,String>>> arg2)
  {
    this.arg1 = arg1 ;
    this.arg2 = arg2 ;
  }
  
  public String toString () 
  {
    return new String("") ;
  }
  
  public Boolean call () 
  {
    return HashTableUtils.buckets(arg1,arg2) ;
  }
  
  public boolean checkResult (Boolean expected) 
  {
    return silentCheckTrueResult() ;
  }
  
}


static class Get extends TestCall<String,String>
{
  HashTable<Integer,String> table;
  Integer key;
  
  public Get (HashTable<Integer,String> table,Integer key)
  {
    this.table = table ;
    this.key = key ;
  }
  
  public String toString () 
  {
    StringBuilder output = new StringBuilder() ;
    output.append(TesterCode.printer(table)) ;
    output.append(new String(".get")) ;
    output.append(new String("(")) ;
    output.append(TesterCode.printer(key)) ;
    output.append(new String(")")) ;
    return output.toString() ;
  }
  
  public String call () 
  {
    return table.get(key) ;
  }
  
  public boolean checkResult (String expected) 
  {
    if (!noException())
      return false ;
    if (!valuesMatch(expected))
      return false ;
    return true ;
  }
  
}


static class Put extends TestCall<String,String>
{
  HashTable<Integer,String> table;
  Integer key;
  String value;
  
  public Put (HashTable<Integer,String> table,Integer key,String value)
  {
    this.table = table ;
    this.key = key ;
    this.value = value ;
  }
  
  public String toString () 
  {
    StringBuilder output = new StringBuilder() ;
    output.append(TesterCode.printer(table)) ;
    output.append(new String(".put")) ;
    output.append(new String("(")) ;
    output.append(TesterCode.printer(key)) ;
    output.append(new String(", ")) ;
    output.append(TesterCode.printer(value)) ;
    output.append(new String(")")) ;
    return output.toString() ;
  }
  
  public String call () 
  {
    return table.put(key,value) ;
  }
  
  public boolean checkResult (String expected) 
  {
    if (!noException())
      return false ;
    if (!valuesMatch(expected))
      return false ;
    return true ;
  }
  
}


static class Size extends TestCall<Integer,Integer>
{
  HashTable<Integer,String> table;
  
  public Size (HashTable<Integer,String> table)
  {
    this.table = table ;
  }
  
  public String toString () 
  {
    StringBuilder output = new StringBuilder() ;
    output.append(TesterCode.printer(table)) ;
    output.append(new String(".size")) ;
    output.append(new String("(")) ;
    output.append(new String(")")) ;
    return output.toString() ;
  }
  
  public Integer call () 
  {
    return table.size() ;
  }
  
  public boolean checkResult (Integer expected) 
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


static class Remove extends TestCall<String,String>
{
  HashTable<Integer,String> table;
  Integer key;
  
  public Remove (HashTable<Integer,String> table,Integer key)
  {
    this.table = table ;
    this.key = key ;
  }
  
  public String toString () 
  {
    StringBuilder output = new StringBuilder() ;
    output.append(TesterCode.printer(table)) ;
    output.append(new String(".remove")) ;
    output.append(new String("(")) ;
    output.append(TesterCode.printer(key)) ;
    output.append(new String(")")) ;
    return output.toString() ;
  }
  
  public String call () 
  {
    return table.remove(key) ;
  }
  
  public boolean checkResult (String expected) 
  {
    if (!noException())
      return false ;
    if (!valuesMatch(expected))
      return false ;
    return true ;
  }
  
}


static class HashCode extends TestCall<Integer,Integer>
{
  Person person;
  
  public HashCode (Person person)
  {
    this.person = person ;
  }
  
  public String toString () 
  {
    StringBuilder output = new StringBuilder() ;
    output.append(TesterCode.printer(person)) ;
    output.append(new String(".hashCode")) ;
    output.append(new String("(")) ;
    output.append(new String(")")) ;
    return output.toString() ;
  }
  
  public Integer call () 
  {
    return person.hashCode() ;
  }
  
  public boolean checkResult (Integer expected) 
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


static class IsEmpty extends TestCall<Boolean,Boolean>
{
  HashTable<Integer,String> table;
  
  public IsEmpty (HashTable<Integer,String> table)
  {
    this.table = table ;
  }
  
  public String toString () 
  {
    StringBuilder output = new StringBuilder() ;
    output.append(TesterCode.printer(table)) ;
    output.append(new String(".isEmpty")) ;
    output.append(new String("(")) ;
    output.append(new String(")")) ;
    return output.toString() ;
  }
  
  public Boolean call () 
  {
    return table.isEmpty() ;
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


static class ContainsKey extends TestCall<Boolean,Boolean>
{
  HashTable<Integer,String> table;
  Integer key;
  
  public ContainsKey (HashTable<Integer,String> table,Integer key)
  {
    this.table = table ;
    this.key = key ;
  }
  
  public String toString () 
  {
    StringBuilder output = new StringBuilder() ;
    output.append(TesterCode.printer(table)) ;
    output.append(new String(".containsKey")) ;
    output.append(new String("(")) ;
    output.append(TesterCode.printer(key)) ;
    output.append(new String(")")) ;
    return output.toString() ;
  }
  
  public Boolean call () 
  {
    return table.containsKey(key) ;
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




static class ResultsHandler {
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


static class TesterCode
{
  
  public static void resetPrinter () 
  {
    HashTableUtils.resetPrinter() ;
  }
  
  public static String printer (Object obj) 
  {
    return HashTableUtils.printer(obj) ;
  }
  
}


}
