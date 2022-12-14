package Convenience_Store.Products_And_Services;


import Convenience_Store.StaffsAndCustomer.Applicant;
import Convenience_Store.UserRoles.UserRole;

public class ManagerServicesImpl implements ManagerServices {
    public String hire(Applicant applicant) {
        if (applicant.getAges() > 17) {
            applicant.setRole(UserRole.CASHIER);
            return "Congratulations "+applicant.getFirstName() +" "+applicant.getLastName()+" your application is " +
                    "successful. You are now our "+ applicant.getRole();
        } else {
            return applicant.getFirstName() +" "+applicant.getLastName()+" Sorry,You are too young for the job";
        }
    }
}
