programa
{
	
	funcao inicio()
	{

	   //cadeia menu [] = {"CONTA POUPANÇA", "CONTA CORRENTE", "CONTA ESPECIAL", "CONTA EMPRESA", "CONTA ESTUDANTIL","SAIR"}
	  //inteiro numSelecionado
       

    //escreva (" BANCO Ai-taú G7\n")
     //escreva ("\n Dinheiro na mão é vendaval \n\n\n")

	//para (inteiro x=0; x<6; x++){
      	//escreva (x+1," - "+menu[x]+ "\n")
      	//escreva ("\n")
      	//}

       //escreva ("DIGITE O CODIGO DA OPÇÃO SELECIONADA: ")
       //leia (numSelecionado)

		//se(numSelecionado==3){
			//limpa()

				
				real saldo=30.00, saldo1=0.0, valorD=0.00, valorC=0.00, limite=100.00
				cadeia sair, movimento
				inteiro contador=0
				faca{
					contador++
					
					escreva (" BANCO Ai-taú G7\n")
					escreva ("\n Dinheiro na mão é vendaval \n\n\n")
					escreva("CONTA ESPECIAL \n\n")
					escreva("Saldo Atual: R$", saldo,"\n\n")
					escreva("\nMOVIMENTO - D-débito ou C-crédito : ")
					leia(movimento)

				
			
					se(movimento == "C" ou movimento == "c"){
					escreva("Valor : ")
					leia(valorD)
					saldo = saldo - valorD
					escreva(saldo)
					}

					se(saldo<0){
					limite = limite - saldo
					escreva(limite)
					}
					
					senao{
					escreva("Valor : ")
					leia(valorC)
					saldo1 = saldo + valorC
					saldo = saldo1
					}					
												
					escreva("\nDeseja continuar ?")
					leia(sair)
							
			
				}	
				enquanto(contador <10 ou sair == "s" ou sair == "S")
		
	}	
}		
			
	
			
      
       
   
			
		
	

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1312; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */