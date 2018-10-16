package exercicioStrategy;

public enum Weapon implements WeaponBehavior{
	
	QUEEN{
		@Override
		public String useWeapon(Weapon oneWeapon) {
			return KinfeBehavior;
		}
	}
	
	KING{
		@Override
		public String useWeapon(Weapon oneWeapon) {
			return SwordBehavior;
		}
	}
	
	KNIGHT{
		@Override
		public String useWeapon(Weapon oneWeapon) {
			return BowAndArrowBehavior;
		}
	}
	
	TROLL{
		@Override
		public String useWeapon(Weapon oneWeapon) {
			return AxeBehavior;
		}
	}

}