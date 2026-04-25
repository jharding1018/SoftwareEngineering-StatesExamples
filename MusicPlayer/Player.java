import java.util.Queue;;

public class Player {
	public enum UserInputType {
		Pause,
		Play,
		Stop,
		Skip
	}

	private MPState state;

	private Queue<String> songQueue;
	public String currSong;
	public long currTime;

	public void update() {
		state.update();
	}

	public Player() {
		// Initialize owner on all singletons
		PlayState.getInstance().setOwner(this);
		PauseState.getInstance().setOwner(this);
		StopState.getInstance().setOwner(this);

		state = StopState.getInstance();
		// Init songQueue
	}

	public void handleInput(UserInputType input) {
		state.handleInput(input);
	}

	public String pollSong() {
		return songQueue.poll();
	}

	public void changeState(MPState newState) {
		state.exit();
		state = newState;
		state.enter();
	}

}
