import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class f13 implements oax
{
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final int f;
    public final int g;
    public final boolean h;
    public final int i;
    public final String j;
    public final String k;
    
    public f13() {
        this(null, null, null, null, null, 0, 0, false, 0, null, null, 2047, null);
    }
    
    public f13(final String a, final String b, final String c, final String d, final String e, final int f, final int g, final boolean h, final int i, final String j, final String k) {
        zzd.f((Object)a, "screenTitle");
        zzd.f((Object)b, "textInputHint");
        zzd.f((Object)c, "textInputLabel");
        zzd.f((Object)d, "textInputError");
        zzd.f((Object)e, "text");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
        this.j = j;
        this.k = k;
    }
    
    public static f13 l(final f13 f13, String a, String b, String c, String d, String e, int f14, int g, boolean h, int i, String j, String k, final int n) {
        if ((n & 0x1) != 0x0) {
            a = f13.a;
        }
        if ((n & 0x2) != 0x0) {
            b = f13.b;
        }
        if ((n & 0x4) != 0x0) {
            c = f13.c;
        }
        if ((n & 0x8) != 0x0) {
            d = f13.d;
        }
        if ((n & 0x10) != 0x0) {
            e = f13.e;
        }
        if ((n & 0x20) != 0x0) {
            f14 = f13.f;
        }
        if ((n & 0x40) != 0x0) {
            g = f13.g;
        }
        if ((n & 0x80) != 0x0) {
            h = f13.h;
        }
        if ((n & 0x100) != 0x0) {
            i = f13.i;
        }
        if ((n & 0x200) != 0x0) {
            j = f13.j;
        }
        if ((n & 0x400) != 0x0) {
            k = f13.k;
        }
        Objects.requireNonNull(f13);
        zzd.f((Object)a, "screenTitle");
        zzd.f((Object)b, "textInputHint");
        zzd.f((Object)c, "textInputLabel");
        zzd.f((Object)d, "textInputError");
        zzd.f((Object)e, "text");
        return new f13(a, b, c, d, e, f14, g, h, i, j, k);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof f13)) {
            return false;
        }
        final f13 f13 = (f13)o;
        return zzd.a((Object)this.a, (Object)f13.a) && zzd.a((Object)this.b, (Object)f13.b) && zzd.a((Object)this.c, (Object)f13.c) && zzd.a((Object)this.d, (Object)f13.d) && zzd.a((Object)this.e, (Object)f13.e) && this.f == f13.f && this.g == f13.g && this.h == f13.h && this.i == f13.i && zzd.a((Object)this.j, (Object)f13.j) && zzd.a((Object)this.k, (Object)f13.k);
    }
    
    @Override
    public final int hashCode() {
        final int a = l7k.a(this.e, l7k.a(this.d, l7k.a(this.c, l7k.a(this.b, this.a.hashCode() * 31, 31), 31), 31), 31);
        final int f = this.f;
        final int g = this.g;
        int h;
        if ((h = (this.h ? 1 : 0)) != 0) {
            h = 1;
        }
        final int i = this.i;
        final String j = this.j;
        int hashCode = 0;
        int hashCode2;
        if (j == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = j.hashCode();
        }
        final String k = this.k;
        if (k != null) {
            hashCode = k.hashCode();
        }
        return (((((a + f) * 31 + g) * 31 + h) * 31 + i) * 31 + hashCode2) * 31 + hashCode;
    }
    
    @Override
    public final String toString() {
        final String a = this.a;
        final String b = this.b;
        final String c = this.c;
        final String d = this.d;
        final String e = this.e;
        final int f = this.f;
        final int g = this.g;
        final boolean h = this.h;
        final int i = this.i;
        final String j = this.j;
        final String k = this.k;
        final StringBuilder y = mb0.y("BusinessInputTextViewState(screenTitle=", a, ", textInputHint=", b, ", textInputLabel=");
        mag.m(y, c, ", textInputError=", d, ", text=");
        lf.y(y, e, ", textInputType=", f, ", validationState=");
        y.append(g);
        y.append(", enableDoneMenuItem=");
        y.append(h);
        y.append(", inputCharacterMaxCount=");
        y70.B(y, i, ", warningString=", j, ", warningUrl=");
        return hi.I(y, k, ")");
    }
}
