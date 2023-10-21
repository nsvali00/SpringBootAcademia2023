package hr.kingict.springbootakademija2023_2.form;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class VegetableForm {
    @NotBlank
    @Size(min=3, message = "The name is too short")
    private String name;
    @NotBlank
    private String color;
    @NotNull
    private Boolean organic;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Boolean getOrganic() {
        return organic;
    }

    public void setOrganic(Boolean organic) {
        this.organic = organic;
    }
}
