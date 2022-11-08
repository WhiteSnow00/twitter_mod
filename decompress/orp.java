import android.os.BaseBundle;
import android.os.Bundle;
import java.util.List;
import java.util.Collections;
import android.app.Activity;
import android.content.Context;
import com.twitter.navigation.composer.ComposerContentViewResult;

// 
// Decompiled by Procyon v0.6.0
// 

public final class orp implements nrp
{
    public final ar7 a;
    public final msp b;
    public xn6<o76, ComposerContentViewResult> c;
    
    public orp(final ar7 a, final msp b, final mbi<?> mbi) {
        this.a = a;
        this.b = b;
        this.c = mbi.h(ComposerContentViewResult.class, (bsm<ComposerContentViewResult>)j71.Y0);
    }
    
    public final String a(final Context context) {
        return context.getString(2131958042);
    }
    
    public final b5j<zrm<ComposerContentViewResult>> b() {
        return this.c.a();
    }
    
    public final String c(final Context context) {
        return context.getString(2131958027);
    }
    
    public final void d(final String s) {
        final xn6<o76, ComposerContentViewResult> c = this.c;
        final o76 o76 = new o76();
        o76.r(s, 0);
        o76.q(false);
        c.d(o76);
    }
    
    public final void f(final Activity activity, final String s) {
        activity.startActivityForResult(this.b.a((Context)activity, (lwp)new dwp(s), (sba)sba.c, new ksp(), (List)Collections.emptyList()), 2);
    }
    
    public final String g(final Context context) {
        return context.getString(2131958047);
    }
    
    public final void h(final Activity activity, final String s) {
        final ar7 a = this.a;
        final Bundle w = zi.w("intent_type", 1);
        final StringBuilder sb = new StringBuilder();
        sb.append("\n");
        sb.append(s);
        ((BaseBundle)w).putString("initial_text", sb.toString());
        final int a2 = w4j.a;
        w.putBoolean("is_sharing_external_content", true);
        w.putBoolean("should_go_back_to_source_activity", true);
        w.putBoolean("is_keyboard_open", true);
        activity.startActivity(a.f((Context)activity, new bi7(w)));
    }
}
