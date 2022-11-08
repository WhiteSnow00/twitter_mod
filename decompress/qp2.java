import android.os.Parcel;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

// 
// Decompiled by Procyon v0.6.0
// 

public interface qp2 extends Parcelable
{
    int E1();
    
    long L();
    
    boolean O2();
    
    Boolean T1();
    
    a b1();
    
    hil e();
    
    vo6 i();
    
    c0p t1();
    
    public static final class a implements Parcelable
    {
        public static final Parcelable$Creator<a> CREATOR;
        public static final b Companion;
        public final String C0;
        public final String D0;
        public final String E0;
        public final String F0;
        
        static {
            Companion = new b();
            CREATOR = (Parcelable$Creator)new Parcelable$Creator<a>() {
                public final Object createFromParcel(final Parcel parcel) {
                    zzd.f((Object)parcel, "in");
                    return new a(parcel);
                }
                
                public final Object[] newArray(final int n) {
                    return new a[n];
                }
            };
        }
        
        public a(final Parcel parcel) {
            zzd.f((Object)parcel, "in");
            this.C0 = parcel.readString();
            this.D0 = parcel.readString();
            this.E0 = parcel.readString();
            this.F0 = parcel.readString();
        }
        
        public a(final String c0, final String d0, final String e0, final String f0) {
            this.C0 = c0;
            this.D0 = d0;
            this.E0 = e0;
            this.F0 = f0;
        }
        
        public final int describeContents() {
            return 0;
        }
        
        public final void writeToParcel(final Parcel parcel, final int n) {
            zzd.f((Object)parcel, "dest");
            parcel.writeString(this.C0);
            parcel.writeString(this.D0);
            parcel.writeString(this.E0);
            parcel.writeString(this.F0);
        }
        
        public static final class b
        {
        }
    }
}
