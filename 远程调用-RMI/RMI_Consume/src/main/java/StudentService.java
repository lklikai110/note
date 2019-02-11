import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

/**
 * @author likai
 * @date 2019/1/31 17:14
 */
public interface StudentService {
    List<Student> getStudents();
}
