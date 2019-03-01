package com.raynspace.starter.excel.example.service;

import com.raynspace.starter.excel.example.vo.WebDto;
import com.raynspace.starter.excel.util.ExcelUtil;
import org.springframework.stereotype.Service;

import java.io.FileNotFoundException;
import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * Created by lihuabing on 2017/8/28.
 */
@Service
public class ExcelExampleService {

    public void example(OutputStream outputStream) throws FileNotFoundException {
        List<WebDto> list = new ArrayList<WebDto>();
        list.add(new WebDto("知识林", "http://www.zslin.com", "admin", "111111", 555));
        list.add(new WebDto("权限系统", "http://basic.zslin.com", "admin", "111111", 111));
        list.add(new WebDto("校园网", "http://school.zslin.com", "admin", "222222", 333));

        Map<String, String> map = new HashMap<String, String>();
        map.put("title", "网站信息表");
        map.put("total", list.size()+" 条");
        map.put("date", getDate());

        ExcelUtil.getInstance().exportObj2ExcelByTemplate(map, "web-info-template.xls", outputStream,
                list, WebDto.class, true);
    }

    private String getDate() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日");
        return sdf.format(new Date());
    }
}
