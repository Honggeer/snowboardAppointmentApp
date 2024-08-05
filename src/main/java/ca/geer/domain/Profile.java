package ca.geer.domain;

import java.util.List;

public class Profile {
    private Long profileId;
    private Long userId;
    private String email;
    private Long phone;
    private String bio;
    private String photo;
    private Integer level; //0-5
    private String gender;
    private List<CertificationImg> certificationImgs;
    private Integer verified; //0--not 1--yes

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getProfileId() {
        return profileId;
    }

    public void setProfileId(Long profileId) {
        this.profileId = profileId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getPhone() {
        return phone;
    }

    public void setPhone(Long phone) {
        this.phone = phone;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public List<CertificationImg> getCertificationImgs() {
        return certificationImgs;
    }

    public void setCertificationImgs(List<CertificationImg> certificationImgs) {
        this.certificationImgs = certificationImgs;
    }

    public Integer getVerified() {
        return verified;
    }

    public void setVerified(Integer verified) {
        this.verified = verified;
    }
}
