package com.capgemini.south_node_proxy.domain.model;

import java.util.Objects;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotNull;

/**
 * HugePage
 */
@Validated

public class HugePage   {
  /**
   * Size of hugepage
   */
  public enum PageSizeEnum {
    _2MB("2MB"),
    
    _4MB("4MB"),
    
    _1GB("1GB");

    private String value;

    PageSizeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static PageSizeEnum fromValue(String text) {
      for (PageSizeEnum b : PageSizeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }
  @JsonProperty("pageSize")

  private PageSizeEnum pageSize = null;

  @JsonProperty("number")

  private Integer number = null;


  public HugePage pageSize(PageSizeEnum pageSize) { 

    this.pageSize = pageSize;
    return this;
  }

  /**
   * Size of hugepage
   * @return pageSize
   **/
  
  @Schema(required = true, description = "Size of hugepage")
  
  @NotNull
  public PageSizeEnum getPageSize() {  
    return pageSize;
  }



  public void setPageSize(PageSizeEnum pageSize) { 

    this.pageSize = pageSize;
  }

  public HugePage number(Integer number) { 

    this.number = number;
    return this;
  }

  /**
   * Total number of huge pages
   * @return number
   **/
  
  @Schema(required = true, description = "Total number of huge pages")
  
  @NotNull
  public Integer getNumber() {  
    return number;
  }



  public void setNumber(Integer number) { 

    this.number = number;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HugePage hugePage = (HugePage) o;
    return Objects.equals(this.pageSize, hugePage.pageSize) &&
        Objects.equals(this.number, hugePage.number);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pageSize, number);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HugePage {\n");
    
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
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
