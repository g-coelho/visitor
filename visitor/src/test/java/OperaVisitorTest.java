import org.example.Buffa;
import org.example.Comique;
import org.example.OperaVisitor;
import org.example.Verismo;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class OperaVisitorTest {

    @Test
    public void deveExibirBuffa(){
        Buffa buffa = new Buffa("Le nozze di Figaro", "Mozart", "Italiano", 11);
        OperaVisitor visitor = new OperaVisitor();
        assertEquals("Buffa{Titulo: Le nozze di Figaro, Autor: 'Mozart', Idioma: Italiano, Papeis: 11}", visitor.exibirBuffa(buffa));
    }

    @Test
    public void deveExibirComique(){
        Comique comique = new Comique("Les pêcheurs de perles", "Georges Bizet", "Francês", 4);
        OperaVisitor visitor = new OperaVisitor();
        assertEquals("Comique{Titulo: Les pêcheurs de perles, Autor: 'Georges Bizet', Idioma: Francês, Papeis: 4}", visitor.exibirComique(comique));
    }

    @Test
    public void deveExibirVerismo(){
        Verismo verismo = new Verismo("Tosca", "Giacomo Puccini", "Italiano", 9);
        OperaVisitor visitor = new OperaVisitor();
        assertEquals("Verismo{Titulo: Tosca, Autor: 'Giacomo Puccini', Idioma: Italiano, Papeis: 9}", visitor.exibirVerismo(verismo));
    }



}
