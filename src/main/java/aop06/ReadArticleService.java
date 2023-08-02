package aop06;

public interface ReadArticleService {
	Article getArticleAndReadCnt(int id) throws ArticleNotFoundException;
}
