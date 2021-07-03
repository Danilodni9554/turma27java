//1- A prefeitura de uma cidade fez uma pesquisa entre 20 de seus 
//habitantes, coletando dados sobre o salário e número de filhos. 
//A prefeitura deseja saber:   
//a) média do salário da população; 
//b) média do número de filhos; 
//c) maior salário; 
//d) percentual de pessoas com salário até R$100,00


programa
{
	
	funcao inicio()
	{
		inteiro habitante=0
		real salario=0.00
		real medSal=0.00
		real somaSalario=0.00
		real contadorSalario=0.00
		inteiro numFilhos
		inteiro medNumFilhos=0
		inteiro somaNumFilhos=0
		inteiro contadorNumFilhos=0
		real maiorSal=0.00
		inteiro porcSalAte100
		inteiro salarioMenor100=0
		inteiro somaSalMenor100=0
		
		
		
		
		
		para(habitante=1;habitante<=2;habitante++){
		escreva("Informe seu salário: ")
		leia(salario)
		escreva("Informe número de filhos: ")
		leia(numFilhos)		
				somaSalario += salario
				contadorSalario++
				somaNumFilhos += numFilhos
				contadorNumFilhos++
				se(salario>maiorSal){
					maiorSal=salario
					
					
					
					
				
				}
				
		}	
			
		medSal = somaSalario / contadorSalario
		medNumFilhos = somaNumFilhos / contadorNumFilhos 
		escreva("\nA média dos salários é: " + medSal)
		escreva("\nA média do número de filhos é: " + medNumFilhos)
		escreva("\nO maior salário é: " + maiorSal + "\n")
		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1291; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */