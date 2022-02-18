package Ch18;

public class Barracks implements Building {
	
	
	public Marine makeMarine() {
		return new Marine();
	}
	
	public Medic makeMedic() {
		return new Medic();
	}

	@Override
	public void Construct() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void UnderAttack(Unit unit) {
		// TODO Auto-generated method stub
		
	}

	

}
