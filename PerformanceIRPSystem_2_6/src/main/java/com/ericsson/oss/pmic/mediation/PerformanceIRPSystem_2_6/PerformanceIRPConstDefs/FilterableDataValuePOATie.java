
package com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPConstDefs;

/**
 * <ul>
 * <li> <b>IDL Source</b>    "C:/MicroFocus/VisiBroker/bin/PerformanceIRPSystem_2_6/PerformanceIRPConstDefs.idl"
 * <li> <b>IDL Name</b>      ::PerformanceIRPConstDefs::FilterableDataValue
 * <li> <b>Repository Id</b> IDL:PerformanceIRPConstDefs/FilterableDataValue:1.0
 * </ul>
 * <b>IDL definition:</b>
 * <pre>
 * interface FilterableDataValue {
  ...
};
 * </pre>
 */
public class FilterableDataValuePOATie extends FilterableDataValuePOA {
  private com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPConstDefs.FilterableDataValueOperations _delegate;
  private org.omg.PortableServer.POA _poa;

  public FilterableDataValuePOATie (final com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPConstDefs.FilterableDataValueOperations _delegate) {
    this._delegate = _delegate;
  }

  public FilterableDataValuePOATie (final com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPConstDefs.FilterableDataValueOperations _delegate, 
                              final org.omg.PortableServer.POA _poa) {
    this._delegate = _delegate;
    this._poa = _poa;
  }

  public com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPConstDefs.FilterableDataValueOperations _delegate () {
    return this._delegate;
  }

  public void _delegate (final com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPConstDefs.FilterableDataValueOperations the_delegate) {
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
