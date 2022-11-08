// 
// Decompiled by Procyon v0.6.0
// 

package androidx.fragment.app;

import java.util.List;
import android.text.TextUtils;
import android.os.Parcel;
import java.util.ArrayList;
import android.os.Parcelable$Creator;
import android.annotation.SuppressLint;
import android.os.Parcelable;

@SuppressLint({ "BanParcelableUsage" })
public final class b implements Parcelable
{
    public static final Parcelable$Creator<b> CREATOR;
    public final int[] C0;
    public final ArrayList<String> D0;
    public final int[] E0;
    public final int[] F0;
    public final int G0;
    public final String H0;
    public final int I0;
    public final int J0;
    public final CharSequence K0;
    public final int L0;
    public final CharSequence M0;
    public final ArrayList<String> N0;
    public final ArrayList<String> O0;
    public final boolean P0;
    
    static {
        CREATOR = (Parcelable$Creator)new Parcelable$Creator<b>() {
            public final Object createFromParcel(final Parcel parcel) {
                return new b(parcel);
            }
            
            public final Object[] newArray(final int n) {
                return new b[n];
            }
        };
    }
    
    public b(final Parcel parcel) {
        this.C0 = parcel.createIntArray();
        this.D0 = parcel.createStringArrayList();
        this.E0 = parcel.createIntArray();
        this.F0 = parcel.createIntArray();
        this.G0 = parcel.readInt();
        this.H0 = parcel.readString();
        this.I0 = parcel.readInt();
        this.J0 = parcel.readInt();
        this.K0 = (CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.L0 = parcel.readInt();
        this.M0 = (CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.N0 = parcel.createStringArrayList();
        this.O0 = parcel.createStringArrayList();
        this.P0 = (parcel.readInt() != 0);
    }
    
    public b(final a a) {
        final int size = a.a.size();
        this.C0 = new int[size * 6];
        if (a.g) {
            this.D0 = new ArrayList<String>(size);
            this.E0 = new int[size];
            this.F0 = new int[size];
            for (int i = 0, n = 0; i < size; ++i, ++n) {
                final s.a a2 = a.a.get(i);
                final int[] c0 = this.C0;
                final int n2 = n + 1;
                c0[n] = a2.a;
                final ArrayList<String> d0 = this.D0;
                final Fragment b = a2.b;
                String h0;
                if (b != null) {
                    h0 = b.H0;
                }
                else {
                    h0 = null;
                }
                d0.add(h0);
                final int[] c2 = this.C0;
                final int n3 = n2 + 1;
                c2[n2] = (a2.c ? 1 : 0);
                final int n4 = n3 + 1;
                c2[n3] = a2.d;
                final int n5 = n4 + 1;
                c2[n4] = a2.e;
                n = n5 + 1;
                c2[n5] = a2.f;
                c2[n] = a2.g;
                this.E0[i] = ((Enum)a2.h).ordinal();
                this.F0[i] = ((Enum)a2.i).ordinal();
            }
            this.G0 = a.f;
            this.H0 = a.h;
            this.I0 = a.r;
            this.J0 = a.i;
            this.K0 = a.j;
            this.L0 = a.k;
            this.M0 = a.l;
            this.N0 = a.m;
            this.O0 = a.n;
            this.P0 = a.o;
            return;
        }
        throw new IllegalStateException("Not on back stack");
    }
    
    public final int describeContents() {
        return 0;
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeIntArray(this.C0);
        parcel.writeStringList((List)this.D0);
        parcel.writeIntArray(this.E0);
        parcel.writeIntArray(this.F0);
        parcel.writeInt(this.G0);
        parcel.writeString(this.H0);
        parcel.writeInt(this.I0);
        parcel.writeInt(this.J0);
        TextUtils.writeToParcel(this.K0, parcel, 0);
        parcel.writeInt(this.L0);
        TextUtils.writeToParcel(this.M0, parcel, 0);
        parcel.writeStringList((List)this.N0);
        parcel.writeStringList((List)this.O0);
        parcel.writeInt((int)(this.P0 ? 1 : 0));
    }
}
