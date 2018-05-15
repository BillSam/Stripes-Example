package Actions;

import net.sourceforge.stripes.action.ActionBean;
import net.sourceforge.stripes.action.ActionBeanContext;

public abstract class BaseAction implements ActionBean {

    private ActionBeanContext actionBeanContext;
    @Override
    public void setContext(ActionBeanContext actionBeanContext) {

        this.actionBeanContext = actionBeanContext;
    }

    @Override
    public ActionBeanContext getContext() {
        return actionBeanContext;
    }
}
