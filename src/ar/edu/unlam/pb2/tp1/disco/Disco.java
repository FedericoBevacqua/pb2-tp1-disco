package ar.edu.unlam.pb2.tp1.disco;

public class Disco {
	private Double radioInterior;
	private Double radioExterior;
	
	public Disco(Double radioInterior, Double radioExterior) {
		super();
		this.setRadioInterior(radioInterior);
		this.setRadioExterior(radioExterior);
	}

	public Double getRadioInterior() {
		return radioInterior;
	}
	public void setRadioInterior(Double radioInterior) {
		this.radioInterior = radioInterior;
	}
	public Double getRadioExterior() {
		return radioExterior;
	}
	public void setRadioExterior(Double radioExterior) {
		this.radioExterior = radioExterior;
	}
	
	public Double obtenerPerimetroInterior() {
		Double perimetroInterior = 2 * Math.PI * this.getRadioInterior();
		return perimetroInterior;
	}
	
	public Double obtenerPerimetroExterior() {
		Double perimetroExterior = 2 * Math.PI * this.getRadioExterior();
		return perimetroExterior;
	}
	
	public Double obtenerSuperficie() {
		Double superficieInterior = Math.PI * Math.pow(this.getRadioInterior(), 2);
		Double superficieExterior = Math.PI * Math.pow(this.getRadioExterior(), 2);
		return (superficieExterior - superficieInterior);
	}

}