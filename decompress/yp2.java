import android.os.Parcel;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

// 
// Decompiled by Procyon v0.6.0
// 

public interface yp2 extends Parcelable
{
    int E1();
    
    long L();
    
    boolean O2();
    
    Boolean T1();
    
    a b1();
    
    gjl e();
    
    hp6 i();
    
    n1p t1();
    
    public static final class a implements Parcelable
    {
        public static final Parcelable$Creator<a> CREATOR;
        public static final b Companion;
        public final String F0;
        public final String G0;
        public final String H0;
        public final String I0;
        
        static {
            Companion = new b();
            CREATOR = (Parcelable$Creator)new Parcelable$Creator<a>() {
                public final Object createFromParcel(final Parcel parcel) {
                    e0e.f((Object)parcel, "in");
                    return new a(parcel);
                }
                
                public final Object[] newArray(final int n) {
                    return new a[n];
                }
            };
        }
        
        public a(final Parcel parcel) {
            e0e.f((Object)parcel, "in");
            this.F0 = parcel.readString();
            this.G0 = parcel.readString();
            this.H0 = parcel.readString();
            this.I0 = parcel.readString();
        }
        
        public a(final String f0, final String g0, final String h0, final String i0) {
            this.F0 = f0;
            this.G0 = g0;
            this.H0 = h0;
            this.I0 = i0;
        }
        
        public final int describeContents() {
            return 0;
        }
        
        public final void writeToParcel(final Parcel parcel, final int n) {
            e0e.f((Object)parcel, "dest");
            parcel.writeString(this.F0);
            parcel.writeString(this.G0);
            parcel.writeString(this.H0);
            parcel.writeString(this.I0);
        }
        
        public static final class b
        {
        }
    }
}
