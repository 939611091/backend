package com.backend.entity;

public class GardenImages {
    private Integer id;

    private Integer gardenid;

    private String url;

    private String name;

    public GardenImages(Integer id, Integer gardenid, String url, String name) {
        this.id = id;
        this.gardenid = gardenid;
        this.url = url;
        this.name = name;
    }

    public GardenImages() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getGardenid() {
        return gardenid;
    }

    public void setGardenid(Integer gardenid) {
        this.gardenid = gardenid;
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
        sb.append(", gardenid=").append(gardenid);
        sb.append(", url=").append(url);
        sb.append(", name=").append(name);
        sb.append("]");
        return sb.toString();
    }
}