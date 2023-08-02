package aop07;



public interface ReadArticleService {
	Article getArticleAndReadCnt(int id) throws ArticleNotFoundException;
}
