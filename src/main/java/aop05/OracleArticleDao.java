package aop05;



public class OracleArticleDao implements  ArticleDao{

	@Override
	public void insert() {
		System.out.println("OracleArticleDao.insert() 메서드 호출");	
		
	}

	@Override
	public String select() {
		// TODO Auto-generated method stub
		System.out.println("OracleArticleDao.select() 메서드 호출");
		return "홍길동의 글";
	}

	

}
