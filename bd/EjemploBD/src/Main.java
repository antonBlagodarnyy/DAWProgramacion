
public class Main {
	﻿

	public static void main(String[] args) {
	// Configuración de la conexión a la base de datos Oracle XE
	String url="jdbc: oracle: thin: @localhost:1521:XE"; // URL de conexión 
	// Intenta establecer la conexión
	try (Connection conn = DriverManager.getConnection (url, "SYSTEM", "asd"); 
			//Indicamos usuario y contraseña
			
			Statement stmt = conn.createStatement ()) {
		// Declaración de la sentencia SQL
		String sql = "INSERT INTO empleados (id, nombre, salario) + "VALUES ('3', 'CSCI', 3720)";
		
				// Ejecutar la sentencia SQL
				stmt.executeUpdate(sql);
				// Declaración de la sentencia SQL
				String sql = "SELECT ID, Nombre, Salario FROM Empleados";
				// Intenta establecer la conexión y ejecutar la consulta
				try (Connection conn = DriverManager.getConnection (url, usuario, contraseña); Statement stmt = conn.createStatement ();
				ResultSet rs = stmt.executeQuery (sql)) {

				/*	
				// Recorre el ResultSet e imprime los datos while (rs.next()) {
				while(rs.next()) {
				int id =rs.getInt("ID");
				String nombre= rs.getString("Nombre");
				
				double salario =rs.getDouble ("Salario");
				
				System.out.println("ID: " + id + ", Nombre:
				"
				}
*/
	}
