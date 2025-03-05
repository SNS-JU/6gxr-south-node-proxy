package com.capgemini.south_node_proxy.domain.model;

import java.time.OffsetDateTime;
import java.util.Objects;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.Nulls;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

/**
 * The notification callback
 */
@Schema(description = "The notification callback")
@Validated


public class CloudEvent1   {
  @JsonProperty("id")

  private String id = null;

  @JsonProperty("source")

  private String source = null;

  @JsonProperty("type")

  private String type = null;

  /**
   * Version of the specification to which this event conforms (must be 1.0 if it conforms to cloudevents 1.0.2 version)
   */
  public enum SpecversionEnum {
    _1_0("1.0");

    private String value;

    SpecversionEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static SpecversionEnum fromValue(String text) {
      for (SpecversionEnum b : SpecversionEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }
  @JsonProperty("specversion")

  private SpecversionEnum specversion = null;

  /**
   * media-type that describes the event payload encoding, must be \"application/json\" for CAMARA APIs
   */
  public enum DatacontenttypeEnum {
    APPLICATION_JSON("application/json");

    private String value;

    DatacontenttypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static DatacontenttypeEnum fromValue(String text) {
      for (DatacontenttypeEnum b : DatacontenttypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }
  @JsonProperty("datacontenttype")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private DatacontenttypeEnum datacontenttype = null;

  @JsonProperty("data")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private AllOfCloudEvent1Data data = null;

  @JsonProperty("time")

  private OffsetDateTime time = null;


  public CloudEvent1 id(String id) { 

    this.id = id;
    return this;
  }

  /**
   * identifier of this event, that must be unique in the source context.
   * @return id
   **/
  
  @Schema(required = true, description = "identifier of this event, that must be unique in the source context.")
  
  @NotNull
@Size(min=1)   public String getId() {  
    return id;
  }



  public void setId(String id) { 

    this.id = id;
  }

  public CloudEvent1 source(String source) { 

    this.source = source;
    return this;
  }

  /**
   * Identifies the context in which an event happened - be a non-empty `URI-reference` like: - URI with a DNS authority:   * https://github.com/cloudevents   * mailto:cncf-wg-serverless@lists.cncf.io - Universally-unique URN with a UUID:   * urn:uuid:6e8bc430-9c3a-11d9-9669-0800200c9a66 - Application-specific identifier:   * /cloudevents/spec/pull/123   * 1-555-123-4567 
   * @return source
   **/
  
  @Schema(example = "https://notificationSendServer12.supertelco.com", required = true, description = "Identifies the context in which an event happened - be a non-empty `URI-reference` like: - URI with a DNS authority:   * https://github.com/cloudevents   * mailto:cncf-wg-serverless@lists.cncf.io - Universally-unique URN with a UUID:   * urn:uuid:6e8bc430-9c3a-11d9-9669-0800200c9a66 - Application-specific identifier:   * /cloudevents/spec/pull/123   * 1-555-123-4567 ")
  
  @NotNull
@Size(min=1)   public String getSource() {  
    return source;
  }



  public void setSource(String source) { 

    this.source = source;
  }

  public CloudEvent1 type(String type) { 

    this.type = type;
    return this;
  }

  /**
   * type of event as defined in each CAMARA API
   * @return type
   **/
  
  @Schema(example = "org.camaraproject.iot.dta-status-changed-event", required = true, description = "type of event as defined in each CAMARA API")
  
  @NotNull
@Size(min=25)   public String getType() {  
    return type;
  }



  public void setType(String type) { 

    this.type = type;
  }

  public CloudEvent1 specversion(SpecversionEnum specversion) { 

    this.specversion = specversion;
    return this;
  }

  /**
   * Version of the specification to which this event conforms (must be 1.0 if it conforms to cloudevents 1.0.2 version)
   * @return specversion
   **/
  
  @Schema(required = true, description = "Version of the specification to which this event conforms (must be 1.0 if it conforms to cloudevents 1.0.2 version)")
  
  @NotNull
  public SpecversionEnum getSpecversion() {  
    return specversion;
  }



  public void setSpecversion(SpecversionEnum specversion) { 

    this.specversion = specversion;
  }

  public CloudEvent1 datacontenttype(DatacontenttypeEnum datacontenttype) { 

    this.datacontenttype = datacontenttype;
    return this;
  }

  /**
   * media-type that describes the event payload encoding, must be \"application/json\" for CAMARA APIs
   * @return datacontenttype
   **/
  
  @Schema(description = "media-type that describes the event payload encoding, must be \"application/json\" for CAMARA APIs")
  
  public DatacontenttypeEnum getDatacontenttype() {  
    return datacontenttype;
  }



  public void setDatacontenttype(DatacontenttypeEnum datacontenttype) { 
    this.datacontenttype = datacontenttype;
  }

  public CloudEvent1 data(AllOfCloudEvent1Data data) { 

    this.data = data;
    return this;
  }

  /**
   * Event details payload described in each CAMARA API and referenced by its type
   * @return data
   **/
  
  @Schema(description = "Event details payload described in each CAMARA API and referenced by its type")
  
  public AllOfCloudEvent1Data getData() {  
    return data;
  }



  public void setData(AllOfCloudEvent1Data data) { 
    this.data = data;
  }

  public CloudEvent1 time(OffsetDateTime time) { 

    this.time = time;
    return this;
  }

  /**
   * Timestamp of when the occurrence happened. Must adhere to RFC 3339. WARN: This optional field in CloudEvents specification is required in CAMARA APIs implementation. 
   * @return time
   **/
  
  @Schema(example = "2018-04-05T17:31Z", required = true, description = "Timestamp of when the occurrence happened. Must adhere to RFC 3339. WARN: This optional field in CloudEvents specification is required in CAMARA APIs implementation. ")
  
@Valid
  @NotNull
  public OffsetDateTime getTime() {  
    return time;
  }



  public void setTime(OffsetDateTime time) { 

    this.time = time;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CloudEvent1 cloudEvent1 = (CloudEvent1) o;
    return Objects.equals(this.id, cloudEvent1.id) &&
        Objects.equals(this.source, cloudEvent1.source) &&
        Objects.equals(this.type, cloudEvent1.type) &&
        Objects.equals(this.specversion, cloudEvent1.specversion) &&
        Objects.equals(this.datacontenttype, cloudEvent1.datacontenttype) &&
        Objects.equals(this.data, cloudEvent1.data) &&
        Objects.equals(this.time, cloudEvent1.time);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, source, type, specversion, datacontenttype, data, time);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CloudEvent1 {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    specversion: ").append(toIndentedString(specversion)).append("\n");
    sb.append("    datacontenttype: ").append(toIndentedString(datacontenttype)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
