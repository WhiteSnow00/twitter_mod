import android.os.BaseBundle;
import android.content.Context;
import androidx.appcompat.app.f;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.twitter.rooms.ui.core.history.a$a;
import com.twitter.rooms.model.AudioSpaceTopicItem;
import java.util.Set;
import androidx.fragment.app.Fragment$InstantiationException;
import com.twitter.rooms.subsystem.api.args.RoomEndScreenArgs;
import java.util.Objects;
import android.net.Uri;
import androidx.recyclerview.widget.RecyclerView$e;
import androidx.recyclerview.widget.RecyclerView$m;
import androidx.recyclerview.widget.LinearLayoutManager;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.appcompat.widget.Toolbar;
import com.twitter.rooms.ui.core.history.a;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gnn implements xlx<znn, Object, zmn>
{
    public static final gnn.gnn$a Companion;
    public final zl1 F0;
    public final nlc G0;
    public final a H0;
    public final fci<?> I0;
    public final znl<String> J0;
    public final Toolbar K0;
    public final RecyclerView L0;
    public final TextView M0;
    public final fih<znn> N0;
    
    static {
        Companion = new gnn.gnn$a();
    }
    
    public gnn(View viewById, final zl1 f0, final j4e<mlc> adapter, final nlc g0, final a h0, final fci<?> i0) {
        e0e.f((Object)viewById, "rootView");
        e0e.f((Object)adapter, "historyListAdapter");
        e0e.f((Object)g0, "historyItemProvider");
        e0e.f((Object)i0, "navigator");
        this.F0 = f0;
        this.G0 = g0;
        this.H0 = h0;
        this.I0 = i0;
        this.J0 = (znl<String>)new znl();
        final View viewById2 = viewById.findViewById(2131432115);
        ((Toolbar)viewById2).setTitle((CharSequence)viewById.getResources().getString(2131954301));
        e0e.e((Object)viewById2, "rootView.findViewById<To\u2026y_management_title)\n    }");
        final Toolbar k0 = (Toolbar)viewById2;
        this.K0 = k0;
        final View viewById3 = viewById.findViewById(2131430934);
        final RecyclerView recyclerView = (RecyclerView)viewById3;
        ((View)recyclerView).getContext();
        recyclerView.setLayoutManager((RecyclerView$m)new LinearLayoutManager(1));
        recyclerView.setAdapter((RecyclerView$e)adapter);
        e0e.e((Object)viewById3, "rootView.findViewById<Re\u2026 historyListAdapter\n    }");
        this.L0 = (RecyclerView)viewById3;
        viewById = viewById.findViewById(2131428927);
        e0e.e((Object)viewById, "rootView.findViewById<Te\u2026View>(R.id.empty_message)");
        this.M0 = (TextView)viewById;
        ((f)f0).a0(k0);
        final androidx.appcompat.app.a t = ((f)f0).T();
        if (t != null) {
            t.r();
            t.o(true);
        }
        this.N0 = (fih<znn>)ma7.S((stb)new gnn$e(this));
    }
    
    public final void T(final ccx ccx) {
        final znn znn = (znn)ccx;
        e0e.f((Object)znn, "state");
        this.N0.b((Object)znn);
    }
    
    public final void r(final Object o) {
        final zmn zmn = (zmn)o;
        e0e.f((Object)zmn, "effect");
        if (zmn instanceof zmn$b) {
            final String string = ((Context)this.F0).getString(2131954299);
            e0e.e((Object)string, "activity.getString(R.str\u2026nagement_header_link_url)");
            final fci<?> i0 = this.I0;
            final Uri parse = Uri.parse(string);
            e0e.e((Object)parse, "parse(url)");
            i0.d((cn)new mnx(parse));
        }
        else if (zmn instanceof zmn$c) {
            final a h0 = this.H0;
            final gnn.gnn$a companion = gnn.Companion;
            final x21 e = ((zmn$c)zmn).a.e;
            Objects.requireNonNull(companion);
            final RoomEndScreenArgs roomEndScreenArgs = new RoomEndScreenArgs(e.h, e.j, e.l, true, rr4.n2((Iterable)e.H), false, true, e.K);
            Objects.requireNonNull(h0);
            final Fragment h2 = h0.a.H("TAG_ROOM_END_SCREEN_FRAGMENT");
            h0.b.a((Object)new jk6((Object)roomEndScreenArgs.getRoomId()));
            wjo wjo = null;
            bbq bbq;
            if (h2 == null) {
                final Bundle t = m58.t("twitter:id", 874340);
                if (!((BaseBundle)t).containsKey("twitter:id")) {
                    throw new Fragment$InstantiationException("Missing fragment id", (Exception)null);
                }
                final wjo e2 = ehk.e(t);
                final int a = o5j.a;
                final eko c = h0.c;
                final a$a companion2 = com.twitter.rooms.ui.core.history.a.Companion;
                Objects.requireNonNull(companion2);
                c.a((lnj)new lnj.l(roomEndScreenArgs.getRoomId(), roomEndScreenArgs.getTitle(), roomEndScreenArgs.getStartedAt(), roomEndScreenArgs.isHost(), roomEndScreenArgs.getTopics(), roomEndScreenArgs.getFromSpacesTab(), roomEndScreenArgs.isAvailableForReplay(), roomEndScreenArgs.isAvailableForClipping()));
                ((bl1)e2).e2(h0.a, "TAG_ROOM_END_SCREEN_FRAGMENT");
                bbq = a$a.a(companion2, e2);
            }
            else {
                final a$a companion3 = a.Companion;
                if (h2 instanceof wjo) {
                    wjo = (wjo)h2;
                }
                bbq = a$a.a(companion3, wjo);
            }
            final e39 e3 = new e39();
            e3.c(bbq.G((rk6)new f$z2((stb)new hnn(e3, this, zmn)), (rk6)lvb.e));
        }
        else if (zmn instanceof zmn$a) {
            this.I0.k();
        }
    }
    
    public final t5j<Object> w() {
        final t5j mergeArray = t5j.mergeArray(new fbj[] { (fbj)d4j.o0(this.K0).map((rtb)new d6i((stb)gnn$c.F0, 28)), (fbj)((t5j)this.J0).map((rtb)new w1n((stb)gnn$d.F0, 4)) });
        e0e.e((Object)mergeArray, "mergeArray(\n            \u2026spaceItem(it) }\n        )");
        return (t5j<Object>)mergeArray;
    }
}
