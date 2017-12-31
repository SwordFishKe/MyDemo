/*******************************************************************************
 *
 *  Copyright (c) 2010 Koninklijke Philips Electronics N.V. 
 *  All rights reserved. 
 * 
 *  This source code and any compilation or derivative thereof is the 
 *  proprietary information of Koninklijke Philips Electronics N.V. and is 
 *  confidential in nature.
 *
 *  Under no circumstances is this software to be combined with any 
 *  Open Source Software in any way or placed under an Open Source License 
 *  of any type without the express written permission of 
 *  Koninklijke Philips Electronics N.V.
 * 
 *  Developed and Maintained by Philips Consumer Lifestyle 
 *								High Impact Innovation Center
 *                              Eindhoven - The Netherlands
 *
 *******************************************************************************/

package org.droidtv.tv.dlna; 

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;

import java.util.ArrayList;

public class UPnPDeviceInfo implements Parcelable {

    public UPnPDeviceInfo() {
    }

    public UPnPDeviceInfo(final Parcel in) {
        readFromParcel(in);
    }

 // !< UDN of the device
    private String udn; 

 // !< friendly name of the device
    private String friendlyName; 

 // !< presentation URL of the device
    private String presentationUrl; 

 // !< small presentation ICON (URL)
    private String extPresentationUrlSmall; 

 // !< medium presentation ICON (URL)
    private String extPresentationUrlMedium; 

 // !< large presentation ICON (URL)
    private String extPresentationUrlLarge; 

 // !< model description
    private String modelDescription; 

 // !< model Name
    private String modelName; 

    private String Manufacturer;
    private String DeviceLocation;
    private String protocolInfo;

    private String ipaddress;

    private String wofMethodType;

    private String wofDeviceId;
    
    private int isSearchSupported;
	
	private int isSubtitleSupported;

    private ArrayList<UPnPAVObject> deviceContent;

	/**
   * getModelDescription
   *
   * @return returns the modelDescription
   */
	public String getManufacturer() {
		return Manufacturer;
	}
 	/**
   * setModelDescription
   *
   * @param modelDescription sets the modelDescription
   */
	public void setManufacturer(String manufacturer) {
		this.Manufacturer= manufacturer;
	}

	/**
   * getModelDescription
   *
   * @return returns the modelDescription
   */
	public String getDeviceLocation() {
		return DeviceLocation;
	}
 	/**
   * setModelDescription
   *
   * @param modelDescription sets the modelDescription
   */
	public void setDeviceLocation(String deviceLocation) {
		this.DeviceLocation= deviceLocation;
	}
    /**
     * getModelDescription
     * 
     * @return returns the modelDescription
     */
    public String getModelDescription() {
        return modelDescription;
    }

    /**
     * setModelDescription
     * 
     * @param modelDescription sets the modelDescription
     */
    public void setModelDescription(final String modelDescription) {
        this.modelDescription = modelDescription;
    }

    /**
     * getModelName
     * 
     * @return returns the modelName
     */
    public String getModelName() {
        return modelName;
    }

    /**
     * setModelName
     * 
     * @param modelName sets the modelName
     */
    public void setModelName(final String modelName) {
        this.modelName = modelName;
    }

    /**
     * setProtocolInfo
     * 
     * @param list sets the protocolInfo (for the device if supported)
     */
    public void setProtocolInfo(final String list) {
        this.protocolInfo = list;
    }

    /**
     * getProtocolInfo
     * 
     * @return the list of supported protocolInfos
     */
    public String getProtocolInfo() {
        return protocolInfo;
    }

    /**
     * setUdn
     * 
     * @param udn sets the UDN of the device
     */
    public void setUdn(final String udn) {
        this.udn = udn;
    }

    /**
     * getUdn
     * 
     * @return the UDN of the device
     */
    public String getUdn() {
        return udn;
    }

    /**
     * setIPaddress
     * 
     * @param ipaddress sets the IPaddress of the device
     */
    public void setIpaddress(final String ipaddress) {
        Log.e("UPnPDeviceInfo", "setIP");
        this.ipaddress = ipaddress;
    }

    /**
     * getIPaddress
     * 
     * @return the IPaddress of the device
     */
    public String getIpaddress() {
       Log.e("UPnPDeviceInfo", "getIP");
        return ipaddress;
    }

    /**
     * getWofMethodType
     * 
     * @return the wofMethodType of the device
     */
    public String getWofMethodType() {
        return wofMethodType;
    }

    /**
     * setWofMethodType
     * 
     * @param wofMethodType sets the WofMethodType of the device
     */
    public void setWofMethodType(final String wofMethodType) {
        this.wofMethodType = wofMethodType;
    }

    /**
     * getWofDeviceID
     * 
     * @return the wofDeviceId of the device
     */
    public String getWofDeviceID() {
        return wofDeviceId;
    }

    /**
     * setWofDeviceID
     * 
     * @param wofDeviceId sets the wofDeviceId of the device
     */
    public void setWofDeviceID(final String wofDeviceId) {
        this.wofDeviceId = wofDeviceId;
    }

    /**
     * setFriendlyName
     * 
     * @param friendlyName sets the friendlyName of the device
     */
    public void setFriendlyName(final String friendlyName) {
        this.friendlyName = friendlyName;
    }

    /**
     * getFriendlyName
     * 
     * @return the friendlyName of the device
     */
    public String getFriendlyName() {
        return friendlyName;
    }
    
    /**
     * setSearchSupported
     * 
     * @param isSearchSupported sets the isSearchSupported of the device
     */
    public void setSearchSupport(final int isSearchSupported){
    	this.isSearchSupported = isSearchSupported;
    }
    
    /**
     * getSearchSupported
     * 
     * @return the isSearchSupported of the device
     */
    public int getSearchSupport(){
    	return isSearchSupported;
    }
	
	/**
     * setSubtitleSupported
     * 
     * @param isSubtitleSupported sets the isSearchSupported of the device
     */
    public void setSubtitleSupport(final int isSubtitleupported){
    	this.isSubtitleSupported = isSubtitleupported;
    }
    
    /**
     * getSubtitleSupport
     * 
     * @return the isSubtitleSupported of the device
     */
    public int getSubtitleSupport(){
    	return isSubtitleSupported;
    }
    
    /**
     * setextPresentationUrlSmall
     * 
     * @param extPresentationUrlSmall sets the extPresentationUrlSmall of the
     *            device
     */
    public void setextPresentationUrlSmall(final String extPresentationUrlSmall) {
        this.extPresentationUrlSmall = extPresentationUrlSmall;
    }

    /**
     * getextPresentationUrlSmall
     * 
     * @return the extPresentationUrlSmall of the device
     */
    public String getextPresentationUrlSmall() {
        return extPresentationUrlSmall;
    }

    /**
     * setextPresentationUrlMedium
     * 
     * @param extPresentationUrlMedium sets the extPresentationUrlMedium of the
     *            device
     */
    public void setextPresentationUrlMedium(final String extPresentationUrlMedium) {
        this.extPresentationUrlMedium = extPresentationUrlMedium;
    }

    /**
     * getextPresentationUrlMedium
     * 
     * @return the extPresentationUrlMedium of the device
     */
    public String getextPresentationUrlMedium() {
        return extPresentationUrlMedium;
    }

    /**
     * setextPresentationUrlLarge
     * 
     * @param extPresentationUrlLarge sets the extPresentationUrlLarge of the
     *            device
     */
    public void setextPresentationUrlLarge(final String extPresentationUrlLarge) {
        this.extPresentationUrlLarge = extPresentationUrlLarge;
    }

    /**
     * getextPresentationUrlLarge
     * 
     * @return the extPresentationUrlLarge of the device
     */
    public String getextPresentationUrlLarge() {
        return extPresentationUrlLarge;
    }

    /**
     * setPresentationUrl
     * 
     * @param presentationUrl sets the presentationUrl of the device
     */
    public void setPresentationUrl(final String presentationUrl) {
        this.presentationUrl = presentationUrl;
    }

    /**
     * getPresentationUrl
     * 
     * @return the presentationURL of the device
     */
    public String getPresentationUrl() {
        return presentationUrl;
    }

    public void setRemoteContent(final ArrayList<UPnPAVObject> list) {
        deviceContent = list;
    }

    public ArrayList<UPnPAVObject> getRemoteContent() {
        return deviceContent;
    }

    // this function has to be overrided so we can use a ListAdpater with
    // UPnPDeviceInfo object
    @Override
    public String toString() {
        return friendlyName;
    }


    // methods called from C++
    public void contentAdded(final UPnPAVObject content) {
        
    }

    public void contentRemoved(final UPnPAVObject content) {
       
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(final Parcel dest, final int flags) {
        dest.writeString(udn);
        dest.writeString(friendlyName);
        dest.writeString(presentationUrl);
        dest.writeString(ipaddress);
        dest.writeString(extPresentationUrlSmall);
        dest.writeString(extPresentationUrlMedium);
        dest.writeString(extPresentationUrlLarge);
        dest.writeString(modelDescription);
        dest.writeString(modelName);
        dest.writeString(protocolInfo);
        dest.writeInt(isSearchSupported);
    }

    public void readFromParcel(final Parcel in) {
        udn = in.readString();
        friendlyName = in.readString();
        presentationUrl = in.readString();
        ipaddress = in.readString();
        extPresentationUrlSmall = in.readString();
        extPresentationUrlMedium = in.readString();
        extPresentationUrlLarge = in.readString();
        modelDescription = in.readString();
        modelName = in.readString();
        protocolInfo = in.readString();
        isSearchSupported = in.readInt();
    }

    public static final Creator<UPnPDeviceInfo> CREATOR = new Creator<UPnPDeviceInfo>() {

        @Override
        public UPnPDeviceInfo createFromParcel(final Parcel in) {
            return new UPnPDeviceInfo(in);
        }

        @Override
        public UPnPDeviceInfo[] newArray(final int size) {
            return new UPnPDeviceInfo[size];
        }
    };
}
