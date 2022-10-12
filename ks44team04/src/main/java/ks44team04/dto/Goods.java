package ks44team04.dto;

public class Goods {

    private String goodsCode;
    private String goodsSmallCategory;
    private String sellerId;
    private String goodsName;
    private String goodsContent;
    private int goodsPrice;
    private int goodsDiscountRate;
    private int goodsPostPrice;
    private int goodsStock;
    private String soldoutCheck;
    private String stopSaleCheck;
    private String packagePostCheck;
    private String regularDeliverCheck;
    private String regDate;
    private String modifyDate;
    private String goodsFile;
    
    /* ~~~ 시작 ~~~ */
	private GoodsAnswer goodsAnswerInfo;
	public GoodsAnswer getGoodsAnswerInfo() {
		return goodsAnswerInfo;
	}
	public void setGoodsAnswerInfo(GoodsAnswer goodsAnswerInfo) {
		this.goodsAnswerInfo = goodsAnswerInfo;
	}
	
	private GoodsQna goodsQnaInfo;
	public GoodsQna getGoodsQnaInfo() {
		return goodsQnaInfo;
	}
	public void setUserInfoGoodsQnaInfo(GoodsQna goodsQnaInfo) {
		this.goodsQnaInfo = goodsQnaInfo;
	}
    
	private User userInfo;
	public User getUserInfo() {
		return userInfo;
	}
	public void setUserInfo(User userInfo) {
		this.userInfo = userInfo;
	}

	private GoodsSmallCategory goodsSmallCategoryInfo;
	public GoodsSmallCategory getGoodsSmallCategoryInfo() {
		return goodsSmallCategoryInfo;
	}
	public void setGoodsSmallCategoryInfo(GoodsSmallCategory goodsSmallCategoryInfo) {
		this.goodsSmallCategoryInfo = goodsSmallCategoryInfo;
	}
	
	private GoodsLargeCategory goodsLargeCategoryInfo;
	public GoodsLargeCategory getGoodsLargeCategoryInfo() {
		return goodsLargeCategoryInfo;
	}
	public void setGoodsLargeCategoryInfo(GoodsLargeCategory goodsLargeCategoryInfo) {
		this.goodsLargeCategoryInfo = goodsLargeCategoryInfo;
	}
	/* ~~~ 끝 ~~~ */
	
	public String getGoodsCode() {
        return goodsCode;
    }

    public void setGoodsCode(String goodsCode) {
        this.goodsCode = goodsCode;
    }

    public String getGoodsSmallCategory() {
        return goodsSmallCategory;
    }

    public void setGoodsSmallCategory(String goodsSmallCategory) {
        this.goodsSmallCategory = goodsSmallCategory;
    }

    public String getSellerId() {
        return sellerId;
    }

    public void setSellerId(String sellerId) {
        this.sellerId = sellerId;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public String getGoodsContent() {
        return goodsContent;
    }

    public void setGoodsContent(String goodsContent) {
        this.goodsContent = goodsContent;
    }

    public int getGoodsPrice() {
        return goodsPrice;
    }

    public void setGoodsPrice(int goodsPrice) {
        this.goodsPrice = goodsPrice;
    }

    public int getGoodsDiscountRate() {
        return goodsDiscountRate;
    }

    public void setGoodsDiscountRate(int goodsDiscountRate) {
        this.goodsDiscountRate = goodsDiscountRate;
    }

    public int getGoodsPostPrice() {
        return goodsPostPrice;
    }

    public void setGoodsPostPrice(int goodsPostPrice) {
        this.goodsPostPrice = goodsPostPrice;
    }

    public int getGoodsStock() {
        return goodsStock;
    }

    public void setGoodsStock(int goodsStock) {
        this.goodsStock = goodsStock;
    }

    public String getSoldoutCheck() {
        return soldoutCheck;
    }

    public void setSoldoutCheck(String soldoutCheck) {
        this.soldoutCheck = soldoutCheck;
    }

    public String getStopSaleCheck() {
        return stopSaleCheck;
    }

    public void setStopSaleCheck(String stopSaleCheck) {
        this.stopSaleCheck = stopSaleCheck;
    }

    public String getPackagePostCheck() {
        return packagePostCheck;
    }

    public void setPackagePostCheck(String packagePostCheck) {
        this.packagePostCheck = packagePostCheck;
    }

    public String getRegularDeliverCheck() {
        return regularDeliverCheck;
    }

    public void setRegularDeliverCheck(String regularDeliverCheck) {
        this.regularDeliverCheck = regularDeliverCheck;
    }

    public String getRegDate() {
        return regDate;
    }

    public void setRegDate(String regDate) {
        this.regDate = regDate;
    }
    
    public String getModifyDate() {
    	return modifyDate;
    }
    
    public void setModifyDate(String modifyDate) {
    	this.modifyDate = modifyDate;
    }

    public String getGoodsFile() {
        return goodsFile;
    }

    public void setGoodsFile(String goodsFile) {
        this.goodsFile = goodsFile;
    }

    @Override
    public String toString() {
        return "Goods{" +
                "goodsCode='" + goodsCode + '\'' +
                ", goodsSmallCategory='" + goodsSmallCategory + '\'' +
                ", sellerId='" + sellerId + '\'' +
                ", goodsName='" + goodsName + '\'' +
                ", goodsContent='" + goodsContent + '\'' +
                ", goodsPrice=" + goodsPrice +
                ", goodsDiscountRate=" + goodsDiscountRate +
                ", goodsPostPrice=" + goodsPostPrice +
                ", goodsStock=" + goodsStock +
                ", soldoutCheck='" + soldoutCheck + '\'' +
                ", stopSaleCheck='" + stopSaleCheck + '\'' +
                ", packagePostCheck='" + packagePostCheck + '\'' +
                ", regularDeliverCheck='" + regularDeliverCheck + '\'' +
                ", regDate='" + regDate + '\'' +
                ", goodsFile='" + goodsFile + '\'' +
                ", goodsAnswerInfo='" + goodsAnswerInfo + '\'' +
                ", userInfo='" + userInfo + '\'' +
                ", goodsSmallCategoryInfo='" + goodsSmallCategoryInfo + '\'' +
                ", goodsLargeCategoryInfo='" + goodsLargeCategoryInfo + '\'' +
                '}';
    }
}
