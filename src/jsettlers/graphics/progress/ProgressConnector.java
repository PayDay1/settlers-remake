package jsettlers.graphics.progress;

/**
 * The progress connector to communicate with the progress screen
 * 
 * @author michael
 */
public class ProgressConnector {
	private final ProgressContent content;

	public ProgressConnector(ProgressContent content) {
		this.content = content;
	}

	/**
	 * Sets the progress state to display
	 * 
	 * @param state
	 *            The state.
	 * @param progress 
	 */
	public void setProgressState(EProgressState state, float progress) {
		content.setProgressState(state, progress);
	}
}
