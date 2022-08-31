package nori.selfreflection.domain;

import java.util.Arrays;

public enum Category {

	FREE("FREE"),
	NOTICE("NOTICE");

	private final String type;

	Category(String type) {
		this.type = type;
	}

	public String getType() {
		return type;
	}

	public static Category findCategoryByType(String type) {
		return Arrays.stream(values())
			.filter(postType -> isEquals(type, postType))
			.findFirst()
			.orElseThrow(IllegalArgumentException::new);
	}

	private static boolean isEquals(String type, Category postType) {
		return postType.getType().equals(type);
	}
}
