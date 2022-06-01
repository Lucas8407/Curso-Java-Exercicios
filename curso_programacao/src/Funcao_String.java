
public class Funcao_String {

	public static void main(String[] args) 
	{
		
		//Formatar: toLowerCase() - transforma em minuscula; toUpperCase(); trim() -- elimina os espaços em brancos nos cantos da string;
		//Recortar: substring(inicio); -- gera uma nova string a partir do numero do caractere declarado -- substring(inicio, fim);
		//Substituir: Replace(char, char) -- troca os caracteres, Replace(string, string);
		//Buscar: IndexOf -- mostra a posição em que se encontra o primeiro valor digitado, LastIndexOf
		//str.Split(""); - dividi a string de acordo com  o caractere para ser dividido;
		//lenght(); - calcular o total de digitos de uma string java;
		//concatenar string podemos usar o operador +;
		
		
		String original = "   asasfb AHsuhaASIJAHSI ASJOASJJOA aaa        ";
		String teste = "potato apple queijo";
		
		String[] vetor = teste.split(" ");
		System.out.println(vetor[0]);
		System.out.println(vetor[1]);
		System.out.println(vetor[2]);
		System.out.println();
		
		String s01 = original.toLowerCase();
		String s02 =original.toUpperCase();
		String s03 = original.trim();
		String s04 = original.substring(6);
		String s05 = original.substring(6,9);
		String s06 = original.replace('a', 'x');
		String s07 = original.replace("ASJOASJJ", "oi");
		int s08 = original.indexOf("AS");
		int s09 = original.lastIndexOf("AS");
		int s10 = original.length();
		
		System.out.println("Original: " + original);
		System.out.println("Alterada: " + s01);
		System.out.println();
		System.out.println("Original: " + original);
		System.out.println("Alterada: " + s02);
		System.out.println();
		System.out.println("Original: " + original);
		System.out.println("Alterada: " + s03);
		System.out.println();
		System.out.println("Original: " + original);
		System.out.println("Alterada: " + s04);
		System.out.println();
		System.out.println("Original: " + original);
		System.out.println("Alterada: " + s05);
		System.out.println();
		System.out.println("Original: " + original);
		System.out.println("Alterada: " + s06);
		System.out.println();
		System.out.println("Original: " + original);
		System.out.println("Alterada: " + s07);
		System.out.println();
		System.out.println("Original: " + original);
		System.out.println("Alterada: " + s08);
		System.out.println("Alterada: " + s09);
		
		System.out.println();
		System.out.println("Original: " + original);
		System.out.println("Quantidade total de digitos da string é: " + s10);
	}

}
