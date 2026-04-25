public abstract class EnemyState {

	/*
	 * public class Vec3 {
	 * int x, y, z;
	 * 
	 * public Vec3(int x, int y, int z) {
	 * this.x = x;
	 * this.y = y;
	 * this.z = z;
	 * }
	 * }
	 */

	protected Enemy owner;

	public EnemyState() {
		this.owner = null;
		System.err.println("Attempting to create EnemyState with no ownder.");
	}

	public EnemyState(Enemy owner) {
		this.owner = owner;
	}

	public void update() {
	}

	public void enter() {
	}

	public void exit() {
	}
}
