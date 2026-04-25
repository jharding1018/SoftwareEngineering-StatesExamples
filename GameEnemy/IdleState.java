public class IdleState implements EnemyState {
	private Enemy owner;

	@Override
	public void update() {
		// Patrol
		if (true /* Player is in range */) {
			owner.changeState(new ChaseState(owner));
		}
	}

	public IdleState(Enemy owner) {
		this.owner = owner;
	}
}
