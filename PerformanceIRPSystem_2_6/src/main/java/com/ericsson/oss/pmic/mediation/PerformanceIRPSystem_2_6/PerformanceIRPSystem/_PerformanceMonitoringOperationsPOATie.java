
package com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem;

/**
 * <ul>
 * <li> <b>IDL Source</b>    "C:/MicroFocus/VisiBroker/bin/PerformanceIRPSystem_2_6/PerformanceIRPSystem.idl"
 * <li> <b>IDL Name</b>      ::PerformanceIRPSystem::PerformanceMonitoringOperations
 * <li> <b>Repository Id</b> IDL:PerformanceIRPSystem/PerformanceMonitoringOperations:1.0
 * </ul>
 * <b>IDL definition:</b>
 * <pre>
 * interface _PerformanceMonitoringOperations {
  ...
};
 * </pre>
 */
public class _PerformanceMonitoringOperationsPOATie extends _PerformanceMonitoringOperationsPOA {
  private com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem._PerformanceMonitoringOperationsOperations _delegate;
  private org.omg.PortableServer.POA _poa;

  public _PerformanceMonitoringOperationsPOATie (final com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem._PerformanceMonitoringOperationsOperations _delegate) {
    this._delegate = _delegate;
  }

  public _PerformanceMonitoringOperationsPOATie (final com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem._PerformanceMonitoringOperationsOperations _delegate, 
                              final org.omg.PortableServer.POA _poa) {
    this._delegate = _delegate;
    this._poa = _poa;
  }

  public com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem._PerformanceMonitoringOperationsOperations _delegate () {
    return this._delegate;
  }

  public void _delegate (final com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem._PerformanceMonitoringOperationsOperations the_delegate) {
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
   *   com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.CommonIRPConstDefs.Signal lookup_filter_performance_monitoring_report (in com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPConstDefs.PerformanceMonitoringId performance_monitoring_id,
                                                                                                                                  out com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPConstDefs.RecordingType recording_type,
                                                                                                                                  out com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPConstDefs.ObservationObject triggering_object,
                                                                                                                                  out com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPConstDefs.ObservationObjectList observation_object_list,
                                                                                                                                  out com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPConstDefs.Filter filter,
                                                                                                                                  out com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPConstDefs.TimeWindow time_window,
                                                                                                                                  out com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPConstDefs.SamplingRate sampling_rate)
    raises (com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem.OptionalOperationNotSupportedException,
            com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem.NoSuchIdException,
            com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem.CounterbasedFilterException);
   * </pre>
   */
  public com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.CommonIRPConstDefs.Signal lookup_filter_performance_monitoring_report (int performance_monitoring_id, 
                                                                                                                                         com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPConstDefs.RecordingTypeHolder recording_type, 
                                                                                                                                         com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPConstDefs.ObservationObjectHolder triggering_object, 
                                                                                                                                         com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPConstDefs.ObservationObjectListHolder observation_object_list, 
                                                                                                                                         com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPConstDefs.FilterHolder filter, 
                                                                                                                                         com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPConstDefs.TimeWindowHolder time_window, 
                                                                                                                                         org.omg.CORBA.IntHolder sampling_rate) throws  com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem.OptionalOperationNotSupportedException, 
                                                                                                                                                                                        com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem.NoSuchIdException, 
                                                                                                                                                                                        com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem.CounterbasedFilterException {
    return this._delegate.lookup_filter_performance_monitoring_report(performance_monitoring_id, 
                                                                      recording_type, 
                                                                      triggering_object, 
                                                                      observation_object_list, 
                                                                      filter, time_window, 
                                                                      sampling_rate);
  }

  /**
   * <pre>
   *   com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.CommonIRPConstDefs.Signal filter_performance_monitoring_report (in com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPConstDefs.PerformanceMonitoringIdList performance_monitoring_id_list,
                                                                                                                           in com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPConstDefs.RecordingType recording_type,
                                                                                                                           in com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPConstDefs.ObservationObject triggering_object,
                                                                                                                           in com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPConstDefs.ObservationObjectList observation_object_list,
                                                                                                                           in com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPConstDefs.Filter filter,
                                                                                                                           in com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPConstDefs.TimeWindow time_window,
                                                                                                                           in com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPConstDefs.SamplingRate sampling_rate,
                                                                                                                           out com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPConstDefs.PerformanceMonitoringIdList bad_performance_monitoring_id_list)
    raises (com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem.OptionalOperationNotSupportedException,
            com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem.OptionalParameterNotSupportedException,
            com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem.NoSuchIdException);
   * </pre>
   */
  public com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.CommonIRPConstDefs.Signal filter_performance_monitoring_report (int[] performance_monitoring_id_list, 
                                                                                                                                  com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPConstDefs.RecordingType recording_type, 
                                                                                                                                  com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPConstDefs.ObservationObject triggering_object, 
                                                                                                                                  com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPConstDefs.ObservationObject[] observation_object_list, 
                                                                                                                                  com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPConstDefs.Filter filter, 
                                                                                                                                  int[] time_window, 
                                                                                                                                  int sampling_rate, 
                                                                                                                                  com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPConstDefs.PerformanceMonitoringIdListHolder bad_performance_monitoring_id_list) throws  com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem.OptionalOperationNotSupportedException, 
                                                                                                                                                                                                                                                                                                 com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem.OptionalParameterNotSupportedException, 
                                                                                                                                                                                                                                                                                                 com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem.NoSuchIdException {
    return this._delegate.filter_performance_monitoring_report(performance_monitoring_id_list, 
                                                               recording_type, 
                                                               triggering_object, 
                                                               observation_object_list, 
                                                               filter, time_window, 
                                                               sampling_rate, bad_performance_monitoring_id_list);
  }

  /**
   * <pre>
   *   com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.CommonIRPConstDefs.Signal get_performance_monitoring_report (in com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPConstDefs.PerformanceMonitoringId performance_monitoring_id,
                                                                                                                        out com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPConstDefs.PerformanceMonitoringReport performance_monitoring_report)
    raises (com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem.OptionalOperationNotSupportedException,
            com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem.NoSuchIdException);
   * </pre>
   */
  public com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.CommonIRPConstDefs.Signal get_performance_monitoring_report (int performance_monitoring_id, 
                                                                                                                               com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPConstDefs.PerformanceMonitoringReportHolder performance_monitoring_report) throws  com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem.OptionalOperationNotSupportedException, 
                                                                                                                                                                                                                                                                                         com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem.NoSuchIdException {
    return this._delegate.get_performance_monitoring_report(performance_monitoring_id, 
                                                            performance_monitoring_report);
  }

  /**
   * <pre>
   *   com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.CommonIRPConstDefs.Signal resume_performance_monitoring (in com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPConstDefs.PerformanceMonitoringIdList performance_monitoring_id_list,
                                                                                                                    out com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPConstDefs.PerformanceMonitoringIdList bad_performance_monitoring_list)
    raises (com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem.OptionalOperationNotSupportedException,
            com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem.NoSuchIdException);
   * </pre>
   */
  public com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.CommonIRPConstDefs.Signal resume_performance_monitoring (int[] performance_monitoring_id_list, 
                                                                                                                           com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPConstDefs.PerformanceMonitoringIdListHolder bad_performance_monitoring_list) throws  com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem.OptionalOperationNotSupportedException, 
                                                                                                                                                                                                                                                                                       com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem.NoSuchIdException {
    return this._delegate.resume_performance_monitoring(performance_monitoring_id_list, 
                                                        bad_performance_monitoring_list);
  }

  /**
   * <pre>
   *   com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.CommonIRPConstDefs.Signal suspend_performance_monitoring (in com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPConstDefs.PerformanceMonitoringIdList performance_monitoring_id_list,
                                                                                                                     out com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPConstDefs.PerformanceMonitoringIdList bad_performance_monitoring_id_list)
    raises (com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem.OptionalOperationNotSupportedException,
            com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem.NoSuchIdException);
   * </pre>
   */
  public com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.CommonIRPConstDefs.Signal suspend_performance_monitoring (int[] performance_monitoring_id_list, 
                                                                                                                            com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPConstDefs.PerformanceMonitoringIdListHolder bad_performance_monitoring_id_list) throws  com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem.OptionalOperationNotSupportedException, 
                                                                                                                                                                                                                                                                                           com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem.NoSuchIdException {
    return this._delegate.suspend_performance_monitoring(performance_monitoring_id_list, 
                                                         bad_performance_monitoring_id_list);
  }

  /**
   * <pre>
   *   com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.CommonIRPConstDefs.Signal delete_performance_monitoring (in com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPConstDefs.PerformanceMonitoringId performance_monitoring_id)
    raises (com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem.OptionalOperationNotSupportedException,
            com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem.NoSuchIdException);
   * </pre>
   */
  public com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.CommonIRPConstDefs.Signal delete_performance_monitoring (int performance_monitoring_id) throws  com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem.OptionalOperationNotSupportedException, 
                                                                                                                                                                  com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem.NoSuchIdException {
    return this._delegate.delete_performance_monitoring(performance_monitoring_id);
  }

  /**
   * <pre>
   *   com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.CommonIRPConstDefs.Signal lookup_performance_monitoring (in com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPConstDefs.PerformanceMonitoringId performance_monitoring_id,
                                                                                                                    out com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPConstDefs.ObservationClassList observation_class_list,
                                                                                                                    out com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPConstDefs.ObservationObjectList observation_object_list,
                                                                                                                    out com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPConstDefs.TimePeriodInSeconds granularity_period,
                                                                                                                    out com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPConstDefs.Schedule schedule,
                                                                                                                    out com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPConstDefs.TimePeriodInSeconds reporting_period,
                                                                                                                    out com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPConstDefs.Destination destination,
                                                                                                                    out com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPConstDefs.PerformanceMonitoringState performance_monitoring_state,
                                                                                                                    out com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPConstDefs.MeasurementName measurement_name)
    raises (com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem.OptionalOperationNotSupportedException,
            com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem.NoSuchIdException);
   * </pre>
   */
  public com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.CommonIRPConstDefs.Signal lookup_performance_monitoring (int performance_monitoring_id, 
                                                                                                                           com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPConstDefs.ObservationClassListHolder observation_class_list, 
                                                                                                                           com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPConstDefs.ObservationObjectListHolder observation_object_list, 
                                                                                                                           org.omg.CORBA.IntHolder granularity_period, 
                                                                                                                           com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPConstDefs.ScheduleHolder schedule, 
                                                                                                                           org.omg.CORBA.IntHolder reporting_period, 
                                                                                                                           com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPConstDefs.DestinationHolder destination, 
                                                                                                                           com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPConstDefs.PerformanceMonitoringStateHolder performance_monitoring_state, 
                                                                                                                           org.omg.CORBA.StringHolder measurement_name) throws  com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem.OptionalOperationNotSupportedException, 
                                                                                                                                                                                com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem.NoSuchIdException {
    return this._delegate.lookup_performance_monitoring(performance_monitoring_id, 
                                                        observation_class_list, 
                                                        observation_object_list, 
                                                        granularity_period, schedule, 
                                                        reporting_period, destination, 
                                                        performance_monitoring_state, 
                                                        measurement_name);
  }

  /**
   * <pre>
   *   com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.CommonIRPConstDefs.Signal create_performance_monitoring (in com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPConstDefs.ObservationClassList observation_class_list,
                                                                                                                    in com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPConstDefs.ObservationObjectList observation_object_list,
                                                                                                                    in com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPConstDefs.TimePeriodInSeconds granularity_period,
                                                                                                                    in com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPConstDefs.Schedule schedule,
                                                                                                                    in com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPConstDefs.TimePeriodInSeconds reporting_period,
                                                                                                                    in com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPConstDefs.Destination destination,
                                                                                                                    in com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPConstDefs.MeasurementName measurement_name,
                                                                                                                    in com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPConstDefs.PerformanceMonitoringState performance_monitoring_state,
                                                                                                                    out com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPConstDefs.PerformanceMonitoringId performance_monitoring_id,
                                                                                                                    out com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPConstDefs.FailureInformation failure_information)
    raises (com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem.OptionalOperationNotSupportedException,
            com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem.OptionalParameterNotSupportedException,
            com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem.InvalidObservationObjectException,
            com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem.InvalidObservationClassException,
            com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem.InvalidMeasurementAttributeException,
            com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem.InvalidGranularityPeriodException,
            com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem.InvalidScheduleException,
            com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem.InvalidReportingPeriodException,
            com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem.DestinationNotSupportedException);
   * </pre>
   */
  public com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.CommonIRPConstDefs.Signal create_performance_monitoring (com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPConstDefs.ObservationClass[] observation_class_list, 
                                                                                                                           com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPConstDefs.ObservationObject[] observation_object_list, 
                                                                                                                           int granularity_period, 
                                                                                                                           com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPConstDefs.Schedule schedule, 
                                                                                                                           int reporting_period, 
                                                                                                                           com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPConstDefs.Destination destination, 
                                                                                                                           java.lang.String measurement_name, 
                                                                                                                           com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPConstDefs.PerformanceMonitoringState performance_monitoring_state, 
                                                                                                                           org.omg.CORBA.IntHolder performance_monitoring_id, 
                                                                                                                           com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPConstDefs.FailureInformationHolder failure_information) throws  com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem.OptionalOperationNotSupportedException, 
                                                                                                                                                                                                                                                                  com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem.OptionalParameterNotSupportedException, 
                                                                                                                                                                                                                                                                  com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem.InvalidObservationObjectException, 
                                                                                                                                                                                                                                                                  com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem.InvalidObservationClassException, 
                                                                                                                                                                                                                                                                  com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem.InvalidMeasurementAttributeException, 
                                                                                                                                                                                                                                                                  com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem.InvalidGranularityPeriodException, 
                                                                                                                                                                                                                                                                  com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem.InvalidScheduleException, 
                                                                                                                                                                                                                                                                  com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem.InvalidReportingPeriodException, 
                                                                                                                                                                                                                                                                  com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem.DestinationNotSupportedException {
    return this._delegate.create_performance_monitoring(observation_class_list, 
                                                        observation_object_list, 
                                                        granularity_period, schedule, 
                                                        reporting_period, destination, 
                                                        measurement_name, performance_monitoring_state, 
                                                        performance_monitoring_id, 
                                                        failure_information);
  }

  /**
   * <pre>
   *   com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.CommonIRPConstDefs.Signal list_performance_monitorings (in com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPConstDefs.NeList ne_list,
                                                                                                                   out com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPConstDefs.PerformanceMonitoringList performance_monitoring_list)
    raises (com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem.OptionalOperationNotSupportedException,
            com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem.OptionalParameterNotSupportedException);
   * </pre>
   */
  public com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.CommonIRPConstDefs.Signal list_performance_monitorings (java.lang.String[] ne_list, 
                                                                                                                          com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPConstDefs.PerformanceMonitoringListHolder performance_monitoring_list) throws  com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem.OptionalOperationNotSupportedException, 
                                                                                                                                                                                                                                                                                com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem.OptionalParameterNotSupportedException {
    return this._delegate.list_performance_monitorings(ne_list, performance_monitoring_list);
  }

}
