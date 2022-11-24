import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class p13 implements ccx
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
    
    public p13() {
        this(null, null, null, null, null, 0, 0, false, 0, null, null, 2047, null);
    }
    
    public p13(final String a, final String b, final String c, final String d, final String e, final int f, final int g, final boolean h, final int i, final String j, final String k) {
        e0e.f((Object)a, "screenTitle");
        e0e.f((Object)b, "textInputHint");
        e0e.f((Object)c, "textInputLabel");
        e0e.f((Object)d, "textInputError");
        e0e.f((Object)e, "text");
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
    
    public p13(final String s, final String s2, final String s3, final String s4, final String s5, final int n, final int n2, final boolean b, final int n3, final String s6, final String s7, final int n4, final wg8 wg8) {
        this("", "", "", "", "", 0, 0, false, 0, null, null);
    }
    
    public static p13 l(final p13 p13, String a, String b, String c, String d, String e, int f, int g, boolean h, int i, String j, String k, final int n) {
        if ((n & 0x1) != 0x0) {
            a = p13.a;
        }
        if ((n & 0x2) != 0x0) {
            b = p13.b;
        }
        if ((n & 0x4) != 0x0) {
            c = p13.c;
        }
        if ((n & 0x8) != 0x0) {
            d = p13.d;
        }
        if ((n & 0x10) != 0x0) {
            e = p13.e;
        }
        if ((n & 0x20) != 0x0) {
            f = p13.f;
        }
        if ((n & 0x40) != 0x0) {
            g = p13.g;
        }
        if ((n & 0x80) != 0x0) {
            h = p13.h;
        }
        if ((n & 0x100) != 0x0) {
            i = p13.i;
        }
        if ((n & 0x200) != 0x0) {
            j = p13.j;
        }
        if ((n & 0x400) != 0x0) {
            k = p13.k;
        }
        Objects.requireNonNull(p13);
        e0e.f((Object)a, "screenTitle");
        e0e.f((Object)b, "textInputHint");
        e0e.f((Object)c, "textInputLabel");
        e0e.f((Object)d, "textInputError");
        e0e.f((Object)e, "text");
        return new p13(a, b, c, d, e, f, g, h, i, j, k);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof p13)) {
            return false;
        }
        final p13 p = (p13)o;
        return e0e.a((Object)this.a, (Object)p.a) && e0e.a((Object)this.b, (Object)p.b) && e0e.a((Object)this.c, (Object)p.c) && e0e.a((Object)this.d, (Object)p.d) && e0e.a((Object)this.e, (Object)p.e) && this.f == p.f && this.g == p.g && this.h == p.h && this.i == p.i && e0e.a((Object)this.j, (Object)p.j) && e0e.a((Object)this.k, (Object)p.k);
    }
    
    @Override
    public final int hashCode() {
        final int d = brg.d(this.e, brg.d(this.d, brg.d(this.c, brg.d(this.b, this.a.hashCode() * 31, 31), 31), 31), 31);
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
        return (((((d + f) * 31 + g) * 31 + h) * 31 + i) * 31 + hashCode2) * 31 + hashCode;
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
        final StringBuilder l = l58.k("BusinessInputTextViewState(screenTitle=", a, ", textInputHint=", b, ", textInputLabel=");
        jba.s(l, c, ", textInputError=", d, ", text=");
        m51.z(l, e, ", textInputType=", f, ", validationState=");
        l.append(g);
        l.append(", enableDoneMenuItem=");
        l.append(h);
        l.append(", inputCharacterMaxCount=");
        bj.A(l, i, ", warningString=", j, ", warningUrl=");
        return m51.y(l, k, ")");
    }
}
