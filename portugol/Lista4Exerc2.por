//Um dado é lançado 10 vezes e o valor correspondente é anotado. 
//Faça um programa que gere um vetor com os lançamentos, 
//escreva esse vetor. A seguir determine e imprima a 
//média aritmética dos lançamentos, contabilize 
//e apresente também quantas foram as 
//ocorrências da maior pontuação.

programa
{
	
	funcao inicio()
	{

		inteiro lancamentoV[10]
		inteiro numV[10]
		inteiro lancamento=0
		inteiro num=0
		inteiro maiorNum

          para( inteiro i=0;i <=10; i++)
          {
      	
            escreva("Lançamento  : ")
		  leia(lancamentoV[i])
            escreva("O número : ")
            leia(numV[i])
            totalLancamento

		se (numV[i] > maiorNum){
				maiorNum = numV[i]
            
	   	 }
		limpa()
      	para( inteiro i=0;i <=3; i++){

        	
          escreva("No lançamento ",lancamentoV[i]," o número foi:",numV[i],"\n")
          
      	}
      	
      }
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 651; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */