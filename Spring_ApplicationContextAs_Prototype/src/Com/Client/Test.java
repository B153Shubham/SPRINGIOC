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
		
		
		ApplicationContext ac=new ClassPathXmlApplicationContext("beans.xml","beans2.xml");
		
		Student s=(Student) ac.getBean("s");  //here taking typecasting bf.getBean("s")
		s.display();
		System.out.println(s);
		Student s1=(Student) ac.getBean("s"); 
		s.display();
		Student stu= ac.getBean("s1",Student.class); 
		stu.display();
		
		System.out.println(s1);
	}
}
