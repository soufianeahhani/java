package serveur; 

 
 
public class Credit {
     
	double capital;
	double taux;
	double annuite;
	long duree;
 
  

	public double annuite( double capital,  double taux,  long duree) {
	double rate = annuite2(taux); 
	return (Math.pow(1+rate, duree)* rate * capital)/(Math.pow(1+rate, duree) - 1);
	}
 
 
  
	public double capital (double annuite, double taux, long duree) {
	double rate = annuite2(taux);
	return (Math.pow(1+rate, duree)*annuite - annuite)/(Math.pow(1+rate, duree)*rate);
	}
   

	public long duree(double capital, double annuite, double taux) {
	double rate = annuite2(taux);
	return (long) (((Math.log(annuite/(annuite - rate*capital) ) ) / (Math.log(1 + rate) )) + 0.5);
	}


	public double annuite2 (Double taux){
	 return Math.pow(1 + taux,(double)1/12) - 1;
	}}
