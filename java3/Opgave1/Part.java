public abstract class Part(){
	
	
	/**
	*	hier moet ik de kans dat een onderdeel uitvalt berekenen
	*	dit moet ik doen door een rng nummer te trekken uit een hogehod 
	*	gebruik makend van de failure kans 
	*/	
	protected int Calculate(){
		return Math.floor(Math.random() * (1/failure));
	}
	
	protected float failure;
	
}
