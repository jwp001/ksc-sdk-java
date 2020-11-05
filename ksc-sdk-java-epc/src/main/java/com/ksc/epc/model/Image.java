package com.ksc.epc.model;


public class Image {

    /**
     * 镜像ID
     */
    private String imageId;
    /**
     * 镜像名称
     */
    private String imageName;
    /**
     * 镜像类别
     */
    private String imageType;
    /**
     * 操作系统名称
     */
    private String osName;
    /**
     * 操作系统类型
     */
    private String osType;
    /**
     * 是否支持容器
     */
    private Boolean enableContainer;
    /**
     * 创建时间
     */
    private String createTime;

    public void setImageId(String imageId) {
        this.imageId = imageId;
    }

    public String getImageId() {
        return imageId;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }

    public String getImageName() {
        return imageName;
    }

    public void setImageType(String imageType) {
        this.imageType = imageType;
    }

    public String getImageType() {
        return imageType;
    }

    public void setOsName(String osName) {
        this.osName = osName;
    }

    public String getOsName() {
        return osName;
    }

    public void setOsType(String osType) {
        this.osType = osType;
    }

    public String getOsType() {
        return osType;
    }

    public void setEnableContainer(Boolean enableContainer) {
        this.enableContainer = enableContainer;
    }

    public Boolean getEnableContainer() {
        return enableContainer;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getCreateTime() {
        return createTime;
    }

    public String toString() {
        return "Image(ImageId=" + this.getImageId() + ",ImageName=" + this.getImageName() + ",ImageType=" + this.getImageType() + ",OsName=" + this.getOsName() + ",OsType=" + this.getOsType() + ",EnableContainer=" + this.getEnableContainer() + ",CreateTime=" + this.getCreateTime() + ")";
    }

}
