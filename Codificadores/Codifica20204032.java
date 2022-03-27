package Codificadores;

public class Codifica20204032 implements Codifica {

    @Override
    public String getNomeAutor() {
        return "Alison G. Schemitt";
    }

    @Override
    public String getMatriculaAutor() {
        return "20204032-5";
    }

    @Override
    public String codifica(String str) {//troca vogais por números
        
        str=str.replace("a", "4");
        str=str.replace("e", "3");
        str=str.replace("i", "1");
        str=str.replace("o", "0");
        str=str.replace("u", "8");

        return str;
    }

    @Override
    public String decodifica(String str) {//destroca os números pelas vogais correspondentes
        
        str=str.replace("4", "a");
        str=str.replace("3", "e");
        str=str.replace("1", "i");
        str=str.replace("0", "o");
        str=str.replace("8", "u");

        return str;
    }
    
}
