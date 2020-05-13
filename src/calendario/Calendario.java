package calendario;

public class Calendario {

	static int m;
	
	public static String main(String[] args) {
		if (args.length==3){
			int giorno=Integer.parseInt(args[0]);
			String mese=args[1];
			int anno=Integer.parseInt(args[2]);
			String giornoDS=new String(giornoDellaSettimana(giorno,mese,anno));
			System.out.println(giornoDS); 
			return giornoDS;
		} else {
			return "";
		}
	}

	
	public static String giornoDellaSettimana(int d, String ms, int a)
	{
		m = 0;
		if (ms.equals("gennaio")) 
			m=1;
		else if (ms.equals("febbraio")) {
			m=2;
		} else if (ms.equals("marzo")) {
			m=3;
		} else if (ms.equals("aprile")) {
			m=4;
		} else if (ms.equals("maggio")) {
			m=5;
		} else if (ms.equals("giugno")) {
			m=6;
		} else if (ms.equals("luglio")) {
			m=7;
		} else if (ms.equals("agosto")) {
			m=8;
		} else if (ms.equals("settembre")) {
			m=9;
		} else if (ms.equals("ottobre")) {
			m=10;
		} else if (ms.equals("novembre")) {
			m=11;
		} else if (ms.equals("dicembre")) {
			m=12;
		} 	
		if ((m>0) && valida(d,m,a)) {
			return calend(d,m,a);
		} else {
			return "Errore";
		}
	}
/*	
private static String calend(int d, int m, int a) {
		if (d==11 && m==5 && a==2020) return "Lunedi";
		if (d==12 && m==5 && a==2020) return "Martedi";
		if (d==13 && m==5 && a==2020) return "Mercoledi";
		if (d==14 && m==5 && a==2020) return "Giovedi";
		if (d==15 && m==5 && a==2020) return "Venerdi";
		if (d==16 && m==5 && a==2020) return "Sabato";
		if (d==17 && m==5 && a==2020) return "Domenica";
		if (d==32 && m==5 && a==2020) return "Errore";
		if (d==11 && m==1 && a==2020) return "Sabato";
		if (d==11 && m==2 && a==2020) return "Martedi";
		if (d==11 && m==3 && a==2020) return "Mercoledi";
		if (d==11 && m==4 && a==2020) return "Sabato";
		if (d==11 && m==6 && a==2020) return "Giovedi";
		if (d==11 && m==7 && a==2020) return "Sabato";
		if (d==11 && m==8 && a==2020) return "Martedi";
		if (d==11 && m==9 && a==2020) return "Venerdi";
		if (d==11 && m==10 && a==2020) return "Domenica";
		if (d==11 && m==11 && a==2020) return "Mercoledi";
		if (d==11 && m==12 && a==2020) return "Venerdi";
		if (d==11 && m==0 && a==2020) return "Errore";
		return null;
	}
*/
/*
private static boolean valida(int d, int m, int a) {
		if (d==11 && m==5 && a==2020) return true;
		if (d==12 && m==5 && a==2020) return true;
		if (d==13 && m==5 && a==2020) return true;
		if (d==14 && m==5 && a==2020) return true;
		if (d==15 && m==5 && a==2020) return true;
		if (d==16 && m==5 && a==2020) return true;
		if (d==17 && m==5 && a==2020) return true;
		if (d==32 && m==5 && a==2020) return false;
		if (d==11 && m==1 && a==2020) return true;
		if (d==11 && m==2 && a==2020) return true;
		if (d==11 && m==3 && a==2020) return true;
		if (d==11 && m==4 && a==2020) return true;
		if (d==11 && m==6 && a==2020) return true;
		if (d==11 && m==7 && a==2020) return true;
		if (d==11 && m==8 && a==2020) return true;
		if (d==11 && m==9 && a==2020) return true;
		if (d==11 && m==10 && a==2020) return true;
		if (d==11 && m==11 && a==2020) return true;
		if (d==11 && m==12 && a==2020) return true;
		if (d==11 && m==0 && a==2020) return false;
		return false;
	}
*/


	public static boolean valida(final int d, int m, int a) {
		if (d<1 || d>31 || m==0 || a<=1582) 
			return false;
		Boolean bisestile= (a%4==0);
		if (bisestile && a%100==0 && a%400!=0) {
			bisestile=false;
		}
		if ((m==2 && d>29)||(m==2 && d==29 && !bisestile)) {
			return false;
		}
		if ((m==4 || m==6 || m==9 || m==11) && d>30) {
			return false;
		}
		return true;
		
	}

	public static String calend(int d, int m, int a)
	{		
		if (m<=2)
		 {
		  m = m + 12;
		  a--;
		 };
		 int f1 = a / 4;
		 int f2 = a / 100;
		 int f3 = a / 400;
		 int f4 = (int) (2 * m + (.6 * (m + 1)));
		 int f5 = a + d + 1;
		 int x = f1 - f2 + f3 + f4 + f5;
		 int k = x / 7;
		 int n = x - k * 7;
		 return convert(n);
	}


	public static String convert(int n) {
		 if (n==1) {
			return "Lunedi";
		} else if (n==2) {
			return "Martedi";
		} else if (n==3) {
			return "Mercoledi";
		} else if (n==4) {
			return "Giovedi";
		} else if (n==5) {
			return "Venerdi";
		} else if (n==6) {
			return "Sabato";
		} else if (n==0) {
			return "Domenica";
		} else {
			return "Errore";
		}
	}

	
}
