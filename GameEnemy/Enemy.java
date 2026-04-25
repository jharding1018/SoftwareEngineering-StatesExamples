public class Enemy {
	private EnemyState state;

	public void changeState(EnemyState newState) {
		state.exit();
		state = newState;
		state.enter();
	}

	public void update() { // (Theoretically) Runs every game tick
		state.update();
	}

	public Enemy() {
		state = new IdleState(this);
	}
}
