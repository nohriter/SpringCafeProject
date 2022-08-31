package nori.selfreflection.controller;

import lombok.RequiredArgsConstructor;
import nori.selfreflection.controller.dto.request.PostWriteRequest;
import nori.selfreflection.controller.dto.response.PostWriteResponse;
import nori.selfreflection.domain.Post;
import nori.selfreflection.service.PostService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/posts")
public class PostController {

	private final PostService postService;

	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public PostWriteResponse writePost(@RequestBody PostWriteRequest request) {
		Post post = postService.writePost(request.toEntity());
		return new PostWriteResponse(post.getId());
	}

}
