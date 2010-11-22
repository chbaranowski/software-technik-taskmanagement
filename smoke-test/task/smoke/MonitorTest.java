package task.smoke;

import static org.junit.Assert.*;
import static org.hamcrest.Matchers.*;

import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.methods.GetMethod;
import org.junit.Test;

import task.config.ConfigurationUtil;

public class MonitorTest {

	String url = ConfigurationUtil.getProperty("URL") + "/monitor";

	@Test
	public void testMonitorOk() throws Exception {
		HttpClient httpClient = new HttpClient();
		System.out.println("URL :" + url);
		GetMethod request = new GetMethod(url);
		httpClient.executeMethod(request);
		String html = request.getResponseBodyAsString();
		assertThat(html, containsString("OK"));
	}

}
