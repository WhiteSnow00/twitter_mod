import java.util.Collections;
import java.util.List;
import java.util.Objects;
import android.os.Parcel;
import android.os.Parcelable$Creator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gav implements om9
{
    public static final Parcelable$Creator<gav> CREATOR;
    public static final gav.gav$b G0;
    public final String C0;
    public final int D0;
    public final gn9 E0;
    public final hn9 F0;
    
    static {
        G0 = new gav.gav$b();
        CREATOR = (Parcelable$Creator)new Parcelable$Creator<gav>() {
            public final Object createFromParcel(final Parcel parcel) {
                return new gav(parcel.readString(), parcel.readInt(), (gn9)yvj.h(parcel, (alp)gn9.J0), (hn9)yvj.h(parcel, (alp)hn9.d));
            }
            
            public final Object[] newArray(final int n) {
                return new gav[n];
            }
        };
    }
    
    public gav(final String c0, final int d0, final gn9 e0, final hn9 f0) {
        this.C0 = c0;
        this.D0 = d0;
        this.E0 = e0;
        this.F0 = f0;
    }
    
    public final mvw I2(final String g) {
        final hil b = ln9.b(this.F0);
        final gn9 e0 = this.E0;
        mvw mvw = null;
        final String s = null;
        if (e0 != null) {
            Objects.requireNonNull(e0);
            String a = s;
            if (b != null) {
                a = b.a;
            }
            final mvw$b a2 = new mvw$b();
            b4 a3;
            if (a != null) {
                a3 = new b4(e0.D0, a);
            }
            else {
                a3 = b4.a(e0.D0);
            }
            a2.a = a3;
            a2.b = "ad";
            a2.c = (f3)new tcv(e0.E0);
            final String f0 = e0.F0;
            a2.d = f0;
            a2.e = e0.G0;
            a2.f = (e0.H0 && pjr.g((CharSequence)f0));
            a2.g = g;
            a2.i = e0.C0;
            final hav$b hav$b = new hav$b();
            hav$b.a = a2;
            hav$b.b = b;
            mvw = (mvw)((h4j)hav$b).e();
        }
        return mvw;
    }
    
    public final List<i2h> T() {
        final gn9 e0 = this.E0;
        Object o;
        if (e0 != null) {
            o = e0.I0;
        }
        else {
            o = Collections.emptyList();
        }
        return (List<i2h>)o;
    }
    
    public final int describeContents() {
        return 0;
    }
    
    @Override
    public final boolean equals(final Object o) {
        boolean b = true;
        if (this == o) {
            return true;
        }
        if (o != null && gav.class == o.getClass()) {
            final gav gav = (gav)o;
            if (!w4j.a((Object)this.C0, (Object)gav.C0) || this.D0 != gav.D0 || !w4j.a((Object)this.E0, (Object)gav.E0) || !w4j.a((Object)this.F0, (Object)gav.F0)) {
                b = false;
            }
            return b;
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return w4j.i((Object)this.C0, (Object)this.D0, (Object)this.E0, (Object)this.F0);
    }
    
    public final boolean isValid() {
        return this.E0 != null;
    }
    
    public final int m0() {
        return this.D0;
    }
    
    public final String u0() {
        return this.C0;
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeString(this.C0);
        parcel.writeInt(this.D0);
        yvj.l(parcel, (Object)this.E0, (alp)gn9.J0);
        yvj.l(parcel, (Object)this.F0, (alp)hn9.d);
    }
}
