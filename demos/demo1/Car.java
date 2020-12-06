package demos.demo1; // representa a estrutura de pastas onde a classe está definida

public class Car {

    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String colour;

    public void setModel(String model) {
        
        // método set pode ser utilizado para implementar validações de dados

        String validModel = model.toLowerCase();

        if (validModel.equals("carrera") || validModel.equals("comodore")) {
            this.model = model;
        } else {
            this.model = "unknown";
        }

    }

    public String getModel() {
        return this.model;
    }

}