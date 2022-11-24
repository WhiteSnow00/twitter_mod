import com.google.android.material.tabs.TabLayout;
import android.content.Context;
import kotlin.NoWhenBranchMatchedException;
import com.google.android.material.tabs.TabLayout$g;
import retrofit2.HttpException;
import android.view.View;
import com.twitter.subsystem.composer.TweetBox$e;
import com.twitter.subsystem.composer.TweetBox;
import android.os.Bundle;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import android.graphics.Bitmap;
import com.twitter.android.onboarding.core.invisiblesubtask.SecurityKeyEnrollmentSubtaskHandler;
import android.graphics.Rect;
import com.twitter.media.ui.fresco.FrescoMediaImageView;
import com.twitter.media.ui.image.b;
import com.google.android.material.tabs.c$b;
import com.twitter.media.ui.image.b$a;

// 
// Decompiled by Procyon v0.6.0
// 

public final class nea implements b$a, f5s$a, unf$a, ch, egx$a, yij, x5c$d, trk$a, c$b, ddq, trd$c, mf4$b
{
    public final int F0;
    public final Object G0;
    public final Object H0;
    
    public nea(final Object g0, final Object h0, final int f0) {
        this.F0 = f0;
        this.G0 = g0;
        this.H0 = h0;
    }
    
    public void a() {
        final zl2 zl2 = (zl2)this.G0;
        zl2.I0.f(zl2.F0, (String)this.H0);
    }
    
    public ccm b(final b b) {
        switch (this.F0) {
            default: {
                final hpj hpj = (hpj)this.G0;
                final kfa kfa = (kfa)this.H0;
                final FrescoMediaImageView frescoMediaImageView = (FrescoMediaImageView)b;
                e0e.f((Object)hpj, "$image");
                e0e.f((Object)kfa, "this$0");
                e0e.f((Object)frescoMediaImageView, "it");
                return iuk.W(hpj, kfa.H0);
            }
            case 1: {
                final afa afa = (afa)this.G0;
                final wtg wtg = (wtg)this.H0;
                final FrescoMediaImageView frescoMediaImageView2 = (FrescoMediaImageView)b;
                return iuk.V(wtg, afa.N0);
            }
            case 0: {
                final Rect rect = (Rect)this.G0;
                final beq beq = (beq)this.H0;
                final FrescoMediaImageView frescoMediaImageView3 = (FrescoMediaImageView)b;
                return ccm.b(rect, beq);
            }
        }
    }
    
    public void c(final Exception ex) {
        final SecurityKeyEnrollmentSubtaskHandler securityKeyEnrollmentSubtaskHandler = (SecurityKeyEnrollmentSubtaskHandler)this.G0;
        final ybp ybp = (ybp)this.H0;
        e0e.f((Object)securityKeyEnrollmentSubtaskHandler, "this$0");
        e0e.f((Object)ybp, "$subtask");
        securityKeyEnrollmentSubtaskHandler.b(ybp, "error while loading fido registration intent");
    }
    
    public void d(final Bitmap imageBitmap) {
        final wjk wjk = (wjk)this.G0;
        final clg$a clg$a = (clg$a)this.H0;
        Objects.requireNonNull(wjk);
        if (imageBitmap != null) {
            wjk.b.setImageBitmap(imageBitmap);
            wjk.b.setVisibility(0);
            ((View)wjk.a).setVisibility(8);
            if (clg$a != null) {
                clg$a.a(imageBitmap);
            }
        }
    }
    
    public void e(final kgs kgs) {
        final fg4 fg4 = (fg4)this.G0;
        final zym zym = (zym)this.H0;
        final yym yym = (yym)kgs;
        if (fg4 != null) {
            sbw.b((tlm)fg4);
        }
        zym.a(yym.F0);
    }
    
    public Object execute() {
        final t5w t5w = (t5w)this.G0;
        final Map map = (Map)this.H0;
        Objects.requireNonNull(t5w);
        for (final Map.Entry<String, V> entry : map.entrySet()) {
            t5w.i.d((long)(int)entry.getValue(), x8g.a.L0, (String)entry.getKey());
        }
        return null;
    }
    
    public void invoke(final Object o) {
        ((e00)o).c1();
    }
    
    public boolean j(final urd d1, final int n, final Bundle bundle) {
        final TweetBox tweetBox = (TweetBox)this.G0;
        final TweetBox$e tweetBox$e = (TweetBox$e)this.H0;
        final urd d2 = tweetBox.d1;
        if (d2 != null) {
            d2.a.d();
        }
        tweetBox.d1 = d1;
        final String[] i1 = TweetBox.i1;
        boolean b = false;
        int j = 0;
        while (true) {
            while (j < 3) {
                if (d1.a.getDescription().hasMimeType(i1[j])) {
                    final boolean b2 = true;
                    if (!b2) {
                        return b;
                    }
                    Label_0124: {
                        if ((n & 0x1) == 0x0) {
                            break Label_0124;
                        }
                        try {
                            d1.a.a();
                            tweetBox$e.k(d1.a.c());
                            b = true;
                            return b;
                        }
                        catch (final Exception ex) {
                            return b;
                        }
                    }
                }
                else {
                    ++j;
                }
            }
            final boolean b2 = false;
            continue;
        }
    }
    
    public boolean k(final View view) {
        final pf pf = (pf)this.G0;
        final Object h0 = this.H0;
        e0e.f((Object)pf, "$action");
        e0e.f((Object)view, "v");
        pf.a().c(view, h0);
        return true;
    }
    
    public void o(final fcq fcq) {
        switch (this.F0) {
            default: {
                final uch uch = (uch)this.G0;
                final ex9 ex9 = (ex9)this.H0;
                e0e.f((Object)uch, "this$0");
                e0e.f((Object)ex9, "$this_toBitmapSingle");
                final z8d z8d = new z8d(fzg.a(uch.a, (jx9)ex9));
                ((bsm)z8d).i = (bsm$b)new sch(fcq);
                uch.c.h(z8d);
                uch.c.e(false);
                return;
            }
            case 9: {
                final aba aba = (aba)this.G0;
                final ptb ptb = (ptb)this.H0;
                e0e.f((Object)aba, "$eventBus");
                e0e.f((Object)ptb, "$periscopeCall");
                final g6k g6k = new g6k(aba);
                g6k.b = (g6k$a)new g6k$a(fcq) {
                    public final fcq<a67> a;
                    
                    public final void a(final a67 a67) {
                        ((mbq$a)this.a).b((Object)a67);
                    }
                    
                    public final void b(HttpException ex) {
                        final fcq a = this.a;
                        if (ex == null) {
                            ex = (HttpException)new Exception("Failed to get broadcast");
                        }
                        ((mbq$a)a).a((Throwable)ex);
                    }
                };
                g6k.a.i((Object)g6k);
                g6k.a((String)ptb.invoke());
                ((mbq$a)fcq).c((ng3)new ujp((Object)g6k, 1));
            }
        }
    }
    
    public void v(final TabLayout$g tabLayout$g, int n) {
        final j4e j4e = (j4e)this.G0;
        final View view = (View)this.H0;
        e0e.f((Object)j4e, "$itemAdapter");
        e0e.f((Object)view, "$rootView");
        e0e.f((Object)tabLayout$g, "tab");
        final Object item = j4e.I0.getItem(n);
        e0e.e(item, "itemAdapter.itemProvider.getItem(position)");
        final gpu gpu = (gpu)item;
        final Context context = view.getContext();
        e0e.e((Object)context, "rootView.context");
        final upu a = gpu.a;
        n = gpu.c;
        e0e.f((Object)a, "type");
        final String g = o2d.g(context.getResources(), (long)n);
        e0e.e((Object)g, "tweetNumberFormat(contex\u2026esources, count.toLong())");
        n = ((Enum)a).ordinal();
        if (n != 0) {
            if (n != 1) {
                if (n != 2) {
                    if (n != 3) {
                        if (n != 4) {
                            if (n != 5) {
                                throw new NoWhenBranchMatchedException();
                            }
                            n = 2131959183;
                        }
                        else {
                            n = 2131959181;
                        }
                    }
                    else {
                        n = 2131959180;
                    }
                }
                else {
                    n = 2131959182;
                }
            }
            else {
                n = 2131959179;
            }
        }
        else {
            n = 2131959178;
        }
        tabLayout$g.g((CharSequence)s60.a(context.getString(n, new Object[] { g })));
        final Context context2 = view.getContext();
        e0e.e((Object)context2, "rootView.context");
        final upu a2 = gpu.a;
        n = gpu.c;
        e0e.f((Object)a2, "type");
        final String g2 = o2d.g(context2.getResources(), (long)n);
        e0e.e((Object)g2, "tweetNumberFormat(contex\u2026esources, count.toLong())");
        n = ((Enum)a2).ordinal();
        if (n != 0) {
            if (n != 1) {
                if (n != 2) {
                    if (n != 3) {
                        if (n != 4) {
                            if (n != 5) {
                                throw new NoWhenBranchMatchedException();
                            }
                            n = 2131951730;
                        }
                        else {
                            n = 2131951728;
                        }
                    }
                    else {
                        n = 2131951727;
                    }
                }
                else {
                    n = 2131951729;
                }
            }
            else {
                n = 2131951726;
            }
        }
        else {
            n = 2131951725;
        }
        final String string = context2.getString(n, new Object[] { g2 });
        e0e.e((Object)string, "context.getString(stringRes, formattedCount)");
        tabLayout$g.c((CharSequence)string);
        final upu a3 = gpu.a;
        e0e.f((Object)a3, "type");
        Number value;
        if (a3 == upu.G0) {
            value = null;
        }
        else {
            value = zzl.b((yzl)a3.F0.get(0));
        }
        if (value != null) {
            n = value.intValue();
            final TabLayout g3 = tabLayout$g.g;
            if (g3 == null) {
                throw new IllegalArgumentException("Tab not attached to a TabLayout");
            }
            tabLayout$g.f(d4j.F(((View)g3).getContext(), n));
        }
    }
}
