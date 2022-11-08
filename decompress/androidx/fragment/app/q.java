// 
// Decompiled by Procyon v0.6.0
// 

package androidx.fragment.app;

import java.util.List;
import android.os.Parcel;
import java.util.ArrayList;
import android.os.Parcelable$Creator;
import android.annotation.SuppressLint;
import android.os.Parcelable;

@SuppressLint({ "BanParcelableUsage" })
public final class q implements Parcelable
{
    public static final Parcelable$Creator<q> CREATOR;
    public ArrayList<String> C0;
    public ArrayList<String> D0;
    public b[] E0;
    public int F0;
    public String G0;
    public ArrayList<String> H0;
    public ArrayList<tf1> I0;
    public ArrayList<p.l> J0;
    
    static {
        CREATOR = (Parcelable$Creator)new Parcelable$Creator<q>() {
            public final Object createFromParcel(final Parcel parcel) {
                return new q(parcel);
            }
            
            public final Object[] newArray(final int n) {
                return new q[n];
            }
        };
    }
    
    public q() {
        this.G0 = null;
        this.H0 = new ArrayList<String>();
        this.I0 = new ArrayList<tf1>();
    }
    
    public q(final Parcel parcel) {
        this.G0 = null;
        this.H0 = new ArrayList<String>();
        this.I0 = new ArrayList<tf1>();
        this.C0 = parcel.createStringArrayList();
        this.D0 = parcel.createStringArrayList();
        this.E0 = (b[])parcel.createTypedArray((Parcelable$Creator)b.CREATOR);
        this.F0 = parcel.readInt();
        this.G0 = parcel.readString();
        this.H0 = parcel.createStringArrayList();
        this.I0 = parcel.createTypedArrayList((Parcelable$Creator)tf1.CREATOR);
        this.J0 = parcel.createTypedArrayList((Parcelable$Creator)p.l.CREATOR);
    }
    
    public final int describeContents() {
        return 0;
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeStringList((List)this.C0);
        parcel.writeStringList((List)this.D0);
        parcel.writeTypedArray((Parcelable[])this.E0, n);
        parcel.writeInt(this.F0);
        parcel.writeString(this.G0);
        parcel.writeStringList((List)this.H0);
        parcel.writeTypedList((List)this.I0);
        parcel.writeTypedList((List)this.J0);
    }
}
