/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package busquedainsertarposicion;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author COMPUMAX
 */
public class BusquedaTest {
    
    public BusquedaTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of searchInsert method, of class Busqueda.
     */
    @Test
    public void testSearchInsert() {
        System.out.println("searchInsert");
        int[] nums = {1,3,5,6,8,10,11,13,15,16,18,20,21,23,25,26,28,30};
        int target = 0;
        Busqueda instance = new Busqueda();
        int expResult = 0;
        int result = instance.searchInsert(nums, target);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if(result != expResult)
        {
            fail("The test case is a prototype.");
        }
    }
    
    @Test
    public void testSearchInsert2() {
        System.out.println("searchInsert");
        int[] nums = {1,3,5,6,8,10,11,13,15,16,18,20,21,23,25,26,28,30};
        int target = 1;
        Busqueda instance = new Busqueda();
        int expResult = 0;
        int result = instance.searchInsert(nums, target);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if(result != expResult)
        {
            fail("The test case is a prototype.");
        }
    }
    
    @Test
    public void testSearchInsert3() {
        System.out.println("searchInsert");
        int[] nums = {1,3,5,6,8,10,11,13,15,16,18,20,21,23,25,26,28,30};
        int target = 2;
        Busqueda instance = new Busqueda();
        int expResult = 1;
        int result = instance.searchInsert(nums, target);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if(result != expResult)
        {
            fail("The test case is a prototype.");
        }
    }
    
    @Test
    public void testSearchInsert4() {
        System.out.println("searchInsert");
        int[] nums = {1,3,5,6,8,10,11,13,15,16,18,20,21,23,25,26,28,30};
        int target = 3;
        Busqueda instance = new Busqueda();
        int expResult = 1;
        int result = instance.searchInsert(nums, target);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if(result != expResult)
        {
            fail("The test case is a prototype.");
        }
    }
    
    @Test
    public void testSearchInsert5() {
        System.out.println("searchInsert");
        int[] nums = {1,3,5,6,8,10,11,13,15,16,18,20,21,23,25,26,28,30};
        int target = 4;
        Busqueda instance = new Busqueda();
        int expResult = 2;
        int result = instance.searchInsert(nums, target);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if(result != expResult)
        {
            fail("The test case is a prototype.");
        }
    }
    
    @Test
    public void testSearchInsert6() {
        System.out.println("searchInsert");
        int[] nums = {1,3,5,6,8,10,11,13,15,16,18,20,21,23,25,26,28,30};
        int target = 5;
        Busqueda instance = new Busqueda();
        int expResult = 2;
        int result = instance.searchInsert(nums, target);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if(result != expResult)
        {
            fail("The test case is a prototype.");
        }
    }
    
    @Test
    public void testSearchInsert7() {
        System.out.println("searchInsert");
        int[] nums = {1,3,5,6,8,10,11,13,15,16,18,20,21,23,25,26,28,30};
        int target = 6;
        Busqueda instance = new Busqueda();
        int expResult = 3;
        int result = instance.searchInsert(nums, target);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if(result != expResult)
        {
            fail("The test case is a prototype.");
        }
    }
    
    @Test
    public void testSearchInsert8() {
        System.out.println("searchInsert");
        int[] nums = {1,3,5,6,8,10,11,13,15,16,18,20,21,23,25,26,28,30};
        int target = 7;
        Busqueda instance = new Busqueda();
        int expResult = 4;
        int result = instance.searchInsert(nums, target);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if(result != expResult)
        {
            fail("The test case is a prototype.");
        }
    }
    
    @Test
    public void testSearchInsert9() {
        System.out.println("searchInsert");
        int[] nums = {1,3,5,6,8,10,11,13,15,16,18,20,21,23,25,26,28,30};
        int target = 8;
        Busqueda instance = new Busqueda();
        int expResult = 4;
        int result = instance.searchInsert(nums, target);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if(result != expResult)
        {
            fail("The test case is a prototype.");
        }
    }
    
    @Test
    public void testSearchInsert10() {
        System.out.println("searchInsert");
        int[] nums = {1,3,5,6,8,10,11,13,15,16,18,20,21,23,25,26,28,30};
        int target = 9;
        Busqueda instance = new Busqueda();
        int expResult = 5;
        int result = instance.searchInsert(nums, target);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if(result != expResult)
        {
            fail("The test case is a prototype.");
        }
    }
    
    @Test
    public void testSearchInsert11() {
        System.out.println("searchInsert");
        int[] nums = {1,3,5,6,8,10,11,13,15,16,18,20,21,23,25,26,28,30};
        int target = 10;
        Busqueda instance = new Busqueda();
        int expResult = 5;
        int result = instance.searchInsert(nums, target);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if(result != expResult)
        {
            fail("The test case is a prototype.");
        }
    }
    
    @Test
    public void testSearchInsert12() {
        System.out.println("searchInsert");
        int[] nums = {1,3,5,6,8,10,11,13,15,16,18,20,21,23,25,26,28,30};
        int target = 11;
        Busqueda instance = new Busqueda();
        int expResult = 6;
        int result = instance.searchInsert(nums, target);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if(result != expResult)
        {
            fail("The test case is a prototype.");
        }
    }
    
    @Test
    public void testSearchInsert13() {
        System.out.println("searchInsert");
        int[] nums = {1,3,5,6,8,10,11,13,15,16,18,20,21,23,25,26,28,30};
        int target = 12;
        Busqueda instance = new Busqueda();
        int expResult = 7;
        int result = instance.searchInsert(nums, target);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if(result != expResult)
        {
            fail("The test case is a prototype.");
        }
    }
    
    @Test
    public void testSearchInsert14() {
        System.out.println("searchInsert");
        int[] nums = {1,3,5,6,8,10,11,13,15,16,18,20,21,23,25,26,28,30};
        int target = 13;
        Busqueda instance = new Busqueda();
        int expResult = 7;
        int result = instance.searchInsert(nums, target);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if(result != expResult)
        {
            fail("The test case is a prototype.");
        }
    }
    
    @Test
    public void testSearchInsert15() {
        System.out.println("searchInsert");
        int[] nums = {1,3,5,6,8,10,11,13,15,16,18,20,21,23,25,26,28,30};
        int target = 14;
        Busqueda instance = new Busqueda();
        int expResult = 8;
        int result = instance.searchInsert(nums, target);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if(result != expResult)
        {
            fail("The test case is a prototype.");
        }
    }
    
    @Test
    public void testSearchInsert16() {
        System.out.println("searchInsert");
        int[] nums = {1,3,5,6,8,10,11,13,15,16,18,20,21,23,25,26,28,30};
        int target = 15;
        Busqueda instance = new Busqueda();
        int expResult = 8;
        int result = instance.searchInsert(nums, target);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if(result != expResult)
        {
            fail("The test case is a prototype.");
        }
    }
    
    @Test
    public void testSearchInsert17() {
        System.out.println("searchInsert");
        int[] nums = {1,3,5,6,8,10,11,13,15,16,18,20,21,23,25,26,28,30};
        int target = 16;
        Busqueda instance = new Busqueda();
        int expResult = 9;
        int result = instance.searchInsert(nums, target);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if(result != expResult)
        {
            fail("The test case is a prototype.");
        }
    }
    
    @Test
    public void testSearchInsert18() {
        System.out.println("searchInsert");
        int[] nums = {1,3,5,6,8,10,11,13,15,16,18,20,21,23,25,26,28,30};
        int target = 17;
        Busqueda instance = new Busqueda();
        int expResult = 10;
        int result = instance.searchInsert(nums, target);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if(result != expResult)
        {
            fail("The test case is a prototype.");
        }
    }
    
    @Test
    public void testSearchInsert19() {
        System.out.println("searchInsert");
        int[] nums = {1,3,5,6,8,10,11,13,15,16,18,20,21,23,25,26,28,30};
        int target = 18;
        Busqueda instance = new Busqueda();
        int expResult = 10;
        int result = instance.searchInsert(nums, target);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if(result != expResult)
        {
            fail("The test case is a prototype.");
        }
    }
    
    @Test
    public void testSearchInsert20() {
        System.out.println("searchInsert");
        int[] nums = {1,3,5,6,8,10,11,13,15,16,18,20,21,23,25,26,28,30};
        int target = 19;
        Busqueda instance = new Busqueda();
        int expResult = 11;
        int result = instance.searchInsert(nums, target);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if(result != expResult)
        {
            fail("The test case is a prototype.");
        }
    }
    
    @Test
    public void testSearchInsert21() {
        System.out.println("searchInsert");
        int[] nums = {1,3,5,6,8,10,11,13,15,16,18,20,21,23,25,26,28,30};
        int target = 20;
        Busqueda instance = new Busqueda();
        int expResult = 11;
        int result = instance.searchInsert(nums, target);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if(result != expResult)
        {
            fail("The test case is a prototype.");
        }
    }
    
    @Test
    public void testSearchInsert22() {
        System.out.println("searchInsert");
        int[] nums = {1,3,5,6,8,10,11,13,15,16,18,20,21,23,25,26,28,30};
        int target = 21;
        Busqueda instance = new Busqueda();
        int expResult = 12;
        int result = instance.searchInsert(nums, target);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if(result != expResult)
        {
            fail("The test case is a prototype.");
        }
    }
    
    @Test
    public void testSearchInsert23() {
        System.out.println("searchInsert");
        int[] nums = {1,3,5,6,8,10,11,13,15,16,18,20,21,23,25,26,28,30};
        int target = 22;
        Busqueda instance = new Busqueda();
        int expResult = 13;
        int result = instance.searchInsert(nums, target);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if(result != expResult)
        {
            fail("The test case is a prototype.");
        }
    }
    
    @Test
    public void testSearchInsert24() {
        System.out.println("searchInsert");
        int[] nums = {1,3,5,6,8,10,11,13,15,16,18,20,21,23,25,26,28,30};
        int target = 23;
        Busqueda instance = new Busqueda();
        int expResult = 13;
        int result = instance.searchInsert(nums, target);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if(result != expResult)
        {
            fail("The test case is a prototype.");
        }
    }
    
    @Test
    public void testSearchInsert25() {
        System.out.println("searchInsert");
        int[] nums = {1,3,5,6,8,10,11,13,15,16,18,20,21,23,25,26,28,30};
        int target = 24;
        Busqueda instance = new Busqueda();
        int expResult = 14;
        int result = instance.searchInsert(nums, target);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if(result != expResult)
        {
            fail("The test case is a prototype.");
        }
    }
    
    @Test
    public void testSearchInsert26() {
        System.out.println("searchInsert");
        int[] nums = {1,3,5,6,8,10,11,13,15,16,18,20,21,23,25,26,28,30};
        int target = 25;
        Busqueda instance = new Busqueda();
        int expResult = 14;
        int result = instance.searchInsert(nums, target);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if(result != expResult)
        {
            fail("The test case is a prototype.");
        }
    }
    
    @Test
    public void testSearchInsert27() {
        System.out.println("searchInsert");
        int[] nums = {1,3,5,6,8,10,11,13,15,16,18,20,21,23,25,26,28,30};
        int target = 26;
        Busqueda instance = new Busqueda();
        int expResult = 15;
        int result = instance.searchInsert(nums, target);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if(result != expResult)
        {
            fail("The test case is a prototype.");
        }
    }
    
    @Test
    public void testSearchInsert28() {
        System.out.println("searchInsert");
        int[] nums = {1,3,5,6,8,10,11,13,15,16,18,20,21,23,25,26,28,30};
        int target = 27;
        Busqueda instance = new Busqueda();
        int expResult = 16;
        int result = instance.searchInsert(nums, target);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if(result != expResult)
        {
            fail("The test case is a prototype.");
        }
    }
    
    @Test
    public void testSearchInsert29() {
        System.out.println("searchInsert");
        int[] nums = {1,3,5,6,8,10,11,13,15,16,18,20,21,23,25,26,28,30};
        int target = 28;
        Busqueda instance = new Busqueda();
        int expResult = 16;
        int result = instance.searchInsert(nums, target);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if(result != expResult)
        {
            fail("The test case is a prototype.");
        }
    }
    
    @Test
    public void testSearchInsert30() {
        System.out.println("searchInsert");
        int[] nums = {1,3,5,6,8,10,11,13,15,16,18,20,21,23,25,26,28,30};
        int target = 29;
        Busqueda instance = new Busqueda();
        int expResult = 17;
        int result = instance.searchInsert(nums, target);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if(result != expResult)
        {
            fail("The test case is a prototype.");
        }
    }
    
    @Test
    public void testSearchInsert31() {
        System.out.println("searchInsert");
        int[] nums = {1,3,5,6,8,10,11,13,15,16,18,20,21,23,25,26,28,30};
        int target = 30;
        Busqueda instance = new Busqueda();
        int expResult = 17;
        int result = instance.searchInsert(nums, target);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if(result != expResult)
        {
            fail("The test case is a prototype.");
        }
    }
    
    @Test
    public void testSearchInsert32() {
        System.out.println("searchInsert");
        int[] nums = {1,3,5,6,8,10,11,13,15,16,18,20,21,23,25,26,28,30};
        int target = 31;
        Busqueda instance = new Busqueda();
        int expResult = 18;
        int result = instance.searchInsert(nums, target);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if(result != expResult)
        {
            fail("The test case is a prototype.");
        }
    }
    
    @Test
    public void testSearchInsert33() {
        System.out.println("searchInsert");
        int[] nums = {1,3,5,6,8,10,11,13,15,16,18,20,21,23,25,26,28,30};
        int target = 32;
        Busqueda instance = new Busqueda();
        int expResult = 18;
        int result = instance.searchInsert(nums, target);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if(result != expResult)
        {
            fail("The test case is a prototype.");
        }
    }
    
    @Test
    public void testSearchInsert34() {
        System.out.println("searchInsert");
        int[] nums = {1,3,5,6,8,10,11,13,15,16,18,20,21,23,25,26,28,30};
        int target = 33;
        Busqueda instance = new Busqueda();
        int expResult = 18;
        int result = instance.searchInsert(nums, target);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if(result != expResult)
        {
            fail("The test case is a prototype.");
        }
    }
    
    @Test
    public void testSearchInsert35() {
        System.out.println("searchInsert");
        int[] nums = {1,3,5,6,8,10,11,13,15,16,18,20,21,23,25,26,28,30};
        int target = 34;
        Busqueda instance = new Busqueda();
        int expResult = 18;
        int result = instance.searchInsert(nums, target);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if(result != expResult)
        {
            fail("The test case is a prototype.");
        }
    }
    
    @Test
    public void testSearchInsert36() {
        System.out.println("searchInsert");
        int[] nums = {1,3,5,6,8,10,11,13,15,16,18,20,21,23,25,26,28,30};
        int target = 35;
        Busqueda instance = new Busqueda();
        int expResult = 18;
        int result = instance.searchInsert(nums, target);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if(result != expResult)
        {
            fail("The test case is a prototype.");
        }
    }
    
    @Test
    public void testSearchInsert37() {
        System.out.println("searchInsert");
        int[] nums = {1,3,5,6,8,10,11,13,15,16,18,20,21,23,25,26,28,30};
        int target = 36;
        Busqueda instance = new Busqueda();
        int expResult = 18;
        int result = instance.searchInsert(nums, target);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if(result != expResult)
        {
            fail("The test case is a prototype.");
        }
    }
    
    @Test
    public void testSearchInsert38() {
        System.out.println("searchInsert");
        int[] nums = {1,3,5,6,8,10,11,13,15,16,18,20,21,23,25,26,28,30};
        int target = 37;
        Busqueda instance = new Busqueda();
        int expResult = 18;
        int result = instance.searchInsert(nums, target);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if(result != expResult)
        {
            fail("The test case is a prototype.");
        }
    }
    
    @Test
    public void testSearchInsert39() {
        System.out.println("searchInsert");
        int[] nums = {1,3,5,6,8,10,11,13,15,16,18,20,21,23,25,26,28,30};
        int target = 38;
        Busqueda instance = new Busqueda();
        int expResult = 18;
        int result = instance.searchInsert(nums, target);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if(result != expResult)
        {
            fail("The test case is a prototype.");
        }
    }
    
    @Test
    public void testSearchInsert40() {
        System.out.println("searchInsert");
        int[] nums = {1,3,5,6,8,10,11,13,15,16,18,20,21,23,25,26,28,30};
        int target = 39;
        Busqueda instance = new Busqueda();
        int expResult = 18;
        int result = instance.searchInsert(nums, target);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if(result != expResult)
        {
            fail("The test case is a prototype.");
        }
    }
    
    @Test
    public void testSearchInsert41() {
        System.out.println("searchInsert");
        int[] nums = {1,3,5,6,8,10,11,13,15,16,18,20,21,23,25,26,28,30};
        int target = 1000;
        Busqueda instance = new Busqueda();
        int expResult = 18;
        int result = instance.searchInsert(nums, target);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if(result != expResult)
        {
            fail("The test case is a prototype.");
        }
    }
    
    @Test
    public void testSearchInsert42() {
        System.out.println("searchInsert");
        int[] nums = {1,3,5,6,8,10,11,13,15,16,18,20,21,23,25,26,28,30};
        int target = -1;
        Busqueda instance = new Busqueda();
        int expResult = 0;
        int result = instance.searchInsert(nums, target);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if(result != expResult)
        {
            fail("The test case is a prototype.");
        }
    }
    
    @Test
    public void testSearchInsert43() {
        System.out.println("searchInsert");
        int[] nums = {1,3,5,6,8,10,11,13,15,16,18,20,21,23,25,26,28,30};
        int target = -2;
        Busqueda instance = new Busqueda();
        int expResult = 0;
        int result = instance.searchInsert(nums, target);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if(result != expResult)
        {
            fail("The test case is a prototype.");
        }
    }
    
    @Test
    public void testSearchInsert44() {
        System.out.println("searchInsert");
        int[] nums = {1,3,5,6,8,10,11,13,15,16,18,20,21,23,25,26,28,30};
        int target = -3;
        Busqueda instance = new Busqueda();
        int expResult = 0;
        int result = instance.searchInsert(nums, target);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if(result != expResult)
        {
            fail("The test case is a prototype.");
        }
    }
    
    @Test
    public void testSearchInsert45() {
        System.out.println("searchInsert");
        int[] nums = {1,3,5,6,8,10,11,13,15,16,18,20,21,23,25,26,28,30};
        int target = -4;
        Busqueda instance = new Busqueda();
        int expResult = 0;
        int result = instance.searchInsert(nums, target);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if(result != expResult)
        {
            fail("The test case is a prototype.");
        }
    }
    
    @Test
    public void testSearchInsert46() {
        System.out.println("searchInsert");
        int[] nums = {1,3,5,6,8,10,11,13,15,16,18,20,21,23,25,26,28,30};
        int target = -5;
        Busqueda instance = new Busqueda();
        int expResult = 0;
        int result = instance.searchInsert(nums, target);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if(result != expResult)
        {
            fail("The test case is a prototype.");
        }
    }
    
    @Test
    public void testSearchInsert47() {
        System.out.println("searchInsert");
        int[] nums = {1,3,5,6,8,10,11,13,15,16,18,20,21,23,25,26,28,30};
        int target = -6;
        Busqueda instance = new Busqueda();
        int expResult = 0;
        int result = instance.searchInsert(nums, target);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if(result != expResult)
        {
            fail("The test case is a prototype.");
        }
    }
    
    @Test
    public void testSearchInsert48() {
        System.out.println("searchInsert");
        int[] nums = {1,3,5,6,8,10,11,13,15,16,18,20,21,23,25,26,28,30};
        int target = -7;
        Busqueda instance = new Busqueda();
        int expResult = 0;
        int result = instance.searchInsert(nums, target);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if(result != expResult)
        {
            fail("The test case is a prototype.");
        }
    }
    
    @Test
    public void testSearchInsert49() {
        System.out.println("searchInsert");
        int[] nums = {1,3,5,6,8,10,11,13,15,16,18,20,21,23,25,26,28,30};
        int target = -8;
        Busqueda instance = new Busqueda();
        int expResult = 0;
        int result = instance.searchInsert(nums, target);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if(result != expResult)
        {
            fail("The test case is a prototype.");
        }
    }
    
    @Test
    public void testSearchInsert50() {
        System.out.println("searchInsert");
        int[] nums = {1,3,5,6,8,10,11,13,15,16,18,20,21,23,25,26,28,30};
        int target = -9;
        Busqueda instance = new Busqueda();
        int expResult = 0;
        int result = instance.searchInsert(nums, target);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if(result != expResult)
        {
            fail("The test case is a prototype.");
        }
    }
    
    @Test
    public void testSearchInsert51() {
        System.out.println("searchInsert");
        int[] nums = {1,3,5,6,8,10,11,13,15,16,18,20,21,23,25,26,28,30};
        int target = -10;
        Busqueda instance = new Busqueda();
        int expResult = 0;
        int result = instance.searchInsert(nums, target);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if(result != expResult)
        {
            fail("The test case is a prototype.");
        }
    }
    
    @Test
    public void testSearchInsert52() {
        System.out.println("searchInsert");
        int[] nums = {1,3,5,6,8,10,11,13,15,16,18,20,21,23,25,26,28,30};
        int target = -1000;
        Busqueda instance = new Busqueda();
        int expResult = 0;
        int result = instance.searchInsert(nums, target);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if(result != expResult)
        {
            fail("The test case is a prototype.");
        }
    }
    
    @Test
    public void testSearchInsert53() {
        System.out.println("searchInsert");
        int[] nums = {1,3,5,6,8,10,11,13,15,16,18,20,21,23,25,26,28,30};
        int target =990;
        Busqueda instance = new Busqueda();
        int expResult = 18;
        int result = instance.searchInsert(nums, target);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if(result != expResult)
        {
            fail("The test case is a prototype.");
        }
    }
    
    @Test
    public void testSearchInsert54() {
        System.out.println("searchInsert");
        int[] nums = {1,3,5,6,8,10,11,13,15,16,18,20,21,23,25,26,28,30};
        int target = 100;
        Busqueda instance = new Busqueda();
        int expResult = 18;
        int result = instance.searchInsert(nums, target);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if(result != expResult)
        {
            fail("The test case is a prototype.");
        }
    }
    
    @Test
    public void testSearchInsert55() {
        System.out.println("searchInsert");
        int[] nums = {1,3,5,6,8,10,11,13,15,16,18,20,21,23,25,26,28,30};
        int target = 500;
        Busqueda instance = new Busqueda();
        int expResult = 18;
        int result = instance.searchInsert(nums, target);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if(result != expResult)
        {
            fail("The test case is a prototype.");
        }
    }
    
    @Test
    public void testSearchInsert56() {
        System.out.println("searchInsert");
        int[] nums = {1,3,5,6,8,10,11,13,15,16,18,20,21,23,25,26,28,30};
        int target = -500;
        Busqueda instance = new Busqueda();
        int expResult = 0;
        int result = instance.searchInsert(nums, target);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if(result != expResult)
        {
            fail("The test case is a prototype.");
        }
    }
    
    @Test
    public void testSearchInsert57() {
        System.out.println("searchInsert");
        int[] nums = {1,3,5,6,8,10,11,13,15,16,18,20,21,23,25,26,28,30};
        int target = -30;
        Busqueda instance = new Busqueda();
        int expResult = 0;
        int result = instance.searchInsert(nums, target);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if(result != expResult)
        {
            fail("The test case is a prototype.");
        }
    }
    
    @Test
    public void testSearchInsert58() {
        System.out.println("searchInsert");
        int[] nums = {1,3,5,6,8,10,11,13,15,16,18,20,21,23,25,26,28,30};
        int target = -3;
        Busqueda instance = new Busqueda();
        int expResult = 0;
        int result = instance.searchInsert(nums, target);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if(result != expResult)
        {
            fail("The test case is a prototype.");
        }
    }
    
    @Test
    public void testSearchInsert59() {
        System.out.println("searchInsert");
        int[] nums = {1,3,5,6,8,10,11,13,15,16,18,20,21,23,25,26,28,30};
        int target = -5;
        Busqueda instance = new Busqueda();
        int expResult = 0;
        int result = instance.searchInsert(nums, target);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if(result != expResult)
        {
            fail("The test case is a prototype.");
        }
    }
    
    @Test
    public void testSearchInsert60() {
        System.out.println("searchInsert");
        int[] nums = {1,3,5,6,8,10,11,13,15,16,18,20,21,23,25,26,28,30};
        int target = -10;
        Busqueda instance = new Busqueda();
        int expResult = 0;
        int result = instance.searchInsert(nums, target);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if(result != expResult)
        {
            fail("The test case is a prototype.");
        }
    }
    
    @Test
    public void testSearchInsert61() {
        System.out.println("searchInsert");
        int[] nums = {1,3,5,6,8,10,11,13,15,16,18,20,21,23,25,26,28,30};
        int target = -162;
        Busqueda instance = new Busqueda();
        int expResult = 0;
        int result = instance.searchInsert(nums, target);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if(result != expResult)
        {
            fail("The test case is a prototype.");
        }
    }
    
    @Test
    public void testSearchInsert62() {
        System.out.println("searchInsert");
        int[] nums = {1,3,5,6,8,10,11,13,15,16,18,20,21,23,25,26,28,30};
        int target = 168;
        Busqueda instance = new Busqueda();
        int expResult = 18;
        int result = instance.searchInsert(nums, target);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if(result != expResult)
        {
            fail("The test case is a prototype.");
        }
    }
    
    @Test
    public void testSearchInsert63() {
        System.out.println("searchInsert");
        int[] nums = {1,3,5,6,8,10,11,13,15,16,18,20,21,23,25,26,28,30};
        int target = 68;
        Busqueda instance = new Busqueda();
        int expResult = 18;
        int result = instance.searchInsert(nums, target);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if(result != expResult)
        {
            fail("The test case is a prototype.");
        }
    }
    
    @Test
    public void testSearchInsert64() {
        System.out.println("searchInsert");
        int[] nums = {1,3,5,6,8,10,11,13,15,16,18,20,21,23,25,26,28,30};
        int target = 63;
        Busqueda instance = new Busqueda();
        int expResult = 18;
        int result = instance.searchInsert(nums, target);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if(result != expResult)
        {
            fail("The test case is a prototype.");
        }
    }
    
    @Test
    public void testSearchInsert65() {
        System.out.println("searchInsert");
        int[] nums = {1,3,5,6,8,10,11,13,15,16,18,20,21,23,25,26,28,30};
        int target = 10000;
        Busqueda instance = new Busqueda();
        int expResult = 18;
        int result = instance.searchInsert(nums, target);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if(result != expResult)
        {
            fail("The test case is a prototype.");
        }
    }
    
    @Test
    public void testSearchInsert66() {
        System.out.println("searchInsert");
        int[] nums = {1,3,5,6,8,10,11,13,15,16,18,20,21,23,25,26,28,30};
        int target = -51;
        Busqueda instance = new Busqueda();
        int expResult = 0;
        int result = instance.searchInsert(nums, target);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if(result != expResult)
        {
            fail("The test case is a prototype.");
        }
    }
    
    @Test
    public void testSearchInsert67() {
        System.out.println("searchInsert");
        int[] nums = {1,3,5,6,8,10,11,13,15,16,18,20,21,23,25,26,28,30};
        int target = -52;
        Busqueda instance = new Busqueda();
        int expResult = 0;
        int result = instance.searchInsert(nums, target);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if(result != expResult)
        {
            fail("The test case is a prototype.");
        }
    }
    
    @Test
    public void testSearchInsert68() {
        System.out.println("searchInsert");
        int[] nums = {1,3,5,6,8,10,11,13,15,16,18,20,21,23,25,26,28,30};
        int target = -53;
        Busqueda instance = new Busqueda();
        int expResult = 0;
        int result = instance.searchInsert(nums, target);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if(result != expResult)
        {
            fail("The test case is a prototype.");
        }
    }
    
    @Test
    public void testSearchInsert69() {
        System.out.println("searchInsert");
        int[] nums = {1,3,5,6,8,10,11,13,15,16,18,20,21,23,25,26,28,30};
        int target = -54;
        Busqueda instance = new Busqueda();
        int expResult = 0;
        int result = instance.searchInsert(nums, target);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if(result != expResult)
        {
            fail("The test case is a prototype.");
        }
    }
    
    @Test
    public void testSearchInsert70() {
        System.out.println("searchInsert");
        int[] nums = {1,3,5,6,8,10,11,13,15,16,18,20,21,23,25,26,28,30};
        int target = -55;
        Busqueda instance = new Busqueda();
        int expResult = 0;
        int result = instance.searchInsert(nums, target);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if(result != expResult)
        {
            fail("The test case is a prototype.");
        }
    }
    
    @Test
    public void testSearchInsert71() {
        System.out.println("searchInsert");
        int[] nums = {1,3,5,6,8,10,11,13,15,16,18,20,21,23,25,26,28,30};
        int target = -56;
        Busqueda instance = new Busqueda();
        int expResult = 0;
        int result = instance.searchInsert(nums, target);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if(result != expResult)
        {
            fail("The test case is a prototype.");
        }
    }
    
    @Test
    public void testSearchInsert72() {
        System.out.println("searchInsert");
        int[] nums = {1,3,5,6,8,10,11,13,15,16,18,20,21,23,25,26,28,30};
        int target = 198;
        Busqueda instance = new Busqueda();
        int expResult = 18;
        int result = instance.searchInsert(nums, target);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if(result != expResult)
        {
            fail("The test case is a prototype.");
        }
    }
    
    @Test
    public void testSearchInsert73() {
        System.out.println("searchInsert");
        int[] nums = {1,3,5,6,8,10,11,13,15,16,18,20,21,23,25,26,28,30};
        int target = -57;
        Busqueda instance = new Busqueda();
        int expResult = 0;
        int result = instance.searchInsert(nums, target);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if(result != expResult)
        {
            fail("The test case is a prototype.");
        }
    }
    
    @Test
    public void testSearchInsert74() {
        System.out.println("searchInsert");
        int[] nums = {1,3,5,6,8,10,11,13,15,16,18,20,21,23,25,26,28,30};
        int target = -58;
        Busqueda instance = new Busqueda();
        int expResult = 0;
        int result = instance.searchInsert(nums, target);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if(result != expResult)
        {
            fail("The test case is a prototype.");
        }
    }
    
    @Test
    public void testSearchInsert75() {
        System.out.println("searchInsert");
        int[] nums = {1,3,5,6,8,10,11,13,15,16,18,20,21,23,25,26,28,30};
        int target = -59;
        Busqueda instance = new Busqueda();
        int expResult = 0;
        int result = instance.searchInsert(nums, target);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if(result != expResult)
        {
            fail("The test case is a prototype.");
        }
    }
    
    @Test
    public void testSearchInsert76() {
        System.out.println("searchInsert");
        int[] nums = {1,3,5,6,8,10,11,13,15,16,18,20,21,23,25,26,28,30};
        int target = -1500;
        Busqueda instance = new Busqueda();
        int expResult = 0;
        int result = instance.searchInsert(nums, target);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if(result != expResult)
        {
            fail("The test case is a prototype.");
        }
    }
    
    @Test
    public void testSearchInsert77() {
        System.out.println("searchInsert");
        int[] nums = {1,3,5,6,8,10,11,13,15,16,18,20,21,23,25,26,28,30};
        int target = -1501;
        Busqueda instance = new Busqueda();
        int expResult = 0;
        int result = instance.searchInsert(nums, target);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if(result != expResult)
        {
            fail("The test case is a prototype.");
        }
    }
    
    @Test
    public void testSearchInsert78() {
        System.out.println("searchInsert");
        int[] nums = {1,3,5,6,8,10,11,13,15,16,18,20,21,23,25,26,28,30};
        int target = -1502;
        Busqueda instance = new Busqueda();
        int expResult = 0;
        int result = instance.searchInsert(nums, target);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if(result != expResult)
        {
            fail("The test case is a prototype.");
        }
    }
    
    @Test
    public void testSearchInsert79() {
        System.out.println("searchInsert");
        int[] nums = {1,3,5,6,8,10,11,13,15,16,18,20,21,23,25,26,28,30};
        int target = -1503;
        Busqueda instance = new Busqueda();
        int expResult = 0;
        int result = instance.searchInsert(nums, target);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if(result != expResult)
        {
            fail("The test case is a prototype.");
        }
    }
    
    @Test
    public void testSearchInsert80() {
        System.out.println("searchInsert");
        int[] nums = {1,3,5,6,8,10,11,13,15,16,18,20,21,23,25,26,28,30};
        int target = -1054;
        Busqueda instance = new Busqueda();
        int expResult = 0;
        int result = instance.searchInsert(nums, target);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if(result != expResult)
        {
            fail("The test case is a prototype.");
        }
    }
    
    @Test
    public void testSearchInsert81() {
        System.out.println("searchInsert");
        int[] nums = {1,3,5,6,8,10,11,13,15,16,18,20,21,23,25,26,28,30};
        int target = -1505;
        Busqueda instance = new Busqueda();
        int expResult = 0;
        int result = instance.searchInsert(nums, target);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if(result != expResult)
        {
            fail("The test case is a prototype.");
        }
    }
    
    @Test
    public void testSearchInsert82() {
        System.out.println("searchInsert");
        int[] nums = {1,3,5,6,8,10,11,13,15,16,18,20,21,23,25,26,28,30};
        int target = 170;
        Busqueda instance = new Busqueda();
        int expResult = 18;
        int result = instance.searchInsert(nums, target);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if(result != expResult)
        {
            fail("The test case is a prototype.");
        }
    }
    
    @Test
    public void testSearchInsert83() {
        System.out.println("searchInsert");
        int[] nums = {1,3,5,6,8,10,11,13,15,16,18,20,21,23,25,26,28,30};
        int target = -1506;
        Busqueda instance = new Busqueda();
        int expResult = 0;
        int result = instance.searchInsert(nums, target);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if(result != expResult)
        {
            fail("The test case is a prototype.");
        }
    }
    
    @Test
    public void testSearchInsert84() {
        System.out.println("searchInsert");
        int[] nums = {1,3,5,6,8,10,11,13,15,16,18,20,21,23,25,26,28,30};
        int target = -1507;
        Busqueda instance = new Busqueda();
        int expResult = 0;
        int result = instance.searchInsert(nums, target);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if(result != expResult)
        {
            fail("The test case is a prototype.");
        }
    }
    
    @Test
    public void testSearchInsert85() {
        System.out.println("searchInsert");
        int[] nums = {1,3,5,6,8,10,11,13,15,16,18,20,21,23,25,26,28,30};
        int target = -1508;
        Busqueda instance = new Busqueda();
        int expResult = 0;
        int result = instance.searchInsert(nums, target);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if(result != expResult)
        {
            fail("The test case is a prototype.");
        }
    }
    
    @Test
    public void testSearchInsert86() {
        System.out.println("searchInsert");
        int[] nums = {1,3,5,6,8,10,11,13,15,16,18,20,21,23,25,26,28,30};
        int target = -1509;
        Busqueda instance = new Busqueda();
        int expResult = 0;
        int result = instance.searchInsert(nums, target);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if(result != expResult)
        {
            fail("The test case is a prototype.");
        }
    }
    
    @Test
    public void testSearchInsert87() {
        System.out.println("searchInsert");
        int[] nums = {1,3,5,6,8,10,11,13,15,16,18,20,21,23,25,26,28,30};
        int target = -2100;
        Busqueda instance = new Busqueda();
        int expResult = 0;
        int result = instance.searchInsert(nums, target);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if(result != expResult)
        {
            fail("The test case is a prototype.");
        }
    }
    
    @Test
    public void testSearchInsert88() {
        System.out.println("searchInsert");
        int[] nums = {1,3,5,6,8,10,11,13,15,16,18,20,21,23,25,26,28,30};
        int target = -2200;
        Busqueda instance = new Busqueda();
        int expResult = 0;
        int result = instance.searchInsert(nums, target);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if(result != expResult)
        {
            fail("The test case is a prototype.");
        }
    }
    
    @Test
    public void testSearchInsert89() {
        System.out.println("searchInsert");
        int[] nums = {1,3,5,6,8,10,11,13,15,16,18,20,21,23,25,26,28,30};
        int target = -2300;
        Busqueda instance = new Busqueda();
        int expResult = 0;
        int result = instance.searchInsert(nums, target);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if(result != expResult)
        {
            fail("The test case is a prototype.");
        }
    }
    
    @Test
    public void testSearchInsert90() {
        System.out.println("searchInsert");
        int[] nums = {1,3,5,6,8,10,11,13,15,16,18,20,21,23,25,26,28,30};
        int target = -2400;
        Busqueda instance = new Busqueda();
        int expResult = 0;
        int result = instance.searchInsert(nums, target);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if(result != expResult)
        {
            fail("The test case is a prototype.");
        }
    }
    
    @Test
    public void testSearchInsert91() {
        System.out.println("searchInsert");
        int[] nums = {1,3,5,6,8,10,11,13,15,16,18,20,21,23,25,26,28,30};
        int target = -2500;
        Busqueda instance = new Busqueda();
        int expResult = 0;
        int result = instance.searchInsert(nums, target);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if(result != expResult)
        {
            fail("The test case is a prototype.");
        }
    }
    
    @Test
    public void testSearchInsert92() {
        System.out.println("searchInsert");
        int[] nums = {1,3,5,6,8,10,11,13,15,16,18,20,21,23,25,26,28,30};
        int target = 650;
        Busqueda instance = new Busqueda();
        int expResult = 18;
        int result = instance.searchInsert(nums, target);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if(result != expResult)
        {
            fail("The test case is a prototype.");
        }
    }
    
    @Test
    public void testSearchInsert93() {
        System.out.println("searchInsert");
        int[] nums = {1,3,5,6,8,10,11,13,15,16,18,20,21,23,25,26,28,30};
        int target = -2700;
        Busqueda instance = new Busqueda();
        int expResult = 0;
        int result = instance.searchInsert(nums, target);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if(result != expResult)
        {
            fail("The test case is a prototype.");
        }
    }
    
    @Test
    public void testSearchInsert94() {
        System.out.println("searchInsert");
        int[] nums = {1,3,5,6,8,10,11,13,15,16,18,20,21,23,25,26,28,30};
        int target = -2800;
        Busqueda instance = new Busqueda();
        int expResult = 0;
        int result = instance.searchInsert(nums, target);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if(result != expResult)
        {
            fail("The test case is a prototype.");
        }
    }
    
    @Test
    public void testSearchInsert95() {
        System.out.println("searchInsert");
        int[] nums = {1,3,5,6,8,10,11,13,15,16,18,20,21,23,25,26,28,30};
        int target = -2900;
        Busqueda instance = new Busqueda();
        int expResult = 0;
        int result = instance.searchInsert(nums, target);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if(result != expResult)
        {
            fail("The test case is a prototype.");
        }
    }
    
    @Test
    public void testSearchInsert96() {
        System.out.println("searchInsert");
        int[] nums = {1,3,5,6,8,10,11,13,15,16,18,20,21,23,25,26,28,30};
        int target = -2950;
        Busqueda instance = new Busqueda();
        int expResult = 0;
        int result = instance.searchInsert(nums, target);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if(result != expResult)
        {
            fail("The test case is a prototype.");
        }
    }
    
    @Test
    public void testSearchInsert97() {
        System.out.println("searchInsert");
        int[] nums = {1,3,5,6,8,10,11,13,15,16,18,20,21,23,25,26,28,30};
        int target = -2980;
        Busqueda instance = new Busqueda();
        int expResult = 0;
        int result = instance.searchInsert(nums, target);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if(result != expResult)
        {
            fail("The test case is a prototype.");
        }
    }
    
    @Test
    public void testSearchInsert98() {
        System.out.println("searchInsert");
        int[] nums = {1,3,5,6,8,10,11,13,15,16,18,20,21,23,25,26,28,30};
        int target = -2998;
        Busqueda instance = new Busqueda();
        int expResult = 0;
        int result = instance.searchInsert(nums, target);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if(result != expResult)
        {
            fail("The test case is a prototype.");
        }
    }
    
    @Test
    public void testSearchInsert99() {
        System.out.println("searchInsert");
        int[] nums = {1,3,5,6,8,10,11,13,15,16,18,20,21,23,25,26,28,30};
        int target = -2999;
        Busqueda instance = new Busqueda();
        int expResult = 0;
        int result = instance.searchInsert(nums, target);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if(result != expResult)
        {
            fail("The test case is a prototype.");
        }
    }
    
    @Test
    public void testSearchInsert100() {
        System.out.println("searchInsert");
        int[] nums = {1,3,5,6,8,10,11,13,15,16,18,20,21,23,25,26,28,30};
        int target = -3000;
        Busqueda instance = new Busqueda();
        int expResult = 0;
        int result = instance.searchInsert(nums, target);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if(result != expResult)
        {
            fail("The test case is a prototype.");
        }
    }
}
