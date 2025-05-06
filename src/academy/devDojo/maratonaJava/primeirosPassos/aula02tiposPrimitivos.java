package academy.devDojo.maratonaJava.primeirosPassos;

public class aula02tiposPrimitivos {
    public static void main(String[] args) {
        //int,double,float,char,byte,short,long,boolean
        // tipos primitivos sao todos escritos em minusculo
        int idade = 22;
        double salario = 2000;
        long numerosGrandes = 1000000;
        float salariofloat =2000;
        byte numerosPequenos = 127;
        //unicode e tabela ASCII
        char caracteres = '\u0238';
        char caractere = '\u0416';
        short idadeShort = 10;
        //ola em japones
        char primeira = '\u3053';
        char seg = '\u3093';
        char ter= '\u306B';
        char quar = '\u3061';
        char quin = '\u306F';
        //mundo em japones
        char sexto = '\u4E16';
        char setimo = '\u754C';
        boolean verdadeiro = true;
        System.out.println("a idade e "+idade+" ");
        System.out.println(caracteres+ " " + caractere);
        // ola mundo em japones deve ter uma maneira mais facil
        System.out.println(primeira+""+seg+""+ter+""+quar+""+quin+""+sexto+""+setimo);

        //casting = forcar um tipo em outro
        int longNoint= (int)100000000000l;
        System.out.println(longNoint);
        var nome2 = "guilherme";

    }
}

