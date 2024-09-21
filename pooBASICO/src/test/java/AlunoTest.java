
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AlunoTest {
static  Aluno aluno = new Aluno("arthur","2");
static Atividade[] atividadesFeitas = {} ;


    @BeforeEach
    public void setUp(){
        aluno.fazerAtividade(20d);
        aluno.fazerAtividade(20d);
        aluno.fazerAtividade(20d);
        aluno.fazerAtividade(20d);
        aluno.fazerAtividade(20d);
        aluno.somarNotas();

    }
    @Test
    public void PassoudeAno(){
        assertTrue(aluno.podeAprovar());
    }

}
