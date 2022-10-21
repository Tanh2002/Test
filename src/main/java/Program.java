import java.sql.Date;
import java.time.LocalDate;

public class Program {
    public static void main(String[] args) {
        // Tạo Department
        Department dep1 = new Department();
        dep1.departmentID = 1;
        dep1.departmentName = "Marketing";

        Department dep2 = new Department();
        dep2.departmentID = 2;
        dep2.departmentName = "Sale";

        Department dep3 = new Department();
        dep3.departmentID = 3;
        dep3.departmentName = "BOD";

        // Tạo Position
        Position pos1 = new Position();
        pos1.positionID = 1;
        pos1.name = Position.positionName.Dev;

        Position pos2 = new Position();
        pos2.positionID = 2;
        pos2.name = Position.positionName.PM;

        Position pos3 = new Position();
        pos3.positionID = 3;
        pos3.name = Position.positionName.Scrum_Master;

        Position pos4 = new Position();
        pos4.positionID = 4;
        pos4.name = Position.positionName.Test;

        // Tạo Group
        Group group1 = new Group();
        group1.groupID = 1;
        group1.groupName = "G1";

        Group group2 = new Group();
        group2.groupID = 2;
        group2.groupName = "G2";

        Group group3 = new Group();
        group3.groupID = 3;
        group3.groupName = "G3";

        // Tạo Account
        Account acc1 = new Account();
        acc1.accountID = 1;
        acc1.email = "a@gmail.com";
        acc1.userName = "aaa";
        acc1.fullName = "Anh Anh Anh";
        acc1.departmentID = dep1;
        acc1.positionID = pos1;
        acc1.createDate = Date.valueOf(LocalDate.now());
        Group[] groupAcc1 = { group1, group2 };
        acc1.groups = groupAcc1;

        Account acc2 = new Account();
        acc2.accountID = 2;
        acc2.email = "b@gmail.com";
        acc2.userName = "bbb";
        acc2.fullName = "Bao Bao Bao";
        acc2.departmentID = dep2;
        acc2.positionID = pos2;
        acc2.createDate = Date.valueOf(LocalDate.of(2021, 03, 17));
        acc2.groups = new Group[] { group3, group2 };

        Account acc3 = new Account();
        acc3.accountID = 3;
        acc3.email = "c@gmail.com";
        acc3.userName = "ccc";
        acc3.fullName = "Cao Cao Cao";
        acc3.departmentID = dep3;
        acc3.positionID = pos3;
        acc3.createDate = Date.valueOf(LocalDate.now());

        System.out.println(acc1);
    }
}
