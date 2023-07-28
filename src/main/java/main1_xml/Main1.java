package main1_xml;




public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       MessageBeanImpl message = new MessageBeanImpl();
       message.sayHello("smith");
       
      
	}

}

class MessageBeanImpl {
	
	void sayHello(String name) {
		System.out.println(name+"님 안녕하세요");
	}
	
}
