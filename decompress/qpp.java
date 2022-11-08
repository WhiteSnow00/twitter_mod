import android.widget.TextView;
import android.view.View;
import android.widget.ImageButton;
import com.twitter.ui.widget.TwitterEditText;

// 
// Decompiled by Procyon v0.6.0
// 

public final class qpp implements okx<upp, ppp, kpp>
{
    public final TwitterEditText C0;
    public final ImageButton D0;
    public final mhh<upp> E0;
    
    public qpp(View viewById) {
        zzd.f((Object)viewById, "toolbarView");
        final View viewById2 = viewById.findViewById(2131430839);
        zzd.e((Object)viewById2, "toolbarView.findViewById(R.id.query_view)");
        this.C0 = (TwitterEditText)viewById2;
        viewById = viewById.findViewById(2131428250);
        zzd.e((Object)viewById, "toolbarView.findViewById(R.id.clear_button)");
        this.D0 = (ImageButton)viewById;
        this.E0 = (mhh<upp>)ajy.a0((rtb)new qpp$d(this));
    }
    
    public final void T(final oax oax) {
        final upp upp = (upp)oax;
        zzd.f((Object)upp, "state");
        this.E0.b((Object)upp);
    }
    
    public final void s(final Object o) {
        final kpp kpp = (kpp)o;
        zzd.f((Object)kpp, "effect");
        if (zzd.a((Object)kpp, (Object)kpp$a.a)) {
            ore.a((View)this.C0);
        }
    }
    
    public final b5j<ppp> x() {
        final b5j merge = b5j.merge((naj)asy.q((View)this.D0).map((qtb)new yt1((rtb)qpp$b.C0, 16)), (naj)r9x.D((TextView)this.C0).map((qtb)new mma((rtb)qpp$c.C0, 12)));
        zzd.e((Object)merge, "merge(\n        clearButt\u2026text.toString()) },\n    )");
        return (b5j<ppp>)merge;
    }
}
