package com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPConstDefs;

/**
 * <ul>
 * <li> <b>IDL Source</b>    "C:/MicroFocus/VisiBroker/bin/PerformanceIRPSystem_4_3/PerformanceIRPConstDefs.idl"
 * <li> <b>IDL Name</b>      ::PerformanceIRPConstDefs::TypeNameValue
 * <li> <b>Repository Id</b> IDL:PerformanceIRPConstDefs/TypeNameValue:1.0
 * </ul>
 * <b>IDL definition:</b>
 * <pre>
 * interface TypeNameValue {
  ...
};
 * </pre>
 */
public abstract class TypeNameValuePOA extends org.omg.PortableServer.Servant implements 
org.omg.CORBA.portable.InvokeHandler, com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPConstDefs.TypeNameValueOperations {

  public com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPConstDefs.TypeNameValue _this () {
   return com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPConstDefs.TypeNameValueHelper.narrow(super._this_object());
  }

  public com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPConstDefs.TypeNameValue _this (org.omg.CORBA.ORB orb) {
    return com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPConstDefs.TypeNameValueHelper.narrow(super._this_object(orb));
  }

  public java.lang.String[] _all_interfaces (final org.omg.PortableServer.POA poa, final byte[] objectId) {
    return __ids;
  }

  private static java.lang.String[] __ids = {
    "IDL:PerformanceIRPConstDefs/TypeNameValue:1.0"
  };

  private static java.util.Dictionary _methods = new java.util.Hashtable();

  static {
  }

  public org.omg.CORBA.portable.OutputStream _invoke (java.lang.String opName,
                                                      org.omg.CORBA.portable.InputStream _input,
                                                      org.omg.CORBA.portable.ResponseHandler handler) {
    int[] method = (int[]) _methods.get(opName);
    if (method == null) {
      throw new org.omg.CORBA.BAD_OPERATION();
    }
    switch (method[0]) {
      case 0: {
        return com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPConstDefs.TypeNameValuePOA._invoke(this, method[1], _input, handler);
      }
    }
    throw new org.omg.CORBA.BAD_OPERATION(2, org.omg.CORBA.CompletionStatus.COMPLETED_NO);
  }

  public static org.omg.CORBA.portable.OutputStream _invoke (com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPConstDefs.TypeNameValueOperations _self,
                                                             int _method_id,
                                                             org.omg.CORBA.portable.InputStream _input,
                                                             org.omg.CORBA.portable.ResponseHandler _handler) {
  org.omg.CORBA.portable.OutputStream _output = null;
  return _output;
  }
}
