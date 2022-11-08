import android.net.Uri;
import java.util.Map;
import android.content.Context;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicInteger;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class mdz
{
    public static final Object f;
    public static volatile taz g;
    public static final AtomicInteger h;
    public final edz a;
    public final String b;
    public final Object c;
    public volatile int d = -1;
    public volatile Object e;
    
    static {
        f = new Object();
        new AtomicReference();
        h = new AtomicInteger();
    }
    
    public abstract Object a(final Object p0);
    
    public final Object b() {
        final int value = mdz.h.get();
        if (this.d < value) {
            synchronized (this) {
                if (this.d < value) {
                    final taz g = mdz.g;
                    if (g == null) {
                        throw new IllegalStateException("Must call PhenotypeFlag.init() first");
                    }
                    final edz a = this.a;
                    Objects.requireNonNull(a);
                    final Uri a2 = a.a;
                    final Object o = null;
                    Object o2;
                    if (a2 != null) {
                        if (ecz.a(g.a, this.a.a)) {
                            Objects.requireNonNull(this.a);
                            o2 = ebz.b(g.a.getContentResolver(), this.a.a);
                        }
                        else {
                            o2 = null;
                        }
                    }
                    else {
                        Objects.requireNonNull(this.a);
                        o2 = pdz.b();
                    }
                    Object e = null;
                    Label_0148: {
                        if (o2 != null) {
                            final Object a3 = ((sbz)o2).a(this.c());
                            if (a3 != null) {
                                e = this.a(a3);
                                break Label_0148;
                            }
                        }
                        e = null;
                    }
                    if (e == null) {
                        Object o3 = null;
                        Label_0273: {
                            if (!this.a.b) {
                                o3 = g.a;
                                synchronized (bcz.class) {
                                    if (bcz.c == null) {
                                        bcz c;
                                        if (r9x.e((Context)o3, "com.google.android.providers.gsf.permission.READ_GSERVICES") == 0) {
                                            c = new bcz((Context)o3);
                                        }
                                        else {
                                            c = new bcz();
                                        }
                                        bcz.c = c;
                                    }
                                    o3 = bcz.c;
                                    monitorexit(bcz.class);
                                    String b;
                                    if (this.a.b) {
                                        b = null;
                                    }
                                    else {
                                        b = this.b;
                                    }
                                    final String b2 = ((bcz)o3).b(b);
                                    if (b2 != null) {
                                        o3 = this.a(b2);
                                        break Label_0273;
                                    }
                                }
                            }
                            o3 = null;
                        }
                        e = o3;
                        if (o3 == null) {
                            e = this.c;
                        }
                    }
                    final lez lez = (lez)g.b.a();
                    if (lez.b()) {
                        final lbz lbz = (lbz)lez.a();
                        final Uri a4 = this.a.a;
                        final String b3 = this.b;
                        Objects.requireNonNull(lbz);
                        Object o4 = o;
                        if (a4 != null) {
                            final Map map = lbz.a.get(a4.toString());
                            if (map == null) {
                                o4 = o;
                            }
                            else {
                                o4 = map.get("".concat(String.valueOf(b3)));
                            }
                        }
                        if (o4 == null) {
                            e = this.c;
                        }
                        else {
                            e = this.a(o4);
                        }
                    }
                    this.e = e;
                    this.d = value;
                }
            }
        }
        return this.e;
    }
    
    public final String c() {
        Objects.requireNonNull(this.a);
        return this.b;
    }
}
