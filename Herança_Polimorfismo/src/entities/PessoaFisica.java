package entities;

public class PessoaFisica extends Contribuinte{
	
	private Double gastosSaude;
	
	public PessoaFisica () {
		super();
	}
	
	
	public PessoaFisica(String name, Double rendaAnual, Double gastosSaude) {
		super(name, rendaAnual);
		this.gastosSaude = gastosSaude;
	}



	public Double getGastosSaude() {
		return gastosSaude;
	}


	public void setGastosSaude(Double gastosSaude) {
		this.gastosSaude = gastosSaude;
	}

	
	

	@Override
	public double calculoImposto() {
		double imposto;
		if (rendaAnual < 20000.00) {
			imposto = (rendaAnual * 0.15) - (gastosSaude * 0.5);
		}
		
		else {
			imposto = (rendaAnual * 0.25) - (gastosSaude * 0.5);
		}
		
		return imposto;
	}

}
