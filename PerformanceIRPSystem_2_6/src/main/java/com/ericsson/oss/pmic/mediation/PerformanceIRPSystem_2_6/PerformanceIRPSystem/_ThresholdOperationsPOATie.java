
package com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem;

/**
 * <ul>
 * <li> <b>IDL Source</b>    "C:/MicroFocus/VisiBroker/bin/PerformanceIRPSystem_2_6/PerformanceIRPSystem.idl"
 * <li> <b>IDL Name</b>      ::PerformanceIRPSystem::ThresholdOperations
 * <li> <b>Repository Id</b> IDL:PerformanceIRPSystem/ThresholdOperations:1.0
 * </ul>
 * <b>IDL definition:</b>
 * <pre>
 * interface _ThresholdOperations {
  ...
};
 * </pre>
 */
public class _ThresholdOperationsPOATie extends _ThresholdOperationsPOA {
  private com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem._ThresholdOperationsOperations _delegate;
  private org.omg.PortableServer.POA _poa;

  public _ThresholdOperationsPOATie (final com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem._ThresholdOperationsOperations _delegate) {
    this._delegate = _delegate;
  }

  public _ThresholdOperationsPOATie (final com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem._ThresholdOperationsOperations _delegate, 
                              final org.omg.PortableServer.POA _poa) {
    this._delegate = _delegate;
    this._poa = _poa;
  }

  public com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem._ThresholdOperationsOperations _delegate () {
    return this._delegate;
  }

  public void _delegate (final com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem._ThresholdOperationsOperations the_delegate) {
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
   *   com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.CommonIRPConstDefs.Signal delete_threshold (in string threshold_data_id)
    raises (com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem.NoSuchIdException,
            com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem.OptionalOperationNotSupportedException,
            com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem.OptionalParameterNotSupportedException);
   * </pre>
   */
  public com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.CommonIRPConstDefs.Signal delete_threshold (java.lang.String threshold_data_id) throws  com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem.NoSuchIdException, 
                                                                                                                                                          com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem.OptionalOperationNotSupportedException, 
                                                                                                                                                          com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem.OptionalParameterNotSupportedException {
    return this._delegate.delete_threshold(threshold_data_id);
  }

  /**
   * <pre>
   *   com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.CommonIRPConstDefs.Signal lookup_threshold (in string threshold_data_id,
                                                                                                       out string observed_object_class,
                                                                                                       out com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPConstDefs.InstanceList observed_object_list,
                                                                                                       out com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPConstDefs.TimePeriodInSeconds granularity_period,
                                                                                                       out string threshold_attribute,
                                                                                                       out com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPConstDefs.AttrValue threshold_value,
                                                                                                       out com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPConstDefs.AttrValue hysteresis,
                                                                                                       out com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPConstDefs.Direction direction,
                                                                                                       out string type,
                                                                                                       out string perceived_severity,
                                                                                                       out string probable_cause,
                                                                                                       out string specific_problem)
    raises (com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem.NoSuchIdException,
            com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem.OptionalOperationNotSupportedException,
            com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem.OptionalParameterNotSupportedException);
   * </pre>
   */
  public com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.CommonIRPConstDefs.Signal lookup_threshold (java.lang.String threshold_data_id, 
                                                                                                              org.omg.CORBA.StringHolder observed_object_class, 
                                                                                                              com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPConstDefs.InstanceListHolder observed_object_list, 
                                                                                                              org.omg.CORBA.IntHolder granularity_period, 
                                                                                                              org.omg.CORBA.StringHolder threshold_attribute, 
                                                                                                              com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPConstDefs.AttrValueHolder threshold_value, 
                                                                                                              com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPConstDefs.AttrValueHolder hysteresis, 
                                                                                                              com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPConstDefs.DirectionHolder direction, 
                                                                                                              org.omg.CORBA.StringHolder type, 
                                                                                                              org.omg.CORBA.StringHolder perceived_severity, 
                                                                                                              org.omg.CORBA.StringHolder probable_cause, 
                                                                                                              org.omg.CORBA.StringHolder specific_problem) throws  com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem.NoSuchIdException, 
                                                                                                                                                                   com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem.OptionalOperationNotSupportedException, 
                                                                                                                                                                   com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem.OptionalParameterNotSupportedException {
    return this._delegate.lookup_threshold(threshold_data_id, observed_object_class, 
                                           observed_object_list, granularity_period, 
                                           threshold_attribute, threshold_value, 
                                           hysteresis, direction, type, perceived_severity, 
                                           probable_cause, specific_problem);
  }

  /**
   * <pre>
   *   com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.CommonIRPConstDefs.Signal create_threshold (in string observation_class,
                                                                                                       in com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPConstDefs.InstanceList observed_object_list,
                                                                                                       in com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPConstDefs.TimePeriodInSeconds granularity_period,
                                                                                                       in string threshold_attribute,
                                                                                                       in com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPConstDefs.AttrValue threshold_value,
                                                                                                       in com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPConstDefs.AttrValue hysteresis,
                                                                                                       in com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPConstDefs.Direction direction,
                                                                                                       in string type,
                                                                                                       in string perceived_severity,
                                                                                                       in string probable_cause,
                                                                                                       in string specific_problem,
                                                                                                       out string threshold_data_id)
    raises (com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem.OptionalOperationNotSupportedException,
            com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem.OptionalParameterNotSupportedException);
   * </pre>
   */
  public com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.CommonIRPConstDefs.Signal create_threshold (java.lang.String observation_class, 
                                                                                                              java.lang.String[] observed_object_list, 
                                                                                                              int granularity_period, 
                                                                                                              java.lang.String threshold_attribute, 
                                                                                                              com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPConstDefs.AttrValue threshold_value, 
                                                                                                              com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPConstDefs.AttrValue hysteresis, 
                                                                                                              com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPConstDefs.Direction direction, 
                                                                                                              java.lang.String type, 
                                                                                                              java.lang.String perceived_severity, 
                                                                                                              java.lang.String probable_cause, 
                                                                                                              java.lang.String specific_problem, 
                                                                                                              org.omg.CORBA.StringHolder threshold_data_id) throws  com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem.OptionalOperationNotSupportedException, 
                                                                                                                                                                    com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem.OptionalParameterNotSupportedException {
    return this._delegate.create_threshold(observation_class, observed_object_list, 
                                           granularity_period, threshold_attribute, 
                                           threshold_value, hysteresis, direction, 
                                           type, perceived_severity, probable_cause, 
                                           specific_problem, threshold_data_id);
  }

  /**
   * <pre>
   *   com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.CommonIRPConstDefs.Signal list_thresholds (in com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPConstDefs.NeList ne_list,
                                                                                                      out com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPConstDefs.IdSeq threshold_list)
    raises (com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem.OptionalOperationNotSupportedException,
            com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem.OptionalParameterNotSupportedException);
   * </pre>
   */
  public com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.CommonIRPConstDefs.Signal list_thresholds (java.lang.String[] ne_list, 
                                                                                                             com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPConstDefs.IdSeqHolder threshold_list) throws  com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem.OptionalOperationNotSupportedException, 
                                                                                                                                                                                                                                  com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem.OptionalParameterNotSupportedException {
    return this._delegate.list_thresholds(ne_list, threshold_list);
  }

}
