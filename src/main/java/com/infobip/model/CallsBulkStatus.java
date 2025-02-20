/*
 * This class is auto generated from the Infobip OpenAPI specification
 * through the OpenAPI Specification Client API libraries (Re)Generator (OSCAR),
 * powered by the OpenAPI Generator (https://openapi-generator.tech).
 *
 * Do not edit manually. To learn how to raise an issue, see the CONTRIBUTING guide
 * or contact us @ support@infobip.com.
 */

package com.infobip.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Status of the bulk. Possible values are &#x60;PENDING&#x60;, &#x60;PAUSED&#x60;, &#x60;CANCELED&#x60;, &#x60;PROCESSING&#x60; and &#x60;FINISHED&#x60;
 */
public enum CallsBulkStatus {
    PENDING("PENDING"),
    PAUSED("PAUSED"),
    PROCESSING("PROCESSING"),
    CANCELED("CANCELED"),
    FINISHED("FINISHED"),
    FAILED("FAILED");

    private final String value;

    CallsBulkStatus(String value) {
        this.value = value;
    }

    @JsonValue
    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    @JsonCreator
    public static CallsBulkStatus fromValue(String value) {
        for (CallsBulkStatus enumElement : CallsBulkStatus.values()) {
            if (enumElement.value.equals(value)) {
                return enumElement;
            }
        }
        throw new IllegalArgumentException("Unexpected enum value '" + value + "'.");
    }
}
