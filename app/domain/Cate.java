package domain;

import java.io.Serializable;

/**
 * A entity for commodity categories.
 * <p>
 * <p>
 *
 * @author Sunny Wu
 */
public class Cate implements Serializable {

    /**
     * * cateId primary key.
     */
    private Integer cateId;

    /**
     * parent cateId.
     */
    private Integer parentCateId;

    /**
     * cate  chinese name.
     */
    private String cateNameCn;

    /**
     * cate English name.
     */
    private String cateNameEn;

    /**
     * cate Korean name.
     */
    private String cateNameKr;

    /**
     * cate for picture url.
     */
    private String cateDesc;

    public Integer getCateId() {
        return cateId;
    }

    public void setCateId(Integer cateId) {
        this.cateId = cateId;
    }

    public Integer getParentCateId() {
        return parentCateId;
    }

    public void setParentCateId(Integer parentCateId) {
        this.parentCateId = parentCateId;
    }

    public String getCateNameCn() {
        return cateNameCn;
    }

    public void setCateNameCn(String cateNameCn) {
        this.cateNameCn = cateNameCn;
    }

    public String getCateNameEn() {
        return cateNameEn;
    }

    public void setCateNameEn(String cateNameEn) {
        this.cateNameEn = cateNameEn;
    }

    public String getCateNameKr() {
        return cateNameKr;
    }

    public void setCateNameKr(String cateNameKr) {
        this.cateNameKr = cateNameKr;
    }

    public Cate(Integer cateId, Integer parentCateId, String cateNameCn, String cateNameEn, String cateNameKr, String cateDesc) {
        this.cateId = cateId;
        this.parentCateId = parentCateId;
        this.cateNameCn = cateNameCn;
        this.cateNameEn = cateNameEn;
        this.cateNameKr = cateNameKr;
        this.cateDesc = cateDesc;
    }

    public String getCateDesc() {
        return cateDesc;
    }

    public void setCateDesc(String cateDesc) {
        this.cateDesc = cateDesc;
    }


}
