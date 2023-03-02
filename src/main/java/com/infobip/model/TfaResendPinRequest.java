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
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Represents TfaResendPinRequest model.
 */
public class TfaResendPinRequest {

    private Map<String, String> placeholders = null;

    /**
     * Sets placeholders.
     * <p>
     * Field description:
     * Key value pairs that will be replaced during message sending. Placeholder keys should NOT contain curly brackets and should NOT contain a &#x60;pin&#x60; placeholder. Valid example: &#x60;\&quot;placeholders\&quot;:{\&quot;firstName\&quot;:\&quot;John\&quot;}&#x60;
     *
     * @param placeholders
     * @return This {@link TfaResendPinRequest instance}.
     */
    public TfaResendPinRequest placeholders(Map<String, String> placeholders) {
        this.placeholders = placeholders;
        return this;
    }

    /**
     * Puts and entry into placeholders.
     * <p>
     * Field description:
     * Key value pairs that will be replaced during message sending. Placeholder keys should NOT contain curly brackets and should NOT contain a &#x60;pin&#x60; placeholder. Valid example: &#x60;\&quot;placeholders\&quot;:{\&quot;firstName\&quot;:\&quot;John\&quot;}&#x60;
     *
     * @param key The given key.
     * @param placeholdersItem The item to be associated with the given key.
     * @return This {@link TfaResendPinRequest instance}.
     */
    public TfaResendPinRequest putPlaceholdersItem(String key, String placeholdersItem) {
        if (this.placeholders == null) {
            this.placeholders = new HashMap<>();
        }
        this.placeholders.put(key, placeholdersItem);
        return this;
    }

    /**
     * Returns placeholders.
     * <p>
     * Field description:
     * Key value pairs that will be replaced during message sending. Placeholder keys should NOT contain curly brackets and should NOT contain a &#x60;pin&#x60; placeholder. Valid example: &#x60;\&quot;placeholders\&quot;:{\&quot;firstName\&quot;:\&quot;John\&quot;}&#x60;
     *
     * @return placeholders
     */
    @JsonProperty("placeholders")
    public Map<String, String> getPlaceholders() {
        return placeholders;
    }

    /**
     * Sets placeholders.
     * <p>
     * Field description:
     * Key value pairs that will be replaced during message sending. Placeholder keys should NOT contain curly brackets and should NOT contain a &#x60;pin&#x60; placeholder. Valid example: &#x60;\&quot;placeholders\&quot;:{\&quot;firstName\&quot;:\&quot;John\&quot;}&#x60;
     *
     * @param placeholders
     */
    @JsonProperty("placeholders")
    public void setPlaceholders(Map<String, String> placeholders) {
        this.placeholders = placeholders;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TfaResendPinRequest tfaResendPinRequest = (TfaResendPinRequest) o;
        return Objects.equals(this.placeholders, tfaResendPinRequest.placeholders);
    }

    @Override
    public int hashCode() {
        return Objects.hash(placeholders);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class TfaResendPinRequest {")
                .append(newLine)
                .append("    placeholders: ")
                .append(toIndentedString(placeholders))
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
