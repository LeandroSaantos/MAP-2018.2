package exercicioStrategy;

public enum Character implements WeaponBehavior{
	
	QUEEN{
		@Override
		public String useWeapon1(Weapon oneWeapon) {
			if (oneWeapon == KnifeBehavior) {
				return QUEEN;
			}
		}
	}
	
	KING{
		@Override
		public String useWeapon2(Weapon oneWeapon) {
			if (oneWeapon == SwordBehavior) {
				return KING;
			}
		}
	}
	
	KNIGHT{
		@Override
		public String useWeapon3(Weapon oneWeapon) {
			if (oneWeapon == SwordBehavior) {
				return KNIGHT;
			}
		}
	}
	
	TROLL{
		@Override
		public String useWeapon4(Weapon oneWeapon) {
			if (oneWeapon == SwordBehavior) {
				return TROLL;
			}
		}
	}
}