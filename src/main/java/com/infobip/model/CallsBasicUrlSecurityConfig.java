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
 * Represents CallsBasicUrlSecurityConfig model.
 */
public class CallsBasicUrlSecurityConfig extends CallsUrlSecurityConfig {

    private String username;

    private String password;

    /**
     * Constructs a new {@link CallsBasicUrlSecurityConfig} instance.
     */
    public CallsBasicUrlSecurityConfig() {
        super("BASIC");
    }

    /**
     * Sets username.
     * <p>
     * Field description:
     * Username.
     * <p>
     * The field is required.
     *
     * @param username
     * @return This {@link CallsBasicUrlSecurityConfig instance}.
     */
    public CallsBasicUrlSecurityConfig username(String username) {
        this.username = username;
        return this;
    }

    /**
     * Returns username.
     * <p>
     * Field description:
     * Username.
     * <p>
     * The field is required.
     *
     * @return username
     */
    @JsonProperty("username")
    public String getUsername() {
        return username;
    }

    /**
     * Sets username.
     * <p>
     * Field description:
     * Username.
     * <p>
     * The field is required.
     *
     * @param username
     */
    @JsonProperty("username")
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * Sets password.
     * <p>
     * Field description:
     * Password.
     * <p>
     * The field is required.
     *
     * @param password
     * @return This {@link CallsBasicUrlSecurityConfig instance}.
     */
    public CallsBasicUrlSecurityConfig password(String password) {
        this.password = password;
        return this;
    }

    /**
     * Returns password.
     * <p>
     * Field description:
     * Password.
     * <p>
     * The field is required.
     *
     * @return password
     */
    @JsonProperty("password")
    public String getPassword() {
        return password;
    }

    /**
     * Sets password.
     * <p>
     * Field description:
     * Password.
     * <p>
     * The field is required.
     *
     * @param password
     */
    @JsonProperty("password")
    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CallsBasicUrlSecurityConfig callsBasicUrlSecurityConfig = (CallsBasicUrlSecurityConfig) o;
        return Objects.equals(this.username, callsBasicUrlSecurityConfig.username)
                && Objects.equals(this.password, callsBasicUrlSecurityConfig.password)
                && super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(username, password, super.hashCode());
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class CallsBasicUrlSecurityConfig {")
                .append(newLine)
                .append("    ")
                .append(toIndentedString(super.toString()))
                .append(newLine)
                .append("    username: ")
                .append(toIndentedString(username))
                .append(newLine)
                .append("    password: ")
                .append(toIndentedString(password))
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
