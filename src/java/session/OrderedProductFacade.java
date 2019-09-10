

package session;

import entity.OrderedProduct;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Szczominik
 */
@Stateless
public class OrderedProductFacade extends AbstractFacade<OrderedProduct> {
    @PersistenceContext(unitName = "DakakeenPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public OrderedProductFacade() {
        super(OrderedProduct.class);
    }
    
   }
   

