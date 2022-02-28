package Miscellanious.meesho;

//-----------------------------------com.example.AdditionalFields.java-----------------------------------

import javax.annotation.processing.Generated;

@Generated("jsonschema2pojo")
 class AdditionalFields1 {

    private Delhivery1 delhivery;

    /**
     * No args constructor for use in serialization
     *
     */
    public AdditionalFields1() {
    }

    /**
     *
     * @param delhivery
     */
    public AdditionalFields1(Delhivery1 delhivery) {
        super();
        this.delhivery = delhivery;
    }

    public Delhivery1 getDelhivery() {
        return delhivery;
    }

    public void setDelhivery(Delhivery1 delhivery) {
        this.delhivery = delhivery;
    }

}
//-----------------------------------com.example.Data.java-----------------------------------

@Generated("jsonschema2pojo")
 class Data1 {

    private String type;
    private String awb;
    private String carrier;
    private String carrierAccountType;
    private String status;
    private String statusCode;
    private String statusTime;
    private String remarks;
    private String location;
    private String meeshoStatus;
    private AdditionalFields1 additionalFields;

    /**
     * No args constructor for use in serialization
     *
     */
    public Data1() {
    }

    /**
     *
     * @param carrier
     * @param additionalFields
     * @param statusTime
     * @param meeshoStatus
     * @param location
     * @param type
     * @param awb
     * @param remarks
     * @param carrierAccountType
     * @param status
     * @param statusCode
     */
    public Data1(String type, String awb, String carrier, String carrierAccountType, String status, String statusCode, String statusTime, String remarks, String location, String meeshoStatus, AdditionalFields1 additionalFields) {
        super();
        this.type = type;
        this.awb = awb;
        this.carrier = carrier;
        this.carrierAccountType = carrierAccountType;
        this.status = status;
        this.statusCode = statusCode;
        this.statusTime = statusTime;
        this.remarks = remarks;
        this.location = location;
        this.meeshoStatus = meeshoStatus;
        this.additionalFields = additionalFields;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getAwb() {
        return awb;
    }

    public void setAwb(String awb) {
        this.awb = awb;
    }

    public String getCarrier() {
        return carrier;
    }

    public void setCarrier(String carrier) {
        this.carrier = carrier;
    }

    public String getCarrierAccountType() {
        return carrierAccountType;
    }

    public void setCarrierAccountType(String carrierAccountType) {
        this.carrierAccountType = carrierAccountType;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }

    public String getStatusTime() {
        return statusTime;
    }

    public void setStatusTime(String statusTime) {
        this.statusTime = statusTime;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getMeeshoStatus() {
        return meeshoStatus;
    }

    public void setMeeshoStatus(String meeshoStatus) {
        this.meeshoStatus = meeshoStatus;
    }

    public AdditionalFields1 getAdditionalFields() {
        return additionalFields;
    }

    public void setAdditionalFields(AdditionalFields1 additionalFields) {
        this.additionalFields = additionalFields;
    }

}
//----------------------------------com.example.Delhivery.java-----------------------------------


@Generated("jsonschema2pojo")
 class Delhivery1 {

    private String statusDirection;

    /**
     * No args constructor for use in serialization
     *
     */
    public Delhivery1() {
    }

    /**
     *
     * @param statusDirection
     */
    public Delhivery1(String statusDirection) {
        super();
        this.statusDirection = statusDirection;
    }

    public String getStatusDirection() {
        return statusDirection;
    }

    public void setStatusDirection(String statusDirection) {
        this.statusDirection = statusDirection;
    }

}
//----------------------------------com.example.Metadata.java-----------------------------------


@Generated("jsonschema2pojo")
 class Metadata1 {

    private String requestId;
    private String serviceIdentifier;
    private String timestamp;

    /**
     * No args constructor for use in serialization
     *
     */
    public Metadata1() {
    }

    /**
     *
     * @param requestId
     * @param serviceIdentifier
     * @param timestamp
     */
    public Metadata1(String requestId, String serviceIdentifier, String timestamp) {
        super();
        this.requestId = requestId;
        this.serviceIdentifier = serviceIdentifier;
        this.timestamp = timestamp;
    }

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public String getServiceIdentifier() {
        return serviceIdentifier;
    }

    public void setServiceIdentifier(String serviceIdentifier) {
        this.serviceIdentifier = serviceIdentifier;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

}
//-----------------------------------com.example.Root.java-----------------------------------


@Generated("jsonschema2pojo")
 public class Root1 {

    private Metadata1 metadata;
    private Data1 data;

    /**
     * No args constructor for use in serialization
     *
     */
    public Root1() {
    }

    /**
     *
     * @param metadata
     * @param data
     */
    public Root1(Metadata1 metadata, Data1 data) {
        super();
        this.metadata = metadata;
        this.data = data;
    }

    public Metadata1 getMetadata() {
        return metadata;
    }

    public void setMetadata(Metadata1 metadata) {
        this.metadata = metadata;
    }

    public Data1 getData() {
        return data;
    }

    public void setData(Data1 data) {
        this.data = data;
    }

}