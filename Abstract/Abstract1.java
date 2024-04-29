abstract class Ab{
	public void pen(){
		//Concrete
		System.out.println("You can't edit the properties of the pen");

	}

	public void tv(){
		// Concrete 
		System.out.println("You have the remote but your all are watching the same channel");
	}

	 abstract void bike(); // Abstract


}

class Son1 extends Ab{

	Son1(){
		System.out.println("Son1");

	}
	 public void bike(){

		System.out.println("You are driving at 100kmph");
	}


}


class Son2 extends Ab{

	Son2(){
		System.out.println("Son2");

	}

	public void bike(){
		super.tv();
		super.pen(); // concrete
		System.out.println("You are driving it at 200kmph");
	}
}

class Abstract1{
	public static void main(String args[]){
		Son1 M=new Son1();

		Son2 N=new Son2();

		M.bike();

		N.bike();
		
	}



}