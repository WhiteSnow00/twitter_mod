import com.twitter.util.user.UserIdentifier$Companion;
import java.util.Objects;
import com.twitter.util.user.UserIdentifier;
import java.util.List;
import android.view.View;
import android.view.View$OnClickListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gos implements View$OnClickListener
{
    public final jva<nws> C0;
    
    public gos(final jva<nws> c0) {
        zzd.f((Object)c0, "feedbackActionClickListener");
        this.C0 = c0;
    }
    
    public final void a() {
        egd.Companion.b((zfd)new d5s(2131954152, (nfd$c)nfd$c$c.b, "", Integer.valueOf(2131232518), (Integer)null, (View$OnClickListener)null, 112));
    }
    
    public final void onClick(final View view) {
        zzd.f((Object)view, "view");
        final Object tag = view.getTag(2131429106);
        final int a = w4j.a;
        if (tag == null) {
            final Object tag2 = view.getTag(2131432053);
            zzd.e(tag2, "cast(\n            view.g\u2026e_item_tag_key)\n        )");
            final yzs yzs = (yzs)tag2;
            if (view.isSelected()) {
                view.setSelected(false);
                final psc c = psc.c();
                final UserIdentifier c2 = UserIdentifier.Companion.c();
                final nsi i = yzs.k.i;
                zzd.c((Object)i);
                c.f((ksc)new qmb(c2, i.d, (nws)yzs, "REVERTED_LIKE"));
            }
            else {
                view.setSelected(true);
                this.a();
                final psc c3 = psc.c();
                final UserIdentifier c4 = UserIdentifier.Companion.c();
                final nsi j = yzs.k.i;
                zzd.c((Object)j);
                c3.f((ksc)new qmb(c4, j.c, (nws)yzs, "LIKE"));
            }
        }
        else {
            final Object tag3 = view.getTag(2131432053);
            zzd.e(tag3, "cast(\n            view.g\u2026e_item_tag_key)\n        )");
            final yzs yzs2 = (yzs)tag3;
            final lri.a companion = lri.Companion;
            final UserIdentifier$Companion companion2 = UserIdentifier.Companion;
            final UserIdentifier c5 = companion2.c();
            Objects.requireNonNull(companion);
            zzd.f((Object)c5, "userIdentifier");
            if (dta.a(c5).b("android_forward_feedback_tombstoning_enabled", false)) {
                this.C0.a((nws)yzs2, (iva$c)null, (jev)null);
            }
            else if (view.isSelected()) {
                view.setSelected(false);
                final psc c6 = psc.c();
                final UserIdentifier c7 = companion2.c();
                final nsi k = yzs2.k.i;
                zzd.c((Object)k);
                c6.f((ksc)new qmb(c7, k.f, (nws)yzs2, "REVERTED_DISLIKE"));
            }
            else {
                view.setSelected(true);
                this.a();
                final psc c8 = psc.c();
                final UserIdentifier c9 = companion2.c();
                final nsi l = yzs2.k.i;
                zzd.c((Object)l);
                c8.f((ksc)new qmb(c9, l.e, (nws)yzs2, "DISLIKE"));
            }
        }
    }
}
