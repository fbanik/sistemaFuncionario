package entities;

public class Funcionario {
public String name;
public double salarioBruto;
public double taxa;

public double netSalary() {
	return salarioBruto - taxa;
}
public void increaseSalary(double porcentagem) {
	salarioBruto = salarioBruto + salarioBruto * porcentagem /100;
}
public String toString() {
	return name + ", $" + String.format("%.2f%n", netSalary()) ;
	
}
}
