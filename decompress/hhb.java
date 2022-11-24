import android.content.Context;
import androidx.recyclerview.widget.m$b;
import androidx.recyclerview.widget.m;
import java.util.List;
import java.util.Objects;
import android.app.Activity;
import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.TimeUnit;
import com.twitter.app.bookmarks.folders.peek.BookmarkPeekActivity;
import android.content.Intent;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView$r;
import androidx.recyclerview.widget.RecyclerView$m;
import androidx.recyclerview.widget.RecyclerView$e;
import com.twitter.app.bookmarks.folders.BookmarkFolderActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hhb implements xlx<ihb, ghb, fhb>
{
    public static final b Companion;
    public final View F0;
    public final dob G0;
    public final f72 H0;
    public final ehb I0;
    public final q52 J0;
    public final znl<ghb> K0;
    public final b L0;
    public final RecyclerView M0;
    public final View N0;
    public final View O0;
    public final boolean P0;
    public final e39 Q0;
    
    static {
        Companion = new b();
    }
    
    public hhb(View viewById, final dob g0, final f72 h0, final ehb ehb, final q52 j0, final znl<ghb> k0, final kcm kcm, final b l0) {
        e0e.f((Object)viewById, "rootView");
        e0e.f((Object)h0, "bookmarksNotificationPresenter");
        e0e.f((Object)ehb, "folderListAdapter");
        e0e.f((Object)j0, "navigationDelegate");
        e0e.f((Object)k0, "intentSubject");
        e0e.f((Object)kcm, "releaseCompletable");
        e0e.f((Object)l0, "a11yUtils");
        this.F0 = viewById;
        this.G0 = g0;
        this.H0 = h0;
        this.I0 = ehb;
        this.J0 = j0;
        this.K0 = k0;
        this.L0 = l0;
        final View viewById2 = viewById.findViewById(2131429207);
        e0e.e((Object)viewById2, "rootView.findViewById(R.id.folder_list_recycler)");
        final RecyclerView m0 = (RecyclerView)viewById2;
        this.M0 = m0;
        final View viewById3 = viewById.findViewById(2131429205);
        e0e.e((Object)viewById3, "rootView.findViewById(R.\u2026folder_list_empty_layout)");
        this.N0 = viewById3;
        viewById = viewById.findViewById(2131429212);
        e0e.e((Object)viewById, "rootView.findViewById(R.\u2026olders_list_progress_bar)");
        this.O0 = viewById;
        final LinearLayoutManager layoutManager = new LinearLayoutManager(1);
        this.P0 = (g0 instanceof BookmarkFolderActivity);
        final e39 q0 = new e39();
        this.Q0 = q0;
        m0.setAdapter((RecyclerView$e)ehb);
        m0.setLayoutManager((RecyclerView$m)layoutManager);
        m0.j((RecyclerView$r)new hhb$a(this));
        kcm.i((sj)new vo0(q0, 0));
    }
    
    public final void T(final ccx ccx) {
        final ihb ihb = (ihb)ccx;
        e0e.f((Object)ihb, "state");
        final View f0 = this.F0;
        int visibility;
        if (ihb.a) {
            visibility = 0;
        }
        else {
            visibility = 8;
        }
        f0.setVisibility(visibility);
        if (ihb.a) {
            final Fragment h = this.G0.P().H("bookmark_folders_timeline_bottom_sheet");
            String s;
            if (h != null) {
                s = new z52(h.L0).c;
            }
            else {
                final u62.a companion = u62.Companion;
                final Intent intent = ((Activity)this.G0).getIntent();
                e0e.e((Object)intent, "activity.intent");
                s = companion.b(intent).a;
            }
            this.K0.onNext((Object)new ghb.f(s));
        }
    }
    
    public final void a(final fhb fhb) {
        final boolean b = this.G0 instanceof BookmarkPeekActivity;
        Object o;
        if (fhb instanceof fhb$a) {
            final fhb$a fhb$a = (fhb$a)fhb;
            o = new d52$c(fhb$a.b, fhb$a.a, b);
        }
        else {
            e0e.d((Object)fhb, "null cannot be cast to non-null type com.twitter.app.bookmarks.folders.list.FolderListEffect.RemovedFromFolder");
            final fhb$e fhb$e = (fhb$e)fhb;
            o = new d52$h(fhb$e.b, fhb$e.a, b);
        }
        this.H0.b((d52)o);
        if (!this.L0.a()) {
            this.Q0.c(xw0.g(TimeUnit.MILLISECONDS, 500L, (sj)new qp3((Object)this, 9)));
        }
        else {
            this.J0.a();
        }
    }
    
    public final void b(final fhb fhb, final boolean b) {
        final View n0 = this.N0;
        final boolean b2 = fhb instanceof fhb$f;
        final int n2 = 1;
        final int n3 = 0;
        int visibility;
        if (b2 || b) {
            visibility = 0;
        }
        else {
            visibility = 8;
        }
        n0.setVisibility(visibility);
        final View o0 = this.O0;
        int visibility2;
        if (fhb instanceof fhb$h && !b) {
            visibility2 = 0;
        }
        else {
            visibility2 = 8;
        }
        o0.setVisibility(visibility2);
        final RecyclerView m0 = this.M0;
        int n4;
        if (fhb instanceof fhb$d && !b) {
            n4 = n2;
        }
        else {
            n4 = 0;
        }
        int visibility3;
        if (n4 != 0) {
            visibility3 = n3;
        }
        else {
            visibility3 = 8;
        }
        ((View)m0).setVisibility(visibility3);
    }
    
    public final void r(final Object o) {
        final fhb fhb = (fhb)o;
        e0e.f((Object)fhb, "effect");
        if (e0e.a((Object)fhb, (Object)fhb$b.a)) {
            final vba$d a = vba$d.a;
            cmi.g(vba$d.d);
            this.J0.c((r62$d)new r62$d.g("0"));
        }
        else if (fhb instanceof fhb$c) {
            final vba$d a2 = vba$d.a;
            cmi.g(vba$d.c);
            this.J0.c((r62$d)new r62$d.g(((fhb$c)fhb).a));
        }
        else if (fhb instanceof fhb$a) {
            this.a(fhb);
        }
        else if (fhb instanceof fhb$e) {
            this.a(fhb);
        }
        else if (fhb instanceof fhb$i) {
            final ehb i0 = this.I0;
            final int a3 = ((fhb$i)fhb).a;
            final f52 f52 = i0.M0.get(a3);
            f52.c ^= true;
            ((RecyclerView$e)i0).g(a3);
        }
        else if (fhb instanceof fhb$g) {
            this.I0.N0 = false;
            final fhb$g fhb$g = (fhb$g)fhb;
            r9a.d(fhb$g.a);
            final f72 h0 = this.H0;
            final String string = ((Context)this.G0).getString(fhb$g.b);
            e0e.e((Object)string, "activity.getString(effect.message)");
            h0.b((d52)new d52$f(string));
        }
        else if (fhb instanceof fhb$d) {
            final vba$d a4 = vba$d.a;
            cmi.g(vba$d.b);
            final boolean b = this.G0.P().H("bookmark_folders_timeline_bottom_sheet") != null;
            List list;
            if (this.P0 && !b) {
                list = rr4.l2((Collection)((fhb$d)fhb).a);
                ((ArrayList<f52>)list).add(0, phb.Companion.a((Activity)this.G0));
            }
            else {
                list = ((fhb$d)fhb).a;
            }
            if (list.isEmpty()) {
                this.b(fhb, true);
                this.J0.e((r62$a)new r62$a.b());
            }
            else {
                this.b(fhb, false);
                final ehb i2 = this.I0;
                Objects.requireNonNull(i2);
                m.a((m$b)new ehb$c((List)i2.M0, list), true).b((RecyclerView$e)i2);
                i2.M0 = (ArrayList)rr4.l2((Collection)list);
            }
        }
        else if (fhb instanceof fhb$f) {
            final vba a5 = vba.a;
            cmi.g(vba.d);
            this.b(fhb, false);
            this.J0.e((r62$a)new r62$a.b(2131954117, 2131954116, 0, 4, null));
        }
        else if (e0e.a((Object)fhb, (Object)fhb$h.a)) {
            this.b(fhb, false);
        }
    }
    
    public final t5j<ghb> w() {
        final t5j mergeArray = t5j.mergeArray(new fbj[] { (fbj)this.K0 });
        e0e.e((Object)mergeArray, "mergeArray(\n            intentSubject\n        )");
        return (t5j<ghb>)mergeArray;
    }
    
    public static final class b
    {
    }
    
    public interface c
    {
        hhb a(final View p0);
    }
}
