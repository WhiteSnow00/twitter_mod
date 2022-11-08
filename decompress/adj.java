import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.a;
import java.util.Objects;
import android.view.View$OnClickListener;
import com.twitter.util.user.UserIdentifier;
import android.view.LayoutInflater;
import android.content.res.Resources;
import android.content.Intent;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adj extends abv
{
    public adj(final m1c m1c, final et8 et8, final zai zai, final csr csr, final vqa<wl1> vqa, final y0c y0c, final gdj gdj, final Intent intent, final z7x z7x, final Resources resources, final p9s p9s, final fxe<z9i> fxe, final kn kn, final gob gob, final uaf uaf, final sag sag, final LayoutInflater layoutInflater, final pca<p4h> pca, final UserIdentifier userIdentifier, final cbv cbv, final fxe<spa> fxe2, final q6g q6g, final c8p c8p, final gam gam, final mbi<?> mbi, final r6p r6p, final a8p a8p) {
        zzd.f((Object)m1c, "urtViewHelper");
        zzd.f((Object)et8, "detailRichTextManagerFactory");
        zzd.f((Object)zai, "navigationLinkManagerFactory");
        zzd.f((Object)csr, "subtaskContentViewProvider");
        zzd.f((Object)vqa, "ocfGenericUrtTimelineFragmentFactory");
        zzd.f((Object)y0c, "genericFragmentArgs");
        zzd.f((Object)gdj, "headerViewProvider");
        zzd.f((Object)z7x, "viewLifecycle");
        zzd.f((Object)resources, "resources");
        zzd.f((Object)p9s, "requestRepositoryFactory");
        zzd.f((Object)fxe, "navManagerLazy");
        zzd.f((Object)kn, "activityFinisher");
        zzd.f((Object)sag, "loginController");
        zzd.f((Object)layoutInflater, "layoutInflater");
        zzd.f((Object)userIdentifier, "currentUser");
        zzd.f((Object)cbv, "twitterFragmentActivityOptions");
        zzd.f((Object)fxe2, "fabPresenter");
        zzd.f((Object)q6g, "locationProducer");
        zzd.f((Object)c8p, "searchSuggestionController");
        zzd.f((Object)gam, "registrableHeadsetPlugReceiver");
        zzd.f((Object)mbi, "navigator");
        zzd.f((Object)a8p, "searchSuggestionCache");
        super(intent, z7x, resources, p9s, (fxe)fxe, kn, gob, uaf, sag, layoutInflater, (pca)pca, userIdentifier, cbv, (fxe)fxe2, q6g, c8p, gam, (mbi)mbi, r6p, a8p);
        ((x9)this).R4(csr.H0.C0);
        final lsr d0 = csr.D0;
        final xrv a = d0.a;
        if (a == null) {
            throw new IllegalArgumentException("Required value was null.".toString());
        }
        final String c = a.c;
        if (c != null) {
            m1c.F(c, (View$OnClickListener)new bas((Object)csr, (Object)a, 20));
            if (d0 instanceof l1c) {
                final l1c l1c = (l1c)d0;
                final abi m = ((em1)l1c).m;
                if (m != null) {
                    zai.f(m).bind();
                }
                final pcj n = ((em1)l1c).n;
                if (n != null) {
                    et8.f(n).bind();
                }
            }
            final b7m b7m = new b7m();
            if ((b7m.C0 = ((x9)this).I4().G(2131429268)) == null) {
                final Object a2 = vqa.a();
                final wl1 wl1 = (wl1)a2;
                Objects.requireNonNull(wl1);
                ((Fragment)wl1).N1(((zl1)y0c).a);
                b7m.C0 = a2;
                final a a3 = new a(((x9)this).I4());
                final Object c2 = b7m.C0;
                a3.e(2131429268, (Fragment)c2, ((Fragment)c2).a1, 1);
                a3.c();
            }
            final Object c3 = b7m.C0;
            zzd.d(c3, "null cannot be cast to non-null type com.twitter.app.common.base.BaseFragment");
            final b5j k = b8b.k((qob)((wl1)c3).B1.C0);
            final m29 m2 = new m29();
            m2.c(k.subscribe((fk6)new f$k2((rtb)new rtb<mij, oyv>() {
                public final Object invoke(final Object o) {
                    final mij mij = (mij)o;
                    final cdj cdj = (cdj)r9x.i((Fragment)b7m.C0, (Class)cdj.class);
                    final gdj e0 = gdj;
                    if (!e0.D0 && cdj != null) {
                        final View c0 = e0.C0.C0;
                        zzd.f((Object)c0, "header");
                        if (!cdj.u1) {
                            cdj.u1 = true;
                            final k6m h0 = ((acv)cdj).X0.H0;
                            h0.o(c0);
                            h0.o(cdj.t1.inflate(2131625064, (ViewGroup)null));
                        }
                    }
                    m2.a();
                    return oyv.a;
                }
            })));
            return;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }
}
