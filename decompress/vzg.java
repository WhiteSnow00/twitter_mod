import java.util.Iterator;
import android.os.Parcel;
import java.util.Map;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class vzg implements Parcelable
{
    public static final Parcelable$Creator<vzg> CREATOR;
    public static final vzg I0;
    public static final vzg J0;
    public static final vzg K0;
    public static final vzg L0;
    public static final vzg M0;
    public static final Map<Integer, vzg> N0;
    public final int D0;
    public final String E0;
    public final String F0;
    public final qmb G0;
    public final pmb H0;
    
    static {
        CREATOR = (Parcelable$Creator)new Parcelable$Creator<vzg>() {
            public final Object createFromParcel(final Parcel parcel) {
                return vzg.b(parcel.readInt(), parcel.readString(), (qmb)parcel.readParcelable(qmb.class.getClassLoader()), (pmb)parcel.readParcelable(qmb.class.getClassLoader()));
            }
            
            public final Object[] newArray(final int n) {
                return new vzg[n];
            }
        };
        final vzg vzg = I0 = new vzg(0, "");
        final vzg vzg2 = J0 = new vzg(1, "gallery");
        final vzg vzg3 = K0 = new vzg(4, "news_camera");
        final vzg vzg4 = L0 = new vzg(5, "dm_composer");
        final vzg vzg5 = M0 = new vzg(-2, "remote");
        final qjg$a qjg$a = new qjg$a(4);
        ((qjg)qjg$a).w((Object)0, (Object)vzg);
        ((qjg)qjg$a).w((Object)1, (Object)vzg2);
        ((qjg)qjg$a).w((Object)4, (Object)vzg3);
        ((qjg)qjg$a).w((Object)5, (Object)vzg4);
        ((qjg)qjg$a).w((Object)(-2), (Object)vzg5);
        N0 = (Map)((n4j)qjg$a).e();
    }
    
    public vzg(final int d0, final String e0) {
        this.D0 = d0;
        this.E0 = e0;
        this.F0 = null;
        this.G0 = null;
        this.H0 = null;
    }
    
    public vzg(final String f0, final qmb g0, final pmb h0) {
        this.D0 = -1;
        this.E0 = "found_media";
        this.F0 = f0;
        this.G0 = g0;
        this.H0 = h0;
    }
    
    public static vzg a(final String s) {
        for (final vzg vzg : vzg.N0.values()) {
            if (s.equals(vzg.E0)) {
                return vzg;
            }
        }
        return vzg.I0;
    }
    
    public static vzg b(final int n, final String s, final qmb qmb, final pmb pmb) {
        final vzg vzg = vzg.N0.get(n);
        final vzg vzg2 = new vzg(s, qmb, pmb);
        vzg vzg3 = vzg;
        if (vzg == null) {
            vzg3 = vzg2;
        }
        return vzg3;
    }
    
    public final boolean c() {
        return this.D0 < 0;
    }
    
    public final int describeContents() {
        return 0;
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeInt(this.D0);
        parcel.writeString(this.F0);
        parcel.writeParcelable((Parcelable)this.G0, n);
        parcel.writeParcelable((Parcelable)this.H0, n);
    }
}
