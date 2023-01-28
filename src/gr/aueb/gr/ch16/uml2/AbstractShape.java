package gr.aueb.gr.ch16.uml2;

public abstract class AbstractShape implements IShape {
    private long id;

    @Override
    public Long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
