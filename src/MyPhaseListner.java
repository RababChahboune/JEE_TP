import javax.faces.event.PhaseEvent;
import javax.faces.event.PhaseId;
import javax.faces.event.PhaseListener;

/**
 * Created by Rabab Chahboune on 2/22/2017.
 */
public class MyPhaseListner implements PhaseListener {
    @Override
    public void afterPhase(PhaseEvent phaseEvent) {
        System.out.println("avant la phase : "+phaseEvent.getPhaseId());
    }

    @Override
    public void beforePhase(PhaseEvent phaseEvent) {
        System.out.println("Apres la phase : "+phaseEvent.getPhaseId());
    }

    @Override
    public PhaseId getPhaseId() {;
        return PhaseId.ANY_PHASE;
    }
}
