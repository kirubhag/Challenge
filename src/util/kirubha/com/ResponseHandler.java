package util.kirubha.com;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;

import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")
public class ResponseHandler extends ActionSupport implements
		ServletRequestAware, ServletResponseAware {

	public HttpServletRequest request;
	public HttpServletResponse response;
	public JSONObject jsonObject;
	protected Map<String, String> responseObject;

	public ResponseHandler() {
		jsonObject = new JSONObject();
		responseObject = new HashMap<String, String>();
	}

	public void sendResponse(Map<String, String> responseObject, int status)
			throws IOException {
		String jsonResponse = JSONValue.toJSONString(responseObject);
		PrintWriter pw = response.getWriter();
		
		System.out.print("responseObject: " + jsonResponse);

		response.setContentType("text/json; charset=utf-8");
		response.setStatus(status);
		
		pw.println(jsonResponse);
		pw.flush();
		pw.close();
	}

	@Override
	public void setServletResponse(HttpServletResponse response) {
		// TODO Auto-generated method stub
		this.response = response;
	}

	@Override
	public void setServletRequest(HttpServletRequest request) {
		// TODO Auto-generated method stub
		this.request = request;
	}
}
