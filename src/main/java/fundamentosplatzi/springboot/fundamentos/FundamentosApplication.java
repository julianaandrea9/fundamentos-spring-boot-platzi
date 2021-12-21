package fundamentosplatzi.springboot.fundamentos;

import fundamentosplatzi.springboot.fundamentos.bean.MyBean;
import fundamentosplatzi.springboot.fundamentos.bean.MyBeanExercise;
import fundamentosplatzi.springboot.fundamentos.bean.MyBeanProperties;
import fundamentosplatzi.springboot.fundamentos.bean.MyBeanWithDependency;
import fundamentosplatzi.springboot.fundamentos.component.ComponentDependency;
import fundamentosplatzi.springboot.fundamentos.pojo.UserPojo;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FundamentosApplication implements CommandLineRunner {

	private ComponentDependency componentDependency;
	private MyBean myBean;
	private MyBeanWithDependency myBeanWithDependency;
	private MyBeanExercise beanExercise;
	private MyBeanProperties beanProperties;
	private UserPojo userPojo;

	public FundamentosApplication(@Qualifier("componentTwoImplement") ComponentDependency componentDependency, MyBean myBean,
								  MyBeanWithDependency myBeanWithDependency, MyBeanExercise beanExercise, MyBeanProperties beanProperties,
								  UserPojo userPojo){
		this.componentDependency = componentDependency;
		this.myBean = myBean;
		this.myBeanWithDependency = myBeanWithDependency;
		this.beanExercise = beanExercise;
		this.beanProperties = beanProperties;
		this.userPojo = userPojo;
	}

	public static void main(String[] args) {
		SpringApplication.run(FundamentosApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		componentDependency.saludar();
		myBean.print();
		myBeanWithDependency.printWithDependency();
		beanExercise.imprimir();
		System.out.println(beanProperties.function());
		System.out.println(userPojo.getEmail() + ' ' + userPojo.getPassword() + ' ' + userPojo.getYear());
	}
}
