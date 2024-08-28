package com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem;

/**
 * <ul>
 * <li> <b>IDL Source</b>    "C:/MicroFocus/VisiBroker/bin/PerformanceIRPSystem_6_0/PerformanceMonitoringOperations_6_0.idl"
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
public class __PerformanceMonitoringOperationsStub extends com.inprise.vbroker.CORBA.portable.ObjectImpl implements com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem._PerformanceMonitoringOperations {
  final public static java.lang.Class _opsClass = com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem._PerformanceMonitoringOperationsOperations.class;

  public java.lang.String[] _ids () {
    return __ids;
  }

  private static java.lang.String[] __ids = {
    "IDL:PerformanceIRPSystem/PerformanceMonitoringOperations:1.0"
  };

  /**
   * <pre>
   *   com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.CommonIRPConstDefs.Signal lookup_filter_performance_monitoring_report (in com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPConstDefs.PerformanceMonitoringId performance_monitoring_id,
                                                                                                                                  out com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPConstDefs.RecordingType recording_type,
                                                                                                                                  out com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPConstDefs.ObservationObject triggering_object,
                                                                                                                                  out com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPConstDefs.ObservationObjectList observation_object_list,
                                                                                                                                  out com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPConstDefs.Filter filter,
                                                                                                                                  out com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPConstDefs.TimeWindow time_window,
                                                                                                                                  out com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPConstDefs.SamplingRate sampling_rate)
    raises (com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.OptionalOperationNotSupportedException,
            com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.NoSuchIdException,
            com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.InvalidPerformanceMonitoringTypeException,
            com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.ProcessingErrorException,
            com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.InvalidParameterException);
   * </pre>
   */
  public com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.CommonIRPConstDefs.Signal lookup_filter_performance_monitoring_report (int performance_monitoring_id, 
                                                                                                                                         com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPConstDefs.RecordingTypeHolder recording_type, 
                                                                                                                                         com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPConstDefs.ObservationObjectHolder triggering_object, 
                                                                                                                                         com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPConstDefs.ObservationObjectListHolder observation_object_list, 
                                                                                                                                         com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPConstDefs.FilterHolder filter, 
                                                                                                                                         com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPConstDefs.TimeWindowHolder time_window, 
                                                                                                                                         org.omg.CORBA.IntHolder sampling_rate) throws  com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.OptionalOperationNotSupportedException, 
                                                                                                                                                                                        com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.NoSuchIdException, 
                                                                                                                                                                                        com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.InvalidPerformanceMonitoringTypeException, 
                                                                                                                                                                                        com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.ProcessingErrorException, 
                                                                                                                                                                                        com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.InvalidParameterException {

    while (true) {
      if (!_is_local()) {
        org.omg.CORBA.portable.OutputStream _output = null;
        org.omg.CORBA.portable.InputStream  _input  = null;
        com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.CommonIRPConstDefs.Signal _result;
        try {
          _output = this._request("lookup_filter_performance_monitoring_report", true);
          _output.write_long((int)performance_monitoring_id);
          _input = this._invoke(_output);
          _result = com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.CommonIRPConstDefs.SignalHelper.read(_input);
          recording_type.value = com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPConstDefs.RecordingTypeHelper.read(_input);
          triggering_object.value = com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPConstDefs.ObservationObjectHelper.read(_input);
          observation_object_list.value = com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPConstDefs.ObservationObjectListHelper.read(_input);
          filter.value = com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPConstDefs.FilterHelper.read(_input);
          time_window.value = com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPConstDefs.TimeWindowHelper.read(_input);
          sampling_rate.value = _input.read_long();
          return _result;
        }
        catch (org.omg.CORBA.portable.ApplicationException _exception) {
          java.lang.String _exception_id = _exception.getId();
          if (_exception_id.equals(com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.OptionalOperationNotSupportedExceptionHelper.id())) {
            throw             com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.OptionalOperationNotSupportedExceptionHelper.read(_exception.getInputStream());
          }
          if (_exception_id.equals(com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.NoSuchIdExceptionHelper.id())) {
            throw             com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.NoSuchIdExceptionHelper.read(_exception.getInputStream());
          }
          if (_exception_id.equals(com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.InvalidPerformanceMonitoringTypeExceptionHelper.id())) {
            throw             com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.InvalidPerformanceMonitoringTypeExceptionHelper.read(_exception.getInputStream());
          }
          if (_exception_id.equals(com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.ProcessingErrorExceptionHelper.id())) {
            throw             com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.ProcessingErrorExceptionHelper.read(_exception.getInputStream());
          }
          if (_exception_id.equals(com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.InvalidParameterExceptionHelper.id())) {
            throw             com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.InvalidParameterExceptionHelper.read(_exception.getInputStream());
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
        com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem._PerformanceMonitoringOperationsOperations _self = null;
        final org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke("lookup_filter_performance_monitoring_report", _opsClass);
        if (_so == null) {
          continue;
        }
        try {
          _self = (com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem._PerformanceMonitoringOperationsOperations)_so.servant;
        } catch (java.lang.ClassCastException _vis_ce) {
          org.omg.CORBA.portable.OutputStream _output = null;
          org.omg.CORBA.portable.InputStream  _input  = null;
          com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.CommonIRPConstDefs.Signal _result;

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
                com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.OptionalOperationNotSupportedException exf =                 com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.OptionalOperationNotSupportedExceptionHelper.read(_result_output.create_input_stream());
                throw exf;
              }
              if(ex_repid.equals("IDL:PerformanceIRPSystem/NoSuchIdException:1.0")) {
                com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.NoSuchIdException exf =                 com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.NoSuchIdExceptionHelper.read(_result_output.create_input_stream());
                throw exf;
              }
              if(ex_repid.equals("IDL:PerformanceIRPSystem/InvalidPerformanceMonitoringTypeException:1.0")) {
                com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.InvalidPerformanceMonitoringTypeException exf =                 com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.InvalidPerformanceMonitoringTypeExceptionHelper.read(_result_output.create_input_stream());
                throw exf;
              }
              if(ex_repid.equals("IDL:PerformanceIRPSystem/ProcessingErrorException:1.0")) {
                com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.ProcessingErrorException exf =                 com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.ProcessingErrorExceptionHelper.read(_result_output.create_input_stream());
                throw exf;
              }
              if(ex_repid.equals("IDL:PerformanceIRPSystem/InvalidParameterException:1.0")) {
                com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.InvalidParameterException exf =                 com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.InvalidParameterExceptionHelper.read(_result_output.create_input_stream());
                throw exf;
              }
            }

            _result = com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.CommonIRPConstDefs.SignalHelper.read(_input);

            recording_type.value = com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPConstDefs.RecordingTypeHelper.read(_input);
            triggering_object.value = com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPConstDefs.ObservationObjectHelper.read(_input);
            observation_object_list.value = com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPConstDefs.ObservationObjectListHelper.read(_input);
            filter.value = com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPConstDefs.FilterHelper.read(_input);
            time_window.value = com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPConstDefs.TimeWindowHelper.read(_input);
            sampling_rate.value = _input.read_long();

            if (_so instanceof org.omg.CORBA.portable.ServantObjectExt) {
              ((org.omg.CORBA.portable.ServantObjectExt)_so).normalCompletion();
            }
            return _result;
          } catch (com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.OptionalOperationNotSupportedException x_1) {
            if (_so instanceof org.omg.CORBA.portable.ServantObjectExt) {
              ((org.omg.CORBA.portable.ServantObjectExt)_so).exceptionalCompletion((Throwable)x_1);
            }
            throw x_1;

          } catch (com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.NoSuchIdException x_2) {
            if (_so instanceof org.omg.CORBA.portable.ServantObjectExt) {
              ((org.omg.CORBA.portable.ServantObjectExt)_so).exceptionalCompletion((Throwable)x_2);
            }
            throw x_2;

          } catch (com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.InvalidPerformanceMonitoringTypeException x_3) {
            if (_so instanceof org.omg.CORBA.portable.ServantObjectExt) {
              ((org.omg.CORBA.portable.ServantObjectExt)_so).exceptionalCompletion((Throwable)x_3);
            }
            throw x_3;

          } catch (com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.ProcessingErrorException x_4) {
            if (_so instanceof org.omg.CORBA.portable.ServantObjectExt) {
              ((org.omg.CORBA.portable.ServantObjectExt)_so).exceptionalCompletion((Throwable)x_4);
            }
            throw x_4;

          } catch (com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.InvalidParameterException x_5) {
            if (_so instanceof org.omg.CORBA.portable.ServantObjectExt) {
              ((org.omg.CORBA.portable.ServantObjectExt)_so).exceptionalCompletion((Throwable)x_5);
            }
            throw x_5;

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
          com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.CommonIRPConstDefs.Signal _ret = _self.lookup_filter_performance_monitoring_report(performance_monitoring_id, 
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
        } catch (com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.OptionalOperationNotSupportedException x_1) {
            if (_so instanceof org.omg.CORBA.portable.ServantObjectExt) {
              ((org.omg.CORBA.portable.ServantObjectExt)_so).exceptionalCompletion((Throwable)x_1);
            }
          throw x_1;
        } catch (com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.NoSuchIdException x_2) {
            if (_so instanceof org.omg.CORBA.portable.ServantObjectExt) {
              ((org.omg.CORBA.portable.ServantObjectExt)_so).exceptionalCompletion((Throwable)x_2);
            }
          throw x_2;
        } catch (com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.InvalidPerformanceMonitoringTypeException x_3) {
            if (_so instanceof org.omg.CORBA.portable.ServantObjectExt) {
              ((org.omg.CORBA.portable.ServantObjectExt)_so).exceptionalCompletion((Throwable)x_3);
            }
          throw x_3;
        } catch (com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.ProcessingErrorException x_4) {
            if (_so instanceof org.omg.CORBA.portable.ServantObjectExt) {
              ((org.omg.CORBA.portable.ServantObjectExt)_so).exceptionalCompletion((Throwable)x_4);
            }
          throw x_4;
        } catch (com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.InvalidParameterException x_5) {
            if (_so instanceof org.omg.CORBA.portable.ServantObjectExt) {
              ((org.omg.CORBA.portable.ServantObjectExt)_so).exceptionalCompletion((Throwable)x_5);
            }
          throw x_5;
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
   *   com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.CommonIRPConstDefs.Signal filter_performance_monitoring_report (in com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPConstDefs.PerformanceMonitoringIdList performance_monitoring_id_list,
                                                                                                                           in com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPConstDefs.RecordingType recording_type,
                                                                                                                           in com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPConstDefs.ObservationObject triggering_object,
                                                                                                                           in com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPConstDefs.ObservationObjectList observation_object_list,
                                                                                                                           in com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPConstDefs.Filter filter,
                                                                                                                           in com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPConstDefs.TimeWindow time_window,
                                                                                                                           in com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPConstDefs.SamplingRate sampling_rate,
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
  public com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.CommonIRPConstDefs.Signal filter_performance_monitoring_report (int[] performance_monitoring_id_list, 
                                                                                                                                  com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPConstDefs.RecordingType recording_type, 
                                                                                                                                  com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPConstDefs.ObservationObject triggering_object, 
                                                                                                                                  com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPConstDefs.ObservationObject[] observation_object_list, 
                                                                                                                                  com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPConstDefs.Filter filter, 
                                                                                                                                  int[] time_window, 
                                                                                                                                  int sampling_rate, 
                                                                                                                                  com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPConstDefs.PerformanceMonitoringIdListHolder bad_performance_monitoring_id_list) throws  com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.OptionalOperationNotSupportedException, 
                                                                                                                                                                                                                                                                                                 com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.OptionalParameterNotSupportedException, 
                                                                                                                                                                                                                                                                                                 com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.InvalidPerformanceMonitoringTypeException, 
                                                                                                                                                                                                                                                                                                 com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.ProcessingErrorException, 
                                                                                                                                                                                                                                                                                                 com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.InvalidParameterException, 
                                                                                                                                                                                                                                                                                                 com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.InvalidObservationObjectListException, 
                                                                                                                                                                                                                                                                                                 com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.InvalidFilterException, 
                                                                                                                                                                                                                                                                                                 com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.InvalidTriggeringObjectException {

    while (true) {
      if (!_is_local()) {
        org.omg.CORBA.portable.OutputStream _output = null;
        org.omg.CORBA.portable.InputStream  _input  = null;
        com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.CommonIRPConstDefs.Signal _result;
        try {
          _output = this._request("filter_performance_monitoring_report", true);
          com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPConstDefs.PerformanceMonitoringIdListHelper.write(_output, performance_monitoring_id_list);
          com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPConstDefs.RecordingTypeHelper.write(_output, recording_type);
          if (triggering_object == null) {
            throw new org.omg.CORBA.BAD_PARAM("Invalid array length");
          }
          com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPConstDefs.ObservationObjectHelper.write(_output, triggering_object);
          com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPConstDefs.ObservationObjectListHelper.write(_output, observation_object_list);
          if (filter == null) {
            throw new org.omg.CORBA.BAD_PARAM("Invalid array length");
          }
          com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPConstDefs.FilterHelper.write(_output, filter);
          com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPConstDefs.TimeWindowHelper.write(_output, time_window);
          _output.write_long((int)sampling_rate);
          _input = this._invoke(_output);
          _result = com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.CommonIRPConstDefs.SignalHelper.read(_input);
          bad_performance_monitoring_id_list.value = com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPConstDefs.PerformanceMonitoringIdListHelper.read(_input);
          return _result;
        }
        catch (org.omg.CORBA.portable.ApplicationException _exception) {
          java.lang.String _exception_id = _exception.getId();
          if (_exception_id.equals(com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.OptionalOperationNotSupportedExceptionHelper.id())) {
            throw             com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.OptionalOperationNotSupportedExceptionHelper.read(_exception.getInputStream());
          }
          if (_exception_id.equals(com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.OptionalParameterNotSupportedExceptionHelper.id())) {
            throw             com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.OptionalParameterNotSupportedExceptionHelper.read(_exception.getInputStream());
          }
          if (_exception_id.equals(com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.InvalidPerformanceMonitoringTypeExceptionHelper.id())) {
            throw             com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.InvalidPerformanceMonitoringTypeExceptionHelper.read(_exception.getInputStream());
          }
          if (_exception_id.equals(com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.ProcessingErrorExceptionHelper.id())) {
            throw             com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.ProcessingErrorExceptionHelper.read(_exception.getInputStream());
          }
          if (_exception_id.equals(com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.InvalidParameterExceptionHelper.id())) {
            throw             com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.InvalidParameterExceptionHelper.read(_exception.getInputStream());
          }
          if (_exception_id.equals(com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.InvalidObservationObjectListExceptionHelper.id())) {
            throw             com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.InvalidObservationObjectListExceptionHelper.read(_exception.getInputStream());
          }
          if (_exception_id.equals(com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.InvalidFilterExceptionHelper.id())) {
            throw             com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.InvalidFilterExceptionHelper.read(_exception.getInputStream());
          }
          if (_exception_id.equals(com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.InvalidTriggeringObjectExceptionHelper.id())) {
            throw             com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.InvalidTriggeringObjectExceptionHelper.read(_exception.getInputStream());
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
        com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem._PerformanceMonitoringOperationsOperations _self = null;
        final org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke("filter_performance_monitoring_report", _opsClass);
        if (_so == null) {
          continue;
        }
        try {
          _self = (com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem._PerformanceMonitoringOperationsOperations)_so.servant;
        } catch (java.lang.ClassCastException _vis_ce) {
          org.omg.CORBA.portable.OutputStream _output = null;
          org.omg.CORBA.portable.InputStream  _input  = null;
          com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.CommonIRPConstDefs.Signal _result;

          try {
            _output = _orb().create_output_stream();
            final org.omg.CORBA.portable.OutputStream _response_output = _orb().create_output_stream();
            final org.omg.CORBA.portable.OutputStream _response_ex_output = _orb().create_output_stream();
            com.inprise.vbroker.orb.VBResponseHandler _vis_vbr = com.inprise.vbroker.orb.VBResponseHandler.getResponseHandler(_response_output,_response_ex_output);
            com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPConstDefs.PerformanceMonitoringIdListHelper.write(_output, performance_monitoring_id_list);
            com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPConstDefs.RecordingTypeHelper.write(_output, recording_type);
            if (triggering_object == null) {
              throw new org.omg.CORBA.BAD_PARAM("Invalid array length");
            }
            com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPConstDefs.ObservationObjectHelper.write(_output, triggering_object);
            com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPConstDefs.ObservationObjectListHelper.write(_output, observation_object_list);
            if (filter == null) {
              throw new org.omg.CORBA.BAD_PARAM("Invalid array length");
            }
            com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPConstDefs.FilterHelper.write(_output, filter);
            com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPConstDefs.TimeWindowHelper.write(_output, time_window);
            _output.write_long((int)sampling_rate);
            org.omg.CORBA.portable.OutputStream _result_output = (((org.omg.CORBA.portable.InvokeHandler)_so.servant)._invoke("filter_performance_monitoring_report",_output.create_input_stream(),_vis_vbr));
            _input = _result_output.create_input_stream();

            if(_vis_vbr.get_exflag()) {
              java.lang.String ex_repid = _input.read_string();
              if(ex_repid.equals("IDL:PerformanceIRPSystem/OptionalOperationNotSupportedException:1.0")) {
                com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.OptionalOperationNotSupportedException exf =                 com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.OptionalOperationNotSupportedExceptionHelper.read(_result_output.create_input_stream());
                throw exf;
              }
              if(ex_repid.equals("IDL:PerformanceIRPSystem/OptionalParameterNotSupportedException:1.0")) {
                com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.OptionalParameterNotSupportedException exf =                 com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.OptionalParameterNotSupportedExceptionHelper.read(_result_output.create_input_stream());
                throw exf;
              }
              if(ex_repid.equals("IDL:PerformanceIRPSystem/InvalidPerformanceMonitoringTypeException:1.0")) {
                com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.InvalidPerformanceMonitoringTypeException exf =                 com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.InvalidPerformanceMonitoringTypeExceptionHelper.read(_result_output.create_input_stream());
                throw exf;
              }
              if(ex_repid.equals("IDL:PerformanceIRPSystem/ProcessingErrorException:1.0")) {
                com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.ProcessingErrorException exf =                 com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.ProcessingErrorExceptionHelper.read(_result_output.create_input_stream());
                throw exf;
              }
              if(ex_repid.equals("IDL:PerformanceIRPSystem/InvalidParameterException:1.0")) {
                com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.InvalidParameterException exf =                 com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.InvalidParameterExceptionHelper.read(_result_output.create_input_stream());
                throw exf;
              }
              if(ex_repid.equals("IDL:PerformanceIRPSystem/InvalidObservationObjectListException:1.0")) {
                com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.InvalidObservationObjectListException exf =                 com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.InvalidObservationObjectListExceptionHelper.read(_result_output.create_input_stream());
                throw exf;
              }
              if(ex_repid.equals("IDL:PerformanceIRPSystem/InvalidFilterException:1.0")) {
                com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.InvalidFilterException exf =                 com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.InvalidFilterExceptionHelper.read(_result_output.create_input_stream());
                throw exf;
              }
              if(ex_repid.equals("IDL:PerformanceIRPSystem/InvalidTriggeringObjectException:1.0")) {
                com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.InvalidTriggeringObjectException exf =                 com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.InvalidTriggeringObjectExceptionHelper.read(_result_output.create_input_stream());
                throw exf;
              }
            }

            _result = com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.CommonIRPConstDefs.SignalHelper.read(_input);

            bad_performance_monitoring_id_list.value = com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPConstDefs.PerformanceMonitoringIdListHelper.read(_input);

            if (_so instanceof org.omg.CORBA.portable.ServantObjectExt) {
              ((org.omg.CORBA.portable.ServantObjectExt)_so).normalCompletion();
            }
            return _result;
          } catch (com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.OptionalOperationNotSupportedException x_1) {
            if (_so instanceof org.omg.CORBA.portable.ServantObjectExt) {
              ((org.omg.CORBA.portable.ServantObjectExt)_so).exceptionalCompletion((Throwable)x_1);
            }
            throw x_1;

          } catch (com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.OptionalParameterNotSupportedException x_2) {
            if (_so instanceof org.omg.CORBA.portable.ServantObjectExt) {
              ((org.omg.CORBA.portable.ServantObjectExt)_so).exceptionalCompletion((Throwable)x_2);
            }
            throw x_2;

          } catch (com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.InvalidPerformanceMonitoringTypeException x_3) {
            if (_so instanceof org.omg.CORBA.portable.ServantObjectExt) {
              ((org.omg.CORBA.portable.ServantObjectExt)_so).exceptionalCompletion((Throwable)x_3);
            }
            throw x_3;

          } catch (com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.ProcessingErrorException x_4) {
            if (_so instanceof org.omg.CORBA.portable.ServantObjectExt) {
              ((org.omg.CORBA.portable.ServantObjectExt)_so).exceptionalCompletion((Throwable)x_4);
            }
            throw x_4;

          } catch (com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.InvalidParameterException x_5) {
            if (_so instanceof org.omg.CORBA.portable.ServantObjectExt) {
              ((org.omg.CORBA.portable.ServantObjectExt)_so).exceptionalCompletion((Throwable)x_5);
            }
            throw x_5;

          } catch (com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.InvalidObservationObjectListException x_6) {
            if (_so instanceof org.omg.CORBA.portable.ServantObjectExt) {
              ((org.omg.CORBA.portable.ServantObjectExt)_so).exceptionalCompletion((Throwable)x_6);
            }
            throw x_6;

          } catch (com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.InvalidFilterException x_7) {
            if (_so instanceof org.omg.CORBA.portable.ServantObjectExt) {
              ((org.omg.CORBA.portable.ServantObjectExt)_so).exceptionalCompletion((Throwable)x_7);
            }
            throw x_7;

          } catch (com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.InvalidTriggeringObjectException x_8) {
            if (_so instanceof org.omg.CORBA.portable.ServantObjectExt) {
              ((org.omg.CORBA.portable.ServantObjectExt)_so).exceptionalCompletion((Throwable)x_8);
            }
            throw x_8;

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
          com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.CommonIRPConstDefs.Signal _ret = _self.filter_performance_monitoring_report(performance_monitoring_id_list, 
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
        } catch (com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.OptionalOperationNotSupportedException x_1) {
            if (_so instanceof org.omg.CORBA.portable.ServantObjectExt) {
              ((org.omg.CORBA.portable.ServantObjectExt)_so).exceptionalCompletion((Throwable)x_1);
            }
          throw x_1;
        } catch (com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.OptionalParameterNotSupportedException x_2) {
            if (_so instanceof org.omg.CORBA.portable.ServantObjectExt) {
              ((org.omg.CORBA.portable.ServantObjectExt)_so).exceptionalCompletion((Throwable)x_2);
            }
          throw x_2;
        } catch (com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.InvalidPerformanceMonitoringTypeException x_3) {
            if (_so instanceof org.omg.CORBA.portable.ServantObjectExt) {
              ((org.omg.CORBA.portable.ServantObjectExt)_so).exceptionalCompletion((Throwable)x_3);
            }
          throw x_3;
        } catch (com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.ProcessingErrorException x_4) {
            if (_so instanceof org.omg.CORBA.portable.ServantObjectExt) {
              ((org.omg.CORBA.portable.ServantObjectExt)_so).exceptionalCompletion((Throwable)x_4);
            }
          throw x_4;
        } catch (com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.InvalidParameterException x_5) {
            if (_so instanceof org.omg.CORBA.portable.ServantObjectExt) {
              ((org.omg.CORBA.portable.ServantObjectExt)_so).exceptionalCompletion((Throwable)x_5);
            }
          throw x_5;
        } catch (com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.InvalidObservationObjectListException x_6) {
            if (_so instanceof org.omg.CORBA.portable.ServantObjectExt) {
              ((org.omg.CORBA.portable.ServantObjectExt)_so).exceptionalCompletion((Throwable)x_6);
            }
          throw x_6;
        } catch (com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.InvalidFilterException x_7) {
            if (_so instanceof org.omg.CORBA.portable.ServantObjectExt) {
              ((org.omg.CORBA.portable.ServantObjectExt)_so).exceptionalCompletion((Throwable)x_7);
            }
          throw x_7;
        } catch (com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.InvalidTriggeringObjectException x_8) {
            if (_so instanceof org.omg.CORBA.portable.ServantObjectExt) {
              ((org.omg.CORBA.portable.ServantObjectExt)_so).exceptionalCompletion((Throwable)x_8);
            }
          throw x_8;
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
   *   com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.CommonIRPConstDefs.Signal get_performance_monitoring_report (in com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPConstDefs.PerformanceMonitoringId performance_monitoring_id,
                                                                                                                        out com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPConstDefs.PerformanceMonitoringReport performance_monitoring_report)
    raises (com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.OptionalOperationNotSupportedException,
            com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.ProcessingErrorException,
            com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.NoSuchIdException,
            com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.InvalidParameterException);
   * </pre>
   */
  public com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.CommonIRPConstDefs.Signal get_performance_monitoring_report (int performance_monitoring_id, 
                                                                                                                               com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPConstDefs.PerformanceMonitoringReportHolder performance_monitoring_report) throws  com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.OptionalOperationNotSupportedException, 
                                                                                                                                                                                                                                                                                         com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.ProcessingErrorException, 
                                                                                                                                                                                                                                                                                         com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.NoSuchIdException, 
                                                                                                                                                                                                                                                                                         com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.InvalidParameterException {

    while (true) {
      if (!_is_local()) {
        org.omg.CORBA.portable.OutputStream _output = null;
        org.omg.CORBA.portable.InputStream  _input  = null;
        com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.CommonIRPConstDefs.Signal _result;
        try {
          _output = this._request("get_performance_monitoring_report", true);
          _output.write_long((int)performance_monitoring_id);
          _input = this._invoke(_output);
          _result = com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.CommonIRPConstDefs.SignalHelper.read(_input);
          performance_monitoring_report.value = com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPConstDefs.PerformanceMonitoringReportHelper.read(_input);
          return _result;
        }
        catch (org.omg.CORBA.portable.ApplicationException _exception) {
          java.lang.String _exception_id = _exception.getId();
          if (_exception_id.equals(com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.OptionalOperationNotSupportedExceptionHelper.id())) {
            throw             com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.OptionalOperationNotSupportedExceptionHelper.read(_exception.getInputStream());
          }
          if (_exception_id.equals(com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.ProcessingErrorExceptionHelper.id())) {
            throw             com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.ProcessingErrorExceptionHelper.read(_exception.getInputStream());
          }
          if (_exception_id.equals(com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.NoSuchIdExceptionHelper.id())) {
            throw             com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.NoSuchIdExceptionHelper.read(_exception.getInputStream());
          }
          if (_exception_id.equals(com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.InvalidParameterExceptionHelper.id())) {
            throw             com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.InvalidParameterExceptionHelper.read(_exception.getInputStream());
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
        com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem._PerformanceMonitoringOperationsOperations _self = null;
        final org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke("get_performance_monitoring_report", _opsClass);
        if (_so == null) {
          continue;
        }
        try {
          _self = (com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem._PerformanceMonitoringOperationsOperations)_so.servant;
        } catch (java.lang.ClassCastException _vis_ce) {
          org.omg.CORBA.portable.OutputStream _output = null;
          org.omg.CORBA.portable.InputStream  _input  = null;
          com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.CommonIRPConstDefs.Signal _result;

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
                com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.OptionalOperationNotSupportedException exf =                 com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.OptionalOperationNotSupportedExceptionHelper.read(_result_output.create_input_stream());
                throw exf;
              }
              if(ex_repid.equals("IDL:PerformanceIRPSystem/ProcessingErrorException:1.0")) {
                com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.ProcessingErrorException exf =                 com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.ProcessingErrorExceptionHelper.read(_result_output.create_input_stream());
                throw exf;
              }
              if(ex_repid.equals("IDL:PerformanceIRPSystem/NoSuchIdException:1.0")) {
                com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.NoSuchIdException exf =                 com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.NoSuchIdExceptionHelper.read(_result_output.create_input_stream());
                throw exf;
              }
              if(ex_repid.equals("IDL:PerformanceIRPSystem/InvalidParameterException:1.0")) {
                com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.InvalidParameterException exf =                 com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.InvalidParameterExceptionHelper.read(_result_output.create_input_stream());
                throw exf;
              }
            }

            _result = com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.CommonIRPConstDefs.SignalHelper.read(_input);

            performance_monitoring_report.value = com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPConstDefs.PerformanceMonitoringReportHelper.read(_input);

            if (_so instanceof org.omg.CORBA.portable.ServantObjectExt) {
              ((org.omg.CORBA.portable.ServantObjectExt)_so).normalCompletion();
            }
            return _result;
          } catch (com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.OptionalOperationNotSupportedException x_1) {
            if (_so instanceof org.omg.CORBA.portable.ServantObjectExt) {
              ((org.omg.CORBA.portable.ServantObjectExt)_so).exceptionalCompletion((Throwable)x_1);
            }
            throw x_1;

          } catch (com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.ProcessingErrorException x_2) {
            if (_so instanceof org.omg.CORBA.portable.ServantObjectExt) {
              ((org.omg.CORBA.portable.ServantObjectExt)_so).exceptionalCompletion((Throwable)x_2);
            }
            throw x_2;

          } catch (com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.NoSuchIdException x_3) {
            if (_so instanceof org.omg.CORBA.portable.ServantObjectExt) {
              ((org.omg.CORBA.portable.ServantObjectExt)_so).exceptionalCompletion((Throwable)x_3);
            }
            throw x_3;

          } catch (com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.InvalidParameterException x_4) {
            if (_so instanceof org.omg.CORBA.portable.ServantObjectExt) {
              ((org.omg.CORBA.portable.ServantObjectExt)_so).exceptionalCompletion((Throwable)x_4);
            }
            throw x_4;

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
          com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.CommonIRPConstDefs.Signal _ret = _self.get_performance_monitoring_report(performance_monitoring_id, 
                                                                                                                                            performance_monitoring_report);
          if (_so instanceof org.omg.CORBA.portable.ServantObjectExt) {
            ((org.omg.CORBA.portable.ServantObjectExt)_so).normalCompletion();
          }
          return _ret;
        } catch (com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.OptionalOperationNotSupportedException x_1) {
            if (_so instanceof org.omg.CORBA.portable.ServantObjectExt) {
              ((org.omg.CORBA.portable.ServantObjectExt)_so).exceptionalCompletion((Throwable)x_1);
            }
          throw x_1;
        } catch (com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.ProcessingErrorException x_2) {
            if (_so instanceof org.omg.CORBA.portable.ServantObjectExt) {
              ((org.omg.CORBA.portable.ServantObjectExt)_so).exceptionalCompletion((Throwable)x_2);
            }
          throw x_2;
        } catch (com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.NoSuchIdException x_3) {
            if (_so instanceof org.omg.CORBA.portable.ServantObjectExt) {
              ((org.omg.CORBA.portable.ServantObjectExt)_so).exceptionalCompletion((Throwable)x_3);
            }
          throw x_3;
        } catch (com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.InvalidParameterException x_4) {
            if (_so instanceof org.omg.CORBA.portable.ServantObjectExt) {
              ((org.omg.CORBA.portable.ServantObjectExt)_so).exceptionalCompletion((Throwable)x_4);
            }
          throw x_4;
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
   *   com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.CommonIRPConstDefs.Signal resume_performance_monitoring (in com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPConstDefs.PerformanceMonitoringIdList performance_monitoring_id_list,
                                                                                                                    out com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPConstDefs.PerformanceMonitoringIdList bad_performance_monitoring_list,
                                                                                                                    out com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPConstDefs.PerformanceMonitoringIdList rejected_performance_monitoring_list)
    raises (com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.OptionalOperationNotSupportedException,
            com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.ProcessingErrorException,
            com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.NumberOfCountersExceededException,
            com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.NumberOfMonitorsExceededException,
            com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.InvalidParameterException,
            com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.NoSuchIdException,
            com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.OverloadException,
            com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.GranularityAndAttributeActivationException);
   * </pre>
   */
  public com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.CommonIRPConstDefs.Signal resume_performance_monitoring (int[] performance_monitoring_id_list, 
                                                                                                                           com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPConstDefs.PerformanceMonitoringIdListHolder bad_performance_monitoring_list, 
                                                                                                                           com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPConstDefs.PerformanceMonitoringIdListHolder rejected_performance_monitoring_list) throws  com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.OptionalOperationNotSupportedException, 
                                                                                                                                                                                                                                                                                            com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.ProcessingErrorException, 
                                                                                                                                                                                                                                                                                            com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.NumberOfCountersExceededException, 
                                                                                                                                                                                                                                                                                            com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.NumberOfMonitorsExceededException, 
                                                                                                                                                                                                                                                                                            com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.InvalidParameterException, 
                                                                                                                                                                                                                                                                                            com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.NoSuchIdException, 
                                                                                                                                                                                                                                                                                            com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.OverloadException, 
                                                                                                                                                                                                                                                                                            com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.GranularityAndAttributeActivationException {

    while (true) {
      if (!_is_local()) {
        org.omg.CORBA.portable.OutputStream _output = null;
        org.omg.CORBA.portable.InputStream  _input  = null;
        com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.CommonIRPConstDefs.Signal _result;
        try {
          _output = this._request("resume_performance_monitoring", true);
          com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPConstDefs.PerformanceMonitoringIdListHelper.write(_output, performance_monitoring_id_list);
          _input = this._invoke(_output);
          _result = com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.CommonIRPConstDefs.SignalHelper.read(_input);
          bad_performance_monitoring_list.value = com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPConstDefs.PerformanceMonitoringIdListHelper.read(_input);
          rejected_performance_monitoring_list.value = com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPConstDefs.PerformanceMonitoringIdListHelper.read(_input);
          return _result;
        }
        catch (org.omg.CORBA.portable.ApplicationException _exception) {
          java.lang.String _exception_id = _exception.getId();
          if (_exception_id.equals(com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.OptionalOperationNotSupportedExceptionHelper.id())) {
            throw             com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.OptionalOperationNotSupportedExceptionHelper.read(_exception.getInputStream());
          }
          if (_exception_id.equals(com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.ProcessingErrorExceptionHelper.id())) {
            throw             com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.ProcessingErrorExceptionHelper.read(_exception.getInputStream());
          }
          if (_exception_id.equals(com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.NumberOfCountersExceededExceptionHelper.id())) {
            throw             com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.NumberOfCountersExceededExceptionHelper.read(_exception.getInputStream());
          }
          if (_exception_id.equals(com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.NumberOfMonitorsExceededExceptionHelper.id())) {
            throw             com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.NumberOfMonitorsExceededExceptionHelper.read(_exception.getInputStream());
          }
          if (_exception_id.equals(com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.InvalidParameterExceptionHelper.id())) {
            throw             com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.InvalidParameterExceptionHelper.read(_exception.getInputStream());
          }
          if (_exception_id.equals(com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.NoSuchIdExceptionHelper.id())) {
            throw             com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.NoSuchIdExceptionHelper.read(_exception.getInputStream());
          }
          if (_exception_id.equals(com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.OverloadExceptionHelper.id())) {
            throw             com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.OverloadExceptionHelper.read(_exception.getInputStream());
          }
          if (_exception_id.equals(com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.GranularityAndAttributeActivationExceptionHelper.id())) {
            throw             com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.GranularityAndAttributeActivationExceptionHelper.read(_exception.getInputStream());
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
        com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem._PerformanceMonitoringOperationsOperations _self = null;
        final org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke("resume_performance_monitoring", _opsClass);
        if (_so == null) {
          continue;
        }
        try {
          _self = (com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem._PerformanceMonitoringOperationsOperations)_so.servant;
        } catch (java.lang.ClassCastException _vis_ce) {
          org.omg.CORBA.portable.OutputStream _output = null;
          org.omg.CORBA.portable.InputStream  _input  = null;
          com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.CommonIRPConstDefs.Signal _result;

          try {
            _output = _orb().create_output_stream();
            final org.omg.CORBA.portable.OutputStream _response_output = _orb().create_output_stream();
            final org.omg.CORBA.portable.OutputStream _response_ex_output = _orb().create_output_stream();
            com.inprise.vbroker.orb.VBResponseHandler _vis_vbr = com.inprise.vbroker.orb.VBResponseHandler.getResponseHandler(_response_output,_response_ex_output);
            com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPConstDefs.PerformanceMonitoringIdListHelper.write(_output, performance_monitoring_id_list);
            org.omg.CORBA.portable.OutputStream _result_output = (((org.omg.CORBA.portable.InvokeHandler)_so.servant)._invoke("resume_performance_monitoring",_output.create_input_stream(),_vis_vbr));
            _input = _result_output.create_input_stream();

            if(_vis_vbr.get_exflag()) {
              java.lang.String ex_repid = _input.read_string();
              if(ex_repid.equals("IDL:PerformanceIRPSystem/OptionalOperationNotSupportedException:1.0")) {
                com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.OptionalOperationNotSupportedException exf =                 com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.OptionalOperationNotSupportedExceptionHelper.read(_result_output.create_input_stream());
                throw exf;
              }
              if(ex_repid.equals("IDL:PerformanceIRPSystem/ProcessingErrorException:1.0")) {
                com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.ProcessingErrorException exf =                 com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.ProcessingErrorExceptionHelper.read(_result_output.create_input_stream());
                throw exf;
              }
              if(ex_repid.equals("IDL:PerformanceIRPSystem/NumberOfCountersExceededException:1.0")) {
                com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.NumberOfCountersExceededException exf =                 com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.NumberOfCountersExceededExceptionHelper.read(_result_output.create_input_stream());
                throw exf;
              }
              if(ex_repid.equals("IDL:PerformanceIRPSystem/NumberOfMonitorsExceededException:1.0")) {
                com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.NumberOfMonitorsExceededException exf =                 com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.NumberOfMonitorsExceededExceptionHelper.read(_result_output.create_input_stream());
                throw exf;
              }
              if(ex_repid.equals("IDL:PerformanceIRPSystem/InvalidParameterException:1.0")) {
                com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.InvalidParameterException exf =                 com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.InvalidParameterExceptionHelper.read(_result_output.create_input_stream());
                throw exf;
              }
              if(ex_repid.equals("IDL:PerformanceIRPSystem/NoSuchIdException:1.0")) {
                com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.NoSuchIdException exf =                 com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.NoSuchIdExceptionHelper.read(_result_output.create_input_stream());
                throw exf;
              }
              if(ex_repid.equals("IDL:PerformanceIRPSystem/OverloadException:1.0")) {
                com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.OverloadException exf =                 com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.OverloadExceptionHelper.read(_result_output.create_input_stream());
                throw exf;
              }
              if(ex_repid.equals("IDL:PerformanceIRPSystem/GranularityAndAttributeActivationException:1.0")) {
                com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.GranularityAndAttributeActivationException exf =                 com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.GranularityAndAttributeActivationExceptionHelper.read(_result_output.create_input_stream());
                throw exf;
              }
            }

            _result = com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.CommonIRPConstDefs.SignalHelper.read(_input);

            bad_performance_monitoring_list.value = com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPConstDefs.PerformanceMonitoringIdListHelper.read(_input);
            rejected_performance_monitoring_list.value = com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPConstDefs.PerformanceMonitoringIdListHelper.read(_input);

            if (_so instanceof org.omg.CORBA.portable.ServantObjectExt) {
              ((org.omg.CORBA.portable.ServantObjectExt)_so).normalCompletion();
            }
            return _result;
          } catch (com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.OptionalOperationNotSupportedException x_1) {
            if (_so instanceof org.omg.CORBA.portable.ServantObjectExt) {
              ((org.omg.CORBA.portable.ServantObjectExt)_so).exceptionalCompletion((Throwable)x_1);
            }
            throw x_1;

          } catch (com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.ProcessingErrorException x_2) {
            if (_so instanceof org.omg.CORBA.portable.ServantObjectExt) {
              ((org.omg.CORBA.portable.ServantObjectExt)_so).exceptionalCompletion((Throwable)x_2);
            }
            throw x_2;

          } catch (com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.NumberOfCountersExceededException x_3) {
            if (_so instanceof org.omg.CORBA.portable.ServantObjectExt) {
              ((org.omg.CORBA.portable.ServantObjectExt)_so).exceptionalCompletion((Throwable)x_3);
            }
            throw x_3;

          } catch (com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.NumberOfMonitorsExceededException x_4) {
            if (_so instanceof org.omg.CORBA.portable.ServantObjectExt) {
              ((org.omg.CORBA.portable.ServantObjectExt)_so).exceptionalCompletion((Throwable)x_4);
            }
            throw x_4;

          } catch (com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.InvalidParameterException x_5) {
            if (_so instanceof org.omg.CORBA.portable.ServantObjectExt) {
              ((org.omg.CORBA.portable.ServantObjectExt)_so).exceptionalCompletion((Throwable)x_5);
            }
            throw x_5;

          } catch (com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.NoSuchIdException x_6) {
            if (_so instanceof org.omg.CORBA.portable.ServantObjectExt) {
              ((org.omg.CORBA.portable.ServantObjectExt)_so).exceptionalCompletion((Throwable)x_6);
            }
            throw x_6;

          } catch (com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.OverloadException x_7) {
            if (_so instanceof org.omg.CORBA.portable.ServantObjectExt) {
              ((org.omg.CORBA.portable.ServantObjectExt)_so).exceptionalCompletion((Throwable)x_7);
            }
            throw x_7;

          } catch (com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.GranularityAndAttributeActivationException x_8) {
            if (_so instanceof org.omg.CORBA.portable.ServantObjectExt) {
              ((org.omg.CORBA.portable.ServantObjectExt)_so).exceptionalCompletion((Throwable)x_8);
            }
            throw x_8;

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
          com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.CommonIRPConstDefs.Signal _ret = _self.resume_performance_monitoring(performance_monitoring_id_list, 
                                                                                                                                        bad_performance_monitoring_list, 
                                                                                                                                        rejected_performance_monitoring_list);
          if (_so instanceof org.omg.CORBA.portable.ServantObjectExt) {
            ((org.omg.CORBA.portable.ServantObjectExt)_so).normalCompletion();
          }
          return _ret;
        } catch (com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.OptionalOperationNotSupportedException x_1) {
            if (_so instanceof org.omg.CORBA.portable.ServantObjectExt) {
              ((org.omg.CORBA.portable.ServantObjectExt)_so).exceptionalCompletion((Throwable)x_1);
            }
          throw x_1;
        } catch (com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.ProcessingErrorException x_2) {
            if (_so instanceof org.omg.CORBA.portable.ServantObjectExt) {
              ((org.omg.CORBA.portable.ServantObjectExt)_so).exceptionalCompletion((Throwable)x_2);
            }
          throw x_2;
        } catch (com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.NumberOfCountersExceededException x_3) {
            if (_so instanceof org.omg.CORBA.portable.ServantObjectExt) {
              ((org.omg.CORBA.portable.ServantObjectExt)_so).exceptionalCompletion((Throwable)x_3);
            }
          throw x_3;
        } catch (com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.NumberOfMonitorsExceededException x_4) {
            if (_so instanceof org.omg.CORBA.portable.ServantObjectExt) {
              ((org.omg.CORBA.portable.ServantObjectExt)_so).exceptionalCompletion((Throwable)x_4);
            }
          throw x_4;
        } catch (com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.InvalidParameterException x_5) {
            if (_so instanceof org.omg.CORBA.portable.ServantObjectExt) {
              ((org.omg.CORBA.portable.ServantObjectExt)_so).exceptionalCompletion((Throwable)x_5);
            }
          throw x_5;
        } catch (com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.NoSuchIdException x_6) {
            if (_so instanceof org.omg.CORBA.portable.ServantObjectExt) {
              ((org.omg.CORBA.portable.ServantObjectExt)_so).exceptionalCompletion((Throwable)x_6);
            }
          throw x_6;
        } catch (com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.OverloadException x_7) {
            if (_so instanceof org.omg.CORBA.portable.ServantObjectExt) {
              ((org.omg.CORBA.portable.ServantObjectExt)_so).exceptionalCompletion((Throwable)x_7);
            }
          throw x_7;
        } catch (com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.GranularityAndAttributeActivationException x_8) {
            if (_so instanceof org.omg.CORBA.portable.ServantObjectExt) {
              ((org.omg.CORBA.portable.ServantObjectExt)_so).exceptionalCompletion((Throwable)x_8);
            }
          throw x_8;
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
   *   com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.CommonIRPConstDefs.Signal suspend_performance_monitoring (in com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPConstDefs.PerformanceMonitoringIdList performance_monitoring_id_list,
                                                                                                                     out com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPConstDefs.PerformanceMonitoringIdList bad_performance_monitoring_id_list)
    raises (com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.OptionalOperationNotSupportedException,
            com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.ProcessingErrorException,
            com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.NoSuchIdException,
            com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.InvalidParameterException);
   * </pre>
   */
  public com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.CommonIRPConstDefs.Signal suspend_performance_monitoring (int[] performance_monitoring_id_list, 
                                                                                                                            com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPConstDefs.PerformanceMonitoringIdListHolder bad_performance_monitoring_id_list) throws  com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.OptionalOperationNotSupportedException, 
                                                                                                                                                                                                                                                                                           com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.ProcessingErrorException, 
                                                                                                                                                                                                                                                                                           com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.NoSuchIdException, 
                                                                                                                                                                                                                                                                                           com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.InvalidParameterException {

    while (true) {
      if (!_is_local()) {
        org.omg.CORBA.portable.OutputStream _output = null;
        org.omg.CORBA.portable.InputStream  _input  = null;
        com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.CommonIRPConstDefs.Signal _result;
        try {
          _output = this._request("suspend_performance_monitoring", true);
          com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPConstDefs.PerformanceMonitoringIdListHelper.write(_output, performance_monitoring_id_list);
          _input = this._invoke(_output);
          _result = com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.CommonIRPConstDefs.SignalHelper.read(_input);
          bad_performance_monitoring_id_list.value = com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPConstDefs.PerformanceMonitoringIdListHelper.read(_input);
          return _result;
        }
        catch (org.omg.CORBA.portable.ApplicationException _exception) {
          java.lang.String _exception_id = _exception.getId();
          if (_exception_id.equals(com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.OptionalOperationNotSupportedExceptionHelper.id())) {
            throw             com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.OptionalOperationNotSupportedExceptionHelper.read(_exception.getInputStream());
          }
          if (_exception_id.equals(com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.ProcessingErrorExceptionHelper.id())) {
            throw             com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.ProcessingErrorExceptionHelper.read(_exception.getInputStream());
          }
          if (_exception_id.equals(com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.NoSuchIdExceptionHelper.id())) {
            throw             com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.NoSuchIdExceptionHelper.read(_exception.getInputStream());
          }
          if (_exception_id.equals(com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.InvalidParameterExceptionHelper.id())) {
            throw             com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.InvalidParameterExceptionHelper.read(_exception.getInputStream());
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
        com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem._PerformanceMonitoringOperationsOperations _self = null;
        final org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke("suspend_performance_monitoring", _opsClass);
        if (_so == null) {
          continue;
        }
        try {
          _self = (com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem._PerformanceMonitoringOperationsOperations)_so.servant;
        } catch (java.lang.ClassCastException _vis_ce) {
          org.omg.CORBA.portable.OutputStream _output = null;
          org.omg.CORBA.portable.InputStream  _input  = null;
          com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.CommonIRPConstDefs.Signal _result;

          try {
            _output = _orb().create_output_stream();
            final org.omg.CORBA.portable.OutputStream _response_output = _orb().create_output_stream();
            final org.omg.CORBA.portable.OutputStream _response_ex_output = _orb().create_output_stream();
            com.inprise.vbroker.orb.VBResponseHandler _vis_vbr = com.inprise.vbroker.orb.VBResponseHandler.getResponseHandler(_response_output,_response_ex_output);
            com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPConstDefs.PerformanceMonitoringIdListHelper.write(_output, performance_monitoring_id_list);
            org.omg.CORBA.portable.OutputStream _result_output = (((org.omg.CORBA.portable.InvokeHandler)_so.servant)._invoke("suspend_performance_monitoring",_output.create_input_stream(),_vis_vbr));
            _input = _result_output.create_input_stream();

            if(_vis_vbr.get_exflag()) {
              java.lang.String ex_repid = _input.read_string();
              if(ex_repid.equals("IDL:PerformanceIRPSystem/OptionalOperationNotSupportedException:1.0")) {
                com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.OptionalOperationNotSupportedException exf =                 com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.OptionalOperationNotSupportedExceptionHelper.read(_result_output.create_input_stream());
                throw exf;
              }
              if(ex_repid.equals("IDL:PerformanceIRPSystem/ProcessingErrorException:1.0")) {
                com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.ProcessingErrorException exf =                 com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.ProcessingErrorExceptionHelper.read(_result_output.create_input_stream());
                throw exf;
              }
              if(ex_repid.equals("IDL:PerformanceIRPSystem/NoSuchIdException:1.0")) {
                com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.NoSuchIdException exf =                 com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.NoSuchIdExceptionHelper.read(_result_output.create_input_stream());
                throw exf;
              }
              if(ex_repid.equals("IDL:PerformanceIRPSystem/InvalidParameterException:1.0")) {
                com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.InvalidParameterException exf =                 com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.InvalidParameterExceptionHelper.read(_result_output.create_input_stream());
                throw exf;
              }
            }

            _result = com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.CommonIRPConstDefs.SignalHelper.read(_input);

            bad_performance_monitoring_id_list.value = com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPConstDefs.PerformanceMonitoringIdListHelper.read(_input);

            if (_so instanceof org.omg.CORBA.portable.ServantObjectExt) {
              ((org.omg.CORBA.portable.ServantObjectExt)_so).normalCompletion();
            }
            return _result;
          } catch (com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.OptionalOperationNotSupportedException x_1) {
            if (_so instanceof org.omg.CORBA.portable.ServantObjectExt) {
              ((org.omg.CORBA.portable.ServantObjectExt)_so).exceptionalCompletion((Throwable)x_1);
            }
            throw x_1;

          } catch (com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.ProcessingErrorException x_2) {
            if (_so instanceof org.omg.CORBA.portable.ServantObjectExt) {
              ((org.omg.CORBA.portable.ServantObjectExt)_so).exceptionalCompletion((Throwable)x_2);
            }
            throw x_2;

          } catch (com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.NoSuchIdException x_3) {
            if (_so instanceof org.omg.CORBA.portable.ServantObjectExt) {
              ((org.omg.CORBA.portable.ServantObjectExt)_so).exceptionalCompletion((Throwable)x_3);
            }
            throw x_3;

          } catch (com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.InvalidParameterException x_4) {
            if (_so instanceof org.omg.CORBA.portable.ServantObjectExt) {
              ((org.omg.CORBA.portable.ServantObjectExt)_so).exceptionalCompletion((Throwable)x_4);
            }
            throw x_4;

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
          com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.CommonIRPConstDefs.Signal _ret = _self.suspend_performance_monitoring(performance_monitoring_id_list, 
                                                                                                                                         bad_performance_monitoring_id_list);
          if (_so instanceof org.omg.CORBA.portable.ServantObjectExt) {
            ((org.omg.CORBA.portable.ServantObjectExt)_so).normalCompletion();
          }
          return _ret;
        } catch (com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.OptionalOperationNotSupportedException x_1) {
            if (_so instanceof org.omg.CORBA.portable.ServantObjectExt) {
              ((org.omg.CORBA.portable.ServantObjectExt)_so).exceptionalCompletion((Throwable)x_1);
            }
          throw x_1;
        } catch (com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.ProcessingErrorException x_2) {
            if (_so instanceof org.omg.CORBA.portable.ServantObjectExt) {
              ((org.omg.CORBA.portable.ServantObjectExt)_so).exceptionalCompletion((Throwable)x_2);
            }
          throw x_2;
        } catch (com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.NoSuchIdException x_3) {
            if (_so instanceof org.omg.CORBA.portable.ServantObjectExt) {
              ((org.omg.CORBA.portable.ServantObjectExt)_so).exceptionalCompletion((Throwable)x_3);
            }
          throw x_3;
        } catch (com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.InvalidParameterException x_4) {
            if (_so instanceof org.omg.CORBA.portable.ServantObjectExt) {
              ((org.omg.CORBA.portable.ServantObjectExt)_so).exceptionalCompletion((Throwable)x_4);
            }
          throw x_4;
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
   *   com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.CommonIRPConstDefs.Signal delete_performance_monitoring (in com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPConstDefs.PerformanceMonitoringId performance_monitoring_id)
    raises (com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.OptionalOperationNotSupportedException,
            com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.NoSuchIdException,
            com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.ProcessingErrorException,
            com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.InvalidPerformanceMonitoringTypeException,
            com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.InvalidParameterException);
   * </pre>
   */
  public com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.CommonIRPConstDefs.Signal delete_performance_monitoring (int performance_monitoring_id) throws  com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.OptionalOperationNotSupportedException, 
                                                                                                                                                                  com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.NoSuchIdException, 
                                                                                                                                                                  com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.ProcessingErrorException, 
                                                                                                                                                                  com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.InvalidPerformanceMonitoringTypeException, 
                                                                                                                                                                  com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.InvalidParameterException {

    while (true) {
      if (!_is_local()) {
        org.omg.CORBA.portable.OutputStream _output = null;
        org.omg.CORBA.portable.InputStream  _input  = null;
        com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.CommonIRPConstDefs.Signal _result;
        try {
          _output = this._request("delete_performance_monitoring", true);
          _output.write_long((int)performance_monitoring_id);
          _input = this._invoke(_output);
          _result = com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.CommonIRPConstDefs.SignalHelper.read(_input);
          return _result;
        }
        catch (org.omg.CORBA.portable.ApplicationException _exception) {
          java.lang.String _exception_id = _exception.getId();
          if (_exception_id.equals(com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.OptionalOperationNotSupportedExceptionHelper.id())) {
            throw             com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.OptionalOperationNotSupportedExceptionHelper.read(_exception.getInputStream());
          }
          if (_exception_id.equals(com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.NoSuchIdExceptionHelper.id())) {
            throw             com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.NoSuchIdExceptionHelper.read(_exception.getInputStream());
          }
          if (_exception_id.equals(com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.ProcessingErrorExceptionHelper.id())) {
            throw             com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.ProcessingErrorExceptionHelper.read(_exception.getInputStream());
          }
          if (_exception_id.equals(com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.InvalidPerformanceMonitoringTypeExceptionHelper.id())) {
            throw             com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.InvalidPerformanceMonitoringTypeExceptionHelper.read(_exception.getInputStream());
          }
          if (_exception_id.equals(com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.InvalidParameterExceptionHelper.id())) {
            throw             com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.InvalidParameterExceptionHelper.read(_exception.getInputStream());
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
        com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem._PerformanceMonitoringOperationsOperations _self = null;
        final org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke("delete_performance_monitoring", _opsClass);
        if (_so == null) {
          continue;
        }
        try {
          _self = (com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem._PerformanceMonitoringOperationsOperations)_so.servant;
        } catch (java.lang.ClassCastException _vis_ce) {
          org.omg.CORBA.portable.OutputStream _output = null;
          org.omg.CORBA.portable.InputStream  _input  = null;
          com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.CommonIRPConstDefs.Signal _result;

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
                com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.OptionalOperationNotSupportedException exf =                 com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.OptionalOperationNotSupportedExceptionHelper.read(_result_output.create_input_stream());
                throw exf;
              }
              if(ex_repid.equals("IDL:PerformanceIRPSystem/NoSuchIdException:1.0")) {
                com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.NoSuchIdException exf =                 com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.NoSuchIdExceptionHelper.read(_result_output.create_input_stream());
                throw exf;
              }
              if(ex_repid.equals("IDL:PerformanceIRPSystem/ProcessingErrorException:1.0")) {
                com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.ProcessingErrorException exf =                 com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.ProcessingErrorExceptionHelper.read(_result_output.create_input_stream());
                throw exf;
              }
              if(ex_repid.equals("IDL:PerformanceIRPSystem/InvalidPerformanceMonitoringTypeException:1.0")) {
                com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.InvalidPerformanceMonitoringTypeException exf =                 com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.InvalidPerformanceMonitoringTypeExceptionHelper.read(_result_output.create_input_stream());
                throw exf;
              }
              if(ex_repid.equals("IDL:PerformanceIRPSystem/InvalidParameterException:1.0")) {
                com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.InvalidParameterException exf =                 com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.InvalidParameterExceptionHelper.read(_result_output.create_input_stream());
                throw exf;
              }
            }

            _result = com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.CommonIRPConstDefs.SignalHelper.read(_input);

            if (_so instanceof org.omg.CORBA.portable.ServantObjectExt) {
              ((org.omg.CORBA.portable.ServantObjectExt)_so).normalCompletion();
            }
            return _result;
          } catch (com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.OptionalOperationNotSupportedException x_1) {
            if (_so instanceof org.omg.CORBA.portable.ServantObjectExt) {
              ((org.omg.CORBA.portable.ServantObjectExt)_so).exceptionalCompletion((Throwable)x_1);
            }
            throw x_1;

          } catch (com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.NoSuchIdException x_2) {
            if (_so instanceof org.omg.CORBA.portable.ServantObjectExt) {
              ((org.omg.CORBA.portable.ServantObjectExt)_so).exceptionalCompletion((Throwable)x_2);
            }
            throw x_2;

          } catch (com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.ProcessingErrorException x_3) {
            if (_so instanceof org.omg.CORBA.portable.ServantObjectExt) {
              ((org.omg.CORBA.portable.ServantObjectExt)_so).exceptionalCompletion((Throwable)x_3);
            }
            throw x_3;

          } catch (com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.InvalidPerformanceMonitoringTypeException x_4) {
            if (_so instanceof org.omg.CORBA.portable.ServantObjectExt) {
              ((org.omg.CORBA.portable.ServantObjectExt)_so).exceptionalCompletion((Throwable)x_4);
            }
            throw x_4;

          } catch (com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.InvalidParameterException x_5) {
            if (_so instanceof org.omg.CORBA.portable.ServantObjectExt) {
              ((org.omg.CORBA.portable.ServantObjectExt)_so).exceptionalCompletion((Throwable)x_5);
            }
            throw x_5;

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
          com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.CommonIRPConstDefs.Signal _ret = _self.delete_performance_monitoring(performance_monitoring_id);
          if (_so instanceof org.omg.CORBA.portable.ServantObjectExt) {
            ((org.omg.CORBA.portable.ServantObjectExt)_so).normalCompletion();
          }
          return _ret;
        } catch (com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.OptionalOperationNotSupportedException x_1) {
            if (_so instanceof org.omg.CORBA.portable.ServantObjectExt) {
              ((org.omg.CORBA.portable.ServantObjectExt)_so).exceptionalCompletion((Throwable)x_1);
            }
          throw x_1;
        } catch (com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.NoSuchIdException x_2) {
            if (_so instanceof org.omg.CORBA.portable.ServantObjectExt) {
              ((org.omg.CORBA.portable.ServantObjectExt)_so).exceptionalCompletion((Throwable)x_2);
            }
          throw x_2;
        } catch (com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.ProcessingErrorException x_3) {
            if (_so instanceof org.omg.CORBA.portable.ServantObjectExt) {
              ((org.omg.CORBA.portable.ServantObjectExt)_so).exceptionalCompletion((Throwable)x_3);
            }
          throw x_3;
        } catch (com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.InvalidPerformanceMonitoringTypeException x_4) {
            if (_so instanceof org.omg.CORBA.portable.ServantObjectExt) {
              ((org.omg.CORBA.portable.ServantObjectExt)_so).exceptionalCompletion((Throwable)x_4);
            }
          throw x_4;
        } catch (com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.InvalidParameterException x_5) {
            if (_so instanceof org.omg.CORBA.portable.ServantObjectExt) {
              ((org.omg.CORBA.portable.ServantObjectExt)_so).exceptionalCompletion((Throwable)x_5);
            }
          throw x_5;
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
   *   com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.CommonIRPConstDefs.Signal lookup_performance_monitoring (in com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPConstDefs.PerformanceMonitoringId performance_monitoring_id,
                                                                                                                    out com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPConstDefs.ObservationClassList observation_class_list,
                                                                                                                    out com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPConstDefs.ObservationObjectList observation_object_list,
                                                                                                                    out com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPConstDefs.TimePeriodInSeconds granularity_period,
                                                                                                                    out com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPConstDefs.Schedule schedule,
                                                                                                                    out com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPConstDefs.TimePeriodInSeconds reporting_period,
                                                                                                                    out com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPConstDefs.Destination destination,
                                                                                                                    out com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPConstDefs.PerformanceMonitoringState performance_monitoring_state,
                                                                                                                    out com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPConstDefs.MeasurementName measurement_name)
    raises (com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.OptionalOperationNotSupportedException,
            com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.NoSuchIdException,
            com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.ProcessingErrorException,
            com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.InvalidParameterException);
   * </pre>
   */
  public com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.CommonIRPConstDefs.Signal lookup_performance_monitoring (int performance_monitoring_id, 
                                                                                                                           com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPConstDefs.ObservationClassListHolder observation_class_list, 
                                                                                                                           com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPConstDefs.ObservationObjectListHolder observation_object_list, 
                                                                                                                           org.omg.CORBA.IntHolder granularity_period, 
                                                                                                                           com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPConstDefs.ScheduleHolder schedule, 
                                                                                                                           org.omg.CORBA.IntHolder reporting_period, 
                                                                                                                           com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPConstDefs.DestinationHolder destination, 
                                                                                                                           com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPConstDefs.PerformanceMonitoringStateHolder performance_monitoring_state, 
                                                                                                                           org.omg.CORBA.StringHolder measurement_name) throws  com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.OptionalOperationNotSupportedException, 
                                                                                                                                                                                com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.NoSuchIdException, 
                                                                                                                                                                                com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.ProcessingErrorException, 
                                                                                                                                                                                com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.InvalidParameterException {

    while (true) {
      if (!_is_local()) {
        org.omg.CORBA.portable.OutputStream _output = null;
        org.omg.CORBA.portable.InputStream  _input  = null;
        com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.CommonIRPConstDefs.Signal _result;
        try {
          _output = this._request("lookup_performance_monitoring", true);
          _output.write_long((int)performance_monitoring_id);
          _input = this._invoke(_output);
          _result = com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.CommonIRPConstDefs.SignalHelper.read(_input);
          observation_class_list.value = com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPConstDefs.ObservationClassListHelper.read(_input);
          observation_object_list.value = com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPConstDefs.ObservationObjectListHelper.read(_input);
          granularity_period.value = _input.read_long();
          schedule.value = com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPConstDefs.ScheduleHelper.read(_input);
          reporting_period.value = _input.read_long();
          destination.value = com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPConstDefs.DestinationHelper.read(_input);
          performance_monitoring_state.value = com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPConstDefs.PerformanceMonitoringStateHelper.read(_input);
          measurement_name.value = _input.read_string();
          return _result;
        }
        catch (org.omg.CORBA.portable.ApplicationException _exception) {
          java.lang.String _exception_id = _exception.getId();
          if (_exception_id.equals(com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.OptionalOperationNotSupportedExceptionHelper.id())) {
            throw             com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.OptionalOperationNotSupportedExceptionHelper.read(_exception.getInputStream());
          }
          if (_exception_id.equals(com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.NoSuchIdExceptionHelper.id())) {
            throw             com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.NoSuchIdExceptionHelper.read(_exception.getInputStream());
          }
          if (_exception_id.equals(com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.ProcessingErrorExceptionHelper.id())) {
            throw             com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.ProcessingErrorExceptionHelper.read(_exception.getInputStream());
          }
          if (_exception_id.equals(com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.InvalidParameterExceptionHelper.id())) {
            throw             com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.InvalidParameterExceptionHelper.read(_exception.getInputStream());
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
        com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem._PerformanceMonitoringOperationsOperations _self = null;
        final org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke("lookup_performance_monitoring", _opsClass);
        if (_so == null) {
          continue;
        }
        try {
          _self = (com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem._PerformanceMonitoringOperationsOperations)_so.servant;
        } catch (java.lang.ClassCastException _vis_ce) {
          org.omg.CORBA.portable.OutputStream _output = null;
          org.omg.CORBA.portable.InputStream  _input  = null;
          com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.CommonIRPConstDefs.Signal _result;

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
                com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.OptionalOperationNotSupportedException exf =                 com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.OptionalOperationNotSupportedExceptionHelper.read(_result_output.create_input_stream());
                throw exf;
              }
              if(ex_repid.equals("IDL:PerformanceIRPSystem/NoSuchIdException:1.0")) {
                com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.NoSuchIdException exf =                 com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.NoSuchIdExceptionHelper.read(_result_output.create_input_stream());
                throw exf;
              }
              if(ex_repid.equals("IDL:PerformanceIRPSystem/ProcessingErrorException:1.0")) {
                com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.ProcessingErrorException exf =                 com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.ProcessingErrorExceptionHelper.read(_result_output.create_input_stream());
                throw exf;
              }
              if(ex_repid.equals("IDL:PerformanceIRPSystem/InvalidParameterException:1.0")) {
                com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.InvalidParameterException exf =                 com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.InvalidParameterExceptionHelper.read(_result_output.create_input_stream());
                throw exf;
              }
            }

            _result = com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.CommonIRPConstDefs.SignalHelper.read(_input);

            observation_class_list.value = com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPConstDefs.ObservationClassListHelper.read(_input);
            observation_object_list.value = com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPConstDefs.ObservationObjectListHelper.read(_input);
            granularity_period.value = _input.read_long();
            schedule.value = com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPConstDefs.ScheduleHelper.read(_input);
            reporting_period.value = _input.read_long();
            destination.value = com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPConstDefs.DestinationHelper.read(_input);
            performance_monitoring_state.value = com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPConstDefs.PerformanceMonitoringStateHelper.read(_input);
            measurement_name.value = _input.read_string();

            if (_so instanceof org.omg.CORBA.portable.ServantObjectExt) {
              ((org.omg.CORBA.portable.ServantObjectExt)_so).normalCompletion();
            }
            return _result;
          } catch (com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.OptionalOperationNotSupportedException x_1) {
            if (_so instanceof org.omg.CORBA.portable.ServantObjectExt) {
              ((org.omg.CORBA.portable.ServantObjectExt)_so).exceptionalCompletion((Throwable)x_1);
            }
            throw x_1;

          } catch (com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.NoSuchIdException x_2) {
            if (_so instanceof org.omg.CORBA.portable.ServantObjectExt) {
              ((org.omg.CORBA.portable.ServantObjectExt)_so).exceptionalCompletion((Throwable)x_2);
            }
            throw x_2;

          } catch (com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.ProcessingErrorException x_3) {
            if (_so instanceof org.omg.CORBA.portable.ServantObjectExt) {
              ((org.omg.CORBA.portable.ServantObjectExt)_so).exceptionalCompletion((Throwable)x_3);
            }
            throw x_3;

          } catch (com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.InvalidParameterException x_4) {
            if (_so instanceof org.omg.CORBA.portable.ServantObjectExt) {
              ((org.omg.CORBA.portable.ServantObjectExt)_so).exceptionalCompletion((Throwable)x_4);
            }
            throw x_4;

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
          com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.CommonIRPConstDefs.Signal _ret = _self.lookup_performance_monitoring(performance_monitoring_id, 
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
        } catch (com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.OptionalOperationNotSupportedException x_1) {
            if (_so instanceof org.omg.CORBA.portable.ServantObjectExt) {
              ((org.omg.CORBA.portable.ServantObjectExt)_so).exceptionalCompletion((Throwable)x_1);
            }
          throw x_1;
        } catch (com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.NoSuchIdException x_2) {
            if (_so instanceof org.omg.CORBA.portable.ServantObjectExt) {
              ((org.omg.CORBA.portable.ServantObjectExt)_so).exceptionalCompletion((Throwable)x_2);
            }
          throw x_2;
        } catch (com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.ProcessingErrorException x_3) {
            if (_so instanceof org.omg.CORBA.portable.ServantObjectExt) {
              ((org.omg.CORBA.portable.ServantObjectExt)_so).exceptionalCompletion((Throwable)x_3);
            }
          throw x_3;
        } catch (com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.InvalidParameterException x_4) {
            if (_so instanceof org.omg.CORBA.portable.ServantObjectExt) {
              ((org.omg.CORBA.portable.ServantObjectExt)_so).exceptionalCompletion((Throwable)x_4);
            }
          throw x_4;
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
   *   com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.CommonIRPConstDefs.Signal create_performance_monitoring (in com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPConstDefs.ObservationClassList observation_class_list,
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
  public com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.CommonIRPConstDefs.Signal create_performance_monitoring (com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPConstDefs.ObservationClass[] observation_class_list, 
                                                                                                                           com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPConstDefs.ObservationObject[] observation_object_list, 
                                                                                                                           int granularity_period, 
                                                                                                                           com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPConstDefs.Schedule schedule, 
                                                                                                                           int reporting_period, 
                                                                                                                           com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPConstDefs.Destination destination, 
                                                                                                                           java.lang.String measurement_name, 
                                                                                                                           com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPConstDefs.PerformanceMonitoringState performance_monitoring_state, 
                                                                                                                           org.omg.CORBA.IntHolder performance_monitoring_id, 
                                                                                                                           com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPConstDefs.FailureInformationHolder failure_information) throws  com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.OptionalOperationNotSupportedException, 
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
                                                                                                                                                                                                                                                                  com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.GranularityAndAttributeActivationException {

    while (true) {
      if (!_is_local()) {
        org.omg.CORBA.portable.OutputStream _output = null;
        org.omg.CORBA.portable.InputStream  _input  = null;
        com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.CommonIRPConstDefs.Signal _result;
        try {
          _output = this._request("create_performance_monitoring", true);
          com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPConstDefs.ObservationClassListHelper.write(_output, observation_class_list);
          com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPConstDefs.ObservationObjectListHelper.write(_output, observation_object_list);
          _output.write_long((int)granularity_period);
          if (schedule == null) {
            throw new org.omg.CORBA.BAD_PARAM("Invalid array length");
          }
          com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPConstDefs.ScheduleHelper.write(_output, schedule);
          _output.write_long((int)reporting_period);
          com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPConstDefs.DestinationHelper.write(_output, destination);
          _output.write_string((java.lang.String)measurement_name);
          com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPConstDefs.PerformanceMonitoringStateHelper.write(_output, performance_monitoring_state);
          _input = this._invoke(_output);
          _result = com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.CommonIRPConstDefs.SignalHelper.read(_input);
          performance_monitoring_id.value = _input.read_long();
          failure_information.value = com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPConstDefs.FailureInformationHelper.read(_input);
          return _result;
        }
        catch (org.omg.CORBA.portable.ApplicationException _exception) {
          java.lang.String _exception_id = _exception.getId();
          if (_exception_id.equals(com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.OptionalOperationNotSupportedExceptionHelper.id())) {
            throw             com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.OptionalOperationNotSupportedExceptionHelper.read(_exception.getInputStream());
          }
          if (_exception_id.equals(com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.OptionalParameterNotSupportedExceptionHelper.id())) {
            throw             com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.OptionalParameterNotSupportedExceptionHelper.read(_exception.getInputStream());
          }
          if (_exception_id.equals(com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.InvalidObservationObjectListExceptionHelper.id())) {
            throw             com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.InvalidObservationObjectListExceptionHelper.read(_exception.getInputStream());
          }
          if (_exception_id.equals(com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.InvalidObservationClassExceptionHelper.id())) {
            throw             com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.InvalidObservationClassExceptionHelper.read(_exception.getInputStream());
          }
          if (_exception_id.equals(com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.InvalidGranularityPeriodExceptionHelper.id())) {
            throw             com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.InvalidGranularityPeriodExceptionHelper.read(_exception.getInputStream());
          }
          if (_exception_id.equals(com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.InvalidParameterExceptionHelper.id())) {
            throw             com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.InvalidParameterExceptionHelper.read(_exception.getInputStream());
          }
          if (_exception_id.equals(com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.InvalidScheduleExceptionHelper.id())) {
            throw             com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.InvalidScheduleExceptionHelper.read(_exception.getInputStream());
          }
          if (_exception_id.equals(com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.InvalidReportingPeriodExceptionHelper.id())) {
            throw             com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.InvalidReportingPeriodExceptionHelper.read(_exception.getInputStream());
          }
          if (_exception_id.equals(com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.DestinationNotSupportedExceptionHelper.id())) {
            throw             com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.DestinationNotSupportedExceptionHelper.read(_exception.getInputStream());
          }
          if (_exception_id.equals(com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.ProcessingErrorExceptionHelper.id())) {
            throw             com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.ProcessingErrorExceptionHelper.read(_exception.getInputStream());
          }
          if (_exception_id.equals(com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.NumberOfCountersExceededExceptionHelper.id())) {
            throw             com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.NumberOfCountersExceededExceptionHelper.read(_exception.getInputStream());
          }
          if (_exception_id.equals(com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.NumberOfMonitorsExceededExceptionHelper.id())) {
            throw             com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.NumberOfMonitorsExceededExceptionHelper.read(_exception.getInputStream());
          }
          if (_exception_id.equals(com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.OverloadExceptionHelper.id())) {
            throw             com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.OverloadExceptionHelper.read(_exception.getInputStream());
          }
          if (_exception_id.equals(com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.GranularityNotSupportedExceptionHelper.id())) {
            throw             com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.GranularityNotSupportedExceptionHelper.read(_exception.getInputStream());
          }
          if (_exception_id.equals(com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.GranularityAndAttributeActivationExceptionHelper.id())) {
            throw             com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.GranularityAndAttributeActivationExceptionHelper.read(_exception.getInputStream());
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
        com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem._PerformanceMonitoringOperationsOperations _self = null;
        final org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke("create_performance_monitoring", _opsClass);
        if (_so == null) {
          continue;
        }
        try {
          _self = (com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem._PerformanceMonitoringOperationsOperations)_so.servant;
        } catch (java.lang.ClassCastException _vis_ce) {
          org.omg.CORBA.portable.OutputStream _output = null;
          org.omg.CORBA.portable.InputStream  _input  = null;
          com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.CommonIRPConstDefs.Signal _result;

          try {
            _output = _orb().create_output_stream();
            final org.omg.CORBA.portable.OutputStream _response_output = _orb().create_output_stream();
            final org.omg.CORBA.portable.OutputStream _response_ex_output = _orb().create_output_stream();
            com.inprise.vbroker.orb.VBResponseHandler _vis_vbr = com.inprise.vbroker.orb.VBResponseHandler.getResponseHandler(_response_output,_response_ex_output);
            com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPConstDefs.ObservationClassListHelper.write(_output, observation_class_list);
            com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPConstDefs.ObservationObjectListHelper.write(_output, observation_object_list);
            _output.write_long((int)granularity_period);
            if (schedule == null) {
              throw new org.omg.CORBA.BAD_PARAM("Invalid array length");
            }
            com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPConstDefs.ScheduleHelper.write(_output, schedule);
            _output.write_long((int)reporting_period);
            com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPConstDefs.DestinationHelper.write(_output, destination);
            _output.write_string((java.lang.String)measurement_name);
            com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPConstDefs.PerformanceMonitoringStateHelper.write(_output, performance_monitoring_state);
            org.omg.CORBA.portable.OutputStream _result_output = (((org.omg.CORBA.portable.InvokeHandler)_so.servant)._invoke("create_performance_monitoring",_output.create_input_stream(),_vis_vbr));
            _input = _result_output.create_input_stream();

            if(_vis_vbr.get_exflag()) {
              java.lang.String ex_repid = _input.read_string();
              if(ex_repid.equals("IDL:PerformanceIRPSystem/OptionalOperationNotSupportedException:1.0")) {
                com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.OptionalOperationNotSupportedException exf =                 com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.OptionalOperationNotSupportedExceptionHelper.read(_result_output.create_input_stream());
                throw exf;
              }
              if(ex_repid.equals("IDL:PerformanceIRPSystem/OptionalParameterNotSupportedException:1.0")) {
                com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.OptionalParameterNotSupportedException exf =                 com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.OptionalParameterNotSupportedExceptionHelper.read(_result_output.create_input_stream());
                throw exf;
              }
              if(ex_repid.equals("IDL:PerformanceIRPSystem/InvalidObservationObjectListException:1.0")) {
                com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.InvalidObservationObjectListException exf =                 com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.InvalidObservationObjectListExceptionHelper.read(_result_output.create_input_stream());
                throw exf;
              }
              if(ex_repid.equals("IDL:PerformanceIRPSystem/InvalidObservationClassException:1.0")) {
                com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.InvalidObservationClassException exf =                 com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.InvalidObservationClassExceptionHelper.read(_result_output.create_input_stream());
                throw exf;
              }
              if(ex_repid.equals("IDL:PerformanceIRPSystem/InvalidGranularityPeriodException:1.0")) {
                com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.InvalidGranularityPeriodException exf =                 com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.InvalidGranularityPeriodExceptionHelper.read(_result_output.create_input_stream());
                throw exf;
              }
              if(ex_repid.equals("IDL:PerformanceIRPSystem/InvalidParameterException:1.0")) {
                com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.InvalidParameterException exf =                 com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.InvalidParameterExceptionHelper.read(_result_output.create_input_stream());
                throw exf;
              }
              if(ex_repid.equals("IDL:PerformanceIRPSystem/InvalidScheduleException:1.0")) {
                com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.InvalidScheduleException exf =                 com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.InvalidScheduleExceptionHelper.read(_result_output.create_input_stream());
                throw exf;
              }
              if(ex_repid.equals("IDL:PerformanceIRPSystem/InvalidReportingPeriodException:1.0")) {
                com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.InvalidReportingPeriodException exf =                 com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.InvalidReportingPeriodExceptionHelper.read(_result_output.create_input_stream());
                throw exf;
              }
              if(ex_repid.equals("IDL:PerformanceIRPSystem/DestinationNotSupportedException:1.0")) {
                com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.DestinationNotSupportedException exf =                 com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.DestinationNotSupportedExceptionHelper.read(_result_output.create_input_stream());
                throw exf;
              }
              if(ex_repid.equals("IDL:PerformanceIRPSystem/ProcessingErrorException:1.0")) {
                com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.ProcessingErrorException exf =                 com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.ProcessingErrorExceptionHelper.read(_result_output.create_input_stream());
                throw exf;
              }
              if(ex_repid.equals("IDL:PerformanceIRPSystem/NumberOfCountersExceededException:1.0")) {
                com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.NumberOfCountersExceededException exf =                 com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.NumberOfCountersExceededExceptionHelper.read(_result_output.create_input_stream());
                throw exf;
              }
              if(ex_repid.equals("IDL:PerformanceIRPSystem/NumberOfMonitorsExceededException:1.0")) {
                com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.NumberOfMonitorsExceededException exf =                 com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.NumberOfMonitorsExceededExceptionHelper.read(_result_output.create_input_stream());
                throw exf;
              }
              if(ex_repid.equals("IDL:PerformanceIRPSystem/OverloadException:1.0")) {
                com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.OverloadException exf =                 com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.OverloadExceptionHelper.read(_result_output.create_input_stream());
                throw exf;
              }
              if(ex_repid.equals("IDL:PerformanceIRPSystem/GranularityNotSupportedException:1.0")) {
                com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.GranularityNotSupportedException exf =                 com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.GranularityNotSupportedExceptionHelper.read(_result_output.create_input_stream());
                throw exf;
              }
              if(ex_repid.equals("IDL:PerformanceIRPSystem/GranularityAndAttributeActivationException:1.0")) {
                com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.GranularityAndAttributeActivationException exf =                 com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.GranularityAndAttributeActivationExceptionHelper.read(_result_output.create_input_stream());
                throw exf;
              }
            }

            _result = com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.CommonIRPConstDefs.SignalHelper.read(_input);

            performance_monitoring_id.value = _input.read_long();
            failure_information.value = com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPConstDefs.FailureInformationHelper.read(_input);

            if (_so instanceof org.omg.CORBA.portable.ServantObjectExt) {
              ((org.omg.CORBA.portable.ServantObjectExt)_so).normalCompletion();
            }
            return _result;
          } catch (com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.OptionalOperationNotSupportedException x_1) {
            if (_so instanceof org.omg.CORBA.portable.ServantObjectExt) {
              ((org.omg.CORBA.portable.ServantObjectExt)_so).exceptionalCompletion((Throwable)x_1);
            }
            throw x_1;

          } catch (com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.OptionalParameterNotSupportedException x_2) {
            if (_so instanceof org.omg.CORBA.portable.ServantObjectExt) {
              ((org.omg.CORBA.portable.ServantObjectExt)_so).exceptionalCompletion((Throwable)x_2);
            }
            throw x_2;

          } catch (com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.InvalidObservationObjectListException x_3) {
            if (_so instanceof org.omg.CORBA.portable.ServantObjectExt) {
              ((org.omg.CORBA.portable.ServantObjectExt)_so).exceptionalCompletion((Throwable)x_3);
            }
            throw x_3;

          } catch (com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.InvalidObservationClassException x_4) {
            if (_so instanceof org.omg.CORBA.portable.ServantObjectExt) {
              ((org.omg.CORBA.portable.ServantObjectExt)_so).exceptionalCompletion((Throwable)x_4);
            }
            throw x_4;

          } catch (com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.InvalidGranularityPeriodException x_5) {
            if (_so instanceof org.omg.CORBA.portable.ServantObjectExt) {
              ((org.omg.CORBA.portable.ServantObjectExt)_so).exceptionalCompletion((Throwable)x_5);
            }
            throw x_5;

          } catch (com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.InvalidParameterException x_6) {
            if (_so instanceof org.omg.CORBA.portable.ServantObjectExt) {
              ((org.omg.CORBA.portable.ServantObjectExt)_so).exceptionalCompletion((Throwable)x_6);
            }
            throw x_6;

          } catch (com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.InvalidScheduleException x_7) {
            if (_so instanceof org.omg.CORBA.portable.ServantObjectExt) {
              ((org.omg.CORBA.portable.ServantObjectExt)_so).exceptionalCompletion((Throwable)x_7);
            }
            throw x_7;

          } catch (com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.InvalidReportingPeriodException x_8) {
            if (_so instanceof org.omg.CORBA.portable.ServantObjectExt) {
              ((org.omg.CORBA.portable.ServantObjectExt)_so).exceptionalCompletion((Throwable)x_8);
            }
            throw x_8;

          } catch (com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.DestinationNotSupportedException x_9) {
            if (_so instanceof org.omg.CORBA.portable.ServantObjectExt) {
              ((org.omg.CORBA.portable.ServantObjectExt)_so).exceptionalCompletion((Throwable)x_9);
            }
            throw x_9;

          } catch (com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.ProcessingErrorException x_10) {
            if (_so instanceof org.omg.CORBA.portable.ServantObjectExt) {
              ((org.omg.CORBA.portable.ServantObjectExt)_so).exceptionalCompletion((Throwable)x_10);
            }
            throw x_10;

          } catch (com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.NumberOfCountersExceededException x_11) {
            if (_so instanceof org.omg.CORBA.portable.ServantObjectExt) {
              ((org.omg.CORBA.portable.ServantObjectExt)_so).exceptionalCompletion((Throwable)x_11);
            }
            throw x_11;

          } catch (com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.NumberOfMonitorsExceededException x_12) {
            if (_so instanceof org.omg.CORBA.portable.ServantObjectExt) {
              ((org.omg.CORBA.portable.ServantObjectExt)_so).exceptionalCompletion((Throwable)x_12);
            }
            throw x_12;

          } catch (com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.OverloadException x_13) {
            if (_so instanceof org.omg.CORBA.portable.ServantObjectExt) {
              ((org.omg.CORBA.portable.ServantObjectExt)_so).exceptionalCompletion((Throwable)x_13);
            }
            throw x_13;

          } catch (com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.GranularityNotSupportedException x_14) {
            if (_so instanceof org.omg.CORBA.portable.ServantObjectExt) {
              ((org.omg.CORBA.portable.ServantObjectExt)_so).exceptionalCompletion((Throwable)x_14);
            }
            throw x_14;

          } catch (com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.GranularityAndAttributeActivationException x_15) {
            if (_so instanceof org.omg.CORBA.portable.ServantObjectExt) {
              ((org.omg.CORBA.portable.ServantObjectExt)_so).exceptionalCompletion((Throwable)x_15);
            }
            throw x_15;

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
          com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.CommonIRPConstDefs.Signal _ret = _self.create_performance_monitoring(observation_class_list, 
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
        } catch (com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.OptionalOperationNotSupportedException x_1) {
            if (_so instanceof org.omg.CORBA.portable.ServantObjectExt) {
              ((org.omg.CORBA.portable.ServantObjectExt)_so).exceptionalCompletion((Throwable)x_1);
            }
          throw x_1;
        } catch (com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.OptionalParameterNotSupportedException x_2) {
            if (_so instanceof org.omg.CORBA.portable.ServantObjectExt) {
              ((org.omg.CORBA.portable.ServantObjectExt)_so).exceptionalCompletion((Throwable)x_2);
            }
          throw x_2;
        } catch (com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.InvalidObservationObjectListException x_3) {
            if (_so instanceof org.omg.CORBA.portable.ServantObjectExt) {
              ((org.omg.CORBA.portable.ServantObjectExt)_so).exceptionalCompletion((Throwable)x_3);
            }
          throw x_3;
        } catch (com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.InvalidObservationClassException x_4) {
            if (_so instanceof org.omg.CORBA.portable.ServantObjectExt) {
              ((org.omg.CORBA.portable.ServantObjectExt)_so).exceptionalCompletion((Throwable)x_4);
            }
          throw x_4;
        } catch (com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.InvalidGranularityPeriodException x_5) {
            if (_so instanceof org.omg.CORBA.portable.ServantObjectExt) {
              ((org.omg.CORBA.portable.ServantObjectExt)_so).exceptionalCompletion((Throwable)x_5);
            }
          throw x_5;
        } catch (com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.InvalidParameterException x_6) {
            if (_so instanceof org.omg.CORBA.portable.ServantObjectExt) {
              ((org.omg.CORBA.portable.ServantObjectExt)_so).exceptionalCompletion((Throwable)x_6);
            }
          throw x_6;
        } catch (com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.InvalidScheduleException x_7) {
            if (_so instanceof org.omg.CORBA.portable.ServantObjectExt) {
              ((org.omg.CORBA.portable.ServantObjectExt)_so).exceptionalCompletion((Throwable)x_7);
            }
          throw x_7;
        } catch (com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.InvalidReportingPeriodException x_8) {
            if (_so instanceof org.omg.CORBA.portable.ServantObjectExt) {
              ((org.omg.CORBA.portable.ServantObjectExt)_so).exceptionalCompletion((Throwable)x_8);
            }
          throw x_8;
        } catch (com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.DestinationNotSupportedException x_9) {
            if (_so instanceof org.omg.CORBA.portable.ServantObjectExt) {
              ((org.omg.CORBA.portable.ServantObjectExt)_so).exceptionalCompletion((Throwable)x_9);
            }
          throw x_9;
        } catch (com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.ProcessingErrorException x_10) {
            if (_so instanceof org.omg.CORBA.portable.ServantObjectExt) {
              ((org.omg.CORBA.portable.ServantObjectExt)_so).exceptionalCompletion((Throwable)x_10);
            }
          throw x_10;
        } catch (com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.NumberOfCountersExceededException x_11) {
            if (_so instanceof org.omg.CORBA.portable.ServantObjectExt) {
              ((org.omg.CORBA.portable.ServantObjectExt)_so).exceptionalCompletion((Throwable)x_11);
            }
          throw x_11;
        } catch (com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.NumberOfMonitorsExceededException x_12) {
            if (_so instanceof org.omg.CORBA.portable.ServantObjectExt) {
              ((org.omg.CORBA.portable.ServantObjectExt)_so).exceptionalCompletion((Throwable)x_12);
            }
          throw x_12;
        } catch (com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.OverloadException x_13) {
            if (_so instanceof org.omg.CORBA.portable.ServantObjectExt) {
              ((org.omg.CORBA.portable.ServantObjectExt)_so).exceptionalCompletion((Throwable)x_13);
            }
          throw x_13;
        } catch (com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.GranularityNotSupportedException x_14) {
            if (_so instanceof org.omg.CORBA.portable.ServantObjectExt) {
              ((org.omg.CORBA.portable.ServantObjectExt)_so).exceptionalCompletion((Throwable)x_14);
            }
          throw x_14;
        } catch (com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.GranularityAndAttributeActivationException x_15) {
            if (_so instanceof org.omg.CORBA.portable.ServantObjectExt) {
              ((org.omg.CORBA.portable.ServantObjectExt)_so).exceptionalCompletion((Throwable)x_15);
            }
          throw x_15;
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
   *   com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.CommonIRPConstDefs.Signal list_performance_monitorings (in com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPConstDefs.NeList ne_list,
                                                                                                                   out com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPConstDefs.PerformanceMonitoringList performance_monitoring_list)
    raises (com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.OptionalOperationNotSupportedException,
            com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.OptionalParameterNotSupportedException,
            com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.InvalidNetworkElement,
            com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.InvalidParameterException);
   * </pre>
   */
  public com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.CommonIRPConstDefs.Signal list_performance_monitorings (java.lang.String[] ne_list, 
                                                                                                                          com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPConstDefs.PerformanceMonitoringListHolder performance_monitoring_list) throws  com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.OptionalOperationNotSupportedException, 
                                                                                                                                                                                                                                                                                com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.OptionalParameterNotSupportedException, 
                                                                                                                                                                                                                                                                                com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.InvalidNetworkElement, 
                                                                                                                                                                                                                                                                                com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.InvalidParameterException {

    while (true) {
      if (!_is_local()) {
        org.omg.CORBA.portable.OutputStream _output = null;
        org.omg.CORBA.portable.InputStream  _input  = null;
        com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.CommonIRPConstDefs.Signal _result;
        try {
          _output = this._request("list_performance_monitorings", true);
          com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPConstDefs.NeListHelper.write(_output, ne_list);
          _input = this._invoke(_output);
          _result = com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.CommonIRPConstDefs.SignalHelper.read(_input);
          performance_monitoring_list.value = com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPConstDefs.PerformanceMonitoringListHelper.read(_input);
          return _result;
        }
        catch (org.omg.CORBA.portable.ApplicationException _exception) {
          java.lang.String _exception_id = _exception.getId();
          if (_exception_id.equals(com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.OptionalOperationNotSupportedExceptionHelper.id())) {
            throw             com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.OptionalOperationNotSupportedExceptionHelper.read(_exception.getInputStream());
          }
          if (_exception_id.equals(com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.OptionalParameterNotSupportedExceptionHelper.id())) {
            throw             com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.OptionalParameterNotSupportedExceptionHelper.read(_exception.getInputStream());
          }
          if (_exception_id.equals(com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.InvalidNetworkElementHelper.id())) {
            throw             com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.InvalidNetworkElementHelper.read(_exception.getInputStream());
          }
          if (_exception_id.equals(com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.InvalidParameterExceptionHelper.id())) {
            throw             com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.InvalidParameterExceptionHelper.read(_exception.getInputStream());
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
        com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem._PerformanceMonitoringOperationsOperations _self = null;
        final org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke("list_performance_monitorings", _opsClass);
        if (_so == null) {
          continue;
        }
        try {
          _self = (com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem._PerformanceMonitoringOperationsOperations)_so.servant;
        } catch (java.lang.ClassCastException _vis_ce) {
          org.omg.CORBA.portable.OutputStream _output = null;
          org.omg.CORBA.portable.InputStream  _input  = null;
          com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.CommonIRPConstDefs.Signal _result;

          try {
            _output = _orb().create_output_stream();
            final org.omg.CORBA.portable.OutputStream _response_output = _orb().create_output_stream();
            final org.omg.CORBA.portable.OutputStream _response_ex_output = _orb().create_output_stream();
            com.inprise.vbroker.orb.VBResponseHandler _vis_vbr = com.inprise.vbroker.orb.VBResponseHandler.getResponseHandler(_response_output,_response_ex_output);
            com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPConstDefs.NeListHelper.write(_output, ne_list);
            org.omg.CORBA.portable.OutputStream _result_output = (((org.omg.CORBA.portable.InvokeHandler)_so.servant)._invoke("list_performance_monitorings",_output.create_input_stream(),_vis_vbr));
            _input = _result_output.create_input_stream();

            if(_vis_vbr.get_exflag()) {
              java.lang.String ex_repid = _input.read_string();
              if(ex_repid.equals("IDL:PerformanceIRPSystem/OptionalOperationNotSupportedException:1.0")) {
                com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.OptionalOperationNotSupportedException exf =                 com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.OptionalOperationNotSupportedExceptionHelper.read(_result_output.create_input_stream());
                throw exf;
              }
              if(ex_repid.equals("IDL:PerformanceIRPSystem/OptionalParameterNotSupportedException:1.0")) {
                com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.OptionalParameterNotSupportedException exf =                 com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.OptionalParameterNotSupportedExceptionHelper.read(_result_output.create_input_stream());
                throw exf;
              }
              if(ex_repid.equals("IDL:PerformanceIRPSystem/InvalidNetworkElement:1.0")) {
                com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.InvalidNetworkElement exf =                 com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.InvalidNetworkElementHelper.read(_result_output.create_input_stream());
                throw exf;
              }
              if(ex_repid.equals("IDL:PerformanceIRPSystem/InvalidParameterException:1.0")) {
                com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.InvalidParameterException exf =                 com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.InvalidParameterExceptionHelper.read(_result_output.create_input_stream());
                throw exf;
              }
            }

            _result = com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.CommonIRPConstDefs.SignalHelper.read(_input);

            performance_monitoring_list.value = com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPConstDefs.PerformanceMonitoringListHelper.read(_input);

            if (_so instanceof org.omg.CORBA.portable.ServantObjectExt) {
              ((org.omg.CORBA.portable.ServantObjectExt)_so).normalCompletion();
            }
            return _result;
          } catch (com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.OptionalOperationNotSupportedException x_1) {
            if (_so instanceof org.omg.CORBA.portable.ServantObjectExt) {
              ((org.omg.CORBA.portable.ServantObjectExt)_so).exceptionalCompletion((Throwable)x_1);
            }
            throw x_1;

          } catch (com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.OptionalParameterNotSupportedException x_2) {
            if (_so instanceof org.omg.CORBA.portable.ServantObjectExt) {
              ((org.omg.CORBA.portable.ServantObjectExt)_so).exceptionalCompletion((Throwable)x_2);
            }
            throw x_2;

          } catch (com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.InvalidNetworkElement x_3) {
            if (_so instanceof org.omg.CORBA.portable.ServantObjectExt) {
              ((org.omg.CORBA.portable.ServantObjectExt)_so).exceptionalCompletion((Throwable)x_3);
            }
            throw x_3;

          } catch (com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.InvalidParameterException x_4) {
            if (_so instanceof org.omg.CORBA.portable.ServantObjectExt) {
              ((org.omg.CORBA.portable.ServantObjectExt)_so).exceptionalCompletion((Throwable)x_4);
            }
            throw x_4;

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
          com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.CommonIRPConstDefs.Signal _ret = _self.list_performance_monitorings(ne_list, 
                                                                                                                                       performance_monitoring_list);
          if (_so instanceof org.omg.CORBA.portable.ServantObjectExt) {
            ((org.omg.CORBA.portable.ServantObjectExt)_so).normalCompletion();
          }
          return _ret;
        } catch (com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.OptionalOperationNotSupportedException x_1) {
            if (_so instanceof org.omg.CORBA.portable.ServantObjectExt) {
              ((org.omg.CORBA.portable.ServantObjectExt)_so).exceptionalCompletion((Throwable)x_1);
            }
          throw x_1;
        } catch (com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.OptionalParameterNotSupportedException x_2) {
            if (_so instanceof org.omg.CORBA.portable.ServantObjectExt) {
              ((org.omg.CORBA.portable.ServantObjectExt)_so).exceptionalCompletion((Throwable)x_2);
            }
          throw x_2;
        } catch (com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.InvalidNetworkElement x_3) {
            if (_so instanceof org.omg.CORBA.portable.ServantObjectExt) {
              ((org.omg.CORBA.portable.ServantObjectExt)_so).exceptionalCompletion((Throwable)x_3);
            }
          throw x_3;
        } catch (com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_6_0.PerformanceIRPSystem.InvalidParameterException x_4) {
            if (_so instanceof org.omg.CORBA.portable.ServantObjectExt) {
              ((org.omg.CORBA.portable.ServantObjectExt)_so).exceptionalCompletion((Throwable)x_4);
            }
          throw x_4;
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
