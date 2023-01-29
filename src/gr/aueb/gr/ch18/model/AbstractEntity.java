package gr.aueb.gr.ch18.model;

public abstract class AbstractEntity implements IdentifiableEntity {

    private Long id;

    @Override
    public Long getId() {
        return null;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
