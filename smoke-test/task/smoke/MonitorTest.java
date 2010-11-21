package task.smoke;

import static org.junit.Assert.*;
import static org.hamcrest.Matchers.*;

import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.methods.GetMethod;
import org.junit.Test;

import task.config.ConfigurationUtil;

public class MonitorTest {

	String url = "http://localhost:" + ConfigurationUtil.getProperty("port")
			+ "/task/monitor";

	@Test
	public void testMonitorOk() throws Exception {
		HttpClient httpClient = new HttpClient();
		GetMethod request = new GetMethod(url);
		httpClient.executeMethod(request);
		String html = request.getResponseBodyAsString();
		assertThat(html, containsString("OK"));
	}

}
