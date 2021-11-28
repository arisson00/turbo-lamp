package model.entities;

import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import model.entities.Empresa;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2021-11-25T12:57:45", comments="EclipseLink-2.7.7.v20200504-rNA")
@StaticMetamodel(Telefone.class)
public class Telefone_ { 

    public static volatile SingularAttribute<Telefone, String> numero;
    public static volatile SingularAttribute<Telefone, String> ddd;
    public static volatile SingularAttribute<Telefone, Integer> Id;
    public static volatile SingularAttribute<Telefone, Empresa> empresa;

}