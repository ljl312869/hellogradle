package wtyt.test;

import com.wtyt.qst.lgms.bean.LgmsPostBean;
import com.wtyt.qst.lgms.bean.LgmsPostBuilder;
import com.wtyt.qst.lgms.util.LgmsInit;
import com.wtyt.qst.lgms.util.LgmsUtil;
import net.sf.json.JSONArray;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 本地微服务测试
 * @author wangxy
 * @date 2019年5月5日
 */
public class MicserverLocalTest {

	private static void init(){
		// 初始化
		LgmsInit.initLgmsParam("dcaGappMY2VHMXOsq", "appdcafu3ElHepF9BmZqhb",
				"http://micromstest.log56.com/wtytms/", 30000, 30000);
	}

	public static void main(String[] args) {
		init();
		//test2501();
		//test2651();
		test2602();
		test2603();
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


	/**
	 * 【2651】同步管车宝位置信息
	 */
	private static void test2651(){
		org.json.JSONObject dataJsObj = new org.json.JSONObject();
		dataJsObj.put("mobileNo", "15906380296");
		dataJsObj.put("locationTime", "2019-06-21 23:12:52");
		dataJsObj.put("address", "安徽合肥习友路2525号1");
		dataJsObj.put("areaNo", "");
		LgmsPostBean postBean = LgmsPostBuilder.builder("2651", dataJsObj).addUniqueId().build();
		System.out.println(LgmsUtil.postLgms(postBean));
	}

	/**
	 * 【2602】LBS查询本地历史轨迹接口
	 */
	private static void test2602(){
		org.json.JSONObject dataJsObj = new org.json.JSONObject();
		dataJsObj.put("mobileNo", "15055110184");
		dataJsObj.put("startTime","2012-11-11 23:00:11");
		dataJsObj.put("endTime","2019-11-11 23:12:11");
		LgmsPostBean postBean = LgmsPostBuilder.builder("2602", dataJsObj).addUniqueId().build();
		System.out.println(LgmsUtil.postLgms(postBean));
	}

	/**
	 * 【2603】取消/启用gps车牌号白名单接口
	 */
	private static void test2603(){
		org.json.JSONObject dataJsObj = new org.json.JSONObject();
		dataJsObj.put("gpsFirmId", "1");
		dataJsObj.put("carNo","陕KB3412");
		dataJsObj.put("note","");
		LgmsPostBean postBean = LgmsPostBuilder.builder("2603", dataJsObj).addUniqueId().build();
		System.out.println(LgmsUtil.postLgms(postBean));
	}
















}
