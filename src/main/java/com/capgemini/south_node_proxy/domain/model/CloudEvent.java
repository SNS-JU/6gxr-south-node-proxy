package com.capgemini.south_node_proxy.domain.model;

import java.time.OffsetDateTime;
import java.util.Objects;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeId;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.Nulls;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 * Event compliant with the CloudEvents specification
 */
@Schema(description = "Event compliant with the CloudEvents specification")
@Validated
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type", visible = true )
@JsonSubTypes({
        @JsonSubTypes.Type(value = EventQosStatusChanged.class, name = "org.camaraproject.quality-on-demand.v1.qos-status-changed"),
})


public class CloudEvent   {
  @JsonProperty("id")

  private String id = null;

  @JsonProperty("source")

  private String source = null;

  /**
   * The type of the event.
   */
  public enum TypeEnum {
    ORG_CAMARAPROJECT_QUALITY_ON_DEMAND_V1_QOS_STATUS_CHANGED("org.camaraproject.quality-on-demand.v1.qos-status-changed");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static TypeEnum fromValue(String text) {
      for (TypeEnum b : TypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }
  @JsonTypeId

  private TypeEnum type = null;

  /**
   * Version of the specification to which this event conforms (must be 1.0 if it conforms to Cloudevents 1.0.2 version)
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
  private Object data = null;

  @JsonProperty("time")

  private OffsetDateTime time = null;


  public CloudEvent id(String id) { 

    this.id = id;
    return this;
  }

  /**
   * Identifier of this event, that must be unique in the source context.
   * @return id
   **/
  
  @Schema(required = true, description = "Identifier of this event, that must be unique in the source context.")
  
  @NotNull
  public String getId() {  
    return id;
  }



  public void setId(String id) { 

    this.id = id;
  }

  public CloudEvent source(String source) { 

    this.source = source;
    return this;
  }

  /**
   * Identifies the context in which an event happened in the specific provider implementation.
   * @return source
   **/
  
  @Schema(required = true, description = "Identifies the context in which an event happened in the specific provider implementation.")
  
  @NotNull
  public String getSource() {  
    return source;
  }



  public void setSource(String source) { 

    this.source = source;
  }

  public CloudEvent type(TypeEnum type) { 

    this.type = type;
    return this;
  }

  /**
   * The type of the event.
   * @return type
   **/
  
  @Schema(required = true, description = "The type of the event.")
  
  @NotNull
  public TypeEnum getType() {  
    return type;
  }



  public void setType(TypeEnum type) { 

    this.type = type;
  }

  public CloudEvent specversion(SpecversionEnum specversion) { 

    this.specversion = specversion;
    return this;
  }

  /**
   * Version of the specification to which this event conforms (must be 1.0 if it conforms to Cloudevents 1.0.2 version)
   * @return specversion
   **/
  
  @Schema(required = true, description = "Version of the specification to which this event conforms (must be 1.0 if it conforms to Cloudevents 1.0.2 version)")
  
  @NotNull
  public SpecversionEnum getSpecversion() {  
    return specversion;
  }



  public void setSpecversion(SpecversionEnum specversion) { 

    this.specversion = specversion;
  }

  public CloudEvent datacontenttype(DatacontenttypeEnum datacontenttype) { 

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

  public CloudEvent data(Object data) { 

    this.data = data;
    return this;
  }

  /**
   * Event notification details payload, which depends on the event type
   * @return data
   **/
  
  @Schema(description = "Event notification details payload, which depends on the event type")
  
  public Object getData() {  
    return data;
  }



  public void setData(Object data) { 
    this.data = data;
  }

  public CloudEvent time(OffsetDateTime time) { 

    this.time = time;
    return this;
  }

  /**
   * Timestamp of when the occurrence happened. It must follow RFC 3339 
   * @return time
   **/
  
  @Schema(required = true, description = "Timestamp of when the occurrence happened. It must follow RFC 3339 ")
  
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
    CloudEvent cloudEvent = (CloudEvent) o;
    return Objects.equals(this.id, cloudEvent.id) &&
        Objects.equals(this.source, cloudEvent.source) &&
        Objects.equals(this.type, cloudEvent.type) &&
        Objects.equals(this.specversion, cloudEvent.specversion) &&
        Objects.equals(this.datacontenttype, cloudEvent.datacontenttype) &&
        Objects.equals(this.data, cloudEvent.data) &&
        Objects.equals(this.time, cloudEvent.time);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, source, type, specversion, datacontenttype, data, time);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CloudEvent {\n");
    
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
