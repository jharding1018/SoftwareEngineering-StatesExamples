public class SearchState implements EnemyState {
	private Enemy owner;

	@Override
	public void update() {
		// Patrol
		if (true /* Player is in range */) {
			owner.changeState(new ChaseState(owner));
		}
	}

	public SearchState(Enemy owner) {
		this.owner = owner;
	}
}
