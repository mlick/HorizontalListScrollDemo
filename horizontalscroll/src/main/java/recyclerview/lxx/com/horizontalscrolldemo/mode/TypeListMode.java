package recyclerview.lxx.com.horizontalscrolldemo.mode;

import java.util.ArrayList;

/**
 * Created by lixiangxin on 2016-03-03.
 */
public class TypeListMode {
    /**
     * type : response
     * id : 10
     * hash : a4e156df5a0cb7afffb169f7fcd60e5a
     * method : BuickPhoto.GetBuickPhotoTypeList
     * request_id : 10
     * error_code : 0
     * error_message : OK
     * type_list : [{"buick_photo_type":"爱车","sequences":1},{"buick_photo_type":"自驾","sequences":2},{"buick_photo_type":"改装","sequences":3},{"buick_photo_type":"大阅兵","sequences":4}]
     */

    private String type;
    private int id;
    private String hash;
    private String method;
    private int request_id;
    private int error_code;
    private String error_message;
    private ArrayList<TypeListEntity> type_list;

    public void setType(String type) {
        this.type = type;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setHash(String hash) {
        this.hash = hash;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public void setRequest_id(int request_id) {
        this.request_id = request_id;
    }

    public void setError_code(int error_code) {
        this.error_code = error_code;
    }

    public void setError_message(String error_message) {
        this.error_message = error_message;
    }

    public void setType_list(ArrayList<TypeListEntity> type_list) {
        this.type_list = type_list;
    }

    public String getType() {
        return type;
    }

    public int getId() {
        return id;
    }

    public String getHash() {
        return hash;
    }

    public String getMethod() {
        return method;
    }

    public int getRequest_id() {
        return request_id;
    }

    public int getError_code() {
        return error_code;
    }

    public String getError_message() {
        return error_message;
    }

    public ArrayList<TypeListEntity> getType_list() {
        return type_list;
    }


}
