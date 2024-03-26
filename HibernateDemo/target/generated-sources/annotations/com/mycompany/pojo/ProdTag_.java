package com.mycompany.pojo;

import com.mycompany.pojo.Product;
import com.mycompany.pojo.Tag;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2024-03-26T16:05:42", comments="EclipseLink-2.7.9.v20210604-rNA")
@StaticMetamodel(ProdTag.class)
public class ProdTag_ { 

    public static volatile SingularAttribute<ProdTag, Product> productId;
    public static volatile SingularAttribute<ProdTag, Tag> tagId;
    public static volatile SingularAttribute<ProdTag, Integer> id;

}