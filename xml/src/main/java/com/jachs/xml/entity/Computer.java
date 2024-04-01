package com.jachs.xml.entity;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/***
 * 
 * @author zhanchaohan
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Computer {
    private String computerId;
    private String computerName;
    private Long computerPrice;
    private Date madeTime;
}
