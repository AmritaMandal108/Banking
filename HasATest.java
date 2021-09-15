public class HasATest {
	public static void main(String[] args) {

		Workbook wb = new Workbook();

		wb.ws1.a1.setValue("Fruit");
		wb.ws1.a2.setValue("Apple");
		wb.ws1.a3.setValue("Mango");
		wb.ws1.a4.setValue("Orange");
		wb.ws1.a5.setValue("Total");

		wb.ws1.b1.setValue("Qty");
		wb.ws1.b2.setValue("100");
		wb.ws1.b3.setValue("200");
		wb.ws1.b4.setValue("300");

		Integer sum = Integer.parseInt(wb.ws1.b2.getValue()) + Integer.parseInt(wb.ws1.b3.getValue())
				+ Integer.parseInt(wb.ws1.b4.getValue());
		String total = sum.toString(); // String.valueOf(sum); where sum is int

		wb.ws1.b5.setValue(total);

		wb.ws1.printWorkSheet();

		System.out.println("=========================");

		wb.ws2.a1.setValue("Subject");
		wb.ws2.a2.setValue("Physics");
		wb.ws2.a3.setValue("Chemistry");
		wb.ws2.a4.setValue("Maths");
		wb.ws2.a5.setValue("Total");

		wb.ws2.b1.setValue("Qty");
		wb.ws2.b2.setValue("85");
		wb.ws2.b3.setValue("90");
		wb.ws2.b4.setValue("95");

		Integer sum1 = Integer.parseInt(wb.ws2.b2.getValue()) + Integer.parseInt(wb.ws2.b3.getValue())
				+ Integer.parseInt(wb.ws2.b4.getValue());
		String total1 = sum1.toString(); // String.valueOf(sum); where sum is int

		wb.ws2.b5.setValue(total1);

		wb.ws2.printWorkSheet();

		wb.ws3.a1.setValue("Subject");
		wb.ws3.a2.setValue("RDBMS");
		wb.ws3.a3.setValue("JavaII");
		wb.ws3.a4.setValue("Angular");
		wb.ws3.a5.setValue("Total");

		wb.ws3.b1.setValue("Marks");
		wb.ws3.b2.setValue("92");
		wb.ws3.b3.setValue("94");
		wb.ws3.b4.setValue("89");

		Integer sum2 = Integer.parseInt(wb.ws3.b2.getValue()) + Integer.parseInt(wb.ws3.b3.getValue())
				+ Integer.parseInt(wb.ws3.b4.getValue());
		String total2 = sum2.toString();

		wb.ws3.b5.setValue(total2);
		System.out.println("=========================");
		wb.ws3.printWorkSheet();

		System.out.println("\n_______________Printing from Workbook_________________\n");
		wb.printWB();

	}

}

class Workbook {
	WorkSheet ws1 = new WorkSheet();
	WorkSheet ws2 = new WorkSheet();
	WorkSheet ws3 = new WorkSheet();

	void printWB() {
		ws1.printWorkSheet();
		System.out.println("--------------------");
		ws2.printWorkSheet();
		System.out.println("--------------------");
		ws3.printWorkSheet();
	}
}

class WorkSheet {
	Cell a1 = new Cell("A", 1); // hasA
	Cell a2 = new Cell("A", 2);
	Cell a3 = new Cell("A", 3);
	Cell a4 = new Cell("A", 4);
	Cell a5 = new Cell("A", 5);

	Cell b1 = new Cell("B", 1);
	Cell b2 = new Cell("B", 2);
	Cell b3 = new Cell("B", 3);
	Cell b4 = new Cell("B", 4);
	Cell b5 = new Cell("B", 5);

	public void printWorkSheet() {
		System.out.println(a1 + "\t" + b1);
		System.out.println(a2 + "\t" + b2);
		System.out.println(a3 + "\t" + b3);
		System.out.println(a4 + "\t" + b4);
		System.out.println(a5 + "\t" + b5);

	}
}

class Cell // Object
{
	private int rowNumber;
	private String columnName;
	private String value;

	public Cell(String columnName, int rowNumber, String value) {
		super();
		this.rowNumber = rowNumber;
		this.columnName = columnName;
		this.value = value;
	}

	public Cell(String columnName, int rowNumber) {
		super();
		this.columnName = columnName;
		this.rowNumber = rowNumber;
	}

	public Cell() {
		super(); // Constructor call must be the first statement in a constructor
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		// super(); //Constructor call must be the first statement in a constructor
		return columnName + rowNumber + " " + value;
	}

	public int getRowNumber() {
		return rowNumber;
	}

	public void setRowNumber(int rowNumber) {
		this.rowNumber = rowNumber;
	}

	public String getColumnName() {
		return columnName;
	}

	public void setColumnName(String columnName) {
		this.columnName = columnName;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

}
/*
 * public class HasATest {
 * 
 * public static void main(String[] args) { /*Cell a1 = new Cell("A", 1,
 * "Fruit"); Cell a2 = new Cell("A", 2, "Mango");
 * 
 * Cell b1 = new Cell("B", 1, "Qty"); Cell b2 = new Cell("B", 2, "200");
 * 
 * Worksheet ws1= new Worksheet();
 * 
 * ws1.a1.setColName("A"); ws1.a1.setRowNum(1); ws1.a1.setValue("Fruit");
 * ws1.a2.setColName("B"); ws1.a2.setRowNum(2); ws1.a2.setValue("Apple");
 * 
 * }
 * 
 * }
 * 
 * class Worksheet { Cell a1 = new Cell(); Cell a2 = new Cell();
 * 
 * Cell b1 = new Cell(); Cell b2 = new Cell(); }
 * 
 * class Cell { int rowNum; String colName; String value;
 * 
 * public Cell() { super(); this.rowNum = rowNum; this.colName = colName;
 * this.value = value; }
 * 
 * @Override public String toString() { return colName + rowNum + value; }
 * 
 * public int getRowNum() { return rowNum; }
 * 
 * public void setRowNum(int rowNum) { this.rowNum = rowNum; }
 * 
 * public String getColName() { return colName; }
 * 
 * public void setColName(String colName) { this.colName = colName; }
 * 
 * public String getValue() { return value; }
 * 
 * public void setValue(String value) { this.value = value; }
 * 
 * }
 */