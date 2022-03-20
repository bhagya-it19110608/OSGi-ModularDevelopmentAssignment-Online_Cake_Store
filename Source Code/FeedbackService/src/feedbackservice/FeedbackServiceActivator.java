package feedbackservice;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

public class FeedbackServiceActivator implements BundleActivator {

	ServiceRegistration publishServiceRegistration;

	public void start(BundleContext context) throws Exception {
		
		System.out.println("Service Publisher Start");
		FeedbackService publisherService = new FeedbackServicePublishImpl();
		publishServiceRegistration = context.registerService(
				FeedbackService.class.getName(), publisherService, null);
	}

	public void stop(BundleContext context) throws Exception {
		System.out.println("Stop Service Publisher");
		publishServiceRegistration.unregister();
	}

}
