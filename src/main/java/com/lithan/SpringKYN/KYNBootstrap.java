package com.lithan.SpringKYN;

import com.lithan.SpringKYN.config.JPAConfig;
import com.lithan.SpringKYN.config.SecurityConfig;
import com.lithan.SpringKYN.config.WebMvcConfig;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

//web.xml
public class KYNBootstrap extends AbstractAnnotationConfigDispatcherServletInitializer {
	
    protected Class<?>[] getRootConfigClasses() {
        return new Class[]{JPAConfig.class, SecurityConfig.class};
    }

    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{WebMvcConfig.class};
    }

    protected String[] getServletMappings() {
        return new String[]{"/"};
    }
}
