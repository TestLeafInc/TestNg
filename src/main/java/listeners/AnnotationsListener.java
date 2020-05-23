package listeners;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.IRetryAnalyzer;
import org.testng.annotations.ITestAnnotation;

public class AnnotationsListener implements IAnnotationTransformer{

	public void transform(
		      ITestAnnotation annotation, Class testClass, 
		      Constructor testConstructor, Method testMethod) {
	   
		System.out.println(testMethod.getName());
		if(!testMethod.getName().contains("login")){
			annotation.setEnabled(false);
		}
		
	  }
	
}
