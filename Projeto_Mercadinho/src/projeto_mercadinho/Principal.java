package projeto_mercadinho;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Principal {
    public static void main(String[] args) throws ParseException{   
     
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
    
        Mercadinho m = new Mercadinho("Boa opção", "Josivaldo");

        Proprietario p = new Proprietario("Josivaldo",sdf.parse("2002-09-21"),"Masculino", m);

        Bebida p1 = new Bebida(5,5165,"muito boa, chega desce queimando",sdf.parse("2002-09-21"), sdf.parse("2005-09-21"), 32, m);
        Alimento a1 = new Alimento("artificial",5167,"Comida bem artificial",sdf.parse("2011-09-21"), sdf.parse("2022-09-21"), 32, m);
        Limpeza l1 = new Limpeza("nocivo",5168,"limpa até a limpeza",sdf.parse("2011-09-21"), sdf.parse("2020-09-21"), 32, m);
        Alimento a2 = new Alimento("natural",5169,"Comida bem artificial",sdf.parse("2011-09-21"), sdf.parse("2022-09-21"), 32, m);
        
        m.inserir(0,p1);
        m.inserir(1,a1);
        m.inserir(2,l1);
        
        System.out.println(m.numprodutos());
        
        ArrayList <Produto> estragados;
        
        estragados = m.vencidos();
        for(int i=0;i<estragados.size();i++){
            System.out.println(estragados.get(i));
        }
        
        m.alterar(1, a2);
        System.out.println(m.consultar(1));
        
        m.remover(1);
        
        System.out.println(m.somaprodutos());
        System.out.println(m.maisantigo());
        
    }
    
    
}