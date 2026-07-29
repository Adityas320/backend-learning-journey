package Exception;

class OrderException extends RuntimeException {
	public OrderException(String message, Throwable cause) {
		super(message,cause);
	}
}
public class a6 {
	public void checkStock() {
		throw new RuntimeException("out of stock");
	}
	public void placeOrder() {
		try {
			checkStock();
		}catch(RuntimeException e) {
			throw new OrderException("order failed", e);
		}
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		a6 demo = new a6();
		try {
			demo.placeOrder();
		} catch(OrderException e) {
			System.out.println(e.getMessage()+" "+e.getCause());
		}
	}
		
	}
