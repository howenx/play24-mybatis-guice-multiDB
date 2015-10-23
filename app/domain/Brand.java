package domain;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 * A entity for commodity brands.
 * <p>
 * <p>
 *
 * @author Sunny Wu
 */
public class Brand implements Serializable {
    /**
     * brand id.
     */
    private Long brandId;


    /**
     * brand chinese description.
     */
    private String descriptionCn;

    /**
     * brand english description.
     */
    private String descriptionEn;

    /**
     * brand korean description.
     */
    private String descriptionKr;

    /**
     * logo url.
     */
    private String logoUrl;

    /**
     * brand internet homepage.
     */
    private String homePage;

    /**
     * item create date.
     */
    private Timestamp createDate;

    /**
     * brand chinese name.
     */
    private String brandNmCn;

    /**
     * brand english name.
     */
    private String brandNmEn;

    /**

     * brand korean name.
     */
    private String brandNmKr;

    public Brand(Long brandId, String descriptionCn, String descriptionEn, String descriptionKr, String logoUrl, String homePage, Timestamp createDate, String brandNmCn, String brandNmEn, String brandNmKr) {
        this.brandId = brandId;
        this.descriptionCn = descriptionCn;
        this.descriptionEn = descriptionEn;
        this.descriptionKr = descriptionKr;
        this.logoUrl = logoUrl;
        this.homePage = homePage;
        this.createDate = createDate;
        this.brandNmCn = brandNmCn;
        this.brandNmEn = brandNmEn;
        this.brandNmKr = brandNmKr;
    }

    public Long getBrandId() {
        return brandId;
    }

    public void setBrandId(Long brandId) {
        this.brandId = brandId;
    }

    public String getDescriptionCn() {
        return descriptionCn;
    }

    public void setDescriptionCn(String descriptionCn) {
        this.descriptionCn = descriptionCn;
    }

    public String getDescriptionEn() {
        return descriptionEn;
    }

    public void setDescriptionEn(String descriptionEn) {
        this.descriptionEn = descriptionEn;
    }

    public String getDescriptionKr() {
        return descriptionKr;
    }

    public void setDescriptionKr(String descriptionKr) {
        this.descriptionKr = descriptionKr;
    }

    public String getLogoUrl() {
        return logoUrl;
    }

    public void setLogoUrl(String logoUrl) {
        this.logoUrl = logoUrl;
    }

    public String getHomePage() {
        return homePage;
    }

    public void setHomePage(String homePage) {
        this.homePage = homePage;
    }

    public Timestamp getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Timestamp createDate) {
        this.createDate = createDate;
    }

    public String getBrandNmCn() {
        return brandNmCn;
    }

    public void setBrandNmCn(String brandNmCn) {
        this.brandNmCn = brandNmCn;
    }

    public String getBrandNmEn() {
        return brandNmEn;
    }

    public void setBrandNmEn(String brandNmEn) {
        this.brandNmEn = brandNmEn;
    }

    public String getBrandNmKr() {
        return brandNmKr;
    }

    public void setBrandNmKr(String brandNmKr) {
        this.brandNmKr = brandNmKr;
    }
}
