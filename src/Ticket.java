
public class Ticket {
	private Saloon saloon;
	private Hour session;
	public int id;
	
	private int row;
	private int column;
	public Saloon getSaloon() {
		return saloon;
	}
	public Hour getSession() {
		return session;
	}
	public int getRow() {
		return row;
	}
	public int getColumn() {
		return column;
	}
	public int getId() {
		return id;
	}
	public Ticket(Saloon saloon, Hour session, int x, int y) {
		super();
		this.saloon = saloon;
		this.session = session;
		this.row = x;
		this.column = y;
	}
	@Override
	public String toString() {
		return "Ticket [saloon=" + saloon + ", session=" + session + ", row=" + row
				+ ", column=" + column + "]";
	}
	
}
