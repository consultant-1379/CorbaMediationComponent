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
public abstract class _ThresholdOperationsPOA extends org.omg.PortableServer.Servant implements 
org.omg.CORBA.portable.InvokeHandler, com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem._ThresholdOperationsOperations {

  public com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem._ThresholdOperations _this () {
   return com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem._ThresholdOperationsHelper.narrow(super._this_object());
  }

  public com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem._ThresholdOperations _this (org.omg.CORBA.ORB orb) {
    return com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem._ThresholdOperationsHelper.narrow(super._this_object(orb));
  }

  public java.lang.String[] _all_interfaces (final org.omg.PortableServer.POA poa, final byte[] objectId) {
    return __ids;
  }

  private static java.lang.String[] __ids = {
    "IDL:PerformanceIRPSystem/ThresholdOperations:1.0"
  };

  private static java.util.Dictionary _methods = new java.util.Hashtable();

  static {
  _methods.put("list_thresholds", new int[] { 0, 0 });
  _methods.put("create_threshold", new int[] { 0, 1 });
  _methods.put("lookup_threshold", new int[] { 0, 2 });
  _methods.put("delete_threshold", new int[] { 0, 3 });
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
        return com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem._ThresholdOperationsPOA._invoke(this, method[1], _input, handler);
      }
    }
    throw new org.omg.CORBA.BAD_OPERATION(2, org.omg.CORBA.CompletionStatus.COMPLETED_NO);
  }

  public static org.omg.CORBA.portable.OutputStream _invoke (com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem._ThresholdOperationsOperations _self,
                                                             int _method_id,
                                                             org.omg.CORBA.portable.InputStream _input,
                                                             org.omg.CORBA.portable.ResponseHandler _handler) {
  org.omg.CORBA.portable.OutputStream _output = null;
  {
    switch (_method_id) {
    case 0: {
    try {
      java.lang.String[] ne_list;
      ne_list = com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPConstDefs.NeListHelper.read(_input);
      com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPConstDefs.IdSeqHolder threshold_list = new com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPConstDefs.IdSeqHolder();
      com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.CommonIRPConstDefs.Signal _result = _self.list_thresholds(ne_list, 
                                                                                                                         threshold_list);
      _output = _handler.createReply();
      com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.CommonIRPConstDefs.SignalHelper.write(_output, _result);
      com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPConstDefs.IdSeqHelper.write(_output, threshold_list.value);
    }
    catch (com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem.OptionalOperationNotSupportedException _exception) {
      _output = _handler.createExceptionReply();
      com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem.OptionalOperationNotSupportedExceptionHelper.write(_output, _exception);
    }
    catch (com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem.OptionalParameterNotSupportedException _exception) {
      _output = _handler.createExceptionReply();
      com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem.OptionalParameterNotSupportedExceptionHelper.write(_output, _exception);
    }
      return _output;
    }
    case 1: {
    try {
      java.lang.String observation_class;
      observation_class = _input.read_string();
      java.lang.String[] observed_object_list;
      observed_object_list = com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPConstDefs.InstanceListHelper.read(_input);
      int granularity_period;
      granularity_period = _input.read_long();
      java.lang.String threshold_attribute;
      threshold_attribute = _input.read_string();
      com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPConstDefs.AttrValue threshold_value;
      threshold_value = com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPConstDefs.AttrValueHelper.read(_input);
      com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPConstDefs.AttrValue hysteresis;
      hysteresis = com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPConstDefs.AttrValueHelper.read(_input);
      com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPConstDefs.Direction direction;
      direction = com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPConstDefs.DirectionHelper.read(_input);
      java.lang.String type;
      type = _input.read_string();
      java.lang.String perceived_severity;
      perceived_severity = _input.read_string();
      java.lang.String probable_cause;
      probable_cause = _input.read_string();
      java.lang.String specific_problem;
      specific_problem = _input.read_string();
      org.omg.CORBA.StringHolder threshold_data_id = new org.omg.CORBA.StringHolder();
      com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.CommonIRPConstDefs.Signal _result = _self.create_threshold(observation_class, 
                                                                                                                          observed_object_list, 
                                                                                                                          granularity_period, 
                                                                                                                          threshold_attribute, 
                                                                                                                          threshold_value, 
                                                                                                                          hysteresis, 
                                                                                                                          direction, 
                                                                                                                          type, 
                                                                                                                          perceived_severity, 
                                                                                                                          probable_cause, 
                                                                                                                          specific_problem, 
                                                                                                                          threshold_data_id);
      _output = _handler.createReply();
      com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.CommonIRPConstDefs.SignalHelper.write(_output, _result);
      _output.write_string((java.lang.String)threshold_data_id.value);
    }
    catch (com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem.OptionalOperationNotSupportedException _exception) {
      _output = _handler.createExceptionReply();
      com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem.OptionalOperationNotSupportedExceptionHelper.write(_output, _exception);
    }
    catch (com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem.OptionalParameterNotSupportedException _exception) {
      _output = _handler.createExceptionReply();
      com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem.OptionalParameterNotSupportedExceptionHelper.write(_output, _exception);
    }
      return _output;
    }
    case 2: {
    try {
      java.lang.String threshold_data_id;
      threshold_data_id = _input.read_string();
      org.omg.CORBA.StringHolder observed_object_class = new org.omg.CORBA.StringHolder();
      com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPConstDefs.InstanceListHolder observed_object_list = new com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPConstDefs.InstanceListHolder();
      org.omg.CORBA.IntHolder granularity_period = new org.omg.CORBA.IntHolder();
      org.omg.CORBA.StringHolder threshold_attribute = new org.omg.CORBA.StringHolder();
      com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPConstDefs.AttrValueHolder threshold_value = new com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPConstDefs.AttrValueHolder();
      com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPConstDefs.AttrValueHolder hysteresis = new com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPConstDefs.AttrValueHolder();
      com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPConstDefs.DirectionHolder direction = new com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPConstDefs.DirectionHolder();
      org.omg.CORBA.StringHolder type = new org.omg.CORBA.StringHolder();
      org.omg.CORBA.StringHolder perceived_severity = new org.omg.CORBA.StringHolder();
      org.omg.CORBA.StringHolder probable_cause = new org.omg.CORBA.StringHolder();
      org.omg.CORBA.StringHolder specific_problem = new org.omg.CORBA.StringHolder();
      com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.CommonIRPConstDefs.Signal _result = _self.lookup_threshold(threshold_data_id, 
                                                                                                                          observed_object_class, 
                                                                                                                          observed_object_list, 
                                                                                                                          granularity_period, 
                                                                                                                          threshold_attribute, 
                                                                                                                          threshold_value, 
                                                                                                                          hysteresis, 
                                                                                                                          direction, 
                                                                                                                          type, 
                                                                                                                          perceived_severity, 
                                                                                                                          probable_cause, 
                                                                                                                          specific_problem);
      _output = _handler.createReply();
      com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.CommonIRPConstDefs.SignalHelper.write(_output, _result);
      _output.write_string((java.lang.String)observed_object_class.value);
      com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPConstDefs.InstanceListHelper.write(_output, observed_object_list.value);
      _output.write_long((int)granularity_period.value);
      _output.write_string((java.lang.String)threshold_attribute.value);
      com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPConstDefs.AttrValueHelper.write(_output, threshold_value.value);
      com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPConstDefs.AttrValueHelper.write(_output, hysteresis.value);
      com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPConstDefs.DirectionHelper.write(_output, direction.value);
      _output.write_string((java.lang.String)type.value);
      _output.write_string((java.lang.String)perceived_severity.value);
      _output.write_string((java.lang.String)probable_cause.value);
      _output.write_string((java.lang.String)specific_problem.value);
    }
    catch (com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem.NoSuchIdException _exception) {
      _output = _handler.createExceptionReply();
      com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem.NoSuchIdExceptionHelper.write(_output, _exception);
    }
    catch (com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem.OptionalOperationNotSupportedException _exception) {
      _output = _handler.createExceptionReply();
      com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem.OptionalOperationNotSupportedExceptionHelper.write(_output, _exception);
    }
    catch (com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem.OptionalParameterNotSupportedException _exception) {
      _output = _handler.createExceptionReply();
      com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem.OptionalParameterNotSupportedExceptionHelper.write(_output, _exception);
    }
      return _output;
    }
    case 3: {
    try {
      java.lang.String threshold_data_id;
      threshold_data_id = _input.read_string();
      com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.CommonIRPConstDefs.Signal _result = _self.delete_threshold(threshold_data_id);
      _output = _handler.createReply();
      com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.CommonIRPConstDefs.SignalHelper.write(_output, _result);
    }
    catch (com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem.NoSuchIdException _exception) {
      _output = _handler.createExceptionReply();
      com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem.NoSuchIdExceptionHelper.write(_output, _exception);
    }
    catch (com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem.OptionalOperationNotSupportedException _exception) {
      _output = _handler.createExceptionReply();
      com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem.OptionalOperationNotSupportedExceptionHelper.write(_output, _exception);
    }
    catch (com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem.OptionalParameterNotSupportedException _exception) {
      _output = _handler.createExceptionReply();
      com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem.OptionalParameterNotSupportedExceptionHelper.write(_output, _exception);
    }
      return _output;
    }
    }
    throw new org.omg.CORBA.BAD_OPERATION(2, org.omg.CORBA.CompletionStatus.COMPLETED_NO);
  }
  }
}
