package Shop;

public class Customer {
    private Membership membership;
    private int id;
    private String name;

    public Customer(Membership membership, int id, String name) {
        this.membership = membership;
        this.id = id;
        this.name = name;
    }

    public Membership getMembership() {
        return membership;
    }

    public void setMembership(Membership membership) {
        this.membership = membership;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
