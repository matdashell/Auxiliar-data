public class teste {
    public static void main(String[] args) {
        MultiDados var = new MultiDados();
        var.setNewList("teste");
        var.add("teste" ,"primeiraVar", "true");
        var.add("teste" ,"segundaVar", "true");
        var.add("teste" ,"terceiraVar", "true");
        var.add("teste" ,"quartaVar", "true");

        System.out.println(var.getString("teste" , "segundaVar"));
        System.out.println(var.getBoolean("teste" , "segundaVar"));

        var.setNewList("segundaLista");
        var.add("segundaLista", "idade", 23);

        System.out.println(var.getString("segundaLista" , "idade"));
        System.out.println(var.getInt("segundaLista" , "idade"));
    }
}
