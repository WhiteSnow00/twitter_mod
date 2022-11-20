import com.twitter.util.user.UserIdentifier;
import android.content.Context;
import java.util.List;
import java.util.Iterator;
import java.util.Collection;
import java.util.Objects;
import android.view.View;
import java.util.HashSet;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ftn
{
    public static final a Companion;
    public final vsn a;
    public final ul1 b;
    public final jkq c;
    public final HashSet<ejt> d;
    
    static {
        Companion = new a();
    }
    
    public ftn(final vsn a, final ul1 b, final jkq c) {
        czd.f((Object)a, "roomNuxStateManager");
        czd.f((Object)c, "softUserConfig");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = rp9.g0(ejt.E0);
    }
    
    public static void c(final ftn ftn, final ejt ejt, final b b, final View view, String s, int n, int n2, int n3, final int n4) {
        if ((n4 & 0x8) != 0x0) {
            s = null;
        }
        if ((n4 & 0x10) != 0x0) {
            n = -1;
        }
        if ((n4 & 0x20) != 0x0) {
            n2 = 0;
        }
        if ((n4 & 0x40) != 0x0) {
            n3 = 0;
        }
        ftn.b(ejt, b, view, s, n, n2, n3);
    }
    
    public final sy5 a(final ejt ejt) {
        final vsn a = this.a;
        Objects.requireNonNull(a);
        final Iterator iterator = a.e.iterator();
    Label_0139:
        while (true) {
            int i;
            do {
                final boolean hasNext = iterator.hasNext();
                final sy5 sy5 = null;
                if (!hasNext) {
                    final Object next = null;
                    final cjt cjt = (cjt)next;
                    Object o = sy5;
                    if (cjt != null) {
                        final h5j distinctUntilChanged = ((h5j)cjt.c).distinctUntilChanged();
                        czd.e((Object)distinctUntilChanged, "nextTooltipObservable.distinctUntilChanged()");
                        final h5j filter = distinctUntilChanged.filter((ytk)new qo((qsb)new qsb<ejt, Boolean>(ejt) {
                            public final ejt D0;
                            
                            public final Object invoke(final Object o) {
                                final ejt ejt = (ejt)o;
                                czd.f((Object)ejt, "it");
                                return ejt == this.D0;
                            }
                        }, 18));
                        o = sy5;
                        if (filter != null) {
                            final kog firstElement = filter.firstElement();
                            o = sy5;
                            if (firstElement != null) {
                                o = new fpg((ppg)firstElement);
                            }
                        }
                    }
                    Object d0;
                    if ((d0 = o) == null) {
                        d0 = lz5.D0;
                    }
                    return (sy5)d0;
                }
                final Object next = iterator.next();
                final List b = ((cjt)next).b;
                final boolean b2 = b instanceof Collection;
                final int n = 1;
                if (!b2 || !b.isEmpty()) {
                    final Iterator iterator2 = b.iterator();
                    while (iterator2.hasNext()) {
                        if (((djt)iterator2.next()).b == ejt) {
                            i = n;
                            continue Label_0139;
                        }
                    }
                }
                i = 0;
            } while (i == 0);
            continue;
        }
    }
    
    public final void b(final ejt ejt, final b b, final View view, final String k, int h, int b2, final int j) {
        czd.f((Object)ejt, "tooltipName");
        czd.f((Object)view, "view");
        if (this.c.a() && this.d.contains(ejt)) {
            return;
        }
        if (this.a.a(ejt)) {
            return;
        }
        view.setTag((Object)((Enum)ejt).name());
        final ul1 b3 = this.b;
        final String name = ((Enum)ejt).name();
        final int l1 = vit.L1;
        final vit$b vit$b = new vit$b((Context)b3, name);
        vit$b.c = 2132018362;
        vit$b.j = j;
        vit$b.d = (vit$c)new etn(this, ejt);
        vit$b.a(b2);
        if (ikr.g((CharSequence)b.a)) {
            vit$b.e = b.a;
        }
        else {
            b2 = b.b;
            if (b2 != -1) {
                vit$b.b(b2);
            }
        }
        vit$b.g = ((Enum)ejt).name();
        final vsn a = this.a;
        if (a.d) {
            vit$b.k = k;
        }
        if (h != -1) {
            vit$b.h = h;
        }
        a.c.add(ejt);
    Label_0213:
        for (final cjt cjt : a.e) {
            Objects.requireNonNull(cjt);
            while (true) {
                for (final Object next : cjt.b) {
                    if (((djt)next).b == ejt) {
                        h = 1;
                    }
                    else {
                        h = 0;
                    }
                    if (h != 0) {
                        final djt djt = (djt)next;
                        if (djt == null) {
                            continue Label_0213;
                        }
                        djt.c = true;
                        final UserIdentifier a2 = djt.a;
                        final djo a3 = djo.a;
                        if (bo1.B(a2, "userIdentifier", a2, "android_audio_room_nux_tooltips_ignore_fatigue", false)) {
                            continue Label_0213;
                        }
                        djt.d.b();
                        continue Label_0213;
                    }
                }
                Object next = null;
                continue;
            }
        }
        rw0.k(5000L, (oj)new ii4((Object)vit$b.d(((cnb)this.b).P(), ((Enum)ejt).name(), true), 24));
    }
    
    public static final class a
    {
    }
    
    public static final class b
    {
        public final String a;
        public final int b;
        
        public b(final String a, final int b) {
            this.a = a;
            this.b = b;
        }
        
        @Override
        public final boolean equals(final Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof b)) {
                return false;
            }
            final b b = (b)o;
            return czd.a((Object)this.a, (Object)b.a) && this.b == b.b;
        }
        
        @Override
        public final int hashCode() {
            return this.a.hashCode() * 31 + this.b;
        }
        
        @Override
        public final String toString() {
            final String a = this.a;
            final int b = this.b;
            final StringBuilder sb = new StringBuilder();
            sb.append("TextInfo(text=");
            sb.append(a);
            sb.append(", textId=");
            sb.append(b);
            sb.append(")");
            return sb.toString();
        }
    }
}
