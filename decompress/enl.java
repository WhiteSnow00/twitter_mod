import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class enl
{
    public static final a Companion;
    public final uiw a;
    public y0k b;
    public g0r c;
    public g0r d;
    public g0r e;
    public g0r f;
    
    static {
        Companion = new a();
    }
    
    public enl(final uiw a) {
        czd.f((Object)a, "tracer");
        this.a = a;
    }
    
    public static final enl a() {
        return enl.Companion.a();
    }
    
    public final void b() {
        final y0k c = uiw.c(this.a, "pull-to-refresh-home", (vvt$b)null, 2, 30);
        this.b = c;
        this.c = (g0r)uiw.a(this.a, "network-request", c);
        this.d = (g0r)uiw.a(this.a, "process-response", this.b);
        this.e = (g0r)uiw.a(this.a, "hydration", this.b);
        this.f = (g0r)uiw.a(this.a, "rendering", this.b);
    }
    
    public final void c(final int n) {
        monitorenter(this);
        Label_0244: {
            Label_0239: {
                Label_0207: {
                    Label_0190: {
                        Label_0173: {
                            Label_0156: {
                                Label_0139: {
                                    Label_0122: {
                                        Label_0105: {
                                            try {
                                                da8.m(n, "event");
                                                if (n == 0) {
                                                    throw null;
                                                }
                                                switch (n - 1) {
                                                    default: {
                                                        break Label_0239;
                                                    }
                                                    case 8: {
                                                        this.d(oir.H0);
                                                        break Label_0239;
                                                    }
                                                    case 7: {
                                                        break;
                                                    }
                                                    case 6: {
                                                        break Label_0105;
                                                    }
                                                    case 5: {
                                                        break Label_0122;
                                                    }
                                                    case 4: {
                                                        break Label_0139;
                                                    }
                                                    case 3: {
                                                        break Label_0156;
                                                    }
                                                    case 2: {
                                                        break Label_0173;
                                                    }
                                                    case 1: {
                                                        break Label_0190;
                                                    }
                                                    case 0: {
                                                        break Label_0207;
                                                    }
                                                }
                                            }
                                            finally {
                                                break Label_0244;
                                            }
                                            final g0r f = this.f;
                                            if (f != null) {
                                                f.stop();
                                            }
                                            this.d(oir.F0);
                                            break Label_0239;
                                        }
                                        final g0r f2 = this.f;
                                        if (f2 != null) {
                                            f2.start();
                                        }
                                        break Label_0239;
                                    }
                                    final g0r e = this.e;
                                    if (e != null) {
                                        e.stop();
                                    }
                                    break Label_0239;
                                }
                                final g0r e2 = this.e;
                                if (e2 != null) {
                                    e2.start();
                                }
                                break Label_0239;
                            }
                            final g0r d = this.d;
                            if (d != null) {
                                d.stop();
                            }
                            break Label_0239;
                        }
                        final g0r d2 = this.d;
                        if (d2 != null) {
                            d2.start();
                        }
                        break Label_0239;
                    }
                    final g0r c = this.c;
                    if (c != null) {
                        c.stop();
                    }
                    break Label_0239;
                }
                this.b();
                final y0k b = this.b;
                if (b != null) {
                    b.start();
                }
                final g0r c2 = this.c;
                if (c2 != null) {
                    c2.start();
                }
            }
            monitorexit(this);
            return;
        }
        monitorexit(this);
    }
    
    public final void d(final oir oir) {
        synchronized (this) {
            final y0k b = this.b;
            if (b != null) {
                ((z0k)b.a).U(oir);
            }
            this.b = null;
            this.c = null;
            this.d = null;
            this.f = null;
        }
    }
    
    public static final class a
    {
        public final enl a() {
            Objects.requireNonNull(tmc.Companion);
            return ((tmc)nfw.Companion.a().c((Class)tmc.class)).z0();
        }
    }
}
