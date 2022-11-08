import androidx.appcompat.app.f;
import android.content.Context;
import java.util.List;
import androidx.recyclerview.widget.RecyclerView$e;
import androidx.recyclerview.widget.RecyclerView$m;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.fragment.app.p;
import android.app.Activity;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class mtl implements okx<ytl, ftl, etl>
{
    public final View C0;
    public final Activity D0;
    public final nw8 E0;
    public final p F0;
    public final htl G0;
    public final vkf<dtl> H0;
    public final ztl I0;
    public final nxj J0;
    public final ymm K0;
    public final qk7 L0;
    public final zml<ftl> M0;
    
    public mtl(View viewById, final Activity d0, final nw8 e0, final p f0, final htl htl, final vkf<dtl> h0, final ztl i0, final nxj j0, final ymm k0, final qk7 l0) {
        zzd.f((Object)viewById, "rootView");
        zzd.f((Object)d0, "activity");
        zzd.f((Object)e0, "dialogNavigationDelegate");
        zzd.f((Object)htl, "adapter");
        zzd.f((Object)h0, "itemProvider");
        zzd.f((Object)i0, "navigator");
        zzd.f((Object)j0, "participantSheetFactory");
        zzd.f((Object)k0, "requestInbox");
        zzd.f((Object)l0, "dmConversationLabelRepository");
        this.C0 = viewById;
        this.D0 = d0;
        this.E0 = e0;
        this.F0 = f0;
        this.G0 = htl;
        this.H0 = h0;
        this.I0 = i0;
        this.J0 = j0;
        this.K0 = k0;
        this.L0 = l0;
        viewById = viewById.findViewById(2131430931);
        zzd.e((Object)viewById, "rootView.findViewById(R.id.recycler)");
        final RecyclerView recyclerView = (RecyclerView)viewById;
        this.M0 = (zml<ftl>)new zml();
        recyclerView.setLayoutManager((RecyclerView$m)new LinearLayoutManager(1));
        recyclerView.setAdapter((RecyclerView$e)htl);
    }
    
    public final void T(final oax oax) {
        final ytl ytl = (ytl)oax;
        zzd.f((Object)ytl, "state");
        this.H0.g((List)ytl.a);
        final ytl.ytl$a b = ytl.b;
        if (!zzd.a((Object)b, (Object)ytl.ytl$a.d.a)) {
            if (b instanceof ytl.ytl$a.a) {
                final ytl.ytl$a.a a = (ytl.ytl$a.a)b;
                final ntl ntl = new ntl(this, a);
                final wil a2 = ppo.a(((Context)this.D0).getResources(), a.a, 4);
                ((cl1)a2).T1 = (mw8)new bj7((Object)ntl, 1);
                final int a3 = w4j.a;
                ((cl1)a2).l2(this.F0);
            }
            else if (b instanceof ytl.ytl$a.b) {
                final ytl.ytl$a.b b2 = (ytl.ytl$a.b)b;
                final otl otl = new otl(this, b2);
                final wil c = ppo.c((Context)this.D0, b2.a, 5);
                ((cl1)c).T1 = (mw8)new zk1((Object)otl, 1);
                final int a4 = w4j.a;
                ((cl1)c).l2(this.F0);
            }
            else if (b instanceof ytl.ytl$a.c) {
                final ytl.ytl$a.c c2 = (ytl.ytl$a.c)b;
                final jp7 b3 = c2.b;
                final jn8 n2 = jn8.n2(c2.a, 2, b3.g, b3.a, "inbox", b3.l, b3.o, b3.h, "request_action_sheet", -1, this.L0);
                ((cl1)n2).T1 = (mw8)new hrw((Object)this, 1);
                final int a5 = w4j.a;
                ((cl1)n2).e2(this.F0, (String)null);
            }
            else if (b instanceof ytl.ytl$a.e) {
                final blw a6 = this.J0.a(((ytl.ytl$a.e)b).a, (otb)new ptl(this));
                final Activity d0 = this.D0;
                zzd.d((Object)d0, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
                a6.e2(((f)d0).Q(), "TAG_USERS_BOTTOM_SHEET");
                this.E0.E0();
            }
        }
    }
    
    public final void a() {
        this.E0.E0();
    }
    
    public final void s(final Object o) {
        final etl etl = (etl)o;
        zzd.f((Object)etl, "effect");
        if (etl instanceof etl$b) {
            final etl$b etl$b = (etl$b)etl;
            if (etl$b instanceof etl$b.b) {
                ((tbl)this.I0).d((Context)this.D0, ((etl$b.b)etl$b).a, lr0.w(this.K0), this.F0);
            }
            else if (etl$b instanceof etl$b.a) {
                this.I0.a(((etl$b.a)etl$b).a);
            }
            this.a();
        }
        else if (zzd.a((Object)etl, (Object)etl$a.a)) {
            this.a();
        }
    }
    
    public final b5j<ftl> x() {
        final b5j merge = b5j.merge((naj)this.G0.M0, (naj)this.M0);
        zzd.e((Object)merge, "merge(\n        adapter.i\u2026      intentSubject\n    )");
        return (b5j<ftl>)merge;
    }
    
    public interface a
    {
        mtl a(final View p0);
    }
}
