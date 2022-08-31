package nori.selfreflection.controller.dto.request;


import nori.selfreflection.domain.Post;

public class PostWriteRequest {

	private String title;
	private String content;
	private String writer;
	private String category;

	public PostWriteRequest() {
	}

	public PostWriteRequest(String title, String content, String writer, String category) {
		this.title = title;
		this.content = content;
		this.writer = writer;
		this.category = category;
	}

	public Post toEntity() {
		return new Post(title, content, writer, category);
	}

	public String getTitle() {
		return title;
	}

	public String getContent() {
		return content;
	}

	public String getWriter() {
		return writer;
	}

	public String getCategory() {
		return category;
	}
}
