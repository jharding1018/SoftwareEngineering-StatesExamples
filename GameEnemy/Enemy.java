public class Enemy {
	private EnemyState state;

	public void changeState(EnemyState newState) {

		state = newState;
	}

	public void update() { // Runs every game tick
		state.update();
	}

	public Enemy() {
		state = new IdleState(this);
	}
}
