package com.tianhong.xianlan.pojo;

import javax.persistence.*;

@Table(name = "th_user")
public class ThUser {
    @Id
    private Integer id;

    @Column(name = "user_name")
    private String userName;

    private String openid;

    private String nickname;

    private String headimgurl;

    @Column(name = "user_id")
    private String userId;

    private Integer jifen;

    @Column(name = "buy_last")
    private String buyLast;

    @Column(name = "buy_num")
    private Integer buyNum;

    private String tel;

    @Column(name = "user_leibie")
    private Integer userLeibie;

    @Column(name = "create_time")
    private String createTime;

    @Column(name = "qd_mingci")
    private Integer qdMingci;

    @Column(name = "qd_lianxu")
    private Integer qdLianxu;

    @Column(name = "qd_leiji")
    private Integer qdLeiji;

    @Column(name = "qd_time")
    private String qdTime;

    @Column(name = "qd_yue")
    private Integer qdYue;

    @Column(name = "s_jifen")
    private Integer sJifen;

    @Column(name = "qd_jifen")
    private Integer qdJifen;

    @Column(name = "s_time")
    private String sTime;

    @Column(name = "all_pay")
    private Integer allPay;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return user_name
     */
    public String getUserName() {
        return userName;
    }

    /**
     * @param userName
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * @return openid
     */
    public String getOpenid() {
        return openid;
    }

    /**
     * @param openid
     */
    public void setOpenid(String openid) {
        this.openid = openid;
    }

    /**
     * @return nickname
     */
    public String getNickname() {
        return nickname;
    }

    /**
     * @param nickname
     */
    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    /**
     * @return headimgurl
     */
    public String getHeadimgurl() {
        return headimgurl;
    }

    /**
     * @param headimgurl
     */
    public void setHeadimgurl(String headimgurl) {
        this.headimgurl = headimgurl;
    }

    /**
     * @return user_id
     */
    public String getUserId() {
        return userId;
    }

    /**
     * @param userId
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * @return jifen
     */
    public Integer getJifen() {
        return jifen;
    }

    /**
     * @param jifen
     */
    public void setJifen(Integer jifen) {
        this.jifen = jifen;
    }

    /**
     * @return buy_last
     */
    public String getBuyLast() {
        return buyLast;
    }

    /**
     * @param buyLast
     */
    public void setBuyLast(String buyLast) {
        this.buyLast = buyLast;
    }

    /**
     * @return buy_num
     */
    public Integer getBuyNum() {
        return buyNum;
    }

    /**
     * @param buyNum
     */
    public void setBuyNum(Integer buyNum) {
        this.buyNum = buyNum;
    }

    /**
     * @return tel
     */
    public String getTel() {
        return tel;
    }

    /**
     * @param tel
     */
    public void setTel(String tel) {
        this.tel = tel;
    }

    /**
     * @return user_leibie
     */
    public Integer getUserLeibie() {
        return userLeibie;
    }

    /**
     * @param userLeibie
     */
    public void setUserLeibie(Integer userLeibie) {
        this.userLeibie = userLeibie;
    }

    /**
     * @return create_time
     */
    public String getCreateTime() {
        return createTime;
    }

    /**
     * @param createTime
     */
    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    /**
     * @return qd_mingci
     */
    public Integer getQdMingci() {
        return qdMingci;
    }

    /**
     * @param qdMingci
     */
    public void setQdMingci(Integer qdMingci) {
        this.qdMingci = qdMingci;
    }

    /**
     * @return qd_lianxu
     */
    public Integer getQdLianxu() {
        return qdLianxu;
    }

    /**
     * @param qdLianxu
     */
    public void setQdLianxu(Integer qdLianxu) {
        this.qdLianxu = qdLianxu;
    }

    /**
     * @return qd_leiji
     */
    public Integer getQdLeiji() {
        return qdLeiji;
    }

    /**
     * @param qdLeiji
     */
    public void setQdLeiji(Integer qdLeiji) {
        this.qdLeiji = qdLeiji;
    }

    /**
     * @return qd_time
     */
    public String getQdTime() {
        return qdTime;
    }

    /**
     * @param qdTime
     */
    public void setQdTime(String qdTime) {
        this.qdTime = qdTime;
    }

    /**
     * @return qd_yue
     */
    public Integer getQdYue() {
        return qdYue;
    }

    /**
     * @param qdYue
     */
    public void setQdYue(Integer qdYue) {
        this.qdYue = qdYue;
    }

    /**
     * @return s_jifen
     */
    public Integer getsJifen() {
        return sJifen;
    }

    /**
     * @param sJifen
     */
    public void setsJifen(Integer sJifen) {
        this.sJifen = sJifen;
    }

    /**
     * @return qd_jifen
     */
    public Integer getQdJifen() {
        return qdJifen;
    }

    /**
     * @param qdJifen
     */
    public void setQdJifen(Integer qdJifen) {
        this.qdJifen = qdJifen;
    }

    /**
     * @return s_time
     */
    public String getsTime() {
        return sTime;
    }

    /**
     * @param sTime
     */
    public void setsTime(String sTime) {
        this.sTime = sTime;
    }

    /**
     * @return all_pay
     */
    public Integer getAllPay() {
        return allPay;
    }

    /**
     * @param allPay
     */
    public void setAllPay(Integer allPay) {
        this.allPay = allPay;
    }
}