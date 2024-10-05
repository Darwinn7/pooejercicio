public class estudiante extends persona{
    public int matricula;
    public double promedio;
    public  String licenciatura;

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }

    public String getLicenciatura() {
        return licenciatura;
    }

    public void setLicenciatura(String licenciatura) {
        this.licenciatura = licenciatura;
    }

    @Override
    public void mostrarDatos(String nombre, int edad, String sexo) {
        System.out.println("ingrese el nombre del estudiante:" + nombre + "ingrese edad del estudiante" + edad +
                "ingrese sexo del estudiante" + sexo);
    }


        public void datosDeAlumno(int matricula, double promedio, String licenciatura){
            System.out.println("ingrese matricula del estudiante " + matricula + "ingrese el promedio del estudiante " + promedio +
                    "ingrese la licenciatura del estudiante " + licenciatura);

        }

    }
