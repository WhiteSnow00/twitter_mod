import android.os.Parcelable;
import android.text.TextUtils;
import java.lang.reflect.Method;
import android.os.Parcel;
import android.util.SparseIntArray;
import androidx.versionedparcelable.VersionedParcel;

// 
// Decompiled by Procyon v0.6.0
// 

public final class etw extends VersionedParcel
{
    public final SparseIntArray d;
    public final Parcel e;
    public final int f;
    public final int g;
    public final String h;
    public int i;
    public int j;
    public int k;
    
    public etw(final Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new ws0<String, Method>(), new ws0<String, Method>(), new ws0<String, Class>());
    }
    
    public etw(final Parcel e, final int n, final int g, final String h, final ws0<String, Method> ws0, final ws0<String, Method> ws2, final ws0<String, Class> ws3) {
        super((ws0)ws0, (ws0)ws2, (ws0)ws3);
        this.d = new SparseIntArray();
        this.i = -1;
        this.k = -1;
        this.e = e;
        this.f = n;
        this.g = g;
        this.j = n;
        this.h = h;
    }
    
    public final void a() {
        final int i = this.i;
        if (i >= 0) {
            final int value = this.d.get(i);
            final int dataPosition = this.e.dataPosition();
            this.e.setDataPosition(value);
            this.e.writeInt(dataPosition - value);
            this.e.setDataPosition(dataPosition);
        }
    }
    
    public final VersionedParcel b() {
        final Parcel e = this.e;
        final int dataPosition = e.dataPosition();
        int n;
        if ((n = this.j) == this.f) {
            n = this.g;
        }
        return new etw(e, dataPosition, n, m51.y(new StringBuilder(), this.h, "  "), super.a, super.b, super.c);
    }
    
    public final boolean f() {
        return this.e.readInt() != 0;
    }
    
    public final byte[] g() {
        final int int1 = this.e.readInt();
        if (int1 < 0) {
            return null;
        }
        final byte[] array = new byte[int1];
        this.e.readByteArray(array);
        return array;
    }
    
    public final CharSequence h() {
        return (CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(this.e);
    }
    
    public final boolean i(final int n) {
        while (true) {
            final int j = this.j;
            final int g = this.g;
            boolean b = true;
            if (j >= g) {
                if (this.k != n) {
                    b = false;
                }
                return b;
            }
            final int k = this.k;
            if (k == n) {
                return true;
            }
            if (String.valueOf(k).compareTo(String.valueOf(n)) > 0) {
                return false;
            }
            this.e.setDataPosition(this.j);
            final int int1 = this.e.readInt();
            this.k = this.e.readInt();
            this.j += int1;
        }
    }
    
    public final int j() {
        return this.e.readInt();
    }
    
    public final <T extends Parcelable> T l() {
        return (T)this.e.readParcelable(etw.class.getClassLoader());
    }
    
    public final String n() {
        return this.e.readString();
    }
    
    public final void p(final int i) {
        this.a();
        this.i = i;
        this.d.put(i, this.e.dataPosition());
        this.t(0);
        this.t(i);
    }
    
    public final void q(final boolean b) {
        this.e.writeInt((int)(b ? 1 : 0));
    }
    
    public final void r(final byte[] array) {
        if (array != null) {
            this.e.writeInt(array.length);
            this.e.writeByteArray(array);
        }
        else {
            this.e.writeInt(-1);
        }
    }
    
    public final void s(final CharSequence charSequence) {
        TextUtils.writeToParcel(charSequence, this.e, 0);
    }
    
    public final void t(final int n) {
        this.e.writeInt(n);
    }
    
    public final void v(final Parcelable parcelable) {
        this.e.writeParcelable(parcelable, 0);
    }
    
    public final void x(final String s) {
        this.e.writeString(s);
    }
}
