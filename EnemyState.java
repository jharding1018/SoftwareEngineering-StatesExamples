public interface EnemyState {
	public static enum State {
		Idle, // Enemy is standing still
		Search, // Enemy is moving and looking for the player
		Chase // Enemy has found the player and moves towards them
	}

	public class Vec3 { // Only used here, but cannot be made private, bc EnemyState is an interface :(
		int x, y, z;

		public Vec3(int x, int y, int z) {
			this.x = x;
			this.y = y;
			this.z = z;
		}
	}

	default void update() {
	}

	default void enter() {
	}

	default void exit() {
	}
}
