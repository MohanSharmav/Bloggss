package com.main;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class BlogApplication extends AbstractAnnotationConfigDispatcherServletInitializer{
@Override
protected Class<?>[] getRootConfigClasses()
{
	return null;
}

@Override
protected Class<?>[] getServletConfigClasses()
{
	Class[] configFiles= {BlogAppConfig.class};
	return configFiles;
}

@Override
protected String[] getServletMappings()
{
	String[] mappings= {"/"};
	return mappings;
}

}
