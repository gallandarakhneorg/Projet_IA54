package utbm.ia54.ant2dgrid.gui.fx;

import io.sarl.lang.annotation.SarlElementType;
import io.sarl.lang.annotation.SarlSpecification;
import io.sarl.lang.annotation.SyntheticMember;
import io.sarl.util.OpenEventSpace;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import org.eclipse.xtext.xbase.lib.Exceptions;
import utbm.ia54.ant2dgrid.gui.fx.FxViewerController;

/**
 * Abstract implementation of a JavaFX application.
 */
@SarlSpecification("0.6")
@SarlElementType(9)
@SuppressWarnings("all")
public abstract class FxApplication extends Application {
  /**
   * The JavaFX loader.
   */
  private FXMLLoader loader;
  
  public final void start(final Stage stage) {
    OpenEventSpace candidate = FxApplication.consumeEventSpaceCandidate();
    this.loader = this.doApplicationStart(stage);
    if (((this.loader != null) && (this.loader.<Object>getController() instanceof FxViewerController))) {
      Object _controller = this.loader.<Object>getController();
      ((FxViewerController) _controller).setUISpace(candidate);
    }
    stage.show();
  }
  
  public abstract FXMLLoader doApplicationStart(final Stage stage);
  
  public void stop() {
    try {
      super.stop();
      if (((this.loader != null) && (this.loader.<Object>getController() instanceof FxViewerController))) {
        Object _controller = this.loader.<Object>getController();
        ((FxViewerController) _controller).safeExit();
      }
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  private static OpenEventSpace eventSpaceCandidate;
  
  static OpenEventSpace setEventSpaceCandidate(final OpenEventSpace event) {
    OpenEventSpace _xsynchronizedexpression = null;
    synchronized (FxApplication.class) {
      _xsynchronizedexpression = FxApplication.eventSpaceCandidate = event;
    }
    return _xsynchronizedexpression;
  }
  
  private static OpenEventSpace consumeEventSpaceCandidate() {
    synchronized (FxApplication.class) {
      OpenEventSpace candidate = FxApplication.eventSpaceCandidate;
      FxApplication.eventSpaceCandidate = null;
      return candidate;
    }
  }
  
  @Override
  @SyntheticMember
  public boolean equals(final Object obj) {
    return super.equals(obj);
  }
  
  @Override
  @SyntheticMember
  public int hashCode() {
    int result = super.hashCode();
    return result;
  }
  
  @SyntheticMember
  public FxApplication() {
    super();
  }
}
