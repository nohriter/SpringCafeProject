package nori.selfreflection.domain;

import static lombok.AccessLevel.*;

import java.time.LocalDateTime;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;


@Entity
@Getter
@NoArgsConstructor(access = PROTECTED)
public class Post {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String title;
	private String content;
	private String writer;
	private int viewCount;
	private LocalDateTime createdAt;
	private LocalDateTime lastModifiedAt;
	private int commentCount;

	@Enumerated(EnumType.STRING)
	private Category category;

	@Enumerated(EnumType.STRING)
	private Deleted deleted;

	public Post(String title,
		String content,
		String writer,
		String category) {

		this.title = title;
		this.content = content;
		this.writer = writer;
		this.category = Category.findCategoryByType(category);
		this.viewCount = 0;
		this.createdAt = LocalDateTime.now();
		this.lastModifiedAt = LocalDateTime.now();
		this.deleted = Deleted.FALSE;
	}
}
