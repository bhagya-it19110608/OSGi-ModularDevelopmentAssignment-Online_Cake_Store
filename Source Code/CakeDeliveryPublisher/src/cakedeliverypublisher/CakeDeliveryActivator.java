package cakedeliverypublisher;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;



public class CakeDeliveryActivator implements BundleActivator {
	
	ServiceRegistration CakeDeliveryRegistration;



	public void start(BundleContext context) throws Exception {
		
		System.out.println("Start Cake Delivery Publisher!");
		DeliveryCake  CakeDeliveryPublisherService = new CakeDeliveryPublishImpl();
		CakeDeliveryRegistration = context.registerService(DeliveryCake.class.getName(), CakeDeliveryPublisherService, null);
		//CakeDeliveryActivator.context = bundleContext;
	}

	public void stop(BundleContext bundleContext) throws Exception {
		
		System.out.println("Stop  Cake  Delivery Publisher!");
		CakeDeliveryRegistration.unregister();
		
		
		
		//CakeDeliveryActivator.context = null;
	}

}
