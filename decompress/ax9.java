import android.net.Uri;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ax9 extends jx9<y90> implements py
{
    public static final nmp<ax9> K0;
    public final String J0;
    
    static {
        ax9.K0 = ax9.ax9$a.b;
    }
    
    public ax9(final ax9.ax9$b ax9$b) {
        super((dwg)ax9$b.a, ax9$b.b, ax9$b.c);
        this.J0 = ax9$b.d;
    }
    
    public ax9(final y90 y90, final Uri uri, final n0h n0h) {
        super((dwg)y90, uri, n0h);
        this.J0 = null;
    }
    
    public ax9(final y90 y90, final Uri uri, final n0h n0h, final String j0) {
        super((dwg)y90, uri, n0h);
        this.J0 = j0;
    }
    
    public final String b() {
        String j0;
        if ((j0 = this.J0) == null) {
            j0 = "";
        }
        return j0;
    }
    
    public final boolean equals(final Object o) {
        final boolean b = false;
        if (this != o) {
            boolean b2 = b;
            if (!(o instanceof ax9)) {
                return b2;
            }
            final ax9 ax9 = (ax9)o;
            boolean b3 = false;
            Label_0098: {
                Label_0096: {
                    if (this != ax9) {
                        if (ax9 != null && this.i((jx9)ax9)) {
                            final String j0 = ax9.J0;
                            String s = "";
                            String s2;
                            if ((s2 = j0) == null) {
                                s2 = "";
                            }
                            final String j2 = this.J0;
                            if (j2 != null) {
                                s = j2;
                            }
                            if (o5j.a((Object)s2, (Object)s)) {
                                break Label_0096;
                            }
                        }
                        b3 = false;
                        break Label_0098;
                    }
                }
                b3 = true;
            }
            b2 = b;
            if (!b3) {
                return b2;
            }
        }
        return true;
    }
    
    public final jx9 f() {
        return this;
    }
    
    public final sj h() {
        return (sj)new eck((Object)this, 21);
    }
    
    public final int hashCode() {
        return o5j.f((Object)this.J0) + super.hashCode() * 31;
    }
    
    public final float l() {
        return ((dwg)super.F0).b.h();
    }
}
