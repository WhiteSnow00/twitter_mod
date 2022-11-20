// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

public enum Attachment implements Parcelable
{
    public static final Parcelable$Creator<Attachment> CREATOR;
    public static final Attachment[] E0;
    public final String D0;
    
    static {
        E0 = new Attachment[] { new Attachment("platform"), new Attachment("cross-platform") };
        CREATOR = (Parcelable$Creator)new f();
    }
    
    public Attachment(final String d0) {
        this.D0 = d0;
    }
    
    public static Attachment b(final String s) throws UnsupportedAttachmentException {
        for (final Attachment attachment : values()) {
            if (s.equals(attachment.D0)) {
                return attachment;
            }
        }
        throw new UnsupportedAttachmentException(s);
    }
    
    public final int describeContents() {
        return 0;
    }
    
    @Override
    public final String toString() {
        return this.D0;
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeString(this.D0);
    }
    
    public static class UnsupportedAttachmentException extends Exception
    {
        public UnsupportedAttachmentException(final String s) {
            super(String.format("Attachment %s not supported", s));
        }
    }
}
