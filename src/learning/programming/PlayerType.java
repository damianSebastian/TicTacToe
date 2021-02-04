package learning.programming;

public enum PlayerType {
	HUMAN_PLAYER {
		@Override
		public String toString() {
			return "user";
		}

	},
	BOT {

		@Override
		public String toString() {
			return "bot";
		}
	};

}
