import java.io.Serializable;
import android.os.Parcel;
import android.os.Parcelable$Creator;
import android.os.Parcelable;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import java.util.Locale;
import android.os.Build$VERSION;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jh1
{
    public final a a;
    public final a b;
    public final float c;
    public final float d;
    public final float e;
    
    public jh1(final Context context) {
        final a b = new a();
        this.b = b;
        final a a = new a();
        final int c0 = a.C0;
        final int n = 0;
        AttributeSet a2;
        int styleAttribute;
        if (c0 != 0) {
            a2 = ae9.a(context, c0, (CharSequence)"badge");
            styleAttribute = a2.getStyleAttribute();
        }
        else {
            a2 = null;
            styleAttribute = 0;
        }
        if (styleAttribute == 0) {
            styleAttribute = 2132019330;
        }
        final TypedArray d = hks.d(context, a2, rp2.O0, 2130968740, styleAttribute, new int[0]);
        final Resources resources = context.getResources();
        this.c = (float)d.getDimensionPixelSize(2, resources.getDimensionPixelSize(2131166496));
        this.e = (float)d.getDimensionPixelSize(4, resources.getDimensionPixelSize(2131166495));
        this.d = (float)d.getDimensionPixelSize(5, resources.getDimensionPixelSize(2131166501));
        int f0;
        if ((f0 = a.F0) == -2) {
            f0 = 255;
        }
        b.F0 = f0;
        CharSequence j0;
        if ((j0 = a.J0) == null) {
            j0 = context.getString(2131955170);
        }
        b.J0 = j0;
        int k0;
        if ((k0 = a.K0) == 0) {
            k0 = 2131820616;
        }
        b.K0 = k0;
        int l0;
        if ((l0 = a.L0) == 0) {
            l0 = 2131955172;
        }
        b.L0 = l0;
        final Boolean n2 = a.N0;
        b.N0 = (n2 == null || n2);
        int h0;
        if ((h0 = a.H0) == -2) {
            h0 = d.getInt(8, 4);
        }
        b.H0 = h0;
        final int g0 = a.G0;
        if (g0 != -2) {
            b.G0 = g0;
        }
        else if (d.hasValue(9)) {
            b.G0 = d.getInt(9, 0);
        }
        else {
            b.G0 = -1;
        }
        final Integer d2 = a.D0;
        int n3;
        if (d2 == null) {
            n3 = ong.b(context, d, 0).getDefaultColor();
        }
        else {
            n3 = d2;
        }
        b.D0 = n3;
        final Integer e0 = a.E0;
        if (e0 != null) {
            b.E0 = e0;
        }
        else if (d.hasValue(3)) {
            b.E0 = ong.b(context, d, 3).getDefaultColor();
        }
        else {
            final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(2132018524, rp2.A1);
            obtainStyledAttributes.getDimension(0, 0.0f);
            final ColorStateList b2 = ong.b(context, obtainStyledAttributes, 3);
            ong.b(context, obtainStyledAttributes, 4);
            ong.b(context, obtainStyledAttributes, 5);
            obtainStyledAttributes.getInt(2, 0);
            obtainStyledAttributes.getInt(1, 1);
            int n4 = 12;
            if (!obtainStyledAttributes.hasValue(12)) {
                n4 = 10;
            }
            obtainStyledAttributes.getResourceId(n4, 0);
            obtainStyledAttributes.getString(n4);
            obtainStyledAttributes.getBoolean(14, false);
            ong.b(context, obtainStyledAttributes, 6);
            obtainStyledAttributes.getFloat(7, 0.0f);
            obtainStyledAttributes.getFloat(8, 0.0f);
            obtainStyledAttributes.getFloat(9, 0.0f);
            obtainStyledAttributes.recycle();
            final TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(2132018524, rp2.o1);
            obtainStyledAttributes2.hasValue(0);
            obtainStyledAttributes2.getFloat(0, 0.0f);
            obtainStyledAttributes2.recycle();
            b.E0 = b2.getDefaultColor();
        }
        final Integer m0 = a.M0;
        int n5;
        if (m0 == null) {
            n5 = d.getInt(1, 8388661);
        }
        else {
            n5 = m0;
        }
        b.M0 = n5;
        final Integer o0 = a.O0;
        int n6;
        if (o0 == null) {
            n6 = d.getDimensionPixelOffset(6, 0);
        }
        else {
            n6 = o0;
        }
        b.O0 = n6;
        int n7;
        if (a.O0 == null) {
            n7 = d.getDimensionPixelOffset(10, 0);
        }
        else {
            n7 = a.P0;
        }
        b.P0 = n7;
        final Integer q0 = a.Q0;
        int n8;
        if (q0 == null) {
            n8 = d.getDimensionPixelOffset(7, (int)b.O0);
        }
        else {
            n8 = q0;
        }
        b.Q0 = n8;
        final Integer r0 = a.R0;
        int n9;
        if (r0 == null) {
            n9 = d.getDimensionPixelOffset(11, (int)b.P0);
        }
        else {
            n9 = r0;
        }
        b.R0 = n9;
        final Integer s0 = a.S0;
        int intValue;
        if (s0 == null) {
            intValue = 0;
        }
        else {
            intValue = s0;
        }
        b.S0 = intValue;
        final Integer t0 = a.T0;
        int intValue2;
        if (t0 == null) {
            intValue2 = n;
        }
        else {
            intValue2 = t0;
        }
        b.T0 = intValue2;
        d.recycle();
        final Locale i0 = a.I0;
        if (i0 == null) {
            Locale i2;
            if (Build$VERSION.SDK_INT >= 24) {
                i2 = Locale.getDefault(Locale.Category.FORMAT);
            }
            else {
                i2 = Locale.getDefault();
            }
            b.I0 = i2;
        }
        else {
            b.I0 = i0;
        }
        this.a = a;
    }
    
    public static final class a implements Parcelable
    {
        public static final Parcelable$Creator<a> CREATOR;
        public int C0;
        public Integer D0;
        public Integer E0;
        public int F0;
        public int G0;
        public int H0;
        public Locale I0;
        public CharSequence J0;
        public int K0;
        public int L0;
        public Integer M0;
        public Boolean N0;
        public Integer O0;
        public Integer P0;
        public Integer Q0;
        public Integer R0;
        public Integer S0;
        public Integer T0;
        
        static {
            CREATOR = (Parcelable$Creator)new Parcelable$Creator<a>() {
                public final Object createFromParcel(final Parcel parcel) {
                    return new a(parcel);
                }
                
                public final Object[] newArray(final int n) {
                    return new a[n];
                }
            };
        }
        
        public a() {
            this.F0 = 255;
            this.G0 = -2;
            this.H0 = -2;
            this.N0 = Boolean.TRUE;
        }
        
        public a(final Parcel parcel) {
            this.F0 = 255;
            this.G0 = -2;
            this.H0 = -2;
            this.N0 = Boolean.TRUE;
            this.C0 = parcel.readInt();
            this.D0 = (Integer)parcel.readSerializable();
            this.E0 = (Integer)parcel.readSerializable();
            this.F0 = parcel.readInt();
            this.G0 = parcel.readInt();
            this.H0 = parcel.readInt();
            this.J0 = parcel.readString();
            this.K0 = parcel.readInt();
            this.M0 = (Integer)parcel.readSerializable();
            this.O0 = (Integer)parcel.readSerializable();
            this.P0 = (Integer)parcel.readSerializable();
            this.Q0 = (Integer)parcel.readSerializable();
            this.R0 = (Integer)parcel.readSerializable();
            this.S0 = (Integer)parcel.readSerializable();
            this.T0 = (Integer)parcel.readSerializable();
            this.N0 = (Boolean)parcel.readSerializable();
            this.I0 = (Locale)parcel.readSerializable();
        }
        
        public final int describeContents() {
            return 0;
        }
        
        public final void writeToParcel(final Parcel parcel, final int n) {
            parcel.writeInt(this.C0);
            parcel.writeSerializable((Serializable)this.D0);
            parcel.writeSerializable((Serializable)this.E0);
            parcel.writeInt(this.F0);
            parcel.writeInt(this.G0);
            parcel.writeInt(this.H0);
            final CharSequence j0 = this.J0;
            String string;
            if (j0 == null) {
                string = null;
            }
            else {
                string = j0.toString();
            }
            parcel.writeString(string);
            parcel.writeInt(this.K0);
            parcel.writeSerializable((Serializable)this.M0);
            parcel.writeSerializable((Serializable)this.O0);
            parcel.writeSerializable((Serializable)this.P0);
            parcel.writeSerializable((Serializable)this.Q0);
            parcel.writeSerializable((Serializable)this.R0);
            parcel.writeSerializable((Serializable)this.S0);
            parcel.writeSerializable((Serializable)this.T0);
            parcel.writeSerializable((Serializable)this.N0);
            parcel.writeSerializable((Serializable)this.I0);
        }
    }
}
