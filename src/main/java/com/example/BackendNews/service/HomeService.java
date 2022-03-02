package com.example.BackendNews.service;

import com.example.BackendNews.model.Post;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class HomeService {

    public List<Post> getPosts() {
        List<Post> posts = new ArrayList();

        Post post1 = new Post("this is the description of the first post", "https://external-content.duckduckgo.com/iu/?u=https%3A%2F%2Fauspost.com.au%2Fcontent%2Fdam%2Fauspost_corp%2Fmedia%2Fimages%2Fparcels-mail%2Fexpress-post-letters.jpg&f=1&nofb=1", "Content of the first post", "title 1");
        Post post2 = new Post("this is the description of the second post", "https://external-content.duckduckgo.com/iu/?u=https%3A%2F%2Fauspost.com.au%2Fcontent%2Fdam%2Fauspost_corp%2Fmedia%2Fimages%2Fparcels-mail%2Fexpress-post-letters.jpg&f=1&nofb=1", "Content of the second post", "title 2");
        Post post3 = new Post("this is the description of the third post", "https://external-content.duckduckgo.com/iu/?u=https%3A%2F%2Fauspost.com.au%2Fcontent%2Fdam%2Fauspost_corp%2Fmedia%2Fimages%2Fparcels-mail%2Fexpress-post-letters.jpg&f=1&nofb=1", "Content of the third post", "title 3");
        Post post4 = new Post("this is a copy of the second post", "https://external-content.duckduckgo.com/iu/?u=https%3A%2F%2Fauspost.com.au%2Fcontent%2Fdam%2Fauspost_corp%2Fmedia%2Fimages%2Fparcels-mail%2Fexpress-post-letters.jpg&f=1&nofb=1", "Content of the fourth post", "title 4");

        posts.add(post1);
        posts.add(post2);
        posts.add(post3);
        posts.add(post4);

        return posts;
    }

    public List<Post> searchPosts(String searchString) {
        List<Post> posts = new ArrayList();

        Post post1 = new Post("this is the first post", "https://external-content.duckduckgo.com/iu/?u=https%3A%2F%2Fauspost.com.au%2Fcontent%2Fdam%2Fauspost_corp%2Fmedia%2Fimages%2Fparcels-mail%2Fexpress-post-letters.jpg&f=1&nofb=1", "Content of the first post", "title 1");
        Post post2 = new Post("this is the second post", "https://external-content.duckduckgo.com/iu/?u=https%3A%2F%2Fauspost.com.au%2Fcontent%2Fdam%2Fauspost_corp%2Fmedia%2Fimages%2Fparcels-mail%2Fexpress-post-letters.jpg&f=1&nofb=1", "Content of the second post", "title 2");
        Post post3 = new Post("this is the third post", "https://external-content.duckduckgo.com/iu/?u=https%3A%2F%2Fauspost.com.au%2Fcontent%2Fdam%2Fauspost_corp%2Fmedia%2Fimages%2Fparcels-mail%2Fexpress-post-letters.jpg&f=1&nofb=1", "Content of the third post", "title 3");
        Post post4 = new Post("this is a copy of the second post", "https://external-content.duckduckgo.com/iu/?u=https%3A%2F%2Fauspost.com.au%2Fcontent%2Fdam%2Fauspost_corp%2Fmedia%2Fimages%2Fparcels-mail%2Fexpress-post-letters.jpg&f=1&nofb=1", "Content of the fourth post", "title 4");

        posts.add(post1);
        posts.add(post2);
        posts.add(post3);
        posts.add(post4);

        List<Post> results = new ArrayList<>();
        for (Post post:posts) {
            System.out.println(post.description);
            if (post.description.contains(searchString)){
                results.add(post);
            }
        }
        System.out.println(results);

        return results;
    }
}
