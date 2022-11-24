import java.io.IOException;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kxv
{
    public static final nmp<kxv> e;
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    
    static {
        kxv.e = new kxv.kxv$b();
    }
    
    public kxv(final kxv.kxv$a kxv$a) {
        this.a = kxv$a.a;
        this.b = kxv$a.b;
        this.c = kxv$a.c;
        this.d = kxv$a.d;
    }
    
    public final void a(final yfe yfe) throws IOException {
        yfe.r0();
        final int a = this.a;
        if (a != -1) {
            yfe.T("current_media_index", a);
        }
        final int b = this.b;
        if (b != -1) {
            yfe.T("previous_media_index", b);
        }
        final int c = this.c;
        if (c != -1) {
            yfe.T("current_slide_index", c);
        }
        final int d = this.d;
        if (d != -1) {
            yfe.T("previous_slide_index", d);
        }
        yfe.h();
    }
    
    @Override
    public final boolean equals(final Object o) {
        final boolean b = o instanceof kxv;
        boolean b2 = true;
        if (b) {
            final kxv kxv = (kxv)o;
            if (o5j.a((Object)this.a, (Object)kxv.a) && o5j.a((Object)this.b, (Object)kxv.b) && o5j.a((Object)this.c, (Object)kxv.c) && o5j.a((Object)this.d, (Object)kxv.d)) {
                return b2;
            }
        }
        b2 = false;
        return b2;
    }
    
    @Override
    public final int hashCode() {
        return o5j.i((Object)this.a, (Object)this.b, (Object)this.c, (Object)this.d);
    }
}
