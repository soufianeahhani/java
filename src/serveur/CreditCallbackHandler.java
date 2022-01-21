
/**
 * CreditCallbackHandler.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */

    package serveur;

    /**
     *  CreditCallbackHandler Callback class, Users can extend this class and implement
     *  their own receiveResult and receiveError methods.
     */
    public abstract class CreditCallbackHandler{



    protected Object clientData;

    /**
    * User can pass in any object that needs to be accessed once the NonBlocking
    * Web service call is finished and appropriate method of this CallBack is called.
    * @param clientData Object mechanism by which the user can pass in user data
    * that will be avilable at the time this callback is called.
    */
    public CreditCallbackHandler(Object clientData){
        this.clientData = clientData;
    }

    /**
    * Please use this constructor if you don't want to set any clientData
    */
    public CreditCallbackHandler(){
        this.clientData = null;
    }

    /**
     * Get the client data
     */

     public Object getClientData() {
        return clientData;
     }

        
           /**
            * auto generated Axis2 call back method for annuite2 method
            * override this method for handling normal response from annuite2 operation
            */
           public void receiveResultannuite2(
                    serveur.CreditStub.Annuite2Response result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from annuite2 operation
           */
            public void receiveErrorannuite2(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for duree method
            * override this method for handling normal response from duree operation
            */
           public void receiveResultduree(
                    serveur.CreditStub.DureeResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from duree operation
           */
            public void receiveErrorduree(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for capital method
            * override this method for handling normal response from capital operation
            */
           public void receiveResultcapital(
                    serveur.CreditStub.CapitalResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from capital operation
           */
            public void receiveErrorcapital(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for annuite method
            * override this method for handling normal response from annuite operation
            */
           public void receiveResultannuite(
                    serveur.CreditStub.AnnuiteResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from annuite operation
           */
            public void receiveErrorannuite(java.lang.Exception e) {
            }
                


    }
    