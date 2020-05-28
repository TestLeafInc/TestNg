package listeners;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.IAnnotationTransformer2;
import org.testng.IAnnotationTransformer3;
import org.testng.annotations.ITestAnnotation;

public class ChangeBehaviour implements IAnnotationTransformer {

	public void transform(
		      ITestAnnotation annotation, Class testClass, 
		      Constructor testConstructor, Method testMethod) {

		if(testMethod.getName().contains("createLead")) {
			annotation.setInvocationCount(3);
		}
		
		if(testMethod.getName().contains("merge")) {
			//annotation.setEnabled(false);
			annotation.setDataProvider("dataOnFailure");
		}
		
	
	}
}
