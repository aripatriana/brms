package com.telkomsigma.eclears.brms.tradeadjust;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class Request implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   @org.kie.api.definition.type.Label(value = "status")
   private java.lang.String status;
   @org.kie.api.definition.type.Label(value = "validationName")
   private java.lang.String validationName;

   public Request()
   {
   }

   public java.lang.String getStatus()
   {
      return this.status;
   }

   public void setStatus(java.lang.String status)
   {
      this.status = status;
   }

   public java.lang.String getValidationName()
   {
      return this.validationName;
   }

   public void setValidationName(java.lang.String validationName)
   {
      this.validationName = validationName;
   }

   public Request(java.lang.String status, java.lang.String validationName)
   {
      this.status = status;
      this.validationName = validationName;
   }

}