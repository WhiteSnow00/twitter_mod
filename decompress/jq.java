import java.util.concurrent.atomic.AtomicInteger;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jq implements iq
{
    public static final jq.jq$a Companion;
    public final qbu a;
    public final AtomicInteger b;
    public final boolean c;
    
    static {
        Companion = new jq.jq$a();
    }
    
    public jq(final qbu a, final fmv fmv) {
        czd.f((Object)a, "preferences");
        czd.f((Object)fmv, "featureConfigProvider");
        this.a = a;
        this.b = new AtomicInteger(a.g("adid_bridging_state", -1));
        this.c = fmv.b("aaid_reset_prompt_enabled", false);
    }
    
    public final boolean a(final lq lq) {
        final boolean c = this.c;
        boolean b = false;
        if (!c) {
            return b;
        }
        synchronized (np.class) {
            lq lq2 = np.a;
            if (lq2 == null) {
                lq2 = np.b();
            }
            monitorexit(np.class);
            boolean b2 = false;
            Label_0075: {
                if (lq2 != null) {
                    final String a = lq2.a;
                    if (a != null && (vkr.V((CharSequence)a) ^ true)) {
                        b2 = true;
                        break Label_0075;
                    }
                }
                b2 = false;
            }
            boolean b4 = false;
            Label_0145: {
                if (b2) {
                    boolean b3 = false;
                    Label_0112: {
                        if (lq != null) {
                            final String a2 = lq.a;
                            if (a2 != null && (vkr.V((CharSequence)a2) ^ true)) {
                                b3 = true;
                                break Label_0112;
                            }
                        }
                        b3 = false;
                    }
                    if (b3 && !lq.b && !czd.a((Object)lq2.a, (Object)lq.a)) {
                        b4 = true;
                        break Label_0145;
                    }
                }
                b4 = false;
            }
            if (b4) {
                np.d(lq);
                this.b.set(1);
                final qbu$c i = this.a.i();
                ((qbu$d)i).g("adid_bridging_state", 1);
                i.e();
            }
            else if (!this.d()) {
                return b;
            }
            b = true;
            return b;
        }
    }
    
    public final boolean b() {
        final int value = this.b.get();
        boolean b = true;
        if (value != 1) {
            b = false;
        }
        return b;
    }
    
    public final lq c() {
        synchronized (np.class) {
            lq lq = np.a;
            if (lq == null) {
                lq = np.b();
            }
            return lq;
        }
    }
    
    public final boolean d() {
        final boolean c = this.c;
        boolean b = false;
        if (!c) {
            return false;
        }
        final int value = this.b.get();
        if (value == 0 || value == 1) {
            b = true;
        }
        return b;
    }
    
    public final void e() {
        this.b.set(0);
        final qbu$c i = this.a.i();
        ((qbu$d)i).g("adid_bridging_state", 0);
        i.e();
    }
}
