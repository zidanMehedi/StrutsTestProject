package action;

import form.HelloForm;
import org.apache.struts.action.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloAction extends Action {
    @Override
    public ActionForward execute(ActionMapping mapping,
                                 ActionForm form,
                                 HttpServletRequest request,
                                 HttpServletResponse response) throws Exception {
        HelloForm helloForm = (HelloForm) form;
        ActionForward fw = mapping.getInputForward();

        if (helloForm != null && helloForm.getName().equalsIgnoreCase("Zidan")){
            fw = mapping.findForward("success");
        }else{
            ActionErrors errs = new ActionErrors();
            errs.add("", new ActionMessage("hello.msg.err"));
            saveErrors(request, errs);
        }

        return fw;
    }
}
