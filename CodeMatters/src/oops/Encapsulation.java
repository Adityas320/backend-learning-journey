package oops;
class Temprature{
	private int temprature=100;
	Temprature(){
		System.out.println("initial temprature :"+temprature);
	}
	public void Itemp(int x) {
		if(x>0) {
			temprature=temprature+x;
		}
		System.out.println(temprature);
	}
	public void Dtemp(int x) {
		if(x>0&&temprature>x) {
			temprature=temprature-x;
		}
		System.out.println(temprature);
	}
}

public class Encapsulation {

	public static void main(String[] args) {
		Temprature t1=new Temprature();
		t1.Dtemp(30);
	}

}
//setters are avoided because they have direct access to varibles
//and anyclass can change the value of variable or provide
//wrong input to avoid this we avoid setters and create update methods

//encapsulation is improved because we have hided data but also solved
//an issue of direct access
