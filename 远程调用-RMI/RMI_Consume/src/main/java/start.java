import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

/**
 * @author likai
 * @date 2019/1/31 17:23
 */
public class start {
    public static void main(String[] args) {
        try {
            StudentService studentService = (StudentService) Naming.lookup("rmi://127.0.0.1:9005/StudentService");
            List<Student> students = studentService.getStudents();
            for (Student s : students) {
                System.out.println(s);
            }
        } catch (NotBoundException e) {
            e.printStackTrace();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }
}
