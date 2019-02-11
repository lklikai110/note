import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.List;

/**
 * @author likai
 * @date 2019/1/31 17:16
 * 实际被远程调用的类
 */
public class StudentServiceImpl extends UnicastRemoteObject implements StudentService {
    protected StudentServiceImpl() throws RemoteException {
    }

    @Override
    public List<Student> getStudents() throws RemoteException {
        List<Student> list = new ArrayList<>();
        list.add(new Student("张三",10));
        list.add(new Student("李四",30));
        return list;
    }
}
