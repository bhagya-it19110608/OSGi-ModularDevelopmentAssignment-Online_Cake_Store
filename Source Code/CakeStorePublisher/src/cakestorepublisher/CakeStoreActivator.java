package cakestorepublisher;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

import cakestorepublisher.CakeStorePublish;

public class CakeStoreActivator implements BundleActivator {

	ServiceRegistration publishServiceRegistration;
	
	public void start(BundleContext context) throws Exception {
		CakeStorePublish publishService = new CakeStorePublishImpl();
		publishServiceRegistration = context.registerService(CakeStorePublish.class.getName(), publishService,null);
		System.out.println("Start Cake Store Service");
		
	}

	public void stop(BundleContext context) throws Exception {
		System.out.println("Publisher Stop");
		publishServiceRegistration.unregister();
		System.out.println("Stop Cake Store Service");
	}

}
