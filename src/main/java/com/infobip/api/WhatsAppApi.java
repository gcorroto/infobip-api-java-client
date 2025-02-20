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
import com.infobip.model.WhatsAppAudioMessage;
import com.infobip.model.WhatsAppBulkMessage;
import com.infobip.model.WhatsAppBulkMessageInfo;
import com.infobip.model.WhatsAppContactsMessage;
import com.infobip.model.WhatsAppDocumentMessage;
import com.infobip.model.WhatsAppIdentityConfirmation;
import com.infobip.model.WhatsAppIdentityInfo;
import com.infobip.model.WhatsAppImageMessage;
import com.infobip.model.WhatsAppInteractiveButtonsMessage;
import com.infobip.model.WhatsAppInteractiveListMessage;
import com.infobip.model.WhatsAppInteractiveMultiProductMessage;
import com.infobip.model.WhatsAppInteractiveProductMessage;
import com.infobip.model.WhatsAppLocationMessage;
import com.infobip.model.WhatsAppSingleMessageInfo;
import com.infobip.model.WhatsAppStickerMessage;
import com.infobip.model.WhatsAppTemplateApiResponse;
import com.infobip.model.WhatsAppTemplatePublicApiRequest;
import com.infobip.model.WhatsAppTemplatesApiResponse;
import com.infobip.model.WhatsAppTextMessage;
import com.infobip.model.WhatsAppUrlDeletionRequest;
import com.infobip.model.WhatsAppVideoMessage;
import java.io.File;
import java.util.Objects;

/**
 * Represents WhatsAppApi API client.
 */
public class WhatsAppApi {

    private final ApiClient apiClient;

    /**
     * Constructs a new instance of WhatsAppApi.
     *
     * @param apiClient {@link ApiClient} instance to delegate calls to.
     */
    public WhatsAppApi(ApiClient apiClient) {
        this.apiClient = Objects.requireNonNull(apiClient, "ApiClient must not be null!");
    }

    private RequestDefinition confirmWhatsAppIdentityDefinition(
            String sender, String userNumber, WhatsAppIdentityConfirmation whatsAppIdentityConfirmation) {
        RequestDefinition.Builder builder = RequestDefinition.builder(
                        "PUT", "/whatsapp/1/{sender}/contacts/{userNumber}/identity")
                .body(whatsAppIdentityConfirmation)
                .requiresAuthentication(true)
                .accept("application/json")
                .contentType("application/json");

        if (sender != null) {
            builder.addPathParameter(new Parameter("sender", sender));
        }
        if (userNumber != null) {
            builder.addPathParameter(new Parameter("userNumber", userNumber));
        }
        return builder.build();
    }

    /**
     * confirmWhatsAppIdentity request builder class.
     */
    public class ConfirmWhatsAppIdentityRequest {
        private final String sender;
        private final String userNumber;
        private final WhatsAppIdentityConfirmation whatsAppIdentityConfirmation;

        private ConfirmWhatsAppIdentityRequest(
                String sender, String userNumber, WhatsAppIdentityConfirmation whatsAppIdentityConfirmation) {
            this.sender = Objects.requireNonNull(sender, "The required parameter 'sender' is missing.");
            this.userNumber = Objects.requireNonNull(userNumber, "The required parameter 'userNumber' is missing.");
            this.whatsAppIdentityConfirmation = Objects.requireNonNull(
                    whatsAppIdentityConfirmation, "The required parameter 'whatsAppIdentityConfirmation' is missing.");
        }

        /**
         * Executes the confirmWhatsAppIdentity request
         * @throws ApiException If the API call fails or an error occurs during the request or response processing.
         */
        public void execute() throws ApiException {
            RequestDefinition confirmWhatsAppIdentityDefinition =
                    confirmWhatsAppIdentityDefinition(sender, userNumber, whatsAppIdentityConfirmation);
            apiClient.execute(confirmWhatsAppIdentityDefinition);
        }

        /**
         * Executes the confirmWhatsAppIdentity request asynchronously.
         *
         * @param callback The {@link ApiCallback} to be invoked.
         * @return The {@link okhttp3.Call} associated with the API request.
         */
        public okhttp3.Call executeAsync(ApiCallback<Void> callback) {
            RequestDefinition confirmWhatsAppIdentityDefinition =
                    confirmWhatsAppIdentityDefinition(sender, userNumber, whatsAppIdentityConfirmation);
            return apiClient.executeAsync(confirmWhatsAppIdentityDefinition, callback);
        }
    }

    /**
     * Confirm identity.
     * <p>
     * Confirm end user&#39;s identity. Feature is not enabled by default.
     *
     * @param sender Registered WhatsApp sender number. Must be in international format. (required)
     * @param userNumber End user&#39;s number. Must be in international format. (required)
     * @param whatsAppIdentityConfirmation  (required)
     * @return ConfirmWhatsAppIdentityRequest
     * @see <a href="https://www.infobip.com/docs/whatsapp/additional-functionality#identity-change">Learn more.</a>
     */
    public ConfirmWhatsAppIdentityRequest confirmWhatsAppIdentity(
            String sender, String userNumber, WhatsAppIdentityConfirmation whatsAppIdentityConfirmation) {
        return new ConfirmWhatsAppIdentityRequest(sender, userNumber, whatsAppIdentityConfirmation);
    }

    private RequestDefinition createWhatsAppTemplateDefinition(
            String sender, WhatsAppTemplatePublicApiRequest whatsAppTemplatePublicApiRequest) {
        RequestDefinition.Builder builder = RequestDefinition.builder("POST", "/whatsapp/2/senders/{sender}/templates")
                .body(whatsAppTemplatePublicApiRequest)
                .requiresAuthentication(true)
                .accept("application/json")
                .contentType("application/json");

        if (sender != null) {
            builder.addPathParameter(new Parameter("sender", sender));
        }
        return builder.build();
    }

    /**
     * createWhatsAppTemplate request builder class.
     */
    public class CreateWhatsAppTemplateRequest {
        private final String sender;
        private final WhatsAppTemplatePublicApiRequest whatsAppTemplatePublicApiRequest;

        private CreateWhatsAppTemplateRequest(
                String sender, WhatsAppTemplatePublicApiRequest whatsAppTemplatePublicApiRequest) {
            this.sender = Objects.requireNonNull(sender, "The required parameter 'sender' is missing.");
            this.whatsAppTemplatePublicApiRequest = Objects.requireNonNull(
                    whatsAppTemplatePublicApiRequest,
                    "The required parameter 'whatsAppTemplatePublicApiRequest' is missing.");
        }

        /**
         * Executes the createWhatsAppTemplate request.
         *
         * @return WhatsAppTemplateApiResponse The deserialized response.
         * @throws ApiException If the API call fails or an error occurs during the request or response processing.
         */
        public WhatsAppTemplateApiResponse execute() throws ApiException {
            RequestDefinition createWhatsAppTemplateDefinition =
                    createWhatsAppTemplateDefinition(sender, whatsAppTemplatePublicApiRequest);
            return apiClient.execute(
                    createWhatsAppTemplateDefinition, new TypeReference<WhatsAppTemplateApiResponse>() {}.getType());
        }

        /**
         * Executes the createWhatsAppTemplate request asynchronously.
         *
         * @param callback The {@link ApiCallback} to be invoked.
         * @return The {@link okhttp3.Call} associated with the API request.
         */
        public okhttp3.Call executeAsync(ApiCallback<WhatsAppTemplateApiResponse> callback) {
            RequestDefinition createWhatsAppTemplateDefinition =
                    createWhatsAppTemplateDefinition(sender, whatsAppTemplatePublicApiRequest);
            return apiClient.executeAsync(
                    createWhatsAppTemplateDefinition,
                    new TypeReference<WhatsAppTemplateApiResponse>() {}.getType(),
                    callback);
        }
    }

    /**
     * Create WhatsApp Template.
     * <p>
     * Create a WhatsApp template. Created template will be submitted for WhatsApp&#39;s review and approval. Once approved, template can be sent to end-users. Refer to [template guidelines](https://www.infobip.com/docs/whatsapp/message-types#guidelines-amp-best-practices) for additional info.
     *
     * @param sender Registered WhatsApp sender number. Must be in international format. (required)
     * @param whatsAppTemplatePublicApiRequest  (required)
     * @return CreateWhatsAppTemplateRequest
     * @see <a href="https://www.infobip.com/docs/whatsapp">Learn more about WhatsApp channel and use cases.</a>
     */
    public CreateWhatsAppTemplateRequest createWhatsAppTemplate(
            String sender, WhatsAppTemplatePublicApiRequest whatsAppTemplatePublicApiRequest) {
        return new CreateWhatsAppTemplateRequest(sender, whatsAppTemplatePublicApiRequest);
    }

    private RequestDefinition deleteWhatsAppMediaDefinition(
            String sender, WhatsAppUrlDeletionRequest whatsAppUrlDeletionRequest) {
        RequestDefinition.Builder builder = RequestDefinition.builder("DELETE", "/whatsapp/1/senders/{sender}/media")
                .body(whatsAppUrlDeletionRequest)
                .requiresAuthentication(true)
                .contentType("application/json");

        if (sender != null) {
            builder.addPathParameter(new Parameter("sender", sender));
        }
        return builder.build();
    }

    /**
     * deleteWhatsAppMedia request builder class.
     */
    public class DeleteWhatsAppMediaRequest {
        private final String sender;
        private final WhatsAppUrlDeletionRequest whatsAppUrlDeletionRequest;

        private DeleteWhatsAppMediaRequest(String sender, WhatsAppUrlDeletionRequest whatsAppUrlDeletionRequest) {
            this.sender = Objects.requireNonNull(sender, "The required parameter 'sender' is missing.");
            this.whatsAppUrlDeletionRequest = Objects.requireNonNull(
                    whatsAppUrlDeletionRequest, "The required parameter 'whatsAppUrlDeletionRequest' is missing.");
        }

        /**
         * Executes the deleteWhatsAppMedia request
         * @throws ApiException If the API call fails or an error occurs during the request or response processing.
         */
        public void execute() throws ApiException {
            RequestDefinition deleteWhatsAppMediaDefinition =
                    deleteWhatsAppMediaDefinition(sender, whatsAppUrlDeletionRequest);
            apiClient.execute(deleteWhatsAppMediaDefinition);
        }

        /**
         * Executes the deleteWhatsAppMedia request asynchronously.
         *
         * @param callback The {@link ApiCallback} to be invoked.
         * @return The {@link okhttp3.Call} associated with the API request.
         */
        public okhttp3.Call executeAsync(ApiCallback<Void> callback) {
            RequestDefinition deleteWhatsAppMediaDefinition =
                    deleteWhatsAppMediaDefinition(sender, whatsAppUrlDeletionRequest);
            return apiClient.executeAsync(deleteWhatsAppMediaDefinition, callback);
        }
    }

    /**
     * Delete media.
     * <p>
     * Delete WhatsApp media. May be outbound or inbound media.
     *
     * @param sender Registered WhatsApp sender number. Must be in international format. (required)
     * @param whatsAppUrlDeletionRequest  (required)
     * @return DeleteWhatsAppMediaRequest
     * @see <a href="https://www.infobip.com/docs/whatsapp">Learn more about WhatsApp channel and use cases</a>
     */
    public DeleteWhatsAppMediaRequest deleteWhatsAppMedia(
            String sender, WhatsAppUrlDeletionRequest whatsAppUrlDeletionRequest) {
        return new DeleteWhatsAppMediaRequest(sender, whatsAppUrlDeletionRequest);
    }

    private RequestDefinition deleteWhatsAppTemplateDefinition(String sender, String templateName) {
        RequestDefinition.Builder builder = RequestDefinition.builder(
                        "DELETE", "/whatsapp/2/senders/{sender}/templates/{templateName}")
                .requiresAuthentication(true)
                .accept("application/json");

        if (sender != null) {
            builder.addPathParameter(new Parameter("sender", sender));
        }
        if (templateName != null) {
            builder.addPathParameter(new Parameter("templateName", templateName));
        }
        return builder.build();
    }

    /**
     * deleteWhatsAppTemplate request builder class.
     */
    public class DeleteWhatsAppTemplateRequest {
        private final String sender;
        private final String templateName;

        private DeleteWhatsAppTemplateRequest(String sender, String templateName) {
            this.sender = Objects.requireNonNull(sender, "The required parameter 'sender' is missing.");
            this.templateName =
                    Objects.requireNonNull(templateName, "The required parameter 'templateName' is missing.");
        }

        /**
         * Executes the deleteWhatsAppTemplate request
         * @throws ApiException If the API call fails or an error occurs during the request or response processing.
         */
        public void execute() throws ApiException {
            RequestDefinition deleteWhatsAppTemplateDefinition = deleteWhatsAppTemplateDefinition(sender, templateName);
            apiClient.execute(deleteWhatsAppTemplateDefinition);
        }

        /**
         * Executes the deleteWhatsAppTemplate request asynchronously.
         *
         * @param callback The {@link ApiCallback} to be invoked.
         * @return The {@link okhttp3.Call} associated with the API request.
         */
        public okhttp3.Call executeAsync(ApiCallback<Void> callback) {
            RequestDefinition deleteWhatsAppTemplateDefinition = deleteWhatsAppTemplateDefinition(sender, templateName);
            return apiClient.executeAsync(deleteWhatsAppTemplateDefinition, callback);
        }
    }

    /**
     * Delete WhatsApp Template.
     * <p>
     * Delete a WhatsApp template. * If registered in multiple languages, deleting the message template will also delete all its languages. * The template will be deleted for all senders registered under the same WhatsApp Business Account (WABA). * The system will attempt to deliver sent messages for 30 days, regardless of the template deletion. * Once deleted, the name of the approved template cannot be reused for 30 days.
     *
     * @param sender Registered WhatsApp sender number. Must be in international format. (required)
     * @param templateName Template name. Must only contain lowercase alphanumeric characters and underscores. (required)
     * @return DeleteWhatsAppTemplateRequest
     * @see <a href="https://www.infobip.com/docs/whatsapp">Learn more about WhatsApp channel and use cases.</a>
     */
    public DeleteWhatsAppTemplateRequest deleteWhatsAppTemplate(String sender, String templateName) {
        return new DeleteWhatsAppTemplateRequest(sender, templateName);
    }

    private RequestDefinition downloadWhatsAppInboundMediaDefinition(String sender, String mediaId) {
        RequestDefinition.Builder builder = RequestDefinition.builder(
                        "GET", "/whatsapp/1/senders/{sender}/media/{mediaId}")
                .requiresAuthentication(true)
                .accept("application/json");

        if (sender != null) {
            builder.addPathParameter(new Parameter("sender", sender));
        }
        if (mediaId != null) {
            builder.addPathParameter(new Parameter("mediaId", mediaId));
        }
        return builder.build();
    }

    /**
     * downloadWhatsAppInboundMedia request builder class.
     */
    public class DownloadWhatsAppInboundMediaRequest {
        private final String sender;
        private final String mediaId;

        private DownloadWhatsAppInboundMediaRequest(String sender, String mediaId) {
            this.sender = Objects.requireNonNull(sender, "The required parameter 'sender' is missing.");
            this.mediaId = Objects.requireNonNull(mediaId, "The required parameter 'mediaId' is missing.");
        }

        /**
         * Executes the downloadWhatsAppInboundMedia request.
         *
         * @return File The deserialized response.
         * @throws ApiException If the API call fails or an error occurs during the request or response processing.
         */
        public File execute() throws ApiException {
            RequestDefinition downloadWhatsAppInboundMediaDefinition =
                    downloadWhatsAppInboundMediaDefinition(sender, mediaId);
            return apiClient.execute(downloadWhatsAppInboundMediaDefinition, new TypeReference<File>() {}.getType());
        }

        /**
         * Executes the downloadWhatsAppInboundMedia request asynchronously.
         *
         * @param callback The {@link ApiCallback} to be invoked.
         * @return The {@link okhttp3.Call} associated with the API request.
         */
        public okhttp3.Call executeAsync(ApiCallback<File> callback) {
            RequestDefinition downloadWhatsAppInboundMediaDefinition =
                    downloadWhatsAppInboundMediaDefinition(sender, mediaId);
            return apiClient.executeAsync(
                    downloadWhatsAppInboundMediaDefinition, new TypeReference<File>() {}.getType(), callback);
        }
    }

    /**
     * Download inbound media.
     * <p>
     * Download WhatsApp media sent by end-users.
     *
     * @param sender Registered WhatsApp sender number. Must be in international format. (required)
     * @param mediaId ID of the media. (required)
     * @return DownloadWhatsAppInboundMediaRequest
     * @see <a href="https://www.infobip.com/docs/whatsapp">Learn more about WhatsApp channel and use cases</a>
     */
    public DownloadWhatsAppInboundMediaRequest downloadWhatsAppInboundMedia(String sender, String mediaId) {
        return new DownloadWhatsAppInboundMediaRequest(sender, mediaId);
    }

    private RequestDefinition getWhatsAppIdentityDefinition(String sender, String userNumber) {
        RequestDefinition.Builder builder = RequestDefinition.builder(
                        "GET", "/whatsapp/1/{sender}/contacts/{userNumber}/identity")
                .requiresAuthentication(true)
                .accept("application/json");

        if (sender != null) {
            builder.addPathParameter(new Parameter("sender", sender));
        }
        if (userNumber != null) {
            builder.addPathParameter(new Parameter("userNumber", userNumber));
        }
        return builder.build();
    }

    /**
     * getWhatsAppIdentity request builder class.
     */
    public class GetWhatsAppIdentityRequest {
        private final String sender;
        private final String userNumber;

        private GetWhatsAppIdentityRequest(String sender, String userNumber) {
            this.sender = Objects.requireNonNull(sender, "The required parameter 'sender' is missing.");
            this.userNumber = Objects.requireNonNull(userNumber, "The required parameter 'userNumber' is missing.");
        }

        /**
         * Executes the getWhatsAppIdentity request.
         *
         * @return WhatsAppIdentityInfo The deserialized response.
         * @throws ApiException If the API call fails or an error occurs during the request or response processing.
         */
        public WhatsAppIdentityInfo execute() throws ApiException {
            RequestDefinition getWhatsAppIdentityDefinition = getWhatsAppIdentityDefinition(sender, userNumber);
            return apiClient.execute(
                    getWhatsAppIdentityDefinition, new TypeReference<WhatsAppIdentityInfo>() {}.getType());
        }

        /**
         * Executes the getWhatsAppIdentity request asynchronously.
         *
         * @param callback The {@link ApiCallback} to be invoked.
         * @return The {@link okhttp3.Call} associated with the API request.
         */
        public okhttp3.Call executeAsync(ApiCallback<WhatsAppIdentityInfo> callback) {
            RequestDefinition getWhatsAppIdentityDefinition = getWhatsAppIdentityDefinition(sender, userNumber);
            return apiClient.executeAsync(
                    getWhatsAppIdentityDefinition, new TypeReference<WhatsAppIdentityInfo>() {}.getType(), callback);
        }
    }

    /**
     * Get identity.
     * <p>
     * Get end user&#39;s identity info. Feature is not enabled by default.
     *
     * @param sender Registered WhatsApp sender number. Must be in international format. (required)
     * @param userNumber End user&#39;s number. Must be in international format. (required)
     * @return GetWhatsAppIdentityRequest
     * @see <a href="https://www.infobip.com/docs/whatsapp/additional-functionality#identity-change">Learn more.</a>
     */
    public GetWhatsAppIdentityRequest getWhatsAppIdentity(String sender, String userNumber) {
        return new GetWhatsAppIdentityRequest(sender, userNumber);
    }

    private RequestDefinition getWhatsAppMediaMetadataDefinition(String sender, String mediaId) {
        RequestDefinition.Builder builder = RequestDefinition.builder(
                        "HEAD", "/whatsapp/1/senders/{sender}/media/{mediaId}")
                .requiresAuthentication(true);

        if (sender != null) {
            builder.addPathParameter(new Parameter("sender", sender));
        }
        if (mediaId != null) {
            builder.addPathParameter(new Parameter("mediaId", mediaId));
        }
        return builder.build();
    }

    /**
     * getWhatsAppMediaMetadata request builder class.
     */
    public class GetWhatsAppMediaMetadataRequest {
        private final String sender;
        private final String mediaId;

        private GetWhatsAppMediaMetadataRequest(String sender, String mediaId) {
            this.sender = Objects.requireNonNull(sender, "The required parameter 'sender' is missing.");
            this.mediaId = Objects.requireNonNull(mediaId, "The required parameter 'mediaId' is missing.");
        }

        /**
         * Executes the getWhatsAppMediaMetadata request
         * @throws ApiException If the API call fails or an error occurs during the request or response processing.
         */
        public void execute() throws ApiException {
            RequestDefinition getWhatsAppMediaMetadataDefinition = getWhatsAppMediaMetadataDefinition(sender, mediaId);
            apiClient.execute(getWhatsAppMediaMetadataDefinition);
        }

        /**
         * Executes the getWhatsAppMediaMetadata request asynchronously.
         *
         * @param callback The {@link ApiCallback} to be invoked.
         * @return The {@link okhttp3.Call} associated with the API request.
         */
        public okhttp3.Call executeAsync(ApiCallback<Void> callback) {
            RequestDefinition getWhatsAppMediaMetadataDefinition = getWhatsAppMediaMetadataDefinition(sender, mediaId);
            return apiClient.executeAsync(getWhatsAppMediaMetadataDefinition, callback);
        }
    }

    /**
     * Get media metadata.
     * <p>
     * Get metadata of WhatsApp media sent by end-users to check media type and the size of a file without downloading the content.
     *
     * @param sender Registered WhatsApp sender number. Must be in international format. (required)
     * @param mediaId ID of the media. (required)
     * @return GetWhatsAppMediaMetadataRequest
     * @see <a href="https://www.infobip.com/docs/whatsapp">Learn more about WhatsApp channel and use cases</a>
     */
    public GetWhatsAppMediaMetadataRequest getWhatsAppMediaMetadata(String sender, String mediaId) {
        return new GetWhatsAppMediaMetadataRequest(sender, mediaId);
    }

    private RequestDefinition getWhatsAppTemplatesDefinition(String sender) {
        RequestDefinition.Builder builder = RequestDefinition.builder("GET", "/whatsapp/2/senders/{sender}/templates")
                .requiresAuthentication(true)
                .accept("application/json");

        if (sender != null) {
            builder.addPathParameter(new Parameter("sender", sender));
        }
        return builder.build();
    }

    /**
     * getWhatsAppTemplates request builder class.
     */
    public class GetWhatsAppTemplatesRequest {
        private final String sender;

        private GetWhatsAppTemplatesRequest(String sender) {
            this.sender = Objects.requireNonNull(sender, "The required parameter 'sender' is missing.");
        }

        /**
         * Executes the getWhatsAppTemplates request.
         *
         * @return WhatsAppTemplatesApiResponse The deserialized response.
         * @throws ApiException If the API call fails or an error occurs during the request or response processing.
         */
        public WhatsAppTemplatesApiResponse execute() throws ApiException {
            RequestDefinition getWhatsAppTemplatesDefinition = getWhatsAppTemplatesDefinition(sender);
            return apiClient.execute(
                    getWhatsAppTemplatesDefinition, new TypeReference<WhatsAppTemplatesApiResponse>() {}.getType());
        }

        /**
         * Executes the getWhatsAppTemplates request asynchronously.
         *
         * @param callback The {@link ApiCallback} to be invoked.
         * @return The {@link okhttp3.Call} associated with the API request.
         */
        public okhttp3.Call executeAsync(ApiCallback<WhatsAppTemplatesApiResponse> callback) {
            RequestDefinition getWhatsAppTemplatesDefinition = getWhatsAppTemplatesDefinition(sender);
            return apiClient.executeAsync(
                    getWhatsAppTemplatesDefinition,
                    new TypeReference<WhatsAppTemplatesApiResponse>() {}.getType(),
                    callback);
        }
    }

    /**
     * Get WhatsApp Templates.
     * <p>
     * Get all the templates and their statuses for a given sender.
     *
     * @param sender Registered WhatsApp sender number. Must be in international format. (required)
     * @return GetWhatsAppTemplatesRequest
     * @see <a href="https://www.infobip.com/docs/whatsapp">Learn more about WhatsApp channel and use cases.</a>
     */
    public GetWhatsAppTemplatesRequest getWhatsAppTemplates(String sender) {
        return new GetWhatsAppTemplatesRequest(sender);
    }

    private RequestDefinition markWhatsAppMessageAsReadDefinition(String sender, String messageId) {
        RequestDefinition.Builder builder = RequestDefinition.builder(
                        "POST", "/whatsapp/1/senders/{sender}/message/{messageId}/read")
                .requiresAuthentication(true)
                .accept("application/json");

        if (sender != null) {
            builder.addPathParameter(new Parameter("sender", sender));
        }
        if (messageId != null) {
            builder.addPathParameter(new Parameter("messageId", messageId));
        }
        return builder.build();
    }

    /**
     * markWhatsAppMessageAsRead request builder class.
     */
    public class MarkWhatsAppMessageAsReadRequest {
        private final String sender;
        private final String messageId;

        private MarkWhatsAppMessageAsReadRequest(String sender, String messageId) {
            this.sender = Objects.requireNonNull(sender, "The required parameter 'sender' is missing.");
            this.messageId = Objects.requireNonNull(messageId, "The required parameter 'messageId' is missing.");
        }

        /**
         * Executes the markWhatsAppMessageAsRead request
         * @throws ApiException If the API call fails or an error occurs during the request or response processing.
         */
        public void execute() throws ApiException {
            RequestDefinition markWhatsAppMessageAsReadDefinition =
                    markWhatsAppMessageAsReadDefinition(sender, messageId);
            apiClient.execute(markWhatsAppMessageAsReadDefinition);
        }

        /**
         * Executes the markWhatsAppMessageAsRead request asynchronously.
         *
         * @param callback The {@link ApiCallback} to be invoked.
         * @return The {@link okhttp3.Call} associated with the API request.
         */
        public okhttp3.Call executeAsync(ApiCallback<Void> callback) {
            RequestDefinition markWhatsAppMessageAsReadDefinition =
                    markWhatsAppMessageAsReadDefinition(sender, messageId);
            return apiClient.executeAsync(markWhatsAppMessageAsReadDefinition, callback);
        }
    }

    /**
     * Mark as read.
     * <p>
     * Mark WhatsApp messages sent by end-users as read.
     *
     * @param sender Registered WhatsApp sender number. Must be in international format. (required)
     * @param messageId ID of the message to be marked as read. (required)
     * @return MarkWhatsAppMessageAsReadRequest
     * @see <a href="https://www.infobip.com/docs/whatsapp">Learn more about WhatsApp channel and use cases</a>
     */
    public MarkWhatsAppMessageAsReadRequest markWhatsAppMessageAsRead(String sender, String messageId) {
        return new MarkWhatsAppMessageAsReadRequest(sender, messageId);
    }

    private RequestDefinition sendWhatsAppAudioMessageDefinition(WhatsAppAudioMessage whatsAppAudioMessage) {
        RequestDefinition.Builder builder = RequestDefinition.builder("POST", "/whatsapp/1/message/audio")
                .body(whatsAppAudioMessage)
                .requiresAuthentication(true)
                .accept("application/json")
                .contentType("application/json");

        return builder.build();
    }

    /**
     * sendWhatsAppAudioMessage request builder class.
     */
    public class SendWhatsAppAudioMessageRequest {
        private final WhatsAppAudioMessage whatsAppAudioMessage;

        private SendWhatsAppAudioMessageRequest(WhatsAppAudioMessage whatsAppAudioMessage) {
            this.whatsAppAudioMessage = Objects.requireNonNull(
                    whatsAppAudioMessage, "The required parameter 'whatsAppAudioMessage' is missing.");
        }

        /**
         * Executes the sendWhatsAppAudioMessage request.
         *
         * @return WhatsAppSingleMessageInfo The deserialized response.
         * @throws ApiException If the API call fails or an error occurs during the request or response processing.
         */
        public WhatsAppSingleMessageInfo execute() throws ApiException {
            RequestDefinition sendWhatsAppAudioMessageDefinition =
                    sendWhatsAppAudioMessageDefinition(whatsAppAudioMessage);
            return apiClient.execute(
                    sendWhatsAppAudioMessageDefinition, new TypeReference<WhatsAppSingleMessageInfo>() {}.getType());
        }

        /**
         * Executes the sendWhatsAppAudioMessage request asynchronously.
         *
         * @param callback The {@link ApiCallback} to be invoked.
         * @return The {@link okhttp3.Call} associated with the API request.
         */
        public okhttp3.Call executeAsync(ApiCallback<WhatsAppSingleMessageInfo> callback) {
            RequestDefinition sendWhatsAppAudioMessageDefinition =
                    sendWhatsAppAudioMessageDefinition(whatsAppAudioMessage);
            return apiClient.executeAsync(
                    sendWhatsAppAudioMessageDefinition,
                    new TypeReference<WhatsAppSingleMessageInfo>() {}.getType(),
                    callback);
        }
    }

    /**
     * Send WhatsApp audio message.
     * <p>
     * Send an audio to a single recipient. Audio messages can only be successfully delivered if the recipient has contacted the business within the last 24 hours, otherwise [template message](#channels/whatsapp/send-whatsapp-template-message) should be used. &lt;br/&gt; The API response will not contain the final delivery status, use [Delivery Reports](#channels/whatsapp/receive-whatsapp-delivery-reports) instead.
     *
     * @param whatsAppAudioMessage  (required)
     * @return SendWhatsAppAudioMessageRequest
     * @see <a href="https://www.infobip.com/docs/whatsapp">Learn more about WhatsApp channel and use cases</a>
     */
    public SendWhatsAppAudioMessageRequest sendWhatsAppAudioMessage(WhatsAppAudioMessage whatsAppAudioMessage) {
        return new SendWhatsAppAudioMessageRequest(whatsAppAudioMessage);
    }

    private RequestDefinition sendWhatsAppContactMessageDefinition(WhatsAppContactsMessage whatsAppContactsMessage) {
        RequestDefinition.Builder builder = RequestDefinition.builder("POST", "/whatsapp/1/message/contact")
                .body(whatsAppContactsMessage)
                .requiresAuthentication(true)
                .accept("application/json")
                .contentType("application/json");

        return builder.build();
    }

    /**
     * sendWhatsAppContactMessage request builder class.
     */
    public class SendWhatsAppContactMessageRequest {
        private final WhatsAppContactsMessage whatsAppContactsMessage;

        private SendWhatsAppContactMessageRequest(WhatsAppContactsMessage whatsAppContactsMessage) {
            this.whatsAppContactsMessage = Objects.requireNonNull(
                    whatsAppContactsMessage, "The required parameter 'whatsAppContactsMessage' is missing.");
        }

        /**
         * Executes the sendWhatsAppContactMessage request.
         *
         * @return WhatsAppSingleMessageInfo The deserialized response.
         * @throws ApiException If the API call fails or an error occurs during the request or response processing.
         */
        public WhatsAppSingleMessageInfo execute() throws ApiException {
            RequestDefinition sendWhatsAppContactMessageDefinition =
                    sendWhatsAppContactMessageDefinition(whatsAppContactsMessage);
            return apiClient.execute(
                    sendWhatsAppContactMessageDefinition, new TypeReference<WhatsAppSingleMessageInfo>() {}.getType());
        }

        /**
         * Executes the sendWhatsAppContactMessage request asynchronously.
         *
         * @param callback The {@link ApiCallback} to be invoked.
         * @return The {@link okhttp3.Call} associated with the API request.
         */
        public okhttp3.Call executeAsync(ApiCallback<WhatsAppSingleMessageInfo> callback) {
            RequestDefinition sendWhatsAppContactMessageDefinition =
                    sendWhatsAppContactMessageDefinition(whatsAppContactsMessage);
            return apiClient.executeAsync(
                    sendWhatsAppContactMessageDefinition,
                    new TypeReference<WhatsAppSingleMessageInfo>() {}.getType(),
                    callback);
        }
    }

    /**
     * Send WhatsApp contact message.
     * <p>
     * Send a contact to a single recipient. Contact messages can only be successfully delivered if the recipient has contacted the business within the last 24 hours, otherwise [template message](#channels/whatsapp/send-whatsapp-template-message) should be used. &lt;br/&gt; The API response will not contain the final delivery status, use [Delivery Reports](#channels/whatsapp/receive-whatsapp-delivery-reports) instead.
     *
     * @param whatsAppContactsMessage  (required)
     * @return SendWhatsAppContactMessageRequest
     * @see <a href="https://www.infobip.com/docs/whatsapp">Learn more about WhatsApp channel and use cases</a>
     */
    public SendWhatsAppContactMessageRequest sendWhatsAppContactMessage(
            WhatsAppContactsMessage whatsAppContactsMessage) {
        return new SendWhatsAppContactMessageRequest(whatsAppContactsMessage);
    }

    private RequestDefinition sendWhatsAppDocumentMessageDefinition(WhatsAppDocumentMessage whatsAppDocumentMessage) {
        RequestDefinition.Builder builder = RequestDefinition.builder("POST", "/whatsapp/1/message/document")
                .body(whatsAppDocumentMessage)
                .requiresAuthentication(true)
                .accept("application/json")
                .contentType("application/json");

        return builder.build();
    }

    /**
     * sendWhatsAppDocumentMessage request builder class.
     */
    public class SendWhatsAppDocumentMessageRequest {
        private final WhatsAppDocumentMessage whatsAppDocumentMessage;

        private SendWhatsAppDocumentMessageRequest(WhatsAppDocumentMessage whatsAppDocumentMessage) {
            this.whatsAppDocumentMessage = Objects.requireNonNull(
                    whatsAppDocumentMessage, "The required parameter 'whatsAppDocumentMessage' is missing.");
        }

        /**
         * Executes the sendWhatsAppDocumentMessage request.
         *
         * @return WhatsAppSingleMessageInfo The deserialized response.
         * @throws ApiException If the API call fails or an error occurs during the request or response processing.
         */
        public WhatsAppSingleMessageInfo execute() throws ApiException {
            RequestDefinition sendWhatsAppDocumentMessageDefinition =
                    sendWhatsAppDocumentMessageDefinition(whatsAppDocumentMessage);
            return apiClient.execute(
                    sendWhatsAppDocumentMessageDefinition, new TypeReference<WhatsAppSingleMessageInfo>() {}.getType());
        }

        /**
         * Executes the sendWhatsAppDocumentMessage request asynchronously.
         *
         * @param callback The {@link ApiCallback} to be invoked.
         * @return The {@link okhttp3.Call} associated with the API request.
         */
        public okhttp3.Call executeAsync(ApiCallback<WhatsAppSingleMessageInfo> callback) {
            RequestDefinition sendWhatsAppDocumentMessageDefinition =
                    sendWhatsAppDocumentMessageDefinition(whatsAppDocumentMessage);
            return apiClient.executeAsync(
                    sendWhatsAppDocumentMessageDefinition,
                    new TypeReference<WhatsAppSingleMessageInfo>() {}.getType(),
                    callback);
        }
    }

    /**
     * Send WhatsApp document message.
     * <p>
     * Send a document to a single recipient. Document messages can only be successfully delivered if the recipient has contacted the business within the last 24 hours, otherwise [template message](#channels/whatsapp/send-whatsapp-template-message) should be used. &lt;br/&gt; The API response will not contain the final delivery status, use [Delivery Reports](#channels/whatsapp/receive-whatsapp-delivery-reports) instead.
     *
     * @param whatsAppDocumentMessage  (required)
     * @return SendWhatsAppDocumentMessageRequest
     * @see <a href="https://www.infobip.com/docs/whatsapp">Learn more about WhatsApp channel and use cases</a>
     */
    public SendWhatsAppDocumentMessageRequest sendWhatsAppDocumentMessage(
            WhatsAppDocumentMessage whatsAppDocumentMessage) {
        return new SendWhatsAppDocumentMessageRequest(whatsAppDocumentMessage);
    }

    private RequestDefinition sendWhatsAppImageMessageDefinition(WhatsAppImageMessage whatsAppImageMessage) {
        RequestDefinition.Builder builder = RequestDefinition.builder("POST", "/whatsapp/1/message/image")
                .body(whatsAppImageMessage)
                .requiresAuthentication(true)
                .accept("application/json")
                .contentType("application/json");

        return builder.build();
    }

    /**
     * sendWhatsAppImageMessage request builder class.
     */
    public class SendWhatsAppImageMessageRequest {
        private final WhatsAppImageMessage whatsAppImageMessage;

        private SendWhatsAppImageMessageRequest(WhatsAppImageMessage whatsAppImageMessage) {
            this.whatsAppImageMessage = Objects.requireNonNull(
                    whatsAppImageMessage, "The required parameter 'whatsAppImageMessage' is missing.");
        }

        /**
         * Executes the sendWhatsAppImageMessage request.
         *
         * @return WhatsAppSingleMessageInfo The deserialized response.
         * @throws ApiException If the API call fails or an error occurs during the request or response processing.
         */
        public WhatsAppSingleMessageInfo execute() throws ApiException {
            RequestDefinition sendWhatsAppImageMessageDefinition =
                    sendWhatsAppImageMessageDefinition(whatsAppImageMessage);
            return apiClient.execute(
                    sendWhatsAppImageMessageDefinition, new TypeReference<WhatsAppSingleMessageInfo>() {}.getType());
        }

        /**
         * Executes the sendWhatsAppImageMessage request asynchronously.
         *
         * @param callback The {@link ApiCallback} to be invoked.
         * @return The {@link okhttp3.Call} associated with the API request.
         */
        public okhttp3.Call executeAsync(ApiCallback<WhatsAppSingleMessageInfo> callback) {
            RequestDefinition sendWhatsAppImageMessageDefinition =
                    sendWhatsAppImageMessageDefinition(whatsAppImageMessage);
            return apiClient.executeAsync(
                    sendWhatsAppImageMessageDefinition,
                    new TypeReference<WhatsAppSingleMessageInfo>() {}.getType(),
                    callback);
        }
    }

    /**
     * Send WhatsApp image message.
     * <p>
     * Send an image to a single recipient. Image messages can only be successfully delivered if the recipient has contacted the business within the last 24 hours, otherwise [template message](#channels/whatsapp/send-whatsapp-template-message) should be used. &lt;br/&gt; The API response will not contain the final delivery status, use [Delivery Reports](#channels/whatsapp/receive-whatsapp-delivery-reports) instead.
     *
     * @param whatsAppImageMessage  (required)
     * @return SendWhatsAppImageMessageRequest
     * @see <a href="https://www.infobip.com/docs/whatsapp">Learn more about WhatsApp channel and use cases</a>
     */
    public SendWhatsAppImageMessageRequest sendWhatsAppImageMessage(WhatsAppImageMessage whatsAppImageMessage) {
        return new SendWhatsAppImageMessageRequest(whatsAppImageMessage);
    }

    private RequestDefinition sendWhatsAppInteractiveButtonsMessageDefinition(
            WhatsAppInteractiveButtonsMessage whatsAppInteractiveButtonsMessage) {
        RequestDefinition.Builder builder = RequestDefinition.builder("POST", "/whatsapp/1/message/interactive/buttons")
                .body(whatsAppInteractiveButtonsMessage)
                .requiresAuthentication(true)
                .accept("application/json")
                .contentType("application/json");

        return builder.build();
    }

    /**
     * sendWhatsAppInteractiveButtonsMessage request builder class.
     */
    public class SendWhatsAppInteractiveButtonsMessageRequest {
        private final WhatsAppInteractiveButtonsMessage whatsAppInteractiveButtonsMessage;

        private SendWhatsAppInteractiveButtonsMessageRequest(
                WhatsAppInteractiveButtonsMessage whatsAppInteractiveButtonsMessage) {
            this.whatsAppInteractiveButtonsMessage = Objects.requireNonNull(
                    whatsAppInteractiveButtonsMessage,
                    "The required parameter 'whatsAppInteractiveButtonsMessage' is missing.");
        }

        /**
         * Executes the sendWhatsAppInteractiveButtonsMessage request.
         *
         * @return WhatsAppSingleMessageInfo The deserialized response.
         * @throws ApiException If the API call fails or an error occurs during the request or response processing.
         */
        public WhatsAppSingleMessageInfo execute() throws ApiException {
            RequestDefinition sendWhatsAppInteractiveButtonsMessageDefinition =
                    sendWhatsAppInteractiveButtonsMessageDefinition(whatsAppInteractiveButtonsMessage);
            return apiClient.execute(
                    sendWhatsAppInteractiveButtonsMessageDefinition,
                    new TypeReference<WhatsAppSingleMessageInfo>() {}.getType());
        }

        /**
         * Executes the sendWhatsAppInteractiveButtonsMessage request asynchronously.
         *
         * @param callback The {@link ApiCallback} to be invoked.
         * @return The {@link okhttp3.Call} associated with the API request.
         */
        public okhttp3.Call executeAsync(ApiCallback<WhatsAppSingleMessageInfo> callback) {
            RequestDefinition sendWhatsAppInteractiveButtonsMessageDefinition =
                    sendWhatsAppInteractiveButtonsMessageDefinition(whatsAppInteractiveButtonsMessage);
            return apiClient.executeAsync(
                    sendWhatsAppInteractiveButtonsMessageDefinition,
                    new TypeReference<WhatsAppSingleMessageInfo>() {}.getType(),
                    callback);
        }
    }

    /**
     * Send WhatsApp interactive buttons message.
     * <p>
     * Send an interactive buttons message to a single recipient. Interactive buttons messages can only be successfully delivered if the recipient has contacted the business within the last 24 hours, otherwise [template message](#channels/whatsapp/send-whatsapp-template-message) should be used. &lt;br/&gt; The API response will not contain the final delivery status, use [Delivery Reports](#channels/whatsapp/receive-whatsapp-delivery-reports) instead.
     *
     * @param whatsAppInteractiveButtonsMessage  (required)
     * @return SendWhatsAppInteractiveButtonsMessageRequest
     * @see <a href="https://www.infobip.com/docs/whatsapp">Learn more about WhatsApp channel and use cases</a>
     */
    public SendWhatsAppInteractiveButtonsMessageRequest sendWhatsAppInteractiveButtonsMessage(
            WhatsAppInteractiveButtonsMessage whatsAppInteractiveButtonsMessage) {
        return new SendWhatsAppInteractiveButtonsMessageRequest(whatsAppInteractiveButtonsMessage);
    }

    private RequestDefinition sendWhatsAppInteractiveListMessageDefinition(
            WhatsAppInteractiveListMessage whatsAppInteractiveListMessage) {
        RequestDefinition.Builder builder = RequestDefinition.builder("POST", "/whatsapp/1/message/interactive/list")
                .body(whatsAppInteractiveListMessage)
                .requiresAuthentication(true)
                .accept("application/json")
                .contentType("application/json");

        return builder.build();
    }

    /**
     * sendWhatsAppInteractiveListMessage request builder class.
     */
    public class SendWhatsAppInteractiveListMessageRequest {
        private final WhatsAppInteractiveListMessage whatsAppInteractiveListMessage;

        private SendWhatsAppInteractiveListMessageRequest(
                WhatsAppInteractiveListMessage whatsAppInteractiveListMessage) {
            this.whatsAppInteractiveListMessage = Objects.requireNonNull(
                    whatsAppInteractiveListMessage,
                    "The required parameter 'whatsAppInteractiveListMessage' is missing.");
        }

        /**
         * Executes the sendWhatsAppInteractiveListMessage request.
         *
         * @return WhatsAppSingleMessageInfo The deserialized response.
         * @throws ApiException If the API call fails or an error occurs during the request or response processing.
         */
        public WhatsAppSingleMessageInfo execute() throws ApiException {
            RequestDefinition sendWhatsAppInteractiveListMessageDefinition =
                    sendWhatsAppInteractiveListMessageDefinition(whatsAppInteractiveListMessage);
            return apiClient.execute(
                    sendWhatsAppInteractiveListMessageDefinition,
                    new TypeReference<WhatsAppSingleMessageInfo>() {}.getType());
        }

        /**
         * Executes the sendWhatsAppInteractiveListMessage request asynchronously.
         *
         * @param callback The {@link ApiCallback} to be invoked.
         * @return The {@link okhttp3.Call} associated with the API request.
         */
        public okhttp3.Call executeAsync(ApiCallback<WhatsAppSingleMessageInfo> callback) {
            RequestDefinition sendWhatsAppInteractiveListMessageDefinition =
                    sendWhatsAppInteractiveListMessageDefinition(whatsAppInteractiveListMessage);
            return apiClient.executeAsync(
                    sendWhatsAppInteractiveListMessageDefinition,
                    new TypeReference<WhatsAppSingleMessageInfo>() {}.getType(),
                    callback);
        }
    }

    /**
     * Send WhatsApp interactive list message.
     * <p>
     * Send an interactive list message to a single recipient. Interactive list messages can only be successfully delivered if the recipient has contacted the business within the last 24 hours, otherwise [template message](#channels/whatsapp/send-whatsapp-template-message) should be used. &lt;br/&gt; The API response will not contain the final delivery status, use [Delivery Reports](#channels/whatsapp/receive-whatsapp-delivery-reports) instead.
     *
     * @param whatsAppInteractiveListMessage  (required)
     * @return SendWhatsAppInteractiveListMessageRequest
     * @see <a href="https://www.infobip.com/docs/whatsapp">Learn more about WhatsApp channel and use cases</a>
     */
    public SendWhatsAppInteractiveListMessageRequest sendWhatsAppInteractiveListMessage(
            WhatsAppInteractiveListMessage whatsAppInteractiveListMessage) {
        return new SendWhatsAppInteractiveListMessageRequest(whatsAppInteractiveListMessage);
    }

    private RequestDefinition sendWhatsAppInteractiveMultiProductMessageDefinition(
            WhatsAppInteractiveMultiProductMessage whatsAppInteractiveMultiProductMessage) {
        RequestDefinition.Builder builder = RequestDefinition.builder(
                        "POST", "/whatsapp/1/message/interactive/multi-product")
                .body(whatsAppInteractiveMultiProductMessage)
                .requiresAuthentication(true)
                .accept("application/json")
                .contentType("application/json");

        return builder.build();
    }

    /**
     * sendWhatsAppInteractiveMultiProductMessage request builder class.
     */
    public class SendWhatsAppInteractiveMultiProductMessageRequest {
        private final WhatsAppInteractiveMultiProductMessage whatsAppInteractiveMultiProductMessage;

        private SendWhatsAppInteractiveMultiProductMessageRequest(
                WhatsAppInteractiveMultiProductMessage whatsAppInteractiveMultiProductMessage) {
            this.whatsAppInteractiveMultiProductMessage = Objects.requireNonNull(
                    whatsAppInteractiveMultiProductMessage,
                    "The required parameter 'whatsAppInteractiveMultiProductMessage' is missing.");
        }

        /**
         * Executes the sendWhatsAppInteractiveMultiProductMessage request.
         *
         * @return WhatsAppSingleMessageInfo The deserialized response.
         * @throws ApiException If the API call fails or an error occurs during the request or response processing.
         */
        public WhatsAppSingleMessageInfo execute() throws ApiException {
            RequestDefinition sendWhatsAppInteractiveMultiProductMessageDefinition =
                    sendWhatsAppInteractiveMultiProductMessageDefinition(whatsAppInteractiveMultiProductMessage);
            return apiClient.execute(
                    sendWhatsAppInteractiveMultiProductMessageDefinition,
                    new TypeReference<WhatsAppSingleMessageInfo>() {}.getType());
        }

        /**
         * Executes the sendWhatsAppInteractiveMultiProductMessage request asynchronously.
         *
         * @param callback The {@link ApiCallback} to be invoked.
         * @return The {@link okhttp3.Call} associated with the API request.
         */
        public okhttp3.Call executeAsync(ApiCallback<WhatsAppSingleMessageInfo> callback) {
            RequestDefinition sendWhatsAppInteractiveMultiProductMessageDefinition =
                    sendWhatsAppInteractiveMultiProductMessageDefinition(whatsAppInteractiveMultiProductMessage);
            return apiClient.executeAsync(
                    sendWhatsAppInteractiveMultiProductMessageDefinition,
                    new TypeReference<WhatsAppSingleMessageInfo>() {}.getType(),
                    callback);
        }
    }

    /**
     * Send WhatsApp interactive multi-product message.
     * <p>
     * Send an interactive multi-product message to a single recipient. Interactive multi-product messages can only be successfully delivered if the recipient has contacted the business within the last 24 hours, otherwise [template message](#channels/whatsapp/send-whatsapp-template-message) should be used. &lt;br/&gt; The API response will not contain the final delivery status, use [Delivery Reports](#channels/whatsapp/receive-whatsapp-delivery-reports) instead.
     *
     * @param whatsAppInteractiveMultiProductMessage  (required)
     * @return SendWhatsAppInteractiveMultiProductMessageRequest
     * @see <a href="https://www.infobip.com/docs/whatsapp">Learn more about WhatsApp channel and use cases</a>
     */
    public SendWhatsAppInteractiveMultiProductMessageRequest sendWhatsAppInteractiveMultiProductMessage(
            WhatsAppInteractiveMultiProductMessage whatsAppInteractiveMultiProductMessage) {
        return new SendWhatsAppInteractiveMultiProductMessageRequest(whatsAppInteractiveMultiProductMessage);
    }

    private RequestDefinition sendWhatsAppInteractiveProductMessageDefinition(
            WhatsAppInteractiveProductMessage whatsAppInteractiveProductMessage) {
        RequestDefinition.Builder builder = RequestDefinition.builder("POST", "/whatsapp/1/message/interactive/product")
                .body(whatsAppInteractiveProductMessage)
                .requiresAuthentication(true)
                .accept("application/json")
                .contentType("application/json");

        return builder.build();
    }

    /**
     * sendWhatsAppInteractiveProductMessage request builder class.
     */
    public class SendWhatsAppInteractiveProductMessageRequest {
        private final WhatsAppInteractiveProductMessage whatsAppInteractiveProductMessage;

        private SendWhatsAppInteractiveProductMessageRequest(
                WhatsAppInteractiveProductMessage whatsAppInteractiveProductMessage) {
            this.whatsAppInteractiveProductMessage = Objects.requireNonNull(
                    whatsAppInteractiveProductMessage,
                    "The required parameter 'whatsAppInteractiveProductMessage' is missing.");
        }

        /**
         * Executes the sendWhatsAppInteractiveProductMessage request.
         *
         * @return WhatsAppSingleMessageInfo The deserialized response.
         * @throws ApiException If the API call fails or an error occurs during the request or response processing.
         */
        public WhatsAppSingleMessageInfo execute() throws ApiException {
            RequestDefinition sendWhatsAppInteractiveProductMessageDefinition =
                    sendWhatsAppInteractiveProductMessageDefinition(whatsAppInteractiveProductMessage);
            return apiClient.execute(
                    sendWhatsAppInteractiveProductMessageDefinition,
                    new TypeReference<WhatsAppSingleMessageInfo>() {}.getType());
        }

        /**
         * Executes the sendWhatsAppInteractiveProductMessage request asynchronously.
         *
         * @param callback The {@link ApiCallback} to be invoked.
         * @return The {@link okhttp3.Call} associated with the API request.
         */
        public okhttp3.Call executeAsync(ApiCallback<WhatsAppSingleMessageInfo> callback) {
            RequestDefinition sendWhatsAppInteractiveProductMessageDefinition =
                    sendWhatsAppInteractiveProductMessageDefinition(whatsAppInteractiveProductMessage);
            return apiClient.executeAsync(
                    sendWhatsAppInteractiveProductMessageDefinition,
                    new TypeReference<WhatsAppSingleMessageInfo>() {}.getType(),
                    callback);
        }
    }

    /**
     * Send WhatsApp interactive product message.
     * <p>
     * Send an interactive product message to a single recipient. Interactive product messages can only be successfully delivered if the recipient has contacted the business within the last 24 hours, otherwise [template message](#channels/whatsapp/send-whatsapp-template-message) should be used. &lt;br/&gt; The API response will not contain the final delivery status, use [Delivery Reports](#channels/whatsapp/receive-whatsapp-delivery-reports) instead.
     *
     * @param whatsAppInteractiveProductMessage  (required)
     * @return SendWhatsAppInteractiveProductMessageRequest
     * @see <a href="https://www.infobip.com/docs/whatsapp">Learn more about WhatsApp channel and use cases</a>
     */
    public SendWhatsAppInteractiveProductMessageRequest sendWhatsAppInteractiveProductMessage(
            WhatsAppInteractiveProductMessage whatsAppInteractiveProductMessage) {
        return new SendWhatsAppInteractiveProductMessageRequest(whatsAppInteractiveProductMessage);
    }

    private RequestDefinition sendWhatsAppLocationMessageDefinition(WhatsAppLocationMessage whatsAppLocationMessage) {
        RequestDefinition.Builder builder = RequestDefinition.builder("POST", "/whatsapp/1/message/location")
                .body(whatsAppLocationMessage)
                .requiresAuthentication(true)
                .accept("application/json")
                .contentType("application/json");

        return builder.build();
    }

    /**
     * sendWhatsAppLocationMessage request builder class.
     */
    public class SendWhatsAppLocationMessageRequest {
        private final WhatsAppLocationMessage whatsAppLocationMessage;

        private SendWhatsAppLocationMessageRequest(WhatsAppLocationMessage whatsAppLocationMessage) {
            this.whatsAppLocationMessage = Objects.requireNonNull(
                    whatsAppLocationMessage, "The required parameter 'whatsAppLocationMessage' is missing.");
        }

        /**
         * Executes the sendWhatsAppLocationMessage request.
         *
         * @return WhatsAppSingleMessageInfo The deserialized response.
         * @throws ApiException If the API call fails or an error occurs during the request or response processing.
         */
        public WhatsAppSingleMessageInfo execute() throws ApiException {
            RequestDefinition sendWhatsAppLocationMessageDefinition =
                    sendWhatsAppLocationMessageDefinition(whatsAppLocationMessage);
            return apiClient.execute(
                    sendWhatsAppLocationMessageDefinition, new TypeReference<WhatsAppSingleMessageInfo>() {}.getType());
        }

        /**
         * Executes the sendWhatsAppLocationMessage request asynchronously.
         *
         * @param callback The {@link ApiCallback} to be invoked.
         * @return The {@link okhttp3.Call} associated with the API request.
         */
        public okhttp3.Call executeAsync(ApiCallback<WhatsAppSingleMessageInfo> callback) {
            RequestDefinition sendWhatsAppLocationMessageDefinition =
                    sendWhatsAppLocationMessageDefinition(whatsAppLocationMessage);
            return apiClient.executeAsync(
                    sendWhatsAppLocationMessageDefinition,
                    new TypeReference<WhatsAppSingleMessageInfo>() {}.getType(),
                    callback);
        }
    }

    /**
     * Send WhatsApp location message.
     * <p>
     * Send a location to a single recipient. Location messages can only be successfully delivered if the recipient has contacted the business within the last 24 hours, otherwise [template message](#channels/whatsapp/send-whatsapp-template-message) should be used. &lt;br/&gt; The API response will not contain the final delivery status, use [Delivery Reports](#channels/whatsapp/receive-whatsapp-delivery-reports) instead.
     *
     * @param whatsAppLocationMessage  (required)
     * @return SendWhatsAppLocationMessageRequest
     * @see <a href="https://www.infobip.com/docs/whatsapp">Learn more about WhatsApp channel and use cases</a>
     */
    public SendWhatsAppLocationMessageRequest sendWhatsAppLocationMessage(
            WhatsAppLocationMessage whatsAppLocationMessage) {
        return new SendWhatsAppLocationMessageRequest(whatsAppLocationMessage);
    }

    private RequestDefinition sendWhatsAppStickerMessageDefinition(WhatsAppStickerMessage whatsAppStickerMessage) {
        RequestDefinition.Builder builder = RequestDefinition.builder("POST", "/whatsapp/1/message/sticker")
                .body(whatsAppStickerMessage)
                .requiresAuthentication(true)
                .accept("application/json")
                .contentType("application/json");

        return builder.build();
    }

    /**
     * sendWhatsAppStickerMessage request builder class.
     */
    public class SendWhatsAppStickerMessageRequest {
        private final WhatsAppStickerMessage whatsAppStickerMessage;

        private SendWhatsAppStickerMessageRequest(WhatsAppStickerMessage whatsAppStickerMessage) {
            this.whatsAppStickerMessage = Objects.requireNonNull(
                    whatsAppStickerMessage, "The required parameter 'whatsAppStickerMessage' is missing.");
        }

        /**
         * Executes the sendWhatsAppStickerMessage request.
         *
         * @return WhatsAppSingleMessageInfo The deserialized response.
         * @throws ApiException If the API call fails or an error occurs during the request or response processing.
         */
        public WhatsAppSingleMessageInfo execute() throws ApiException {
            RequestDefinition sendWhatsAppStickerMessageDefinition =
                    sendWhatsAppStickerMessageDefinition(whatsAppStickerMessage);
            return apiClient.execute(
                    sendWhatsAppStickerMessageDefinition, new TypeReference<WhatsAppSingleMessageInfo>() {}.getType());
        }

        /**
         * Executes the sendWhatsAppStickerMessage request asynchronously.
         *
         * @param callback The {@link ApiCallback} to be invoked.
         * @return The {@link okhttp3.Call} associated with the API request.
         */
        public okhttp3.Call executeAsync(ApiCallback<WhatsAppSingleMessageInfo> callback) {
            RequestDefinition sendWhatsAppStickerMessageDefinition =
                    sendWhatsAppStickerMessageDefinition(whatsAppStickerMessage);
            return apiClient.executeAsync(
                    sendWhatsAppStickerMessageDefinition,
                    new TypeReference<WhatsAppSingleMessageInfo>() {}.getType(),
                    callback);
        }
    }

    /**
     * Send WhatsApp sticker message.
     * <p>
     * Send a sticker to a single recipient. Sticker messages can only be successfully delivered if the recipient has contacted the business within the last 24 hours, otherwise [template message](#channels/whatsapp/send-whatsapp-template-message) should be used. &lt;br/&gt; The API response will not contain the final delivery status, use [Delivery Reports](#channels/whatsapp/receive-whatsapp-delivery-reports) instead.
     *
     * @param whatsAppStickerMessage  (required)
     * @return SendWhatsAppStickerMessageRequest
     * @see <a href="https://www.infobip.com/docs/whatsapp">Learn more about WhatsApp channel and use cases</a>
     */
    public SendWhatsAppStickerMessageRequest sendWhatsAppStickerMessage(WhatsAppStickerMessage whatsAppStickerMessage) {
        return new SendWhatsAppStickerMessageRequest(whatsAppStickerMessage);
    }

    private RequestDefinition sendWhatsAppTemplateMessageDefinition(WhatsAppBulkMessage whatsAppBulkMessage) {
        RequestDefinition.Builder builder = RequestDefinition.builder("POST", "/whatsapp/1/message/template")
                .body(whatsAppBulkMessage)
                .requiresAuthentication(true)
                .accept("application/json")
                .contentType("application/json");

        return builder.build();
    }

    /**
     * sendWhatsAppTemplateMessage request builder class.
     */
    public class SendWhatsAppTemplateMessageRequest {
        private final WhatsAppBulkMessage whatsAppBulkMessage;

        private SendWhatsAppTemplateMessageRequest(WhatsAppBulkMessage whatsAppBulkMessage) {
            this.whatsAppBulkMessage = Objects.requireNonNull(
                    whatsAppBulkMessage, "The required parameter 'whatsAppBulkMessage' is missing.");
        }

        /**
         * Executes the sendWhatsAppTemplateMessage request.
         *
         * @return WhatsAppBulkMessageInfo The deserialized response.
         * @throws ApiException If the API call fails or an error occurs during the request or response processing.
         */
        public WhatsAppBulkMessageInfo execute() throws ApiException {
            RequestDefinition sendWhatsAppTemplateMessageDefinition =
                    sendWhatsAppTemplateMessageDefinition(whatsAppBulkMessage);
            return apiClient.execute(
                    sendWhatsAppTemplateMessageDefinition, new TypeReference<WhatsAppBulkMessageInfo>() {}.getType());
        }

        /**
         * Executes the sendWhatsAppTemplateMessage request asynchronously.
         *
         * @param callback The {@link ApiCallback} to be invoked.
         * @return The {@link okhttp3.Call} associated with the API request.
         */
        public okhttp3.Call executeAsync(ApiCallback<WhatsAppBulkMessageInfo> callback) {
            RequestDefinition sendWhatsAppTemplateMessageDefinition =
                    sendWhatsAppTemplateMessageDefinition(whatsAppBulkMessage);
            return apiClient.executeAsync(
                    sendWhatsAppTemplateMessageDefinition,
                    new TypeReference<WhatsAppBulkMessageInfo>() {}.getType(),
                    callback);
        }
    }

    /**
     * Send WhatsApp template message.
     * <p>
     * Send a single or multiple template messages to one or more recipients. Template messages can be sent and delivered at anytime. Each template needs to be registered and pre-approved by WhatsApp. &lt;br/&gt; The API response will not contain the final delivery status, use [Delivery Reports](#channels/whatsapp/receive-whatsapp-delivery-reports) instead.
     *
     * @param whatsAppBulkMessage  (required)
     * @return SendWhatsAppTemplateMessageRequest
     * @see <a href="https://www.infobip.com/docs/whatsapp">Learn more about WhatsApp channel and use cases</a>
     */
    public SendWhatsAppTemplateMessageRequest sendWhatsAppTemplateMessage(WhatsAppBulkMessage whatsAppBulkMessage) {
        return new SendWhatsAppTemplateMessageRequest(whatsAppBulkMessage);
    }

    private RequestDefinition sendWhatsAppTextMessageDefinition(WhatsAppTextMessage whatsAppTextMessage) {
        RequestDefinition.Builder builder = RequestDefinition.builder("POST", "/whatsapp/1/message/text")
                .body(whatsAppTextMessage)
                .requiresAuthentication(true)
                .accept("application/json")
                .contentType("application/json");

        return builder.build();
    }

    /**
     * sendWhatsAppTextMessage request builder class.
     */
    public class SendWhatsAppTextMessageRequest {
        private final WhatsAppTextMessage whatsAppTextMessage;

        private SendWhatsAppTextMessageRequest(WhatsAppTextMessage whatsAppTextMessage) {
            this.whatsAppTextMessage = Objects.requireNonNull(
                    whatsAppTextMessage, "The required parameter 'whatsAppTextMessage' is missing.");
        }

        /**
         * Executes the sendWhatsAppTextMessage request.
         *
         * @return WhatsAppSingleMessageInfo The deserialized response.
         * @throws ApiException If the API call fails or an error occurs during the request or response processing.
         */
        public WhatsAppSingleMessageInfo execute() throws ApiException {
            RequestDefinition sendWhatsAppTextMessageDefinition =
                    sendWhatsAppTextMessageDefinition(whatsAppTextMessage);
            return apiClient.execute(
                    sendWhatsAppTextMessageDefinition, new TypeReference<WhatsAppSingleMessageInfo>() {}.getType());
        }

        /**
         * Executes the sendWhatsAppTextMessage request asynchronously.
         *
         * @param callback The {@link ApiCallback} to be invoked.
         * @return The {@link okhttp3.Call} associated with the API request.
         */
        public okhttp3.Call executeAsync(ApiCallback<WhatsAppSingleMessageInfo> callback) {
            RequestDefinition sendWhatsAppTextMessageDefinition =
                    sendWhatsAppTextMessageDefinition(whatsAppTextMessage);
            return apiClient.executeAsync(
                    sendWhatsAppTextMessageDefinition,
                    new TypeReference<WhatsAppSingleMessageInfo>() {}.getType(),
                    callback);
        }
    }

    /**
     * Send WhatsApp text message.
     * <p>
     * Send a text message to a single recipient. Text messages can only be successfully delivered if the recipient has contacted the business within the last 24 hours, otherwise [template message](#channels/whatsapp/send-whatsapp-template-message) should be used. &lt;br/&gt; The API response will not contain the final delivery status, use [Delivery Reports](#channels/whatsapp/receive-whatsapp-delivery-reports) instead.
     *
     * @param whatsAppTextMessage  (required)
     * @return SendWhatsAppTextMessageRequest
     * @see <a href="https://www.infobip.com/docs/whatsapp">Learn more about WhatsApp channel and use cases</a>
     */
    public SendWhatsAppTextMessageRequest sendWhatsAppTextMessage(WhatsAppTextMessage whatsAppTextMessage) {
        return new SendWhatsAppTextMessageRequest(whatsAppTextMessage);
    }

    private RequestDefinition sendWhatsAppVideoMessageDefinition(WhatsAppVideoMessage whatsAppVideoMessage) {
        RequestDefinition.Builder builder = RequestDefinition.builder("POST", "/whatsapp/1/message/video")
                .body(whatsAppVideoMessage)
                .requiresAuthentication(true)
                .accept("application/json")
                .contentType("application/json");

        return builder.build();
    }

    /**
     * sendWhatsAppVideoMessage request builder class.
     */
    public class SendWhatsAppVideoMessageRequest {
        private final WhatsAppVideoMessage whatsAppVideoMessage;

        private SendWhatsAppVideoMessageRequest(WhatsAppVideoMessage whatsAppVideoMessage) {
            this.whatsAppVideoMessage = Objects.requireNonNull(
                    whatsAppVideoMessage, "The required parameter 'whatsAppVideoMessage' is missing.");
        }

        /**
         * Executes the sendWhatsAppVideoMessage request.
         *
         * @return WhatsAppSingleMessageInfo The deserialized response.
         * @throws ApiException If the API call fails or an error occurs during the request or response processing.
         */
        public WhatsAppSingleMessageInfo execute() throws ApiException {
            RequestDefinition sendWhatsAppVideoMessageDefinition =
                    sendWhatsAppVideoMessageDefinition(whatsAppVideoMessage);
            return apiClient.execute(
                    sendWhatsAppVideoMessageDefinition, new TypeReference<WhatsAppSingleMessageInfo>() {}.getType());
        }

        /**
         * Executes the sendWhatsAppVideoMessage request asynchronously.
         *
         * @param callback The {@link ApiCallback} to be invoked.
         * @return The {@link okhttp3.Call} associated with the API request.
         */
        public okhttp3.Call executeAsync(ApiCallback<WhatsAppSingleMessageInfo> callback) {
            RequestDefinition sendWhatsAppVideoMessageDefinition =
                    sendWhatsAppVideoMessageDefinition(whatsAppVideoMessage);
            return apiClient.executeAsync(
                    sendWhatsAppVideoMessageDefinition,
                    new TypeReference<WhatsAppSingleMessageInfo>() {}.getType(),
                    callback);
        }
    }

    /**
     * Send WhatsApp video message.
     * <p>
     * Send a video to a single recipient. Video messages can only be successfully delivered if the recipient has contacted the business within the last 24 hours, otherwise [template message](#channels/whatsapp/send-whatsapp-template-message) should be used. &lt;br/&gt; The API response will not contain the final delivery status, use [Delivery Reports](#channels/whatsapp/receive-whatsapp-delivery-reports) instead.
     *
     * @param whatsAppVideoMessage  (required)
     * @return SendWhatsAppVideoMessageRequest
     * @see <a href="https://www.infobip.com/docs/whatsapp">Learn more about WhatsApp channel and use cases</a>
     */
    public SendWhatsAppVideoMessageRequest sendWhatsAppVideoMessage(WhatsAppVideoMessage whatsAppVideoMessage) {
        return new SendWhatsAppVideoMessageRequest(whatsAppVideoMessage);
    }
}
