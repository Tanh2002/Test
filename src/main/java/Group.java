import java.sql.Date;

public class Group {
    int groupID;
    String groupName;
    Account creatorID;
    Date createDate;

    @Override
    public String toString() {
        return "Group{" +
                "groupID=" + groupID +
                ", groupName='" + groupName + '\'' +
                ", creatorID=" + creatorID +
                ", createDate=" + createDate +
                '}';
    }
}
