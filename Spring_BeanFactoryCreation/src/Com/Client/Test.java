package Com.Client;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import Com.Model.Student;

public class Test {
	public static void main(String[] args) {
		Resource r=new ClassPathResource("beans.xml");
		
		BeanFactory bf=new XmlBeanFactory(r);
		
		Student s=(Student) bf.getBean("s");  //here taking typecasting bf.getBean("s")
		s.display();
	}
}
