package Curso;

public class TernarioComRamon {
	
	public static void main(String[] args) {
		
		int iNotaMatheus, iNotaSuelen, iMinimoNota;
		String sSituacaoMatheus, sSituacaoSuelen;
		
		iMinimoNota = 5;
		
		iNotaMatheus = 4;
		iNotaSuelen = 5;
		
		sSituacaoMatheus = iNotaMatheus >= iMinimoNota ? "Matheus Passou!" : "Matheus Não Passou!";
		sSituacaoSuelen = iNotaSuelen >= iMinimoNota ? "Suelen Passou!" : "Suelen Não Passou!";
		
		System.out.println(sSituacaoMatheus);
		System.out.println(sSituacaoSuelen);
		
	}
}
