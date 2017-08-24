package com.company.integration;

import com.company.integration.service.HappyNumberService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class HappyNumberServiceIntegrationTest {

    private final static Logger logger = LoggerFactory.getLogger(HappyNumberServiceIntegrationTest.class);

    @Autowired
    private HappyNumberService happyNumberService;

    @Test
    public void contextLoads() {
        logger.info("HappyNumberServiceIntegrationTest: contextLoads test called");
        assertThat(happyNumberService).isNotNull();
    }

    @Test
    public void getHappyNumbers() throws Exception {
       logger.info("HappyNumberServiceIntegrationTest: getHappyNumbers test called");
       assertNotNull(happyNumberService.getHappyNumbers(1000));
    }

    @Test
    public void isHappy() throws Exception {
        logger.info("HappyNumberServiceIntegrationTest: isHappy test called");
        assertTrue(happyNumberService.isHappy(7));
    }

    @Test
    public void isNotHappy() throws Exception {
        logger.info("HappyNumberServiceIntegrationTest: isNotHappy test called");
        assertFalse(happyNumberService.isHappy(112));
    }

    @Test
    public void getSum() throws Exception {
        logger.info("HappyNumberServiceIntegrationTest: getSum test called");
        assertSame(happyNumberService.getSum(48),80);
    }
}