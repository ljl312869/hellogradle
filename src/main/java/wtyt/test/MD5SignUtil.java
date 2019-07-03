package wtyt.test;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class MD5SignUtil {
	private static final char[] hexDigits = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F' };
	  private static final String signatureAlgorithm = "MD5";
	  
	  /**	 
	   * * SHA1加密  使用消息摘要MessageDigest 处理	 
	   * * @throws Exception 	 
	   * */	
	  public static String encodeBySHA(String str) throws Exception{		
		  MessageDigest sha1;		
		  sha1 = MessageDigest.getInstance("SHA1");		

		  //先更新摘要		
		  byte[] digest = sha1.digest(); 
				
		  String hex = toHex(digest);		
		  System.out.println("SHA1摘要:" + hex);		
		  return hex;	
	  }
	  
	/**
	 * 摘要转16进制
	 * 
	 * @param digest
	 * @return
	 */
	private static String toHex(byte[] digest) {
		StringBuilder sb = new StringBuilder();
		int len = digest.length;
		String out = null;
		for (int i = 0; i < len; i++) {
			out = Integer.toHexString(0xFF & digest[i]);// 原始方法
			if (out.length() == 1) {
				sb.append("0");// 如果为1位 前面补个0
			}
			sb.append(out);
		}
		return sb.toString();
	}




	  public static String sign(String content, String charset, String key)
	  {
	    try
	    {
	      if (key == null) {
	        throw new Exception("签名key为空!");
	      }
	      String signStr = String.format("%s%s", new Object[] { content, key });
	      return getMD5(signStr, charset);
	    } catch (Exception e) {
	     // throw new Exception("生成签名出错:" + e.getMessage(), e);
	    }
		return key;
	  }

	  public static boolean verifySignature(String content, String charset, String sign, String md5Key)
	  {
	    try {
	      String signStr = String.format("%s%s", new Object[] { content, md5Key });
	      String calculateSign = getMD5(signStr, charset);
	      if (sign.equalsIgnoreCase(calculateSign)) {
	        return true;
	      }
	      return false;
	    } catch (Exception e) {
	     // throw new Exception("验证签名出错:" + e.getMessage(), e);
	    }
		return false;
	  }

	  public static String getMD5(String sourceStr, String charset)
	    throws NoSuchAlgorithmException, UnsupportedEncodingException
	  {
	    byte[] strTemp;
	    if (charset == null)
	      strTemp = sourceStr.getBytes();
	    else {
	      strTemp = sourceStr.getBytes(charset);
	    }

	    MessageDigest mdTemp = MessageDigest.getInstance("MD5");
	    mdTemp.update(strTemp);
	    byte[] md = mdTemp.digest();
	    int j = md.length;
	    char[] str = new char[j * 2];
	    int k = 0;
	    for (int i = 0; i < j; i++) {
	      byte byte0 = md[i];
	      str[(k++)] = hexDigits[(byte0 >>> 4 & 0xF)];

	      str[(k++)] = hexDigits[(byte0 & 0xF)];
	    }
	    return new String(str);
	  }

	// md5加密
	public static String md5(String password) {
		if (password == null || "".equals(password)) {
			return null;
		}
		try {
			MessageDigest md = MessageDigest.getInstance("MD5");
			byte[] bytes = md.digest(password.getBytes());
			return byte2hex(bytes);
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
			return null;
		}
	}

	private static String byte2hex(byte[] b) {
		String hs = "";
		String stmp = "";
		for (int n = 0; n < b.length; n++) {
			stmp = (Integer.toHexString(b[n] & 0XFF));
			if (stmp.length() == 1) {
				hs = hs + "0" + stmp;
			} else {
				hs = hs + stmp;
			}
		}
		return hs;
	}
	  public static void main(String[] args){
		  try {
			System.out.println(MD5SignUtil.getMD5("wtyt1156", "utf-8"));
		} catch (NoSuchAlgorithmException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	  }
}
