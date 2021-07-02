programa
{

	funcao inicio()
	{

	   cadeia menu [] = {"CONTA POUPANÇA", "CONTA CORRENTE", "CONTA ESPECIAL", "CONTA EMPRESA", "CONTA ESTUDANTIL","SAIR"}
        inteiro numSelecionado

     escreva (" Ai-taú \n")
     escreva ("\n Dinheiro na mão é vendaval \n\n\n")


      para (inteiro x=0; x<6; x++){
      	escreva (x+1," - "+menu[x]+ "\n")
      	escreva ("\n")
      	}

       escreva ("DIGITE O CODIGO DA OPÇÃO SELECIONADA: ")
       leia (numSelecionado)




}

}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 473; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */