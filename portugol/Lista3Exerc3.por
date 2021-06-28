//Elaborar um programa que efetue a leitura sucessiva de valores numéricos e 
//apresente no final o total do somatório, a média e o total de valores lidos. 
//O programa deve fazer as leituras dos valores enquanto o usuário estiver 
//fornecendo valores positivos. Ou seja, o programa deve parar quando o 
//usuário fornecer um valor negativo. 


programa
{
	inclua biblioteca Matematica-->mat
	
	funcao inicio()
	{
		real num=0.0, somaNum=0.0, media=0.0
		inteiro total, contadorNum=0

		enquanto(num>=0){
			
			somaNum += num
			media = somaNum / contadorNum
			escreva("Insira um número: ")
			leia(num)
			contadorNum++		
		}
			
		escreva("O total de valores lidos é: ", contadorNum, "\n")
		escreva("A média da soma dos valores é: " +mat.arredondar(media,1), "\n")
		escreva("O valor total de números é: ", somaNum)


		
	}
}


/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 625; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */