package nori.selfreflection.service;

import lombok.RequiredArgsConstructor;
import nori.selfreflection.domain.Post;
import nori.selfreflection.repostiory.PostRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class PostService {

	private final PostRepository postRepository;

	@Transactional
	public Post writePost(Post post) {
		return postRepository.save(post);
	}
}
