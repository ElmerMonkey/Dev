package foo.bar.Service.TestService.Impl;

import foo.bar.Model.Util.Response;
import foo.bar.Model.Util.ResponseStatus;
import foo.bar.Service.TestService.Test1Service;
import org.springframework.stereotype.Service;

/**
 * Created by ewrfcas on 2015/12/7.
 */
@SuppressWarnings("all")
@Service
public class Test1Impl implements Test1Service {
    @Override
    public Response<String> Test1() {
        Response<String> response=new Response<String>();
        response.setStatus(ResponseStatus.SUCCESS);
        response.setMessage("数据封装成功!");
        response.setData("Service 接口调用成功!");
        return response;
    }
}
