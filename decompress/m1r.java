import java.util.Collections;
import java.util.ArrayList;
import android.os.Parcel;
import java.util.List;
import android.os.Parcelable$Creator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class m1r extends i1r
{
    public static final Parcelable$Creator<m1r> CREATOR;
    public final List<m1r.m1r$c> C0;
    
    static {
        CREATOR = (Parcelable$Creator)new m1r$a();
    }
    
    public m1r(final Parcel parcel) {
        final int int1 = parcel.readInt();
        final ArrayList list = new ArrayList<m1r.m1r$c>(int1);
        for (int i = 0; i < int1; ++i) {
            list.add(new m1r.m1r$c(parcel));
        }
        this.C0 = Collections.unmodifiableList((List<? extends m1r.m1r$c>)list);
    }
    
    public m1r(final List<m1r.m1r$c> list) {
        this.C0 = Collections.unmodifiableList((List<? extends m1r.m1r$c>)list);
    }
    
    public final void writeToParcel(final Parcel parcel, int i) {
        final int size = this.C0.size();
        parcel.writeInt(size);
        m1r.m1r$c m1r$c;
        int size2;
        int j;
        m1r.m1r$b m1r$b;
        for (i = 0; i < size; ++i) {
            m1r$c = this.C0.get(i);
            parcel.writeLong(m1r$c.a);
            parcel.writeByte((byte)(byte)(m1r$c.b ? 1 : 0));
            parcel.writeByte((byte)(byte)(m1r$c.c ? 1 : 0));
            parcel.writeByte((byte)(byte)(m1r$c.d ? 1 : 0));
            size2 = m1r$c.f.size();
            parcel.writeInt(size2);
            for (j = 0; j < size2; ++j) {
                m1r$b = m1r$c.f.get(j);
                parcel.writeInt(m1r$b.a);
                parcel.writeLong(m1r$b.b);
            }
            parcel.writeLong(m1r$c.e);
            parcel.writeByte((byte)(byte)(m1r$c.g ? 1 : 0));
            parcel.writeLong(m1r$c.h);
            parcel.writeInt(m1r$c.i);
            parcel.writeInt(m1r$c.j);
            parcel.writeInt(m1r$c.k);
        }
    }
}
