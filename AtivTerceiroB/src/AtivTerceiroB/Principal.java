package AtivTerceiroB;

public class Principal {
	public static void main(String[] args){
		 Estacionamento est = new Estacionamento();
		 
		 VeiculoT motoca = new Moto(10, "nova", 2018, "zyq-1234", 19500.9, 300);
		 VeiculoT xineray = new Moto(10, "usada", 2011, "zkl-1234", 3000.9, 200);
		 VeiculoT chevett = new Carro(50, "velho", 1996, "kkj-6723", 1558.3, 4, 200);
		 VeiculoT chevrolet = new Carro(50, "velho", 2000, "2kj-6723", 1600.3, 4, 200);
		 VeiculoT opala = new Carro(50, "novo", 2000, "2kj-6723", 7600.3, 4, 200);
		 VeiculoT mercedes = new Caminhao(8, "usado", 2009, "nsp-2091", 50000, 500, 11);
		 VeiculoT busLaitir = new Onibus(8, "usado", 2009, "nsp-2091", 10, 12, 60);
		 
		 est.adicionar(motoca);
		 est.adicionar(xineray);
		 est.adicionar(chevett);
		 est.adicionar(chevrolet);
		 est.adicionar(opala);
		 est.adicionar(mercedes);
		 est.adicionar(busLaitir);
		 
		 
		 est.countPorTipo();
		 est.menorValor();
		 
		 System.out.println("O valor total da frota eh: " + est.calcularTotal()+ "\n");
		 System.out.println("A quantidade veiculos cadastrados no estacionamento eh: " + est.quantidadeVeiculos() + "\n");
		 est.maiorQtd();
		 
		 est.acelerarTodos();
		 est.frearTodos();
		 est.apresentarTodos();
		 }
	
}
