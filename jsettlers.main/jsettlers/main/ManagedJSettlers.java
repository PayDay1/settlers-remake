package jsettlers.main;

import jsettlers.graphics.JOGLPanel;
import jsettlers.graphics.startscreen.IStartScreenConnector;
import jsettlers.graphics.startscreen.IStartScreenConnector.IGameSettings;
import jsettlers.main.JSettlersGame.Listener;

/**
 * This is the new main game class
 * 
 * @author michael
 */
public class ManagedJSettlers implements Listener {

	private JOGLPanel content;
	private JSettlersGame ongoingGame;

	public synchronized void start(IGuiStarter starter) {
		content = new JOGLPanel();
		starter.startGui(content);

		showMainScreen();
	}

	private void showMainScreen() {
		content.showStartScreen(new StartConnector());
	}

	private class StartConnector implements IStartScreenConnector {

		private final IMapItem[] MAPS = new IMapItem[] { new MapItem() };

		@Override
		public IMapItem[] getMaps() {
			return MAPS;
		}

		private class MapItem implements IMapItem {
			@Override
			public String getName() {
				return "test";
			}

			@Override
			public int getMinPlayers() {
				return 1;
			}

			@Override
			public int getMaxPlayers() {
				return 5;
			}
		}

		@Override
		public ILoadableGame[] getLoadableGames() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public IRecoverableGame[] getRecoverableGames() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public INetworkGame[] getNetworkGames() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public void setNetworkServer(String host) {
			// TODO Auto-generated method stub

		}

		@Override
		public void startNewGame(IGameSettings game) {
			startGame(game);
		}

		@Override
		public void loadGame(ILoadableGame load) {
			// TODO Auto-generated method stub

		}

		@Override
		public void recoverNetworkGame(IRecoverableGame game) {
			// TODO Auto-generated method stub

		}

		@Override
		public void joinNetworkGame(INetworkGame game) {
			// TODO Auto-generated method stub

		}

		@Override
		public void addNetworkGameListener(INetworkGameListener gameListener) {
			// TODO Auto-generated method stub

		}

		@Override
		public void removeNetworkGameListener(INetworkGameListener gameListener) {
			// TODO Auto-generated method stub

		}

		@Override
		public void startGameServer(IGameSettings game, String name) {
			// TODO Auto-generated method stub

		}

		@Override
		public void exitGame() {
			System.exit(0);
		}

	}

	synchronized void startGame(IGameSettings game) {
		if (ongoingGame != null) {
			ongoingGame.setListener(null);
			ongoingGame.stop();
		}
		ongoingGame = new JSettlersGame(content, game, 123456L);
		ongoingGame.setListener(this);
		ongoingGame.start();
	}

	/**
	 * Allows the ui to be started.
	 * 
	 * @author michael
	 */
	public interface IGuiStarter {
		void startGui(JOGLPanel content);
	}

	/**
	 * Game ended from inside the game.
	 */
	@Override
	public void gameEnded() {
		ongoingGame.setListener(null);
		ongoingGame = null;
		showMainScreen();
	}

}
