
package org.droidtv.tv.dlna;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import org.droidtv.tv.dlna.IUPnPEventInfo;

public class UPnPEventInfo implements Parcelable,IUPnPEventInfo {

    private static final String TAG = "DLNA/UPnPEventInfo";
	
    public static final int UPNP_EVENT_OBJECT_DEVICE_UPDATE = 0;

    public static final int UPNP_EVENT_OBJECT_DEVICE_SUBCODE = 1;

    public static final int UPNP_EVENT_OBJECT_UDN = 2;

    public static final int UPNP_EVENT_OBJECT_OBJECT_ID = 3;

    public static final int UPNP_EVENT_OBJECT_VALUE = 4;

    public static final int UPNP_EVENT_OBJECT_EXTRA_ELEMENT = 5;

    public static final int UPNP_EVENT_OBJECT_DATA_STRING = 6;

    public static final int UPNP_EVENT_OBJECT_EXTRA_STRING = 7;

    public static final int UPNP_EVENT_OBJECT_MEDIA_DURATION = 8;

    public static final int UPNP_EVENT_OBJECT_TRACK_DURATION = 9;

    public static final int UPNP_EVENT_OBJECT_PLAY_STATE = 10;

    public static final int UPNP_EVENT_OBJECT_NUMBER_OF_TRACKS = 11;

    public static final int UPNP_EVENT_OBJECT_CURRENT_TRACK = 12;

    public static final int UPNP_EVENT_OBJECT_TRACK_URI = 13;

    public static final int UPNP_EVENT_OBJECT_AVT_URI = 14;

    public static final int UPNP_EVENT_OBJECT_NEXT_AVT_URI = 15;

    public static final int UPNP_EVENT_OBJECT_TRANSPORT_ACTIONS = 16;

    public static final int UPNP_EVENT_OBJECT_TRANSPORT_STATE = 17;

    public static final int UPNP_EVENT_OBJECT_TRANSPORT_STATUS = 18;

    public static final int UPNP_EVENT_OBJECT_PLAY_MODE = 19;

    public static final int UPNP_EVENT_OBJECT_PLAY_SPEED = 20;

    public static final int UPNP_EVENT_OBJECT_CONTAINER_ID = 21;

    public static final int UPNP_EVENT_OBJECT_UPDATE_ID = 22;

	/* !< update code */
    private int deviceUpdate; 

	/* !< update sub code 0 = avt, 1 = rcs */
    private int deviceSubCode; 

	/* !< udn of device */
    private String UDN; 

	/* !< objectid */
    private String ObjectId; 

	/* !< value */
    private long value; 

	/* !< number of extra elements */
    private long ExtraElements; 

	/* !< data string */
    private String StrBufString; 

	/* !< extra data ptr */
    private String ExtraPtr; 

    // AVT event members
	/* !< New evented avobject */
    private UPnPAVObject avObject; 

	/* !< Evented duration of the media in seconds */
    private long MediaDuration; 

	/* !< Evented duration of the track in seconds */
    private long TrackDuration; 

	/* !< Evented play state of the renderer */
    private int PlayState; 

	/* !< Evented number of tracks */
    private int numberOfTracks; 

	/* !< Evented number of the current track */
    private int currentTrack; 

	/* !< Evented track URI */
    private String trackUri; 

	/* !< Evented avt URI */
    private String avtUri; 

	/* !< Evented next avt URI */
    private String nextAvtUri; 

	/* !< Evented transport actions */
    private String transportActions; 

	/* !< Evented transport state */
    private String transportState; 

	/* !< Evented transport status */
    private String transportStatus; 

	/* !< Evented play mode */
    private String playMode; 

	/* !< Evented play speed */
    private String playSpeed; 

    // CDS event members
	/* !< Evented container Update IDs */
    private String mContainerID; 

	/* !< Evented Systeme Update ID */
    private String mUpdateID; 

    public UPnPEventInfo() {
    }

    public UPnPEventInfo(final Parcel in) {
        readFromParcel(in);
    }

    public void setIntegerValue(final int id, final int intValue) {
        switch (id) {
            case UPNP_EVENT_OBJECT_DEVICE_UPDATE:
                deviceUpdate = intValue;
                break;
            case UPNP_EVENT_OBJECT_DEVICE_SUBCODE:
                deviceSubCode = intValue;
                break;
            case UPNP_EVENT_OBJECT_PLAY_STATE:
                PlayState = intValue;
                break;
            case UPNP_EVENT_OBJECT_NUMBER_OF_TRACKS:
                numberOfTracks = intValue;
                break;
            case UPNP_EVENT_OBJECT_CURRENT_TRACK:
                currentTrack = intValue;
                break;
            default:
            	Log.v(TAG,"setIntegerValue default case");
            	break;
        }
    }

    public void setStringValue(final int id, final String stringValue) {
        switch (id) {
            case UPNP_EVENT_OBJECT_UDN:
                UDN = stringValue;
                break;
            case UPNP_EVENT_OBJECT_OBJECT_ID:
                ObjectId = stringValue;
                break;
            case UPNP_EVENT_OBJECT_DATA_STRING:
                StrBufString = stringValue;
                break;
            case UPNP_EVENT_OBJECT_EXTRA_STRING:
                ExtraPtr = stringValue;
                break;
            case UPNP_EVENT_OBJECT_TRACK_URI:
                trackUri = stringValue;
                break;
            case UPNP_EVENT_OBJECT_AVT_URI:
                avtUri = stringValue;
                break;
            case UPNP_EVENT_OBJECT_NEXT_AVT_URI:
                nextAvtUri = stringValue;
                break;
            case UPNP_EVENT_OBJECT_TRANSPORT_ACTIONS:
                transportActions = stringValue;
                break;
            case UPNP_EVENT_OBJECT_TRANSPORT_STATE:
                transportState = stringValue;
                break;
            case UPNP_EVENT_OBJECT_TRANSPORT_STATUS:
                transportStatus = stringValue;
                break;
            case UPNP_EVENT_OBJECT_PLAY_MODE:
                playMode = stringValue;
                break;
            case UPNP_EVENT_OBJECT_PLAY_SPEED:
                playSpeed = stringValue;
                break;
            case UPNP_EVENT_OBJECT_CONTAINER_ID:
                mContainerID = stringValue;
                break;
            case UPNP_EVENT_OBJECT_UPDATE_ID:
                mUpdateID = stringValue;
                break;
            default:
            	Log.v(TAG,"setStringValue default case");
            	break;
        }
    }

    public void setLongValue(final int id, final long longValue) {

        switch (id) {
            case UPNP_EVENT_OBJECT_VALUE:
                value = longValue;
                break;
            case UPNP_EVENT_OBJECT_EXTRA_ELEMENT:
                ExtraElements = longValue;
                break;
            case UPNP_EVENT_OBJECT_MEDIA_DURATION:
                MediaDuration = longValue;
                break;
            case UPNP_EVENT_OBJECT_TRACK_DURATION:
                TrackDuration = longValue;
                break;
            default:
            	Log.v(TAG,"setLongValue default case");
            	break;
        }
    }

    public int getIntegerValue(final int id) {
        int ret = -1;
        switch (id) {
            case UPNP_EVENT_OBJECT_DEVICE_UPDATE:
                ret = deviceUpdate;
                break;
            case UPNP_EVENT_OBJECT_DEVICE_SUBCODE:
                ret = deviceSubCode;
                break;
            default:
            	Log.v(TAG,"getIntegerValue default case");
            	break;
        }
        return ret;
    }

    public String getStringValue(final int id) {
        String retValue;
        switch (id) {
            case UPNP_EVENT_OBJECT_UDN:
            	retValue = UDN;
                break;
            case UPNP_EVENT_OBJECT_OBJECT_ID:
            	retValue = ObjectId;
                break;
            case UPNP_EVENT_OBJECT_DATA_STRING:
            	retValue = StrBufString;
                break;
            case UPNP_EVENT_OBJECT_EXTRA_STRING:
            	retValue = ExtraPtr;
                break;
            case UPNP_EVENT_OBJECT_TRACK_URI:
            	retValue = trackUri;
                break;
            case UPNP_EVENT_OBJECT_AVT_URI:
            	retValue = avtUri;
                break;
            case UPNP_EVENT_OBJECT_NEXT_AVT_URI:
            	retValue = nextAvtUri;
                break;
            case UPNP_EVENT_OBJECT_TRANSPORT_ACTIONS:
            	retValue = transportActions;
                break;
            case UPNP_EVENT_OBJECT_TRANSPORT_STATE:
            	retValue = transportState;
                break;
            case UPNP_EVENT_OBJECT_TRANSPORT_STATUS:
            	retValue = transportStatus;
                break;
            case UPNP_EVENT_OBJECT_PLAY_MODE:
            	retValue = playMode;
                break;
            case UPNP_EVENT_OBJECT_PLAY_SPEED:
            	retValue = playSpeed;
                break;
            case UPNP_EVENT_OBJECT_CONTAINER_ID:
            	retValue = mContainerID;
                break;
            case UPNP_EVENT_OBJECT_UPDATE_ID:
            	retValue = mUpdateID;
                break;
            default:
            	Log.v(TAG,"getStringValue default case");
            	retValue = "";
            	break;
        }
        return retValue;
    }


    public void setObjectValue(final UPnPAVObject object) {
        avObject = object;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public void readFromParcel(final Parcel in) {
        MediaDuration = in.readLong();
        TrackDuration = in.readLong();
        value = in.readLong();
        ExtraElements = in.readLong();

        deviceUpdate = in.readInt();
        deviceSubCode = in.readInt();
        currentTrack = in.readInt();
        numberOfTracks = in.readInt();
        PlayState = in.readInt();

        avtUri = in.readString();
        nextAvtUri = in.readString();
        trackUri = in.readString();
        transportActions = in.readString();
        transportState = in.readString();
        transportStatus = in.readString();
        playMode = in.readString();
        playSpeed = in.readString();
        UDN = in.readString();
        ObjectId = in.readString();
        StrBufString = in.readString();
        ExtraPtr = in.readString();
        mContainerID = in.readString();
        mUpdateID = in.readString();

        avObject = in.readParcelable(UPnPAVObject.class.getClassLoader());
    }

    @Override
    public void writeToParcel(final Parcel dest, final int flags) {
        dest.writeLong(MediaDuration);
        dest.writeLong(TrackDuration);
        dest.writeLong(value);
        dest.writeLong(ExtraElements);

        dest.writeInt(deviceUpdate);
        dest.writeInt(deviceSubCode);
        dest.writeInt(currentTrack);
        dest.writeInt(numberOfTracks);
        dest.writeInt(PlayState);

        dest.writeString(avtUri);
        dest.writeString(nextAvtUri);
        dest.writeString(trackUri);
        dest.writeString(transportActions);
        dest.writeString(transportState);
        dest.writeString(transportStatus);
        dest.writeString(playMode);
        dest.writeString(playSpeed);
        dest.writeString(UDN);
        dest.writeString(ObjectId);
        dest.writeString(StrBufString);
        dest.writeString(ExtraPtr);
        dest.writeString(mContainerID);
        dest.writeString(mUpdateID);

        dest.writeParcelable(avObject, 0);
    }

    public static final Creator<UPnPEventInfo> CREATOR = new Creator<UPnPEventInfo>() {

        @Override
        public UPnPEventInfo createFromParcel(final Parcel source) {
            return new UPnPEventInfo(source);
        }

        @Override
        public UPnPEventInfo[] newArray(final int size) {
            return new UPnPEventInfo[size];
        }
    };
}
