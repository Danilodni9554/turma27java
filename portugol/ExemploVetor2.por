programa
{
	
	funcao inicio()
	{

		cadeia nomeAlunos[4]
		inteiro nota[4]

          para( inteiro i=0;i <=3; i++)
          {
      	
            escreva("Nome do aluno  : ")
		  leia(nomeAlunos[i])
            escreva("sua nota : ")
            leia(nota[i])
	   	 }
		limpa()
      	para( inteiro i=0;i <=3; i++){

        	
          escreva("O aluno ",nomeAlunos[i]," nota é:",nota[i],"\n")
          
      	}
      }
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 279; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */