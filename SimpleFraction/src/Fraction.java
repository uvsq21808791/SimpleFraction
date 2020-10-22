
public class Fraction {
	
	 	int numerateur;
		int denominateur;
		
		public Fraction(int n,int d) 
		{
			this.denominateur=d;
			this.numerateur=n;
		}
		
		public String toString() 
		{
			return this.numerateur+"/"+this.denominateur;
		}
}
