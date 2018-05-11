package Default;

import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils.IO;

import static javafx.scene.input.KeyCode.H;

public class UserTest {
    public <T> T invoke(Class<T> clz,Map map)
        throws IllegalAccessException, InstantiationException, InvocationTargetException, NoSuchMethodException {
        Class clazz = clz;
        Object targetObj = clz.newInstance();
        Field[] fields = clazz.getDeclaredFields();
        for(Field f : fields){
            try {
                Method method = clazz.getDeclaredMethod(getMethodName(f.getName()),new Class[]{map.get(f.getName()).getClass()});
                method.invoke(targetObj,map.get(f.getName()));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return (T)targetObj;
    }

    private String getMethodName(String name){
        String s = name.substring(0,1).toUpperCase()+name.substring(1);
        return "set"+s;
    }

    public static void main(String[] args)
        throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
       /* Map map = new HashMap();
        map.put("name","xiaoming");
        map.put("age",9);
        map.put("birthday",Long.valueOf(new Date().getTime()));
        map.put("id",1);
        //System.out.println((map.get("id").getClass()));
        Default.User u = new Default.UserTest().invoke(Default.User.class,map);
        System.out.println(u.getId());*/
       int i = 1;
       Integer b = 2;
       System.out.println(b.compareTo(i));
    }
}
