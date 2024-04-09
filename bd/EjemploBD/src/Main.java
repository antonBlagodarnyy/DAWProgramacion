import java.sql.*;
public class Main {


	public static void main(String[] args) {
		// Configuración de la conexión a la base de datos Oracle XE
		String url = "jdbc:oracle:thin:@localhost:1521:XE"; // URL de conexión
		String usuario = "SYSTEM"; // Usuario de la base de datos
		String contraseña = "Admin2023"; // Contraseña de la base de datos

		// Intenta establecer la conexión y ejecutar la consulta
		try (Connection conn = DriverManager.getConnection(url, usuario, contraseña);
				Statement stmt = conn.createStatement()) {
			// Declaración de la sentencia SQL para inserción
			String insertSql = "INSERT INTO empleados (dni, nombre, salario) VALUES (3, 'CSCI', 3720)";
			// Ejecutar la sentencia SQL para inserción
			stmt.executeUpdate(insertSql);

		} catch (SQLException e) {
			System.out.println("Insert fallido");
		}

		try (Connection conn = DriverManager.getConnection(url, usuario, contraseña);
				Statement stmt = conn.createStatement()) {
			// Declaración de la sentencia SQL
			String selectSql = "SELECT DNI, NOMBRE, SALARIO FROM Empleados";
			ResultSet rs = stmt.executeQuery (selectSql);

			//Recorre el ResultSet e imprime los datos
			while(rs.next()) {
				int id =rs.getInt("DNI");
				String nombre= rs.getString("NOMBRE");

				int salario =rs.getInt ("SALARIO");

				System.out.println("ID: " + id + ", Nombre: " + nombre + ", Salario: " + salario);
			}
		} catch (SQLException e) {
			System.out.println("Seleccion fallida");
		}
	}
}


