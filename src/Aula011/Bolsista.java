package Aula011;

public class Bolsista extends Aluno1{
	private float bolsa;
	
	public void renovarBolsa() {
		System.out.println("Renovado bolsa de " + this.getNome());
		
		}
	@Override
	public void pagarMensalidade() {
		System.out.println(this.getNome() +" é bolsista! Pagamento facilitado.");
	}
	public float getBolsa() {
		return bolsa;
	}
	public void setBolsa(float bolsa) {
		this.bolsa = bolsa;
	}
}
