
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
public class TypeNameValuePOATie extends TypeNameValuePOA {
  private com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPConstDefs.TypeNameValueOperations _delegate;
  private org.omg.PortableServer.POA _poa;

  public TypeNameValuePOATie (final com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPConstDefs.TypeNameValueOperations _delegate) {
    this._delegate = _delegate;
  }

  public TypeNameValuePOATie (final com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPConstDefs.TypeNameValueOperations _delegate, 
                              final org.omg.PortableServer.POA _poa) {
    this._delegate = _delegate;
    this._poa = _poa;
  }

  public com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPConstDefs.TypeNameValueOperations _delegate () {
    return this._delegate;
  }

  public void _delegate (final com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPConstDefs.TypeNameValueOperations the_delegate) {
    this._delegate = the_delegate;
  }

  public org.omg.PortableServer.POA _default_POA () {
    if (_poa != null) {
      return _poa;
    } 
    else {
      return super._default_POA();
    }
  }

}
