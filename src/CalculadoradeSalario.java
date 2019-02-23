
public class CalculadoradeSalario {

	public double calcula(Funcionario funcionario) {

		return funcionario.getCargo().getRegra().calcula(funcionario);

	}

}
