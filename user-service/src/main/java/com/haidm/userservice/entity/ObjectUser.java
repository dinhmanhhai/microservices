package com.haidm.userservice.entity;


import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import org.springframework.context.annotation.Configuration;

@Configuration
@Entity
@Table(name = "user")
@Setter
@Getter
public class ObjectUser {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;
  private String userName;
  private String password;
  private Integer age;
  private String sex;
  private String address;
  private Boolean isDeleted;

  @OneToOne(cascade = CascadeType.ALL)
  @JoinColumn(name = "property_id", referencedColumnName = "id")
  private Property property;


}
