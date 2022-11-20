import com.twitter.app.common.args.ContentViewArgs;
import com.twitter.errordialogs.api.RateLimitDialogContentViewArgs;
import android.content.res.Resources;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bl7
{
    public static void a(final xrc<pr, kbv> xrc, final Resources resources, final qft qft, final f3c f3c) {
        if (!xrc.b && !b2v.a(xrc, 326) && 403 == xrc.c && b2v.a(xrc, 344)) {
            f3c.b((ContentViewArgs)RateLimitDialogContentViewArgs.INSTANCE);
        }
        else {
            final Object g = xrc.g;
            final int a = c5j.a;
            final pr pr = (pr)g;
            final boolean b = xrc.b;
            final CharSequence charSequence = null;
            CharSequence charSequence2;
            if (b && pr != null) {
                if (pr.e.isEmpty()) {
                    final cyj cyj = (cyj)i5e.g((Iterable)((mm7)pr).b, (xtk)c1p.e);
                    charSequence2 = charSequence;
                    if (cyj != null) {
                        final int size = cyj.f.size();
                        charSequence2 = resources.getQuantityString(2131820563, size, new Object[] { size });
                    }
                }
                else {
                    final int size2 = pr.e.size();
                    charSequence2 = resources.getQuantityString(2131820562, size2, new Object[] { size2 });
                }
            }
            else if (!b && b2v.a(xrc, 326)) {
                charSequence2 = charSequence;
            }
            else {
                final int c = xrc.c;
                if (420 != c && 429 != c) {
                    charSequence2 = resources.getString(2131953191);
                }
                else {
                    charSequence2 = resources.getString(2131953193);
                }
            }
            if (ikr.g(charSequence2)) {
                qft.a(charSequence2, 0);
            }
        }
    }
}
