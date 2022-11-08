import android.view.Choreographer;
import android.view.Choreographer$FrameCallback;
import android.os.SystemClock;
import java.util.ArrayList;

// 
// Decompiled by Procyon v0.6.0
// 

public final class pb0
{
    public static final ThreadLocal<pb0> g;
    public final l7q<b, Long> a;
    public final ArrayList<b> b;
    public final a c;
    public d d;
    public long e;
    public boolean f;
    
    static {
        g = new ThreadLocal<pb0>();
    }
    
    public pb0() {
        this.a = (l7q<b, Long>)new l7q();
        this.b = new ArrayList<b>();
        this.c = new a();
        this.e = 0L;
        this.f = false;
    }
    
    public static pb0 a() {
        final ThreadLocal<pb0> g = pb0.g;
        if (g.get() == null) {
            g.set(new pb0());
        }
        return g.get();
    }
    
    public final class a
    {
        public final void a() {
            pb0.this.e = SystemClock.uptimeMillis();
            final pb0 a = pb0.this;
            final long e = a.e;
            final long uptimeMillis = SystemClock.uptimeMillis();
            for (int i = 0; i < a.b.size(); ++i) {
                final b b = a.b.get(i);
                if (b != null) {
                    final Long n = (Long)a.a.getOrDefault((Object)b, (Object)null);
                    boolean b2 = false;
                    Label_0115: {
                        if (n != null) {
                            if (n >= uptimeMillis) {
                                b2 = false;
                                break Label_0115;
                            }
                            a.a.remove((Object)b);
                        }
                        b2 = true;
                    }
                    if (b2) {
                        b.a(e);
                    }
                }
            }
            if (a.f) {
                int size = a.b.size();
                while (true) {
                    final int n2 = size - 1;
                    if (n2 < 0) {
                        break;
                    }
                    size = n2;
                    if (a.b.get(n2) != null) {
                        continue;
                    }
                    a.b.remove(n2);
                    size = n2;
                }
                a.f = false;
            }
            if (pb0.this.b.size() > 0) {
                final pb0 a2 = pb0.this;
                if (a2.d == null) {
                    a2.d = new d(a2.c);
                }
                final d d = a2.d;
                d.b.postFrameCallback((Choreographer$FrameCallback)d.c);
            }
        }
    }
    
    public interface b
    {
        boolean a(final long p0);
    }
    
    public abstract static class c
    {
        public final a a;
        
        public c(final a a) {
            this.a = a;
        }
    }
    
    public static final class d extends c
    {
        public final Choreographer b;
        public final pb0$d$a c;
        
        public d(final a a) {
            super(a);
            this.b = Choreographer.getInstance();
            this.c = new Choreographer$FrameCallback() {
                public final void doFrame(final long n) {
                    d.this.a.a();
                }
            };
        }
    }
}
