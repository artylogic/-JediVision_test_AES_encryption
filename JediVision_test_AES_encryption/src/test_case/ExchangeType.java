package test_case;

public enum ExchangeType {
	Europe(" Europe "), Asia(" Asia "), NorthAmerica(" North America "), SouthAmerica(" South America ");
	private String value;

	private ExchangeType(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}

}

