 abstract class persona {
    public String nombre;
    public int edad;
    public String sexo;

     public String getNombre() {
         return nombre;
     }

     public void setNombre(String nombre) {
         this.nombre = nombre;
     }

     public int getEdad() {
         return edad;
     }

     public void setEdad(int edad) {
         this.edad = edad;
     }

     public String getSexo() {
         return sexo;
     }

     public void setSexo(String sexo) {
         this.sexo = sexo;
     }

     public abstract void mostrarDatos(String nombre,int edad,String sexo);

 }
