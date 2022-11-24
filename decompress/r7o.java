import java.util.Objects;
import com.twitter.rooms.model.AudioSpaceTopicItem;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class r7o implements ccx
{
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final String e;
    public final boolean f;
    public final String g;
    public final List<AudioSpaceTopicItem> h;
    
    public r7o() {
        this(false, false, 255);
    }
    
    public r7o(boolean b, boolean b2, final int n) {
        if ((n & 0x1) != 0x0) {
            b = true;
        }
        if ((n & 0x2) != 0x0) {
            b2 = true;
        }
        Object f0;
        if ((n & 0x80) != 0x0) {
            f0 = h3a.F0;
        }
        else {
            f0 = null;
        }
        this(b, b2, false, false, null, false, null, (List<AudioSpaceTopicItem>)f0);
    }
    
    public r7o(final boolean a, final boolean b, final boolean c, final boolean d, final String e, final boolean f, final String g, final List<AudioSpaceTopicItem> h) {
        e0e.f((Object)h, "topics");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
    }
    
    public static r7o l(final r7o r7o, boolean a, boolean b, boolean c, boolean d, boolean f, String g, List h, final int n) {
        if ((n & 0x1) != 0x0) {
            a = r7o.a;
        }
        if ((n & 0x2) != 0x0) {
            b = r7o.b;
        }
        if ((n & 0x4) != 0x0) {
            c = r7o.c;
        }
        if ((n & 0x8) != 0x0) {
            d = r7o.d;
        }
        String e;
        if ((n & 0x10) != 0x0) {
            e = r7o.e;
        }
        else {
            e = null;
        }
        if ((n & 0x20) != 0x0) {
            f = r7o.f;
        }
        if ((n & 0x40) != 0x0) {
            g = r7o.g;
        }
        if ((n & 0x80) != 0x0) {
            h = r7o.h;
        }
        Objects.requireNonNull(r7o);
        e0e.f((Object)h, "topics");
        return new r7o(a, b, c, d, e, f, g, h);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof r7o)) {
            return false;
        }
        final r7o r7o = (r7o)o;
        return this.a == r7o.a && this.b == r7o.b && this.c == r7o.c && this.d == r7o.d && e0e.a((Object)this.e, (Object)r7o.e) && this.f == r7o.f && e0e.a((Object)this.g, (Object)r7o.g) && e0e.a((Object)this.h, (Object)r7o.h);
    }
    
    @Override
    public final int hashCode() {
        final int a = this.a ? 1 : 0;
        int n = 1;
        int n2 = a;
        if (a != 0) {
            n2 = 1;
        }
        int b;
        if ((b = (this.b ? 1 : 0)) != 0) {
            b = 1;
        }
        int c;
        if ((c = (this.c ? 1 : 0)) != 0) {
            c = 1;
        }
        int d;
        if ((d = (this.d ? 1 : 0)) != 0) {
            d = 1;
        }
        final String e = this.e;
        int hashCode = 0;
        int hashCode2;
        if (e == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = e.hashCode();
        }
        final int f = this.f ? 1 : 0;
        if (f == 0) {
            n = f;
        }
        final String g = this.g;
        if (g != null) {
            hashCode = g.hashCode();
        }
        return this.h.hashCode() + ((((((n2 * 31 + b) * 31 + c) * 31 + d) * 31 + hashCode2) * 31 + n) * 31 + hashCode) * 31;
    }
    
    @Override
    public final String toString() {
        final boolean a = this.a;
        final boolean b = this.b;
        final boolean c = this.c;
        final boolean d = this.d;
        final String e = this.e;
        final boolean f = this.f;
        final String g = this.g;
        final List<AudioSpaceTopicItem> h = this.h;
        final StringBuilder p = a88.p("RoomSettingsViewState(transcriptionShow=", a, ", soundEffectsEnabled=", b, ", showClipSettings=");
        l58.l(p, c, ", clippingEnabled=", d, ", title=");
        o6f.g(p, e, ", isSpaceRecording=", f, ", roomId=");
        p.append(g);
        p.append(", topics=");
        p.append(h);
        p.append(")");
        return p.toString();
    }
}
