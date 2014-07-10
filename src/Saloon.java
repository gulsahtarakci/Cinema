
public class Saloon {
	private int rows;
	private int cols;
	private String name;
	public int getRows() {
		return rows;
	}
	public int getCols() {
		return cols;
	}
	public String getName() {
		return name;
	}
	public Saloon(String name, int rows, int cols) {
		super();
		this.rows = rows;
		this.cols = cols;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Saloon [rows=" + rows + ", cols=" + cols + ", name=" + name
				+ "]";
	}
	
	
	
	
}
