package vitor.joao.maratonajava.javacore.Bintermediary.Jcollections.domain;

public class Smartphone {
    private String serialNumber;
    private String marca;

    public Smartphone(String serialNumber, String marca) {
        this.serialNumber = serialNumber;
        this.marca = marca;
    }

    /*
        Regras:
        Reflexivo:  x.equals(x) tem que ser true para tudo que for diferente de null.
        Simétrico:  para x e y diferntes de null, se x.equals(y) == true, logo, y.equals(x) == true
        Transitividade: para x, y, z diferentes de null, se x.equals(y) == true, e  y.equals(x) == true,
        logo, y.equals(z) == true
        Consistente:  x.equals(x) sempre retorna true se x for diferente de null.
        Para x diferente de null:    x.equals(null) tem que retornar false.
    */
    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (this == obj) return true;
        if (this.getClass() != obj.getClass()) return false;
        Smartphone smartphone = (Smartphone) obj;
        return serialNumber != null && serialNumber.equals(smartphone.serialNumber);

    }

    /*
            Regas para implementar no hashCode:
        * Se x.equals(y) == true, y.hashCode() == x.hashCode()
        * y.hashCode() == x.hashCode() não necessariamente o equals de y.equals(x) tem que ser true
        * x.equals(y) == false, o hashCode tem que ser diferente
        * y.hashCode() != x.hashCode(), x.equals(y) deverá ser false.
     */
    @Override
    public int hashCode() {
        // Quando implementamos o hashcode, ele tem que dar um match com equals.
        // O serialNumber está sendo usado para verificar se dois obj são iguais.
        // No hashCode também temos que usar o serialNumber para gerar o hashCode.
        return (serialNumber == null) ? 0 : this.serialNumber.hashCode();
    }

    @Override
    public String toString() {
        return "Smartphone{" +
                "serialNumber='" + serialNumber + '\'' +
                ", marca='" + marca + '\'' +
                '}';
    }

    public String getSerialNumber() {
        return this.serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = this.marca;
    }
}
