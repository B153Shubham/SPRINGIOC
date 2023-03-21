package Com.Client;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import Com.Model.Student;

public class Test {
	public static void main(String[] args) {
		Resource r=new ClassPathResource("beans.xml");
		
		ApplicationContext ac=new ClassPathXmlApplicationContext("beans.xml");
		
		Student s=(Student) ac.getBean("s");  //here taking typecasting bf.getBean("s")
		s.display();
	}
}
