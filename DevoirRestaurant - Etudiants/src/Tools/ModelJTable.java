package Tools;

import Entities.Carte;
import Entities.Menu;
import Entities.Plat;

import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;

public class ModelJTable extends AbstractTableModel
{
    private String[] entete;
    private Object[][] lignes;

    @Override
    public int getRowCount() {
        return lignes.length;
    }

    @Override
    public int getColumnCount() {
        return entete.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        return lignes[rowIndex][columnIndex];
    }

    @Override
    public String getColumnName(int column) {
        return entete[column];
    }


    // A compléter ici

    public void LoadDataCartes(ArrayList<Carte> desCartes)
    {
        entete = new String[]{"Numéro","Carte"};
        lignes = new Object[desCartes.size()][2];
        int i = 0;

        for(Carte crt : desCartes)
        {
            lignes[i][0] = crt.getIdCarte();
            lignes[i][1] = crt.getNomCarte();
            i++;
        }
        fireTableChanged(null);
    }

    public void LoadDataMenus(ArrayList<Menu> desMenus)
    {
        entete = new String[]{"Numéro","Menu"};
        lignes = new Object[desMenus.size()][2];
        int i = 0;

        for(Menu mnu : desMenus)
        {
            lignes[i][0] = mnu.getIdMenu();
            lignes[i][1] = mnu.getNomMenu();
            i++;
        }
        fireTableChanged(null);
    }

    public void LoadDataPlats(ArrayList<Plat> desPlats) {
        entete = new String[]{"Numéro","Plat","Note"};
        lignes = new Object[desPlats.size()][3];
        int i = 0;

        for (Plat plt : desPlats) {
            lignes[i][0] = plt.getIdPlat();
            lignes[i][1] = plt.getNomPlat();
            lignes[i][2] = plt.getNotePlat();
            i++;
        }
        fireTableChanged(null);
    }




}
