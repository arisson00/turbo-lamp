package model.entities;

import javax.annotation.processing.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import model.entities.Servico;
import model.entities.Telefone;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2021-11-25T12:57:45", comments="EclipseLink-2.7.7.v20200504-rNA")
@StaticMetamodel(Empresa.class)
public class Empresa_ { 

    public static volatile SingularAttribute<Empresa, String> nome;
    public static volatile SingularAttribute<Empresa, Integer> Id;
    public static volatile SingularAttribute<Empresa, String> cnpj;
    public static volatile SingularAttribute<Empresa, Servico> servico;
    public static volatile ListAttribute<Empresa, Telefone> telefones;

}