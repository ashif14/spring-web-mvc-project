package com.mohdasha;

import com.mohdasha.secure.config.SecureConfig;
import com.mohdasha.web.config.WebConfig;
import com.mohdasha.root.config.RootConfig;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class MySecureWeb extends AbstractAnnotationConfigDispatcherServletInitializer {

    protected Class<?>[] getRootConfigClasses() {
        return null;
    }

    protected Class<?>[] getServletConfigClasses() {
        return new Class<?>[] {SecureConfig.class};
    }

    protected String[] getServletMappings() {
        return new String[] { "/s/*"};
    }

    @Override
    protected String getServletName() {
        return "secure-dispatcher";
    }
}
