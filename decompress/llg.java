import java.util.LinkedHashSet;
import java.util.Set;
import java.io.File;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import android.os.RemoteException;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import android.content.Context;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class llg implements a5j, btl, iiy, lky, wzt
{
    public static boolean F0;
    public static final llg G0;
    public static final llg H0;
    
    static {
        G0 = new llg();
        H0 = new llg();
    }
    
    public static Object a(final crz crz) throws ExecutionException, InterruptedException {
        Objects.requireNonNull(crz, "Task must not be null");
        Object o = crz.a;
        synchronized (o) {
            final boolean c = crz.c;
            monitorexit(o);
            if (c) {
                return j(crz);
            }
            final guz guz = new guz();
            o = zcs.b;
            crz.b.b((n7z)new b3z((Executor)o, (nkj<? super Object>)guz));
            crz.e();
            crz.b.b((n7z)new lty((Executor)o, (xij)guz));
            crz.e();
            guz.F0.await();
            return j(crz);
        }
    }
    
    public static kse b(int n) {
        if (n == 0) {
            throw null;
        }
        if (--n == 0) {
            return kse.G0;
        }
        switch (n) {
            default: {
                return new kse(1000.0);
            }
            case 16: {
                return new kse(10000.0);
            }
            case 15: {
                return new kse(1000.0);
            }
            case 14: {
                return new kse(10000.0);
            }
            case 13: {
                return new kse(5000.0);
            }
            case 12: {
                return new kse(25.0);
            }
            case 11: {
                return new kse(700.0);
            }
            case 10: {
                return new kse(1000.0);
            }
            case 9: {
                return new kse(2000.0);
            }
            case 8: {
                return new kse(50.0);
            }
            case 7: {
                return new kse(600.0);
            }
            case 6: {
                return new kse(400.0);
            }
            case 5: {
                return new kse(14.0);
            }
            case 4: {
                return new kse(400.0);
            }
            case 3: {
                return new kse(50.0);
            }
            case 2: {
                return new kse(100.0);
            }
        }
    }
    
    public static kse c(int n) {
        if (n == 0) {
            throw null;
        }
        if (--n != 0) {
            if (n != 18) {
                switch (n) {
                    default: {
                        return new kse(500.0);
                    }
                    case 15: {
                        return new kse(1000.0);
                    }
                    case 13: {
                        return new kse(600.0);
                    }
                    case 12: {
                        return new kse(15.0);
                    }
                    case 11: {
                        return new kse(500.0);
                    }
                    case 10: {
                        return new kse(500.0);
                    }
                    case 9: {
                        return new kse(300.0);
                    }
                    case 8: {
                        return new kse(50.0);
                    }
                    case 7: {
                        return new kse(500.0);
                    }
                    case 6: {
                        return new kse(50.0);
                    }
                    case 5: {
                        return new kse(14.0);
                    }
                    case 4: {
                        return new kse(128.0);
                    }
                    case 3: {
                        return new kse(50.0);
                    }
                    case 2: {
                        return new kse(25.0);
                    }
                    case 14:
                    case 16: {
                        break;
                    }
                }
            }
            return new kse(10000.0);
        }
        return kse.G0;
    }
    
    public static int f(final Context context) {
        synchronized (llg.class) {
            iuk.D((Object)context, (Object)"Context is null");
            if (llg.F0) {
                return 0;
            }
            try {
                final uxy b = wny.b(context);
                try {
                    final t2d f = b.f();
                    Objects.requireNonNull(f, "null reference");
                    iuk.K0 = f;
                    final nyy i = b.i();
                    if (vq9.I0 == null) {
                        Objects.requireNonNull(i, "null reference");
                        vq9.I0 = i;
                    }
                    llg.F0 = true;
                    return 0;
                }
                catch (final RemoteException ex) {
                    throw new RuntimeRemoteException(ex);
                }
            }
            catch (final GooglePlayServicesNotAvailableException ex2) {
                return ex2.F0;
            }
        }
    }
    
    public static crz h(final Exception ex) {
        final crz crz = new crz();
        crz.c(ex);
        return crz;
    }
    
    public static crz i(final Object o) {
        final crz crz = new crz();
        crz.d(o);
        return crz;
    }
    
    public static Object j(final crz crz) throws ExecutionException {
        if (crz.b()) {
            return crz.a();
        }
        synchronized (crz.a) {
            final Exception e = crz.e;
            monitorexit(crz.a);
            throw new ExecutionException(e);
        }
    }
    
    public Object apply(final Object o) {
        return o;
    }
    
    public boolean d(final ClassLoader classLoader, final File file, final File file2, final boolean b) {
        return kny.l(classLoader, file, file2, b, (qky)new iwl(), "zip", (lky)new qsz());
    }
    
    public boolean e(final Object o, final File file, final File file2) {
        return true;
    }
    
    public zsl$a g(final Object o) {
        final long longValue = ((Number)o).longValue();
        final zsl$a zsl$a = new zsl$a();
        ((lp1$a)zsl$a).s(ttl.b("entry_id", (Object)longValue));
        return zsl$a;
    }
    
    public void k(final ClassLoader classLoader, final Set set) {
        kny.j(classLoader, set);
    }
    
    public Object l() {
        return new LinkedHashSet();
    }
}
