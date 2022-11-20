import com.twitter.analytics.ondevicemetrics.OnDeviceMetricsSchema;

// 
// Decompiled by Procyon v0.6.0
// 

public final class pxb
{
    public final amq<mxb.c> a;
    public final cmq<mxb$b$a> b;
    
    public pxb(final uhj uhj) {
        czd.f((Object)uhj, "dbHelper");
        final amq c = ((ulq)((two)((np1)uhj).T()).f((Class)mxb.class)).c();
        czd.e((Object)c, "dbHelper.schema.getSourc\u2026::class.java).getReader()");
        final cmq b = ((two)((np1)uhj).T()).b((Class)mxb.b.class);
        czd.e((Object)b, "dbHelper.schema.getSourc\u2026ntriesWriter::class.java)");
        this.a = (amq<mxb.c>)c;
        this.b = (cmq<mxb$b$a>)b;
    }
    
    public final void a(final rhj rhj) {
        final f60 c = this.b.c();
        czd.e((Object)c, "writer.rowWriter");
        ((mxb$b$a)c.a).a(rhj.a);
        ((mxb$b$a)c.a).b(rhj.c);
        ((mxb$b$a)c.a).c(rhj.d);
        ((mxb$b$a)c.a).d(rhj.b);
        ((mxb$b$a)c.a).e(Math.pow(rhj.b, 2));
        ((mxb$b$a)c.a).s(1);
        c.b();
    }
    
    public final void b(final y0m<mxb.c> y0m, final rhj rhj) {
        final f60 c = this.b.c();
        czd.e((Object)c, "writer.rowWriter");
        int count = ((mxb.c)y0m.a()).getCount();
        final double b = rhj.b;
        ((mxb$b$a)c.a).c(Math.max(rhj.d, ((mxb.c)y0m.a()).N2()));
        final mxb$b$a mxb$b$a = (mxb$b$a)c.a;
        final double mean = ((mxb.c)y0m.a()).getMean();
        final double n = count;
        final double n2 = ++count;
        mxb$b$a.d((mean * n + b) / n2);
        ((mxb$b$a)c.a).e((Math.pow(b, 2) + ((mxb.c)y0m.a()).C0() * n) / n2);
        ((mxb$b$a)c.a).s(count);
        c.f(itl.c("_id"), new Object[] { ((x9s$b)y0m.a()).f0() });
    }
}
