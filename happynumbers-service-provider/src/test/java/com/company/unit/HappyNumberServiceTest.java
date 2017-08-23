package com.company.unit;

import com.company.integration.service.HappyNumberService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import static org.junit.Assert.*;

@RunWith(JUnit4.class)
public class HappyNumberServiceTest {

    private final static Logger logger = LoggerFactory.getLogger(HappyNumberServiceTest.class);

    private HappyNumberService happyNumberService = new HappyNumberService();

    @Test
    public void getHappyNumbers() throws Exception {
       logger.info("HappyNumberServiceTest: getHappyNumbers test called");
       assertNotNull(happyNumberService.getHappyNumbers(1000));
    }

    @Test
    public void isHappy() throws Exception {
        logger.info("HappyNumberServiceTest: isHappy test called");
        assertTrue(happyNumberService.isHappy(7));
    }

    @Test
    public void isNotHappy() throws Exception {
        logger.info("HappyNumberServiceTest: isNotHappy test called");
        assertFalse(happyNumberService.isHappy(112));
    }

    @Test
    public void getSum() throws Exception {
        logger.info("HappyNumberServiceTest: getSum test called");
        assertSame(happyNumberService.getSum(48),80);
    }
}