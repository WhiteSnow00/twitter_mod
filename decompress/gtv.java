// 
// Decompiled by Procyon v0.6.0
// 

public final class gtv
{
    public final int a;
    public a b;
    public a c;
    public int d;
    public Long e;
    public boolean f;
    
    public gtv() {
        this.a = 100000;
    }
    
    public gtv(final int n, final int n2, final rf8 rf8) {
        this.a = 100000;
    }
    
    public final void a(final ais b) {
        czd.f((Object)b, "value");
        this.f = false;
        final a b2 = this.b;
        ais b3;
        if (b2 != null) {
            b3 = b2.b;
        }
        else {
            b3 = null;
        }
        if (czd.a((Object)b, (Object)b3)) {
            return;
        }
        final String d0 = b.a.D0;
        final a b4 = this.b;
        String d2 = null;
        Label_0079: {
            if (b4 != null) {
                final ais b5 = b4.b;
                if (b5 != null) {
                    d2 = b5.a.D0;
                    break Label_0079;
                }
            }
            d2 = null;
        }
        if (czd.a((Object)d0, (Object)d2)) {
            final a b6 = this.b;
            if (b6 != null) {
                b6.b = b;
            }
            return;
        }
        this.b = new a(this.b, b);
        this.c = null;
        if ((this.d += b.a.D0.length()) > this.a) {
            a a = this.b;
            a a2;
            if (a != null) {
                a2 = a.a;
            }
            else {
                a2 = null;
            }
            if (a2 != null) {
                while (true) {
                    a a4 = null;
                    Label_0207: {
                        if (a != null) {
                            final a a3 = a.a;
                            if (a3 != null) {
                                a4 = a3.a;
                                break Label_0207;
                            }
                        }
                        a4 = null;
                    }
                    if (a4 == null) {
                        break;
                    }
                    a = a.a;
                }
                if (a != null) {
                    a.a = null;
                }
            }
        }
    }
    
    public static final class a
    {
        public a a;
        public ais b;
        
        public a(final a a, final ais b) {
            czd.f((Object)b, "value");
            this.a = a;
            this.b = b;
        }
    }
}
