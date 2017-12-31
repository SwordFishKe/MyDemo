package org.droidtv.tv.dlna;
/**
 * Interface to store the information about the object returned as part of
 * EventInfo.
 * 
 * @author joseph.prabhakaran
 */

public interface IUPnPEventInfo {
	/**
     * Function to set the integer value
     * 
     * @param id ID of the variable
     * @param value value to be set
     */
     public void setIntegerValue(final int id, final int intValue);
	
	/**
     * Function to set the string value
     * 
     * @param id ID of the variable
     * @param value value to be set
     */
     public void setStringValue(final int id, final String stringValue);

	/**
     * Function to set the Long value
     * 
     * @param id ID of the variable
     * @param value value to be set
     */
     public void setLongValue(final int id, final long longValue);

	/**
     * Function to get integer value
     * 
     * @param id ID of the variable
     * @return value of the variable
     */
     public int getIntegerValue(final int id);

	/**
     * Function to get string value
     * 
     * @param id ID of the variable
     * @return value of the variable
     */
     public String getStringValue(final int id);

	/**
     * Function to set the UPnPAVObject value
     * 
     * @param object value to be set
     */
     public void setObjectValue(final UPnPAVObject object);

}
