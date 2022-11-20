import java.util.Objects;
import java.util.concurrent.TimeUnit;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ipm
{
    public static final long d;
    public static final long e;
    public final knw a;
    public long b;
    public int c;
    
    static {
        d = TimeUnit.HOURS.toMillis(24L);
        e = TimeUnit.MINUTES.toMillis(30L);
    }
    
    public ipm() {
        this.a = knw.c();
    }
    
    public final boolean a() {
        synchronized (this) {
            return this.c == 0 || this.a.a() > this.b;
        }
    }
    
    public final void b(final int n) {
        monitorenter(this);
        final boolean b = false;
        Label_0069: {
            if ((n < 200 || n >= 300) && n != 401 && n != 404) {
                break Label_0069;
            }
            try {
                synchronized (this) {
                    this.c = 0;
                    return;
                }
                ++this.c;
                monitorenter(this);
                int n2 = 0;
                Label_0113: {
                    if (n != 429) {
                        n2 = (b ? 1 : 0);
                        if (n < 500) {
                            break Label_0113;
                        }
                        n2 = (b ? 1 : 0);
                        if (n >= 600) {
                            break Label_0113;
                        }
                    }
                    n2 = 1;
                }
                long d = 0L;
                Label_0178: {
                    Label_0133: {
                        if (n2 == 0) {
                            Label_0195: {
                                try {
                                    d = ipm.d;
                                    monitorexit(this);
                                    break Label_0178;
                                }
                                finally {
                                    break Label_0195;
                                }
                                break Label_0133;
                            }
                            monitorexit(this);
                        }
                    }
                    final double pow = Math.pow(2.0, this.c);
                    Objects.requireNonNull(this.a);
                    d = (long)Math.min(pow + (long)(Math.random() * 1000.0), (double)ipm.e);
                    monitorexit(this);
                }
                this.b = this.a.a() + d;
            }
            finally {
                monitorexit(this);
            }
        }
    }
}
