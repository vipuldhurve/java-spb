package com.app.basic;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class SpbBasicApplication {
//        1. What are the beans?
//        @Component

//        2. What are the dependencies?
//        @Autowired

//        3. Where to search for beans?
//        @SpringBootApplication scans the package(com.app.spb.basic) and its sub-packages
//        i.e. where @ComponentScan annotation is present

//        Spring ApplicationContext maintains all beans

    public static void main(String[] args) {
//        We don't need to create beans and inject dependencies like this:
//        BinarySearchImpl binarySearch = new BinarySearchImpl(new MergeSort());

        try (AnnotationConfigApplicationContext applicationContext =
                     new AnnotationConfigApplicationContext(SpbBasicApplication.class)) {
//            Getting 2 beans from applicationContext of BinarySearchImpl
            BinarySearchImpl binarySearchImpl =
                    applicationContext.getBean(BinarySearchImpl.class);
            BinarySearchImpl binarySearchImpl2 =
                    applicationContext.getBean(BinarySearchImpl.class);
//            Will give two different beans if scope is PROTOTYPE for BinarySearchImpl class
            System.out.println(binarySearchImpl);
            System.out.println(binarySearchImpl2);
//            call binary search
            int result =
                    binarySearchImpl.binarySearch(new int[]{3, 4, 6}, 3);
//            print result
            System.out.println(result);
        }
    }

}
