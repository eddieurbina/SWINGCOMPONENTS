package student;

import javax.swing.DefaultComboBoxModel;

public class loadAge {
    String name = "";
    String lastName = "";
    int age; 
    public DefaultComboBoxModel loadingAge(int min, int max) {
            DefaultComboBoxModel model = new DefaultComboBoxModel();
            String edades[] = null;
            for(int i = min; i < max; i++){
                model.addElement(String.valueOf(i));
            }
            return model; 
    }
}
