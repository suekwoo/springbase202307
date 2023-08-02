package aop07;



public interface ArticleDao {
	void insert(Article article);
	void updateReadCount(int id, int i);
}
