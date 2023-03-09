package questoesconceito;

import java.sql.Connection;

public class CriaBanco {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		private Connection conexao;
		private static CriaBanco instancia;
		private final String DATABASE = "pratica01";
		private final String USER = "root";
		private final String PSW = "aluno";

		private criaBanco() {}

		public static CriaBanco getInstancia() {
		if(instancia == null) {
		instancia = new criaBanco();
		}
		return instancia;
		}

		public Connection conectar() {
		try {
		conexao = DriverManager.getConnection("jdbc:mysql://localhost/"+ DATABASE + "?serverTimeZone=UTC",USER,PSW);
		} catch (SQLException e) {
		e.printStackTrace();
		}
		return conexao;

		}
		public boolean fecharConexao() {

		try {
		conexao.close();
		} catch (SQLException e) {
		e.printStackTrace();
		}
		return true;
		}
	}

}
