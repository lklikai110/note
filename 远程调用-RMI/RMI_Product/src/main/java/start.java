import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

/**
 * @author likai
 * @date 2019/1/31 17:19
 */
public class start {
    public static void main(String[] args) {
        try {



            StudentServiceImpl studentService = new StudentServiceImpl();
            LocateRegistry.createRegistry(9005);
            Naming.rebind("rmi://127.0.0.1:9005/StudentService", studentService);
            System.out.println("开始提供服务...");
        } catch (RemoteException e) {
            System.out.println("出错啦！！！！！！！！！！");
            e.printStackTrace();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }
}
