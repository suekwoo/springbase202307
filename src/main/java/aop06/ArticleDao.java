package aop06;

public interface ArticleDao {
	void insert(Article article);
	void updateReadCount(int id, int i);
}
