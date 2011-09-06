
package eu.wisebed.api.snaa;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.6 in JDK 6
 * Generated source version: 2.1
 * 
 */
@WebService(name = "SNAA", targetNamespace = "http://testbed.wisebed.eu/api/snaa/v1/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface SNAA {


    /**
     * 
     * @param authenticationData
     * @return
     *     returns java.util.List<eu.wisebed.api.snaa.SecretAuthenticationKey>
     * @throws SNAAExceptionException
     * @throws AuthenticationExceptionException
     */
    @WebMethod
    @WebResult(name = "secretAuthenticationKey", targetNamespace = "")
    @RequestWrapper(localName = "authenticate", targetNamespace = "http://testbed.wisebed.eu/api/snaa/v1/", className = "eu.wisebed.api.snaa.Authenticate")
    @ResponseWrapper(localName = "authenticateResponse", targetNamespace = "http://testbed.wisebed.eu/api/snaa/v1/", className = "eu.wisebed.api.snaa.AuthenticateResponse")
    public List<SecretAuthenticationKey> authenticate(
        @WebParam(name = "authenticationData", targetNamespace = "")
        List<AuthenticationTriple> authenticationData)
        throws AuthenticationExceptionException, SNAAExceptionException
    ;

    /**
     * 
     * @param authenticationData
     * @param action
     * @return
     *     returns boolean
     * @throws SNAAExceptionException
     */
    @WebMethod
    @WebResult(name = "authorization", targetNamespace = "")
    @RequestWrapper(localName = "isAuthorized", targetNamespace = "http://testbed.wisebed.eu/api/snaa/v1/", className = "eu.wisebed.api.snaa.IsAuthorized")
    @ResponseWrapper(localName = "isAuthorizedResponse", targetNamespace = "http://testbed.wisebed.eu/api/snaa/v1/", className = "eu.wisebed.api.snaa.IsAuthorizedResponse")
    public boolean isAuthorized(
        @WebParam(name = "authenticationData", targetNamespace = "")
        List<SecretAuthenticationKey> authenticationData,
        @WebParam(name = "action", targetNamespace = "")
        Action action)
        throws SNAAExceptionException
    ;

}
