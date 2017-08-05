package bet.so.listener;

import org.springframework.cloud.netflix.eureka.server.event.EurekaInstanceRenewedEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

import com.alibaba.fastjson.JSONObject;

@Component
public class EurekaRenewedEventListener implements ApplicationListener<EurekaInstanceRenewedEvent> {

	public void onApplicationEvent(EurekaInstanceRenewedEvent arg0) {
		System.out.println(JSONObject.toJSONString(arg0));
	}

}
