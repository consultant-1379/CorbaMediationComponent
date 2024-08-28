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
public class __ThresholdOperationsStub extends com.inprise.vbroker.CORBA.portable.ObjectImpl implements com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem._ThresholdOperations {
  final public static java.lang.Class _opsClass = com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem._ThresholdOperationsOperations.class;

  public java.lang.String[] _ids () {
    return __ids;
  }

  private static java.lang.String[] __ids = {
    "IDL:PerformanceIRPSystem/ThresholdOperations:1.0"
  };

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

    while (true) {
      if (!_is_local()) {
        org.omg.CORBA.portable.OutputStream _output = null;
        org.omg.CORBA.portable.InputStream  _input  = null;
        com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.CommonIRPConstDefs.Signal _result;
        try {
          _output = this._request("delete_threshold", true);
          _output.write_string((java.lang.String)threshold_data_id);
          _input = this._invoke(_output);
          _result = com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.CommonIRPConstDefs.SignalHelper.read(_input);
          return _result;
        }
        catch (org.omg.CORBA.portable.ApplicationException _exception) {
          java.lang.String _exception_id = _exception.getId();
          if (_exception_id.equals(com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem.NoSuchIdExceptionHelper.id())) {
            throw             com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem.NoSuchIdExceptionHelper.read(_exception.getInputStream());
          }
          if (_exception_id.equals(com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem.OptionalOperationNotSupportedExceptionHelper.id())) {
            throw             com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem.OptionalOperationNotSupportedExceptionHelper.read(_exception.getInputStream());
          }
          if (_exception_id.equals(com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem.OptionalParameterNotSupportedExceptionHelper.id())) {
            throw             com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem.OptionalParameterNotSupportedExceptionHelper.read(_exception.getInputStream());
          }
          throw new org.omg.CORBA.UNKNOWN("Unexpected User Exception: " + _exception_id);
        }
        catch (org.omg.CORBA.NO_RESPONSE _vis_nm ) {
          if(_vis_nm.minor == (org.omg.CORBA.OMGVMCID.value | 99)) {
            return null;
          }
          throw _vis_nm;
        }
        catch (org.omg.CORBA.portable.RemarshalException _exception) {
          continue;
        }
        finally {
          this._releaseReply(_input);
        }
      } else {
        com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem._ThresholdOperationsOperations _self = null;
        final org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke("delete_threshold", _opsClass);
        if (_so == null) {
          continue;
        }
        try {
          _self = (com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem._ThresholdOperationsOperations)_so.servant;
        } catch (java.lang.ClassCastException _vis_ce) {
          org.omg.CORBA.portable.OutputStream _output = null;
          org.omg.CORBA.portable.InputStream  _input  = null;
          com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.CommonIRPConstDefs.Signal _result;

          try {
            _output = _orb().create_output_stream();
            final org.omg.CORBA.portable.OutputStream _response_output = _orb().create_output_stream();
            final org.omg.CORBA.portable.OutputStream _response_ex_output = _orb().create_output_stream();
            com.inprise.vbroker.orb.VBResponseHandler _vis_vbr = com.inprise.vbroker.orb.VBResponseHandler.getResponseHandler(_response_output,_response_ex_output);
            _output.write_string((java.lang.String)threshold_data_id);
            org.omg.CORBA.portable.OutputStream _result_output = (((org.omg.CORBA.portable.InvokeHandler)_so.servant)._invoke("delete_threshold",_output.create_input_stream(),_vis_vbr));
            _input = _result_output.create_input_stream();

            if(_vis_vbr.get_exflag()) {
              java.lang.String ex_repid = _input.read_string();
              if(ex_repid.equals("IDL:PerformanceIRPSystem/NoSuchIdException:1.0")) {
                com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem.NoSuchIdException exf =                 com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem.NoSuchIdExceptionHelper.read(_result_output.create_input_stream());
                throw exf;
              }
              if(ex_repid.equals("IDL:PerformanceIRPSystem/OptionalOperationNotSupportedException:1.0")) {
                com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem.OptionalOperationNotSupportedException exf =                 com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem.OptionalOperationNotSupportedExceptionHelper.read(_result_output.create_input_stream());
                throw exf;
              }
              if(ex_repid.equals("IDL:PerformanceIRPSystem/OptionalParameterNotSupportedException:1.0")) {
                com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem.OptionalParameterNotSupportedException exf =                 com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem.OptionalParameterNotSupportedExceptionHelper.read(_result_output.create_input_stream());
                throw exf;
              }
            }

            _result = com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.CommonIRPConstDefs.SignalHelper.read(_input);

            if (_so instanceof org.omg.CORBA.portable.ServantObjectExt) {
              ((org.omg.CORBA.portable.ServantObjectExt)_so).normalCompletion();
            }
            return _result;
          } catch (com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem.NoSuchIdException x_1) {
            if (_so instanceof org.omg.CORBA.portable.ServantObjectExt) {
              ((org.omg.CORBA.portable.ServantObjectExt)_so).exceptionalCompletion((Throwable)x_1);
            }
            throw x_1;

          } catch (com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem.OptionalOperationNotSupportedException x_2) {
            if (_so instanceof org.omg.CORBA.portable.ServantObjectExt) {
              ((org.omg.CORBA.portable.ServantObjectExt)_so).exceptionalCompletion((Throwable)x_2);
            }
            throw x_2;

          } catch (com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem.OptionalParameterNotSupportedException x_3) {
            if (_so instanceof org.omg.CORBA.portable.ServantObjectExt) {
              ((org.omg.CORBA.portable.ServantObjectExt)_so).exceptionalCompletion((Throwable)x_3);
            }
            throw x_3;

          } catch (java.lang.RuntimeException _vis_re) {
            if (_so instanceof org.omg.CORBA.portable.ServantObjectExt) {
              ((org.omg.CORBA.portable.ServantObjectExt)_so).exceptionalCompletion((Throwable)_vis_re);
            }
            throw _vis_re;
          } catch (java.lang.Error _vis_err) {
            if (_so instanceof org.omg.CORBA.portable.ServantObjectExt) {
              ((org.omg.CORBA.portable.ServantObjectExt)_so).exceptionalCompletion((Throwable)_vis_err);
            }
            throw _vis_err;
          } finally {
            _servant_postinvoke(_so);
            this._releaseReply(_input);
          }
        }
        try {
          com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.CommonIRPConstDefs.Signal _ret = _self.delete_threshold(threshold_data_id);
          if (_so instanceof org.omg.CORBA.portable.ServantObjectExt) {
            ((org.omg.CORBA.portable.ServantObjectExt)_so).normalCompletion();
          }
          return _ret;
        } catch (com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem.NoSuchIdException x_1) {
            if (_so instanceof org.omg.CORBA.portable.ServantObjectExt) {
              ((org.omg.CORBA.portable.ServantObjectExt)_so).exceptionalCompletion((Throwable)x_1);
            }
          throw x_1;
        } catch (com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem.OptionalOperationNotSupportedException x_2) {
            if (_so instanceof org.omg.CORBA.portable.ServantObjectExt) {
              ((org.omg.CORBA.portable.ServantObjectExt)_so).exceptionalCompletion((Throwable)x_2);
            }
          throw x_2;
        } catch (com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem.OptionalParameterNotSupportedException x_3) {
            if (_so instanceof org.omg.CORBA.portable.ServantObjectExt) {
              ((org.omg.CORBA.portable.ServantObjectExt)_so).exceptionalCompletion((Throwable)x_3);
            }
          throw x_3;
        } catch (java.lang.RuntimeException _vis_re) {
          if (_so instanceof org.omg.CORBA.portable.ServantObjectExt) {
            ((org.omg.CORBA.portable.ServantObjectExt)_so).exceptionalCompletion((Throwable)_vis_re);
          }
          throw _vis_re;
        } catch (java.lang.Error _vis_err) {
          if (_so instanceof org.omg.CORBA.portable.ServantObjectExt) {
            ((org.omg.CORBA.portable.ServantObjectExt)_so).exceptionalCompletion((Throwable)_vis_err);
          }
          throw _vis_err;
        } finally {
          _servant_postinvoke(_so);
        }
      }
    }

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

    while (true) {
      if (!_is_local()) {
        org.omg.CORBA.portable.OutputStream _output = null;
        org.omg.CORBA.portable.InputStream  _input  = null;
        com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.CommonIRPConstDefs.Signal _result;
        try {
          _output = this._request("lookup_threshold", true);
          _output.write_string((java.lang.String)threshold_data_id);
          _input = this._invoke(_output);
          _result = com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.CommonIRPConstDefs.SignalHelper.read(_input);
          observed_object_class.value = _input.read_string();
          observed_object_list.value = com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPConstDefs.InstanceListHelper.read(_input);
          granularity_period.value = _input.read_long();
          threshold_attribute.value = _input.read_string();
          threshold_value.value = com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPConstDefs.AttrValueHelper.read(_input);
          hysteresis.value = com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPConstDefs.AttrValueHelper.read(_input);
          direction.value = com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPConstDefs.DirectionHelper.read(_input);
          type.value = _input.read_string();
          perceived_severity.value = _input.read_string();
          probable_cause.value = _input.read_string();
          specific_problem.value = _input.read_string();
          return _result;
        }
        catch (org.omg.CORBA.portable.ApplicationException _exception) {
          java.lang.String _exception_id = _exception.getId();
          if (_exception_id.equals(com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem.NoSuchIdExceptionHelper.id())) {
            throw             com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem.NoSuchIdExceptionHelper.read(_exception.getInputStream());
          }
          if (_exception_id.equals(com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem.OptionalOperationNotSupportedExceptionHelper.id())) {
            throw             com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem.OptionalOperationNotSupportedExceptionHelper.read(_exception.getInputStream());
          }
          if (_exception_id.equals(com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem.OptionalParameterNotSupportedExceptionHelper.id())) {
            throw             com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem.OptionalParameterNotSupportedExceptionHelper.read(_exception.getInputStream());
          }
          throw new org.omg.CORBA.UNKNOWN("Unexpected User Exception: " + _exception_id);
        }
        catch (org.omg.CORBA.NO_RESPONSE _vis_nm ) {
          if(_vis_nm.minor == (org.omg.CORBA.OMGVMCID.value | 99)) {
            return null;
          }
          throw _vis_nm;
        }
        catch (org.omg.CORBA.portable.RemarshalException _exception) {
          continue;
        }
        finally {
          this._releaseReply(_input);
        }
      } else {
        com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem._ThresholdOperationsOperations _self = null;
        final org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke("lookup_threshold", _opsClass);
        if (_so == null) {
          continue;
        }
        try {
          _self = (com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem._ThresholdOperationsOperations)_so.servant;
        } catch (java.lang.ClassCastException _vis_ce) {
          org.omg.CORBA.portable.OutputStream _output = null;
          org.omg.CORBA.portable.InputStream  _input  = null;
          com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.CommonIRPConstDefs.Signal _result;

          try {
            _output = _orb().create_output_stream();
            final org.omg.CORBA.portable.OutputStream _response_output = _orb().create_output_stream();
            final org.omg.CORBA.portable.OutputStream _response_ex_output = _orb().create_output_stream();
            com.inprise.vbroker.orb.VBResponseHandler _vis_vbr = com.inprise.vbroker.orb.VBResponseHandler.getResponseHandler(_response_output,_response_ex_output);
            _output.write_string((java.lang.String)threshold_data_id);
            org.omg.CORBA.portable.OutputStream _result_output = (((org.omg.CORBA.portable.InvokeHandler)_so.servant)._invoke("lookup_threshold",_output.create_input_stream(),_vis_vbr));
            _input = _result_output.create_input_stream();

            if(_vis_vbr.get_exflag()) {
              java.lang.String ex_repid = _input.read_string();
              if(ex_repid.equals("IDL:PerformanceIRPSystem/NoSuchIdException:1.0")) {
                com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem.NoSuchIdException exf =                 com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem.NoSuchIdExceptionHelper.read(_result_output.create_input_stream());
                throw exf;
              }
              if(ex_repid.equals("IDL:PerformanceIRPSystem/OptionalOperationNotSupportedException:1.0")) {
                com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem.OptionalOperationNotSupportedException exf =                 com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem.OptionalOperationNotSupportedExceptionHelper.read(_result_output.create_input_stream());
                throw exf;
              }
              if(ex_repid.equals("IDL:PerformanceIRPSystem/OptionalParameterNotSupportedException:1.0")) {
                com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem.OptionalParameterNotSupportedException exf =                 com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem.OptionalParameterNotSupportedExceptionHelper.read(_result_output.create_input_stream());
                throw exf;
              }
            }

            _result = com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.CommonIRPConstDefs.SignalHelper.read(_input);

            observed_object_class.value = _input.read_string();
            observed_object_list.value = com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPConstDefs.InstanceListHelper.read(_input);
            granularity_period.value = _input.read_long();
            threshold_attribute.value = _input.read_string();
            threshold_value.value = com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPConstDefs.AttrValueHelper.read(_input);
            hysteresis.value = com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPConstDefs.AttrValueHelper.read(_input);
            direction.value = com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPConstDefs.DirectionHelper.read(_input);
            type.value = _input.read_string();
            perceived_severity.value = _input.read_string();
            probable_cause.value = _input.read_string();
            specific_problem.value = _input.read_string();

            if (_so instanceof org.omg.CORBA.portable.ServantObjectExt) {
              ((org.omg.CORBA.portable.ServantObjectExt)_so).normalCompletion();
            }
            return _result;
          } catch (com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem.NoSuchIdException x_1) {
            if (_so instanceof org.omg.CORBA.portable.ServantObjectExt) {
              ((org.omg.CORBA.portable.ServantObjectExt)_so).exceptionalCompletion((Throwable)x_1);
            }
            throw x_1;

          } catch (com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem.OptionalOperationNotSupportedException x_2) {
            if (_so instanceof org.omg.CORBA.portable.ServantObjectExt) {
              ((org.omg.CORBA.portable.ServantObjectExt)_so).exceptionalCompletion((Throwable)x_2);
            }
            throw x_2;

          } catch (com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem.OptionalParameterNotSupportedException x_3) {
            if (_so instanceof org.omg.CORBA.portable.ServantObjectExt) {
              ((org.omg.CORBA.portable.ServantObjectExt)_so).exceptionalCompletion((Throwable)x_3);
            }
            throw x_3;

          } catch (java.lang.RuntimeException _vis_re) {
            if (_so instanceof org.omg.CORBA.portable.ServantObjectExt) {
              ((org.omg.CORBA.portable.ServantObjectExt)_so).exceptionalCompletion((Throwable)_vis_re);
            }
            throw _vis_re;
          } catch (java.lang.Error _vis_err) {
            if (_so instanceof org.omg.CORBA.portable.ServantObjectExt) {
              ((org.omg.CORBA.portable.ServantObjectExt)_so).exceptionalCompletion((Throwable)_vis_err);
            }
            throw _vis_err;
          } finally {
            _servant_postinvoke(_so);
            this._releaseReply(_input);
          }
        }
        try {
          com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.CommonIRPConstDefs.Signal _ret = _self.lookup_threshold(threshold_data_id, 
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
          if (_so instanceof org.omg.CORBA.portable.ServantObjectExt) {
            ((org.omg.CORBA.portable.ServantObjectExt)_so).normalCompletion();
          }
          return _ret;
        } catch (com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem.NoSuchIdException x_1) {
            if (_so instanceof org.omg.CORBA.portable.ServantObjectExt) {
              ((org.omg.CORBA.portable.ServantObjectExt)_so).exceptionalCompletion((Throwable)x_1);
            }
          throw x_1;
        } catch (com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem.OptionalOperationNotSupportedException x_2) {
            if (_so instanceof org.omg.CORBA.portable.ServantObjectExt) {
              ((org.omg.CORBA.portable.ServantObjectExt)_so).exceptionalCompletion((Throwable)x_2);
            }
          throw x_2;
        } catch (com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem.OptionalParameterNotSupportedException x_3) {
            if (_so instanceof org.omg.CORBA.portable.ServantObjectExt) {
              ((org.omg.CORBA.portable.ServantObjectExt)_so).exceptionalCompletion((Throwable)x_3);
            }
          throw x_3;
        } catch (java.lang.RuntimeException _vis_re) {
          if (_so instanceof org.omg.CORBA.portable.ServantObjectExt) {
            ((org.omg.CORBA.portable.ServantObjectExt)_so).exceptionalCompletion((Throwable)_vis_re);
          }
          throw _vis_re;
        } catch (java.lang.Error _vis_err) {
          if (_so instanceof org.omg.CORBA.portable.ServantObjectExt) {
            ((org.omg.CORBA.portable.ServantObjectExt)_so).exceptionalCompletion((Throwable)_vis_err);
          }
          throw _vis_err;
        } finally {
          _servant_postinvoke(_so);
        }
      }
    }

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

    while (true) {
      if (!_is_local()) {
        org.omg.CORBA.portable.OutputStream _output = null;
        org.omg.CORBA.portable.InputStream  _input  = null;
        com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.CommonIRPConstDefs.Signal _result;
        try {
          _output = this._request("create_threshold", true);
          _output.write_string((java.lang.String)observation_class);
          com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPConstDefs.InstanceListHelper.write(_output, observed_object_list);
          _output.write_long((int)granularity_period);
          _output.write_string((java.lang.String)threshold_attribute);
          com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPConstDefs.AttrValueHelper.write(_output, threshold_value);
          com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPConstDefs.AttrValueHelper.write(_output, hysteresis);
          com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPConstDefs.DirectionHelper.write(_output, direction);
          _output.write_string((java.lang.String)type);
          _output.write_string((java.lang.String)perceived_severity);
          _output.write_string((java.lang.String)probable_cause);
          _output.write_string((java.lang.String)specific_problem);
          _input = this._invoke(_output);
          _result = com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.CommonIRPConstDefs.SignalHelper.read(_input);
          threshold_data_id.value = _input.read_string();
          return _result;
        }
        catch (org.omg.CORBA.portable.ApplicationException _exception) {
          java.lang.String _exception_id = _exception.getId();
          if (_exception_id.equals(com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem.OptionalOperationNotSupportedExceptionHelper.id())) {
            throw             com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem.OptionalOperationNotSupportedExceptionHelper.read(_exception.getInputStream());
          }
          if (_exception_id.equals(com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem.OptionalParameterNotSupportedExceptionHelper.id())) {
            throw             com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem.OptionalParameterNotSupportedExceptionHelper.read(_exception.getInputStream());
          }
          throw new org.omg.CORBA.UNKNOWN("Unexpected User Exception: " + _exception_id);
        }
        catch (org.omg.CORBA.NO_RESPONSE _vis_nm ) {
          if(_vis_nm.minor == (org.omg.CORBA.OMGVMCID.value | 99)) {
            return null;
          }
          throw _vis_nm;
        }
        catch (org.omg.CORBA.portable.RemarshalException _exception) {
          continue;
        }
        finally {
          this._releaseReply(_input);
        }
      } else {
        com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem._ThresholdOperationsOperations _self = null;
        final org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke("create_threshold", _opsClass);
        if (_so == null) {
          continue;
        }
        try {
          _self = (com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem._ThresholdOperationsOperations)_so.servant;
        } catch (java.lang.ClassCastException _vis_ce) {
          org.omg.CORBA.portable.OutputStream _output = null;
          org.omg.CORBA.portable.InputStream  _input  = null;
          com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.CommonIRPConstDefs.Signal _result;

          try {
            _output = _orb().create_output_stream();
            final org.omg.CORBA.portable.OutputStream _response_output = _orb().create_output_stream();
            final org.omg.CORBA.portable.OutputStream _response_ex_output = _orb().create_output_stream();
            com.inprise.vbroker.orb.VBResponseHandler _vis_vbr = com.inprise.vbroker.orb.VBResponseHandler.getResponseHandler(_response_output,_response_ex_output);
            _output.write_string((java.lang.String)observation_class);
            com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPConstDefs.InstanceListHelper.write(_output, observed_object_list);
            _output.write_long((int)granularity_period);
            _output.write_string((java.lang.String)threshold_attribute);
            com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPConstDefs.AttrValueHelper.write(_output, threshold_value);
            com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPConstDefs.AttrValueHelper.write(_output, hysteresis);
            com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPConstDefs.DirectionHelper.write(_output, direction);
            _output.write_string((java.lang.String)type);
            _output.write_string((java.lang.String)perceived_severity);
            _output.write_string((java.lang.String)probable_cause);
            _output.write_string((java.lang.String)specific_problem);
            org.omg.CORBA.portable.OutputStream _result_output = (((org.omg.CORBA.portable.InvokeHandler)_so.servant)._invoke("create_threshold",_output.create_input_stream(),_vis_vbr));
            _input = _result_output.create_input_stream();

            if(_vis_vbr.get_exflag()) {
              java.lang.String ex_repid = _input.read_string();
              if(ex_repid.equals("IDL:PerformanceIRPSystem/OptionalOperationNotSupportedException:1.0")) {
                com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem.OptionalOperationNotSupportedException exf =                 com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem.OptionalOperationNotSupportedExceptionHelper.read(_result_output.create_input_stream());
                throw exf;
              }
              if(ex_repid.equals("IDL:PerformanceIRPSystem/OptionalParameterNotSupportedException:1.0")) {
                com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem.OptionalParameterNotSupportedException exf =                 com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem.OptionalParameterNotSupportedExceptionHelper.read(_result_output.create_input_stream());
                throw exf;
              }
            }

            _result = com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.CommonIRPConstDefs.SignalHelper.read(_input);

            threshold_data_id.value = _input.read_string();

            if (_so instanceof org.omg.CORBA.portable.ServantObjectExt) {
              ((org.omg.CORBA.portable.ServantObjectExt)_so).normalCompletion();
            }
            return _result;
          } catch (com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem.OptionalOperationNotSupportedException x_1) {
            if (_so instanceof org.omg.CORBA.portable.ServantObjectExt) {
              ((org.omg.CORBA.portable.ServantObjectExt)_so).exceptionalCompletion((Throwable)x_1);
            }
            throw x_1;

          } catch (com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem.OptionalParameterNotSupportedException x_2) {
            if (_so instanceof org.omg.CORBA.portable.ServantObjectExt) {
              ((org.omg.CORBA.portable.ServantObjectExt)_so).exceptionalCompletion((Throwable)x_2);
            }
            throw x_2;

          } catch (java.lang.RuntimeException _vis_re) {
            if (_so instanceof org.omg.CORBA.portable.ServantObjectExt) {
              ((org.omg.CORBA.portable.ServantObjectExt)_so).exceptionalCompletion((Throwable)_vis_re);
            }
            throw _vis_re;
          } catch (java.lang.Error _vis_err) {
            if (_so instanceof org.omg.CORBA.portable.ServantObjectExt) {
              ((org.omg.CORBA.portable.ServantObjectExt)_so).exceptionalCompletion((Throwable)_vis_err);
            }
            throw _vis_err;
          } finally {
            _servant_postinvoke(_so);
            this._releaseReply(_input);
          }
        }
        try {
          com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.CommonIRPConstDefs.Signal _ret = _self.create_threshold(observation_class, 
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
          if (_so instanceof org.omg.CORBA.portable.ServantObjectExt) {
            ((org.omg.CORBA.portable.ServantObjectExt)_so).normalCompletion();
          }
          return _ret;
        } catch (com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem.OptionalOperationNotSupportedException x_1) {
            if (_so instanceof org.omg.CORBA.portable.ServantObjectExt) {
              ((org.omg.CORBA.portable.ServantObjectExt)_so).exceptionalCompletion((Throwable)x_1);
            }
          throw x_1;
        } catch (com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem.OptionalParameterNotSupportedException x_2) {
            if (_so instanceof org.omg.CORBA.portable.ServantObjectExt) {
              ((org.omg.CORBA.portable.ServantObjectExt)_so).exceptionalCompletion((Throwable)x_2);
            }
          throw x_2;
        } catch (java.lang.RuntimeException _vis_re) {
          if (_so instanceof org.omg.CORBA.portable.ServantObjectExt) {
            ((org.omg.CORBA.portable.ServantObjectExt)_so).exceptionalCompletion((Throwable)_vis_re);
          }
          throw _vis_re;
        } catch (java.lang.Error _vis_err) {
          if (_so instanceof org.omg.CORBA.portable.ServantObjectExt) {
            ((org.omg.CORBA.portable.ServantObjectExt)_so).exceptionalCompletion((Throwable)_vis_err);
          }
          throw _vis_err;
        } finally {
          _servant_postinvoke(_so);
        }
      }
    }

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

    while (true) {
      if (!_is_local()) {
        org.omg.CORBA.portable.OutputStream _output = null;
        org.omg.CORBA.portable.InputStream  _input  = null;
        com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.CommonIRPConstDefs.Signal _result;
        try {
          _output = this._request("list_thresholds", true);
          com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPConstDefs.NeListHelper.write(_output, ne_list);
          _input = this._invoke(_output);
          _result = com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.CommonIRPConstDefs.SignalHelper.read(_input);
          threshold_list.value = com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPConstDefs.IdSeqHelper.read(_input);
          return _result;
        }
        catch (org.omg.CORBA.portable.ApplicationException _exception) {
          java.lang.String _exception_id = _exception.getId();
          if (_exception_id.equals(com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem.OptionalOperationNotSupportedExceptionHelper.id())) {
            throw             com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem.OptionalOperationNotSupportedExceptionHelper.read(_exception.getInputStream());
          }
          if (_exception_id.equals(com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem.OptionalParameterNotSupportedExceptionHelper.id())) {
            throw             com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem.OptionalParameterNotSupportedExceptionHelper.read(_exception.getInputStream());
          }
          throw new org.omg.CORBA.UNKNOWN("Unexpected User Exception: " + _exception_id);
        }
        catch (org.omg.CORBA.NO_RESPONSE _vis_nm ) {
          if(_vis_nm.minor == (org.omg.CORBA.OMGVMCID.value | 99)) {
            return null;
          }
          throw _vis_nm;
        }
        catch (org.omg.CORBA.portable.RemarshalException _exception) {
          continue;
        }
        finally {
          this._releaseReply(_input);
        }
      } else {
        com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem._ThresholdOperationsOperations _self = null;
        final org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke("list_thresholds", _opsClass);
        if (_so == null) {
          continue;
        }
        try {
          _self = (com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem._ThresholdOperationsOperations)_so.servant;
        } catch (java.lang.ClassCastException _vis_ce) {
          org.omg.CORBA.portable.OutputStream _output = null;
          org.omg.CORBA.portable.InputStream  _input  = null;
          com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.CommonIRPConstDefs.Signal _result;

          try {
            _output = _orb().create_output_stream();
            final org.omg.CORBA.portable.OutputStream _response_output = _orb().create_output_stream();
            final org.omg.CORBA.portable.OutputStream _response_ex_output = _orb().create_output_stream();
            com.inprise.vbroker.orb.VBResponseHandler _vis_vbr = com.inprise.vbroker.orb.VBResponseHandler.getResponseHandler(_response_output,_response_ex_output);
            com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPConstDefs.NeListHelper.write(_output, ne_list);
            org.omg.CORBA.portable.OutputStream _result_output = (((org.omg.CORBA.portable.InvokeHandler)_so.servant)._invoke("list_thresholds",_output.create_input_stream(),_vis_vbr));
            _input = _result_output.create_input_stream();

            if(_vis_vbr.get_exflag()) {
              java.lang.String ex_repid = _input.read_string();
              if(ex_repid.equals("IDL:PerformanceIRPSystem/OptionalOperationNotSupportedException:1.0")) {
                com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem.OptionalOperationNotSupportedException exf =                 com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem.OptionalOperationNotSupportedExceptionHelper.read(_result_output.create_input_stream());
                throw exf;
              }
              if(ex_repid.equals("IDL:PerformanceIRPSystem/OptionalParameterNotSupportedException:1.0")) {
                com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem.OptionalParameterNotSupportedException exf =                 com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem.OptionalParameterNotSupportedExceptionHelper.read(_result_output.create_input_stream());
                throw exf;
              }
            }

            _result = com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.CommonIRPConstDefs.SignalHelper.read(_input);

            threshold_list.value = com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPConstDefs.IdSeqHelper.read(_input);

            if (_so instanceof org.omg.CORBA.portable.ServantObjectExt) {
              ((org.omg.CORBA.portable.ServantObjectExt)_so).normalCompletion();
            }
            return _result;
          } catch (com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem.OptionalOperationNotSupportedException x_1) {
            if (_so instanceof org.omg.CORBA.portable.ServantObjectExt) {
              ((org.omg.CORBA.portable.ServantObjectExt)_so).exceptionalCompletion((Throwable)x_1);
            }
            throw x_1;

          } catch (com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem.OptionalParameterNotSupportedException x_2) {
            if (_so instanceof org.omg.CORBA.portable.ServantObjectExt) {
              ((org.omg.CORBA.portable.ServantObjectExt)_so).exceptionalCompletion((Throwable)x_2);
            }
            throw x_2;

          } catch (java.lang.RuntimeException _vis_re) {
            if (_so instanceof org.omg.CORBA.portable.ServantObjectExt) {
              ((org.omg.CORBA.portable.ServantObjectExt)_so).exceptionalCompletion((Throwable)_vis_re);
            }
            throw _vis_re;
          } catch (java.lang.Error _vis_err) {
            if (_so instanceof org.omg.CORBA.portable.ServantObjectExt) {
              ((org.omg.CORBA.portable.ServantObjectExt)_so).exceptionalCompletion((Throwable)_vis_err);
            }
            throw _vis_err;
          } finally {
            _servant_postinvoke(_so);
            this._releaseReply(_input);
          }
        }
        try {
          com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.CommonIRPConstDefs.Signal _ret = _self.list_thresholds(ne_list, 
                                                                                                                          threshold_list);
          if (_so instanceof org.omg.CORBA.portable.ServantObjectExt) {
            ((org.omg.CORBA.portable.ServantObjectExt)_so).normalCompletion();
          }
          return _ret;
        } catch (com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem.OptionalOperationNotSupportedException x_1) {
            if (_so instanceof org.omg.CORBA.portable.ServantObjectExt) {
              ((org.omg.CORBA.portable.ServantObjectExt)_so).exceptionalCompletion((Throwable)x_1);
            }
          throw x_1;
        } catch (com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem.OptionalParameterNotSupportedException x_2) {
            if (_so instanceof org.omg.CORBA.portable.ServantObjectExt) {
              ((org.omg.CORBA.portable.ServantObjectExt)_so).exceptionalCompletion((Throwable)x_2);
            }
          throw x_2;
        } catch (java.lang.RuntimeException _vis_re) {
          if (_so instanceof org.omg.CORBA.portable.ServantObjectExt) {
            ((org.omg.CORBA.portable.ServantObjectExt)_so).exceptionalCompletion((Throwable)_vis_re);
          }
          throw _vis_re;
        } catch (java.lang.Error _vis_err) {
          if (_so instanceof org.omg.CORBA.portable.ServantObjectExt) {
            ((org.omg.CORBA.portable.ServantObjectExt)_so).exceptionalCompletion((Throwable)_vis_err);
          }
          throw _vis_err;
        } finally {
          _servant_postinvoke(_so);
        }
      }
    }

  }

}
