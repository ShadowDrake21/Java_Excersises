package clothes;

public enum Size {
	XXS(32) {
		@Override
		public String getDiscription() {
			return "Детский размер";
		}
	},
	XS(34),
	S(36),
	M(38),
	L(40);
	
	private int euroSize;
	
	public int getEuroSize() {
		return euroSize;
	}

	private Size(int euroSize) {
		this.euroSize = euroSize;
	}

	public String getDiscription() {
		return "Взрослый размер";
	}
}
