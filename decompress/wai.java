import android.os.Parcelable;
import com.twitter.onboarding.ocf.common.OcfModalPlaceholderActivity;
import android.content.Intent;

// 
// Decompiled by Procyon v0.6.0
// 

public final class wai
{
    public final hai a;
    public final bra<fbs, Intent> b;
    public final mbi<?> c;
    public final c5w d;
    public final nej e;
    public final Intent f;
    
    public wai(final hai a, final bra<fbs, Intent> b, final mbi<?> c, final c5w d, final nej e, final Intent f) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }
    
    public final uai a(final fbs fbs, final boolean b) {
        final Intent setFlags = this.f.setFlags(603979776);
        if (b && setFlags.getComponent().getClassName().equals(OcfModalPlaceholderActivity.class.getName())) {
            setFlags.putExtra("extra_is_exit_flow_failure", true);
        }
        final asr h = fbs.h;
        if (h instanceof m4a) {
            final udj udj = new udj(((o4a)((asr)h).b).j);
            if (setFlags != null) {
                setFlags.putExtra("extra_result", tkp.e((Object)udj, (alp)udj.b));
            }
        }
        return (uai)new m6r(setFlags, true);
    }
    
    public final uai b(final String s, final boolean b) {
        return (uai)new wlo((Runnable)new vai(this, b, s));
    }
    
    public final uai c(final fbs fbs) {
        final Intent intent = (Intent)this.b.a((Object)fbs);
        this.d(intent, fbs);
        return (uai)new m6r(intent, false);
    }
    
    public final void d(final Intent intent, final fbs fbs) {
        yvj.c(intent, "extra_task_context", (Object)fbs, (alp)fbs.j);
        intent.putExtra("extra_original_intent", (Parcelable)this.f);
    }
}
