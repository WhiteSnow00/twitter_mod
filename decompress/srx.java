// 
// Decompiled by Procyon v0.6.0
// 

public final class srx implements rrx
{
    public final gcn a;
    public final o7a<qrx> b;
    public final srx$b c;
    public final srx$c d;
    
    public srx(final gcn a) {
        this.a = a;
        this.b = new srx$a(a);
        this.c = new hxp(a) {
            @Override
            public final String c() {
                return "DELETE from WorkProgress where work_spec_id=?";
            }
        };
        this.d = new hxp(a) {
            @Override
            public final String c() {
                return "DELETE FROM WorkProgress";
            }
        };
    }
    
    public final void a(final String s) {
        this.a.b();
        final yyr a = this.c.a();
        if (s == null) {
            ((vyr)a).c3(1);
        }
        else {
            ((vyr)a).Y1(1, s);
        }
        this.a.c();
        try {
            a.j0();
            this.a.q();
        }
        finally {
            this.a.l();
            this.c.d(a);
        }
    }
    
    public final void b(final qrx qrx) {
        this.a.b();
        this.a.c();
        try {
            ((o7a)this.b).f((Object)qrx);
            this.a.q();
        }
        finally {
            this.a.l();
        }
    }
    
    public final void c() {
        this.a.b();
        final yyr a = this.d.a();
        this.a.c();
        try {
            a.j0();
            this.a.q();
        }
        finally {
            this.a.l();
            this.d.d(a);
        }
    }
}
