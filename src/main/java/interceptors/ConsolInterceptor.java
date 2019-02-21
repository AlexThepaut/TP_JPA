package main.java.interceptors;

import javax.persistence.PostPersist;

public class ConsolInterceptor {
	@PostPersist private void onPrePersist(Object o){
		System.out.println("Rentré en base");
	}
}
