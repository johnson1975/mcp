package com.cntaipingasset.mcp.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by Johnson on 2015/4/16.
 */
@Entity
public class AlternativeInvestment implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Integer number;
    private String name;
    private Integer type;
    private Integer span; // 期限
    private String estimatedAmount; // 拟投资规模
    private String currentAmount; // 已投资规模
    private String investmentManager;
}
