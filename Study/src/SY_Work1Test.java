import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SY_Work1Test {
    private SY_Work1 sy_work1 ;
    @Before
    public void setUp() throws Exception {
        sy_work1 = new SY_Work1();
    }

    @Test
    public void test1() {
        /*// 测试独立路径 1 - 4 - 5 - 7
        sy_work1 = new SY_Work1(1,2,0);
        sy_work1.test();
        assertEquals(sy_work1.getA(),1);
        assertEquals(sy_work1.getB(),2);
        assertEquals(sy_work1.getX(),0);*/

        /*//测试独立路径 1 - 4 - 5 - 6 - 7
        sy_work1 = new SY_Work1(1,2,2);
        sy_work1.test();
        assertEquals(sy_work1.getA(),1);
        assertEquals(sy_work1.getB(),2);
        assertEquals(sy_work1.getX(),3);*/

       /* //测试独立路径 1 - 4 - 6 - 7
        sy_work1 = new SY_Work1(2,1,0);
        sy_work1.test();
        assertEquals(sy_work1.getA(),2);
        assertEquals(sy_work1.getB(),1);
        assertEquals(sy_work1.getX(),1);*/

       /* // 测试独立路径 ： 1 - 2- 4 -5 -7
        sy_work1 = new SY_Work1(3,1,0);
        sy_work1.test();
        assertEquals(sy_work1.getA(),3);
        assertEquals(sy_work1.getB(),1);
        assertEquals(sy_work1.getX(),0);*/

       //测试独立路径 5
        sy_work1 = new SY_Work1(3,0,0);
        sy_work1.test();
        assertEquals(sy_work1.getA(),3);
        assertEquals(sy_work1.getB(),0);
        assertEquals(sy_work1.getX(),0);

    }
}