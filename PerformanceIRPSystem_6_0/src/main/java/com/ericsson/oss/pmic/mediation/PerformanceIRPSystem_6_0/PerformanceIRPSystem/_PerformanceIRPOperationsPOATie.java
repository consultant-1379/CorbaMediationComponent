
package com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem;

/**
 * <ul>
 * <li> <b>IDL Source</b>    "C:/MicroFocus/VisiBroker/bin/PerformanceIRPSystem_6_0/PerformanceIRPOperations.idl"
 * <li> <b>IDL Name</b>      ::PerformanceIRPSystem::PerformanceIRPOperations
 * <li> <b>Repository Id</b> IDL:PerformanceIRPSystem/PerformanceIRPOperations:1.0
 * </ul>
 * <b>IDL definition:</b>
 * <pre>
 * interface _PerformanceIRPOperations {
  ...
};
 * </pre>
 */
public class _PerformanceIRPOperationsPOATie extends _PerformanceIRPOperationsPOA {
  private com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem._PerformanceIRPOperationsOperations _delegate;
  private org.omg.PortableServer.POA _poa;

  public _PerformanceIRPOperationsPOATie (final com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem._PerformanceIRPOperationsOperations _delegate) {
    this._delegate = _delegate;
  }

  public _PerformanceIRPOperationsPOATie (final com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem._PerformanceIRPOperationsOperations _delegate, 
                              final org.omg.PortableServer.POA _poa) {
    this._delegate = _delegate;
    this._poa = _poa;
  }

  public com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem._PerformanceIRPOperationsOperations _delegate () {
    return this._delegate;
  }

  public void _delegate (final com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem._PerformanceIRPOperationsOperations the_delegate) {
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

  /**
   * <pre>
   *   com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.CommonIRPConstDefs.VersionNumberSet get_performance_IRP_version ();
   * </pre>
   */
  public java.lang.String[] get_performance_IRP_version () {
    return this._delegate.get_performance_IRP_version();
  }

}
