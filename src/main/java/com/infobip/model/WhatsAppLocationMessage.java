/*
 * This class is auto generated from the Infobip OpenAPI specification
 * through the OpenAPI Specification Client API libraries (Re)Generator (OSCAR),
 * powered by the OpenAPI Generator (https://openapi-generator.tech).
 *
 * Do not edit manually. To learn how to raise an issue, see the CONTRIBUTING guide
 * or contact us @ support@infobip.com.
 */

package com.infobip.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * Represents WhatsAppLocationMessage model.
 */
public class WhatsAppLocationMessage {

    private String from;

    private String to;

    private String messageId;

    private WhatsAppLocationContent content;

    private String callbackData;

    private String notifyUrl;

    /**
     * Sets from.
     * <p>
     * Field description:
     * Registered WhatsApp sender number. Must be in international format and comply with [WhatsApp&#39;s requirements](https://www.infobip.com/docs/whatsapp/get-started#phone-number-what-you-need-to-know).
     * <p>
     * The field is required.
     *
     * @param from
     * @return This {@link WhatsAppLocationMessage instance}.
     */
    public WhatsAppLocationMessage from(String from) {
        this.from = from;
        return this;
    }

    /**
     * Returns from.
     * <p>
     * Field description:
     * Registered WhatsApp sender number. Must be in international format and comply with [WhatsApp&#39;s requirements](https://www.infobip.com/docs/whatsapp/get-started#phone-number-what-you-need-to-know).
     * <p>
     * The field is required.
     *
     * @return from
     */
    @JsonProperty("from")
    public String getFrom() {
        return from;
    }

    /**
     * Sets from.
     * <p>
     * Field description:
     * Registered WhatsApp sender number. Must be in international format and comply with [WhatsApp&#39;s requirements](https://www.infobip.com/docs/whatsapp/get-started#phone-number-what-you-need-to-know).
     * <p>
     * The field is required.
     *
     * @param from
     */
    @JsonProperty("from")
    public void setFrom(String from) {
        this.from = from;
    }

    /**
     * Sets to.
     * <p>
     * Field description:
     * Message recipient number. Must be in international format.
     * <p>
     * The field is required.
     *
     * @param to
     * @return This {@link WhatsAppLocationMessage instance}.
     */
    public WhatsAppLocationMessage to(String to) {
        this.to = to;
        return this;
    }

    /**
     * Returns to.
     * <p>
     * Field description:
     * Message recipient number. Must be in international format.
     * <p>
     * The field is required.
     *
     * @return to
     */
    @JsonProperty("to")
    public String getTo() {
        return to;
    }

    /**
     * Sets to.
     * <p>
     * Field description:
     * Message recipient number. Must be in international format.
     * <p>
     * The field is required.
     *
     * @param to
     */
    @JsonProperty("to")
    public void setTo(String to) {
        this.to = to;
    }

    /**
     * Sets messageId.
     * <p>
     * Field description:
     * The ID that uniquely identifies the message sent.
     *
     * @param messageId
     * @return This {@link WhatsAppLocationMessage instance}.
     */
    public WhatsAppLocationMessage messageId(String messageId) {
        this.messageId = messageId;
        return this;
    }

    /**
     * Returns messageId.
     * <p>
     * Field description:
     * The ID that uniquely identifies the message sent.
     *
     * @return messageId
     */
    @JsonProperty("messageId")
    public String getMessageId() {
        return messageId;
    }

    /**
     * Sets messageId.
     * <p>
     * Field description:
     * The ID that uniquely identifies the message sent.
     *
     * @param messageId
     */
    @JsonProperty("messageId")
    public void setMessageId(String messageId) {
        this.messageId = messageId;
    }

    /**
     * Sets content.
     * <p>
     * The field is required.
     *
     * @param content
     * @return This {@link WhatsAppLocationMessage instance}.
     */
    public WhatsAppLocationMessage content(WhatsAppLocationContent content) {
        this.content = content;
        return this;
    }

    /**
     * Returns content.
     * <p>
     * The field is required.
     *
     * @return content
     */
    @JsonProperty("content")
    public WhatsAppLocationContent getContent() {
        return content;
    }

    /**
     * Sets content.
     * <p>
     * The field is required.
     *
     * @param content
     */
    @JsonProperty("content")
    public void setContent(WhatsAppLocationContent content) {
        this.content = content;
    }

    /**
     * Sets callbackData.
     * <p>
     * Field description:
     * Custom client data that will be included in a [Delivery Report](#channels/whatsapp/receive-whatsapp-delivery-reports).
     *
     * @param callbackData
     * @return This {@link WhatsAppLocationMessage instance}.
     */
    public WhatsAppLocationMessage callbackData(String callbackData) {
        this.callbackData = callbackData;
        return this;
    }

    /**
     * Returns callbackData.
     * <p>
     * Field description:
     * Custom client data that will be included in a [Delivery Report](#channels/whatsapp/receive-whatsapp-delivery-reports).
     *
     * @return callbackData
     */
    @JsonProperty("callbackData")
    public String getCallbackData() {
        return callbackData;
    }

    /**
     * Sets callbackData.
     * <p>
     * Field description:
     * Custom client data that will be included in a [Delivery Report](#channels/whatsapp/receive-whatsapp-delivery-reports).
     *
     * @param callbackData
     */
    @JsonProperty("callbackData")
    public void setCallbackData(String callbackData) {
        this.callbackData = callbackData;
    }

    /**
     * Sets notifyUrl.
     * <p>
     * Field description:
     * The URL on your callback server to which delivery and seen reports will be sent. [Delivery report format](#channels/whatsapp/receive-whatsapp-delivery-reports), [Seen report format](#channels/whatsapp/receive-whatsapp-seen-reports).
     *
     * @param notifyUrl
     * @return This {@link WhatsAppLocationMessage instance}.
     */
    public WhatsAppLocationMessage notifyUrl(String notifyUrl) {
        this.notifyUrl = notifyUrl;
        return this;
    }

    /**
     * Returns notifyUrl.
     * <p>
     * Field description:
     * The URL on your callback server to which delivery and seen reports will be sent. [Delivery report format](#channels/whatsapp/receive-whatsapp-delivery-reports), [Seen report format](#channels/whatsapp/receive-whatsapp-seen-reports).
     *
     * @return notifyUrl
     */
    @JsonProperty("notifyUrl")
    public String getNotifyUrl() {
        return notifyUrl;
    }

    /**
     * Sets notifyUrl.
     * <p>
     * Field description:
     * The URL on your callback server to which delivery and seen reports will be sent. [Delivery report format](#channels/whatsapp/receive-whatsapp-delivery-reports), [Seen report format](#channels/whatsapp/receive-whatsapp-seen-reports).
     *
     * @param notifyUrl
     */
    @JsonProperty("notifyUrl")
    public void setNotifyUrl(String notifyUrl) {
        this.notifyUrl = notifyUrl;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WhatsAppLocationMessage whatsAppLocationMessage = (WhatsAppLocationMessage) o;
        return Objects.equals(this.from, whatsAppLocationMessage.from)
                && Objects.equals(this.to, whatsAppLocationMessage.to)
                && Objects.equals(this.messageId, whatsAppLocationMessage.messageId)
                && Objects.equals(this.content, whatsAppLocationMessage.content)
                && Objects.equals(this.callbackData, whatsAppLocationMessage.callbackData)
                && Objects.equals(this.notifyUrl, whatsAppLocationMessage.notifyUrl);
    }

    @Override
    public int hashCode() {
        return Objects.hash(from, to, messageId, content, callbackData, notifyUrl);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class WhatsAppLocationMessage {")
                .append(newLine)
                .append("    from: ")
                .append(toIndentedString(from))
                .append(newLine)
                .append("    to: ")
                .append(toIndentedString(to))
                .append(newLine)
                .append("    messageId: ")
                .append(toIndentedString(messageId))
                .append(newLine)
                .append("    content: ")
                .append(toIndentedString(content))
                .append(newLine)
                .append("    callbackData: ")
                .append(toIndentedString(callbackData))
                .append(newLine)
                .append("    notifyUrl: ")
                .append(toIndentedString(notifyUrl))
                .append(newLine)
                .append("}")
                .toString();
    }

    private String toIndentedString(Object o) {
        if (o == null) {
            return "null";
        }
        String lineSeparator = System.lineSeparator();
        String lineSeparatorFollowedByIndentation = lineSeparator + "    ";
        return o.toString().replace(lineSeparator, lineSeparatorFollowedByIndentation);
    }
}
