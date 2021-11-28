package model.entities;

import java.util.Date;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import model.entities.Empresa;
import model.entities.Status;
import model.entities.TipoDeServico;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2021-11-25T12:57:45", comments="EclipseLink-2.7.7.v20200504-rNA")
@StaticMetamodel(Servico.class)
public class Servico_ { 

    public static volatile SingularAttribute<Servico, Double> preco;
    public static volatile SingularAttribute<Servico, TipoDeServico> tipo;
    public static volatile SingularAttribute<Servico, Date> data;
    public static volatile SingularAttribute<Servico, Integer> Id;
    public static volatile SingularAttribute<Servico, Empresa> empresa;
    public static volatile SingularAttribute<Servico, Status> status;

}