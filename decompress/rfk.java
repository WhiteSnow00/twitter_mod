import java.security.KeyStore;
import java.util.Iterator;
import java.util.Set;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.KeyStoreException;
import java.util.Map;
import javax.net.ssl.HostnameVerifier;
import okhttp3.internal.tls.OkHostnameVerifier;
import java.util.Comparator;
import java.security.Provider;
import java.util.Collection;
import java.util.ArrayList;
import java.security.Security;
import java.util.Objects;
import android.content.Context;
import okhttp3.Dns;

// 
// Decompiled by Procyon v0.6.0
// 

public final class rfk extends fsc
{
    public sfk a;
    public u5s b;
    public sfk c;
    
    public rfk() {
        this.a = null;
        this.b = null;
        this.c = null;
    }
    
    public static csc e() {
        return (csc)new sfk(brg.b().w5(), dsc.a(), (Dns)brg.b().k0(), brg.b().w6());
    }
    
    public static ppo f(final Context context, final kei kei) {
        Objects.requireNonNull(f60.Companion);
        final Provider[] providers = Security.getProviders();
        e0e.e((Object)providers, "getProviders()");
        final ArrayList list = new ArrayList();
        for (int length = providers.length, i = 0; i < length; ++i) {
            final Set<Provider.Service> services = providers[i].getServices();
            e0e.e((Object)services, "it.services");
            pr4.j1((Collection)list, (Iterable)services);
        }
        final ArrayList<Provider.Service> list2 = new ArrayList<Provider.Service>();
        for (final Object next : list) {
            if (e0e.a((Object)((Provider.Service)next).getType(), (Object)"SSLContext")) {
                list2.add((Provider.Service)next);
            }
        }
        final ArrayList list3 = new ArrayList<onp>(nr4.d1((Iterable)list2, 10));
        for (final Provider.Service service : list2) {
            e0e.e((Object)service, "it");
            Objects.requireNonNull(onp$b.Companion);
            list3.add(new onp(service));
        }
        Objects.requireNonNull(onp.Companion);
        final onp onp = (onp)rr4.E1(rr4.b2((Iterable)list3, (Comparator)il8.N0));
        if (onp != null) {
            final Provider.Service a = onp.a;
            if (a != null) {
                synchronized (dfv.class) {
                    e0e.f((Object)context, "context");
                    if (dfv.H0 == null) {
                        dfv.H0 = dfv.m(context, 0);
                        afs.a((Class)dfv.class);
                    }
                    final KeyStore h0 = dfv.H0;
                    e0e.c((Object)h0);
                    monitorexit(dfv.class);
                    final OkHostnameVerifier instance = OkHostnameVerifier.INSTANCE;
                    Objects.requireNonNull(f60.Companion);
                    final Provider provider = a.getProvider();
                    final String algorithm = a.getAlgorithm();
                    e0e.e((Object)provider, "provider");
                    e0e.e((Object)algorithm, "protocol");
                    try {
                        final su6 su6 = new su6(h0);
                        final String[] f0 = dfv.F0;
                        po.b().u();
                        final tfk tfk = new tfk(provider, algorithm, su6, f0, 1669173944636L, dfv.G0);
                        final f60 f2 = new f60(provider, algorithm, tfk, (HostnameVerifier)instance);
                        kei.e((kei.a)new kei.a(tfk) {
                            public final tfk a;
                            
                            @Override
                            public final void a(final Map<String, String> map) {
                                if (map != null) {
                                    final String[] g0 = dfv.G0;
                                    for (int i = 0; i < 7; ++i) {
                                        final String s = map.get(g0[i]);
                                        if (s != null) {
                                            final tfk a = this.a;
                                            Objects.requireNonNull(a);
                                            a.a.add(s);
                                        }
                                    }
                                }
                            }
                        });
                        return (ppo)f2;
                    }
                    catch (final KeyStoreException ex) {
                        throw new IllegalStateException(ex);
                    }
                    catch (final NoSuchAlgorithmException ex2) {
                        throw new IllegalStateException(ex2);
                    }
                    catch (final KeyManagementException ex3) {
                        throw new IllegalStateException(ex3);
                    }
                }
            }
        }
        throw new IllegalStateException("No suitable SSLContext implementation found");
    }
    
    public final csc a() {
        synchronized (this) {
            if (this.a == null) {
                this.a = (sfk)e();
            }
            return (csc)this.a;
        }
    }
    
    public final csc b(final fsc$a fsc$a) {
        monitorenter(this);
        Label_0126: {
            Label_0117: {
                Label_0061: {
                    try {
                        final int ordinal = ((Enum)fsc$a).ordinal();
                        if (ordinal == 0) {
                            break Label_0117;
                        }
                        if (ordinal == 1) {
                            break Label_0061;
                        }
                        if (ordinal != 2) {
                            fj1.h("Only known types are handled");
                            monitorexit(this);
                            return null;
                        }
                    }
                    finally {
                        break Label_0126;
                    }
                    if (this.c == null) {
                        this.c = (sfk)e();
                    }
                    final sfk c = this.c;
                    monitorexit(this);
                    return (csc)c;
                }
                if (this.b == null) {
                    this.b = new u5s(brg.b().w5(), dsc.a(), (Dns)brg.b().k0(), brg.b().w6());
                }
                final u5s b = this.b;
                monitorexit(this);
                return (csc)b;
            }
            final csc a = this.a();
            monitorexit(this);
            return a;
        }
        monitorexit(this);
    }
    
    public final void c() {
        synchronized (this) {
            final sfk a = this.a;
            if (a != null) {
                a.f();
            }
            final u5s b = this.b;
            if (b != null) {
                ((vgj)b).f();
            }
            final sfk c = this.c;
            if (c != null) {
                c.f();
            }
        }
    }
    
    public final void d() {
        synchronized (this) {
            final sfk a = this.a;
            if (a != null) {
                a.g();
                this.a = null;
            }
            final sfk c = this.c;
            if (c != null) {
                c.g();
                this.c = null;
            }
            final u5s b = this.b;
            if (b != null) {
                ((vgj)b).g();
                this.b = null;
            }
        }
    }
}
