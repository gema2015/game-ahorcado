package ahorcado_v2;

public class Jugador {
	
	private String usuario;
	private String dificultad;
	private int vidas;
	
	public Jugador (){}
	public Jugador (String usuario,String dificultad){
		this.usuario=usuario;
		this.dificultad=dificultad;
		
		if (dificultad=="Facil"){
			vidas=8;
		}
		if (dificultad=="Normal"){
			vidas=6;
		}
		if (dificultad=="Dificil"){
			vidas=4;
		}
		
		
		
		
	}
	
	public int pierdeVida(){
		vidas--;
		return vidas;
	}
	
	
		
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getDificultad() {
		return dificultad;
	}
	public void setDificultad(String dificultad) {
		this.dificultad = dificultad;
	}
	public int getVidas() {
		return vidas;
	}
	public void setVidas(int vidas) {
		this.vidas = vidas;
	}
	
	

}
