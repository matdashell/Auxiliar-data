import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MultiDados {

    private Map<String, List<String>> nameList = new HashMap<>();

    public void setNewList(String nameList){
        if (this.nameList.containsKey(nameList)) {
            throw new IllegalArgumentException(String.format("lista % já existe", nameList.toUpperCase()));
        }

        this.nameList.put(nameList, new ArrayList<>());
    }

    public void add(String nameList ,String var, String dados){
        if(!this.nameList.containsKey(nameList)){
            throw new NullPointerException(String.format("lista % não existe",nameList.toUpperCase()));
        }

        this.nameList.get(nameList).add(String.format("%s %s",var,dados));
    }

    public void add(String nameList ,String var, int dados){
        if(!this.nameList.containsKey(nameList)){
            throw new NullPointerException(String.format("lista % não existe",nameList.toUpperCase()));
        }

        this.nameList.get(nameList).add(String.format("%s %s",var,String.valueOf(dados)));
    }

    public void add(String nameList ,String var, double dados){
        if(!this.nameList.containsKey(nameList)){
            throw new NullPointerException(String.format("lista % não existe",nameList.toUpperCase()));
        }

        this.nameList.get(nameList).add(String.format("%s %s",var,String.valueOf(dados)));
    }

    public void add(String nameList ,String var, boolean dados){
        if(!this.nameList.containsKey(nameList)){
            throw new NullPointerException(String.format("lista % não existe",nameList.toUpperCase()));
        }

        this.nameList.get(nameList).add(String.format("%s %s",var,String.valueOf(dados)));
    }



    public String getString(String nameList, String var){
        if(!this.nameList.containsKey(nameList)){
            throw new NullPointerException(String.format("lista % não existe",nameList.toUpperCase()));
        }

        for(String dados : this.nameList.get(nameList)){
            if(dados.startsWith(var)){
                return dados.substring(var.length(), dados.length()).trim();
            }
        }

        throw new NullPointerException(String.format("var %s não existe", var));
    }

    public int getInt(String nameList, String var){
        if(!this.nameList.containsKey(nameList)){
            throw new NullPointerException(String.format("lista % não existe",nameList.toUpperCase()));
        }

        for(String dados : this.nameList.get(nameList)){
            if(dados.startsWith(var)){
                return Integer.parseInt(dados.substring(var.length(), dados.length()).trim());
            }
        }

        throw new NullPointerException(String.format("var %s não existe", var));
    }

    public boolean getBoolean(String nameList, String var){
        if(!this.nameList.containsKey(nameList)){
            throw new NullPointerException(String.format("lista % não existe",nameList.toUpperCase()));
        }

        for(String dados : this.nameList.get(nameList)){
            if(dados.startsWith(var)){
                return Boolean.parseBoolean(dados.substring(var.length(), dados.length()).trim().toLowerCase());
            }
        }

        throw new NullPointerException(String.format("var %s não existe", var));
    }

    public double getDouble(String nameList, String var){
        if(!this.nameList.containsKey(nameList)){
            throw new NullPointerException(String.format("lista % não existe",nameList.toUpperCase()));
        }

        for(String dados : this.nameList.get(nameList)){
            if(dados.startsWith(var)){
                return Double.valueOf(dados.substring(var.length(), dados.length()).trim());
            }
        }

        throw new NullPointerException(String.format("var %s não existe", var));
    }

    public List<String> gerVars(String nameList){
        List<String> retorno = new ArrayList<>();
        for(String s : this.nameList.get(nameList)){
            retorno.add(s.split(" ")[0]);
        }
        return retorno;
    }
}
