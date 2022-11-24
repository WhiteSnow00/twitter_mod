import androidx.fragment.app.Fragment;
import android.os.BaseBundle;
import android.app.Activity;
import android.os.Bundle;
import android.content.Intent;
import androidx.fragment.app.Fragment$InstantiationException;
import com.twitter.app.bookmarks.folders.peek.BookmarkPeekActivity;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class v62 implements xlx<w42, Object, v42>
{
    public final View F0;
    public final dob G0;
    public final View H0;
    
    public v62(View viewById, final dob g0, final b b) {
        e0e.f((Object)viewById, "rootView");
        e0e.f((Object)b, "a11yUtils");
        this.F0 = viewById;
        this.G0 = g0;
        viewById = viewById.findViewById(2131427421);
        e0e.e((Object)viewById, "rootView.findViewById(R.\u2026ssibility_focusable_view)");
        this.H0 = viewById;
        int visibility;
        if (b.a()) {
            visibility = 0;
        }
        else {
            visibility = 8;
        }
        viewById.setVisibility(visibility);
    }
    
    public final void T(final ccx ccx) {
        e0e.f((Object)ccx, "state");
    }
    
    public final void r(final Object o) {
        final v42 v42 = (v42)o;
        e0e.f((Object)v42, "effect");
        if (v42 instanceof v42$a) {
            final u62.a companion = u62.Companion;
            final dob g0 = this.G0;
            e0e.d((Object)g0, "null cannot be cast to non-null type com.twitter.app.bookmarks.folders.peek.BookmarkPeekActivity");
            final Intent intent = ((Activity)g0).getIntent();
            e0e.e((Object)intent, "activity as BookmarkPeekActivity).intent");
            final u62 b = companion.b(intent);
            final Bundle t = m58.t("twitter:id", 500);
            final String a = b.a;
            e0e.c((Object)a);
            ((BaseBundle)t).putString("tweet_id", a);
            if (!((BaseBundle)t).containsKey("twitter:id")) {
                throw new Fragment$InstantiationException("Missing fragment id", (Exception)null);
            }
            final b62 b2 = new b62();
            ((Fragment)b2).N1(t);
            final int a2 = o5j.a;
            ((bl1)b2).e2(((dob)this.G0).P(), "folder_create_sheet");
        }
    }
    
    public final t5j w() {
        return ffe.b();
    }
}
