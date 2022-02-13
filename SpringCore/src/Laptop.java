import java.util.Objects;

public class Laptop {
    private Integer lid;
    private String hdd, ram, processor;

    public Laptop(Integer lid, String hdd, String ram, String processor) {
        this.lid = lid;
        this.hdd = hdd;
        this.ram = ram;
        this.processor = processor;
    }

    public Laptop() {
    }

    public Integer getLid() {
        return lid;
    }

    public void setLid(Integer lid) {
        this.lid = lid;
    }

    public String getHdd() {
        return hdd;
    }

    public void setHdd(String hdd) {
        this.hdd = hdd;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Laptop laptop = (Laptop) o;
        return Objects.equals(lid, laptop.lid) && Objects.equals(hdd, laptop.hdd) && Objects.equals(ram, laptop.ram) && Objects.equals(processor, laptop.processor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(lid, hdd, ram, processor);
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "lid=" + lid +
                ", hdd='" + hdd + '\'' +
                ", ram='" + ram + '\'' +
                ", processor='" + processor + '\'' +
                '}';
    }
}
