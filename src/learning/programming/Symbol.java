package learning.programming;

public enum Symbol {
	X{
		@Override
		public String toString() {
			return "X";
		}


	},
	O{
		@Override
		public String toString() {
			return "O";
		}
	},
	SPACE{
		@Override
		public String toString() {
			return "_";
		}
	}

}
