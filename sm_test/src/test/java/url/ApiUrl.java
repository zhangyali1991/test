package url;

import static url.BaseUrl.baseUrl;

public class ApiUrl {
    public static final String addUrl = baseUrl + "v2/addUser";
    public static final String findById_Url = baseUrl + "v2/findUserById";
    public static final String editUser_Url = baseUrl + "v2/editUser";
    public static final String findUser_Url = baseUrl + "v2/findUser";
    public static final String findUserJsonArray_Url = baseUrl + "v2/findUser_JSONArray_toJSONString";
    public static final String findUserJson_Url = baseUrl + "v2/findUser_JSON_toJSONString";
    public static final String removeUser_Url = baseUrl + "v2/removeUser";
    public static final String removeUserById_Url = baseUrl + "v2/removeUserById";


}
