package utbm.ia54.ant2dgrid.events;

import io.sarl.lang.annotation.SarlElementType;
import io.sarl.lang.annotation.SarlSpecification;
import io.sarl.lang.annotation.SyntheticMember;
import io.sarl.lang.core.Address;
import io.sarl.lang.core.Event;

@SarlSpecification("0.6")
@SarlElementType(14)
@SuppressWarnings("all")
public class Continue extends Event {
  @SyntheticMember
  public Continue() {
    super();
  }
  
  @SyntheticMember
  public Continue(final Address source) {
    super(source);
  }
}
