package ca.geer.domain;

public class CertificationImg {
    private Long certificationImgId;
    private String imgAddress;
    private String imgDesc;
    private Integer priority;
    private Long profileId;

    public Long getProfileId() {
        return profileId;
    }

    public void setProfileId(Long profileId) {
        this.profileId = profileId;
    }

    public Long getCertificationImgId() {
        return certificationImgId;
    }

    public void setCertificationImgId(Long certificationImgId) {
        this.certificationImgId = certificationImgId;
    }

    public String getImgAddress() {
        return imgAddress;
    }

    public void setImgAddress(String imgAddress) {
        this.imgAddress = imgAddress;
    }

    public String getImgDesc() {
        return imgDesc;
    }

    public void setImgDesc(String imgDesc) {
        this.imgDesc = imgDesc;
    }

    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }
}
