package com.backend.entity;

public class UserAuth {
    private Integer id;

    private Integer userid;

    private String identitytype;

    private String identifier;

    private String credential;

    public UserAuth(Integer id, Integer userid, String identitytype, String identifier, String credential) {
        this.id = id;
        this.userid = userid;
        this.identitytype = identitytype;
        this.identifier = identifier;
        this.credential = credential;
    }

    public UserAuth() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getIdentitytype() {
        return identitytype;
    }

    public void setIdentitytype(String identitytype) {
        this.identitytype = identitytype == null ? null : identitytype.trim();
    }

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier == null ? null : identifier.trim();
    }

    public String getCredential() {
        return credential;
    }

    public void setCredential(String credential) {
        this.credential = credential == null ? null : credential.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", userid=").append(userid);
        sb.append(", identitytype=").append(identitytype);
        sb.append(", identifier=").append(identifier);
        sb.append(", credential=").append(credential);
        sb.append("]");
        return sb.toString();
    }
}