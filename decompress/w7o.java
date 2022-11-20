import java.util.Iterator;
import java.util.Collection;
import java.util.ArrayList;
import com.twitter.rooms.model.helpers.RoomUserItem;
import java.util.Set;
import java.util.List;
import android.content.Context;
import java.util.Objects;
import android.app.Activity;

// 
// Decompiled by Procyon v0.6.0
// 

public final class w7o
{
    public static final a Companion;
    public final Activity a;
    public final obi<?> b;
    public final qft c;
    public final n4s d;
    public final n4s e;
    
    static {
        Companion = new a();
    }
    
    public w7o(final Activity a, final obi<?> b, final qft c) {
        czd.f((Object)a, "activity");
        czd.f((Object)b, "navigator");
        czd.f((Object)c, "toaster");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = (n4s)pps.n((nsb)new w7o$c(this));
        this.e = (n4s)pps.n((nsb)w7o$b.D0);
    }
    
    public static void b(final w7o w7o, final String s) {
        Objects.requireNonNull(w7o);
        czd.f((Object)s, "spaceId");
        o70.c((Context)w7o.a, w7o.c(s, false));
        w7o.c.c(2131952888, 0);
    }
    
    public final void a(String string, final List<? extends qfc> list) {
        czd.f((Object)string, "spaceId");
        final StringBuilder sb = new StringBuilder();
        if (list != null && !list.isEmpty()) {
            Objects.requireNonNull(w7o.Companion);
            sb.append(mq4.m0((Iterable)list, (CharSequence)" ", (CharSequence)null, (CharSequence)null, (qsb)v7o.D0, 30));
            sb.append('\n');
            sb.append('\n');
        }
        sb.append(this.c(string, false));
        string = sb.toString();
        czd.e((Object)string, "StringBuilder().apply {\n\u2026Id))\n        }.toString()");
        this.f(string, false);
    }
    
    public final String c(String h, final boolean b) {
        if (!b) {
            h = hmg.h("https://twitter.com/i/spaces/", h);
        }
        return h;
    }
    
    public final List<RoomUserItem> d(final Set<RoomUserItem> set) {
        final ArrayList list = new ArrayList();
        for (final RoomUserItem next : set) {
            if (czd.a((Object)next.getTwitterUserId(), (Object)this.e.getValue()) ^ true) {
                list.add(next);
            }
        }
        return mq4.P0((Collection)list);
    }
    
    public final CharSequence e() {
        return (CharSequence)this.d.getValue();
    }
    
    public final void f(final String s, final boolean b) {
        czd.f((Object)s, "text");
        String h = s;
        if (b) {
            h = hmg.h(" ", s);
        }
        final obi<?> b2 = this.b;
        final z66 z66 = new z66();
        z66.r(h, 0);
        z66.g(1);
        z66.o("audiospace");
        z66.q(false);
        b2.d((ym)z66);
    }
    
    public static final class a
    {
    }
}
