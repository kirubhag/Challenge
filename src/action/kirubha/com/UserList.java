package action.kirubha.com;

import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.Field;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.kirubha.com.UserModel;

import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;
import org.json.simple.JSONObject;

import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")
public class UserList extends ActionSupport implements ServletRequestAware,
		ServletResponseAware {

	public HttpServletRequest request;
	public HttpServletResponse response;
	public JSONObject obj = new JSONObject();
	UserModel user = new UserModel();

	public void setServletResponse(HttpServletResponse response) {
		this.response = response;
	}

	public void setServletRequest(HttpServletRequest request) {
		this.request = request;
	}

	@SuppressWarnings("unchecked")
	public String execute() throws IOException {
		user.setUserName("Kirubha");
		user.setEmailId("Developer");
		Field[] attributes = user.getClass().getDeclaredFields();

		for (Field field : attributes) {
			System.out.println("ATTRIBUTE NAME: " + field.getName());
		
		}
		obj.put("name", "foo");
		obj.put("num", new Integer(100));
		obj.put("balance", new Double(1000.21));
		obj.put("is_vip", new Boolean(true));
		obj.put("nickname", null);
		obj.put("lang", request.getParameter("lang"));
		System.out.print("JSON: " + obj);
		response.setContentType("text/json; charset=utf-8");
		response.setStatus(200);
		PrintWriter pw = response.getWriter();
		pw.println(obj.toString());
		pw.flush();
		pw.close();
		return null;
	}
}
