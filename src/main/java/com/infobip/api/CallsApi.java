/*
 * This class is auto generated from the Infobip OpenAPI specification
 * through the OpenAPI Specification Client API libraries (Re)Generator (OSCAR),
 * powered by the OpenAPI Generator (https://openapi-generator.tech).
 *
 * Do not edit manually. To learn how to raise an issue, see the CONTRIBUTING guide
 * or contact us @ support@infobip.com.
 */

package com.infobip.api;

import com.fasterxml.jackson.core.type.TypeReference;
import com.infobip.ApiCallback;
import com.infobip.ApiClient;
import com.infobip.ApiException;
import com.infobip.Parameter;
import com.infobip.RequestDefinition;
import com.infobip.model.Call;
import com.infobip.model.CallBulkRequest;
import com.infobip.model.CallBulkResponse;
import com.infobip.model.CallBulkStatus;
import com.infobip.model.CallDirection;
import com.infobip.model.CallEndpointType;
import com.infobip.model.CallLog;
import com.infobip.model.CallLogPage;
import com.infobip.model.CallPage;
import com.infobip.model.CallRecording;
import com.infobip.model.CallRecordingPage;
import com.infobip.model.CallRequest;
import com.infobip.model.CallState;
import com.infobip.model.CallsActionResponse;
import com.infobip.model.CallsAddExistingCallRequest;
import com.infobip.model.CallsAddNewCallRequest;
import com.infobip.model.CallsAnswerRequest;
import com.infobip.model.CallsApplicationTransferRequest;
import com.infobip.model.CallsConference;
import com.infobip.model.CallsConferenceAndCall;
import com.infobip.model.CallsConferenceLog;
import com.infobip.model.CallsConferenceLogPage;
import com.infobip.model.CallsConferencePage;
import com.infobip.model.CallsConferenceRecording;
import com.infobip.model.CallsConferenceRecordingPage;
import com.infobip.model.CallsConferenceRequest;
import com.infobip.model.CallsConnectRequest;
import com.infobip.model.CallsConnectWithNewCallRequest;
import com.infobip.model.CallsDialogLogPage;
import com.infobip.model.CallsDialogLogResponse;
import com.infobip.model.CallsDialogPage;
import com.infobip.model.CallsDialogPlayRequest;
import com.infobip.model.CallsDialogRecordingPage;
import com.infobip.model.CallsDialogRecordingRequest;
import com.infobip.model.CallsDialogRecordingResponse;
import com.infobip.model.CallsDialogRequest;
import com.infobip.model.CallsDialogResponse;
import com.infobip.model.CallsDialogSayRequest;
import com.infobip.model.CallsDialogState;
import com.infobip.model.CallsDtmfCaptureRequest;
import com.infobip.model.CallsDtmfSendRequest;
import com.infobip.model.CallsFile;
import com.infobip.model.CallsFilePage;
import com.infobip.model.CallsHangupRequest;
import com.infobip.model.CallsMediaStreamConfigPage;
import com.infobip.model.CallsMediaStreamConfigRequest;
import com.infobip.model.CallsMediaStreamConfigResponse;
import com.infobip.model.CallsOnDemandComposition;
import com.infobip.model.CallsPlayRequest;
import com.infobip.model.CallsRecordingFile;
import com.infobip.model.CallsRecordingStartRequest;
import com.infobip.model.CallsRescheduleRequest;
import com.infobip.model.CallsSayRequest;
import com.infobip.model.CallsStartMediaStreamRequest;
import com.infobip.model.CallsStartRecordingRequest;
import com.infobip.model.CallsUpdateRequest;
import java.io.File;
import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * Represents CallsApi API client.
 */
public class CallsApi {

    private final ApiClient apiClient;

    /**
     * Constructs a new instance of CallsApi.
     *
     * @param apiClient {@link ApiClient} instance to delegate calls to.
     */
    public CallsApi(ApiClient apiClient) {
        this.apiClient = Objects.requireNonNull(apiClient, "ApiClient must not be null!");
    }

    private RequestDefinition addExistingConferenceCallDefinition(
            String conferenceId, String callId, CallsAddExistingCallRequest callsAddExistingCallRequest) {
        RequestDefinition.Builder builder = RequestDefinition.builder(
                        "PUT", "/calls/1/conferences/{conferenceId}/call/{callId}")
                .body(callsAddExistingCallRequest)
                .requiresAuthentication(true)
                .accept("application/json")
                .contentType("application/json");

        if (conferenceId != null) {
            builder.addPathParameter(new Parameter("conferenceId", conferenceId));
        }
        if (callId != null) {
            builder.addPathParameter(new Parameter("callId", callId));
        }
        return builder.build();
    }

    /**
     * addExistingConferenceCall request builder class.
     */
    public class AddExistingConferenceCallRequest {
        private final String conferenceId;
        private final String callId;
        private final CallsAddExistingCallRequest callsAddExistingCallRequest;

        private AddExistingConferenceCallRequest(
                String conferenceId, String callId, CallsAddExistingCallRequest callsAddExistingCallRequest) {
            this.conferenceId =
                    Objects.requireNonNull(conferenceId, "The required parameter 'conferenceId' is missing.");
            this.callId = Objects.requireNonNull(callId, "The required parameter 'callId' is missing.");
            this.callsAddExistingCallRequest = Objects.requireNonNull(
                    callsAddExistingCallRequest, "The required parameter 'callsAddExistingCallRequest' is missing.");
        }

        /**
         * Executes the addExistingConferenceCall request.
         *
         * @return CallsConference The deserialized response.
         * @throws ApiException If the API call fails or an error occurs during the request or response processing.
         */
        public CallsConference execute() throws ApiException {
            RequestDefinition addExistingConferenceCallDefinition =
                    addExistingConferenceCallDefinition(conferenceId, callId, callsAddExistingCallRequest);
            return apiClient.execute(
                    addExistingConferenceCallDefinition, new TypeReference<CallsConference>() {}.getType());
        }

        /**
         * Executes the addExistingConferenceCall request asynchronously.
         *
         * @param callback The {@link ApiCallback} to be invoked.
         * @return The {@link okhttp3.Call} associated with the API request.
         */
        public okhttp3.Call executeAsync(ApiCallback<CallsConference> callback) {
            RequestDefinition addExistingConferenceCallDefinition =
                    addExistingConferenceCallDefinition(conferenceId, callId, callsAddExistingCallRequest);
            return apiClient.executeAsync(
                    addExistingConferenceCallDefinition, new TypeReference<CallsConference>() {}.getType(), callback);
        }
    }

    /**
     * Add existing call.
     * <p>
     * Add an existing call to a conference.
     *
     * @param conferenceId Conference ID. (required)
     * @param callId Call ID. (required)
     * @param callsAddExistingCallRequest  (required)
     * @return AddExistingConferenceCallRequest
     */
    public AddExistingConferenceCallRequest addExistingConferenceCall(
            String conferenceId, String callId, CallsAddExistingCallRequest callsAddExistingCallRequest) {
        return new AddExistingConferenceCallRequest(conferenceId, callId, callsAddExistingCallRequest);
    }

    private RequestDefinition addNewConferenceCallDefinition(
            String conferenceId, CallsAddNewCallRequest callsAddNewCallRequest) {
        RequestDefinition.Builder builder = RequestDefinition.builder(
                        "POST", "/calls/1/conferences/{conferenceId}/call")
                .body(callsAddNewCallRequest)
                .requiresAuthentication(true)
                .accept("application/json")
                .contentType("application/json");

        if (conferenceId != null) {
            builder.addPathParameter(new Parameter("conferenceId", conferenceId));
        }
        return builder.build();
    }

    /**
     * addNewConferenceCall request builder class.
     */
    public class AddNewConferenceCallRequest {
        private final String conferenceId;
        private final CallsAddNewCallRequest callsAddNewCallRequest;

        private AddNewConferenceCallRequest(String conferenceId, CallsAddNewCallRequest callsAddNewCallRequest) {
            this.conferenceId =
                    Objects.requireNonNull(conferenceId, "The required parameter 'conferenceId' is missing.");
            this.callsAddNewCallRequest = Objects.requireNonNull(
                    callsAddNewCallRequest, "The required parameter 'callsAddNewCallRequest' is missing.");
        }

        /**
         * Executes the addNewConferenceCall request.
         *
         * @return CallsConferenceAndCall The deserialized response.
         * @throws ApiException If the API call fails or an error occurs during the request or response processing.
         */
        public CallsConferenceAndCall execute() throws ApiException {
            RequestDefinition addNewConferenceCallDefinition =
                    addNewConferenceCallDefinition(conferenceId, callsAddNewCallRequest);
            return apiClient.execute(
                    addNewConferenceCallDefinition, new TypeReference<CallsConferenceAndCall>() {}.getType());
        }

        /**
         * Executes the addNewConferenceCall request asynchronously.
         *
         * @param callback The {@link ApiCallback} to be invoked.
         * @return The {@link okhttp3.Call} associated with the API request.
         */
        public okhttp3.Call executeAsync(ApiCallback<CallsConferenceAndCall> callback) {
            RequestDefinition addNewConferenceCallDefinition =
                    addNewConferenceCallDefinition(conferenceId, callsAddNewCallRequest);
            return apiClient.executeAsync(
                    addNewConferenceCallDefinition, new TypeReference<CallsConferenceAndCall>() {}.getType(), callback);
        }
    }

    /**
     * Add new call.
     * <p>
     * Create a new outbound call and add it to a conference.
     *
     * @param conferenceId Conference ID. (required)
     * @param callsAddNewCallRequest  (required)
     * @return AddNewConferenceCallRequest
     */
    public AddNewConferenceCallRequest addNewConferenceCall(
            String conferenceId, CallsAddNewCallRequest callsAddNewCallRequest) {
        return new AddNewConferenceCallRequest(conferenceId, callsAddNewCallRequest);
    }

    private RequestDefinition answerCallDefinition(String callId, CallsAnswerRequest callsAnswerRequest) {
        RequestDefinition.Builder builder = RequestDefinition.builder("POST", "/calls/1/calls/{callId}/answer")
                .body(callsAnswerRequest)
                .requiresAuthentication(true)
                .accept("application/json")
                .contentType("application/json");

        if (callId != null) {
            builder.addPathParameter(new Parameter("callId", callId));
        }
        return builder.build();
    }

    /**
     * answerCall request builder class.
     */
    public class AnswerCallRequest {
        private final String callId;
        private final CallsAnswerRequest callsAnswerRequest;

        private AnswerCallRequest(String callId, CallsAnswerRequest callsAnswerRequest) {
            this.callId = Objects.requireNonNull(callId, "The required parameter 'callId' is missing.");
            this.callsAnswerRequest = Objects.requireNonNull(
                    callsAnswerRequest, "The required parameter 'callsAnswerRequest' is missing.");
        }

        /**
         * Executes the answerCall request.
         *
         * @return CallsActionResponse The deserialized response.
         * @throws ApiException If the API call fails or an error occurs during the request or response processing.
         */
        public CallsActionResponse execute() throws ApiException {
            RequestDefinition answerCallDefinition = answerCallDefinition(callId, callsAnswerRequest);
            return apiClient.execute(answerCallDefinition, new TypeReference<CallsActionResponse>() {}.getType());
        }

        /**
         * Executes the answerCall request asynchronously.
         *
         * @param callback The {@link ApiCallback} to be invoked.
         * @return The {@link okhttp3.Call} associated with the API request.
         */
        public okhttp3.Call executeAsync(ApiCallback<CallsActionResponse> callback) {
            RequestDefinition answerCallDefinition = answerCallDefinition(callId, callsAnswerRequest);
            return apiClient.executeAsync(
                    answerCallDefinition, new TypeReference<CallsActionResponse>() {}.getType(), callback);
        }
    }

    /**
     * Answer.
     * <p>
     * Answer a call.
     *
     * @param callId Call ID. (required)
     * @param callsAnswerRequest  (required)
     * @return AnswerCallRequest
     */
    public AnswerCallRequest answerCall(String callId, CallsAnswerRequest callsAnswerRequest) {
        return new AnswerCallRequest(callId, callsAnswerRequest);
    }

    private RequestDefinition applicationTransferDefinition(
            String callId, CallsApplicationTransferRequest callsApplicationTransferRequest) {
        RequestDefinition.Builder builder = RequestDefinition.builder(
                        "POST", "/calls/1/calls/{callId}/application-transfer")
                .body(callsApplicationTransferRequest)
                .requiresAuthentication(true)
                .accept("application/json")
                .contentType("application/json");

        if (callId != null) {
            builder.addPathParameter(new Parameter("callId", callId));
        }
        return builder.build();
    }

    /**
     * applicationTransfer request builder class.
     */
    public class ApplicationTransferRequest {
        private final String callId;
        private final CallsApplicationTransferRequest callsApplicationTransferRequest;

        private ApplicationTransferRequest(
                String callId, CallsApplicationTransferRequest callsApplicationTransferRequest) {
            this.callId = Objects.requireNonNull(callId, "The required parameter 'callId' is missing.");
            this.callsApplicationTransferRequest = Objects.requireNonNull(
                    callsApplicationTransferRequest,
                    "The required parameter 'callsApplicationTransferRequest' is missing.");
        }

        /**
         * Executes the applicationTransfer request.
         *
         * @return CallsActionResponse The deserialized response.
         * @throws ApiException If the API call fails or an error occurs during the request or response processing.
         */
        public CallsActionResponse execute() throws ApiException {
            RequestDefinition applicationTransferDefinition =
                    applicationTransferDefinition(callId, callsApplicationTransferRequest);
            return apiClient.execute(
                    applicationTransferDefinition, new TypeReference<CallsActionResponse>() {}.getType());
        }

        /**
         * Executes the applicationTransfer request asynchronously.
         *
         * @param callback The {@link ApiCallback} to be invoked.
         * @return The {@link okhttp3.Call} associated with the API request.
         */
        public okhttp3.Call executeAsync(ApiCallback<CallsActionResponse> callback) {
            RequestDefinition applicationTransferDefinition =
                    applicationTransferDefinition(callId, callsApplicationTransferRequest);
            return apiClient.executeAsync(
                    applicationTransferDefinition, new TypeReference<CallsActionResponse>() {}.getType(), callback);
        }
    }

    /**
     * Request application transfer.
     * <p>
     * Request application transfer.
     *
     * @param callId Call ID. (required)
     * @param callsApplicationTransferRequest  (required)
     * @return ApplicationTransferRequest
     */
    public ApplicationTransferRequest applicationTransfer(
            String callId, CallsApplicationTransferRequest callsApplicationTransferRequest) {
        return new ApplicationTransferRequest(callId, callsApplicationTransferRequest);
    }

    private RequestDefinition applicationTransferAcceptDefinition(String callId, String transferId) {
        RequestDefinition.Builder builder = RequestDefinition.builder(
                        "POST", "/calls/1/calls/{callId}/application-transfer/{transferId}/accept")
                .requiresAuthentication(true)
                .accept("application/json");

        if (callId != null) {
            builder.addPathParameter(new Parameter("callId", callId));
        }
        if (transferId != null) {
            builder.addPathParameter(new Parameter("transferId", transferId));
        }
        return builder.build();
    }

    /**
     * applicationTransferAccept request builder class.
     */
    public class ApplicationTransferAcceptRequest {
        private final String callId;
        private final String transferId;

        private ApplicationTransferAcceptRequest(String callId, String transferId) {
            this.callId = Objects.requireNonNull(callId, "The required parameter 'callId' is missing.");
            this.transferId = Objects.requireNonNull(transferId, "The required parameter 'transferId' is missing.");
        }

        /**
         * Executes the applicationTransferAccept request.
         *
         * @return CallsActionResponse The deserialized response.
         * @throws ApiException If the API call fails or an error occurs during the request or response processing.
         */
        public CallsActionResponse execute() throws ApiException {
            RequestDefinition applicationTransferAcceptDefinition =
                    applicationTransferAcceptDefinition(callId, transferId);
            return apiClient.execute(
                    applicationTransferAcceptDefinition, new TypeReference<CallsActionResponse>() {}.getType());
        }

        /**
         * Executes the applicationTransferAccept request asynchronously.
         *
         * @param callback The {@link ApiCallback} to be invoked.
         * @return The {@link okhttp3.Call} associated with the API request.
         */
        public okhttp3.Call executeAsync(ApiCallback<CallsActionResponse> callback) {
            RequestDefinition applicationTransferAcceptDefinition =
                    applicationTransferAcceptDefinition(callId, transferId);
            return apiClient.executeAsync(
                    applicationTransferAcceptDefinition,
                    new TypeReference<CallsActionResponse>() {}.getType(),
                    callback);
        }
    }

    /**
     * Accept application transfer.
     * <p>
     * Accept application transfer.
     *
     * @param callId Call ID. (required)
     * @param transferId The unique identifier of a transfer, sent to the receiving application in an &#x60;ApplicationTransferRequestedEvent&#x60;. (required)
     * @return ApplicationTransferAcceptRequest
     */
    public ApplicationTransferAcceptRequest applicationTransferAccept(String callId, String transferId) {
        return new ApplicationTransferAcceptRequest(callId, transferId);
    }

    private RequestDefinition applicationTransferRejectDefinition(String callId, String transferId) {
        RequestDefinition.Builder builder = RequestDefinition.builder(
                        "POST", "/calls/1/calls/{callId}/application-transfer/{transferId}/reject")
                .requiresAuthentication(true)
                .accept("application/json");

        if (callId != null) {
            builder.addPathParameter(new Parameter("callId", callId));
        }
        if (transferId != null) {
            builder.addPathParameter(new Parameter("transferId", transferId));
        }
        return builder.build();
    }

    /**
     * applicationTransferReject request builder class.
     */
    public class ApplicationTransferRejectRequest {
        private final String callId;
        private final String transferId;

        private ApplicationTransferRejectRequest(String callId, String transferId) {
            this.callId = Objects.requireNonNull(callId, "The required parameter 'callId' is missing.");
            this.transferId = Objects.requireNonNull(transferId, "The required parameter 'transferId' is missing.");
        }

        /**
         * Executes the applicationTransferReject request.
         *
         * @return CallsActionResponse The deserialized response.
         * @throws ApiException If the API call fails or an error occurs during the request or response processing.
         */
        public CallsActionResponse execute() throws ApiException {
            RequestDefinition applicationTransferRejectDefinition =
                    applicationTransferRejectDefinition(callId, transferId);
            return apiClient.execute(
                    applicationTransferRejectDefinition, new TypeReference<CallsActionResponse>() {}.getType());
        }

        /**
         * Executes the applicationTransferReject request asynchronously.
         *
         * @param callback The {@link ApiCallback} to be invoked.
         * @return The {@link okhttp3.Call} associated with the API request.
         */
        public okhttp3.Call executeAsync(ApiCallback<CallsActionResponse> callback) {
            RequestDefinition applicationTransferRejectDefinition =
                    applicationTransferRejectDefinition(callId, transferId);
            return apiClient.executeAsync(
                    applicationTransferRejectDefinition,
                    new TypeReference<CallsActionResponse>() {}.getType(),
                    callback);
        }
    }

    /**
     * Reject application transfer.
     * <p>
     * Reject application transfer.
     *
     * @param callId Call ID. (required)
     * @param transferId The unique identifier of a transfer, sent to the receiving application in an &#x60;ApplicationTransferRequestedEvent&#x60;. (required)
     * @return ApplicationTransferRejectRequest
     */
    public ApplicationTransferRejectRequest applicationTransferReject(String callId, String transferId) {
        return new ApplicationTransferRejectRequest(callId, transferId);
    }

    private RequestDefinition callCaptureDtmfDefinition(
            String callId, CallsDtmfCaptureRequest callsDtmfCaptureRequest) {
        RequestDefinition.Builder builder = RequestDefinition.builder("POST", "/calls/1/calls/{callId}/capture/dtmf")
                .body(callsDtmfCaptureRequest)
                .requiresAuthentication(true)
                .accept("application/json")
                .contentType("application/json");

        if (callId != null) {
            builder.addPathParameter(new Parameter("callId", callId));
        }
        return builder.build();
    }

    /**
     * callCaptureDtmf request builder class.
     */
    public class CallCaptureDtmfRequest {
        private final String callId;
        private final CallsDtmfCaptureRequest callsDtmfCaptureRequest;

        private CallCaptureDtmfRequest(String callId, CallsDtmfCaptureRequest callsDtmfCaptureRequest) {
            this.callId = Objects.requireNonNull(callId, "The required parameter 'callId' is missing.");
            this.callsDtmfCaptureRequest = Objects.requireNonNull(
                    callsDtmfCaptureRequest, "The required parameter 'callsDtmfCaptureRequest' is missing.");
        }

        /**
         * Executes the callCaptureDtmf request.
         *
         * @return CallsActionResponse The deserialized response.
         * @throws ApiException If the API call fails or an error occurs during the request or response processing.
         */
        public CallsActionResponse execute() throws ApiException {
            RequestDefinition callCaptureDtmfDefinition = callCaptureDtmfDefinition(callId, callsDtmfCaptureRequest);
            return apiClient.execute(callCaptureDtmfDefinition, new TypeReference<CallsActionResponse>() {}.getType());
        }

        /**
         * Executes the callCaptureDtmf request asynchronously.
         *
         * @param callback The {@link ApiCallback} to be invoked.
         * @return The {@link okhttp3.Call} associated with the API request.
         */
        public okhttp3.Call executeAsync(ApiCallback<CallsActionResponse> callback) {
            RequestDefinition callCaptureDtmfDefinition = callCaptureDtmfDefinition(callId, callsDtmfCaptureRequest);
            return apiClient.executeAsync(
                    callCaptureDtmfDefinition, new TypeReference<CallsActionResponse>() {}.getType(), callback);
        }
    }

    /**
     * Capture DTMF.
     * <p>
     * Capture a DTMF on a call.
     *
     * @param callId Call ID. (required)
     * @param callsDtmfCaptureRequest  (required)
     * @return CallCaptureDtmfRequest
     */
    public CallCaptureDtmfRequest callCaptureDtmf(String callId, CallsDtmfCaptureRequest callsDtmfCaptureRequest) {
        return new CallCaptureDtmfRequest(callId, callsDtmfCaptureRequest);
    }

    private RequestDefinition callPlayFileDefinition(String callId, CallsPlayRequest callsPlayRequest) {
        RequestDefinition.Builder builder = RequestDefinition.builder("POST", "/calls/1/calls/{callId}/play")
                .body(callsPlayRequest)
                .requiresAuthentication(true)
                .accept("application/json")
                .contentType("application/json");

        if (callId != null) {
            builder.addPathParameter(new Parameter("callId", callId));
        }
        return builder.build();
    }

    /**
     * callPlayFile request builder class.
     */
    public class CallPlayFileRequest {
        private final String callId;
        private final CallsPlayRequest callsPlayRequest;

        private CallPlayFileRequest(String callId, CallsPlayRequest callsPlayRequest) {
            this.callId = Objects.requireNonNull(callId, "The required parameter 'callId' is missing.");
            this.callsPlayRequest =
                    Objects.requireNonNull(callsPlayRequest, "The required parameter 'callsPlayRequest' is missing.");
        }

        /**
         * Executes the callPlayFile request.
         *
         * @return CallsActionResponse The deserialized response.
         * @throws ApiException If the API call fails or an error occurs during the request or response processing.
         */
        public CallsActionResponse execute() throws ApiException {
            RequestDefinition callPlayFileDefinition = callPlayFileDefinition(callId, callsPlayRequest);
            return apiClient.execute(callPlayFileDefinition, new TypeReference<CallsActionResponse>() {}.getType());
        }

        /**
         * Executes the callPlayFile request asynchronously.
         *
         * @param callback The {@link ApiCallback} to be invoked.
         * @return The {@link okhttp3.Call} associated with the API request.
         */
        public okhttp3.Call executeAsync(ApiCallback<CallsActionResponse> callback) {
            RequestDefinition callPlayFileDefinition = callPlayFileDefinition(callId, callsPlayRequest);
            return apiClient.executeAsync(
                    callPlayFileDefinition, new TypeReference<CallsActionResponse>() {}.getType(), callback);
        }
    }

    /**
     * Play file.
     * <p>
     * Play an audio file on a call.
     *
     * @param callId Call ID. (required)
     * @param callsPlayRequest  (required)
     * @return CallPlayFileRequest
     */
    public CallPlayFileRequest callPlayFile(String callId, CallsPlayRequest callsPlayRequest) {
        return new CallPlayFileRequest(callId, callsPlayRequest);
    }

    private RequestDefinition callSayTextDefinition(String callId, CallsSayRequest callsSayRequest) {
        RequestDefinition.Builder builder = RequestDefinition.builder("POST", "/calls/1/calls/{callId}/say")
                .body(callsSayRequest)
                .requiresAuthentication(true)
                .accept("application/json")
                .contentType("application/json");

        if (callId != null) {
            builder.addPathParameter(new Parameter("callId", callId));
        }
        return builder.build();
    }

    /**
     * callSayText request builder class.
     */
    public class CallSayTextRequest {
        private final String callId;
        private final CallsSayRequest callsSayRequest;

        private CallSayTextRequest(String callId, CallsSayRequest callsSayRequest) {
            this.callId = Objects.requireNonNull(callId, "The required parameter 'callId' is missing.");
            this.callsSayRequest =
                    Objects.requireNonNull(callsSayRequest, "The required parameter 'callsSayRequest' is missing.");
        }

        /**
         * Executes the callSayText request.
         *
         * @return CallsActionResponse The deserialized response.
         * @throws ApiException If the API call fails or an error occurs during the request or response processing.
         */
        public CallsActionResponse execute() throws ApiException {
            RequestDefinition callSayTextDefinition = callSayTextDefinition(callId, callsSayRequest);
            return apiClient.execute(callSayTextDefinition, new TypeReference<CallsActionResponse>() {}.getType());
        }

        /**
         * Executes the callSayText request asynchronously.
         *
         * @param callback The {@link ApiCallback} to be invoked.
         * @return The {@link okhttp3.Call} associated with the API request.
         */
        public okhttp3.Call executeAsync(ApiCallback<CallsActionResponse> callback) {
            RequestDefinition callSayTextDefinition = callSayTextDefinition(callId, callsSayRequest);
            return apiClient.executeAsync(
                    callSayTextDefinition, new TypeReference<CallsActionResponse>() {}.getType(), callback);
        }
    }

    /**
     * Say text.
     * <p>
     * Say text on a call.
     *
     * @param callId Call ID. (required)
     * @param callsSayRequest  (required)
     * @return CallSayTextRequest
     */
    public CallSayTextRequest callSayText(String callId, CallsSayRequest callsSayRequest) {
        return new CallSayTextRequest(callId, callsSayRequest);
    }

    private RequestDefinition callSendDtmfDefinition(String callId, CallsDtmfSendRequest callsDtmfSendRequest) {
        RequestDefinition.Builder builder = RequestDefinition.builder("POST", "/calls/1/calls/{callId}/send-dtmf")
                .body(callsDtmfSendRequest)
                .requiresAuthentication(true)
                .accept("application/json")
                .contentType("application/json");

        if (callId != null) {
            builder.addPathParameter(new Parameter("callId", callId));
        }
        return builder.build();
    }

    /**
     * callSendDtmf request builder class.
     */
    public class CallSendDtmfRequest {
        private final String callId;
        private final CallsDtmfSendRequest callsDtmfSendRequest;

        private CallSendDtmfRequest(String callId, CallsDtmfSendRequest callsDtmfSendRequest) {
            this.callId = Objects.requireNonNull(callId, "The required parameter 'callId' is missing.");
            this.callsDtmfSendRequest = Objects.requireNonNull(
                    callsDtmfSendRequest, "The required parameter 'callsDtmfSendRequest' is missing.");
        }

        /**
         * Executes the callSendDtmf request.
         *
         * @return CallsActionResponse The deserialized response.
         * @throws ApiException If the API call fails or an error occurs during the request or response processing.
         */
        public CallsActionResponse execute() throws ApiException {
            RequestDefinition callSendDtmfDefinition = callSendDtmfDefinition(callId, callsDtmfSendRequest);
            return apiClient.execute(callSendDtmfDefinition, new TypeReference<CallsActionResponse>() {}.getType());
        }

        /**
         * Executes the callSendDtmf request asynchronously.
         *
         * @param callback The {@link ApiCallback} to be invoked.
         * @return The {@link okhttp3.Call} associated with the API request.
         */
        public okhttp3.Call executeAsync(ApiCallback<CallsActionResponse> callback) {
            RequestDefinition callSendDtmfDefinition = callSendDtmfDefinition(callId, callsDtmfSendRequest);
            return apiClient.executeAsync(
                    callSendDtmfDefinition, new TypeReference<CallsActionResponse>() {}.getType(), callback);
        }
    }

    /**
     * Send DTMF.
     * <p>
     * Send a DTMF on a call.
     *
     * @param callId Call ID. (required)
     * @param callsDtmfSendRequest  (required)
     * @return CallSendDtmfRequest
     */
    public CallSendDtmfRequest callSendDtmf(String callId, CallsDtmfSendRequest callsDtmfSendRequest) {
        return new CallSendDtmfRequest(callId, callsDtmfSendRequest);
    }

    private RequestDefinition callStartRecordingDefinition(
            String callId, CallsRecordingStartRequest callsRecordingStartRequest) {
        RequestDefinition.Builder builder = RequestDefinition.builder("POST", "/calls/1/calls/{callId}/start-recording")
                .body(callsRecordingStartRequest)
                .requiresAuthentication(true)
                .accept("application/json")
                .contentType("application/json");

        if (callId != null) {
            builder.addPathParameter(new Parameter("callId", callId));
        }
        return builder.build();
    }

    /**
     * callStartRecording request builder class.
     */
    public class CallStartRecordingRequest {
        private final String callId;
        private final CallsRecordingStartRequest callsRecordingStartRequest;

        private CallStartRecordingRequest(String callId, CallsRecordingStartRequest callsRecordingStartRequest) {
            this.callId = Objects.requireNonNull(callId, "The required parameter 'callId' is missing.");
            this.callsRecordingStartRequest = Objects.requireNonNull(
                    callsRecordingStartRequest, "The required parameter 'callsRecordingStartRequest' is missing.");
        }

        /**
         * Executes the callStartRecording request.
         *
         * @return CallsActionResponse The deserialized response.
         * @throws ApiException If the API call fails or an error occurs during the request or response processing.
         */
        public CallsActionResponse execute() throws ApiException {
            RequestDefinition callStartRecordingDefinition =
                    callStartRecordingDefinition(callId, callsRecordingStartRequest);
            return apiClient.execute(
                    callStartRecordingDefinition, new TypeReference<CallsActionResponse>() {}.getType());
        }

        /**
         * Executes the callStartRecording request asynchronously.
         *
         * @param callback The {@link ApiCallback} to be invoked.
         * @return The {@link okhttp3.Call} associated with the API request.
         */
        public okhttp3.Call executeAsync(ApiCallback<CallsActionResponse> callback) {
            RequestDefinition callStartRecordingDefinition =
                    callStartRecordingDefinition(callId, callsRecordingStartRequest);
            return apiClient.executeAsync(
                    callStartRecordingDefinition, new TypeReference<CallsActionResponse>() {}.getType(), callback);
        }
    }

    /**
     * Start recording.
     * <p>
     * Start a recording on a call.
     *
     * @param callId Call ID. (required)
     * @param callsRecordingStartRequest  (required)
     * @return CallStartRecordingRequest
     */
    public CallStartRecordingRequest callStartRecording(
            String callId, CallsRecordingStartRequest callsRecordingStartRequest) {
        return new CallStartRecordingRequest(callId, callsRecordingStartRequest);
    }

    private RequestDefinition callStopPlayingFileDefinition(String callId) {
        RequestDefinition.Builder builder = RequestDefinition.builder("POST", "/calls/1/calls/{callId}/stop-play")
                .requiresAuthentication(true)
                .accept("application/json");

        if (callId != null) {
            builder.addPathParameter(new Parameter("callId", callId));
        }
        return builder.build();
    }

    /**
     * callStopPlayingFile request builder class.
     */
    public class CallStopPlayingFileRequest {
        private final String callId;

        private CallStopPlayingFileRequest(String callId) {
            this.callId = Objects.requireNonNull(callId, "The required parameter 'callId' is missing.");
        }

        /**
         * Executes the callStopPlayingFile request.
         *
         * @return CallsActionResponse The deserialized response.
         * @throws ApiException If the API call fails or an error occurs during the request or response processing.
         */
        public CallsActionResponse execute() throws ApiException {
            RequestDefinition callStopPlayingFileDefinition = callStopPlayingFileDefinition(callId);
            return apiClient.execute(
                    callStopPlayingFileDefinition, new TypeReference<CallsActionResponse>() {}.getType());
        }

        /**
         * Executes the callStopPlayingFile request asynchronously.
         *
         * @param callback The {@link ApiCallback} to be invoked.
         * @return The {@link okhttp3.Call} associated with the API request.
         */
        public okhttp3.Call executeAsync(ApiCallback<CallsActionResponse> callback) {
            RequestDefinition callStopPlayingFileDefinition = callStopPlayingFileDefinition(callId);
            return apiClient.executeAsync(
                    callStopPlayingFileDefinition, new TypeReference<CallsActionResponse>() {}.getType(), callback);
        }
    }

    /**
     * Stop playing file.
     * <p>
     * Stop playing an audio file on a call.
     *
     * @param callId Call ID. (required)
     * @return CallStopPlayingFileRequest
     */
    public CallStopPlayingFileRequest callStopPlayingFile(String callId) {
        return new CallStopPlayingFileRequest(callId);
    }

    private RequestDefinition callStopRecordingDefinition(String callId) {
        RequestDefinition.Builder builder = RequestDefinition.builder("POST", "/calls/1/calls/{callId}/stop-recording")
                .requiresAuthentication(true)
                .accept("application/json");

        if (callId != null) {
            builder.addPathParameter(new Parameter("callId", callId));
        }
        return builder.build();
    }

    /**
     * callStopRecording request builder class.
     */
    public class CallStopRecordingRequest {
        private final String callId;

        private CallStopRecordingRequest(String callId) {
            this.callId = Objects.requireNonNull(callId, "The required parameter 'callId' is missing.");
        }

        /**
         * Executes the callStopRecording request.
         *
         * @return CallsActionResponse The deserialized response.
         * @throws ApiException If the API call fails or an error occurs during the request or response processing.
         */
        public CallsActionResponse execute() throws ApiException {
            RequestDefinition callStopRecordingDefinition = callStopRecordingDefinition(callId);
            return apiClient.execute(
                    callStopRecordingDefinition, new TypeReference<CallsActionResponse>() {}.getType());
        }

        /**
         * Executes the callStopRecording request asynchronously.
         *
         * @param callback The {@link ApiCallback} to be invoked.
         * @return The {@link okhttp3.Call} associated with the API request.
         */
        public okhttp3.Call executeAsync(ApiCallback<CallsActionResponse> callback) {
            RequestDefinition callStopRecordingDefinition = callStopRecordingDefinition(callId);
            return apiClient.executeAsync(
                    callStopRecordingDefinition, new TypeReference<CallsActionResponse>() {}.getType(), callback);
        }
    }

    /**
     * Stop recording.
     * <p>
     * Stop a recording on a call.
     *
     * @param callId Call ID. (required)
     * @return CallStopRecordingRequest
     */
    public CallStopRecordingRequest callStopRecording(String callId) {
        return new CallStopRecordingRequest(callId);
    }

    private RequestDefinition cancelBulkDefinition(String bulkId) {
        RequestDefinition.Builder builder = RequestDefinition.builder("POST", "/calls/1/bulks/{bulkId}/cancel")
                .requiresAuthentication(true)
                .accept("application/json");

        if (bulkId != null) {
            builder.addPathParameter(new Parameter("bulkId", bulkId));
        }
        return builder.build();
    }

    /**
     * cancelBulk request builder class.
     */
    public class CancelBulkRequest {
        private final String bulkId;

        private CancelBulkRequest(String bulkId) {
            this.bulkId = Objects.requireNonNull(bulkId, "The required parameter 'bulkId' is missing.");
        }

        /**
         * Executes the cancelBulk request.
         *
         * @return CallBulkStatus The deserialized response.
         * @throws ApiException If the API call fails or an error occurs during the request or response processing.
         */
        public CallBulkStatus execute() throws ApiException {
            RequestDefinition cancelBulkDefinition = cancelBulkDefinition(bulkId);
            return apiClient.execute(cancelBulkDefinition, new TypeReference<CallBulkStatus>() {}.getType());
        }

        /**
         * Executes the cancelBulk request asynchronously.
         *
         * @param callback The {@link ApiCallback} to be invoked.
         * @return The {@link okhttp3.Call} associated with the API request.
         */
        public okhttp3.Call executeAsync(ApiCallback<CallBulkStatus> callback) {
            RequestDefinition cancelBulkDefinition = cancelBulkDefinition(bulkId);
            return apiClient.executeAsync(
                    cancelBulkDefinition, new TypeReference<CallBulkStatus>() {}.getType(), callback);
        }
    }

    /**
     * Cancel.
     * <p>
     * Cancel a bulk.
     *
     * @param bulkId Bulk ID. (required)
     * @return CancelBulkRequest
     */
    public CancelBulkRequest cancelBulk(String bulkId) {
        return new CancelBulkRequest(bulkId);
    }

    private RequestDefinition composeConferenceRecordingDefinition(
            String conferenceId, CallsOnDemandComposition callsOnDemandComposition) {
        RequestDefinition.Builder builder = RequestDefinition.builder(
                        "POST", "/calls/1/recordings/conferences/{conferenceId}/compose")
                .body(callsOnDemandComposition)
                .requiresAuthentication(true)
                .accept("application/json")
                .contentType("application/json");

        if (conferenceId != null) {
            builder.addPathParameter(new Parameter("conferenceId", conferenceId));
        }
        return builder.build();
    }

    /**
     * composeConferenceRecording request builder class.
     */
    public class ComposeConferenceRecordingRequest {
        private final String conferenceId;
        private final CallsOnDemandComposition callsOnDemandComposition;

        private ComposeConferenceRecordingRequest(
                String conferenceId, CallsOnDemandComposition callsOnDemandComposition) {
            this.conferenceId =
                    Objects.requireNonNull(conferenceId, "The required parameter 'conferenceId' is missing.");
            this.callsOnDemandComposition = Objects.requireNonNull(
                    callsOnDemandComposition, "The required parameter 'callsOnDemandComposition' is missing.");
        }

        /**
         * Executes the composeConferenceRecording request.
         *
         * @return CallsActionResponse The deserialized response.
         * @throws ApiException If the API call fails or an error occurs during the request or response processing.
         */
        public CallsActionResponse execute() throws ApiException {
            RequestDefinition composeConferenceRecordingDefinition =
                    composeConferenceRecordingDefinition(conferenceId, callsOnDemandComposition);
            return apiClient.execute(
                    composeConferenceRecordingDefinition, new TypeReference<CallsActionResponse>() {}.getType());
        }

        /**
         * Executes the composeConferenceRecording request asynchronously.
         *
         * @param callback The {@link ApiCallback} to be invoked.
         * @return The {@link okhttp3.Call} associated with the API request.
         */
        public okhttp3.Call executeAsync(ApiCallback<CallsActionResponse> callback) {
            RequestDefinition composeConferenceRecordingDefinition =
                    composeConferenceRecordingDefinition(conferenceId, callsOnDemandComposition);
            return apiClient.executeAsync(
                    composeConferenceRecordingDefinition,
                    new TypeReference<CallsActionResponse>() {}.getType(),
                    callback);
        }
    }

    /**
     * Compose conference recording on calls.
     * <p>
     * Compose conference recording on calls. All calls will be merged into a single audio or video file.
     *
     * @param conferenceId Conference ID. (required)
     * @param callsOnDemandComposition  (required)
     * @return ComposeConferenceRecordingRequest
     */
    public ComposeConferenceRecordingRequest composeConferenceRecording(
            String conferenceId, CallsOnDemandComposition callsOnDemandComposition) {
        return new ComposeConferenceRecordingRequest(conferenceId, callsOnDemandComposition);
    }

    private RequestDefinition composeDialogRecordingDefinition(
            String dialogId, CallsOnDemandComposition callsOnDemandComposition) {
        RequestDefinition.Builder builder = RequestDefinition.builder(
                        "POST", "/calls/1/recordings/dialogs/{dialogId}/compose")
                .body(callsOnDemandComposition)
                .requiresAuthentication(true)
                .accept("application/json")
                .contentType("application/json");

        if (dialogId != null) {
            builder.addPathParameter(new Parameter("dialogId", dialogId));
        }
        return builder.build();
    }

    /**
     * composeDialogRecording request builder class.
     */
    public class ComposeDialogRecordingRequest {
        private final String dialogId;
        private final CallsOnDemandComposition callsOnDemandComposition;

        private ComposeDialogRecordingRequest(String dialogId, CallsOnDemandComposition callsOnDemandComposition) {
            this.dialogId = Objects.requireNonNull(dialogId, "The required parameter 'dialogId' is missing.");
            this.callsOnDemandComposition = Objects.requireNonNull(
                    callsOnDemandComposition, "The required parameter 'callsOnDemandComposition' is missing.");
        }

        /**
         * Executes the composeDialogRecording request.
         *
         * @return CallsActionResponse The deserialized response.
         * @throws ApiException If the API call fails or an error occurs during the request or response processing.
         */
        public CallsActionResponse execute() throws ApiException {
            RequestDefinition composeDialogRecordingDefinition =
                    composeDialogRecordingDefinition(dialogId, callsOnDemandComposition);
            return apiClient.execute(
                    composeDialogRecordingDefinition, new TypeReference<CallsActionResponse>() {}.getType());
        }

        /**
         * Executes the composeDialogRecording request asynchronously.
         *
         * @param callback The {@link ApiCallback} to be invoked.
         * @return The {@link okhttp3.Call} associated with the API request.
         */
        public okhttp3.Call executeAsync(ApiCallback<CallsActionResponse> callback) {
            RequestDefinition composeDialogRecordingDefinition =
                    composeDialogRecordingDefinition(dialogId, callsOnDemandComposition);
            return apiClient.executeAsync(
                    composeDialogRecordingDefinition, new TypeReference<CallsActionResponse>() {}.getType(), callback);
        }
    }

    /**
     * Compose dialog recording on calls.
     * <p>
     * Compose dialog recording on calls. Both calls will be merged into a single audio or video file.
     *
     * @param dialogId Dialog ID. (required)
     * @param callsOnDemandComposition  (required)
     * @return ComposeDialogRecordingRequest
     */
    public ComposeDialogRecordingRequest composeDialogRecording(
            String dialogId, CallsOnDemandComposition callsOnDemandComposition) {
        return new ComposeDialogRecordingRequest(dialogId, callsOnDemandComposition);
    }

    private RequestDefinition conferencePlayFileDefinition(String conferenceId, CallsPlayRequest callsPlayRequest) {
        RequestDefinition.Builder builder = RequestDefinition.builder(
                        "POST", "/calls/1/conferences/{conferenceId}/play")
                .body(callsPlayRequest)
                .requiresAuthentication(true)
                .accept("application/json")
                .contentType("application/json");

        if (conferenceId != null) {
            builder.addPathParameter(new Parameter("conferenceId", conferenceId));
        }
        return builder.build();
    }

    /**
     * conferencePlayFile request builder class.
     */
    public class ConferencePlayFileRequest {
        private final String conferenceId;
        private final CallsPlayRequest callsPlayRequest;

        private ConferencePlayFileRequest(String conferenceId, CallsPlayRequest callsPlayRequest) {
            this.conferenceId =
                    Objects.requireNonNull(conferenceId, "The required parameter 'conferenceId' is missing.");
            this.callsPlayRequest =
                    Objects.requireNonNull(callsPlayRequest, "The required parameter 'callsPlayRequest' is missing.");
        }

        /**
         * Executes the conferencePlayFile request.
         *
         * @return CallsActionResponse The deserialized response.
         * @throws ApiException If the API call fails or an error occurs during the request or response processing.
         */
        public CallsActionResponse execute() throws ApiException {
            RequestDefinition conferencePlayFileDefinition =
                    conferencePlayFileDefinition(conferenceId, callsPlayRequest);
            return apiClient.execute(
                    conferencePlayFileDefinition, new TypeReference<CallsActionResponse>() {}.getType());
        }

        /**
         * Executes the conferencePlayFile request asynchronously.
         *
         * @param callback The {@link ApiCallback} to be invoked.
         * @return The {@link okhttp3.Call} associated with the API request.
         */
        public okhttp3.Call executeAsync(ApiCallback<CallsActionResponse> callback) {
            RequestDefinition conferencePlayFileDefinition =
                    conferencePlayFileDefinition(conferenceId, callsPlayRequest);
            return apiClient.executeAsync(
                    conferencePlayFileDefinition, new TypeReference<CallsActionResponse>() {}.getType(), callback);
        }
    }

    /**
     * Play file.
     * <p>
     * Play an audio file on a conference.
     *
     * @param conferenceId Conference ID. (required)
     * @param callsPlayRequest  (required)
     * @return ConferencePlayFileRequest
     */
    public ConferencePlayFileRequest conferencePlayFile(String conferenceId, CallsPlayRequest callsPlayRequest) {
        return new ConferencePlayFileRequest(conferenceId, callsPlayRequest);
    }

    private RequestDefinition conferenceSayTextDefinition(String conferenceId, CallsSayRequest callsSayRequest) {
        RequestDefinition.Builder builder = RequestDefinition.builder("POST", "/calls/1/conferences/{conferenceId}/say")
                .body(callsSayRequest)
                .requiresAuthentication(true)
                .accept("application/json")
                .contentType("application/json");

        if (conferenceId != null) {
            builder.addPathParameter(new Parameter("conferenceId", conferenceId));
        }
        return builder.build();
    }

    /**
     * conferenceSayText request builder class.
     */
    public class ConferenceSayTextRequest {
        private final String conferenceId;
        private final CallsSayRequest callsSayRequest;

        private ConferenceSayTextRequest(String conferenceId, CallsSayRequest callsSayRequest) {
            this.conferenceId =
                    Objects.requireNonNull(conferenceId, "The required parameter 'conferenceId' is missing.");
            this.callsSayRequest =
                    Objects.requireNonNull(callsSayRequest, "The required parameter 'callsSayRequest' is missing.");
        }

        /**
         * Executes the conferenceSayText request.
         *
         * @return CallsActionResponse The deserialized response.
         * @throws ApiException If the API call fails or an error occurs during the request or response processing.
         */
        public CallsActionResponse execute() throws ApiException {
            RequestDefinition conferenceSayTextDefinition = conferenceSayTextDefinition(conferenceId, callsSayRequest);
            return apiClient.execute(
                    conferenceSayTextDefinition, new TypeReference<CallsActionResponse>() {}.getType());
        }

        /**
         * Executes the conferenceSayText request asynchronously.
         *
         * @param callback The {@link ApiCallback} to be invoked.
         * @return The {@link okhttp3.Call} associated with the API request.
         */
        public okhttp3.Call executeAsync(ApiCallback<CallsActionResponse> callback) {
            RequestDefinition conferenceSayTextDefinition = conferenceSayTextDefinition(conferenceId, callsSayRequest);
            return apiClient.executeAsync(
                    conferenceSayTextDefinition, new TypeReference<CallsActionResponse>() {}.getType(), callback);
        }
    }

    /**
     * Say text.
     * <p>
     * Say text on a conference.
     *
     * @param conferenceId Conference ID. (required)
     * @param callsSayRequest  (required)
     * @return ConferenceSayTextRequest
     */
    public ConferenceSayTextRequest conferenceSayText(String conferenceId, CallsSayRequest callsSayRequest) {
        return new ConferenceSayTextRequest(conferenceId, callsSayRequest);
    }

    private RequestDefinition conferenceStartRecordingDefinition(
            String conferenceId, CallsStartRecordingRequest callsStartRecordingRequest) {
        RequestDefinition.Builder builder = RequestDefinition.builder(
                        "POST", "/calls/1/conferences/{conferenceId}/start-recording")
                .body(callsStartRecordingRequest)
                .requiresAuthentication(true)
                .accept("application/json")
                .contentType("application/json");

        if (conferenceId != null) {
            builder.addPathParameter(new Parameter("conferenceId", conferenceId));
        }
        return builder.build();
    }

    /**
     * conferenceStartRecording request builder class.
     */
    public class ConferenceStartRecordingRequest {
        private final String conferenceId;
        private final CallsStartRecordingRequest callsStartRecordingRequest;

        private ConferenceStartRecordingRequest(
                String conferenceId, CallsStartRecordingRequest callsStartRecordingRequest) {
            this.conferenceId =
                    Objects.requireNonNull(conferenceId, "The required parameter 'conferenceId' is missing.");
            this.callsStartRecordingRequest = Objects.requireNonNull(
                    callsStartRecordingRequest, "The required parameter 'callsStartRecordingRequest' is missing.");
        }

        /**
         * Executes the conferenceStartRecording request.
         *
         * @return CallsActionResponse The deserialized response.
         * @throws ApiException If the API call fails or an error occurs during the request or response processing.
         */
        public CallsActionResponse execute() throws ApiException {
            RequestDefinition conferenceStartRecordingDefinition =
                    conferenceStartRecordingDefinition(conferenceId, callsStartRecordingRequest);
            return apiClient.execute(
                    conferenceStartRecordingDefinition, new TypeReference<CallsActionResponse>() {}.getType());
        }

        /**
         * Executes the conferenceStartRecording request asynchronously.
         *
         * @param callback The {@link ApiCallback} to be invoked.
         * @return The {@link okhttp3.Call} associated with the API request.
         */
        public okhttp3.Call executeAsync(ApiCallback<CallsActionResponse> callback) {
            RequestDefinition conferenceStartRecordingDefinition =
                    conferenceStartRecordingDefinition(conferenceId, callsStartRecordingRequest);
            return apiClient.executeAsync(
                    conferenceStartRecordingDefinition,
                    new TypeReference<CallsActionResponse>() {}.getType(),
                    callback);
        }
    }

    /**
     * Start recording.
     * <p>
     * Start recording a conference.
     *
     * @param conferenceId Conference ID. (required)
     * @param callsStartRecordingRequest  (required)
     * @return ConferenceStartRecordingRequest
     */
    public ConferenceStartRecordingRequest conferenceStartRecording(
            String conferenceId, CallsStartRecordingRequest callsStartRecordingRequest) {
        return new ConferenceStartRecordingRequest(conferenceId, callsStartRecordingRequest);
    }

    private RequestDefinition conferenceStopPlayingFileDefinition(String conferenceId) {
        RequestDefinition.Builder builder = RequestDefinition.builder(
                        "POST", "/calls/1/conferences/{conferenceId}/stop-play")
                .requiresAuthentication(true)
                .accept("application/json");

        if (conferenceId != null) {
            builder.addPathParameter(new Parameter("conferenceId", conferenceId));
        }
        return builder.build();
    }

    /**
     * conferenceStopPlayingFile request builder class.
     */
    public class ConferenceStopPlayingFileRequest {
        private final String conferenceId;

        private ConferenceStopPlayingFileRequest(String conferenceId) {
            this.conferenceId =
                    Objects.requireNonNull(conferenceId, "The required parameter 'conferenceId' is missing.");
        }

        /**
         * Executes the conferenceStopPlayingFile request.
         *
         * @return CallsActionResponse The deserialized response.
         * @throws ApiException If the API call fails or an error occurs during the request or response processing.
         */
        public CallsActionResponse execute() throws ApiException {
            RequestDefinition conferenceStopPlayingFileDefinition = conferenceStopPlayingFileDefinition(conferenceId);
            return apiClient.execute(
                    conferenceStopPlayingFileDefinition, new TypeReference<CallsActionResponse>() {}.getType());
        }

        /**
         * Executes the conferenceStopPlayingFile request asynchronously.
         *
         * @param callback The {@link ApiCallback} to be invoked.
         * @return The {@link okhttp3.Call} associated with the API request.
         */
        public okhttp3.Call executeAsync(ApiCallback<CallsActionResponse> callback) {
            RequestDefinition conferenceStopPlayingFileDefinition = conferenceStopPlayingFileDefinition(conferenceId);
            return apiClient.executeAsync(
                    conferenceStopPlayingFileDefinition,
                    new TypeReference<CallsActionResponse>() {}.getType(),
                    callback);
        }
    }

    /**
     * Stop playing file.
     * <p>
     * Stop playing an audio file on a conference.
     *
     * @param conferenceId Conference ID. (required)
     * @return ConferenceStopPlayingFileRequest
     */
    public ConferenceStopPlayingFileRequest conferenceStopPlayingFile(String conferenceId) {
        return new ConferenceStopPlayingFileRequest(conferenceId);
    }

    private RequestDefinition conferenceStopRecordingDefinition(String conferenceId) {
        RequestDefinition.Builder builder = RequestDefinition.builder(
                        "POST", "/calls/1/conferences/{conferenceId}/stop-recording")
                .requiresAuthentication(true)
                .accept("application/json");

        if (conferenceId != null) {
            builder.addPathParameter(new Parameter("conferenceId", conferenceId));
        }
        return builder.build();
    }

    /**
     * conferenceStopRecording request builder class.
     */
    public class ConferenceStopRecordingRequest {
        private final String conferenceId;

        private ConferenceStopRecordingRequest(String conferenceId) {
            this.conferenceId =
                    Objects.requireNonNull(conferenceId, "The required parameter 'conferenceId' is missing.");
        }

        /**
         * Executes the conferenceStopRecording request.
         *
         * @return CallsActionResponse The deserialized response.
         * @throws ApiException If the API call fails or an error occurs during the request or response processing.
         */
        public CallsActionResponse execute() throws ApiException {
            RequestDefinition conferenceStopRecordingDefinition = conferenceStopRecordingDefinition(conferenceId);
            return apiClient.execute(
                    conferenceStopRecordingDefinition, new TypeReference<CallsActionResponse>() {}.getType());
        }

        /**
         * Executes the conferenceStopRecording request asynchronously.
         *
         * @param callback The {@link ApiCallback} to be invoked.
         * @return The {@link okhttp3.Call} associated with the API request.
         */
        public okhttp3.Call executeAsync(ApiCallback<CallsActionResponse> callback) {
            RequestDefinition conferenceStopRecordingDefinition = conferenceStopRecordingDefinition(conferenceId);
            return apiClient.executeAsync(
                    conferenceStopRecordingDefinition, new TypeReference<CallsActionResponse>() {}.getType(), callback);
        }
    }

    /**
     * Stop recording.
     * <p>
     * Stop recording a conference.
     *
     * @param conferenceId Conference ID. (required)
     * @return ConferenceStopRecordingRequest
     */
    public ConferenceStopRecordingRequest conferenceStopRecording(String conferenceId) {
        return new ConferenceStopRecordingRequest(conferenceId);
    }

    private RequestDefinition connectCallsDefinition(CallsConnectRequest callsConnectRequest) {
        RequestDefinition.Builder builder = RequestDefinition.builder("POST", "/calls/1/connect")
                .body(callsConnectRequest)
                .requiresAuthentication(true)
                .accept("application/json")
                .contentType("application/json");

        return builder.build();
    }

    /**
     * connectCalls request builder class.
     */
    public class ConnectCallsRequest {
        private final CallsConnectRequest callsConnectRequest;

        private ConnectCallsRequest(CallsConnectRequest callsConnectRequest) {
            this.callsConnectRequest = Objects.requireNonNull(
                    callsConnectRequest, "The required parameter 'callsConnectRequest' is missing.");
        }

        /**
         * Executes the connectCalls request.
         *
         * @return CallsConference The deserialized response.
         * @throws ApiException If the API call fails or an error occurs during the request or response processing.
         */
        public CallsConference execute() throws ApiException {
            RequestDefinition connectCallsDefinition = connectCallsDefinition(callsConnectRequest);
            return apiClient.execute(connectCallsDefinition, new TypeReference<CallsConference>() {}.getType());
        }

        /**
         * Executes the connectCalls request asynchronously.
         *
         * @param callback The {@link ApiCallback} to be invoked.
         * @return The {@link okhttp3.Call} associated with the API request.
         */
        public okhttp3.Call executeAsync(ApiCallback<CallsConference> callback) {
            RequestDefinition connectCallsDefinition = connectCallsDefinition(callsConnectRequest);
            return apiClient.executeAsync(
                    connectCallsDefinition, new TypeReference<CallsConference>() {}.getType(), callback);
        }
    }

    /**
     * Connect calls.
     * <p>
     * Connect calls in a conference.
     *
     * @param callsConnectRequest  (required)
     * @return ConnectCallsRequest
     */
    public ConnectCallsRequest connectCalls(CallsConnectRequest callsConnectRequest) {
        return new ConnectCallsRequest(callsConnectRequest);
    }

    private RequestDefinition connectWithNewCallDefinition(
            String callId, CallsConnectWithNewCallRequest callsConnectWithNewCallRequest) {
        RequestDefinition.Builder builder = RequestDefinition.builder("POST", "/calls/1/calls/{callId}/connect")
                .body(callsConnectWithNewCallRequest)
                .requiresAuthentication(true)
                .accept("application/json")
                .contentType("application/json");

        if (callId != null) {
            builder.addPathParameter(new Parameter("callId", callId));
        }
        return builder.build();
    }

    /**
     * connectWithNewCall request builder class.
     */
    public class ConnectWithNewCallRequest {
        private final String callId;
        private final CallsConnectWithNewCallRequest callsConnectWithNewCallRequest;

        private ConnectWithNewCallRequest(
                String callId, CallsConnectWithNewCallRequest callsConnectWithNewCallRequest) {
            this.callId = Objects.requireNonNull(callId, "The required parameter 'callId' is missing.");
            this.callsConnectWithNewCallRequest = Objects.requireNonNull(
                    callsConnectWithNewCallRequest,
                    "The required parameter 'callsConnectWithNewCallRequest' is missing.");
        }

        /**
         * Executes the connectWithNewCall request.
         *
         * @return CallsConferenceAndCall The deserialized response.
         * @throws ApiException If the API call fails or an error occurs during the request or response processing.
         */
        public CallsConferenceAndCall execute() throws ApiException {
            RequestDefinition connectWithNewCallDefinition =
                    connectWithNewCallDefinition(callId, callsConnectWithNewCallRequest);
            return apiClient.execute(
                    connectWithNewCallDefinition, new TypeReference<CallsConferenceAndCall>() {}.getType());
        }

        /**
         * Executes the connectWithNewCall request asynchronously.
         *
         * @param callback The {@link ApiCallback} to be invoked.
         * @return The {@link okhttp3.Call} associated with the API request.
         */
        public okhttp3.Call executeAsync(ApiCallback<CallsConferenceAndCall> callback) {
            RequestDefinition connectWithNewCallDefinition =
                    connectWithNewCallDefinition(callId, callsConnectWithNewCallRequest);
            return apiClient.executeAsync(
                    connectWithNewCallDefinition, new TypeReference<CallsConferenceAndCall>() {}.getType(), callback);
        }
    }

    /**
     * Connect with new call.
     * <p>
     * Connect an existing call with a new call in a conference.
     *
     * @param callId Call ID. (required)
     * @param callsConnectWithNewCallRequest  (required)
     * @return ConnectWithNewCallRequest
     */
    public ConnectWithNewCallRequest connectWithNewCall(
            String callId, CallsConnectWithNewCallRequest callsConnectWithNewCallRequest) {
        return new ConnectWithNewCallRequest(callId, callsConnectWithNewCallRequest);
    }

    private RequestDefinition createBulkDefinition(CallBulkRequest callBulkRequest) {
        RequestDefinition.Builder builder = RequestDefinition.builder("POST", "/calls/1/bulks")
                .body(callBulkRequest)
                .requiresAuthentication(true)
                .accept("application/json")
                .contentType("application/json");

        return builder.build();
    }

    /**
     * createBulk request builder class.
     */
    public class CreateBulkRequest {
        private final CallBulkRequest callBulkRequest;

        private CreateBulkRequest(CallBulkRequest callBulkRequest) {
            this.callBulkRequest =
                    Objects.requireNonNull(callBulkRequest, "The required parameter 'callBulkRequest' is missing.");
        }

        /**
         * Executes the createBulk request.
         *
         * @return CallBulkResponse The deserialized response.
         * @throws ApiException If the API call fails or an error occurs during the request or response processing.
         */
        public CallBulkResponse execute() throws ApiException {
            RequestDefinition createBulkDefinition = createBulkDefinition(callBulkRequest);
            return apiClient.execute(createBulkDefinition, new TypeReference<CallBulkResponse>() {}.getType());
        }

        /**
         * Executes the createBulk request asynchronously.
         *
         * @param callback The {@link ApiCallback} to be invoked.
         * @return The {@link okhttp3.Call} associated with the API request.
         */
        public okhttp3.Call executeAsync(ApiCallback<CallBulkResponse> callback) {
            RequestDefinition createBulkDefinition = createBulkDefinition(callBulkRequest);
            return apiClient.executeAsync(
                    createBulkDefinition, new TypeReference<CallBulkResponse>() {}.getType(), callback);
        }
    }

    /**
     * Create bulk of calls.
     * <p>
     * Create a bulk of an outbound calls. Currently, only &#x60;PHONE&#x60; endpoints are supported.
     *
     * @param callBulkRequest  (required)
     * @return CreateBulkRequest
     */
    public CreateBulkRequest createBulk(CallBulkRequest callBulkRequest) {
        return new CreateBulkRequest(callBulkRequest);
    }

    private RequestDefinition createCallDefinition(CallRequest callRequest) {
        RequestDefinition.Builder builder = RequestDefinition.builder("POST", "/calls/1/calls")
                .body(callRequest)
                .requiresAuthentication(true)
                .accept("application/json")
                .contentType("application/json");

        return builder.build();
    }

    /**
     * createCall request builder class.
     */
    public class CreateCallRequest {
        private final CallRequest callRequest;

        private CreateCallRequest(CallRequest callRequest) {
            this.callRequest = Objects.requireNonNull(callRequest, "The required parameter 'callRequest' is missing.");
        }

        /**
         * Executes the createCall request.
         *
         * @return Call The deserialized response.
         * @throws ApiException If the API call fails or an error occurs during the request or response processing.
         */
        public Call execute() throws ApiException {
            RequestDefinition createCallDefinition = createCallDefinition(callRequest);
            return apiClient.execute(createCallDefinition, new TypeReference<Call>() {}.getType());
        }

        /**
         * Executes the createCall request asynchronously.
         *
         * @param callback The {@link ApiCallback} to be invoked.
         * @return The {@link okhttp3.Call} associated with the API request.
         */
        public okhttp3.Call executeAsync(ApiCallback<Call> callback) {
            RequestDefinition createCallDefinition = createCallDefinition(callRequest);
            return apiClient.executeAsync(createCallDefinition, new TypeReference<Call>() {}.getType(), callback);
        }
    }

    /**
     * Create call.
     * <p>
     * Create an outbound call to a given endpoint.
     *
     * @param callRequest  (required)
     * @return CreateCallRequest
     */
    public CreateCallRequest createCall(CallRequest callRequest) {
        return new CreateCallRequest(callRequest);
    }

    private RequestDefinition createConferenceDefinition(CallsConferenceRequest callsConferenceRequest) {
        RequestDefinition.Builder builder = RequestDefinition.builder("POST", "/calls/1/conferences")
                .body(callsConferenceRequest)
                .requiresAuthentication(true)
                .accept("application/json")
                .contentType("application/json");

        return builder.build();
    }

    /**
     * createConference request builder class.
     */
    public class CreateConferenceRequest {
        private final CallsConferenceRequest callsConferenceRequest;

        private CreateConferenceRequest(CallsConferenceRequest callsConferenceRequest) {
            this.callsConferenceRequest = Objects.requireNonNull(
                    callsConferenceRequest, "The required parameter 'callsConferenceRequest' is missing.");
        }

        /**
         * Executes the createConference request.
         *
         * @return CallsConference The deserialized response.
         * @throws ApiException If the API call fails or an error occurs during the request or response processing.
         */
        public CallsConference execute() throws ApiException {
            RequestDefinition createConferenceDefinition = createConferenceDefinition(callsConferenceRequest);
            return apiClient.execute(createConferenceDefinition, new TypeReference<CallsConference>() {}.getType());
        }

        /**
         * Executes the createConference request asynchronously.
         *
         * @param callback The {@link ApiCallback} to be invoked.
         * @return The {@link okhttp3.Call} associated with the API request.
         */
        public okhttp3.Call executeAsync(ApiCallback<CallsConference> callback) {
            RequestDefinition createConferenceDefinition = createConferenceDefinition(callsConferenceRequest);
            return apiClient.executeAsync(
                    createConferenceDefinition, new TypeReference<CallsConference>() {}.getType(), callback);
        }
    }

    /**
     * Create conference.
     * <p>
     * Create a conference.
     *
     * @param callsConferenceRequest  (required)
     * @return CreateConferenceRequest
     */
    public CreateConferenceRequest createConference(CallsConferenceRequest callsConferenceRequest) {
        return new CreateConferenceRequest(callsConferenceRequest);
    }

    private RequestDefinition createDialogDefinition(CallsDialogRequest callsDialogRequest) {
        RequestDefinition.Builder builder = RequestDefinition.builder("POST", "/calls/1/dialogs")
                .body(callsDialogRequest)
                .requiresAuthentication(true)
                .accept("application/json")
                .contentType("application/json");

        return builder.build();
    }

    /**
     * createDialog request builder class.
     */
    public class CreateDialogRequest {
        private final CallsDialogRequest callsDialogRequest;

        private CreateDialogRequest(CallsDialogRequest callsDialogRequest) {
            this.callsDialogRequest = Objects.requireNonNull(
                    callsDialogRequest, "The required parameter 'callsDialogRequest' is missing.");
        }

        /**
         * Executes the createDialog request.
         *
         * @return CallsDialogResponse The deserialized response.
         * @throws ApiException If the API call fails or an error occurs during the request or response processing.
         */
        public CallsDialogResponse execute() throws ApiException {
            RequestDefinition createDialogDefinition = createDialogDefinition(callsDialogRequest);
            return apiClient.execute(createDialogDefinition, new TypeReference<CallsDialogResponse>() {}.getType());
        }

        /**
         * Executes the createDialog request asynchronously.
         *
         * @param callback The {@link ApiCallback} to be invoked.
         * @return The {@link okhttp3.Call} associated with the API request.
         */
        public okhttp3.Call executeAsync(ApiCallback<CallsDialogResponse> callback) {
            RequestDefinition createDialogDefinition = createDialogDefinition(callsDialogRequest);
            return apiClient.executeAsync(
                    createDialogDefinition, new TypeReference<CallsDialogResponse>() {}.getType(), callback);
        }
    }

    /**
     * Create dialog.
     * <p>
     * Create a dialog.
     *
     * @param callsDialogRequest  (required)
     * @return CreateDialogRequest
     */
    public CreateDialogRequest createDialog(CallsDialogRequest callsDialogRequest) {
        return new CreateDialogRequest(callsDialogRequest);
    }

    private RequestDefinition createMediaStreamConfigDefinition(
            CallsMediaStreamConfigRequest callsMediaStreamConfigRequest) {
        RequestDefinition.Builder builder = RequestDefinition.builder("POST", "/calls/1/media-stream-configs")
                .body(callsMediaStreamConfigRequest)
                .requiresAuthentication(true)
                .accept("application/json")
                .contentType("application/json");

        return builder.build();
    }

    /**
     * createMediaStreamConfig request builder class.
     */
    public class CreateMediaStreamConfigRequest {
        private final CallsMediaStreamConfigRequest callsMediaStreamConfigRequest;

        private CreateMediaStreamConfigRequest(CallsMediaStreamConfigRequest callsMediaStreamConfigRequest) {
            this.callsMediaStreamConfigRequest = Objects.requireNonNull(
                    callsMediaStreamConfigRequest,
                    "The required parameter 'callsMediaStreamConfigRequest' is missing.");
        }

        /**
         * Executes the createMediaStreamConfig request.
         *
         * @return CallsMediaStreamConfigResponse The deserialized response.
         * @throws ApiException If the API call fails or an error occurs during the request or response processing.
         */
        public CallsMediaStreamConfigResponse execute() throws ApiException {
            RequestDefinition createMediaStreamConfigDefinition =
                    createMediaStreamConfigDefinition(callsMediaStreamConfigRequest);
            return apiClient.execute(
                    createMediaStreamConfigDefinition,
                    new TypeReference<CallsMediaStreamConfigResponse>() {}.getType());
        }

        /**
         * Executes the createMediaStreamConfig request asynchronously.
         *
         * @param callback The {@link ApiCallback} to be invoked.
         * @return The {@link okhttp3.Call} associated with the API request.
         */
        public okhttp3.Call executeAsync(ApiCallback<CallsMediaStreamConfigResponse> callback) {
            RequestDefinition createMediaStreamConfigDefinition =
                    createMediaStreamConfigDefinition(callsMediaStreamConfigRequest);
            return apiClient.executeAsync(
                    createMediaStreamConfigDefinition,
                    new TypeReference<CallsMediaStreamConfigResponse>() {}.getType(),
                    callback);
        }
    }

    /**
     * Create a media-stream configuration.
     * <p>
     * Create a media-stream configuration.
     *
     * @param callsMediaStreamConfigRequest  (required)
     * @return CreateMediaStreamConfigRequest
     */
    public CreateMediaStreamConfigRequest createMediaStreamConfig(
            CallsMediaStreamConfigRequest callsMediaStreamConfigRequest) {
        return new CreateMediaStreamConfigRequest(callsMediaStreamConfigRequest);
    }

    private RequestDefinition deleteCallRecordingsDefinition(String callId) {
        RequestDefinition.Builder builder = RequestDefinition.builder("DELETE", "/calls/1/recordings/calls/{callId}")
                .requiresAuthentication(true)
                .accept("application/json");

        if (callId != null) {
            builder.addPathParameter(new Parameter("callId", callId));
        }
        return builder.build();
    }

    /**
     * deleteCallRecordings request builder class.
     */
    public class DeleteCallRecordingsRequest {
        private final String callId;

        private DeleteCallRecordingsRequest(String callId) {
            this.callId = Objects.requireNonNull(callId, "The required parameter 'callId' is missing.");
        }

        /**
         * Executes the deleteCallRecordings request.
         *
         * @return CallRecording The deserialized response.
         * @throws ApiException If the API call fails or an error occurs during the request or response processing.
         */
        public CallRecording execute() throws ApiException {
            RequestDefinition deleteCallRecordingsDefinition = deleteCallRecordingsDefinition(callId);
            return apiClient.execute(deleteCallRecordingsDefinition, new TypeReference<CallRecording>() {}.getType());
        }

        /**
         * Executes the deleteCallRecordings request asynchronously.
         *
         * @param callback The {@link ApiCallback} to be invoked.
         * @return The {@link okhttp3.Call} associated with the API request.
         */
        public okhttp3.Call executeAsync(ApiCallback<CallRecording> callback) {
            RequestDefinition deleteCallRecordingsDefinition = deleteCallRecordingsDefinition(callId);
            return apiClient.executeAsync(
                    deleteCallRecordingsDefinition, new TypeReference<CallRecording>() {}.getType(), callback);
        }
    }

    /**
     * Delete call recordings.
     * <p>
     * Delete the recordings for a single call.
     *
     * @param callId Call ID. (required)
     * @return DeleteCallRecordingsRequest
     */
    public DeleteCallRecordingsRequest deleteCallRecordings(String callId) {
        return new DeleteCallRecordingsRequest(callId);
    }

    private RequestDefinition deleteCallsFileDefinition(String fileId) {
        RequestDefinition.Builder builder = RequestDefinition.builder("DELETE", "/calls/1/files/{fileId}")
                .requiresAuthentication(true)
                .accept("application/json");

        if (fileId != null) {
            builder.addPathParameter(new Parameter("fileId", fileId));
        }
        return builder.build();
    }

    /**
     * deleteCallsFile request builder class.
     */
    public class DeleteCallsFileRequest {
        private final String fileId;

        private DeleteCallsFileRequest(String fileId) {
            this.fileId = Objects.requireNonNull(fileId, "The required parameter 'fileId' is missing.");
        }

        /**
         * Executes the deleteCallsFile request.
         *
         * @return CallsFile The deserialized response.
         * @throws ApiException If the API call fails or an error occurs during the request or response processing.
         */
        public CallsFile execute() throws ApiException {
            RequestDefinition deleteCallsFileDefinition = deleteCallsFileDefinition(fileId);
            return apiClient.execute(deleteCallsFileDefinition, new TypeReference<CallsFile>() {}.getType());
        }

        /**
         * Executes the deleteCallsFile request asynchronously.
         *
         * @param callback The {@link ApiCallback} to be invoked.
         * @return The {@link okhttp3.Call} associated with the API request.
         */
        public okhttp3.Call executeAsync(ApiCallback<CallsFile> callback) {
            RequestDefinition deleteCallsFileDefinition = deleteCallsFileDefinition(fileId);
            return apiClient.executeAsync(
                    deleteCallsFileDefinition, new TypeReference<CallsFile>() {}.getType(), callback);
        }
    }

    /**
     * Delete file.
     * <p>
     * Delete a file.
     *
     * @param fileId File ID. (required)
     * @return DeleteCallsFileRequest
     */
    public DeleteCallsFileRequest deleteCallsFile(String fileId) {
        return new DeleteCallsFileRequest(fileId);
    }

    private RequestDefinition deleteConferenceRecordingsDefinition(String conferenceId) {
        RequestDefinition.Builder builder = RequestDefinition.builder(
                        "DELETE", "/calls/1/recordings/conferences/{conferenceId}")
                .requiresAuthentication(true)
                .accept("application/json");

        if (conferenceId != null) {
            builder.addPathParameter(new Parameter("conferenceId", conferenceId));
        }
        return builder.build();
    }

    /**
     * deleteConferenceRecordings request builder class.
     */
    public class DeleteConferenceRecordingsRequest {
        private final String conferenceId;

        private DeleteConferenceRecordingsRequest(String conferenceId) {
            this.conferenceId =
                    Objects.requireNonNull(conferenceId, "The required parameter 'conferenceId' is missing.");
        }

        /**
         * Executes the deleteConferenceRecordings request.
         *
         * @return CallsConferenceRecording The deserialized response.
         * @throws ApiException If the API call fails or an error occurs during the request or response processing.
         */
        public CallsConferenceRecording execute() throws ApiException {
            RequestDefinition deleteConferenceRecordingsDefinition = deleteConferenceRecordingsDefinition(conferenceId);
            return apiClient.execute(
                    deleteConferenceRecordingsDefinition, new TypeReference<CallsConferenceRecording>() {}.getType());
        }

        /**
         * Executes the deleteConferenceRecordings request asynchronously.
         *
         * @param callback The {@link ApiCallback} to be invoked.
         * @return The {@link okhttp3.Call} associated with the API request.
         */
        public okhttp3.Call executeAsync(ApiCallback<CallsConferenceRecording> callback) {
            RequestDefinition deleteConferenceRecordingsDefinition = deleteConferenceRecordingsDefinition(conferenceId);
            return apiClient.executeAsync(
                    deleteConferenceRecordingsDefinition,
                    new TypeReference<CallsConferenceRecording>() {}.getType(),
                    callback);
        }
    }

    /**
     * Delete conference recordings.
     * <p>
     * Delete the recordings for a single conference.
     *
     * @param conferenceId Conference ID. (required)
     * @return DeleteConferenceRecordingsRequest
     */
    public DeleteConferenceRecordingsRequest deleteConferenceRecordings(String conferenceId) {
        return new DeleteConferenceRecordingsRequest(conferenceId);
    }

    private RequestDefinition deleteDialogRecordingsDefinition(String dialogId) {
        RequestDefinition.Builder builder = RequestDefinition.builder(
                        "DELETE", "/calls/1/recordings/dialogs/{dialogId}")
                .requiresAuthentication(true)
                .accept("application/json");

        if (dialogId != null) {
            builder.addPathParameter(new Parameter("dialogId", dialogId));
        }
        return builder.build();
    }

    /**
     * deleteDialogRecordings request builder class.
     */
    public class DeleteDialogRecordingsRequest {
        private final String dialogId;

        private DeleteDialogRecordingsRequest(String dialogId) {
            this.dialogId = Objects.requireNonNull(dialogId, "The required parameter 'dialogId' is missing.");
        }

        /**
         * Executes the deleteDialogRecordings request.
         *
         * @return CallsDialogRecordingResponse The deserialized response.
         * @throws ApiException If the API call fails or an error occurs during the request or response processing.
         */
        public CallsDialogRecordingResponse execute() throws ApiException {
            RequestDefinition deleteDialogRecordingsDefinition = deleteDialogRecordingsDefinition(dialogId);
            return apiClient.execute(
                    deleteDialogRecordingsDefinition, new TypeReference<CallsDialogRecordingResponse>() {}.getType());
        }

        /**
         * Executes the deleteDialogRecordings request asynchronously.
         *
         * @param callback The {@link ApiCallback} to be invoked.
         * @return The {@link okhttp3.Call} associated with the API request.
         */
        public okhttp3.Call executeAsync(ApiCallback<CallsDialogRecordingResponse> callback) {
            RequestDefinition deleteDialogRecordingsDefinition = deleteDialogRecordingsDefinition(dialogId);
            return apiClient.executeAsync(
                    deleteDialogRecordingsDefinition,
                    new TypeReference<CallsDialogRecordingResponse>() {}.getType(),
                    callback);
        }
    }

    /**
     * Delete dialog recordings.
     * <p>
     * Delete the recordings for a single dialog.
     *
     * @param dialogId Dialog ID. (required)
     * @return DeleteDialogRecordingsRequest
     */
    public DeleteDialogRecordingsRequest deleteDialogRecordings(String dialogId) {
        return new DeleteDialogRecordingsRequest(dialogId);
    }

    private RequestDefinition deleteMediaStreamConfigDefinition(String mediaStreamConfigId) {
        RequestDefinition.Builder builder = RequestDefinition.builder(
                        "DELETE", "/calls/1/media-stream-configs/{mediaStreamConfigId}")
                .requiresAuthentication(true)
                .accept("application/json");

        if (mediaStreamConfigId != null) {
            builder.addPathParameter(new Parameter("mediaStreamConfigId", mediaStreamConfigId));
        }
        return builder.build();
    }

    /**
     * deleteMediaStreamConfig request builder class.
     */
    public class DeleteMediaStreamConfigRequest {
        private final String mediaStreamConfigId;

        private DeleteMediaStreamConfigRequest(String mediaStreamConfigId) {
            this.mediaStreamConfigId = Objects.requireNonNull(
                    mediaStreamConfigId, "The required parameter 'mediaStreamConfigId' is missing.");
        }

        /**
         * Executes the deleteMediaStreamConfig request.
         *
         * @return CallsMediaStreamConfigResponse The deserialized response.
         * @throws ApiException If the API call fails or an error occurs during the request or response processing.
         */
        public CallsMediaStreamConfigResponse execute() throws ApiException {
            RequestDefinition deleteMediaStreamConfigDefinition =
                    deleteMediaStreamConfigDefinition(mediaStreamConfigId);
            return apiClient.execute(
                    deleteMediaStreamConfigDefinition,
                    new TypeReference<CallsMediaStreamConfigResponse>() {}.getType());
        }

        /**
         * Executes the deleteMediaStreamConfig request asynchronously.
         *
         * @param callback The {@link ApiCallback} to be invoked.
         * @return The {@link okhttp3.Call} associated with the API request.
         */
        public okhttp3.Call executeAsync(ApiCallback<CallsMediaStreamConfigResponse> callback) {
            RequestDefinition deleteMediaStreamConfigDefinition =
                    deleteMediaStreamConfigDefinition(mediaStreamConfigId);
            return apiClient.executeAsync(
                    deleteMediaStreamConfigDefinition,
                    new TypeReference<CallsMediaStreamConfigResponse>() {}.getType(),
                    callback);
        }
    }

    /**
     * Delete a media-stream configuration.
     * <p>
     * Delete a media-stream configuration.
     *
     * @param mediaStreamConfigId Media-stream configuration ID. (required)
     * @return DeleteMediaStreamConfigRequest
     */
    public DeleteMediaStreamConfigRequest deleteMediaStreamConfig(String mediaStreamConfigId) {
        return new DeleteMediaStreamConfigRequest(mediaStreamConfigId);
    }

    private RequestDefinition deleteRecordingFileDefinition(String fileId) {
        RequestDefinition.Builder builder = RequestDefinition.builder("DELETE", "/calls/1/recordings/files/{fileId}")
                .requiresAuthentication(true)
                .accept("application/json");

        if (fileId != null) {
            builder.addPathParameter(new Parameter("fileId", fileId));
        }
        return builder.build();
    }

    /**
     * deleteRecordingFile request builder class.
     */
    public class DeleteRecordingFileRequest {
        private final String fileId;

        private DeleteRecordingFileRequest(String fileId) {
            this.fileId = Objects.requireNonNull(fileId, "The required parameter 'fileId' is missing.");
        }

        /**
         * Executes the deleteRecordingFile request.
         *
         * @return CallsRecordingFile The deserialized response.
         * @throws ApiException If the API call fails or an error occurs during the request or response processing.
         */
        public CallsRecordingFile execute() throws ApiException {
            RequestDefinition deleteRecordingFileDefinition = deleteRecordingFileDefinition(fileId);
            return apiClient.execute(
                    deleteRecordingFileDefinition, new TypeReference<CallsRecordingFile>() {}.getType());
        }

        /**
         * Executes the deleteRecordingFile request asynchronously.
         *
         * @param callback The {@link ApiCallback} to be invoked.
         * @return The {@link okhttp3.Call} associated with the API request.
         */
        public okhttp3.Call executeAsync(ApiCallback<CallsRecordingFile> callback) {
            RequestDefinition deleteRecordingFileDefinition = deleteRecordingFileDefinition(fileId);
            return apiClient.executeAsync(
                    deleteRecordingFileDefinition, new TypeReference<CallsRecordingFile>() {}.getType(), callback);
        }
    }

    /**
     * Delete recording file.
     * <p>
     * Delete a single file from a call or conference recording. The call or conference recording metadata will still exist after deleting the file, but the file will not show up anymore in the file list of that call or conference recording.
     *
     * @param fileId File ID. (required)
     * @return DeleteRecordingFileRequest
     */
    public DeleteRecordingFileRequest deleteRecordingFile(String fileId) {
        return new DeleteRecordingFileRequest(fileId);
    }

    private RequestDefinition dialogPlayFileDefinition(String dialogId, CallsDialogPlayRequest callsDialogPlayRequest) {
        RequestDefinition.Builder builder = RequestDefinition.builder("POST", "/calls/1/dialogs/{dialogId}/play")
                .body(callsDialogPlayRequest)
                .requiresAuthentication(true)
                .accept("application/json")
                .contentType("application/json");

        if (dialogId != null) {
            builder.addPathParameter(new Parameter("dialogId", dialogId));
        }
        return builder.build();
    }

    /**
     * dialogPlayFile request builder class.
     */
    public class DialogPlayFileRequest {
        private final String dialogId;
        private final CallsDialogPlayRequest callsDialogPlayRequest;

        private DialogPlayFileRequest(String dialogId, CallsDialogPlayRequest callsDialogPlayRequest) {
            this.dialogId = Objects.requireNonNull(dialogId, "The required parameter 'dialogId' is missing.");
            this.callsDialogPlayRequest = Objects.requireNonNull(
                    callsDialogPlayRequest, "The required parameter 'callsDialogPlayRequest' is missing.");
        }

        /**
         * Executes the dialogPlayFile request.
         *
         * @return CallsActionResponse The deserialized response.
         * @throws ApiException If the API call fails or an error occurs during the request or response processing.
         */
        public CallsActionResponse execute() throws ApiException {
            RequestDefinition dialogPlayFileDefinition = dialogPlayFileDefinition(dialogId, callsDialogPlayRequest);
            return apiClient.execute(dialogPlayFileDefinition, new TypeReference<CallsActionResponse>() {}.getType());
        }

        /**
         * Executes the dialogPlayFile request asynchronously.
         *
         * @param callback The {@link ApiCallback} to be invoked.
         * @return The {@link okhttp3.Call} associated with the API request.
         */
        public okhttp3.Call executeAsync(ApiCallback<CallsActionResponse> callback) {
            RequestDefinition dialogPlayFileDefinition = dialogPlayFileDefinition(dialogId, callsDialogPlayRequest);
            return apiClient.executeAsync(
                    dialogPlayFileDefinition, new TypeReference<CallsActionResponse>() {}.getType(), callback);
        }
    }

    /**
     * Play file.
     * <p>
     * Play an audio file on a dialog.
     *
     * @param dialogId Dialog ID. (required)
     * @param callsDialogPlayRequest  (required)
     * @return DialogPlayFileRequest
     */
    public DialogPlayFileRequest dialogPlayFile(String dialogId, CallsDialogPlayRequest callsDialogPlayRequest) {
        return new DialogPlayFileRequest(dialogId, callsDialogPlayRequest);
    }

    private RequestDefinition dialogSayTextDefinition(String dialogId, CallsDialogSayRequest callsDialogSayRequest) {
        RequestDefinition.Builder builder = RequestDefinition.builder("POST", "/calls/1/dialogs/{dialogId}/say")
                .body(callsDialogSayRequest)
                .requiresAuthentication(true)
                .accept("application/json")
                .contentType("application/json");

        if (dialogId != null) {
            builder.addPathParameter(new Parameter("dialogId", dialogId));
        }
        return builder.build();
    }

    /**
     * dialogSayText request builder class.
     */
    public class DialogSayTextRequest {
        private final String dialogId;
        private final CallsDialogSayRequest callsDialogSayRequest;

        private DialogSayTextRequest(String dialogId, CallsDialogSayRequest callsDialogSayRequest) {
            this.dialogId = Objects.requireNonNull(dialogId, "The required parameter 'dialogId' is missing.");
            this.callsDialogSayRequest = Objects.requireNonNull(
                    callsDialogSayRequest, "The required parameter 'callsDialogSayRequest' is missing.");
        }

        /**
         * Executes the dialogSayText request.
         *
         * @return CallsActionResponse The deserialized response.
         * @throws ApiException If the API call fails or an error occurs during the request or response processing.
         */
        public CallsActionResponse execute() throws ApiException {
            RequestDefinition dialogSayTextDefinition = dialogSayTextDefinition(dialogId, callsDialogSayRequest);
            return apiClient.execute(dialogSayTextDefinition, new TypeReference<CallsActionResponse>() {}.getType());
        }

        /**
         * Executes the dialogSayText request asynchronously.
         *
         * @param callback The {@link ApiCallback} to be invoked.
         * @return The {@link okhttp3.Call} associated with the API request.
         */
        public okhttp3.Call executeAsync(ApiCallback<CallsActionResponse> callback) {
            RequestDefinition dialogSayTextDefinition = dialogSayTextDefinition(dialogId, callsDialogSayRequest);
            return apiClient.executeAsync(
                    dialogSayTextDefinition, new TypeReference<CallsActionResponse>() {}.getType(), callback);
        }
    }

    /**
     * Say text.
     * <p>
     * Say text on a dialog.
     *
     * @param dialogId Dialog ID. (required)
     * @param callsDialogSayRequest  (required)
     * @return DialogSayTextRequest
     */
    public DialogSayTextRequest dialogSayText(String dialogId, CallsDialogSayRequest callsDialogSayRequest) {
        return new DialogSayTextRequest(dialogId, callsDialogSayRequest);
    }

    private RequestDefinition dialogStartRecordingDefinition(
            String dialogId, CallsDialogRecordingRequest callsDialogRecordingRequest) {
        RequestDefinition.Builder builder = RequestDefinition.builder(
                        "POST", "/calls/1/dialogs/{dialogId}/start-recording")
                .body(callsDialogRecordingRequest)
                .requiresAuthentication(true)
                .accept("application/json")
                .contentType("application/json");

        if (dialogId != null) {
            builder.addPathParameter(new Parameter("dialogId", dialogId));
        }
        return builder.build();
    }

    /**
     * dialogStartRecording request builder class.
     */
    public class DialogStartRecordingRequest {
        private final String dialogId;
        private final CallsDialogRecordingRequest callsDialogRecordingRequest;

        private DialogStartRecordingRequest(String dialogId, CallsDialogRecordingRequest callsDialogRecordingRequest) {
            this.dialogId = Objects.requireNonNull(dialogId, "The required parameter 'dialogId' is missing.");
            this.callsDialogRecordingRequest = Objects.requireNonNull(
                    callsDialogRecordingRequest, "The required parameter 'callsDialogRecordingRequest' is missing.");
        }

        /**
         * Executes the dialogStartRecording request.
         *
         * @return CallsActionResponse The deserialized response.
         * @throws ApiException If the API call fails or an error occurs during the request or response processing.
         */
        public CallsActionResponse execute() throws ApiException {
            RequestDefinition dialogStartRecordingDefinition =
                    dialogStartRecordingDefinition(dialogId, callsDialogRecordingRequest);
            return apiClient.execute(
                    dialogStartRecordingDefinition, new TypeReference<CallsActionResponse>() {}.getType());
        }

        /**
         * Executes the dialogStartRecording request asynchronously.
         *
         * @param callback The {@link ApiCallback} to be invoked.
         * @return The {@link okhttp3.Call} associated with the API request.
         */
        public okhttp3.Call executeAsync(ApiCallback<CallsActionResponse> callback) {
            RequestDefinition dialogStartRecordingDefinition =
                    dialogStartRecordingDefinition(dialogId, callsDialogRecordingRequest);
            return apiClient.executeAsync(
                    dialogStartRecordingDefinition, new TypeReference<CallsActionResponse>() {}.getType(), callback);
        }
    }

    /**
     * Start recording.
     * <p>
     * Start recording a dialog.
     *
     * @param dialogId Dialog ID. (required)
     * @param callsDialogRecordingRequest  (required)
     * @return DialogStartRecordingRequest
     */
    public DialogStartRecordingRequest dialogStartRecording(
            String dialogId, CallsDialogRecordingRequest callsDialogRecordingRequest) {
        return new DialogStartRecordingRequest(dialogId, callsDialogRecordingRequest);
    }

    private RequestDefinition dialogStopPlayingFileDefinition(String dialogId) {
        RequestDefinition.Builder builder = RequestDefinition.builder("POST", "/calls/1/dialogs/{dialogId}/stop-play")
                .requiresAuthentication(true)
                .accept("application/json");

        if (dialogId != null) {
            builder.addPathParameter(new Parameter("dialogId", dialogId));
        }
        return builder.build();
    }

    /**
     * dialogStopPlayingFile request builder class.
     */
    public class DialogStopPlayingFileRequest {
        private final String dialogId;

        private DialogStopPlayingFileRequest(String dialogId) {
            this.dialogId = Objects.requireNonNull(dialogId, "The required parameter 'dialogId' is missing.");
        }

        /**
         * Executes the dialogStopPlayingFile request.
         *
         * @return CallsActionResponse The deserialized response.
         * @throws ApiException If the API call fails or an error occurs during the request or response processing.
         */
        public CallsActionResponse execute() throws ApiException {
            RequestDefinition dialogStopPlayingFileDefinition = dialogStopPlayingFileDefinition(dialogId);
            return apiClient.execute(
                    dialogStopPlayingFileDefinition, new TypeReference<CallsActionResponse>() {}.getType());
        }

        /**
         * Executes the dialogStopPlayingFile request asynchronously.
         *
         * @param callback The {@link ApiCallback} to be invoked.
         * @return The {@link okhttp3.Call} associated with the API request.
         */
        public okhttp3.Call executeAsync(ApiCallback<CallsActionResponse> callback) {
            RequestDefinition dialogStopPlayingFileDefinition = dialogStopPlayingFileDefinition(dialogId);
            return apiClient.executeAsync(
                    dialogStopPlayingFileDefinition, new TypeReference<CallsActionResponse>() {}.getType(), callback);
        }
    }

    /**
     * Stop playing file.
     * <p>
     * Stop playing an audio file on a dialog.
     *
     * @param dialogId Dialog ID. (required)
     * @return DialogStopPlayingFileRequest
     */
    public DialogStopPlayingFileRequest dialogStopPlayingFile(String dialogId) {
        return new DialogStopPlayingFileRequest(dialogId);
    }

    private RequestDefinition dialogStopRecordingDefinition(String dialogId) {
        RequestDefinition.Builder builder = RequestDefinition.builder(
                        "POST", "/calls/1/dialogs/{dialogId}/stop-recording")
                .requiresAuthentication(true)
                .accept("application/json");

        if (dialogId != null) {
            builder.addPathParameter(new Parameter("dialogId", dialogId));
        }
        return builder.build();
    }

    /**
     * dialogStopRecording request builder class.
     */
    public class DialogStopRecordingRequest {
        private final String dialogId;

        private DialogStopRecordingRequest(String dialogId) {
            this.dialogId = Objects.requireNonNull(dialogId, "The required parameter 'dialogId' is missing.");
        }

        /**
         * Executes the dialogStopRecording request.
         *
         * @return CallsActionResponse The deserialized response.
         * @throws ApiException If the API call fails or an error occurs during the request or response processing.
         */
        public CallsActionResponse execute() throws ApiException {
            RequestDefinition dialogStopRecordingDefinition = dialogStopRecordingDefinition(dialogId);
            return apiClient.execute(
                    dialogStopRecordingDefinition, new TypeReference<CallsActionResponse>() {}.getType());
        }

        /**
         * Executes the dialogStopRecording request asynchronously.
         *
         * @param callback The {@link ApiCallback} to be invoked.
         * @return The {@link okhttp3.Call} associated with the API request.
         */
        public okhttp3.Call executeAsync(ApiCallback<CallsActionResponse> callback) {
            RequestDefinition dialogStopRecordingDefinition = dialogStopRecordingDefinition(dialogId);
            return apiClient.executeAsync(
                    dialogStopRecordingDefinition, new TypeReference<CallsActionResponse>() {}.getType(), callback);
        }
    }

    /**
     * Stop recording.
     * <p>
     * Stop recording a dialog.
     *
     * @param dialogId Dialog ID. (required)
     * @return DialogStopRecordingRequest
     */
    public DialogStopRecordingRequest dialogStopRecording(String dialogId) {
        return new DialogStopRecordingRequest(dialogId);
    }

    private RequestDefinition downloadRecordingFileDefinition(String fileId) {
        RequestDefinition.Builder builder = RequestDefinition.builder("GET", "/calls/1/recordings/files/{fileId}")
                .requiresAuthentication(true)
                .accept("application/octet-stream");

        if (fileId != null) {
            builder.addPathParameter(new Parameter("fileId", fileId));
        }
        return builder.build();
    }

    /**
     * downloadRecordingFile request builder class.
     */
    public class DownloadRecordingFileRequest {
        private final String fileId;

        private DownloadRecordingFileRequest(String fileId) {
            this.fileId = Objects.requireNonNull(fileId, "The required parameter 'fileId' is missing.");
        }

        /**
         * Executes the downloadRecordingFile request.
         *
         * @return File The deserialized response.
         * @throws ApiException If the API call fails or an error occurs during the request or response processing.
         */
        public File execute() throws ApiException {
            RequestDefinition downloadRecordingFileDefinition = downloadRecordingFileDefinition(fileId);
            return apiClient.execute(downloadRecordingFileDefinition, new TypeReference<File>() {}.getType());
        }

        /**
         * Executes the downloadRecordingFile request asynchronously.
         *
         * @param callback The {@link ApiCallback} to be invoked.
         * @return The {@link okhttp3.Call} associated with the API request.
         */
        public okhttp3.Call executeAsync(ApiCallback<File> callback) {
            RequestDefinition downloadRecordingFileDefinition = downloadRecordingFileDefinition(fileId);
            return apiClient.executeAsync(
                    downloadRecordingFileDefinition, new TypeReference<File>() {}.getType(), callback);
        }
    }

    /**
     * Download recording file.
     * <p>
     * Download a recording file.
     *
     * @param fileId File ID. (required)
     * @return DownloadRecordingFileRequest
     */
    public DownloadRecordingFileRequest downloadRecordingFile(String fileId) {
        return new DownloadRecordingFileRequest(fileId);
    }

    private RequestDefinition getBulkStatusDefinition(String bulkId) {
        RequestDefinition.Builder builder = RequestDefinition.builder("GET", "/calls/1/bulks/{bulkId}")
                .requiresAuthentication(true)
                .accept("application/json");

        if (bulkId != null) {
            builder.addPathParameter(new Parameter("bulkId", bulkId));
        }
        return builder.build();
    }

    /**
     * getBulkStatus request builder class.
     */
    public class GetBulkStatusRequest {
        private final String bulkId;

        private GetBulkStatusRequest(String bulkId) {
            this.bulkId = Objects.requireNonNull(bulkId, "The required parameter 'bulkId' is missing.");
        }

        /**
         * Executes the getBulkStatus request.
         *
         * @return CallBulkStatus The deserialized response.
         * @throws ApiException If the API call fails or an error occurs during the request or response processing.
         */
        public CallBulkStatus execute() throws ApiException {
            RequestDefinition getBulkStatusDefinition = getBulkStatusDefinition(bulkId);
            return apiClient.execute(getBulkStatusDefinition, new TypeReference<CallBulkStatus>() {}.getType());
        }

        /**
         * Executes the getBulkStatus request asynchronously.
         *
         * @param callback The {@link ApiCallback} to be invoked.
         * @return The {@link okhttp3.Call} associated with the API request.
         */
        public okhttp3.Call executeAsync(ApiCallback<CallBulkStatus> callback) {
            RequestDefinition getBulkStatusDefinition = getBulkStatusDefinition(bulkId);
            return apiClient.executeAsync(
                    getBulkStatusDefinition, new TypeReference<CallBulkStatus>() {}.getType(), callback);
        }
    }

    /**
     * Get bulk status.
     * <p>
     * Get a single bulk status.
     *
     * @param bulkId Bulk ID. (required)
     * @return GetBulkStatusRequest
     */
    public GetBulkStatusRequest getBulkStatus(String bulkId) {
        return new GetBulkStatusRequest(bulkId);
    }

    private RequestDefinition getCallDefinition(String callId) {
        RequestDefinition.Builder builder = RequestDefinition.builder("GET", "/calls/1/calls/{callId}")
                .requiresAuthentication(true)
                .accept("application/json");

        if (callId != null) {
            builder.addPathParameter(new Parameter("callId", callId));
        }
        return builder.build();
    }

    /**
     * getCall request builder class.
     */
    public class GetCallRequest {
        private final String callId;

        private GetCallRequest(String callId) {
            this.callId = Objects.requireNonNull(callId, "The required parameter 'callId' is missing.");
        }

        /**
         * Executes the getCall request.
         *
         * @return Call The deserialized response.
         * @throws ApiException If the API call fails or an error occurs during the request or response processing.
         */
        public Call execute() throws ApiException {
            RequestDefinition getCallDefinition = getCallDefinition(callId);
            return apiClient.execute(getCallDefinition, new TypeReference<Call>() {}.getType());
        }

        /**
         * Executes the getCall request asynchronously.
         *
         * @param callback The {@link ApiCallback} to be invoked.
         * @return The {@link okhttp3.Call} associated with the API request.
         */
        public okhttp3.Call executeAsync(ApiCallback<Call> callback) {
            RequestDefinition getCallDefinition = getCallDefinition(callId);
            return apiClient.executeAsync(getCallDefinition, new TypeReference<Call>() {}.getType(), callback);
        }
    }

    /**
     * Get call.
     * <p>
     * Get a single call.
     *
     * @param callId Call ID. (required)
     * @return GetCallRequest
     */
    public GetCallRequest getCall(String callId) {
        return new GetCallRequest(callId);
    }

    private RequestDefinition getCallHistoryDefinition(String callId) {
        RequestDefinition.Builder builder = RequestDefinition.builder("GET", "/calls/1/calls/{callId}/history")
                .requiresAuthentication(true)
                .accept("application/json");

        if (callId != null) {
            builder.addPathParameter(new Parameter("callId", callId));
        }
        return builder.build();
    }

    /**
     * getCallHistory request builder class.
     */
    public class GetCallHistoryRequest {
        private final String callId;

        private GetCallHistoryRequest(String callId) {
            this.callId = Objects.requireNonNull(callId, "The required parameter 'callId' is missing.");
        }

        /**
         * Executes the getCallHistory request.
         *
         * @return CallLog The deserialized response.
         * @throws ApiException If the API call fails or an error occurs during the request or response processing.
         */
        public CallLog execute() throws ApiException {
            RequestDefinition getCallHistoryDefinition = getCallHistoryDefinition(callId);
            return apiClient.execute(getCallHistoryDefinition, new TypeReference<CallLog>() {}.getType());
        }

        /**
         * Executes the getCallHistory request asynchronously.
         *
         * @param callback The {@link ApiCallback} to be invoked.
         * @return The {@link okhttp3.Call} associated with the API request.
         */
        public okhttp3.Call executeAsync(ApiCallback<CallLog> callback) {
            RequestDefinition getCallHistoryDefinition = getCallHistoryDefinition(callId);
            return apiClient.executeAsync(
                    getCallHistoryDefinition, new TypeReference<CallLog>() {}.getType(), callback);
        }
    }

    /**
     * Get call history.
     * <p>
     * Get a single call history. Call history retention period is 3 months.
     *
     * @param callId Call ID. (required)
     * @return GetCallHistoryRequest
     */
    public GetCallHistoryRequest getCallHistory(String callId) {
        return new GetCallHistoryRequest(callId);
    }

    private RequestDefinition getCallRecordingsDefinition(String callId) {
        RequestDefinition.Builder builder = RequestDefinition.builder("GET", "/calls/1/recordings/calls/{callId}")
                .requiresAuthentication(true)
                .accept("application/json");

        if (callId != null) {
            builder.addPathParameter(new Parameter("callId", callId));
        }
        return builder.build();
    }

    /**
     * getCallRecordings request builder class.
     */
    public class GetCallRecordingsRequest {
        private final String callId;

        private GetCallRecordingsRequest(String callId) {
            this.callId = Objects.requireNonNull(callId, "The required parameter 'callId' is missing.");
        }

        /**
         * Executes the getCallRecordings request.
         *
         * @return CallRecording The deserialized response.
         * @throws ApiException If the API call fails or an error occurs during the request or response processing.
         */
        public CallRecording execute() throws ApiException {
            RequestDefinition getCallRecordingsDefinition = getCallRecordingsDefinition(callId);
            return apiClient.execute(getCallRecordingsDefinition, new TypeReference<CallRecording>() {}.getType());
        }

        /**
         * Executes the getCallRecordings request asynchronously.
         *
         * @param callback The {@link ApiCallback} to be invoked.
         * @return The {@link okhttp3.Call} associated with the API request.
         */
        public okhttp3.Call executeAsync(ApiCallback<CallRecording> callback) {
            RequestDefinition getCallRecordingsDefinition = getCallRecordingsDefinition(callId);
            return apiClient.executeAsync(
                    getCallRecordingsDefinition, new TypeReference<CallRecording>() {}.getType(), callback);
        }
    }

    /**
     * Get call recordings.
     * <p>
     * Get the recordings for a single call.
     *
     * @param callId Call ID. (required)
     * @return GetCallRecordingsRequest
     */
    public GetCallRecordingsRequest getCallRecordings(String callId) {
        return new GetCallRecordingsRequest(callId);
    }

    private RequestDefinition getCallsDefinition(
            CallEndpointType type,
            String applicationId,
            String from,
            String to,
            CallDirection direction,
            CallState status,
            OffsetDateTime startTimeAfter,
            String conferenceId,
            String dialogId,
            Integer page,
            Integer size) {
        RequestDefinition.Builder builder = RequestDefinition.builder("GET", "/calls/1/calls")
                .requiresAuthentication(true)
                .accept("application/json");

        if (type != null) {
            builder.addQueryParameter(new Parameter("type", type));
        }
        if (applicationId != null) {
            builder.addQueryParameter(new Parameter("applicationId", applicationId));
        }
        if (from != null) {
            builder.addQueryParameter(new Parameter("from", from));
        }
        if (to != null) {
            builder.addQueryParameter(new Parameter("to", to));
        }
        if (direction != null) {
            builder.addQueryParameter(new Parameter("direction", direction));
        }
        if (status != null) {
            builder.addQueryParameter(new Parameter("status", status));
        }
        if (startTimeAfter != null) {
            builder.addQueryParameter(new Parameter("startTimeAfter", startTimeAfter));
        }
        if (conferenceId != null) {
            builder.addQueryParameter(new Parameter("conferenceId", conferenceId));
        }
        if (dialogId != null) {
            builder.addQueryParameter(new Parameter("dialogId", dialogId));
        }
        if (page != null) {
            builder.addQueryParameter(new Parameter("page", page));
        }
        if (size != null) {
            builder.addQueryParameter(new Parameter("size", size));
        }
        return builder.build();
    }

    /**
     * getCalls request builder class.
     */
    public class GetCallsRequest {
        private CallEndpointType type;
        private String applicationId;
        private String from;
        private String to;
        private CallDirection direction;
        private CallState status;
        private OffsetDateTime startTimeAfter;
        private String conferenceId;
        private String dialogId;
        private Integer page;
        private Integer size;

        private GetCallsRequest() {}

        /**
         * Sets type.
         *
         * @param type Call endpoint type. (optional)
         * @return GetCallsRequest
         */
        public GetCallsRequest type(CallEndpointType type) {
            this.type = type;
            return this;
        }

        /**
         * Sets applicationId.
         *
         * @param applicationId Application ID. (optional)
         * @return GetCallsRequest
         */
        public GetCallsRequest applicationId(String applicationId) {
            this.applicationId = applicationId;
            return this;
        }

        /**
         * Sets from.
         *
         * @param from Caller identifier. (optional)
         * @return GetCallsRequest
         */
        public GetCallsRequest from(String from) {
            this.from = from;
            return this;
        }

        /**
         * Sets to.
         *
         * @param to Callee identifier. (optional)
         * @return GetCallsRequest
         */
        public GetCallsRequest to(String to) {
            this.to = to;
            return this;
        }

        /**
         * Sets direction.
         *
         * @param direction Call direction. (optional)
         * @return GetCallsRequest
         */
        public GetCallsRequest direction(CallDirection direction) {
            this.direction = direction;
            return this;
        }

        /**
         * Sets status.
         *
         * @param status Call state. (optional)
         * @return GetCallsRequest
         */
        public GetCallsRequest status(CallState status) {
            this.status = status;
            return this;
        }

        /**
         * Sets startTimeAfter.
         *
         * @param startTimeAfter Date and time for when the call has been created. Has the following format: &#x60;yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSS+ZZZZ&#x60;. (optional)
         * @return GetCallsRequest
         */
        public GetCallsRequest startTimeAfter(OffsetDateTime startTimeAfter) {
            this.startTimeAfter = startTimeAfter;
            return this;
        }

        /**
         * Sets conferenceId.
         *
         * @param conferenceId Conference ID. (optional)
         * @return GetCallsRequest
         */
        public GetCallsRequest conferenceId(String conferenceId) {
            this.conferenceId = conferenceId;
            return this;
        }

        /**
         * Sets dialogId.
         *
         * @param dialogId Dialog ID. (optional)
         * @return GetCallsRequest
         */
        public GetCallsRequest dialogId(String dialogId) {
            this.dialogId = dialogId;
            return this;
        }

        /**
         * Sets page.
         *
         * @param page Results page to retrieve (0..N). (optional, default to 0)
         * @return GetCallsRequest
         */
        public GetCallsRequest page(Integer page) {
            this.page = page;
            return this;
        }

        /**
         * Sets size.
         *
         * @param size Number of records per page. (optional, default to 20)
         * @return GetCallsRequest
         */
        public GetCallsRequest size(Integer size) {
            this.size = size;
            return this;
        }

        /**
         * Executes the getCalls request.
         *
         * @return CallPage The deserialized response.
         * @throws ApiException If the API call fails or an error occurs during the request or response processing.
         */
        public CallPage execute() throws ApiException {
            RequestDefinition getCallsDefinition = getCallsDefinition(
                    type,
                    applicationId,
                    from,
                    to,
                    direction,
                    status,
                    startTimeAfter,
                    conferenceId,
                    dialogId,
                    page,
                    size);
            return apiClient.execute(getCallsDefinition, new TypeReference<CallPage>() {}.getType());
        }

        /**
         * Executes the getCalls request asynchronously.
         *
         * @param callback The {@link ApiCallback} to be invoked.
         * @return The {@link okhttp3.Call} associated with the API request.
         */
        public okhttp3.Call executeAsync(ApiCallback<CallPage> callback) {
            RequestDefinition getCallsDefinition = getCallsDefinition(
                    type,
                    applicationId,
                    from,
                    to,
                    direction,
                    status,
                    startTimeAfter,
                    conferenceId,
                    dialogId,
                    page,
                    size);
            return apiClient.executeAsync(getCallsDefinition, new TypeReference<CallPage>() {}.getType(), callback);
        }
    }

    /**
     * Get calls.
     * <p>
     * Get calls with pagination.
     *
     * @return GetCallsRequest
     */
    public GetCallsRequest getCalls() {
        return new GetCallsRequest();
    }

    private RequestDefinition getCallsFileDefinition(String fileId) {
        RequestDefinition.Builder builder = RequestDefinition.builder("GET", "/calls/1/files/{fileId}")
                .requiresAuthentication(true)
                .accept("application/json");

        if (fileId != null) {
            builder.addPathParameter(new Parameter("fileId", fileId));
        }
        return builder.build();
    }

    /**
     * getCallsFile request builder class.
     */
    public class GetCallsFileRequest {
        private final String fileId;

        private GetCallsFileRequest(String fileId) {
            this.fileId = Objects.requireNonNull(fileId, "The required parameter 'fileId' is missing.");
        }

        /**
         * Executes the getCallsFile request.
         *
         * @return CallsFile The deserialized response.
         * @throws ApiException If the API call fails or an error occurs during the request or response processing.
         */
        public CallsFile execute() throws ApiException {
            RequestDefinition getCallsFileDefinition = getCallsFileDefinition(fileId);
            return apiClient.execute(getCallsFileDefinition, new TypeReference<CallsFile>() {}.getType());
        }

        /**
         * Executes the getCallsFile request asynchronously.
         *
         * @param callback The {@link ApiCallback} to be invoked.
         * @return The {@link okhttp3.Call} associated with the API request.
         */
        public okhttp3.Call executeAsync(ApiCallback<CallsFile> callback) {
            RequestDefinition getCallsFileDefinition = getCallsFileDefinition(fileId);
            return apiClient.executeAsync(
                    getCallsFileDefinition, new TypeReference<CallsFile>() {}.getType(), callback);
        }
    }

    /**
     * Get file.
     * <p>
     * Get a single file.
     *
     * @param fileId File ID. (required)
     * @return GetCallsFileRequest
     */
    public GetCallsFileRequest getCallsFile(String fileId) {
        return new GetCallsFileRequest(fileId);
    }

    private RequestDefinition getCallsFilesDefinition(Integer page, Integer size) {
        RequestDefinition.Builder builder = RequestDefinition.builder("GET", "/calls/1/files")
                .requiresAuthentication(true)
                .accept("application/json");

        if (page != null) {
            builder.addQueryParameter(new Parameter("page", page));
        }
        if (size != null) {
            builder.addQueryParameter(new Parameter("size", size));
        }
        return builder.build();
    }

    /**
     * getCallsFiles request builder class.
     */
    public class GetCallsFilesRequest {
        private Integer page;
        private Integer size;

        private GetCallsFilesRequest() {}

        /**
         * Sets page.
         *
         * @param page Results page to retrieve (0..N). (optional, default to 0)
         * @return GetCallsFilesRequest
         */
        public GetCallsFilesRequest page(Integer page) {
            this.page = page;
            return this;
        }

        /**
         * Sets size.
         *
         * @param size Number of records per page. (optional, default to 20)
         * @return GetCallsFilesRequest
         */
        public GetCallsFilesRequest size(Integer size) {
            this.size = size;
            return this;
        }

        /**
         * Executes the getCallsFiles request.
         *
         * @return CallsFilePage The deserialized response.
         * @throws ApiException If the API call fails or an error occurs during the request or response processing.
         */
        public CallsFilePage execute() throws ApiException {
            RequestDefinition getCallsFilesDefinition = getCallsFilesDefinition(page, size);
            return apiClient.execute(getCallsFilesDefinition, new TypeReference<CallsFilePage>() {}.getType());
        }

        /**
         * Executes the getCallsFiles request asynchronously.
         *
         * @param callback The {@link ApiCallback} to be invoked.
         * @return The {@link okhttp3.Call} associated with the API request.
         */
        public okhttp3.Call executeAsync(ApiCallback<CallsFilePage> callback) {
            RequestDefinition getCallsFilesDefinition = getCallsFilesDefinition(page, size);
            return apiClient.executeAsync(
                    getCallsFilesDefinition, new TypeReference<CallsFilePage>() {}.getType(), callback);
        }
    }

    /**
     * Get files.
     * <p>
     * Get files with pagination. Maximum number of pages is 100.
     *
     * @return GetCallsFilesRequest
     */
    public GetCallsFilesRequest getCallsFiles() {
        return new GetCallsFilesRequest();
    }

    private RequestDefinition getCallsHistoryDefinition(
            CallEndpointType type,
            String applicationId,
            String from,
            String to,
            CallDirection direction,
            CallState status,
            OffsetDateTime startTimeAfter,
            OffsetDateTime endTimeBefore,
            String conferenceId,
            String dialogId,
            Integer page,
            Integer size) {
        RequestDefinition.Builder builder = RequestDefinition.builder("GET", "/calls/1/calls/history")
                .requiresAuthentication(true)
                .accept("application/json");

        if (type != null) {
            builder.addQueryParameter(new Parameter("type", type));
        }
        if (applicationId != null) {
            builder.addQueryParameter(new Parameter("applicationId", applicationId));
        }
        if (from != null) {
            builder.addQueryParameter(new Parameter("from", from));
        }
        if (to != null) {
            builder.addQueryParameter(new Parameter("to", to));
        }
        if (direction != null) {
            builder.addQueryParameter(new Parameter("direction", direction));
        }
        if (status != null) {
            builder.addQueryParameter(new Parameter("status", status));
        }
        if (startTimeAfter != null) {
            builder.addQueryParameter(new Parameter("startTimeAfter", startTimeAfter));
        }
        if (endTimeBefore != null) {
            builder.addQueryParameter(new Parameter("endTimeBefore", endTimeBefore));
        }
        if (conferenceId != null) {
            builder.addQueryParameter(new Parameter("conferenceId", conferenceId));
        }
        if (dialogId != null) {
            builder.addQueryParameter(new Parameter("dialogId", dialogId));
        }
        if (page != null) {
            builder.addQueryParameter(new Parameter("page", page));
        }
        if (size != null) {
            builder.addQueryParameter(new Parameter("size", size));
        }
        return builder.build();
    }

    /**
     * getCallsHistory request builder class.
     */
    public class GetCallsHistoryRequest {
        private CallEndpointType type;
        private String applicationId;
        private String from;
        private String to;
        private CallDirection direction;
        private CallState status;
        private OffsetDateTime startTimeAfter;
        private OffsetDateTime endTimeBefore;
        private String conferenceId;
        private String dialogId;
        private Integer page;
        private Integer size;

        private GetCallsHistoryRequest() {}

        /**
         * Sets type.
         *
         * @param type Call endpoint type. (optional)
         * @return GetCallsHistoryRequest
         */
        public GetCallsHistoryRequest type(CallEndpointType type) {
            this.type = type;
            return this;
        }

        /**
         * Sets applicationId.
         *
         * @param applicationId Application ID. (optional)
         * @return GetCallsHistoryRequest
         */
        public GetCallsHistoryRequest applicationId(String applicationId) {
            this.applicationId = applicationId;
            return this;
        }

        /**
         * Sets from.
         *
         * @param from Caller identifier. (optional)
         * @return GetCallsHistoryRequest
         */
        public GetCallsHistoryRequest from(String from) {
            this.from = from;
            return this;
        }

        /**
         * Sets to.
         *
         * @param to Callee identifier. (optional)
         * @return GetCallsHistoryRequest
         */
        public GetCallsHistoryRequest to(String to) {
            this.to = to;
            return this;
        }

        /**
         * Sets direction.
         *
         * @param direction Call direction. (optional)
         * @return GetCallsHistoryRequest
         */
        public GetCallsHistoryRequest direction(CallDirection direction) {
            this.direction = direction;
            return this;
        }

        /**
         * Sets status.
         *
         * @param status Call state. (optional)
         * @return GetCallsHistoryRequest
         */
        public GetCallsHistoryRequest status(CallState status) {
            this.status = status;
            return this;
        }

        /**
         * Sets startTimeAfter.
         *
         * @param startTimeAfter Date and time for when the call has been created. Has the following format: &#x60;yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSS+ZZZZ&#x60;. (optional)
         * @return GetCallsHistoryRequest
         */
        public GetCallsHistoryRequest startTimeAfter(OffsetDateTime startTimeAfter) {
            this.startTimeAfter = startTimeAfter;
            return this;
        }

        /**
         * Sets endTimeBefore.
         *
         * @param endTimeBefore Date and time for when the call has been finished. Has the following format: &#x60;yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSS+ZZZZ&#x60;. (optional)
         * @return GetCallsHistoryRequest
         */
        public GetCallsHistoryRequest endTimeBefore(OffsetDateTime endTimeBefore) {
            this.endTimeBefore = endTimeBefore;
            return this;
        }

        /**
         * Sets conferenceId.
         *
         * @param conferenceId Conference ID. (optional)
         * @return GetCallsHistoryRequest
         */
        public GetCallsHistoryRequest conferenceId(String conferenceId) {
            this.conferenceId = conferenceId;
            return this;
        }

        /**
         * Sets dialogId.
         *
         * @param dialogId Dialog ID. (optional)
         * @return GetCallsHistoryRequest
         */
        public GetCallsHistoryRequest dialogId(String dialogId) {
            this.dialogId = dialogId;
            return this;
        }

        /**
         * Sets page.
         *
         * @param page Results page to retrieve (0..N). (optional, default to 0)
         * @return GetCallsHistoryRequest
         */
        public GetCallsHistoryRequest page(Integer page) {
            this.page = page;
            return this;
        }

        /**
         * Sets size.
         *
         * @param size Number of records per page. (optional, default to 20)
         * @return GetCallsHistoryRequest
         */
        public GetCallsHistoryRequest size(Integer size) {
            this.size = size;
            return this;
        }

        /**
         * Executes the getCallsHistory request.
         *
         * @return CallLogPage The deserialized response.
         * @throws ApiException If the API call fails or an error occurs during the request or response processing.
         */
        public CallLogPage execute() throws ApiException {
            RequestDefinition getCallsHistoryDefinition = getCallsHistoryDefinition(
                    type,
                    applicationId,
                    from,
                    to,
                    direction,
                    status,
                    startTimeAfter,
                    endTimeBefore,
                    conferenceId,
                    dialogId,
                    page,
                    size);
            return apiClient.execute(getCallsHistoryDefinition, new TypeReference<CallLogPage>() {}.getType());
        }

        /**
         * Executes the getCallsHistory request asynchronously.
         *
         * @param callback The {@link ApiCallback} to be invoked.
         * @return The {@link okhttp3.Call} associated with the API request.
         */
        public okhttp3.Call executeAsync(ApiCallback<CallLogPage> callback) {
            RequestDefinition getCallsHistoryDefinition = getCallsHistoryDefinition(
                    type,
                    applicationId,
                    from,
                    to,
                    direction,
                    status,
                    startTimeAfter,
                    endTimeBefore,
                    conferenceId,
                    dialogId,
                    page,
                    size);
            return apiClient.executeAsync(
                    getCallsHistoryDefinition, new TypeReference<CallLogPage>() {}.getType(), callback);
        }
    }

    /**
     * Get calls history.
     * <p>
     * Get calls history with pagination. Calls history retention period is 3 months.
     *
     * @return GetCallsHistoryRequest
     */
    public GetCallsHistoryRequest getCallsHistory() {
        return new GetCallsHistoryRequest();
    }

    private RequestDefinition getCallsRecordingsDefinition(
            String callId,
            String applicationId,
            String endpointIdentifier,
            OffsetDateTime startTimeAfter,
            OffsetDateTime endTimeBefore,
            CallDirection direction,
            CallEndpointType endpointType,
            Integer page,
            Integer size) {
        RequestDefinition.Builder builder = RequestDefinition.builder("GET", "/calls/1/recordings/calls")
                .requiresAuthentication(true)
                .accept("application/json");

        if (callId != null) {
            builder.addQueryParameter(new Parameter("callId", callId));
        }
        if (applicationId != null) {
            builder.addQueryParameter(new Parameter("applicationId", applicationId));
        }
        if (endpointIdentifier != null) {
            builder.addQueryParameter(new Parameter("endpointIdentifier", endpointIdentifier));
        }
        if (startTimeAfter != null) {
            builder.addQueryParameter(new Parameter("startTimeAfter", startTimeAfter));
        }
        if (endTimeBefore != null) {
            builder.addQueryParameter(new Parameter("endTimeBefore", endTimeBefore));
        }
        if (direction != null) {
            builder.addQueryParameter(new Parameter("direction", direction));
        }
        if (endpointType != null) {
            builder.addQueryParameter(new Parameter("endpointType", endpointType));
        }
        if (page != null) {
            builder.addQueryParameter(new Parameter("page", page));
        }
        if (size != null) {
            builder.addQueryParameter(new Parameter("size", size));
        }
        return builder.build();
    }

    /**
     * getCallsRecordings request builder class.
     */
    public class GetCallsRecordingsRequest {
        private String callId;
        private String applicationId;
        private String endpointIdentifier;
        private OffsetDateTime startTimeAfter;
        private OffsetDateTime endTimeBefore;
        private CallDirection direction;
        private CallEndpointType endpointType;
        private Integer page;
        private Integer size;

        private GetCallsRecordingsRequest() {}

        /**
         * Sets callId.
         *
         * @param callId Call ID. (optional)
         * @return GetCallsRecordingsRequest
         */
        public GetCallsRecordingsRequest callId(String callId) {
            this.callId = callId;
            return this;
        }

        /**
         * Sets applicationId.
         *
         * @param applicationId Application ID. (optional)
         * @return GetCallsRecordingsRequest
         */
        public GetCallsRecordingsRequest applicationId(String applicationId) {
            this.applicationId = applicationId;
            return this;
        }

        /**
         * Sets endpointIdentifier.
         *
         * @param endpointIdentifier Endpoint identifier. (optional)
         * @return GetCallsRecordingsRequest
         */
        public GetCallsRecordingsRequest endpointIdentifier(String endpointIdentifier) {
            this.endpointIdentifier = endpointIdentifier;
            return this;
        }

        /**
         * Sets startTimeAfter.
         *
         * @param startTimeAfter Date and time when the (first) call recording started. (optional)
         * @return GetCallsRecordingsRequest
         */
        public GetCallsRecordingsRequest startTimeAfter(OffsetDateTime startTimeAfter) {
            this.startTimeAfter = startTimeAfter;
            return this;
        }

        /**
         * Sets endTimeBefore.
         *
         * @param endTimeBefore Date and time when the (last) call recording ended. (optional)
         * @return GetCallsRecordingsRequest
         */
        public GetCallsRecordingsRequest endTimeBefore(OffsetDateTime endTimeBefore) {
            this.endTimeBefore = endTimeBefore;
            return this;
        }

        /**
         * Sets direction.
         *
         * @param direction Call direction. (optional)
         * @return GetCallsRecordingsRequest
         */
        public GetCallsRecordingsRequest direction(CallDirection direction) {
            this.direction = direction;
            return this;
        }

        /**
         * Sets endpointType.
         *
         * @param endpointType Endpoint type. (optional)
         * @return GetCallsRecordingsRequest
         */
        public GetCallsRecordingsRequest endpointType(CallEndpointType endpointType) {
            this.endpointType = endpointType;
            return this;
        }

        /**
         * Sets page.
         *
         * @param page Results page to retrieve (0..N). (optional, default to 0)
         * @return GetCallsRecordingsRequest
         */
        public GetCallsRecordingsRequest page(Integer page) {
            this.page = page;
            return this;
        }

        /**
         * Sets size.
         *
         * @param size Number of records per page. (optional, default to 20)
         * @return GetCallsRecordingsRequest
         */
        public GetCallsRecordingsRequest size(Integer size) {
            this.size = size;
            return this;
        }

        /**
         * Executes the getCallsRecordings request.
         *
         * @return CallRecordingPage The deserialized response.
         * @throws ApiException If the API call fails or an error occurs during the request or response processing.
         */
        public CallRecordingPage execute() throws ApiException {
            RequestDefinition getCallsRecordingsDefinition = getCallsRecordingsDefinition(
                    callId,
                    applicationId,
                    endpointIdentifier,
                    startTimeAfter,
                    endTimeBefore,
                    direction,
                    endpointType,
                    page,
                    size);
            return apiClient.execute(getCallsRecordingsDefinition, new TypeReference<CallRecordingPage>() {}.getType());
        }

        /**
         * Executes the getCallsRecordings request asynchronously.
         *
         * @param callback The {@link ApiCallback} to be invoked.
         * @return The {@link okhttp3.Call} associated with the API request.
         */
        public okhttp3.Call executeAsync(ApiCallback<CallRecordingPage> callback) {
            RequestDefinition getCallsRecordingsDefinition = getCallsRecordingsDefinition(
                    callId,
                    applicationId,
                    endpointIdentifier,
                    startTimeAfter,
                    endTimeBefore,
                    direction,
                    endpointType,
                    page,
                    size);
            return apiClient.executeAsync(
                    getCallsRecordingsDefinition, new TypeReference<CallRecordingPage>() {}.getType(), callback);
        }
    }

    /**
     * Get calls recordings.
     * <p>
     * Get the recordings of calls with pagination.
     *
     * @return GetCallsRecordingsRequest
     */
    public GetCallsRecordingsRequest getCallsRecordings() {
        return new GetCallsRecordingsRequest();
    }

    private RequestDefinition getConferenceDefinition(String conferenceId) {
        RequestDefinition.Builder builder = RequestDefinition.builder("GET", "/calls/1/conferences/{conferenceId}")
                .requiresAuthentication(true)
                .accept("application/json");

        if (conferenceId != null) {
            builder.addPathParameter(new Parameter("conferenceId", conferenceId));
        }
        return builder.build();
    }

    /**
     * getConference request builder class.
     */
    public class GetConferenceRequest {
        private final String conferenceId;

        private GetConferenceRequest(String conferenceId) {
            this.conferenceId =
                    Objects.requireNonNull(conferenceId, "The required parameter 'conferenceId' is missing.");
        }

        /**
         * Executes the getConference request.
         *
         * @return CallsConference The deserialized response.
         * @throws ApiException If the API call fails or an error occurs during the request or response processing.
         */
        public CallsConference execute() throws ApiException {
            RequestDefinition getConferenceDefinition = getConferenceDefinition(conferenceId);
            return apiClient.execute(getConferenceDefinition, new TypeReference<CallsConference>() {}.getType());
        }

        /**
         * Executes the getConference request asynchronously.
         *
         * @param callback The {@link ApiCallback} to be invoked.
         * @return The {@link okhttp3.Call} associated with the API request.
         */
        public okhttp3.Call executeAsync(ApiCallback<CallsConference> callback) {
            RequestDefinition getConferenceDefinition = getConferenceDefinition(conferenceId);
            return apiClient.executeAsync(
                    getConferenceDefinition, new TypeReference<CallsConference>() {}.getType(), callback);
        }
    }

    /**
     * Get conference.
     * <p>
     * Get a single conference.
     *
     * @param conferenceId Conference ID. (required)
     * @return GetConferenceRequest
     */
    public GetConferenceRequest getConference(String conferenceId) {
        return new GetConferenceRequest(conferenceId);
    }

    private RequestDefinition getConferenceHistoryDefinition(String conferenceId) {
        RequestDefinition.Builder builder = RequestDefinition.builder(
                        "GET", "/calls/1/conferences/{conferenceId}/history")
                .requiresAuthentication(true)
                .accept("application/json");

        if (conferenceId != null) {
            builder.addPathParameter(new Parameter("conferenceId", conferenceId));
        }
        return builder.build();
    }

    /**
     * getConferenceHistory request builder class.
     */
    public class GetConferenceHistoryRequest {
        private final String conferenceId;

        private GetConferenceHistoryRequest(String conferenceId) {
            this.conferenceId =
                    Objects.requireNonNull(conferenceId, "The required parameter 'conferenceId' is missing.");
        }

        /**
         * Executes the getConferenceHistory request.
         *
         * @return CallsConferenceLog The deserialized response.
         * @throws ApiException If the API call fails or an error occurs during the request or response processing.
         */
        public CallsConferenceLog execute() throws ApiException {
            RequestDefinition getConferenceHistoryDefinition = getConferenceHistoryDefinition(conferenceId);
            return apiClient.execute(
                    getConferenceHistoryDefinition, new TypeReference<CallsConferenceLog>() {}.getType());
        }

        /**
         * Executes the getConferenceHistory request asynchronously.
         *
         * @param callback The {@link ApiCallback} to be invoked.
         * @return The {@link okhttp3.Call} associated with the API request.
         */
        public okhttp3.Call executeAsync(ApiCallback<CallsConferenceLog> callback) {
            RequestDefinition getConferenceHistoryDefinition = getConferenceHistoryDefinition(conferenceId);
            return apiClient.executeAsync(
                    getConferenceHistoryDefinition, new TypeReference<CallsConferenceLog>() {}.getType(), callback);
        }
    }

    /**
     * Get conference history.
     * <p>
     * Get a single conference history. Conference history retention period is 3 months.
     *
     * @param conferenceId Conference ID. (required)
     * @return GetConferenceHistoryRequest
     */
    public GetConferenceHistoryRequest getConferenceHistory(String conferenceId) {
        return new GetConferenceHistoryRequest(conferenceId);
    }

    private RequestDefinition getConferenceRecordingsDefinition(String conferenceId) {
        RequestDefinition.Builder builder = RequestDefinition.builder(
                        "GET", "/calls/1/recordings/conferences/{conferenceId}")
                .requiresAuthentication(true)
                .accept("application/json");

        if (conferenceId != null) {
            builder.addPathParameter(new Parameter("conferenceId", conferenceId));
        }
        return builder.build();
    }

    /**
     * getConferenceRecordings request builder class.
     */
    public class GetConferenceRecordingsRequest {
        private final String conferenceId;

        private GetConferenceRecordingsRequest(String conferenceId) {
            this.conferenceId =
                    Objects.requireNonNull(conferenceId, "The required parameter 'conferenceId' is missing.");
        }

        /**
         * Executes the getConferenceRecordings request.
         *
         * @return CallsConferenceRecording The deserialized response.
         * @throws ApiException If the API call fails or an error occurs during the request or response processing.
         */
        public CallsConferenceRecording execute() throws ApiException {
            RequestDefinition getConferenceRecordingsDefinition = getConferenceRecordingsDefinition(conferenceId);
            return apiClient.execute(
                    getConferenceRecordingsDefinition, new TypeReference<CallsConferenceRecording>() {}.getType());
        }

        /**
         * Executes the getConferenceRecordings request asynchronously.
         *
         * @param callback The {@link ApiCallback} to be invoked.
         * @return The {@link okhttp3.Call} associated with the API request.
         */
        public okhttp3.Call executeAsync(ApiCallback<CallsConferenceRecording> callback) {
            RequestDefinition getConferenceRecordingsDefinition = getConferenceRecordingsDefinition(conferenceId);
            return apiClient.executeAsync(
                    getConferenceRecordingsDefinition,
                    new TypeReference<CallsConferenceRecording>() {}.getType(),
                    callback);
        }
    }

    /**
     * Get conference recordings.
     * <p>
     * Get the recordings for a single conference.
     *
     * @param conferenceId Conference ID. (required)
     * @return GetConferenceRecordingsRequest
     */
    public GetConferenceRecordingsRequest getConferenceRecordings(String conferenceId) {
        return new GetConferenceRecordingsRequest(conferenceId);
    }

    private RequestDefinition getConferencesDefinition(
            String name,
            String callId,
            String applicationId,
            OffsetDateTime startTimeAfter,
            Integer page,
            Integer size) {
        RequestDefinition.Builder builder = RequestDefinition.builder("GET", "/calls/1/conferences")
                .requiresAuthentication(true)
                .accept("application/json");

        if (name != null) {
            builder.addQueryParameter(new Parameter("name", name));
        }
        if (callId != null) {
            builder.addQueryParameter(new Parameter("callId", callId));
        }
        if (applicationId != null) {
            builder.addQueryParameter(new Parameter("applicationId", applicationId));
        }
        if (startTimeAfter != null) {
            builder.addQueryParameter(new Parameter("startTimeAfter", startTimeAfter));
        }
        if (page != null) {
            builder.addQueryParameter(new Parameter("page", page));
        }
        if (size != null) {
            builder.addQueryParameter(new Parameter("size", size));
        }
        return builder.build();
    }

    /**
     * getConferences request builder class.
     */
    public class GetConferencesRequest {
        private String name;
        private String callId;
        private String applicationId;
        private OffsetDateTime startTimeAfter;
        private Integer page;
        private Integer size;

        private GetConferencesRequest() {}

        /**
         * Sets name.
         *
         * @param name Conference name. (optional)
         * @return GetConferencesRequest
         */
        public GetConferencesRequest name(String name) {
            this.name = name;
            return this;
        }

        /**
         * Sets callId.
         *
         * @param callId Call ID. (optional)
         * @return GetConferencesRequest
         */
        public GetConferencesRequest callId(String callId) {
            this.callId = callId;
            return this;
        }

        /**
         * Sets applicationId.
         *
         * @param applicationId Application ID. (optional)
         * @return GetConferencesRequest
         */
        public GetConferencesRequest applicationId(String applicationId) {
            this.applicationId = applicationId;
            return this;
        }

        /**
         * Sets startTimeAfter.
         *
         * @param startTimeAfter Date and time for when the conference has been created. Has the following format: &#x60;yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSS+ZZZZ&#x60;. (optional)
         * @return GetConferencesRequest
         */
        public GetConferencesRequest startTimeAfter(OffsetDateTime startTimeAfter) {
            this.startTimeAfter = startTimeAfter;
            return this;
        }

        /**
         * Sets page.
         *
         * @param page Results page to retrieve (0..N). (optional, default to 0)
         * @return GetConferencesRequest
         */
        public GetConferencesRequest page(Integer page) {
            this.page = page;
            return this;
        }

        /**
         * Sets size.
         *
         * @param size Number of records per page. (optional, default to 20)
         * @return GetConferencesRequest
         */
        public GetConferencesRequest size(Integer size) {
            this.size = size;
            return this;
        }

        /**
         * Executes the getConferences request.
         *
         * @return CallsConferencePage The deserialized response.
         * @throws ApiException If the API call fails or an error occurs during the request or response processing.
         */
        public CallsConferencePage execute() throws ApiException {
            RequestDefinition getConferencesDefinition =
                    getConferencesDefinition(name, callId, applicationId, startTimeAfter, page, size);
            return apiClient.execute(getConferencesDefinition, new TypeReference<CallsConferencePage>() {}.getType());
        }

        /**
         * Executes the getConferences request asynchronously.
         *
         * @param callback The {@link ApiCallback} to be invoked.
         * @return The {@link okhttp3.Call} associated with the API request.
         */
        public okhttp3.Call executeAsync(ApiCallback<CallsConferencePage> callback) {
            RequestDefinition getConferencesDefinition =
                    getConferencesDefinition(name, callId, applicationId, startTimeAfter, page, size);
            return apiClient.executeAsync(
                    getConferencesDefinition, new TypeReference<CallsConferencePage>() {}.getType(), callback);
        }
    }

    /**
     * Get conferences.
     * <p>
     * Get conferences with pagination.
     *
     * @return GetConferencesRequest
     */
    public GetConferencesRequest getConferences() {
        return new GetConferencesRequest();
    }

    private RequestDefinition getConferencesHistoryDefinition(
            String name,
            String callId,
            String applicationId,
            OffsetDateTime startTimeAfter,
            OffsetDateTime endTimeBefore,
            Integer page,
            Integer size) {
        RequestDefinition.Builder builder = RequestDefinition.builder("GET", "/calls/1/conferences/history")
                .requiresAuthentication(true)
                .accept("application/json");

        if (name != null) {
            builder.addQueryParameter(new Parameter("name", name));
        }
        if (callId != null) {
            builder.addQueryParameter(new Parameter("callId", callId));
        }
        if (applicationId != null) {
            builder.addQueryParameter(new Parameter("applicationId", applicationId));
        }
        if (startTimeAfter != null) {
            builder.addQueryParameter(new Parameter("startTimeAfter", startTimeAfter));
        }
        if (endTimeBefore != null) {
            builder.addQueryParameter(new Parameter("endTimeBefore", endTimeBefore));
        }
        if (page != null) {
            builder.addQueryParameter(new Parameter("page", page));
        }
        if (size != null) {
            builder.addQueryParameter(new Parameter("size", size));
        }
        return builder.build();
    }

    /**
     * getConferencesHistory request builder class.
     */
    public class GetConferencesHistoryRequest {
        private String name;
        private String callId;
        private String applicationId;
        private OffsetDateTime startTimeAfter;
        private OffsetDateTime endTimeBefore;
        private Integer page;
        private Integer size;

        private GetConferencesHistoryRequest() {}

        /**
         * Sets name.
         *
         * @param name Conference name. (optional)
         * @return GetConferencesHistoryRequest
         */
        public GetConferencesHistoryRequest name(String name) {
            this.name = name;
            return this;
        }

        /**
         * Sets callId.
         *
         * @param callId Call ID. (optional)
         * @return GetConferencesHistoryRequest
         */
        public GetConferencesHistoryRequest callId(String callId) {
            this.callId = callId;
            return this;
        }

        /**
         * Sets applicationId.
         *
         * @param applicationId Application ID. (optional)
         * @return GetConferencesHistoryRequest
         */
        public GetConferencesHistoryRequest applicationId(String applicationId) {
            this.applicationId = applicationId;
            return this;
        }

        /**
         * Sets startTimeAfter.
         *
         * @param startTimeAfter Date and time for when the conference has been created. Has the following format: &#x60;yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSS+ZZZZ&#x60;. (optional)
         * @return GetConferencesHistoryRequest
         */
        public GetConferencesHistoryRequest startTimeAfter(OffsetDateTime startTimeAfter) {
            this.startTimeAfter = startTimeAfter;
            return this;
        }

        /**
         * Sets endTimeBefore.
         *
         * @param endTimeBefore Date and time for when the conference has been finished. Has the following format: &#x60;yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSS+ZZZZ&#x60;. (optional)
         * @return GetConferencesHistoryRequest
         */
        public GetConferencesHistoryRequest endTimeBefore(OffsetDateTime endTimeBefore) {
            this.endTimeBefore = endTimeBefore;
            return this;
        }

        /**
         * Sets page.
         *
         * @param page Results page to retrieve (0..N). (optional, default to 0)
         * @return GetConferencesHistoryRequest
         */
        public GetConferencesHistoryRequest page(Integer page) {
            this.page = page;
            return this;
        }

        /**
         * Sets size.
         *
         * @param size Number of records per page. (optional, default to 20)
         * @return GetConferencesHistoryRequest
         */
        public GetConferencesHistoryRequest size(Integer size) {
            this.size = size;
            return this;
        }

        /**
         * Executes the getConferencesHistory request.
         *
         * @return CallsConferenceLogPage The deserialized response.
         * @throws ApiException If the API call fails or an error occurs during the request or response processing.
         */
        public CallsConferenceLogPage execute() throws ApiException {
            RequestDefinition getConferencesHistoryDefinition = getConferencesHistoryDefinition(
                    name, callId, applicationId, startTimeAfter, endTimeBefore, page, size);
            return apiClient.execute(
                    getConferencesHistoryDefinition, new TypeReference<CallsConferenceLogPage>() {}.getType());
        }

        /**
         * Executes the getConferencesHistory request asynchronously.
         *
         * @param callback The {@link ApiCallback} to be invoked.
         * @return The {@link okhttp3.Call} associated with the API request.
         */
        public okhttp3.Call executeAsync(ApiCallback<CallsConferenceLogPage> callback) {
            RequestDefinition getConferencesHistoryDefinition = getConferencesHistoryDefinition(
                    name, callId, applicationId, startTimeAfter, endTimeBefore, page, size);
            return apiClient.executeAsync(
                    getConferencesHistoryDefinition,
                    new TypeReference<CallsConferenceLogPage>() {}.getType(),
                    callback);
        }
    }

    /**
     * Get conferences history.
     * <p>
     * Get conferences history with pagination. Conferences history retention period is 3 months.
     *
     * @return GetConferencesHistoryRequest
     */
    public GetConferencesHistoryRequest getConferencesHistory() {
        return new GetConferencesHistoryRequest();
    }

    private RequestDefinition getConferencesRecordingsDefinition(
            String conferenceId,
            String applicationId,
            String conferenceName,
            String callId,
            OffsetDateTime startTimeAfter,
            OffsetDateTime endTimeBefore,
            Boolean composition,
            Integer page,
            Integer size) {
        RequestDefinition.Builder builder = RequestDefinition.builder("GET", "/calls/1/recordings/conferences")
                .requiresAuthentication(true)
                .accept("application/json");

        if (conferenceId != null) {
            builder.addQueryParameter(new Parameter("conferenceId", conferenceId));
        }
        if (applicationId != null) {
            builder.addQueryParameter(new Parameter("applicationId", applicationId));
        }
        if (conferenceName != null) {
            builder.addQueryParameter(new Parameter("conferenceName", conferenceName));
        }
        if (callId != null) {
            builder.addQueryParameter(new Parameter("callId", callId));
        }
        if (startTimeAfter != null) {
            builder.addQueryParameter(new Parameter("startTimeAfter", startTimeAfter));
        }
        if (endTimeBefore != null) {
            builder.addQueryParameter(new Parameter("endTimeBefore", endTimeBefore));
        }
        if (composition != null) {
            builder.addQueryParameter(new Parameter("composition", composition));
        }
        if (page != null) {
            builder.addQueryParameter(new Parameter("page", page));
        }
        if (size != null) {
            builder.addQueryParameter(new Parameter("size", size));
        }
        return builder.build();
    }

    /**
     * getConferencesRecordings request builder class.
     */
    public class GetConferencesRecordingsRequest {
        private String conferenceId;
        private String applicationId;
        private String conferenceName;
        private String callId;
        private OffsetDateTime startTimeAfter;
        private OffsetDateTime endTimeBefore;
        private Boolean composition;
        private Integer page;
        private Integer size;

        private GetConferencesRecordingsRequest() {}

        /**
         * Sets conferenceId.
         *
         * @param conferenceId Conference ID. (optional)
         * @return GetConferencesRecordingsRequest
         */
        public GetConferencesRecordingsRequest conferenceId(String conferenceId) {
            this.conferenceId = conferenceId;
            return this;
        }

        /**
         * Sets applicationId.
         *
         * @param applicationId Application ID. (optional)
         * @return GetConferencesRecordingsRequest
         */
        public GetConferencesRecordingsRequest applicationId(String applicationId) {
            this.applicationId = applicationId;
            return this;
        }

        /**
         * Sets conferenceName.
         *
         * @param conferenceName Conference name. (optional)
         * @return GetConferencesRecordingsRequest
         */
        public GetConferencesRecordingsRequest conferenceName(String conferenceName) {
            this.conferenceName = conferenceName;
            return this;
        }

        /**
         * Sets callId.
         *
         * @param callId Filter all conference recordings where call ID was included in the recording. (optional)
         * @return GetConferencesRecordingsRequest
         */
        public GetConferencesRecordingsRequest callId(String callId) {
            this.callId = callId;
            return this;
        }

        /**
         * Sets startTimeAfter.
         *
         * @param startTimeAfter Date and time when the (first) conference recording started. (optional)
         * @return GetConferencesRecordingsRequest
         */
        public GetConferencesRecordingsRequest startTimeAfter(OffsetDateTime startTimeAfter) {
            this.startTimeAfter = startTimeAfter;
            return this;
        }

        /**
         * Sets endTimeBefore.
         *
         * @param endTimeBefore Date and time when the (last) conference recording ended. (optional)
         * @return GetConferencesRecordingsRequest
         */
        public GetConferencesRecordingsRequest endTimeBefore(OffsetDateTime endTimeBefore) {
            this.endTimeBefore = endTimeBefore;
            return this;
        }

        /**
         * Sets composition.
         *
         * @param composition Flag indicating whether auto-compose feature was turned on for the recording. (optional)
         * @return GetConferencesRecordingsRequest
         */
        public GetConferencesRecordingsRequest composition(Boolean composition) {
            this.composition = composition;
            return this;
        }

        /**
         * Sets page.
         *
         * @param page Results page to retrieve (0..N). (optional, default to 0)
         * @return GetConferencesRecordingsRequest
         */
        public GetConferencesRecordingsRequest page(Integer page) {
            this.page = page;
            return this;
        }

        /**
         * Sets size.
         *
         * @param size Number of records per page. (optional, default to 20)
         * @return GetConferencesRecordingsRequest
         */
        public GetConferencesRecordingsRequest size(Integer size) {
            this.size = size;
            return this;
        }

        /**
         * Executes the getConferencesRecordings request.
         *
         * @return CallsConferenceRecordingPage The deserialized response.
         * @throws ApiException If the API call fails or an error occurs during the request or response processing.
         */
        public CallsConferenceRecordingPage execute() throws ApiException {
            RequestDefinition getConferencesRecordingsDefinition = getConferencesRecordingsDefinition(
                    conferenceId,
                    applicationId,
                    conferenceName,
                    callId,
                    startTimeAfter,
                    endTimeBefore,
                    composition,
                    page,
                    size);
            return apiClient.execute(
                    getConferencesRecordingsDefinition, new TypeReference<CallsConferenceRecordingPage>() {}.getType());
        }

        /**
         * Executes the getConferencesRecordings request asynchronously.
         *
         * @param callback The {@link ApiCallback} to be invoked.
         * @return The {@link okhttp3.Call} associated with the API request.
         */
        public okhttp3.Call executeAsync(ApiCallback<CallsConferenceRecordingPage> callback) {
            RequestDefinition getConferencesRecordingsDefinition = getConferencesRecordingsDefinition(
                    conferenceId,
                    applicationId,
                    conferenceName,
                    callId,
                    startTimeAfter,
                    endTimeBefore,
                    composition,
                    page,
                    size);
            return apiClient.executeAsync(
                    getConferencesRecordingsDefinition,
                    new TypeReference<CallsConferenceRecordingPage>() {}.getType(),
                    callback);
        }
    }

    /**
     * Get conferences recordings.
     * <p>
     * Get the recordings of conferences with pagination.
     *
     * @return GetConferencesRecordingsRequest
     */
    public GetConferencesRecordingsRequest getConferencesRecordings() {
        return new GetConferencesRecordingsRequest();
    }

    private RequestDefinition getDialogDefinition(String dialogId) {
        RequestDefinition.Builder builder = RequestDefinition.builder("GET", "/calls/1/dialogs/{dialogId}")
                .requiresAuthentication(true)
                .accept("application/json");

        if (dialogId != null) {
            builder.addPathParameter(new Parameter("dialogId", dialogId));
        }
        return builder.build();
    }

    /**
     * getDialog request builder class.
     */
    public class GetDialogRequest {
        private final String dialogId;

        private GetDialogRequest(String dialogId) {
            this.dialogId = Objects.requireNonNull(dialogId, "The required parameter 'dialogId' is missing.");
        }

        /**
         * Executes the getDialog request.
         *
         * @return CallsDialogResponse The deserialized response.
         * @throws ApiException If the API call fails or an error occurs during the request or response processing.
         */
        public CallsDialogResponse execute() throws ApiException {
            RequestDefinition getDialogDefinition = getDialogDefinition(dialogId);
            return apiClient.execute(getDialogDefinition, new TypeReference<CallsDialogResponse>() {}.getType());
        }

        /**
         * Executes the getDialog request asynchronously.
         *
         * @param callback The {@link ApiCallback} to be invoked.
         * @return The {@link okhttp3.Call} associated with the API request.
         */
        public okhttp3.Call executeAsync(ApiCallback<CallsDialogResponse> callback) {
            RequestDefinition getDialogDefinition = getDialogDefinition(dialogId);
            return apiClient.executeAsync(
                    getDialogDefinition, new TypeReference<CallsDialogResponse>() {}.getType(), callback);
        }
    }

    /**
     * Get dialog.
     * <p>
     * Get a single dialog.
     *
     * @param dialogId Dialog ID. (required)
     * @return GetDialogRequest
     */
    public GetDialogRequest getDialog(String dialogId) {
        return new GetDialogRequest(dialogId);
    }

    private RequestDefinition getDialogHistoryDefinition(String dialogId) {
        RequestDefinition.Builder builder = RequestDefinition.builder("GET", "/calls/1/dialogs/{dialogId}/history")
                .requiresAuthentication(true)
                .accept("application/json");

        if (dialogId != null) {
            builder.addPathParameter(new Parameter("dialogId", dialogId));
        }
        return builder.build();
    }

    /**
     * getDialogHistory request builder class.
     */
    public class GetDialogHistoryRequest {
        private final String dialogId;

        private GetDialogHistoryRequest(String dialogId) {
            this.dialogId = Objects.requireNonNull(dialogId, "The required parameter 'dialogId' is missing.");
        }

        /**
         * Executes the getDialogHistory request.
         *
         * @return CallsDialogLogResponse The deserialized response.
         * @throws ApiException If the API call fails or an error occurs during the request or response processing.
         */
        public CallsDialogLogResponse execute() throws ApiException {
            RequestDefinition getDialogHistoryDefinition = getDialogHistoryDefinition(dialogId);
            return apiClient.execute(
                    getDialogHistoryDefinition, new TypeReference<CallsDialogLogResponse>() {}.getType());
        }

        /**
         * Executes the getDialogHistory request asynchronously.
         *
         * @param callback The {@link ApiCallback} to be invoked.
         * @return The {@link okhttp3.Call} associated with the API request.
         */
        public okhttp3.Call executeAsync(ApiCallback<CallsDialogLogResponse> callback) {
            RequestDefinition getDialogHistoryDefinition = getDialogHistoryDefinition(dialogId);
            return apiClient.executeAsync(
                    getDialogHistoryDefinition, new TypeReference<CallsDialogLogResponse>() {}.getType(), callback);
        }
    }

    /**
     * Get dialog history.
     * <p>
     * Get a single dialog history. Dialog history retention period is 3 months.
     *
     * @param dialogId Dialog ID. (required)
     * @return GetDialogHistoryRequest
     */
    public GetDialogHistoryRequest getDialogHistory(String dialogId) {
        return new GetDialogHistoryRequest(dialogId);
    }

    private RequestDefinition getDialogRecordingsDefinition(String dialogId) {
        RequestDefinition.Builder builder = RequestDefinition.builder("GET", "/calls/1/recordings/dialogs/{dialogId}")
                .requiresAuthentication(true)
                .accept("application/json");

        if (dialogId != null) {
            builder.addPathParameter(new Parameter("dialogId", dialogId));
        }
        return builder.build();
    }

    /**
     * getDialogRecordings request builder class.
     */
    public class GetDialogRecordingsRequest {
        private final String dialogId;

        private GetDialogRecordingsRequest(String dialogId) {
            this.dialogId = Objects.requireNonNull(dialogId, "The required parameter 'dialogId' is missing.");
        }

        /**
         * Executes the getDialogRecordings request.
         *
         * @return CallsDialogRecordingResponse The deserialized response.
         * @throws ApiException If the API call fails or an error occurs during the request or response processing.
         */
        public CallsDialogRecordingResponse execute() throws ApiException {
            RequestDefinition getDialogRecordingsDefinition = getDialogRecordingsDefinition(dialogId);
            return apiClient.execute(
                    getDialogRecordingsDefinition, new TypeReference<CallsDialogRecordingResponse>() {}.getType());
        }

        /**
         * Executes the getDialogRecordings request asynchronously.
         *
         * @param callback The {@link ApiCallback} to be invoked.
         * @return The {@link okhttp3.Call} associated with the API request.
         */
        public okhttp3.Call executeAsync(ApiCallback<CallsDialogRecordingResponse> callback) {
            RequestDefinition getDialogRecordingsDefinition = getDialogRecordingsDefinition(dialogId);
            return apiClient.executeAsync(
                    getDialogRecordingsDefinition,
                    new TypeReference<CallsDialogRecordingResponse>() {}.getType(),
                    callback);
        }
    }

    /**
     * Get dialog recordings.
     * <p>
     * Get the recordings for a single dialog.
     *
     * @param dialogId Dialog ID. (required)
     * @return GetDialogRecordingsRequest
     */
    public GetDialogRecordingsRequest getDialogRecordings(String dialogId) {
        return new GetDialogRecordingsRequest(dialogId);
    }

    private RequestDefinition getDialogsDefinition(
            String applicationId,
            CallsDialogState state,
            String parentCallId,
            String childCallId,
            OffsetDateTime startTimeAfter,
            Integer page,
            Integer size) {
        RequestDefinition.Builder builder = RequestDefinition.builder("GET", "/calls/1/dialogs")
                .requiresAuthentication(true)
                .accept("application/json");

        if (applicationId != null) {
            builder.addQueryParameter(new Parameter("applicationId", applicationId));
        }
        if (state != null) {
            builder.addQueryParameter(new Parameter("state", state));
        }
        if (parentCallId != null) {
            builder.addQueryParameter(new Parameter("parentCallId", parentCallId));
        }
        if (childCallId != null) {
            builder.addQueryParameter(new Parameter("childCallId", childCallId));
        }
        if (startTimeAfter != null) {
            builder.addQueryParameter(new Parameter("startTimeAfter", startTimeAfter));
        }
        if (page != null) {
            builder.addQueryParameter(new Parameter("page", page));
        }
        if (size != null) {
            builder.addQueryParameter(new Parameter("size", size));
        }
        return builder.build();
    }

    /**
     * getDialogs request builder class.
     */
    public class GetDialogsRequest {
        private String applicationId;
        private CallsDialogState state;
        private String parentCallId;
        private String childCallId;
        private OffsetDateTime startTimeAfter;
        private Integer page;
        private Integer size;

        private GetDialogsRequest() {}

        /**
         * Sets applicationId.
         *
         * @param applicationId Application ID. (optional)
         * @return GetDialogsRequest
         */
        public GetDialogsRequest applicationId(String applicationId) {
            this.applicationId = applicationId;
            return this;
        }

        /**
         * Sets state.
         *
         * @param state Dialog state. (optional)
         * @return GetDialogsRequest
         */
        public GetDialogsRequest state(CallsDialogState state) {
            this.state = state;
            return this;
        }

        /**
         * Sets parentCallId.
         *
         * @param parentCallId Parent call ID. (optional)
         * @return GetDialogsRequest
         */
        public GetDialogsRequest parentCallId(String parentCallId) {
            this.parentCallId = parentCallId;
            return this;
        }

        /**
         * Sets childCallId.
         *
         * @param childCallId Child call ID. (optional)
         * @return GetDialogsRequest
         */
        public GetDialogsRequest childCallId(String childCallId) {
            this.childCallId = childCallId;
            return this;
        }

        /**
         * Sets startTimeAfter.
         *
         * @param startTimeAfter Date and time for when the dialog has been created. Has the following format: &#x60;yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSS+ZZZZ&#x60;. (optional)
         * @return GetDialogsRequest
         */
        public GetDialogsRequest startTimeAfter(OffsetDateTime startTimeAfter) {
            this.startTimeAfter = startTimeAfter;
            return this;
        }

        /**
         * Sets page.
         *
         * @param page Results page to retrieve (0..N). (optional, default to 0)
         * @return GetDialogsRequest
         */
        public GetDialogsRequest page(Integer page) {
            this.page = page;
            return this;
        }

        /**
         * Sets size.
         *
         * @param size Number of records per page. (optional, default to 20)
         * @return GetDialogsRequest
         */
        public GetDialogsRequest size(Integer size) {
            this.size = size;
            return this;
        }

        /**
         * Executes the getDialogs request.
         *
         * @return CallsDialogPage The deserialized response.
         * @throws ApiException If the API call fails or an error occurs during the request or response processing.
         */
        public CallsDialogPage execute() throws ApiException {
            RequestDefinition getDialogsDefinition =
                    getDialogsDefinition(applicationId, state, parentCallId, childCallId, startTimeAfter, page, size);
            return apiClient.execute(getDialogsDefinition, new TypeReference<CallsDialogPage>() {}.getType());
        }

        /**
         * Executes the getDialogs request asynchronously.
         *
         * @param callback The {@link ApiCallback} to be invoked.
         * @return The {@link okhttp3.Call} associated with the API request.
         */
        public okhttp3.Call executeAsync(ApiCallback<CallsDialogPage> callback) {
            RequestDefinition getDialogsDefinition =
                    getDialogsDefinition(applicationId, state, parentCallId, childCallId, startTimeAfter, page, size);
            return apiClient.executeAsync(
                    getDialogsDefinition, new TypeReference<CallsDialogPage>() {}.getType(), callback);
        }
    }

    /**
     * Get dialogs.
     * <p>
     * Get dialogs with pagination.
     *
     * @return GetDialogsRequest
     */
    public GetDialogsRequest getDialogs() {
        return new GetDialogsRequest();
    }

    private RequestDefinition getDialogsHistoryDefinition(
            String applicationId,
            CallsDialogState state,
            String parentCallId,
            String childCallId,
            OffsetDateTime startTimeAfter,
            OffsetDateTime endTimeBefore,
            Integer page,
            Integer size) {
        RequestDefinition.Builder builder = RequestDefinition.builder("GET", "/calls/1/dialogs/history")
                .requiresAuthentication(true)
                .accept("application/json");

        if (applicationId != null) {
            builder.addQueryParameter(new Parameter("applicationId", applicationId));
        }
        if (state != null) {
            builder.addQueryParameter(new Parameter("state", state));
        }
        if (parentCallId != null) {
            builder.addQueryParameter(new Parameter("parentCallId", parentCallId));
        }
        if (childCallId != null) {
            builder.addQueryParameter(new Parameter("childCallId", childCallId));
        }
        if (startTimeAfter != null) {
            builder.addQueryParameter(new Parameter("startTimeAfter", startTimeAfter));
        }
        if (endTimeBefore != null) {
            builder.addQueryParameter(new Parameter("endTimeBefore", endTimeBefore));
        }
        if (page != null) {
            builder.addQueryParameter(new Parameter("page", page));
        }
        if (size != null) {
            builder.addQueryParameter(new Parameter("size", size));
        }
        return builder.build();
    }

    /**
     * getDialogsHistory request builder class.
     */
    public class GetDialogsHistoryRequest {
        private String applicationId;
        private CallsDialogState state;
        private String parentCallId;
        private String childCallId;
        private OffsetDateTime startTimeAfter;
        private OffsetDateTime endTimeBefore;
        private Integer page;
        private Integer size;

        private GetDialogsHistoryRequest() {}

        /**
         * Sets applicationId.
         *
         * @param applicationId Application ID. (optional)
         * @return GetDialogsHistoryRequest
         */
        public GetDialogsHistoryRequest applicationId(String applicationId) {
            this.applicationId = applicationId;
            return this;
        }

        /**
         * Sets state.
         *
         * @param state Dialog state. (optional)
         * @return GetDialogsHistoryRequest
         */
        public GetDialogsHistoryRequest state(CallsDialogState state) {
            this.state = state;
            return this;
        }

        /**
         * Sets parentCallId.
         *
         * @param parentCallId Parent call ID. (optional)
         * @return GetDialogsHistoryRequest
         */
        public GetDialogsHistoryRequest parentCallId(String parentCallId) {
            this.parentCallId = parentCallId;
            return this;
        }

        /**
         * Sets childCallId.
         *
         * @param childCallId Child call ID. (optional)
         * @return GetDialogsHistoryRequest
         */
        public GetDialogsHistoryRequest childCallId(String childCallId) {
            this.childCallId = childCallId;
            return this;
        }

        /**
         * Sets startTimeAfter.
         *
         * @param startTimeAfter Date and time for when the dialog has been created. Has the following format: &#x60;yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSS+ZZZZ&#x60;. (optional)
         * @return GetDialogsHistoryRequest
         */
        public GetDialogsHistoryRequest startTimeAfter(OffsetDateTime startTimeAfter) {
            this.startTimeAfter = startTimeAfter;
            return this;
        }

        /**
         * Sets endTimeBefore.
         *
         * @param endTimeBefore Date and time for when the dialog has been finished. Has the following format: &#x60;yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSS+ZZZZ&#x60;. (optional)
         * @return GetDialogsHistoryRequest
         */
        public GetDialogsHistoryRequest endTimeBefore(OffsetDateTime endTimeBefore) {
            this.endTimeBefore = endTimeBefore;
            return this;
        }

        /**
         * Sets page.
         *
         * @param page Results page to retrieve (0..N). (optional, default to 0)
         * @return GetDialogsHistoryRequest
         */
        public GetDialogsHistoryRequest page(Integer page) {
            this.page = page;
            return this;
        }

        /**
         * Sets size.
         *
         * @param size Number of records per page. (optional, default to 20)
         * @return GetDialogsHistoryRequest
         */
        public GetDialogsHistoryRequest size(Integer size) {
            this.size = size;
            return this;
        }

        /**
         * Executes the getDialogsHistory request.
         *
         * @return CallsDialogLogPage The deserialized response.
         * @throws ApiException If the API call fails or an error occurs during the request or response processing.
         */
        public CallsDialogLogPage execute() throws ApiException {
            RequestDefinition getDialogsHistoryDefinition = getDialogsHistoryDefinition(
                    applicationId, state, parentCallId, childCallId, startTimeAfter, endTimeBefore, page, size);
            return apiClient.execute(getDialogsHistoryDefinition, new TypeReference<CallsDialogLogPage>() {}.getType());
        }

        /**
         * Executes the getDialogsHistory request asynchronously.
         *
         * @param callback The {@link ApiCallback} to be invoked.
         * @return The {@link okhttp3.Call} associated with the API request.
         */
        public okhttp3.Call executeAsync(ApiCallback<CallsDialogLogPage> callback) {
            RequestDefinition getDialogsHistoryDefinition = getDialogsHistoryDefinition(
                    applicationId, state, parentCallId, childCallId, startTimeAfter, endTimeBefore, page, size);
            return apiClient.executeAsync(
                    getDialogsHistoryDefinition, new TypeReference<CallsDialogLogPage>() {}.getType(), callback);
        }
    }

    /**
     * Get dialogs history.
     * <p>
     * Get dialogs history with pagination. Dialogs history retention period is 3 months.
     *
     * @return GetDialogsHistoryRequest
     */
    public GetDialogsHistoryRequest getDialogsHistory() {
        return new GetDialogsHistoryRequest();
    }

    private RequestDefinition getDialogsRecordingsDefinition(
            String dialogId,
            String applicationId,
            String callId,
            OffsetDateTime startTimeAfter,
            OffsetDateTime endTimeBefore,
            Boolean composition,
            Integer page,
            Integer size) {
        RequestDefinition.Builder builder = RequestDefinition.builder("GET", "/calls/1/recordings/dialogs")
                .requiresAuthentication(true)
                .accept("application/json");

        if (dialogId != null) {
            builder.addQueryParameter(new Parameter("dialogId", dialogId));
        }
        if (applicationId != null) {
            builder.addQueryParameter(new Parameter("applicationId", applicationId));
        }
        if (callId != null) {
            builder.addQueryParameter(new Parameter("callId", callId));
        }
        if (startTimeAfter != null) {
            builder.addQueryParameter(new Parameter("startTimeAfter", startTimeAfter));
        }
        if (endTimeBefore != null) {
            builder.addQueryParameter(new Parameter("endTimeBefore", endTimeBefore));
        }
        if (composition != null) {
            builder.addQueryParameter(new Parameter("composition", composition));
        }
        if (page != null) {
            builder.addQueryParameter(new Parameter("page", page));
        }
        if (size != null) {
            builder.addQueryParameter(new Parameter("size", size));
        }
        return builder.build();
    }

    /**
     * getDialogsRecordings request builder class.
     */
    public class GetDialogsRecordingsRequest {
        private String dialogId;
        private String applicationId;
        private String callId;
        private OffsetDateTime startTimeAfter;
        private OffsetDateTime endTimeBefore;
        private Boolean composition;
        private Integer page;
        private Integer size;

        private GetDialogsRecordingsRequest() {}

        /**
         * Sets dialogId.
         *
         * @param dialogId Dialog ID. (optional)
         * @return GetDialogsRecordingsRequest
         */
        public GetDialogsRecordingsRequest dialogId(String dialogId) {
            this.dialogId = dialogId;
            return this;
        }

        /**
         * Sets applicationId.
         *
         * @param applicationId Application ID. (optional)
         * @return GetDialogsRecordingsRequest
         */
        public GetDialogsRecordingsRequest applicationId(String applicationId) {
            this.applicationId = applicationId;
            return this;
        }

        /**
         * Sets callId.
         *
         * @param callId Filter all dialog recordings where call ID was included in the recording. (optional)
         * @return GetDialogsRecordingsRequest
         */
        public GetDialogsRecordingsRequest callId(String callId) {
            this.callId = callId;
            return this;
        }

        /**
         * Sets startTimeAfter.
         *
         * @param startTimeAfter Date and time when the (first) dialog recording started. (optional)
         * @return GetDialogsRecordingsRequest
         */
        public GetDialogsRecordingsRequest startTimeAfter(OffsetDateTime startTimeAfter) {
            this.startTimeAfter = startTimeAfter;
            return this;
        }

        /**
         * Sets endTimeBefore.
         *
         * @param endTimeBefore Date and time when the (last) dialog recording ended. (optional)
         * @return GetDialogsRecordingsRequest
         */
        public GetDialogsRecordingsRequest endTimeBefore(OffsetDateTime endTimeBefore) {
            this.endTimeBefore = endTimeBefore;
            return this;
        }

        /**
         * Sets composition.
         *
         * @param composition Flag indicating whether auto-compose feature was turned on for the recording. (optional)
         * @return GetDialogsRecordingsRequest
         */
        public GetDialogsRecordingsRequest composition(Boolean composition) {
            this.composition = composition;
            return this;
        }

        /**
         * Sets page.
         *
         * @param page Results page to retrieve (0..N). (optional, default to 0)
         * @return GetDialogsRecordingsRequest
         */
        public GetDialogsRecordingsRequest page(Integer page) {
            this.page = page;
            return this;
        }

        /**
         * Sets size.
         *
         * @param size Number of records per page. (optional, default to 20)
         * @return GetDialogsRecordingsRequest
         */
        public GetDialogsRecordingsRequest size(Integer size) {
            this.size = size;
            return this;
        }

        /**
         * Executes the getDialogsRecordings request.
         *
         * @return CallsDialogRecordingPage The deserialized response.
         * @throws ApiException If the API call fails or an error occurs during the request or response processing.
         */
        public CallsDialogRecordingPage execute() throws ApiException {
            RequestDefinition getDialogsRecordingsDefinition = getDialogsRecordingsDefinition(
                    dialogId, applicationId, callId, startTimeAfter, endTimeBefore, composition, page, size);
            return apiClient.execute(
                    getDialogsRecordingsDefinition, new TypeReference<CallsDialogRecordingPage>() {}.getType());
        }

        /**
         * Executes the getDialogsRecordings request asynchronously.
         *
         * @param callback The {@link ApiCallback} to be invoked.
         * @return The {@link okhttp3.Call} associated with the API request.
         */
        public okhttp3.Call executeAsync(ApiCallback<CallsDialogRecordingPage> callback) {
            RequestDefinition getDialogsRecordingsDefinition = getDialogsRecordingsDefinition(
                    dialogId, applicationId, callId, startTimeAfter, endTimeBefore, composition, page, size);
            return apiClient.executeAsync(
                    getDialogsRecordingsDefinition,
                    new TypeReference<CallsDialogRecordingPage>() {}.getType(),
                    callback);
        }
    }

    /**
     * Get dialogs recordings.
     * <p>
     * Get the recordings of dialogs with pagination.
     *
     * @return GetDialogsRecordingsRequest
     */
    public GetDialogsRecordingsRequest getDialogsRecordings() {
        return new GetDialogsRecordingsRequest();
    }

    private RequestDefinition getMediaStreamConfigDefinition(String mediaStreamConfigId) {
        RequestDefinition.Builder builder = RequestDefinition.builder(
                        "GET", "/calls/1/media-stream-configs/{mediaStreamConfigId}")
                .requiresAuthentication(true)
                .accept("application/json");

        if (mediaStreamConfigId != null) {
            builder.addPathParameter(new Parameter("mediaStreamConfigId", mediaStreamConfigId));
        }
        return builder.build();
    }

    /**
     * getMediaStreamConfig request builder class.
     */
    public class GetMediaStreamConfigRequest {
        private final String mediaStreamConfigId;

        private GetMediaStreamConfigRequest(String mediaStreamConfigId) {
            this.mediaStreamConfigId = Objects.requireNonNull(
                    mediaStreamConfigId, "The required parameter 'mediaStreamConfigId' is missing.");
        }

        /**
         * Executes the getMediaStreamConfig request.
         *
         * @return CallsMediaStreamConfigResponse The deserialized response.
         * @throws ApiException If the API call fails or an error occurs during the request or response processing.
         */
        public CallsMediaStreamConfigResponse execute() throws ApiException {
            RequestDefinition getMediaStreamConfigDefinition = getMediaStreamConfigDefinition(mediaStreamConfigId);
            return apiClient.execute(
                    getMediaStreamConfigDefinition, new TypeReference<CallsMediaStreamConfigResponse>() {}.getType());
        }

        /**
         * Executes the getMediaStreamConfig request asynchronously.
         *
         * @param callback The {@link ApiCallback} to be invoked.
         * @return The {@link okhttp3.Call} associated with the API request.
         */
        public okhttp3.Call executeAsync(ApiCallback<CallsMediaStreamConfigResponse> callback) {
            RequestDefinition getMediaStreamConfigDefinition = getMediaStreamConfigDefinition(mediaStreamConfigId);
            return apiClient.executeAsync(
                    getMediaStreamConfigDefinition,
                    new TypeReference<CallsMediaStreamConfigResponse>() {}.getType(),
                    callback);
        }
    }

    /**
     * Get media-stream configuration.
     * <p>
     * Get a single media-stream configuration.
     *
     * @param mediaStreamConfigId Media-stream configuration ID. (required)
     * @return GetMediaStreamConfigRequest
     */
    public GetMediaStreamConfigRequest getMediaStreamConfig(String mediaStreamConfigId) {
        return new GetMediaStreamConfigRequest(mediaStreamConfigId);
    }

    private RequestDefinition getMediaStreamConfigsDefinition(Integer page, Integer size) {
        RequestDefinition.Builder builder = RequestDefinition.builder("GET", "/calls/1/media-stream-configs")
                .requiresAuthentication(true)
                .accept("application/json");

        if (page != null) {
            builder.addQueryParameter(new Parameter("page", page));
        }
        if (size != null) {
            builder.addQueryParameter(new Parameter("size", size));
        }
        return builder.build();
    }

    /**
     * getMediaStreamConfigs request builder class.
     */
    public class GetMediaStreamConfigsRequest {
        private Integer page;
        private Integer size;

        private GetMediaStreamConfigsRequest() {}

        /**
         * Sets page.
         *
         * @param page Results page to retrieve (0..N). (optional, default to 0)
         * @return GetMediaStreamConfigsRequest
         */
        public GetMediaStreamConfigsRequest page(Integer page) {
            this.page = page;
            return this;
        }

        /**
         * Sets size.
         *
         * @param size Number of records per page. (optional, default to 20)
         * @return GetMediaStreamConfigsRequest
         */
        public GetMediaStreamConfigsRequest size(Integer size) {
            this.size = size;
            return this;
        }

        /**
         * Executes the getMediaStreamConfigs request.
         *
         * @return CallsMediaStreamConfigPage The deserialized response.
         * @throws ApiException If the API call fails or an error occurs during the request or response processing.
         */
        public CallsMediaStreamConfigPage execute() throws ApiException {
            RequestDefinition getMediaStreamConfigsDefinition = getMediaStreamConfigsDefinition(page, size);
            return apiClient.execute(
                    getMediaStreamConfigsDefinition, new TypeReference<CallsMediaStreamConfigPage>() {}.getType());
        }

        /**
         * Executes the getMediaStreamConfigs request asynchronously.
         *
         * @param callback The {@link ApiCallback} to be invoked.
         * @return The {@link okhttp3.Call} associated with the API request.
         */
        public okhttp3.Call executeAsync(ApiCallback<CallsMediaStreamConfigPage> callback) {
            RequestDefinition getMediaStreamConfigsDefinition = getMediaStreamConfigsDefinition(page, size);
            return apiClient.executeAsync(
                    getMediaStreamConfigsDefinition,
                    new TypeReference<CallsMediaStreamConfigPage>() {}.getType(),
                    callback);
        }
    }

    /**
     * Get media-stream configs.
     * <p>
     * Get media-stream configs.
     *
     * @return GetMediaStreamConfigsRequest
     */
    public GetMediaStreamConfigsRequest getMediaStreamConfigs() {
        return new GetMediaStreamConfigsRequest();
    }

    private RequestDefinition hangupCallDefinition(String callId, CallsHangupRequest callsHangupRequest) {
        RequestDefinition.Builder builder = RequestDefinition.builder("POST", "/calls/1/calls/{callId}/hangup")
                .body(callsHangupRequest)
                .requiresAuthentication(true)
                .accept("application/json")
                .contentType("application/json");

        if (callId != null) {
            builder.addPathParameter(new Parameter("callId", callId));
        }
        return builder.build();
    }

    /**
     * hangupCall request builder class.
     */
    public class HangupCallRequest {
        private final String callId;
        private final CallsHangupRequest callsHangupRequest;

        private HangupCallRequest(String callId, CallsHangupRequest callsHangupRequest) {
            this.callId = Objects.requireNonNull(callId, "The required parameter 'callId' is missing.");
            this.callsHangupRequest = Objects.requireNonNull(
                    callsHangupRequest, "The required parameter 'callsHangupRequest' is missing.");
        }

        /**
         * Executes the hangupCall request.
         *
         * @return Call The deserialized response.
         * @throws ApiException If the API call fails or an error occurs during the request or response processing.
         */
        public Call execute() throws ApiException {
            RequestDefinition hangupCallDefinition = hangupCallDefinition(callId, callsHangupRequest);
            return apiClient.execute(hangupCallDefinition, new TypeReference<Call>() {}.getType());
        }

        /**
         * Executes the hangupCall request asynchronously.
         *
         * @param callback The {@link ApiCallback} to be invoked.
         * @return The {@link okhttp3.Call} associated with the API request.
         */
        public okhttp3.Call executeAsync(ApiCallback<Call> callback) {
            RequestDefinition hangupCallDefinition = hangupCallDefinition(callId, callsHangupRequest);
            return apiClient.executeAsync(hangupCallDefinition, new TypeReference<Call>() {}.getType(), callback);
        }
    }

    /**
     * Hangup.
     * <p>
     * Hang up a call.
     *
     * @param callId Call ID. (required)
     * @param callsHangupRequest  (required)
     * @return HangupCallRequest
     */
    public HangupCallRequest hangupCall(String callId, CallsHangupRequest callsHangupRequest) {
        return new HangupCallRequest(callId, callsHangupRequest);
    }

    private RequestDefinition hangupConferenceDefinition(String conferenceId) {
        RequestDefinition.Builder builder = RequestDefinition.builder(
                        "POST", "/calls/1/conferences/{conferenceId}/hangup")
                .requiresAuthentication(true)
                .accept("application/json");

        if (conferenceId != null) {
            builder.addPathParameter(new Parameter("conferenceId", conferenceId));
        }
        return builder.build();
    }

    /**
     * hangupConference request builder class.
     */
    public class HangupConferenceRequest {
        private final String conferenceId;

        private HangupConferenceRequest(String conferenceId) {
            this.conferenceId =
                    Objects.requireNonNull(conferenceId, "The required parameter 'conferenceId' is missing.");
        }

        /**
         * Executes the hangupConference request.
         *
         * @return CallsConference The deserialized response.
         * @throws ApiException If the API call fails or an error occurs during the request or response processing.
         */
        public CallsConference execute() throws ApiException {
            RequestDefinition hangupConferenceDefinition = hangupConferenceDefinition(conferenceId);
            return apiClient.execute(hangupConferenceDefinition, new TypeReference<CallsConference>() {}.getType());
        }

        /**
         * Executes the hangupConference request asynchronously.
         *
         * @param callback The {@link ApiCallback} to be invoked.
         * @return The {@link okhttp3.Call} associated with the API request.
         */
        public okhttp3.Call executeAsync(ApiCallback<CallsConference> callback) {
            RequestDefinition hangupConferenceDefinition = hangupConferenceDefinition(conferenceId);
            return apiClient.executeAsync(
                    hangupConferenceDefinition, new TypeReference<CallsConference>() {}.getType(), callback);
        }
    }

    /**
     * Hangup conference.
     * <p>
     * Hang up a conference. This action also hangs up all calls in the conference.
     *
     * @param conferenceId Conference ID. (required)
     * @return HangupConferenceRequest
     */
    public HangupConferenceRequest hangupConference(String conferenceId) {
        return new HangupConferenceRequest(conferenceId);
    }

    private RequestDefinition hangupDialogDefinition(String dialogId) {
        RequestDefinition.Builder builder = RequestDefinition.builder("POST", "/calls/1/dialogs/{dialogId}/hangup")
                .requiresAuthentication(true)
                .accept("application/json");

        if (dialogId != null) {
            builder.addPathParameter(new Parameter("dialogId", dialogId));
        }
        return builder.build();
    }

    /**
     * hangupDialog request builder class.
     */
    public class HangupDialogRequest {
        private final String dialogId;

        private HangupDialogRequest(String dialogId) {
            this.dialogId = Objects.requireNonNull(dialogId, "The required parameter 'dialogId' is missing.");
        }

        /**
         * Executes the hangupDialog request.
         *
         * @return CallsDialogResponse The deserialized response.
         * @throws ApiException If the API call fails or an error occurs during the request or response processing.
         */
        public CallsDialogResponse execute() throws ApiException {
            RequestDefinition hangupDialogDefinition = hangupDialogDefinition(dialogId);
            return apiClient.execute(hangupDialogDefinition, new TypeReference<CallsDialogResponse>() {}.getType());
        }

        /**
         * Executes the hangupDialog request asynchronously.
         *
         * @param callback The {@link ApiCallback} to be invoked.
         * @return The {@link okhttp3.Call} associated with the API request.
         */
        public okhttp3.Call executeAsync(ApiCallback<CallsDialogResponse> callback) {
            RequestDefinition hangupDialogDefinition = hangupDialogDefinition(dialogId);
            return apiClient.executeAsync(
                    hangupDialogDefinition, new TypeReference<CallsDialogResponse>() {}.getType(), callback);
        }
    }

    /**
     * Hangup dialog.
     * <p>
     * Hang up a dialog. This action also hangs up all calls in the dialog.
     *
     * @param dialogId Dialog ID. (required)
     * @return HangupDialogRequest
     */
    public HangupDialogRequest hangupDialog(String dialogId) {
        return new HangupDialogRequest(dialogId);
    }

    private RequestDefinition pauseBulkDefinition(String bulkId) {
        RequestDefinition.Builder builder = RequestDefinition.builder("POST", "/calls/1/bulks/{bulkId}/pause")
                .requiresAuthentication(true)
                .accept("application/json");

        if (bulkId != null) {
            builder.addPathParameter(new Parameter("bulkId", bulkId));
        }
        return builder.build();
    }

    /**
     * pauseBulk request builder class.
     */
    public class PauseBulkRequest {
        private final String bulkId;

        private PauseBulkRequest(String bulkId) {
            this.bulkId = Objects.requireNonNull(bulkId, "The required parameter 'bulkId' is missing.");
        }

        /**
         * Executes the pauseBulk request.
         *
         * @return CallBulkStatus The deserialized response.
         * @throws ApiException If the API call fails or an error occurs during the request or response processing.
         */
        public CallBulkStatus execute() throws ApiException {
            RequestDefinition pauseBulkDefinition = pauseBulkDefinition(bulkId);
            return apiClient.execute(pauseBulkDefinition, new TypeReference<CallBulkStatus>() {}.getType());
        }

        /**
         * Executes the pauseBulk request asynchronously.
         *
         * @param callback The {@link ApiCallback} to be invoked.
         * @return The {@link okhttp3.Call} associated with the API request.
         */
        public okhttp3.Call executeAsync(ApiCallback<CallBulkStatus> callback) {
            RequestDefinition pauseBulkDefinition = pauseBulkDefinition(bulkId);
            return apiClient.executeAsync(
                    pauseBulkDefinition, new TypeReference<CallBulkStatus>() {}.getType(), callback);
        }
    }

    /**
     * Pause.
     * <p>
     * Pause a bulk.
     *
     * @param bulkId Bulk ID. (required)
     * @return PauseBulkRequest
     */
    public PauseBulkRequest pauseBulk(String bulkId) {
        return new PauseBulkRequest(bulkId);
    }

    private RequestDefinition preAnswerCallDefinition(String callId) {
        RequestDefinition.Builder builder = RequestDefinition.builder("POST", "/calls/1/calls/{callId}/pre-answer")
                .requiresAuthentication(true)
                .accept("application/json");

        if (callId != null) {
            builder.addPathParameter(new Parameter("callId", callId));
        }
        return builder.build();
    }

    /**
     * preAnswerCall request builder class.
     */
    public class PreAnswerCallRequest {
        private final String callId;

        private PreAnswerCallRequest(String callId) {
            this.callId = Objects.requireNonNull(callId, "The required parameter 'callId' is missing.");
        }

        /**
         * Executes the preAnswerCall request.
         *
         * @return CallsActionResponse The deserialized response.
         * @throws ApiException If the API call fails or an error occurs during the request or response processing.
         */
        public CallsActionResponse execute() throws ApiException {
            RequestDefinition preAnswerCallDefinition = preAnswerCallDefinition(callId);
            return apiClient.execute(preAnswerCallDefinition, new TypeReference<CallsActionResponse>() {}.getType());
        }

        /**
         * Executes the preAnswerCall request asynchronously.
         *
         * @param callback The {@link ApiCallback} to be invoked.
         * @return The {@link okhttp3.Call} associated with the API request.
         */
        public okhttp3.Call executeAsync(ApiCallback<CallsActionResponse> callback) {
            RequestDefinition preAnswerCallDefinition = preAnswerCallDefinition(callId);
            return apiClient.executeAsync(
                    preAnswerCallDefinition, new TypeReference<CallsActionResponse>() {}.getType(), callback);
        }
    }

    /**
     * Pre-answer.
     * <p>
     * Pre-answer a call to handle early media.
     *
     * @param callId Call ID. (required)
     * @return PreAnswerCallRequest
     */
    public PreAnswerCallRequest preAnswerCall(String callId) {
        return new PreAnswerCallRequest(callId);
    }

    private RequestDefinition removeConferenceCallDefinition(String conferenceId, String callId) {
        RequestDefinition.Builder builder = RequestDefinition.builder(
                        "DELETE", "/calls/1/conferences/{conferenceId}/call/{callId}")
                .requiresAuthentication(true)
                .accept("application/json");

        if (conferenceId != null) {
            builder.addPathParameter(new Parameter("conferenceId", conferenceId));
        }
        if (callId != null) {
            builder.addPathParameter(new Parameter("callId", callId));
        }
        return builder.build();
    }

    /**
     * removeConferenceCall request builder class.
     */
    public class RemoveConferenceCallRequest {
        private final String conferenceId;
        private final String callId;

        private RemoveConferenceCallRequest(String conferenceId, String callId) {
            this.conferenceId =
                    Objects.requireNonNull(conferenceId, "The required parameter 'conferenceId' is missing.");
            this.callId = Objects.requireNonNull(callId, "The required parameter 'callId' is missing.");
        }

        /**
         * Executes the removeConferenceCall request.
         *
         * @return CallsActionResponse The deserialized response.
         * @throws ApiException If the API call fails or an error occurs during the request or response processing.
         */
        public CallsActionResponse execute() throws ApiException {
            RequestDefinition removeConferenceCallDefinition = removeConferenceCallDefinition(conferenceId, callId);
            return apiClient.execute(
                    removeConferenceCallDefinition, new TypeReference<CallsActionResponse>() {}.getType());
        }

        /**
         * Executes the removeConferenceCall request asynchronously.
         *
         * @param callback The {@link ApiCallback} to be invoked.
         * @return The {@link okhttp3.Call} associated with the API request.
         */
        public okhttp3.Call executeAsync(ApiCallback<CallsActionResponse> callback) {
            RequestDefinition removeConferenceCallDefinition = removeConferenceCallDefinition(conferenceId, callId);
            return apiClient.executeAsync(
                    removeConferenceCallDefinition, new TypeReference<CallsActionResponse>() {}.getType(), callback);
        }
    }

    /**
     * Remove call.
     * <p>
     * Remove a call from a conference. The call stays active after this action.
     *
     * @param conferenceId Conference ID. (required)
     * @param callId Call ID. (required)
     * @return RemoveConferenceCallRequest
     */
    public RemoveConferenceCallRequest removeConferenceCall(String conferenceId, String callId) {
        return new RemoveConferenceCallRequest(conferenceId, callId);
    }

    private RequestDefinition rescheduleBulkDefinition(String bulkId, CallsRescheduleRequest callsRescheduleRequest) {
        RequestDefinition.Builder builder = RequestDefinition.builder("POST", "/calls/1/bulks/{bulkId}/reschedule")
                .body(callsRescheduleRequest)
                .requiresAuthentication(true)
                .accept("application/json")
                .contentType("application/json");

        if (bulkId != null) {
            builder.addPathParameter(new Parameter("bulkId", bulkId));
        }
        return builder.build();
    }

    /**
     * rescheduleBulk request builder class.
     */
    public class RescheduleBulkRequest {
        private final String bulkId;
        private final CallsRescheduleRequest callsRescheduleRequest;

        private RescheduleBulkRequest(String bulkId, CallsRescheduleRequest callsRescheduleRequest) {
            this.bulkId = Objects.requireNonNull(bulkId, "The required parameter 'bulkId' is missing.");
            this.callsRescheduleRequest = Objects.requireNonNull(
                    callsRescheduleRequest, "The required parameter 'callsRescheduleRequest' is missing.");
        }

        /**
         * Executes the rescheduleBulk request.
         *
         * @return CallBulkStatus The deserialized response.
         * @throws ApiException If the API call fails or an error occurs during the request or response processing.
         */
        public CallBulkStatus execute() throws ApiException {
            RequestDefinition rescheduleBulkDefinition = rescheduleBulkDefinition(bulkId, callsRescheduleRequest);
            return apiClient.execute(rescheduleBulkDefinition, new TypeReference<CallBulkStatus>() {}.getType());
        }

        /**
         * Executes the rescheduleBulk request asynchronously.
         *
         * @param callback The {@link ApiCallback} to be invoked.
         * @return The {@link okhttp3.Call} associated with the API request.
         */
        public okhttp3.Call executeAsync(ApiCallback<CallBulkStatus> callback) {
            RequestDefinition rescheduleBulkDefinition = rescheduleBulkDefinition(bulkId, callsRescheduleRequest);
            return apiClient.executeAsync(
                    rescheduleBulkDefinition, new TypeReference<CallBulkStatus>() {}.getType(), callback);
        }
    }

    /**
     * Reschedule.
     * <p>
     * Reschedule a bulk.
     *
     * @param bulkId Bulk ID. (required)
     * @param callsRescheduleRequest  (required)
     * @return RescheduleBulkRequest
     */
    public RescheduleBulkRequest rescheduleBulk(String bulkId, CallsRescheduleRequest callsRescheduleRequest) {
        return new RescheduleBulkRequest(bulkId, callsRescheduleRequest);
    }

    private RequestDefinition resumeBulkDefinition(String bulkId) {
        RequestDefinition.Builder builder = RequestDefinition.builder("POST", "/calls/1/bulks/{bulkId}/resume")
                .requiresAuthentication(true)
                .accept("application/json");

        if (bulkId != null) {
            builder.addPathParameter(new Parameter("bulkId", bulkId));
        }
        return builder.build();
    }

    /**
     * resumeBulk request builder class.
     */
    public class ResumeBulkRequest {
        private final String bulkId;

        private ResumeBulkRequest(String bulkId) {
            this.bulkId = Objects.requireNonNull(bulkId, "The required parameter 'bulkId' is missing.");
        }

        /**
         * Executes the resumeBulk request.
         *
         * @return CallBulkStatus The deserialized response.
         * @throws ApiException If the API call fails or an error occurs during the request or response processing.
         */
        public CallBulkStatus execute() throws ApiException {
            RequestDefinition resumeBulkDefinition = resumeBulkDefinition(bulkId);
            return apiClient.execute(resumeBulkDefinition, new TypeReference<CallBulkStatus>() {}.getType());
        }

        /**
         * Executes the resumeBulk request asynchronously.
         *
         * @param callback The {@link ApiCallback} to be invoked.
         * @return The {@link okhttp3.Call} associated with the API request.
         */
        public okhttp3.Call executeAsync(ApiCallback<CallBulkStatus> callback) {
            RequestDefinition resumeBulkDefinition = resumeBulkDefinition(bulkId);
            return apiClient.executeAsync(
                    resumeBulkDefinition, new TypeReference<CallBulkStatus>() {}.getType(), callback);
        }
    }

    /**
     * Resume.
     * <p>
     * Resume a bulk.
     *
     * @param bulkId Bulk ID. (required)
     * @return ResumeBulkRequest
     */
    public ResumeBulkRequest resumeBulk(String bulkId) {
        return new ResumeBulkRequest(bulkId);
    }

    private RequestDefinition sendRingingDefinition(String callId) {
        RequestDefinition.Builder builder = RequestDefinition.builder("POST", "/calls/1/calls/{callId}/send-ringing")
                .requiresAuthentication(true)
                .accept("application/json");

        if (callId != null) {
            builder.addPathParameter(new Parameter("callId", callId));
        }
        return builder.build();
    }

    /**
     * sendRinging request builder class.
     */
    public class SendRingingRequest {
        private final String callId;

        private SendRingingRequest(String callId) {
            this.callId = Objects.requireNonNull(callId, "The required parameter 'callId' is missing.");
        }

        /**
         * Executes the sendRinging request.
         *
         * @return CallsActionResponse The deserialized response.
         * @throws ApiException If the API call fails or an error occurs during the request or response processing.
         */
        public CallsActionResponse execute() throws ApiException {
            RequestDefinition sendRingingDefinition = sendRingingDefinition(callId);
            return apiClient.execute(sendRingingDefinition, new TypeReference<CallsActionResponse>() {}.getType());
        }

        /**
         * Executes the sendRinging request asynchronously.
         *
         * @param callback The {@link ApiCallback} to be invoked.
         * @return The {@link okhttp3.Call} associated with the API request.
         */
        public okhttp3.Call executeAsync(ApiCallback<CallsActionResponse> callback) {
            RequestDefinition sendRingingDefinition = sendRingingDefinition(callId);
            return apiClient.executeAsync(
                    sendRingingDefinition, new TypeReference<CallsActionResponse>() {}.getType(), callback);
        }
    }

    /**
     * Send ringing.
     * <p>
     * Send SIP ringtone to an unanswered inbound call.
     *
     * @param callId Call ID. (required)
     * @return SendRingingRequest
     */
    public SendRingingRequest sendRinging(String callId) {
        return new SendRingingRequest(callId);
    }

    private RequestDefinition startMediaStreamDefinition(
            String callId, CallsStartMediaStreamRequest callsStartMediaStreamRequest) {
        RequestDefinition.Builder builder = RequestDefinition.builder(
                        "POST", "/calls/1/calls/{callId}/start-media-stream")
                .body(callsStartMediaStreamRequest)
                .requiresAuthentication(true)
                .accept("application/json")
                .contentType("application/json");

        if (callId != null) {
            builder.addPathParameter(new Parameter("callId", callId));
        }
        return builder.build();
    }

    /**
     * startMediaStream request builder class.
     */
    public class StartMediaStreamRequest {
        private final String callId;
        private final CallsStartMediaStreamRequest callsStartMediaStreamRequest;

        private StartMediaStreamRequest(String callId, CallsStartMediaStreamRequest callsStartMediaStreamRequest) {
            this.callId = Objects.requireNonNull(callId, "The required parameter 'callId' is missing.");
            this.callsStartMediaStreamRequest = Objects.requireNonNull(
                    callsStartMediaStreamRequest, "The required parameter 'callsStartMediaStreamRequest' is missing.");
        }

        /**
         * Executes the startMediaStream request.
         *
         * @return CallsActionResponse The deserialized response.
         * @throws ApiException If the API call fails or an error occurs during the request or response processing.
         */
        public CallsActionResponse execute() throws ApiException {
            RequestDefinition startMediaStreamDefinition =
                    startMediaStreamDefinition(callId, callsStartMediaStreamRequest);
            return apiClient.execute(startMediaStreamDefinition, new TypeReference<CallsActionResponse>() {}.getType());
        }

        /**
         * Executes the startMediaStream request asynchronously.
         *
         * @param callback The {@link ApiCallback} to be invoked.
         * @return The {@link okhttp3.Call} associated with the API request.
         */
        public okhttp3.Call executeAsync(ApiCallback<CallsActionResponse> callback) {
            RequestDefinition startMediaStreamDefinition =
                    startMediaStreamDefinition(callId, callsStartMediaStreamRequest);
            return apiClient.executeAsync(
                    startMediaStreamDefinition, new TypeReference<CallsActionResponse>() {}.getType(), callback);
        }
    }

    /**
     * Start streaming media.
     * <p>
     * Start streaming media.
     *
     * @param callId Call ID. (required)
     * @param callsStartMediaStreamRequest  (required)
     * @return StartMediaStreamRequest
     */
    public StartMediaStreamRequest startMediaStream(
            String callId, CallsStartMediaStreamRequest callsStartMediaStreamRequest) {
        return new StartMediaStreamRequest(callId, callsStartMediaStreamRequest);
    }

    private RequestDefinition stopMediaStreamDefinition(String callId) {
        RequestDefinition.Builder builder = RequestDefinition.builder(
                        "POST", "/calls/1/calls/{callId}/stop-media-stream")
                .requiresAuthentication(true)
                .accept("application/json");

        if (callId != null) {
            builder.addPathParameter(new Parameter("callId", callId));
        }
        return builder.build();
    }

    /**
     * stopMediaStream request builder class.
     */
    public class StopMediaStreamRequest {
        private final String callId;

        private StopMediaStreamRequest(String callId) {
            this.callId = Objects.requireNonNull(callId, "The required parameter 'callId' is missing.");
        }

        /**
         * Executes the stopMediaStream request.
         *
         * @return CallsActionResponse The deserialized response.
         * @throws ApiException If the API call fails or an error occurs during the request or response processing.
         */
        public CallsActionResponse execute() throws ApiException {
            RequestDefinition stopMediaStreamDefinition = stopMediaStreamDefinition(callId);
            return apiClient.execute(stopMediaStreamDefinition, new TypeReference<CallsActionResponse>() {}.getType());
        }

        /**
         * Executes the stopMediaStream request asynchronously.
         *
         * @param callback The {@link ApiCallback} to be invoked.
         * @return The {@link okhttp3.Call} associated with the API request.
         */
        public okhttp3.Call executeAsync(ApiCallback<CallsActionResponse> callback) {
            RequestDefinition stopMediaStreamDefinition = stopMediaStreamDefinition(callId);
            return apiClient.executeAsync(
                    stopMediaStreamDefinition, new TypeReference<CallsActionResponse>() {}.getType(), callback);
        }
    }

    /**
     * Stop streaming media.
     * <p>
     * Stop streaming media.
     *
     * @param callId Call ID. (required)
     * @return StopMediaStreamRequest
     */
    public StopMediaStreamRequest stopMediaStream(String callId) {
        return new StopMediaStreamRequest(callId);
    }

    private RequestDefinition updateConferenceDefinition(String conferenceId, CallsUpdateRequest callsUpdateRequest) {
        RequestDefinition.Builder builder = RequestDefinition.builder("PATCH", "/calls/1/conferences/{conferenceId}")
                .body(callsUpdateRequest)
                .requiresAuthentication(true)
                .accept("application/json")
                .contentType("application/json");

        if (conferenceId != null) {
            builder.addPathParameter(new Parameter("conferenceId", conferenceId));
        }
        return builder.build();
    }

    /**
     * updateConference request builder class.
     */
    public class UpdateConferenceRequest {
        private final String conferenceId;
        private final CallsUpdateRequest callsUpdateRequest;

        private UpdateConferenceRequest(String conferenceId, CallsUpdateRequest callsUpdateRequest) {
            this.conferenceId =
                    Objects.requireNonNull(conferenceId, "The required parameter 'conferenceId' is missing.");
            this.callsUpdateRequest = Objects.requireNonNull(
                    callsUpdateRequest, "The required parameter 'callsUpdateRequest' is missing.");
        }

        /**
         * Executes the updateConference request.
         *
         * @return CallsActionResponse The deserialized response.
         * @throws ApiException If the API call fails or an error occurs during the request or response processing.
         */
        public CallsActionResponse execute() throws ApiException {
            RequestDefinition updateConferenceDefinition = updateConferenceDefinition(conferenceId, callsUpdateRequest);
            return apiClient.execute(updateConferenceDefinition, new TypeReference<CallsActionResponse>() {}.getType());
        }

        /**
         * Executes the updateConference request asynchronously.
         *
         * @param callback The {@link ApiCallback} to be invoked.
         * @return The {@link okhttp3.Call} associated with the API request.
         */
        public okhttp3.Call executeAsync(ApiCallback<CallsActionResponse> callback) {
            RequestDefinition updateConferenceDefinition = updateConferenceDefinition(conferenceId, callsUpdateRequest);
            return apiClient.executeAsync(
                    updateConferenceDefinition, new TypeReference<CallsActionResponse>() {}.getType(), callback);
        }
    }

    /**
     * Update all calls.
     * <p>
     * Update all calls in a conference.
     *
     * @param conferenceId Conference ID. (required)
     * @param callsUpdateRequest  (required)
     * @return UpdateConferenceRequest
     */
    public UpdateConferenceRequest updateConference(String conferenceId, CallsUpdateRequest callsUpdateRequest) {
        return new UpdateConferenceRequest(conferenceId, callsUpdateRequest);
    }

    private RequestDefinition updateConferenceCallDefinition(
            String conferenceId, String callId, CallsUpdateRequest callsUpdateRequest) {
        RequestDefinition.Builder builder = RequestDefinition.builder(
                        "PATCH", "/calls/1/conferences/{conferenceId}/call/{callId}")
                .body(callsUpdateRequest)
                .requiresAuthentication(true)
                .accept("application/json")
                .contentType("application/json");

        if (conferenceId != null) {
            builder.addPathParameter(new Parameter("conferenceId", conferenceId));
        }
        if (callId != null) {
            builder.addPathParameter(new Parameter("callId", callId));
        }
        return builder.build();
    }

    /**
     * updateConferenceCall request builder class.
     */
    public class UpdateConferenceCallRequest {
        private final String conferenceId;
        private final String callId;
        private final CallsUpdateRequest callsUpdateRequest;

        private UpdateConferenceCallRequest(String conferenceId, String callId, CallsUpdateRequest callsUpdateRequest) {
            this.conferenceId =
                    Objects.requireNonNull(conferenceId, "The required parameter 'conferenceId' is missing.");
            this.callId = Objects.requireNonNull(callId, "The required parameter 'callId' is missing.");
            this.callsUpdateRequest = Objects.requireNonNull(
                    callsUpdateRequest, "The required parameter 'callsUpdateRequest' is missing.");
        }

        /**
         * Executes the updateConferenceCall request.
         *
         * @return CallsActionResponse The deserialized response.
         * @throws ApiException If the API call fails or an error occurs during the request or response processing.
         */
        public CallsActionResponse execute() throws ApiException {
            RequestDefinition updateConferenceCallDefinition =
                    updateConferenceCallDefinition(conferenceId, callId, callsUpdateRequest);
            return apiClient.execute(
                    updateConferenceCallDefinition, new TypeReference<CallsActionResponse>() {}.getType());
        }

        /**
         * Executes the updateConferenceCall request asynchronously.
         *
         * @param callback The {@link ApiCallback} to be invoked.
         * @return The {@link okhttp3.Call} associated with the API request.
         */
        public okhttp3.Call executeAsync(ApiCallback<CallsActionResponse> callback) {
            RequestDefinition updateConferenceCallDefinition =
                    updateConferenceCallDefinition(conferenceId, callId, callsUpdateRequest);
            return apiClient.executeAsync(
                    updateConferenceCallDefinition, new TypeReference<CallsActionResponse>() {}.getType(), callback);
        }
    }

    /**
     * Update call.
     * <p>
     * Update a call in a conference.
     *
     * @param conferenceId Conference ID. (required)
     * @param callId Call ID. (required)
     * @param callsUpdateRequest  (required)
     * @return UpdateConferenceCallRequest
     */
    public UpdateConferenceCallRequest updateConferenceCall(
            String conferenceId, String callId, CallsUpdateRequest callsUpdateRequest) {
        return new UpdateConferenceCallRequest(conferenceId, callId, callsUpdateRequest);
    }

    private RequestDefinition updateMediaStreamConfigDefinition(
            String mediaStreamConfigId, CallsMediaStreamConfigRequest callsMediaStreamConfigRequest) {
        RequestDefinition.Builder builder = RequestDefinition.builder(
                        "PUT", "/calls/1/media-stream-configs/{mediaStreamConfigId}")
                .body(callsMediaStreamConfigRequest)
                .requiresAuthentication(true)
                .accept("application/json")
                .contentType("application/json");

        if (mediaStreamConfigId != null) {
            builder.addPathParameter(new Parameter("mediaStreamConfigId", mediaStreamConfigId));
        }
        return builder.build();
    }

    /**
     * updateMediaStreamConfig request builder class.
     */
    public class UpdateMediaStreamConfigRequest {
        private final String mediaStreamConfigId;
        private final CallsMediaStreamConfigRequest callsMediaStreamConfigRequest;

        private UpdateMediaStreamConfigRequest(
                String mediaStreamConfigId, CallsMediaStreamConfigRequest callsMediaStreamConfigRequest) {
            this.mediaStreamConfigId = Objects.requireNonNull(
                    mediaStreamConfigId, "The required parameter 'mediaStreamConfigId' is missing.");
            this.callsMediaStreamConfigRequest = Objects.requireNonNull(
                    callsMediaStreamConfigRequest,
                    "The required parameter 'callsMediaStreamConfigRequest' is missing.");
        }

        /**
         * Executes the updateMediaStreamConfig request.
         *
         * @return CallsMediaStreamConfigResponse The deserialized response.
         * @throws ApiException If the API call fails or an error occurs during the request or response processing.
         */
        public CallsMediaStreamConfigResponse execute() throws ApiException {
            RequestDefinition updateMediaStreamConfigDefinition =
                    updateMediaStreamConfigDefinition(mediaStreamConfigId, callsMediaStreamConfigRequest);
            return apiClient.execute(
                    updateMediaStreamConfigDefinition,
                    new TypeReference<CallsMediaStreamConfigResponse>() {}.getType());
        }

        /**
         * Executes the updateMediaStreamConfig request asynchronously.
         *
         * @param callback The {@link ApiCallback} to be invoked.
         * @return The {@link okhttp3.Call} associated with the API request.
         */
        public okhttp3.Call executeAsync(ApiCallback<CallsMediaStreamConfigResponse> callback) {
            RequestDefinition updateMediaStreamConfigDefinition =
                    updateMediaStreamConfigDefinition(mediaStreamConfigId, callsMediaStreamConfigRequest);
            return apiClient.executeAsync(
                    updateMediaStreamConfigDefinition,
                    new TypeReference<CallsMediaStreamConfigResponse>() {}.getType(),
                    callback);
        }
    }

    /**
     * Update a media-stream configuration.
     * <p>
     * Update a media-stream configuration.
     *
     * @param mediaStreamConfigId Media-stream configuration ID. (required)
     * @param callsMediaStreamConfigRequest  (required)
     * @return UpdateMediaStreamConfigRequest
     */
    public UpdateMediaStreamConfigRequest updateMediaStreamConfig(
            String mediaStreamConfigId, CallsMediaStreamConfigRequest callsMediaStreamConfigRequest) {
        return new UpdateMediaStreamConfigRequest(mediaStreamConfigId, callsMediaStreamConfigRequest);
    }

    private RequestDefinition uploadCallsAudioFileDefinition(File _file) {
        RequestDefinition.Builder builder = RequestDefinition.builder("POST", "/calls/1/files")
                .requiresAuthentication(true)
                .accept("application/json")
                .contentType("multipart/form-data");

        if (_file != null) {
            builder.addFormParameter(new Parameter("file", _file));
        }
        return builder.build();
    }

    /**
     * uploadCallsAudioFile request builder class.
     */
    public class UploadCallsAudioFileRequest {
        private final File _file;

        private UploadCallsAudioFileRequest(File _file) {
            this._file = Objects.requireNonNull(_file, "The required parameter '_file' is missing.");
        }

        /**
         * Executes the uploadCallsAudioFile request.
         *
         * @return CallsFile The deserialized response.
         * @throws ApiException If the API call fails or an error occurs during the request or response processing.
         */
        public CallsFile execute() throws ApiException {
            RequestDefinition uploadCallsAudioFileDefinition = uploadCallsAudioFileDefinition(_file);
            return apiClient.execute(uploadCallsAudioFileDefinition, new TypeReference<CallsFile>() {}.getType());
        }

        /**
         * Executes the uploadCallsAudioFile request asynchronously.
         *
         * @param callback The {@link ApiCallback} to be invoked.
         * @return The {@link okhttp3.Call} associated with the API request.
         */
        public okhttp3.Call executeAsync(ApiCallback<CallsFile> callback) {
            RequestDefinition uploadCallsAudioFileDefinition = uploadCallsAudioFileDefinition(_file);
            return apiClient.executeAsync(
                    uploadCallsAudioFileDefinition, new TypeReference<CallsFile>() {}.getType(), callback);
        }
    }

    /**
     * Upload audio file.
     * <p>
     * Upload an audio file. Uploaded files can be played on calls or conferences.
     *
     * @param _file  (required)
     * @return UploadCallsAudioFileRequest
     */
    public UploadCallsAudioFileRequest uploadCallsAudioFile(File _file) {
        return new UploadCallsAudioFileRequest(_file);
    }
}
