import java.util.concurrent.TimeUnit;
import j$.util.concurrent.ConcurrentHashMap;
import okhttp3.Dns;
import java.net.InetAddress;
import java.util.List;
import java.util.concurrent.ConcurrentMap;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class d59 extends k59
{
    public final long b;
    public final bxo c;
    public final znl<vzv> d;
    public final ConcurrentMap<String, List<InetAddress>> e;
    
    public d59(final Dns dns, final long b, final bxo c) {
        e0e.f((Object)dns, "systemDns");
        e0e.f((Object)c, "ioScheduler");
        super(dns);
        this.b = b;
        this.c = c;
        this.d = (znl<vzv>)new znl();
        this.e = new ConcurrentHashMap();
    }
    
    @Override
    public final void a(final String s, final List<? extends InetAddress> list) {
        e0e.f((Object)s, "hostname");
        this.e.putIfAbsent((Object)s, (Object)list);
        this.d.onNext((Object)vzv.a);
    }
    
    public final t5j<ConcurrentMap<String, List<InetAddress>>> c() {
        final t5j observeOn = ((t5j)this.d).throttleLast(this.b, TimeUnit.SECONDS).map((rtb)new qe5((stb)new d59$a(this), 21)).subscribeOn(this.c).observeOn(this.c);
        e0e.e((Object)observeOn, "protected fun start(): O\u2026erveOn(ioScheduler)\n    }");
        return (t5j<ConcurrentMap<String, List<InetAddress>>>)observeOn;
    }
}
