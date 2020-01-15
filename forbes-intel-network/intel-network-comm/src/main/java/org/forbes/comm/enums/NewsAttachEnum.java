package org.forbes.comm.enums;

import com.google.common.collect.Maps;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
/***
 * NewsStausEnum概要说明：新闻附件文件类型
 * @author niehy(Frunk)
 */
public enum NewsAttachEnum {

    THUMBNAIL("0","缩略图"),
    ATTACHMENTS("1","新闻附件");

    /***编码
     */
    private String code;

    /***名称
     */
    private String name;


    /***
     * existsNewsStausEnum方法慨述:
     * @param code
     * @return boolean
     * @创建人 huanghy
     * @创建时间 2019年12月7日 上午11:19:13
     * @修改人 (修改了该文件，请填上修改人的名字)
     * @修改日期 (请填上修改该文件时的日期)
     */
    public static boolean existsNewsAttachEnum(String code){
        return Arrays.asList(NewsAttachEnum.values()).stream()
                .filter(NewsAttach -> ((NewsAttachEnum)NewsAttach).getCode().equals(code)).count() > 0 ;
    }


    /***
     * receNewsStaus方法慨述:
     * @return List<Map<String,String>>
     * @创建人 huanghy
     * @创建时间 2019年12月7日 上午11:22:07
     * @修改人 (修改了该文件，请填上修改人的名字)
     * @修改日期 (请填上修改该文件时的日期)
     */
    public static List<Map<String,String>> receNewsAttach(){
        return Arrays.asList(NewsAttachEnum.values()).stream().map(newsAttach -> {
            Map<String,String> reponseMap = Maps.newHashMap();
            NewsAttachEnum newsAttachs = ((NewsAttachEnum)newsAttach);
            reponseMap.put("code", newsAttachs.getCode());
            reponseMap.put("name", newsAttachs.getName());
            return reponseMap;
        }).collect(Collectors.toList());
    }

    /***
     *
     * 构造函数:
     * @param code
     * @param name
     */
    NewsAttachEnum(String code, String name){
        this.code = code;
        this.name = name;
    }




    /**
     * @return code
     */
    public String getCode() {
        return code;
    }


    /**
     * @param code 要设置的 code
     */
    public void setCode(String code) {
        this.code = code;
    }


    /**
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name 要设置的 name
     */
    public void setName(String name) {
        this.name = name;
    }
}