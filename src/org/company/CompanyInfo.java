package org.company;

public class CompanyInfo {
	private void companyName() {
		System.out.println("My company Name is Integra Software Services");
	}

	private void companyId() {
		System.out.println("12345");
	}

	private void companyAddress() {
		System.out.println("Company Address: Pondicherry");
	}

	public static void main(String[] args) {
		CompanyInfo c = new CompanyInfo();
		c.companyAddress();
		c.companyId();
		c.companyName();
	}

}
