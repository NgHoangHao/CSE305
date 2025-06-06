import java.util.List;
import java.util.ArrayList;


class OwnerInfo {
    private  String ownerName;
    private  String location;

    public OwnerInfo(String ownerName, String location) {
        this.ownerName = ownerName;
        this.location = location;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public String getLocation() {
        return location;
    }

    @Override
    public String toString() {
        return "Owner: " + ownerName + "\nLocation: " + location;
    }
}



