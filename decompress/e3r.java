import java.util.Collections;
import java.util.ArrayList;
import android.os.Parcel;
import java.util.List;
import android.os.Parcelable$Creator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class e3r extends a3r
{
    public static final Parcelable$Creator<e3r> CREATOR;
    public final List<e3r.e3r$c> F0;
    
    static {
        CREATOR = (Parcelable$Creator)new e3r$a();
    }
    
    public e3r(final Parcel parcel) {
        final int int1 = parcel.readInt();
        final ArrayList list = new ArrayList<e3r.e3r$c>(int1);
        for (int i = 0; i < int1; ++i) {
            list.add(new e3r.e3r$c(parcel));
        }
        this.F0 = Collections.unmodifiableList((List<? extends e3r.e3r$c>)list);
    }
    
    public e3r(final List<e3r.e3r$c> list) {
        this.F0 = Collections.unmodifiableList((List<? extends e3r.e3r$c>)list);
    }
    
    public final void writeToParcel(final Parcel parcel, int i) {
        final int size = this.F0.size();
        parcel.writeInt(size);
        e3r.e3r$c e3r$c;
        int size2;
        int j;
        e3r.e3r$b e3r$b;
        for (i = 0; i < size; ++i) {
            e3r$c = this.F0.get(i);
            parcel.writeLong(e3r$c.a);
            parcel.writeByte((byte)(byte)(e3r$c.b ? 1 : 0));
            parcel.writeByte((byte)(byte)(e3r$c.c ? 1 : 0));
            parcel.writeByte((byte)(byte)(e3r$c.d ? 1 : 0));
            size2 = e3r$c.f.size();
            parcel.writeInt(size2);
            for (j = 0; j < size2; ++j) {
                e3r$b = e3r$c.f.get(j);
                parcel.writeInt(e3r$b.a);
                parcel.writeLong(e3r$b.b);
            }
            parcel.writeLong(e3r$c.e);
            parcel.writeByte((byte)(byte)(e3r$c.g ? 1 : 0));
            parcel.writeLong(e3r$c.h);
            parcel.writeInt(e3r$c.i);
            parcel.writeInt(e3r$c.j);
            parcel.writeInt(e3r$c.k);
        }
    }
}
