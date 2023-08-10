package application;

import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		System.out.println("=== TEST 1: findById =======");
		Department dep = departmentDao.findById(1);
		System.out.println(dep);
		
		System.out.println("=== TEST 2: DeleteById =======");
		System.out.print("Enter id for delete test: ");
		int id = sc.nextInt();
		departmentDao.deleteById(id);
		System.out.println("Delete completed");
		
		/*System.out.println("=== TEST 3: UpdateById =======");
		System.out.print("Enter name for update test: ");
		String name = sc.nextLine();
		
		System.out.print("Enter id for update test: ");
		int id = sc.nextInt();
		
		Department dep2 = departmentDao.findById(id);
		dep2.setName(name);
		departmentDao.update(dep2);
		System.out.println("Update completed");*/
		
		/*System.out.println("\n=== TEST 4: findAll =======");
		List<Department> list = departmentDao.findAll();
		for (Department deps : list) {
			System.out.println(deps);
		}*/
		
		/*Department newDepartment = new Department(null, "Music");
		departmentDao.insert(newDepartment);
		System.out.println("Inserted! New id: " + newDepartment.getId());*/

		sc.close();
	}

}
