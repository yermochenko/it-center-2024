public class Tamagotchi {
	String name;
	int age = 1;
	int energy = 100;
	int happiness = 10;
	boolean alive = true;
	int strokingAmount;

	/** покормить */
	void feed() {
		if(alive) {
			if(happiness > 0) {
				boolean ate = false;
				if(energy < 100) {
					if(age <= 10) {
						// детство
						energy += 13;
					} else if(age <= 20) {
						// юность
						energy += 10;
					} else if(age <= 30) {
						// взрослая жизнь
						energy += 7;
					} else {
						// старение
						energy += 5;
					}
					ate = true;
				} else if(energy < 200) {
					if(age <= 10) {
						// детство
						energy += 6;
					} else if(age <= 20) {
						// юность
						energy += 5;
					} else if(age <= 30) {
						// взрослая жизнь
						energy += 3;
					} else {
						// старение
						energy += 2;
					}
					ate = true;
				} else {
					System.out.printf("%s сыт и больше пока не может есть\n", name);
				}
				if(ate) {
					if(happiness < 20) {
						happiness++;
					}
				}
			} else {
				System.out.printf("%s в депрессии и отказывается от еды\n", name);
			}
		} else {
			System.out.printf("%s умер\n", name);
		}
	}

	/** поиграть */
	void play() {
		int needEnergy;
		int receivedHappiness;
		if(age <= 10) {
			// детство
			needEnergy = 5;
			receivedHappiness = 5;
		} else if(age <= 20) {
			// юность
			needEnergy = 4;
			receivedHappiness = 5;
		} else if(age <= 30) {
			// взрослая жизнь
			needEnergy = 3;
			receivedHappiness = 4;
		} else {
			// старение
			needEnergy = 2;
			receivedHappiness = 4;
		}
		if(energy - needEnergy > 50) {
			energy -= needEnergy;
			if(happiness + receivedHappiness <= 20) {
				happiness += receivedHappiness;
			} else {
				happiness = 20;
			}
		} else {
			System.out.printf("%s слишком устал и не хочет играть\n", name);
		}
	}

	/** погладить */
	void stroke() {
		if(alive) {
			if(strokingAmount < 5) {
				if(happiness - 3 <= 20) {
					happiness += 3;
				}
				strokingAmount++;
			} else {
				System.out.printf("%s устал от поглаживаний\n", name);
			}
		} else {
			System.out.printf("%s умер\n", name);
		}
	}

	/** провести день */
	void spendDay() {
		if(alive) {
			age++;
			happiness -= 3;
			if(happiness < 0) {
				happiness = 0;
			}
			if(age <= 10) {
				// детство
				energy -= 25;
			} else if(age <= 20) {
				// юность
				energy -= 20;
			} else if(age <= 30) {
				// взрослая жизнь
				energy -= 15;
			} else {
				// старение
				energy -= 10;
				double deathProbability = (age - 31) / 20.0;
				if(Math.random() < deathProbability) {
					alive = false;
				}
			}
			if(energy <= 0) {
				energy = 0;
				alive = false;
			}
			strokingAmount = 0;
		} else {
			System.out.printf("%s умер\n", name);
		}
	}
}
