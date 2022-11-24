import java.util.concurrent.atomic.AtomicLong;
import org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;
import tv.periscope.model.b;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.List;
import j$.util.concurrent.ConcurrentHashMap;
import android.os.Build$VERSION;

// 
// Decompiled by Procyon v0.6.0
// 

public class zhk implements xnx, w3z, dsy, h6, tl6
{
    public Object F0;
    
    public zhk(final int n) {
        if (n != 9) {
            Object f0;
            if (Build$VERSION.SDK_INT >= 28) {
                f0 = new ejk();
            }
            else {
                f0 = new bs4();
            }
            this.F0 = f0;
            return;
        }
        this.F0 = new ConcurrentHashMap();
    }
    
    public zhk(final Object f0) {
        this.F0 = f0;
    }
    
    public zhk(final t10 f0) {
        e0e.f((Object)f0, "applicationManager");
        this.F0 = f0;
    }
    
    public final /* bridge */ Object a() {
        return new ezy(((xzz)this.F0).b());
    }
    
    public final void b(final boolean b, final btc btc) {
        this.i(b, btc);
    }
    
    public final void c(final List list) {
        for (final Object next : list) {
            synchronized (this) {
                final AtomicInteger atomicInteger = ((Map)this.F0).get(next);
                if (atomicInteger != null) {
                    atomicInteger.getAndIncrement();
                }
                else {
                    ((Map)this.F0).put(next, new AtomicInteger(1));
                }
                continue;
            }
            break;
        }
    }
    
    public final String d() {
        String i;
        if ((i = ((b)this.F0).I()) == null) {
            i = "";
        }
        return i;
    }
    
    public final String[] e() {
        return ((WebViewProviderFactoryBoundaryInterface)this.F0).getSupportedFeatures();
    }
    
    public final void f(final String s, final int n, final Throwable t, final byte[] array, final Map map) {
        ((opz)this.F0).l(s, n, t, array, map);
    }
    
    public final c3 g() {
        return an2.b((b)this.F0);
    }
    
    public final WebkitToCompatConverterBoundaryInterface getWebkitToCompatConverter() {
        return (WebkitToCompatConverterBoundaryInterface)jb2.B((Class)WebkitToCompatConverterBoundaryInterface.class, ((WebViewProviderFactoryBoundaryInterface)this.F0).getWebkitToCompatConverter());
    }
    
    public final void h(final List list) {
        for (final Object next : list) {
            synchronized (this) {
                final AtomicInteger atomicInteger = ((Map)this.F0).get(next);
                if (atomicInteger == null || atomicInteger.getAndDecrement() > 1) {
                    continue;
                }
                ((Map)this.F0).remove(next);
                continue;
            }
            break;
        }
    }
    
    public void i(final boolean b, final btc btc) {
        if (!b && btc != null) {
            final int a = btc.a;
            if (a == 401) {
                ((AtomicLong)((f63)this.F0).F0).incrementAndGet();
            }
            else if (a == 0) {
                ((AtomicLong)((f63)this.F0).G0).incrementAndGet();
            }
        }
    }
}
