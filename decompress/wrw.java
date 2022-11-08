import android.os.Parcelable;
import android.text.TextUtils;
import java.lang.reflect.Method;
import android.os.Parcel;
import android.util.SparseIntArray;
import androidx.versionedparcelable.VersionedParcel;

// 
// Decompiled by Procyon v0.6.0
// 

public final class wrw extends VersionedParcel
{
    public final SparseIntArray d;
    public final Parcel e;
    public final int f;
    public final int g;
    public final String h;
    public int i;
    public int j;
    public int k;
    
    public wrw(final Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", (at0<String, Method>)new at0(), (at0<String, Method>)new at0(), (at0<String, Class>)new at0());
    }
    
    public wrw(final Parcel e, final int n, final int g, final String h, final at0<String, Method> at0, final at0<String, Method> at2, final at0<String, Class> at3) {
        super(at0, at2, at3);
        this.d = new SparseIntArray();
        this.i = -1;
        this.k = -1;
        this.e = e;
        this.f = n;
        this.g = g;
        this.j = n;
        this.h = h;
    }
    
    @Override
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
    
    @Override
    public final VersionedParcel b() {
        final Parcel e = this.e;
        final int dataPosition = e.dataPosition();
        int n;
        if ((n = this.j) == this.f) {
            n = this.g;
        }
        return new wrw(e, dataPosition, n, hi.I(new StringBuilder(), this.h, "  "), (at0<String, Method>)super.a, (at0<String, Method>)super.b, (at0<String, Class>)super.c);
    }
    
    @Override
    public final boolean f() {
        return this.e.readInt() != 0;
    }
    
    @Override
    public final byte[] g() {
        final int int1 = this.e.readInt();
        if (int1 < 0) {
            return null;
        }
        final byte[] array = new byte[int1];
        this.e.readByteArray(array);
        return array;
    }
    
    @Override
    public final CharSequence h() {
        return (CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(this.e);
    }
    
    @Override
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
    
    @Override
    public final int j() {
        return this.e.readInt();
    }
    
    @Override
    public final <T extends Parcelable> T l() {
        return (T)this.e.readParcelable(wrw.class.getClassLoader());
    }
    
    @Override
    public final String n() {
        return this.e.readString();
    }
    
    @Override
    public final void p(final int i) {
        this.a();
        this.i = i;
        this.d.put(i, this.e.dataPosition());
        this.t(0);
        this.t(i);
    }
    
    @Override
    public final void q(final boolean b) {
        this.e.writeInt((int)(b ? 1 : 0));
    }
    
    @Override
    public final void r(final byte[] array) {
        if (array != null) {
            this.e.writeInt(array.length);
            this.e.writeByteArray(array);
        }
        else {
            this.e.writeInt(-1);
        }
    }
    
    @Override
    public final void s(final CharSequence charSequence) {
        TextUtils.writeToParcel(charSequence, this.e, 0);
    }
    
    @Override
    public final void t(final int n) {
        this.e.writeInt(n);
    }
    
    @Override
    public final void v(final Parcelable parcelable) {
        this.e.writeParcelable(parcelable, 0);
    }
    
    @Override
    public final void x(final String s) {
        this.e.writeString(s);
    }
}
