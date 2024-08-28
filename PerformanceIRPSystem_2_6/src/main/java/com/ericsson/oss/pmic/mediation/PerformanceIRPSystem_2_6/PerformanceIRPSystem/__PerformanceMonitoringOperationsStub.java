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
public class __PerformanceMonitoringOperationsStub extends com.inprise.vbroker.CORBA.portable.ObjectImpl implements com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem._PerformanceMonitoringOperations {
  final public static java.lang.Class _opsClass = com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem._PerformanceMonitoringOperationsOperations.class;

  public java.lang.String[] _ids () {
    return __ids;
  }

  private static java.lang.String[] __ids = {
    "IDL:PerformanceIRPSystem/PerformanceMonitoringOperations:1.0"
  };

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

    while (true) {
      if (!_is_local()) {
        org.omg.CORBA.portable.OutputStream _output = null;
        org.omg.CORBA.portable.InputStream  _input  = null;
        com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.CommonIRPConstDefs.Signal _result;
        try {
          _output = this._request("lookup_filter_performance_monitoring_report", true);
          _output.write_long((int)performance_monitoring_id);
          _input = this._invoke(_output);
          _result = com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.CommonIRPConstDefs.SignalHelper.read(_input);
          recording_type.value = com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPConstDefs.RecordingTypeHelper.read(_input);
          triggering_object.value = com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPConstDefs.ObservationObjectHelper.read(_input);
          observation_object_list.value = com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPConstDefs.ObservationObjectListHelper.read(_input);
          filter.value = com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPConstDefs.FilterHelper.read(_input);
          time_window.value = com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPConstDefs.TimeWindowHelper.read(_input);
          sampling_rate.value = _input.read_long();
          return _result;
        }
        catch (org.omg.CORBA.portable.ApplicationException _exception) {
          java.lang.String _exception_id = _exception.getId();
          if (_exception_id.equals(com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem.OptionalOperationNotSupportedExceptionHelper.id())) {
            throw             com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem.OptionalOperationNotSupportedExceptionHelper.read(_exception.getInputStream());
          }
          if (_exception_id.equals(com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem.NoSuchIdExceptionHelper.id())) {
            throw             com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem.NoSuchIdExceptionHelper.read(_exception.getInputStream());
          }
          if (_exception_id.equals(com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem.CounterbasedFilterExceptionHelper.id())) {
            throw             com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem.CounterbasedFilterExceptionHelper.read(_exception.getInputStream());
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
        com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem._PerformanceMonitoringOperationsOperations _self = null;
        final org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke("lookup_filter_performance_monitoring_report", _opsClass);
        if (_so == null) {
          continue;
        }
        try {
          _self = (com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem._PerformanceMonitoringOperationsOperations)_so.servant;
        } catch (java.lang.ClassCastException _vis_ce) {
          org.omg.CORBA.portable.OutputStream _output = null;
          org.omg.CORBA.portable.InputStream  _input  = null;
          com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.CommonIRPConstDefs.Signal _result;

          try {
            _output = _orb().create_output_stream();
            final org.omg.CORBA.portable.OutputStream _response_output = _orb().create_output_stream();
            final org.omg.CORBA.portable.OutputStream _response_ex_output = _orb().create_output_stream();
            com.inprise.vbroker.orb.VBResponseHandler _vis_vbr = com.inprise.vbroker.orb.VBResponseHandler.getResponseHandler(_response_output,_response_ex_output);
            _output.write_long((int)performance_monitoring_id);
            org.omg.CORBA.portable.OutputStream _result_output = (((org.omg.CORBA.portable.InvokeHandler)_so.servant)._invoke("lookup_filter_performance_monitoring_report",_output.create_input_stream(),_vis_vbr));
            _input = _result_output.create_input_stream();

            if(_vis_vbr.get_exflag()) {
              java.lang.String ex_repid = _input.read_string();
              if(ex_repid.equals("IDL:PerformanceIRPSystem/OptionalOperationNotSupportedException:1.0")) {
                com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem.OptionalOperationNotSupportedException exf =                 com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem.OptionalOperationNotSupportedExceptionHelper.read(_result_output.create_input_stream());
                throw exf;
              }
              if(ex_repid.equals("IDL:PerformanceIRPSystem/NoSuchIdException:1.0")) {
                com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem.NoSuchIdException exf =                 com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem.NoSuchIdExceptionHelper.read(_result_output.create_input_stream());
                throw exf;
              }
              if(ex_repid.equals("IDL:PerformanceIRPSystem/CounterbasedFilterException:1.0")) {
                com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem.CounterbasedFilterException exf =                 com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem.CounterbasedFilterExceptionHelper.read(_result_output.create_input_stream());
                throw exf;
              }
            }

            _result = com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.CommonIRPConstDefs.SignalHelper.read(_input);

            recording_type.value = com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPConstDefs.RecordingTypeHelper.read(_input);
            triggering_object.value = com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPConstDefs.ObservationObjectHelper.read(_input);
            observation_object_list.value = com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPConstDefs.ObservationObjectListHelper.read(_input);
            filter.value = com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPConstDefs.FilterHelper.read(_input);
            time_window.value = com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPConstDefs.TimeWindowHelper.read(_input);
            sampling_rate.value = _input.read_long();

            if (_so instanceof org.omg.CORBA.portable.ServantObjectExt) {
              ((org.omg.CORBA.portable.ServantObjectExt)_so).normalCompletion();
            }
            return _result;
          } catch (com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem.OptionalOperationNotSupportedException x_1) {
            if (_so instanceof org.omg.CORBA.portable.ServantObjectExt) {
              ((org.omg.CORBA.portable.ServantObjectExt)_so).exceptionalCompletion((Throwable)x_1);
            }
            throw x_1;

          } catch (com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem.NoSuchIdException x_2) {
            if (_so instanceof org.omg.CORBA.portable.ServantObjectExt) {
              ((org.omg.CORBA.portable.ServantObjectExt)_so).exceptionalCompletion((Throwable)x_2);
            }
            throw x_2;

          } catch (com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem.CounterbasedFilterException x_3) {
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
          com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.CommonIRPConstDefs.Signal _ret = _self.lookup_filter_performance_monitoring_report(performance_monitoring_id, 
                                                                                                                                                      recording_type, 
                                                                                                                                                      triggering_object, 
                                                                                                                                                      observation_object_list, 
                                                                                                                                                      filter, 
                                                                                                                                                      time_window, 
                                                                                                                                                      sampling_rate);
          if (_so instanceof org.omg.CORBA.portable.ServantObjectExt) {
            ((org.omg.CORBA.portable.ServantObjectExt)_so).normalCompletion();
          }
          return _ret;
        } catch (com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem.OptionalOperationNotSupportedException x_1) {
            if (_so instanceof org.omg.CORBA.portable.ServantObjectExt) {
              ((org.omg.CORBA.portable.ServantObjectExt)_so).exceptionalCompletion((Throwable)x_1);
            }
          throw x_1;
        } catch (com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem.NoSuchIdException x_2) {
            if (_so instanceof org.omg.CORBA.portable.ServantObjectExt) {
              ((org.omg.CORBA.portable.ServantObjectExt)_so).exceptionalCompletion((Throwable)x_2);
            }
          throw x_2;
        } catch (com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem.CounterbasedFilterException x_3) {
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

    while (true) {
      if (!_is_local()) {
        org.omg.CORBA.portable.OutputStream _output = null;
        org.omg.CORBA.portable.InputStream  _input  = null;
        com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.CommonIRPConstDefs.Signal _result;
        try {
          _output = this._request("filter_performance_monitoring_report", true);
          com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPConstDefs.PerformanceMonitoringIdListHelper.write(_output, performance_monitoring_id_list);
          com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPConstDefs.RecordingTypeHelper.write(_output, recording_type);
          if (triggering_object == null) {
            throw new org.omg.CORBA.BAD_PARAM("Invalid array length");
          }
          com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPConstDefs.ObservationObjectHelper.write(_output, triggering_object);
          com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPConstDefs.ObservationObjectListHelper.write(_output, observation_object_list);
          if (filter == null) {
            throw new org.omg.CORBA.BAD_PARAM("Invalid array length");
          }
          com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPConstDefs.FilterHelper.write(_output, filter);
          com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPConstDefs.TimeWindowHelper.write(_output, time_window);
          _output.write_long((int)sampling_rate);
          _input = this._invoke(_output);
          _result = com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.CommonIRPConstDefs.SignalHelper.read(_input);
          bad_performance_monitoring_id_list.value = com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPConstDefs.PerformanceMonitoringIdListHelper.read(_input);
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
          if (_exception_id.equals(com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem.NoSuchIdExceptionHelper.id())) {
            throw             com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem.NoSuchIdExceptionHelper.read(_exception.getInputStream());
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
        com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem._PerformanceMonitoringOperationsOperations _self = null;
        final org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke("filter_performance_monitoring_report", _opsClass);
        if (_so == null) {
          continue;
        }
        try {
          _self = (com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem._PerformanceMonitoringOperationsOperations)_so.servant;
        } catch (java.lang.ClassCastException _vis_ce) {
          org.omg.CORBA.portable.OutputStream _output = null;
          org.omg.CORBA.portable.InputStream  _input  = null;
          com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.CommonIRPConstDefs.Signal _result;

          try {
            _output = _orb().create_output_stream();
            final org.omg.CORBA.portable.OutputStream _response_output = _orb().create_output_stream();
            final org.omg.CORBA.portable.OutputStream _response_ex_output = _orb().create_output_stream();
            com.inprise.vbroker.orb.VBResponseHandler _vis_vbr = com.inprise.vbroker.orb.VBResponseHandler.getResponseHandler(_response_output,_response_ex_output);
            com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPConstDefs.PerformanceMonitoringIdListHelper.write(_output, performance_monitoring_id_list);
            com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPConstDefs.RecordingTypeHelper.write(_output, recording_type);
            if (triggering_object == null) {
              throw new org.omg.CORBA.BAD_PARAM("Invalid array length");
            }
            com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPConstDefs.ObservationObjectHelper.write(_output, triggering_object);
            com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPConstDefs.ObservationObjectListHelper.write(_output, observation_object_list);
            if (filter == null) {
              throw new org.omg.CORBA.BAD_PARAM("Invalid array length");
            }
            com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPConstDefs.FilterHelper.write(_output, filter);
            com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPConstDefs.TimeWindowHelper.write(_output, time_window);
            _output.write_long((int)sampling_rate);
            org.omg.CORBA.portable.OutputStream _result_output = (((org.omg.CORBA.portable.InvokeHandler)_so.servant)._invoke("filter_performance_monitoring_report",_output.create_input_stream(),_vis_vbr));
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
              if(ex_repid.equals("IDL:PerformanceIRPSystem/NoSuchIdException:1.0")) {
                com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem.NoSuchIdException exf =                 com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem.NoSuchIdExceptionHelper.read(_result_output.create_input_stream());
                throw exf;
              }
            }

            _result = com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.CommonIRPConstDefs.SignalHelper.read(_input);

            bad_performance_monitoring_id_list.value = com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPConstDefs.PerformanceMonitoringIdListHelper.read(_input);

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

          } catch (com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem.NoSuchIdException x_3) {
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
          com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.CommonIRPConstDefs.Signal _ret = _self.filter_performance_monitoring_report(performance_monitoring_id_list, 
                                                                                                                                               recording_type, 
                                                                                                                                               triggering_object, 
                                                                                                                                               observation_object_list, 
                                                                                                                                               filter, 
                                                                                                                                               time_window, 
                                                                                                                                               sampling_rate, 
                                                                                                                                               bad_performance_monitoring_id_list);
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
        } catch (com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem.NoSuchIdException x_3) {
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
   *   com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.CommonIRPConstDefs.Signal get_performance_monitoring_report (in com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPConstDefs.PerformanceMonitoringId performance_monitoring_id,
                                                                                                                        out com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPConstDefs.PerformanceMonitoringReport performance_monitoring_report)
    raises (com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem.OptionalOperationNotSupportedException,
            com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem.NoSuchIdException);
   * </pre>
   */
  public com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.CommonIRPConstDefs.Signal get_performance_monitoring_report (int performance_monitoring_id, 
                                                                                                                               com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPConstDefs.PerformanceMonitoringReportHolder performance_monitoring_report) throws  com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem.OptionalOperationNotSupportedException, 
                                                                                                                                                                                                                                                                                         com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem.NoSuchIdException {

    while (true) {
      if (!_is_local()) {
        org.omg.CORBA.portable.OutputStream _output = null;
        org.omg.CORBA.portable.InputStream  _input  = null;
        com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.CommonIRPConstDefs.Signal _result;
        try {
          _output = this._request("get_performance_monitoring_report", true);
          _output.write_long((int)performance_monitoring_id);
          _input = this._invoke(_output);
          _result = com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.CommonIRPConstDefs.SignalHelper.read(_input);
          performance_monitoring_report.value = com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPConstDefs.PerformanceMonitoringReportHelper.read(_input);
          return _result;
        }
        catch (org.omg.CORBA.portable.ApplicationException _exception) {
          java.lang.String _exception_id = _exception.getId();
          if (_exception_id.equals(com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem.OptionalOperationNotSupportedExceptionHelper.id())) {
            throw             com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem.OptionalOperationNotSupportedExceptionHelper.read(_exception.getInputStream());
          }
          if (_exception_id.equals(com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem.NoSuchIdExceptionHelper.id())) {
            throw             com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem.NoSuchIdExceptionHelper.read(_exception.getInputStream());
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
        com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem._PerformanceMonitoringOperationsOperations _self = null;
        final org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke("get_performance_monitoring_report", _opsClass);
        if (_so == null) {
          continue;
        }
        try {
          _self = (com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem._PerformanceMonitoringOperationsOperations)_so.servant;
        } catch (java.lang.ClassCastException _vis_ce) {
          org.omg.CORBA.portable.OutputStream _output = null;
          org.omg.CORBA.portable.InputStream  _input  = null;
          com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.CommonIRPConstDefs.Signal _result;

          try {
            _output = _orb().create_output_stream();
            final org.omg.CORBA.portable.OutputStream _response_output = _orb().create_output_stream();
            final org.omg.CORBA.portable.OutputStream _response_ex_output = _orb().create_output_stream();
            com.inprise.vbroker.orb.VBResponseHandler _vis_vbr = com.inprise.vbroker.orb.VBResponseHandler.getResponseHandler(_response_output,_response_ex_output);
            _output.write_long((int)performance_monitoring_id);
            org.omg.CORBA.portable.OutputStream _result_output = (((org.omg.CORBA.portable.InvokeHandler)_so.servant)._invoke("get_performance_monitoring_report",_output.create_input_stream(),_vis_vbr));
            _input = _result_output.create_input_stream();

            if(_vis_vbr.get_exflag()) {
              java.lang.String ex_repid = _input.read_string();
              if(ex_repid.equals("IDL:PerformanceIRPSystem/OptionalOperationNotSupportedException:1.0")) {
                com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem.OptionalOperationNotSupportedException exf =                 com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem.OptionalOperationNotSupportedExceptionHelper.read(_result_output.create_input_stream());
                throw exf;
              }
              if(ex_repid.equals("IDL:PerformanceIRPSystem/NoSuchIdException:1.0")) {
                com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem.NoSuchIdException exf =                 com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem.NoSuchIdExceptionHelper.read(_result_output.create_input_stream());
                throw exf;
              }
            }

            _result = com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.CommonIRPConstDefs.SignalHelper.read(_input);

            performance_monitoring_report.value = com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPConstDefs.PerformanceMonitoringReportHelper.read(_input);

            if (_so instanceof org.omg.CORBA.portable.ServantObjectExt) {
              ((org.omg.CORBA.portable.ServantObjectExt)_so).normalCompletion();
            }
            return _result;
          } catch (com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem.OptionalOperationNotSupportedException x_1) {
            if (_so instanceof org.omg.CORBA.portable.ServantObjectExt) {
              ((org.omg.CORBA.portable.ServantObjectExt)_so).exceptionalCompletion((Throwable)x_1);
            }
            throw x_1;

          } catch (com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem.NoSuchIdException x_2) {
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
          com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.CommonIRPConstDefs.Signal _ret = _self.get_performance_monitoring_report(performance_monitoring_id, 
                                                                                                                                            performance_monitoring_report);
          if (_so instanceof org.omg.CORBA.portable.ServantObjectExt) {
            ((org.omg.CORBA.portable.ServantObjectExt)_so).normalCompletion();
          }
          return _ret;
        } catch (com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem.OptionalOperationNotSupportedException x_1) {
            if (_so instanceof org.omg.CORBA.portable.ServantObjectExt) {
              ((org.omg.CORBA.portable.ServantObjectExt)_so).exceptionalCompletion((Throwable)x_1);
            }
          throw x_1;
        } catch (com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem.NoSuchIdException x_2) {
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
   *   com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.CommonIRPConstDefs.Signal resume_performance_monitoring (in com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPConstDefs.PerformanceMonitoringIdList performance_monitoring_id_list,
                                                                                                                    out com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPConstDefs.PerformanceMonitoringIdList bad_performance_monitoring_list)
    raises (com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem.OptionalOperationNotSupportedException,
            com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem.NoSuchIdException);
   * </pre>
   */
  public com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.CommonIRPConstDefs.Signal resume_performance_monitoring (int[] performance_monitoring_id_list, 
                                                                                                                           com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPConstDefs.PerformanceMonitoringIdListHolder bad_performance_monitoring_list) throws  com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem.OptionalOperationNotSupportedException, 
                                                                                                                                                                                                                                                                                       com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem.NoSuchIdException {

    while (true) {
      if (!_is_local()) {
        org.omg.CORBA.portable.OutputStream _output = null;
        org.omg.CORBA.portable.InputStream  _input  = null;
        com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.CommonIRPConstDefs.Signal _result;
        try {
          _output = this._request("resume_performance_monitoring", true);
          com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPConstDefs.PerformanceMonitoringIdListHelper.write(_output, performance_monitoring_id_list);
          _input = this._invoke(_output);
          _result = com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.CommonIRPConstDefs.SignalHelper.read(_input);
          bad_performance_monitoring_list.value = com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPConstDefs.PerformanceMonitoringIdListHelper.read(_input);
          return _result;
        }
        catch (org.omg.CORBA.portable.ApplicationException _exception) {
          java.lang.String _exception_id = _exception.getId();
          if (_exception_id.equals(com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem.OptionalOperationNotSupportedExceptionHelper.id())) {
            throw             com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem.OptionalOperationNotSupportedExceptionHelper.read(_exception.getInputStream());
          }
          if (_exception_id.equals(com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem.NoSuchIdExceptionHelper.id())) {
            throw             com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem.NoSuchIdExceptionHelper.read(_exception.getInputStream());
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
        com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem._PerformanceMonitoringOperationsOperations _self = null;
        final org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke("resume_performance_monitoring", _opsClass);
        if (_so == null) {
          continue;
        }
        try {
          _self = (com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem._PerformanceMonitoringOperationsOperations)_so.servant;
        } catch (java.lang.ClassCastException _vis_ce) {
          org.omg.CORBA.portable.OutputStream _output = null;
          org.omg.CORBA.portable.InputStream  _input  = null;
          com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.CommonIRPConstDefs.Signal _result;

          try {
            _output = _orb().create_output_stream();
            final org.omg.CORBA.portable.OutputStream _response_output = _orb().create_output_stream();
            final org.omg.CORBA.portable.OutputStream _response_ex_output = _orb().create_output_stream();
            com.inprise.vbroker.orb.VBResponseHandler _vis_vbr = com.inprise.vbroker.orb.VBResponseHandler.getResponseHandler(_response_output,_response_ex_output);
            com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPConstDefs.PerformanceMonitoringIdListHelper.write(_output, performance_monitoring_id_list);
            org.omg.CORBA.portable.OutputStream _result_output = (((org.omg.CORBA.portable.InvokeHandler)_so.servant)._invoke("resume_performance_monitoring",_output.create_input_stream(),_vis_vbr));
            _input = _result_output.create_input_stream();

            if(_vis_vbr.get_exflag()) {
              java.lang.String ex_repid = _input.read_string();
              if(ex_repid.equals("IDL:PerformanceIRPSystem/OptionalOperationNotSupportedException:1.0")) {
                com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem.OptionalOperationNotSupportedException exf =                 com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem.OptionalOperationNotSupportedExceptionHelper.read(_result_output.create_input_stream());
                throw exf;
              }
              if(ex_repid.equals("IDL:PerformanceIRPSystem/NoSuchIdException:1.0")) {
                com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem.NoSuchIdException exf =                 com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem.NoSuchIdExceptionHelper.read(_result_output.create_input_stream());
                throw exf;
              }
            }

            _result = com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.CommonIRPConstDefs.SignalHelper.read(_input);

            bad_performance_monitoring_list.value = com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPConstDefs.PerformanceMonitoringIdListHelper.read(_input);

            if (_so instanceof org.omg.CORBA.portable.ServantObjectExt) {
              ((org.omg.CORBA.portable.ServantObjectExt)_so).normalCompletion();
            }
            return _result;
          } catch (com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem.OptionalOperationNotSupportedException x_1) {
            if (_so instanceof org.omg.CORBA.portable.ServantObjectExt) {
              ((org.omg.CORBA.portable.ServantObjectExt)_so).exceptionalCompletion((Throwable)x_1);
            }
            throw x_1;

          } catch (com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem.NoSuchIdException x_2) {
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
          com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.CommonIRPConstDefs.Signal _ret = _self.resume_performance_monitoring(performance_monitoring_id_list, 
                                                                                                                                        bad_performance_monitoring_list);
          if (_so instanceof org.omg.CORBA.portable.ServantObjectExt) {
            ((org.omg.CORBA.portable.ServantObjectExt)_so).normalCompletion();
          }
          return _ret;
        } catch (com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem.OptionalOperationNotSupportedException x_1) {
            if (_so instanceof org.omg.CORBA.portable.ServantObjectExt) {
              ((org.omg.CORBA.portable.ServantObjectExt)_so).exceptionalCompletion((Throwable)x_1);
            }
          throw x_1;
        } catch (com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem.NoSuchIdException x_2) {
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
   *   com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.CommonIRPConstDefs.Signal suspend_performance_monitoring (in com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPConstDefs.PerformanceMonitoringIdList performance_monitoring_id_list,
                                                                                                                     out com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPConstDefs.PerformanceMonitoringIdList bad_performance_monitoring_id_list)
    raises (com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem.OptionalOperationNotSupportedException,
            com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem.NoSuchIdException);
   * </pre>
   */
  public com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.CommonIRPConstDefs.Signal suspend_performance_monitoring (int[] performance_monitoring_id_list, 
                                                                                                                            com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPConstDefs.PerformanceMonitoringIdListHolder bad_performance_monitoring_id_list) throws  com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem.OptionalOperationNotSupportedException, 
                                                                                                                                                                                                                                                                                           com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem.NoSuchIdException {

    while (true) {
      if (!_is_local()) {
        org.omg.CORBA.portable.OutputStream _output = null;
        org.omg.CORBA.portable.InputStream  _input  = null;
        com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.CommonIRPConstDefs.Signal _result;
        try {
          _output = this._request("suspend_performance_monitoring", true);
          com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPConstDefs.PerformanceMonitoringIdListHelper.write(_output, performance_monitoring_id_list);
          _input = this._invoke(_output);
          _result = com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.CommonIRPConstDefs.SignalHelper.read(_input);
          bad_performance_monitoring_id_list.value = com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPConstDefs.PerformanceMonitoringIdListHelper.read(_input);
          return _result;
        }
        catch (org.omg.CORBA.portable.ApplicationException _exception) {
          java.lang.String _exception_id = _exception.getId();
          if (_exception_id.equals(com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem.OptionalOperationNotSupportedExceptionHelper.id())) {
            throw             com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem.OptionalOperationNotSupportedExceptionHelper.read(_exception.getInputStream());
          }
          if (_exception_id.equals(com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem.NoSuchIdExceptionHelper.id())) {
            throw             com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem.NoSuchIdExceptionHelper.read(_exception.getInputStream());
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
        com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem._PerformanceMonitoringOperationsOperations _self = null;
        final org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke("suspend_performance_monitoring", _opsClass);
        if (_so == null) {
          continue;
        }
        try {
          _self = (com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem._PerformanceMonitoringOperationsOperations)_so.servant;
        } catch (java.lang.ClassCastException _vis_ce) {
          org.omg.CORBA.portable.OutputStream _output = null;
          org.omg.CORBA.portable.InputStream  _input  = null;
          com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.CommonIRPConstDefs.Signal _result;

          try {
            _output = _orb().create_output_stream();
            final org.omg.CORBA.portable.OutputStream _response_output = _orb().create_output_stream();
            final org.omg.CORBA.portable.OutputStream _response_ex_output = _orb().create_output_stream();
            com.inprise.vbroker.orb.VBResponseHandler _vis_vbr = com.inprise.vbroker.orb.VBResponseHandler.getResponseHandler(_response_output,_response_ex_output);
            com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPConstDefs.PerformanceMonitoringIdListHelper.write(_output, performance_monitoring_id_list);
            org.omg.CORBA.portable.OutputStream _result_output = (((org.omg.CORBA.portable.InvokeHandler)_so.servant)._invoke("suspend_performance_monitoring",_output.create_input_stream(),_vis_vbr));
            _input = _result_output.create_input_stream();

            if(_vis_vbr.get_exflag()) {
              java.lang.String ex_repid = _input.read_string();
              if(ex_repid.equals("IDL:PerformanceIRPSystem/OptionalOperationNotSupportedException:1.0")) {
                com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem.OptionalOperationNotSupportedException exf =                 com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem.OptionalOperationNotSupportedExceptionHelper.read(_result_output.create_input_stream());
                throw exf;
              }
              if(ex_repid.equals("IDL:PerformanceIRPSystem/NoSuchIdException:1.0")) {
                com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem.NoSuchIdException exf =                 com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem.NoSuchIdExceptionHelper.read(_result_output.create_input_stream());
                throw exf;
              }
            }

            _result = com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.CommonIRPConstDefs.SignalHelper.read(_input);

            bad_performance_monitoring_id_list.value = com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPConstDefs.PerformanceMonitoringIdListHelper.read(_input);

            if (_so instanceof org.omg.CORBA.portable.ServantObjectExt) {
              ((org.omg.CORBA.portable.ServantObjectExt)_so).normalCompletion();
            }
            return _result;
          } catch (com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem.OptionalOperationNotSupportedException x_1) {
            if (_so instanceof org.omg.CORBA.portable.ServantObjectExt) {
              ((org.omg.CORBA.portable.ServantObjectExt)_so).exceptionalCompletion((Throwable)x_1);
            }
            throw x_1;

          } catch (com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem.NoSuchIdException x_2) {
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
          com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.CommonIRPConstDefs.Signal _ret = _self.suspend_performance_monitoring(performance_monitoring_id_list, 
                                                                                                                                         bad_performance_monitoring_id_list);
          if (_so instanceof org.omg.CORBA.portable.ServantObjectExt) {
            ((org.omg.CORBA.portable.ServantObjectExt)_so).normalCompletion();
          }
          return _ret;
        } catch (com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem.OptionalOperationNotSupportedException x_1) {
            if (_so instanceof org.omg.CORBA.portable.ServantObjectExt) {
              ((org.omg.CORBA.portable.ServantObjectExt)_so).exceptionalCompletion((Throwable)x_1);
            }
          throw x_1;
        } catch (com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem.NoSuchIdException x_2) {
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
   *   com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.CommonIRPConstDefs.Signal delete_performance_monitoring (in com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPConstDefs.PerformanceMonitoringId performance_monitoring_id)
    raises (com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem.OptionalOperationNotSupportedException,
            com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem.NoSuchIdException);
   * </pre>
   */
  public com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.CommonIRPConstDefs.Signal delete_performance_monitoring (int performance_monitoring_id) throws  com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem.OptionalOperationNotSupportedException, 
                                                                                                                                                                  com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem.NoSuchIdException {

    while (true) {
      if (!_is_local()) {
        org.omg.CORBA.portable.OutputStream _output = null;
        org.omg.CORBA.portable.InputStream  _input  = null;
        com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.CommonIRPConstDefs.Signal _result;
        try {
          _output = this._request("delete_performance_monitoring", true);
          _output.write_long((int)performance_monitoring_id);
          _input = this._invoke(_output);
          _result = com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.CommonIRPConstDefs.SignalHelper.read(_input);
          return _result;
        }
        catch (org.omg.CORBA.portable.ApplicationException _exception) {
          java.lang.String _exception_id = _exception.getId();
          if (_exception_id.equals(com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem.OptionalOperationNotSupportedExceptionHelper.id())) {
            throw             com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem.OptionalOperationNotSupportedExceptionHelper.read(_exception.getInputStream());
          }
          if (_exception_id.equals(com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem.NoSuchIdExceptionHelper.id())) {
            throw             com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem.NoSuchIdExceptionHelper.read(_exception.getInputStream());
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
        com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem._PerformanceMonitoringOperationsOperations _self = null;
        final org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke("delete_performance_monitoring", _opsClass);
        if (_so == null) {
          continue;
        }
        try {
          _self = (com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem._PerformanceMonitoringOperationsOperations)_so.servant;
        } catch (java.lang.ClassCastException _vis_ce) {
          org.omg.CORBA.portable.OutputStream _output = null;
          org.omg.CORBA.portable.InputStream  _input  = null;
          com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.CommonIRPConstDefs.Signal _result;

          try {
            _output = _orb().create_output_stream();
            final org.omg.CORBA.portable.OutputStream _response_output = _orb().create_output_stream();
            final org.omg.CORBA.portable.OutputStream _response_ex_output = _orb().create_output_stream();
            com.inprise.vbroker.orb.VBResponseHandler _vis_vbr = com.inprise.vbroker.orb.VBResponseHandler.getResponseHandler(_response_output,_response_ex_output);
            _output.write_long((int)performance_monitoring_id);
            org.omg.CORBA.portable.OutputStream _result_output = (((org.omg.CORBA.portable.InvokeHandler)_so.servant)._invoke("delete_performance_monitoring",_output.create_input_stream(),_vis_vbr));
            _input = _result_output.create_input_stream();

            if(_vis_vbr.get_exflag()) {
              java.lang.String ex_repid = _input.read_string();
              if(ex_repid.equals("IDL:PerformanceIRPSystem/OptionalOperationNotSupportedException:1.0")) {
                com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem.OptionalOperationNotSupportedException exf =                 com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem.OptionalOperationNotSupportedExceptionHelper.read(_result_output.create_input_stream());
                throw exf;
              }
              if(ex_repid.equals("IDL:PerformanceIRPSystem/NoSuchIdException:1.0")) {
                com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem.NoSuchIdException exf =                 com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem.NoSuchIdExceptionHelper.read(_result_output.create_input_stream());
                throw exf;
              }
            }

            _result = com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.CommonIRPConstDefs.SignalHelper.read(_input);

            if (_so instanceof org.omg.CORBA.portable.ServantObjectExt) {
              ((org.omg.CORBA.portable.ServantObjectExt)_so).normalCompletion();
            }
            return _result;
          } catch (com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem.OptionalOperationNotSupportedException x_1) {
            if (_so instanceof org.omg.CORBA.portable.ServantObjectExt) {
              ((org.omg.CORBA.portable.ServantObjectExt)_so).exceptionalCompletion((Throwable)x_1);
            }
            throw x_1;

          } catch (com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem.NoSuchIdException x_2) {
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
          com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.CommonIRPConstDefs.Signal _ret = _self.delete_performance_monitoring(performance_monitoring_id);
          if (_so instanceof org.omg.CORBA.portable.ServantObjectExt) {
            ((org.omg.CORBA.portable.ServantObjectExt)_so).normalCompletion();
          }
          return _ret;
        } catch (com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem.OptionalOperationNotSupportedException x_1) {
            if (_so instanceof org.omg.CORBA.portable.ServantObjectExt) {
              ((org.omg.CORBA.portable.ServantObjectExt)_so).exceptionalCompletion((Throwable)x_1);
            }
          throw x_1;
        } catch (com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem.NoSuchIdException x_2) {
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

    while (true) {
      if (!_is_local()) {
        org.omg.CORBA.portable.OutputStream _output = null;
        org.omg.CORBA.portable.InputStream  _input  = null;
        com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.CommonIRPConstDefs.Signal _result;
        try {
          _output = this._request("lookup_performance_monitoring", true);
          _output.write_long((int)performance_monitoring_id);
          _input = this._invoke(_output);
          _result = com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.CommonIRPConstDefs.SignalHelper.read(_input);
          observation_class_list.value = com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPConstDefs.ObservationClassListHelper.read(_input);
          observation_object_list.value = com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPConstDefs.ObservationObjectListHelper.read(_input);
          granularity_period.value = _input.read_long();
          schedule.value = com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPConstDefs.ScheduleHelper.read(_input);
          reporting_period.value = _input.read_long();
          destination.value = com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPConstDefs.DestinationHelper.read(_input);
          performance_monitoring_state.value = com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPConstDefs.PerformanceMonitoringStateHelper.read(_input);
          measurement_name.value = _input.read_string();
          return _result;
        }
        catch (org.omg.CORBA.portable.ApplicationException _exception) {
          java.lang.String _exception_id = _exception.getId();
          if (_exception_id.equals(com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem.OptionalOperationNotSupportedExceptionHelper.id())) {
            throw             com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem.OptionalOperationNotSupportedExceptionHelper.read(_exception.getInputStream());
          }
          if (_exception_id.equals(com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem.NoSuchIdExceptionHelper.id())) {
            throw             com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem.NoSuchIdExceptionHelper.read(_exception.getInputStream());
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
        com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem._PerformanceMonitoringOperationsOperations _self = null;
        final org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke("lookup_performance_monitoring", _opsClass);
        if (_so == null) {
          continue;
        }
        try {
          _self = (com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem._PerformanceMonitoringOperationsOperations)_so.servant;
        } catch (java.lang.ClassCastException _vis_ce) {
          org.omg.CORBA.portable.OutputStream _output = null;
          org.omg.CORBA.portable.InputStream  _input  = null;
          com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.CommonIRPConstDefs.Signal _result;

          try {
            _output = _orb().create_output_stream();
            final org.omg.CORBA.portable.OutputStream _response_output = _orb().create_output_stream();
            final org.omg.CORBA.portable.OutputStream _response_ex_output = _orb().create_output_stream();
            com.inprise.vbroker.orb.VBResponseHandler _vis_vbr = com.inprise.vbroker.orb.VBResponseHandler.getResponseHandler(_response_output,_response_ex_output);
            _output.write_long((int)performance_monitoring_id);
            org.omg.CORBA.portable.OutputStream _result_output = (((org.omg.CORBA.portable.InvokeHandler)_so.servant)._invoke("lookup_performance_monitoring",_output.create_input_stream(),_vis_vbr));
            _input = _result_output.create_input_stream();

            if(_vis_vbr.get_exflag()) {
              java.lang.String ex_repid = _input.read_string();
              if(ex_repid.equals("IDL:PerformanceIRPSystem/OptionalOperationNotSupportedException:1.0")) {
                com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem.OptionalOperationNotSupportedException exf =                 com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem.OptionalOperationNotSupportedExceptionHelper.read(_result_output.create_input_stream());
                throw exf;
              }
              if(ex_repid.equals("IDL:PerformanceIRPSystem/NoSuchIdException:1.0")) {
                com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem.NoSuchIdException exf =                 com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem.NoSuchIdExceptionHelper.read(_result_output.create_input_stream());
                throw exf;
              }
            }

            _result = com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.CommonIRPConstDefs.SignalHelper.read(_input);

            observation_class_list.value = com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPConstDefs.ObservationClassListHelper.read(_input);
            observation_object_list.value = com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPConstDefs.ObservationObjectListHelper.read(_input);
            granularity_period.value = _input.read_long();
            schedule.value = com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPConstDefs.ScheduleHelper.read(_input);
            reporting_period.value = _input.read_long();
            destination.value = com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPConstDefs.DestinationHelper.read(_input);
            performance_monitoring_state.value = com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPConstDefs.PerformanceMonitoringStateHelper.read(_input);
            measurement_name.value = _input.read_string();

            if (_so instanceof org.omg.CORBA.portable.ServantObjectExt) {
              ((org.omg.CORBA.portable.ServantObjectExt)_so).normalCompletion();
            }
            return _result;
          } catch (com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem.OptionalOperationNotSupportedException x_1) {
            if (_so instanceof org.omg.CORBA.portable.ServantObjectExt) {
              ((org.omg.CORBA.portable.ServantObjectExt)_so).exceptionalCompletion((Throwable)x_1);
            }
            throw x_1;

          } catch (com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem.NoSuchIdException x_2) {
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
          com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.CommonIRPConstDefs.Signal _ret = _self.lookup_performance_monitoring(performance_monitoring_id, 
                                                                                                                                        observation_class_list, 
                                                                                                                                        observation_object_list, 
                                                                                                                                        granularity_period, 
                                                                                                                                        schedule, 
                                                                                                                                        reporting_period, 
                                                                                                                                        destination, 
                                                                                                                                        performance_monitoring_state, 
                                                                                                                                        measurement_name);
          if (_so instanceof org.omg.CORBA.portable.ServantObjectExt) {
            ((org.omg.CORBA.portable.ServantObjectExt)_so).normalCompletion();
          }
          return _ret;
        } catch (com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem.OptionalOperationNotSupportedException x_1) {
            if (_so instanceof org.omg.CORBA.portable.ServantObjectExt) {
              ((org.omg.CORBA.portable.ServantObjectExt)_so).exceptionalCompletion((Throwable)x_1);
            }
          throw x_1;
        } catch (com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem.NoSuchIdException x_2) {
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

    while (true) {
      if (!_is_local()) {
        org.omg.CORBA.portable.OutputStream _output = null;
        org.omg.CORBA.portable.InputStream  _input  = null;
        com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.CommonIRPConstDefs.Signal _result;
        try {
          _output = this._request("create_performance_monitoring", true);
          com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPConstDefs.ObservationClassListHelper.write(_output, observation_class_list);
          com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPConstDefs.ObservationObjectListHelper.write(_output, observation_object_list);
          _output.write_long((int)granularity_period);
          if (schedule == null) {
            throw new org.omg.CORBA.BAD_PARAM("Invalid array length");
          }
          com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPConstDefs.ScheduleHelper.write(_output, schedule);
          _output.write_long((int)reporting_period);
          com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPConstDefs.DestinationHelper.write(_output, destination);
          _output.write_string((java.lang.String)measurement_name);
          com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPConstDefs.PerformanceMonitoringStateHelper.write(_output, performance_monitoring_state);
          _input = this._invoke(_output);
          _result = com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.CommonIRPConstDefs.SignalHelper.read(_input);
          performance_monitoring_id.value = _input.read_long();
          failure_information.value = com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPConstDefs.FailureInformationHelper.read(_input);
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
          if (_exception_id.equals(com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem.InvalidObservationObjectExceptionHelper.id())) {
            throw             com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem.InvalidObservationObjectExceptionHelper.read(_exception.getInputStream());
          }
          if (_exception_id.equals(com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem.InvalidObservationClassExceptionHelper.id())) {
            throw             com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem.InvalidObservationClassExceptionHelper.read(_exception.getInputStream());
          }
          if (_exception_id.equals(com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem.InvalidMeasurementAttributeExceptionHelper.id())) {
            throw             com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem.InvalidMeasurementAttributeExceptionHelper.read(_exception.getInputStream());
          }
          if (_exception_id.equals(com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem.InvalidGranularityPeriodExceptionHelper.id())) {
            throw             com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem.InvalidGranularityPeriodExceptionHelper.read(_exception.getInputStream());
          }
          if (_exception_id.equals(com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem.InvalidScheduleExceptionHelper.id())) {
            throw             com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem.InvalidScheduleExceptionHelper.read(_exception.getInputStream());
          }
          if (_exception_id.equals(com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem.InvalidReportingPeriodExceptionHelper.id())) {
            throw             com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem.InvalidReportingPeriodExceptionHelper.read(_exception.getInputStream());
          }
          if (_exception_id.equals(com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem.DestinationNotSupportedExceptionHelper.id())) {
            throw             com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem.DestinationNotSupportedExceptionHelper.read(_exception.getInputStream());
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
        com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem._PerformanceMonitoringOperationsOperations _self = null;
        final org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke("create_performance_monitoring", _opsClass);
        if (_so == null) {
          continue;
        }
        try {
          _self = (com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem._PerformanceMonitoringOperationsOperations)_so.servant;
        } catch (java.lang.ClassCastException _vis_ce) {
          org.omg.CORBA.portable.OutputStream _output = null;
          org.omg.CORBA.portable.InputStream  _input  = null;
          com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.CommonIRPConstDefs.Signal _result;

          try {
            _output = _orb().create_output_stream();
            final org.omg.CORBA.portable.OutputStream _response_output = _orb().create_output_stream();
            final org.omg.CORBA.portable.OutputStream _response_ex_output = _orb().create_output_stream();
            com.inprise.vbroker.orb.VBResponseHandler _vis_vbr = com.inprise.vbroker.orb.VBResponseHandler.getResponseHandler(_response_output,_response_ex_output);
            com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPConstDefs.ObservationClassListHelper.write(_output, observation_class_list);
            com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPConstDefs.ObservationObjectListHelper.write(_output, observation_object_list);
            _output.write_long((int)granularity_period);
            if (schedule == null) {
              throw new org.omg.CORBA.BAD_PARAM("Invalid array length");
            }
            com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPConstDefs.ScheduleHelper.write(_output, schedule);
            _output.write_long((int)reporting_period);
            com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPConstDefs.DestinationHelper.write(_output, destination);
            _output.write_string((java.lang.String)measurement_name);
            com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPConstDefs.PerformanceMonitoringStateHelper.write(_output, performance_monitoring_state);
            org.omg.CORBA.portable.OutputStream _result_output = (((org.omg.CORBA.portable.InvokeHandler)_so.servant)._invoke("create_performance_monitoring",_output.create_input_stream(),_vis_vbr));
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
              if(ex_repid.equals("IDL:PerformanceIRPSystem/InvalidObservationObjectException:1.0")) {
                com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem.InvalidObservationObjectException exf =                 com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem.InvalidObservationObjectExceptionHelper.read(_result_output.create_input_stream());
                throw exf;
              }
              if(ex_repid.equals("IDL:PerformanceIRPSystem/InvalidObservationClassException:1.0")) {
                com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem.InvalidObservationClassException exf =                 com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem.InvalidObservationClassExceptionHelper.read(_result_output.create_input_stream());
                throw exf;
              }
              if(ex_repid.equals("IDL:PerformanceIRPSystem/InvalidMeasurementAttributeException:1.0")) {
                com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem.InvalidMeasurementAttributeException exf =                 com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem.InvalidMeasurementAttributeExceptionHelper.read(_result_output.create_input_stream());
                throw exf;
              }
              if(ex_repid.equals("IDL:PerformanceIRPSystem/InvalidGranularityPeriodException:1.0")) {
                com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem.InvalidGranularityPeriodException exf =                 com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem.InvalidGranularityPeriodExceptionHelper.read(_result_output.create_input_stream());
                throw exf;
              }
              if(ex_repid.equals("IDL:PerformanceIRPSystem/InvalidScheduleException:1.0")) {
                com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem.InvalidScheduleException exf =                 com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem.InvalidScheduleExceptionHelper.read(_result_output.create_input_stream());
                throw exf;
              }
              if(ex_repid.equals("IDL:PerformanceIRPSystem/InvalidReportingPeriodException:1.0")) {
                com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem.InvalidReportingPeriodException exf =                 com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem.InvalidReportingPeriodExceptionHelper.read(_result_output.create_input_stream());
                throw exf;
              }
              if(ex_repid.equals("IDL:PerformanceIRPSystem/DestinationNotSupportedException:1.0")) {
                com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem.DestinationNotSupportedException exf =                 com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem.DestinationNotSupportedExceptionHelper.read(_result_output.create_input_stream());
                throw exf;
              }
            }

            _result = com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.CommonIRPConstDefs.SignalHelper.read(_input);

            performance_monitoring_id.value = _input.read_long();
            failure_information.value = com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPConstDefs.FailureInformationHelper.read(_input);

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

          } catch (com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem.InvalidObservationObjectException x_3) {
            if (_so instanceof org.omg.CORBA.portable.ServantObjectExt) {
              ((org.omg.CORBA.portable.ServantObjectExt)_so).exceptionalCompletion((Throwable)x_3);
            }
            throw x_3;

          } catch (com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem.InvalidObservationClassException x_4) {
            if (_so instanceof org.omg.CORBA.portable.ServantObjectExt) {
              ((org.omg.CORBA.portable.ServantObjectExt)_so).exceptionalCompletion((Throwable)x_4);
            }
            throw x_4;

          } catch (com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem.InvalidMeasurementAttributeException x_5) {
            if (_so instanceof org.omg.CORBA.portable.ServantObjectExt) {
              ((org.omg.CORBA.portable.ServantObjectExt)_so).exceptionalCompletion((Throwable)x_5);
            }
            throw x_5;

          } catch (com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem.InvalidGranularityPeriodException x_6) {
            if (_so instanceof org.omg.CORBA.portable.ServantObjectExt) {
              ((org.omg.CORBA.portable.ServantObjectExt)_so).exceptionalCompletion((Throwable)x_6);
            }
            throw x_6;

          } catch (com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem.InvalidScheduleException x_7) {
            if (_so instanceof org.omg.CORBA.portable.ServantObjectExt) {
              ((org.omg.CORBA.portable.ServantObjectExt)_so).exceptionalCompletion((Throwable)x_7);
            }
            throw x_7;

          } catch (com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem.InvalidReportingPeriodException x_8) {
            if (_so instanceof org.omg.CORBA.portable.ServantObjectExt) {
              ((org.omg.CORBA.portable.ServantObjectExt)_so).exceptionalCompletion((Throwable)x_8);
            }
            throw x_8;

          } catch (com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem.DestinationNotSupportedException x_9) {
            if (_so instanceof org.omg.CORBA.portable.ServantObjectExt) {
              ((org.omg.CORBA.portable.ServantObjectExt)_so).exceptionalCompletion((Throwable)x_9);
            }
            throw x_9;

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
          com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.CommonIRPConstDefs.Signal _ret = _self.create_performance_monitoring(observation_class_list, 
                                                                                                                                        observation_object_list, 
                                                                                                                                        granularity_period, 
                                                                                                                                        schedule, 
                                                                                                                                        reporting_period, 
                                                                                                                                        destination, 
                                                                                                                                        measurement_name, 
                                                                                                                                        performance_monitoring_state, 
                                                                                                                                        performance_monitoring_id, 
                                                                                                                                        failure_information);
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
        } catch (com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem.InvalidObservationObjectException x_3) {
            if (_so instanceof org.omg.CORBA.portable.ServantObjectExt) {
              ((org.omg.CORBA.portable.ServantObjectExt)_so).exceptionalCompletion((Throwable)x_3);
            }
          throw x_3;
        } catch (com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem.InvalidObservationClassException x_4) {
            if (_so instanceof org.omg.CORBA.portable.ServantObjectExt) {
              ((org.omg.CORBA.portable.ServantObjectExt)_so).exceptionalCompletion((Throwable)x_4);
            }
          throw x_4;
        } catch (com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem.InvalidMeasurementAttributeException x_5) {
            if (_so instanceof org.omg.CORBA.portable.ServantObjectExt) {
              ((org.omg.CORBA.portable.ServantObjectExt)_so).exceptionalCompletion((Throwable)x_5);
            }
          throw x_5;
        } catch (com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem.InvalidGranularityPeriodException x_6) {
            if (_so instanceof org.omg.CORBA.portable.ServantObjectExt) {
              ((org.omg.CORBA.portable.ServantObjectExt)_so).exceptionalCompletion((Throwable)x_6);
            }
          throw x_6;
        } catch (com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem.InvalidScheduleException x_7) {
            if (_so instanceof org.omg.CORBA.portable.ServantObjectExt) {
              ((org.omg.CORBA.portable.ServantObjectExt)_so).exceptionalCompletion((Throwable)x_7);
            }
          throw x_7;
        } catch (com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem.InvalidReportingPeriodException x_8) {
            if (_so instanceof org.omg.CORBA.portable.ServantObjectExt) {
              ((org.omg.CORBA.portable.ServantObjectExt)_so).exceptionalCompletion((Throwable)x_8);
            }
          throw x_8;
        } catch (com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem.DestinationNotSupportedException x_9) {
            if (_so instanceof org.omg.CORBA.portable.ServantObjectExt) {
              ((org.omg.CORBA.portable.ServantObjectExt)_so).exceptionalCompletion((Throwable)x_9);
            }
          throw x_9;
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
   *   com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.CommonIRPConstDefs.Signal list_performance_monitorings (in com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPConstDefs.NeList ne_list,
                                                                                                                   out com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPConstDefs.PerformanceMonitoringList performance_monitoring_list)
    raises (com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem.OptionalOperationNotSupportedException,
            com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem.OptionalParameterNotSupportedException);
   * </pre>
   */
  public com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.CommonIRPConstDefs.Signal list_performance_monitorings (java.lang.String[] ne_list, 
                                                                                                                          com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPConstDefs.PerformanceMonitoringListHolder performance_monitoring_list) throws  com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem.OptionalOperationNotSupportedException, 
                                                                                                                                                                                                                                                                                com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem.OptionalParameterNotSupportedException {

    while (true) {
      if (!_is_local()) {
        org.omg.CORBA.portable.OutputStream _output = null;
        org.omg.CORBA.portable.InputStream  _input  = null;
        com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.CommonIRPConstDefs.Signal _result;
        try {
          _output = this._request("list_performance_monitorings", true);
          com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPConstDefs.NeListHelper.write(_output, ne_list);
          _input = this._invoke(_output);
          _result = com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.CommonIRPConstDefs.SignalHelper.read(_input);
          performance_monitoring_list.value = com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPConstDefs.PerformanceMonitoringListHelper.read(_input);
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
        com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem._PerformanceMonitoringOperationsOperations _self = null;
        final org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke("list_performance_monitorings", _opsClass);
        if (_so == null) {
          continue;
        }
        try {
          _self = (com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem._PerformanceMonitoringOperationsOperations)_so.servant;
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
            org.omg.CORBA.portable.OutputStream _result_output = (((org.omg.CORBA.portable.InvokeHandler)_so.servant)._invoke("list_performance_monitorings",_output.create_input_stream(),_vis_vbr));
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

            performance_monitoring_list.value = com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPConstDefs.PerformanceMonitoringListHelper.read(_input);

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
          com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.CommonIRPConstDefs.Signal _ret = _self.list_performance_monitorings(ne_list, 
                                                                                                                                       performance_monitoring_list);
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
