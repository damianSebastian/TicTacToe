package learning.programming;

public enum ErrorType {
	INPUT_TYPE_ERROR {
		@Override
		public String toString() {
			return EnglishConstants.INPUT_TYPE_ERROR;
		}
	},
	COORDINATES_ERROR {
		@Override
		public String toString() {
			return EnglishConstants.COORDINATES_ERROR;
		}
	},
	CHOICE_ERROR {
		@Override
		public String toString() {
			return EnglishConstants.CHOICE_ERROR;
		}
	},
	NONE,
	MENU_ERROR {
		@Override
		public String toString() {
			return EnglishConstants.MENU_ERROR;
		}
	}


}
