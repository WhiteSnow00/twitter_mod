import android.os.Parcel;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

// 
// Decompiled by Procyon v0.6.0
// 

public interface hp2 extends Parcelable
{
    int D1();
    
    long K();
    
    boolean N2();
    
    Boolean S1();
    
    a a1();
    
    uil e();
    
    bo6 i();
    
    t0p s1();
    
    public static final class a implements Parcelable
    {
        public static final Parcelable$Creator<a> CREATOR;
        public static final b Companion;
        public final String D0;
        public final String E0;
        public final String F0;
        public final String G0;
        
        static {
            Companion = new b();
            CREATOR = (Parcelable$Creator)new Parcelable$Creator<a>() {
                public final Object createFromParcel(final Parcel parcel) {
                    czd.f((Object)parcel, "in");
                    return new a(parcel);
                }
                
                public final Object[] newArray(final int n) {
                    return new a[n];
                }
            };
        }
        
        public a(final Parcel parcel) {
            czd.f((Object)parcel, "in");
            this.D0 = parcel.readString();
            this.E0 = parcel.readString();
            this.F0 = parcel.readString();
            this.G0 = parcel.readString();
        }
        
        public a(final String d0, final String e0, final String f0, final String g0) {
            this.D0 = d0;
            this.E0 = e0;
            this.F0 = f0;
            this.G0 = g0;
        }
        
        public final int describeContents() {
            return 0;
        }
        
        public final void writeToParcel(final Parcel parcel, final int n) {
            czd.f((Object)parcel, "dest");
            parcel.writeString(this.D0);
            parcel.writeString(this.E0);
            parcel.writeString(this.F0);
            parcel.writeString(this.G0);
        }
        
        public static final class b
        {
        }
    }
}
