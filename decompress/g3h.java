import android.os.Parcelable;
import java.util.Collection;
import java.util.List;
import java.util.ArrayList;
import android.os.Parcel;
import java.util.Map;
import android.os.Parcelable$Creator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class g3h extends u3
{
    public static final Parcelable$Creator<g3h> CREATOR;
    public final hn9 J0;
    
    static {
        CREATOR = (Parcelable$Creator)new g3h$a();
    }
    
    public g3h(final a3 a3, final a3 a4, final hn9 j0) {
        super((Map)null, 0, (String)null);
        this.J0 = j0;
        ((s3)this).I0.add(0, a4);
        if (((s3)this).I0.isEmpty()) {
            ((s3)this).I0.add(0, null);
        }
        ((s3)this).I0.add(1, a3);
    }
    
    public g3h(final Parcel parcel) {
        super(parcel);
        final ArrayList list = new ArrayList();
        parcel.readList((List)list, a3.class.getClassLoader());
        this.J0 = (hn9)parcel.readParcelable(hn9.class.getClassLoader());
        ((s3)this).I0.clear();
        ((s3)this).I0.addAll(list);
    }
    
    public final u3 a(final hn9 hn9, final noj<String> noj) {
        final zm9 f0 = hn9.F0;
        Object i2;
        if (f0 != null) {
            i2 = f0.I2((String)noj.h((Object)""));
        }
        else {
            i2 = null;
        }
        return new g3h(this.d(), (a3)i2, hn9);
    }
    
    public final hn9 b() {
        return this.J0;
    }
    
    public final a3 c() {
        return ((s3)this).I0.get(0);
    }
    
    public final a3 d() {
        return ((s3)this).I0.get(1);
    }
    
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || g3h.class != o.getClass()) {
            return false;
        }
        if (!super.equals(o)) {
            return false;
        }
        final g3h g3h = (g3h)o;
        return ((s3)g3h).I0.equals(((s3)this).I0) && o5j.a((Object)g3h.J0, (Object)this.J0);
    }
    
    public final int hashCode() {
        return o5j.h((Object)((s3)this).I0, (Object)this.J0, (Object)super.hashCode());
    }
    
    public final boolean isValid() {
        return true;
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeInt(((s3)this).F0);
        parcel.writeString(((s3)this).G0);
        u98.g(parcel, ((s3)this).H0);
        parcel.writeList((List)((s3)this).I0);
        parcel.writeParcelable((Parcelable)this.J0, n);
    }
}
