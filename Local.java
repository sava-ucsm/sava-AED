public class Local {
    private Direccion direccion;
    private String nombre;
    private Inventario almacen;
    private  ListLinked<PersonalSalud> personal;

    public Local(Direccion d,String nombre){
        this.direccion = d;
        this.nombre = nombre;
        this.almacen = new Inventario();
        this.personal = new OderListLinked<PersonalSalud>();
    }
    public void agregarPersonal(PersonalSalud p){

        personal.insertLast(p);
    }

    public void eliminarPersonal(int codigo){
        PersonalSalud p = findByCode(codigo);
        if(p != null)
            personal.remove(p);
        else
            System.out.println("Personal not found...");
    }
    public void mostrarPersonal(){
        System.out.println(personal);
    }
    public Inventario getInventario(){
        return this.almacen;
    }
    public String getNombre(){
        return this.nombre;
    }
    public Direccion getDireccion(){
        return this.direccion;
    }
    public PersonalSalud getPersonal(int codigo){
        PersonalSalud p = findByCode(codigo);
        System.out.println(this.personal.search(p));
        return null;
    }
    private PersonalSalud findByCode(int codigo){
        Node<PersonalSalud> aux = personal.getFirst();
        for(;aux != null;aux = aux.getNext())
            if(aux.getData().getIdPersonal()==codigo)
                return aux.getData();
        return null;
    }
    public  int getPersonalTotal() {
        return personal.getCount();
    }
    public int validarPersonal(PersonalSalud p){
            return personal.search(p);
    }
}
