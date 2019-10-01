
package AtivTerceiroB;

import java.util.ArrayList;
import java.util.List;

public class Estacionamento {
	private List<VeiculoT> veiculos = new ArrayList<>();
	private int qtdMotos = 0, qtdCarros = 0, qtdCaminhao = 0, qtdBus = 0;
	 
	 public void adicionar(VeiculoT v){
			 	veiculos.add(v);
	 }
	 
	 public int quantidadeVeiculos() {
		 int qtdVeiculos = 0;
		 for (int i = 0; i < veiculos.size(); i++) {
			 qtdVeiculos += 1;
		 }
		 return qtdVeiculos;
	 }
	 
	 public double calcularTotal(){
		 double total = 0;
		 for (int i = 0; i < veiculos.size(); i++){
			 total += veiculos.get(i).getValor();
	    }
		 
		 return total;
	 }
	 
	 public void apresentarTodos() {
		 for(int i=0; i< veiculos.size(); i++){
		 	 System.out.println(veiculos.get(i).ToString()); 
		 }
	 }
	 public void countPorTipo() {
		 qtdMotos = qtdCarros = qtdCaminhao = qtdBus = 0;
			for(int i = 0; i < veiculos.size(); i++) {
				if (veiculos.get(i) != null) {
					if (veiculos.get(i) instanceof Moto) {
						qtdMotos += 1;
					}
					if (veiculos.get(i) instanceof Carro) {
						qtdCarros += 1;
					}
					if (veiculos.get(i) instanceof Caminhao) {
						qtdCaminhao += 1;
					}
					if (veiculos.get(i) instanceof Onibus) {
						qtdBus += 1; 
					}
				}
			}
			System.out.println("Quantidade de Motos: " + qtdMotos);
			System.out.println("Quantidade de Carros: " + qtdCarros);
			System.out.println("Quantidade de Caminhao: " + qtdCaminhao);
			System.out.println("Quantidade de Onibus: " + qtdBus + "\n");
	 }
	 
	 public void menorValor() {
		 double menor = veiculos.get(0).getValor();
		 VeiculoT tipo = veiculos.get(0);
		 for (int j = 1; j < veiculos.size(); j++) {
			 if(menor > veiculos.get(j).getValor()) {
				 menor = veiculos.get(j).getValor();
				 tipo = veiculos.get(j);
			 }
			 
		 }
		 if( tipo instanceof Moto) {
			 System.out.println("Valor do menor veiculo: " + menor + " Seu tipo eh Moto" + "\n");
		 }
		 if (tipo instanceof Carro) {
			 System.out.println("Valor do menor veiculo: " + menor + " Seu tipo eh Carro" + "\n");
		 }
		 
		 if (tipo instanceof Caminhao) {
			 System.out.println("Valor do menor veiculo: " + menor + " Seu tipo eh Caminhao" + "\n");
		 }
		 
		 if(tipo instanceof Onibus){
			 System.out.println("Valor do menor veiculo: " + menor + " Seu tipo eh Onibus" + "\n");
		 }
	 }
	 
	 public void maiorQtd() {
		 int[] qtdVeiculos = {qtdMotos, qtdCarros, qtdCaminhao, qtdBus};
		 int maior = qtdVeiculos[0];
		 for (int j = 1; j < qtdVeiculos.length; j++) {
			 if(maior < qtdVeiculos[j]) {
				 maior = qtdVeiculos[j];
			 }
		 }
		 if(maior == qtdVeiculos[0]) {
			 System.out.println("O tipo de veiculo de maior quantidade eh Moto" + "\n");
		 }
		 if (maior == qtdVeiculos[1]) {
			 System.out.println("O tipo de veiculo de maior quantidade eh Carro" + "\n");
		 }
		 
		 if (maior == qtdVeiculos[2]) {
			 System.out.println("O tipo de veiculo de maior quantidade eh Caminhao" + "\n");
		 }
		 
		 if(maior == qtdVeiculos[3]){
			 System.out.println("O tipo de veiculo de maior quantidade eh Onibus" + "\n");
		 }
	 }
		
	 public void acelerarTodos() {
		 for (int i = 0; i < veiculos.size(); i++) {
			 veiculos.get(i).acelerar();
		 }
	 }
	 
	 public void frearTodos() {
		 for (int i = 0; i < veiculos.size(); i++) {
			 veiculos.get(i).frear();
		 }
	 }
	
	 
}
