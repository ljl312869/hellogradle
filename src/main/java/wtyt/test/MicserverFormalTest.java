package wtyt.test;

import com.wtyt.qst.lgms.bean.LgmsPostBean;
import com.wtyt.qst.lgms.bean.LgmsPostBuilder;
import com.wtyt.qst.lgms.util.LgmsInit;
import com.wtyt.qst.lgms.util.LgmsUtil;
import net.sf.json.JSONArray;
import org.json.JSONObject;

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
		JSONObject dataJsObj = new JSONObject("{\"queryRules\":[{\"etcCardType\":\"2\",\"state\":3,\"driverCarNo\":\"鲁RC7815\"},{\"etcCardType\":\"2\",\"state\":3,\"driverCarNo\":\"冀FD3086\"},{\"etcCardType\":\"2\",\"state\":3,\"driverCarNo\":\"鲁RC2561\"},{\"etcCardType\":\"2\",\"state\":3,\"driverCarNo\":\"鲁RH1512\"},{\"etcCardType\":\"2\",\"state\":3,\"driverCarNo\":\"鲁PE8235\"},{\"etcCardType\":\"2\",\"state\":3,\"driverCarNo\":\"鲁RC2561\"},{\"etcCardType\":\"2\",\"state\":3,\"driverCarNo\":\"鲁RC7815\"},{\"etcCardType\":\"2\",\"state\":3,\"driverCarNo\":\"鲁A915YE\"},{\"etcCardType\":\"2\",\"state\":3,\"driverCarNo\":\"鲁H17A07\"},{\"etcCardType\":\"2\",\"state\":3,\"driverCarNo\":\"冀FL2792\"},{\"etcCardType\":\"2\",\"state\":3,\"driverCarNo\":\"冀FL2792\"},{\"etcCardType\":\"2\",\"state\":3,\"driverCarNo\":\"鲁RC7815\"},{\"etcCardType\":\"2\",\"state\":3,\"driverCarNo\":\"冀FD3086\"},{\"etcCardType\":\"2\",\"state\":3,\"driverCarNo\":\"鲁A915YE\"},{\"etcCardType\":\"2\",\"state\":3,\"driverCarNo\":\"鲁A915YE\"}]}\n");
		LgmsPostBean postBean = LgmsPostBuilder.builder("2501", dataJsObj).addUniqueId().build();
		System.out.println(LgmsUtil.postLgms(postBean));
	}

}
