import android.content.Context;
import com.twitter.app.bookmarks.folders.BookmarkFolderActivity;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class f62 implements okx<i62, j52, i52>
{
    public final View C0;
    public final BookmarkFolderActivity D0;
    public final l52 E0;
    public final n52 F0;
    public final n8v G0;
    public final View H0;
    public final mhh<i62> I0;
    
    public f62(View viewById, final BookmarkFolderActivity d0, final l52 e0, final n52 f0, final n8v g0) {
        zzd.f((Object)viewById, "rootView");
        zzd.f((Object)d0, "activity");
        zzd.f((Object)e0, "navigationDelegate");
        zzd.f((Object)f0, "bookmarkFolderRepo");
        zzd.f((Object)g0, "twitterBlueLogoTextDecorator");
        this.C0 = viewById;
        this.D0 = d0;
        this.E0 = e0;
        this.F0 = f0;
        this.G0 = g0;
        viewById = viewById.findViewById(2131430615);
        zzd.e((Object)viewById, "rootView.findViewById(R.id.plus_fab)");
        this.H0 = viewById;
        this.I0 = (mhh<i62>)ajy.a0((rtb)new f62$c(this));
    }
    
    public final void T(final oax oax) {
        final i62 i62 = (i62)oax;
        zzd.f((Object)i62, "state");
        this.I0.b((Object)i62);
    }
    
    public final CharSequence a() {
        final boolean b = dta.b().b("subscriptions_blue_premium_labeling_enabled", false);
        final String string = ((Context)this.D0).getString(2131952242);
        zzd.e((Object)string, "activity.getString(com.t\u2026R.string.bookmarks_title)");
        CharSequence a = string;
        if (b) {
            a = this.G0.a(string);
        }
        return a;
    }
    
    public final void s(final Object o) {
        final i52 i52 = (i52)o;
        zzd.f((Object)i52, "effect");
        if (zzd.a((Object)i52, (Object)i52$a.a)) {
            ((snd)this.D0).finish();
        }
    }
    
    public final b5j<j52> x() {
        final b5j mergeArray = b5j.mergeArray(new naj[] { (naj)asy.q(this.H0).map((qtb)new kla((rtb)f62$b.C0, 5)) });
        zzd.e((Object)mergeArray, "mergeArray(\n            \u2026FolderClicked }\n        )");
        return (b5j<j52>)mergeArray;
    }
    
    public interface a
    {
        f62 a(final View p0);
    }
}
