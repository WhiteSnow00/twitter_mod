import java.io.IOException;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dwv
{
    public static final alp<dwv> e;
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    
    static {
        dwv.e = new dwv.dwv$b();
    }
    
    public dwv(final a a) {
        this.a = a.a;
        this.b = a.b;
        this.c = a.c;
        this.d = a.d;
    }
    
    public final void a(final tfe tfe) throws IOException {
        tfe.r0();
        final int a = this.a;
        if (a != -1) {
            tfe.T("current_media_index", a);
        }
        final int b = this.b;
        if (b != -1) {
            tfe.T("previous_media_index", b);
        }
        final int c = this.c;
        if (c != -1) {
            tfe.T("current_slide_index", c);
        }
        final int d = this.d;
        if (d != -1) {
            tfe.T("previous_slide_index", d);
        }
        tfe.h();
    }
    
    @Override
    public final boolean equals(final Object o) {
        final boolean b = o instanceof dwv;
        boolean b2 = true;
        if (b) {
            final dwv dwv = (dwv)o;
            if (w4j.a((Object)this.a, (Object)dwv.a) && w4j.a((Object)this.b, (Object)dwv.b) && w4j.a((Object)this.c, (Object)dwv.c) && w4j.a((Object)this.d, (Object)dwv.d)) {
                return b2;
            }
        }
        b2 = false;
        return b2;
    }
    
    @Override
    public final int hashCode() {
        return w4j.i((Object)this.a, (Object)this.b, (Object)this.c, (Object)this.d);
    }
    
    public static final class a extends h4j<dwv>
    {
        public int a;
        public int b;
        public int c;
        public int d;
        
        public a() {
            this.a = -1;
            this.b = -1;
            this.c = -1;
            this.d = -1;
        }
        
        public final Object i() {
            return new dwv(this);
        }
    }
}
