package spittr.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * 	1. 由于servlet3.0和3.1的支持，使用Java配置的方式将DispatcherServlet配置在Servlet容器中，而不会在使用
 *  web.xml.
 *  2. 扩展自AbstractAnnotationConfigDispatcherServletInitializer的任意类都会自动地配置
 *  DispatcherServlet和Spring应用上下文。Spring应用的上下文会位于应用程序的Servlet上下文中
 * @author will
 *
 */
public class SpittrWebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer{

	
	/**
	 * ContextLoaderListener创建上下文所需的配置，它会加载应用中的其它bean。
	 * 通常是驱动应用后端的中间层和数据层组件。
	 * 
	 */
	@Override 
	protected Class<?>[] getRootConfigClasses() {
		return new Class<?>[] {RootConfig.class};
	}

	/**
	 * 指定配置类,加载包含Web组件的Bean，如控制器，视图解析器
	 * 及处理映射
	 * 
	 */
	@Override
	protected Class<?>[] getServletConfigClasses() {
		return new Class<?>[] {WebConfig.class};
	}

	/**
	 * 将DispatcherServlet映射到"/"
	 * 
	 */
	@Override
	protected String[] getServletMappings() {
		return new String[] {"/"};
	}

}
