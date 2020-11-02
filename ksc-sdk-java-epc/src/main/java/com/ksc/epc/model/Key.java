package com.ksc.epc.model;


public class Key {

    /**
     * 密钥ID
     */
    private String keyId;
    /**
     * 公钥
     */
    private String publicKey;
    /**
     * 创建时间
     */
    private String createTime;
    /**
     * 密钥名称
     */
    private String keyName;

    public void setKeyId(String keyId) {
        this.keyId = keyId;
    }
    public String getKeyId() {
        return keyId;
    }
    public void setPublicKey(String publicKey) {
        this.publicKey = publicKey;
    }
    public String getPublicKey() {
        return publicKey;
    }
    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }
    public String getCreateTime() {
        return createTime;
    }
    public void setKeyName(String keyName) {
        this.keyName = keyName;
    }
    public String getKeyName() {
        return keyName;
    }

}
