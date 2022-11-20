import android.os.Parcel;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import android.os.Parcelable$Creator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bbv implements xl9
{
    public static final Parcelable$Creator<bbv> CREATOR;
    public static final bbv.bbv$b H0;
    public final String D0;
    public final int E0;
    public final pm9 F0;
    public final qm9 G0;
    
    static {
        H0 = new bbv.bbv$b();
        CREATOR = (Parcelable$Creator)new bbv$a();
    }
    
    public bbv(final String d0, final int e0, final pm9 f0, final qm9 g0) {
        this.D0 = d0;
        this.E0 = e0;
        this.F0 = f0;
        this.G0 = g0;
    }
    
    public final fww H2(final String g) {
        final uil b = um9.b(this.G0);
        final pm9 f0 = this.F0;
        fww fww = null;
        final String s = null;
        if (f0 != null) {
            Objects.requireNonNull(f0);
            String a = s;
            if (b != null) {
                a = b.a;
            }
            final fww$b a2 = new fww$b();
            e4 a3;
            if (a != null) {
                a3 = new e4(f0.E0, a);
            }
            else {
                a3 = e4.a(f0.E0);
            }
            a2.a = a3;
            a2.b = "ad";
            a2.c = (i3)new odv(f0.F0);
            final String g2 = f0.G0;
            a2.d = g2;
            a2.e = f0.H0;
            a2.f = (f0.I0 && ikr.g((CharSequence)g2));
            a2.g = g;
            a2.i = f0.D0;
            final cbv$b cbv$b = new cbv$b();
            cbv$b.a = a2;
            cbv$b.b = b;
            fww = (fww)((n4j)cbv$b).e();
        }
        return fww;
    }
    
    public final List<j2h> T() {
        final pm9 f0 = this.F0;
        List<Object> list;
        if (f0 != null) {
            list = f0.J0;
        }
        else {
            list = Collections.emptyList();
        }
        return (List<j2h>)list;
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
        if (o != null && bbv.class == o.getClass()) {
            final bbv bbv = (bbv)o;
            if (!c5j.a((Object)this.D0, (Object)bbv.D0) || this.E0 != bbv.E0 || !c5j.a((Object)this.F0, (Object)bbv.F0) || !c5j.a((Object)this.G0, (Object)bbv.G0)) {
                b = false;
            }
            return b;
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return c5j.i((Object)this.D0, (Object)this.E0, (Object)this.F0, (Object)this.G0);
    }
    
    public final boolean isValid() {
        return this.F0 != null;
    }
    
    public final int l0() {
        return this.E0;
    }
    
    public final String t0() {
        return this.D0;
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeString(this.D0);
        parcel.writeInt(this.E0);
        dwj.l(parcel, (Object)this.F0, (rlp)pm9.K0);
        dwj.l(parcel, (Object)this.G0, (rlp)qm9.d);
    }
}
