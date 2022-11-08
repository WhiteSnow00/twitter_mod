import java.util.Objects;
import android.content.Context;
import java.io.File;

// 
// Decompiled by Procyon v0.6.0
// 

public final class xz8
{
    public final int a;
    public final String b;
    public final lyr<File> c;
    public final long d;
    public final long e;
    public final long f;
    public final bh8 g;
    public final cli h;
    public final dli i;
    public final ili j;
    public final Context k;
    
    public xz8(final b b) {
        final Context g = b.g;
        this.k = g;
        ri4.x(b.b != null || g != null, (Object)"Either a non-null context or a base directory path or supplier must be provided.");
        if (b.b == null && g != null) {
            b.b = (lyr<File>)new xz8$a(this);
        }
        this.a = 1;
        final String a = b.a;
        Objects.requireNonNull(a);
        this.b = a;
        final lyr<File> b2 = b.b;
        Objects.requireNonNull(b2);
        this.c = b2;
        this.d = b.c;
        this.e = b.d;
        this.f = b.e;
        final bh8 f = b.f;
        Objects.requireNonNull(f);
        this.g = f;
        synchronized (cli.class) {
            if (cli.C0 == null) {
                cli.C0 = new cli();
            }
            final cli c0 = cli.C0;
            monitorexit(cli.class);
            this.h = c0;
            synchronized (dli.class) {
                if (dli.C0 == null) {
                    dli.C0 = new dli();
                }
                final dli c2 = dli.C0;
                monitorexit(dli.class);
                this.i = c2;
                synchronized (ili.class) {
                    if (ili.C0 == null) {
                        ili.C0 = new ili();
                    }
                    final ili c3 = ili.C0;
                    monitorexit(ili.class);
                    this.j = c3;
                }
            }
        }
    }
    
    public static final class b
    {
        public String a;
        public lyr<File> b;
        public long c;
        public long d;
        public long e;
        public bh8 f;
        public final Context g;
        
        public b(final Context g) {
            this.a = "image_cache";
            this.c = 41943040L;
            this.d = 10485760L;
            this.e = 2097152L;
            this.f = new bh8();
            this.g = g;
        }
    }
}
