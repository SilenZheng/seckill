package com.silen.seckill.utils;

import sun.misc.BASE64Encoder;

import java.io.*;
import java.net.*;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * @author zero
 */
public class Tools {

	public static Date stringToDate(String strDate) {
		return stringToDate(strDate, new Date(0));
	}

	public static Date stringToDate(String strDate,
			Date defaultValue) {
		Date date = defaultValue;
		try {
			date = java.sql.Date.valueOf(strDate);
		} catch (Exception e) {
		}
		return date;
	}

	public static Date stringToDate(String strDate, String strFormat) {
		SimpleDateFormat fromat = new SimpleDateFormat(strFormat);
		try {
			return fromat.parse(strDate);
		} catch (ParseException e) {
		}
		return null;
	}

	public static java.sql.Date stringToSqlDate(String strDate) {
		return stringToSqlDate(strDate, new java.sql.Date(0));
	}

	public static java.sql.Date stringToSqlDate(String strDate,
			java.sql.Date defaultValue) {
		java.sql.Date date = defaultValue;
		try {
			date = java.sql.Date.valueOf(strDate);
		} catch (Exception e) {
		}
		return date;
	}



	public static Timestamp stringToTimestamp(String strTime) {
		return stringToTimestamp(strTime, new Timestamp(0));
	}

	public static Timestamp stringToTimestamp(String strTime,
			Timestamp defaultValue) {
		Timestamp time = defaultValue;
		try {
			time = Timestamp.valueOf(strTime);
		} catch (Exception e) {
		}
		return time;
	}


	/**
	 * 发起Http请求
	 * 
	 * @param url
	 *            地址
	 * @param param
	 *            参数
	 * @param method
	 *            类型
	 * @param charset
	 *            字符集
	 * @return 返回请求结果(Response)
	 */
	public static String HttpRequest(String url, String param, String method,
			String charset) {
		StringBuffer strContent = new StringBuffer();
		HttpURLConnection conn = null;
		OutputStream os = null;
		BufferedReader br = null;
		try {
			if (!method.equalsIgnoreCase("POST")
					&& !method.equalsIgnoreCase("GET")) {
				method = "POST";
				System.out.println(url + "\r\nPost:" + param);
			} else if (method.equalsIgnoreCase("GET") && param != null
					&& !"".equals(param)) {
				url += "?" + param;
				System.out.println(url);
			}
			conn = (HttpURLConnection) new URL(url).openConnection();
			conn.setDoOutput(true);
			conn.setRequestMethod(method);

			os = conn.getOutputStream();
			os.write(param.getBytes());
			os.flush();

			br = new BufferedReader(new InputStreamReader(
					conn.getInputStream(), charset));
			String line;
			while ((line = br.readLine()) != null) {
				strContent.append(line);
			}
		} catch (Exception e) {
			System.err.println(e.getMessage());
		} finally {
			try {
				if (os != null) {
					os.close();
				}
			} catch (Exception e) {
			}

			try {
				if (br != null) {
					br.close();
				}
			} catch (Exception e) {
			}

			try {
				if (conn != null) {
					conn.disconnect();
				}
			} catch (Exception e) {
			}
		}
		return strContent.toString();
	}

	public String addDay(Date date, int day, String returnType) {
		Calendar calendar = new GregorianCalendar();
		calendar.setTime(date);
		calendar.add(Calendar.DATE, day);
		date = calendar.getTime();
		SimpleDateFormat format = new SimpleDateFormat(returnType);
		return format.format(date);
	}

	/**
	 * @author Simon Zhou
	 * @param min
	 * @param max
	 * @return
	 */
	public static int GenerateRandom(int min, int max) {
		if (min == max)
			return max;

		int number = 0;
		try {
			do {
				number = (int) Math.round(Math.random() * max);
			} while (number < min);
		} catch (Exception e) {
		}
		return number;
	}

	public static String getSimpleStr(String str) {
		if (str == null || str.trim().equalsIgnoreCase("null")) {
			return "";
		} else {
			return str.trim();
		}
	}

	public static String trimBeginEndChar(String str, String charStr) {
		if (str == null || str.trim().equalsIgnoreCase("null")) {
			return "";
		} else {
			str = str.trim();
			charStr = charStr.trim();
		}
		if (charStr == null || charStr.equals("")) {
			return str;
		}
		int charStrLength = charStr.length();
		while (str.startsWith(charStr)) {
			str = str.substring(charStrLength);
		}
		while (str.endsWith(charStr)) {
			str = str.substring(0, str.length() - charStrLength);
		}
		return str;
	}

	public static String replaceSpecialToCnChar(String str) {
		if (str == null || "".equals(str)) {
			return str;
		}
		str = str.replaceAll("'", "��");
		str = str.replaceAll("\"", "��");
		return str;
	}

	public static String strToBigInt(String str) {
		if (str == null || "".equals(str)) {
			return "";
		}
		return String.valueOf(new java.math.BigInteger(str.getBytes()));
	}

	public static String bigIntToStr(String strBigInteger) {
		if (strBigInteger == null || "".equals(strBigInteger)) {
			return "";
		}
		return new String(new java.math.BigInteger(strBigInteger).toByteArray());
	}

	public static boolean hostAlive(String host, int port) {
		try {
			InetSocketAddress sockAddr = new InetSocketAddress(host, port);
			Socket socket = new Socket();
			socket.connect(sockAddr, 500);
			socket.close();
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public static boolean writeTextFile(String fileName, String content) {
		if (fileName == null || fileName.length() == 0) {
			return false;
		}

		// FilePrinter����linux jdk 1.4��������BUG��д�ļ����ܶ�ʧ�ַ�˴�ʹ�ö����Ʒ��?
		FileOutputStream fos = null;
		boolean rc = false;
		try {
			File file = new File(fileName).getParentFile();
			if (!file.isDirectory()) {
				file.mkdirs();
			}
			fos = new FileOutputStream(fileName);
			fos.write(content.getBytes());
			rc = true;
		} catch (IOException e) {
			System.out.println(Tools.class.getName() + ": " + e.getMessage());
		} finally {
			if (fos != null) {
				try {
					fos.close();
				} catch (Exception e) {
				}
			}
		}

		return rc;
	}

	public static String openURL(String url) {
		String rc = "";
		try {
			HttpURLConnection urlConn = (HttpURLConnection) new URL(url)
					.openConnection();
			System.setProperty("sun.net.client.defaultConnectTimeout", "5000");
			System.setProperty("sun.net.client.defaultReadTimeout", "30000");
			BufferedReader br = new BufferedReader(new InputStreamReader(
					urlConn.getInputStream()));
			int len = 0;
			char buff[] = new char[1024];
			while ((len = br.read(buff, 0, 1024)) >= 0) {
				rc += new String(buff, 0, len);
			}
			br.close();
			urlConn.disconnect();
			if (urlConn.getResponseCode() != 200) {
				rc = "";
			}
		} catch (MalformedURLException e) {
			rc = "";
			System.err.println(url);
			System.err.println(Tools.class.getName() + ": " + e.getMessage());
		} catch (IOException e) {
			rc = "";
			System.err.println(url);
			System.err.println(Tools.class.getName() + ": " + e.getMessage());
		}

		return rc;
	}

	/**
	 * @param str
	 * @return
	 */
	public static int getChineseLength(String str) {
		if (str == null) {
			return 0;
		}
		int k = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) > 255) {
				k += 2;
			} else {
				k += 1;
			}
		}
		return k;
	}

	/**
	 * 系统时间 >date2
	 * 
	 * @param date2
	 * @return
	 */
	public static boolean isDateAfter(String date2) {
		try {
			Date date1 = new Date();
			DateFormat df = DateFormat.getDateTimeInstance();
			return date1.after(df.parse(date2));
		} catch (ParseException e) {
			System.out.print(e.getMessage());
			return false;
		}
	}

	/**
	 * 获取当前时间流水号yyyyMMddHHmmss
	 */
	public static String createDateTimeID() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
		Date date = new Date();
		return sdf.format(date);
	}

	/**
	 * 获取时间流水号yyyyMMddHHmmss
	 * 
	 * @param timeLater
	 *            延期时间（单位：分钟）
	 * @return
	 */
	public static String createDateTimeID(int timeLater) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
		Date date = new Date();
		long l = date.getTime() + timeLater * 60 * 1000;
		return sdf.format(l);
	}

	/**
	 * 获取当前时间流水号
	 */
	public static String createTimeID() {
		SimpleDateFormat sdf = new SimpleDateFormat("HHmmss");
		Date date = new Date();
		return sdf.format(date);
	}

	/**
	 * 获取当前日期流水号
	 */
	public static String createDateID() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
		Date date = new Date();
		return sdf.format(date);
	}

	public static String createDateTimesID() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmsssss");
		Date date = new Date();
		return sdf.format(date);
	}

	/**
	 * 获取时间订单号
	 */
	public static String createOrderID() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
		Date date = new Date();
		char c = 'a';
		double a = Math.random() * 10;
		c = (char) (c + (int) (Math.random() * 26));
		a = Math.ceil(a);
		int randomNum = new Double(a).intValue();
		return c + sdf.format(date) + randomNum;
	}

	/**
	 * 获取前前一年的月份
	 */
	public static LinkedHashMap<String, String> getOneYearMonth() {
		LinkedHashMap<String, String> map = new LinkedHashMap<String, String>();
		Calendar curr = Calendar.getInstance();
		Date date = new Date();
		curr.setTime(date);
		curr.add(Calendar.MONTH, -1);
		SimpleDateFormat key = new SimpleDateFormat("yyyy-MM");
		SimpleDateFormat value = new SimpleDateFormat("yyyy年MM月");
		for (int i = 0; i < 12; i++) {
			map.put(key.format(curr.getTime()), value.format(curr.getTime()));
			curr.add(Calendar.MONTH, -1);
		}
		return map;
	}

	/**
	 * 讲数据库中换行转换为html格式的<br>
	 * 
	 * @param sourcestr
	 * @return
	 */
	public static String textToHtml(String sourcestr) {
		int strlen;
		String restring = "", destr = "";
		strlen = sourcestr.length();
		for (int i = 0; i < strlen; i++) {
			char ch = sourcestr.charAt(i);
			switch (ch) {
			case '<':
				destr = "<";
				break;
			case '>':
				destr = ">";
				break;
			case '\"':
				destr = "";
				break;
			case '&':
				destr = "&";
				break;
			case 13:
				destr = "<br>";
				break;
			case 32:
				destr = "&nbsp;";
				break;
			default:
				destr = "" + ch;
				break;
			}
			restring = restring + destr;
		}
		return "" + restring;
	}

	public static String getWeek() {
		String whatDay = "";
		Calendar c = Calendar.getInstance();
		c.setTime(new Date(System.currentTimeMillis()));
		int dayOfWeek = c.get(Calendar.DAY_OF_WEEK);
		switch (dayOfWeek) {
		case 1:
			whatDay = "星期日";
			break;
		case 2:
			whatDay = "星期一";
			break;
		case 3:
			whatDay = "星期二";
			break;
		case 4:
			whatDay = "星期三";
			break;
		case 5:
			whatDay = "星期四";
			break;
		case 6:
			whatDay = "星期五";
			break;
		case 7:
			whatDay = "星期六";
			break;
		}
		return whatDay;
	}
	
	/**
	* 生成随机密码
	* @param passLenth 生成的密码长度
	* @return 随机密码
	*/
	public static String createRandomBylen(int passLenth) {
	   StringBuffer buffer = new StringBuffer(
	     "0123456789");
	   StringBuffer pass = new StringBuffer();
	   Random random = new Random();
	   int range = buffer.length();
	   for (int i = 0; i < passLenth; i++) {
	    //生成指定范围类的随机数0—字符串长度(包括0、不包括字符串长度)
		   pass.append(buffer.charAt(random.nextInt(range)));
	   }
	   return pass.toString();
	}


    /**
     * 生成指定长度的UUID 不超过32位
     * @param length
     * @return
     */
    public static String getUUID(int length){
        String uuid = UUID.randomUUID().toString().toUpperCase();
        String uuidStr=uuid.replace("-", "").substring(0, length);
        return uuidStr;
    }


	public static String createRandomNumber(int length) {
		StringBuffer buffer = new StringBuffer();
		Random rand = new Random();
		for (int i = 0; i < length; i++) {
			int tempvalue = rand.nextInt(10);
			buffer.append(tempvalue);
		}
		return buffer.toString();
	}

	/**
	 * @return
	 */
	public static String getProductNo(){
		String prefix = "NO";
		String date = DateUtil.DateToString(new Date(), "yyyyMMdd");
		String random = createRandomNumber(8);
		return prefix + date + random;
	}

	/**
	 *
	 * @param passWord
	 * @return
	 */
	public static String encoderByMd5(String passWord) {
		MessageDigest md5;
		try {
			md5 = MessageDigest.getInstance("MD5");
			BASE64Encoder base64en = new BASE64Encoder();
			return base64en.encode(md5.digest(passWord.getBytes(StandardCharsets.UTF_8)));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return passWord;
	}

	/**
	 * 获取指定长度的数字验证码
	 *
	 * @return
	 */
	public static String getRandomPassWord(int size) {
		String val = "";
		Random random = new Random();
		//length为几位密码
		for (int i = 0; i < size; i++) {
			String charOrNum = random.nextInt(2) % 2 == 0 ? "S" : "N";
			if ("S".equalsIgnoreCase(charOrNum)) {
				int temp = random.nextInt(2) % 2 == 0 ? 65 : 97;
				val += (char) (random.nextInt(26) + temp);
			} else if ("N".equalsIgnoreCase(charOrNum)) {
				val += String.valueOf(random.nextInt(10));
			}
		}
		return val;
	}

	public static void main(String[] args) {
		System.out.println(getProductNo());
	}
	
}