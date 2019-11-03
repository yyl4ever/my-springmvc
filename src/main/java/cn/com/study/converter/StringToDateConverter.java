package cn.com.study.converter;

import org.springframework.core.convert.converter.Converter;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 将字符串转换为日期类型
 * Converter<Source, Target>
 * 当请求为字符串需要强制转换为Date类型时使用这个Converter
 * @Author: yangyl
 * @Date: 2019/11/3 11:24
 */
public class StringToDateConverter implements Converter<String, Date> {
    /**
     * 入参为字符串
     * @param s
     * @return
     */
    public Date convert(String s) {
        if (s == null) {
            throw new RuntimeException("请您传入数据");
        }
        s = s.replaceAll("-", "").replaceAll("/", "");
        DateFormat df = new SimpleDateFormat("yyyyMMdd");

        try {
            return df.parse(s);
        } catch (ParseException e) {
            throw new RuntimeException("数据类型转换出现错误");
        }
    }
}
