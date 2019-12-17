package com.backend.entity;

public class FarmingImages {
    private Integer id;

    private Integer farmingid;

    private String url;

    private String name;

    public FarmingImages(Integer id, Integer farmingid, String url, String name) {
        this.id = id;
        this.farmingid = farmingid;
        this.url = url;
        this.name = name;
    }

    public FarmingImages() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getFarmingid() {
        return farmingid;
    }

    public void setFarmingid(Integer farmingid) {
        this.farmingid = farmingid;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", farmingid=").append(farmingid);
        sb.append(", url=").append(url);
        sb.append(", name=").append(name);
        sb.append("]");
        return sb.toString();
    }
}