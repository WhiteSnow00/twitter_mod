import java.util.ArrayList;
import java.util.Map;
import android.net.Uri;
import java.lang.reflect.Constructor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.Collections;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class wh8 implements xoa
{
    public static final int[] G0;
    public static final a H0;
    public int F0;
    
    static {
        G0 = new int[] { 5, 4, 12, 8, 3, 10, 9, 11, 6, 2, 0, 1, 7, 14 };
        H0 = new a();
    }
    
    public final void a(final int n, final List<qoa> list) {
        switch (n) {
            default: {
                goto Label_0549;
            }
            case 14: {
                list.add((qoa)new qce());
                goto Label_0549;
            }
            case 12: {
                list.add((qoa)new ujx());
                goto Label_0549;
            }
            case 11: {
                list.add((qoa)new jbu(1, new tat(0L), (kbu$c)new kl8()));
                goto Label_0549;
            }
            case 10: {
                list.add((qoa)new hnl());
                goto Label_0549;
            }
            case 9: {
                list.add((qoa)new qgj());
                goto Label_0549;
            }
            case 8: {
                list.add((qoa)new bqb(0, (tat)null, (List)Collections.emptyList()));
                list.add((qoa)new gsh(this.F0));
                goto Label_0549;
            }
            case 7: {
                list.add((qoa)new fsh(-9223372036854775807L));
                goto Label_0549;
            }
            case 6: {
                list.add((qoa)new wog());
                goto Label_0549;
            }
            case 5: {
                list.add((qoa)new ecb());
                goto Label_0549;
            }
            case 4: {
                final a h0 = wh8.H0;
                final AtomicBoolean a = h0.a;
                monitorenter(a);
                try {
                    if (h0.a.get()) {
                        final Constructor<? extends qoa> b = h0.b;
                        monitorexit(a);
                        goto Label_0403;
                    }
                    try {
                        if (Boolean.TRUE.equals(Class.forName("com.google.android.exoplayer2.ext.flac.FlacLibrary").getMethod("isAvailable", (Class<?>[])new Class[0]).invoke(null, new Object[0]))) {
                            h0.b = Class.forName("com.google.android.exoplayer2.ext.flac.FlacExtractor").asSubclass(qoa.class).getConstructor(Integer.TYPE);
                            goto Label_0387;
                        }
                        goto Label_0387;
                    }
                    catch (final Exception ex) {
                        throw new RuntimeException("Error instantiating FLAC extension", ex);
                    }
                    catch (final ClassNotFoundException ex2) {
                        goto Label_0387;
                    }
                    try {
                        final Constructor<? extends qoa> b;
                        final qoa qoa = (qoa)b.newInstance(0);
                        if (qoa != null) {
                            list.add(qoa);
                            goto Label_0549;
                        }
                        list.add((qoa)new g2b());
                        goto Label_0549;
                    }
                    catch (final Exception ex3) {}
                }
                finally {}
                break;
            }
            case 3: {
                goto Label_0482;
                goto Label_0482;
            }
            case 2: {
                goto Label_0500;
                goto Label_0500;
            }
            case 1: {
                goto Label_0518;
                goto Label_0518;
            }
            case 0: {
                goto Label_0535;
                goto Label_0535;
            }
        }
    }
    
    public final qoa[] f(final Uri uri, final Map<String, List<String>> map) {
        synchronized (this) {
            final ArrayList<qoa> list = new ArrayList<qoa>(14);
            final int s = zzz.S((Map)map);
            if (s != -1) {
                this.a(s, list);
            }
            final int t = zzz.T(uri);
            if (t != -1 && t != s) {
                this.a(t, list);
            }
            final int[] g0 = wh8.G0;
            for (int i = 0; i < 14; ++i) {
                final int n = g0[i];
                if (n != s && n != t) {
                    this.a(n, list);
                }
            }
            return list.toArray(new qoa[list.size()]);
        }
    }
    
    public static final class a
    {
        public final AtomicBoolean a;
        public Constructor<? extends qoa> b;
        
        public a() {
            this.a = new AtomicBoolean(false);
        }
    }
}
