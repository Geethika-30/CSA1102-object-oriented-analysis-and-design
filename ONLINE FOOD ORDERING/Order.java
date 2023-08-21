
import java.util.*;


/**
 * Class Order
 */
public class Order {

  //
  // Fields
  //

  private int ID;
  private String Details;
  private String OrderType;
  
  //
  // Constructors
  //
  public Order () { };
  
  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Set the value of ID
   * @param newVar the new value of ID
   */
  private void setID (int newVar) {
    ID = newVar;
  }

  /**
   * Get the value of ID
   * @return the value of ID
   */
  private int getID () {
    return ID;
  }

  /**
   * Set the value of Details
   * @param newVar the new value of Details
   */
  private void setDetails (String newVar) {
    Details = newVar;
  }

  /**
   * Get the value of Details
   * @return the value of Details
   */
  private String getDetails () {
    return Details;
  }

  /**
   * Set the value of OrderType
   * @param newVar the new value of OrderType
   */
  private void setOrderType (String newVar) {
    OrderType = newVar;
  }

  /**
   * Get the value of OrderType
   * @return the value of OrderType
   */
  private String getOrderType () {
    return OrderType;
  }

  //
  // Other methods
  //

  /**
   */
  public void ProcessDebit()
  {
  }


}
