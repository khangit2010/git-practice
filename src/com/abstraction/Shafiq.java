package com.abstraction;

public  class Shafiq extends MobileUser {
	
	@Override
		public  void sendMessage() {
			System.out.println("Hello, how are you?");
		}
			

	public static void main(String[] args) {
		
		MobileUser	s;
		
		s = new Shafiq();
		s.sendMessage();

	}

}
