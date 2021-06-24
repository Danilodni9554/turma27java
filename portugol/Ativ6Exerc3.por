programa
{
	
	funcao inicio()
	{
		inteiro tempoEvento
		inteiro horas, minutos, segundos
		escreva("Digite os segundos do evento:[segundos] ")
		leia(tempoEvento)
		horas = tempoEvento / 3600
		minutos = (tempoEvento % 3600) / 60
		segundos = (tempoEvento % 3600) % 60
		
		escreva("Horas: "+horas+"\n")
		escreva("Minutos: "+minutos+"\n")
		escreva("Segundos: "+segundos+"\n")
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 246; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */