package controls;

import org.openqa.selenium.By;

public class CheckBox extends Control {

    public CheckBox(By locator) {
        super(locator);
    }

    // Método para seleccionar el checkbox (si no está seleccionado)
    public void select() {
        this.findControl();
        if (!this.control.isSelected()) {
            this.control.click();
        }
    }

    // Método para deseleccionar el checkbox (si está seleccionado)
    public void deselect() {
        this.findControl();
        if (this.control.isSelected()) {
            this.control.click();
        }
    }

    // Método para verificar si el checkbox está seleccionado
    public boolean isSelected() {
        this.findControl();
        return this.control.isSelected();
    }

    // Método para cambiar el estado del checkbox
    public void toggle() {
        this.findControl();
        this.control.click();
    }
}
