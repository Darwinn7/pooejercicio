public class docente extends persona{
    public  int IdTrabajador;
    public  double salario;
    public String departamento;

    public int getIdTrabajador() {
        return IdTrabajador;
    }

    public void setIdTrabajador(int idTrabajador) {
        IdTrabajador = idTrabajador;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    @Override
    public void mostrarDatos(String nombre, int edad, String sexo) {
        System.out.println("ingrese el nombre del docente:" + nombre + "ingrese edad del docente" + edad +
                "ingrese sexo del docente" + sexo);
    }

    public void datosDocente(int IdTrabajdor,double salario,String departamento){
        System.out.println("ingrese el IdTrabajador" + IdTrabajdor + "ingrese el salario del docente" + salario +
                "ingrese el departamento del docente" + departamento);
    }
}
