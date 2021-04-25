package com.example.demo1.service.serviceImpl;

import com.example.demo1.utils.HttpsClient;
import okhttp3.OkHttpClient;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * @PROJECT_NAME: demo01
 * @PACKAGE_NAME: com.example.demo01.service.Impl
 * @Class_NAME: WxService
 * @Author: zhangyongjiang
 * @DATE_TIME: 2021-4-21 上午 11:20
 * @Description:
 * @version:
 **/
@Service
public class WxService {

    @Value("${appid}")
    private String appid;
    @Value("${secret}")
    private String secret;
    /**
     * https://api.weixin.qq.com/sns/jscode2session?
     * appid=APPID
     * &
     * secret=SECRET
     * &
     * js_code=JSCODE
     * &
     * grant_type=authorization_code
     * @return
     */

    public Map login(String code) throws Exception {
        return HttpsClient.httpsGet("https://api.weixin.qq.com/sns/jscode2session?appid="+appid+"&secret="+secret+"&js_code="+ code +"&grant_type=authorization_code");
    }
}
