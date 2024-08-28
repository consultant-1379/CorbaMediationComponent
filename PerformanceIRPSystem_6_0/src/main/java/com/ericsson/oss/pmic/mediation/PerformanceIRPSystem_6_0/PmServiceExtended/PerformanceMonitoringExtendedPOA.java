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
public abstract class PerformanceMonitoringExtendedPOA extends org.omg.PortableServer.Servant implements 
org.omg.CORBA.portable.InvokeHandler, com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PmServiceExtended.PerformanceMonitoringExtendedOperations {

  public com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PmServiceExtended.PerformanceMonitoringExtended _this () {
   return com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PmServiceExtended.PerformanceMonitoringExtendedHelper.narrow(super._this_object());
  }

  public com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PmServiceExtended.PerformanceMonitoringExtended _this (org.omg.CORBA.ORB orb) {
    return com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PmServiceExtended.PerformanceMonitoringExtendedHelper.narrow(super._this_object(orb));
  }

  public java.lang.String[] _all_interfaces (final org.omg.PortableServer.POA poa, final byte[] objectId) {
    return __ids;
  }

  private static java.lang.String[] __ids = {
    "IDL:PmServiceExtended/PerformanceMonitoringExtended:1.0",
    "IDL:PerformanceIRPSystem/PerformanceMonitoringOperations:1.0"
  };

  private static java.util.Dictionary _methods = new java.util.Hashtable();

  static {
  _methods.put("create_generic_performance_monitoring", new int[] { 0, 0 });
  _methods.put("filter_performance_monitoring_report_ext", new int[] { 0, 1 });
  _methods.put("lookup_filter_performance_monitoring_report_ext", new int[] { 0, 2 });
  _methods.put("list_performance_monitorings", new int[] { 1, 0 });
  _methods.put("create_performance_monitoring", new int[] { 1, 1 });
  _methods.put("lookup_performance_monitoring", new int[] { 1, 2 });
  _methods.put("delete_performance_monitoring", new int[] { 1, 3 });
  _methods.put("suspend_performance_monitoring", new int[] { 1, 4 });
  _methods.put("resume_performance_monitoring", new int[] { 1, 5 });
  _methods.put("get_performance_monitoring_report", new int[] { 1, 6 });
  _methods.put("filter_performance_monitoring_report", new int[] { 1, 7 });
  _methods.put("lookup_filter_performance_monitoring_report", new int[] { 1, 8 });
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
        return com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PmServiceExtended.PerformanceMonitoringExtendedPOA._invoke(this, method[1], _input, handler);
      }
      case 1: {
        return com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem._PerformanceMonitoringOperationsPOA._invoke(this, method[1], _input, handler);
      }
    }
    throw new org.omg.CORBA.BAD_OPERATION(2, org.omg.CORBA.CompletionStatus.COMPLETED_NO);
  }

  public static org.omg.CORBA.portable.OutputStream _invoke (com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PmServiceExtended.PerformanceMonitoringExtendedOperations _self,
                                                             int _method_id,
                                                             org.omg.CORBA.portable.InputStream _input,
                                                             org.omg.CORBA.portable.ResponseHandler _handler) {
  org.omg.CORBA.portable.OutputStream _output = null;
  {
    switch (_method_id) {
    case 0: {
    try {
      com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPConstDefs.ObservationClass[] observation_class_list;
      observation_class_list = com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPConstDefs.ObservationClassListHelper.read(_input);
      com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPConstDefs.ObservationObject[] observation_object_list;
      observation_object_list = com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPConstDefs.ObservationObjectListHelper.read(_input);
      int granularity_period;
      granularity_period = _input.read_long();
      com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPConstDefs.Schedule schedule;
      schedule = com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPConstDefs.ScheduleHelper.read(_input);
      int reporting_period;
      reporting_period = _input.read_long();
      com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPConstDefs.Destination destination;
      destination = com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPConstDefs.DestinationHelper.read(_input);
      java.lang.String measurement_name;
      measurement_name = _input.read_string();
      com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPConstDefs.PerformanceMonitoringState performance_monitoring_state;
      performance_monitoring_state = com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPConstDefs.PerformanceMonitoringStateHelper.read(_input);
      org.omg.CORBA.IntHolder performance_monitoring_id = new org.omg.CORBA.IntHolder();
      com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPConstDefs.FailureInformationHolder failure_information = new com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPConstDefs.FailureInformationHolder();
      com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.CommonIRPConstDefs.Signal _result = _self.create_generic_performance_monitoring(observation_class_list, 
                                                                                                                                               observation_object_list, 
                                                                                                                                               granularity_period, 
                                                                                                                                               schedule, 
                                                                                                                                               reporting_period, 
                                                                                                                                               destination, 
                                                                                                                                               measurement_name, 
                                                                                                                                               performance_monitoring_state, 
                                                                                                                                               performance_monitoring_id, 
                                                                                                                                               failure_information);
      _output = _handler.createReply();
      com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.CommonIRPConstDefs.SignalHelper.write(_output, _result);
      _output.write_long((int)performance_monitoring_id.value);
      com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPConstDefs.FailureInformationHelper.write(_output, failure_information.value);
    }
    catch (com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.OptionalOperationNotSupportedException _exception) {
      _output = _handler.createExceptionReply();
      com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.OptionalOperationNotSupportedExceptionHelper.write(_output, _exception);
    }
    catch (com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.OptionalParameterNotSupportedException _exception) {
      _output = _handler.createExceptionReply();
      com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.OptionalParameterNotSupportedExceptionHelper.write(_output, _exception);
    }
    catch (com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.InvalidObservationObjectListException _exception) {
      _output = _handler.createExceptionReply();
      com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.InvalidObservationObjectListExceptionHelper.write(_output, _exception);
    }
    catch (com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.InvalidObservationClassException _exception) {
      _output = _handler.createExceptionReply();
      com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.InvalidObservationClassExceptionHelper.write(_output, _exception);
    }
    catch (com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.InvalidGranularityPeriodException _exception) {
      _output = _handler.createExceptionReply();
      com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.InvalidGranularityPeriodExceptionHelper.write(_output, _exception);
    }
    catch (com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.InvalidParameterException _exception) {
      _output = _handler.createExceptionReply();
      com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.InvalidParameterExceptionHelper.write(_output, _exception);
    }
    catch (com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.InvalidScheduleException _exception) {
      _output = _handler.createExceptionReply();
      com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.InvalidScheduleExceptionHelper.write(_output, _exception);
    }
    catch (com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.InvalidReportingPeriodException _exception) {
      _output = _handler.createExceptionReply();
      com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.InvalidReportingPeriodExceptionHelper.write(_output, _exception);
    }
    catch (com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.DestinationNotSupportedException _exception) {
      _output = _handler.createExceptionReply();
      com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.DestinationNotSupportedExceptionHelper.write(_output, _exception);
    }
    catch (com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.ProcessingErrorException _exception) {
      _output = _handler.createExceptionReply();
      com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.ProcessingErrorExceptionHelper.write(_output, _exception);
    }
    catch (com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.NumberOfCountersExceededException _exception) {
      _output = _handler.createExceptionReply();
      com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.NumberOfCountersExceededExceptionHelper.write(_output, _exception);
    }
    catch (com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.NumberOfMonitorsExceededException _exception) {
      _output = _handler.createExceptionReply();
      com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.NumberOfMonitorsExceededExceptionHelper.write(_output, _exception);
    }
    catch (com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.OverloadException _exception) {
      _output = _handler.createExceptionReply();
      com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.OverloadExceptionHelper.write(_output, _exception);
    }
    catch (com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.GranularityNotSupportedException _exception) {
      _output = _handler.createExceptionReply();
      com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.GranularityNotSupportedExceptionHelper.write(_output, _exception);
    }
    catch (com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.GranularityAndAttributeActivationException _exception) {
      _output = _handler.createExceptionReply();
      com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.GranularityAndAttributeActivationExceptionHelper.write(_output, _exception);
    }
      return _output;
    }
    case 1: {
    try {
      int[] performance_monitoring_id_list;
      performance_monitoring_id_list = com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPConstDefs.PerformanceMonitoringIdListHelper.read(_input);
      com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPConstDefs.RecordingType recording_type;
      recording_type = com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPConstDefs.RecordingTypeHelper.read(_input);
      com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPConstDefs.ObservationObject triggering_object;
      triggering_object = com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPConstDefs.ObservationObjectHelper.read(_input);
      com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPConstDefs.ObservationObject[] observation_object_list;
      observation_object_list = com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPConstDefs.ObservationObjectListHelper.read(_input);
      com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPConstDefs.Filter filter;
      filter = com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPConstDefs.FilterHelper.read(_input);
      int[] time_window;
      time_window = com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPConstDefs.TimeWindowHelper.read(_input);
      int sampling_rate;
      sampling_rate = _input.read_long();
      com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PmServiceExtended.OutputMode mode;
      mode = com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PmServiceExtended.OutputModeHelper.read(_input);
      com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PmServiceExtended.DestinationAddress address;
      address = com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PmServiceExtended.DestinationAddressHelper.read(_input);
      java.lang.String trace_reference;
      trace_reference = _input.read_string();
      com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPConstDefs.PerformanceMonitoringIdListHolder bad_performance_monitoring_id_list = new com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPConstDefs.PerformanceMonitoringIdListHolder();
      com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.CommonIRPConstDefs.Signal _result = _self.filter_performance_monitoring_report_ext(performance_monitoring_id_list, 
                                                                                                                                                  recording_type, 
                                                                                                                                                  triggering_object, 
                                                                                                                                                  observation_object_list, 
                                                                                                                                                  filter, 
                                                                                                                                                  time_window, 
                                                                                                                                                  sampling_rate, 
                                                                                                                                                  mode, 
                                                                                                                                                  address, 
                                                                                                                                                  trace_reference, 
                                                                                                                                                  bad_performance_monitoring_id_list);
      _output = _handler.createReply();
      com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.CommonIRPConstDefs.SignalHelper.write(_output, _result);
      com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPConstDefs.PerformanceMonitoringIdListHelper.write(_output, bad_performance_monitoring_id_list.value);
    }
    catch (com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.OptionalOperationNotSupportedException _exception) {
      _output = _handler.createExceptionReply();
      com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.OptionalOperationNotSupportedExceptionHelper.write(_output, _exception);
    }
    catch (com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.OptionalParameterNotSupportedException _exception) {
      _output = _handler.createExceptionReply();
      com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.OptionalParameterNotSupportedExceptionHelper.write(_output, _exception);
    }
    catch (com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.InvalidPerformanceMonitoringTypeException _exception) {
      _output = _handler.createExceptionReply();
      com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.InvalidPerformanceMonitoringTypeExceptionHelper.write(_output, _exception);
    }
    catch (com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.ProcessingErrorException _exception) {
      _output = _handler.createExceptionReply();
      com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.ProcessingErrorExceptionHelper.write(_output, _exception);
    }
    catch (com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.InvalidParameterException _exception) {
      _output = _handler.createExceptionReply();
      com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.InvalidParameterExceptionHelper.write(_output, _exception);
    }
    catch (com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.InvalidObservationObjectListException _exception) {
      _output = _handler.createExceptionReply();
      com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.InvalidObservationObjectListExceptionHelper.write(_output, _exception);
    }
    catch (com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.InvalidFilterException _exception) {
      _output = _handler.createExceptionReply();
      com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.InvalidFilterExceptionHelper.write(_output, _exception);
    }
    catch (com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.InvalidTriggeringObjectException _exception) {
      _output = _handler.createExceptionReply();
      com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.InvalidTriggeringObjectExceptionHelper.write(_output, _exception);
    }
      return _output;
    }
    case 2: {
    try {
      int performance_monitoring_id;
      performance_monitoring_id = _input.read_long();
      com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPConstDefs.RecordingTypeHolder recording_type = new com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPConstDefs.RecordingTypeHolder();
      com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPConstDefs.ObservationObjectHolder triggering_object = new com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPConstDefs.ObservationObjectHolder();
      com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPConstDefs.ObservationObjectListHolder observation_object_list = new com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPConstDefs.ObservationObjectListHolder();
      com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPConstDefs.FilterHolder filter = new com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPConstDefs.FilterHolder();
      com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPConstDefs.TimeWindowHolder time_window = new com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPConstDefs.TimeWindowHolder();
      org.omg.CORBA.IntHolder sampling_rate = new org.omg.CORBA.IntHolder();
      com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PmServiceExtended.OutputModeHolder mode = new com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PmServiceExtended.OutputModeHolder();
      com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PmServiceExtended.DestinationAddressHolder address = new com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PmServiceExtended.DestinationAddressHolder();
      org.omg.CORBA.StringHolder trace_reference = new org.omg.CORBA.StringHolder();
      com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.CommonIRPConstDefs.Signal _result = _self.lookup_filter_performance_monitoring_report_ext(performance_monitoring_id, 
                                                                                                                                                         recording_type, 
                                                                                                                                                         triggering_object, 
                                                                                                                                                         observation_object_list, 
                                                                                                                                                         filter, 
                                                                                                                                                         time_window, 
                                                                                                                                                         sampling_rate, 
                                                                                                                                                         mode, 
                                                                                                                                                         address, 
                                                                                                                                                         trace_reference);
      _output = _handler.createReply();
      com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.CommonIRPConstDefs.SignalHelper.write(_output, _result);
      com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPConstDefs.RecordingTypeHelper.write(_output, recording_type.value);
      if (triggering_object.value == null) {
        throw new org.omg.CORBA.BAD_PARAM("Invalid array length");
      }
      com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPConstDefs.ObservationObjectHelper.write(_output, triggering_object.value);
      com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPConstDefs.ObservationObjectListHelper.write(_output, observation_object_list.value);
      if (filter.value == null) {
        throw new org.omg.CORBA.BAD_PARAM("Invalid array length");
      }
      com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPConstDefs.FilterHelper.write(_output, filter.value);
      com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPConstDefs.TimeWindowHelper.write(_output, time_window.value);
      _output.write_long((int)sampling_rate.value);
      com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PmServiceExtended.OutputModeHelper.write(_output, mode.value);
      if (address.value == null) {
        throw new org.omg.CORBA.BAD_PARAM("Invalid array length");
      }
      com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PmServiceExtended.DestinationAddressHelper.write(_output, address.value);
      _output.write_string((java.lang.String)trace_reference.value);
    }
    catch (com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.OptionalOperationNotSupportedException _exception) {
      _output = _handler.createExceptionReply();
      com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.OptionalOperationNotSupportedExceptionHelper.write(_output, _exception);
    }
    catch (com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.NoSuchIdException _exception) {
      _output = _handler.createExceptionReply();
      com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.NoSuchIdExceptionHelper.write(_output, _exception);
    }
    catch (com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.InvalidPerformanceMonitoringTypeException _exception) {
      _output = _handler.createExceptionReply();
      com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.InvalidPerformanceMonitoringTypeExceptionHelper.write(_output, _exception);
    }
    catch (com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.ProcessingErrorException _exception) {
      _output = _handler.createExceptionReply();
      com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.ProcessingErrorExceptionHelper.write(_output, _exception);
    }
    catch (com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.InvalidParameterException _exception) {
      _output = _handler.createExceptionReply();
      com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.InvalidParameterExceptionHelper.write(_output, _exception);
    }
      return _output;
    }
    }
    throw new org.omg.CORBA.BAD_OPERATION(2, org.omg.CORBA.CompletionStatus.COMPLETED_NO);
  }
  }
}
