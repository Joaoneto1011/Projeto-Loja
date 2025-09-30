package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Produto;
import entities.ProdutoImportado;
import entities.ProdutoUsado;

public class ProgramaPrincipal {
	
	public static void main (String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Produto> list = new ArrayList<>();
		
		System.out.print("Insira o número de produtos: ");
		
		int n = sc.nextInt();
		
		for (int i=1; i<=n; i++) {
			
			System.out.println();
			System.out.println("Dados do " + i + " produto: ");
			System.out.print("Produto comum, usado ou importado (C/U/I)? ");
			char ch = sc.next().charAt(0);
			
			System.out.println();
			System.out.print("Nome: ");
			String nome = sc.next();
			
			System.out.print("Preco: ");
			double preco = sc.nextDouble();
			
			
			if (ch == 'i') {
				
				System.out.print("Taxa alfandega: ");
				
				double taxaAlfandega = sc.nextDouble();
				
				Produto produto = new ProdutoImportado(nome, preco, taxaAlfandega);
				
				list.add(produto);
				
			}
			
			else if (ch == 'u') {
				
				System.out.print("Data fabricacao (DD/MM/YYYY): ");
				
				Date dataFabricacao = sdf.parse(sc.next());
				
				Produto produto =  new ProdutoUsado(nome, preco, dataFabricacao);
				
				list.add(produto);
			}
			
			else {
				
				Produto produto = new Produto(nome, preco);
				
				list.add(produto);
			}
			
		}
		
		System.out.println();
		
		System.out.println("ETIQUETA PRECOS: ");
		
		for(Produto produto : list) {
			
			System.out.println(produto.etiquetaPreco());
		}
		
		
		sc.close();
		
	}
	
	

}
