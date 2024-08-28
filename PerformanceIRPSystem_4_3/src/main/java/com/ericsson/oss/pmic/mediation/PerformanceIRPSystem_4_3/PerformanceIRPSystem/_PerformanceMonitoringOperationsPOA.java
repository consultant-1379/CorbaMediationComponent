package com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPSystem;

/**
 * <ul>
 * <li> <b>IDL Source</b>    "C:/MicroFocus/VisiBroker/bin/PerformanceIRPSystem_4_3/PerformanceIRPSystem.idl"
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
public abstract class _PerformanceMonitoringOperationsPOA extends org.omg.PortableServer.Servant implements 
org.omg.CORBA.portable.InvokeHandler, com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPSystem._PerformanceMonitoringOperationsOperations {

  public com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPSystem._PerformanceMonitoringOperations _this () {
   return com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPSystem._PerformanceMonitoringOperationsHelper.narrow(super._this_object());
  }

  public com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPSystem._PerformanceMonitoringOperations _this (org.omg.CORBA.ORB orb) {
    return com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPSystem._PerformanceMonitoringOperationsHelper.narrow(super._this_object(orb));
  }

  public java.lang.String[] _all_interfaces (final org.omg.PortableServer.POA poa, final byte[] objectId) {
    return __ids;
  }

  private static java.lang.String[] __ids = {
    "IDL:PerformanceIRPSystem/PerformanceMonitoringOperations:1.0"
  };

  private static java.util.Dictionary _methods = new java.util.Hashtable();

  static {
  _methods.put("list_performance_monitorings", new int[] { 0, 0 });
  _methods.put("create_performance_monitoring", new int[] { 0, 1 });
  _methods.put("lookup_performance_monitoring", new int[] { 0, 2 });
  _methods.put("delete_performance_monitoring", new int[] { 0, 3 });
  _methods.put("suspend_performance_monitoring", new int[] { 0, 4 });
  _methods.put("resume_performance_monitoring", new int[] { 0, 5 });
  _methods.put("get_performance_monitoring_report", new int[] { 0, 6 });
  _methods.put("filter_performance_monitoring_report", new int[] { 0, 7 });
  _methods.put("lookup_filter_performance_monitoring_report", new int[] { 0, 8 });
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
        return com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPSystem._PerformanceMonitoringOperationsPOA._invoke(this, method[1], _input, handler);
      }
    }
    throw new org.omg.CORBA.BAD_OPERATION(2, org.omg.CORBA.CompletionStatus.COMPLETED_NO);
  }

  public static org.omg.CORBA.portable.OutputStream _invoke (com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPSystem._PerformanceMonitoringOperationsOperations _self,
                                                             int _method_id,
                                                             org.omg.CORBA.portable.InputStream _input,
                                                             org.omg.CORBA.portable.ResponseHandler _handler) {
  org.omg.CORBA.portable.OutputStream _output = null;
  {
    switch (_method_id) {
    case 0: {
    try {
      java.lang.String[] ne_list;
      ne_list = com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPConstDefs.NeListHelper.read(_input);
      com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPConstDefs.PerformanceMonitoringListHolder performance_monitoring_list = new com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPConstDefs.PerformanceMonitoringListHolder();
      com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.CommonIRPConstDefs.Signal _result = _self.list_performance_monitorings(ne_list, 
                                                                                                                                      performance_monitoring_list);
      _output = _handler.createReply();
      com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.CommonIRPConstDefs.SignalHelper.write(_output, _result);
      com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPConstDefs.PerformanceMonitoringListHelper.write(_output, performance_monitoring_list.value);
    }
    catch (com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPSystem.OptionalOperationNotSupportedException _exception) {
      _output = _handler.createExceptionReply();
      com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPSystem.OptionalOperationNotSupportedExceptionHelper.write(_output, _exception);
    }
    catch (com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPSystem.OptionalParameterNotSupportedException _exception) {
      _output = _handler.createExceptionReply();
      com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPSystem.OptionalParameterNotSupportedExceptionHelper.write(_output, _exception);
    }
    catch (com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPSystem.InvalidNetworkElement _exception) {
      _output = _handler.createExceptionReply();
      com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPSystem.InvalidNetworkElementHelper.write(_output, _exception);
    }
    catch (com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPSystem.InvalidParameterException _exception) {
      _output = _handler.createExceptionReply();
      com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPSystem.InvalidParameterExceptionHelper.write(_output, _exception);
    }
      return _output;
    }
    case 1: {
    try {
      com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPConstDefs.ObservationClass[] observation_class_list;
      observation_class_list = com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPConstDefs.ObservationClassListHelper.read(_input);
      com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPConstDefs.ObservationObject[] observation_object_list;
      observation_object_list = com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPConstDefs.ObservationObjectListHelper.read(_input);
      int granularity_period;
      granularity_period = _input.read_long();
      com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPConstDefs.Schedule schedule;
      schedule = com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPConstDefs.ScheduleHelper.read(_input);
      int reporting_period;
      reporting_period = _input.read_long();
      com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPConstDefs.Destination destination;
      destination = com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPConstDefs.DestinationHelper.read(_input);
      java.lang.String measurement_name;
      measurement_name = _input.read_string();
      com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPConstDefs.PerformanceMonitoringState performance_monitoring_state;
      performance_monitoring_state = com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPConstDefs.PerformanceMonitoringStateHelper.read(_input);
      org.omg.CORBA.IntHolder performance_monitoring_id = new org.omg.CORBA.IntHolder();
      com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPConstDefs.FailureInformationHolder failure_information = new com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPConstDefs.FailureInformationHolder();
      com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.CommonIRPConstDefs.Signal _result = _self.create_performance_monitoring(observation_class_list, 
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
      com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.CommonIRPConstDefs.SignalHelper.write(_output, _result);
      _output.write_long((int)performance_monitoring_id.value);
      com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPConstDefs.FailureInformationHelper.write(_output, failure_information.value);
    }
    catch (com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPSystem.OptionalOperationNotSupportedException _exception) {
      _output = _handler.createExceptionReply();
      com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPSystem.OptionalOperationNotSupportedExceptionHelper.write(_output, _exception);
    }
    catch (com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPSystem.OptionalParameterNotSupportedException _exception) {
      _output = _handler.createExceptionReply();
      com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPSystem.OptionalParameterNotSupportedExceptionHelper.write(_output, _exception);
    }
    catch (com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPSystem.InvalidObservationObjectListException _exception) {
      _output = _handler.createExceptionReply();
      com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPSystem.InvalidObservationObjectListExceptionHelper.write(_output, _exception);
    }
    catch (com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPSystem.InvalidObservationClassException _exception) {
      _output = _handler.createExceptionReply();
      com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPSystem.InvalidObservationClassExceptionHelper.write(_output, _exception);
    }
    catch (com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPSystem.InvalidGranularityPeriodException _exception) {
      _output = _handler.createExceptionReply();
      com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPSystem.InvalidGranularityPeriodExceptionHelper.write(_output, _exception);
    }
    catch (com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPSystem.InvalidParameterException _exception) {
      _output = _handler.createExceptionReply();
      com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPSystem.InvalidParameterExceptionHelper.write(_output, _exception);
    }
    catch (com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPSystem.InvalidScheduleException _exception) {
      _output = _handler.createExceptionReply();
      com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPSystem.InvalidScheduleExceptionHelper.write(_output, _exception);
    }
    catch (com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPSystem.InvalidReportingPeriodException _exception) {
      _output = _handler.createExceptionReply();
      com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPSystem.InvalidReportingPeriodExceptionHelper.write(_output, _exception);
    }
    catch (com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPSystem.DestinationNotSupportedException _exception) {
      _output = _handler.createExceptionReply();
      com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPSystem.DestinationNotSupportedExceptionHelper.write(_output, _exception);
    }
    catch (com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPSystem.ProcessingErrorException _exception) {
      _output = _handler.createExceptionReply();
      com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPSystem.ProcessingErrorExceptionHelper.write(_output, _exception);
    }
    catch (com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPSystem.NumberOfCountersExceededException _exception) {
      _output = _handler.createExceptionReply();
      com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPSystem.NumberOfCountersExceededExceptionHelper.write(_output, _exception);
    }
    catch (com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPSystem.NumberOfMonitorsExceededException _exception) {
      _output = _handler.createExceptionReply();
      com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPSystem.NumberOfMonitorsExceededExceptionHelper.write(_output, _exception);
    }
    catch (com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPSystem.OverloadException _exception) {
      _output = _handler.createExceptionReply();
      com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPSystem.OverloadExceptionHelper.write(_output, _exception);
    }
    catch (com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPSystem.GranularityNotSupportedException _exception) {
      _output = _handler.createExceptionReply();
      com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPSystem.GranularityNotSupportedExceptionHelper.write(_output, _exception);
    }
    catch (com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPSystem.GranularityAndAttributeActivationException _exception) {
      _output = _handler.createExceptionReply();
      com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPSystem.GranularityAndAttributeActivationExceptionHelper.write(_output, _exception);
    }
      return _output;
    }
    case 2: {
    try {
      int performance_monitoring_id;
      performance_monitoring_id = _input.read_long();
      com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPConstDefs.ObservationClassListHolder observation_class_list = new com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPConstDefs.ObservationClassListHolder();
      com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPConstDefs.ObservationObjectListHolder observation_object_list = new com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPConstDefs.ObservationObjectListHolder();
      org.omg.CORBA.IntHolder granularity_period = new org.omg.CORBA.IntHolder();
      com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPConstDefs.ScheduleHolder schedule = new com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPConstDefs.ScheduleHolder();
      org.omg.CORBA.IntHolder reporting_period = new org.omg.CORBA.IntHolder();
      com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPConstDefs.DestinationHolder destination = new com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPConstDefs.DestinationHolder();
      com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPConstDefs.PerformanceMonitoringStateHolder performance_monitoring_state = new com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPConstDefs.PerformanceMonitoringStateHolder();
      org.omg.CORBA.StringHolder measurement_name = new org.omg.CORBA.StringHolder();
      com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.CommonIRPConstDefs.Signal _result = _self.lookup_performance_monitoring(performance_monitoring_id, 
                                                                                                                                       observation_class_list, 
                                                                                                                                       observation_object_list, 
                                                                                                                                       granularity_period, 
                                                                                                                                       schedule, 
                                                                                                                                       reporting_period, 
                                                                                                                                       destination, 
                                                                                                                                       performance_monitoring_state, 
                                                                                                                                       measurement_name);
      _output = _handler.createReply();
      com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.CommonIRPConstDefs.SignalHelper.write(_output, _result);
      com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPConstDefs.ObservationClassListHelper.write(_output, observation_class_list.value);
      com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPConstDefs.ObservationObjectListHelper.write(_output, observation_object_list.value);
      _output.write_long((int)granularity_period.value);
      if (schedule.value == null) {
        throw new org.omg.CORBA.BAD_PARAM("Invalid array length");
      }
      com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPConstDefs.ScheduleHelper.write(_output, schedule.value);
      _output.write_long((int)reporting_period.value);
      com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPConstDefs.DestinationHelper.write(_output, destination.value);
      com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPConstDefs.PerformanceMonitoringStateHelper.write(_output, performance_monitoring_state.value);
      _output.write_string((java.lang.String)measurement_name.value);
    }
    catch (com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPSystem.OptionalOperationNotSupportedException _exception) {
      _output = _handler.createExceptionReply();
      com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPSystem.OptionalOperationNotSupportedExceptionHelper.write(_output, _exception);
    }
    catch (com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPSystem.NoSuchIdException _exception) {
      _output = _handler.createExceptionReply();
      com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPSystem.NoSuchIdExceptionHelper.write(_output, _exception);
    }
    catch (com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPSystem.ProcessingErrorException _exception) {
      _output = _handler.createExceptionReply();
      com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPSystem.ProcessingErrorExceptionHelper.write(_output, _exception);
    }
    catch (com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPSystem.InvalidParameterException _exception) {
      _output = _handler.createExceptionReply();
      com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPSystem.InvalidParameterExceptionHelper.write(_output, _exception);
    }
      return _output;
    }
    case 3: {
    try {
      int performance_monitoring_id;
      performance_monitoring_id = _input.read_long();
      com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.CommonIRPConstDefs.Signal _result = _self.delete_performance_monitoring(performance_monitoring_id);
      _output = _handler.createReply();
      com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.CommonIRPConstDefs.SignalHelper.write(_output, _result);
    }
    catch (com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPSystem.OptionalOperationNotSupportedException _exception) {
      _output = _handler.createExceptionReply();
      com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPSystem.OptionalOperationNotSupportedExceptionHelper.write(_output, _exception);
    }
    catch (com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPSystem.NoSuchIdException _exception) {
      _output = _handler.createExceptionReply();
      com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPSystem.NoSuchIdExceptionHelper.write(_output, _exception);
    }
    catch (com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPSystem.ProcessingErrorException _exception) {
      _output = _handler.createExceptionReply();
      com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPSystem.ProcessingErrorExceptionHelper.write(_output, _exception);
    }
    catch (com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPSystem.InvalidPerformanceMonitoringTypeException _exception) {
      _output = _handler.createExceptionReply();
      com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPSystem.InvalidPerformanceMonitoringTypeExceptionHelper.write(_output, _exception);
    }
    catch (com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPSystem.InvalidParameterException _exception) {
      _output = _handler.createExceptionReply();
      com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPSystem.InvalidParameterExceptionHelper.write(_output, _exception);
    }
      return _output;
    }
    case 4: {
    try {
      int[] performance_monitoring_id_list;
      performance_monitoring_id_list = com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPConstDefs.PerformanceMonitoringIdListHelper.read(_input);
      com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPConstDefs.PerformanceMonitoringIdListHolder bad_performance_monitoring_id_list = new com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPConstDefs.PerformanceMonitoringIdListHolder();
      com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.CommonIRPConstDefs.Signal _result = _self.suspend_performance_monitoring(performance_monitoring_id_list, 
                                                                                                                                        bad_performance_monitoring_id_list);
      _output = _handler.createReply();
      com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.CommonIRPConstDefs.SignalHelper.write(_output, _result);
      com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPConstDefs.PerformanceMonitoringIdListHelper.write(_output, bad_performance_monitoring_id_list.value);
    }
    catch (com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPSystem.OptionalOperationNotSupportedException _exception) {
      _output = _handler.createExceptionReply();
      com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPSystem.OptionalOperationNotSupportedExceptionHelper.write(_output, _exception);
    }
    catch (com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPSystem.ProcessingErrorException _exception) {
      _output = _handler.createExceptionReply();
      com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPSystem.ProcessingErrorExceptionHelper.write(_output, _exception);
    }
    catch (com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPSystem.NoSuchIdException _exception) {
      _output = _handler.createExceptionReply();
      com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPSystem.NoSuchIdExceptionHelper.write(_output, _exception);
    }
    catch (com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPSystem.InvalidParameterException _exception) {
      _output = _handler.createExceptionReply();
      com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPSystem.InvalidParameterExceptionHelper.write(_output, _exception);
    }
      return _output;
    }
    case 5: {
    try {
      int[] performance_monitoring_id_list;
      performance_monitoring_id_list = com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPConstDefs.PerformanceMonitoringIdListHelper.read(_input);
      com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPConstDefs.PerformanceMonitoringIdListHolder bad_performance_monitoring_list = new com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPConstDefs.PerformanceMonitoringIdListHolder();
      com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPConstDefs.PerformanceMonitoringIdListHolder rejected_performance_monitoring_list = new com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPConstDefs.PerformanceMonitoringIdListHolder();
      com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.CommonIRPConstDefs.Signal _result = _self.resume_performance_monitoring(performance_monitoring_id_list, 
                                                                                                                                       bad_performance_monitoring_list, 
                                                                                                                                       rejected_performance_monitoring_list);
      _output = _handler.createReply();
      com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.CommonIRPConstDefs.SignalHelper.write(_output, _result);
      com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPConstDefs.PerformanceMonitoringIdListHelper.write(_output, bad_performance_monitoring_list.value);
      com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPConstDefs.PerformanceMonitoringIdListHelper.write(_output, rejected_performance_monitoring_list.value);
    }
    catch (com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPSystem.OptionalOperationNotSupportedException _exception) {
      _output = _handler.createExceptionReply();
      com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPSystem.OptionalOperationNotSupportedExceptionHelper.write(_output, _exception);
    }
    catch (com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPSystem.ProcessingErrorException _exception) {
      _output = _handler.createExceptionReply();
      com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPSystem.ProcessingErrorExceptionHelper.write(_output, _exception);
    }
    catch (com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPSystem.NumberOfCountersExceededException _exception) {
      _output = _handler.createExceptionReply();
      com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPSystem.NumberOfCountersExceededExceptionHelper.write(_output, _exception);
    }
    catch (com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPSystem.NumberOfMonitorsExceededException _exception) {
      _output = _handler.createExceptionReply();
      com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPSystem.NumberOfMonitorsExceededExceptionHelper.write(_output, _exception);
    }
    catch (com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPSystem.InvalidParameterException _exception) {
      _output = _handler.createExceptionReply();
      com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPSystem.InvalidParameterExceptionHelper.write(_output, _exception);
    }
    catch (com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPSystem.NoSuchIdException _exception) {
      _output = _handler.createExceptionReply();
      com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPSystem.NoSuchIdExceptionHelper.write(_output, _exception);
    }
    catch (com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPSystem.OverloadException _exception) {
      _output = _handler.createExceptionReply();
      com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPSystem.OverloadExceptionHelper.write(_output, _exception);
    }
    catch (com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPSystem.GranularityAndAttributeActivationException _exception) {
      _output = _handler.createExceptionReply();
      com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPSystem.GranularityAndAttributeActivationExceptionHelper.write(_output, _exception);
    }
      return _output;
    }
    case 6: {
    try {
      int performance_monitoring_id;
      performance_monitoring_id = _input.read_long();
      com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPConstDefs.PerformanceMonitoringReportHolder performance_monitoring_report = new com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPConstDefs.PerformanceMonitoringReportHolder();
      com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.CommonIRPConstDefs.Signal _result = _self.get_performance_monitoring_report(performance_monitoring_id, 
                                                                                                                                           performance_monitoring_report);
      _output = _handler.createReply();
      com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.CommonIRPConstDefs.SignalHelper.write(_output, _result);
      if (performance_monitoring_report.value == null) {
        throw new org.omg.CORBA.BAD_PARAM("Invalid array length");
      }
      com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPConstDefs.PerformanceMonitoringReportHelper.write(_output, performance_monitoring_report.value);
    }
    catch (com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPSystem.OptionalOperationNotSupportedException _exception) {
      _output = _handler.createExceptionReply();
      com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPSystem.OptionalOperationNotSupportedExceptionHelper.write(_output, _exception);
    }
    catch (com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPSystem.ProcessingErrorException _exception) {
      _output = _handler.createExceptionReply();
      com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPSystem.ProcessingErrorExceptionHelper.write(_output, _exception);
    }
    catch (com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPSystem.NoSuchIdException _exception) {
      _output = _handler.createExceptionReply();
      com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPSystem.NoSuchIdExceptionHelper.write(_output, _exception);
    }
    catch (com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPSystem.InvalidParameterException _exception) {
      _output = _handler.createExceptionReply();
      com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPSystem.InvalidParameterExceptionHelper.write(_output, _exception);
    }
      return _output;
    }
    case 7: {
    try {
      int[] performance_monitoring_id_list;
      performance_monitoring_id_list = com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPConstDefs.PerformanceMonitoringIdListHelper.read(_input);
      com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPConstDefs.RecordingType recording_type;
      recording_type = com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPConstDefs.RecordingTypeHelper.read(_input);
      com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPConstDefs.ObservationObject triggering_object;
      triggering_object = com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPConstDefs.ObservationObjectHelper.read(_input);
      com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPConstDefs.ObservationObject[] observation_object_list;
      observation_object_list = com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPConstDefs.ObservationObjectListHelper.read(_input);
      com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPConstDefs.Filter filter;
      filter = com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPConstDefs.FilterHelper.read(_input);
      int[] time_window;
      time_window = com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPConstDefs.TimeWindowHelper.read(_input);
      int sampling_rate;
      sampling_rate = _input.read_long();
      com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPConstDefs.PerformanceMonitoringIdListHolder bad_performance_monitoring_id_list = new com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPConstDefs.PerformanceMonitoringIdListHolder();
      com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.CommonIRPConstDefs.Signal _result = _self.filter_performance_monitoring_report(performance_monitoring_id_list, 
                                                                                                                                              recording_type, 
                                                                                                                                              triggering_object, 
                                                                                                                                              observation_object_list, 
                                                                                                                                              filter, 
                                                                                                                                              time_window, 
                                                                                                                                              sampling_rate, 
                                                                                                                                              bad_performance_monitoring_id_list);
      _output = _handler.createReply();
      com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.CommonIRPConstDefs.SignalHelper.write(_output, _result);
      com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPConstDefs.PerformanceMonitoringIdListHelper.write(_output, bad_performance_monitoring_id_list.value);
    }
    catch (com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPSystem.OptionalOperationNotSupportedException _exception) {
      _output = _handler.createExceptionReply();
      com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPSystem.OptionalOperationNotSupportedExceptionHelper.write(_output, _exception);
    }
    catch (com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPSystem.OptionalParameterNotSupportedException _exception) {
      _output = _handler.createExceptionReply();
      com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPSystem.OptionalParameterNotSupportedExceptionHelper.write(_output, _exception);
    }
    catch (com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPSystem.InvalidPerformanceMonitoringTypeException _exception) {
      _output = _handler.createExceptionReply();
      com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPSystem.InvalidPerformanceMonitoringTypeExceptionHelper.write(_output, _exception);
    }
    catch (com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPSystem.ProcessingErrorException _exception) {
      _output = _handler.createExceptionReply();
      com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPSystem.ProcessingErrorExceptionHelper.write(_output, _exception);
    }
    catch (com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPSystem.InvalidParameterException _exception) {
      _output = _handler.createExceptionReply();
      com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPSystem.InvalidParameterExceptionHelper.write(_output, _exception);
    }
    catch (com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPSystem.InvalidObservationObjectListException _exception) {
      _output = _handler.createExceptionReply();
      com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPSystem.InvalidObservationObjectListExceptionHelper.write(_output, _exception);
    }
    catch (com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPSystem.InvalidFilterException _exception) {
      _output = _handler.createExceptionReply();
      com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPSystem.InvalidFilterExceptionHelper.write(_output, _exception);
    }
    catch (com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPSystem.InvalidTriggeringObjectException _exception) {
      _output = _handler.createExceptionReply();
      com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPSystem.InvalidTriggeringObjectExceptionHelper.write(_output, _exception);
    }
      return _output;
    }
    case 8: {
    try {
      int performance_monitoring_id;
      performance_monitoring_id = _input.read_long();
      com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPConstDefs.RecordingTypeHolder recording_type = new com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPConstDefs.RecordingTypeHolder();
      com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPConstDefs.ObservationObjectHolder triggering_object = new com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPConstDefs.ObservationObjectHolder();
      com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPConstDefs.ObservationObjectListHolder observation_object_list = new com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPConstDefs.ObservationObjectListHolder();
      com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPConstDefs.FilterHolder filter = new com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPConstDefs.FilterHolder();
      com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPConstDefs.TimeWindowHolder time_window = new com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPConstDefs.TimeWindowHolder();
      org.omg.CORBA.IntHolder sampling_rate = new org.omg.CORBA.IntHolder();
      com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.CommonIRPConstDefs.Signal _result = _self.lookup_filter_performance_monitoring_report(performance_monitoring_id, 
                                                                                                                                                     recording_type, 
                                                                                                                                                     triggering_object, 
                                                                                                                                                     observation_object_list, 
                                                                                                                                                     filter, 
                                                                                                                                                     time_window, 
                                                                                                                                                     sampling_rate);
      _output = _handler.createReply();
      com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.CommonIRPConstDefs.SignalHelper.write(_output, _result);
      com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPConstDefs.RecordingTypeHelper.write(_output, recording_type.value);
      if (triggering_object.value == null) {
        throw new org.omg.CORBA.BAD_PARAM("Invalid array length");
      }
      com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPConstDefs.ObservationObjectHelper.write(_output, triggering_object.value);
      com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPConstDefs.ObservationObjectListHelper.write(_output, observation_object_list.value);
      if (filter.value == null) {
        throw new org.omg.CORBA.BAD_PARAM("Invalid array length");
      }
      com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPConstDefs.FilterHelper.write(_output, filter.value);
      com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPConstDefs.TimeWindowHelper.write(_output, time_window.value);
      _output.write_long((int)sampling_rate.value);
    }
    catch (com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPSystem.OptionalOperationNotSupportedException _exception) {
      _output = _handler.createExceptionReply();
      com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPSystem.OptionalOperationNotSupportedExceptionHelper.write(_output, _exception);
    }
    catch (com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPSystem.NoSuchIdException _exception) {
      _output = _handler.createExceptionReply();
      com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPSystem.NoSuchIdExceptionHelper.write(_output, _exception);
    }
    catch (com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPSystem.InvalidPerformanceMonitoringTypeException _exception) {
      _output = _handler.createExceptionReply();
      com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPSystem.InvalidPerformanceMonitoringTypeExceptionHelper.write(_output, _exception);
    }
    catch (com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPSystem.ProcessingErrorException _exception) {
      _output = _handler.createExceptionReply();
      com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPSystem.ProcessingErrorExceptionHelper.write(_output, _exception);
    }
    catch (com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPSystem.InvalidParameterException _exception) {
      _output = _handler.createExceptionReply();
      com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_4_3.PerformanceIRPSystem.InvalidParameterExceptionHelper.write(_output, _exception);
    }
      return _output;
    }
    }
    throw new org.omg.CORBA.BAD_OPERATION(2, org.omg.CORBA.CompletionStatus.COMPLETED_NO);
  }
  }
}
