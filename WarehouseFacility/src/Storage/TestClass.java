package Storage;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestClass {

	@Test
	public void testStep1() {
		SubWarehouse sb = new SubWarehouse();
		
		//populating the ArrayLists   
		sb.itemWeights.add(56);
		sb.itemWeights.add(59);
		sb.itemWeights.add(80);       // itemWeights = {56 , 59 , 80 , 64, 75 , 17};
		sb.itemWeights.add(64);
		sb.itemWeights.add(75);
		sb.itemWeights.add(17);
		
		
		sb.itemProfits.add(50);                                
		sb.itemProfits.add(50);
		sb.itemProfits.add(64);
		sb.itemProfits.add(46);		  // itemProfits = {50 , 50 , 64 , 46 , 50 , 5}; 
		sb.itemProfits.add(50);
		sb.itemProfits.add(5);

		sb.maxCapacity = 190;          	   //maximum warehouse capacity = 190 weight unit
		sb.availableItems = 6; 			   //available items are 6
		
		sb.optimizeSelection();
		assertEquals("Should be equal kaza", 150, sb.maxChosenProfit, 0);
		//fail("Not yet implemented");
	}
	
	@Test
	public void testStep2() {
		SubWarehouse sb = new SubWarehouse();

		
		DataLoader.loadArray("kp100.txt", sb.itemWeights, sb.itemProfits, sb.maxCapacity);
		  
		sb.maxCapacity= 49877;
		sb.availableItems = 10000 ;
		sb.optimizeSelection();
		System.out.println( "Max Profit " + sb.maxChosenProfit); // should be Max Profit 594669   
		
		
		
		fail("Not yet implemented");

	}

}
