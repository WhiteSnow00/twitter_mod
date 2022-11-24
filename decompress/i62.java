import android.os.BaseBundle;
import android.os.Bundle;
import android.view.View;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class i62 extends xus
{
    public static final i62.i62$c Companion;
    
    static {
        Companion = new i62.i62$c();
    }
    
    public i62(final hdv hdv, final fxs fxs, final bts bts, final ii7<hp6> ii7, final def<vxs> def, final dsb dsb, final vpd vpd, final vpi<vxs> vpi, final Context context, final tc tc, final oys oys, final p1t p1t, final d4e<vxs> d4e, final fda<fo> fda, final mex mex, final sfv sfv) {
        e0e.f((Object)hdv, "dependencies");
        e0e.f((Object)fxs, "timelineIdentifier");
        e0e.f((Object)bts, "args");
        e0e.f((Object)ii7, "dmComposeHandler");
        e0e.f((Object)def, "lingerImpressionHelper");
        e0e.f((Object)dsb, "friendshipCache");
        e0e.f((Object)vpd, "inlineDismissController");
        e0e.f((Object)vpi, "itemCollectionProvider");
        e0e.f((Object)context, "applicationContext");
        e0e.f((Object)tc, "mediaPrefetcher");
        e0e.f((Object)oys, "timelineItemScribeReporter");
        e0e.f((Object)p1t, "timelinePinnedHeaderAdapter");
        e0e.f((Object)d4e, "itemBinderDirectory");
        e0e.f((Object)fda, "results");
        e0e.f((Object)mex, "viewportController");
        e0e.f((Object)sfv, "scribeAssociation");
        super(hdv, fxs, bts, (ii7)ii7, (def)def, dsb, vpd, (vpi)vpi, tc, oys, p1t, (d4e)d4e, (fda)fda, mex, sfv);
        ((idv)this).J0.F0((stb)new stb<nkf$b, vzv>(this) {
            public final i62 F0;
            
            public final Object invoke(final Object o) {
                final nkf$b nkf$b = (nkf$b)o;
                e0e.f((Object)nkf$b, "event");
                final View viewById = ((idv)this.F0).c().getView().findViewById(2131429211);
                if (viewById != null) {
                    int visibility;
                    if (((osc)nkf$b.b).T().b) {
                        visibility = 0;
                    }
                    else {
                        visibility = 8;
                    }
                    viewById.setVisibility(visibility);
                }
                return vzv.a;
            }
        });
    }
    
    public final void O0(final p4e<vxs> p4e) {
        e0e.f((Object)p4e, "items");
        super.O0((p4e)p4e);
        if (p4e.isEmpty()) {
            final View viewById = ((idv)this).c().getView().findViewById(2131429211);
            final int n = 1;
            int n2;
            if (viewById != null && viewById.getVisibility() != 0) {
                n2 = n;
            }
            else {
                n2 = 0;
            }
            if (n2 != 0 && !((idv)this).G0()) {
                e0e.e((Object)viewById, "emptyLayout");
                viewById.setVisibility(0);
            }
            final vba$c a = vba$c.a;
            cmi.g(vba$c.c);
        }
    }
    
    public final udv$b l0(final udv$b udv$b) {
        udv$b.a = "bookmark_folders";
        final i3a$a i3a$a = new i3a$a();
        final tx6 a = lfs.a;
        i3a$a.a = (lfs)new zkr(2131953931);
        i3a$a.b = (lfs)new zkr(2131953915);
        i3a$a.c = (lfs)new zkr(2131953917);
        i3a$a.e = 0;
        final k3a$e d = new k3a$e((i3a)((z4j)i3a$a).e());
        d.a = (k3a$c)new isx((Object)this, 10);
        final i3a$a i3a$a2 = new i3a$a();
        i3a$a2.a = (lfs)new zkr(2131954115);
        i3a$a2.b = (lfs)new zkr(2131954114);
        i3a$a2.h = t3a.J0;
        if (egz.s()) {
            udv$b.b.a(2131624409);
        }
        else {
            udv$b.b.a(2131624493);
        }
        udv$b.b.c = new k3a$e((i3a)((z4j)i3a$a2).e());
        udv$b.b.d = d;
        return udv$b;
    }
    
    public static final class b extends bts
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
        
        public final arv o() {
            final Bundle d = this.d;
            String string;
            if (d != null) {
                string = ((BaseBundle)d).getString("folder_id");
            }
            else {
                string = null;
            }
            e0e.c((Object)string);
            return new arv(vmw.F(new awj((Object)"bookmark_collection_id", (Object)string)));
        }
        
        public final boolean q() {
            return true;
        }
        
        public static final class a extends bts$a<b, a>
        {
            public a(final Bundle bundle) {
                super(bundle);
            }
            
            public final Object i() {
                return new b(((am1.a)this).a);
            }
        }
    }
}
