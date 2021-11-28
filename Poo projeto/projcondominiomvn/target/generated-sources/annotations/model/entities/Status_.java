package model.entities;

import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import model.entities.Servico;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2021-11-25T12:57:45", comments="EclipseLink-2.7.7.v20200504-rNA")
@StaticMetamodel(Status.class)
public class Status_ { 

    public static volatile SingularAttribute<Status, Integer> Id;
    public static volatile SingularAttribute<Status, Servico> servico;
    public static volatile SingularAttribute<Status, String> status;

}