import java.util.Iterator;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lfx
{
    public static final a Companion;
    public static final nmp<lfx> f;
    public final Integer a;
    public final Integer b;
    public final Map<String, Integer> c;
    public final Boolean d;
    public final Integer e;
    
    static {
        Companion = new a();
        lfx.f = new lfx.lfx$b();
    }
    
    public lfx() {
        this(null, null, null, null, null);
    }
    
    public lfx(final Integer a, final Integer b, final Map<String, Integer> c, final Boolean d, final Integer e) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    public final void a(final yfe yfe) {
        yfe.r0();
        final Integer a = this.a;
        if (a != null) {
            yfe.T("tweet_visibility_100k", a.intValue());
        }
        final Integer b = this.b;
        if (b != null) {
            yfe.T("unified_card_visibility_100k", b.intValue());
        }
        if (this.c != null) {
            yfe.i0("unified_card_components_visibility_100k");
            for (final Map.Entry<String, V> entry : this.c.entrySet()) {
                yfe.T((String)entry.getKey(), ((Number)entry.getValue()).intValue());
            }
            yfe.h();
        }
        final Boolean d = this.d;
        int i = 0;
        final Integer e = this.e;
        final lfx$c lfx$c = new lfx$c(yfe, this);
        while (i < 2) {
            if ((new Object[] { d, e })[i] == null) {
                return;
            }
            ++i;
        }
        lfx$c.invoke();
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof lfx)) {
            return false;
        }
        final lfx lfx = (lfx)o;
        return e0e.a((Object)this.a, (Object)lfx.a) && e0e.a((Object)this.b, (Object)lfx.b) && e0e.a((Object)this.c, (Object)lfx.c) && e0e.a((Object)this.d, (Object)lfx.d) && e0e.a((Object)this.e, (Object)lfx.e);
    }
    
    @Override
    public final int hashCode() {
        final Integer a = this.a;
        int hashCode = 0;
        int hashCode2;
        if (a == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = a.hashCode();
        }
        final Integer b = this.b;
        int hashCode3;
        if (b == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = b.hashCode();
        }
        final Map<String, Integer> c = this.c;
        int hashCode4;
        if (c == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = c.hashCode();
        }
        final Boolean d = this.d;
        int hashCode5;
        if (d == null) {
            hashCode5 = 0;
        }
        else {
            hashCode5 = d.hashCode();
        }
        final Integer e = this.e;
        if (e != null) {
            hashCode = e.hashCode();
        }
        return (((hashCode2 * 31 + hashCode3) * 31 + hashCode4) * 31 + hashCode5) * 31 + hashCode;
    }
    
    @Override
    public final String toString() {
        final Integer a = this.a;
        final Integer b = this.b;
        final Map<String, Integer> c = this.c;
        final Boolean d = this.d;
        final Integer e = this.e;
        final StringBuilder sb = new StringBuilder();
        sb.append("VisibilitySignalsScribeDetails(tweetVisibilityPercentage100k=");
        sb.append(a);
        sb.append(", unifiedCardVisibilityPercentage100k=");
        sb.append(b);
        sb.append(", unifiedCardComponentsVisibility100k=");
        sb.append(c);
        sb.append(", videoStartedPlaying=");
        sb.append(d);
        sb.append(", percentVideoPlayed100k=");
        return mqb.m(sb, e, ")");
    }
    
    public static final class a
    {
    }
}
