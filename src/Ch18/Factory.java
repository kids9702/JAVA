package Ch18;

public class Factory implements Building {
		//멤버
	public FactoryAddOn addon;
		
		public void AddOn(FactoryAddOn addon) {
			this.addon=addon;
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
