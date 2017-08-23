package com.drools;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

import com.drools.model.Employee;


public class App 
{
	public static void main( String[] args )
	{
		try
		{
			KieServices ks = KieServices.Factory.get();

			KieContainer kc = ks.getKieClasspathContainer();
			KieSession kss = kc.newKieSession("ksession-rules");


			List<Employee> list = Arrays.asList(
					new Employee("hadoop","UK", true, "developer"),
					new Employee("java", "UK",true ,"developer"),
					new Employee(".net","US",true,"SE"),
					new Employee("spring","Finland",true, "developer"));
			
			for(Employee e: list) {
				kss.insert(e);
				kss.fireAllRules();
				System.out.println("Rules fired");
				System.out.println("=========================");
			}
			
		
		}
		catch(Throwable t) {
			t.printStackTrace();
		}

	}


}
