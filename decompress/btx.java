import androidx.work.b;

// 
// Decompiled by Procyon v0.6.0
// 

public final class btx implements atx
{
    public final ldn a;
    public final c8a<zsx> b;
    public final btx$b c;
    public final btx$c d;
    
    public btx(final ldn a) {
        this.a = a;
        this.b = new c8a<zsx>(a) {
            @Override
            public final String c() {
                return "INSERT OR REPLACE INTO `WorkProgress` (`work_spec_id`,`progress`) VALUES (?,?)";
            }
            
            @Override
            public final void e(final m0s m0s, final Object o) {
                final zsx zsx = (zsx)o;
                final String a = zsx.a;
                if (a == null) {
                    ((j0s)m0s).c3(1);
                }
                else {
                    ((j0s)m0s).Y1(1, a);
                }
                final byte[] f = b.f(zsx.b);
                if (f == null) {
                    ((j0s)m0s).c3(2);
                }
                else {
                    ((j0s)m0s).D2(2, f);
                }
            }
        };
        this.c = new vyp(a) {
            @Override
            public final String c() {
                return "DELETE from WorkProgress where work_spec_id=?";
            }
        };
        this.d = new vyp(a) {
            @Override
            public final String c() {
                return "DELETE FROM WorkProgress";
            }
        };
    }
    
    public final void a(final String s) {
        this.a.b();
        final m0s a = this.c.a();
        if (s == null) {
            ((j0s)a).c3(1);
        }
        else {
            ((j0s)a).Y1(1, s);
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
    
    public final void b(final zsx zsx) {
        this.a.b();
        this.a.c();
        try {
            this.b.f(zsx);
            this.a.q();
        }
        finally {
            this.a.l();
        }
    }
    
    public final void c() {
        this.a.b();
        final m0s a = this.d.a();
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
