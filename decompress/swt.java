import java.util.concurrent.TimeUnit;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class swt<ResponseType, RequestType>
{
    public final ar0 a;
    public final trc b;
    public final String c;
    public final gwo d;
    public volatile boolean e;
    public volatile RequestType f;
    public final w19 g;
    
    public swt(final ar0 a, final trc b, final String c, final gwo d) {
        czd.f((Object)a, "applicationManager");
        czd.f((Object)b, "requestController");
        czd.f((Object)d, "ioScheduler");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = true;
        this.g = new w19();
    }
    
    public abstract void a();
    
    public abstract RequestType b();
    
    public abstract long c();
    
    public abstract boolean d();
    
    public abstract boolean e();
    
    public boolean f() {
        return this.f != null;
    }
    
    public final void g(final d2v<?> d2v) {
        czd.f((Object)d2v, "request");
        if (d2v != this.f) {
            return;
        }
        Label_0074: {
            if (((wv0)d2v).O()) {
                final xrc t = ((orc)d2v).T();
                czd.d((Object)t, "null cannot be cast to non-null type com.twitter.async.http.HttpRequestResult<ResponseType of com.twitter.network.traffic.TrafficClient, com.twitter.api.common.TwitterErrors>");
                final boolean b = t.b;
                if (b) {
                    final Object g = t.g;
                    if (g != null) {
                        this.m((ResponseType)g);
                        break Label_0074;
                    }
                }
                if (!b && !this.d()) {
                    this.a();
                }
            }
        }
        this.f = null;
        this.i();
    }
    
    public void h() {
        synchronized (this) {
            final boolean l = this.l();
            boolean b = true;
            boolean b2 = false;
            if (l) {
                if (this.e && this.k()) {
                    this.f = this.b();
                }
                else {
                    b = false;
                    b2 = true;
                }
            }
            else {
                b = false;
            }
            monitorexit(this);
            if (b) {
                final trc b3 = this.b;
                final RequestType f = this.f;
                final int a = c5j.a;
                czd.e((Object)f, "cast(pendingRequest)");
                b3.f((orc)f);
            }
            else if (b2) {
                this.i();
            }
        }
    }
    
    public final void i() {
        synchronized (this) {
            if (this.f()) {
                return;
            }
            monitorexit(this);
            synchronized (this.g) {
                if (this.e && this.e() && !this.g.b()) {
                    final long c = this.c();
                    final String c2 = this.c;
                    final StringBuilder sb = new StringBuilder();
                    sb.append("Scheduling a ");
                    sb.append(c2);
                    sb.append(" refresh in (ms): ");
                    sb.append(c);
                    czd.f((Object)sb.toString(), "data");
                    this.g.c(h5j.just((Object)this.c).delay(c, TimeUnit.MILLISECONDS).subscribeOn(owo.a()).subscribe((lj6)new s05((qsb)new swt$a(this), 21)));
                }
            }
        }
    }
    
    public void j() {
        this.a.b().i().observeOn(this.d).subscribe((lj6)new ub6((qsb)new swt$b(this), 27));
    }
    
    public abstract boolean k();
    
    public boolean l() {
        return this.e() && this.f == null;
    }
    
    public abstract void m(final ResponseType p0);
}
