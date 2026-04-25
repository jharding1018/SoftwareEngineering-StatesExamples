public class ChaseState implements EnemyState {
	private Enemy owner;

	@Override
	public void update() {
		// Move towards player
		if (true /* Player is out of range */) {
			owner.changeState(new SearchState(owner));
		}
	}

	public ChaseState(Enemy owner) {
		this.owner = owner;
	}
}
