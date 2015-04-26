package com.cntaipingasset.mcp.domain.auth;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by Johnson on 2015/4/16.
 */
@Entity
public class Authority implements Serializable {
    private static final long serialVersionUID = 5477023594491142549L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "roleId")
    private Role role;
    private String name;
    private String authority;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthority() {
        return authority;
    }

    public void setAuthority(String authority) {
        this.authority = authority;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }
}
