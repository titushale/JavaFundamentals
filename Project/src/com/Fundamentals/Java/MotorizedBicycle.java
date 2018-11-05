package com.Fundamentals.Java;

public class MotorizedBicycle {
	public class motorizedBicycle extends Bicycle {
		
		private String hasEngine;

		public void setHasEngine(String hasEngine ) {
			this.hasEngine = hasEngine;
			
		}

		public String getHasEngine () {
			return hasEngine;
		}
		}
	
public void pedalling() {
	System.out.println("Pedalling Fast");
}
	
	
}