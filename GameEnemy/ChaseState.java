public class ChaseState extends EnemyState {

	@Override
	public void update() {
		// Move towards player
		if (isPlayerOutOfRange()) {
			owner.changeState(new SearchState(owner));
		}
	}

	public ChaseState(Enemy owner) {
		super(owner);
	}

	private boolean isPlayerOutOfRange() {
		return true;
	}
}
