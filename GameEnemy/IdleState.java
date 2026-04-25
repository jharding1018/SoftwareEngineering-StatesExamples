public class IdleState extends EnemyState {

	public IdleState(Enemy owner) {
		super(owner);
	}

	@Override
	public void update() {
		owner.changeState(new SearchState(owner));
	}

}
