package foo.bar.Model.Util;

import java.io.Serializable;

/**
 * Created by ewrfcas on 2015/12/8.
 */

@SuppressWarnings("all")
public class Response<T> implements Serializable {
    //返回状态
    private ResponseStatus status;
    //返回信息
    private String message;
    //返回数据
    private T data;

//    public void setStatus(ResponseStatus status)
//    {
//        this.status=status;
//    }

    public Response() {
    }

    public Response(ResponseStatus status, String message) {
        this.status = status;
        this.message = message;
    }

    public Response(ResponseStatus status, String message, T data) {
        this.status = status;
        this.message = message;
        this.data = data;
    }

    public boolean isSuccess(){
        return ResponseStatus.SUCCESS.equals(status);
    }

    public ResponseStatus getStatus() {
        return this.status;
    }

    public String getMessage() {
        return this.message;
    }

    public T getData() {
        return this.data;
    }

    public void setStatus(ResponseStatus status) {
        this.status = status;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setData(T data) {
        this.data = data;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof Response)) return false;
        final Response other = (Response) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$status = this.status;
        final Object other$status = other.status;
        if (this$status == null ? other$status != null : !this$status.equals(other$status)) return false;
        final Object this$message = this.message;
        final Object other$message = other.message;
        if (this$message == null ? other$message != null : !this$message.equals(other$message)) return false;
        final Object this$data = this.data;
        final Object other$data = other.data;
        if (this$data == null ? other$data != null : !this$data.equals(other$data)) return false;
        return true;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $status = this.status;
        result = result * PRIME + ($status == null ? 0 : $status.hashCode());
        final Object $message = this.message;
        result = result * PRIME + ($message == null ? 0 : $message.hashCode());
        final Object $data = this.data;
        result = result * PRIME + ($data == null ? 0 : $data.hashCode());
        return result;
    }

    protected boolean canEqual(Object other) {
        return other instanceof Response;
    }

    public String toString() {
        return "foo.bar.Model.Util.Response(status=" + this.status + ", message=" + this.message + ", data=" + this.data + ")";
    }
}
