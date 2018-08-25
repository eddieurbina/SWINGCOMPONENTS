package student;

import java.util.ArrayList;
import javax.swing.AbstractListModel; 

public class ModelListModificado extends AbstractListModel {
    private ArrayList<Student> lista = new ArrayList<>();

    @Override
    public int getSize() {
        return lista.size();
    }

    @Override
    public Object getElementAt(int index) {
        Student student = this.lista.get(index);
        return student.getName(); 
    }
    
    public void addAlumno(Student p){
        lista.add(p);
        this.fireIntervalAdded(this, getSize(), getSize() + 1); 
    }
    
    public void eliminarAlumno(int index0) {
        lista.remove(index0);
        this.fireIntervalRemoved(index0, getSize(), getSize() + 1);
    }
    
    public Student getStudent(int index){
        return lista.get(index); 
    }
}
