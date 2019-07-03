package wtyt.test;

import com.wtyt.qst.lgms.bean.LgmsPostBean;
import com.wtyt.qst.lgms.bean.LgmsPostBuilder;
import com.wtyt.qst.lgms.util.LgmsInit;
import com.wtyt.qst.lgms.util.LgmsUtil;
import net.sf.json.JSONArray;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 线上服务器微服务测试
 * @author wangxy
 * @date 2019年5月5日
 */
public class MicserverFormalTest {
		private static void init(){
			// 初始化
			LgmsInit.initLgmsParam("dcaGappMY2VHMXOsq", "appdcafu3ElHepF9BmZqhb",
					"http://microms.log56.com/wtytms/", 30000, 30000);
		}

	public static void main(String[] args) {
		init();
		test2501();
	}




	/**
	 * 【2501】查询ETC卡信息列表之无分页版本
	 */
	private static void test2501(){
		org.json.JSONObject dataJsObj = new org.json.JSONObject();
		JSONArray ja=new JSONArray();
		org.json.JSONObject js = new org.json.JSONObject();
		js.put("driverMobileNo","13560399124");
		js.put("isBind","0");
		js.put("oilType","7");
		ja.add(js);
		dataJsObj.put("queryRules",ja);
		LgmsPostBean postBean = LgmsPostBuilder.builder("2501", dataJsObj).addUniqueId().build();
		System.out.println(LgmsUtil.postLgms(postBean));
	}

}
