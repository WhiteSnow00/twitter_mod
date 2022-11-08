import java.util.ArrayList;
import android.os.Parcel;
import java.util.List;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gtc implements Parcelable
{
    public static final Parcelable$Creator<gtc> CREATOR;
    public final List<jtc> C0;
    public final List<qtc> D0;
    public final String E0;
    public final String F0;
    
    static {
        CREATOR = (Parcelable$Creator)new Parcelable$Creator<gtc>() {
            public final Object createFromParcel(final Parcel parcel) {
                return new gtc(parcel);
            }
            
            public final Object[] newArray(final int n) {
                return new gtc[n];
            }
        };
    }
    
    public gtc(final Parcel parcel) {
        this.E0 = parcel.readString();
        final ArrayList arrayList = parcel.readArrayList(qtc.class.getClassLoader());
        final int a = w4j.a;
        this.C0 = arrayList;
        this.D0 = parcel.readArrayList(jtc.class.getClassLoader());
        this.F0 = parcel.readString();
    }
    
    public gtc(final List<jtc> c0, final List<qtc> d0, final String e0, final String f0) {
        this.C0 = c0;
        this.D0 = d0;
        this.F0 = f0;
        this.E0 = e0;
    }
    
    public final int a() {
        if (!this.C0.isEmpty()) {
            return 1;
        }
        if (!this.D0.isEmpty()) {
            return 2;
        }
        final String f0 = this.F0;
        if (f0 != null && !f0.isEmpty()) {
            return 3;
        }
        return 4;
    }
    
    public final int describeContents() {
        return 0;
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeString(this.E0);
        parcel.writeList((List)this.C0);
        parcel.writeList((List)this.D0);
        parcel.writeString(this.F0);
    }
    
    public static final class b extends h4j<gtc>
    {
        public List<jtc> a;
        public List<qtc> b;
        public String c;
        public String d;
        
        public final Object i() {
            final List<jtc> a = this.a;
            pf8.r(a);
            final List<qtc> b = this.b;
            pf8.r(b);
            final String c = this.c;
            pf8.r(c);
            return new gtc(a, b, c, this.d);
        }
        
        public final boolean l() {
            return this.a != null && this.b != null && this.c != null;
        }
    }
}
