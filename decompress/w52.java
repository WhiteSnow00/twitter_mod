import android.os.BaseBundle;
import android.os.Bundle;
import android.view.View;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class w52 extends eus
{
    public static final w52.w52$c Companion;
    
    static {
        Companion = new w52.w52$c();
    }
    
    public w52(final tcv tcv, final mws mws, final hss hss, final gh7<bo6> gh7, final gdf<cxs> gdf, final brb brb, final tod tod, final epi<cxs> epi, final Context context, final sc sc, final vxs vxs, final w0t w0t, final c3e<cxs> c3e, final xba<bo> xba, final udx udx, final efv efv) {
        czd.f((Object)tcv, "dependencies");
        czd.f((Object)mws, "timelineIdentifier");
        czd.f((Object)hss, "args");
        czd.f((Object)gh7, "dmComposeHandler");
        czd.f((Object)gdf, "lingerImpressionHelper");
        czd.f((Object)brb, "friendshipCache");
        czd.f((Object)tod, "inlineDismissController");
        czd.f((Object)epi, "itemCollectionProvider");
        czd.f((Object)context, "applicationContext");
        czd.f((Object)sc, "mediaPrefetcher");
        czd.f((Object)vxs, "timelineItemScribeReporter");
        czd.f((Object)w0t, "timelinePinnedHeaderAdapter");
        czd.f((Object)c3e, "itemBinderDirectory");
        czd.f((Object)xba, "results");
        czd.f((Object)udx, "viewportController");
        czd.f((Object)efv, "scribeAssociation");
        super(tcv, mws, hss, (gh7)gh7, (gdf)gdf, brb, tod, (epi)epi, sc, vxs, w0t, (c3e)c3e, (xba)xba, udx, efv);
        ((ucv)this).H0.F0((qsb)new qsb<pjf$b, fzv>(this) {
            public final w52 D0;
            
            public final Object invoke(final Object o) {
                final pjf$b pjf$b = (pjf$b)o;
                czd.f((Object)pjf$b, "event");
                final View viewById = ((ucv)this.D0).c().getView().findViewById(2131429211);
                if (viewById != null) {
                    int visibility;
                    if (pjf$b.b.T().b) {
                        visibility = 0;
                    }
                    else {
                        visibility = 8;
                    }
                    viewById.setVisibility(visibility);
                }
                return fzv.a;
            }
        });
    }
    
    public final void O0(final n3e<cxs> n3e) {
        czd.f((Object)n3e, "items");
        super.O0((n3e)n3e);
        if (n3e.isEmpty()) {
            final View viewById = ((ucv)this).c().getView().findViewById(2131429211);
            final int n = 1;
            int n2;
            if (viewById != null && viewById.getVisibility() != 0) {
                n2 = n;
            }
            else {
                n2 = 0;
            }
            if (n2 != 0 && !((ucv)this).G0()) {
                czd.e((Object)viewById, "emptyLayout");
                viewById.setVisibility(0);
            }
            final oaa$c a = oaa$c.a;
            wa2.P(oaa$c.c);
        }
    }
    
    public final gdv$b l0(final gdv$b gdv$b) {
        gdv$b.a = "bookmark_folders";
        final g2a$a g2a$a = new g2a$a();
        final nw6 a = tes.a;
        g2a$a.a = (tes)new dkr(2131953931);
        g2a$a.b = (tes)new dkr(2131953915);
        g2a$a.c = (tes)new dkr(2131953917);
        g2a$a.e = 0;
        final i2a$e d = new i2a$e((g2a)((n4j)g2a$a).e());
        d.a = (i2a$c)new eu4((Object)this, 17);
        final g2a$a g2a$a2 = new g2a$a();
        g2a$a2.a = (tes)new dkr(2131954115);
        g2a$a2.b = (tes)new dkr(2131954114);
        g2a$a2.h = r2a.H0;
        if (d4j.f()) {
            gdv$b.b.a(2131624409);
        }
        else {
            gdv$b.b.a(2131624493);
        }
        gdv$b.b.c = new i2a$e((g2a)((n4j)g2a$a2).e());
        gdv$b.b.d = d;
        return gdv$b;
    }
    
    public static final class b extends hss
    {
        public final Bundle d;
        
        public b(final Bundle d) {
            super(d);
            this.d = d;
        }
        
        public final String j() {
            return "bookmark_folders";
        }
        
        public final String l() {
            return "";
        }
        
        public final int n() {
            return 53;
        }
        
        public final pqv o() {
            final Bundle d = this.d;
            String string;
            if (d != null) {
                string = ((BaseBundle)d).getString("folder_id");
            }
            else {
                string = null;
            }
            czd.c((Object)string);
            return new pqv(rpb.P(new lvj((Object)"bookmark_collection_id", (Object)string)));
        }
        
        public final boolean q() {
            return true;
        }
        
        public static final class a extends hss$a<b, a>
        {
            public a(final Bundle bundle) {
                super(bundle);
            }
            
            public final Object i() {
                return new b(((vl1$a)this).a);
            }
        }
    }
}
