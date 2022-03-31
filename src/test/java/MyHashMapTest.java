import org.junit.jupiter.api.*;

/**
 * Testing MyHashMap methods
 * these are the methods get, put, remove and print
 * @author Vitaliy Belinsky
 */

public class MyHashMapTest {


   MyHashMap<Object,Object> map = new MyHashMap<>() ;

   @BeforeAll
   static void beforeAll(){
       System.out.println("Начало теста");
   }
   @AfterAll
   static void afterAll(){
       System.out.println("Конец теста");
   }
   /*
   We pre-create a map for each test
   */
    @BeforeEach
    public void before() {
        map = new MyHashMap<>();
    }

   /*
   We test the put method and output the result via print
   */
    @Test
    public void testPut() {
        map.put("Great", 1);
        map.put("Done", 2);
        map.print();
    }
    /*
    We test the get method by adding a key/value pair and output the result via System.out.println
     */
    @Test
    public void testGet(){
        map.put(1, "A");
        map.put(42,"B");
        map.put(15,"C");
        map.put("D", 28);
        System.out.println(map.get(42));

    }

    /*
    Testing  the remove method using the get method by adding key/value
     pairs and output the result via System.out.println
     */

    @Test
    public void testRemoveAndGet(){
        map.put(1, "A");
        map.put(42,"B");
        map.put(15,"C");
        map.put("D", 28);
        map.remove(42);
        System.out.println(map.get(42));


    }

    /*
     Testing the remove method by adding key/value pairs, output the result via System.out.println
     */

    @Test
    public void testRemoveAndPut(){
        map.put(1, "A");
        map.put(42,"B");
        map.put(15,"C");
        map.put("D", 28);
        map.remove(15);
        map.remove("D");
        map.print();


    }

    @Test
    public void testPrint() {

        map.put(1, "A");
        map.put(15, "C");
        map.put("D", 28);
        map.put("Z", 28);
        map.put("p", 28);
        map.print();
    }



    }







