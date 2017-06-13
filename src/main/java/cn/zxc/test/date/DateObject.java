/*
 * Copyright (c) 2010-2017 EEFUNG Software Co.Ltd. All rights reserved.
 * 版权所有(c)2010-2017湖南蚁坊软件股份有限公司。保留所有权利。
 */
package cn.zxc.test.date;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * <p>功能描述,该部分必须以中文句号结尾。</p>
 *
 * 创建日期 2017年5月29日
 * @author zhengxiaochuang(zhengxiaochuang@eefung.com)
 * @since $version$
 */
@XmlRootElement(name="dateObj")
public class DateObject implements Serializable{
    /**
     * 
     */
    private static final long serialVersionUID = 7985259985445615843L;
    private String dateFormat;
    private String dateString;
    public DateObject() {
    }
    public String getDateFormat() {
        return dateFormat;
    }
    public void setDateFormat(String dateFormat) {
        this.dateFormat = dateFormat;
    }
    public String getDateString() {
        return dateString;
    }
    public void setDateString(String dateString) {
        this.dateString = dateString;
    }
}
