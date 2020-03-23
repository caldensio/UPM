
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
// File generated at: 2019/11/28 -- 22:50:32
// Seed: {1574,977830,225779}
//
//////////////////////////////////////////////////////////////////////



package aed.urgencias;

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
import es.upm.aedlib.priorityqueue.HeapPriorityQueue;
import es.upm.aedlib.priorityqueue.PriorityQueue;
import es.upm.aedlib.priorityqueue.SortedListPriorityQueue;
import es.upm.aedlib.set.*;
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
public class TesterLab6 {

  
    

  @BeforeAll
  public static void init () 
  {
    TestUtils.reportPid() ;
    ResultsHandler.init() ;
    ResultsHandler.setNumTestsRemaining(54,60) ;
    TestData.setTesterType(true) ;
    TestUtils.ensureAedlibVersion(2,7,0) ;
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
    ResultsHandler.add_result(new String("urgencias"),resultIs) ;
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
TestResult<Urgencias,Void> v_0 = null ;
Urgencias v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_02") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_02")) ;
if (ok_sofar)
{
  v_0 = new Constructor().doCall() ;
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
    ResultsHandler.add_result(new String("urgencias"),resultIs) ;
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
TestResult<Urgencias,Void> v_0 = null ;
Urgencias v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_03") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_03")) ;
if (ok_sofar)
{
  v_0 = new Constructor().doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("61258155T"),new Integer(5)).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("61258155T"),5) }),new Boolean(false)).doCall().checkResult(true) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
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
    ResultsHandler.add_result(new String("urgencias"),resultIs) ;
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
TestResult<Urgencias,Void> v_0 = null ;
Urgencias v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_04") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_04")) ;
if (ok_sofar)
{
  v_0 = new Constructor().doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1).doCall().checkResult(new NoHayPacienteExc()) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] {  }),new Boolean(false)).doCall().checkResult(true) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
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
    ResultsHandler.add_result(new String("urgencias"),resultIs) ;
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
TestResult<Urgencias,Void> v_0 = null ;
Urgencias v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_05") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_05")) ;
if (ok_sofar)
{
  v_0 = new Constructor().doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new GetProximoPaciente(v_1).doCall().checkResult(new NoHayPacienteExc()) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] {  }),new Boolean(false)).doCall().checkResult(true) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
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
    ResultsHandler.add_result(new String("urgencias"),resultIs) ;
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
TestResult<Urgencias,Void> v_0 = null ;
Urgencias v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_06") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_06")) ;
if (ok_sofar)
{
  v_0 = new Constructor().doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("54887555H"),new Integer(1)).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("54887555H"),1) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1).doCall().checkResult(new Paciente(new String("54887555H"),1)) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] {  }),new Boolean(false)).doCall().checkResult(true) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
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
    ResultsHandler.add_result(new String("urgencias"),resultIs) ;
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
TestResult<Urgencias,Void> v_0 = null ;
Urgencias v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_07") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_07")) ;
if (ok_sofar)
{
  v_0 = new Constructor().doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1).doCall().checkResult(new NoHayPacienteExc()) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] {  }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("34217719I"),new Integer(1)).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("34217719I"),1) }),new Boolean(false)).doCall().checkResult(true) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
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
    ResultsHandler.add_result(new String("urgencias"),resultIs) ;
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
TestResult<Urgencias,Void> v_0 = null ;
Urgencias v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_08") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_08")) ;
if (ok_sofar)
{
  v_0 = new Constructor().doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1).doCall().checkResult(new NoHayPacienteExc()) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] {  }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("37622521T"),new Integer(9)).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("37622521T"),9) }),new Boolean(false)).doCall().checkResult(true) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
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
    ResultsHandler.add_result(new String("urgencias"),resultIs) ;
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
TestResult<Urgencias,Void> v_0 = null ;
Urgencias v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_09") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_09")) ;
if (ok_sofar)
{
  v_0 = new Constructor().doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("96835131H"),new Integer(5)).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("96835131H"),5) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1).doCall().checkResult(new Paciente(new String("96835131H"),5)) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] {  }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("19326391W"),new Integer(5)).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("19326391W"),5) }),new Boolean(false)).doCall().checkResult(true) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
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
    ResultsHandler.add_result(new String("urgencias"),resultIs) ;
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
TestResult<Urgencias,Void> v_0 = null ;
Urgencias v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_10") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_10")) ;
if (ok_sofar)
{
  v_0 = new Constructor().doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("111"),new Integer(5)).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("111"),5) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("222"),new Integer(4)).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("222"),4),new Paciente(new String("111"),5) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("111"),new Integer(4)).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("222"),4),new Paciente(new String("111"),4) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new GetProximoPaciente(v_1).doCall().checkResult(new Paciente(new String("222"),4)) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("222"),4),new Paciente(new String("111"),4) }),new Boolean(false)).doCall().checkResult(true) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
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
    ResultsHandler.add_result(new String("urgencias"),resultIs) ;
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
TestResult<Urgencias,Void> v_0 = null ;
Urgencias v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_11") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_11")) ;
if (ok_sofar)
{
  v_0 = new Constructor().doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("111"),new Integer(5)).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("111"),5) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("222"),new Integer(5)).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("111"),5),new Paciente(new String("222"),5) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("111"),new Integer(5)).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("111"),5),new Paciente(new String("222"),5) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new GetProximoPaciente(v_1).doCall().checkResult(new Paciente(new String("111"),5)) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("111"),5),new Paciente(new String("222"),5) }),new Boolean(false)).doCall().checkResult(true) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
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
    ResultsHandler.add_result(new String("urgencias"),resultIs) ;
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
TestResult<Urgencias,Void> v_0 = null ;
Urgencias v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_12") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_12")) ;
if (ok_sofar)
{
  v_0 = new Constructor().doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("95382498B"),new Integer(9)).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("95382498B"),9) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new SalirPaciente(v_1,new String("95382498B")).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] {  }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new GetPacientesPorOrdenDeLlegada(v_1).doCall().checkResult(new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] {  })) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] {  }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("XXXXYYYYZZZZZ"),new Integer(1)).doCall().checkResult(new NoHayPacienteExc()) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] {  }),new Boolean(false)).doCall().checkResult(true) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
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
    ResultsHandler.add_result(new String("urgencias"),resultIs) ;
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
TestResult<Urgencias,Void> v_0 = null ;
Urgencias v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_13") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_13")) ;
if (ok_sofar)
{
  v_0 = new Constructor().doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("98992455O"),new Integer(7)).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("98992455O"),7) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1).doCall().checkResult(new Paciente(new String("98992455O"),7)) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] {  }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new GetProximoPaciente(v_1).doCall().checkResult(new NoHayPacienteExc()) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] {  }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("57978216D"),new Integer(8)).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("57978216D"),8) }),new Boolean(false)).doCall().checkResult(true) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
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
    ResultsHandler.add_result(new String("urgencias"),resultIs) ;
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
TestResult<Urgencias,Void> v_0 = null ;
Urgencias v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_14") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_14")) ;
if (ok_sofar)
{
  v_0 = new Constructor().doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("111"),new Integer(0)).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("111"),0) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("222"),new Integer(1)).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("111"),0),new Paciente(new String("222"),1) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("333"),new Integer(2)).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("111"),0),new Paciente(new String("222"),1),new Paciente(new String("333"),2) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AumentaPrioridad(v_1,new Long(1L)).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new GetProximoPaciente(v_1).doCall().checkResult(new Paciente(new String("111"),0)) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("111"),0),new Paciente(new String("222"),0),new Paciente(new String("333"),2) }),new Boolean(true)).doCall().checkResult(true) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
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
    ResultsHandler.add_result(new String("urgencias"),resultIs) ;
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
TestResult<Urgencias,Void> v_0 = null ;
Urgencias v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_15") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_15")) ;
if (ok_sofar)
{
  v_0 = new Constructor().doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("31418578T"),new Integer(3)).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("31418578T"),3) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new SalirPaciente(v_1,new String("31418578T")).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] {  }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new SalirPaciente(v_1,new String("XXXXYYYYZZZZZ")).doCall().checkResult(new NoHayPacienteExc()) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] {  }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("77146386H"),new Integer(8)).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("77146386H"),8) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("25114843P"),new Integer(3)).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("25114843P"),3),new Paciente(new String("77146386H"),8) }),new Boolean(false)).doCall().checkResult(true) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
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
    ResultsHandler.add_result(new String("urgencias"),resultIs) ;
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
TestResult<Urgencias,Void> v_0 = null ;
Urgencias v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_16") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_16")) ;
if (ok_sofar)
{
  v_0 = new Constructor().doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("93344894C"),new Integer(6)).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("93344894C"),6) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new GetProximoPaciente(v_1).doCall().checkResult(new Paciente(new String("93344894C"),6)) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("93344894C"),6) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new SalirPaciente(v_1,new String("93344894C")).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] {  }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("71754817S"),new Integer(6)).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("71754817S"),6) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("71754817S"),new Integer(2)).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("71754817S"),2) }),new Boolean(false)).doCall().checkResult(true) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
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
    ResultsHandler.add_result(new String("urgencias"),resultIs) ;
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
TestResult<Urgencias,Void> v_0 = null ;
Urgencias v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_17") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_17")) ;
if (ok_sofar)
{
  v_0 = new Constructor().doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new GetProximoPaciente(v_1).doCall().checkResult(new NoHayPacienteExc()) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] {  }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("81113977J"),new Integer(5)).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("81113977J"),5) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("81113977J"),new Integer(10)).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("81113977J"),10) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("81113977J"),new Integer(4)).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("81113977J"),4) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("51488797D"),new Integer(6)).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("81113977J"),4),new Paciente(new String("51488797D"),6) }),new Boolean(false)).doCall().checkResult(true) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
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
    ResultsHandler.add_result(new String("urgencias"),resultIs) ;
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
TestResult<Urgencias,Void> v_0 = null ;
Urgencias v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_18") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_18")) ;
if (ok_sofar)
{
  v_0 = new Constructor().doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new SalirPaciente(v_1,new String("XXXXYYYYZZZZZ")).doCall().checkResult(new NoHayPacienteExc()) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] {  }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("64373438O"),new Integer(9)).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("64373438O"),9) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new GetProximoPaciente(v_1).doCall().checkResult(new Paciente(new String("64373438O"),9)) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("64373438O"),9) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1).doCall().checkResult(new Paciente(new String("64373438O"),9)) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] {  }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("53167828S"),new Integer(1)).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("53167828S"),1) }),new Boolean(false)).doCall().checkResult(true) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
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
    ResultsHandler.add_result(new String("urgencias"),resultIs) ;
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
TestResult<Urgencias,Void> v_0 = null ;
Urgencias v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_19") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_19")) ;
if (ok_sofar)
{
  v_0 = new Constructor().doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new SalirPaciente(v_1,new String("XXXXYYYYZZZZZ")).doCall().checkResult(new NoHayPacienteExc()) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] {  }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1).doCall().checkResult(new NoHayPacienteExc()) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] {  }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new GetProximoPaciente(v_1).doCall().checkResult(new NoHayPacienteExc()) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] {  }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("94276485I"),new Integer(8)).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("94276485I"),8) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1).doCall().checkResult(new Paciente(new String("94276485I"),8)) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] {  }),new Boolean(false)).doCall().checkResult(true) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
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
    ResultsHandler.add_result(new String("urgencias"),resultIs) ;
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
TestResult<Urgencias,Void> v_0 = null ;
Urgencias v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_20") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_20")) ;
if (ok_sofar)
{
  v_0 = new Constructor().doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("42716438A"),new Integer(3)).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("42716438A"),3) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new GetProximoPaciente(v_1).doCall().checkResult(new Paciente(new String("42716438A"),3)) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("42716438A"),3) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("14663674M"),new Integer(5)).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("42716438A"),3),new Paciente(new String("14663674M"),5) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new GetProximoPaciente(v_1).doCall().checkResult(new Paciente(new String("42716438A"),3)) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("42716438A"),3),new Paciente(new String("14663674M"),5) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new SalirPaciente(v_1,new String("14663674M")).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("42716438A"),3) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1).doCall().checkResult(new Paciente(new String("42716438A"),3)) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] {  }),new Boolean(false)).doCall().checkResult(true) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
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
    ResultsHandler.add_result(new String("urgencias"),resultIs) ;
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
TestResult<Urgencias,Void> v_0 = null ;
Urgencias v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_21") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_21")) ;
if (ok_sofar)
{
  v_0 = new Constructor().doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("67939884S"),new Integer(10)).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("67939884S"),10) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("93866718I"),new Integer(4)).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("93866718I"),4),new Paciente(new String("67939884S"),10) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("93866718I"),new Integer(8)).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("93866718I"),8),new Paciente(new String("67939884S"),10) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("54472141K"),new Integer(1)).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("54472141K"),1),new Paciente(new String("93866718I"),8),new Paciente(new String("67939884S"),10) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1).doCall().checkResult(new Paciente(new String("54472141K"),1)) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("93866718I"),8),new Paciente(new String("67939884S"),10) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1).doCall().checkResult(new Paciente(new String("93866718I"),8)) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("67939884S"),10) }),new Boolean(false)).doCall().checkResult(true) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
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
    ResultsHandler.add_result(new String("urgencias"),resultIs) ;
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
TestResult<Urgencias,Void> v_0 = null ;
Urgencias v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_22") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_22")) ;
if (ok_sofar)
{
  v_0 = new Constructor().doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("48744172X"),new Integer(4)).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("48744172X"),4) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("79693993F"),new Integer(4)).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("48744172X"),4),new Paciente(new String("79693993F"),4) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("36488852L"),new Integer(8)).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("48744172X"),4),new Paciente(new String("79693993F"),4),new Paciente(new String("36488852L"),8) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("25648892H"),new Integer(4)).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("48744172X"),4),new Paciente(new String("79693993F"),4),new Paciente(new String("25648892H"),4),new Paciente(new String("36488852L"),8) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("54286247X"),new Integer(5)).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("48744172X"),4),new Paciente(new String("79693993F"),4),new Paciente(new String("25648892H"),4),new Paciente(new String("54286247X"),5),new Paciente(new String("36488852L"),8) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new GetProximoPaciente(v_1).doCall().checkResult(new Paciente(new String("48744172X"),4)) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("48744172X"),4),new Paciente(new String("79693993F"),4),new Paciente(new String("25648892H"),4),new Paciente(new String("54286247X"),5),new Paciente(new String("36488852L"),8) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("21934869O"),new Integer(1)).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("21934869O"),1),new Paciente(new String("48744172X"),4),new Paciente(new String("79693993F"),4),new Paciente(new String("25648892H"),4),new Paciente(new String("54286247X"),5),new Paciente(new String("36488852L"),8) }),new Boolean(false)).doCall().checkResult(true) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
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
    ResultsHandler.add_result(new String("urgencias"),resultIs) ;
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
TestResult<Urgencias,Void> v_0 = null ;
Urgencias v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_23") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_23")) ;
if (ok_sofar)
{
  v_0 = new Constructor().doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new GetPacientesPorOrdenDeLlegada(v_1).doCall().checkResult(new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] {  })) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] {  }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("58929312K"),new Integer(1)).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("58929312K"),1) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1).doCall().checkResult(new Paciente(new String("58929312K"),1)) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] {  }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("77146415H"),new Integer(10)).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("77146415H"),10) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("77146415H"),new Integer(3)).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("77146415H"),3) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new SalirPaciente(v_1,new String("77146415H")).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] {  }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new GetProximoPaciente(v_1).doCall().checkResult(new NoHayPacienteExc()) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] {  }),new Boolean(false)).doCall().checkResult(true) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
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
    ResultsHandler.add_result(new String("urgencias"),resultIs) ;
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
TestResult<Urgencias,Void> v_0 = null ;
Urgencias v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_24") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_24")) ;
if (ok_sofar)
{
  v_0 = new Constructor().doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("93972894U"),new Integer(7)).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("93972894U"),7) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1).doCall().checkResult(new Paciente(new String("93972894U"),7)) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] {  }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("19415916P"),new Integer(4)).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("19415916P"),4) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new GetProximoPaciente(v_1).doCall().checkResult(new Paciente(new String("19415916P"),4)) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("19415916P"),4) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new GetProximoPaciente(v_1).doCall().checkResult(new Paciente(new String("19415916P"),4)) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("19415916P"),4) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new SalirPaciente(v_1,new String("19415916P")).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] {  }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("79741917Y"),new Integer(2)).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("79741917Y"),2) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1).doCall().checkResult(new Paciente(new String("79741917Y"),2)) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] {  }),new Boolean(false)).doCall().checkResult(true) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
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
    ResultsHandler.add_result(new String("urgencias"),resultIs) ;
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
TestResult<Urgencias,Void> v_0 = null ;
Urgencias v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_25") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_25")) ;
if (ok_sofar)
{
  v_0 = new Constructor().doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new GetProximoPaciente(v_1).doCall().checkResult(new NoHayPacienteExc()) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] {  }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1).doCall().checkResult(new NoHayPacienteExc()) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] {  }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1).doCall().checkResult(new NoHayPacienteExc()) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] {  }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new SalirPaciente(v_1,new String("XXXXYYYYZZZZZ")).doCall().checkResult(new NoHayPacienteExc()) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] {  }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("87151217V"),new Integer(4)).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("87151217V"),4) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1).doCall().checkResult(new Paciente(new String("87151217V"),4)) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] {  }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("XXXXYYYYZZZZZ"),new Integer(2)).doCall().checkResult(new NoHayPacienteExc()) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] {  }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("65965341G"),new Integer(4)).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("65965341G"),4) }),new Boolean(false)).doCall().checkResult(true) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
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
    ResultsHandler.add_result(new String("urgencias"),resultIs) ;
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
TestResult<Urgencias,Void> v_0 = null ;
Urgencias v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_26") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_26")) ;
if (ok_sofar)
{
  v_0 = new Constructor().doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("63354493N"),new Integer(8)).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("63354493N"),8) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("52597943A"),new Integer(7)).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("52597943A"),7),new Paciente(new String("63354493N"),8) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new GetPacientesPorOrdenDeLlegada(v_1).doCall().checkResult(new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("63354493N"),8),new Paciente(new String("52597943A"),7) })) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("52597943A"),7),new Paciente(new String("63354493N"),8) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1).doCall().checkResult(new Paciente(new String("52597943A"),7)) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("63354493N"),8) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("11953857W"),new Integer(5)).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("11953857W"),5),new Paciente(new String("63354493N"),8) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1).doCall().checkResult(new Paciente(new String("11953857W"),5)) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("63354493N"),8) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("21683354S"),new Integer(5)).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("21683354S"),5),new Paciente(new String("63354493N"),8) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new GetProximoPaciente(v_1).doCall().checkResult(new Paciente(new String("21683354S"),5)) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("21683354S"),5),new Paciente(new String("63354493N"),8) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("63354493N"),new Integer(7)).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("21683354S"),5),new Paciente(new String("63354493N"),7) }),new Boolean(false)).doCall().checkResult(true) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
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
    ResultsHandler.add_result(new String("urgencias"),resultIs) ;
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
TestResult<Urgencias,Void> v_0 = null ;
Urgencias v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_27") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_27")) ;
if (ok_sofar)
{
  v_0 = new Constructor().doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("93773617V"),new Integer(2)).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("93773617V"),2) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("98245174S"),new Integer(10)).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("93773617V"),2),new Paciente(new String("98245174S"),10) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("98245174S"),new Integer(10)).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("93773617V"),2),new Paciente(new String("98245174S"),10) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1).doCall().checkResult(new Paciente(new String("93773617V"),2)) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("98245174S"),10) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("76992933L"),new Integer(9)).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("76992933L"),9),new Paciente(new String("98245174S"),10) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1).doCall().checkResult(new Paciente(new String("76992933L"),9)) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("98245174S"),10) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("98245174S"),new Integer(9)).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("98245174S"),9) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new GetProximoPaciente(v_1).doCall().checkResult(new Paciente(new String("98245174S"),9)) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("98245174S"),9) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1).doCall().checkResult(new Paciente(new String("98245174S"),9)) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] {  }),new Boolean(false)).doCall().checkResult(true) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
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
    ResultsHandler.add_result(new String("urgencias"),resultIs) ;
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
TestResult<Urgencias,Void> v_0 = null ;
Urgencias v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_28") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_28")) ;
if (ok_sofar)
{
  v_0 = new Constructor().doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new SetCurrentTime(0).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] {  }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("111"),new Integer(5)).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("111"),5) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("222"),new Integer(7)).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("111"),5),new Paciente(new String("222"),7) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new SetCurrentTime(1000).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("111"),5),new Paciente(new String("222"),7) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("333"),new Integer(8)).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("111"),5),new Paciente(new String("222"),7),new Paciente(new String("333"),8) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new SetCurrentTime(2000).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("111"),5),new Paciente(new String("222"),7),new Paciente(new String("333"),8) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AumentaPrioridad(v_1,new Long(1500L)).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1).doCall().checkResult(new Paciente(new String("111"),4)) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("222"),6),new Paciente(new String("333"),8) }),new Boolean(true)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1).doCall().checkResult(new Paciente(new String("222"),6)) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("333"),8) }),new Boolean(true)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1).doCall().checkResult(new Paciente(new String("333"),8)) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] {  }),new Boolean(true)).doCall().checkResult(true) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
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
    ResultsHandler.add_result(new String("urgencias"),resultIs) ;
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
TestResult<Urgencias,Void> v_0 = null ;
Urgencias v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_29") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_29")) ;
if (ok_sofar)
{
  v_0 = new Constructor().doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("24699242A"),new Integer(2)).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("24699242A"),2) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1).doCall().checkResult(new Paciente(new String("24699242A"),2)) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] {  }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1).doCall().checkResult(new NoHayPacienteExc()) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] {  }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new GetPacientesPorOrdenDeLlegada(v_1).doCall().checkResult(new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] {  })) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] {  }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("43813958Z"),new Integer(7)).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("43813958Z"),7) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1).doCall().checkResult(new Paciente(new String("43813958Z"),7)) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] {  }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1).doCall().checkResult(new NoHayPacienteExc()) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] {  }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("XXXXYYYYZZZZZ"),new Integer(2)).doCall().checkResult(new NoHayPacienteExc()) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] {  }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("29744937V"),new Integer(3)).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("29744937V"),3) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new GetProximoPaciente(v_1).doCall().checkResult(new Paciente(new String("29744937V"),3)) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("29744937V"),3) }),new Boolean(false)).doCall().checkResult(true) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
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
    ResultsHandler.add_result(new String("urgencias"),resultIs) ;
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
TestResult<Urgencias,Void> v_0 = null ;
Urgencias v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_30") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_30")) ;
if (ok_sofar)
{
  v_0 = new Constructor().doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("31789416P"),new Integer(4)).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("31789416P"),4) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1).doCall().checkResult(new Paciente(new String("31789416P"),4)) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] {  }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new SalirPaciente(v_1,new String("XXXXYYYYZZZZZ")).doCall().checkResult(new NoHayPacienteExc()) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] {  }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new GetProximoPaciente(v_1).doCall().checkResult(new NoHayPacienteExc()) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] {  }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("71431636A"),new Integer(2)).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("71431636A"),2) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new SalirPaciente(v_1,new String("71431636A")).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] {  }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new GetPacientesPorOrdenDeLlegada(v_1).doCall().checkResult(new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] {  })) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] {  }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("63665998E"),new Integer(2)).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("63665998E"),2) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new GetProximoPaciente(v_1).doCall().checkResult(new Paciente(new String("63665998E"),2)) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("63665998E"),2) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("41261662D"),new Integer(8)).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("63665998E"),2),new Paciente(new String("41261662D"),8) }),new Boolean(false)).doCall().checkResult(true) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
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
    ResultsHandler.add_result(new String("urgencias"),resultIs) ;
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
TestResult<Urgencias,Void> v_0 = null ;
Urgencias v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_31") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_31")) ;
if (ok_sofar)
{
  v_0 = new Constructor().doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1).doCall().checkResult(new NoHayPacienteExc()) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] {  }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new GetProximoPaciente(v_1).doCall().checkResult(new NoHayPacienteExc()) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] {  }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("35352975W"),new Integer(4)).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("35352975W"),4) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("35352975W"),new Integer(7)).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("35352975W"),7) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1).doCall().checkResult(new Paciente(new String("35352975W"),7)) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] {  }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("93835221L"),new Integer(8)).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("93835221L"),8) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1).doCall().checkResult(new Paciente(new String("93835221L"),8)) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] {  }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("77142954F"),new Integer(4)).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("77142954F"),4) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1).doCall().checkResult(new Paciente(new String("77142954F"),4)) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] {  }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("13855966Z"),new Integer(7)).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("13855966Z"),7) }),new Boolean(false)).doCall().checkResult(true) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
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
    ResultsHandler.add_result(new String("urgencias"),resultIs) ;
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
TestResult<Urgencias,Void> v_0 = null ;
Urgencias v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_32") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_32")) ;
if (ok_sofar)
{
  v_0 = new Constructor().doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("61173717M"),new Integer(6)).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("61173717M"),6) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("61173717M"),new Integer(10)).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("61173717M"),10) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1).doCall().checkResult(new Paciente(new String("61173717M"),10)) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] {  }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new GetProximoPaciente(v_1).doCall().checkResult(new NoHayPacienteExc()) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] {  }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new GetProximoPaciente(v_1).doCall().checkResult(new NoHayPacienteExc()) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] {  }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new GetProximoPaciente(v_1).doCall().checkResult(new NoHayPacienteExc()) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] {  }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("86296233P"),new Integer(9)).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("86296233P"),9) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1).doCall().checkResult(new Paciente(new String("86296233P"),9)) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] {  }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("61439583R"),new Integer(9)).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("61439583R"),9) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1).doCall().checkResult(new Paciente(new String("61439583R"),9)) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] {  }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new SalirPaciente(v_1,new String("XXXXYYYYZZZZZ")).doCall().checkResult(new NoHayPacienteExc()) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] {  }),new Boolean(false)).doCall().checkResult(true) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
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
    ResultsHandler.add_result(new String("urgencias"),resultIs) ;
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
TestResult<Urgencias,Void> v_0 = null ;
Urgencias v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_33") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_33")) ;
if (ok_sofar)
{
  v_0 = new Constructor().doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("XXXXYYYYZZZZZ"),new Integer(1)).doCall().checkResult(new NoHayPacienteExc()) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] {  }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1).doCall().checkResult(new NoHayPacienteExc()) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] {  }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("48628373B"),new Integer(7)).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("48628373B"),7) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1).doCall().checkResult(new Paciente(new String("48628373B"),7)) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] {  }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("67851557C"),new Integer(4)).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("67851557C"),4) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1).doCall().checkResult(new Paciente(new String("67851557C"),4)) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] {  }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("52212595I"),new Integer(9)).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("52212595I"),9) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("52212595I"),new Integer(9)).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("52212595I"),9) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("84418761R"),new Integer(10)).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("52212595I"),9),new Paciente(new String("84418761R"),10) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("84418761R"),new Integer(8)).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("84418761R"),8),new Paciente(new String("52212595I"),9) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1).doCall().checkResult(new Paciente(new String("84418761R"),8)) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("52212595I"),9) }),new Boolean(false)).doCall().checkResult(true) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
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
    ResultsHandler.add_result(new String("urgencias"),resultIs) ;
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
TestResult<Urgencias,Void> v_0 = null ;
Urgencias v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_34") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_34")) ;
if (ok_sofar)
{
  v_0 = new Constructor().doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new GetPacientesPorOrdenDeLlegada(v_1).doCall().checkResult(new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] {  })) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] {  }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("62151111O"),new Integer(3)).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("62151111O"),3) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new GetProximoPaciente(v_1).doCall().checkResult(new Paciente(new String("62151111O"),3)) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("62151111O"),3) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("62151111O"),new Integer(2)).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("62151111O"),2) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new GetProximoPaciente(v_1).doCall().checkResult(new Paciente(new String("62151111O"),2)) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("62151111O"),2) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("71742896G"),new Integer(3)).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("62151111O"),2),new Paciente(new String("71742896G"),3) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("XXXXYYYYZZZZZ"),new Integer(9)).doCall().checkResult(new NoHayPacienteExc()) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("62151111O"),2),new Paciente(new String("71742896G"),3) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("71742896G"),new Integer(8)).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("62151111O"),2),new Paciente(new String("71742896G"),8) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new SalirPaciente(v_1,new String("71742896G")).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("62151111O"),2) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new SalirPaciente(v_1,new String("62151111O")).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] {  }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new GetProximoPaciente(v_1).doCall().checkResult(new NoHayPacienteExc()) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] {  }),new Boolean(false)).doCall().checkResult(true) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
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
    ResultsHandler.add_result(new String("urgencias"),resultIs) ;
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
TestResult<Urgencias,Void> v_0 = null ;
Urgencias v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_35") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_35")) ;
if (ok_sofar)
{
  v_0 = new Constructor().doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new GetPacientesPorOrdenDeLlegada(v_1).doCall().checkResult(new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] {  })) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] {  }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("24748169T"),new Integer(8)).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("24748169T"),8) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new GetProximoPaciente(v_1).doCall().checkResult(new Paciente(new String("24748169T"),8)) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("24748169T"),8) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("37912159V"),new Integer(1)).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("37912159V"),1),new Paciente(new String("24748169T"),8) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("33195799E"),new Integer(3)).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("37912159V"),1),new Paciente(new String("33195799E"),3),new Paciente(new String("24748169T"),8) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("17425932U"),new Integer(7)).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("37912159V"),1),new Paciente(new String("33195799E"),3),new Paciente(new String("17425932U"),7),new Paciente(new String("24748169T"),8) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("56191756Q"),new Integer(8)).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("37912159V"),1),new Paciente(new String("33195799E"),3),new Paciente(new String("17425932U"),7),new Paciente(new String("24748169T"),8),new Paciente(new String("56191756Q"),8) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new GetPacientesPorOrdenDeLlegada(v_1).doCall().checkResult(new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("24748169T"),8),new Paciente(new String("37912159V"),1),new Paciente(new String("33195799E"),3),new Paciente(new String("17425932U"),7),new Paciente(new String("56191756Q"),8) })) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("37912159V"),1),new Paciente(new String("33195799E"),3),new Paciente(new String("17425932U"),7),new Paciente(new String("24748169T"),8),new Paciente(new String("56191756Q"),8) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("37912159V"),new Integer(7)).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("33195799E"),3),new Paciente(new String("17425932U"),7),new Paciente(new String("37912159V"),7),new Paciente(new String("24748169T"),8),new Paciente(new String("56191756Q"),8) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1).doCall().checkResult(new Paciente(new String("33195799E"),3)) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("17425932U"),7),new Paciente(new String("37912159V"),7),new Paciente(new String("24748169T"),8),new Paciente(new String("56191756Q"),8) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1).doCall().checkResult(new Paciente(new String("17425932U"),7)) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("37912159V"),7),new Paciente(new String("24748169T"),8),new Paciente(new String("56191756Q"),8) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("83778962S"),new Integer(4)).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("83778962S"),4),new Paciente(new String("37912159V"),7),new Paciente(new String("24748169T"),8),new Paciente(new String("56191756Q"),8) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("XXXXYYYYZZZZZ"),new Integer(2)).doCall().checkResult(new NoHayPacienteExc()) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("83778962S"),4),new Paciente(new String("37912159V"),7),new Paciente(new String("24748169T"),8),new Paciente(new String("56191756Q"),8) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1).doCall().checkResult(new Paciente(new String("83778962S"),4)) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("37912159V"),7),new Paciente(new String("24748169T"),8),new Paciente(new String("56191756Q"),8) }),new Boolean(false)).doCall().checkResult(true) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
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
    ResultsHandler.add_result(new String("urgencias"),resultIs) ;
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
TestResult<Urgencias,Void> v_0 = null ;
Urgencias v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_36") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_36")) ;
if (ok_sofar)
{
  v_0 = new Constructor().doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("68892237M"),new Integer(9)).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("68892237M"),9) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new GetProximoPaciente(v_1).doCall().checkResult(new Paciente(new String("68892237M"),9)) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("68892237M"),9) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new SalirPaciente(v_1,new String("68892237M")).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] {  }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new SalirPaciente(v_1,new String("XXXXYYYYZZZZZ")).doCall().checkResult(new NoHayPacienteExc()) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] {  }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("74748814Z"),new Integer(9)).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("74748814Z"),9) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1).doCall().checkResult(new Paciente(new String("74748814Z"),9)) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] {  }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("36724437E"),new Integer(3)).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("36724437E"),3) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new GetProximoPaciente(v_1).doCall().checkResult(new Paciente(new String("36724437E"),3)) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("36724437E"),3) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new GetProximoPaciente(v_1).doCall().checkResult(new Paciente(new String("36724437E"),3)) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("36724437E"),3) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("36724437E"),new Integer(9)).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("36724437E"),9) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1).doCall().checkResult(new Paciente(new String("36724437E"),9)) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] {  }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("24611433K"),new Integer(8)).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("24611433K"),8) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new GetProximoPaciente(v_1).doCall().checkResult(new Paciente(new String("24611433K"),8)) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("24611433K"),8) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("24611433K"),new Integer(7)).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("24611433K"),7) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1).doCall().checkResult(new Paciente(new String("24611433K"),7)) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] {  }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new GetProximoPaciente(v_1).doCall().checkResult(new NoHayPacienteExc()) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] {  }),new Boolean(false)).doCall().checkResult(true) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
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
    ResultsHandler.add_result(new String("urgencias"),resultIs) ;
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
TestResult<Urgencias,Void> v_0 = null ;
Urgencias v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_37") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_37")) ;
if (ok_sofar)
{
  v_0 = new Constructor().doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("88495237I"),new Integer(9)).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("88495237I"),9) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new GetProximoPaciente(v_1).doCall().checkResult(new Paciente(new String("88495237I"),9)) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("88495237I"),9) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("74281315A"),new Integer(4)).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("74281315A"),4),new Paciente(new String("88495237I"),9) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new SalirPaciente(v_1,new String("88495237I")).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("74281315A"),4) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new GetPacientesPorOrdenDeLlegada(v_1).doCall().checkResult(new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("74281315A"),4) })) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("74281315A"),4) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("64128894O"),new Integer(8)).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("74281315A"),4),new Paciente(new String("64128894O"),8) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1).doCall().checkResult(new Paciente(new String("74281315A"),4)) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("64128894O"),8) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1).doCall().checkResult(new Paciente(new String("64128894O"),8)) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] {  }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("66623266R"),new Integer(2)).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("66623266R"),2) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new GetProximoPaciente(v_1).doCall().checkResult(new Paciente(new String("66623266R"),2)) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("66623266R"),2) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new GetPacientesPorOrdenDeLlegada(v_1).doCall().checkResult(new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("66623266R"),2) })) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("66623266R"),2) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("92127912Z"),new Integer(9)).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("66623266R"),2),new Paciente(new String("92127912Z"),9) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("92127912Z"),new Integer(8)).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("66623266R"),2),new Paciente(new String("92127912Z"),8) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("59111336Y"),new Integer(5)).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("66623266R"),2),new Paciente(new String("59111336Y"),5),new Paciente(new String("92127912Z"),8) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1).doCall().checkResult(new Paciente(new String("66623266R"),2)) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("59111336Y"),5),new Paciente(new String("92127912Z"),8) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("49681416Y"),new Integer(3)).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("49681416Y"),3),new Paciente(new String("59111336Y"),5),new Paciente(new String("92127912Z"),8) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new SalirPaciente(v_1,new String("59111336Y")).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("49681416Y"),3),new Paciente(new String("92127912Z"),8) }),new Boolean(false)).doCall().checkResult(true) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
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
    ResultsHandler.add_result(new String("urgencias"),resultIs) ;
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
TestResult<Urgencias,Void> v_0 = null ;
Urgencias v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_38") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_38")) ;
if (ok_sofar)
{
  v_0 = new Constructor().doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("94354553E"),new Integer(6)).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("94354553E"),6) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("18322971H"),new Integer(3)).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("18322971H"),3),new Paciente(new String("94354553E"),6) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("37729992R"),new Integer(4)).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("18322971H"),3),new Paciente(new String("37729992R"),4),new Paciente(new String("94354553E"),6) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("72792942U"),new Integer(5)).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("18322971H"),3),new Paciente(new String("37729992R"),4),new Paciente(new String("72792942U"),5),new Paciente(new String("94354553E"),6) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("76927133K"),new Integer(1)).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("76927133K"),1),new Paciente(new String("18322971H"),3),new Paciente(new String("37729992R"),4),new Paciente(new String("72792942U"),5),new Paciente(new String("94354553E"),6) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new GetProximoPaciente(v_1).doCall().checkResult(new Paciente(new String("76927133K"),1)) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("76927133K"),1),new Paciente(new String("18322971H"),3),new Paciente(new String("37729992R"),4),new Paciente(new String("72792942U"),5),new Paciente(new String("94354553E"),6) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("94354553E"),new Integer(1)).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("76927133K"),1),new Paciente(new String("94354553E"),1),new Paciente(new String("18322971H"),3),new Paciente(new String("37729992R"),4),new Paciente(new String("72792942U"),5) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("31523214R"),new Integer(7)).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("76927133K"),1),new Paciente(new String("94354553E"),1),new Paciente(new String("18322971H"),3),new Paciente(new String("37729992R"),4),new Paciente(new String("72792942U"),5),new Paciente(new String("31523214R"),7) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new SalirPaciente(v_1,new String("72792942U")).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("76927133K"),1),new Paciente(new String("94354553E"),1),new Paciente(new String("18322971H"),3),new Paciente(new String("37729992R"),4),new Paciente(new String("31523214R"),7) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new SalirPaciente(v_1,new String("76927133K")).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("94354553E"),1),new Paciente(new String("18322971H"),3),new Paciente(new String("37729992R"),4),new Paciente(new String("31523214R"),7) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1).doCall().checkResult(new Paciente(new String("94354553E"),1)) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("18322971H"),3),new Paciente(new String("37729992R"),4),new Paciente(new String("31523214R"),7) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new SalirPaciente(v_1,new String("31523214R")).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("18322971H"),3),new Paciente(new String("37729992R"),4) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new GetProximoPaciente(v_1).doCall().checkResult(new Paciente(new String("18322971H"),3)) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("18322971H"),3),new Paciente(new String("37729992R"),4) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("37729992R"),new Integer(9)).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("18322971H"),3),new Paciente(new String("37729992R"),9) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new SalirPaciente(v_1,new String("18322971H")).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("37729992R"),9) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("44977619H"),new Integer(4)).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("44977619H"),4),new Paciente(new String("37729992R"),9) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new GetPacientesPorOrdenDeLlegada(v_1).doCall().checkResult(new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("37729992R"),9),new Paciente(new String("44977619H"),4) })) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("44977619H"),4),new Paciente(new String("37729992R"),9) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("37729992R"),new Integer(6)).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("44977619H"),4),new Paciente(new String("37729992R"),6) }),new Boolean(false)).doCall().checkResult(true) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
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
    ResultsHandler.add_result(new String("urgencias"),resultIs) ;
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
TestResult<Urgencias,Void> v_0 = null ;
Urgencias v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_39") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_39")) ;
if (ok_sofar)
{
  v_0 = new Constructor().doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new SalirPaciente(v_1,new String("XXXXYYYYZZZZZ")).doCall().checkResult(new NoHayPacienteExc()) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] {  }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("XXXXYYYYZZZZZ"),new Integer(8)).doCall().checkResult(new NoHayPacienteExc()) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] {  }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new GetProximoPaciente(v_1).doCall().checkResult(new NoHayPacienteExc()) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] {  }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("89851147N"),new Integer(1)).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("89851147N"),1) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1).doCall().checkResult(new Paciente(new String("89851147N"),1)) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] {  }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1).doCall().checkResult(new NoHayPacienteExc()) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] {  }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("71736581J"),new Integer(4)).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("71736581J"),4) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("27168523X"),new Integer(1)).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("27168523X"),1),new Paciente(new String("71736581J"),4) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new SalirPaciente(v_1,new String("71736581J")).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("27168523X"),1) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("43722947Y"),new Integer(10)).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("27168523X"),1),new Paciente(new String("43722947Y"),10) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("43722947Y"),new Integer(7)).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("27168523X"),1),new Paciente(new String("43722947Y"),7) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("27168523X"),new Integer(1)).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("27168523X"),1),new Paciente(new String("43722947Y"),7) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1).doCall().checkResult(new Paciente(new String("27168523X"),1)) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("43722947Y"),7) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("79271745V"),new Integer(6)).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("79271745V"),6),new Paciente(new String("43722947Y"),7) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("79271745V"),new Integer(8)).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("43722947Y"),7),new Paciente(new String("79271745V"),8) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new SalirPaciente(v_1,new String("79271745V")).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("43722947Y"),7) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("88646123M"),new Integer(8)).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("43722947Y"),7),new Paciente(new String("88646123M"),8) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new SalirPaciente(v_1,new String("88646123M")).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("43722947Y"),7) }),new Boolean(false)).doCall().checkResult(true) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
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
    ResultsHandler.add_result(new String("urgencias"),resultIs) ;
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
TestResult<Urgencias,Void> v_0 = null ;
Urgencias v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_40") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_40")) ;
if (ok_sofar)
{
  v_0 = new Constructor().doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("13835721H"),new Integer(5)).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("13835721H"),5) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1).doCall().checkResult(new Paciente(new String("13835721H"),5)) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] {  }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("72855567Q"),new Integer(5)).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("72855567Q"),5) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new GetProximoPaciente(v_1).doCall().checkResult(new Paciente(new String("72855567Q"),5)) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("72855567Q"),5) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1).doCall().checkResult(new Paciente(new String("72855567Q"),5)) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] {  }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new GetPacientesPorOrdenDeLlegada(v_1).doCall().checkResult(new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] {  })) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] {  }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("XXXXYYYYZZZZZ"),new Integer(4)).doCall().checkResult(new NoHayPacienteExc()) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] {  }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("31652469E"),new Integer(1)).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("31652469E"),1) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("25667916L"),new Integer(3)).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("31652469E"),1),new Paciente(new String("25667916L"),3) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new GetProximoPaciente(v_1).doCall().checkResult(new Paciente(new String("31652469E"),1)) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("31652469E"),1),new Paciente(new String("25667916L"),3) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("32741346T"),new Integer(5)).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("31652469E"),1),new Paciente(new String("25667916L"),3),new Paciente(new String("32741346T"),5) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1).doCall().checkResult(new Paciente(new String("31652469E"),1)) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("25667916L"),3),new Paciente(new String("32741346T"),5) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new SalirPaciente(v_1,new String("25667916L")).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("32741346T"),5) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("32741346T"),new Integer(2)).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("32741346T"),2) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1).doCall().checkResult(new Paciente(new String("32741346T"),2)) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] {  }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("42425767A"),new Integer(4)).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("42425767A"),4) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1).doCall().checkResult(new Paciente(new String("42425767A"),4)) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] {  }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("XXXXYYYYZZZZZ"),new Integer(10)).doCall().checkResult(new NoHayPacienteExc()) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] {  }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new GetProximoPaciente(v_1).doCall().checkResult(new NoHayPacienteExc()) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] {  }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("94544577U"),new Integer(1)).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("94544577U"),1) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("29371324O"),new Integer(7)).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("94544577U"),1),new Paciente(new String("29371324O"),7) }),new Boolean(false)).doCall().checkResult(true) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
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
    ResultsHandler.add_result(new String("urgencias"),resultIs) ;
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
TestResult<Urgencias,Void> v_0 = null ;
Urgencias v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_41") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_41")) ;
if (ok_sofar)
{
  v_0 = new Constructor().doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new GetProximoPaciente(v_1).doCall().checkResult(new NoHayPacienteExc()) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] {  }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("15195949U"),new Integer(10)).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("15195949U"),10) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new GetProximoPaciente(v_1).doCall().checkResult(new Paciente(new String("15195949U"),10)) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("15195949U"),10) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1).doCall().checkResult(new Paciente(new String("15195949U"),10)) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] {  }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("XXXXYYYYZZZZZ"),new Integer(1)).doCall().checkResult(new NoHayPacienteExc()) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] {  }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1).doCall().checkResult(new NoHayPacienteExc()) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] {  }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new SalirPaciente(v_1,new String("XXXXYYYYZZZZZ")).doCall().checkResult(new NoHayPacienteExc()) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] {  }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("73953226C"),new Integer(4)).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("73953226C"),4) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("98172164Z"),new Integer(6)).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("73953226C"),4),new Paciente(new String("98172164Z"),6) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("91511131H"),new Integer(9)).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("73953226C"),4),new Paciente(new String("98172164Z"),6),new Paciente(new String("91511131H"),9) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1).doCall().checkResult(new Paciente(new String("73953226C"),4)) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("98172164Z"),6),new Paciente(new String("91511131H"),9) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("36352671U"),new Integer(1)).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("36352671U"),1),new Paciente(new String("98172164Z"),6),new Paciente(new String("91511131H"),9) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("79853112A"),new Integer(6)).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("36352671U"),1),new Paciente(new String("98172164Z"),6),new Paciente(new String("79853112A"),6),new Paciente(new String("91511131H"),9) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new SalirPaciente(v_1,new String("98172164Z")).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("36352671U"),1),new Paciente(new String("79853112A"),6),new Paciente(new String("91511131H"),9) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new GetProximoPaciente(v_1).doCall().checkResult(new Paciente(new String("36352671U"),1)) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("36352671U"),1),new Paciente(new String("79853112A"),6),new Paciente(new String("91511131H"),9) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new GetProximoPaciente(v_1).doCall().checkResult(new Paciente(new String("36352671U"),1)) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("36352671U"),1),new Paciente(new String("79853112A"),6),new Paciente(new String("91511131H"),9) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new GetProximoPaciente(v_1).doCall().checkResult(new Paciente(new String("36352671U"),1)) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("36352671U"),1),new Paciente(new String("79853112A"),6),new Paciente(new String("91511131H"),9) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1).doCall().checkResult(new Paciente(new String("36352671U"),1)) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("79853112A"),6),new Paciente(new String("91511131H"),9) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new GetPacientesPorOrdenDeLlegada(v_1).doCall().checkResult(new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("91511131H"),9),new Paciente(new String("79853112A"),6) })) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("79853112A"),6),new Paciente(new String("91511131H"),9) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new SalirPaciente(v_1,new String("91511131H")).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("79853112A"),6) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("81294486T"),new Integer(6)).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("79853112A"),6),new Paciente(new String("81294486T"),6) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1).doCall().checkResult(new Paciente(new String("79853112A"),6)) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("81294486T"),6) }),new Boolean(false)).doCall().checkResult(true) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
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
    ResultsHandler.add_result(new String("urgencias"),resultIs) ;
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
TestResult<Urgencias,Void> v_0 = null ;
Urgencias v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_42") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_42")) ;
if (ok_sofar)
{
  v_0 = new Constructor().doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("32545513W"),new Integer(6)).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("32545513W"),6) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("32545513W"),new Integer(6)).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("32545513W"),6) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new GetProximoPaciente(v_1).doCall().checkResult(new Paciente(new String("32545513W"),6)) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("32545513W"),6) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1).doCall().checkResult(new Paciente(new String("32545513W"),6)) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] {  }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("62619475Z"),new Integer(3)).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("62619475Z"),3) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1).doCall().checkResult(new Paciente(new String("62619475Z"),3)) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] {  }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("XXXXYYYYZZZZZ"),new Integer(1)).doCall().checkResult(new NoHayPacienteExc()) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] {  }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("XXXXYYYYZZZZZ"),new Integer(3)).doCall().checkResult(new NoHayPacienteExc()) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] {  }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("35826362R"),new Integer(2)).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("35826362R"),2) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new SalirPaciente(v_1,new String("35826362R")).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] {  }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1).doCall().checkResult(new NoHayPacienteExc()) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] {  }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new GetProximoPaciente(v_1).doCall().checkResult(new NoHayPacienteExc()) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] {  }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("31625469F"),new Integer(4)).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("31625469F"),4) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("92769562N"),new Integer(5)).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("31625469F"),4),new Paciente(new String("92769562N"),5) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new SalirPaciente(v_1,new String("92769562N")).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("31625469F"),4) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1).doCall().checkResult(new Paciente(new String("31625469F"),4)) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] {  }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("XXXXYYYYZZZZZ"),new Integer(6)).doCall().checkResult(new NoHayPacienteExc()) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] {  }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1).doCall().checkResult(new NoHayPacienteExc()) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] {  }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new GetProximoPaciente(v_1).doCall().checkResult(new NoHayPacienteExc()) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] {  }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("55611488E"),new Integer(3)).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("55611488E"),3) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1).doCall().checkResult(new Paciente(new String("55611488E"),3)) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] {  }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("XXXXYYYYZZZZZ"),new Integer(3)).doCall().checkResult(new NoHayPacienteExc()) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] {  }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new GetPacientesPorOrdenDeLlegada(v_1).doCall().checkResult(new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] {  })) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] {  }),new Boolean(false)).doCall().checkResult(true) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
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
    ResultsHandler.add_result(new String("urgencias"),resultIs) ;
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
TestResult<Urgencias,Void> v_0 = null ;
Urgencias v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_43") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_43")) ;
if (ok_sofar)
{
  v_0 = new Constructor().doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new GetPacientesPorOrdenDeLlegada(v_1).doCall().checkResult(new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] {  })) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] {  }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("36239934F"),new Integer(1)).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("36239934F"),1) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("36239934F"),new Integer(3)).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("36239934F"),3) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new SalirPaciente(v_1,new String("36239934F")).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] {  }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("34911617Z"),new Integer(4)).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("34911617Z"),4) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new GetProximoPaciente(v_1).doCall().checkResult(new Paciente(new String("34911617Z"),4)) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("34911617Z"),4) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("52687996L"),new Integer(9)).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("34911617Z"),4),new Paciente(new String("52687996L"),9) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new SalirPaciente(v_1,new String("34911617Z")).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("52687996L"),9) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new GetProximoPaciente(v_1).doCall().checkResult(new Paciente(new String("52687996L"),9)) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("52687996L"),9) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new GetProximoPaciente(v_1).doCall().checkResult(new Paciente(new String("52687996L"),9)) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("52687996L"),9) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("48569676E"),new Integer(2)).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("48569676E"),2),new Paciente(new String("52687996L"),9) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new GetPacientesPorOrdenDeLlegada(v_1).doCall().checkResult(new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("52687996L"),9),new Paciente(new String("48569676E"),2) })) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("48569676E"),2),new Paciente(new String("52687996L"),9) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1).doCall().checkResult(new Paciente(new String("48569676E"),2)) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("52687996L"),9) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new SalirPaciente(v_1,new String("52687996L")).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] {  }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("54478147Y"),new Integer(7)).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("54478147Y"),7) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1).doCall().checkResult(new Paciente(new String("54478147Y"),7)) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] {  }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1).doCall().checkResult(new NoHayPacienteExc()) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] {  }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("32739719D"),new Integer(3)).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("32739719D"),3) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new GetProximoPaciente(v_1).doCall().checkResult(new Paciente(new String("32739719D"),3)) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("32739719D"),3) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("79727916Q"),new Integer(8)).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("32739719D"),3),new Paciente(new String("79727916Q"),8) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new GetProximoPaciente(v_1).doCall().checkResult(new Paciente(new String("32739719D"),3)) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("32739719D"),3),new Paciente(new String("79727916Q"),8) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new SalirPaciente(v_1,new String("79727916Q")).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("32739719D"),3) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new SalirPaciente(v_1,new String("32739719D")).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] {  }),new Boolean(false)).doCall().checkResult(true) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
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
    ResultsHandler.add_result(new String("urgencias"),resultIs) ;
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
TestResult<Urgencias,Void> v_0 = null ;
Urgencias v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_44") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_44")) ;
if (ok_sofar)
{
  v_0 = new Constructor().doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new SalirPaciente(v_1,new String("XXXXYYYYZZZZZ")).doCall().checkResult(new NoHayPacienteExc()) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] {  }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("75583447U"),new Integer(5)).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("75583447U"),5) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("75583447U"),new Integer(4)).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("75583447U"),4) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1).doCall().checkResult(new Paciente(new String("75583447U"),4)) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] {  }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("97738122L"),new Integer(6)).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("97738122L"),6) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("33892178H"),new Integer(5)).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("33892178H"),5),new Paciente(new String("97738122L"),6) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new SalirPaciente(v_1,new String("97738122L")).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("33892178H"),5) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new GetProximoPaciente(v_1).doCall().checkResult(new Paciente(new String("33892178H"),5)) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("33892178H"),5) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("33892178H"),new Integer(4)).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("33892178H"),4) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new GetProximoPaciente(v_1).doCall().checkResult(new Paciente(new String("33892178H"),4)) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("33892178H"),4) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1).doCall().checkResult(new Paciente(new String("33892178H"),4)) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] {  }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1).doCall().checkResult(new NoHayPacienteExc()) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] {  }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("13415376N"),new Integer(8)).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("13415376N"),8) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new GetPacientesPorOrdenDeLlegada(v_1).doCall().checkResult(new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("13415376N"),8) })) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("13415376N"),8) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("16156594J"),new Integer(6)).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("16156594J"),6),new Paciente(new String("13415376N"),8) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("13415376N"),new Integer(8)).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("16156594J"),6),new Paciente(new String("13415376N"),8) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("13415376N"),new Integer(10)).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("16156594J"),6),new Paciente(new String("13415376N"),10) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1).doCall().checkResult(new Paciente(new String("16156594J"),6)) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("13415376N"),10) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1).doCall().checkResult(new Paciente(new String("13415376N"),10)) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] {  }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("38197447W"),new Integer(3)).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("38197447W"),3) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("38197447W"),new Integer(4)).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("38197447W"),4) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new GetProximoPaciente(v_1).doCall().checkResult(new Paciente(new String("38197447W"),4)) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("38197447W"),4) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("65681513O"),new Integer(3)).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("65681513O"),3),new Paciente(new String("38197447W"),4) }),new Boolean(false)).doCall().checkResult(true) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
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
    ResultsHandler.add_result(new String("urgencias"),resultIs) ;
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
TestResult<Urgencias,Void> v_0 = null ;
Urgencias v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_45") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_45")) ;
if (ok_sofar)
{
  v_0 = new Constructor().doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("33872147O"),new Integer(3)).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("33872147O"),3) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("79456991H"),new Integer(1)).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("79456991H"),1),new Paciente(new String("33872147O"),3) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new SalirPaciente(v_1,new String("33872147O")).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("79456991H"),1) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1).doCall().checkResult(new Paciente(new String("79456991H"),1)) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] {  }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("82521813L"),new Integer(7)).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("82521813L"),7) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("55283714F"),new Integer(9)).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("82521813L"),7),new Paciente(new String("55283714F"),9) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1).doCall().checkResult(new Paciente(new String("82521813L"),7)) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("55283714F"),9) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new GetProximoPaciente(v_1).doCall().checkResult(new Paciente(new String("55283714F"),9)) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("55283714F"),9) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1).doCall().checkResult(new Paciente(new String("55283714F"),9)) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] {  }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("54996551B"),new Integer(2)).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("54996551B"),2) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("54996551B"),new Integer(2)).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("54996551B"),2) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new SalirPaciente(v_1,new String("54996551B")).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] {  }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1).doCall().checkResult(new NoHayPacienteExc()) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] {  }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("71435977G"),new Integer(8)).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("71435977G"),8) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new SalirPaciente(v_1,new String("71435977G")).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] {  }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("23225785N"),new Integer(7)).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("23225785N"),7) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new SalirPaciente(v_1,new String("23225785N")).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] {  }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("24312712J"),new Integer(10)).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("24312712J"),10) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1).doCall().checkResult(new Paciente(new String("24312712J"),10)) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] {  }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("38424764L"),new Integer(10)).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("38424764L"),10) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("17895377Y"),new Integer(4)).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("17895377Y"),4),new Paciente(new String("38424764L"),10) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1).doCall().checkResult(new Paciente(new String("17895377Y"),4)) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("38424764L"),10) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1).doCall().checkResult(new Paciente(new String("38424764L"),10)) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] {  }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("36384775T"),new Integer(10)).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("36384775T"),10) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1).doCall().checkResult(new Paciente(new String("36384775T"),10)) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] {  }),new Boolean(false)).doCall().checkResult(true) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
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
    ResultsHandler.add_result(new String("urgencias"),resultIs) ;
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
TestResult<Urgencias,Void> v_0 = null ;
Urgencias v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_46") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_46")) ;
if (ok_sofar)
{
  v_0 = new Constructor().doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("35974293R"),new Integer(5)).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("35974293R"),5) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1).doCall().checkResult(new Paciente(new String("35974293R"),5)) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] {  }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("16277959K"),new Integer(6)).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("16277959K"),6) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1).doCall().checkResult(new Paciente(new String("16277959K"),6)) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] {  }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1).doCall().checkResult(new NoHayPacienteExc()) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] {  }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1).doCall().checkResult(new NoHayPacienteExc()) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] {  }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new GetPacientesPorOrdenDeLlegada(v_1).doCall().checkResult(new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] {  })) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] {  }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("XXXXYYYYZZZZZ"),new Integer(5)).doCall().checkResult(new NoHayPacienteExc()) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] {  }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("58184248Y"),new Integer(10)).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("58184248Y"),10) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("28378231T"),new Integer(9)).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("28378231T"),9),new Paciente(new String("58184248Y"),10) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new SalirPaciente(v_1,new String("28378231T")).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("58184248Y"),10) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("58184248Y"),new Integer(8)).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("58184248Y"),8) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new GetProximoPaciente(v_1).doCall().checkResult(new Paciente(new String("58184248Y"),8)) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("58184248Y"),8) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1).doCall().checkResult(new Paciente(new String("58184248Y"),8)) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] {  }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("XXXXYYYYZZZZZ"),new Integer(9)).doCall().checkResult(new NoHayPacienteExc()) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] {  }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("37173434R"),new Integer(8)).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("37173434R"),8) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1).doCall().checkResult(new Paciente(new String("37173434R"),8)) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] {  }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("39779793V"),new Integer(10)).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("39779793V"),10) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("17227974V"),new Integer(3)).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("17227974V"),3),new Paciente(new String("39779793V"),10) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("99616531R"),new Integer(4)).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("17227974V"),3),new Paciente(new String("99616531R"),4),new Paciente(new String("39779793V"),10) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("88937917J"),new Integer(2)).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("88937917J"),2),new Paciente(new String("17227974V"),3),new Paciente(new String("99616531R"),4),new Paciente(new String("39779793V"),10) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("25121123Q"),new Integer(1)).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("25121123Q"),1),new Paciente(new String("88937917J"),2),new Paciente(new String("17227974V"),3),new Paciente(new String("99616531R"),4),new Paciente(new String("39779793V"),10) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("71325222J"),new Integer(6)).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("25121123Q"),1),new Paciente(new String("88937917J"),2),new Paciente(new String("17227974V"),3),new Paciente(new String("99616531R"),4),new Paciente(new String("71325222J"),6),new Paciente(new String("39779793V"),10) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new SalirPaciente(v_1,new String("25121123Q")).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("88937917J"),2),new Paciente(new String("17227974V"),3),new Paciente(new String("99616531R"),4),new Paciente(new String("71325222J"),6),new Paciente(new String("39779793V"),10) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new GetProximoPaciente(v_1).doCall().checkResult(new Paciente(new String("88937917J"),2)) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("88937917J"),2),new Paciente(new String("17227974V"),3),new Paciente(new String("99616531R"),4),new Paciente(new String("71325222J"),6),new Paciente(new String("39779793V"),10) }),new Boolean(false)).doCall().checkResult(true) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
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
    ResultsHandler.add_result(new String("urgencias"),resultIs) ;
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
TestResult<Urgencias,Void> v_0 = null ;
Urgencias v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_47") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_47")) ;
if (ok_sofar)
{
  v_0 = new Constructor().doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("37241717G"),new Integer(7)).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("37241717G"),7) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("65435196M"),new Integer(8)).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("37241717G"),7),new Paciente(new String("65435196M"),8) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new GetProximoPaciente(v_1).doCall().checkResult(new Paciente(new String("37241717G"),7)) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("37241717G"),7),new Paciente(new String("65435196M"),8) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("59745619B"),new Integer(2)).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("59745619B"),2),new Paciente(new String("37241717G"),7),new Paciente(new String("65435196M"),8) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1).doCall().checkResult(new Paciente(new String("59745619B"),2)) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("37241717G"),7),new Paciente(new String("65435196M"),8) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("13659273D"),new Integer(6)).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("13659273D"),6),new Paciente(new String("37241717G"),7),new Paciente(new String("65435196M"),8) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("37241717G"),new Integer(6)).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("13659273D"),6),new Paciente(new String("37241717G"),6),new Paciente(new String("65435196M"),8) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new GetProximoPaciente(v_1).doCall().checkResult(new Paciente(new String("13659273D"),6)) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("13659273D"),6),new Paciente(new String("37241717G"),6),new Paciente(new String("65435196M"),8) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1).doCall().checkResult(new Paciente(new String("13659273D"),6)) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("37241717G"),6),new Paciente(new String("65435196M"),8) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("37241717G"),new Integer(7)).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("37241717G"),7),new Paciente(new String("65435196M"),8) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("83598133L"),new Integer(8)).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("37241717G"),7),new Paciente(new String("65435196M"),8),new Paciente(new String("83598133L"),8) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1).doCall().checkResult(new Paciente(new String("37241717G"),7)) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("65435196M"),8),new Paciente(new String("83598133L"),8) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("57543155R"),new Integer(4)).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("57543155R"),4),new Paciente(new String("65435196M"),8),new Paciente(new String("83598133L"),8) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("27133429E"),new Integer(2)).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("27133429E"),2),new Paciente(new String("57543155R"),4),new Paciente(new String("65435196M"),8),new Paciente(new String("83598133L"),8) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new GetProximoPaciente(v_1).doCall().checkResult(new Paciente(new String("27133429E"),2)) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("27133429E"),2),new Paciente(new String("57543155R"),4),new Paciente(new String("65435196M"),8),new Paciente(new String("83598133L"),8) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new SalirPaciente(v_1,new String("27133429E")).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("57543155R"),4),new Paciente(new String("65435196M"),8),new Paciente(new String("83598133L"),8) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1).doCall().checkResult(new Paciente(new String("57543155R"),4)) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("65435196M"),8),new Paciente(new String("83598133L"),8) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("34287562J"),new Integer(3)).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("34287562J"),3),new Paciente(new String("65435196M"),8),new Paciente(new String("83598133L"),8) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new GetProximoPaciente(v_1).doCall().checkResult(new Paciente(new String("34287562J"),3)) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("34287562J"),3),new Paciente(new String("65435196M"),8),new Paciente(new String("83598133L"),8) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("34287562J"),new Integer(3)).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("34287562J"),3),new Paciente(new String("65435196M"),8),new Paciente(new String("83598133L"),8) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("12944919O"),new Integer(1)).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("12944919O"),1),new Paciente(new String("34287562J"),3),new Paciente(new String("65435196M"),8),new Paciente(new String("83598133L"),8) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("17752997L"),new Integer(8)).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("12944919O"),1),new Paciente(new String("34287562J"),3),new Paciente(new String("65435196M"),8),new Paciente(new String("83598133L"),8),new Paciente(new String("17752997L"),8) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1).doCall().checkResult(new Paciente(new String("12944919O"),1)) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("34287562J"),3),new Paciente(new String("65435196M"),8),new Paciente(new String("83598133L"),8),new Paciente(new String("17752997L"),8) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("51978123Y"),new Integer(3)).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("34287562J"),3),new Paciente(new String("51978123Y"),3),new Paciente(new String("65435196M"),8),new Paciente(new String("83598133L"),8),new Paciente(new String("17752997L"),8) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("88748136B"),new Integer(6)).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("34287562J"),3),new Paciente(new String("51978123Y"),3),new Paciente(new String("88748136B"),6),new Paciente(new String("65435196M"),8),new Paciente(new String("83598133L"),8),new Paciente(new String("17752997L"),8) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1).doCall().checkResult(new Paciente(new String("34287562J"),3)) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("51978123Y"),3),new Paciente(new String("88748136B"),6),new Paciente(new String("65435196M"),8),new Paciente(new String("83598133L"),8),new Paciente(new String("17752997L"),8) }),new Boolean(false)).doCall().checkResult(true) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
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
    ResultsHandler.add_result(new String("urgencias"),resultIs) ;
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
TestResult<Urgencias,Void> v_0 = null ;
Urgencias v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_48") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_48")) ;
if (ok_sofar)
{
  v_0 = new Constructor().doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("31495697V"),new Integer(8)).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("31495697V"),8) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new GetProximoPaciente(v_1).doCall().checkResult(new Paciente(new String("31495697V"),8)) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("31495697V"),8) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new GetProximoPaciente(v_1).doCall().checkResult(new Paciente(new String("31495697V"),8)) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("31495697V"),8) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("19564435G"),new Integer(9)).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("31495697V"),8),new Paciente(new String("19564435G"),9) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new SalirPaciente(v_1,new String("19564435G")).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("31495697V"),8) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1).doCall().checkResult(new Paciente(new String("31495697V"),8)) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] {  }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("45892198A"),new Integer(10)).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("45892198A"),10) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new SalirPaciente(v_1,new String("45892198A")).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] {  }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("35177512G"),new Integer(5)).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("35177512G"),5) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new GetProximoPaciente(v_1).doCall().checkResult(new Paciente(new String("35177512G"),5)) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("35177512G"),5) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1).doCall().checkResult(new Paciente(new String("35177512G"),5)) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] {  }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("25266728C"),new Integer(1)).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("25266728C"),1) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new GetProximoPaciente(v_1).doCall().checkResult(new Paciente(new String("25266728C"),1)) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("25266728C"),1) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new GetPacientesPorOrdenDeLlegada(v_1).doCall().checkResult(new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("25266728C"),1) })) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("25266728C"),1) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("25266728C"),new Integer(9)).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("25266728C"),9) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("53779728E"),new Integer(9)).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("25266728C"),9),new Paciente(new String("53779728E"),9) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1).doCall().checkResult(new Paciente(new String("25266728C"),9)) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("53779728E"),9) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new SalirPaciente(v_1,new String("53779728E")).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] {  }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("16954293E"),new Integer(4)).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("16954293E"),4) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new GetProximoPaciente(v_1).doCall().checkResult(new Paciente(new String("16954293E"),4)) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("16954293E"),4) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("68876997W"),new Integer(9)).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("16954293E"),4),new Paciente(new String("68876997W"),9) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("44752217H"),new Integer(3)).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("44752217H"),3),new Paciente(new String("16954293E"),4),new Paciente(new String("68876997W"),9) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1).doCall().checkResult(new Paciente(new String("44752217H"),3)) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("16954293E"),4),new Paciente(new String("68876997W"),9) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("16953432E"),new Integer(6)).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("16954293E"),4),new Paciente(new String("16953432E"),6),new Paciente(new String("68876997W"),9) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("16954293E"),new Integer(3)).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("16954293E"),3),new Paciente(new String("16953432E"),6),new Paciente(new String("68876997W"),9) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new GetProximoPaciente(v_1).doCall().checkResult(new Paciente(new String("16954293E"),3)) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("16954293E"),3),new Paciente(new String("16953432E"),6),new Paciente(new String("68876997W"),9) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("31618445B"),new Integer(6)).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("16954293E"),3),new Paciente(new String("16953432E"),6),new Paciente(new String("31618445B"),6),new Paciente(new String("68876997W"),9) }),new Boolean(false)).doCall().checkResult(true) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
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
    ResultsHandler.add_result(new String("urgencias"),resultIs) ;
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
TestResult<Urgencias,Void> v_0 = null ;
Urgencias v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_49") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_49")) ;
if (ok_sofar)
{
  v_0 = new Constructor().doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1).doCall().checkResult(new NoHayPacienteExc()) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] {  }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("32675138P"),new Integer(8)).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("32675138P"),8) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new GetPacientesPorOrdenDeLlegada(v_1).doCall().checkResult(new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("32675138P"),8) })) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("32675138P"),8) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1).doCall().checkResult(new Paciente(new String("32675138P"),8)) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] {  }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new GetPacientesPorOrdenDeLlegada(v_1).doCall().checkResult(new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] {  })) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] {  }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("72585533T"),new Integer(1)).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("72585533T"),1) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1).doCall().checkResult(new Paciente(new String("72585533T"),1)) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] {  }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("88547112F"),new Integer(10)).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("88547112F"),10) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new GetProximoPaciente(v_1).doCall().checkResult(new Paciente(new String("88547112F"),10)) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("88547112F"),10) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("88547112F"),new Integer(7)).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("88547112F"),7) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("74333883V"),new Integer(8)).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("88547112F"),7),new Paciente(new String("74333883V"),8) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new GetProximoPaciente(v_1).doCall().checkResult(new Paciente(new String("88547112F"),7)) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("88547112F"),7),new Paciente(new String("74333883V"),8) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new GetProximoPaciente(v_1).doCall().checkResult(new Paciente(new String("88547112F"),7)) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("88547112F"),7),new Paciente(new String("74333883V"),8) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("88547112F"),new Integer(2)).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("88547112F"),2),new Paciente(new String("74333883V"),8) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("88547112F"),new Integer(2)).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("88547112F"),2),new Paciente(new String("74333883V"),8) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("73133651J"),new Integer(8)).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("88547112F"),2),new Paciente(new String("74333883V"),8),new Paciente(new String("73133651J"),8) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new GetProximoPaciente(v_1).doCall().checkResult(new Paciente(new String("88547112F"),2)) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("88547112F"),2),new Paciente(new String("74333883V"),8),new Paciente(new String("73133651J"),8) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1).doCall().checkResult(new Paciente(new String("88547112F"),2)) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("74333883V"),8),new Paciente(new String("73133651J"),8) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1).doCall().checkResult(new Paciente(new String("74333883V"),8)) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("73133651J"),8) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new GetProximoPaciente(v_1).doCall().checkResult(new Paciente(new String("73133651J"),8)) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("73133651J"),8) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1).doCall().checkResult(new Paciente(new String("73133651J"),8)) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] {  }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new GetProximoPaciente(v_1).doCall().checkResult(new NoHayPacienteExc()) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] {  }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("23442853O"),new Integer(9)).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("23442853O"),9) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new GetProximoPaciente(v_1).doCall().checkResult(new Paciente(new String("23442853O"),9)) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("23442853O"),9) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("63587215A"),new Integer(2)).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("63587215A"),2),new Paciente(new String("23442853O"),9) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new GetProximoPaciente(v_1).doCall().checkResult(new Paciente(new String("63587215A"),2)) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("63587215A"),2),new Paciente(new String("23442853O"),9) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new GetPacientesPorOrdenDeLlegada(v_1).doCall().checkResult(new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("23442853O"),9),new Paciente(new String("63587215A"),2) })) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("63587215A"),2),new Paciente(new String("23442853O"),9) }),new Boolean(false)).doCall().checkResult(true) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
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
    ResultsHandler.add_result(new String("urgencias"),resultIs) ;
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
TestResult<Urgencias,Void> v_0 = null ;
Urgencias v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_50") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_50")) ;
if (ok_sofar)
{
  v_0 = new Constructor().doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("XXXXYYYYZZZZZ"),new Integer(5)).doCall().checkResult(new NoHayPacienteExc()) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] {  }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("19595457V"),new Integer(6)).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("19595457V"),6) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("23572871Z"),new Integer(8)).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("19595457V"),6),new Paciente(new String("23572871Z"),8) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new GetProximoPaciente(v_1).doCall().checkResult(new Paciente(new String("19595457V"),6)) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("19595457V"),6),new Paciente(new String("23572871Z"),8) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1).doCall().checkResult(new Paciente(new String("19595457V"),6)) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("23572871Z"),8) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1).doCall().checkResult(new Paciente(new String("23572871Z"),8)) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] {  }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("71635397N"),new Integer(1)).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("71635397N"),1) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("59572787X"),new Integer(5)).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("71635397N"),1),new Paciente(new String("59572787X"),5) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1).doCall().checkResult(new Paciente(new String("71635397N"),1)) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("59572787X"),5) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new SalirPaciente(v_1,new String("59572787X")).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] {  }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("17346227C"),new Integer(2)).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("17346227C"),2) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1).doCall().checkResult(new Paciente(new String("17346227C"),2)) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] {  }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("85768489M"),new Integer(10)).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("85768489M"),10) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1).doCall().checkResult(new Paciente(new String("85768489M"),10)) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] {  }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("22725676O"),new Integer(3)).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("22725676O"),3) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("23716467H"),new Integer(4)).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("22725676O"),3),new Paciente(new String("23716467H"),4) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("22725676O"),new Integer(3)).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("22725676O"),3),new Paciente(new String("23716467H"),4) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("62696756H"),new Integer(10)).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("22725676O"),3),new Paciente(new String("23716467H"),4),new Paciente(new String("62696756H"),10) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("58164454X"),new Integer(2)).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("58164454X"),2),new Paciente(new String("22725676O"),3),new Paciente(new String("23716467H"),4),new Paciente(new String("62696756H"),10) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new SalirPaciente(v_1,new String("62696756H")).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("58164454X"),2),new Paciente(new String("22725676O"),3),new Paciente(new String("23716467H"),4) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("35786872Y"),new Integer(4)).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("58164454X"),2),new Paciente(new String("22725676O"),3),new Paciente(new String("23716467H"),4),new Paciente(new String("35786872Y"),4) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("23716467H"),new Integer(1)).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("23716467H"),1),new Paciente(new String("58164454X"),2),new Paciente(new String("22725676O"),3),new Paciente(new String("35786872Y"),4) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("35786872Y"),new Integer(4)).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("23716467H"),1),new Paciente(new String("58164454X"),2),new Paciente(new String("22725676O"),3),new Paciente(new String("35786872Y"),4) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1).doCall().checkResult(new Paciente(new String("23716467H"),1)) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("58164454X"),2),new Paciente(new String("22725676O"),3),new Paciente(new String("35786872Y"),4) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("53633152P"),new Integer(9)).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("58164454X"),2),new Paciente(new String("22725676O"),3),new Paciente(new String("35786872Y"),4),new Paciente(new String("53633152P"),9) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("96188691S"),new Integer(7)).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("58164454X"),2),new Paciente(new String("22725676O"),3),new Paciente(new String("35786872Y"),4),new Paciente(new String("96188691S"),7),new Paciente(new String("53633152P"),9) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new GetProximoPaciente(v_1).doCall().checkResult(new Paciente(new String("58164454X"),2)) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("58164454X"),2),new Paciente(new String("22725676O"),3),new Paciente(new String("35786872Y"),4),new Paciente(new String("96188691S"),7),new Paciente(new String("53633152P"),9) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1).doCall().checkResult(new Paciente(new String("58164454X"),2)) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("22725676O"),3),new Paciente(new String("35786872Y"),4),new Paciente(new String("96188691S"),7),new Paciente(new String("53633152P"),9) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("28642837Q"),new Integer(5)).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("22725676O"),3),new Paciente(new String("35786872Y"),4),new Paciente(new String("28642837Q"),5),new Paciente(new String("96188691S"),7),new Paciente(new String("53633152P"),9) }),new Boolean(false)).doCall().checkResult(true) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
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
    ResultsHandler.add_result(new String("urgencias"),resultIs) ;
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
TestResult<Urgencias,Void> v_0 = null ;
Urgencias v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_51") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_51")) ;
if (ok_sofar)
{
  v_0 = new Constructor().doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("91853347N"),new Integer(2)).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("91853347N"),2) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new SalirPaciente(v_1,new String("91853347N")).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] {  }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("XXXXYYYYZZZZZ"),new Integer(3)).doCall().checkResult(new NoHayPacienteExc()) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] {  }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("24487457F"),new Integer(3)).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("24487457F"),3) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("75657419M"),new Integer(3)).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("24487457F"),3),new Paciente(new String("75657419M"),3) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new GetProximoPaciente(v_1).doCall().checkResult(new Paciente(new String("24487457F"),3)) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("24487457F"),3),new Paciente(new String("75657419M"),3) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("43511731M"),new Integer(5)).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("24487457F"),3),new Paciente(new String("75657419M"),3),new Paciente(new String("43511731M"),5) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new GetProximoPaciente(v_1).doCall().checkResult(new Paciente(new String("24487457F"),3)) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("24487457F"),3),new Paciente(new String("75657419M"),3),new Paciente(new String("43511731M"),5) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1).doCall().checkResult(new Paciente(new String("24487457F"),3)) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("75657419M"),3),new Paciente(new String("43511731M"),5) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new GetPacientesPorOrdenDeLlegada(v_1).doCall().checkResult(new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("75657419M"),3),new Paciente(new String("43511731M"),5) })) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("75657419M"),3),new Paciente(new String("43511731M"),5) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("75657419M"),new Integer(5)).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("43511731M"),5),new Paciente(new String("75657419M"),5) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1).doCall().checkResult(new Paciente(new String("43511731M"),5)) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("75657419M"),5) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1).doCall().checkResult(new Paciente(new String("75657419M"),5)) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] {  }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new GetProximoPaciente(v_1).doCall().checkResult(new NoHayPacienteExc()) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] {  }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("72452649U"),new Integer(10)).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("72452649U"),10) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new GetPacientesPorOrdenDeLlegada(v_1).doCall().checkResult(new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("72452649U"),10) })) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("72452649U"),10) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new SalirPaciente(v_1,new String("72452649U")).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] {  }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new GetProximoPaciente(v_1).doCall().checkResult(new NoHayPacienteExc()) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] {  }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("XXXXYYYYZZZZZ"),new Integer(3)).doCall().checkResult(new NoHayPacienteExc()) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] {  }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new SalirPaciente(v_1,new String("XXXXYYYYZZZZZ")).doCall().checkResult(new NoHayPacienteExc()) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] {  }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("77652198R"),new Integer(1)).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("77652198R"),1) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new SalirPaciente(v_1,new String("77652198R")).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] {  }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("66728322Q"),new Integer(2)).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("66728322Q"),2) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("66728322Q"),new Integer(6)).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("66728322Q"),6) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("66728322Q"),new Integer(5)).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("66728322Q"),5) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1).doCall().checkResult(new Paciente(new String("66728322Q"),5)) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] {  }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("87695424D"),new Integer(3)).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("87695424D"),3) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new SalirPaciente(v_1,new String("87695424D")).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] {  }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("76982657D"),new Integer(6)).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("76982657D"),6) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("76982657D"),new Integer(2)).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("76982657D"),2) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1).doCall().checkResult(new Paciente(new String("76982657D"),2)) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] {  }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("46879771F"),new Integer(3)).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("46879771F"),3) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("24489218M"),new Integer(6)).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("46879771F"),3),new Paciente(new String("24489218M"),6) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1).doCall().checkResult(new Paciente(new String("46879771F"),3)) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("24489218M"),6) }),new Boolean(false)).doCall().checkResult(true) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
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
    ResultsHandler.add_result(new String("urgencias"),resultIs) ;
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
TestResult<Urgencias,Void> v_0 = null ;
Urgencias v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_52") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_52")) ;
if (ok_sofar)
{
  v_0 = new Constructor().doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("71828832R"),new Integer(2)).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("71828832R"),2) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new GetProximoPaciente(v_1).doCall().checkResult(new Paciente(new String("71828832R"),2)) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("71828832R"),2) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1).doCall().checkResult(new Paciente(new String("71828832R"),2)) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] {  }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1).doCall().checkResult(new NoHayPacienteExc()) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] {  }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("89435881U"),new Integer(3)).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("89435881U"),3) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1).doCall().checkResult(new Paciente(new String("89435881U"),3)) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] {  }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("12691193J"),new Integer(5)).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("12691193J"),5) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new SalirPaciente(v_1,new String("12691193J")).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] {  }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new GetProximoPaciente(v_1).doCall().checkResult(new NoHayPacienteExc()) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] {  }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new GetProximoPaciente(v_1).doCall().checkResult(new NoHayPacienteExc()) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] {  }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("56827473D"),new Integer(7)).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("56827473D"),7) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("25846845O"),new Integer(8)).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("56827473D"),7),new Paciente(new String("25846845O"),8) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new GetProximoPaciente(v_1).doCall().checkResult(new Paciente(new String("56827473D"),7)) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("56827473D"),7),new Paciente(new String("25846845O"),8) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new GetProximoPaciente(v_1).doCall().checkResult(new Paciente(new String("56827473D"),7)) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("56827473D"),7),new Paciente(new String("25846845O"),8) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new SalirPaciente(v_1,new String("25846845O")).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("56827473D"),7) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("56827473D"),new Integer(10)).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("56827473D"),10) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("61727942R"),new Integer(6)).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("61727942R"),6),new Paciente(new String("56827473D"),10) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1).doCall().checkResult(new Paciente(new String("61727942R"),6)) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("56827473D"),10) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("19678339T"),new Integer(8)).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("19678339T"),8),new Paciente(new String("56827473D"),10) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("XXXXYYYYZZZZZ"),new Integer(1)).doCall().checkResult(new NoHayPacienteExc()) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("19678339T"),8),new Paciente(new String("56827473D"),10) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new SalirPaciente(v_1,new String("56827473D")).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("19678339T"),8) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1).doCall().checkResult(new Paciente(new String("19678339T"),8)) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] {  }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("XXXXYYYYZZZZZ"),new Integer(5)).doCall().checkResult(new NoHayPacienteExc()) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] {  }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("XXXXYYYYZZZZZ"),new Integer(4)).doCall().checkResult(new NoHayPacienteExc()) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] {  }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new SalirPaciente(v_1,new String("XXXXYYYYZZZZZ")).doCall().checkResult(new NoHayPacienteExc()) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] {  }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("94443589L"),new Integer(7)).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("94443589L"),7) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new GetProximoPaciente(v_1).doCall().checkResult(new Paciente(new String("94443589L"),7)) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("94443589L"),7) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1).doCall().checkResult(new Paciente(new String("94443589L"),7)) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] {  }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new SalirPaciente(v_1,new String("XXXXYYYYZZZZZ")).doCall().checkResult(new NoHayPacienteExc()) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] {  }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("82654847E"),new Integer(2)).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("82654847E"),2) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new SalirPaciente(v_1,new String("82654847E")).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] {  }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new GetProximoPaciente(v_1).doCall().checkResult(new NoHayPacienteExc()) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] {  }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new SalirPaciente(v_1,new String("XXXXYYYYZZZZZ")).doCall().checkResult(new NoHayPacienteExc()) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] {  }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("XXXXYYYYZZZZZ"),new Integer(4)).doCall().checkResult(new NoHayPacienteExc()) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] {  }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1).doCall().checkResult(new NoHayPacienteExc()) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] {  }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("14386812P"),new Integer(6)).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("14386812P"),6) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1).doCall().checkResult(new Paciente(new String("14386812P"),6)) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] {  }),new Boolean(false)).doCall().checkResult(true) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
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
    ResultsHandler.add_result(new String("urgencias"),resultIs) ;
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
TestResult<Urgencias,Void> v_0 = null ;
Urgencias v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_53") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_53")) ;
if (ok_sofar)
{
  v_0 = new Constructor().doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("XXXXYYYYZZZZZ"),new Integer(7)).doCall().checkResult(new NoHayPacienteExc()) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] {  }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new GetProximoPaciente(v_1).doCall().checkResult(new NoHayPacienteExc()) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] {  }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("28929439B"),new Integer(7)).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("28929439B"),7) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new GetProximoPaciente(v_1).doCall().checkResult(new Paciente(new String("28929439B"),7)) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("28929439B"),7) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("77346997V"),new Integer(10)).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("28929439B"),7),new Paciente(new String("77346997V"),10) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("74784696T"),new Integer(3)).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("74784696T"),3),new Paciente(new String("28929439B"),7),new Paciente(new String("77346997V"),10) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1).doCall().checkResult(new Paciente(new String("74784696T"),3)) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("28929439B"),7),new Paciente(new String("77346997V"),10) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new GetProximoPaciente(v_1).doCall().checkResult(new Paciente(new String("28929439B"),7)) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("28929439B"),7),new Paciente(new String("77346997V"),10) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1).doCall().checkResult(new Paciente(new String("28929439B"),7)) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("77346997V"),10) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new GetProximoPaciente(v_1).doCall().checkResult(new Paciente(new String("77346997V"),10)) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("77346997V"),10) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1).doCall().checkResult(new Paciente(new String("77346997V"),10)) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] {  }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("19411924I"),new Integer(6)).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("19411924I"),6) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("78494932B"),new Integer(4)).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("78494932B"),4),new Paciente(new String("19411924I"),6) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("99949545Q"),new Integer(5)).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("78494932B"),4),new Paciente(new String("99949545Q"),5),new Paciente(new String("19411924I"),6) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new GetProximoPaciente(v_1).doCall().checkResult(new Paciente(new String("78494932B"),4)) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("78494932B"),4),new Paciente(new String("99949545Q"),5),new Paciente(new String("19411924I"),6) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("58974754X"),new Integer(6)).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("78494932B"),4),new Paciente(new String("99949545Q"),5),new Paciente(new String("19411924I"),6),new Paciente(new String("58974754X"),6) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new GetProximoPaciente(v_1).doCall().checkResult(new Paciente(new String("78494932B"),4)) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("78494932B"),4),new Paciente(new String("99949545Q"),5),new Paciente(new String("19411924I"),6),new Paciente(new String("58974754X"),6) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new SalirPaciente(v_1,new String("78494932B")).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("99949545Q"),5),new Paciente(new String("19411924I"),6),new Paciente(new String("58974754X"),6) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new GetProximoPaciente(v_1).doCall().checkResult(new Paciente(new String("99949545Q"),5)) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("99949545Q"),5),new Paciente(new String("19411924I"),6),new Paciente(new String("58974754X"),6) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("19411924I"),new Integer(1)).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("19411924I"),1),new Paciente(new String("99949545Q"),5),new Paciente(new String("58974754X"),6) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new SalirPaciente(v_1,new String("58974754X")).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("19411924I"),1),new Paciente(new String("99949545Q"),5) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("99949545Q"),new Integer(5)).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("19411924I"),1),new Paciente(new String("99949545Q"),5) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("98714642P"),new Integer(5)).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("19411924I"),1),new Paciente(new String("99949545Q"),5),new Paciente(new String("98714642P"),5) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new SalirPaciente(v_1,new String("99949545Q")).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("19411924I"),1),new Paciente(new String("98714642P"),5) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new GetProximoPaciente(v_1).doCall().checkResult(new Paciente(new String("19411924I"),1)) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("19411924I"),1),new Paciente(new String("98714642P"),5) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1).doCall().checkResult(new Paciente(new String("19411924I"),1)) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("98714642P"),5) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new GetProximoPaciente(v_1).doCall().checkResult(new Paciente(new String("98714642P"),5)) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("98714642P"),5) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("67841813D"),new Integer(6)).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("98714642P"),5),new Paciente(new String("67841813D"),6) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new GetProximoPaciente(v_1).doCall().checkResult(new Paciente(new String("98714642P"),5)) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("98714642P"),5),new Paciente(new String("67841813D"),6) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("29551793Y"),new Integer(5)).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("98714642P"),5),new Paciente(new String("29551793Y"),5),new Paciente(new String("67841813D"),6) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("29551793Y"),new Integer(1)).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("29551793Y"),1),new Paciente(new String("98714642P"),5),new Paciente(new String("67841813D"),6) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("XXXXYYYYZZZZZ"),new Integer(5)).doCall().checkResult(new NoHayPacienteExc()) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("29551793Y"),1),new Paciente(new String("98714642P"),5),new Paciente(new String("67841813D"),6) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("68253715U"),new Integer(7)).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("29551793Y"),1),new Paciente(new String("98714642P"),5),new Paciente(new String("67841813D"),6),new Paciente(new String("68253715U"),7) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new SalirPaciente(v_1,new String("67841813D")).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("29551793Y"),1),new Paciente(new String("98714642P"),5),new Paciente(new String("68253715U"),7) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1).doCall().checkResult(new Paciente(new String("29551793Y"),1)) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("98714642P"),5),new Paciente(new String("68253715U"),7) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1).doCall().checkResult(new Paciente(new String("98714642P"),5)) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("68253715U"),7) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("68253715U"),new Integer(10)).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("68253715U"),10) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new GetPacientesPorOrdenDeLlegada(v_1).doCall().checkResult(new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("68253715U"),10) })) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("68253715U"),10) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("68253715U"),new Integer(2)).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("68253715U"),2) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("44692115I"),new Integer(1)).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("44692115I"),1),new Paciente(new String("68253715U"),2) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new GetProximoPaciente(v_1).doCall().checkResult(new Paciente(new String("44692115I"),1)) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("44692115I"),1),new Paciente(new String("68253715U"),2) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1).doCall().checkResult(new Paciente(new String("44692115I"),1)) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("68253715U"),2) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("68253715U"),new Integer(8)).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("68253715U"),8) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("68253715U"),new Integer(7)).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("68253715U"),7) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1).doCall().checkResult(new Paciente(new String("68253715U"),7)) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] {  }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("29347159A"),new Integer(3)).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("29347159A"),3) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1).doCall().checkResult(new Paciente(new String("29347159A"),3)) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] {  }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("46379976U"),new Integer(7)).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("46379976U"),7) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("46379976U"),new Integer(6)).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("46379976U"),6) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1).doCall().checkResult(new Paciente(new String("46379976U"),6)) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] {  }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1).doCall().checkResult(new NoHayPacienteExc()) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] {  }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("38282958I"),new Integer(4)).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("38282958I"),4) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("13736395B"),new Integer(8)).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("38282958I"),4),new Paciente(new String("13736395B"),8) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("13736395B"),new Integer(1)).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("13736395B"),1),new Paciente(new String("38282958I"),4) }),new Boolean(false)).doCall().checkResult(true) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
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
    ResultsHandler.add_result(new String("urgencias"),resultIs) ;
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
TestResult<Urgencias,Void> v_0 = null ;
Urgencias v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_54") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_54")) ;
if (ok_sofar)
{
  v_0 = new Constructor().doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("17613631O"),new Integer(5)).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("17613631O"),5) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("17613631O"),new Integer(5)).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("17613631O"),5) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("42115877B"),new Integer(6)).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("17613631O"),5),new Paciente(new String("42115877B"),6) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("17613631O"),new Integer(5)).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("17613631O"),5),new Paciente(new String("42115877B"),6) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1).doCall().checkResult(new Paciente(new String("17613631O"),5)) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("42115877B"),6) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("93982786A"),new Integer(10)).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("42115877B"),6),new Paciente(new String("93982786A"),10) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new GetProximoPaciente(v_1).doCall().checkResult(new Paciente(new String("42115877B"),6)) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("42115877B"),6),new Paciente(new String("93982786A"),10) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1).doCall().checkResult(new Paciente(new String("42115877B"),6)) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("93982786A"),10) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new SalirPaciente(v_1,new String("93982786A")).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] {  }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("XXXXYYYYZZZZZ"),new Integer(4)).doCall().checkResult(new NoHayPacienteExc()) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] {  }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("31878713V"),new Integer(5)).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("31878713V"),5) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("97736315L"),new Integer(2)).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("97736315L"),2),new Paciente(new String("31878713V"),5) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1).doCall().checkResult(new Paciente(new String("97736315L"),2)) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("31878713V"),5) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new SalirPaciente(v_1,new String("31878713V")).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] {  }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new SalirPaciente(v_1,new String("XXXXYYYYZZZZZ")).doCall().checkResult(new NoHayPacienteExc()) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] {  }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new GetPacientesPorOrdenDeLlegada(v_1).doCall().checkResult(new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] {  })) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] {  }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1).doCall().checkResult(new NoHayPacienteExc()) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] {  }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1).doCall().checkResult(new NoHayPacienteExc()) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] {  }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("14962985E"),new Integer(4)).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("14962985E"),4) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("14962985E"),new Integer(10)).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("14962985E"),10) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new SalirPaciente(v_1,new String("14962985E")).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] {  }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("39348981M"),new Integer(7)).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("39348981M"),7) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1).doCall().checkResult(new Paciente(new String("39348981M"),7)) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] {  }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("86215479O"),new Integer(2)).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("86215479O"),2) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new GetProximoPaciente(v_1).doCall().checkResult(new Paciente(new String("86215479O"),2)) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("86215479O"),2) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new GetProximoPaciente(v_1).doCall().checkResult(new Paciente(new String("86215479O"),2)) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("86215479O"),2) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1).doCall().checkResult(new Paciente(new String("86215479O"),2)) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] {  }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("66746655D"),new Integer(6)).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("66746655D"),6) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("42841249E"),new Integer(8)).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("66746655D"),6),new Paciente(new String("42841249E"),8) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1).doCall().checkResult(new Paciente(new String("66746655D"),6)) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("42841249E"),8) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1).doCall().checkResult(new Paciente(new String("42841249E"),8)) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] {  }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new SalirPaciente(v_1,new String("XXXXYYYYZZZZZ")).doCall().checkResult(new NoHayPacienteExc()) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] {  }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("89217292F"),new Integer(8)).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("89217292F"),8) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1).doCall().checkResult(new Paciente(new String("89217292F"),8)) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] {  }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new SalirPaciente(v_1,new String("XXXXYYYYZZZZZ")).doCall().checkResult(new NoHayPacienteExc()) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] {  }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new SalirPaciente(v_1,new String("XXXXYYYYZZZZZ")).doCall().checkResult(new NoHayPacienteExc()) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] {  }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("73777857P"),new Integer(1)).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("73777857P"),1) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("73777857P"),new Integer(2)).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("73777857P"),2) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("73777857P"),new Integer(3)).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("73777857P"),3) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new SalirPaciente(v_1,new String("73777857P")).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] {  }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new SalirPaciente(v_1,new String("XXXXYYYYZZZZZ")).doCall().checkResult(new NoHayPacienteExc()) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] {  }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new SalirPaciente(v_1,new String("XXXXYYYYZZZZZ")).doCall().checkResult(new NoHayPacienteExc()) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] {  }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new SalirPaciente(v_1,new String("XXXXYYYYZZZZZ")).doCall().checkResult(new NoHayPacienteExc()) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] {  }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("88745965R"),new Integer(2)).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("88745965R"),2) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("88745965R"),new Integer(6)).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("88745965R"),6) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1).doCall().checkResult(new Paciente(new String("88745965R"),6)) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] {  }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("98369628Z"),new Integer(8)).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("98369628Z"),8) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1).doCall().checkResult(new Paciente(new String("98369628Z"),8)) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] {  }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("68983911W"),new Integer(3)).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("68983911W"),3) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new SalirPaciente(v_1,new String("68983911W")).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] {  }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new GetProximoPaciente(v_1).doCall().checkResult(new NoHayPacienteExc()) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] {  }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("98575322G"),new Integer(1)).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("98575322G"),1) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new GetProximoPaciente(v_1).doCall().checkResult(new Paciente(new String("98575322G"),1)) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("98575322G"),1) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1).doCall().checkResult(new Paciente(new String("98575322G"),1)) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] {  }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new GetPacientesPorOrdenDeLlegada(v_1).doCall().checkResult(new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] {  })) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] {  }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("52119981I"),new Integer(8)).doCall().checkResult(null) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] { new Paciente(new String("52119981I"),8) }),new Boolean(false)).doCall().checkResult(true) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1).doCall().checkResult(new Paciente(new String("52119981I"),8)) ;
if (ok_sofar)
  if (ok_sofar)
    ok_sofar = new ColaOk(v_1,new es.upm.aedlib.positionlist.NodePositionList<Paciente>(new Paciente[] {  }),new Boolean(false)).doCall().checkResult(true) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
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
    ResultsHandler.add_result(new String("urgencias"),resultIs) ;
    System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  


static class Tests {
  static String tester = "TesterLab6";
}





static class UrgenciasUtils {
  static HashMap<Object,String> urgenciasNames = null;
  static Integer nameCounter = 0;

  public static void resetPrinter() {
    urgenciasNames = null;
    nameCounter = 0;
  }

  public static String printer(Object obj) {
    if (obj instanceof Urgencias) {
      if (urgenciasNames == null)
        urgenciasNames = new HashMap<Object,String>();
      String name = urgenciasNames.get(obj);
      if (name == null) {
        name = "urgencias_"+nameCounter.toString();
        urgenciasNames.put(obj,name);
        nameCounter++;
      }
      return name;
    } else return TestUtils.printer(obj, x -> printer(x));
  }

  static boolean correctPaciente
    (TestCall<Paciente,Object> call,
     TestResult<Paciente,Object> result,
     Object expected) {

    Paciente resultPaciente = result.getValue();
    Paciente expectedPaciente = (Paciente) expected;

    if (!eqPacientes(resultPaciente,expectedPaciente)) {
          TestUtils.printError
            (TestUtils.ExecutionTime.LAST,
             "\nthe call\n  "+call.toString()+
             "\n\nreturned a paciente\n  with DNI "+resultPaciente.getDNI()+
             " and priority "+resultPaciente.getPrioridad()+
             " but the DNI should be "+expectedPaciente.getDNI()+
             " and the priority "+expectedPaciente.getPrioridad());
          return false;
    } else return true;
  }

  public static boolean colaOk(Urgencias urgencias, NodePositionList<Paciente> cola, Boolean executedAumentarPrioridad) {
    if (executedAumentarPrioridad)
      return true;

    PriorityQueue<Paciente,?> pq = null;

    try {
      Field colaField;
      colaField = urgencias.getClass().getDeclaredField("cola");
      colaField.setAccessible(true);
      pq = (PriorityQueue<Paciente,?>) colaField.get(urgencias);
    } catch ( Throwable exc ) {
      TestUtils.printCallException
        (TestUtils.ExecutionTime.LAST,
         "cannot access the field cola: ",
         exc);
      return true;
    }

    PriorityQueue<Paciente,Paciente> implCola =
      new SortedListPriorityQueue<Paciente,Paciente>(new PrioridadComparator());
    PriorityQueue<Paciente,Paciente> printCola =
      new SortedListPriorityQueue<Paciente,Paciente>(new PrioridadComparator());
    for (Entry<Paciente,?> ent : pq) {
      implCola.enqueue(ent.getKey(),null);
      printCola.enqueue(ent.getKey(),null);
    }

    boolean equals = true;
    equals = equals && (implCola.size() == cola.size());
    Position<Paciente> cursorCola = cola.first();
    while (cursorCola != null && equals) {
      Paciente impPaciente = implCola.dequeue().getKey();
      Paciente paciente = cursorCola.element();
      equals =
        equals
        && (paciente == null ? impPaciente == null : eqPacientes(impPaciente,paciente));
      cursorCola = cola.next(cursorCola);
    }

    if (!equals) {
        TestUtils.printError
          (TestUtils.ExecutionTime.AFTER,
           "the Urgencia cola has the entries (in order):\n  "+printCola+
           "\n\nwhich has keys (forgetting time) not equal to the expected list of keys:\n  "+cola);
    }
    return equals;
  }

  static boolean eqPacientes(Paciente impP, Paciente expP) {
    return 
      (expP.getDNI().equals(impP.getDNI()) &&
       expP.getPrioridad() == impP.getPrioridad());
  }

  static boolean pacientesEnOrden
    (TestCall<Iterable<Paciente>,NodePositionList<Paciente>> call,
     TestResult<Iterable<Paciente>,NodePositionList<Paciente>> result,
     NodePositionList<Paciente> expected) {

    Iterable<Paciente> resultPacientes = result.getValue();
    int resultSize = 0;
    for (Paciente p : resultPacientes)
      ++resultSize;

    boolean equals = true;

    equals = equals && resultSize == expected.size();

    Position<Paciente> cursor = expected.first();

    for (Paciente p : resultPacientes) {
      equals = equals && eqPacientes(p,cursor.element());
      if (!equals) break;
      cursor = expected.next(cursor);
    }

    if (!equals) {
        TestUtils.printError
          (TestUtils.ExecutionTime.AFTER,
           "the call "+call+" returned an iterable with the patients (in order):\n  "+resultPacientes+
           "\n\nwhich has keys (forgetting time) not equal to the expected list of keys:\n  "+expected);
    }
    
    return equals;
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


static class GetPacientesPorOrdenDeLlegada extends TestCall<Iterable<Paciente>,es.upm.aedlib.positionlist.NodePositionList<Paciente>>
{
  Urgencias urgencias;
  
  public GetPacientesPorOrdenDeLlegada (Urgencias urgencias)
  {
    this.urgencias = urgencias ;
  }
  
  public String toString () 
  {
    StringBuilder output = new StringBuilder() ;
    output.append(TesterCode.printer(urgencias)) ;
    output.append(new String(".getPacientesPorOrdenDeLlegada")) ;
    output.append(new String("(")) ;
    output.append(new String(")")) ;
    return output.toString() ;
  }
  
  public Iterable<Paciente> call () 
  {
    return urgencias.getPacientesPorOrdenDeLlegada() ;
  }
  
  public boolean checkResult (es.upm.aedlib.positionlist.NodePositionList<Paciente> expected) 
  {
    if (!noException())
      return false ;
    if (!nonNull())
      return false ;
    if (!UrgenciasUtils.pacientesEnOrden(this,result,expected))
      return false ;
    return true ;
  }
  
}


static class Constructor extends TestCall<Urgencias,Void>
{
  
  public Constructor ()
  {
  }
  
  public String toString () 
  {
    StringBuilder output = new StringBuilder() ;
    output.append(new String("new Urgencias")) ;
    output.append(new String("(")) ;
    output.append(new String(")")) ;
    return output.toString() ;
  }
  
  public Urgencias call () 
  {
    return new UrgenciasAED() ;
  }
  
  public boolean checkResult (Void expected) 
  {
    if (!noException())
      return false ;
    return true ;
  }
  
}


static class CambiarPrioridad extends TestCall<Void,Object>
{
  Urgencias urgencias;
  String dNI;
  Integer prioridad;
  
  public CambiarPrioridad (Urgencias urgencias,String dNI,Integer prioridad)
  {
    voidReturn = true ;
    this.urgencias = urgencias ;
    this.dNI = dNI ;
    this.prioridad = prioridad ;
  }
  
  public String toString () 
  {
    StringBuilder output = new StringBuilder() ;
    output.append(TesterCode.printer(urgencias)) ;
    output.append(new String(".cambiarPrioridad")) ;
    output.append(new String("(")) ;
    output.append(TesterCode.printer(dNI)) ;
    output.append(new String(", ")) ;
    output.append(TesterCode.printer(prioridad)) ;
    output.append(new String(")")) ;
    return output.toString() ;
  }
  
  public Void call () throws NoHayPacienteExc
  {
    urgencias.cambiarPrioridad(dNI,prioridad) ;
    return null ;
  }
  
  public boolean checkResult (Object expected) 
  {
    if (expected instanceof Throwable)
    {
      Throwable t = (Throwable) expected ;
      if (!throwsException(t.getClass().getCanonicalName()))
        return false ;
      return true ;
    }
    if (!noException())
      return false ;
    return true ;
  }
  
}


static class AumentaPrioridad extends TestCall<Void,Void>
{
  Urgencias urgencias;
  Long maxTiempoEspera;
  
  public AumentaPrioridad (Urgencias urgencias,Long maxTiempoEspera)
  {
    voidReturn = true ;
    this.urgencias = urgencias ;
    this.maxTiempoEspera = maxTiempoEspera ;
  }
  
  public String toString () 
  {
    StringBuilder output = new StringBuilder() ;
    output.append(TesterCode.printer(urgencias)) ;
    output.append(new String(".aumentaPrioridad")) ;
    output.append(new String("(")) ;
    output.append(TesterCode.printer(maxTiempoEspera)) ;
    output.append(new String(")")) ;
    return output.toString() ;
  }
  
  public Void call () 
  {
    urgencias.aumentaPrioridad(maxTiempoEspera) ;
    return null ;
  }
  
  public boolean checkResult (Void expected) 
  {
    if (!noException())
      return false ;
    return true ;
  }
  
}


static class AdmitirPaciente extends TestCall<Void,Void>
{
  Urgencias urgencias;
  String dni;
  Integer priority;
  
  public AdmitirPaciente (Urgencias urgencias,String dni,Integer priority)
  {
    voidReturn = true ;
    this.urgencias = urgencias ;
    this.dni = dni ;
    this.priority = priority ;
  }
  
  public String toString () 
  {
    StringBuilder output = new StringBuilder() ;
    output.append(TesterCode.printer(urgencias)) ;
    output.append(new String(".admitirPaciente")) ;
    output.append(new String("(")) ;
    output.append(TesterCode.printer(dni)) ;
    output.append(new String(", ")) ;
    output.append(TesterCode.printer(priority)) ;
    output.append(new String(")")) ;
    return output.toString() ;
  }
  
  public Void call () 
  {
    urgencias.admitirPaciente(dni,priority) ;
    return null ;
  }
  
  public boolean checkResult (Void expected) 
  {
    if (!noException())
      return false ;
    return true ;
  }
  
}


static class SalirPaciente extends TestCall<Void,Object>
{
  Urgencias urgencias;
  String dNI;
  
  public SalirPaciente (Urgencias urgencias,String dNI)
  {
    voidReturn = true ;
    this.urgencias = urgencias ;
    this.dNI = dNI ;
  }
  
  public String toString () 
  {
    StringBuilder output = new StringBuilder() ;
    output.append(TesterCode.printer(urgencias)) ;
    output.append(new String(".salirPaciente")) ;
    output.append(new String("(")) ;
    output.append(TesterCode.printer(dNI)) ;
    output.append(new String(")")) ;
    return output.toString() ;
  }
  
  public Void call () throws NoHayPacienteExc
  {
    urgencias.salirPaciente(dNI) ;
    return null ;
  }
  
  public boolean checkResult (Object expected) 
  {
    if (expected instanceof Throwable)
    {
      Throwable t = (Throwable) expected ;
      if (!throwsException(t.getClass().getCanonicalName()))
        return false ;
      return true ;
    }
    if (!noException())
      return false ;
    return true ;
  }
  
}


static class GetProximoPaciente extends TestCall<Paciente,Object>
{
  Urgencias urgencias;
  
  public GetProximoPaciente (Urgencias urgencias)
  {
    this.urgencias = urgencias ;
  }
  
  public String toString () 
  {
    StringBuilder output = new StringBuilder() ;
    output.append(TesterCode.printer(urgencias)) ;
    output.append(new String(".getProximoPaciente")) ;
    output.append(new String("(")) ;
    output.append(new String(")")) ;
    return output.toString() ;
  }
  
  public Paciente call () throws NoHayPacienteExc
  {
    return urgencias.getProximoPaciente() ;
  }
  
  public boolean checkResult (Object expected) 
  {
    if (expected instanceof Throwable)
    {
      Throwable t = (Throwable) expected ;
      if (!throwsException(t.getClass().getCanonicalName()))
        return false ;
      return true ;
    }
    if (!noException())
      return false ;
    if (!nonNull())
      return false ;
    if (!UrgenciasUtils.correctPaciente(this,result,expected))
      return false ;
    return true ;
  }
  
}


static class AtenderPaciente extends TestCall<Paciente,Object>
{
  Urgencias urgencias;
  
  public AtenderPaciente (Urgencias urgencias)
  {
    this.urgencias = urgencias ;
  }
  
  public String toString () 
  {
    StringBuilder output = new StringBuilder() ;
    output.append(TesterCode.printer(urgencias)) ;
    output.append(new String(".atenderPaciente")) ;
    output.append(new String("(")) ;
    output.append(new String(")")) ;
    return output.toString() ;
  }
  
  public Paciente call () throws NoHayPacienteExc
  {
    return urgencias.atenderPaciente() ;
  }
  
  public boolean checkResult (Object expected) 
  {
    if (expected instanceof Throwable)
    {
      Throwable t = (Throwable) expected ;
      if (!throwsException(t.getClass().getCanonicalName()))
        return false ;
      return true ;
    }
    if (!noException())
      return false ;
    if (!nonNull())
      return false ;
    if (!UrgenciasUtils.correctPaciente(this,result,expected))
      return false ;
    return true ;
  }
  
}


static class SetCurrentTime extends TestCall<Void,Void>
{
  int time;
  
  public SetCurrentTime (int time)
  {
    voidReturn = true ;
    this.time = time ;
  }
  
  public String toString () 
  {
    StringBuilder output = new StringBuilder() ;
    output.append(new String("Time.setCurrentTime")) ;
    output.append(new String("(")) ;
    output.append(TesterCode.printer(time)) ;
    output.append(new String(")")) ;
    return output.toString() ;
  }
  
  public Void call () 
  {
    Time.setCurrentTime(time) ;
    return null ;
  }
  
  public boolean checkResult (Void expected) 
  {
    if (!noException())
      return false ;
    return true ;
  }
  
}


static class ColaOk extends TestCall<Boolean,Boolean>
{
  Urgencias arg1;
  es.upm.aedlib.positionlist.NodePositionList<Paciente> arg2;
  Boolean arg3;
  
  public ColaOk (Urgencias arg1,es.upm.aedlib.positionlist.NodePositionList<Paciente> arg2,Boolean arg3)
  {
    this.arg1 = arg1 ;
    this.arg2 = arg2 ;
    this.arg3 = arg3 ;
  }
  
  public String toString () 
  {
    return new String("") ;
  }
  
  public Boolean call () 
  {
    return UrgenciasUtils.colaOk(arg1,arg2,arg3) ;
  }
  
  public boolean checkResult (Boolean expected) 
  {
    return silentCheckTrueResult() ;
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
    UrgenciasUtils.resetPrinter() ;
  }
  
  public static String printer (Object obj) 
  {
    return UrgenciasUtils.printer(obj) ;
  }
  
}


}
