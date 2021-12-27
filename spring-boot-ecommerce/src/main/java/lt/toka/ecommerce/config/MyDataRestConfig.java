package lt.toka.ecommerce.config;

import org.springframework.data.rest.core.mapping.ConfigurableHttpMethods;
import org.springframework.data.rest.core.mapping.ResourceMetadata;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import javax.persistence.metamodel.EntityType;
import java.util.ArrayList;
import lt.toka.ecommerce.entity.ProductCategory;
import lt.toka.ecommerce.entity.Product;
import org.springframework.http.HttpMethod;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import javax.persistence.EntityManager;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;

@Configuration
public class MyDataRestConfig implements RepositoryRestConfigurer
{
    private EntityManager entityManager;
    
    @Autowired
    public MyDataRestConfig(final EntityManager theEntityManager) {
        this.entityManager = theEntityManager;
    }
    
    public void configureRepositoryRestConfiguration(final RepositoryRestConfiguration config, final CorsRegistry cors) {
        final HttpMethod[] theUnsupportedActions = { HttpMethod.PUT, HttpMethod.POST, HttpMethod.DELETE };
        config.getExposureConfiguration().forDomainType((Class)Product.class).withItemExposure((metdata, httpMethods) -> httpMethods.disable(theUnsupportedActions)).withCollectionExposure((metdata, httpMethods) -> httpMethods.disable(theUnsupportedActions));
        config.getExposureConfiguration().forDomainType((Class)ProductCategory.class).withItemExposure((metdata, httpMethods) -> httpMethods.disable(theUnsupportedActions)).withCollectionExposure((metdata, httpMethods) -> httpMethods.disable(theUnsupportedActions));
        this.exposeIds(config);
    }
    
    private void exposeIds(final RepositoryRestConfiguration config) {
        final Set<EntityType<?>> entities = (Set<EntityType<?>>)this.entityManager.getMetamodel().getEntities();
        final List<Class> entityClasses = new ArrayList<Class>();
        for (final EntityType tempEntityType : entities) {
            entityClasses.add(tempEntityType.getJavaType());
        }
        final Class[] domainTypes = entityClasses.toArray(new Class[0]);
        config.exposeIdsFor(domainTypes);
    }
}