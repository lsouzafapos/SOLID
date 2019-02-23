
public enum Cargo {

	DESENVOLVEDOR(new DezOuVintePorCento()),
	DBA(new QuinzeOuVinteCincoPorCento()),
	TESTER(new QuinzeOuVinteCincoPorCento());
	
	private RegraDeCalculo regra;
	
	public RegraDeCalculo getRegra() {
		return regra;
	}
	
	private Cargo(RegraDeCalculo regra) {
		this.regra = regra;
	}
}
