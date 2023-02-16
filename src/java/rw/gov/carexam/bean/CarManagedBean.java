/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rw.gov.carexam.bean;

import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;
import rw.gov.carexam.entity.Car;
import rw.gov.carexam.model.CarRegistration;

@ManagedBean(name = "carbean")
@SessionScoped
public class CarManagedBean {
    private Car car=new Car();
    private CarRegistration cr=new CarRegistration();

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }
    
    
    
 public String save(){       
  try{
      cr.create(car);
      addMessage("saved", "car with plateNo: "+car.getPlateNo()+" is saved successfully" );
      return "carList";
        }catch(Exception ex){
            FacesMessage msg = new FacesMessage("there is samekind of en error it is duplication or another ");
            FacesContext.getCurrentInstance().addMessage(null, msg);
            return "carRegistrationForm"; 
        }
      
    }
 public List<Car> getAllcar(){       
        return cr.findAll();
    } 
 
 public void addMessage(String summary, String detail) {
        FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, summary, detail);
        FacesContext.getCurrentInstance().addMessage(null, message);
    }
  
    
}
