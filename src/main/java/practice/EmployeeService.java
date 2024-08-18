package practice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class EmployeeService {

    //service: bazi mantiksal islemler burada yapilabilir

    //reponun save methodunu kullanmak icin bir repo objesi gerekli

    //public practice.EmployeeRepo repo = new practice.EmployeeRepo(); //maliyetli, siki  bagli
    //public practice.PersonelRepo repo=new practice.PersonelRepo();

    @Autowired
    @Qualifier("personelRepo")
    public Repo repo;


    //public EmployeeService(Repo repo) {
    //    this.repo = repo;
    //}


    public void saveEmployee(Employee employee) {
        System.out.println("practice.Employee is saving...");
        repo.save(employee);
    }
}
