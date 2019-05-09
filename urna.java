/*IMPORTANDO A FUNÇÃO DE INSEÇÃO DE DADOS PELO TECLADO*/
import java.util.Scanner;

class Candidato {
  /*ATRIBUTOS DA CLASSE CANDIDATO*/
  private String Nome;
  private String Partido;
  private int QtdVotos;
  
  /*CONSTRUTOR DA CLASSE CANDIDATO*/
  public Candidato(String Nome, String Partido){
      this.Nome = Nome;
      this.Partido = Partido;
      this.QtdVotos = 0;
  }

  /*MÉTODOS DA CLASSE CANDIDATO*/
  public String getNome(){
      return Nome;
  }
  public String getNPartido(){
      return Partido;
  }
  public int getNumeroVotos(){
      return QtdVotos;
  }
  public void NumeroVotos(){
      this.QtdVotos+=1;
  }
}

class Urna{
  /*ATRIBUTOS DA CLASSE URNA*/
  private Candidato candidato1;
  private Candidato candidato2;
  private int votosBrancosNulos;
  private int totalVotos;
  
  Scanner teclado = new Scanner(System.in);
  
  /*CONSTRUTOR DA CLASSE URNA*/
  public Urna(Candidato candidato1, Candidato candidato2){
    this.candidato1 = candidato1;
    this.candidato2 = candidato2;
    this.votosBrancosNulos = 0;
    this.totalVotos = 0;
  }

  /*MÉTODOS DA CLASSE URNA*/ 
  public void Votar(){
    while(true){
    System.out.println("DIGITE 1 PARA VOTAR EM " + candidato1.getNome());
    System.out.println("DIGITE 2 PARA VOTAR EM " + candidato2.getNome());
    System.out.println("DIGITE 3 PARA VOTAR NULO OU BRANCO");
    System.out.println("DIGITE 0 PARA SAIR");
      int v = teclado.nextInt();
      if(v==0){
          break;
      }
      else{
          votar(v);
      }
    }
      
  }
  public void VotarComRecursividade(){
    System.out.println("DIGITE 1 PARA VOTAR EM " + candidato1.getNome());
    System.out.println("DIGITE 2 PARA VOTAR EM " + candidato2.getNome());
    System.out.println("DIGITE 3 PARA VOTAR NULO OU BRANCO");
    System.out.println("DIGITE 0 PARA SAIR");

    int v = teclado.nextInt();
    if(v!=0){
      votar(v);
      VotarComRecursividade();
    }
    
  }

  public void votar(int voto){
    if (voto == 1){
      candidato1.NumeroVotos();
      totalVotos +=1;
    }
    else if (voto == 2){
      candidato2.NumeroVotos();
      totalVotos +=1;
    }
    else{
      votosBrancosNulos +=1;
      totalVotos +=1;
    }
  }
  public void exibirTotalGeralDeVotos(){
    System.out.println("NUMERO TOTAL DE VOTOS:" + totalVotos);
  }
  public void exibirTotaldeVotosNulosBrancos(){
    System.out.println("TOTAL DE VOTOS BRANCOS E NULOS:" + votosBrancosNulos);
  }
  public void exibirTotalDeVotosDosCandidatos(){
    int soma = candidato1.getNumeroVotos()+candidato2.getNumeroVotos();
    System.out.println ("TOTAL DE VOTOS VALIDOS = " + soma);
  }
  public void exibirDadosdoCandidatoVencedor (){
    if (candidato1.getNumeroVotos() > candidato2.getNumeroVotos()){
      System.out.println("CANDIDATO ELEITO = "+ candidato1.getNome());
      System.out.println("NOME DO PARTIDO = "+ candidato1.getNPartido());
      System.out.println("NUMERO DE VOTOS = "+ candidato1.getNumeroVotos());
    }
    else if (candidato1.getNumeroVotos() == candidato2.getNumeroVotos()){
      System.out.println("SEGUNDO TURNO");
    }
    else {
      System.out.println("CANDIDATO ELEITO: "+ candidato2.getNome());
      System.out.println(": "+ candidato2.getNPartido());
      System.out.println("NUMERO DE VOTOS: "+ candidato2.getNumeroVotos());
    }
          
  }
  public void exibirVotosDeCadaCandidato(){
    System.out.println("CANDIDATO " + candidato1.getNome() +  " OBTEVE " + candidato1.getNumeroVotos() + " VOTOS");
    System.out.println("CANDIDATO " + candidato2.getNome() +  " OBTEVE " + candidato2.getNumeroVotos() + " VOTOS");
  }
}

/*CLASSE PRINCPAL DO PROGRAMA, RESPONSÁVEL PELA EXECUÇÃO*/
public class Main{
  public static void main(String[] args){
    Candidato c1 = new Candidato("JOSÉ", "PARTIDO DA FELICIDADE");
    Candidato c2 = new Candidato("JOÃO","PARTIDO DA ESPERANÇA");
    Urna urna = new Urna(c1, c2);
    
    urna.Votar();
    //urna.VotarComRecursividade();
    urna.exibirTotalGeralDeVotos();
    urna.exibirTotaldeVotosNulosBrancos();
    urna.exibirTotalDeVotosDosCandidatos();
    urna.exibirVotosDeCadaCandidato();
    urna.exibirDadosdoCandidatoVencedor();
  }
  
}
