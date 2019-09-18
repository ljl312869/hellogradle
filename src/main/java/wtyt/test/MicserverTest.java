package wtyt.test;

import com.alibaba.fastjson.JSONObject;
import com.wtyt.qst.lgms.bean.LgmsPostBean;
import com.wtyt.qst.lgms.bean.LgmsPostBuilder;
import com.wtyt.qst.lgms.util.LgmsInit;
import com.wtyt.qst.lgms.util.LgmsUtil;
import com.wtyt.qst.util.util.HttpUtil;
import net.sf.json.JSONArray;


/**
 * 测试服务器微服务测试
 * @author wangxy
 * @date 2019年5月5日
 */
public class MicserverTest {

	private static void init(){
		// 初始化
		LgmsInit.initLgmsParam("dcaGappMY2VHMXOsq", "appdcafu3ElHepF9BmZqhb",
				"http://micromstest.log56.com/wtytms/", 30000, 30000);
	}


	/**
	 * 【2601】实时定位接口
	 */
	private static void test2601(){
		JSONObject dataJsObj = new JSONObject();
		JSONArray data =new JSONArray();
		JSONObject js1 = new JSONObject();
		js1.put("orgId", "1234");
		js1.put("mobileNo","15055110182");
		js1.put("carNo","皖A123456");
		js1.put("gpsFirmId","");
		js1.put("locationType", "1");
		js1.put("businessSource","陈明测试");
		data.add(js1);
		dataJsObj.put("dataList",data);
		LgmsPostBean postBean = LgmsPostBuilder.builder("2601", dataJsObj).addUniqueId().build();
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
		dataJsObj.put("note","ceeee");
		dataJsObj.put("status","0");
		LgmsPostBean postBean = LgmsPostBuilder.builder("2603", dataJsObj).addUniqueId().build();
		System.out.println(LgmsUtil.postLgms(postBean));
	}

	/**
	 * 【2651】同步管车宝位置信息
	 */
	private static void test2651() {
		org.json.JSONObject dataJsObj = new org.json.JSONObject();
		dataJsObj.put("mobileNo", "18756917965");
		dataJsObj.put("locationTime", "2019-06-12 23:12:12");
		dataJsObj.put("address", "安徽省合肥市路歌大厦 （汉）袁康《越绝书》越绝卷第十三 ：其终始即尊位倾万物散文武之业桀纣之迹可知矣。（引文见《越绝书》卷十三《枕中》：范子曰：”臣闻古之贤主圣君，执中和而原其终始，即位安而万物定矣；不执中和，不原其终始，即尊位倾，万物散。文武之业，桀纣之迹，可知矣。“这里”文武“指周文王和周武王，与其后之”桀纣\"相对，前”散“字与”文“字义无涉。）");
		dataJsObj.put("areaNo", "0556");
		dataJsObj.put("busSource", "guanchebao");
		LgmsPostBean postBean = LgmsPostBuilder.builder("2651", dataJsObj).addUniqueId().build();
		System.out.println("【2651】同步管车宝位置信息:"+LgmsUtil.postLgms(postBean));
	}

	/**
	 * 【2501】查询ETC卡信息列表之无分页版本
	 */
	private static void test2501(){
		JSONObject dataJsObj = new JSONObject();
		JSONArray ja=new JSONArray();
		JSONObject js = new JSONObject();
		js.put("driverCarNo","皖66889");
		js.put("etcCardType","");
		js.put("driverIdCard","");
		js.put("state","");
		js.put("driverMno","");
		ja.add(js);
		dataJsObj.put("queryRules",ja);

		LgmsPostBean postBean = LgmsPostBuilder.builder("2501", dataJsObj).addUniqueId().build();
		System.out.println(LgmsUtil.postLgms(postBean));
	}

	/**
	 * 【2402】查询两点之间的油站信息  合肥维天运通 117.141221,31.863602
	 */
	private static void test2402(){
		org.json.JSONObject dataJsObj = new org.json.JSONObject();
		dataJsObj.put("startLng", "117.141221");
		dataJsObj.put("startLat", "31.863602");
		dataJsObj.put("endLng", "117.125187");
		dataJsObj.put("endLat", "31.880806");

		LgmsPostBean postBean = LgmsPostBuilder.builder("2401", dataJsObj).addUniqueId().build();
		System.out.println(LgmsUtil.postLgms(postBean));
	}

	private static  void testOilTrade2453(){
		org.json.JSONObject dataJsObj = new org.json.JSONObject();
		dataJsObj.put("oilId", "117141221");
		LgmsPostBean postBean = LgmsPostBuilder.builder("2453", dataJsObj).addUniqueId().build();
		System.out.println(LgmsUtil.postLgms(postBean));
	}


	/**
	 * 【2301】查询周转金用户信息
	 */
	private static  void testZzjServer2301(){
		org.json.JSONObject dataJsObj = new org.json.JSONObject();
		dataJsObj.put("driverId", "15319");
		dataJsObj.put("isQueryJxq", "0");
		LgmsPostBean postBean = LgmsPostBuilder.builder("2301", dataJsObj).addUniqueId().build();
		System.out.println(LgmsUtil.postLgms(postBean));
	}

	/**
	 * 【2421】注册电子油卡
	 */
	private static  void test2421(){
		org.json.JSONObject dataJsObj = new org.json.JSONObject();
		dataJsObj.put("driverMno", "15205519846");
		dataJsObj.put("driverName", "李军雷");
		dataJsObj.put("addType", "0");
		dataJsObj.put("idCode", "341221198902068523");
		dataJsObj.put("driverCarNo", "");

		dataJsObj.put("driverIdImg", "");
		dataJsObj.put("driverLiceImg", "");
		dataJsObj.put("driverDriImg", "");

		dataJsObj.put("saleName", "");
		dataJsObj.put("saleDepartment", "");
		LgmsPostBean postBean = LgmsPostBuilder.builder("2421", dataJsObj).addUniqueId().build();
		System.out.println(LgmsUtil.postLgms(postBean));
	}


	public static void main(String[] args) {
		init();
		test2421();
		//testOilTrade2453();
		//test2601();
		//test2501();
		//test2602();
		//test2603();
		//testZzjServer2301();
	}

}
