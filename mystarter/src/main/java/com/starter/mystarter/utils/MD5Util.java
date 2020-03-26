package com.starter.mystarter.utils;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * <p>
 * MD5Util:
 * </p>
 *
 * @author jiangxf
 * @version 2.8.0
 * @since 2019-10-28
 */
@Data
@ConfigurationProperties(prefix="md5")
public class MD5Util {

    /**
     * 测试的key
     */
    private String key;

    /**
     *  测试的value
     */
    private String value;

    public String getMD5( String source ) {
        return getMD5( source.getBytes() );
    }

    public String getMD5(byte[] source) {
        String s = null;
        char hexDigits[] = {
                '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F' };
        try {
            java.security.MessageDigest md = java.security.MessageDigest.getInstance("MD5");
            byte tmp[];
            synchronized ( MD5Util.class ) {
                md.update(source);
                tmp = md.digest();
            }
            char str[] = new char[16 * 2];
            int k = 0;
            for (int i = 0; i < 16; i++) {
                byte byte0 = tmp[i];
                str[k++] = hexDigits[byte0 >>> 4 & 0xf];
                str[k++] = hexDigits[byte0 & 0xf];
            }
            s = new String(str);

        } catch (Exception e) {
            e.printStackTrace();
        }

        return s;
    }

}