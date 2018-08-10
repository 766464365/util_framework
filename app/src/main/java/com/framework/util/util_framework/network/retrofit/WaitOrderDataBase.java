package com.framework.util.util_framework.network.retrofit;

import java.util.List;

public class WaitOrderDataBase {
    /**
     * code : 200
     * message : “操作成功”
     * data : [{"id":"4","orderId":"58","address":"广东省广州市天河区乐天创意园","waybillId":"710000030767","courierCheckTime":null,"courierActionTime":null,"nodeRemark":null,"nodeActionTime":1533199297000,"createTime":1532952519000,"waitTime":"3天17小时18分","orderInfoEntity":{"id":"58","totalPiece":12,"totalWeight":32,"totalSize":42,"appointmentStartTime":1533096720000,"appointmentEndTime":1533194520000,"vendorId":"1","freightEstimate":840000,"payTotalFee":0,"addedFee":0,"insuranceFee":0,"payAmount":0,"insured":0,"amountPayable":0,"upFee":0,"otherFee":0,"orderStatus":"已提交","payStatus":"未付款","shipmentTime":null,"payerTime":null,"productTypeId":"$24","creatorId":"1","gmtCreate":1532952519000,"gmtModified":1532952519000,"moneyCollection":0,"moneyCollectionName":null,"moneyCollectionBank":null,"moneyCollectionBankOutlets":null,"moneyCollectionAccountNumber":null,"cargoName":"显示屏","waybillId":"710000030767","sendMan":"冯健","sendPhone":"13151313151","sendCompany":null,"sendProvinceName":"广东省","sendCityName":"广州市","sendCountyName":"天河区","sendStreetName":null,"detailAddress":"天河汽车客运站","receiveMan":"柯伟旭","receivePhone":"13154655787","receiveCompany":null,"toProvinceName":"广东省","toCityName":"广州市","toCountyName":"天河区","toStreetName":null,"toAddress":"乐天创意园","goodsType":"送货上门","payType":"现金","packType":"纸箱、纤袋","deliveryNotice":0,"signReply":0,"remark":null}},{"id":"6","orderId":"60","address":"广东省广州市天河区科华街251号乐天创意园","waybillId":"710000030781","courierCheckTime":null,"courierActionTime":null,"nodeRemark":null,"nodeActionTime":1533201136000,"createTime":1532998667000,"waitTime":"3天16小时47分","orderInfoEntity":{"id":"60","totalPiece":1,"totalWeight":30,"totalSize":1,"appointmentStartTime":1533085200000,"appointmentEndTime":1533117600000,"vendorId":"1","freightEstimate":20000,"payTotalFee":0,"addedFee":0,"insuranceFee":0,"payAmount":0,"insured":2000,"amountPayable":0,"upFee":0,"otherFee":0,"orderStatus":"已提交","payStatus":"未付款","shipmentTime":null,"payerTime":null,"productTypeId":"$24","creatorId":"1","gmtCreate":1532998667000,"gmtModified":1532998667000,"moneyCollection":0,"moneyCollectionName":null,"moneyCollectionBank":null,"moneyCollectionBankOutlets":null,"moneyCollectionAccountNumber":null,"cargoName":"1","waybillId":"710000030781","sendMan":"冯健","sendPhone":"13128223382","sendCompany":"信巴迪","sendProvinceName":"广东省","sendCityName":"广州市","sendCountyName":"天河区","sendStreetName":null,"detailAddress":"科韵路棠安路188号乐天大厦","receiveMan":"曾华海","receivePhone":"13112345678","receiveCompany":"信巴迪","toProvinceName":"广东省","toCityName":"广州市","toCountyName":"天河区","toStreetName":null,"toAddress":"科华街251号乐天创意园","goodsType":"送货上门","payType":"现金","packType":"1,0,0,0,0","deliveryNotice":0,"signReply":0,"remark":null}},{"id":"7","orderId":"61","address":"广东省广州市天河区科华街251号乐天创意园","waybillId":"710000030734","courierCheckTime":null,"courierActionTime":null,"nodeRemark":null,"nodeActionTime":1533201369000,"createTime":1532999942000,"waitTime":"3天16小时43分","orderInfoEntity":{"id":"61","totalPiece":1,"totalWeight":30,"totalSize":1,"appointmentStartTime":1533171600000,"appointmentEndTime":1533204000000,"vendorId":"1","freightEstimate":20000,"payTotalFee":0,"addedFee":0,"insuranceFee":0,"payAmount":0,"insured":2000,"amountPayable":0,"upFee":0,"otherFee":0,"orderStatus":"已提交","payStatus":"未付款","shipmentTime":null,"payerTime":null,"productTypeId":"$24","creatorId":"1","gmtCreate":1532999942000,"gmtModified":1532999942000,"moneyCollection":0,"moneyCollectionName":null,"moneyCollectionBank":null,"moneyCollectionBankOutlets":null,"moneyCollectionAccountNumber":null,"cargoName":"1","waybillId":"710000030734","sendMan":"冯健","sendPhone":"13128223382","sendCompany":"信巴迪","sendProvinceName":"广东省","sendCityName":"广州市","sendCountyName":"天河区","sendStreetName":null,"detailAddress":"科韵路棠安路188号乐天大厦","receiveMan":"曾华海","receivePhone":"13112345678","receiveCompany":"信巴迪","toProvinceName":"广东省","toCityName":"广州市","toCountyName":"天河区","toStreetName":null,"toAddress":"科华街251号乐天创意园","goodsType":"送货上门","payType":"现金","packType":"1,0,0,0,0","deliveryNotice":0,"signReply":0,"remark":null}}]
     */

    private int code;
    private String message;
    private List<DataBean> data;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<DataBean> getData() {
        return data;
    }

    public void setData(List<DataBean> data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * id : 4
         * orderId : 58
         * address : 广东省广州市天河区乐天创意园
         * waybillId : 710000030767
         * courierCheckTime : null
         * courierActionTime : null
         * nodeRemark : null
         * nodeActionTime : 1533199297000
         * createTime : 1532952519000
         * waitTime : 3天17小时18分
         * orderInfoEntity : {"id":"58","totalPiece":12,"totalWeight":32,"totalSize":42,"appointmentStartTime":1533096720000,"appointmentEndTime":1533194520000,"vendorId":"1","freightEstimate":840000,"payTotalFee":0,"addedFee":0,"insuranceFee":0,"payAmount":0,"insured":0,"amountPayable":0,"upFee":0,"otherFee":0,"orderStatus":"已提交","payStatus":"未付款","shipmentTime":null,"payerTime":null,"productTypeId":"$24","creatorId":"1","gmtCreate":1532952519000,"gmtModified":1532952519000,"moneyCollection":0,"moneyCollectionName":null,"moneyCollectionBank":null,"moneyCollectionBankOutlets":null,"moneyCollectionAccountNumber":null,"cargoName":"显示屏","waybillId":"710000030767","sendMan":"冯健","sendPhone":"13151313151","sendCompany":null,"sendProvinceName":"广东省","sendCityName":"广州市","sendCountyName":"天河区","sendStreetName":null,"detailAddress":"天河汽车客运站","receiveMan":"柯伟旭","receivePhone":"13154655787","receiveCompany":null,"toProvinceName":"广东省","toCityName":"广州市","toCountyName":"天河区","toStreetName":null,"toAddress":"乐天创意园","goodsType":"送货上门","payType":"现金","packType":"纸箱、纤袋","deliveryNotice":0,"signReply":0,"remark":null}
         */

        private String id;
        private String orderId;
        private String address;
        private String waybillId;
        private Object courierCheckTime;
        private Object courierActionTime;
        private Object nodeRemark;
        private long nodeActionTime;
        private long createTime;
        private String waitTime;
        private OrderInfoEntityBean orderInfoEntity;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getOrderId() {
            return orderId;
        }

        public void setOrderId(String orderId) {
            this.orderId = orderId;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public String getWaybillId() {
            return waybillId;
        }

        public void setWaybillId(String waybillId) {
            this.waybillId = waybillId;
        }

        public Object getCourierCheckTime() {
            return courierCheckTime;
        }

        public void setCourierCheckTime(Object courierCheckTime) {
            this.courierCheckTime = courierCheckTime;
        }

        public Object getCourierActionTime() {
            return courierActionTime;
        }

        public void setCourierActionTime(Object courierActionTime) {
            this.courierActionTime = courierActionTime;
        }

        public Object getNodeRemark() {
            return nodeRemark;
        }

        public void setNodeRemark(Object nodeRemark) {
            this.nodeRemark = nodeRemark;
        }

        public long getNodeActionTime() {
            return nodeActionTime;
        }

        public void setNodeActionTime(long nodeActionTime) {
            this.nodeActionTime = nodeActionTime;
        }

        public long getCreateTime() {
            return createTime;
        }

        public void setCreateTime(long createTime) {
            this.createTime = createTime;
        }

        public String getWaitTime() {
            return waitTime;
        }

        public void setWaitTime(String waitTime) {
            this.waitTime = waitTime;
        }

        public OrderInfoEntityBean getOrderInfoEntity() {
            return orderInfoEntity;
        }

        public void setOrderInfoEntity(OrderInfoEntityBean orderInfoEntity) {
            this.orderInfoEntity = orderInfoEntity;
        }

        public static class OrderInfoEntityBean {
            /**
             * id : 58
             * totalPiece : 12
             * totalWeight : 32
             * totalSize : 42
             * appointmentStartTime : 1533096720000
             * appointmentEndTime : 1533194520000
             * vendorId : 1
             * freightEstimate : 840000
             * payTotalFee : 0
             * addedFee : 0
             * insuranceFee : 0
             * payAmount : 0
             * insured : 0
             * amountPayable : 0
             * upFee : 0
             * otherFee : 0
             * orderStatus : 已提交
             * payStatus : 未付款
             * shipmentTime : null
             * payerTime : null
             * productTypeId : $24
             * creatorId : 1
             * gmtCreate : 1532952519000
             * gmtModified : 1532952519000
             * moneyCollection : 0
             * moneyCollectionName : null
             * moneyCollectionBank : null
             * moneyCollectionBankOutlets : null
             * moneyCollectionAccountNumber : null
             * cargoName : 显示屏
             * waybillId : 710000030767
             * sendMan : 冯健
             * sendPhone : 13151313151
             * sendCompany : null
             * sendProvinceName : 广东省
             * sendCityName : 广州市
             * sendCountyName : 天河区
             * sendStreetName : null
             * detailAddress : 天河汽车客运站
             * receiveMan : 柯伟旭
             * receivePhone : 13154655787
             * receiveCompany : null
             * toProvinceName : 广东省
             * toCityName : 广州市
             * toCountyName : 天河区
             * toStreetName : null
             * toAddress : 乐天创意园
             * goodsType : 送货上门
             * payType : 现金
             * packType : 纸箱、纤袋
             * deliveryNotice : 0
             * signReply : 0
             * remark : null
             */

            private String id;
            private int totalPiece;
            private int totalWeight;
            private int totalSize;
            private long appointmentStartTime;
            private long appointmentEndTime;
            private String vendorId;
            private int freightEstimate;
            private int payTotalFee;
            private int addedFee;
            private int insuranceFee;
            private int payAmount;
            private int insured;
            private int amountPayable;
            private int upFee;
            private int otherFee;
            private String orderStatus;
            private String payStatus;
            private Object shipmentTime;
            private Object payerTime;
            private String productTypeId;
            private String creatorId;
            private long gmtCreate;
            private long gmtModified;
            private int moneyCollection;
            private Object moneyCollectionName;
            private Object moneyCollectionBank;
            private Object moneyCollectionBankOutlets;
            private Object moneyCollectionAccountNumber;
            private String cargoName;
            private String waybillId;
            private String sendMan;
            private String sendPhone;
            private Object sendCompany;
            private String sendProvinceName;
            private String sendCityName;
            private String sendCountyName;
            private Object sendStreetName;
            private String detailAddress;
            private String receiveMan;
            private String receivePhone;
            private Object receiveCompany;
            private String toProvinceName;
            private String toCityName;
            private String toCountyName;
            private Object toStreetName;
            private String toAddress;
            private String goodsType;
            private String payType;
            private String packType;
            private int deliveryNotice;
            private int signReply;
            private Object remark;

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public int getTotalPiece() {
                return totalPiece;
            }

            public void setTotalPiece(int totalPiece) {
                this.totalPiece = totalPiece;
            }

            public int getTotalWeight() {
                return totalWeight;
            }

            public void setTotalWeight(int totalWeight) {
                this.totalWeight = totalWeight;
            }

            public int getTotalSize() {
                return totalSize;
            }

            public void setTotalSize(int totalSize) {
                this.totalSize = totalSize;
            }

            public long getAppointmentStartTime() {
                return appointmentStartTime;
            }

            public void setAppointmentStartTime(long appointmentStartTime) {
                this.appointmentStartTime = appointmentStartTime;
            }

            public long getAppointmentEndTime() {
                return appointmentEndTime;
            }

            public void setAppointmentEndTime(long appointmentEndTime) {
                this.appointmentEndTime = appointmentEndTime;
            }

            public String getVendorId() {
                return vendorId;
            }

            public void setVendorId(String vendorId) {
                this.vendorId = vendorId;
            }

            public int getFreightEstimate() {
                return freightEstimate;
            }

            public void setFreightEstimate(int freightEstimate) {
                this.freightEstimate = freightEstimate;
            }

            public int getPayTotalFee() {
                return payTotalFee;
            }

            public void setPayTotalFee(int payTotalFee) {
                this.payTotalFee = payTotalFee;
            }

            public int getAddedFee() {
                return addedFee;
            }

            public void setAddedFee(int addedFee) {
                this.addedFee = addedFee;
            }

            public int getInsuranceFee() {
                return insuranceFee;
            }

            public void setInsuranceFee(int insuranceFee) {
                this.insuranceFee = insuranceFee;
            }

            public int getPayAmount() {
                return payAmount;
            }

            public void setPayAmount(int payAmount) {
                this.payAmount = payAmount;
            }

            public int getInsured() {
                return insured;
            }

            public void setInsured(int insured) {
                this.insured = insured;
            }

            public int getAmountPayable() {
                return amountPayable;
            }

            public void setAmountPayable(int amountPayable) {
                this.amountPayable = amountPayable;
            }

            public int getUpFee() {
                return upFee;
            }

            public void setUpFee(int upFee) {
                this.upFee = upFee;
            }

            public int getOtherFee() {
                return otherFee;
            }

            public void setOtherFee(int otherFee) {
                this.otherFee = otherFee;
            }

            public String getOrderStatus() {
                return orderStatus;
            }

            public void setOrderStatus(String orderStatus) {
                this.orderStatus = orderStatus;
            }

            public String getPayStatus() {
                return payStatus;
            }

            public void setPayStatus(String payStatus) {
                this.payStatus = payStatus;
            }

            public Object getShipmentTime() {
                return shipmentTime;
            }

            public void setShipmentTime(Object shipmentTime) {
                this.shipmentTime = shipmentTime;
            }

            public Object getPayerTime() {
                return payerTime;
            }

            public void setPayerTime(Object payerTime) {
                this.payerTime = payerTime;
            }

            public String getProductTypeId() {
                return productTypeId;
            }

            public void setProductTypeId(String productTypeId) {
                this.productTypeId = productTypeId;
            }

            public String getCreatorId() {
                return creatorId;
            }

            public void setCreatorId(String creatorId) {
                this.creatorId = creatorId;
            }

            public long getGmtCreate() {
                return gmtCreate;
            }

            public void setGmtCreate(long gmtCreate) {
                this.gmtCreate = gmtCreate;
            }

            public long getGmtModified() {
                return gmtModified;
            }

            public void setGmtModified(long gmtModified) {
                this.gmtModified = gmtModified;
            }

            public int getMoneyCollection() {
                return moneyCollection;
            }

            public void setMoneyCollection(int moneyCollection) {
                this.moneyCollection = moneyCollection;
            }

            public Object getMoneyCollectionName() {
                return moneyCollectionName;
            }

            public void setMoneyCollectionName(Object moneyCollectionName) {
                this.moneyCollectionName = moneyCollectionName;
            }

            public Object getMoneyCollectionBank() {
                return moneyCollectionBank;
            }

            public void setMoneyCollectionBank(Object moneyCollectionBank) {
                this.moneyCollectionBank = moneyCollectionBank;
            }

            public Object getMoneyCollectionBankOutlets() {
                return moneyCollectionBankOutlets;
            }

            public void setMoneyCollectionBankOutlets(Object moneyCollectionBankOutlets) {
                this.moneyCollectionBankOutlets = moneyCollectionBankOutlets;
            }

            public Object getMoneyCollectionAccountNumber() {
                return moneyCollectionAccountNumber;
            }

            public void setMoneyCollectionAccountNumber(Object moneyCollectionAccountNumber) {
                this.moneyCollectionAccountNumber = moneyCollectionAccountNumber;
            }

            public String getCargoName() {
                return cargoName;
            }

            public void setCargoName(String cargoName) {
                this.cargoName = cargoName;
            }

            public String getWaybillId() {
                return waybillId;
            }

            public void setWaybillId(String waybillId) {
                this.waybillId = waybillId;
            }

            public String getSendMan() {
                return sendMan;
            }

            public void setSendMan(String sendMan) {
                this.sendMan = sendMan;
            }

            public String getSendPhone() {
                return sendPhone;
            }

            public void setSendPhone(String sendPhone) {
                this.sendPhone = sendPhone;
            }

            public Object getSendCompany() {
                return sendCompany;
            }

            public void setSendCompany(Object sendCompany) {
                this.sendCompany = sendCompany;
            }

            public String getSendProvinceName() {
                return sendProvinceName;
            }

            public void setSendProvinceName(String sendProvinceName) {
                this.sendProvinceName = sendProvinceName;
            }

            public String getSendCityName() {
                return sendCityName;
            }

            public void setSendCityName(String sendCityName) {
                this.sendCityName = sendCityName;
            }

            public String getSendCountyName() {
                return sendCountyName;
            }

            public void setSendCountyName(String sendCountyName) {
                this.sendCountyName = sendCountyName;
            }

            public Object getSendStreetName() {
                return sendStreetName;
            }

            public void setSendStreetName(Object sendStreetName) {
                this.sendStreetName = sendStreetName;
            }

            public String getDetailAddress() {
                return detailAddress;
            }

            public void setDetailAddress(String detailAddress) {
                this.detailAddress = detailAddress;
            }

            public String getReceiveMan() {
                return receiveMan;
            }

            public void setReceiveMan(String receiveMan) {
                this.receiveMan = receiveMan;
            }

            public String getReceivePhone() {
                return receivePhone;
            }

            public void setReceivePhone(String receivePhone) {
                this.receivePhone = receivePhone;
            }

            public Object getReceiveCompany() {
                return receiveCompany;
            }

            public void setReceiveCompany(Object receiveCompany) {
                this.receiveCompany = receiveCompany;
            }

            public String getToProvinceName() {
                return toProvinceName;
            }

            public void setToProvinceName(String toProvinceName) {
                this.toProvinceName = toProvinceName;
            }

            public String getToCityName() {
                return toCityName;
            }

            public void setToCityName(String toCityName) {
                this.toCityName = toCityName;
            }

            public String getToCountyName() {
                return toCountyName;
            }

            public void setToCountyName(String toCountyName) {
                this.toCountyName = toCountyName;
            }

            public Object getToStreetName() {
                return toStreetName;
            }

            public void setToStreetName(Object toStreetName) {
                this.toStreetName = toStreetName;
            }

            public String getToAddress() {
                return toAddress;
            }

            public void setToAddress(String toAddress) {
                this.toAddress = toAddress;
            }

            public String getGoodsType() {
                return goodsType;
            }

            public void setGoodsType(String goodsType) {
                this.goodsType = goodsType;
            }

            public String getPayType() {
                return payType;
            }

            public void setPayType(String payType) {
                this.payType = payType;
            }

            public String getPackType() {
                return packType;
            }

            public void setPackType(String packType) {
                this.packType = packType;
            }

            public int getDeliveryNotice() {
                return deliveryNotice;
            }

            public void setDeliveryNotice(int deliveryNotice) {
                this.deliveryNotice = deliveryNotice;
            }

            public int getSignReply() {
                return signReply;
            }

            public void setSignReply(int signReply) {
                this.signReply = signReply;
            }

            public Object getRemark() {
                return remark;
            }

            public void setRemark(Object remark) {
                this.remark = remark;
            }
        }
    }
    /**
     * id : 4
     * orderId : 58
     * address : 广东省广州市天河区乐天创意园
     * waybillId : 710000030767
     * courierCheckTime : null
     * courierActionTime : null
     * nodeRemark : null
     * nodeActionTime : 1533199297000
     * createTime : 1532952519000
     * waitTime : 3天17小时18分
     * orderInfoEntity : {"id":"58","totalPiece":12,"totalWeight":32,"totalSize":42,"appointmentStartTime":1533096720000,"appointmentEndTime":1533194520000,"vendorId":"1","freightEstimate":840000,"payTotalFee":0,"addedFee":0,"insuranceFee":0,"payAmount":0,"insured":0,"amountPayable":0,"upFee":0,"otherFee":0,"orderStatus":"已提交","payStatus":"未付款","shipmentTime":null,"payerTime":null,"productTypeId":"$24","creatorId":"1","gmtCreate":1532952519000,"gmtModified":1532952519000,"moneyCollection":0,"moneyCollectionName":null,"moneyCollectionBank":null,"moneyCollectionBankOutlets":null,"moneyCollectionAccountNumber":null,"cargoName":"显示屏","waybillId":"710000030767","sendMan":"冯健","sendPhone":"13151313151","sendCompany":null,"sendProvinceName":"广东省","sendCityName":"广州市","sendCountyName":"天河区","sendStreetName":null,"detailAddress":"天河汽车客运站","receiveMan":"柯伟旭","receivePhone":"13154655787","receiveCompany":null,"toProvinceName":"广东省","toCityName":"广州市","toCountyName":"天河区","toStreetName":null,"toAddress":"乐天创意园","goodsType":"送货上门","payType":"现金","packType":"纸箱、纤袋","deliveryNotice":0,"signReply":0,"remark":null}
     */


}
