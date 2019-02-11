import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

/**
 * @author likai
 * @date 2019/1/31 17:14
 * 远程代理类
 */
public interface StudentService extends Remote {
    List<Student> getStudents() throws RemoteException;
}
