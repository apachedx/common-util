package org.apachedx.common.util;

/**
 * 
 * @author cai.hongzhi apachdx@gmail.com
 * @version 1.1
 *
 */
public final class IntegerUtil {
	/**
	 * 转换字符串成整型数值，错误格式返回0.
	 * @param src
	 * @return 整型数值
	 */
    public static Integer parseInt(String src) {
        try {
            return Integer.parseInt(src);
        } catch (Exception e) {
            return 0;
        }
    }
}
