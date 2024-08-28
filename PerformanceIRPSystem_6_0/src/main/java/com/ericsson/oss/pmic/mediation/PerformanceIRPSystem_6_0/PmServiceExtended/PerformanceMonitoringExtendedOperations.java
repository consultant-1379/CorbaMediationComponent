package com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PmServiceExtended;

/**
 * <ul>
 * <li> <b>IDL Source</b>    "C:/MicroFocus/VisiBroker/bin/PerformanceIRPSystem_6_0/PerformanceMonitoringServiceExtended.idl"
 * <li> <b>IDL Name</b>      ::PmServiceExtended::PerformanceMonitoringExtended
 * <li> <b>Repository Id</b> IDL:PmServiceExtended/PerformanceMonitoringExtended:1.0
 * </ul>
 * <b>IDL definition:</b>
 * <pre>
 * interface PerformanceMonitoringExtended : com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem._PerformanceMonitoringOperations {
  ...
};
 * </pre>
 */
public interface PerformanceMonitoringExtendedOperations extends com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem._PerformanceMonitoringOperationsOperations {
  /**
   * <pre>
   *   com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.CommonIRPConstDefs.Signal lookup_filter_performance_monitoring_report_ext (in com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPConstDefs.PerformanceMonitoringId performance_monitoring_id,
                                                                                                                                      out com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPConstDefs.RecordingType recording_type,
                                                                                                                                      out com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPConstDefs.ObservationObject triggering_object,
                                                                                                                                      out com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPConstDefs.ObservationObjectList observation_object_list,
                                                                                                                                      out com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPConstDefs.Filter filter,
                                                                                                                                      out com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPConstDefs.TimeWindow time_window,
                                                                                                                                      out com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPConstDefs.SamplingRate sampling_rate,
                                                                                                                                      out com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PmServiceExtended.OutputMode mode,
                                                                                                                                      out com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PmServiceExtended.DestinationAddress address,
                                                                                                                                      out com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PmServiceExtended.TraceReference trace_reference)
    raises (com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.OptionalOperationNotSupportedException,
            com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.NoSuchIdException,
            com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.InvalidPerformanceMonitoringTypeException,
            com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.ProcessingErrorException,
            com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.InvalidParameterException);
   * </pre>
   */
  public com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.CommonIRPConstDefs.Signal lookup_filter_performance_monitoring_report_ext (int performance_monitoring_id, 
                                                                                                                                             com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPConstDefs.RecordingTypeHolder recording_type, 
                                                                                                                                             com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPConstDefs.ObservationObjectHolder triggering_object, 
                                                                                                                                             com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPConstDefs.ObservationObjectListHolder observation_object_list, 
                                                                                                                                             com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPConstDefs.FilterHolder filter, 
                                                                                                                                             com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPConstDefs.TimeWindowHolder time_window, 
                                                                                                                                             org.omg.CORBA.IntHolder sampling_rate, 
                                                                                                                                             com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PmServiceExtended.OutputModeHolder mode, 
                                                                                                                                             com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PmServiceExtended.DestinationAddressHolder address, 
                                                                                                                                             org.omg.CORBA.StringHolder trace_reference) throws com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.OptionalOperationNotSupportedException, 
                                                                                                                                                                                                com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.NoSuchIdException, 
                                                                                                                                                                                                com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.InvalidPerformanceMonitoringTypeException, 
                                                                                                                                                                                                com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.ProcessingErrorException, 
                                                                                                                                                                                                com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.InvalidParameterException;

  /**
   * <pre>
   *   com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.CommonIRPConstDefs.Signal filter_performance_monitoring_report_ext (in com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPConstDefs.PerformanceMonitoringIdList performance_monitoring_id_list,
                                                                                                                               in com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPConstDefs.RecordingType recording_type,
                                                                                                                               in com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPConstDefs.ObservationObject triggering_object,
                                                                                                                               in com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPConstDefs.ObservationObjectList observation_object_list,
                                                                                                                               in com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPConstDefs.Filter filter,
                                                                                                                               in com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPConstDefs.TimeWindow time_window,
                                                                                                                               in com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPConstDefs.SamplingRate sampling_rate,
                                                                                                                               in com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PmServiceExtended.OutputMode mode,
                                                                                                                               in com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PmServiceExtended.DestinationAddress address,
                                                                                                                               in com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PmServiceExtended.TraceReference trace_reference,
                                                                                                                               out com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPConstDefs.PerformanceMonitoringIdList bad_performance_monitoring_id_list)
    raises (com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.OptionalOperationNotSupportedException,
            com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.OptionalParameterNotSupportedException,
            com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.InvalidPerformanceMonitoringTypeException,
            com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.ProcessingErrorException,
            com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.InvalidParameterException,
            com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.InvalidObservationObjectListException,
            com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.InvalidFilterException,
            com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.InvalidTriggeringObjectException);
   * </pre>
   */
  public com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.CommonIRPConstDefs.Signal filter_performance_monitoring_report_ext (int[] performance_monitoring_id_list, 
                                                                                                                                      com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPConstDefs.RecordingType recording_type, 
                                                                                                                                      com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPConstDefs.ObservationObject triggering_object, 
                                                                                                                                      com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPConstDefs.ObservationObject[] observation_object_list, 
                                                                                                                                      com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPConstDefs.Filter filter, 
                                                                                                                                      int[] time_window, 
                                                                                                                                      int sampling_rate, 
                                                                                                                                      com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PmServiceExtended.OutputMode mode, 
                                                                                                                                      com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PmServiceExtended.DestinationAddress address, 
                                                                                                                                      java.lang.String trace_reference, 
                                                                                                                                      com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPConstDefs.PerformanceMonitoringIdListHolder bad_performance_monitoring_id_list) throws com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.OptionalOperationNotSupportedException, 
                                                                                                                                                                                                                                                                                                    com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.OptionalParameterNotSupportedException, 
                                                                                                                                                                                                                                                                                                    com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.InvalidPerformanceMonitoringTypeException, 
                                                                                                                                                                                                                                                                                                    com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.ProcessingErrorException, 
                                                                                                                                                                                                                                                                                                    com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.InvalidParameterException, 
                                                                                                                                                                                                                                                                                                    com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.InvalidObservationObjectListException, 
                                                                                                                                                                                                                                                                                                    com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.InvalidFilterException, 
                                                                                                                                                                                                                                                                                                    com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.InvalidTriggeringObjectException;

  /**
   * <pre>
   *   com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.CommonIRPConstDefs.Signal create_generic_performance_monitoring (in com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPConstDefs.ObservationClassList observation_class_list,
                                                                                                                            in com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPConstDefs.ObservationObjectList observation_object_list,
                                                                                                                            in com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPConstDefs.TimePeriodInSeconds granularity_period,
                                                                                                                            in com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPConstDefs.Schedule schedule,
                                                                                                                            in com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPConstDefs.TimePeriodInSeconds reporting_period,
                                                                                                                            in com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPConstDefs.Destination destination,
                                                                                                                            in com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPConstDefs.MeasurementName measurement_name,
                                                                                                                            in com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPConstDefs.PerformanceMonitoringState performance_monitoring_state,
                                                                                                                            out com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPConstDefs.PerformanceMonitoringId performance_monitoring_id,
                                                                                                                            out com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPConstDefs.FailureInformation failure_information)
    raises (com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.OptionalOperationNotSupportedException,
            com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.OptionalParameterNotSupportedException,
            com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.InvalidObservationObjectListException,
            com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.InvalidObservationClassException,
            com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.InvalidGranularityPeriodException,
            com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.InvalidParameterException,
            com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.InvalidScheduleException,
            com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.InvalidReportingPeriodException,
            com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.DestinationNotSupportedException,
            com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.ProcessingErrorException,
            com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.NumberOfCountersExceededException,
            com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.NumberOfMonitorsExceededException,
            com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.OverloadException,
            com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.GranularityNotSupportedException,
            com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.GranularityAndAttributeActivationException);
   * </pre>
   */
  public com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.CommonIRPConstDefs.Signal create_generic_performance_monitoring (com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPConstDefs.ObservationClass[] observation_class_list, 
                                                                                                                                   com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPConstDefs.ObservationObject[] observation_object_list, 
                                                                                                                                   int granularity_period, 
                                                                                                                                   com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPConstDefs.Schedule schedule, 
                                                                                                                                   int reporting_period, 
                                                                                                                                   com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPConstDefs.Destination destination, 
                                                                                                                                   java.lang.String measurement_name, 
                                                                                                                                   com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPConstDefs.PerformanceMonitoringState performance_monitoring_state, 
                                                                                                                                   org.omg.CORBA.IntHolder performance_monitoring_id, 
                                                                                                                                   com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPConstDefs.FailureInformationHolder failure_information) throws com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.OptionalOperationNotSupportedException, 
                                                                                                                                                                                                                                                                         com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.OptionalParameterNotSupportedException, 
                                                                                                                                                                                                                                                                         com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.InvalidObservationObjectListException, 
                                                                                                                                                                                                                                                                         com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.InvalidObservationClassException, 
                                                                                                                                                                                                                                                                         com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.InvalidGranularityPeriodException, 
                                                                                                                                                                                                                                                                         com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.InvalidParameterException, 
                                                                                                                                                                                                                                                                         com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.InvalidScheduleException, 
                                                                                                                                                                                                                                                                         com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.InvalidReportingPeriodException, 
                                                                                                                                                                                                                                                                         com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.DestinationNotSupportedException, 
                                                                                                                                                                                                                                                                         com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.ProcessingErrorException, 
                                                                                                                                                                                                                                                                         com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.NumberOfCountersExceededException, 
                                                                                                                                                                                                                                                                         com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.NumberOfMonitorsExceededException, 
                                                                                                                                                                                                                                                                         com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.OverloadException, 
                                                                                                                                                                                                                                                                         com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.GranularityNotSupportedException, 
                                                                                                                                                                                                                                                                         com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.GranularityAndAttributeActivationException;

}
