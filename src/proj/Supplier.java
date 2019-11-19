package proj;

public class Supplier {
	private String supplierName;

	public Supplier(String supplierName) {

		this.supplierName = supplierName;
	}

	public Supplier() {
		this.supplierName = "NONE";
	}

	public String getSupplierName() {
		return supplierName;
	}

	public void setSupplierName(String supplierName) {
		this.supplierName = supplierName;
	}



}
