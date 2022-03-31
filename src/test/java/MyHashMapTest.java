import org.junit.jupiter.api.*;


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

    @BeforeEach
    public void before() {
        map = new MyHashMap<>();
    }
    @Test
    public void testPut() {
        map.put("Great", 1);
        map.put("Done", 2);
        map.print();
    }

    @Test
    public void testGet(){
        map.put(1, "A");
        map.put(42,"B");
        map.put(15,"C");
        map.put("D", 28);
        System.out.println(map.get(42));


    }

    @Test
    public void testRemoveAndGet(){
        map.put(1, "A");
        map.put(42,"B");
        map.put(15,"C");
        map.put("D", 28);
        map.remove(42);
        System.out.println(map.get(42));


    }

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
    public void testPrint(){
        map.put(1, "A");
        map.put(15,"C");
        map.put("D",28);
        map.put("Z", 28);
        map.put("p", 28);

        map.print();


    }






}
