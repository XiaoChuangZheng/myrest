/*
 * Copyright (c) 2010-2017 EEFUNG Software Co.Ltd. All rights reserved.
 * 版权所有(c)2010-2017湖南蚁坊软件股份有限公司。保留所有权利。
 */
package cn.zxc.test.date;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;


/**
 * <p>功能描述,该部分必须以中文句号结尾。</p>
 *
 * 创建日期 2017年5月29日
 * @author zhengxiaochuang(zhengxiaochuang@eefung.com)
 * @since $version$
 */
public class DateRestService {
    @Path("/date")
    @GET
    @Produces(MediaType.APPLICATION_XML)
    public Response parseDate2String(@QueryParam("time") long time,
                                     @QueryParam("format") @DefaultValue("yyyy-MM-dd HH:mm:ss") String format) {
        DateFormat dateFormat = new SimpleDateFormat(format);
        String date = dateFormat.format(new Date(time));
        DateObject dateObject = new DateObject();
        dateObject.setDateFormat(format);
        dateObject.setDateString(date);
        
        return Response.status(Status.OK).entity(dateObject).build();

    }
}
