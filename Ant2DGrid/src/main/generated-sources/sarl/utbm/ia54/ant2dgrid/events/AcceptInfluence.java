package utbm.ia54.ant2dgrid.events;

import io.sarl.lang.annotation.SarlElementType;
import io.sarl.lang.annotation.SarlSpecification;
import io.sarl.lang.annotation.SyntheticMember;
import io.sarl.lang.core.Event;
import org.eclipse.xtext.xbase.lib.Pure;
import utbm.ia54.ant2dgrid.Enum.Direction;

@SarlSpecification("0.6")
@SarlElementType(14)
@SuppressWarnings("all")
public class AcceptInfluence extends Event {
  public Direction direction;
  
  public boolean accept;
  
  public AcceptInfluence(final Direction direction, final boolean accept) {
    this.direction = direction;
    this.accept = accept;
  }
  
  @Override
  @Pure
  @SyntheticMember
  public boolean equals(final Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    AcceptInfluence other = (AcceptInfluence) obj;
    if (other.accept != this.accept)
      return false;
    return super.equals(obj);
  }
  
  @Override
  @Pure
  @SyntheticMember
  public int hashCode() {
    int result = super.hashCode();
    final int prime = 31;
    result = prime * result + (this.accept ? 1231 : 1237);
    return result;
  }
  
  /**
   * Returns a String representation of the AcceptInfluence event's attributes only.
   */
  @SyntheticMember
  @Pure
  protected String attributesToString() {
    StringBuilder result = new StringBuilder(super.attributesToString());
    result.append("direction  = ").append(this.direction);
    result.append("accept  = ").append(this.accept);
    return result.toString();
  }
  
  @SyntheticMember
  private final static long serialVersionUID = -1650076814L;
}