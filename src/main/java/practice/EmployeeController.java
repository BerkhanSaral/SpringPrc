package practice;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class EmployeeController {
    public static void main(String[] args) {
        //kullanicidan alinan bilgilerle employee olusturalim

        Employee employee = new Employee(1, "Jack Sparrow");

        //employee i kaydetmeden once belki mantiksal islemler gerekli
        //service in kaydetme methodunu kullanicaz
        //service objesine ihtiyac var

        //practice.EmployeeService service=new practice.EmployeeService();//siki sikiya bir bagli,
        //service.saveEmployee(employee);

        //practice.Repo repo = new practice.EmployeeRepo();
        //practice.EmployeeService service = new practice.EmployeeService(repo);//dependency  injection
        //service.saveEmployee(employee);

        //1-service/repo objelerini kendimiz olusturduk --> Spring objeleri olusturulunca : Bean
        //2-DI (dependency  injection) kendimiz yaptik : constructor ile --> Spring tarafindan otomatik yapilir

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        EmployeeService service = context.getBean(EmployeeService.class);

        service.saveEmployee(employee);
        //biz
        // service icin obje uretmedik
        // repo icin obje uretmedik
        // DI yapmadik


    }
}
