/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rw.gov.carexam.validator;

import java.util.Date;
import java.util.GregorianCalendar;
import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

@FacesValidator("mydate")
public class Datevalidator implements Validator{

    @Override
    public void validate(FacesContext fc, UIComponent uic, Object o) throws ValidatorException {
        Date dob=(Date) o;
        Date validDob = new GregorianCalendar(2021, 1, 1).getTime();
        if(dob!= null && dob.before(validDob)){
            FacesMessage msg = new FacesMessage("Too old to be registered");
            throw new ValidatorException(msg);
        }
    }
    
}
