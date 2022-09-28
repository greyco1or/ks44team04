package ks44team04.dto;

public class Seller {

    private String sellerCode;
    private String sellerId;
    private String storeName;
    private String sellerSort;
    private String bankName;
    private String account;
    private String accountHolder;
    private String licenceNum;
    private String storeAddress;
    private String storePhone;
    private String storeEmail;
    private String licenceImg;
    private String onlineLicenceImg;
    private String approveAskDate;
    private String approveDate;
    private String approveCheck;
    private String approveId;
    private User userInfo;
    private Goods goodsInfo;
    private LevelSellerCategory levelSeller;
    private Right rightDto;
    
    public String getSellerCode() {
        return sellerCode;
    }

    public void setSellerCode(String sellerCode) {
        this.sellerCode = sellerCode;
    }

    public String getSellerId() {
        return sellerId;
    }

    public void setSellerId(String sellerId) {
        this.sellerId = sellerId;
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public String getSellerSort() {
        return sellerSort;
    }

    public void setSellerSort(String sellerSort) {
        this.sellerSort = sellerSort;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public String getLicenceNum() {
        return licenceNum;
    }

    public void setLicenceNum(String licenceNum) {
        this.licenceNum = licenceNum;
    }

    public String getStoreAddress() {
        return storeAddress;
    }

    public void setStoreAddress(String storeAddress) {
        this.storeAddress = storeAddress;
    }

    public String getStorePhone() {
        return storePhone;
    }

    public void setStorePhone(String storePhone) {
        this.storePhone = storePhone;
    }

    public String getStoreEmail() {
        return storeEmail;
    }

    public void setStoreEmail(String storeEmail) {
        this.storeEmail = storeEmail;
    }

    public String getLicenceImg() {
        return licenceImg;
    }

    public void setLicenceImg(String licenceImg) {
        this.licenceImg = licenceImg;
    }

    public String getOnlineLicenceImg() {
        return onlineLicenceImg;
    }

    public void setOnlineLicenceImg(String onlineLicenceImg) {
        this.onlineLicenceImg = onlineLicenceImg;
    }

    public String getApproveAskDate() {
        return approveAskDate;
    }

    public void setApproveAskDate(String approveAskDate) {
        this.approveAskDate = approveAskDate;
    }

    public String getApproveDate() {
        return approveDate;
    }

    public void setApproveDate(String approveDate) {
        this.approveDate = approveDate;
    }

    public String getApproveCheck() {
        return approveCheck;
    }

    public void setApproveCheck(String approveCheck) {
        this.approveCheck = approveCheck;
    }

    public String getApproveId() {
        return approveId;
    }

    public void setApproveId(String approveId) {
        this.approveId = approveId;
    }
    
    public User getUserInfo() {
		return userInfo;
	}

	public void setUserInfo(User userInfo) {
		this.userInfo = userInfo;
	}
    
    public Goods getGoodsInfo() {
		return goodsInfo;
	}

	public void setGoodsInfo(Goods goodsInfo) {
		this.goodsInfo = goodsInfo;
	}
	
    public LevelSellerCategory getLevelSeller() {
    	return levelSeller;
    }
    
    public void setLevelSeller(LevelSellerCategory levelSeller) {
    	this.levelSeller = levelSeller;
    }
    
	public Right getRightDto() {
		return rightDto;
	}
	
	public void setRightDto(Right rightDto) {
		this.rightDto = rightDto;
	}

    @Override
    public String toString() {
        return "Seller{" +
                "sellerCode='" + sellerCode + '\'' +
                ", sellerId='" + sellerId + '\'' +
                ", storeName='" + storeName + '\'' +
                ", sellerSort='" + sellerSort + '\'' +
                ", bankName='" + bankName + '\'' +
                ", account='" + account + '\'' +
                ", accountHolder='" + accountHolder + '\'' +
                ", licenseNum='" + licenceNum + '\'' +
                ", storeAddress='" + storeAddress + '\'' +
                ", storePhone='" + storePhone + '\'' +
                ", storeEmail='" + storeEmail + '\'' +
                ", licenseImg='" + licenceImg + '\'' +
                ", onlineLicenceImg='" + onlineLicenceImg + '\'' +
                ", approveAskDate='" + approveAskDate + '\'' +
                ", approveDate='" + approveDate + '\'' +
                ", approveCheck='" + approveCheck + '\'' +
                ", approveId='" + approveId + '\'' +
                ", userInfo='" + userInfo + '\'' +
                ", goodsInfo='" + goodsInfo + '\'' +
                ", rightDto='" + rightDto + '\'' +
                ", levelSeller='" + levelSeller + '\'' +
                '}';
    }
}
