// 
// Decompiled by Procyon v0.6.0
// 

public final class abu<T> implements gm9<T>
{
    public final int a;
    public final int b;
    public final cq9 c;
    
    public abu() {
        this(0, null, 7);
    }
    
    public abu(final int a, final int b, final cq9 c) {
        zzd.f((Object)c, "easing");
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public abu(int a, cq9 a2, final int n) {
        if ((n & 0x1) != 0x0) {
            a = 300;
        }
        if ((n & 0x4) != 0x0) {
            a2 = (cq9)eq9.a;
        }
        zzd.f((Object)a2, "easing");
        this.a = a;
        this.b = 0;
        this.c = a2;
    }
    
    public final gpw a(final chv chv) {
        zzd.f((Object)chv, "converter");
        return (gpw)new rpw(this.a, this.b, this.c);
    }
    
    public final kpw a(final chv chv) {
        zzd.f((Object)chv, "converter");
        return (kpw)new rpw(this.a, this.b, this.c);
    }
    
    @Override
    public final boolean equals(final Object o) {
        final boolean b = o instanceof abu;
        boolean b3;
        final boolean b2 = b3 = false;
        if (b) {
            final abu abu = (abu)o;
            b3 = b2;
            if (abu.a == this.a) {
                b3 = b2;
                if (abu.b == this.b) {
                    b3 = b2;
                    if (zzd.a((Object)abu.c, (Object)this.c)) {
                        b3 = true;
                    }
                }
            }
        }
        return b3;
    }
    
    @Override
    public final int hashCode() {
        return (this.c.hashCode() + this.a * 31) * 31 + this.b;
    }
}
