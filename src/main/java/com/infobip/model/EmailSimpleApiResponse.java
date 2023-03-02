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
 * Represents EmailSimpleApiResponse model.
 */
public class EmailSimpleApiResponse {

    private String result;

    /**
     * Sets result.
     * <p>
     * The field is required.
     *
     * @param result
     * @return This {@link EmailSimpleApiResponse instance}.
     */
    public EmailSimpleApiResponse result(String result) {
        this.result = result;
        return this;
    }

    /**
     * Returns result.
     * <p>
     * The field is required.
     *
     * @return result
     */
    @JsonProperty("result")
    public String getResult() {
        return result;
    }

    /**
     * Sets result.
     * <p>
     * The field is required.
     *
     * @param result
     */
    @JsonProperty("result")
    public void setResult(String result) {
        this.result = result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        EmailSimpleApiResponse emailSimpleApiResponse = (EmailSimpleApiResponse) o;
        return Objects.equals(this.result, emailSimpleApiResponse.result);
    }

    @Override
    public int hashCode() {
        return Objects.hash(result);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class EmailSimpleApiResponse {")
                .append(newLine)
                .append("    result: ")
                .append(toIndentedString(result))
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
