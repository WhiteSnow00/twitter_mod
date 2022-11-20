import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class yc4
{
    public static final c Companion;
    public static final rlp<yc4> e;
    public final String a;
    public final String b;
    public final ad4 c;
    public final String d;
    
    static {
        Companion = new c();
        yc4.e = new yc4.yc4$b();
    }
    
    public yc4(final String a, final String b, final ad4 c, final String d) {
        czd.f((Object)d, "embedStatus");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public final void a(final afe afe) throws IOException {
        afe.h0("click_tracking_embed_details");
        afe.t0("original_url", this.a);
        afe.t0("embedded_url", this.b);
        final ad4 c = this.c;
        if (c != null) {
            afe.h0("click_tracking_info");
            if (c.a.isEmpty() ^ true) {
                afe.h0("urlParams");
                for (final Map.Entry<String, V> entry : c.a.entrySet()) {
                    afe.t0((String)entry.getKey(), (String)entry.getValue());
                }
                afe.h();
            }
            if (ikr.g((CharSequence)c.b)) {
                afe.t0("urlOverride", c.b);
            }
            if (!czd.a((Object)c.c, (Object)"Undefined")) {
                afe.t0("urlOverrideType", c.c);
            }
            afe.h();
        }
        if (!czd.a((Object)this.d, (Object)"undefined")) {
            afe.t0("embed_status", this.d);
        }
        afe.h();
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof yc4)) {
            return false;
        }
        final yc4 yc4 = (yc4)o;
        return czd.a((Object)this.a, (Object)yc4.a) && czd.a((Object)this.b, (Object)yc4.b) && czd.a((Object)this.c, (Object)yc4.c) && czd.a((Object)this.d, (Object)yc4.d);
    }
    
    @Override
    public final int hashCode() {
        final int f = hmg.f(this.b, this.a.hashCode() * 31, 31);
        final ad4 c = this.c;
        int hashCode;
        if (c == null) {
            hashCode = 0;
        }
        else {
            hashCode = c.hashCode();
        }
        return this.d.hashCode() + (f + hashCode) * 31;
    }
    
    @Override
    public final String toString() {
        final String a = this.a;
        final String b = this.b;
        final ad4 c = this.c;
        final String d = this.d;
        final StringBuilder q = tqf.q("ClickTrackingEmbedDetails(originalUrl=", a, ", embeddedUrl=", b, ", clickTrackingInfo=");
        q.append(c);
        q.append(", embedStatus=");
        q.append(d);
        q.append(")");
        return q.toString();
    }
    
    public static final class c
    {
    }
}
