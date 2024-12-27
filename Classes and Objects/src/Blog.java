import java.util.ArrayList;
import java.util.List;

public class Blog {
    List<BlogPost> listOfBlogPosts = new ArrayList<>();

    public void add(BlogPost blogPost) {
        this.listOfBlogPosts.add(blogPost);
    }
    public void delete(int toDelete) {
        for (BlogPost blogPost : this.listOfBlogPosts) {
            if (this.listOfBlogPosts.get(toDelete) == blogPost) {
                this.listOfBlogPosts.remove(blogPost);
            }
        }
    }
    public void update(int toUpdate, BlogPost blogPost) {
        for (BlogPost blogPostto : this.listOfBlogPosts) {
            if (this.listOfBlogPosts.get(toUpdate) == blogPostto) {
                this.listOfBlogPosts.set(toUpdate, blogPost);
            }
        }
    }
}
