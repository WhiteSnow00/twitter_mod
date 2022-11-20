import java.util.List;
import com.twitter.ui.view.RtlViewPager;
import java.util.ArrayList;
import androidx.recyclerview.widget.RecyclerView$r;
import java.util.Objects;
import tv.periscope.android.api.PsUser;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView$e;
import tv.periscope.model.b;
import androidx.recyclerview.widget.RecyclerView$m;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView$l;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class yal implements xal
{
    public final c9w a;
    public final qj2 b;
    public final RecyclerView c;
    public final wc6 d;
    public final b9w e;
    public final sj2 f;
    public final w19 g;
    public String h;
    public boolean i;
    
    public yal(final Context context, final i99 i99, final hf2 hf2, final tj2 tj2, final l9w l9w, final m8d m8d) {
        this.d = new wc6();
        this.g = new w19();
        this.h = "";
        final b9w e = new b9w(i99, (b9w$b)tj2);
        final sj2 f = new sj2(tj2);
        this.f = f;
        this.a = new c9w((a9w)e);
        final View inflate = LayoutInflater.from(context).inflate(2131625239, (ViewGroup)null, false);
        final int a = c5j.a;
        final RecyclerView c = (RecyclerView)inflate;
        (this.c = c).h((RecyclerView$l)new wal(context.getResources()));
        c.setLayoutManager((RecyclerView$m)new LinearLayoutManager(1));
        c.setNestedScrollingEnabled(true);
        this.b = new qj2((d4e<b>)f, l9w, hf2, m8d);
        this.e = e;
        this.i = true;
        c.setAdapter((RecyclerView$e)new rj2(((View)c).getContext()));
    }
    
    public final void a(final PsUser psUser) {
        final sj2 f = this.f;
        f.a.c(((h5j)f.d.d(psUser.id)).subscribe((lj6)new v64((Object)f, 22)));
        final c9w a = this.a;
        final RecyclerView c = this.c;
        final String id = psUser.id;
        Objects.requireNonNull(a);
        czd.f((Object)c, "recyclerView");
        czd.f((Object)id, "userId");
        c9w.b = id;
        final d9w c2 = new d9w(a);
        final d9w c3 = c9w.c;
        if (c3 != null) {
            c.p0((RecyclerView$r)c3);
        }
        c.j((RecyclerView$r)(c9w.c = c2));
        this.g.c(this.a.a.a().observeOn(gmw.H()).subscribe((lj6)new fkk((Object)this, 13)));
        if (this.h.equals(psUser.id)) {
            return;
        }
        final String id2 = psUser.id;
        this.h = id2;
        this.e.b(id2);
    }
    
    public final void b(final h5j<zlf> h5j) {
        this.d.a(h5j.subscribe());
    }
    
    public final void c(final bdl bdl) {
    }
    
    public final void clear() {
        this.g.a();
        this.i = true;
        final RecyclerView c = this.c;
        c.setAdapter((RecyclerView$e)new rj2(((View)c).getContext()));
    }
    
    public final void d() {
    }
    
    public final h5j<zlf> e() {
        return (h5j<zlf>)h5j.just((Object)zlf.D0);
    }
    
    public final void f(final ViewGroup viewGroup) {
        final ArrayList list = new ArrayList(1);
        list.add(this.c);
        ((RtlViewPager)((View)viewGroup).findViewById(2131429787)).setAdapter((huj)new yml((List)list));
    }
}
