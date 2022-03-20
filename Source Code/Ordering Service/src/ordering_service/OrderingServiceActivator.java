package ordering_service;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

public class OrderingServiceActivator implements BundleActivator {

	ServiceRegistration publishServiceRegistration;
	
	public void start(BundleContext bundleContext) throws Exception {

		System.out.println("Start ordering publisher!!!...");
		OrderingServicePublisher publishService = new OrderingServicePublisherImpl();
		publishServiceRegistration = bundleContext.registerService(OrderingServicePublisher.class.getName(), publishService, null);
	}

	public void stop(BundleContext bundleContext) throws Exception {

		System.out.println("Stop ordering publisher!!!...");
		publishServiceRegistration.unregister();
	}

}
