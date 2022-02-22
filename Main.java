public class Main
{
	public static void main(String[] args) {
		Bicicleta miMiniBici = new Bicicleta();
		System.out.println("Tengo una nueva bici marca "+ miMiniBici.getMarca() +" de color "+ miMiniBici.getColor());
		System.out.println("Me apetece cambiarle el color a mi bici, entonces le voy a poner de color verde ");
		miMiniBici.setColor("Verde");
		System.out.println("Listo, ahora mi bici es de color "+ miMiniBici.getColor());
		System.out.println("Voy a salir un rato en ella, entonces le voy a pedalear");
		miMiniBici.pedalear(10.0);
		miMiniBici.pedalear(10.0);
		miMiniBici.pedalear(10.0);
		miMiniBici.pedalear(10.0);
		miMiniBici.pedalear(10.0);
		miMiniBici.pedalear(10.0);
		miMiniBici.frenar(30.0);
		System.out.println("Estoy feliz de poder ir en mi bici");
	}
}
