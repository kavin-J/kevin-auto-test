package com.kevin.test.command;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import okhttp3.*;
import org.apache.commons.codec.digest.DigestUtils;
import org.apache.commons.codec.digest.HmacUtils;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import static com.kevin.test.util.Constants.APPKEY;
import static com.kevin.test.util.Constants.APPLICATION_JSON;

/**
 * Created by Jkevin on 2017/8/3.
 */
public class TestCommand {

    private static final OkHttpClient client = new OkHttpClient();

    @Test
    public void demo() throws IOException {

        Assert.assertEquals(1, 3);
    }
}
