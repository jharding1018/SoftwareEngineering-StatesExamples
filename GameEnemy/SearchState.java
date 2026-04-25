public class SearchState extends EnemyState {

	@Override
	public void update() {
		// Patrol
		if (isPlayerInRange()) {
			owner.changeState(new ChaseState(owner));
		}
	}

	public SearchState(Enemy owner) {
		super(owner);
	}

	private boolean isPlayerInRange() {
		return true;
	}
}
