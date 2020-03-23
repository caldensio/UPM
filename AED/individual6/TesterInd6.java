
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
// File generated at: 2019/12/5 -- 10:56:41
// Seed: {1575,539800,603492}
//
//////////////////////////////////////////////////////////////////////



package aed.individual6;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import java.util.concurrent.CountDownLatch;
import java.lang.reflect.*;
import es.upm.aedlib.Entry;
import es.upm.aedlib.Pair;
import es.upm.aedlib.Position;
import es.upm.aedlib.graph.*;
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
import java.util.Set;
import java.util.function.*;
import java.util.function.Function;



/**
 * The main tester class which contains JUnit5 tests.
 */
@SuppressWarnings({"unused","deprecation"})
public class TesterInd6 {

  
    

  @BeforeAll
  public static void init () 
  {
    TestUtils.reportPid() ;
    ResultsHandler.init() ;
    ResultsHandler.setNumTestsRemaining(30,60) ;
    TestData.setTesterType(true) ;
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
    ResultsHandler.add_result(new String("sumVertices"),resultIs) ;
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
{
  DirectedAdjacencyListGraph<Integer,Integer> graph = new DirectedAdjacencyListGraph<Integer,Integer>() ;
  Vertex<Integer> v_0 = graph.insertVertex(7) ;
  ok_sofar = new SumVertices(graph).doCall().checkResult(new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Entry<Vertex<Integer>,Integer>>(TestUtils.toGenericArray(TestUtils.es_upm_aedlib_map_Entry_refl_cnstr(v_0,7)))) ;
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
    ResultsHandler.stopTest(new String("test_02")) ;
    ResultsHandler.add_result(new String("sumVertices"),resultIs) ;
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
{
  DirectedAdjacencyListGraph<Integer,Integer> graph = new DirectedAdjacencyListGraph<Integer,Integer>() ;
  Vertex<Integer> v_0 = graph.insertVertex(1) ;
  Vertex<Integer> v_1 = graph.insertVertex(1) ;
  ok_sofar = new SumVertices(graph).doCall().checkResult(new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Entry<Vertex<Integer>,Integer>>(TestUtils.toGenericArray(TestUtils.es_upm_aedlib_map_Entry_refl_cnstr(v_0,1),TestUtils.es_upm_aedlib_map_Entry_refl_cnstr(v_1,1)))) ;
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
    ResultsHandler.stopTest(new String("test_03")) ;
    ResultsHandler.add_result(new String("sumVertices"),resultIs) ;
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
{
  DirectedAdjacencyListGraph<Integer,Integer> graph = new DirectedAdjacencyListGraph<Integer,Integer>() ;
  Vertex<Integer> v_0 = graph.insertVertex(1) ;
  Vertex<Integer> v_1 = graph.insertVertex(2) ;
  ok_sofar = new SumVertices(graph).doCall().checkResult(new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Entry<Vertex<Integer>,Integer>>(TestUtils.toGenericArray(TestUtils.es_upm_aedlib_map_Entry_refl_cnstr(v_0,1),TestUtils.es_upm_aedlib_map_Entry_refl_cnstr(v_1,2)))) ;
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
    ResultsHandler.stopTest(new String("test_04")) ;
    ResultsHandler.add_result(new String("sumVertices"),resultIs) ;
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
{
  DirectedAdjacencyListGraph<Integer,Integer> graph = new DirectedAdjacencyListGraph<Integer,Integer>() ;
  Vertex<Integer> v_0 = graph.insertVertex(5) ;
  Vertex<Integer> v_1 = graph.insertVertex(4) ;
  Vertex<Integer> v_2 = graph.insertVertex(5) ;
  graph.insertDirectedEdge(v_2,v_1,null) ;
  graph.insertDirectedEdge(v_1,v_0,null) ;
  graph.insertDirectedEdge(v_0,v_2,null) ;
  ok_sofar = new SumVertices(graph).doCall().checkResult(new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Entry<Vertex<Integer>,Integer>>(TestUtils.toGenericArray(TestUtils.es_upm_aedlib_map_Entry_refl_cnstr(v_0,14),TestUtils.es_upm_aedlib_map_Entry_refl_cnstr(v_1,14),TestUtils.es_upm_aedlib_map_Entry_refl_cnstr(v_2,14)))) ;
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
    ResultsHandler.stopTest(new String("test_05")) ;
    ResultsHandler.add_result(new String("sumVertices"),resultIs) ;
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
{
  DirectedAdjacencyListGraph<Integer,Integer> graph = new DirectedAdjacencyListGraph<Integer,Integer>() ;
  Vertex<Integer> v_0 = graph.insertVertex(1) ;
  Vertex<Integer> v_1 = graph.insertVertex(2) ;
  Vertex<Integer> v_2 = graph.insertVertex(3) ;
  Vertex<Integer> v_3 = graph.insertVertex(3) ;
  graph.insertDirectedEdge(v_3,v_3,null) ;
  graph.insertDirectedEdge(v_2,v_1,null) ;
  graph.insertDirectedEdge(v_1,v_3,null) ;
  graph.insertDirectedEdge(v_0,v_0,null) ;
  ok_sofar = new SumVertices(graph).doCall().checkResult(new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Entry<Vertex<Integer>,Integer>>(TestUtils.toGenericArray(TestUtils.es_upm_aedlib_map_Entry_refl_cnstr(v_0,1),TestUtils.es_upm_aedlib_map_Entry_refl_cnstr(v_1,5),TestUtils.es_upm_aedlib_map_Entry_refl_cnstr(v_2,8),TestUtils.es_upm_aedlib_map_Entry_refl_cnstr(v_3,3)))) ;
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
    ResultsHandler.stopTest(new String("test_06")) ;
    ResultsHandler.add_result(new String("sumVertices"),resultIs) ;
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
{
  DirectedAdjacencyListGraph<Integer,Integer> graph = new DirectedAdjacencyListGraph<Integer,Integer>() ;
  Vertex<Integer> v_0 = graph.insertVertex(5) ;
  Vertex<Integer> v_1 = graph.insertVertex(2) ;
  Vertex<Integer> v_2 = graph.insertVertex(1) ;
  Vertex<Integer> v_3 = graph.insertVertex(6) ;
  graph.insertDirectedEdge(v_3,v_2,null) ;
  graph.insertDirectedEdge(v_3,v_3,null) ;
  graph.insertDirectedEdge(v_2,v_3,null) ;
  graph.insertDirectedEdge(v_1,v_0,null) ;
  graph.insertDirectedEdge(v_1,v_0,null) ;
  graph.insertDirectedEdge(v_0,v_0,null) ;
  ok_sofar = new SumVertices(graph).doCall().checkResult(new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Entry<Vertex<Integer>,Integer>>(TestUtils.toGenericArray(TestUtils.es_upm_aedlib_map_Entry_refl_cnstr(v_0,5),TestUtils.es_upm_aedlib_map_Entry_refl_cnstr(v_1,7),TestUtils.es_upm_aedlib_map_Entry_refl_cnstr(v_2,7),TestUtils.es_upm_aedlib_map_Entry_refl_cnstr(v_3,7)))) ;
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
    ResultsHandler.stopTest(new String("test_07")) ;
    ResultsHandler.add_result(new String("sumVertices"),resultIs) ;
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
{
  DirectedAdjacencyListGraph<Integer,Integer> graph = new DirectedAdjacencyListGraph<Integer,Integer>() ;
  Vertex<Integer> v_0 = graph.insertVertex(6) ;
  Vertex<Integer> v_1 = graph.insertVertex(4) ;
  Vertex<Integer> v_2 = graph.insertVertex(1) ;
  Vertex<Integer> v_3 = graph.insertVertex(8) ;
  Vertex<Integer> v_4 = graph.insertVertex(7) ;
  graph.insertDirectedEdge(v_4,v_2,null) ;
  graph.insertDirectedEdge(v_3,v_4,null) ;
  graph.insertDirectedEdge(v_2,v_2,null) ;
  graph.insertDirectedEdge(v_1,v_0,null) ;
  graph.insertDirectedEdge(v_1,v_3,null) ;
  graph.insertDirectedEdge(v_0,v_0,null) ;
  ok_sofar = new SumVertices(graph).doCall().checkResult(new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Entry<Vertex<Integer>,Integer>>(TestUtils.toGenericArray(TestUtils.es_upm_aedlib_map_Entry_refl_cnstr(v_0,6),TestUtils.es_upm_aedlib_map_Entry_refl_cnstr(v_1,26),TestUtils.es_upm_aedlib_map_Entry_refl_cnstr(v_2,1),TestUtils.es_upm_aedlib_map_Entry_refl_cnstr(v_3,16),TestUtils.es_upm_aedlib_map_Entry_refl_cnstr(v_4,8)))) ;
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
    ResultsHandler.stopTest(new String("test_08")) ;
    ResultsHandler.add_result(new String("sumVertices"),resultIs) ;
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
{
  DirectedAdjacencyListGraph<Integer,Integer> graph = new DirectedAdjacencyListGraph<Integer,Integer>() ;
  Vertex<Integer> v_0 = graph.insertVertex(3) ;
  Vertex<Integer> v_1 = graph.insertVertex(2) ;
  Vertex<Integer> v_2 = graph.insertVertex(2) ;
  Vertex<Integer> v_3 = graph.insertVertex(4) ;
  Vertex<Integer> v_4 = graph.insertVertex(1) ;
  graph.insertDirectedEdge(v_4,v_0,null) ;
  graph.insertDirectedEdge(v_4,v_2,null) ;
  graph.insertDirectedEdge(v_3,v_3,null) ;
  graph.insertDirectedEdge(v_2,v_3,null) ;
  graph.insertDirectedEdge(v_2,v_3,null) ;
  graph.insertDirectedEdge(v_1,v_4,null) ;
  graph.insertDirectedEdge(v_0,v_1,null) ;
  ok_sofar = new SumVertices(graph).doCall().checkResult(new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Entry<Vertex<Integer>,Integer>>(TestUtils.toGenericArray(TestUtils.es_upm_aedlib_map_Entry_refl_cnstr(v_0,12),TestUtils.es_upm_aedlib_map_Entry_refl_cnstr(v_1,12),TestUtils.es_upm_aedlib_map_Entry_refl_cnstr(v_2,6),TestUtils.es_upm_aedlib_map_Entry_refl_cnstr(v_3,4),TestUtils.es_upm_aedlib_map_Entry_refl_cnstr(v_4,12)))) ;
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
    ResultsHandler.stopTest(new String("test_09")) ;
    ResultsHandler.add_result(new String("sumVertices"),resultIs) ;
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
{
  DirectedAdjacencyListGraph<Integer,Integer> graph = new DirectedAdjacencyListGraph<Integer,Integer>() ;
  Vertex<Integer> v_0 = graph.insertVertex(6) ;
  Vertex<Integer> v_1 = graph.insertVertex(4) ;
  Vertex<Integer> v_2 = graph.insertVertex(3) ;
  Vertex<Integer> v_3 = graph.insertVertex(5) ;
  Vertex<Integer> v_4 = graph.insertVertex(2) ;
  Vertex<Integer> v_5 = graph.insertVertex(6) ;
  graph.insertDirectedEdge(v_5,v_2,null) ;
  graph.insertDirectedEdge(v_4,v_1,null) ;
  graph.insertDirectedEdge(v_4,v_2,null) ;
  graph.insertDirectedEdge(v_3,v_3,null) ;
  graph.insertDirectedEdge(v_3,v_5,null) ;
  graph.insertDirectedEdge(v_2,v_1,null) ;
  graph.insertDirectedEdge(v_2,v_1,null) ;
  graph.insertDirectedEdge(v_2,v_4,null) ;
  graph.insertDirectedEdge(v_2,v_5,null) ;
  graph.insertDirectedEdge(v_1,v_1,null) ;
  graph.insertDirectedEdge(v_1,v_3,null) ;
  graph.insertDirectedEdge(v_1,v_3,null) ;
  graph.insertDirectedEdge(v_0,v_1,null) ;
  graph.insertDirectedEdge(v_0,v_3,null) ;
  ok_sofar = new SumVertices(graph).doCall().checkResult(new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Entry<Vertex<Integer>,Integer>>(TestUtils.toGenericArray(TestUtils.es_upm_aedlib_map_Entry_refl_cnstr(v_0,26),TestUtils.es_upm_aedlib_map_Entry_refl_cnstr(v_1,20),TestUtils.es_upm_aedlib_map_Entry_refl_cnstr(v_2,20),TestUtils.es_upm_aedlib_map_Entry_refl_cnstr(v_3,20),TestUtils.es_upm_aedlib_map_Entry_refl_cnstr(v_4,20),TestUtils.es_upm_aedlib_map_Entry_refl_cnstr(v_5,20)))) ;
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
    ResultsHandler.stopTest(new String("test_10")) ;
    ResultsHandler.add_result(new String("sumVertices"),resultIs) ;
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
{
  DirectedAdjacencyListGraph<Integer,Integer> graph = new DirectedAdjacencyListGraph<Integer,Integer>() ;
  Vertex<Integer> v_0 = graph.insertVertex(1) ;
  Vertex<Integer> v_1 = graph.insertVertex(1) ;
  Vertex<Integer> v_2 = graph.insertVertex(2) ;
  Vertex<Integer> v_3 = graph.insertVertex(2) ;
  Vertex<Integer> v_4 = graph.insertVertex(1) ;
  Vertex<Integer> v_5 = graph.insertVertex(1) ;
  Vertex<Integer> v_6 = graph.insertVertex(1) ;
  graph.insertDirectedEdge(v_6,v_2,null) ;
  graph.insertDirectedEdge(v_5,v_0,null) ;
  graph.insertDirectedEdge(v_5,v_1,null) ;
  graph.insertDirectedEdge(v_5,v_3,null) ;
  graph.insertDirectedEdge(v_4,v_2,null) ;
  graph.insertDirectedEdge(v_4,v_4,null) ;
  graph.insertDirectedEdge(v_4,v_5,null) ;
  graph.insertDirectedEdge(v_3,v_4,null) ;
  graph.insertDirectedEdge(v_3,v_4,null) ;
  graph.insertDirectedEdge(v_2,v_2,null) ;
  graph.insertDirectedEdge(v_1,v_3,null) ;
  graph.insertDirectedEdge(v_1,v_6,null) ;
  graph.insertDirectedEdge(v_0,v_5,null) ;
  graph.insertDirectedEdge(v_0,v_6,null) ;
  ok_sofar = new SumVertices(graph).doCall().checkResult(new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Entry<Vertex<Integer>,Integer>>(TestUtils.toGenericArray(TestUtils.es_upm_aedlib_map_Entry_refl_cnstr(v_0,9),TestUtils.es_upm_aedlib_map_Entry_refl_cnstr(v_1,9),TestUtils.es_upm_aedlib_map_Entry_refl_cnstr(v_2,2),TestUtils.es_upm_aedlib_map_Entry_refl_cnstr(v_3,9),TestUtils.es_upm_aedlib_map_Entry_refl_cnstr(v_4,9),TestUtils.es_upm_aedlib_map_Entry_refl_cnstr(v_5,9),TestUtils.es_upm_aedlib_map_Entry_refl_cnstr(v_6,3)))) ;
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
    ResultsHandler.stopTest(new String("test_11")) ;
    ResultsHandler.add_result(new String("sumVertices"),resultIs) ;
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
{
  DirectedAdjacencyListGraph<Integer,Integer> graph = new DirectedAdjacencyListGraph<Integer,Integer>() ;
  Vertex<Integer> v_0 = graph.insertVertex(1) ;
  Vertex<Integer> v_1 = graph.insertVertex(1) ;
  Vertex<Integer> v_2 = graph.insertVertex(1) ;
  Vertex<Integer> v_3 = graph.insertVertex(1) ;
  Vertex<Integer> v_4 = graph.insertVertex(1) ;
  Vertex<Integer> v_5 = graph.insertVertex(2) ;
  Vertex<Integer> v_6 = graph.insertVertex(1) ;
  Vertex<Integer> v_7 = graph.insertVertex(1) ;
  graph.insertDirectedEdge(v_7,v_2,null) ;
  graph.insertDirectedEdge(v_6,v_3,null) ;
  graph.insertDirectedEdge(v_5,v_3,null) ;
  graph.insertDirectedEdge(v_5,v_4,null) ;
  graph.insertDirectedEdge(v_4,v_2,null) ;
  graph.insertDirectedEdge(v_3,v_3,null) ;
  graph.insertDirectedEdge(v_3,v_5,null) ;
  graph.insertDirectedEdge(v_2,v_3,null) ;
  graph.insertDirectedEdge(v_1,v_6,null) ;
  graph.insertDirectedEdge(v_0,v_4,null) ;
  ok_sofar = new SumVertices(graph).doCall().checkResult(new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Entry<Vertex<Integer>,Integer>>(TestUtils.toGenericArray(TestUtils.es_upm_aedlib_map_Entry_refl_cnstr(v_0,6),TestUtils.es_upm_aedlib_map_Entry_refl_cnstr(v_1,7),TestUtils.es_upm_aedlib_map_Entry_refl_cnstr(v_2,5),TestUtils.es_upm_aedlib_map_Entry_refl_cnstr(v_3,5),TestUtils.es_upm_aedlib_map_Entry_refl_cnstr(v_4,5),TestUtils.es_upm_aedlib_map_Entry_refl_cnstr(v_5,5),TestUtils.es_upm_aedlib_map_Entry_refl_cnstr(v_6,6),TestUtils.es_upm_aedlib_map_Entry_refl_cnstr(v_7,6)))) ;
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
    ResultsHandler.stopTest(new String("test_12")) ;
    ResultsHandler.add_result(new String("sumVertices"),resultIs) ;
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
{
  DirectedAdjacencyListGraph<Integer,Integer> graph = new DirectedAdjacencyListGraph<Integer,Integer>() ;
  Vertex<Integer> v_0 = graph.insertVertex(2) ;
  Vertex<Integer> v_1 = graph.insertVertex(1) ;
  Vertex<Integer> v_2 = graph.insertVertex(2) ;
  Vertex<Integer> v_3 = graph.insertVertex(3) ;
  Vertex<Integer> v_4 = graph.insertVertex(2) ;
  Vertex<Integer> v_5 = graph.insertVertex(2) ;
  Vertex<Integer> v_6 = graph.insertVertex(1) ;
  Vertex<Integer> v_7 = graph.insertVertex(2) ;
  graph.insertDirectedEdge(v_7,v_3,null) ;
  graph.insertDirectedEdge(v_7,v_7,null) ;
  graph.insertDirectedEdge(v_6,v_1,null) ;
  graph.insertDirectedEdge(v_6,v_5,null) ;
  graph.insertDirectedEdge(v_5,v_1,null) ;
  graph.insertDirectedEdge(v_5,v_5,null) ;
  graph.insertDirectedEdge(v_4,v_4,null) ;
  graph.insertDirectedEdge(v_3,v_0,null) ;
  graph.insertDirectedEdge(v_3,v_0,null) ;
  graph.insertDirectedEdge(v_2,v_5,null) ;
  graph.insertDirectedEdge(v_1,v_0,null) ;
  graph.insertDirectedEdge(v_0,v_0,null) ;
  ok_sofar = new SumVertices(graph).doCall().checkResult(new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Entry<Vertex<Integer>,Integer>>(TestUtils.toGenericArray(TestUtils.es_upm_aedlib_map_Entry_refl_cnstr(v_0,2),TestUtils.es_upm_aedlib_map_Entry_refl_cnstr(v_1,3),TestUtils.es_upm_aedlib_map_Entry_refl_cnstr(v_2,7),TestUtils.es_upm_aedlib_map_Entry_refl_cnstr(v_3,5),TestUtils.es_upm_aedlib_map_Entry_refl_cnstr(v_4,2),TestUtils.es_upm_aedlib_map_Entry_refl_cnstr(v_5,5),TestUtils.es_upm_aedlib_map_Entry_refl_cnstr(v_6,6),TestUtils.es_upm_aedlib_map_Entry_refl_cnstr(v_7,7)))) ;
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
    ResultsHandler.stopTest(new String("test_13")) ;
    ResultsHandler.add_result(new String("sumVertices"),resultIs) ;
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
{
  DirectedAdjacencyListGraph<Integer,Integer> graph = new DirectedAdjacencyListGraph<Integer,Integer>() ;
  Vertex<Integer> v_0 = graph.insertVertex(1) ;
  Vertex<Integer> v_1 = graph.insertVertex(1) ;
  Vertex<Integer> v_2 = graph.insertVertex(4) ;
  Vertex<Integer> v_3 = graph.insertVertex(7) ;
  Vertex<Integer> v_4 = graph.insertVertex(7) ;
  Vertex<Integer> v_5 = graph.insertVertex(2) ;
  Vertex<Integer> v_6 = graph.insertVertex(7) ;
  Vertex<Integer> v_7 = graph.insertVertex(7) ;
  graph.insertDirectedEdge(v_7,v_7,null) ;
  graph.insertDirectedEdge(v_6,v_7,null) ;
  graph.insertDirectedEdge(v_5,v_7,null) ;
  graph.insertDirectedEdge(v_4,v_0,null) ;
  graph.insertDirectedEdge(v_4,v_3,null) ;
  graph.insertDirectedEdge(v_4,v_5,null) ;
  graph.insertDirectedEdge(v_3,v_2,null) ;
  graph.insertDirectedEdge(v_3,v_5,null) ;
  graph.insertDirectedEdge(v_2,v_0,null) ;
  graph.insertDirectedEdge(v_2,v_2,null) ;
  graph.insertDirectedEdge(v_1,v_0,null) ;
  graph.insertDirectedEdge(v_1,v_2,null) ;
  graph.insertDirectedEdge(v_1,v_7,null) ;
  graph.insertDirectedEdge(v_0,v_2,null) ;
  ok_sofar = new SumVertices(graph).doCall().checkResult(new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Entry<Vertex<Integer>,Integer>>(TestUtils.toGenericArray(TestUtils.es_upm_aedlib_map_Entry_refl_cnstr(v_0,5),TestUtils.es_upm_aedlib_map_Entry_refl_cnstr(v_1,13),TestUtils.es_upm_aedlib_map_Entry_refl_cnstr(v_2,5),TestUtils.es_upm_aedlib_map_Entry_refl_cnstr(v_3,21),TestUtils.es_upm_aedlib_map_Entry_refl_cnstr(v_4,28),TestUtils.es_upm_aedlib_map_Entry_refl_cnstr(v_5,9),TestUtils.es_upm_aedlib_map_Entry_refl_cnstr(v_6,14),TestUtils.es_upm_aedlib_map_Entry_refl_cnstr(v_7,7)))) ;
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
    ResultsHandler.stopTest(new String("test_14")) ;
    ResultsHandler.add_result(new String("sumVertices"),resultIs) ;
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
{
  DirectedAdjacencyListGraph<Integer,Integer> graph = new DirectedAdjacencyListGraph<Integer,Integer>() ;
  Vertex<Integer> v_0 = graph.insertVertex(1) ;
  Vertex<Integer> v_1 = graph.insertVertex(7) ;
  Vertex<Integer> v_2 = graph.insertVertex(7) ;
  Vertex<Integer> v_3 = graph.insertVertex(3) ;
  Vertex<Integer> v_4 = graph.insertVertex(5) ;
  Vertex<Integer> v_5 = graph.insertVertex(3) ;
  Vertex<Integer> v_6 = graph.insertVertex(8) ;
  Vertex<Integer> v_7 = graph.insertVertex(1) ;
  Vertex<Integer> v_8 = graph.insertVertex(7) ;
  graph.insertDirectedEdge(v_8,v_3,null) ;
  graph.insertDirectedEdge(v_8,v_4,null) ;
  graph.insertDirectedEdge(v_7,v_3,null) ;
  graph.insertDirectedEdge(v_7,v_8,null) ;
  graph.insertDirectedEdge(v_6,v_0,null) ;
  graph.insertDirectedEdge(v_6,v_8,null) ;
  graph.insertDirectedEdge(v_5,v_0,null) ;
  graph.insertDirectedEdge(v_5,v_7,null) ;
  graph.insertDirectedEdge(v_4,v_0,null) ;
  graph.insertDirectedEdge(v_4,v_4,null) ;
  graph.insertDirectedEdge(v_4,v_5,null) ;
  graph.insertDirectedEdge(v_3,v_3,null) ;
  graph.insertDirectedEdge(v_3,v_6,null) ;
  graph.insertDirectedEdge(v_3,v_7,null) ;
  graph.insertDirectedEdge(v_2,v_3,null) ;
  graph.insertDirectedEdge(v_2,v_6,null) ;
  graph.insertDirectedEdge(v_1,v_3,null) ;
  graph.insertDirectedEdge(v_1,v_7,null) ;
  graph.insertDirectedEdge(v_1,v_8,null) ;
  graph.insertDirectedEdge(v_0,v_1,null) ;
  graph.insertDirectedEdge(v_0,v_8,null) ;
  ok_sofar = new SumVertices(graph).doCall().checkResult(new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Entry<Vertex<Integer>,Integer>>(TestUtils.toGenericArray(TestUtils.es_upm_aedlib_map_Entry_refl_cnstr(v_0,35),TestUtils.es_upm_aedlib_map_Entry_refl_cnstr(v_1,35),TestUtils.es_upm_aedlib_map_Entry_refl_cnstr(v_2,42),TestUtils.es_upm_aedlib_map_Entry_refl_cnstr(v_3,35),TestUtils.es_upm_aedlib_map_Entry_refl_cnstr(v_4,35),TestUtils.es_upm_aedlib_map_Entry_refl_cnstr(v_5,35),TestUtils.es_upm_aedlib_map_Entry_refl_cnstr(v_6,35),TestUtils.es_upm_aedlib_map_Entry_refl_cnstr(v_7,35),TestUtils.es_upm_aedlib_map_Entry_refl_cnstr(v_8,35)))) ;
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
    ResultsHandler.stopTest(new String("test_15")) ;
    ResultsHandler.add_result(new String("sumVertices"),resultIs) ;
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
{
  DirectedAdjacencyListGraph<Integer,Integer> graph = new DirectedAdjacencyListGraph<Integer,Integer>() ;
  Vertex<Integer> v_0 = graph.insertVertex(3) ;
  Vertex<Integer> v_1 = graph.insertVertex(4) ;
  Vertex<Integer> v_2 = graph.insertVertex(4) ;
  Vertex<Integer> v_3 = graph.insertVertex(3) ;
  Vertex<Integer> v_4 = graph.insertVertex(1) ;
  Vertex<Integer> v_5 = graph.insertVertex(2) ;
  Vertex<Integer> v_6 = graph.insertVertex(1) ;
  Vertex<Integer> v_7 = graph.insertVertex(2) ;
  Vertex<Integer> v_8 = graph.insertVertex(1) ;
  Vertex<Integer> v_9 = graph.insertVertex(1) ;
  Vertex<Integer> v_10 = graph.insertVertex(3) ;
  graph.insertDirectedEdge(v_10,v_1,null) ;
  graph.insertDirectedEdge(v_9,v_2,null) ;
  graph.insertDirectedEdge(v_9,v_5,null) ;
  graph.insertDirectedEdge(v_8,v_4,null) ;
  graph.insertDirectedEdge(v_8,v_6,null) ;
  graph.insertDirectedEdge(v_8,v_7,null) ;
  graph.insertDirectedEdge(v_7,v_4,null) ;
  graph.insertDirectedEdge(v_7,v_6,null) ;
  graph.insertDirectedEdge(v_6,v_3,null) ;
  graph.insertDirectedEdge(v_6,v_5,null) ;
  graph.insertDirectedEdge(v_6,v_7,null) ;
  graph.insertDirectedEdge(v_5,v_6,null) ;
  graph.insertDirectedEdge(v_4,v_4,null) ;
  graph.insertDirectedEdge(v_4,v_9,null) ;
  graph.insertDirectedEdge(v_3,v_5,null) ;
  graph.insertDirectedEdge(v_2,v_1,null) ;
  graph.insertDirectedEdge(v_2,v_4,null) ;
  graph.insertDirectedEdge(v_1,v_9,null) ;
  graph.insertDirectedEdge(v_0,v_0,null) ;
  graph.insertDirectedEdge(v_0,v_2,null) ;
  graph.insertDirectedEdge(v_0,v_6,null) ;
  graph.insertDirectedEdge(v_0,v_6,null) ;
  ok_sofar = new SumVertices(graph).doCall().checkResult(new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Entry<Vertex<Integer>,Integer>>(TestUtils.toGenericArray(TestUtils.es_upm_aedlib_map_Entry_refl_cnstr(v_0,21),TestUtils.es_upm_aedlib_map_Entry_refl_cnstr(v_1,18),TestUtils.es_upm_aedlib_map_Entry_refl_cnstr(v_2,18),TestUtils.es_upm_aedlib_map_Entry_refl_cnstr(v_3,18),TestUtils.es_upm_aedlib_map_Entry_refl_cnstr(v_4,18),TestUtils.es_upm_aedlib_map_Entry_refl_cnstr(v_5,18),TestUtils.es_upm_aedlib_map_Entry_refl_cnstr(v_6,18),TestUtils.es_upm_aedlib_map_Entry_refl_cnstr(v_7,18),TestUtils.es_upm_aedlib_map_Entry_refl_cnstr(v_8,19),TestUtils.es_upm_aedlib_map_Entry_refl_cnstr(v_9,18),TestUtils.es_upm_aedlib_map_Entry_refl_cnstr(v_10,21)))) ;
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
    ResultsHandler.stopTest(new String("test_16")) ;
    ResultsHandler.add_result(new String("sumVertices"),resultIs) ;
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
{
  DirectedAdjacencyListGraph<Integer,Integer> graph = new DirectedAdjacencyListGraph<Integer,Integer>() ;
  Vertex<Integer> v_0 = graph.insertVertex(7) ;
  Vertex<Integer> v_1 = graph.insertVertex(7) ;
  Vertex<Integer> v_2 = graph.insertVertex(1) ;
  Vertex<Integer> v_3 = graph.insertVertex(4) ;
  Vertex<Integer> v_4 = graph.insertVertex(7) ;
  Vertex<Integer> v_5 = graph.insertVertex(3) ;
  Vertex<Integer> v_6 = graph.insertVertex(6) ;
  Vertex<Integer> v_7 = graph.insertVertex(2) ;
  Vertex<Integer> v_8 = graph.insertVertex(6) ;
  Vertex<Integer> v_9 = graph.insertVertex(1) ;
  Vertex<Integer> v_10 = graph.insertVertex(1) ;
  Vertex<Integer> v_11 = graph.insertVertex(3) ;
  graph.insertDirectedEdge(v_11,v_6,null) ;
  graph.insertDirectedEdge(v_11,v_7,null) ;
  graph.insertDirectedEdge(v_11,v_10,null) ;
  graph.insertDirectedEdge(v_10,v_2,null) ;
  graph.insertDirectedEdge(v_10,v_8,null) ;
  graph.insertDirectedEdge(v_9,v_3,null) ;
  graph.insertDirectedEdge(v_9,v_5,null) ;
  graph.insertDirectedEdge(v_8,v_5,null) ;
  graph.insertDirectedEdge(v_7,v_8,null) ;
  graph.insertDirectedEdge(v_6,v_0,null) ;
  graph.insertDirectedEdge(v_6,v_1,null) ;
  graph.insertDirectedEdge(v_5,v_0,null) ;
  graph.insertDirectedEdge(v_5,v_6,null) ;
  graph.insertDirectedEdge(v_5,v_11,null) ;
  graph.insertDirectedEdge(v_4,v_2,null) ;
  graph.insertDirectedEdge(v_4,v_3,null) ;
  graph.insertDirectedEdge(v_4,v_6,null) ;
  graph.insertDirectedEdge(v_3,v_3,null) ;
  graph.insertDirectedEdge(v_3,v_3,null) ;
  graph.insertDirectedEdge(v_3,v_5,null) ;
  graph.insertDirectedEdge(v_3,v_6,null) ;
  graph.insertDirectedEdge(v_2,v_2,null) ;
  graph.insertDirectedEdge(v_2,v_3,null) ;
  graph.insertDirectedEdge(v_2,v_8,null) ;
  graph.insertDirectedEdge(v_2,v_8,null) ;
  graph.insertDirectedEdge(v_1,v_5,null) ;
  graph.insertDirectedEdge(v_1,v_8,null) ;
  graph.insertDirectedEdge(v_1,v_10,null) ;
  graph.insertDirectedEdge(v_0,v_1,null) ;
  graph.insertDirectedEdge(v_0,v_8,null) ;
  ok_sofar = new SumVertices(graph).doCall().checkResult(new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Entry<Vertex<Integer>,Integer>>(TestUtils.toGenericArray(TestUtils.es_upm_aedlib_map_Entry_refl_cnstr(v_0,40),TestUtils.es_upm_aedlib_map_Entry_refl_cnstr(v_1,40),TestUtils.es_upm_aedlib_map_Entry_refl_cnstr(v_2,40),TestUtils.es_upm_aedlib_map_Entry_refl_cnstr(v_3,40),TestUtils.es_upm_aedlib_map_Entry_refl_cnstr(v_4,47),TestUtils.es_upm_aedlib_map_Entry_refl_cnstr(v_5,40),TestUtils.es_upm_aedlib_map_Entry_refl_cnstr(v_6,40),TestUtils.es_upm_aedlib_map_Entry_refl_cnstr(v_7,40),TestUtils.es_upm_aedlib_map_Entry_refl_cnstr(v_8,40),TestUtils.es_upm_aedlib_map_Entry_refl_cnstr(v_9,41),TestUtils.es_upm_aedlib_map_Entry_refl_cnstr(v_10,40),TestUtils.es_upm_aedlib_map_Entry_refl_cnstr(v_11,40)))) ;
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
    ResultsHandler.stopTest(new String("test_17")) ;
    ResultsHandler.add_result(new String("sumVertices"),resultIs) ;
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
{
  DirectedAdjacencyListGraph<Integer,Integer> graph = new DirectedAdjacencyListGraph<Integer,Integer>() ;
  Vertex<Integer> v_0 = graph.insertVertex(1) ;
  Vertex<Integer> v_1 = graph.insertVertex(1) ;
  Vertex<Integer> v_2 = graph.insertVertex(1) ;
  Vertex<Integer> v_3 = graph.insertVertex(1) ;
  Vertex<Integer> v_4 = graph.insertVertex(1) ;
  Vertex<Integer> v_5 = graph.insertVertex(1) ;
  Vertex<Integer> v_6 = graph.insertVertex(1) ;
  Vertex<Integer> v_7 = graph.insertVertex(1) ;
  Vertex<Integer> v_8 = graph.insertVertex(2) ;
  Vertex<Integer> v_9 = graph.insertVertex(1) ;
  Vertex<Integer> v_10 = graph.insertVertex(2) ;
  Vertex<Integer> v_11 = graph.insertVertex(1) ;
  Vertex<Integer> v_12 = graph.insertVertex(1) ;
  graph.insertDirectedEdge(v_12,v_3,null) ;
  graph.insertDirectedEdge(v_12,v_9,null) ;
  graph.insertDirectedEdge(v_11,v_9,null) ;
  graph.insertDirectedEdge(v_11,v_11,null) ;
  graph.insertDirectedEdge(v_10,v_10,null) ;
  graph.insertDirectedEdge(v_10,v_10,null) ;
  graph.insertDirectedEdge(v_9,v_1,null) ;
  graph.insertDirectedEdge(v_9,v_6,null) ;
  graph.insertDirectedEdge(v_9,v_7,null) ;
  graph.insertDirectedEdge(v_8,v_1,null) ;
  graph.insertDirectedEdge(v_8,v_3,null) ;
  graph.insertDirectedEdge(v_7,v_0,null) ;
  graph.insertDirectedEdge(v_6,v_0,null) ;
  graph.insertDirectedEdge(v_6,v_10,null) ;
  graph.insertDirectedEdge(v_5,v_0,null) ;
  graph.insertDirectedEdge(v_5,v_8,null) ;
  graph.insertDirectedEdge(v_4,v_11,null) ;
  graph.insertDirectedEdge(v_3,v_4,null) ;
  graph.insertDirectedEdge(v_3,v_4,null) ;
  graph.insertDirectedEdge(v_2,v_5,null) ;
  graph.insertDirectedEdge(v_2,v_10,null) ;
  graph.insertDirectedEdge(v_2,v_10,null) ;
  graph.insertDirectedEdge(v_2,v_12,null) ;
  graph.insertDirectedEdge(v_1,v_2,null) ;
  graph.insertDirectedEdge(v_1,v_4,null) ;
  graph.insertDirectedEdge(v_0,v_1,null) ;
  ok_sofar = new SumVertices(graph).doCall().checkResult(new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Entry<Vertex<Integer>,Integer>>(TestUtils.toGenericArray(TestUtils.es_upm_aedlib_map_Entry_refl_cnstr(v_0,15),TestUtils.es_upm_aedlib_map_Entry_refl_cnstr(v_1,15),TestUtils.es_upm_aedlib_map_Entry_refl_cnstr(v_2,15),TestUtils.es_upm_aedlib_map_Entry_refl_cnstr(v_3,15),TestUtils.es_upm_aedlib_map_Entry_refl_cnstr(v_4,15),TestUtils.es_upm_aedlib_map_Entry_refl_cnstr(v_5,15),TestUtils.es_upm_aedlib_map_Entry_refl_cnstr(v_6,15),TestUtils.es_upm_aedlib_map_Entry_refl_cnstr(v_7,15),TestUtils.es_upm_aedlib_map_Entry_refl_cnstr(v_8,15),TestUtils.es_upm_aedlib_map_Entry_refl_cnstr(v_9,15),TestUtils.es_upm_aedlib_map_Entry_refl_cnstr(v_10,2),TestUtils.es_upm_aedlib_map_Entry_refl_cnstr(v_11,15),TestUtils.es_upm_aedlib_map_Entry_refl_cnstr(v_12,15)))) ;
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
    ResultsHandler.stopTest(new String("test_18")) ;
    ResultsHandler.add_result(new String("sumVertices"),resultIs) ;
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
{
  DirectedAdjacencyListGraph<Integer,Integer> graph = new DirectedAdjacencyListGraph<Integer,Integer>() ;
  Vertex<Integer> v_0 = graph.insertVertex(1) ;
  Vertex<Integer> v_1 = graph.insertVertex(1) ;
  Vertex<Integer> v_2 = graph.insertVertex(1) ;
  Vertex<Integer> v_3 = graph.insertVertex(1) ;
  Vertex<Integer> v_4 = graph.insertVertex(2) ;
  Vertex<Integer> v_5 = graph.insertVertex(3) ;
  Vertex<Integer> v_6 = graph.insertVertex(1) ;
  Vertex<Integer> v_7 = graph.insertVertex(2) ;
  Vertex<Integer> v_8 = graph.insertVertex(1) ;
  Vertex<Integer> v_9 = graph.insertVertex(1) ;
  Vertex<Integer> v_10 = graph.insertVertex(1) ;
  Vertex<Integer> v_11 = graph.insertVertex(2) ;
  Vertex<Integer> v_12 = graph.insertVertex(1) ;
  graph.insertDirectedEdge(v_12,v_3,null) ;
  graph.insertDirectedEdge(v_12,v_10,null) ;
  graph.insertDirectedEdge(v_11,v_1,null) ;
  graph.insertDirectedEdge(v_11,v_4,null) ;
  graph.insertDirectedEdge(v_11,v_5,null) ;
  graph.insertDirectedEdge(v_10,v_0,null) ;
  graph.insertDirectedEdge(v_10,v_1,null) ;
  graph.insertDirectedEdge(v_9,v_9,null) ;
  graph.insertDirectedEdge(v_8,v_5,null) ;
  graph.insertDirectedEdge(v_8,v_9,null) ;
  graph.insertDirectedEdge(v_8,v_11,null) ;
  graph.insertDirectedEdge(v_7,v_3,null) ;
  graph.insertDirectedEdge(v_7,v_10,null) ;
  graph.insertDirectedEdge(v_7,v_12,null) ;
  graph.insertDirectedEdge(v_6,v_8,null) ;
  graph.insertDirectedEdge(v_6,v_11,null) ;
  graph.insertDirectedEdge(v_5,v_11,null) ;
  graph.insertDirectedEdge(v_4,v_12,null) ;
  graph.insertDirectedEdge(v_4,v_12,null) ;
  graph.insertDirectedEdge(v_3,v_7,null) ;
  graph.insertDirectedEdge(v_3,v_12,null) ;
  graph.insertDirectedEdge(v_2,v_0,null) ;
  graph.insertDirectedEdge(v_2,v_9,null) ;
  graph.insertDirectedEdge(v_1,v_5,null) ;
  graph.insertDirectedEdge(v_1,v_9,null) ;
  graph.insertDirectedEdge(v_1,v_9,null) ;
  graph.insertDirectedEdge(v_0,v_2,null) ;
  ok_sofar = new SumVertices(graph).doCall().checkResult(new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Entry<Vertex<Integer>,Integer>>(TestUtils.toGenericArray(TestUtils.es_upm_aedlib_map_Entry_refl_cnstr(v_0,3),TestUtils.es_upm_aedlib_map_Entry_refl_cnstr(v_1,16),TestUtils.es_upm_aedlib_map_Entry_refl_cnstr(v_2,3),TestUtils.es_upm_aedlib_map_Entry_refl_cnstr(v_3,16),TestUtils.es_upm_aedlib_map_Entry_refl_cnstr(v_4,16),TestUtils.es_upm_aedlib_map_Entry_refl_cnstr(v_5,16),TestUtils.es_upm_aedlib_map_Entry_refl_cnstr(v_6,18),TestUtils.es_upm_aedlib_map_Entry_refl_cnstr(v_7,16),TestUtils.es_upm_aedlib_map_Entry_refl_cnstr(v_8,17),TestUtils.es_upm_aedlib_map_Entry_refl_cnstr(v_9,1),TestUtils.es_upm_aedlib_map_Entry_refl_cnstr(v_10,16),TestUtils.es_upm_aedlib_map_Entry_refl_cnstr(v_11,16),TestUtils.es_upm_aedlib_map_Entry_refl_cnstr(v_12,16)))) ;
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
    ResultsHandler.stopTest(new String("test_19")) ;
    ResultsHandler.add_result(new String("sumVertices"),resultIs) ;
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
{
  DirectedAdjacencyListGraph<Integer,Integer> graph = new DirectedAdjacencyListGraph<Integer,Integer>() ;
  Vertex<Integer> v_0 = graph.insertVertex(2) ;
  Vertex<Integer> v_1 = graph.insertVertex(1) ;
  Vertex<Integer> v_2 = graph.insertVertex(1) ;
  Vertex<Integer> v_3 = graph.insertVertex(2) ;
  Vertex<Integer> v_4 = graph.insertVertex(2) ;
  Vertex<Integer> v_5 = graph.insertVertex(1) ;
  Vertex<Integer> v_6 = graph.insertVertex(1) ;
  Vertex<Integer> v_7 = graph.insertVertex(1) ;
  Vertex<Integer> v_8 = graph.insertVertex(1) ;
  Vertex<Integer> v_9 = graph.insertVertex(1) ;
  Vertex<Integer> v_10 = graph.insertVertex(1) ;
  Vertex<Integer> v_11 = graph.insertVertex(1) ;
  Vertex<Integer> v_12 = graph.insertVertex(1) ;
  Vertex<Integer> v_13 = graph.insertVertex(2) ;
  graph.insertDirectedEdge(v_13,v_0,null) ;
  graph.insertDirectedEdge(v_13,v_12,null) ;
  graph.insertDirectedEdge(v_12,v_0,null) ;
  graph.insertDirectedEdge(v_11,v_6,null) ;
  graph.insertDirectedEdge(v_11,v_10,null) ;
  graph.insertDirectedEdge(v_11,v_10,null) ;
  graph.insertDirectedEdge(v_10,v_1,null) ;
  graph.insertDirectedEdge(v_10,v_8,null) ;
  graph.insertDirectedEdge(v_10,v_10,null) ;
  graph.insertDirectedEdge(v_9,v_6,null) ;
  graph.insertDirectedEdge(v_9,v_11,null) ;
  graph.insertDirectedEdge(v_8,v_4,null) ;
  graph.insertDirectedEdge(v_7,v_1,null) ;
  graph.insertDirectedEdge(v_7,v_10,null) ;
  graph.insertDirectedEdge(v_6,v_3,null) ;
  graph.insertDirectedEdge(v_6,v_13,null) ;
  graph.insertDirectedEdge(v_5,v_4,null) ;
  graph.insertDirectedEdge(v_5,v_8,null) ;
  graph.insertDirectedEdge(v_5,v_9,null) ;
  graph.insertDirectedEdge(v_4,v_6,null) ;
  graph.insertDirectedEdge(v_3,v_2,null) ;
  graph.insertDirectedEdge(v_3,v_12,null) ;
  graph.insertDirectedEdge(v_2,v_5,null) ;
  graph.insertDirectedEdge(v_1,v_1,null) ;
  graph.insertDirectedEdge(v_1,v_2,null) ;
  graph.insertDirectedEdge(v_1,v_13,null) ;
  graph.insertDirectedEdge(v_0,v_3,null) ;
  graph.insertDirectedEdge(v_0,v_4,null) ;
  ok_sofar = new SumVertices(graph).doCall().checkResult(new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Entry<Vertex<Integer>,Integer>>(TestUtils.toGenericArray(TestUtils.es_upm_aedlib_map_Entry_refl_cnstr(v_0,17),TestUtils.es_upm_aedlib_map_Entry_refl_cnstr(v_1,17),TestUtils.es_upm_aedlib_map_Entry_refl_cnstr(v_2,17),TestUtils.es_upm_aedlib_map_Entry_refl_cnstr(v_3,17),TestUtils.es_upm_aedlib_map_Entry_refl_cnstr(v_4,17),TestUtils.es_upm_aedlib_map_Entry_refl_cnstr(v_5,17),TestUtils.es_upm_aedlib_map_Entry_refl_cnstr(v_6,17),TestUtils.es_upm_aedlib_map_Entry_refl_cnstr(v_7,18),TestUtils.es_upm_aedlib_map_Entry_refl_cnstr(v_8,17),TestUtils.es_upm_aedlib_map_Entry_refl_cnstr(v_9,17),TestUtils.es_upm_aedlib_map_Entry_refl_cnstr(v_10,17),TestUtils.es_upm_aedlib_map_Entry_refl_cnstr(v_11,17),TestUtils.es_upm_aedlib_map_Entry_refl_cnstr(v_12,17),TestUtils.es_upm_aedlib_map_Entry_refl_cnstr(v_13,17)))) ;
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
    ResultsHandler.stopTest(new String("test_20")) ;
    ResultsHandler.add_result(new String("sumVertices"),resultIs) ;
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
{
  DirectedAdjacencyListGraph<Integer,Integer> graph = new DirectedAdjacencyListGraph<Integer,Integer>() ;
  Vertex<Integer> v_0 = graph.insertVertex(3) ;
  Vertex<Integer> v_1 = graph.insertVertex(7) ;
  Vertex<Integer> v_2 = graph.insertVertex(8) ;
  Vertex<Integer> v_3 = graph.insertVertex(8) ;
  Vertex<Integer> v_4 = graph.insertVertex(4) ;
  Vertex<Integer> v_5 = graph.insertVertex(9) ;
  Vertex<Integer> v_6 = graph.insertVertex(9) ;
  Vertex<Integer> v_7 = graph.insertVertex(7) ;
  Vertex<Integer> v_8 = graph.insertVertex(9) ;
  Vertex<Integer> v_9 = graph.insertVertex(8) ;
  Vertex<Integer> v_10 = graph.insertVertex(1) ;
  Vertex<Integer> v_11 = graph.insertVertex(6) ;
  Vertex<Integer> v_12 = graph.insertVertex(8) ;
  Vertex<Integer> v_13 = graph.insertVertex(9) ;
  Vertex<Integer> v_14 = graph.insertVertex(1) ;
  graph.insertDirectedEdge(v_14,v_8,null) ;
  graph.insertDirectedEdge(v_13,v_8,null) ;
  graph.insertDirectedEdge(v_13,v_9,null) ;
  graph.insertDirectedEdge(v_13,v_14,null) ;
  graph.insertDirectedEdge(v_12,v_8,null) ;
  graph.insertDirectedEdge(v_12,v_11,null) ;
  graph.insertDirectedEdge(v_11,v_2,null) ;
  graph.insertDirectedEdge(v_11,v_10,null) ;
  graph.insertDirectedEdge(v_10,v_10,null) ;
  graph.insertDirectedEdge(v_9,v_8,null) ;
  graph.insertDirectedEdge(v_8,v_8,null) ;
  graph.insertDirectedEdge(v_7,v_1,null) ;
  graph.insertDirectedEdge(v_7,v_13,null) ;
  graph.insertDirectedEdge(v_7,v_13,null) ;
  graph.insertDirectedEdge(v_6,v_2,null) ;
  graph.insertDirectedEdge(v_5,v_1,null) ;
  graph.insertDirectedEdge(v_5,v_2,null) ;
  graph.insertDirectedEdge(v_4,v_11,null) ;
  graph.insertDirectedEdge(v_3,v_5,null) ;
  graph.insertDirectedEdge(v_2,v_0,null) ;
  graph.insertDirectedEdge(v_2,v_12,null) ;
  graph.insertDirectedEdge(v_2,v_14,null) ;
  graph.insertDirectedEdge(v_1,v_3,null) ;
  graph.insertDirectedEdge(v_1,v_5,null) ;
  graph.insertDirectedEdge(v_0,v_12,null) ;
  ok_sofar = new SumVertices(graph).doCall().checkResult(new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Entry<Vertex<Integer>,Integer>>(TestUtils.toGenericArray(TestUtils.es_upm_aedlib_map_Entry_refl_cnstr(v_0,36),TestUtils.es_upm_aedlib_map_Entry_refl_cnstr(v_1,60),TestUtils.es_upm_aedlib_map_Entry_refl_cnstr(v_2,36),TestUtils.es_upm_aedlib_map_Entry_refl_cnstr(v_3,60),TestUtils.es_upm_aedlib_map_Entry_refl_cnstr(v_4,40),TestUtils.es_upm_aedlib_map_Entry_refl_cnstr(v_5,60),TestUtils.es_upm_aedlib_map_Entry_refl_cnstr(v_6,45),TestUtils.es_upm_aedlib_map_Entry_refl_cnstr(v_7,84),TestUtils.es_upm_aedlib_map_Entry_refl_cnstr(v_8,9),TestUtils.es_upm_aedlib_map_Entry_refl_cnstr(v_9,17),TestUtils.es_upm_aedlib_map_Entry_refl_cnstr(v_10,1),TestUtils.es_upm_aedlib_map_Entry_refl_cnstr(v_11,36),TestUtils.es_upm_aedlib_map_Entry_refl_cnstr(v_12,36),TestUtils.es_upm_aedlib_map_Entry_refl_cnstr(v_13,27),TestUtils.es_upm_aedlib_map_Entry_refl_cnstr(v_14,10)))) ;
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
    ResultsHandler.stopTest(new String("test_21")) ;
    ResultsHandler.add_result(new String("sumVertices"),resultIs) ;
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
{
  DirectedAdjacencyListGraph<Integer,Integer> graph = new DirectedAdjacencyListGraph<Integer,Integer>() ;
  Vertex<Integer> v_0 = graph.insertVertex(2) ;
  Vertex<Integer> v_1 = graph.insertVertex(2) ;
  Vertex<Integer> v_2 = graph.insertVertex(2) ;
  Vertex<Integer> v_3 = graph.insertVertex(2) ;
  Vertex<Integer> v_4 = graph.insertVertex(1) ;
  Vertex<Integer> v_5 = graph.insertVertex(1) ;
  Vertex<Integer> v_6 = graph.insertVertex(3) ;
  Vertex<Integer> v_7 = graph.insertVertex(2) ;
  Vertex<Integer> v_8 = graph.insertVertex(3) ;
  Vertex<Integer> v_9 = graph.insertVertex(2) ;
  Vertex<Integer> v_10 = graph.insertVertex(3) ;
  Vertex<Integer> v_11 = graph.insertVertex(2) ;
  Vertex<Integer> v_12 = graph.insertVertex(2) ;
  Vertex<Integer> v_13 = graph.insertVertex(1) ;
  Vertex<Integer> v_14 = graph.insertVertex(2) ;
  graph.insertDirectedEdge(v_14,v_8,null) ;
  graph.insertDirectedEdge(v_14,v_9,null) ;
  graph.insertDirectedEdge(v_14,v_11,null) ;
  graph.insertDirectedEdge(v_13,v_1,null) ;
  graph.insertDirectedEdge(v_12,v_4,null) ;
  graph.insertDirectedEdge(v_11,v_11,null) ;
  graph.insertDirectedEdge(v_11,v_13,null) ;
  graph.insertDirectedEdge(v_10,v_14,null) ;
  graph.insertDirectedEdge(v_9,v_9,null) ;
  graph.insertDirectedEdge(v_9,v_14,null) ;
  graph.insertDirectedEdge(v_8,v_3,null) ;
  graph.insertDirectedEdge(v_8,v_6,null) ;
  graph.insertDirectedEdge(v_8,v_9,null) ;
  graph.insertDirectedEdge(v_7,v_0,null) ;
  graph.insertDirectedEdge(v_7,v_2,null) ;
  graph.insertDirectedEdge(v_7,v_7,null) ;
  graph.insertDirectedEdge(v_6,v_0,null) ;
  graph.insertDirectedEdge(v_5,v_11,null) ;
  graph.insertDirectedEdge(v_5,v_14,null) ;
  graph.insertDirectedEdge(v_4,v_9,null) ;
  graph.insertDirectedEdge(v_3,v_4,null) ;
  graph.insertDirectedEdge(v_3,v_5,null) ;
  graph.insertDirectedEdge(v_2,v_7,null) ;
  graph.insertDirectedEdge(v_2,v_9,null) ;
  graph.insertDirectedEdge(v_1,v_10,null) ;
  graph.insertDirectedEdge(v_0,v_0,null) ;
  graph.insertDirectedEdge(v_0,v_9,null) ;
  ok_sofar = new SumVertices(graph).doCall().checkResult(new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Entry<Vertex<Integer>,Integer>>(TestUtils.toGenericArray(TestUtils.es_upm_aedlib_map_Entry_refl_cnstr(v_0,24),TestUtils.es_upm_aedlib_map_Entry_refl_cnstr(v_1,24),TestUtils.es_upm_aedlib_map_Entry_refl_cnstr(v_2,28),TestUtils.es_upm_aedlib_map_Entry_refl_cnstr(v_3,24),TestUtils.es_upm_aedlib_map_Entry_refl_cnstr(v_4,24),TestUtils.es_upm_aedlib_map_Entry_refl_cnstr(v_5,24),TestUtils.es_upm_aedlib_map_Entry_refl_cnstr(v_6,24),TestUtils.es_upm_aedlib_map_Entry_refl_cnstr(v_7,28),TestUtils.es_upm_aedlib_map_Entry_refl_cnstr(v_8,24),TestUtils.es_upm_aedlib_map_Entry_refl_cnstr(v_9,24),TestUtils.es_upm_aedlib_map_Entry_refl_cnstr(v_10,24),TestUtils.es_upm_aedlib_map_Entry_refl_cnstr(v_11,24),TestUtils.es_upm_aedlib_map_Entry_refl_cnstr(v_12,26),TestUtils.es_upm_aedlib_map_Entry_refl_cnstr(v_13,24),TestUtils.es_upm_aedlib_map_Entry_refl_cnstr(v_14,24)))) ;
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
    ResultsHandler.stopTest(new String("test_22")) ;
    ResultsHandler.add_result(new String("sumVertices"),resultIs) ;
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
{
  DirectedAdjacencyListGraph<Integer,Integer> graph = new DirectedAdjacencyListGraph<Integer,Integer>() ;
  Vertex<Integer> v_0 = graph.insertVertex(2) ;
  Vertex<Integer> v_1 = graph.insertVertex(1) ;
  Vertex<Integer> v_2 = graph.insertVertex(1) ;
  Vertex<Integer> v_3 = graph.insertVertex(1) ;
  Vertex<Integer> v_4 = graph.insertVertex(2) ;
  Vertex<Integer> v_5 = graph.insertVertex(2) ;
  Vertex<Integer> v_6 = graph.insertVertex(2) ;
  Vertex<Integer> v_7 = graph.insertVertex(1) ;
  Vertex<Integer> v_8 = graph.insertVertex(1) ;
  Vertex<Integer> v_9 = graph.insertVertex(2) ;
  Vertex<Integer> v_10 = graph.insertVertex(1) ;
  Vertex<Integer> v_11 = graph.insertVertex(4) ;
  Vertex<Integer> v_12 = graph.insertVertex(2) ;
  Vertex<Integer> v_13 = graph.insertVertex(3) ;
  Vertex<Integer> v_14 = graph.insertVertex(2) ;
  Vertex<Integer> v_15 = graph.insertVertex(1) ;
  Vertex<Integer> v_16 = graph.insertVertex(1) ;
  graph.insertDirectedEdge(v_16,v_15,null) ;
  graph.insertDirectedEdge(v_15,v_1,null) ;
  graph.insertDirectedEdge(v_15,v_5,null) ;
  graph.insertDirectedEdge(v_15,v_15,null) ;
  graph.insertDirectedEdge(v_14,v_9,null) ;
  graph.insertDirectedEdge(v_14,v_12,null) ;
  graph.insertDirectedEdge(v_14,v_15,null) ;
  graph.insertDirectedEdge(v_13,v_8,null) ;
  graph.insertDirectedEdge(v_13,v_12,null) ;
  graph.insertDirectedEdge(v_13,v_15,null) ;
  graph.insertDirectedEdge(v_12,v_12,null) ;
  graph.insertDirectedEdge(v_11,v_2,null) ;
  graph.insertDirectedEdge(v_11,v_2,null) ;
  graph.insertDirectedEdge(v_10,v_12,null) ;
  graph.insertDirectedEdge(v_10,v_12,null) ;
  graph.insertDirectedEdge(v_9,v_4,null) ;
  graph.insertDirectedEdge(v_9,v_10,null) ;
  graph.insertDirectedEdge(v_8,v_0,null) ;
  graph.insertDirectedEdge(v_8,v_0,null) ;
  graph.insertDirectedEdge(v_7,v_0,null) ;
  graph.insertDirectedEdge(v_7,v_1,null) ;
  graph.insertDirectedEdge(v_7,v_5,null) ;
  graph.insertDirectedEdge(v_6,v_2,null) ;
  graph.insertDirectedEdge(v_5,v_10,null) ;
  graph.insertDirectedEdge(v_5,v_16,null) ;
  graph.insertDirectedEdge(v_4,v_0,null) ;
  graph.insertDirectedEdge(v_3,v_5,null) ;
  graph.insertDirectedEdge(v_2,v_1,null) ;
  graph.insertDirectedEdge(v_2,v_5,null) ;
  graph.insertDirectedEdge(v_2,v_16,null) ;
  graph.insertDirectedEdge(v_1,v_1,null) ;
  graph.insertDirectedEdge(v_1,v_4,null) ;
  graph.insertDirectedEdge(v_0,v_13,null) ;
  graph.insertDirectedEdge(v_0,v_14,null) ;
  ok_sofar = new SumVertices(graph).doCall().checkResult(new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Entry<Vertex<Integer>,Integer>>(TestUtils.toGenericArray(TestUtils.es_upm_aedlib_map_Entry_refl_cnstr(v_0,20),TestUtils.es_upm_aedlib_map_Entry_refl_cnstr(v_1,20),TestUtils.es_upm_aedlib_map_Entry_refl_cnstr(v_2,21),TestUtils.es_upm_aedlib_map_Entry_refl_cnstr(v_3,21),TestUtils.es_upm_aedlib_map_Entry_refl_cnstr(v_4,20),TestUtils.es_upm_aedlib_map_Entry_refl_cnstr(v_5,20),TestUtils.es_upm_aedlib_map_Entry_refl_cnstr(v_6,23),TestUtils.es_upm_aedlib_map_Entry_refl_cnstr(v_7,21),TestUtils.es_upm_aedlib_map_Entry_refl_cnstr(v_8,20),TestUtils.es_upm_aedlib_map_Entry_refl_cnstr(v_9,20),TestUtils.es_upm_aedlib_map_Entry_refl_cnstr(v_10,3),TestUtils.es_upm_aedlib_map_Entry_refl_cnstr(v_11,25),TestUtils.es_upm_aedlib_map_Entry_refl_cnstr(v_12,2),TestUtils.es_upm_aedlib_map_Entry_refl_cnstr(v_13,20),TestUtils.es_upm_aedlib_map_Entry_refl_cnstr(v_14,20),TestUtils.es_upm_aedlib_map_Entry_refl_cnstr(v_15,20),TestUtils.es_upm_aedlib_map_Entry_refl_cnstr(v_16,20)))) ;
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
    ResultsHandler.stopTest(new String("test_23")) ;
    ResultsHandler.add_result(new String("sumVertices"),resultIs) ;
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
{
  DirectedAdjacencyListGraph<Integer,Integer> graph = new DirectedAdjacencyListGraph<Integer,Integer>() ;
  Vertex<Integer> v_0 = graph.insertVertex(4) ;
  Vertex<Integer> v_1 = graph.insertVertex(5) ;
  Vertex<Integer> v_2 = graph.insertVertex(4) ;
  Vertex<Integer> v_3 = graph.insertVertex(3) ;
  Vertex<Integer> v_4 = graph.insertVertex(1) ;
  Vertex<Integer> v_5 = graph.insertVertex(2) ;
  Vertex<Integer> v_6 = graph.insertVertex(3) ;
  Vertex<Integer> v_7 = graph.insertVertex(3) ;
  Vertex<Integer> v_8 = graph.insertVertex(3) ;
  Vertex<Integer> v_9 = graph.insertVertex(7) ;
  Vertex<Integer> v_10 = graph.insertVertex(7) ;
  Vertex<Integer> v_11 = graph.insertVertex(6) ;
  Vertex<Integer> v_12 = graph.insertVertex(7) ;
  Vertex<Integer> v_13 = graph.insertVertex(7) ;
  Vertex<Integer> v_14 = graph.insertVertex(2) ;
  Vertex<Integer> v_15 = graph.insertVertex(7) ;
  Vertex<Integer> v_16 = graph.insertVertex(1) ;
  graph.insertDirectedEdge(v_16,v_0,null) ;
  graph.insertDirectedEdge(v_15,v_10,null) ;
  graph.insertDirectedEdge(v_14,v_9,null) ;
  graph.insertDirectedEdge(v_14,v_14,null) ;
  graph.insertDirectedEdge(v_14,v_14,null) ;
  graph.insertDirectedEdge(v_13,v_12,null) ;
  graph.insertDirectedEdge(v_13,v_13,null) ;
  graph.insertDirectedEdge(v_12,v_1,null) ;
  graph.insertDirectedEdge(v_12,v_10,null) ;
  graph.insertDirectedEdge(v_11,v_8,null) ;
  graph.insertDirectedEdge(v_11,v_14,null) ;
  graph.insertDirectedEdge(v_10,v_1,null) ;
  graph.insertDirectedEdge(v_10,v_7,null) ;
  graph.insertDirectedEdge(v_9,v_12,null) ;
  graph.insertDirectedEdge(v_9,v_12,null) ;
  graph.insertDirectedEdge(v_8,v_1,null) ;
  graph.insertDirectedEdge(v_8,v_2,null) ;
  graph.insertDirectedEdge(v_8,v_5,null) ;
  graph.insertDirectedEdge(v_7,v_2,null) ;
  graph.insertDirectedEdge(v_7,v_5,null) ;
  graph.insertDirectedEdge(v_7,v_7,null) ;
  graph.insertDirectedEdge(v_6,v_5,null) ;
  graph.insertDirectedEdge(v_6,v_5,null) ;
  graph.insertDirectedEdge(v_6,v_11,null) ;
  graph.insertDirectedEdge(v_6,v_16,null) ;
  graph.insertDirectedEdge(v_5,v_8,null) ;
  graph.insertDirectedEdge(v_5,v_16,null) ;
  graph.insertDirectedEdge(v_4,v_4,null) ;
  graph.insertDirectedEdge(v_4,v_14,null) ;
  graph.insertDirectedEdge(v_4,v_15,null) ;
  graph.insertDirectedEdge(v_3,v_9,null) ;
  graph.insertDirectedEdge(v_3,v_10,null) ;
  graph.insertDirectedEdge(v_2,v_11,null) ;
  graph.insertDirectedEdge(v_1,v_4,null) ;
  graph.insertDirectedEdge(v_1,v_8,null) ;
  graph.insertDirectedEdge(v_1,v_14,null) ;
  graph.insertDirectedEdge(v_0,v_16,null) ;
  ok_sofar = new SumVertices(graph).doCall().checkResult(new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Entry<Vertex<Integer>,Integer>>(TestUtils.toGenericArray(TestUtils.es_upm_aedlib_map_Entry_refl_cnstr(v_0,5),TestUtils.es_upm_aedlib_map_Entry_refl_cnstr(v_1,59),TestUtils.es_upm_aedlib_map_Entry_refl_cnstr(v_2,59),TestUtils.es_upm_aedlib_map_Entry_refl_cnstr(v_3,62),TestUtils.es_upm_aedlib_map_Entry_refl_cnstr(v_4,59),TestUtils.es_upm_aedlib_map_Entry_refl_cnstr(v_5,59),TestUtils.es_upm_aedlib_map_Entry_refl_cnstr(v_6,62),TestUtils.es_upm_aedlib_map_Entry_refl_cnstr(v_7,59),TestUtils.es_upm_aedlib_map_Entry_refl_cnstr(v_8,59),TestUtils.es_upm_aedlib_map_Entry_refl_cnstr(v_9,59),TestUtils.es_upm_aedlib_map_Entry_refl_cnstr(v_10,59),TestUtils.es_upm_aedlib_map_Entry_refl_cnstr(v_11,59),TestUtils.es_upm_aedlib_map_Entry_refl_cnstr(v_12,59),TestUtils.es_upm_aedlib_map_Entry_refl_cnstr(v_13,66),TestUtils.es_upm_aedlib_map_Entry_refl_cnstr(v_14,59),TestUtils.es_upm_aedlib_map_Entry_refl_cnstr(v_15,59),TestUtils.es_upm_aedlib_map_Entry_refl_cnstr(v_16,5)))) ;
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
    ResultsHandler.stopTest(new String("test_24")) ;
    ResultsHandler.add_result(new String("sumVertices"),resultIs) ;
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
{
  DirectedAdjacencyListGraph<Integer,Integer> graph = new DirectedAdjacencyListGraph<Integer,Integer>() ;
  Vertex<Integer> v_0 = graph.insertVertex(2) ;
  Vertex<Integer> v_1 = graph.insertVertex(3) ;
  Vertex<Integer> v_2 = graph.insertVertex(1) ;
  Vertex<Integer> v_3 = graph.insertVertex(1) ;
  Vertex<Integer> v_4 = graph.insertVertex(5) ;
  Vertex<Integer> v_5 = graph.insertVertex(1) ;
  Vertex<Integer> v_6 = graph.insertVertex(2) ;
  Vertex<Integer> v_7 = graph.insertVertex(2) ;
  Vertex<Integer> v_8 = graph.insertVertex(4) ;
  Vertex<Integer> v_9 = graph.insertVertex(2) ;
  Vertex<Integer> v_10 = graph.insertVertex(1) ;
  Vertex<Integer> v_11 = graph.insertVertex(1) ;
  Vertex<Integer> v_12 = graph.insertVertex(1) ;
  Vertex<Integer> v_13 = graph.insertVertex(1) ;
  Vertex<Integer> v_14 = graph.insertVertex(1) ;
  Vertex<Integer> v_15 = graph.insertVertex(1) ;
  Vertex<Integer> v_16 = graph.insertVertex(1) ;
  graph.insertDirectedEdge(v_16,v_5,null) ;
  graph.insertDirectedEdge(v_16,v_9,null) ;
  graph.insertDirectedEdge(v_16,v_14,null) ;
  graph.insertDirectedEdge(v_15,v_1,null) ;
  graph.insertDirectedEdge(v_15,v_4,null) ;
  graph.insertDirectedEdge(v_15,v_6,null) ;
  graph.insertDirectedEdge(v_14,v_1,null) ;
  graph.insertDirectedEdge(v_14,v_7,null) ;
  graph.insertDirectedEdge(v_14,v_12,null) ;
  graph.insertDirectedEdge(v_13,v_1,null) ;
  graph.insertDirectedEdge(v_13,v_13,null) ;
  graph.insertDirectedEdge(v_12,v_2,null) ;
  graph.insertDirectedEdge(v_12,v_5,null) ;
  graph.insertDirectedEdge(v_12,v_15,null) ;
  graph.insertDirectedEdge(v_11,v_4,null) ;
  graph.insertDirectedEdge(v_11,v_13,null) ;
  graph.insertDirectedEdge(v_10,v_10,null) ;
  graph.insertDirectedEdge(v_10,v_14,null) ;
  graph.insertDirectedEdge(v_10,v_15,null) ;
  graph.insertDirectedEdge(v_10,v_15,null) ;
  graph.insertDirectedEdge(v_9,v_3,null) ;
  graph.insertDirectedEdge(v_9,v_14,null) ;
  graph.insertDirectedEdge(v_8,v_0,null) ;
  graph.insertDirectedEdge(v_8,v_9,null) ;
  graph.insertDirectedEdge(v_8,v_16,null) ;
  graph.insertDirectedEdge(v_7,v_0,null) ;
  graph.insertDirectedEdge(v_7,v_11,null) ;
  graph.insertDirectedEdge(v_6,v_13,null) ;
  graph.insertDirectedEdge(v_5,v_0,null) ;
  graph.insertDirectedEdge(v_4,v_2,null) ;
  graph.insertDirectedEdge(v_4,v_7,null) ;
  graph.insertDirectedEdge(v_3,v_11,null) ;
  graph.insertDirectedEdge(v_2,v_9,null) ;
  graph.insertDirectedEdge(v_2,v_14,null) ;
  graph.insertDirectedEdge(v_1,v_14,null) ;
  graph.insertDirectedEdge(v_0,v_0,null) ;
  graph.insertDirectedEdge(v_0,v_12,null) ;
  graph.insertDirectedEdge(v_0,v_13,null) ;
  ok_sofar = new SumVertices(graph).doCall().checkResult(new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Entry<Vertex<Integer>,Integer>>(TestUtils.toGenericArray(TestUtils.es_upm_aedlib_map_Entry_refl_cnstr(v_0,24),TestUtils.es_upm_aedlib_map_Entry_refl_cnstr(v_1,24),TestUtils.es_upm_aedlib_map_Entry_refl_cnstr(v_2,24),TestUtils.es_upm_aedlib_map_Entry_refl_cnstr(v_3,24),TestUtils.es_upm_aedlib_map_Entry_refl_cnstr(v_4,24),TestUtils.es_upm_aedlib_map_Entry_refl_cnstr(v_5,24),TestUtils.es_upm_aedlib_map_Entry_refl_cnstr(v_6,24),TestUtils.es_upm_aedlib_map_Entry_refl_cnstr(v_7,24),TestUtils.es_upm_aedlib_map_Entry_refl_cnstr(v_8,29),TestUtils.es_upm_aedlib_map_Entry_refl_cnstr(v_9,24),TestUtils.es_upm_aedlib_map_Entry_refl_cnstr(v_10,25),TestUtils.es_upm_aedlib_map_Entry_refl_cnstr(v_11,24),TestUtils.es_upm_aedlib_map_Entry_refl_cnstr(v_12,24),TestUtils.es_upm_aedlib_map_Entry_refl_cnstr(v_13,24),TestUtils.es_upm_aedlib_map_Entry_refl_cnstr(v_14,24),TestUtils.es_upm_aedlib_map_Entry_refl_cnstr(v_15,24),TestUtils.es_upm_aedlib_map_Entry_refl_cnstr(v_16,25)))) ;
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
    ResultsHandler.stopTest(new String("test_25")) ;
    ResultsHandler.add_result(new String("sumVertices"),resultIs) ;
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
{
  DirectedAdjacencyListGraph<Integer,Integer> graph = new DirectedAdjacencyListGraph<Integer,Integer>() ;
  Vertex<Integer> v_0 = graph.insertVertex(3) ;
  Vertex<Integer> v_1 = graph.insertVertex(2) ;
  Vertex<Integer> v_2 = graph.insertVertex(2) ;
  Vertex<Integer> v_3 = graph.insertVertex(2) ;
  Vertex<Integer> v_4 = graph.insertVertex(1) ;
  Vertex<Integer> v_5 = graph.insertVertex(2) ;
  Vertex<Integer> v_6 = graph.insertVertex(2) ;
  Vertex<Integer> v_7 = graph.insertVertex(1) ;
  Vertex<Integer> v_8 = graph.insertVertex(3) ;
  Vertex<Integer> v_9 = graph.insertVertex(2) ;
  Vertex<Integer> v_10 = graph.insertVertex(3) ;
  Vertex<Integer> v_11 = graph.insertVertex(2) ;
  Vertex<Integer> v_12 = graph.insertVertex(3) ;
  Vertex<Integer> v_13 = graph.insertVertex(4) ;
  Vertex<Integer> v_14 = graph.insertVertex(1) ;
  Vertex<Integer> v_15 = graph.insertVertex(3) ;
  Vertex<Integer> v_16 = graph.insertVertex(1) ;
  Vertex<Integer> v_17 = graph.insertVertex(1) ;
  graph.insertDirectedEdge(v_17,v_6,null) ;
  graph.insertDirectedEdge(v_16,v_2,null) ;
  graph.insertDirectedEdge(v_15,v_7,null) ;
  graph.insertDirectedEdge(v_14,v_1,null) ;
  graph.insertDirectedEdge(v_14,v_9,null) ;
  graph.insertDirectedEdge(v_13,v_13,null) ;
  graph.insertDirectedEdge(v_13,v_14,null) ;
  graph.insertDirectedEdge(v_12,v_13,null) ;
  graph.insertDirectedEdge(v_12,v_17,null) ;
  graph.insertDirectedEdge(v_11,v_6,null) ;
  graph.insertDirectedEdge(v_11,v_8,null) ;
  graph.insertDirectedEdge(v_11,v_14,null) ;
  graph.insertDirectedEdge(v_10,v_0,null) ;
  graph.insertDirectedEdge(v_10,v_1,null) ;
  graph.insertDirectedEdge(v_10,v_13,null) ;
  graph.insertDirectedEdge(v_9,v_0,null) ;
  graph.insertDirectedEdge(v_8,v_2,null) ;
  graph.insertDirectedEdge(v_7,v_7,null) ;
  graph.insertDirectedEdge(v_6,v_7,null) ;
  graph.insertDirectedEdge(v_5,v_9,null) ;
  graph.insertDirectedEdge(v_5,v_13,null) ;
  graph.insertDirectedEdge(v_4,v_0,null) ;
  graph.insertDirectedEdge(v_4,v_8,null) ;
  graph.insertDirectedEdge(v_4,v_17,null) ;
  graph.insertDirectedEdge(v_3,v_5,null) ;
  graph.insertDirectedEdge(v_3,v_7,null) ;
  graph.insertDirectedEdge(v_2,v_1,null) ;
  graph.insertDirectedEdge(v_2,v_3,null) ;
  graph.insertDirectedEdge(v_2,v_10,null) ;
  graph.insertDirectedEdge(v_1,v_10,null) ;
  graph.insertDirectedEdge(v_0,v_14,null) ;
  graph.insertDirectedEdge(v_0,v_16,null) ;
  ok_sofar = new SumVertices(graph).doCall().checkResult(new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Entry<Vertex<Integer>,Integer>>(TestUtils.toGenericArray(TestUtils.es_upm_aedlib_map_Entry_refl_cnstr(v_0,23),TestUtils.es_upm_aedlib_map_Entry_refl_cnstr(v_1,23),TestUtils.es_upm_aedlib_map_Entry_refl_cnstr(v_2,23),TestUtils.es_upm_aedlib_map_Entry_refl_cnstr(v_3,23),TestUtils.es_upm_aedlib_map_Entry_refl_cnstr(v_4,30),TestUtils.es_upm_aedlib_map_Entry_refl_cnstr(v_5,23),TestUtils.es_upm_aedlib_map_Entry_refl_cnstr(v_6,3),TestUtils.es_upm_aedlib_map_Entry_refl_cnstr(v_7,1),TestUtils.es_upm_aedlib_map_Entry_refl_cnstr(v_8,26),TestUtils.es_upm_aedlib_map_Entry_refl_cnstr(v_9,23),TestUtils.es_upm_aedlib_map_Entry_refl_cnstr(v_10,23),TestUtils.es_upm_aedlib_map_Entry_refl_cnstr(v_11,30),TestUtils.es_upm_aedlib_map_Entry_refl_cnstr(v_12,29),TestUtils.es_upm_aedlib_map_Entry_refl_cnstr(v_13,23),TestUtils.es_upm_aedlib_map_Entry_refl_cnstr(v_14,23),TestUtils.es_upm_aedlib_map_Entry_refl_cnstr(v_15,4),TestUtils.es_upm_aedlib_map_Entry_refl_cnstr(v_16,23),TestUtils.es_upm_aedlib_map_Entry_refl_cnstr(v_17,4)))) ;
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
    ResultsHandler.stopTest(new String("test_26")) ;
    ResultsHandler.add_result(new String("sumVertices"),resultIs) ;
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
{
  DirectedAdjacencyListGraph<Integer,Integer> graph = new DirectedAdjacencyListGraph<Integer,Integer>() ;
  Vertex<Integer> v_0 = graph.insertVertex(2) ;
  Vertex<Integer> v_1 = graph.insertVertex(1) ;
  Vertex<Integer> v_2 = graph.insertVertex(1) ;
  Vertex<Integer> v_3 = graph.insertVertex(2) ;
  Vertex<Integer> v_4 = graph.insertVertex(1) ;
  Vertex<Integer> v_5 = graph.insertVertex(1) ;
  Vertex<Integer> v_6 = graph.insertVertex(2) ;
  Vertex<Integer> v_7 = graph.insertVertex(1) ;
  Vertex<Integer> v_8 = graph.insertVertex(1) ;
  Vertex<Integer> v_9 = graph.insertVertex(2) ;
  Vertex<Integer> v_10 = graph.insertVertex(1) ;
  Vertex<Integer> v_11 = graph.insertVertex(1) ;
  Vertex<Integer> v_12 = graph.insertVertex(4) ;
  Vertex<Integer> v_13 = graph.insertVertex(1) ;
  Vertex<Integer> v_14 = graph.insertVertex(2) ;
  Vertex<Integer> v_15 = graph.insertVertex(1) ;
  Vertex<Integer> v_16 = graph.insertVertex(1) ;
  Vertex<Integer> v_17 = graph.insertVertex(1) ;
  graph.insertDirectedEdge(v_17,v_5,null) ;
  graph.insertDirectedEdge(v_17,v_5,null) ;
  graph.insertDirectedEdge(v_17,v_15,null) ;
  graph.insertDirectedEdge(v_16,v_6,null) ;
  graph.insertDirectedEdge(v_15,v_3,null) ;
  graph.insertDirectedEdge(v_15,v_14,null) ;
  graph.insertDirectedEdge(v_14,v_6,null) ;
  graph.insertDirectedEdge(v_14,v_9,null) ;
  graph.insertDirectedEdge(v_14,v_14,null) ;
  graph.insertDirectedEdge(v_13,v_2,null) ;
  graph.insertDirectedEdge(v_13,v_10,null) ;
  graph.insertDirectedEdge(v_13,v_11,null) ;
  graph.insertDirectedEdge(v_12,v_4,null) ;
  graph.insertDirectedEdge(v_11,v_4,null) ;
  graph.insertDirectedEdge(v_10,v_12,null) ;
  graph.insertDirectedEdge(v_10,v_14,null) ;
  graph.insertDirectedEdge(v_9,v_3,null) ;
  graph.insertDirectedEdge(v_9,v_14,null) ;
  graph.insertDirectedEdge(v_8,v_12,null) ;
  graph.insertDirectedEdge(v_8,v_17,null) ;
  graph.insertDirectedEdge(v_7,v_0,null) ;
  graph.insertDirectedEdge(v_7,v_13,null) ;
  graph.insertDirectedEdge(v_7,v_15,null) ;
  graph.insertDirectedEdge(v_6,v_0,null) ;
  graph.insertDirectedEdge(v_5,v_4,null) ;
  graph.insertDirectedEdge(v_5,v_13,null) ;
  graph.insertDirectedEdge(v_4,v_1,null) ;
  graph.insertDirectedEdge(v_4,v_3,null) ;
  graph.insertDirectedEdge(v_4,v_15,null) ;
  graph.insertDirectedEdge(v_3,v_5,null) ;
  graph.insertDirectedEdge(v_3,v_11,null) ;
  graph.insertDirectedEdge(v_3,v_17,null) ;
  graph.insertDirectedEdge(v_3,v_17,null) ;
  graph.insertDirectedEdge(v_2,v_12,null) ;
  graph.insertDirectedEdge(v_1,v_9,null) ;
  graph.insertDirectedEdge(v_1,v_13,null) ;
  graph.insertDirectedEdge(v_0,v_0,null) ;
  ok_sofar = new SumVertices(graph).doCall().checkResult(new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Entry<Vertex<Integer>,Integer>>(TestUtils.toGenericArray(TestUtils.es_upm_aedlib_map_Entry_refl_cnstr(v_0,2),TestUtils.es_upm_aedlib_map_Entry_refl_cnstr(v_1,23),TestUtils.es_upm_aedlib_map_Entry_refl_cnstr(v_2,23),TestUtils.es_upm_aedlib_map_Entry_refl_cnstr(v_3,23),TestUtils.es_upm_aedlib_map_Entry_refl_cnstr(v_4,23),TestUtils.es_upm_aedlib_map_Entry_refl_cnstr(v_5,23),TestUtils.es_upm_aedlib_map_Entry_refl_cnstr(v_6,4),TestUtils.es_upm_aedlib_map_Entry_refl_cnstr(v_7,24),TestUtils.es_upm_aedlib_map_Entry_refl_cnstr(v_8,24),TestUtils.es_upm_aedlib_map_Entry_refl_cnstr(v_9,23),TestUtils.es_upm_aedlib_map_Entry_refl_cnstr(v_10,23),TestUtils.es_upm_aedlib_map_Entry_refl_cnstr(v_11,23),TestUtils.es_upm_aedlib_map_Entry_refl_cnstr(v_12,23),TestUtils.es_upm_aedlib_map_Entry_refl_cnstr(v_13,23),TestUtils.es_upm_aedlib_map_Entry_refl_cnstr(v_14,23),TestUtils.es_upm_aedlib_map_Entry_refl_cnstr(v_15,23),TestUtils.es_upm_aedlib_map_Entry_refl_cnstr(v_16,5),TestUtils.es_upm_aedlib_map_Entry_refl_cnstr(v_17,23)))) ;
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
    ResultsHandler.stopTest(new String("test_27")) ;
    ResultsHandler.add_result(new String("sumVertices"),resultIs) ;
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
{
  DirectedAdjacencyListGraph<Integer,Integer> graph = new DirectedAdjacencyListGraph<Integer,Integer>() ;
  Vertex<Integer> v_0 = graph.insertVertex(1) ;
  Vertex<Integer> v_1 = graph.insertVertex(2) ;
  Vertex<Integer> v_2 = graph.insertVertex(3) ;
  Vertex<Integer> v_3 = graph.insertVertex(3) ;
  Vertex<Integer> v_4 = graph.insertVertex(4) ;
  Vertex<Integer> v_5 = graph.insertVertex(1) ;
  Vertex<Integer> v_6 = graph.insertVertex(2) ;
  Vertex<Integer> v_7 = graph.insertVertex(2) ;
  Vertex<Integer> v_8 = graph.insertVertex(4) ;
  Vertex<Integer> v_9 = graph.insertVertex(5) ;
  Vertex<Integer> v_10 = graph.insertVertex(2) ;
  Vertex<Integer> v_11 = graph.insertVertex(3) ;
  Vertex<Integer> v_12 = graph.insertVertex(3) ;
  Vertex<Integer> v_13 = graph.insertVertex(3) ;
  Vertex<Integer> v_14 = graph.insertVertex(1) ;
  Vertex<Integer> v_15 = graph.insertVertex(4) ;
  Vertex<Integer> v_16 = graph.insertVertex(1) ;
  Vertex<Integer> v_17 = graph.insertVertex(4) ;
  Vertex<Integer> v_18 = graph.insertVertex(3) ;
  Vertex<Integer> v_19 = graph.insertVertex(4) ;
  graph.insertDirectedEdge(v_19,v_17,null) ;
  graph.insertDirectedEdge(v_18,v_6,null) ;
  graph.insertDirectedEdge(v_18,v_10,null) ;
  graph.insertDirectedEdge(v_17,v_0,null) ;
  graph.insertDirectedEdge(v_16,v_15,null) ;
  graph.insertDirectedEdge(v_16,v_19,null) ;
  graph.insertDirectedEdge(v_15,v_9,null) ;
  graph.insertDirectedEdge(v_14,v_5,null) ;
  graph.insertDirectedEdge(v_14,v_17,null) ;
  graph.insertDirectedEdge(v_13,v_5,null) ;
  graph.insertDirectedEdge(v_12,v_5,null) ;
  graph.insertDirectedEdge(v_11,v_19,null) ;
  graph.insertDirectedEdge(v_10,v_6,null) ;
  graph.insertDirectedEdge(v_9,v_15,null) ;
  graph.insertDirectedEdge(v_8,v_3,null) ;
  graph.insertDirectedEdge(v_8,v_6,null) ;
  graph.insertDirectedEdge(v_8,v_7,null) ;
  graph.insertDirectedEdge(v_7,v_7,null) ;
  graph.insertDirectedEdge(v_6,v_0,null) ;
  graph.insertDirectedEdge(v_5,v_3,null) ;
  graph.insertDirectedEdge(v_5,v_5,null) ;
  graph.insertDirectedEdge(v_5,v_10,null) ;
  graph.insertDirectedEdge(v_4,v_0,null) ;
  graph.insertDirectedEdge(v_4,v_10,null) ;
  graph.insertDirectedEdge(v_4,v_19,null) ;
  graph.insertDirectedEdge(v_3,v_2,null) ;
  graph.insertDirectedEdge(v_3,v_14,null) ;
  graph.insertDirectedEdge(v_2,v_4,null) ;
  graph.insertDirectedEdge(v_2,v_6,null) ;
  graph.insertDirectedEdge(v_2,v_10,null) ;
  graph.insertDirectedEdge(v_1,v_9,null) ;
  graph.insertDirectedEdge(v_1,v_13,null) ;
  graph.insertDirectedEdge(v_0,v_8,null) ;
  graph.insertDirectedEdge(v_0,v_16,null) ;
  graph.insertDirectedEdge(v_0,v_16,null) ;
  ok_sofar = new SumVertices(graph).doCall().checkResult(new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Entry<Vertex<Integer>,Integer>>(TestUtils.toGenericArray(TestUtils.es_upm_aedlib_map_Entry_refl_cnstr(v_0,41),TestUtils.es_upm_aedlib_map_Entry_refl_cnstr(v_1,46),TestUtils.es_upm_aedlib_map_Entry_refl_cnstr(v_2,41),TestUtils.es_upm_aedlib_map_Entry_refl_cnstr(v_3,41),TestUtils.es_upm_aedlib_map_Entry_refl_cnstr(v_4,41),TestUtils.es_upm_aedlib_map_Entry_refl_cnstr(v_5,41),TestUtils.es_upm_aedlib_map_Entry_refl_cnstr(v_6,41),TestUtils.es_upm_aedlib_map_Entry_refl_cnstr(v_7,2),TestUtils.es_upm_aedlib_map_Entry_refl_cnstr(v_8,41),TestUtils.es_upm_aedlib_map_Entry_refl_cnstr(v_9,9),TestUtils.es_upm_aedlib_map_Entry_refl_cnstr(v_10,41),TestUtils.es_upm_aedlib_map_Entry_refl_cnstr(v_11,44),TestUtils.es_upm_aedlib_map_Entry_refl_cnstr(v_12,44),TestUtils.es_upm_aedlib_map_Entry_refl_cnstr(v_13,44),TestUtils.es_upm_aedlib_map_Entry_refl_cnstr(v_14,41),TestUtils.es_upm_aedlib_map_Entry_refl_cnstr(v_15,9),TestUtils.es_upm_aedlib_map_Entry_refl_cnstr(v_16,41),TestUtils.es_upm_aedlib_map_Entry_refl_cnstr(v_17,41),TestUtils.es_upm_aedlib_map_Entry_refl_cnstr(v_18,44),TestUtils.es_upm_aedlib_map_Entry_refl_cnstr(v_19,41)))) ;
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
    ResultsHandler.stopTest(new String("test_28")) ;
    ResultsHandler.add_result(new String("sumVertices"),resultIs) ;
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
{
  DirectedAdjacencyListGraph<Integer,Integer> graph = new DirectedAdjacencyListGraph<Integer,Integer>() ;
  Vertex<Integer> v_0 = graph.insertVertex(1) ;
  Vertex<Integer> v_1 = graph.insertVertex(6) ;
  Vertex<Integer> v_2 = graph.insertVertex(6) ;
  Vertex<Integer> v_3 = graph.insertVertex(6) ;
  Vertex<Integer> v_4 = graph.insertVertex(6) ;
  Vertex<Integer> v_5 = graph.insertVertex(1) ;
  Vertex<Integer> v_6 = graph.insertVertex(1) ;
  Vertex<Integer> v_7 = graph.insertVertex(5) ;
  Vertex<Integer> v_8 = graph.insertVertex(3) ;
  Vertex<Integer> v_9 = graph.insertVertex(5) ;
  Vertex<Integer> v_10 = graph.insertVertex(6) ;
  Vertex<Integer> v_11 = graph.insertVertex(5) ;
  Vertex<Integer> v_12 = graph.insertVertex(1) ;
  Vertex<Integer> v_13 = graph.insertVertex(6) ;
  Vertex<Integer> v_14 = graph.insertVertex(7) ;
  Vertex<Integer> v_15 = graph.insertVertex(1) ;
  Vertex<Integer> v_16 = graph.insertVertex(4) ;
  Vertex<Integer> v_17 = graph.insertVertex(2) ;
  Vertex<Integer> v_18 = graph.insertVertex(7) ;
  Vertex<Integer> v_19 = graph.insertVertex(6) ;
  graph.insertDirectedEdge(v_19,v_18,null) ;
  graph.insertDirectedEdge(v_18,v_1,null) ;
  graph.insertDirectedEdge(v_18,v_6,null) ;
  graph.insertDirectedEdge(v_17,v_5,null) ;
  graph.insertDirectedEdge(v_17,v_6,null) ;
  graph.insertDirectedEdge(v_17,v_7,null) ;
  graph.insertDirectedEdge(v_16,v_18,null) ;
  graph.insertDirectedEdge(v_15,v_14,null) ;
  graph.insertDirectedEdge(v_15,v_17,null) ;
  graph.insertDirectedEdge(v_14,v_10,null) ;
  graph.insertDirectedEdge(v_14,v_16,null) ;
  graph.insertDirectedEdge(v_13,v_6,null) ;
  graph.insertDirectedEdge(v_13,v_9,null) ;
  graph.insertDirectedEdge(v_12,v_13,null) ;
  graph.insertDirectedEdge(v_11,v_10,null) ;
  graph.insertDirectedEdge(v_10,v_12,null) ;
  graph.insertDirectedEdge(v_10,v_17,null) ;
  graph.insertDirectedEdge(v_9,v_13,null) ;
  graph.insertDirectedEdge(v_8,v_7,null) ;
  graph.insertDirectedEdge(v_8,v_11,null) ;
  graph.insertDirectedEdge(v_7,v_8,null) ;
  graph.insertDirectedEdge(v_7,v_9,null) ;
  graph.insertDirectedEdge(v_7,v_11,null) ;
  graph.insertDirectedEdge(v_6,v_12,null) ;
  graph.insertDirectedEdge(v_5,v_11,null) ;
  graph.insertDirectedEdge(v_5,v_13,null) ;
  graph.insertDirectedEdge(v_4,v_8,null) ;
  graph.insertDirectedEdge(v_3,v_17,null) ;
  graph.insertDirectedEdge(v_2,v_7,null) ;
  graph.insertDirectedEdge(v_2,v_17,null) ;
  graph.insertDirectedEdge(v_2,v_17,null) ;
  graph.insertDirectedEdge(v_1,v_9,null) ;
  graph.insertDirectedEdge(v_1,v_9,null) ;
  graph.insertDirectedEdge(v_0,v_9,null) ;
  graph.insertDirectedEdge(v_0,v_14,null) ;
  graph.insertDirectedEdge(v_0,v_19,null) ;
  ok_sofar = new SumVertices(graph).doCall().checkResult(new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Entry<Vertex<Integer>,Integer>>(TestUtils.toGenericArray(TestUtils.es_upm_aedlib_map_Entry_refl_cnstr(v_0,66),TestUtils.es_upm_aedlib_map_Entry_refl_cnstr(v_1,19),TestUtils.es_upm_aedlib_map_Entry_refl_cnstr(v_2,41),TestUtils.es_upm_aedlib_map_Entry_refl_cnstr(v_3,41),TestUtils.es_upm_aedlib_map_Entry_refl_cnstr(v_4,41),TestUtils.es_upm_aedlib_map_Entry_refl_cnstr(v_5,35),TestUtils.es_upm_aedlib_map_Entry_refl_cnstr(v_6,13),TestUtils.es_upm_aedlib_map_Entry_refl_cnstr(v_7,35),TestUtils.es_upm_aedlib_map_Entry_refl_cnstr(v_8,35),TestUtils.es_upm_aedlib_map_Entry_refl_cnstr(v_9,13),TestUtils.es_upm_aedlib_map_Entry_refl_cnstr(v_10,35),TestUtils.es_upm_aedlib_map_Entry_refl_cnstr(v_11,35),TestUtils.es_upm_aedlib_map_Entry_refl_cnstr(v_12,13),TestUtils.es_upm_aedlib_map_Entry_refl_cnstr(v_13,13),TestUtils.es_upm_aedlib_map_Entry_refl_cnstr(v_14,59),TestUtils.es_upm_aedlib_map_Entry_refl_cnstr(v_15,60),TestUtils.es_upm_aedlib_map_Entry_refl_cnstr(v_16,30),TestUtils.es_upm_aedlib_map_Entry_refl_cnstr(v_17,35),TestUtils.es_upm_aedlib_map_Entry_refl_cnstr(v_18,26),TestUtils.es_upm_aedlib_map_Entry_refl_cnstr(v_19,32)))) ;
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
    ResultsHandler.stopTest(new String("test_29")) ;
    ResultsHandler.add_result(new String("sumVertices"),resultIs) ;
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
{
  DirectedAdjacencyListGraph<Integer,Integer> graph = new DirectedAdjacencyListGraph<Integer,Integer>() ;
  Vertex<Integer> v_0 = graph.insertVertex(1) ;
  Vertex<Integer> v_1 = graph.insertVertex(1) ;
  Vertex<Integer> v_2 = graph.insertVertex(5) ;
  Vertex<Integer> v_3 = graph.insertVertex(1) ;
  Vertex<Integer> v_4 = graph.insertVertex(5) ;
  Vertex<Integer> v_5 = graph.insertVertex(3) ;
  Vertex<Integer> v_6 = graph.insertVertex(1) ;
  Vertex<Integer> v_7 = graph.insertVertex(3) ;
  Vertex<Integer> v_8 = graph.insertVertex(1) ;
  Vertex<Integer> v_9 = graph.insertVertex(3) ;
  Vertex<Integer> v_10 = graph.insertVertex(3) ;
  Vertex<Integer> v_11 = graph.insertVertex(3) ;
  Vertex<Integer> v_12 = graph.insertVertex(1) ;
  Vertex<Integer> v_13 = graph.insertVertex(3) ;
  Vertex<Integer> v_14 = graph.insertVertex(2) ;
  Vertex<Integer> v_15 = graph.insertVertex(3) ;
  Vertex<Integer> v_16 = graph.insertVertex(3) ;
  Vertex<Integer> v_17 = graph.insertVertex(3) ;
  Vertex<Integer> v_18 = graph.insertVertex(2) ;
  Vertex<Integer> v_19 = graph.insertVertex(1) ;
  graph.insertDirectedEdge(v_19,v_4,null) ;
  graph.insertDirectedEdge(v_19,v_5,null) ;
  graph.insertDirectedEdge(v_19,v_12,null) ;
  graph.insertDirectedEdge(v_18,v_1,null) ;
  graph.insertDirectedEdge(v_18,v_3,null) ;
  graph.insertDirectedEdge(v_18,v_17,null) ;
  graph.insertDirectedEdge(v_17,v_2,null) ;
  graph.insertDirectedEdge(v_17,v_11,null) ;
  graph.insertDirectedEdge(v_17,v_14,null) ;
  graph.insertDirectedEdge(v_16,v_13,null) ;
  graph.insertDirectedEdge(v_16,v_17,null) ;
  graph.insertDirectedEdge(v_15,v_7,null) ;
  graph.insertDirectedEdge(v_15,v_9,null) ;
  graph.insertDirectedEdge(v_15,v_16,null) ;
  graph.insertDirectedEdge(v_14,v_4,null) ;
  graph.insertDirectedEdge(v_13,v_6,null) ;
  graph.insertDirectedEdge(v_13,v_10,null) ;
  graph.insertDirectedEdge(v_13,v_11,null) ;
  graph.insertDirectedEdge(v_12,v_1,null) ;
  graph.insertDirectedEdge(v_12,v_14,null) ;
  graph.insertDirectedEdge(v_12,v_18,null) ;
  graph.insertDirectedEdge(v_11,v_6,null) ;
  graph.insertDirectedEdge(v_11,v_8,null) ;
  graph.insertDirectedEdge(v_10,v_16,null) ;
  graph.insertDirectedEdge(v_10,v_17,null) ;
  graph.insertDirectedEdge(v_9,v_18,null) ;
  graph.insertDirectedEdge(v_8,v_4,null) ;
  graph.insertDirectedEdge(v_8,v_6,null) ;
  graph.insertDirectedEdge(v_8,v_9,null) ;
  graph.insertDirectedEdge(v_7,v_1,null) ;
  graph.insertDirectedEdge(v_7,v_9,null) ;
  graph.insertDirectedEdge(v_6,v_2,null) ;
  graph.insertDirectedEdge(v_6,v_9,null) ;
  graph.insertDirectedEdge(v_6,v_17,null) ;
  graph.insertDirectedEdge(v_5,v_2,null) ;
  graph.insertDirectedEdge(v_5,v_10,null) ;
  graph.insertDirectedEdge(v_5,v_14,null) ;
  graph.insertDirectedEdge(v_4,v_3,null) ;
  graph.insertDirectedEdge(v_4,v_3,null) ;
  graph.insertDirectedEdge(v_3,v_4,null) ;
  graph.insertDirectedEdge(v_3,v_8,null) ;
  graph.insertDirectedEdge(v_3,v_14,null) ;
  graph.insertDirectedEdge(v_2,v_4,null) ;
  graph.insertDirectedEdge(v_2,v_6,null) ;
  graph.insertDirectedEdge(v_1,v_19,null) ;
  graph.insertDirectedEdge(v_0,v_0,null) ;
  ok_sofar = new SumVertices(graph).doCall().checkResult(new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Entry<Vertex<Integer>,Integer>>(TestUtils.toGenericArray(TestUtils.es_upm_aedlib_map_Entry_refl_cnstr(v_0,1),TestUtils.es_upm_aedlib_map_Entry_refl_cnstr(v_1,41),TestUtils.es_upm_aedlib_map_Entry_refl_cnstr(v_2,41),TestUtils.es_upm_aedlib_map_Entry_refl_cnstr(v_3,41),TestUtils.es_upm_aedlib_map_Entry_refl_cnstr(v_4,41),TestUtils.es_upm_aedlib_map_Entry_refl_cnstr(v_5,41),TestUtils.es_upm_aedlib_map_Entry_refl_cnstr(v_6,41),TestUtils.es_upm_aedlib_map_Entry_refl_cnstr(v_7,44),TestUtils.es_upm_aedlib_map_Entry_refl_cnstr(v_8,41),TestUtils.es_upm_aedlib_map_Entry_refl_cnstr(v_9,41),TestUtils.es_upm_aedlib_map_Entry_refl_cnstr(v_10,41),TestUtils.es_upm_aedlib_map_Entry_refl_cnstr(v_11,41),TestUtils.es_upm_aedlib_map_Entry_refl_cnstr(v_12,41),TestUtils.es_upm_aedlib_map_Entry_refl_cnstr(v_13,41),TestUtils.es_upm_aedlib_map_Entry_refl_cnstr(v_14,41),TestUtils.es_upm_aedlib_map_Entry_refl_cnstr(v_15,47),TestUtils.es_upm_aedlib_map_Entry_refl_cnstr(v_16,41),TestUtils.es_upm_aedlib_map_Entry_refl_cnstr(v_17,41),TestUtils.es_upm_aedlib_map_Entry_refl_cnstr(v_18,41),TestUtils.es_upm_aedlib_map_Entry_refl_cnstr(v_19,41)))) ;
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
    ResultsHandler.stopTest(new String("test_30")) ;
    ResultsHandler.add_result(new String("sumVertices"),resultIs) ;
    System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  


static class Tests {
  static String tester = "TesterInd6";
}


static class SumGrafosUtils {
  static public String toString(DirectedAdjacencyListGraph<Integer,Integer> g,
                                String Op,
                                String Module) {
    return "sumVertices(g) where the graph g is\n"+g;
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
      for (Constructor<?> cnstr : cl.getConstructors()) {
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


static class SumVertices extends TestCall<es.upm.aedlib.map.Map<Vertex<Integer>,Integer>,es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Entry<Vertex<Integer>,Integer>>>
{
  DirectedAdjacencyListGraph<Integer,Integer> graph;
  DirectedAdjacencyListGraph<Integer,Integer> graph_orig;
  
  public SumVertices (DirectedAdjacencyListGraph<Integer,Integer> graph)
  {
    this.graph = graph ;
    if (graph == null)
      graph_orig = null ;
    else
      graph_orig = new DirectedAdjacencyListGraph<Integer,Integer>(graph) ;
  }
  
  public String toString () 
  {
    return SumGrafosUtils.toString(graph_orig,new String("Suma"),new String("sumVertices")) ;
  }
  
  public es.upm.aedlib.map.Map<Vertex<Integer>,Integer> call () 
  {
    return Suma.sumVertices(graph) ;
  }
  
  public boolean checkResult (es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Entry<Vertex<Integer>,Integer>> expected) 
  {
    if (!noException())
      return false ;
    if (!nonNull())
      return false ;
    if (!(result.isException() || fresh(result.getValue(),graph)))
      return false ;
    if (!report_unchanged(es.upm.aedlib.graph.DirectedAdjacencyListGraph.equalGraphs(graph,graph_orig),graph,graph_orig))
      return false ;
    if (!TestUtils.sameElements(this,result,expected))
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
  }
  
  public static String printer (Object obj) 
  {
    return TestUtils.standardPrinter(obj) ;
  }
  
}


}
