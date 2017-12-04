package utbm.ia54.ant2dgrid.Enum;

import io.sarl.lang.annotation.SarlElementType;
import io.sarl.lang.annotation.SarlSpecification;

/**
 * @author Michel
 */
@SarlSpecification("0.6")
@SarlElementType(11)
@SuppressWarnings("all")
public enum CellState {
  WALL,
  
  HOME,
  
  FOOD,
  
  NORMAL;
}
