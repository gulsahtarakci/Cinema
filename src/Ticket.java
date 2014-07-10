
public class Ticket {
	private Saloon saloon;
	private Session session;
	private int x;
	private int y;
	public Saloon getSaloon() {
		return saloon;
	}
	public Session getSession() {
		return session;
	}
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	public Ticket(Saloon saloon, Session session, int x, int y) {
		super();
		this.saloon = saloon;
		this.session = session;
		this.x = x;
		this.y = y;
	}
	@Override
	public String toString() {
		return "Ticket [saloon=" + saloon + ", session=" + session + ", x=" + x
				+ ", y=" + y + "]";
	}
	
}
