package com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem;

/**
 * <ul>
 * <li> <b>IDL Source</b>    "C:/MicroFocus/VisiBroker/bin/PerformanceIRPSystem_2_6/PerformanceIRPSystem.idl"
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
public class __PerformanceIRPOperationsStub extends com.inprise.vbroker.CORBA.portable.ObjectImpl implements com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem._PerformanceIRPOperations {
  final public static java.lang.Class _opsClass = com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem._PerformanceIRPOperationsOperations.class;

  public java.lang.String[] _ids () {
    return __ids;
  }

  private static java.lang.String[] __ids = {
    "IDL:PerformanceIRPSystem/PerformanceIRPOperations:1.0"
  };

  /**
   * <pre>
   *   com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.CommonIRPConstDefs.VersionNumberSet get_performance_IRP_version ();
   * </pre>
   */
  public java.lang.String[] get_performance_IRP_version () {

    while (true) {
      if (!_is_local()) {
        org.omg.CORBA.portable.OutputStream _output = null;
        org.omg.CORBA.portable.InputStream  _input  = null;
        java.lang.String[] _result;
        try {
          _output = this._request("get_performance_IRP_version", true);
          _input = this._invoke(_output);
          _result = com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.CommonIRPConstDefs.VersionNumberSetHelper.read(_input);
          return _result;
        }
        catch (org.omg.CORBA.portable.ApplicationException _exception) {
          java.lang.String _exception_id = _exception.getId();
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
        com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem._PerformanceIRPOperationsOperations _self = null;
        final org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke("get_performance_IRP_version", _opsClass);
        if (_so == null) {
          continue;
        }
        try {
          _self = (com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.PerformanceIRPSystem._PerformanceIRPOperationsOperations)_so.servant;
        } catch (java.lang.ClassCastException _vis_ce) {
          org.omg.CORBA.portable.OutputStream _output = null;
          org.omg.CORBA.portable.InputStream  _input  = null;
          java.lang.String[] _result;

          try {
            _output = _orb().create_output_stream();
            final org.omg.CORBA.portable.OutputStream _response_output = _orb().create_output_stream();
            final org.omg.CORBA.portable.OutputStream _response_ex_output = _orb().create_output_stream();
            com.inprise.vbroker.orb.VBResponseHandler _vis_vbr = com.inprise.vbroker.orb.VBResponseHandler.getResponseHandler(_response_output,_response_ex_output);
            org.omg.CORBA.portable.OutputStream _result_output = (((org.omg.CORBA.portable.InvokeHandler)_so.servant)._invoke("get_performance_IRP_version",_output.create_input_stream(),_vis_vbr));
            _input = _result_output.create_input_stream();

            _result = com.ericsson.oss.pmic.mediation.PerformanceIRPSystem_2_6.CommonIRPConstDefs.VersionNumberSetHelper.read(_input);

            if (_so instanceof org.omg.CORBA.portable.ServantObjectExt) {
              ((org.omg.CORBA.portable.ServantObjectExt)_so).normalCompletion();
            }
            return _result;
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
          java.lang.String[] _ret = _self.get_performance_IRP_version();
          if (_so instanceof org.omg.CORBA.portable.ServantObjectExt) {
            ((org.omg.CORBA.portable.ServantObjectExt)_so).normalCompletion();
          }
          return _ret;
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
