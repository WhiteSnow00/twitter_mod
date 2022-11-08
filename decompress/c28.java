import android.widget.EditText;
import android.widget.TextView;
import android.view.inputmethod.InputMethodManager;
import android.view.View$OnClickListener;
import android.view.View;
import android.widget.ImageButton;
import com.twitter.ui.widget.TwitterEditText;
import com.twitter.util.user.UserIdentifier;

// 
// Decompiled by Procyon v0.6.0
// 

public final class c28 implements okx<f28, b28, w18>
{
    public static final a Companion;
    public final UserIdentifier C0;
    public final TwitterEditText D0;
    public final ImageButton E0;
    public final mhh<f28> F0;
    
    static {
        Companion = new a();
    }
    
    public c28(final View view, final UserIdentifier c0, final boolean b) {
        zzd.f((Object)view, "toolbarView");
        zzd.f((Object)c0, "owner");
        this.C0 = c0;
        final View viewById = view.findViewById(2131430839);
        zzd.e((Object)viewById, "toolbarView.findViewById(R.id.query_view)");
        final TwitterEditText d0 = (TwitterEditText)viewById;
        this.D0 = d0;
        final View viewById2 = view.findViewById(2131428250);
        zzd.e((Object)viewById2, "toolbarView.findViewById(R.id.clear_button)");
        final ImageButton e0 = (ImageButton)viewById2;
        this.E0 = e0;
        this.F0 = (mhh<f28>)ajy.a0((rtb)new c28$f(this));
        ((View)e0).setOnClickListener((View$OnClickListener)new qi2((Object)this, 8));
        final Object systemService = view.getContext().getSystemService("input_method");
        zzd.d(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        ((View)d0).setOnClickListener((View$OnClickListener)new o0p((Object)systemService, (Object)this, 3));
        int hint;
        if (b) {
            hint = 2131953413;
        }
        else {
            hint = 2131953412;
        }
        ((TextView)d0).setHint(hint);
    }
    
    public final void T(final oax oax) {
        final f28 f28 = (f28)oax;
        zzd.f((Object)f28, "state");
        this.F0.b((Object)f28);
    }
    
    public final void a(final w18 w18) {
        zzd.f((Object)w18, "effect");
        if (zzd.a((Object)w18, (Object)w18$a.a)) {
            ore.c((View)this.D0);
        }
        else if (zzd.a((Object)w18, (Object)w18$b.a)) {
            ore.a((View)this.D0);
            final UserIdentifier c0 = this.C0;
            final nca$a companion = nca.Companion;
            final d18 a = d18.a;
            saw.b((okm)new zf4(c0, companion.c((sba)d18.h, "click")));
        }
        else if (zzd.a((Object)w18, (Object)w18$c.a)) {
            ((EditText)this.D0).selectAll();
        }
    }
    
    public final b5j<b28> x() {
        final b5j map = new cnd.a().map((qtb)new c9v((rtb)c28$c.C0, 7));
        final TwitterEditText d0 = this.D0;
        final c28$d c0 = c28$d.C0;
        zzd.g((Object)d0, "$this$editorActions");
        zzd.g((Object)c0, "handled");
        final b5j merge = b5j.merge((naj)map, (naj)new ljs((TextView)d0, (rtb<? super Integer, Boolean>)c0).map((qtb)new d9v((rtb)c28$e.C0, 3)));
        zzd.e((Object)merge, "merge(\n        queryView\u2026archActionClicked }\n    )");
        return (b5j<b28>)merge;
    }
    
    public static final class a
    {
    }
    
    public interface b
    {
        c28 a(final View p0);
    }
}
