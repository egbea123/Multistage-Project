/**
 * 
 */
package com.simplilearn.ticket.Generator;
import static org.junit.Assert.*;
import org.springframework.boot.test.context.SpringBootTest;
import com.simplilearn.ticketGenerator.TicketGeneratorApplication;

import org.junit.Test;

/**
 * @author devops002
 *
 */
@SpringBootTest
public class TicketGenerationApplicationTest {
	
	 private TicketGeneratorApplication ticketer = new TicketGeneratorApplication();
	@Test
	public void testRandomNumber() {
		assertTrue(ticketer.getRandomTicketNumber()>1000&&ticketer.getRandomTicketNumber()<9999);	 
	}

}
