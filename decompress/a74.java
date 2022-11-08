import java.util.Iterator;
import java.util.List;
import com.twitter.onboarding.ocf.NavigationHandler;

// 
// Decompiled by Procyon v0.6.0
// 

public final class a74 implements p0e<z64>
{
    public final NavigationHandler a;
    public final qfv b;
    
    public a74(final NavigationHandler a, final qfv b) {
        zzd.f((Object)a, "navigationHandler");
        zzd.f((Object)b, "userManager");
        this.a = a;
        this.b = b;
    }
    
    public final void a(final asr asr) {
        final lsr b = asr.b;
        zzd.e((Object)b, "subtask.properties");
        final b74 b2 = (b74)b;
        final List q = this.b.q();
        zzd.e((Object)q, "userManager.allLoggedInUserInfos");
        boolean b3 = false;
        Label_0097: {
            if (!q.isEmpty()) {
                final Iterator iterator = q.iterator();
                while (iterator.hasNext()) {
                    if (zzd.a((Object)((ocw)iterator.next()).k().getStringId(), (Object)b2.l)) {
                        b3 = true;
                        break Label_0097;
                    }
                }
            }
            b3 = false;
        }
        gvj gvj;
        if (b3) {
            final xrv k = b2.k;
            gvj = new gvj((Object)k.a, (Object)k.b);
        }
        else {
            final xrv j = b2.j;
            gvj = new gvj((Object)j.a, (Object)j.b);
        }
        this.a.e(new xrv((xai)gvj.C0, (String)gvj.D0, (String)null, 28));
    }
    
    public static final class a extends p0e$a<z64>
    {
        public a() {
            super((Class)z64.class);
        }
    }
    
    public static final class b extends p0e$b<z64>
    {
        public b(final a a, final fxe<a74> fxe) {
            zzd.f((Object)a, "matcher");
            zzd.f((Object)fxe, "handler");
            super((p0e$a)a, (fxe)fxe);
        }
    }
}
