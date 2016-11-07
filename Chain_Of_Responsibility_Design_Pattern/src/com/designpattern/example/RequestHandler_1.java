package com.designpattern.example;

public class RequestHandler_1 implements Handler {
	
	Handler successor=null;

	public void setSuccessor(Handler h) {
		
		successor=h;
	}

	public void handleRequest(String request) {
		
		if(request.equals("R1")){
			
			System.out.println("This is My work I will handle it.. "+"I am "+this.getClass().getName());
			
			
		}else{
			
			if(successor!=null){
				
			successor.handleRequest(request);
				
				
			}else{
				
				System.out.println("Request "+request+" is not hadled");
			}
		}
		
		
	}

}
